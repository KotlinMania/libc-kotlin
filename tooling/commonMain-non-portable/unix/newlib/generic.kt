// port-lint: source unix/newlib/generic.rs
package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.BlkcntT
import io.github.kotlinmania.libc.BlksizeT
import io.github.kotlinmania.libc.DevT
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.InoT
import io.github.kotlinmania.libc.ModeT
import io.github.kotlinmania.libc.NlinkT
import io.github.kotlinmania.libc.OffT
import io.github.kotlinmania.libc.TimeT
import io.github.kotlinmania.libc.UidT

// Common types used by most newlib platforms

public open class SigsetT(public var value: UInt)

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var stSize: OffT,
    public var stAtime: TimeT,
    public var stSpare1: CLong,
    public var stMtime: TimeT,
    public var stSpare2: CLong,
    public var stCtime: TimeT,
    public var stSpare3: CLong,
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stSpare4: List<CLong>,
)

public open class Dirent(
    public var dIno: InoT,
    public var dType: CUchar,
    public var dName: List<CChar>,
)
