// port-lint: source Unistd.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import libc.cinterop.libc_access
import libc.cinterop.libc_close
import libc.cinterop.libc_getpid
import libc.cinterop.libc_lseek
import libc.cinterop.libc_rmdir
import libc.cinterop.libc_unlink

public actual fun access(pathname: String?, mode: Int): Int {
    if (pathname == null) return -1
    return libc.cinterop.libc_access(pathname, mode)
}

public actual fun close(fd: Int): Int = libc.cinterop.libc_close(fd)

public actual fun lseek(fd: Int, offset: Long, whence: Int): Long =
    libc.cinterop.libc_lseek(fd, offset, whence)

public actual fun read(fd: Int, buf: COpaquePointer?, count: ULong): Int =
    throw UnsupportedOperationException("read requires FFI bridge")

public actual fun write(fd: Int, buf: COpaquePointer?, count: ULong): Int =
    throw UnsupportedOperationException("write requires FFI bridge")

public actual fun unlink(pathname: String?): Int {
    if (pathname == null) return -1
    return libc.cinterop.libc_unlink(pathname)
}

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd requires FFI bridge")

public actual fun rmdir(pathname: String?): Int {
    if (pathname == null) return -1
    return libc.cinterop.libc_rmdir(pathname)
}

public actual fun getpid(): Int =
    libc.cinterop.libc_getpid()

public actual fun sysconf(name: Int): Long =
    throw UnsupportedOperationException("sysconf requires FFI bridge")
