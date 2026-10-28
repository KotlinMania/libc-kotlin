package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: ULong)
