package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun fexecve(fd: Int, argv: COpaquePointer?, envp: COpaquePointer?): Int
