package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public expect fun fanotifyMark(fd: Int, flags: UInt, mask: ULong, dirfd: Int, path: String?): Int
