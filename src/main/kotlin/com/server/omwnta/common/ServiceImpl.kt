package com.server.omwnta.common

import org.springframework.data.repository.CrudRepository

abstract class ServiceImpl<T: Domain<R>, R>: Service<T, R> {
    override fun create(data: T): R {
        return repository().save(data).toDTO();
    }

    abstract fun repository(): CrudRepository<T, Long>;
}