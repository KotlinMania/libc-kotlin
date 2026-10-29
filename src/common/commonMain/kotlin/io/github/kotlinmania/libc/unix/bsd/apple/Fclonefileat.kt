package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun fclonefileat(srcfd: Int, dstDirfd: Int, dst: String?, flags: UInt): Int
