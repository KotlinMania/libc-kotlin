package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun lwpUnpark(lwp: Int, hint: COpaquePointer?): Int
