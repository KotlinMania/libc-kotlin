@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.semaphore

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.semaphore.cinterop.libcNewQurtSemaphoreSemDestroy
import io.github.kotlinmania.libc.new.qurt.semaphore.cinterop.libcNewQurtSemaphoreSemGetvalue
import io.github.kotlinmania.libc.new.qurt.semaphore.cinterop.libcNewQurtSemaphoreSemInit
import io.github.kotlinmania.libc.new.qurt.semaphore.cinterop.libcNewQurtSemaphoreSemPost
import io.github.kotlinmania.libc.new.qurt.semaphore.cinterop.libcNewQurtSemaphoreSemTrywait
import io.github.kotlinmania.libc.new.qurt.semaphore.cinterop.libcNewQurtSemaphoreSemWait
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    libcNewQurtSemaphoreSemInit(sem.rawAddress.toCPointer<ByteVar>(), pshared, value)

public actual fun semDestroy(sem: MutPtr): CInt =
    libcNewQurtSemaphoreSemDestroy(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semWait(sem: MutPtr): CInt =
    libcNewQurtSemaphoreSemWait(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semTrywait(sem: MutPtr): CInt =
    libcNewQurtSemaphoreSemTrywait(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semPost(sem: MutPtr): CInt =
    libcNewQurtSemaphoreSemPost(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    libcNewQurtSemaphoreSemGetvalue(sem.rawAddress.toCPointer<ByteVar>(), sval.rawAddress.toCPointer<ByteVar>())
