package com.github.leleact.jtest.spring.tx.util;

public interface TransactionCall<V> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     */
    V call();
}
