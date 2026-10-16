package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun fchmodat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int
