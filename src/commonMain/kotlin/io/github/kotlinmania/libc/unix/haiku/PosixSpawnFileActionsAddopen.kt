package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsAddopen(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fildes: Int, path: String?, oflag: Int, mode: UInt): Int
