@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public data class Stat(
    public var stDev: DevT = 0,
    public var stIno: InoT = 0u,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UInt = 0u,
    public var stGid: UInt = 0u,
    public var stRdev: DevT = 0,
    public var stSize: OffT = 0L,
    public var stAtim: Timespec = Timespec(),
    public var stMtim: Timespec = Timespec(),
    public var stCtim: Timespec = Timespec(),
    public var stBlksize: BlksizeT = 0,
    public var stBlocks: Long = 0L,
    public var reserved: IntArray = IntArray(DEFAULT_RESERVED_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stat) return false
        if (this.stDev != other.stDev) return false
        if (this.stIno != other.stIno) return false
        if (this.stMode != other.stMode) return false
        if (this.stNlink != other.stNlink) return false
        if (this.stUid != other.stUid) return false
        if (this.stGid != other.stGid) return false
        if (this.stRdev != other.stRdev) return false
        if (this.stSize != other.stSize) return false
        if (this.stAtim != other.stAtim) return false
        if (this.stMtim != other.stMtim) return false
        if (this.stCtim != other.stCtim) return false
        if (this.stBlksize != other.stBlksize) return false
        if (this.stBlocks != other.stBlocks) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.stDev.hashCode()
        result = 31 * result + this.stIno.hashCode()
        result = 31 * result + this.stMode.hashCode()
        result = 31 * result + this.stNlink.hashCode()
        result = 31 * result + this.stUid.hashCode()
        result = 31 * result + this.stGid.hashCode()
        result = 31 * result + this.stRdev.hashCode()
        result = 31 * result + this.stSize.hashCode()
        result = 31 * result + this.stAtim.hashCode()
        result = 31 * result + this.stMtim.hashCode()
        result = 31 * result + this.stCtim.hashCode()
        result = 31 * result + this.stBlksize.hashCode()
        result = 31 * result + this.stBlocks.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class Sockaddr(
    public var saFamily: SaFamilyT = 0u,
    public var saData: UByteArray = UByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockaddr) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saData.contentEquals(other.saData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saFamily.hashCode()
        result = 31 * result + this.saData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockaddr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockaddr> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Sockaddr =
                    Sockaddr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Sockaddr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.saFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                    ).writeNative(addr + 2L, value.saData)
                }
            }
    }
}

