package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun posixSpawn(pid: Int?, path: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): Int
