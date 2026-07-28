// port-lint: source unix/bsd/freebsdlike/freebsd/freebsd11/b32.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
    val stSize: OffT,
    val stBlocks: BlkcntT,
    val stBlksize: BlksizeT,
    val stFlags: FflagsT,
    val stGen: UInt,
    val stLspare: Int,
    val stBirthtime: TimeT,
    val stBirthtimeNsec: CLong,
)
