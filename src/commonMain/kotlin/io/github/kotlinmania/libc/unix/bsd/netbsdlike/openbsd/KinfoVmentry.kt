// port-lint: source unix/bsd/netbsdlike/openbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class KinfoVmentry(
    val kveStart: ULong,
    val kveEnd: ULong,
    val kveGuard: ULong,
    val kveFspace: ULong,
    val kveFspaceAugment: ULong,
    val kveOffset: ULong,
    val kveWiredCount: Int,
    val kveEtype: Int,
    val kveProtection: Int,
    val kveMaxProtection: Int,
    val kveAdvice: Int,
    val kveInheritance: Int,
    val kveFlags: UByte,
)
