package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun syscall(num: Long, vararg args: Any?): Long
