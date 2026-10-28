package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: ULong)
