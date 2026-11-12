// port-lint: source unix/linux_like/linux_l4re_shared.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.CcT
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.IFNAMSIZ
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.android.RLIM_INFINITY
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Ino64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NlItem
import io.github.kotlinmania.libc.unix.linuxlike.linux.PthreadOnceT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Rlim64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Aiocb
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Cmsghdr
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Msghdr
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.RegexT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.InoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.RlimT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Sysinfo
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.ShmidDs
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.RegoffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.SemT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.mem.sizeOfVal
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: ConstPtr<CChar>, errnum: CInt): CInt
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: MutPtr<DlPhdrInfo>, size: SizeT, data: MutPtr<CVoid>): CInt
}

public typealias Elf32Half = UShort

public typealias Elf32Word = UInt

public typealias Elf32Off = UInt

public typealias Elf32Addr = UInt

public typealias Elf32Xword = ULong

public typealias Elf32Sword = Int

public typealias Elf64Half = UShort

public typealias Elf64Word = UInt

public typealias Elf64Off = ULong

public typealias Elf64Addr = ULong

public typealias Elf64Xword = ULong

public typealias Elf64Sxword = Long

public typealias Elf64Sword = Int

public typealias Elf32Section = UShort

public typealias Elf64Section = UShort

public typealias Elf32Relr = Elf32Word

public typealias Elf64Relr = Elf32Xword

public typealias Elf32Rel = CAnonymousElf32Rel

public typealias Elf64Rel = CAnonymousElf64Rel

public typealias Elf32Rela = CAnonymousElf32Rela

public typealias Elf64Rela = CAnonymousElf64Rela

public typealias IconvT = MutPtr<CVoid>

public class Fpos64T(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}

public class GlobT internal constructor(
    public var glPathc: SizeT,
    glPathvCtorArg: MutPtr<MutPtr<CChar>>,
    public var glOffs: SizeT,
    public var glFlags: CInt,
    unused1CtorArg: MutPtr<CVoid>,
    unused2CtorArg: MutPtr<CVoid>,
    unused3CtorArg: MutPtr<CVoid>,
    unused4CtorArg: MutPtr<CVoid>,
    unused5CtorArg: MutPtr<CVoid>,
) {
    public var glPathv: MutPtr<MutPtr<CChar>> = glPathvCtorArg
        internal set

    public var unused1: MutPtr<CVoid> = unused1CtorArg
        internal set

    public var unused2: MutPtr<CVoid> = unused2CtorArg
        internal set

    public var unused3: MutPtr<CVoid> = unused3CtorArg
        internal set

    public var unused4: MutPtr<CVoid> = unused4CtorArg
        internal set

    public var unused5: MutPtr<CVoid> = unused5CtorArg
        internal set

    public constructor() : this(
        glPathc = 0uL,
        glPathvCtorArg = MutPtr(0L),
        glOffs = 0uL,
        glFlags = 0,
        unused1CtorArg = MutPtr(0L),
        unused2CtorArg = MutPtr(0L),
        unused3CtorArg = MutPtr(0L),
        unused4CtorArg = MutPtr(0L),
        unused5CtorArg = MutPtr(0L),
    )

    public operator fun component1(): SizeT = this.glPathc

    public operator fun component2(): MutPtr<MutPtr<CChar>> = this.glPathv

    public operator fun component3(): SizeT = this.glOffs

    public operator fun component4(): CInt = this.glFlags

    public operator fun component5(): MutPtr<CVoid> = this.unused1

    public operator fun component6(): MutPtr<CVoid> = this.unused2

    public operator fun component7(): MutPtr<CVoid> = this.unused3

    public operator fun component8(): MutPtr<CVoid> = this.unused4

    public operator fun component9(): MutPtr<CVoid> = this.unused5

    public fun copy(glPathc: SizeT = this.glPathc, glPathv: MutPtr<MutPtr<CChar>> = this.glPathv, glOffs: SizeT = this.glOffs, glFlags: CInt = this.glFlags, unused1: MutPtr<CVoid> = this.unused1, unused2: MutPtr<CVoid> = this.unused2, unused3: MutPtr<CVoid> = this.unused3, unused4: MutPtr<CVoid> = this.unused4, unused5: MutPtr<CVoid> = this.unused5): GlobT = GlobT(glPathc = glPathc, glPathvCtorArg = glPathv, glOffs = glOffs, glFlags = glFlags, unused1CtorArg = unused1, unused2CtorArg = unused2, unused3CtorArg = unused3, unused4CtorArg = unused4, unused5CtorArg = unused5)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GlobT) return false
        if (this.glPathc != other.glPathc) return false
        if (this.glPathv != other.glPathv) return false
        if (this.glOffs != other.glOffs) return false
        if (this.glFlags != other.glFlags) return false
        if (this.unused1 != other.unused1) return false
        if (this.unused2 != other.unused2) return false
        if (this.unused3 != other.unused3) return false
        if (this.unused4 != other.unused4) return false
        if (this.unused5 != other.unused5) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.glPathc.hashCode()
        result = 31 * result + this.glPathv.hashCode()
        result = 31 * result + this.glOffs.hashCode()
        result = 31 * result + this.glFlags.hashCode()
        result = 31 * result + this.unused1.hashCode()
        result = 31 * result + this.unused2.hashCode()
        result = 31 * result + this.unused3.hashCode()
        result = 31 * result + this.unused4.hashCode()
        result = 31 * result + this.unused5.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GlobT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GlobT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): GlobT =
                    GlobT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CChar>>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: GlobT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.glPathc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CChar>>(64)
                    ).writeNative(addr + 8L, value.glPathv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.glOffs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.glFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.unused1)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.unused2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.unused3)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 56L, value.unused4)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 64L, value.unused5)
                }
            }

        public operator fun invoke(
            glPathc: SizeT = 0uL,
            glPathv: MutPtr<MutPtr<CChar>> = MutPtr(0L),
            glOffs: SizeT = 0uL,
            glFlags: CInt = 0,
            unused1: MutPtr<CVoid> = MutPtr(0L),
            unused2: MutPtr<CVoid> = MutPtr(0L),
            unused3: MutPtr<CVoid> = MutPtr(0L),
            unused4: MutPtr<CVoid> = MutPtr(0L),
            unused5: MutPtr<CVoid> = MutPtr(0L),
        ): GlobT =
            GlobT(
                glPathc = glPathc,
                glPathvCtorArg = glPathv,
                glOffs = glOffs,
                glFlags = glFlags,
                unused1CtorArg = unused1,
                unused2CtorArg = unused2,
                unused3CtorArg = unused3,
                unused4CtorArg = unused4,
                unused5CtorArg = unused5,
            )
    }
}

public class Passwd internal constructor(
    pwNameCtorArg: MutPtr<CChar>,
    pwPasswdCtorArg: MutPtr<CChar>,
    public var pwUid: UidT,
    public var pwGid: GidT,
    pwGecosCtorArg: MutPtr<CChar>,
    pwDirCtorArg: MutPtr<CChar>,
    pwShellCtorArg: MutPtr<CChar>,
) {
    public var pwName: MutPtr<CChar> = pwNameCtorArg
        internal set

    public var pwPasswd: MutPtr<CChar> = pwPasswdCtorArg
        internal set

    public var pwGecos: MutPtr<CChar> = pwGecosCtorArg
        internal set

    public var pwDir: MutPtr<CChar> = pwDirCtorArg
        internal set

    public var pwShell: MutPtr<CChar> = pwShellCtorArg
        internal set

    public constructor() : this(
        pwNameCtorArg = MutPtr(0L),
        pwPasswdCtorArg = MutPtr(0L),
        pwUid = 0u,
        pwGid = 0u,
        pwGecosCtorArg = MutPtr(0L),
        pwDirCtorArg = MutPtr(0L),
        pwShellCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CChar> = this.pwName

    public operator fun component2(): MutPtr<CChar> = this.pwPasswd

    public operator fun component3(): UidT = this.pwUid

    public operator fun component4(): GidT = this.pwGid

    public operator fun component5(): MutPtr<CChar> = this.pwGecos

    public operator fun component6(): MutPtr<CChar> = this.pwDir

    public operator fun component7(): MutPtr<CChar> = this.pwShell

    public fun copy(pwName: MutPtr<CChar> = this.pwName, pwPasswd: MutPtr<CChar> = this.pwPasswd, pwUid: UidT = this.pwUid, pwGid: GidT = this.pwGid, pwGecos: MutPtr<CChar> = this.pwGecos, pwDir: MutPtr<CChar> = this.pwDir, pwShell: MutPtr<CChar> = this.pwShell): Passwd = Passwd(pwNameCtorArg = pwName, pwPasswdCtorArg = pwPasswd, pwUid = pwUid, pwGid = pwGid, pwGecosCtorArg = pwGecos, pwDirCtorArg = pwDir, pwShellCtorArg = pwShell)

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
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Passwd> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Passwd> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Passwd =
                    Passwd(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: Passwd) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.pwName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 8L, value.pwPasswd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.pwUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.pwGid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 24L, value.pwGecos)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 32L, value.pwDir)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 40L, value.pwShell)
                }
            }

        public operator fun invoke(
            pwName: MutPtr<CChar> = MutPtr(0L),
            pwPasswd: MutPtr<CChar> = MutPtr(0L),
            pwUid: UidT = 0u,
            pwGid: GidT = 0u,
            pwGecos: MutPtr<CChar> = MutPtr(0L),
            pwDir: MutPtr<CChar> = MutPtr(0L),
            pwShell: MutPtr<CChar> = MutPtr(0L),
        ): Passwd =
            Passwd(
                pwNameCtorArg = pwName,
                pwPasswdCtorArg = pwPasswd,
                pwUid = pwUid,
                pwGid = pwGid,
                pwGecosCtorArg = pwGecos,
                pwDirCtorArg = pwDir,
                pwShellCtorArg = pwShell,
            )
    }
}

public class Spwd internal constructor(
    spNampCtorArg: MutPtr<CChar>,
    spPwdpCtorArg: MutPtr<CChar>,
    public var spLstchg: CLong,
    public var spMin: CLong,
    public var spMax: CLong,
    public var spWarn: CLong,
    public var spInact: CLong,
    public var spExpire: CLong,
    public var spFlag: CUlong,
) {
    public var spNamp: MutPtr<CChar> = spNampCtorArg
        internal set

    public var spPwdp: MutPtr<CChar> = spPwdpCtorArg
        internal set

    public constructor() : this(
        spNampCtorArg = MutPtr(0L),
        spPwdpCtorArg = MutPtr(0L),
        spLstchg = 0L,
        spMin = 0L,
        spMax = 0L,
        spWarn = 0L,
        spInact = 0L,
        spExpire = 0L,
        spFlag = 0uL,
    )

    public operator fun component1(): MutPtr<CChar> = this.spNamp

    public operator fun component2(): MutPtr<CChar> = this.spPwdp

    public operator fun component3(): CLong = this.spLstchg

    public operator fun component4(): CLong = this.spMin

    public operator fun component5(): CLong = this.spMax

    public operator fun component6(): CLong = this.spWarn

    public operator fun component7(): CLong = this.spInact

    public operator fun component8(): CLong = this.spExpire

    public operator fun component9(): CUlong = this.spFlag

    public fun copy(spNamp: MutPtr<CChar> = this.spNamp, spPwdp: MutPtr<CChar> = this.spPwdp, spLstchg: CLong = this.spLstchg, spMin: CLong = this.spMin, spMax: CLong = this.spMax, spWarn: CLong = this.spWarn, spInact: CLong = this.spInact, spExpire: CLong = this.spExpire, spFlag: CUlong = this.spFlag): Spwd = Spwd(spNampCtorArg = spNamp, spPwdpCtorArg = spPwdp, spLstchg = spLstchg, spMin = spMin, spMax = spMax, spWarn = spWarn, spInact = spInact, spExpire = spExpire, spFlag = spFlag)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Spwd) return false
        if (this.spNamp != other.spNamp) return false
        if (this.spPwdp != other.spPwdp) return false
        if (this.spLstchg != other.spLstchg) return false
        if (this.spMin != other.spMin) return false
        if (this.spMax != other.spMax) return false
        if (this.spWarn != other.spWarn) return false
        if (this.spInact != other.spInact) return false
        if (this.spExpire != other.spExpire) return false
        if (this.spFlag != other.spFlag) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.spNamp.hashCode()
        result = 31 * result + this.spPwdp.hashCode()
        result = 31 * result + this.spLstchg.hashCode()
        result = 31 * result + this.spMin.hashCode()
        result = 31 * result + this.spMax.hashCode()
        result = 31 * result + this.spWarn.hashCode()
        result = 31 * result + this.spInact.hashCode()
        result = 31 * result + this.spExpire.hashCode()
        result = 31 * result + this.spFlag.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Spwd> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Spwd> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): Spwd =
                    Spwd(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: Spwd) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.spNamp)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 8L, value.spPwdp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.spLstchg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.spMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.spMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.spWarn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.spInact)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.spExpire)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.spFlag)
                }
            }

        public operator fun invoke(
            spNamp: MutPtr<CChar> = MutPtr(0L),
            spPwdp: MutPtr<CChar> = MutPtr(0L),
            spLstchg: CLong = 0L,
            spMin: CLong = 0L,
            spMax: CLong = 0L,
            spWarn: CLong = 0L,
            spInact: CLong = 0L,
            spExpire: CLong = 0L,
            spFlag: CUlong = 0uL,
        ): Spwd =
            Spwd(
                spNampCtorArg = spNamp,
                spPwdpCtorArg = spPwdp,
                spLstchg = spLstchg,
                spMin = spMin,
                spMax = spMax,
                spWarn = spWarn,
                spInact = spInact,
                spExpire = spExpire,
                spFlag = spFlag,
            )
    }
}

public data class Itimerspec(
    public var itInterval: Timespec = Timespec(),
    public var itValue: Timespec = Timespec(),
)

