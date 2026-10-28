package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun execvp(c: String?, argv: COpaquePointer?): Int
