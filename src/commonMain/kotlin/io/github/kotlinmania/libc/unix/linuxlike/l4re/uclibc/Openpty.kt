package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Termios
import io.github.kotlinmania.libc.unix.Winsize

import io.github.kotlinmania.libc.*

public expect fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int
