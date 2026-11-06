// port-lint: source unix/bsd/freebsdlike/freebsd/freebsd11/b64.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.BlkcntT
import io.github.kotlinmania.libc.BlksizeT
import io.github.kotlinmania.libc.DevT
import io.github.kotlinmania.libc.FflagsT
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.InoT
import io.github.kotlinmania.libc.ModeT
import io.github.kotlinmania.libc.NlinkT
import io.github.kotlinmania.libc.OffT
import io.github.kotlinmania.libc.TimeT
import io.github.kotlinmania.libc.UidT

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
