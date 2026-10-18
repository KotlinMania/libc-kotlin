package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun strptime(s: String?, format: String?, tm: Tm?): String?
