package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun fchown(fd: Int, owner: UShort, group: UShort): Int
