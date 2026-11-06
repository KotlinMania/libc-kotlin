package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.COpaquePointer

internal object StackNpRawLibc {
    external fun pthreadStackFrameDecodeNp(frameAddr: Long, returnAddr: Long): Long
}

public actual fun pthreadStackFrameDecodeNp(frameAddr: UintptrT, returnAddr: UintptrT?): UintptrT =
    StackNpRawLibc.pthreadStackFrameDecodeNp(frameAddr, returnAddr?.toLong() ?: 0L)
