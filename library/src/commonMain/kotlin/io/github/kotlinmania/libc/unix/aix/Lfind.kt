package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer?
