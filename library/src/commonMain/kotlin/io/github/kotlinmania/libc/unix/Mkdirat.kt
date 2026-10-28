package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun mkdirat(dirfd: Int, pathname: String?, mode: UInt): Int