public data class FsidT(
    public var value: IntArray = IntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsidT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsidT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsidT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FsidT =
                    FsidT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                        ).readNative(addr).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: FsidT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                    ).writeNative(addr, value.value.toList())
                }
            }
    }
}

public data class PacketMreq(
    public var mrIfindex: CInt = 0,
    public var mrType: CUshort = 0u,
    public var mrAlen: CUshort = 0u,
    public var mrAddress: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PacketMreq) return false
        if (this.mrIfindex != other.mrIfindex) return false
        if (this.mrType != other.mrType) return false
        if (this.mrAlen != other.mrAlen) return false
        if (!this.mrAddress.contentEquals(other.mrAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mrIfindex.hashCode()
        result = 31 * result + this.mrType.hashCode()
        result = 31 * result + this.mrAlen.hashCode()
        result = 31 * result + this.mrAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PacketMreq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PacketMreq> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PacketMreq =
                    PacketMreq(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PacketMreq) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.mrIfindex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.mrType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.mrAlen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 8L, value.mrAddress.toList())
                }
            }
    }
}

public data class CpuSetT(
    public var bits: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpuSetT) return false
        if (!this.bits.contentEquals(other.bits)) return false
        return true
    }

    override fun hashCode(): Int = this.bits.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuSetT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuSetT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): CpuSetT =
                    CpuSetT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                        ).readNative(addr).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: CpuSetT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                    ).writeNative(addr, value.bits.toList())
                }
            }
    }
}

public data class Sembuf(
    public var semNum: CUshort = 0u,
    public var semOp: CShort = 0,
    public var semFlg: CShort = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sembuf> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sembuf> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): Sembuf =
                    Sembuf(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Sembuf) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.semNum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.semOp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.semFlg)
                }
            }
    }
}

public class DlPhdrInfo internal constructor(
    public var dlpiAddr: Elf64Addr,
    dlpiNameCtorArg: ConstPtr<CChar>,
    dlpiPhdrCtorArg: ConstPtr<Elf64Phdr>,
    public var dlpiPhnum: Elf64Half,
    // As of uClibc 1.0.36, the following fields are
    // gated behind a "#if 0" block which always evaluates
    // to false. So I'm just removing these, and if uClibc changes
    // the #if block in the future to include the following fields, these
    // will probably need including here. tsidea, skrap
    // QNX (NTO) platform does not define these fields
    public var dlpiAdds: CUlonglong,
    public var dlpiSubs: CUlonglong,
    public var dlpiTlsModid: SizeT,
    dlpiTlsDataCtorArg: MutPtr<CVoid>,
) {
    public var dlpiName: ConstPtr<CChar> = dlpiNameCtorArg
        internal set

    public var dlpiPhdr: ConstPtr<Elf64Phdr> = dlpiPhdrCtorArg
        internal set

    public var dlpiTlsData: MutPtr<CVoid> = dlpiTlsDataCtorArg
        internal set

    public constructor() : this(
        dlpiAddr = 0uL,
        dlpiNameCtorArg = ConstPtr(0L),
        dlpiPhdrCtorArg = ConstPtr(0L),
        dlpiPhnum = 0u,
        dlpiAdds = 0uL,
        dlpiSubs = 0uL,
        dlpiTlsModid = 0uL,
        dlpiTlsDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Elf64Addr = this.dlpiAddr

    public operator fun component2(): ConstPtr<CChar> = this.dlpiName

    public operator fun component3(): ConstPtr<Elf64Phdr> = this.dlpiPhdr

    public operator fun component4(): Elf64Half = this.dlpiPhnum

    public operator fun component5(): CUlonglong = this.dlpiAdds

    public operator fun component6(): CUlonglong = this.dlpiSubs

    public operator fun component7(): SizeT = this.dlpiTlsModid

    public operator fun component8(): MutPtr<CVoid> = this.dlpiTlsData

    public fun copy(dlpiAddr: Elf64Addr = this.dlpiAddr, dlpiName: ConstPtr<CChar> = this.dlpiName, dlpiPhdr: ConstPtr<Elf64Phdr> = this.dlpiPhdr, dlpiPhnum: Elf64Half = this.dlpiPhnum, dlpiAdds: CUlonglong = this.dlpiAdds, dlpiSubs: CUlonglong = this.dlpiSubs, dlpiTlsModid: SizeT = this.dlpiTlsModid, dlpiTlsData: MutPtr<CVoid> = this.dlpiTlsData): DlPhdrInfo = DlPhdrInfo(dlpiAddr = dlpiAddr, dlpiNameCtorArg = dlpiName, dlpiPhdrCtorArg = dlpiPhdr, dlpiPhnum = dlpiPhnum, dlpiAdds = dlpiAdds, dlpiSubs = dlpiSubs, dlpiTlsModid = dlpiTlsModid, dlpiTlsDataCtorArg = dlpiTlsData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlPhdrInfo) return false
        if (this.dlpiAddr != other.dlpiAddr) return false
        if (this.dlpiName != other.dlpiName) return false
        if (this.dlpiPhdr != other.dlpiPhdr) return false
        if (this.dlpiPhnum != other.dlpiPhnum) return false
        if (this.dlpiAdds != other.dlpiAdds) return false
        if (this.dlpiSubs != other.dlpiSubs) return false
        if (this.dlpiTlsModid != other.dlpiTlsModid) return false
        if (this.dlpiTlsData != other.dlpiTlsData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dlpiAddr.hashCode()
        result = 31 * result + this.dlpiName.hashCode()
        result = 31 * result + this.dlpiPhdr.hashCode()
        result = 31 * result + this.dlpiPhnum.hashCode()
        result = 31 * result + this.dlpiAdds.hashCode()
        result = 31 * result + this.dlpiSubs.hashCode()
        result = 31 * result + this.dlpiTlsModid.hashCode()
        result = 31 * result + this.dlpiTlsData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlPhdrInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlPhdrInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): DlPhdrInfo =
                    DlPhdrInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Elf64Phdr>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: DlPhdrInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dlpiAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr + 8L, value.dlpiName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Elf64Phdr>(64)
                    ).writeNative(addr + 16L, value.dlpiPhdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.dlpiPhnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.dlpiAdds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.dlpiSubs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.dlpiTlsModid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 56L, value.dlpiTlsData)
                }
            }

        public operator fun invoke(
            dlpiAddr: Elf64Addr = 0uL,
            dlpiName: ConstPtr<CChar> = ConstPtr(0L),
            dlpiPhdr: ConstPtr<Elf64Phdr> = ConstPtr(0L),
            dlpiPhnum: Elf64Half = 0u,
            dlpiAdds: CUlonglong = 0uL,
            dlpiSubs: CUlonglong = 0uL,
            dlpiTlsModid: SizeT = 0uL,
            dlpiTlsData: MutPtr<CVoid> = MutPtr(0L),
        ): DlPhdrInfo =
            DlPhdrInfo(
                dlpiAddr = dlpiAddr,
                dlpiNameCtorArg = dlpiName,
                dlpiPhdrCtorArg = dlpiPhdr,
                dlpiPhnum = dlpiPhnum,
                dlpiAdds = dlpiAdds,
                dlpiSubs = dlpiSubs,
                dlpiTlsModid = dlpiTlsModid,
                dlpiTlsDataCtorArg = dlpiTlsData,
            )
    }
}

public data class Elf32Ehdr(
    public var eIdent: UByteArray = UByteArray(16),
    public var eType: Elf32Half = 0u,
    public var eMachine: Elf32Half = 0u,
    public var eVersion: Elf32Word = 0u,
    public var eEntry: Elf32Addr = 0u,
    public var ePhoff: Elf32Off = 0u,
    public var eShoff: Elf32Off = 0u,
    public var eFlags: Elf32Word = 0u,
    public var eEhsize: Elf32Half = 0u,
    public var ePhentsize: Elf32Half = 0u,
    public var ePhnum: Elf32Half = 0u,
    public var eShentsize: Elf32Half = 0u,
    public var eShnum: Elf32Half = 0u,
    public var eShstrndx: Elf32Half = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Elf32Ehdr) return false
        if (!this.eIdent.contentEquals(other.eIdent)) return false
        if (this.eType != other.eType) return false
        if (this.eMachine != other.eMachine) return false
        if (this.eVersion != other.eVersion) return false
        if (this.eEntry != other.eEntry) return false
        if (this.ePhoff != other.ePhoff) return false
        if (this.eShoff != other.eShoff) return false
        if (this.eFlags != other.eFlags) return false
        if (this.eEhsize != other.eEhsize) return false
        if (this.ePhentsize != other.ePhentsize) return false
        if (this.ePhnum != other.ePhnum) return false
        if (this.eShentsize != other.eShentsize) return false
        if (this.eShnum != other.eShnum) return false
        if (this.eShstrndx != other.eShstrndx) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eIdent.contentHashCode()
        result = 31 * result + this.eType.hashCode()
        result = 31 * result + this.eMachine.hashCode()
        result = 31 * result + this.eVersion.hashCode()
        result = 31 * result + this.eEntry.hashCode()
        result = 31 * result + this.ePhoff.hashCode()
        result = 31 * result + this.eShoff.hashCode()
        result = 31 * result + this.eFlags.hashCode()
        result = 31 * result + this.eEhsize.hashCode()
        result = 31 * result + this.ePhentsize.hashCode()
        result = 31 * result + this.ePhnum.hashCode()
        result = 31 * result + this.eShentsize.hashCode()
        result = 31 * result + this.eShnum.hashCode()
        result = 31 * result + this.eShstrndx.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Ehdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Ehdr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): Elf32Ehdr =
                    Elf32Ehdr(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 42L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 50L),
                    )
                override fun writeNative(addr: Long, value: Elf32Ehdr) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.eIdent.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.eType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.eMachine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.eVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.eEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.ePhoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.eShoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.eFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 40L, value.eEhsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 42L, value.ePhentsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 44L, value.ePhnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 46L, value.eShentsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 48L, value.eShnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 50L, value.eShstrndx)
                }
            }
    }
}

public data class Elf64Ehdr(
    public var eIdent: UByteArray = UByteArray(16),
    public var eType: Elf64Half = 0u,
    public var eMachine: Elf64Half = 0u,
    public var eVersion: Elf64Word = 0u,
    public var eEntry: Elf64Addr = 0uL,
    public var ePhoff: Elf64Off = 0uL,
    public var eShoff: Elf64Off = 0uL,
    public var eFlags: Elf64Word = 0u,
    public var eEhsize: Elf64Half = 0u,
    public var ePhentsize: Elf64Half = 0u,
    public var ePhnum: Elf64Half = 0u,
    public var eShentsize: Elf64Half = 0u,
    public var eShnum: Elf64Half = 0u,
    public var eShstrndx: Elf64Half = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Elf64Ehdr) return false
        if (!this.eIdent.contentEquals(other.eIdent)) return false
        if (this.eType != other.eType) return false
        if (this.eMachine != other.eMachine) return false
        if (this.eVersion != other.eVersion) return false
        if (this.eEntry != other.eEntry) return false
        if (this.ePhoff != other.ePhoff) return false
        if (this.eShoff != other.eShoff) return false
        if (this.eFlags != other.eFlags) return false
        if (this.eEhsize != other.eEhsize) return false
        if (this.ePhentsize != other.ePhentsize) return false
        if (this.ePhnum != other.ePhnum) return false
        if (this.eShentsize != other.eShentsize) return false
        if (this.eShnum != other.eShnum) return false
        if (this.eShstrndx != other.eShstrndx) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eIdent.contentHashCode()
        result = 31 * result + this.eType.hashCode()
        result = 31 * result + this.eMachine.hashCode()
        result = 31 * result + this.eVersion.hashCode()
        result = 31 * result + this.eEntry.hashCode()
        result = 31 * result + this.ePhoff.hashCode()
        result = 31 * result + this.eShoff.hashCode()
        result = 31 * result + this.eFlags.hashCode()
        result = 31 * result + this.eEhsize.hashCode()
        result = 31 * result + this.ePhentsize.hashCode()
        result = 31 * result + this.ePhnum.hashCode()
        result = 31 * result + this.eShentsize.hashCode()
        result = 31 * result + this.eShnum.hashCode()
        result = 31 * result + this.eShstrndx.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Ehdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Ehdr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): Elf64Ehdr =
                    Elf64Ehdr(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 54L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 58L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 62L),
                    )
                override fun writeNative(addr: Long, value: Elf64Ehdr) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.eIdent.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.eType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.eMachine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.eVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.eEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.ePhoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.eShoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.eFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 52L, value.eEhsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 54L, value.ePhentsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 56L, value.ePhnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 58L, value.eShentsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 60L, value.eShnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 62L, value.eShstrndx)
                }
            }
    }
}

public data class Elf32Sym(
    public var stName: Elf32Word = 0u,
    public var stValue: Elf32Addr = 0u,
    public var stSize: Elf32Word = 0u,
    public var stInfo: CUchar = 0u,
    public var stOther: CUchar = 0u,
    public var stShndx: Elf32Section = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Sym> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Sym> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Elf32Sym =
                    Elf32Sym(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: Elf32Sym) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.stName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.stValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.stSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.stInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.stOther)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.stShndx)
                }
            }
    }
}

public data class Elf64Sym(
    public var stName: Elf64Word = 0u,
    public var stInfo: CUchar = 0u,
    public var stOther: CUchar = 0u,
    public var stShndx: Elf64Section = 0u,
    public var stValue: Elf64Addr = 0uL,
    public var stSize: Elf64Xword = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Sym> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Sym> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Elf64Sym =
                    Elf64Sym(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Elf64Sym) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.stName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.stInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.stOther)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.stShndx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.stValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.stSize)
                }
            }
    }
}

