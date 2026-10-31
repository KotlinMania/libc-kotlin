package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.Group

internal actual fun solarishCfsetispeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("solarishCfsetispeed not available on WASI — no C library access")

internal actual fun solarishCfsetospeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("solarishCfsetospeed not available on WASI — no C library access")

internal actual fun solarishTcsetattr(fd: Int, optionalActions: Int, termios: Termios?): Int =
    throw UnsupportedOperationException("solarishTcsetattr not available on WASI — no C library access")

internal actual fun solarishGetErrno(): Int =
    throw UnsupportedOperationException("solarishGetErrno not available on WASI — no C library access")

internal actual fun solarishSetErrno(value: Int): Unit =
    throw UnsupportedOperationException("solarishSetErrno not available on WASI — no C library access")

internal actual fun solarishNativeGetpwentR(
    pwd: Passwd?,
    buf: String?,
    buflen: Int,
    result: COpaquePointer?,
): Passwd? =
    throw UnsupportedOperationException("solarishNativeGetpwentR not available on WASI — no C library access")

internal actual fun solarishNativeGetgrentR(
    grp: Group?,
    buf: String?,
    buflen: Int,
    result: COpaquePointer?,
): Group? =
    throw UnsupportedOperationException("solarishNativeGetgrentR not available on WASI — no C library access")
