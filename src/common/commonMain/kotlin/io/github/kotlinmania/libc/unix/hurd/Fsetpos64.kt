package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun fsetpos64(stream: FILE?, ptr: Long?): Int
