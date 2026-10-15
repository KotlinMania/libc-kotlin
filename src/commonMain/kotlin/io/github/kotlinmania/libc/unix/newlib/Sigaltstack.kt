package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public expect fun sigaltstack(ss: StackT?, oss: StackT?): Int
