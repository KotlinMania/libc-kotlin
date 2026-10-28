package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun sigaltstack(ss: StackT?, oss: StackT?): Int
