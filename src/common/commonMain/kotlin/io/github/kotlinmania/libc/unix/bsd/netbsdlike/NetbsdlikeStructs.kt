package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.CcT
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.SigsetT

public open class SchedParam(public var schedPriority: CInt)

public open class Sigaction(
    public var saSigaction: SighandlerT,
    public var saMask: SigsetT,
    public var saFlags: CInt,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
)

public open class In6Pktinfo(public var ipi6Addr: In6Addr, public var ipi6Ifindex: CUint)

public open class Termios(
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cCc: List<CcT>,
    public var cIspeed: CInt,
    public var cOspeed: CInt,
)

public open class Flock(
    public var lStart: OffT,
    public var lLen: OffT,
    public var lPid: PidT,
    public var lType: CShort,
    public var lWhence: CShort,
)

public open class PtraceIoDesc(
    public var piodOp: CInt,
    public var piodOffs: COpaquePointer?,
    public var piodAddr: COpaquePointer?,
    public var piodLen: SizeT,
)

public open class Mmsghdr(public var msgHdr: Msghdr, public var msgLen: CUint)
