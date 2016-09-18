package com.metell_a.orders_manager.infra.exception;

import com.metell_a.orders_manager.infra.exception.base.AppException;

/**
 * Signals about incorrect configuration settings/parameters
 *
 * @author Kononenko Vasiliy
 */
public class ConfigurationException extends AppException {
    private static final long serialVersionUID = -5297791940127657190L;

    public ConfigurationException(String message) {
        super(message);
    }
}
