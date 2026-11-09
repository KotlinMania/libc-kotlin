package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.BlkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.InoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.StackT

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stNlink: NlinkT,
    public var stMode: ModeT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var pad0: CInt,
    public var stRdev: DevT,
    public var stSize: OffT,
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var unused: List<CLong>,
)

public open class UserRegsStruct(
    public var r15: CUlong,
    public var r14: CUlong,
    public var r13: CUlong,
    public var r12: CUlong,
    public var rbp: CUlong,
    public var rbx: CUlong,
    public var r11: CUlong,
    public var r10: CUlong,
    public var r9: CUlong,
    public var r8: CUlong,
    public var rax: CUlong,
    public var rcx: CUlong,
    public var rdx: CUlong,
    public var rsi: CUlong,
    public var rdi: CUlong,
    public var origRax: CUlong,
    public var rip: CUlong,
    public var cs: CUlong,
    public var eflags: CUlong,
    public var rsp: CUlong,
    public var ss: CUlong,
    public var fsBase: CUlong,
    public var gsBase: CUlong,
    public var ds: CUlong,
    public var es: CUlong,
    public var fs: CUlong,
    public var gs: CUlong,
)

public open class User(
    public var regs: UserRegsStruct,
    public var uFpvalid: CInt,
    public var i387: UserFpregsStruct,
    public var uTsize: CUlong,
    public var uDsize: CUlong,
    public var uSsize: CUlong,
    public var startCode: CUlong,
    public var startStack: CUlong,
    public var signal: CLong,
    public var reserved: CInt,
    public var uAr0: UserRegsStruct?,
    public var uFpstate: UserFpregsStruct?,
    public var magic: CUlong,
    public var uComm: List<CChar>,
    public var uDebugreg: List<CUlong>,
)

// GitHub repo: ifduyue/musl/
// commit: b4b1e10364c8737a632be61582e05a8d3acf5690
// file: arch/x8664/bits/signal.h#L80-L84
public open class McontextT(public var gregs: List<GregT>, public var private: List<ULong>)

public open class IpcPerm(
    public var key: KeyT,
    public var ipcPermKey: KeyT,
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: ModeT,
    public var seq: CInt,
    public var unused1: CLong,
    public var unused2: CLong,
)

public open class CloneArgs(
    public var flags: CUlonglong,
    public var pidfd: CUlonglong,
    public var childTid: CUlonglong,
    public var parentTid: CUlonglong,
    public var exitSignal: CUlonglong,
    public var stack: CUlonglong,
    public var stackSize: CUlonglong,
    public var tls: CUlonglong,
    public var setTid: CUlonglong,
    public var setTidSize: CUlonglong,
    public var cgroup: CUlonglong,
)

public open class UserFpregsStruct(
    public var cwd: CUshort,
    public var swd: CUshort,
    public var ftw: CUshort,
    public var fop: CUshort,
    public var rip: CUlong,
    public var rdp: CUlong,
    public var mxcsr: CUint,
    public var mxcrMask: CUint,
    public var stSpace: List<CUint>,
    public var xmmSpace: List<CUint>,
    public var padding: List<CUint>,
)

public open class UcontextT(
    public var ucFlags: CUlong,
    public var ucLink: UcontextT?,
    public var ucStack: StackT,
    public var ucMcontext: McontextT,
    public var ucSigmask: SigsetT,
    public var private: List<UByte>,
)

public open class MaxAlignT(public var priv: List<Double>)
