@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.semaphore

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewQurtSemaphoreJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewQurtSemaphoreSemInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libcNewQurtSemaphoreSemDestroy(sem: Long): Int

    @JvmStatic
    external fun libcNewQurtSemaphoreSemWait(sem: Long): Int

    @JvmStatic
    external fun libcNewQurtSemaphoreSemTrywait(sem: Long): Int

    @JvmStatic
    external fun libcNewQurtSemaphoreSemPost(sem: Long): Int

    @JvmStatic
    external fun libcNewQurtSemaphoreSemGetvalue(sem: Long, sval: Long): Int
}

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    NewQurtSemaphoreJniBridge.libcNewQurtSemaphoreSemInit(sem.rawAddress, pshared, value.toInt())

public actual fun semDestroy(sem: MutPtr): CInt =
    NewQurtSemaphoreJniBridge.libcNewQurtSemaphoreSemDestroy(sem.rawAddress)

public actual fun semWait(sem: MutPtr): CInt =
    NewQurtSemaphoreJniBridge.libcNewQurtSemaphoreSemWait(sem.rawAddress)

public actual fun semTrywait(sem: MutPtr): CInt =
    NewQurtSemaphoreJniBridge.libcNewQurtSemaphoreSemTrywait(sem.rawAddress)

public actual fun semPost(sem: MutPtr): CInt =
    NewQurtSemaphoreJniBridge.libcNewQurtSemaphoreSemPost(sem.rawAddress)

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    NewQurtSemaphoreJniBridge.libcNewQurtSemaphoreSemGetvalue(sem.rawAddress, sval.rawAddress)