public class Passwd internal constructor(
    pwNameCtorArg: ConstPtr<CChar>,
    pwPasswdCtorArg: ConstPtr<CChar>,
    public var pwUid: UInt,
    public var pwGid: UInt,
    pwGecosCtorArg: ConstPtr<CChar>,
    pwDirCtorArg: ConstPtr<CChar>,
    pwShellCtorArg: ConstPtr<CChar>,
    public var reserved: IntArray,
) {
    public var pwName: ConstPtr<CChar> = pwNameCtorArg
        internal set

    public var pwPasswd: ConstPtr<CChar> = pwPasswdCtorArg
        internal set

    public var pwGecos: ConstPtr<CChar> = pwGecosCtorArg
        internal set

    public var pwDir: ConstPtr<CChar> = pwDirCtorArg
        internal set

    public var pwShell: ConstPtr<CChar> = pwShellCtorArg
        internal set

    public constructor() : this(
        pwNameCtorArg = ConstPtr(0L),
        pwPasswdCtorArg = ConstPtr(0L),
        pwUid = 0u,
        pwGid = 0u,
        pwGecosCtorArg = ConstPtr(0L),
        pwDirCtorArg = ConstPtr(0L),
        pwShellCtorArg = ConstPtr(0L),
        reserved = IntArray(DEFAULT_RESERVED_SIZE),
    )

    public operator fun component1(): ConstPtr<CChar> = this.pwName

    public operator fun component2(): ConstPtr<CChar> = this.pwPasswd

    public operator fun component3(): UInt = this.pwUid

    public operator fun component4(): UInt = this.pwGid

    public operator fun component5(): ConstPtr<CChar> = this.pwGecos

    public operator fun component6(): ConstPtr<CChar> = this.pwDir

    public operator fun component7(): ConstPtr<CChar> = this.pwShell

    public operator fun component8(): IntArray = this.reserved

    public fun copy(pwName: ConstPtr<CChar> = this.pwName, pwPasswd: ConstPtr<CChar> = this.pwPasswd, pwUid: UInt = this.pwUid, pwGid: UInt = this.pwGid, pwGecos: ConstPtr<CChar> = this.pwGecos, pwDir: ConstPtr<CChar> = this.pwDir, pwShell: ConstPtr<CChar> = this.pwShell, reserved: IntArray = this.reserved): Passwd = Passwd(pwNameCtorArg = pwName, pwPasswdCtorArg = pwPasswd, pwUid = pwUid, pwGid = pwGid, pwGecosCtorArg = pwGecos, pwDirCtorArg = pwDir, pwShellCtorArg = pwShell, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Passwd) return false
        if (this.pwName != other.pwName) return false
        if (this.pwPasswd != other.pwPasswd) return false
        if (this.pwUid != other.pwUid) return false
        if (this.pwGid != other.pwGid) return false
        if (this.pwGecos != other.pwGecos) return false
        if (this.pwDir != other.pwDir) return false
        if (this.pwShell != other.pwShell) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwName.hashCode()
        result = 31 * result + this.pwPasswd.hashCode()
        result = 31 * result + this.pwUid.hashCode()
        result = 31 * result + this.pwGid.hashCode()
        result = 31 * result + this.pwGecos.hashCode()
        result = 31 * result + this.pwDir.hashCode()
        result = 31 * result + this.pwShell.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwName: ConstPtr<CChar> = ConstPtr(0L),
            pwPasswd: ConstPtr<CChar> = ConstPtr(0L),
            pwUid: UInt = 0u,
            pwGid: UInt = 0u,
            pwGecos: ConstPtr<CChar> = ConstPtr(0L),
            pwDir: ConstPtr<CChar> = ConstPtr(0L),
            pwShell: ConstPtr<CChar> = ConstPtr(0L),
            reserved: IntArray = IntArray(DEFAULT_RESERVED_SIZE),
        ): Passwd =
            Passwd(
                pwNameCtorArg = pwName,
                pwPasswdCtorArg = pwPasswd,
                pwUid = pwUid,
                pwGid = pwGid,
                pwGecosCtorArg = pwGecos,
                pwDirCtorArg = pwDir,
                pwShellCtorArg = pwShell,
                reserved = reserved,
            )
    }
}

public data class SemT(
    public var value: IntArray = IntArray(SEM_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SemT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SemT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SemT> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((SEM_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).strideBytes), 8L)
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SemT =
                    SemT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (SEM_SIZE).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SemT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (SEM_SIZE).toInt())
                    ).writeNative(addr, value.value)
                }
            }
    }
}

public data class PthreadAttrT(
    public var value: IntArray = IntArray(PTHREAD_ATTR_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadAttrT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadAttrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadAttrT> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((PTHREAD_ATTR_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).strideBytes), 8L)
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PthreadAttrT =
                    PthreadAttrT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (PTHREAD_ATTR_SIZE).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadAttrT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (PTHREAD_ATTR_SIZE).toInt())
                    ).writeNative(addr, value.value)
                }
            }
    }
}

public data class PthreadMutexT(
    public var value: IntArray = IntArray(PTHREAD_MUTEX_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexT> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((PTHREAD_MUTEX_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).strideBytes), 8L)
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PthreadMutexT =
                    PthreadMutexT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (PTHREAD_MUTEX_SIZE).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadMutexT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (PTHREAD_MUTEX_SIZE).toInt())
                    ).writeNative(addr, value.value)
                }
            }
    }
}

public data class PthreadCondT(
    public var value: IntArray = IntArray(PTHREAD_COND_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondT> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((PTHREAD_COND_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).strideBytes), 8L)
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PthreadCondT =
                    PthreadCondT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (PTHREAD_COND_SIZE).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadCondT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (PTHREAD_COND_SIZE).toInt())
                    ).writeNative(addr, value.value)
                }
            }
    }
}

