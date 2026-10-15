package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun unlinkat(dirfd: Int, pathname: String?, flags: Int): Int
