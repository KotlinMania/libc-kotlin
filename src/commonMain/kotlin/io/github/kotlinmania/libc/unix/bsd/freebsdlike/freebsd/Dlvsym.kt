package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer?
