package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun timerfdCreate(clockid: Int, flags: Int): Int
