package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun mergesort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> Int)?): Int
