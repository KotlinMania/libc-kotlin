// port-lint: source new/glibc/sysdeps/unix/linux/net/route.rs
package io.github.kotlinmania.libc.new.glibc.sysdeps.unix.linux.net

import io.github.kotlinmania.libc.*

public data class Rtentry(
    val rtPad1: CULong,
    val rtDst: Sockaddr,
    val rtGateway: Sockaddr,
    val rtGenmask: Sockaddr,
    val rtFlags: CUShort,
    val rtPad2: CShort,
    val rtPad3: CULong,
    val rtTos: CUChar,
    val rtClass: CUChar,
    val rtPad4: ShortArray,
    val rtPad42: CShort,
    val rtMetric: CShort,
    val rtDev: String?,
    val rtMtu: CULong,
    val rtWindow: CULong,
    val rtIrtt: CUShort,
)
