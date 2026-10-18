package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Termios

import io.github.kotlinmania.libc.*

public expect fun cfsetspeed(termios: Termios?, speed: UInt): Int
