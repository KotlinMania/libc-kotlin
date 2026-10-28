package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun inotifyAddWatch(fd: Int, path: String?, mask: UInt): Int
