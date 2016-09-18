package com.metell_a.orders_manager.infra.util;


import java.security.InvalidParameterException;

/**
 * Contains common check routines
 *
 * @author Kononenko Vasiliy
 */
public class Checks {
    private Checks() {
    }

    /**
     * Verifies that specified check passed and throws exception otherwise
     *
     * @param check   boolean check
     * @param message string message
     * @throws InvalidParameterException if check is false
     */
    public static void checkParameter(boolean check, String message)
            throws InvalidParameterException {
        if (!check) {
            throw new InvalidParameterException(message);
        }
    }
}