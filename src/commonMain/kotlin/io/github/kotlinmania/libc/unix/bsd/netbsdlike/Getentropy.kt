package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public expect fun getentropy(buf: COpaquePointer?, buflen: ULong): Int
