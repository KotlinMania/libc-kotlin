package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun memset(dest: COpaquePointer?, c: Int, n: ULong): COpaquePointer?
