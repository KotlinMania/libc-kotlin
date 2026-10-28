package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun strxfrm(s: COpaquePointer?, ct: String?, n: ULong): ULong
