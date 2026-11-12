@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.unistd

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.OffT
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.SsizeT
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libcNewQurtUnistdAccess
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libcNewQurtUnistdClose
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libcNewQurtUnistdFtruncate
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libcNewQurtUnistdGetcwd
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libcNewQurtUnistdGetpid
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libcNewQurtUnistdLseek
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libcNewQurtUnistdRead
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libcNewQurtUnistdRmdir
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libcNewQurtUnistdSleep
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libcNewQurtUnistdSysconf
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libcNewQurtUnistdUnlink
import io.github.kotlinmania.libc.new.qurt.unistd.cinterop.libcNewQurtUnistdWrite
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun access(pathname: ConstPtr, mode: CInt): CInt =
    libcNewQurtUnistdAccess(pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun close(fd: CInt): CInt =
    libcNewQurtUnistdClose(fd)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libcNewQurtUnistdLseek(fd, offset, whence)

public actual fun read(fd: CInt, buf: MutPtr, count: SizeT): SsizeT =
    libcNewQurtUnistdRead(fd, buf.rawAddress.toCPointer<ByteVar>(), count)

public actual fun write(fd: CInt, buf: ConstPtr, count: SizeT): SsizeT =
    libcNewQurtUnistdWrite(fd, buf.rawAddress.toCPointer<ByteVar>(), count)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libcNewQurtUnistdFtruncate(fd, length)

public actual fun unlink(pathname: ConstPtr): CInt =
    libcNewQurtUnistdUnlink(pathname.rawAddress.toCPointer<ByteVar>())

public actual fun getcwd(buf: MutPtr, size: SizeT): MutPtr =
    MutPtr(libcNewQurtUnistdGetcwd(buf.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun rmdir(pathname: ConstPtr): CInt =
    libcNewQurtUnistdRmdir(pathname.rawAddress.toCPointer<ByteVar>())

public actual fun getpid(): PidT =
    libcNewQurtUnistdGetpid()

public actual fun sleep(seconds: CUint): CUint =
    libcNewQurtUnistdSleep(seconds)

public actual fun sysconf(name: CInt): CLong =
    libcNewQurtUnistdSysconf(name)
