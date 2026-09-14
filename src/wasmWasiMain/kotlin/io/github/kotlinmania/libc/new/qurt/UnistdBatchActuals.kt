// port-lint: source Unistd.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun access(pathname: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("access not available on WASI — no C library access")

public actual fun close(fd: CInt): CInt =
    throw UnsupportedOperationException("close not available on WASI — no C library access")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    throw UnsupportedOperationException("lseek not available on WASI — no C library access")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("read not available on WASI — no C library access")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("write not available on WASI — no C library access")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    throw UnsupportedOperationException("ftruncate not available on WASI — no C library access")

public actual fun unlink(pathname: String?): CInt =
    throw UnsupportedOperationException("unlink not available on WASI — no C library access")

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd not available on WASI — no C library access")

public actual fun rmdir(pathname: String?): CInt =
    throw UnsupportedOperationException("rmdir not available on WASI — no C library access")

public actual fun getpid(): PidT =
    throw UnsupportedOperationException("getpid not available on WASI — no C library access")

public actual fun sysconf(name: CInt): CLong =
    throw UnsupportedOperationException("sysconf not available on WASI — no C library access")

