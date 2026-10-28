package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun fprintf(arg1: FILE?, arg2: String?, vararg args: Any?): Int
