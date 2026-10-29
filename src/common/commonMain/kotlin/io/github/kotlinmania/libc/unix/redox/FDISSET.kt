package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun fdIsSet(fd: Int, set: FdSet?): Boolean
