package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun strptime(s: String?, format: String?, tm: Tm?): String?
