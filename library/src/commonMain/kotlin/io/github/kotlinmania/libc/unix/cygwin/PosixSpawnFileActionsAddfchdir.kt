package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsAddfchdir(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int
