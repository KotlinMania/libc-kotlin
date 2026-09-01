// port-lint: source unix/solarish/compat.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

/**
 * Functions missing on illumos / Solaris but often needed by other crates.
 *
 * The upstream bodies manipulate raw `termios`/`winsize` pointers and call
 * other libc entry points directly; that pointer work lives in the native
 * actual, so these are declared here as expects.
 */

public fun cfmakeraw(termios: Termios?) { }

public fun cfsetspeed(termios: Termios?, speed: SpeedT): CInt = -1

public fun openpty(
    amain: CInt?,
    asubord: CInt?,
    name: String?,
    termp: Termios?,
    winp: Winsize?,
): CInt = -1

public fun forkpty(
    amain: CInt?,
    name: String?,
    termp: Termios?,
    winp: Winsize?,
): PidT = -1

public fun getpwentR(
    pwd: Passwd?,
    buf: String?,
    buflen: ULong,
    result: Passwd?,
): CInt = -1

public fun getgrentR(
    grp: Group?,
    buf: String?,
    buflen: ULong,
    result: Group?,
): CInt = -1
