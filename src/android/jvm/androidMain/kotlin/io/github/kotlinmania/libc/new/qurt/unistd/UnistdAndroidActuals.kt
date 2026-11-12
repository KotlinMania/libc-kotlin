@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.unistd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.OffT
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.SsizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewQurtUnistdJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewQurtUnistdAccess(pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcNewQurtUnistdClose(fd: Int): Int

    @JvmStatic
    external fun libcNewQurtUnistdLseek(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libcNewQurtUnistdRead(fd: Int, buf: Long, count: Long): Int

    @JvmStatic
    external fun libcNewQurtUnistdWrite(fd: Int, buf: Long, count: Long): Int

    @JvmStatic
    external fun libcNewQurtUnistdFtruncate(fd: Int, length: Long): Int

    @JvmStatic
    external fun libcNewQurtUnistdUnlink(pathname: Long): Int

    @JvmStatic
    external fun libcNewQurtUnistdGetcwd(buf: Long, size: Long): Long

    @JvmStatic
    external fun libcNewQurtUnistdRmdir(pathname: Long): Int

    @JvmStatic
    external fun libcNewQurtUnistdGetpid(): Int

    @JvmStatic
    external fun libcNewQurtUnistdSleep(seconds: Int): Int

    @JvmStatic
    external fun libcNewQurtUnistdSysconf(name: Int): Long
}

public actual fun access(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    NewQurtUnistdJniBridge.libcNewQurtUnistdAccess(pathname.rawAddress, mode)

public actual fun close(fd: CInt): CInt =
    NewQurtUnistdJniBridge.libcNewQurtUnistdClose(fd)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    NewQurtUnistdJniBridge.libcNewQurtUnistdLseek(fd, offset, whence)

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: SizeT): SsizeT =
    NewQurtUnistdJniBridge.libcNewQurtUnistdRead(fd, buf.rawAddress, count.toLong())

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT =
    NewQurtUnistdJniBridge.libcNewQurtUnistdWrite(fd, buf.rawAddress, count.toLong())

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    NewQurtUnistdJniBridge.libcNewQurtUnistdFtruncate(fd, length)

public actual fun unlink(pathname: ConstPtr<CChar>): CInt =
    NewQurtUnistdJniBridge.libcNewQurtUnistdUnlink(pathname.rawAddress)

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    MutPtr(NewQurtUnistdJniBridge.libcNewQurtUnistdGetcwd(buf.rawAddress, size.toLong()))

public actual fun rmdir(pathname: ConstPtr<CChar>): CInt =
    NewQurtUnistdJniBridge.libcNewQurtUnistdRmdir(pathname.rawAddress)

public actual fun getpid(): PidT =
    NewQurtUnistdJniBridge.libcNewQurtUnistdGetpid()

public actual fun sleep(seconds: CUint): CUint =
    NewQurtUnistdJniBridge.libcNewQurtUnistdSleep(seconds.toInt()).toUInt()

public actual fun sysconf(name: CInt): CLong =
    NewQurtUnistdJniBridge.libcNewQurtUnistdSysconf(name)
