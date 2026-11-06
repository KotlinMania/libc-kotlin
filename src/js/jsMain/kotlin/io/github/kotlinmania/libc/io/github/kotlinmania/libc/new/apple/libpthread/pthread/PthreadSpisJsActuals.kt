package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.COpaquePointer

public actual fun pthreadCreateFromMachThread(thread: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFromMachThreadFCallback, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCreateFromMachThread(thread?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)") as CInt
