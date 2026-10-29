package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun execv(prog: String?, argv: COpaquePointer?): Int
