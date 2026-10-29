package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun arc4randomBuf(buf: COpaquePointer?, n: ULong)
