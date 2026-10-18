package io.github.kotlinmania.libc.unix.hurd
import io.github.kotlinmania.libc.unix.Group

import io.github.kotlinmania.libc.*

public expect fun getgrgid(gid: UInt): Group?
