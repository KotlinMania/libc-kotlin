package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

public data class Rtentry(
    val rtPad1: ULong,
    val rtDst: Sockaddr,
    val rtGateway: Sockaddr,
    val rtGenmask: Sockaddr,
    val rtFlags: UShort,
    val rtPad2: Short,
    val rtPad3: ULong,
    val rtTos: UByte,
    val rtClass: UByte,
    val rtPad4: ShortArray,
    val rtPad42: Short,
    val rtMetric: Short,
    val rtDev: String?,
    val rtMtu: ULong,
    val rtWindow: ULong,
    val rtIrtt: UShort,
)
