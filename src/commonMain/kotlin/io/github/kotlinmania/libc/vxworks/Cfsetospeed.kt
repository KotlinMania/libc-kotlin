package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun cfsetospeed(termios: Termios?, speed: UInt): Int
