package com.metell_a.orders_manager.infra.exception.flow;

import com.metell_a.orders_manager.infra.exception.FlowException;

/**
 * Signals that incorrect parameter was passed to method/constructor
 *
 * @author Kononenko Vasiliy
 */
public class InvalidParameterException extends FlowException {

    private static final long serialVersionUID = -1035257884806501178L;

    public InvalidParameterException(String message) {
        super(message);
    }
}