public data class Elf32Phdr(
    public var pType: Elf32Word = 0u,
    public var pOffset: Elf32Off = 0u,
    public var pVaddr: Elf32Addr = 0u,
    public var pPaddr: Elf32Addr = 0u,
    public var pFilesz: Elf32Word = 0u,
    public var pMemsz: Elf32Word = 0u,
    public var pFlags: Elf32Word = 0u,
    public var pAlign: Elf32Word = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Phdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Phdr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Elf32Phdr =
                    Elf32Phdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Elf32Phdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pVaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.pPaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.pFilesz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.pMemsz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.pFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.pAlign)
                }
            }
    }
}

public data class Elf64Phdr(
    public var pType: Elf64Word = 0u,
    public var pFlags: Elf64Word = 0u,
    public var pOffset: Elf64Off = 0uL,
    public var pVaddr: Elf64Addr = 0uL,
    public var pPaddr: Elf64Addr = 0uL,
    public var pFilesz: Elf64Xword = 0uL,
    public var pMemsz: Elf64Xword = 0uL,
    public var pAlign: Elf64Xword = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Phdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Phdr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Elf64Phdr =
                    Elf64Phdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Elf64Phdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.pOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.pVaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.pPaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.pFilesz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.pMemsz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.pAlign)
                }
            }
    }
}

public data class Elf32Shdr(
    public var shName: Elf32Word = 0u,
    public var shType: Elf32Word = 0u,
    public var shFlags: Elf32Word = 0u,
    public var shAddr: Elf32Addr = 0u,
    public var shOffset: Elf32Off = 0u,
    public var shSize: Elf32Word = 0u,
    public var shLink: Elf32Word = 0u,
    public var shInfo: Elf32Word = 0u,
    public var shAddralign: Elf32Word = 0u,
    public var shEntsize: Elf32Word = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Shdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Shdr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Elf32Shdr =
                    Elf32Shdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: Elf32Shdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.shName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.shType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.shFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.shAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.shOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.shSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.shLink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.shInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.shAddralign)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.shEntsize)
                }
            }
    }
}

public data class Elf64Shdr(
    public var shName: Elf64Word = 0u,
    public var shType: Elf64Word = 0u,
    public var shFlags: Elf64Xword = 0uL,
    public var shAddr: Elf64Addr = 0uL,
    public var shOffset: Elf64Off = 0uL,
    public var shSize: Elf64Xword = 0uL,
    public var shLink: Elf64Word = 0u,
    public var shInfo: Elf64Word = 0u,
    public var shAddralign: Elf64Xword = 0uL,
    public var shEntsize: Elf64Xword = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Shdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Shdr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): Elf64Shdr =
                    Elf64Shdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: Elf64Shdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.shName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.shType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.shFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.shAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.shOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.shSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.shLink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.shInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.shAddralign)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.shEntsize)
                }
            }
    }
}

public data class CAnonymousElf32Rel(
    public var rOffset: Elf32Addr = 0u,
    public var rInfo: Elf32Word = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousElf32Rel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousElf32Rel> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CAnonymousElf32Rel =
                    CAnonymousElf32Rel(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CAnonymousElf32Rel) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.rInfo)
                }
            }
    }
}

public data class CAnonymousElf64Rel(
    public var rOffset: Elf64Addr = 0uL,
    public var rInfo: Elf64Xword = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousElf64Rel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousElf64Rel> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CAnonymousElf64Rel =
                    CAnonymousElf64Rel(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CAnonymousElf64Rel) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.rOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rInfo)
                }
            }
    }
}

public data class Ucred(
    public var pid: PidT = 0,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ucred> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ucred> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ucred =
                    Ucred(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Ucred) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.pid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.uid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.gid)
                }
            }
    }
}

public class Mntent internal constructor(
    mntFsnameCtorArg: MutPtr<CChar>,
    mntDirCtorArg: MutPtr<CChar>,
    mntTypeCtorArg: MutPtr<CChar>,
    mntOptsCtorArg: MutPtr<CChar>,
    public var mntFreq: CInt,
    public var mntPassno: CInt,
) {
    public var mntFsname: MutPtr<CChar> = mntFsnameCtorArg
        internal set

    public var mntDir: MutPtr<CChar> = mntDirCtorArg
        internal set

    public var mntType: MutPtr<CChar> = mntTypeCtorArg
        internal set

    public var mntOpts: MutPtr<CChar> = mntOptsCtorArg
        internal set

    public constructor() : this(
        mntFsnameCtorArg = MutPtr(0L),
        mntDirCtorArg = MutPtr(0L),
        mntTypeCtorArg = MutPtr(0L),
        mntOptsCtorArg = MutPtr(0L),
        mntFreq = 0,
        mntPassno = 0,
    )

    public operator fun component1(): MutPtr<CChar> = this.mntFsname

    public operator fun component2(): MutPtr<CChar> = this.mntDir

    public operator fun component3(): MutPtr<CChar> = this.mntType

    public operator fun component4(): MutPtr<CChar> = this.mntOpts

    public operator fun component5(): CInt = this.mntFreq

    public operator fun component6(): CInt = this.mntPassno

    public fun copy(mntFsname: MutPtr<CChar> = this.mntFsname, mntDir: MutPtr<CChar> = this.mntDir, mntType: MutPtr<CChar> = this.mntType, mntOpts: MutPtr<CChar> = this.mntOpts, mntFreq: CInt = this.mntFreq, mntPassno: CInt = this.mntPassno): Mntent = Mntent(mntFsnameCtorArg = mntFsname, mntDirCtorArg = mntDir, mntTypeCtorArg = mntType, mntOptsCtorArg = mntOpts, mntFreq = mntFreq, mntPassno = mntPassno)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mntent) return false
        if (this.mntFsname != other.mntFsname) return false
        if (this.mntDir != other.mntDir) return false
        if (this.mntType != other.mntType) return false
        if (this.mntOpts != other.mntOpts) return false
        if (this.mntFreq != other.mntFreq) return false
        if (this.mntPassno != other.mntPassno) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mntFsname.hashCode()
        result = 31 * result + this.mntDir.hashCode()
        result = 31 * result + this.mntType.hashCode()
        result = 31 * result + this.mntOpts.hashCode()
        result = 31 * result + this.mntFreq.hashCode()
        result = 31 * result + this.mntPassno.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mntent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mntent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Mntent =
                    Mntent(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: Mntent) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.mntFsname)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 8L, value.mntDir)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 16L, value.mntType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 24L, value.mntOpts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.mntFreq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.mntPassno)
                }
            }

        public operator fun invoke(
            mntFsname: MutPtr<CChar> = MutPtr(0L),
            mntDir: MutPtr<CChar> = MutPtr(0L),
            mntType: MutPtr<CChar> = MutPtr(0L),
            mntOpts: MutPtr<CChar> = MutPtr(0L),
            mntFreq: CInt = 0,
            mntPassno: CInt = 0,
        ): Mntent =
            Mntent(
                mntFsnameCtorArg = mntFsname,
                mntDirCtorArg = mntDir,
                mntTypeCtorArg = mntType,
                mntOptsCtorArg = mntOpts,
                mntFreq = mntFreq,
                mntPassno = mntPassno,
            )
    }
}

public data class In6Pktinfo(
    public var ipi6Addr: In6Addr = In6Addr(),
    public var ipi6Ifindex: CUint = 0u,
)

public data class ArpdRequest(
    public var req: CUshort = 0u,
    public var ip: UInt = 0u,
    public var dev: CUlong = 0uL,
    public var stamp: CUlong = 0uL,
    public var updated: CUlong = 0uL,
    public var ha: UByteArray = UByteArray(MAX_ADDR_LEN),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ArpdRequest) return false
        if (this.req != other.req) return false
        if (this.ip != other.ip) return false
        if (this.dev != other.dev) return false
        if (this.stamp != other.stamp) return false
        if (this.updated != other.updated) return false
        if (!this.ha.contentEquals(other.ha)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.req.hashCode()
        result = 31 * result + this.ip.hashCode()
        result = 31 * result + this.dev.hashCode()
        result = 31 * result + this.stamp.hashCode()
        result = 31 * result + this.updated.hashCode()
        result = 31 * result + this.ha.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArpdRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArpdRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((32L + ((MAX_ADDR_LEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override fun readNative(addr: Long): ArpdRequest =
                    ArpdRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (MAX_ADDR_LEN))
                        ).readNative(addr + 32L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ArpdRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.req)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.dev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.stamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.updated)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (MAX_ADDR_LEN))
                    ).writeNative(addr + 32L, value.ha.toList())
                }
            }
    }
}

public data class RegmatchT(
    public var rmSo: RegoffT = 0L,
    public var rmEo: RegoffT = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegmatchT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegmatchT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RegmatchT =
                    RegmatchT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RegmatchT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.rmSo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.rmEo)
                }
            }
    }
}

public class Option internal constructor(
    nameCtorArg: ConstPtr<CChar>,
    public var hasArg: CInt,
    flagCtorArg: MutPtr<CInt>,
    public var value: CInt,
) {
    public var name: ConstPtr<CChar> = nameCtorArg
        internal set

    public var flag: MutPtr<CInt> = flagCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = ConstPtr(0L),
        hasArg = 0,
        flagCtorArg = MutPtr(0L),
        value = 0,
    )

    public operator fun component1(): ConstPtr<CChar> = this.name

    public operator fun component2(): CInt = this.hasArg

    public operator fun component3(): MutPtr<CInt> = this.flag

    public operator fun component4(): CInt = this.value

    public fun copy(name: ConstPtr<CChar> = this.name, hasArg: CInt = this.hasArg, flag: MutPtr<CInt> = this.flag, value: CInt = this.value): Option = Option(nameCtorArg = name, hasArg = hasArg, flagCtorArg = flag, value = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Option) return false
        if (this.name != other.name) return false
        if (this.hasArg != other.hasArg) return false
        if (this.flag != other.flag) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.hasArg.hashCode()
        result = 31 * result + this.flag.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Option> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Option> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Option =
                    Option(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CInt>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Option) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr, value.name)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.hasArg)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CInt>(64)
                    ).writeNative(addr + 16L, value.flag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.value)
                }
            }

        public operator fun invoke(
            name: ConstPtr<CChar> = ConstPtr(0L),
            hasArg: CInt = 0,
            flag: MutPtr<CInt> = MutPtr(0L),
            value: CInt = 0,
        ): Option =
            Option(
                nameCtorArg = name,
                hasArg = hasArg,
                flagCtorArg = flag,
                value = value,
            )
    }
}

public data class Rlimit64(
    public var rlimCur: Rlim64T = 0uL,
    public var rlimMax: Rlim64T = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rlimit64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rlimit64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Rlimit64 =
                    Rlimit64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Rlimit64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.rlimCur)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rlimMax)
                }
            }
    }
}

public data class CAnonymousIfruMap(
    public var memStart: CUlong = 0uL,
    public var memEnd: CUlong = 0uL,
    public var baseAddr: CUshort = 0u,
    public var irq: CUchar = 0u,
    public var dma: CUchar = 0u,
    public var port: CUchar = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousIfruMap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousIfruMap> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CAnonymousIfruMap =
                    CAnonymousIfruMap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 19L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: CAnonymousIfruMap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.memStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.memEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.baseAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.irq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 19L, value.dma)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 20L, value.port)
                }
            }
    }
}

public data class Dirent(
    public var dIno: InoT = 0uL,
    public var dOff: OffT = 0L,
    public var dReclen: CUshort = 0u,
    public var dType: CUchar = 0u,
    public var dName: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dIno != other.dIno) return false
        if (this.dOff != other.dOff) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dType != other.dType) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dOff.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 280L
                override fun readNative(addr: Long): Dirent =
                    Dirent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 19L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Dirent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.dOff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.dReclen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.dType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 19L, value.dName.toList())
                }
            }
    }
}

public data class Dirent64(
    public var dIno: Ino64T = 0uL,
    public var dOff: Off64T = 0L,
    public var dReclen: CUshort = 0u,
    public var dType: CUchar = 0u,
    public var dName: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent64) return false
        if (this.dIno != other.dIno) return false
        if (this.dOff != other.dOff) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dType != other.dType) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dOff.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 280L
                override fun readNative(addr: Long): Dirent64 =
                    Dirent64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 19L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Dirent64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.dOff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.dReclen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.dType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 19L, value.dName.toList())
                }
            }
    }
}

public data class CAnonymousElf32Rela(
    public var rOffset: Elf32Addr = 0u,
    public var rInfo: Elf32Word = 0u,
    public var rAddend: Elf32Sword = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousElf32Rela> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousElf32Rela> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CAnonymousElf32Rela =
                    CAnonymousElf32Rela(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CAnonymousElf32Rela) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.rInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.rAddend)
                }
            }
    }
}

public data class CAnonymousElf64Rela(
    public var rOffset: Elf64Addr = 0uL,
    public var rInfo: Elf64Xword = 0uL,
    public var rAddend: Elf64Sxword = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousElf64Rela> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousElf64Rela> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CAnonymousElf64Rela =
                    CAnonymousElf64Rela(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CAnonymousElf64Rela) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.rOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.rAddend)
                }
            }
    }
}

