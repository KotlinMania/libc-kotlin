@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pthreadStackFrameDecodeNp(frameAddr: UintptrT, returnAddr: UintptrT?): UintptrT =
    io.github.kotlinmania.libc.new.apple.libpthread.pthread.cinterop.libc_stack_np_pthread_stack_frame_decode_np(frameAddr, returnAddr?.value?.toCPointer<ByteVar>())
