package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun wexecv(prog: UShort?, argv: COpaquePointer?): Long
