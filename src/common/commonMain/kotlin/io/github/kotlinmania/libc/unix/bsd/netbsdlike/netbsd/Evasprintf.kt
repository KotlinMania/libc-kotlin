package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun evasprintf(string: COpaquePointer?, fmt: String?, vararg args: Any?): Int
