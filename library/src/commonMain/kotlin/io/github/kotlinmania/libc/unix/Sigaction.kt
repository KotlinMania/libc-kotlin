package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.apple.Sigaction

public expect fun sigaction(signum: Int, act: Sigaction?, oldact: Sigaction?): Int
