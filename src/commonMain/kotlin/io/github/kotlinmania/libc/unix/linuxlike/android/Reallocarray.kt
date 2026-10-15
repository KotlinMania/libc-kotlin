package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer?
