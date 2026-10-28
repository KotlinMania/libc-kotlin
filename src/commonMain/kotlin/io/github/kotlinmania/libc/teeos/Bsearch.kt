package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: ULong, width: ULong, cmp: ((io.github.kotlinmania.libc.COpaquePointer?, io.github.kotlinmania.libc.COpaquePointer?) -> Int)?): COpaquePointer?