public class CAnonymousIfrIfru internal constructor(
    public var ifruAddr: Sockaddr,
    public var ifruDstaddr: Sockaddr,
    public var ifruBroadaddr: Sockaddr,
    public var ifruNetmask: Sockaddr,
    public var ifruHwaddr: Sockaddr,
    public var ifruFlags: CShort,
    public var ifruIfindex: CInt,
    public var ifruMetric: CInt,
    public var ifruMtu: CInt,
    public var ifruMap: CAnonymousIfruMap,
    public var ifruSlave: UByteArray,
    public var ifruNewname: UByteArray,
    ifruDataCtorArg: MutPtr<CChar>,
) {
    public var ifruData: MutPtr<CChar> = ifruDataCtorArg
        internal set

    public constructor() : this(
        ifruAddr = Sockaddr(),
        ifruDstaddr = Sockaddr(),
        ifruBroadaddr = Sockaddr(),
        ifruNetmask = Sockaddr(),
        ifruHwaddr = Sockaddr(),
        ifruFlags = 0,
        ifruIfindex = 0,
        ifruMetric = 0,
        ifruMtu = 0,
        ifruMap = CAnonymousIfruMap(),
        ifruSlave = UByteArray(IFNAMSIZ.toInt()),
        ifruNewname = UByteArray(IFNAMSIZ.toInt()),
        ifruDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Sockaddr = this.ifruAddr

    public operator fun component2(): Sockaddr = this.ifruDstaddr

    public operator fun component3(): Sockaddr = this.ifruBroadaddr

    public operator fun component4(): Sockaddr = this.ifruNetmask

    public operator fun component5(): Sockaddr = this.ifruHwaddr

    public operator fun component6(): CShort = this.ifruFlags

    public operator fun component7(): CInt = this.ifruIfindex

    public operator fun component8(): CInt = this.ifruMetric

    public operator fun component9(): CInt = this.ifruMtu

    public operator fun component10(): CAnonymousIfruMap = this.ifruMap

    public operator fun component11(): UByteArray = this.ifruSlave

    public operator fun component12(): UByteArray = this.ifruNewname

    public operator fun component13(): MutPtr<CChar> = this.ifruData

    public fun copy(ifruAddr: Sockaddr = this.ifruAddr, ifruDstaddr: Sockaddr = this.ifruDstaddr, ifruBroadaddr: Sockaddr = this.ifruBroadaddr, ifruNetmask: Sockaddr = this.ifruNetmask, ifruHwaddr: Sockaddr = this.ifruHwaddr, ifruFlags: CShort = this.ifruFlags, ifruIfindex: CInt = this.ifruIfindex, ifruMetric: CInt = this.ifruMetric, ifruMtu: CInt = this.ifruMtu, ifruMap: CAnonymousIfruMap = this.ifruMap, ifruSlave: UByteArray = this.ifruSlave, ifruNewname: UByteArray = this.ifruNewname, ifruData: MutPtr<CChar> = this.ifruData): CAnonymousIfrIfru = CAnonymousIfrIfru(ifruAddr = ifruAddr, ifruDstaddr = ifruDstaddr, ifruBroadaddr = ifruBroadaddr, ifruNetmask = ifruNetmask, ifruHwaddr = ifruHwaddr, ifruFlags = ifruFlags, ifruIfindex = ifruIfindex, ifruMetric = ifruMetric, ifruMtu = ifruMtu, ifruMap = ifruMap, ifruSlave = ifruSlave, ifruNewname = ifruNewname, ifruDataCtorArg = ifruData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfrIfru) return false
        if (this.ifruAddr != other.ifruAddr) return false
        if (this.ifruDstaddr != other.ifruDstaddr) return false
        if (this.ifruBroadaddr != other.ifruBroadaddr) return false
        if (this.ifruNetmask != other.ifruNetmask) return false
        if (this.ifruHwaddr != other.ifruHwaddr) return false
        if (this.ifruFlags != other.ifruFlags) return false
        if (this.ifruIfindex != other.ifruIfindex) return false
        if (this.ifruMetric != other.ifruMetric) return false
        if (this.ifruMtu != other.ifruMtu) return false
        if (this.ifruMap != other.ifruMap) return false
        if (!this.ifruSlave.contentEquals(other.ifruSlave)) return false
        if (!this.ifruNewname.contentEquals(other.ifruNewname)) return false
        if (this.ifruData != other.ifruData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifruAddr.hashCode()
        result = 31 * result + this.ifruDstaddr.hashCode()
        result = 31 * result + this.ifruBroadaddr.hashCode()
        result = 31 * result + this.ifruNetmask.hashCode()
        result = 31 * result + this.ifruHwaddr.hashCode()
        result = 31 * result + this.ifruFlags.hashCode()
        result = 31 * result + this.ifruIfindex.hashCode()
        result = 31 * result + this.ifruMetric.hashCode()
        result = 31 * result + this.ifruMtu.hashCode()
        result = 31 * result + this.ifruMap.hashCode()
        result = 31 * result + this.ifruSlave.contentHashCode()
        result = 31 * result + this.ifruNewname.contentHashCode()
        result = 31 * result + this.ifruData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ifruAddr: Sockaddr = Sockaddr(),
            ifruDstaddr: Sockaddr = Sockaddr(),
            ifruBroadaddr: Sockaddr = Sockaddr(),
            ifruNetmask: Sockaddr = Sockaddr(),
            ifruHwaddr: Sockaddr = Sockaddr(),
            ifruFlags: CShort = 0,
            ifruIfindex: CInt = 0,
            ifruMetric: CInt = 0,
            ifruMtu: CInt = 0,
            ifruMap: CAnonymousIfruMap = CAnonymousIfruMap(),
            ifruSlave: UByteArray = UByteArray(IFNAMSIZ.toInt()),
            ifruNewname: UByteArray = UByteArray(IFNAMSIZ.toInt()),
            ifruData: MutPtr<CChar> = MutPtr(0L),
        ): CAnonymousIfrIfru =
            CAnonymousIfrIfru(
                ifruAddr = ifruAddr,
                ifruDstaddr = ifruDstaddr,
                ifruBroadaddr = ifruBroadaddr,
                ifruNetmask = ifruNetmask,
                ifruHwaddr = ifruHwaddr,
                ifruFlags = ifruFlags,
                ifruIfindex = ifruIfindex,
                ifruMetric = ifruMetric,
                ifruMtu = ifruMtu,
                ifruMap = ifruMap,
                ifruSlave = ifruSlave,
                ifruNewname = ifruNewname,
                ifruDataCtorArg = ifruData,
            )
    }
}

public data class Ifreq(
    /**
     * interface name, e.g. "en0"
     */
    public var ifrName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    public var ifrIfru: CAnonymousIfrIfru = CAnonymousIfrIfru(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifreq) return false
        if (!this.ifrName.contentEquals(other.ifrName)) return false
        if (this.ifrIfru != other.ifrIfru) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifrName.contentHashCode()
        result = 31 * result + this.ifrIfru.hashCode()
        return result
    }
}

public class CAnonymousIfcIfcu internal constructor(
    ifcuBufCtorArg: MutPtr<CChar>,
    ifcuReqCtorArg: MutPtr<Ifreq>,
) {
    public var ifcuBuf: MutPtr<CChar> = ifcuBufCtorArg
        internal set

    public var ifcuReq: MutPtr<Ifreq> = ifcuReqCtorArg
        internal set

    public constructor() : this(
        ifcuBufCtorArg = MutPtr(0L),
        ifcuReqCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CChar> = this.ifcuBuf

    public operator fun component2(): MutPtr<Ifreq> = this.ifcuReq

    public fun copy(ifcuBuf: MutPtr<CChar> = this.ifcuBuf, ifcuReq: MutPtr<Ifreq> = this.ifcuReq): CAnonymousIfcIfcu = CAnonymousIfcIfcu(ifcuBufCtorArg = ifcuBuf, ifcuReqCtorArg = ifcuReq)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfcIfcu) return false
        if (this.ifcuBuf != other.ifcuBuf) return false
        if (this.ifcuReq != other.ifcuReq) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifcuBuf.hashCode()
        result = 31 * result + this.ifcuReq.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ifcuBuf: MutPtr<CChar> = MutPtr(0L),
            ifcuReq: MutPtr<Ifreq> = MutPtr(0L),
        ): CAnonymousIfcIfcu =
            CAnonymousIfcIfcu(
                ifcuBufCtorArg = ifcuBuf,
                ifcuReqCtorArg = ifcuReq,
            )
    }
}

/**
 * Structure used in SIOCGIFCONF request.  Used to retrieve interface configuration for
 * machine (useful for programs which must know all networks accessible).
 */
public data class Ifconf(
    /**
     * Size of buffer
     */
    public var ifcLen: CInt = 0,
    public var ifcIfcu: CAnonymousIfcIfcu = CAnonymousIfcIfcu(),
)

public val DATE_BASE: NlItem = 0x20000

public val DATE_BASE1: NlItem = 768

public val ABDAY_1: NlItem = DATE_BASE

public val ABDAY_2: NlItem = DATE_BASE + 0x1

public val ABDAY_3: NlItem = DATE_BASE + 0x2

public val ABDAY_4: NlItem = DATE_BASE + 0x3

public val ABDAY_5: NlItem = DATE_BASE + 0x4

public val ABDAY_6: NlItem = DATE_BASE + 0x5

public val ABDAY_7: NlItem = DATE_BASE + 0x6

public val DAY_1: NlItem = DATE_BASE + 0x7

public val DAY_2: NlItem = DATE_BASE + 0x8

public val DAY_3: NlItem = DATE_BASE + 0x9

public val DAY_4: NlItem = DATE_BASE + 0xA

public val DAY_5: NlItem = DATE_BASE + 0xB

public val DAY_6: NlItem = DATE_BASE + 0xC

public val DAY_7: NlItem = DATE_BASE + 0xD

public val ABMON_1: NlItem = DATE_BASE + 0xE

public val ABMON_2: NlItem = DATE_BASE + 0xF

public val ABMON_3: NlItem = DATE_BASE + 0x10

public val ABMON_4: NlItem = DATE_BASE + 0x11

public val ABMON_5: NlItem = DATE_BASE + 0x12

public val ABMON_6: NlItem = DATE_BASE + 0x13

public val ABMON_7: NlItem = DATE_BASE + 0x14

public val ABMON_8: NlItem = DATE_BASE + 0x15

public val ABMON_9: NlItem = DATE_BASE + 0x16

public val ABMON_10: NlItem = DATE_BASE + 0x17

public val ABMON_11: NlItem = DATE_BASE + 0x18

public val ABMON_12: NlItem = DATE_BASE + 0x19

public val MON_1: NlItem = DATE_BASE + 0x1A

public val MON_2: NlItem = DATE_BASE + 0x1B

public val MON_3: NlItem = DATE_BASE + 0x1C

public val MON_4: NlItem = DATE_BASE + 0x1D

public val MON_5: NlItem = DATE_BASE + 0x1E

public val MON_6: NlItem = DATE_BASE + 0x1F

public val MON_7: NlItem = DATE_BASE + 0x20

public val MON_8: NlItem = DATE_BASE + 0x21

public val MON_9: NlItem = DATE_BASE + 0x22

public val MON_10: NlItem = DATE_BASE + 0x23

public val MON_11: NlItem = DATE_BASE + 0x24

public val MON_12: NlItem = DATE_BASE + 0x25

public val AM_STR: NlItem = DATE_BASE + 0x26

public val PM_STR: NlItem = DATE_BASE + 0x27

public val D_T_FMT: NlItem = DATE_BASE + 0x28

public val D_FMT: NlItem = DATE_BASE + 0x29

public val T_FMT: NlItem = DATE_BASE + 0x2A

public val T_FMT_AMPM: NlItem = DATE_BASE + 0x2B

public val ERA: NlItem = DATE_BASE + 0x2C

public val ERA_D_FMT: NlItem = DATE_BASE + 0x2E

public val ALT_DIGITS: NlItem = DATE_BASE + 0x2F

public val ERA_D_T_FMT: NlItem = DATE_BASE + 0x30

public val ERA_T_FMT: NlItem = DATE_BASE + 0x31

public val CODESET: NlItem = 14

public val CRNCYSTR: NlItem = 0x4000F

public val RADIXCHAR: NlItem = 0x10000

public val THOUSEP: NlItem = 0x10001

public val YESEXPR: NlItem = 0x50000

public val NOEXPR: NlItem = 0x50001

public val YESSTR: NlItem = 0x50002

public val NOSTR: NlItem = 0x50003

public val CODESET1: NlItem = 10

public val CRNCYSTR1: NlItem = 0x215

public val RADIXCHAR1: NlItem = 0x100

public val THOUSEP1: NlItem = 0x101

public val YESEXPR1: NlItem = 0x500

public val NOEXPR1: NlItem = 0x501

public val YESSTR1: NlItem = 0x502

public val NOSTR1: NlItem = 0x503

public val RUSAGE_CHILDREN: CInt = -1

public val L_TMPNAM: CUint = 20u

public val PC_LINK_MAX: CInt = 0

public val PC_MAX_CANON: CInt = 1

public val PC_MAX_INPUT: CInt = 2

public val PC_NAME_MAX: CInt = 3

public val PC_PATH_MAX: CInt = 4

public val PC_PIPE_BUF: CInt = 5

public val PC_CHOWN_RESTRICTED: CInt = 6

public val PC_NO_TRUNC: CInt = 7

public val PC_VDISABLE: CInt = 8

public val PC_SYNC_IO: CInt = 9

public val PC_ASYNC_IO: CInt = 10

public val PC_PRIO_IO: CInt = 11

public val PC_SOCK_MAXBUF: CInt = 12

public val PC_FILESIZEBITS: CInt = 13

public val PC_REC_INCR_XFER_SIZE: CInt = 14

public val PC_REC_MAX_XFER_SIZE: CInt = 15

public val PC_REC_MIN_XFER_SIZE: CInt = 16

public val PC_REC_XFER_ALIGN: CInt = 17

public val PC_ALLOC_SIZE_MIN: CInt = 18

public val PC_SYMLINK_MAX: CInt = 19

public val PC_2_SYMLINKS: CInt = 20

public val SC_ARG_MAX: CInt = 0

public val SC_CHILD_MAX: CInt = 1

public val SC_CLK_TCK: CInt = 2

public val SC_NGROUPS_MAX: CInt = 3

public val SC_OPEN_MAX: CInt = 4

public val SC_STREAM_MAX: CInt = 5

public val SC_TZNAME_MAX: CInt = 6

public val SC_JOB_CONTROL: CInt = 7

public val SC_SAVED_IDS: CInt = 8

