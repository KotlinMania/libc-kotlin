// port-lint: source Unistd.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer

public actual fun access(pathname: String?, mode: CInt): CInt =
    libc.cinterop.libc_access(pathname, mode)
public actual fun close(fd: CInt): CInt = libc.cinterop.libc_close(fd)
public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libc.cinterop.libc_lseek(fd, offset, whence)
public actual fun read(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("read requires manual FFI bridge — type width mismatch")
public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("write requires manual FFI bridge — UInt/ULong type mismatch")
public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libc.cinterop.libc_ftruncate(fd, length)
public actual fun unlink(pathname: String?): CInt =
    libc.cinterop.libc_unlink(pathname)
public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd requires manual FFI bridge — not yet implemented")

public actual fun rmdir(pathname: String?): CInt =
    libc.cinterop.libc_rmdir(pathname)
public actual fun getpid(): PidT =
    libc.cinterop.libc_getpid()
public actual fun sysconf(name: CInt): CLong =
    libc.cinterop.libc_sysconf(name)
