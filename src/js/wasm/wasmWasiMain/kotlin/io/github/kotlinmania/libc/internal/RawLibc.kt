package io.github.kotlinmania.libc.internal

internal actual object RawLibc {
    actual fun allocate(size: Long): Long =
        throw UnsupportedOperationException("Host C pointers and POSIX descriptor commands are unavailable in WASI; use linear memory and capability-relative WASI imports")

    actual fun allocateZeroed(count: Long, size: Long): Long =
        throw UnsupportedOperationException("Host C pointers and POSIX descriptor commands are unavailable in WASI; use linear memory and capability-relative WASI imports")

    actual fun resize(address: Long, size: Long): Long =
        throw UnsupportedOperationException("Host C pointers and POSIX descriptor commands are unavailable in WASI; use linear memory and capability-relative WASI imports")

    actual fun release(address: Long): Unit =
        throw UnsupportedOperationException("Host C pointers and POSIX descriptor commands are unavailable in WASI; use linear memory and capability-relative WASI imports")

    actual fun fill(address: Long, value: Int, size: Long): Long =
        throw UnsupportedOperationException("Host C pointers and POSIX descriptor commands are unavailable in WASI; use linear memory and capability-relative WASI imports")

    actual fun copy(destination: Long, source: Long, size: Long): Long =
        throw UnsupportedOperationException("Host C pointers and POSIX descriptor commands are unavailable in WASI; use linear memory and capability-relative WASI imports")

    actual fun compare(first: Long, second: Long, size: Long): Int =
        throw UnsupportedOperationException("Host C pointers and POSIX descriptor commands are unavailable in WASI; use linear memory and capability-relative WASI imports")

    actual fun open(path: String?, flags: Int, mode: Int): Int =
        throw UnsupportedOperationException("Host C pointers and POSIX descriptor commands are unavailable in WASI; use linear memory and capability-relative WASI imports")

    actual fun close(fd: Int): Int =
        throw UnsupportedOperationException("Host C pointers and POSIX descriptor commands are unavailable in WASI; use linear memory and capability-relative WASI imports")

    actual fun read(fd: Int, address: Long, size: Long): Long =
        throw UnsupportedOperationException("Host C pointers and POSIX descriptor commands are unavailable in WASI; use linear memory and capability-relative WASI imports")

    actual fun write(fd: Int, address: Long, size: Long): Long =
        throw UnsupportedOperationException("Host C pointers and POSIX descriptor commands are unavailable in WASI; use linear memory and capability-relative WASI imports")

    actual fun seek(fd: Int, offset: Long, whence: Int): Long =
        throw UnsupportedOperationException("Host C pointers and POSIX descriptor commands are unavailable in WASI; use linear memory and capability-relative WASI imports")

    actual fun numericNameinfoFlags(): Int = throw UnsupportedOperationException("WASI preview1 has no nameinfo facility")
    actual fun errno(): Int = WasiLibcEnv.getErrno()

    actual fun openFlags(): IntArray =
        throw UnsupportedOperationException("Host C pointers and POSIX descriptor commands are unavailable in WASI; use linear memory and capability-relative WASI imports")

    actual fun descriptorCommands(): IntArray? = null

    actual fun fcntlNoArgument(fd: Int, command: Int): Int =
        throw UnsupportedOperationException("Host C pointers and POSIX descriptor commands are unavailable in WASI; use linear memory and capability-relative WASI imports")

    actual fun fcntlInteger(fd: Int, command: Int, argument: Int): Int =
        throw UnsupportedOperationException("Host C pointers and POSIX descriptor commands are unavailable in WASI; use linear memory and capability-relative WASI imports")

    actual fun fcntlPointer(fd: Int, command: Int, address: Long): Int =
        throw UnsupportedOperationException("Host C pointers and POSIX descriptor commands are unavailable in WASI; use linear memory and capability-relative WASI imports")
}
