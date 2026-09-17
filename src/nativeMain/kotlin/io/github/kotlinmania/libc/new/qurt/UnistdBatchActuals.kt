// port-lint: source Unistd.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKString
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.allocArray
import libc.cinterop.libc_getcwd
import libc.cinterop.libc_close
import libc.cinterop.libc_unlink
import libc.cinterop.libc_rmdir
import libc.cinterop.libc_sysconf
import libc.cinterop.libc_ftruncate
import libc.cinterop.libc_access
import libc.cinterop.libc_getpid
import libc.cinterop.libc_lseek
import kotlinx.cinterop.CPointer
import libc.cinterop.libc_read

public actual fun access(pathname: String?, mode: CInt): CInt {
    if (pathname == null) return -1
    return libc.cinterop.libc_access(pathname, mode)
}
public actual fun close(fd: CInt): CInt = libc.cinterop.libc_close(fd)
public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libc.cinterop.libc_lseek(fd, offset, whence)
public actual fun read(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("read requires FFI bridge")
public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("write requires FFI bridge")
public actual fun unlink(pathname: String?): CInt {
    if (pathname == null) return -1
    return libc.cinterop.libc_unlink(pathname)
}
public actual fun getcwd(buf: String?, size: ULong): String? {
    val bufSize = if (size > 0uL) size.toInt() else 4096
    return memScoped {
        val bufPtr = allocArray<ByteVar>(bufSize)
        val result = libc.cinterop.libc_getcwd(bufPtr, bufSize.toULong())
        result?.toKString()
    }
}

public actual fun rmdir(pathname: String?): CInt {
    if (pathname == null) return -1
    return libc.cinterop.libc_rmdir(pathname)
}
public actual fun getpid(): PidT =
    libc.cinterop.libc_getpid()
public actual fun sysconf(name: CInt): CLong =
    libc.cinterop.libc_sysconf(name)
