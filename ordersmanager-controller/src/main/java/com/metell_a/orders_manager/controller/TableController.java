package com.metell_a.orders_manager.controller;

import com.metell_a.orders_manager.model.Customer;
import com.metell_a.orders_manager.rest_client.service.api.UserApi;
import com.metell_a.orders_manager.rest_client.service.config.RetrofitConfig;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by Vasiliy Kononenko.
 */
public class TableController implements Initializable {
    @FXML
    private TableView<Customer> customerTable;
    @FXML
    private TableColumn<Customer, String> firstNameColumn;
    @FXML
    private TableColumn<Customer, String> lastNameColumn;
    @FXML
    private TableColumn<Customer, String> phoneNumberColumn;

    private ObservableList<Customer> data;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        data = FXCollections.observableArrayList();
        dataSource();
        fillTable();
        System.out.println(data);
        customerTable.setItems(data);

        // retrofit test request
        UserApi userApi = RetrofitConfig.getRetrofit().create(UserApi.class);
        Observable<List<String>> observableUsers = userApi.getUsersList();

        observableUsers
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.immediate())
                .subscribe(new Subscriber<List<String>>() {
                    @Override
                    public void onCompleted() {
                        System.out.println("users loading are completed!");
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onNext(List<String> usersList) {
                        System.out.println("users loaded " + usersList);
                    }
                });
    }

    private void dataSource() {
        data.add(new Customer("Bob", "Smith", "800.123.4567"));
        data.add(new Customer("Joe", "Glow", "800.123.4568"));
        data.add(new Customer("Jenny", "Ihop", "800.123.4569"));
    }

    /**
     * Bind table view with model data from an AccountingMaterial.
     */
    private void fillTable() {
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        phoneNumberColumn.setCellValueFactory(cellData -> cellData.getValue().phoneProperty());
    }
}