// port-lint: source Unistd.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun access(pathname: String?, mode: Int): Int =
    throw UnsupportedOperationException("access not available on JVM — no C library access")

public actual fun close(fd: Int): Int =
    throw UnsupportedOperationException("close not available on JVM — no C library access")

public actual fun lseek(fd: Int, offset: Long, whence: Int): Long =
    throw UnsupportedOperationException("lseek not available on JVM — no C library access")

public actual fun read(fd: Int, buf: COpaquePointer?, count: ULong): Int =
    throw UnsupportedOperationException("read not available on JVM — no C library access")

public actual fun write(fd: Int, buf: COpaquePointer?, count: ULong): Int =
    throw UnsupportedOperationException("write not available on JVM — no C library access")

public actual fun ftruncate(fd: Int, length: Long): Int =
    throw UnsupportedOperationException("ftruncate not available on JVM — no C library access")

public actual fun unlink(pathname: String?): Int =
    throw UnsupportedOperationException("unlink not available on JVM — no C library access")

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd not available on JVM — no C library access")

public actual fun rmdir(pathname: String?): Int =
    throw UnsupportedOperationException("rmdir not available on JVM — no C library access")

public actual fun getpid(): Int =
    throw UnsupportedOperationException("getpid not available on JVM — no C library access")

public actual fun sysconf(name: Int): Long =
    throw UnsupportedOperationException("sysconf not available on JVM — no C library access")
