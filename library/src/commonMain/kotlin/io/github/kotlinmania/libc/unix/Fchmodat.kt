package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun fchmodat(dirfd: Int, pathname: String?, mode: UInt, flags: Int): Int
