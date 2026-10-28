package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun wasilibcLinkOldat(olddirfd: Int, oldpath: String?, newpath: String?, flags: Int): Int