public data class PthreadCondattrT(
    public var value: IntArray = IntArray(PTHREAD_CONDATTR_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondattrT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondattrT> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((PTHREAD_CONDATTR_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).strideBytes), 8L)
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PthreadCondattrT =
                    PthreadCondattrT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (PTHREAD_CONDATTR_SIZE).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadCondattrT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (PTHREAD_CONDATTR_SIZE).toInt())
                    ).writeNative(addr, value.value)
                }
            }
    }
}

public class DlInfo internal constructor(
    dliFnameCtorArg: ConstPtr<CChar>,
    dliFbaseCtorArg: MutPtr<CVoid>,
    dliSnameCtorArg: ConstPtr<CChar>,
    dliSaddrCtorArg: MutPtr<CVoid>,
) {
    public var dliFname: ConstPtr<CChar> = dliFnameCtorArg
        internal set

    public var dliFbase: MutPtr<CVoid> = dliFbaseCtorArg
        internal set

    public var dliSname: ConstPtr<CChar> = dliSnameCtorArg
        internal set

    public var dliSaddr: MutPtr<CVoid> = dliSaddrCtorArg
        internal set

    public constructor() : this(
        dliFnameCtorArg = ConstPtr(0L),
        dliFbaseCtorArg = MutPtr(0L),
        dliSnameCtorArg = ConstPtr(0L),
        dliSaddrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr<CChar> = this.dliFname

    public operator fun component2(): MutPtr<CVoid> = this.dliFbase

    public operator fun component3(): ConstPtr<CChar> = this.dliSname

    public operator fun component4(): MutPtr<CVoid> = this.dliSaddr

    public fun copy(dliFname: ConstPtr<CChar> = this.dliFname, dliFbase: MutPtr<CVoid> = this.dliFbase, dliSname: ConstPtr<CChar> = this.dliSname, dliSaddr: MutPtr<CVoid> = this.dliSaddr): DlInfo = DlInfo(dliFnameCtorArg = dliFname, dliFbaseCtorArg = dliFbase, dliSnameCtorArg = dliSname, dliSaddrCtorArg = dliSaddr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlInfo) return false
        if (this.dliFname != other.dliFname) return false
        if (this.dliFbase != other.dliFbase) return false
        if (this.dliSname != other.dliSname) return false
        if (this.dliSaddr != other.dliSaddr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dliFname.hashCode()
        result = 31 * result + this.dliFbase.hashCode()
        result = 31 * result + this.dliSname.hashCode()
        result = 31 * result + this.dliSaddr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlInfo> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DlInfo =
                    DlInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DlInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr, value.dliFname)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.dliFbase)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr + 16L, value.dliSname)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.dliSaddr)
                }
            }

        public operator fun invoke(
            dliFname: ConstPtr<CChar> = ConstPtr(0L),
            dliFbase: MutPtr<CVoid> = MutPtr(0L),
            dliSname: ConstPtr<CChar> = ConstPtr(0L),
            dliSaddr: MutPtr<CVoid> = MutPtr(0L),
        ): DlInfo =
            DlInfo(
                dliFnameCtorArg = dliFname,
                dliFbaseCtorArg = dliFbase,
                dliSnameCtorArg = dliSname,
                dliSaddrCtorArg = dliSaddr,
            )
    }
}

