package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Group

public expect fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int
