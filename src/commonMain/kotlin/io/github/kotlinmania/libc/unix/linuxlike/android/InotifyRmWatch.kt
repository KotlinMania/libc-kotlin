package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun inotifyRmWatch(fd: Int, wd: UInt): Int
