// port-lint: source unix/linux_like/linux/uclibc/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*

public data class TcpInfo(
    val tcpiState: UByte,
    val tcpiCaState: UByte,
    val tcpiRetransmits: UByte,
    val tcpiProbes: UByte,
    val tcpiBackoff: UByte,
    val tcpiOptions: UByte,
    val tcpiSndRcvWscale: UByte,
    val tcpiRto: UInt,
    val tcpiAto: UInt,
    val tcpiSndMss: UInt,
    val tcpiRcvMss: UInt,
    val tcpiUnacked: UInt,
    val tcpiSacked: UInt,
    val tcpiLost: UInt,
    val tcpiRetrans: UInt,
    val tcpiFackets: UInt,
    val tcpiLastDataSent: UInt,
    val tcpiLastAckSent: UInt,
    val tcpiLastDataRecv: UInt,
    val tcpiLastAckRecv: UInt,
    val tcpiPmtu: UInt,
    val tcpiRcvSsthresh: UInt,
    val tcpiRtt: UInt,
    val tcpiRttvar: UInt,
    val tcpiSndSsthresh: UInt,
    val tcpiSndCwnd: UInt,
    val tcpiAdvmss: UInt,
    val tcpiReordering: UInt,
    val tcpiRcvRtt: UInt,
    val tcpiRcvSpace: UInt,
    val tcpiTotalRetrans: UInt,
)
