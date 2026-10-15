// port-lint: source Unistd.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun access(pathname: String?, mode: Int): Int =
    accessNapi(pathname, mode)

public actual fun close(fd: Int): Int =
    closeNapi(fd)

public actual fun lseek(fd: Int, offset: Long, whence: Int): Long =
    LibcNative.lseek(fd, offset.toInt(), whence).toLong()

public actual fun read(fd: Int, buf: COpaquePointer?, count: ULong): Int =
    LibcNative.read(fd, buf?.value, count.toInt())

public actual fun write(fd: Int, buf: COpaquePointer?, count: ULong): Int =
    LibcNative.write(fd, buf?.value, count.toInt())

public actual fun ftruncate(fd: Int, length: Long): Int =
    throw UnsupportedOperationException("ftruncate requires N-API addon")

public actual fun unlink(pathname: String?): Int =
    unlinkNapi(pathname)

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd requires N-API addon")

public actual fun rmdir(pathname: String?): Int =
    throw UnsupportedOperationException("rmdir requires N-API addon")

public actual fun getpid(): Int =
    getpidNapi()

public actual fun sysconf(name: Int): Long =
    throw UnsupportedOperationException("sysconf requires N-API addon")
