@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.ClockT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.RlimT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.SusecondsT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public class Group internal constructor(
    grNameCtorArg: MutPtr<CChar>,
    grPasswdCtorArg: MutPtr<CChar>,
    public var grGid: GidT,
    grMemCtorArg: MutPtr<MutPtr<CChar>>,
) {
    public var grName: MutPtr<CChar> = grNameCtorArg
        internal set

    public var grPasswd: MutPtr<CChar> = grPasswdCtorArg
        internal set

    public var grMem: MutPtr<MutPtr<CChar>> = grMemCtorArg
        internal set

    public constructor() : this(
        grNameCtorArg = MutPtr(0L),
        grPasswdCtorArg = MutPtr(0L),
        grGid = 0u,
        grMemCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CChar> = this.grName

    public operator fun component2(): MutPtr<CChar> = this.grPasswd

    public operator fun component3(): GidT = this.grGid

    public operator fun component4(): MutPtr<MutPtr<CChar>> = this.grMem

    public fun copy(grName: MutPtr<CChar> = this.grName, grPasswd: MutPtr<CChar> = this.grPasswd, grGid: GidT = this.grGid, grMem: MutPtr<MutPtr<CChar>> = this.grMem): Group = Group(grNameCtorArg = grName, grPasswdCtorArg = grPasswd, grGid = grGid, grMemCtorArg = grMem)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Group) return false
        if (this.grName != other.grName) return false
        if (this.grPasswd != other.grPasswd) return false
        if (this.grGid != other.grGid) return false
        if (this.grMem != other.grMem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.grName.hashCode()
        result = 31 * result + this.grPasswd.hashCode()
        result = 31 * result + this.grGid.hashCode()
        result = 31 * result + this.grMem.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Group> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Group> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Group =
                    Group(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CChar>>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Group) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.grName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 8L, value.grPasswd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.grGid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CChar>>(64)
                    ).writeNative(addr + 24L, value.grMem)
                }
            }

        public operator fun invoke(
            grName: MutPtr<CChar> = MutPtr(0L),
            grPasswd: MutPtr<CChar> = MutPtr(0L),
            grGid: GidT = 0u,
            grMem: MutPtr<MutPtr<CChar>> = MutPtr(0L),
        ): Group =
            Group(
                grNameCtorArg = grName,
                grPasswdCtorArg = grPasswd,
                grGid = grGid,
                grMemCtorArg = grMem,
            )
    }
}

public data class Utimbuf(
    public var actime: TimeT = 0L,
    public var modtime: TimeT = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Utimbuf> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Utimbuf> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Utimbuf =
                    Utimbuf(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Utimbuf) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.actime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.modtime)
                }
            }
    }
}

public data class Timeval(
    public var tvSec: TimeT = 0L,
    public var tvUsec: SusecondsT = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timeval> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timeval> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Timeval =
                    Timeval(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Timeval) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.tvSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.tvUsec)
                }
            }
    }
}

public data class Timespec(
    public var tvSec: TimeT = 0L,
    public var tvNsec: CLong = 0L,
    public var pad0: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timespec> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timespec> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Timespec =
                    Timespec(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Timespec) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.tvSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.tvNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.pad0)
                }
            }
    }
}

public data class Rlimit(
    public var rlimCur: RlimT = 0uL,
    public var rlimMax: RlimT = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rlimit> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rlimit> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Rlimit =
                    Rlimit(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Rlimit) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.rlimCur)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rlimMax)
                }
            }
    }
}

