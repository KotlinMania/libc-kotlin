package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.COpaquePointer

public actual fun pthreadStackFrameDecodeNp(frameAddr: UintptrT, returnAddr: UintptrT?): UintptrT =
    js("require('@kotlinmania/libc-native-bindings').pthreadStackFrameDecodeNp(frameAddr, returnAddr?.toLong() ?: 0L)") as UintptrT
