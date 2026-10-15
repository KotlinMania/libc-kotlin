package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public expect fun fdClear(fd: Int, set: FdSet?)
