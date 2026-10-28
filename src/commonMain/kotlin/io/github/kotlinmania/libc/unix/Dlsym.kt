package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer?
