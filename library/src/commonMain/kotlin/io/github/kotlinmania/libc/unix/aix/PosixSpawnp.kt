package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun posixSpawnp(pid: Int?, file: String?, fileActions: String?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): Int
