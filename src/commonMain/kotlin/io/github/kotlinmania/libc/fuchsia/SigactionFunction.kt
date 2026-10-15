package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun sigaction(signum: Int, act: Sigaction?, oldact: Sigaction?): Int
