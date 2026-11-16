@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.stacknp

import io.github.kotlinmania.libc.new.apple.libpthread.pthread.stacknp.cinterop.libcNewAppleLibpthreadPthreadStacknpStackNpPthreadStackFrameDecodeNp
import io.github.kotlinmania.libc.new.qurt.UintptrT
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pthreadStackFrameDecodeNp(frameAddr: UintptrT, returnAddr: MutPtr): UintptrT =
    libcNewAppleLibpthreadPthreadStacknpStackNpPthreadStackFrameDecodeNp(frameAddr, returnAddr.rawAddress.toCPointer<ByteVar>())
