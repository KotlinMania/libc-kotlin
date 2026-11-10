// port-lint: source unix/bsd/freebsdlike/freebsd/freebsd11/b32.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.BlkcntT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.BlksizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.FflagsT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.InoT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.NlinkT

public class Stat(
    public var stDev: DevT = 0u,
    public var stIno: InoT = 0u,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0u,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var stSize: OffT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stBlksize: BlksizeT = 0,
    public var stFlags: FflagsT = 0u,
    public var stGen: UInt = 0u,
    public var stLspare: Int = 0,
    public var stBirthtime: TimeT = 0L,
    public var stBirthtimeNsec: CLong = 0L,
    public var unused: UByteArray = UByteArray(8),
)
