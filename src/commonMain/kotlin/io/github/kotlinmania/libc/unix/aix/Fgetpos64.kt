package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun fgetpos64(stream: FILE?, ptr: Long?): Int
