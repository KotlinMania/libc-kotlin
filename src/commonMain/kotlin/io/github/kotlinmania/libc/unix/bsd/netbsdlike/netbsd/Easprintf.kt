package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun easprintf(string: COpaquePointer?, fmt: String?, vararg args: Any?): Int
