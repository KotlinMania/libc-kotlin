package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsAddclose(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int
