@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.pthreadspis

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

public actual fun pthreadCreateFromMachThread(thread: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFromMachThreadFCallback, value: COpaquePointer?): CInt =
    0
