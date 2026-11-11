@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.semaphore

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.semaphore.cinterop.libc_new_qurt_semaphore_semDestroy
import io.github.kotlinmania.libc.new.qurt.semaphore.cinterop.libc_new_qurt_semaphore_semGetvalue
import io.github.kotlinmania.libc.new.qurt.semaphore.cinterop.libc_new_qurt_semaphore_semInit
import io.github.kotlinmania.libc.new.qurt.semaphore.cinterop.libc_new_qurt_semaphore_semPost
import io.github.kotlinmania.libc.new.qurt.semaphore.cinterop.libc_new_qurt_semaphore_semTrywait
import io.github.kotlinmania.libc.new.qurt.semaphore.cinterop.libc_new_qurt_semaphore_semWait
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    libc_new_qurt_semaphore_semInit(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    libc_new_qurt_semaphore_semDestroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semWait(sem: COpaquePointer?): CInt =
    libc_new_qurt_semaphore_semWait(sem?.value?.toCPointer<ByteVar>())

public actual fun semTrywait(sem: COpaquePointer?): CInt =
    libc_new_qurt_semaphore_semTrywait(sem?.value?.toCPointer<ByteVar>())

public actual fun semPost(sem: COpaquePointer?): CInt =
    libc_new_qurt_semaphore_semPost(sem?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    libc_new_qurt_semaphore_semGetvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())
