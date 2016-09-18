package com.metell_a.orders_manager.infra.util;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Contains utility functions of the general purpose
 *
 * @author Vasiliy Kononenko
 */
public class CommonUtil {
    public CommonUtil() {
    }

    /**
     * Returns not-null unmodifiable copy of the source set
     *
     * @param source some Set
     * @return unmodifiable Set of objects
     */
    public static <T> Set<T> getSafeSet(Set<T> source) {
        return Collections.unmodifiableSet(Optional.ofNullable(source).orElse(Collections.emptySet()));
    }

    /**
     * Returns not-null unmodifiable copy of the source list
     *
     * @param source some List
     * @return unmodifiable List of objects
     */
    public static <T> List<T> getSafeList(List<T> source) {
        return Collections.unmodifiableList(Optional.ofNullable(source).orElse(Collections.emptyList()));
    }
}