public val SC_REALTIME_SIGNALS: CInt = 9

public val SC_PRIORITY_SCHEDULING: CInt = 10

public val SC_TIMERS: CInt = 11

public val SC_ASYNCHRONOUS_IO: CInt = 12

public val SC_PRIORITIZED_IO: CInt = 13

public val SC_SYNCHRONIZED_IO: CInt = 14

public val SC_FSYNC: CInt = 15

public val SC_MAPPED_FILES: CInt = 16

public val SC_MEMLOCK: CInt = 17

public val SC_MEMLOCK_RANGE: CInt = 18

public val SC_MEMORY_PROTECTION: CInt = 19

public val SC_MESSAGE_PASSING: CInt = 20

public val SC_SEMAPHORES: CInt = 21

public val SC_SHARED_MEMORY_OBJECTS: CInt = 22

public val SC_AIO_LISTIO_MAX: CInt = 23

public val SC_AIO_MAX: CInt = 24

public val SC_AIO_PRIO_DELTA_MAX: CInt = 25

public val SC_DELAYTIMER_MAX: CInt = 26

public val SC_MQ_OPEN_MAX: CInt = 27

public val SC_MQ_PRIO_MAX: CInt = 28

public val SC_VERSION: CInt = 29

public val SC_PAGESIZE: CInt = 30

public val SC_PAGE_SIZE: CInt = SC_PAGESIZE

public val SC_RTSIG_MAX: CInt = 31

public val SC_SEM_NSEMS_MAX: CInt = 32

public val SC_SEM_VALUE_MAX: CInt = 33

public val SC_SIGQUEUE_MAX: CInt = 34

public val SC_TIMER_MAX: CInt = 35

public val SC_BC_BASE_MAX: CInt = 36

public val SC_BC_DIM_MAX: CInt = 37

public val SC_BC_SCALE_MAX: CInt = 38

public val SC_BC_STRING_MAX: CInt = 39

public val SC_COLL_WEIGHTS_MAX: CInt = 40

public val SC_EXPR_NEST_MAX: CInt = 42

public val SC_LINE_MAX: CInt = 43

public val SC_RE_DUP_MAX: CInt = 44

public val SC_2_VERSION: CInt = 46

public val SC_2_C_BIND: CInt = 47

public val SC_2_C_DEV: CInt = 48

public val SC_2_FORT_DEV: CInt = 49

public val SC_2_FORT_RUN: CInt = 50

public val SC_2_SW_DEV: CInt = 51

public val SC_2_LOCALEDEF: CInt = 52

public val SC_UIO_MAXIOV: CInt = 60

public val SC_IOV_MAX: CInt = 60

public val SC_THREADS: CInt = 67

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 68

public val SC_GETGR_R_SIZE_MAX: CInt = 69

public val SC_GETPW_R_SIZE_MAX: CInt = 70

public val SC_LOGIN_NAME_MAX: CInt = 71

public val SC_TTY_NAME_MAX: CInt = 72

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 73

public val SC_THREAD_KEYS_MAX: CInt = 74

public val SC_THREAD_STACK_MIN: CInt = 75

public val SC_THREAD_THREADS_MAX: CInt = 76

public val SC_THREAD_ATTR_STACKADDR: CInt = 77

public val SC_THREAD_ATTR_STACKSIZE: CInt = 78

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 79

public val SC_THREAD_PRIO_INHERIT: CInt = 80

public val SC_THREAD_PRIO_PROTECT: CInt = 81

public val SC_THREAD_PROCESS_SHARED: CInt = 82

public val SC_NPROCESSORS_CONF: CInt = 83

public val SC_NPROCESSORS_ONLN: CInt = 84

public val SC_PHYS_PAGES: CInt = 85

public val SC_AVPHYS_PAGES: CInt = 86

public val SC_ATEXIT_MAX: CInt = 87

public val SC_PASS_MAX: CInt = 88

public val SC_XOPEN_VERSION: CInt = 89

public val SC_XOPEN_XCU_VERSION: CInt = 90

public val SC_XOPEN_UNIX: CInt = 91

public val SC_XOPEN_CRYPT: CInt = 92

public val SC_XOPEN_ENH_I18N: CInt = 93

public val SC_XOPEN_SHM: CInt = 94

public val SC_2_CHAR_TERM: CInt = 95

public val SC_2_UPE: CInt = 97

public val SC_XOPEN_XPG2: CInt = 98

public val SC_XOPEN_XPG3: CInt = 99

public val SC_XOPEN_XPG4: CInt = 100

public val SC_NZERO: CInt = 109

public val SC_XBS5_ILP32_OFF32: CInt = 125

public val SC_XBS5_ILP32_OFFBIG: CInt = 126

public val SC_XBS5_LP64_OFF64: CInt = 127

public val SC_XBS5_LPBIG_OFFBIG: CInt = 128

public val SC_XOPEN_LEGACY: CInt = 129

public val SC_XOPEN_REALTIME: CInt = 130

public val SC_XOPEN_REALTIME_THREADS: CInt = 131

public val SC_ADVISORY_INFO: CInt = 132

public val SC_BARRIERS: CInt = 133

public val SC_CLOCK_SELECTION: CInt = 137

public val SC_CPUTIME: CInt = 138

public val SC_THREAD_CPUTIME: CInt = 139

public val SC_MONOTONIC_CLOCK: CInt = 149

public val SC_READER_WRITER_LOCKS: CInt = 153

public val SC_SPIN_LOCKS: CInt = 154

public val SC_REGEXP: CInt = 155

public val SC_SHELL: CInt = 157

public val SC_SPAWN: CInt = 159

public val SC_SPORADIC_SERVER: CInt = 160

public val SC_THREAD_SPORADIC_SERVER: CInt = 161

public val SC_TIMEOUTS: CInt = 164

public val SC_TYPED_MEMORY_OBJECTS: CInt = 165

public val SC_2_PBS: CInt = 168

public val SC_2_PBS_ACCOUNTING: CInt = 169

public val SC_2_PBS_LOCATE: CInt = 170

public val SC_2_PBS_MESSAGE: CInt = 171

public val SC_2_PBS_TRACK: CInt = 172

public val SC_SYMLOOP_MAX: CInt = 173

public val SC_STREAMS: CInt = 174

public val SC_2_PBS_CHECKPOINT: CInt = 175

public val SC_V6_ILP32_OFF32: CInt = 176

public val SC_V6_ILP32_OFFBIG: CInt = 177

public val SC_V6_LP64_OFF64: CInt = 178

public val SC_V6_LPBIG_OFFBIG: CInt = 179

public val SC_HOST_NAME_MAX: CInt = 180

public val SC_TRACE: CInt = 181

public val SC_TRACE_EVENT_FILTER: CInt = 182

public val SC_TRACE_INHERIT: CInt = 183

public val SC_TRACE_LOG: CInt = 184

public val SC_IPV6: CInt = 235

public val SC_RAW_SOCKETS: CInt = 236

public val SC_V7_ILP32_OFF32: CInt = 237

public val SC_V7_ILP32_OFFBIG: CInt = 238

public val SC_V7_LP64_OFF64: CInt = 239

public val SC_V7_LPBIG_OFFBIG: CInt = 240

public val SC_SS_REPL_MAX: CInt = 241

public val SC_TRACE_EVENT_NAME_MAX: CInt = 242

public val SC_TRACE_NAME_MAX: CInt = 243

public val SC_TRACE_SYS_MAX: CInt = 244

public val SC_TRACE_USER_EVENT_MAX: CInt = 245

public val SC_XOPEN_STREAMS: CInt = 246

public val SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 247

public val SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 248

public val CS_PATH: CInt = 0

public val CS_POSIX_V6_WIDTH_RESTRICTED_ENVS: CInt = 1

public val CS_POSIX_V5_WIDTH_RESTRICTED_ENVS: CInt = 4

public val CS_POSIX_V7_WIDTH_RESTRICTED_ENVS: CInt = 5

public val CS_POSIX_V6_ILP32_OFF32_CFLAGS: CInt = 1116

public val CS_POSIX_V6_ILP32_OFF32_LDFLAGS: CInt = 1117

public val CS_POSIX_V6_ILP32_OFF32_LIBS: CInt = 1118

public val CS_POSIX_V6_ILP32_OFF32_LINTFLAGS: CInt = 1119

public val CS_POSIX_V6_ILP32_OFFBIG_CFLAGS: CInt = 1120

public val CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS: CInt = 1121

public val CS_POSIX_V6_ILP32_OFFBIG_LIBS: CInt = 1122

public val CS_POSIX_V6_ILP32_OFFBIG_LINTFLAGS: CInt = 1123

public val CS_POSIX_V6_LP64_OFF64_CFLAGS: CInt = 1124

public val CS_POSIX_V6_LP64_OFF64_LDFLAGS: CInt = 1125

public val CS_POSIX_V6_LP64_OFF64_LIBS: CInt = 1126

public val CS_POSIX_V6_LP64_OFF64_LINTFLAGS: CInt = 1127

public val CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS: CInt = 1128

public val CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS: CInt = 1129

public val CS_POSIX_V6_LPBIG_OFFBIG_LIBS: CInt = 1130

public val CS_POSIX_V6_LPBIG_OFFBIG_LINTFLAGS: CInt = 1131

public val CS_POSIX_V7_ILP32_OFF32_CFLAGS: CInt = 1132

public val CS_POSIX_V7_ILP32_OFF32_LDFLAGS: CInt = 1133

public val CS_POSIX_V7_ILP32_OFF32_LIBS: CInt = 1134

public val CS_POSIX_V7_ILP32_OFF32_LINTFLAGS: CInt = 1135

public val CS_POSIX_V7_ILP32_OFFBIG_CFLAGS: CInt = 1136

public val CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS: CInt = 1137

public val CS_POSIX_V7_ILP32_OFFBIG_LIBS: CInt = 1138

public val CS_POSIX_V7_ILP32_OFFBIG_LINTFLAGS: CInt = 1139

public val CS_POSIX_V7_LP64_OFF64_CFLAGS: CInt = 1140

public val CS_POSIX_V7_LP64_OFF64_LDFLAGS: CInt = 1141

public val CS_POSIX_V7_LP64_OFF64_LIBS: CInt = 1142

public val CS_POSIX_V7_LP64_OFF64_LINTFLAGS: CInt = 1143

public val CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS: CInt = 1144

public val CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS: CInt = 1145

public val CS_POSIX_V7_LPBIG_OFFBIG_LIBS: CInt = 1146

public val CS_POSIX_V7_LPBIG_OFFBIG_LINTFLAGS: CInt = 1147

public val RLIM_SAVED_MAX: RlimT = RLIM_INFINITY

public val RLIM_SAVED_CUR: RlimT = RLIM_INFINITY

// elf.h - Fields in the eIdent array.
public val EI_NIDENT: Int = 16

public val EI_MAG0: Int = 0

public val ELFMAG0: UByte = 0x7fu

public val EI_MAG1: Int = 1

public val ELFMAG1: UByte = 69u

public val EI_MAG2: Int = 2

public val ELFMAG2: UByte = 76u

public val EI_MAG3: Int = 3

public val ELFMAG3: UByte = 70u

public val SELFMAG: Int = 4

public val EI_CLASS: Int = 4

public val ELFCLASSNONE: UByte = 0u

public val ELFCLASS32: UByte = 1u

public val ELFCLASS64: UByte = 2u

public val ELFCLASSNUM: Int = 3

public val EI_DATA: Int = 5

public val ELFDATANONE: UByte = 0u

public val ELFDATA2LSB: UByte = 1u

public val ELFDATA2MSB: UByte = 2u

public val ELFDATANUM: Int = 3

public val EI_VERSION: Int = 6

public val EI_OSABI: Int = 7

public val ELFOSABI_NONE: UByte = 0u

public val ELFOSABI_SYSV: UByte = 0u

public val ELFOSABI_HPUX: UByte = 1u

public val ELFOSABI_NETBSD: UByte = 2u

public val ELFOSABI_GNU: UByte = 3u

public val ELFOSABI_LINUX: UByte = ELFOSABI_GNU

public val ELFOSABI_SOLARIS: UByte = 6u

public val ELFOSABI_AIX: UByte = 7u

public val ELFOSABI_IRIX: UByte = 8u

public val ELFOSABI_FREEBSD: UByte = 9u

public val ELFOSABI_TRU64: UByte = 10u

public val ELFOSABI_MODESTO: UByte = 11u

public val ELFOSABI_OPENBSD: UByte = 12u

public val ELFOSABI_ARM: UByte = 97u

public val ELFOSABI_STANDALONE: UByte = 255u

public val EI_ABIVERSION: Int = 8

public val EI_PAD: Int = 9

// elf.h - Legal values for eType (object file type).
public val ET_NONE: UShort = 0u

public val ET_REL: UShort = 1u

public val ET_EXEC: UShort = 2u

public val ET_DYN: UShort = 3u

public val ET_CORE: UShort = 4u

public val ET_NUM: UShort = 5u

public val ET_LOOS: UShort = 0xfe00u

public val ET_HIOS: UShort = 0xfeffu

public val ET_LOPROC: UShort = 0xff00u

public val ET_HIPROC: UShort = 0xffffu

// elf.h - Legal values for eMachine (architecture).
public val EM_NONE: UShort = 0u

public val EM_M32: UShort = 1u

public val EM_SPARC: UShort = 2u

public val EM_386: UShort = 3u

public val EM_68K: UShort = 4u

public val EM_88K: UShort = 5u

public val EM_860: UShort = 7u

public val EM_MIPS: UShort = 8u

public val EM_S370: UShort = 9u

public val EM_MIPS_RS3_LE: UShort = 10u

public val EM_PARISC: UShort = 15u

public val EM_VPP500: UShort = 17u

public val EM_SPARC32PLUS: UShort = 18u

public val EM_960: UShort = 19u

public val EM_PPC: UShort = 20u

