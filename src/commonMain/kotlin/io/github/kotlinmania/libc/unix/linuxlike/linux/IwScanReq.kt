package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

public data class IwScanReq(
    val scanType: UByte,
    val essidLen: UByte,
    val numChannels: UByte,
    val flags: UByte,
    val bssid: Sockaddr,
    val essid: List<UByte>,
    val minChannelTime: UInt,
    val maxChannelTime: UInt,
    val channelList: List<IwFreq>,
)
