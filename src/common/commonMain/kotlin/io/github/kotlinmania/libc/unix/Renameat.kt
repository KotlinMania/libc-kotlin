package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun renameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int
