package io.github.kotlinmania.libc.unix.bsd.freebsdlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Winsize

public expect fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int
