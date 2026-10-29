@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_fcntl_int
import libc.cinterop.libc_fcntl_noarg
import libc.cinterop.libc_fcntl_pointer

public actual fun fcntl(fd: Int, cmd: Int): Int = libc_fcntl_noarg(fd, cmd)

public actual fun fcntl(fd: Int, cmd: Int, argument: Int): Int = libc_fcntl_int(fd, cmd, argument)

public actual fun fcntl(fd: Int, cmd: Int, argument: COpaquePointer?): Int =
    libc_fcntl_pointer(fd, cmd, argument?.value?.toCPointer<ByteVar>())
