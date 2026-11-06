@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun access(pathname: String?, mode: CInt): CInt =
    libc.cinterop.libc_unistd_access(pathname, mode)

public actual fun close(fd: CInt): CInt =
    libc.cinterop.libc_unistd_close(fd)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libc.cinterop.libc_unistd_lseek(fd, offset, whence)

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    libc.cinterop.libc_unistd_read(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    libc.cinterop.libc_unistd_write(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libc.cinterop.libc_unistd_ftruncate(fd, length)

public actual fun unlink(pathname: String?): CInt =
    libc.cinterop.libc_unistd_unlink(pathname)

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    libc.cinterop.libc_unistd_getcwd(buf?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun rmdir(pathname: String?): CInt =
    libc.cinterop.libc_unistd_rmdir(pathname)

public actual fun getpid(): PidT =
    libc.cinterop.libc_unistd_getpid()

public actual fun sleep(seconds: CUint): CUint =
    libc.cinterop.libc_unistd_sleep(seconds)

public actual fun sysconf(name: CInt): CLong =
    libc.cinterop.libc_unistd_sysconf(name)
