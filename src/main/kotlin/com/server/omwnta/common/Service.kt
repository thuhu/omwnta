package com.server.omwnta.common

interface Service<T: Domain<R>, R> {
    fun create(data: T): R;
}