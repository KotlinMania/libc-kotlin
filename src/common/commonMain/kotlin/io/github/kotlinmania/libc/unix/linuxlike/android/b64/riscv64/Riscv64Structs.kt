package io.github.kotlinmania.libc.unix.linuxlike.android.b64.riscv64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.android.DevT
import io.github.kotlinmania.libc.unix.linuxlike.android.InoT
import io.github.kotlinmania.libc.unix.linuxlike.android.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: CUint,
    public var stNlink: CUint,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var pad1: CUlong,
    public var stSize: Off64T,
    public var stBlksize: CInt,
    public var pad2: CInt,
    public var stBlocks: CLong,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var unused4: CUint,
    public var unused5: CUint,
)

public open class Stat64(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: CUint,
    public var stNlink: CUint,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var pad1: CUlong,
    public var stSize: Off64T,
    public var stBlksize: CInt,
    public var pad2: CInt,
    public var stBlocks: CLong,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var unused4: CUint,
    public var unused5: CUint,
)

public open class MaxAlignT(public var priv: List<Float>)
