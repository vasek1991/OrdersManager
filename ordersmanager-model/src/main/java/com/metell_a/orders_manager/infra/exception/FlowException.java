package com.metell_a.orders_manager.infra.exception;

import com.metell_a.orders_manager.infra.exception.base.AppException;

/**
 * Signals about exceptional cases in the application logic
 *
 * @author Kononenko Vasiliy
 */
public class FlowException extends AppException {
    private static final long serialVersionUID = 7591920809684559716L;

    public FlowException(String message) {
        super(message);
    }
}
