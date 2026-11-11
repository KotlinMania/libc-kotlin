@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.unistd

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.OffT
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.SsizeT
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_access
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_close
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_ftruncate
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_getcwd
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_getpid
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_lseek
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_read
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_rmdir
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_sleep
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_sysconf
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_unlink
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libc_new_qurt_unistd_write
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun access(pathname: String?, mode: CInt): CInt =
    libc_new_qurt_unistd_access(pathname, mode)

public actual fun close(fd: CInt): CInt =
    libc_new_qurt_unistd_close(fd)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libc_new_qurt_unistd_lseek(fd, offset, whence)

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    libc_new_qurt_unistd_read(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    libc_new_qurt_unistd_write(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libc_new_qurt_unistd_ftruncate(fd, length)

public actual fun unlink(pathname: String?): CInt =
    libc_new_qurt_unistd_unlink(pathname)

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    libc_new_qurt_unistd_getcwd(buf?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun rmdir(pathname: String?): CInt =
    libc_new_qurt_unistd_rmdir(pathname)

public actual fun getpid(): PidT =
    libc_new_qurt_unistd_getpid()

public actual fun sleep(seconds: CUint): CUint =
    libc_new_qurt_unistd_sleep(seconds)

public actual fun sysconf(name: CInt): CLong =
    libc_new_qurt_unistd_sysconf(name)
