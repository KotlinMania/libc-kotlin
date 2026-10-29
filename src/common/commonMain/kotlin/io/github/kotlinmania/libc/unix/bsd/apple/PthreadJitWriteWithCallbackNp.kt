package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun pthreadJitWriteWithCallbackNp(callback: ((io.github.kotlinmania.libc.COpaquePointer?) -> Int)?, ctx: COpaquePointer?): Int
