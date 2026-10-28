package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsAddchdir(actions: io.github.kotlinmania.libc.COpaquePointer?, path: String?): Int
