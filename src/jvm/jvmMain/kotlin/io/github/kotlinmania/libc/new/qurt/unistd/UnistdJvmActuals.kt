@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object NewQurtUnistdJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_qurt_unistd_access(pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_new_qurt_unistd_close(fd: Int): Int

    @JvmStatic
    external fun libc_new_qurt_unistd_lseek(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libc_new_qurt_unistd_read(fd: Int, buf: Long, count: Long): Int

    @JvmStatic
    external fun libc_new_qurt_unistd_write(fd: Int, buf: Long, count: Long): Int

    @JvmStatic
    external fun libc_new_qurt_unistd_ftruncate(fd: Int, length: Long): Int

    @JvmStatic
    external fun libc_new_qurt_unistd_unlink(pathname: String?): Int

    @JvmStatic
    external fun libc_new_qurt_unistd_getcwd(buf: Long, size: Long): Long

    @JvmStatic
    external fun libc_new_qurt_unistd_rmdir(pathname: String?): Int

    @JvmStatic
    external fun libc_new_qurt_unistd_getpid(): Int

    @JvmStatic
    external fun libc_new_qurt_unistd_sleep(seconds: Int): Int

    @JvmStatic
    external fun libc_new_qurt_unistd_sysconf(name: Int): Long
}

public actual fun access(pathname: String?, mode: CInt): CInt =
    NewQurtUnistdJniBridge.libc_new_qurt_unistd_access(pathname, mode)

public actual fun close(fd: CInt): CInt =
    NewQurtUnistdJniBridge.libc_new_qurt_unistd_close(fd)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    NewQurtUnistdJniBridge.libc_new_qurt_unistd_lseek(fd, offset, whence)

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    NewQurtUnistdJniBridge.libc_new_qurt_unistd_read(fd, (buf?.value ?: 0L), count.toLong())

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    NewQurtUnistdJniBridge.libc_new_qurt_unistd_write(fd, (buf?.value ?: 0L), count.toLong())

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    NewQurtUnistdJniBridge.libc_new_qurt_unistd_ftruncate(fd, length)

public actual fun unlink(pathname: String?): CInt =
    NewQurtUnistdJniBridge.libc_new_qurt_unistd_unlink(pathname)

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    NewQurtUnistdJniBridge.libc_new_qurt_unistd_getcwd((buf?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rmdir(pathname: String?): CInt =
    NewQurtUnistdJniBridge.libc_new_qurt_unistd_rmdir(pathname)

public actual fun getpid(): PidT =
    NewQurtUnistdJniBridge.libc_new_qurt_unistd_getpid()

public actual fun sleep(seconds: CUint): CUint =
    NewQurtUnistdJniBridge.libc_new_qurt_unistd_sleep(seconds.toInt()).toUInt()

public actual fun sysconf(name: CInt): CLong =
    NewQurtUnistdJniBridge.libc_new_qurt_unistd_sysconf(name)
