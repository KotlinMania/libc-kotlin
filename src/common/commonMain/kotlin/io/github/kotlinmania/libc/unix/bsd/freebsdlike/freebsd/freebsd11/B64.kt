// port-lint: source unix/bsd/freebsdlike/freebsd/freebsd11/b64.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.BlkcntT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.BlksizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.FflagsT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.TimeT

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var stSize: OffT,
    public var stBlocks: BlkcntT,
    public var stBlksize: BlksizeT,
    public var stFlags: FflagsT,
    public var stGen: UInt,
    public var stLspare: Int,
    public var stBirthtime: TimeT,
    public var stBirthtimeNsec: CLong,
)
