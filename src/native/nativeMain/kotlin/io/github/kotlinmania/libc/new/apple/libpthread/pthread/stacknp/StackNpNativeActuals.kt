@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.stacknp

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.stacknp.cinterop.libc_new_apple_libpthread_pthread_stacknp_stack_np_pthreadStackFrameDecodeNp
import io.github.kotlinmania.libc.new.qurt.UintptrT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pthreadStackFrameDecodeNp(frameAddr: UintptrT, returnAddr: COpaquePointer?): UintptrT =
    libc_new_apple_libpthread_pthread_stacknp_stack_np_pthreadStackFrameDecodeNp(frameAddr, returnAddr?.value?.toCPointer<ByteVar>())
