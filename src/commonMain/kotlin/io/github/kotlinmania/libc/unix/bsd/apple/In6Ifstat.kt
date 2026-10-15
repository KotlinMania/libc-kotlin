// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class In6Ifstat(
    val ifs6InReceive: ULong,
    val ifs6InHdrerr: ULong,
    val ifs6InToobig: ULong,
    val ifs6InNoroute: ULong,
    val ifs6InAddrerr: ULong,
    val ifs6InProtounknown: ULong,
    val ifs6InTruncated: ULong,
    val ifs6InDiscard: ULong,
    val ifs6InDeliver: ULong,
    val ifs6OutForward: ULong,
    val ifs6OutRequest: ULong,
    val ifs6OutDiscard: ULong,
    val ifs6OutFragok: ULong,
    val ifs6OutFragfail: ULong,
    val ifs6OutFragcreat: ULong,
    val ifs6ReassReqd: ULong,
    val ifs6ReassOk: ULong,
    val ifs6AtmfragRcvd: ULong,
    val ifs6ReassFail: ULong,
    val ifs6InMcast: ULong,
    val ifs6OutMcast: ULong,
    val ifs6CantfowardIcmp6: ULong,
    val ifs6AddrExpiryCnt: ULong,
    val ifs6PfxExpiryCnt: ULong,
    val ifs6DefrtrExpiryCnt: ULong,
)
