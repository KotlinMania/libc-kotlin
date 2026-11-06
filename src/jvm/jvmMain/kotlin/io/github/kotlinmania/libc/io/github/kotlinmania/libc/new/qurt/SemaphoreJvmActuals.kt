package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

internal object SemaphoreRawLibc {
    external fun semInit(sem: Long, pshared: Int, value: Int): Int
    external fun semDestroy(sem: Long): Int
    external fun semWait(sem: Long): Int
    external fun semTrywait(sem: Long): Int
    external fun semPost(sem: Long): Int
    external fun semGetvalue(sem: Long, sval: Long): Int
}

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    SemaphoreRawLibc.semInit(sem?.toLong() ?: 0L, pshared, value)

public actual fun semDestroy(sem: SemT?): CInt =
    SemaphoreRawLibc.semDestroy(sem?.toLong() ?: 0L)

public actual fun semWait(sem: SemT?): CInt =
    SemaphoreRawLibc.semWait(sem?.toLong() ?: 0L)

public actual fun semTrywait(sem: SemT?): CInt =
    SemaphoreRawLibc.semTrywait(sem?.toLong() ?: 0L)

public actual fun semPost(sem: SemT?): CInt =
    SemaphoreRawLibc.semPost(sem?.toLong() ?: 0L)

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    SemaphoreRawLibc.semGetvalue(sem?.toLong() ?: 0L, sval?.toLong() ?: 0L)
