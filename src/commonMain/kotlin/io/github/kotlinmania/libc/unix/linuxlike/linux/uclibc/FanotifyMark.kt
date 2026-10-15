// port-lint: source unix/linux_like/linux/uclibc/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*

public expect fun fanotifyMark(fd: Int, flags: UInt, mask: ULong, dirfd: Int, path: String?): Int