public class Rusage(
    public var ruUtime: Timeval = Timeval(),
    public var ruStime: Timeval = Timeval(),
    public var ruMaxrss: CLong = 0L,
    public var ruIxrss: CLong = 0L,
    public var ruIdrss: CLong = 0L,
    public var ruIsrss: CLong = 0L,
    public var ruMinflt: CLong = 0L,
    public var ruMajflt: CLong = 0L,
    public var ruNswap: CLong = 0L,
    public var ruInblock: CLong = 0L,
    public var ruOublock: CLong = 0L,
    public var ruMsgsnd: CLong = 0L,
    public var ruMsgrcv: CLong = 0L,
    public var ruNsignals: CLong = 0L,
    public var ruNvcsw: CLong = 0L,
    public var ruNivcsw: CLong = 0L,
    public var reserved: LongArray = LongArray(16),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rusage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rusage> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 272L
                override fun readNative(addr: Long): Rusage =
                    Rusage(
                        (Timeval.typeLayout()).readNative(addr),
                        (Timeval.typeLayout()).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 136L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (16).toInt())
                        ).readNative(addr + 144L).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: Rusage) {
                    (Timeval.typeLayout()).writeNative(addr, value.ruUtime)
                    (Timeval.typeLayout()).writeNative(addr + 16L, value.ruStime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.ruMaxrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.ruIxrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.ruIdrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.ruIsrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.ruMinflt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.ruMajflt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.ruNswap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.ruInblock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.ruOublock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 104L, value.ruMsgsnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.ruMsgrcv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 120L, value.ruNsignals)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 128L, value.ruNvcsw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 136L, value.ruNivcsw)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (16).toInt())
                    ).writeNative(addr + 144L, value.reserved.toList())
                }
            }
    }
}

public data class Ipv6Mreq(
    public var ipv6mrMultiaddr: In6Addr = In6Addr(),
    public var ipv6mrInterface: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6Mreq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6Mreq> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Ipv6Mreq =
                    Ipv6Mreq(
                        (In6Addr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Ipv6Mreq) {
                    (In6Addr.typeLayout()).writeNative(addr, value.ipv6mrMultiaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.ipv6mrInterface)
                }
            }
    }
}

public class Hostent internal constructor(
    hNameCtorArg: MutPtr<CChar>,
    hAliasesCtorArg: MutPtr<MutPtr<CChar>>,
    public var hAddrtype: CInt,
    public var hLength: CInt,
    hAddrListCtorArg: MutPtr<MutPtr<CChar>>,
) {
    public var hName: MutPtr<CChar> = hNameCtorArg
        internal set

    public var hAliases: MutPtr<MutPtr<CChar>> = hAliasesCtorArg
        internal set

    public var hAddrList: MutPtr<MutPtr<CChar>> = hAddrListCtorArg
        internal set

    public constructor() : this(
        hNameCtorArg = MutPtr(0L),
        hAliasesCtorArg = MutPtr(0L),
        hAddrtype = 0,
        hLength = 0,
        hAddrListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CChar> = this.hName

    public operator fun component2(): MutPtr<MutPtr<CChar>> = this.hAliases

    public operator fun component3(): CInt = this.hAddrtype

    public operator fun component4(): CInt = this.hLength

    public operator fun component5(): MutPtr<MutPtr<CChar>> = this.hAddrList

    public fun copy(hName: MutPtr<CChar> = this.hName, hAliases: MutPtr<MutPtr<CChar>> = this.hAliases, hAddrtype: CInt = this.hAddrtype, hLength: CInt = this.hLength, hAddrList: MutPtr<MutPtr<CChar>> = this.hAddrList): Hostent = Hostent(hNameCtorArg = hName, hAliasesCtorArg = hAliases, hAddrtype = hAddrtype, hLength = hLength, hAddrListCtorArg = hAddrList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Hostent) return false
        if (this.hName != other.hName) return false
        if (this.hAliases != other.hAliases) return false
        if (this.hAddrtype != other.hAddrtype) return false
        if (this.hLength != other.hLength) return false
        if (this.hAddrList != other.hAddrList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hName.hashCode()
        result = 31 * result + this.hAliases.hashCode()
        result = 31 * result + this.hAddrtype.hashCode()
        result = 31 * result + this.hLength.hashCode()
        result = 31 * result + this.hAddrList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Hostent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Hostent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Hostent =
                    Hostent(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CChar>>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CChar>>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Hostent) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.hName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CChar>>(64)
                    ).writeNative(addr + 8L, value.hAliases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.hAddrtype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.hLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CChar>>(64)
                    ).writeNative(addr + 24L, value.hAddrList)
                }
            }

        public operator fun invoke(
            hName: MutPtr<CChar> = MutPtr(0L),
            hAliases: MutPtr<MutPtr<CChar>> = MutPtr(0L),
            hAddrtype: CInt = 0,
            hLength: CInt = 0,
            hAddrList: MutPtr<MutPtr<CChar>> = MutPtr(0L),
        ): Hostent =
            Hostent(
                hNameCtorArg = hName,
                hAliasesCtorArg = hAliases,
                hAddrtype = hAddrtype,
                hLength = hLength,
                hAddrListCtorArg = hAddrList,
            )
    }
}

