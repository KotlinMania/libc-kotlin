package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun wasilibcStat(pathname: String?, buf: Stat?, flags: Int): Int
