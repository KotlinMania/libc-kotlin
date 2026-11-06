// port-lint: source new/glibc/sysdeps/unix/linux/net/route.rs
package io.github.kotlinmania.libc.new.glibc.sysdeps.unix.linux.net

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.Sockaddr

// Header: `net / route.h`
//
// Source header: `sysdeps / unix / sysv / linux / net / route.h`
// <https://github.com/bminor/glibc/blob/master/sysdeps/unix/sysv/linux/net/route.h>

public open class Rtentry(
    public var rtPad1: CUlong,
    public var rtDst: Sockaddr,
    public var rtGateway: Sockaddr,
    public var rtGenmask: Sockaddr,
    public var rtFlags: CUshort,
    public var rtPad2: CShort,
    public var rtPad3: CUlong,
    public var rtTos: CUchar,
    public var rtClass: CUchar,
    // Note(1.0): private padding fields
    public var rtPad4: List<CShort>,
    public var rtMetric: CShort,
    public var rtDev: COpaquePointer?,
    public var rtMtu: CUlong,
    public var rtWindow: CUlong,
    public var rtIrtt: CUshort,
)