public class Lconv internal constructor(
    decimalPointCtorArg: ConstPtr<CChar>,
    thousandsSepCtorArg: ConstPtr<CChar>,
    groupingCtorArg: ConstPtr<CChar>,
    intCurrSymbolCtorArg: ConstPtr<CChar>,
    currencySymbolCtorArg: ConstPtr<CChar>,
    monDecimalPointCtorArg: ConstPtr<CChar>,
    monThousandsSepCtorArg: ConstPtr<CChar>,
    monGroupingCtorArg: ConstPtr<CChar>,
    positiveSignCtorArg: ConstPtr<CChar>,
    negativeSignCtorArg: ConstPtr<CChar>,
    public var intFracDigits: Byte,
    public var fracDigits: Byte,
    public var pCsPrecedes: Byte,
    public var pSepBySpace: Byte,
    public var nCsPrecedes: Byte,
    public var nSepBySpace: Byte,
    public var pSignPosn: Byte,
    public var nSignPosn: Byte,
    public var intNCsPrecedes: Byte,
    public var intNSepBySpace: Byte,
    public var intNSignPosn: Byte,
    public var intPCsPrecedes: Byte,
    public var intPSepBySpace: Byte,
    public var intPSignPosn: Byte,
    public var reserved: IntArray,
) {
    public var decimalPoint: ConstPtr<CChar> = decimalPointCtorArg
        internal set

    public var thousandsSep: ConstPtr<CChar> = thousandsSepCtorArg
        internal set

    public var grouping: ConstPtr<CChar> = groupingCtorArg
        internal set

    public var intCurrSymbol: ConstPtr<CChar> = intCurrSymbolCtorArg
        internal set

    public var currencySymbol: ConstPtr<CChar> = currencySymbolCtorArg
        internal set

    public var monDecimalPoint: ConstPtr<CChar> = monDecimalPointCtorArg
        internal set

    public var monThousandsSep: ConstPtr<CChar> = monThousandsSepCtorArg
        internal set

    public var monGrouping: ConstPtr<CChar> = monGroupingCtorArg
        internal set

    public var positiveSign: ConstPtr<CChar> = positiveSignCtorArg
        internal set

    public var negativeSign: ConstPtr<CChar> = negativeSignCtorArg
        internal set

    public constructor() : this(
        decimalPointCtorArg = ConstPtr(0L),
        thousandsSepCtorArg = ConstPtr(0L),
        groupingCtorArg = ConstPtr(0L),
        intCurrSymbolCtorArg = ConstPtr(0L),
        currencySymbolCtorArg = ConstPtr(0L),
        monDecimalPointCtorArg = ConstPtr(0L),
        monThousandsSepCtorArg = ConstPtr(0L),
        monGroupingCtorArg = ConstPtr(0L),
        positiveSignCtorArg = ConstPtr(0L),
        negativeSignCtorArg = ConstPtr(0L),
        intFracDigits = 0,
        fracDigits = 0,
        pCsPrecedes = 0,
        pSepBySpace = 0,
        nCsPrecedes = 0,
        nSepBySpace = 0,
        pSignPosn = 0,
        nSignPosn = 0,
        intNCsPrecedes = 0,
        intNSepBySpace = 0,
        intNSignPosn = 0,
        intPCsPrecedes = 0,
        intPSepBySpace = 0,
        intPSignPosn = 0,
        reserved = IntArray(DEFAULT_RESERVED_SIZE),
    )

    public companion object {
        public operator fun invoke(
            decimalPoint: ConstPtr<CChar> = ConstPtr(0L),
            thousandsSep: ConstPtr<CChar> = ConstPtr(0L),
            grouping: ConstPtr<CChar> = ConstPtr(0L),
            intCurrSymbol: ConstPtr<CChar> = ConstPtr(0L),
            currencySymbol: ConstPtr<CChar> = ConstPtr(0L),
            monDecimalPoint: ConstPtr<CChar> = ConstPtr(0L),
            monThousandsSep: ConstPtr<CChar> = ConstPtr(0L),
            monGrouping: ConstPtr<CChar> = ConstPtr(0L),
            positiveSign: ConstPtr<CChar> = ConstPtr(0L),
            negativeSign: ConstPtr<CChar> = ConstPtr(0L),
            intFracDigits: Byte = 0,
            fracDigits: Byte = 0,
            pCsPrecedes: Byte = 0,
            pSepBySpace: Byte = 0,
            nCsPrecedes: Byte = 0,
            nSepBySpace: Byte = 0,
            pSignPosn: Byte = 0,
            nSignPosn: Byte = 0,
            intNCsPrecedes: Byte = 0,
            intNSepBySpace: Byte = 0,
            intNSignPosn: Byte = 0,
            intPCsPrecedes: Byte = 0,
            intPSepBySpace: Byte = 0,
            intPSignPosn: Byte = 0,
            reserved: IntArray = IntArray(DEFAULT_RESERVED_SIZE),
        ): Lconv =
            Lconv(
                decimalPointCtorArg = decimalPoint,
                thousandsSepCtorArg = thousandsSep,
                groupingCtorArg = grouping,
                intCurrSymbolCtorArg = intCurrSymbol,
                currencySymbolCtorArg = currencySymbol,
                monDecimalPointCtorArg = monDecimalPoint,
                monThousandsSepCtorArg = monThousandsSep,
                monGroupingCtorArg = monGrouping,
                positiveSignCtorArg = positiveSign,
                negativeSignCtorArg = negativeSign,
                intFracDigits = intFracDigits,
                fracDigits = fracDigits,
                pCsPrecedes = pCsPrecedes,
                pSepBySpace = pSepBySpace,
                nCsPrecedes = nCsPrecedes,
                nSepBySpace = nSepBySpace,
                pSignPosn = pSignPosn,
                nSignPosn = nSignPosn,
                intNCsPrecedes = intNCsPrecedes,
                intNSepBySpace = intNSepBySpace,
                intNSignPosn = intNSignPosn,
                intPCsPrecedes = intPCsPrecedes,
                intPSepBySpace = intPSepBySpace,
                intPSignPosn = intPSignPosn,
                reserved = reserved,
            )
    }
}

