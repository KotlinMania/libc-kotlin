package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun regcomp(preg: RegexT?, pattern: String?, cflags: Int): Int
