package com.metell_a.orders_manager.infra.exception.base;

/**
 * Created by Vasiliy Kononenko.
 */
public abstract class AppException extends RuntimeException {
    private static final long serialVersionUID = 1886160512749583713L;

    public AppException(String message) {
        super(message);
    }
}