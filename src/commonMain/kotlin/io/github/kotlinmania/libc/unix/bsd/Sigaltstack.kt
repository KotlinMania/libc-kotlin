package io.github.kotlinmania.libc.unix.bsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.apple.StackT

public expect fun sigaltstack(ss: StackT?, oss: StackT?): Int
