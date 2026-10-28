package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsAddchdir(fileActions: io.github.kotlinmania.libc.COpaquePointer?, path: String?): Int
