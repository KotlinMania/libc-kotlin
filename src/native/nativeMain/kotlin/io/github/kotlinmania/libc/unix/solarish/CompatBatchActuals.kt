@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.Group

internal actual fun solarishCfsetispeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("solarishCfsetispeed requires Solaris/illumos libc — not available on host")

internal actual fun solarishCfsetospeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("solarishCfsetospeed requires Solaris/illumos libc — not available on host")

internal actual fun solarishTcsetattr(fd: Int, optionalActions: Int, termios: Termios?): Int =
    throw UnsupportedOperationException("solarishTcsetattr requires Solaris/illumos libc — not available on host")

internal actual fun solarishGetErrno(): Int = libc.cinterop.libc_get_errno()

internal actual fun solarishSetErrno(value: Int) {
    libc.cinterop.libc_set_errno(value)
}

internal actual fun solarishNativeGetpwentR(
    pwd: Passwd?,
    buf: String?,
    buflen: Int,
    result: COpaquePointer?,
): Passwd? =
    throw UnsupportedOperationException("native_getpwent_r requires Solaris/illumos libc — not available on host")

internal actual fun solarishNativeGetgrentR(
    grp: Group?,
    buf: String?,
    buflen: Int,
    result: COpaquePointer?,
): Group? =
    throw UnsupportedOperationException("native_getgrent_r requires Solaris/illumos libc — not available on host")
