package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun readahead(fd: Int, offset: Long, count: ULong): Long
