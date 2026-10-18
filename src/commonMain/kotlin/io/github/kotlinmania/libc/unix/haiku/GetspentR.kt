package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun getspentR(pwd: Spwd?, buf: String?, bufferSize: ULong, res: COpaquePointer?): Int
