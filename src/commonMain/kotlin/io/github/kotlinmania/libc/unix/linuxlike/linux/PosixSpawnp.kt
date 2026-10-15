package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun posixSpawnp(pid: Int?, file: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): Int