public val EM_PPC64: UShort = 21u

public val EM_S390: UShort = 22u

public val EM_V800: UShort = 36u

public val EM_FR20: UShort = 37u

public val EM_RH32: UShort = 38u

public val EM_RCE: UShort = 39u

public val EM_ARM: UShort = 40u

public val EM_FAKE_ALPHA: UShort = 41u

public val EM_SH: UShort = 42u

public val EM_SPARCV9: UShort = 43u

public val EM_TRICORE: UShort = 44u

public val EM_ARC: UShort = 45u

public val EM_H8_300: UShort = 46u

public val EM_H8_300H: UShort = 47u

public val EM_H8S: UShort = 48u

public val EM_H8_500: UShort = 49u

public val EM_IA_64: UShort = 50u

public val EM_MIPS_X: UShort = 51u

public val EM_COLDFIRE: UShort = 52u

public val EM_68HC12: UShort = 53u

public val EM_MMA: UShort = 54u

public val EM_PCP: UShort = 55u

public val EM_NCPU: UShort = 56u

public val EM_NDR1: UShort = 57u

public val EM_STARCORE: UShort = 58u

public val EM_ME16: UShort = 59u

public val EM_ST100: UShort = 60u

public val EM_TINYJ: UShort = 61u

public val EM_X86_64: UShort = 62u

public val EM_PDSP: UShort = 63u

public val EM_FX66: UShort = 66u

public val EM_ST9PLUS: UShort = 67u

public val EM_ST7: UShort = 68u

public val EM_68HC16: UShort = 69u

public val EM_68HC11: UShort = 70u

public val EM_68HC08: UShort = 71u

public val EM_68HC05: UShort = 72u

public val EM_SVX: UShort = 73u

public val EM_ST19: UShort = 74u

public val EM_VAX: UShort = 75u

public val EM_CRIS: UShort = 76u

public val EM_JAVELIN: UShort = 77u

public val EM_FIREPATH: UShort = 78u

public val EM_ZSP: UShort = 79u

public val EM_MMIX: UShort = 80u

public val EM_HUANY: UShort = 81u

public val EM_PRISM: UShort = 82u

public val EM_AVR: UShort = 83u

public val EM_FR30: UShort = 84u

public val EM_D10V: UShort = 85u

public val EM_D30V: UShort = 86u

public val EM_V850: UShort = 87u

public val EM_M32R: UShort = 88u

public val EM_MN10300: UShort = 89u

public val EM_MN10200: UShort = 90u

public val EM_PJ: UShort = 91u

public val EM_OPENRISC: UShort = 92u

public val EM_OR1K: UShort = 92u

public val EM_ARC_A5: UShort = 93u

public val EM_XTENSA: UShort = 94u

public val EM_AARCH64: UShort = 183u

public val EM_TILEPRO: UShort = 188u

public val EM_TILEGX: UShort = 191u

public val EM_RISCV: UShort = 243u

public val EM_ALPHA: UShort = 0x9026u

// elf.h - Legal values for eVersion (version).
public val EV_NONE: UInt = 0u

public val EV_CURRENT: UInt = 1u

public val EV_NUM: UInt = 2u

// elf.h - Legal values for pType (segment type).
public val PT_NULL: UInt = 0u

public val PT_LOAD: UInt = 1u

public val PT_DYNAMIC: UInt = 2u

public val PT_INTERP: UInt = 3u

public val PT_NOTE: UInt = 4u

public val PT_SHLIB: UInt = 5u

public val PT_PHDR: UInt = 6u

public val PT_TLS: UInt = 7u

public val PT_NUM: UInt = 8u

public val PT_LOOS: UInt = 0x60000000u

public val PT_GNU_EH_FRAME: UInt = 0x6474e550u

public val PT_GNU_STACK: UInt = 0x6474e551u

public val PT_GNU_RELRO: UInt = 0x6474e552u

public val PT_LOSUNW: UInt = 0x6ffffffau

public val PT_SUNWBSS: UInt = 0x6ffffffau

public val PT_SUNWSTACK: UInt = 0x6ffffffbu

public val PT_HISUNW: UInt = 0x6fffffffu

public val PT_HIOS: UInt = 0x6fffffffu

public val PT_LOPROC: UInt = 0x70000000u

public val PT_HIPROC: UInt = 0x7fffffffu

// Legal values for pFlags (segment flags).
public val PF_X: UInt = 1u shl 0

public val PF_W: UInt = 1u shl 1

public val PF_R: UInt = 1u shl 2

public val PF_MASKOS: UInt = 0x0ff00000u

public val PF_MASKPROC: UInt = 0xf0000000u

// elf.h - Legal values for aType (entry type).
public val AT_NULL: CUlong = 0uL

public val AT_IGNORE: CUlong = 1uL

public val AT_EXECFD: CUlong = 2uL

public val AT_PHDR: CUlong = 3uL

public val AT_PHENT: CUlong = 4uL

public val AT_PHNUM: CUlong = 5uL

public val AT_PAGESZ: CUlong = 6uL

public val AT_BASE: CUlong = 7uL

public val AT_FLAGS: CUlong = 8uL

public val AT_ENTRY: CUlong = 9uL

public val AT_NOTELF: CUlong = 10uL

public val AT_UID: CUlong = 11uL

public val AT_EUID: CUlong = 12uL

public val AT_GID: CUlong = 13uL

public val AT_EGID: CUlong = 14uL

public val AT_PLATFORM: CUlong = 15uL

public val AT_HWCAP: CUlong = 16uL

public val AT_CLKTCK: CUlong = 17uL

public val AT_SECURE: CUlong = 23uL

public val AT_BASE_PLATFORM: CUlong = 24uL

public val AT_RANDOM: CUlong = 25uL

public val AT_HWCAP2: CUlong = 26uL

public val AT_HWCAP3: CUlong = 29uL

public val AT_HWCAP4: CUlong = 30uL

public val AT_EXECFN: CUlong = 31uL

// defined in arch/<arch>/include/uapi/asm/auxvec.h but has the same value
// wherever it is defined.
public val AT_SYSINFO_EHDR: CUlong = 33uL

public val AT_MINSIGSTKSZ: CUlong = 51uL

public val GLOB_ERR: CInt = 1 shl 0

public val GLOB_MARK: CInt = 1 shl 1

public val GLOB_NOSORT: CInt = 1 shl 2

public val GLOB_DOOFFS: CInt = 1 shl 3

public val GLOB_NOCHECK: CInt = 1 shl 4

public val GLOB_APPEND: CInt = 1 shl 5

public val GLOB_NOESCAPE: CInt = 1 shl 6

public val GLOB_NOSPACE: CInt = 1

public val GLOB_ABORTED: CInt = 2

public val GLOB_NOMATCH: CInt = 3

public val POSIX_MADV_NORMAL: CInt = 0

public val POSIX_MADV_RANDOM: CInt = 1

public val POSIX_MADV_SEQUENTIAL: CInt = 2

public val POSIX_MADV_WILLNEED: CInt = 3

public val POSIX_MADV_DONTNEED: CInt = 4

public val S_IEXEC: ModeT = 64u

public val S_IWRITE: ModeT = 128u

public val S_IREAD: ModeT = 256u

public val F_LOCK: CInt = 1

public val F_TEST: CInt = 3

public val F_TLOCK: CInt = 2

public val F_ULOCK: CInt = 0

public val ST_RDONLY: CUlong = 1uL

public val ST_NOSUID: CUlong = 2uL

public val ST_NODEV: CUlong = 4uL

public val ST_NOEXEC: CUlong = 8uL

public val ST_SYNCHRONOUS: CUlong = 16uL

public val ST_MANDLOCK: CUlong = 64uL

public val ST_WRITE: CUlong = 128uL

public val ST_APPEND: CUlong = 256uL

public val ST_IMMUTABLE: CUlong = 512uL

public val ST_NOATIME: CUlong = 1024uL

public val ST_NODIRATIME: CUlong = 2048uL

public val RTLD_NEXT: MutPtr<CVoid> = MutPtr<CVoid>((-1L))

public val RTLD_NODELETE: CInt = 0x1000

public val RTLD_NOW: CInt = 0x2

public val AT_EACCESS: CInt = 0x200

public val PTHREAD_BARRIER_SERIAL_THREAD: CInt = -1

public val PTHREAD_ONCE_INIT: PthreadOnceT = 0

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_RECURSIVE: CInt = 1

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val PTHREAD_MUTEX_STALLED: CInt = 0

public val PTHREAD_MUTEX_ROBUST: CInt = 1

public val PTHREAD_PRIO_NONE: CInt = 0

public val PTHREAD_PRIO_INHERIT: CInt = 1

public val PTHREAD_PRIO_PROTECT: CInt = 2

public val PTHREAD_PROCESS_PRIVATE: CInt = 0

public val PTHREAD_PROCESS_SHARED: CInt = 1

public val PTHREAD_INHERIT_SCHED: CInt = 0

public val PTHREAD_EXPLICIT_SCHED: CInt = 1

public val SIZEOF_PTHREAD_COND_T: Int = 48

// netinet/in.h
// NOTE: These are in addition to the constants defined in src/unix/mod.rs
public val IPPROTO_MAX: CInt = 256

// System V IPC
public val IPC_PRIVATE: KeyT = 0

public val IPC_CREAT: CInt = 512

public val IPC_EXCL: CInt = 1024

public val IPC_NOWAIT: CInt = 2048

public val IPC_RMID: CInt = 0

public val IPC_SET: CInt = 1

public val IPC_STAT: CInt =
    if (false) {
        0x102
    } else {
        2
    }

public val IPC_INFO: CInt = 3

public val SHM_R: CInt = 256

public val SHM_W: CInt = 128

public val SHM_RDONLY: CInt = 4096

public val SHM_RND: CInt = 8192

public val SHM_REMAP: CInt = 16384

public val SHM_LOCK: CInt = 11

public val SHM_UNLOCK: CInt = 12

public val SHM_HUGETLB: CInt = 2048

public val SHM_NORESERVE: CInt = 4096

public val LOG_NFACILITIES: CInt = 24

public val AI_PASSIVE: CInt = 0x0001

public val AI_CANONNAME: CInt = 0x0002

public val AI_NUMERICHOST: CInt = 0x0004

public val AI_V4MAPPED: CInt = 0x0008

public val AI_ALL: CInt = 0x0010

public val AI_ADDRCONFIG: CInt = 0x0020

public val AI_NUMERICSERV: CInt = 0x0400

public val EAI_BADFLAGS: CInt = -1

public val EAI_NONAME: CInt = -2

public val EAI_AGAIN: CInt = -3

public val EAI_FAIL: CInt = -4

public val EAI_NODATA: CInt = -5

public val EAI_FAMILY: CInt = -6

public val EAI_SOCKTYPE: CInt = -7

public val EAI_SERVICE: CInt = -8

public val EAI_MEMORY: CInt = -10

public val EAI_SYSTEM: CInt = -11

public val EAI_OVERFLOW: CInt = -12

public val NI_NUMERICHOST: CInt = 1

public val NI_NUMERICSERV: CInt = 2

public val NI_NOFQDN: CInt = 4

public val NI_NAMEREQD: CInt = 8

public val NI_DGRAM: CInt = 16

public val NI_IDN: CInt = 32

public val AIO_CANCELED: CInt = 0

public val AIO_NOTCANCELED: CInt = 1

public val AIO_ALLDONE: CInt = 2

public val LIO_READ: CInt = 0

public val LIO_WRITE: CInt = 1

public val LIO_NOP: CInt = 2

public val LIO_WAIT: CInt = 0

public val LIO_NOWAIT: CInt = 1

public val RUSAGE_THREAD: CInt = 1

public val MSG_COPY: CInt = 16384

public val SHM_EXEC: CInt = 32768

public val IPV6_MULTICAST_ALL: CInt = 29

public val IPV6_ROUTER_ALERT_ISOLATE: CInt = 30

public val PACKET_MR_UNICAST: CInt = 3

public val PTRACE_EVENT_STOP: CInt = 128

public val UDP_SEGMENT: CInt = 103

public val UDP_GRO: CInt = 104

public val PR_SET_PDEATHSIG: CInt = 1

public val PR_GET_PDEATHSIG: CInt = 2

public val PR_GET_DUMPABLE: CInt = 3

public val PR_SET_DUMPABLE: CInt = 4

public val PR_GET_UNALIGN: CInt = 5

public val PR_SET_UNALIGN: CInt = 6

public val PR_UNALIGN_NOPRINT: CInt = 1

public val PR_UNALIGN_SIGBUS: CInt = 2

public val PR_GET_KEEPCAPS: CInt = 7

public val PR_SET_KEEPCAPS: CInt = 8

public val PR_GET_FPEMU: CInt = 9

public val PR_SET_FPEMU: CInt = 10

public val PR_FPEMU_NOPRINT: CInt = 1

public val PR_FPEMU_SIGFPE: CInt = 2

public val PR_GET_FPEXC: CInt = 11

public val PR_SET_FPEXC: CInt = 12

public val PR_FP_EXC_SW_ENABLE: CInt = 0x80

public val PR_FP_EXC_DIV: CInt = 0x010000

public val PR_FP_EXC_OVF: CInt = 0x020000

public val PR_FP_EXC_UND: CInt = 0x040000

public val PR_FP_EXC_RES: CInt = 0x080000

public val PR_FP_EXC_INV: CInt = 0x100000

public val PR_FP_EXC_DISABLED: CInt = 0

public val PR_FP_EXC_NONRECOV: CInt = 1

public val PR_FP_EXC_ASYNC: CInt = 2

public val PR_FP_EXC_PRECISE: CInt = 3

public val PR_GET_TIMING: CInt = 13

public val PR_SET_TIMING: CInt = 14

public val PR_TIMING_STATISTICAL: CInt = 0

public val PR_TIMING_TIMESTAMP: CInt = 1

public val PR_SET_NAME: CInt = 15

