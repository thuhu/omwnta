package com.server.omwnta.common

interface BaseService<T: BaseDomainObject<R> , R> {
    fun create(data : T) : R;
}