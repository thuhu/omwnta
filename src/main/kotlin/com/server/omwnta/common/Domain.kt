package com.server.omwnta.common

abstract class Domain<T> {
    abstract fun toDTO(): T;
}