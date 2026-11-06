package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.COpaquePointer

internal object PthreadSpisRawLibc {
    external fun pthreadCreateFromMachThread(thread: Long, attr: Long, f: Long, value: Long): Int
}

public actual fun pthreadCreateFromMachThread(thread: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFromMachThreadFCallback, value: COpaquePointer?): CInt =
    PthreadSpisRawLibc.pthreadCreateFromMachThread(thread?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)
