// port-lint: source Semaphore.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.ByteVar

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    libc.cinterop.libc_sem_init(sem?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>(), pshared, value)

public actual fun semDestroy(sem: SemT?): CInt =
    libc.cinterop.libc_sem_destroy(sem?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun semWait(sem: SemT?): CInt =
    throw UnsupportedOperationException("semWait requires manual FFI bridge — not yet implemented")

public actual fun semTrywait(sem: SemT?): CInt =
    throw UnsupportedOperationException("semTrywait requires manual FFI bridge — not yet implemented")

public actual fun semPost(sem: SemT?): CInt =
    throw UnsupportedOperationException("semPost requires manual FFI bridge — not yet implemented")

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue requires manual FFI bridge — not yet implemented")
