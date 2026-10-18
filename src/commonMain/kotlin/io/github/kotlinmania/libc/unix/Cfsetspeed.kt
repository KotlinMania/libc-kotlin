package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Termios

public expect fun cfsetspeed(termios: Termios?, speed: UInt): Int
