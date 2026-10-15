package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun tcsetattr(fd: Int, optionalActions: Int, termios: Termios?): Int
