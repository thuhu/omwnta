package com.server.omwnta.common

import org.springframework.data.repository.CrudRepository

interface BaseRepository<T> : CrudRepository<T, Long>;