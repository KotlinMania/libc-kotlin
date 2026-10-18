package io.github.kotlinmania.libc.unix.hurd
import io.github.kotlinmania.libc.unix.Rlimit

import io.github.kotlinmania.libc.*

public expect fun setrlimit(resource: UInt, rlim: Rlimit?): Int