public val PR_GET_NAME: CInt = 16

public val PR_GET_ENDIAN: CInt = 19

public val PR_SET_ENDIAN: CInt = 20

public val PR_ENDIAN_BIG: CInt = 0

public val PR_ENDIAN_LITTLE: CInt = 1

public val PR_ENDIAN_PPC_LITTLE: CInt = 2

public val PR_GET_SECCOMP: CInt = 21

public val PR_SET_SECCOMP: CInt = 22

public val PR_CAPBSET_READ: CInt = 23

public val PR_CAPBSET_DROP: CInt = 24

public val PR_GET_TSC: CInt = 25

public val PR_SET_TSC: CInt = 26

public val PR_TSC_ENABLE: CInt = 1

public val PR_TSC_SIGSEGV: CInt = 2

public val PR_GET_SECUREBITS: CInt = 27

public val PR_SET_SECUREBITS: CInt = 28

public val PR_SET_TIMERSLACK: CInt = 29

public val PR_GET_TIMERSLACK: CInt = 30

public val PR_TASK_PERF_EVENTS_DISABLE: CInt = 31

public val PR_TASK_PERF_EVENTS_ENABLE: CInt = 32

public val PR_MCE_KILL: CInt = 33

public val PR_MCE_KILL_CLEAR: CInt = 0

public val PR_MCE_KILL_SET: CInt = 1

public val PR_MCE_KILL_LATE: CInt = 0

public val PR_MCE_KILL_EARLY: CInt = 1

public val PR_MCE_KILL_DEFAULT: CInt = 2

public val PR_MCE_KILL_GET: CInt = 34

public val PR_SET_MM: CInt = 35

public val PR_SET_MM_START_CODE: CInt = 1

public val PR_SET_MM_END_CODE: CInt = 2

public val PR_SET_MM_START_DATA: CInt = 3

public val PR_SET_MM_END_DATA: CInt = 4

public val PR_SET_MM_START_STACK: CInt = 5

public val PR_SET_MM_START_BRK: CInt = 6

public val PR_SET_MM_BRK: CInt = 7

public val PR_SET_MM_ARG_START: CInt = 8

public val PR_SET_MM_ARG_END: CInt = 9

public val PR_SET_MM_ENV_START: CInt = 10

public val PR_SET_MM_ENV_END: CInt = 11

public val PR_SET_MM_AUXV: CInt = 12

public val PR_SET_MM_EXE_FILE: CInt = 13

public val PR_SET_MM_MAP: CInt = 14

public val PR_SET_MM_MAP_SIZE: CInt = 15

public val PR_SET_PTRACER: CInt = 0x59616d61

public val PR_SET_PTRACER_ANY: CUlong = 0xffffffffffffffffuL

public val PR_SET_CHILD_SUBREAPER: CInt = 36

public val PR_GET_CHILD_SUBREAPER: CInt = 37

public val PR_SET_NO_NEW_PRIVS: CInt = 38

public val PR_GET_NO_NEW_PRIVS: CInt = 39

public val PR_GET_TID_ADDRESS: CInt = 40

public val PR_SET_THP_DISABLE: CInt = 41

public val PR_GET_THP_DISABLE: CInt = 42

public val PR_MPX_ENABLE_MANAGEMENT: CInt = 43

public val PR_MPX_DISABLE_MANAGEMENT: CInt = 44

public val PR_SET_FP_MODE: CInt = 45

public val PR_GET_FP_MODE: CInt = 46

public val PR_FP_MODE_FR: CInt = 1 shl 0

public val PR_FP_MODE_FRE: CInt = 1 shl 1

public val PR_CAP_AMBIENT: CInt = 47

public val PR_CAP_AMBIENT_IS_SET: CInt = 1

public val PR_CAP_AMBIENT_RAISE: CInt = 2

public val PR_CAP_AMBIENT_LOWER: CInt = 3

public val PR_CAP_AMBIENT_CLEAR_ALL: CInt = 4

public val PR_SET_VMA: CInt = 0x53564d41

public val PR_SET_VMA_ANON_NAME: CInt = 0

public val PR_SCHED_CORE: CInt = 62

public val PR_SCHED_CORE_GET: CInt = 0

public val PR_SCHED_CORE_CREATE: CInt = 1

public val PR_SCHED_CORE_SHARE_TO: CInt = 2

public val PR_SCHED_CORE_SHARE_FROM: CInt = 3

public val PR_SCHED_CORE_MAX: CInt = 4

public val PR_SCHED_CORE_SCOPE_THREAD: CInt = 0

public val PR_SCHED_CORE_SCOPE_THREAD_GROUP: CInt = 1

public val PR_SCHED_CORE_SCOPE_PROCESS_GROUP: CInt = 2

public val ITIMER_REAL: CInt = 0

public val ITIMER_VIRTUAL: CInt = 1

public val ITIMER_PROF: CInt = 2

public val POSIX_VDISABLE: CcT = 0u

public val IPV6_RTHDR_LOOSE: CInt = 0

public val IPV6_RTHDR_STRICT: CInt = 1

public val IUTF8: TcflagT = 0x00004000u

public val CMSPAR: TcflagT = 1073741824u

public val MFD_CLOEXEC: CUint = 0x0001u

public val MFD_ALLOW_SEALING: CUint = 0x0002u

public val MFD_HUGETLB: CUint = 0x0004u

public val MFD_NOEXEC_SEAL: CUint = 0x0008u

public val MFD_EXEC: CUint = 0x0010u

public val MFD_HUGE_64KB: CUint = 0x40000000u

public val MFD_HUGE_512KB: CUint = 0x4c000000u

public val MFD_HUGE_1MB: CUint = 0x50000000u

public val MFD_HUGE_2MB: CUint = 0x54000000u

public val MFD_HUGE_8MB: CUint = 0x5c000000u

public val MFD_HUGE_16MB: CUint = 0x60000000u

public val MFD_HUGE_32MB: CUint = 0x64000000u

public val MFD_HUGE_256MB: CUint = 0x70000000u

public val MFD_HUGE_512MB: CUint = 0x74000000u

public val MFD_HUGE_1GB: CUint = 0x78000000u

public val MFD_HUGE_2GB: CUint = 0x7c000000u

public val MFD_HUGE_16GB: CUint = 0x88000000u

public val MFD_HUGE_MASK: CUint = 63u

public val MFD_HUGE_SHIFT: CUint = 26u

// linux/ifPacket.h
public val PACKET_HOST: CUchar = 0u

public val PACKET_BROADCAST: CUchar = 1u

public val PACKET_MULTICAST: CUchar = 2u

public val PACKET_OTHERHOST: CUchar = 3u

public val PACKET_OUTGOING: CUchar = 4u

public val PACKET_LOOPBACK: CUchar = 5u

public val PACKET_USER: CUchar = 6u

public val PACKET_KERNEL: CUchar = 7u

public val PACKET_ADD_MEMBERSHIP: CInt = 1

public val PACKET_DROP_MEMBERSHIP: CInt = 2

public val PACKET_RECV_OUTPUT: CInt = 3

public val PACKET_RX_RING: CInt = 5

public val PACKET_STATISTICS: CInt = 6

public val PACKET_COPY_THRESH: CInt = 7

public val PACKET_AUXDATA: CInt = 8

public val PACKET_ORIGDEV: CInt = 9

public val PACKET_VERSION: CInt = 10

public val PACKET_HDRLEN: CInt = 11

public val PACKET_RESERVE: CInt = 12

public val PACKET_TX_RING: CInt = 13

public val PACKET_LOSS: CInt = 14

public val PACKET_VNET_HDR: CInt = 15

public val PACKET_TX_TIMESTAMP: CInt = 16

public val PACKET_TIMESTAMP: CInt = 17

public val PACKET_MR_MULTICAST: CInt = 0

public val PACKET_MR_PROMISC: CInt = 1

public val PACKET_MR_ALLMULTI: CInt = 2

public val SIOCADDRT: CUlong = 0x0000890BuL

public val SIOCDELRT: CUlong = 0x0000890CuL

public val SIOCGIFNAME: CUlong = 0x00008910uL

public val SIOCSIFLINK: CUlong = 0x00008911uL

public val SIOCGIFCONF: CUlong = 0x00008912uL

public val SIOCGIFFLAGS: CUlong = 0x00008913uL

public val SIOCSIFFLAGS: CUlong = 0x00008914uL

public val SIOCGIFADDR: CUlong = 0x00008915uL

public val SIOCSIFADDR: CUlong = 0x00008916uL

public val SIOCGIFDSTADDR: CUlong = 0x00008917uL

public val SIOCSIFDSTADDR: CUlong = 0x00008918uL

public val SIOCGIFBRDADDR: CUlong = 0x00008919uL

public val SIOCSIFBRDADDR: CUlong = 0x0000891AuL

public val SIOCGIFNETMASK: CUlong = 0x0000891BuL

public val SIOCSIFNETMASK: CUlong = 0x0000891CuL

public val SIOCGIFMETRIC: CUlong = 0x0000891DuL

public val SIOCSIFMETRIC: CUlong = 0x0000891EuL

public val SIOCGIFMEM: CUlong = 0x0000891FuL

public val SIOCSIFMEM: CUlong = 0x00008920uL

public val SIOCGIFMTU: CUlong = 0x00008921uL

public val SIOCSIFMTU: CUlong = 0x00008922uL

public val SIOCSIFNAME: CUlong = 0x00008923uL

public val SIOCSIFHWADDR: CUlong = 0x00008924uL

public val SIOCGIFENCAP: CUlong = 0x00008925uL

public val SIOCSIFENCAP: CUlong = 0x00008926uL

public val SIOCGIFHWADDR: CUlong = 0x00008927uL

public val SIOCGIFSLAVE: CUlong = 0x00008929uL

public val SIOCSIFSLAVE: CUlong = 0x00008930uL

public val SIOCADDMULTI: CUlong = 0x00008931uL

public val SIOCDELMULTI: CUlong = 0x00008932uL

public val SIOCGIFINDEX: CUlong = 0x00008933uL

public val SIOGIFINDEX: CUlong = SIOCGIFINDEX

public val SIOCSIFPFLAGS: CUlong = 0x00008934uL

public val SIOCGIFPFLAGS: CUlong = 0x00008935uL

public val SIOCDIFADDR: CUlong = 0x00008936uL

public val SIOCSIFHWBROADCAST: CUlong = 0x00008937uL

public val SIOCGIFCOUNT: CUlong = 0x00008938uL

public val SIOCGIFBR: CUlong = 0x00008940uL

public val SIOCSIFBR: CUlong = 0x00008941uL

public val SIOCGIFTXQLEN: CUlong = 0x00008942uL

public val SIOCSIFTXQLEN: CUlong = 0x00008943uL

public val SIOCETHTOOL: CUlong = 0x00008946uL

public val SIOCGMIIPHY: CUlong = 0x00008947uL

public val SIOCGMIIREG: CUlong = 0x00008948uL

public val SIOCSMIIREG: CUlong = 0x00008949uL

public val SIOCWANDEV: CUlong = 0x0000894AuL

public val SIOCOUTQNSD: CUlong = 0x0000894BuL

public val SIOCGSKNS: CUlong = 0x0000894CuL

public val SIOCDARP: CUlong = 0x00008953uL

public val SIOCGARP: CUlong = 0x00008954uL

public val SIOCSARP: CUlong = 0x00008955uL

public val SIOCDRARP: CUlong = 0x00008960uL

public val SIOCGRARP: CUlong = 0x00008961uL

public val SIOCSRARP: CUlong = 0x00008962uL

public val SIOCGIFMAP: CUlong = 0x00008970uL

public val SIOCSIFMAP: CUlong = 0x00008971uL

public val IPTOS_TOS_MASK: UByte = 0x1Eu

public val IPTOS_PREC_MASK: UByte = 0xE0u

public val IPTOS_ECN_NOT_ECT: UByte = 0x00u

public val RTF_UP: CUshort = 0x0001u

public val RTF_GATEWAY: CUshort = 0x0002u

public val RTF_HOST: CUshort = 0x0004u

public val RTF_REINSTATE: CUshort = 0x0008u

public val RTF_DYNAMIC: CUshort = 0x0010u

public val RTF_MODIFIED: CUshort = 0x0020u

public val RTF_MTU: CUshort = 0x0040u

public val RTF_MSS: CUshort = RTF_MTU

public val RTF_WINDOW: CUshort = 0x0080u

public val RTF_IRTT: CUshort = 0x0100u

public val RTF_REJECT: CUshort = 0x0200u

public val RTF_STATIC: CUshort = 0x0400u

public val RTF_XRESOLVE: CUshort = 0x0800u

public val RTF_NOFORWARD: CUshort = 0x1000u

public val RTF_THROW: CUshort = 0x2000u

public val RTF_NOPMTUDISC: CUshort = 0x4000u

public val RTF_DEFAULT: UInt = 0x00010000u

public val RTF_ALLONLINK: UInt = 0x00020000u

public val RTF_ADDRCONF: UInt = 0x00040000u

public val RTF_LINKRT: UInt = 0x00100000u

public val RTF_NONEXTHOP: UInt = 0x00200000u

public val RTF_CACHE: UInt = 0x01000000u

public val RTF_FLOW: UInt = 0x02000000u

public val RTF_POLICY: UInt = 0x04000000u

public val RTCF_VALVE: UInt = 0x00200000u

public val RTCF_MASQ: UInt = 0x00400000u

public val RTCF_NAT: UInt = 0x00800000u

public val RTCF_DOREDIRECT: UInt = 0x01000000u

public val RTCF_LOG: UInt = 0x02000000u

public val RTCF_DIRECTSRC: UInt = 0x04000000u

public val RTF_LOCAL: UInt = 0x80000000u

public val RTF_INTERFACE: UInt = 0x40000000u

public val RTF_MULTICAST: UInt = 0x20000000u