public class Tm internal constructor(
    public var tmSec: Int,
    public var tmMin: Int,
    public var tmHour: Int,
    public var tmMday: Int,
    public var tmMon: Int,
    public var tmYear: Int,
    public var tmWday: Int,
    public var tmYday: Int,
    public var tmIsdst: Int,
    public var tmGmtoff: Int,
    tmZoneCtorArg: ConstPtr<CChar>,
    public var reserved: IntArray,
) {
    public var tmZone: ConstPtr<CChar> = tmZoneCtorArg
        internal set

    public constructor() : this(
        tmSec = 0,
        tmMin = 0,
        tmHour = 0,
        tmMday = 0,
        tmMon = 0,
        tmYear = 0,
        tmWday = 0,
        tmYday = 0,
        tmIsdst = 0,
        tmGmtoff = 0,
        tmZoneCtorArg = ConstPtr(0L),
        reserved = IntArray(DEFAULT_RESERVED_SIZE),
    )

    public operator fun component1(): Int = this.tmSec

    public operator fun component2(): Int = this.tmMin

    public operator fun component3(): Int = this.tmHour

    public operator fun component4(): Int = this.tmMday

    public operator fun component5(): Int = this.tmMon

    public operator fun component6(): Int = this.tmYear

    public operator fun component7(): Int = this.tmWday

    public operator fun component8(): Int = this.tmYday

    public operator fun component9(): Int = this.tmIsdst

    public operator fun component10(): Int = this.tmGmtoff

    public operator fun component11(): ConstPtr<CChar> = this.tmZone

    public operator fun component12(): IntArray = this.reserved

    public fun copy(tmSec: Int = this.tmSec, tmMin: Int = this.tmMin, tmHour: Int = this.tmHour, tmMday: Int = this.tmMday, tmMon: Int = this.tmMon, tmYear: Int = this.tmYear, tmWday: Int = this.tmWday, tmYday: Int = this.tmYday, tmIsdst: Int = this.tmIsdst, tmGmtoff: Int = this.tmGmtoff, tmZone: ConstPtr<CChar> = this.tmZone, reserved: IntArray = this.reserved): Tm = Tm(tmSec = tmSec, tmMin = tmMin, tmHour = tmHour, tmMday = tmMday, tmMon = tmMon, tmYear = tmYear, tmWday = tmWday, tmYday = tmYday, tmIsdst = tmIsdst, tmGmtoff = tmGmtoff, tmZoneCtorArg = tmZone, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tm) return false
        if (this.tmSec != other.tmSec) return false
        if (this.tmMin != other.tmMin) return false
        if (this.tmHour != other.tmHour) return false
        if (this.tmMday != other.tmMday) return false
        if (this.tmMon != other.tmMon) return false
        if (this.tmYear != other.tmYear) return false
        if (this.tmWday != other.tmWday) return false
        if (this.tmYday != other.tmYday) return false
        if (this.tmIsdst != other.tmIsdst) return false
        if (this.tmGmtoff != other.tmGmtoff) return false
        if (this.tmZone != other.tmZone) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tmSec.hashCode()
        result = 31 * result + this.tmMin.hashCode()
        result = 31 * result + this.tmHour.hashCode()
        result = 31 * result + this.tmMday.hashCode()
        result = 31 * result + this.tmMon.hashCode()
        result = 31 * result + this.tmYear.hashCode()
        result = 31 * result + this.tmWday.hashCode()
        result = 31 * result + this.tmYday.hashCode()
        result = 31 * result + this.tmIsdst.hashCode()
        result = 31 * result + this.tmGmtoff.hashCode()
        result = 31 * result + this.tmZone.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            tmSec: Int = 0,
            tmMin: Int = 0,
            tmHour: Int = 0,
            tmMday: Int = 0,
            tmMon: Int = 0,
            tmYear: Int = 0,
            tmWday: Int = 0,
            tmYday: Int = 0,
            tmIsdst: Int = 0,
            tmGmtoff: Int = 0,
            tmZone: ConstPtr<CChar> = ConstPtr(0L),
            reserved: IntArray = IntArray(DEFAULT_RESERVED_SIZE),
        ): Tm =
            Tm(
                tmSec = tmSec,
                tmMin = tmMin,
                tmHour = tmHour,
                tmMday = tmMday,
                tmMon = tmMon,
                tmYear = tmYear,
                tmWday = tmWday,
                tmYday = tmYday,
                tmIsdst = tmIsdst,
                tmGmtoff = tmGmtoff,
                tmZoneCtorArg = tmZone,
                reserved = reserved,
            )
    }
}

