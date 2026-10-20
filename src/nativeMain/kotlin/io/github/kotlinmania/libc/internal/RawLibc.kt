@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.internal

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import libc.cinterop.libc_calloc
import libc.cinterop.libc_close
import libc.cinterop.libc_free
import libc.cinterop.libc_get_errno
import libc.cinterop.libc_lseek
import libc.cinterop.libc_malloc
import libc.cinterop.libc_memcmp
import libc.cinterop.libc_memcpy
import libc.cinterop.libc_memset
import libc.cinterop.libc_open
import libc.cinterop.libc_raw_descriptor_command
import libc.cinterop.libc_raw_open_flag
import libc.cinterop.libc_read
import libc.cinterop.libc_realloc
import libc.cinterop.libc_write

internal actual object RawLibc {
    actual fun allocate(size: Long): Long = libc_malloc(size.toULong())?.toLong() ?: 0L
    actual fun allocateZeroed(count: Long, size: Long): Long = libc_calloc(count.toULong(), size.toULong())?.toLong() ?: 0L
    actual fun resize(address: Long, size: Long): Long = libc_realloc(address.toCPointer<ByteVar>(), size.toULong())?.toLong() ?: 0L
    actual fun release(address: Long) = libc_free(address.toCPointer<ByteVar>())
    actual fun fill(address: Long, value: Int, size: Long): Long = libc_memset(address.toCPointer<ByteVar>(), value, size.toULong())?.toLong() ?: 0L
    actual fun copy(destination: Long, source: Long, size: Long): Long = libc_memcpy(destination.toCPointer<ByteVar>(), source.toCPointer<ByteVar>(), size.toULong())?.toLong() ?: 0L
    actual fun compare(first: Long, second: Long, size: Long): Int = libc_memcmp(first.toCPointer<ByteVar>(), second.toCPointer<ByteVar>(), size.toULong())
    actual fun open(path: String?, flags: Int, mode: Int): Int = libc_open(path, flags, mode.toUInt())
    actual fun close(fd: Int): Int = libc_close(fd)
    actual fun read(fd: Int, address: Long, size: Long): Long = libc_read(fd, address.toCPointer<ByteVar>(), size.toULong())
    actual fun write(fd: Int, address: Long, size: Long): Long = libc_write(fd, address.toCPointer<ByteVar>(), size.toULong())
    actual fun seek(fd: Int, offset: Long, whence: Int): Long = libc_lseek(fd, offset, whence)
    actual fun numericNameinfoFlags(): Int = libc.cinterop.libc_numeric_nameinfo_flags()
    actual fun errno(): Int = libc_get_errno()
    actual fun openFlags(): IntArray = IntArray(7) { libc_raw_open_flag(it) }
    actual fun descriptorCommands(): IntArray? = if (libc_raw_descriptor_command(0) == -1) null else IntArray(4) { libc_raw_descriptor_command(it) }
    actual fun fcntlNoArgument(fd: Int, command: Int): Int =
        io.github.kotlinmania.libc.unix
            .fcntl(fd, command)
    actual fun fcntlInteger(fd: Int, command: Int, argument: Int): Int =
        io.github.kotlinmania.libc.unix
            .fcntl(fd, command, argument)
    actual fun fcntlPointer(fd: Int, command: Int, address: Long): Int =
        io.github.kotlinmania.libc.unix
            .fcntl(
                fd,
                command,
                io.github.kotlinmania.libc
                    .COpaquePointer(address),
            )
}
