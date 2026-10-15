package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun renameat2(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: UInt): Int
