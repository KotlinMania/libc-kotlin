package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.COpaquePointer

public actual fun fcntl(fd: Int, cmd: Int): Int =
    throw UnsupportedOperationException("POSIX descriptor commands are unavailable in the Windows C runtime")

public actual fun fcntl(fd: Int, cmd: Int, argument: Int): Int =
    throw UnsupportedOperationException("POSIX descriptor commands are unavailable in the Windows C runtime")

public actual fun fcntl(fd: Int, cmd: Int, argument: COpaquePointer?): Int =
    throw UnsupportedOperationException("POSIX descriptor commands are unavailable in the Windows C runtime")
