package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int
