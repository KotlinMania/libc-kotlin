package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun fchownat(dirfd: Int, pathname: String?, owner: UInt, group: UInt, flags: Int): Int
