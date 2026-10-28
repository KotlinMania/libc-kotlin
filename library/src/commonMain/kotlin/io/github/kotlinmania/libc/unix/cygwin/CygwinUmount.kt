package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun cygwinUmount(target: String?, flags: UInt): Int
