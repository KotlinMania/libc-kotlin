package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public expect fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int
