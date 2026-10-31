package io.github.kotlinmania.libc.new.apple.libpthread.pthread

public actual fun pthreadStackFrameDecodeNp(frameAddr: ULong, returnAddr: ULong?): ULong =
    throw UnsupportedOperationException("pthreadStackFrameDecodeNp not available on WASI — no C library access")