public class Addrinfo internal constructor(
    public var aiFlags: Int,
    public var aiFamily: Int,
    public var aiSocktype: Int,
    public var aiProtocol: Int,
    public var aiAddrlen: SocklenT,
    aiAddrCtorArg: MutPtr<Sockaddr>,
    aiCanonnameCtorArg: MutPtr<CChar>,
    aiNextCtorArg: MutPtr<Addrinfo>,
    public var reserved: IntArray,
) {
    public var aiAddr: MutPtr<Sockaddr> = aiAddrCtorArg
        internal set

    public var aiCanonname: MutPtr<CChar> = aiCanonnameCtorArg
        internal set

    public var aiNext: MutPtr<Addrinfo> = aiNextCtorArg
        internal set

    public constructor() : this(
        aiFlags = 0,
        aiFamily = 0,
        aiSocktype = 0,
        aiProtocol = 0,
        aiAddrlen = 0u,
        aiAddrCtorArg = MutPtr(0L),
        aiCanonnameCtorArg = MutPtr(0L),
        aiNextCtorArg = MutPtr(0L),
        reserved = IntArray(DEFAULT_RESERVED_SIZE),
    )

    public operator fun component1(): Int = this.aiFlags

    public operator fun component2(): Int = this.aiFamily

    public operator fun component3(): Int = this.aiSocktype

    public operator fun component4(): Int = this.aiProtocol

    public operator fun component5(): SocklenT = this.aiAddrlen

    public operator fun component6(): MutPtr<Sockaddr> = this.aiAddr

    public operator fun component7(): MutPtr<CChar> = this.aiCanonname

    public operator fun component8(): MutPtr<Addrinfo> = this.aiNext

    public operator fun component9(): IntArray = this.reserved

    public fun copy(aiFlags: Int = this.aiFlags, aiFamily: Int = this.aiFamily, aiSocktype: Int = this.aiSocktype, aiProtocol: Int = this.aiProtocol, aiAddrlen: SocklenT = this.aiAddrlen, aiAddr: MutPtr<Sockaddr> = this.aiAddr, aiCanonname: MutPtr<CChar> = this.aiCanonname, aiNext: MutPtr<Addrinfo> = this.aiNext, reserved: IntArray = this.reserved): Addrinfo = Addrinfo(aiFlags = aiFlags, aiFamily = aiFamily, aiSocktype = aiSocktype, aiProtocol = aiProtocol, aiAddrlen = aiAddrlen, aiAddrCtorArg = aiAddr, aiCanonnameCtorArg = aiCanonname, aiNextCtorArg = aiNext, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Addrinfo) return false
        if (this.aiFlags != other.aiFlags) return false
        if (this.aiFamily != other.aiFamily) return false
        if (this.aiSocktype != other.aiSocktype) return false
        if (this.aiProtocol != other.aiProtocol) return false
        if (this.aiAddrlen != other.aiAddrlen) return false
        if (this.aiAddr != other.aiAddr) return false
        if (this.aiCanonname != other.aiCanonname) return false
        if (this.aiNext != other.aiNext) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiFlags.hashCode()
        result = 31 * result + this.aiFamily.hashCode()
        result = 31 * result + this.aiSocktype.hashCode()
        result = 31 * result + this.aiProtocol.hashCode()
        result = 31 * result + this.aiAddrlen.hashCode()
        result = 31 * result + this.aiAddr.hashCode()
        result = 31 * result + this.aiCanonname.hashCode()
        result = 31 * result + this.aiNext.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aiFlags: Int = 0,
            aiFamily: Int = 0,
            aiSocktype: Int = 0,
            aiProtocol: Int = 0,
            aiAddrlen: SocklenT = 0u,
            aiAddr: MutPtr<Sockaddr> = MutPtr(0L),
            aiCanonname: MutPtr<CChar> = MutPtr(0L),
            aiNext: MutPtr<Addrinfo> = MutPtr(0L),
            reserved: IntArray = IntArray(DEFAULT_RESERVED_SIZE),
        ): Addrinfo =
            Addrinfo(
                aiFlags = aiFlags,
                aiFamily = aiFamily,
                aiSocktype = aiSocktype,
                aiProtocol = aiProtocol,
                aiAddrlen = aiAddrlen,
                aiAddrCtorArg = aiAddr,
                aiCanonnameCtorArg = aiCanonname,
                aiNextCtorArg = aiNext,
                reserved = reserved,
            )
    }
}

