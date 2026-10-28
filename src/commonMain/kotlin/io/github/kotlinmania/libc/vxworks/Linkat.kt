package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int
