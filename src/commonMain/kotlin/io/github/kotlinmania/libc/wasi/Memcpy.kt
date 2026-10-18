package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer?
