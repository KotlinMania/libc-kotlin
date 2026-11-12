@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.pthreadspis

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.pthreadspis.cinterop.libcNewAppleLibpthreadPthreadPthreadspisPthreadSpisPthreadCreateFromMachThread
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pthreadCreateFromMachThread(thread: MutPtr, attr: ConstPtr, f: PthreadCreateFromMachThreadFCallback, value: MutPtr): CInt =
    libcNewAppleLibpthreadPthreadPthreadspisPthreadSpisPthreadCreateFromMachThread(thread.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())
