package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class KinfoLwp(
    val klPid: Int,
    val klTid: Int,
    val klFlags: Int,
    val klStat: Lwpstat,
    val klLock: Int,
    val klTdflags: Int,
    val klMpcount: Int,
    val klPrio: Int,
    val klTdprio: Int,
    val klRtprio: Rtprio,
    val klUticks: ULong,
    val klSticks: ULong,
    val klIticks: ULong,
    val klCpticks: ULong,
    val klPctcpu: UInt,
    val klSlptime: UInt,
    val klOrigcpu: Int,
    val klEstcpu: Int,
    val klCpuid: Int,
    val klRu: Rusage,
    val klSiglist: ULong,
    val klSigmask: ULong,
    val klWchan: ULong,
    val klWmesg: ByteArray,
    val klComm: ByteArray,
)
