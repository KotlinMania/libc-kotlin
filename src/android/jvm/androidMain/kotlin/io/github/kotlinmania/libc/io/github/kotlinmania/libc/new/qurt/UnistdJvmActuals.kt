package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

internal object UnistdRawLibc {
    external fun access(pathname: String?, mode: Int): Int
    external fun close(fd: Int): Int
    external fun lseek(fd: Int, offset: Long, whence: Int): Long
    external fun read(fd: Int, buf: Long, count: Long): Long
    external fun write(fd: Int, buf: Long, count: Long): Long
    external fun ftruncate(fd: Int, length: Long): Int
    external fun unlink(pathname: String?): Int
    external fun getcwd(buf: Long, size: Long): Long?
    external fun rmdir(pathname: String?): Int
    external fun getpid(): Int
    external fun sleep(seconds: Int): Int
    external fun sysconf(name: Int): Long
}

public actual fun access(pathname: String?, mode: CInt): CInt =
    UnistdRawLibc.access(pathname, mode)

public actual fun close(fd: CInt): CInt =
    UnistdRawLibc.close(fd)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    UnistdRawLibc.lseek(fd, offset, whence)

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    UnistdRawLibc.read(fd, buf?.value ?: 0L, count)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    UnistdRawLibc.write(fd, buf?.value ?: 0L, count)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    UnistdRawLibc.ftruncate(fd, length)

public actual fun unlink(pathname: String?): CInt =
    UnistdRawLibc.unlink(pathname)

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    UnistdRawLibc.getcwd(buf?.value ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rmdir(pathname: String?): CInt =
    UnistdRawLibc.rmdir(pathname)

public actual fun getpid(): PidT =
    UnistdRawLibc.getpid()

public actual fun sleep(seconds: CUint): CUint =
    UnistdRawLibc.sleep(seconds)

public actual fun sysconf(name: CInt): CLong =
    UnistdRawLibc.sysconf(name)
