// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class KinfoVmentry(
    val kveStructsize: Int,
    val kveType: Int,
    val kveStart: ULong,
    val kveEnd: ULong,
    val kveOffset: ULong,
    val kveVnFileid: ULong,
    val kveVnFsidFreebsd11: UInt,
    val kveVnFsid: UInt,
    val kveFlags: Int,
    val kveResident: Int,
    val kvePrivateResident: Int,
    val kveProtection: Int,
    val kveRefCount: Int,
    val kveShadowCount: Int,
    val kveVnType: Int,
    val kveVnSize: ULong,
    val kveVnRdevFreebsd11: UInt,
    val kveVnRdev: UInt,
    val kveVnMode: UShort,
    val kveStatus: UShort,
    val kveVnFsid2: ULong,
    val kveVnRdev2: ULong,
    val kveIsSpare: IntArray,
    val kveIsSpare2: IntArray,
    val kvePath: List<ByteArray>,
)
