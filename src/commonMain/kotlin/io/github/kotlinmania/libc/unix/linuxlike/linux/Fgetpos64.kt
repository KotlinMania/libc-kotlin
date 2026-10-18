package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun fgetpos64(stream: FILE?, ptr: Long?): Int
