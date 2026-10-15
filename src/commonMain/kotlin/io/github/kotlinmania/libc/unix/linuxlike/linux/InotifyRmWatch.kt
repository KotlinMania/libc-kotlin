package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun inotifyRmWatch(fd: Int, wd: Int): Int
