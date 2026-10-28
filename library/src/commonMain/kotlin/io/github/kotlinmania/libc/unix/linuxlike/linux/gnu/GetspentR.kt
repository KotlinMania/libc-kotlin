package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Spwd

public expect fun getspentR(spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): Int
