// port-lint: source Compat.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public actual fun cfmakeraw(termios: Termios?) {
    throw UnsupportedOperationException("cfmakeraw requires N-API addon")
}

public actual fun cfsetspeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetspeed requires N-API addon")

public actual fun openpty( amain: CInt?, asubord: CInt?, name: String?, termp: Termios?, winp: Winsize?, ): CInt =
    throw UnsupportedOperationException("openpty requires N-API addon")

public actual fun forkpty( amain: CInt?, name: String?, termp: Termios?, winp: Winsize?, ): PidT =
    throw UnsupportedOperationException("forkpty requires N-API addon")

public actual fun getpwentR( pwd: Passwd?, buf: String?, buflen: ULong, result: Passwd?, ): CInt =
    throw UnsupportedOperationException("getpwentR requires N-API addon")

public actual fun getgrentR( grp: Group?, buf: String?, buflen: ULong, result: Group?, ): CInt =
    throw UnsupportedOperationException("getgrentR requires N-API addon")

