package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun memrchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer?
