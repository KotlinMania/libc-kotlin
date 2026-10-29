package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsAddclose(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fildes: Int): Int
