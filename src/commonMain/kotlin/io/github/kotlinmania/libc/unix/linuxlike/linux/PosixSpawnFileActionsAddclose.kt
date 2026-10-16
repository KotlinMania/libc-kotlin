package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: Int): Int
