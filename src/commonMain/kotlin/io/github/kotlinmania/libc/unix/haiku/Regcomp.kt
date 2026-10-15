package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun regcomp(preg: RegexT?, pattern: String?, cflags: Int): Int
