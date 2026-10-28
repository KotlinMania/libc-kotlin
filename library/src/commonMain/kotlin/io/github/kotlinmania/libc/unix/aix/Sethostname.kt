package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun sethostname(name: String?, len: Int): Int
