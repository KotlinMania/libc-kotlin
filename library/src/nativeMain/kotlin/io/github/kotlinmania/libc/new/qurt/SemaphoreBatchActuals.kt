// port-lint: source Semaphore.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_sem_destroy
import libc.cinterop.libc_sem_init

public actual fun semInit(sem: UInt?, pshared: Int, value: UInt): Int =
    libc.cinterop.libc_sem_init(sem?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>(), pshared, value)

public actual fun semDestroy(sem: UInt?): Int =
    libc.cinterop.libc_sem_destroy(sem?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun semWait(sem: UInt?): Int =
    throw UnsupportedOperationException("semWait requires manual FFI bridge — not yet implemented")

public actual fun semTrywait(sem: UInt?): Int =
    throw UnsupportedOperationException("semTrywait requires manual FFI bridge — not yet implemented")

public actual fun semPost(sem: UInt?): Int =
    throw UnsupportedOperationException("semPost requires manual FFI bridge — not yet implemented")

public actual fun semGetvalue(sem: UInt?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue requires manual FFI bridge — not yet implemented")
