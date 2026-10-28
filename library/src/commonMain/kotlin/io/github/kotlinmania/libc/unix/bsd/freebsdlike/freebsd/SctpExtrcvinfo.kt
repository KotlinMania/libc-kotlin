package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpExtrcvinfo(
    val sinfoStream: UShort,
    val sinfoSsn: UShort,
    val sinfoFlags: UShort,
    val sinfoPpid: UInt,
    val sinfoContext: UInt,
    val sinfoTimetolive: UInt,
    val sinfoTsn: UInt,
    val sinfoCumtsn: UInt,
    val sinfoAssocId: UInt,
    val serinfoNextFlags: UShort,
    val serinfoNextStream: UShort,
    val serinfoNextAid: UInt,
    val serinfoNextLength: UInt,
    val serinfoNextPpid: UInt,
    val sinfoKeynumber: UShort,
    val sinfoKeynumberValid: UShort,
    val reservePad: List<UByteArray>,
)
