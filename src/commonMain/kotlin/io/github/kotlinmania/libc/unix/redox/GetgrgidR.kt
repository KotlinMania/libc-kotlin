package io.github.kotlinmania.libc.unix.redox
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Group

public expect fun getgrgidR(gid: Int, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int