public data class PthreadRwlockT(
    public var value: IntArray = IntArray(PTHREAD_RWLOCK_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((PTHREAD_RWLOCK_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).strideBytes), 8L)
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PthreadRwlockT =
                    PthreadRwlockT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (PTHREAD_RWLOCK_SIZE).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadRwlockT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (PTHREAD_RWLOCK_SIZE).toInt())
                    ).writeNative(addr, value.value)
                }
            }
    }
}

public data class Statvfs(
    public var fBsize: Int = 0,
    public var fFrsize: Int = 0,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsblkcntT = 0uL,
    public var fFfree: FsblkcntT = 0uL,
    public var fFavail: FsblkcntT = 0uL,
    public var fFsid: Int = 0,
    public var fFlag: Int = 0,
    public var fNamemax: Int = 0,
    public var reserved: IntArray = IntArray(DEFAULT_RESERVED_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statvfs) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFavail != other.fFavail) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fFlag != other.fFlag) return false
        if (this.fNamemax != other.fNamemax) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fBsize.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFavail.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fNamemax.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class Dirent(
    public var dType: UByte = 0u,
    public var dName: UByteArray = UByteArray(NAME_MAX + 1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dType != other.dType) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dType.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(1L, 1L) + ((NAME_MAX + 1).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                            ),
                            1L,
                        )
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Dirent =
                    Dirent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (NAME_MAX + 1).toInt())
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(1L, 1L),
                        ),
                    )
                override fun writeNative(addr: Long, value: Dirent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.dType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (NAME_MAX + 1).toInt())
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(1L, 1L),
                        value.dName,
                    )
                }
            }
    }
}

public data class FdSet(
    public var value: UIntArray = UIntArray(FDSET_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FdSet) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FdSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FdSet> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((FDSET_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes), 4L)
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FdSet =
                    FdSet(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (FDSET_SIZE).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FdSet) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (FDSET_SIZE).toInt())
                    ).writeNative(addr, value.value)
                }
            }
    }
}

public data class SigsetT(
    public var value: UIntArray = UIntArray(SIGSET_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SigsetT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SigsetT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SigsetT> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((SIGSET_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes), 4L)
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SigsetT =
                    SigsetT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (SIGSET_SIZE).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SigsetT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (SIGSET_SIZE).toInt())
                    ).writeNative(addr, value.value)
                }
            }
    }
}

