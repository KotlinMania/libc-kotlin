// port-lint: source Compat.rs
package io.github.kotlinmania.libc.unix.solarish
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Winsize

import io.github.kotlinmania.libc.*

public actual fun cfmakeraw(termios: Termios?): Unit = throw UnsupportedOperationException("cfmakeraw not available on JVM — no C library access")

public actual fun cfsetspeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetspeed not available on JVM — no C library access")

public actual fun openpty(amain: Int?, asubord: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty not available on JVM — no C library access")

public actual fun forkpty(amain: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty not available on JVM — no C library access")

public actual fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: Passwd?): Int =
    throw UnsupportedOperationException("getpwentR not available on JVM — no C library access")

public actual fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: Group?): Int =
    throw UnsupportedOperationException("getgrentR not available on JVM — no C library access")
