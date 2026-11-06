@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun pthreadCreateFromMachThread(thread: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFromMachThreadFCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_pthread_spis_pthread_create_from_mach_thread(thread?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), f.toInt(), value?.value?.toCPointer<ByteVar>())
