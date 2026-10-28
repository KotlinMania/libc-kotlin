package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun fgetpos(stream: FILE?, ptr: Long?): Int
