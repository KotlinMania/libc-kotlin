package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun sbrk(increment: Int): COpaquePointer?
