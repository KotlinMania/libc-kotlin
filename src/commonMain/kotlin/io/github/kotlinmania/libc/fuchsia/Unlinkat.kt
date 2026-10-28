package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun unlinkat(dirfd: Int, pathname: String?, flags: Int): Int