public val RTF_BROADCAST: UInt = 0x10000000u

public val RTF_NAT: UInt = 0x08000000u

public val RTF_ADDRCLASSMASK: UInt = 0xF8000000u

public val RT_CLASS_UNSPEC: UByte = 0u

public val RT_CLASS_DEFAULT: UByte = 253u

public val RT_CLASS_MAIN: UByte = 254u

public val RT_CLASS_LOCAL: UByte = 255u

public val RT_CLASS_MAX: UByte = 255u

public val MAX_ADDR_LEN: Int = 7

public val ARPD_UPDATE: CUshort = 0x01u

public val ARPD_LOOKUP: CUshort = 0x02u

public val ARPD_FLUSH: CUshort = 0x03u

public val ATF_MAGIC: CInt = 0x80

// include/uapi/linux/udp.h
public val UDP_CORK: CInt = 1

public val UDP_ENCAP: CInt = 100

public val UDP_NO_CHECK6_TX: CInt = 101

public val UDP_NO_CHECK6_RX: CInt = 102

// include/uapi/asm-generic/mman-common.h
public val MAP_FIXED_NOREPLACE: CInt = 0x100000

public val MLOCK_ONFAULT: CUint = 0x01u

public val REG_EXTENDED: CInt = 1

public val REG_ICASE: CInt = 2

public val REG_NEWLINE: CInt = 4

public val REG_NOSUB: CInt = 8

public val REG_NOTBOL: CInt = 1

public val REG_NOTEOL: CInt = 2

public val REG_ENOSYS: CInt = -1

public val REG_NOMATCH: CInt = 1

public val REG_BADPAT: CInt = 2

public val REG_ECOLLATE: CInt = 3

public val REG_ECTYPE: CInt = 4

public val REG_EESCAPE: CInt = 5

public val REG_ESUBREG: CInt = 6

public val REG_EBRACK: CInt = 7

public val REG_EPAREN: CInt = 8

public val REG_EBRACE: CInt = 9

public val REG_BADBR: CInt = 10

public val REG_ERANGE: CInt = 11

public val REG_ESPACE: CInt = 12

public val REG_BADRPT: CInt = 13

// errno.h
public val EPERM: CInt = 1

public val ENOENT: CInt = 2

public val ESRCH: CInt = 3

public val EINTR: CInt = 4

public val EIO: CInt = 5

public val ENXIO: CInt = 6

public val E2BIG: CInt = 7

public val ENOEXEC: CInt = 8

public val EBADF: CInt = 9

public val ECHILD: CInt = 10

public val EAGAIN: CInt = 11

public val ENOMEM: CInt = 12

public val EACCES: CInt = 13

public val EFAULT: CInt = 14

public val ENOTBLK: CInt = 15

public val EBUSY: CInt = 16

public val EEXIST: CInt = 17

public val EXDEV: CInt = 18

public val ENODEV: CInt = 19

public val ENOTDIR: CInt = 20

public val EISDIR: CInt = 21

public val EINVAL: CInt = 22

public val ENFILE: CInt = 23

public val EMFILE: CInt = 24

public val ENOTTY: CInt = 25

public val ETXTBSY: CInt = 26

public val EFBIG: CInt = 27

public val ENOSPC: CInt = 28

public val ESPIPE: CInt = 29

public val EROFS: CInt = 30

public val EMLINK: CInt = 31

public val EPIPE: CInt = 32

public val EDOM: CInt = 33

public val ERANGE: CInt = 34

public val EWOULDBLOCK: CInt = EAGAIN

public val CSIGNAL: CInt = 0x000000ff

public val SCHED_NORMAL: CInt = 0

public val SCHED_OTHER: CInt = 0

public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

public val SCHED_BATCH: CInt = 3

public val SCHED_IDLE: CInt = 5

public val SCHED_DEADLINE: CInt = 6

public val SCHED_RESET_ON_FORK: CInt = 0x40000000

// elf.h
public val NT_PRSTATUS: CInt = 1

public val NT_PRFPREG: CInt = 2

public val NT_FPREGSET: CInt = 2

public val NT_PRPSINFO: CInt = 3

public val NT_PRXREG: CInt = 4

public val NT_TASKSTRUCT: CInt = 4

public val NT_PLATFORM: CInt = 5

public val NT_AUXV: CInt = 6

public val NT_GWINDOWS: CInt = 7

public val NT_ASRS: CInt = 8

public val NT_PSTATUS: CInt = 10

public val NT_PSINFO: CInt = 13

public val NT_PRCRED: CInt = 14

public val NT_UTSNAME: CInt = 15

public val NT_LWPSTATUS: CInt = 16

public val NT_LWPSINFO: CInt = 17

public val NT_PRFPXREG: CInt = 20

public val MS_NOUSER: CUlong = 0xffffffff80000000uL

public val RTLD_DEFAULT: MutPtr<CVoid> = MutPtr(0L)

public val SEM_FAILED: MutPtr<SemT> = MutPtr(0L)

public fun cmsgNxthdr(mhdr: ConstPtr<Msghdr>, cmsg: ConstPtr<Cmsghdr>): MutPtr<Cmsghdr> {
    if ((((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt()) < sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        return MutPtr<Cmsghdr>(0L)
    }
    // Note(msrv): `.wrappingByteAdd()` stabilized in 1.75
    val nextCmsg = ConstPtr<Cmsghdr>((ConstPtr<CVoid>((ConstPtr<UByte>((cmsg).rawAddress)).rawAddress + ((cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong() * (PrimitiveLayouts.U8).strideBytes))).rawAddress)
    // In case the addition wrapped. `nextAddr> maxAddr`
    // would otherwise not work as intended.
    if ((nextCmsg.rawAddress.toInt()) < (cmsg.rawAddress.toInt())) {
        return MutPtr(0L)
    }
    var maxAddr = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()
    if (false) {
        // musl and some of its descendants do `>= maxAddr`
        // comparisons in the if statement below.
        // https://www.openwall.com/lists/musl/2025/12/27/1
        maxAddr -= 1
    }
    return if (nextCmsg.rawAddress.toInt() + sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()) > maxAddr) {
        MutPtr<Cmsghdr>(0L)
    } else {
        MutPtr<Cmsghdr>(nextCmsg.rawAddress, nextCmsg.rawMeta)
    }
}

public fun cpuAllocSize(count: CInt): SizeT {
    val dummy: CpuSetT? = null
    val sizeInBits = 8 * sizeOfVal(dummy!!.bits[0], PrimitiveLayouts.U64)
    return ((count.toULong() + sizeInBits.toULong() - 1uL) / 8uL)
}

public fun cpuZero(cpuset: CpuSetT) {
    for (idx in cpuset.bits.indices) {
        cpuset.bits[idx] = 0uL
    }
}

public fun cpuSet(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] or (1uL shl offset)
}

public fun cpuClr(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] and (1uL shl offset).inv()
}

public fun cpuIsset(cpu: Int, cpuset: CpuSetT): Boolean {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    return 0uL != (cpuset.bits[idx] and (1uL shl offset))
}

public fun cpuCountS(size: Int, cpuset: CpuSetT): CInt {
    var s: UInt = 0u
    val sizeOfMask = sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    for (i in ((cpuset.bits).slice(0 until (size / sizeOfMask)))) {
        s += i.countOneBits().toUInt()
    }
    return s.toInt()
}

public fun cpuCount(cpuset: CpuSetT): CInt = cpuCountS(sizeOf<CpuSetT>(typeLayoutT = CpuSetT.typeLayout()), cpuset)

public fun cpuEqual(set1: CpuSetT, set2: CpuSetT): Boolean = set1.bits.contentEquals(set2.bits)

public fun iptosTos(tos: UByte): UByte = tos and IPTOS_TOS_MASK

public fun iptosPrec(tos: UByte): UByte = tos and IPTOS_PREC_MASK

public fun rtTos(tos: UByte): UByte = tos and IPTOS_TOS_MASK

public fun rtAddrclass(flags: UInt): UInt = flags shr 23

public fun rtLocaladdr(flags: UInt): Boolean = (flags and RTF_ADDRCLASSMASK) == (RTF_LOCAL or RTF_INTERFACE)

public fun elf32RSym(value: Elf32Word): Elf32Word = value shr 8

public fun elf32RType(value: Elf32Word): Elf32Word = value and 0xffu

public fun elf32RInfo(sym: Elf32Word, t: Elf32Word): Elf32Word = sym shl (8u + t).toInt() and 0xffu

public fun elf64RSym(value: Elf64Xword): Elf64Xword = value shr 32

public fun elf64RType(value: Elf64Xword): Elf64Xword = value and 0xffffffffuL

public fun elf64RInfo(sym: Elf64Xword, t: Elf64Xword): Elf64Xword = sym shl (32uL + t).toInt()

public fun makedev(major: CUint, minor: CUint): DevT {
    val major1 = major.toULong()
    val minor1 = minor.toULong()
    var dev = 0uL
    dev = dev or ((major1 and 0x00000fffuL) shl 8)
    dev = dev or ((major1 and 0xfffff000uL) shl 32)
    dev = dev or ((minor1 and 0x000000ffuL) shl 0)
    dev = dev or ((minor1 and 0xffffff00uL) shl 12)
    return dev
}

public fun major(dev: DevT): CUint {
    var major = 0uL
    major = major or ((dev and 0x00000000000fff00uL) shr 8)
    major = major or ((dev and 0xfffff00000000000uL) shr 32)
    return major.toUInt()
}

public fun minor(dev: DevT): CUint {
    var minor = 0uL
    minor = minor or ((dev and 0x00000000000000ffuL) shr 0)
    minor = minor or ((dev and 0x00000ffffff00000uL) shr 12)
    return minor.toUInt()
}

public expect fun iopl(level: CInt): CInt

public expect fun ioperm(from: CUlong, num: CUlong, turnOn: CInt): CInt

public expect fun aioRead(aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioError(aiocbp: ConstPtr<Aiocb>): CInt

public expect fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT

public expect fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt

public expect fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt

public expect fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt

public expect fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT

public expect fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt

public expect fun getloadavg(loadavg: MutPtr<CDouble>, nelem: CInt): CInt

public expect fun processVmReadv(pid: PidT, localIov: ConstPtr<Iovec>, liovcnt: CUlong, remoteIov: ConstPtr<Iovec>, riovcnt: CUlong, flags: CUlong): Long

public expect fun processVmWritev(pid: PidT, localIov: ConstPtr<Iovec>, liovcnt: CUlong, remoteIov: ConstPtr<Iovec>, riovcnt: CUlong, flags: CUlong): Long

public expect fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun drand48(): CDouble

public expect fun erand48(xseed: MutPtr<CUshort>): CDouble

public expect fun lrand48(): CLong

public expect fun nrand48(xseed: MutPtr<CUshort>): CLong

public expect fun jrand48(xseed: MutPtr<CUshort>): CLong

public expect fun srand48(seed: CLong)

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): MutPtr<Passwd>

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): MutPtr<Group>

public expect fun setspent()

public expect fun endspent()

public expect fun getspent(): MutPtr<Spwd>

public expect fun getspnam(name: ConstPtr<CChar>): MutPtr<Spwd>

// System V IPC
public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid>

public expect fun shmdt(shmaddr: ConstPtr<CVoid>): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt

public expect fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt

public expect fun errnoLocation(): MutPtr<CInt>

// Not available now on Android
public expect fun mremap(addr: MutPtr<CVoid>, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr<CVoid>

public expect fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt

public expect fun globfree(pglob: MutPtr<GlobT>)

public expect fun seekdir(dirp: MutPtr<DIR>, loc: CLong)

public expect fun telldir(dirp: MutPtr<DIR>): CLong

public expect fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT

public expect fun nlLanginfo(item: NlItem): MutPtr<CChar>

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar>

public expect fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt

public expect fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt

public expect fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt

public expect fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, fstype: ConstPtr<CChar>, flags: CUlong, data: ConstPtr<CVoid>): CInt

public expect fun prctl(option: CInt, vararg variadicArgs: Long): CInt

public expect fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt

public expect fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun sysinfo(info: MutPtr<Sysinfo>): CInt

public expect fun sigsuspend(mask: ConstPtr<SigsetT>): CInt

public expect fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun semClose(sem: MutPtr<SemT>): CInt

public expect fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt

public expect fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT>

public expect fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group>

public expect fun semUnlink(name: ConstPtr<CChar>): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt

public expect fun getgrgid(gid: GidT): MutPtr<Group>

public expect fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt

public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt

public expect fun setmntent(filename: ConstPtr<CChar>, ty: ConstPtr<CChar>): MutPtr<FILE>

public expect fun getmntent(stream: MutPtr<FILE>): MutPtr<Mntent>

public expect fun addmntent(stream: MutPtr<FILE>, mnt: ConstPtr<Mntent>): CInt

public expect fun endmntent(streamp: MutPtr<FILE>): CInt

public expect fun hasmntopt(mnt: ConstPtr<Mntent>, opt: ConstPtr<CChar>): MutPtr<CChar>

public expect fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt

public expect fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT

public expect fun regfree(preg: MutPtr<RegexT>)

public expect fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT

public expect fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT

public expect fun iconvClose(cd: IconvT): CInt

public expect fun gettid(): PidT

public expect fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, currValue: MutPtr<Itimerspec>): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt

public expect fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid>

public expect fun schedGetcpu(): CInt

public expect fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt

public expect fun copyFileRange(fdIn: CInt, offIn: MutPtr<Off64T>, fdOut: CInt, offOut: MutPtr<Off64T>, len: SizeT, flags: CUint): SsizeT

public expect fun freopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE>

public expect fun fseeko64(stream: MutPtr<FILE>, offset: Off64T, whence: CInt): CInt

public expect fun fsetpos64(stream: MutPtr<FILE>, ptr: ConstPtr<Fpos64T>): CInt

public expect fun ftello64(stream: MutPtr<FILE>): Off64T
