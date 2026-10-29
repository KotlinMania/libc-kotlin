package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun tcgetattr(fd: Int, termios: Termios?): Int
