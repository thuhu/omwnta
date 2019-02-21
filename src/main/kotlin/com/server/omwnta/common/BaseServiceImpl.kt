package com.server.omwnta.common

import org.springframework.data.repository.CrudRepository

abstract class BaseServiceImpl<T: BaseDomainObject<R> , R> : BaseService<T, R> {
    override fun create(data: T): R {
        return repository().save(data).toDTO();
    }

    abstract fun repository(): CrudRepository<T, Long>;

}