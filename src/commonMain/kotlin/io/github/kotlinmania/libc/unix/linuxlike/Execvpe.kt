package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int