public class Iovec internal constructor(
    iovBaseCtorArg: MutPtr<CVoid>,
    public var iovLen: SizeT,
) {
    public var iovBase: MutPtr<CVoid> = iovBaseCtorArg
        internal set

    public constructor() : this(
        iovBaseCtorArg = MutPtr(0L),
        iovLen = 0uL,
    )

    public operator fun component1(): MutPtr<CVoid> = this.iovBase

    public operator fun component2(): SizeT = this.iovLen

    public fun copy(iovBase: MutPtr<CVoid> = this.iovBase, iovLen: SizeT = this.iovLen): Iovec = Iovec(iovBaseCtorArg = iovBase, iovLen = iovLen)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Iovec) return false
        if (this.iovBase != other.iovBase) return false
        if (this.iovLen != other.iovLen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iovBase.hashCode()
        result = 31 * result + this.iovLen.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Iovec> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Iovec> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Iovec =
                    Iovec(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Iovec) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.iovBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.iovLen)
                }
            }

        public operator fun invoke(
            iovBase: MutPtr<CVoid> = MutPtr(0L),
            iovLen: SizeT = 0uL,
        ): Iovec =
            Iovec(
                iovBaseCtorArg = iovBase,
                iovLen = iovLen,
            )
    }
}

public data class Pollfd(
    public var fd: CInt = 0,
    public var events: CShort = 0,
    public var revents: CShort = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pollfd> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pollfd> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Pollfd =
                    Pollfd(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Pollfd) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.events)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.revents)
                }
            }
    }
}

public data class Winsize(
    public var wsRow: CUshort = 0u,
    public var wsCol: CUshort = 0u,
    public var wsXpixel: CUshort = 0u,
    public var wsYpixel: CUshort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Winsize> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Winsize> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Winsize =
                    Winsize(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Winsize) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wsRow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wsCol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wsXpixel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wsYpixel)
                }
            }
    }
}

public data class Linger(
    public var lOnoff: CInt = 0,
    public var lLinger: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linger> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linger> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Linger =
                    Linger(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Linger) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lOnoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lLinger)
                }
            }
    }
}

public class Sigval internal constructor(
    sivalPtrCtorArg: MutPtr<CVoid>,
) {
    // Actually a union of an int and a void*
    public var sivalPtr: MutPtr<CVoid> = sivalPtrCtorArg
        internal set

    public constructor() : this(
        sivalPtrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.sivalPtr

    public fun copy(sivalPtr: MutPtr<CVoid> = this.sivalPtr): Sigval = Sigval(sivalPtrCtorArg = sivalPtr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigval) return false
        if (this.sivalPtr != other.sivalPtr) return false
        return true
    }

    override fun hashCode(): Int = this.sivalPtr.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sigval> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sigval> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Sigval =
                    Sigval(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Sigval) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.sivalPtr)
                }
            }

        public operator fun invoke(
            sivalPtr: MutPtr<CVoid> = MutPtr(0L),
        ): Sigval =
            Sigval(
                sivalPtrCtorArg = sivalPtr,
            )
    }
}

// <sys/time.h>
public data class Itimerval(
    public var itInterval: Timeval = Timeval(),
    public var itValue: Timeval = Timeval(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Itimerval> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Itimerval> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Itimerval =
                    Itimerval(
                        (Timeval.typeLayout()).readNative(addr),
                        (Timeval.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Itimerval) {
                    (Timeval.typeLayout()).writeNative(addr, value.itInterval)
                    (Timeval.typeLayout()).writeNative(addr + 16L, value.itValue)
                }
            }
    }
}

// <sys/times.h>
public data class Tms(
    public var tmsUtime: ClockT = 0,
    public var tmsStime: ClockT = 0,
    public var tmsCutime: ClockT = 0,
    public var tmsCstime: ClockT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tms> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Tms =
                    Tms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Tms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.tmsUtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.tmsStime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.tmsCutime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.tmsCstime)
                }
            }
    }
}

