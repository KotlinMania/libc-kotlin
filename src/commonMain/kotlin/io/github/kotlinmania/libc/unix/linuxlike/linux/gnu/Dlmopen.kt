package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public expect fun dlmopen(lmid: Long, filename: String?, flag: Int): COpaquePointer?
