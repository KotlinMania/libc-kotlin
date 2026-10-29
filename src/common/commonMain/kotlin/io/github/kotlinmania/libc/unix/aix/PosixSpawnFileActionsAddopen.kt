package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsAddopen(actions: String?, fd: Int, path: String?, oflag: Int, mode: UInt): Int
