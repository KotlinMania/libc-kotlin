package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsAddclose(actions: String?, fd: Int): Int
