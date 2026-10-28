package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun strsep(arg1: COpaquePointer?, arg2: String?): String?
