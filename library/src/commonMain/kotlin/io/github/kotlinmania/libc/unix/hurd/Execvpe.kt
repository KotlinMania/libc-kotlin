package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int
