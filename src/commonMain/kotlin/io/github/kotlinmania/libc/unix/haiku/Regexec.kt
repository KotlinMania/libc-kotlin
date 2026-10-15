package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: Int): Int
