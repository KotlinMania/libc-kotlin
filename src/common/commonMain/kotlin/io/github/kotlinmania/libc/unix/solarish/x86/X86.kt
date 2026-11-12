// port-lint: source unix/solarish/x86.rs
package io.github.kotlinmania.libc.unix.solarish.x86

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr

public typealias Elf32Addr = CUlong

public typealias Elf32Half = CUshort

public typealias Elf32Off = CUlong

public typealias Elf32Sword = CLong

public typealias Elf32Word = CUlong

public typealias Elf32Lword = CUlonglong

public typealias Elf32Phdr = CAnonymousElf32Phdr

public data class CAnonymousElf32Phdr(
    public var pType: Elf32Word = 0uL,
    public var pOffset: Elf32Off = 0uL,
    public var pVaddr: Elf32Addr = 0uL,
    public var pPaddr: Elf32Addr = 0uL,
    public var pFilesz: Elf32Word = 0uL,
    public var pMemsz: Elf32Word = 0uL,
    public var pFlags: Elf32Word = 0uL,
    public var pAlign: Elf32Word = 0uL,
)

public class DlPhdrInfo internal constructor(
    public var dlpiAddr: Elf32Addr,
    dlpiNameCtorArg: ConstPtr<CChar>,
    dlpiPhdrCtorArg: ConstPtr<Elf32Phdr>,
    public var dlpiPhnum: Elf32Half,
    public var dlpiAdds: CUlonglong,
    public var dlpiSubs: CUlonglong,
) {
    public var dlpiName: ConstPtr<CChar> = dlpiNameCtorArg
        internal set

    public var dlpiPhdr: ConstPtr<Elf32Phdr> = dlpiPhdrCtorArg
        internal set

    public constructor() : this(
        dlpiAddr = 0uL,
        dlpiNameCtorArg = ConstPtr(0L),
        dlpiPhdrCtorArg = ConstPtr(0L),
        dlpiPhnum = 0u,
        dlpiAdds = 0uL,
        dlpiSubs = 0uL,
    )

    public operator fun component1(): Elf32Addr = this.dlpiAddr

    public operator fun component2(): ConstPtr<CChar> = this.dlpiName

    public operator fun component3(): ConstPtr<Elf32Phdr> = this.dlpiPhdr

    public operator fun component4(): Elf32Half = this.dlpiPhnum

    public operator fun component5(): CUlonglong = this.dlpiAdds

    public operator fun component6(): CUlonglong = this.dlpiSubs

    public fun copy(dlpiAddr: Elf32Addr = this.dlpiAddr, dlpiName: ConstPtr<CChar> = this.dlpiName, dlpiPhdr: ConstPtr<Elf32Phdr> = this.dlpiPhdr, dlpiPhnum: Elf32Half = this.dlpiPhnum, dlpiAdds: CUlonglong = this.dlpiAdds, dlpiSubs: CUlonglong = this.dlpiSubs): DlPhdrInfo = DlPhdrInfo(dlpiAddr = dlpiAddr, dlpiNameCtorArg = dlpiName, dlpiPhdrCtorArg = dlpiPhdr, dlpiPhnum = dlpiPhnum, dlpiAdds = dlpiAdds, dlpiSubs = dlpiSubs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlPhdrInfo) return false
        if (this.dlpiAddr != other.dlpiAddr) return false
        if (this.dlpiName != other.dlpiName) return false
        if (this.dlpiPhdr != other.dlpiPhdr) return false
        if (this.dlpiPhnum != other.dlpiPhnum) return false
        if (this.dlpiAdds != other.dlpiAdds) return false
        if (this.dlpiSubs != other.dlpiSubs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dlpiAddr.hashCode()
        result = 31 * result + this.dlpiName.hashCode()
        result = 31 * result + this.dlpiPhdr.hashCode()
        result = 31 * result + this.dlpiPhnum.hashCode()
        result = 31 * result + this.dlpiAdds.hashCode()
        result = 31 * result + this.dlpiSubs.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dlpiAddr: Elf32Addr = 0uL,
            dlpiName: ConstPtr<CChar> = ConstPtr(0L),
            dlpiPhdr: ConstPtr<Elf32Phdr> = ConstPtr(0L),
            dlpiPhnum: Elf32Half = 0u,
            dlpiAdds: CUlonglong = 0uL,
            dlpiSubs: CUlonglong = 0uL,
        ): DlPhdrInfo =
            DlPhdrInfo(
                dlpiAddr = dlpiAddr,
                dlpiNameCtorArg = dlpiName,
                dlpiPhdrCtorArg = dlpiPhdr,
                dlpiPhnum = dlpiPhnum,
                dlpiAdds = dlpiAdds,
                dlpiSubs = dlpiSubs,
            )
    }
}
