package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun ctimeR(timep: Long?, buf: String?): String?
