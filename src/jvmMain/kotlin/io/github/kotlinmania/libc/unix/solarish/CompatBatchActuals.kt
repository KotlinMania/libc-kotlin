// port-lint: source Compat.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public actual fun cfmakeraw(termios: Termios?) {
    throw UnsupportedOperationException("cfmakeraw not available on JVM — no C library access")
}

public actual fun cfsetspeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetspeed not available on JVM — no C library access")

public actual fun openpty( amain: CInt?, asubord: CInt?, name: String?, termp: Termios?, winp: Winsize?, ): CInt =
    throw UnsupportedOperationException("openpty not available on JVM — no C library access")

public actual fun forkpty( amain: CInt?, name: String?, termp: Termios?, winp: Winsize?, ): PidT =
    throw UnsupportedOperationException("forkpty not available on JVM — no C library access")

public actual fun getpwentR( pwd: Passwd?, buf: String?, buflen: ULong, result: Passwd?, ): CInt =
    throw UnsupportedOperationException("getpwentR not available on JVM — no C library access")

public actual fun getgrentR( grp: Group?, buf: String?, buflen: ULong, result: Group?, ): CInt =
    throw UnsupportedOperationException("getgrentR not available on JVM — no C library access")

