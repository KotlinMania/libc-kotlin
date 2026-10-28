package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun sigaction(signum: Int, act: Sigaction?, oldact: Sigaction?): Int
