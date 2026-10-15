package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public expect fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int
