package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.Group

internal expect fun solarishCfsetispeed(termios: Termios?, speed: UInt): Int

internal expect fun solarishCfsetospeed(termios: Termios?, speed: UInt): Int

internal expect fun solarishTcsetattr(fd: Int, optionalActions: Int, termios: Termios?): Int

internal expect fun solarishGetErrno(): Int

internal expect fun solarishSetErrno(value: Int)

internal expect fun solarishNativeGetpwentR(
    pwd: Passwd?,
    buf: String?,
    buflen: Int,
    result: COpaquePointer?,
): Passwd?

internal expect fun solarishNativeGetgrentR(
    grp: Group?,
    buf: String?,
    buflen: Int,
    result: COpaquePointer?,
): Group?
