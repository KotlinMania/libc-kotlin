package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.Termios

public expect fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int
