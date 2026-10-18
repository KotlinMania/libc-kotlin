@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_fcntl_int
import libc.cinterop.libc_fcntl_noarg
import libc.cinterop.libc_fcntl_pointer

/** Passes an absent, integer, or raw pointer argument to the host descriptor API. */
public actual fun fcntl(fd: Int, cmd: Int, vararg args: Any?): Int {
    require(args.size <= 1) { "fcntl accepts at most one command argument" }
    if (args.isEmpty()) return libc_fcntl_noarg(fd, cmd)
    return when (val argument = args[0]) {
        is Int -> libc_fcntl_int(fd, cmd, argument)
        is COpaquePointer -> libc_fcntl_pointer(fd, cmd, argument.value.toCPointer<ByteVar>())
        null -> libc_fcntl_pointer(fd, cmd, null)
        else -> throw IllegalArgumentException("fcntl requires an Int or COpaquePointer command argument")
    }
}
