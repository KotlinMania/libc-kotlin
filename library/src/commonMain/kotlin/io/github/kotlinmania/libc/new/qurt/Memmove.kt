package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer?
