package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun strptime(buf: String?, format: String?, timeptr: Tm?): String?
