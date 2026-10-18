package io.github.kotlinmania.libc.unix.hurd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Group

public expect fun fgetgrentR(stream: FILE?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int
