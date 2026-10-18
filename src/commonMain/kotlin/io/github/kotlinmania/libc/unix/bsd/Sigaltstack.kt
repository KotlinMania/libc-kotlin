package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public expect fun sigaltstack(ss: StackT?, oss: StackT?): Int
