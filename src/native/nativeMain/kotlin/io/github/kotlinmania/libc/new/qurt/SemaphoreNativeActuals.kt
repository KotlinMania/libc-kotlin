@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.cinterop.libc_semaphore_sem_init(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun semDestroy(sem: SemT?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_semaphore_sem_destroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semWait(sem: SemT?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_semaphore_sem_wait(sem?.value?.toCPointer<ByteVar>())

public actual fun semTrywait(sem: SemT?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_semaphore_sem_trywait(sem?.value?.toCPointer<ByteVar>())

public actual fun semPost(sem: SemT?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_semaphore_sem_post(sem?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_semaphore_sem_getvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())
