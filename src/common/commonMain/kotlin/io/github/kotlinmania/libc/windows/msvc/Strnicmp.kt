package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.*

public expect fun strnicmp(s1: String?, s2: String?, n: ULong): Int
