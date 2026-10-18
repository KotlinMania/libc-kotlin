package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun wasilibcLinkNewat(oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int
