package io.github.kotlinmania.libc.unix.hurd
import io.github.kotlinmania.libc.unix.Winsize

import io.github.kotlinmania.libc.*

public expect fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int
