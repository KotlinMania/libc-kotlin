// port-lint: source Compat.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun cfmakeraw(termios: Termios?) {
    throw UnsupportedOperationException("cfmakeraw requires manual FFI bridge — not yet implemented")
}

public actual fun cfsetspeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetspeed requires manual FFI bridge — not yet implemented")

public actual fun openpty( amain: CInt?, asubord: CInt?, name: String?, termp: Termios?, winp: Winsize?, ): CInt =
    throw UnsupportedOperationException("openpty requires manual FFI bridge — not yet implemented")

public actual fun forkpty( amain: CInt?, name: String?, termp: Termios?, winp: Winsize?, ): PidT =
    throw UnsupportedOperationException("forkpty requires manual FFI bridge — not yet implemented")

public actual fun getpwentR( pwd: Passwd?, buf: String?, buflen: ULong, result: Passwd?, ): CInt =
    throw UnsupportedOperationException("getpwentR requires manual FFI bridge — not yet implemented")

public actual fun getgrentR( grp: Group?, buf: String?, buflen: ULong, result: Group?, ): CInt =
    throw UnsupportedOperationException("getgrentR requires manual FFI bridge — not yet implemented")
