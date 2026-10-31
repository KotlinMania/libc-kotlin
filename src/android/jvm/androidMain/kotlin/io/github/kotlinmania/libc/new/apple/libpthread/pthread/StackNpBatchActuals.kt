package io.github.kotlinmania.libc.new.apple.libpthread.pthread

public actual fun pthreadStackFrameDecodeNp(frameAddr: ULong, returnAddr: ULong?): ULong =
    throw UnsupportedOperationException("pthreadStackFrameDecodeNp not available on Android host — use androidNative target for FFI")
