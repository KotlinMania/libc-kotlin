package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong, arg4: ULong, arg5: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer?
