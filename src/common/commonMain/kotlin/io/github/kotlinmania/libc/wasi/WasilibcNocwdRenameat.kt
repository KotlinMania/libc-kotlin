package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun wasilibcNocwdRenameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int
