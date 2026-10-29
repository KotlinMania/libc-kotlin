package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun mmap(addr: COpaquePointer?, len: ULong, prot: Int, flags: Int, fd: Int, offset: Long): COpaquePointer?
