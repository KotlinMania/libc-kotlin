package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun qsort(base: COpaquePointer?, nel: ULong, width: ULong, cmp: ((io.github.kotlinmania.libc.COpaquePointer?, io.github.kotlinmania.libc.COpaquePointer?) -> Int)?)
