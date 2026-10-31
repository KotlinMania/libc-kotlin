package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.Group

internal actual fun solarishCfsetispeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("solarishCfsetispeed requires N-API addon")

internal actual fun solarishCfsetospeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("solarishCfsetospeed requires N-API addon")

internal actual fun solarishTcsetattr(fd: Int, optionalActions: Int, termios: Termios?): Int =
    throw UnsupportedOperationException("solarishTcsetattr requires N-API addon")

internal actual fun solarishGetErrno(): Int =
    throw UnsupportedOperationException("solarishGetErrno requires N-API addon")

internal actual fun solarishSetErrno(value: Int): Unit =
    throw UnsupportedOperationException("solarishSetErrno requires N-API addon")

internal actual fun solarishNativeGetpwentR(
    pwd: Passwd?,
    buf: String?,
    buflen: Int,
    result: COpaquePointer?,
): Passwd? =
    throw UnsupportedOperationException("solarishNativeGetpwentR requires N-API addon")

internal actual fun solarishNativeGetgrentR(
    grp: Group?,
    buf: String?,
    buflen: Int,
    result: COpaquePointer?,
): Group? =
    throw UnsupportedOperationException("solarishNativeGetgrentR requires N-API addon")
