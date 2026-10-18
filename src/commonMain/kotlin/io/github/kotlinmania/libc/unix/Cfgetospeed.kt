package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Termios

import io.github.kotlinmania.libc.*

public fun cfgetospeed(termios: Termios?): UInt = throw UnsupportedOperationException("Not implemented on this platform")
