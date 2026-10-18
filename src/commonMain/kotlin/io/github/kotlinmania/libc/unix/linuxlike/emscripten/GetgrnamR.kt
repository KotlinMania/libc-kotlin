package io.github.kotlinmania.libc.unix.linuxlike.emscripten
import io.github.kotlinmania.libc.unix.Group

import io.github.kotlinmania.libc.*

public expect fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int
