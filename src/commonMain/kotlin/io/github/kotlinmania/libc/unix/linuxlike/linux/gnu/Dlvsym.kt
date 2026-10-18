package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public expect fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer?
