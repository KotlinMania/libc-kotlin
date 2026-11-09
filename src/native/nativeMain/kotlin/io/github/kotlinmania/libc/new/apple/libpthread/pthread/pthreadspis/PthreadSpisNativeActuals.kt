@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.pthreadspis

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pthreadCreateFromMachThread(thread: COpaquePointer?, attr: COpaquePointer?, f: FnCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.apple.libpthread.pthread.pthreadspis.cinterop.libc_new_apple_libpthread_pthread_pthreadspis_pthread_spis_pthreadCreateFromMachThread(thread?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())
