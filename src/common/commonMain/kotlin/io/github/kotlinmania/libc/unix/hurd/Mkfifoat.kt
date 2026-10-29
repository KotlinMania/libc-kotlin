package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun mkfifoat(fd: Int, path: String?, mode: UInt): Int
