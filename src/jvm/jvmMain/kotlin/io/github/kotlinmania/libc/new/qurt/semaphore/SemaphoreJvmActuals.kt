@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.semaphore

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint

private object NewQurtSemaphoreJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_qurt_semaphore_semInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libc_new_qurt_semaphore_semDestroy(sem: Long): Int

    @JvmStatic
    external fun libc_new_qurt_semaphore_semWait(sem: Long): Int

    @JvmStatic
    external fun libc_new_qurt_semaphore_semTrywait(sem: Long): Int

    @JvmStatic
    external fun libc_new_qurt_semaphore_semPost(sem: Long): Int

    @JvmStatic
    external fun libc_new_qurt_semaphore_semGetvalue(sem: Long, sval: Long): Int
}

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    NewQurtSemaphoreJniBridge.libc_new_qurt_semaphore_semInit((sem?.value ?: 0L), pshared, value.toInt())

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    NewQurtSemaphoreJniBridge.libc_new_qurt_semaphore_semDestroy((sem?.value ?: 0L))

public actual fun semWait(sem: COpaquePointer?): CInt =
    NewQurtSemaphoreJniBridge.libc_new_qurt_semaphore_semWait((sem?.value ?: 0L))

public actual fun semTrywait(sem: COpaquePointer?): CInt =
    NewQurtSemaphoreJniBridge.libc_new_qurt_semaphore_semTrywait((sem?.value ?: 0L))

public actual fun semPost(sem: COpaquePointer?): CInt =
    NewQurtSemaphoreJniBridge.libc_new_qurt_semaphore_semPost((sem?.value ?: 0L))

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    NewQurtSemaphoreJniBridge.libc_new_qurt_semaphore_semGetvalue((sem?.value ?: 0L), (sval?.value ?: 0L))
