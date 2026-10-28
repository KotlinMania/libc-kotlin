package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun dlinfo(handle: COpaquePointer?, request: Int, info: COpaquePointer?): Int