public data class Sigaction(
    public var saHandler: Int = 0,
    public var saMask: SigsetT = SigsetT(),
    public var saFlags: Int = 0,
    public var saUser: Int = 0,
    public var reserved: IntArray = IntArray(DEFAULT_RESERVED_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigaction) return false
        if (this.saHandler != other.saHandler) return false
        if (this.saMask != other.saMask) return false
        if (this.saFlags != other.saFlags) return false
        if (this.saUser != other.saUser) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saHandler.hashCode()
        result = 31 * result + this.saMask.hashCode()
        result = 31 * result + this.saFlags.hashCode()
        result = 31 * result + this.saUser.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cCc: UByteArray = UByteArray(12),
    public var cSpeed: SpeedT = 0uL,
    public var reserved: IntArray = IntArray(DEFAULT_RESERVED_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Termios) return false
        if (this.cIflag != other.cIflag) return false
        if (this.cOflag != other.cOflag) return false
        if (this.cCflag != other.cCflag) return false
        if (this.cLflag != other.cLflag) return false
        if (!this.cCc.contentEquals(other.cCc)) return false
        if (this.cSpeed != other.cSpeed) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIflag.hashCode()
        result = 31 * result + this.cOflag.hashCode()
        result = 31 * result + this.cCflag.hashCode()
        result = 31 * result + this.cLflag.hashCode()
        result = 31 * result + this.cCc.contentHashCode()
        result = 31 * result + this.cSpeed.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class InAddr(
    public var sAddr: InAddrT = 0u,
)

public data class SockaddrIn(
    public var sinFamily: SaFamilyT = 0u,
    public var sinPort: InPortT = 0u,
    public var sinAddr: InAddr = InAddr(),
    public var sinZero: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrIn) return false
        if (this.sinFamily != other.sinFamily) return false
        if (this.sinPort != other.sinPort) return false
        if (this.sinAddr != other.sinAddr) return false
        if (!this.sinZero.contentEquals(other.sinZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sinFamily.hashCode()
        result = 31 * result + this.sinPort.hashCode()
        result = 31 * result + this.sinAddr.hashCode()
        result = 31 * result + this.sinZero.contentHashCode()
        return result
    }
}

public data class SockaddrIn6(
    public var sin6Family: SaFamilyT = 0u,
    public var sin6Port: InPortT = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: UInt = 0u,
)

public data class SockaddrUn(
    public var sunFamily: SaFamilyT = 0u,
    public var sunPath: UByteArray = UByteArray(108),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrUn) return false
        if (this.sunFamily != other.sunFamily) return false
        if (!this.sunPath.contentEquals(other.sunPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sunFamily.hashCode()
        result = 31 * result + this.sunPath.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrUn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrUn> {
                override val sizeBytes: Long = 110L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SockaddrUn =
                    SockaddrUn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (108).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: SockaddrUn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sunFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (108).toInt())
                    ).writeNative(addr + 2L, value.sunPath)
                }
            }
    }
}

public data class SockaddrStorage(
    public var ssFamily: SaFamilyT = 0u,
    public var ssData: UIntArray = UIntArray(SOCKADDR_STORAGE_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssData.contentEquals(other.ssData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssFamily.hashCode()
        result = 31 * result + this.ssData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrStorage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrStorage> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(2L, 4L) + ((SOCKADDR_STORAGE_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)
                            ),
                            maxOf(2L, 4L),
                        )
                override val alignBytes: Long = maxOf(2L, 4L)
                override fun readNative(addr: Long): SockaddrStorage =
                    SockaddrStorage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (SOCKADDR_STORAGE_SIZE).toInt())
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(2L, 4L),
                        ),
                    )
                override fun writeNative(addr: Long, value: SockaddrStorage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.ssFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (SOCKADDR_STORAGE_SIZE).toInt())
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(2L, 4L),
                        value.ssData,
                    )
                }
            }
    }
}

public data class IpMreq(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
)

public data class Ipv6Mreq(
    public var ipv6mrMultiaddr: In6Addr = In6Addr(),
    public var ipv6mrInterface: UInt = 0u,
)
