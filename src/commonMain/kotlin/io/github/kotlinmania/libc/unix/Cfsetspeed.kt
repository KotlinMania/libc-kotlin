package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun cfsetspeed(termios: Termios?, speed: UInt): Int
