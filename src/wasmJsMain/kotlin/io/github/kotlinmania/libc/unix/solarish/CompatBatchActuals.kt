// port-lint: source Compat.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public actual fun cfmakeraw(termios: Termios?): Unit = throw UnsupportedOperationException("cfmakeraw requires N-API addon")

public actual fun cfsetspeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetspeed requires N-API addon")

public actual fun openpty(amain: Int?, asubord: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty requires N-API addon")

public actual fun forkpty(amain: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty requires N-API addon")

public actual fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: Passwd?): Int =
    throw UnsupportedOperationException("getpwentR requires N-API addon")

public actual fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: Group?): Int =
    throw UnsupportedOperationException("getgrentR requires N-API addon")
