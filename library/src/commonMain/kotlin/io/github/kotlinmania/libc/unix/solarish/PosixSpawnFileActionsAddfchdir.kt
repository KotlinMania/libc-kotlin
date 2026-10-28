package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsAddfchdir(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int
