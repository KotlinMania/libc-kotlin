package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun mallocInfo(options: Int, stream: FILE?): Int
