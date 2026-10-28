package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun getcwd(buf: COpaquePointer?, size: ULong): COpaquePointer?
