package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: Int, newfd: Int): Int