public class Servent internal constructor(
    sNameCtorArg: MutPtr<CChar>,
    sAliasesCtorArg: MutPtr<MutPtr<CChar>>,
    public var sPort: CShort,
    sProtoCtorArg: MutPtr<CChar>,
) {
    public var sName: MutPtr<CChar> = sNameCtorArg
        internal set

    public var sAliases: MutPtr<MutPtr<CChar>> = sAliasesCtorArg
        internal set

    public var sProto: MutPtr<CChar> = sProtoCtorArg
        internal set

    public constructor() : this(
        sNameCtorArg = MutPtr(0L),
        sAliasesCtorArg = MutPtr(0L),
        sPort = 0,
        sProtoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CChar> = this.sName

    public operator fun component2(): MutPtr<MutPtr<CChar>> = this.sAliases

    public operator fun component3(): CShort = this.sPort

    public operator fun component4(): MutPtr<CChar> = this.sProto

    public fun copy(sName: MutPtr<CChar> = this.sName, sAliases: MutPtr<MutPtr<CChar>> = this.sAliases, sPort: CShort = this.sPort, sProto: MutPtr<CChar> = this.sProto): Servent = Servent(sNameCtorArg = sName, sAliasesCtorArg = sAliases, sPort = sPort, sProtoCtorArg = sProto)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Servent) return false
        if (this.sName != other.sName) return false
        if (this.sAliases != other.sAliases) return false
        if (this.sPort != other.sPort) return false
        if (this.sProto != other.sProto) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sName.hashCode()
        result = 31 * result + this.sAliases.hashCode()
        result = 31 * result + this.sPort.hashCode()
        result = 31 * result + this.sProto.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Servent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Servent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Servent =
                    Servent(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CChar>>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Servent) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.sName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CChar>>(64)
                    ).writeNative(addr + 8L, value.sAliases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 16L, value.sPort)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 24L, value.sProto)
                }
            }

        public operator fun invoke(
            sName: MutPtr<CChar> = MutPtr(0L),
            sAliases: MutPtr<MutPtr<CChar>> = MutPtr(0L),
            sPort: CShort = 0,
            sProto: MutPtr<CChar> = MutPtr(0L),
        ): Servent =
            Servent(
                sNameCtorArg = sName,
                sAliasesCtorArg = sAliases,
                sPort = sPort,
                sProtoCtorArg = sProto,
            )
    }
}

public class Protoent internal constructor(
    pNameCtorArg: MutPtr<CChar>,
    pAliasesCtorArg: MutPtr<MutPtr<CChar>>,
    public var pProto: CInt,
) {
    public var pName: MutPtr<CChar> = pNameCtorArg
        internal set

    public var pAliases: MutPtr<MutPtr<CChar>> = pAliasesCtorArg
        internal set

    public constructor() : this(
        pNameCtorArg = MutPtr(0L),
        pAliasesCtorArg = MutPtr(0L),
        pProto = 0,
    )

    public operator fun component1(): MutPtr<CChar> = this.pName

    public operator fun component2(): MutPtr<MutPtr<CChar>> = this.pAliases

    public operator fun component3(): CInt = this.pProto

    public fun copy(pName: MutPtr<CChar> = this.pName, pAliases: MutPtr<MutPtr<CChar>> = this.pAliases, pProto: CInt = this.pProto): Protoent = Protoent(pNameCtorArg = pName, pAliasesCtorArg = pAliases, pProto = pProto)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Protoent) return false
        if (this.pName != other.pName) return false
        if (this.pAliases != other.pAliases) return false
        if (this.pProto != other.pProto) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pName.hashCode()
        result = 31 * result + this.pAliases.hashCode()
        result = 31 * result + this.pProto.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Protoent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Protoent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Protoent =
                    Protoent(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CChar>>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Protoent) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.pName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CChar>>(64)
                    ).writeNative(addr + 8L, value.pAliases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.pProto)
                }
            }

        public operator fun invoke(
            pName: MutPtr<CChar> = MutPtr(0L),
            pAliases: MutPtr<MutPtr<CChar>> = MutPtr(0L),
            pProto: CInt = 0,
        ): Protoent =
            Protoent(
                pNameCtorArg = pName,
                pAliasesCtorArg = pAliases,
                pProto = pProto,
            )
    }
}

public data class In6Addr(
    public var s6Addr: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is In6Addr) return false
        if (!this.s6Addr.contentEquals(other.s6Addr)) return false
        return true
    }

    override fun hashCode(): Int = this.s6Addr.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<In6Addr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<In6Addr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): In6Addr =
                    In6Addr(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: In6Addr) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.s6Addr.toList())
                }
            }
    }
}
