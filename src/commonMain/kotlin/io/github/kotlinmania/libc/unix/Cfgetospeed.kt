package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Termios

public fun cfgetospeed(termios: Termios?): UInt = throw UnsupportedOperationException("Not implemented on this platform")
