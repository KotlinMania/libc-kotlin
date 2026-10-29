package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun fseek(arg1: FILE?, arg2: Long, arg3: Int): Int
