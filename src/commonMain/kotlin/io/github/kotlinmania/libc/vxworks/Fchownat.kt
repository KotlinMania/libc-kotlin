package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun fchownat(dirfd: Int, pathname: String?, owner: UShort, group: UShort, flags: Int): Int
