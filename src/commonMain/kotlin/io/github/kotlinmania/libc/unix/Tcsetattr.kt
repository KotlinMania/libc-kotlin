package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Termios

public expect fun tcsetattr(fd: Int, optionalActions: Int, termios: Termios?): Int
