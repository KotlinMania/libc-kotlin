// port-lint: source Unistd.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer

public actual fun access(pathname: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("access requires manual FFI bridge — not yet implemented")

public actual fun close(fd: CInt): CInt = libc.cinterop.libc_close(fd)
public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    throw UnsupportedOperationException("lseek requires manual FFI bridge — not yet implemented")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("read requires manual FFI bridge — UInt/ULong type mismatch")
public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("write requires manual FFI bridge — UInt/ULong type mismatch")
public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    throw UnsupportedOperationException("ftruncate requires manual FFI bridge — not yet implemented")

public actual fun unlink(pathname: String?): CInt =
    throw UnsupportedOperationException("unlink requires manual FFI bridge — not yet implemented")

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd requires manual FFI bridge — not yet implemented")

public actual fun rmdir(pathname: String?): CInt =
    throw UnsupportedOperationException("rmdir requires manual FFI bridge — not yet implemented")

public actual fun getpid(): PidT =
    throw UnsupportedOperationException("getpid requires manual FFI bridge — UInt/ULong type mismatch")
public actual fun sysconf(name: CInt): CLong =
    throw UnsupportedOperationException("sysconf requires manual FFI bridge — not yet implemented")
