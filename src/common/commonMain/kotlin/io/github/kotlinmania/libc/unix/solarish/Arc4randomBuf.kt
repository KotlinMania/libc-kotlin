package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun arc4randomBuf(buf: COpaquePointer?, nbytes: ULong)
