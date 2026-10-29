package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun explicitMemset(arg1: COpaquePointer?, arg2: Int, arg3: ULong): COpaquePointer?
