@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.unistd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.OffT
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.SsizeT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun access(pathname: String?, mode: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_access(pathname, mode)

public actual fun close(fd: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_close(fd)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_lseek(fd, offset, whence)

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_read(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_write(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_ftruncate(fd, length)

public actual fun unlink(pathname: String?): CInt =
    io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_unlink(pathname)

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_getcwd(buf?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun rmdir(pathname: String?): CInt =
    io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_rmdir(pathname)

public actual fun getpid(): PidT =
    io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_getpid()

public actual fun sleep(seconds: CUint): CUint =
    io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_sleep(seconds)

public actual fun sysconf(name: CInt): CLong =
    io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_sysconf(name)
