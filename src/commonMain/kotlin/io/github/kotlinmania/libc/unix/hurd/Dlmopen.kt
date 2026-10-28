package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun dlmopen(lmid: Long, filename: String?, flag: Int): COpaquePointer?
