// port-lint: source Unistd.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun access(pathname: String?, mode: Int): Int =
    throw UnsupportedOperationException("access requires N-API addon")

public actual fun close(fd: Int): Int =
    throw UnsupportedOperationException("close requires N-API addon")

public actual fun lseek(fd: Int, offset: Long, whence: Int): Long =
    throw UnsupportedOperationException("lseek requires N-API addon")

public actual fun read(fd: Int, buf: COpaquePointer?, count: ULong): Int =
    throw UnsupportedOperationException("read requires N-API addon")

public actual fun write(fd: Int, buf: COpaquePointer?, count: ULong): Int =
    throw UnsupportedOperationException("write requires N-API addon")

public actual fun ftruncate(fd: Int, length: Long): Int =
    throw UnsupportedOperationException("ftruncate requires N-API addon")

public actual fun unlink(pathname: String?): Int =
    throw UnsupportedOperationException("unlink requires N-API addon")

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd requires N-API addon")

public actual fun rmdir(pathname: String?): Int =
    throw UnsupportedOperationException("rmdir requires N-API addon")

public actual fun getpid(): Int =
    throw UnsupportedOperationException("getpid requires N-API addon")

public actual fun sysconf(name: Int): Long =
    throw UnsupportedOperationException("sysconf requires N-API addon")
