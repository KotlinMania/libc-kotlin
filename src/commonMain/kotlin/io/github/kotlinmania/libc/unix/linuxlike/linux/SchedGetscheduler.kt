package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun schedGetscheduler(pid: Int): Int
