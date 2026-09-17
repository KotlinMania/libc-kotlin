// port-lint: source Unistd.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun access(pathname: String?, mode: CInt): CInt =
    accessNapi(pathname, mode)

public actual fun close(fd: CInt): CInt =
    closeNapi(fd)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    LibcNative.lseek(fd, offset.toInt(), whence).toLong()

public actual fun read(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    LibcNative.read(fd, buf?.value, count.toInt())

public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    LibcNative.write(fd, buf?.value, count.toInt())

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    throw UnsupportedOperationException("ftruncate requires N-API addon")

public actual fun unlink(pathname: String?): CInt =
    unlinkNapi(pathname)

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd requires N-API addon")

public actual fun rmdir(pathname: String?): CInt =
    throw UnsupportedOperationException("rmdir requires N-API addon")

public actual fun getpid(): PidT =
    getpidNapi()

public actual fun sysconf(name: CInt): CLong =
    throw UnsupportedOperationException("sysconf requires N-API addon")

