package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun elfAuxInfo(aux: Int, buf: COpaquePointer?, buflen: Int): Int
