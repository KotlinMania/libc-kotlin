package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): Int
