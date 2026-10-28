package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun mallocStatsPrint(writeCb: ((COpaquePointer?, String?) -> Unit)?, cbopaque: COpaquePointer?, opt: String?)
