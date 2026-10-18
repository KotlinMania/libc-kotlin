package io.github.kotlinmania.libc.unix.cygwin
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Winsize

public expect fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int
