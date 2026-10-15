package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int
