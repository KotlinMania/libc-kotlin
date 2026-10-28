package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun mount(src: String?, target: String?, flags: UInt): Int
