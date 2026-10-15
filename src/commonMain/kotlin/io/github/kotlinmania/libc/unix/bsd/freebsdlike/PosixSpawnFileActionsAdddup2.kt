package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsAdddup2(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int, newfd: Int): Int
