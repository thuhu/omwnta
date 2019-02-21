package com.server.omwnta.common

abstract class BaseDomainObject<T> {

    abstract fun toDTO(): T;
}