package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: Int, arg4: ULong): COpaquePointer?
