package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun cxaAtexit(cb: (() -> Unit)?, arg: COpaquePointer?, dso: COpaquePointer?): Int
