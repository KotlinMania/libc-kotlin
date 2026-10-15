package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.*

public expect fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: Int, count: ULong): COpaquePointer?
