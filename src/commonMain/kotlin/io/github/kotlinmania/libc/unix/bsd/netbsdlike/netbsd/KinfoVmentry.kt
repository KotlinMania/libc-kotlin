package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class KinfoVmentry(
    val kveStart: ULong,
    val kveEnd: ULong,
    val kveOffset: ULong,
    val kveType: UInt,
    val kveFlags: UInt,
    val kveCount: UInt,
    val kveWiredCount: UInt,
    val kveAdvice: UInt,
    val kveAttributes: UInt,
    val kveProtection: UInt,
    val kveMaxProtection: UInt,
    val kveRefCount: UInt,
    val kveInheritance: UInt,
    val kveVnFileid: ULong,
    val kveVnSize: ULong,
    val kveVnFsid: ULong,
    val kveVnRdev: ULong,
    val kveVnType: UInt,
    val kveVnMode: UInt,
    val kvePath: ByteArray,
)
