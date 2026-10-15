package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public expect fun reallocf(ptr: COpaquePointer?, size: ULong): COpaquePointer?
