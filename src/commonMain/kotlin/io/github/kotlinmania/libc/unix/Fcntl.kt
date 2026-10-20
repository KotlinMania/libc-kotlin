package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun fcntl(fd: Int, cmd: Int): Int

public expect fun fcntl(fd: Int, cmd: Int, argument: Int): Int

public expect fun fcntl(fd: Int, cmd: Int, argument: COpaquePointer?): Int
