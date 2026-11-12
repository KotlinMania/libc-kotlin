// port-lint: source new/nto/net/if_.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.nto.net.ifbranch

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.unix.IFNAMSIZ
import io.github.kotlinmania.libc.unix.nto.Sockaddr
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public class CAnonymousIfrIfru internal constructor(
    public var ifruAddr: Sockaddr,
    public var ifruDstaddr: Sockaddr,
    public var ifruBroadaddr: Sockaddr,
    public var ifruBuffer: IfreqBuffer,
    public var ifruFlags: ShortArray,
    public var ifruIndex: CShort,
    public var ifruJid: CInt,
    public var ifruMetric: CInt,
    public var ifruMtu: CInt,
    public var ifruPhys: CInt,
    public var ifruMedia: CInt,
    ifruDataCtorArg: MutPtr<CChar>,
    public var ifruCap: IntArray,
    public var ifruFib: CUint,
    public var ifruVlanPcp: CUchar,
) {
    public var ifruData: MutPtr<CChar> = ifruDataCtorArg
        internal set

    public constructor() : this(
        ifruAddr = Sockaddr(),
        ifruDstaddr = Sockaddr(),
        ifruBroadaddr = Sockaddr(),
        ifruBuffer = IfreqBuffer(),
        ifruFlags = ShortArray(2),
        ifruIndex = 0,
        ifruJid = 0,
        ifruMetric = 0,
        ifruMtu = 0,
        ifruPhys = 0,
        ifruMedia = 0,
        ifruDataCtorArg = MutPtr(0L),
        ifruCap = IntArray(2),
        ifruFib = 0u,
        ifruVlanPcp = 0u,
    )

    public operator fun component1(): Sockaddr = this.ifruAddr

    public operator fun component2(): Sockaddr = this.ifruDstaddr

    public operator fun component3(): Sockaddr = this.ifruBroadaddr

    public operator fun component4(): IfreqBuffer = this.ifruBuffer

    public operator fun component5(): ShortArray = this.ifruFlags

    public operator fun component6(): CShort = this.ifruIndex

    public operator fun component7(): CInt = this.ifruJid

    public operator fun component8(): CInt = this.ifruMetric

    public operator fun component9(): CInt = this.ifruMtu

    public operator fun component10(): CInt = this.ifruPhys

    public operator fun component11(): CInt = this.ifruMedia

    public operator fun component12(): MutPtr<CChar> = this.ifruData

    public operator fun component13(): IntArray = this.ifruCap

    public operator fun component14(): CUint = this.ifruFib

    public operator fun component15(): CUchar = this.ifruVlanPcp

    public fun copy(ifruAddr: Sockaddr = this.ifruAddr, ifruDstaddr: Sockaddr = this.ifruDstaddr, ifruBroadaddr: Sockaddr = this.ifruBroadaddr, ifruBuffer: IfreqBuffer = this.ifruBuffer, ifruFlags: ShortArray = this.ifruFlags, ifruIndex: CShort = this.ifruIndex, ifruJid: CInt = this.ifruJid, ifruMetric: CInt = this.ifruMetric, ifruMtu: CInt = this.ifruMtu, ifruPhys: CInt = this.ifruPhys, ifruMedia: CInt = this.ifruMedia, ifruData: MutPtr<CChar> = this.ifruData, ifruCap: IntArray = this.ifruCap, ifruFib: CUint = this.ifruFib, ifruVlanPcp: CUchar = this.ifruVlanPcp): CAnonymousIfrIfru = CAnonymousIfrIfru(ifruAddr = ifruAddr, ifruDstaddr = ifruDstaddr, ifruBroadaddr = ifruBroadaddr, ifruBuffer = ifruBuffer, ifruFlags = ifruFlags, ifruIndex = ifruIndex, ifruJid = ifruJid, ifruMetric = ifruMetric, ifruMtu = ifruMtu, ifruPhys = ifruPhys, ifruMedia = ifruMedia, ifruDataCtorArg = ifruData, ifruCap = ifruCap, ifruFib = ifruFib, ifruVlanPcp = ifruVlanPcp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfrIfru) return false
        if (this.ifruAddr != other.ifruAddr) return false
        if (this.ifruDstaddr != other.ifruDstaddr) return false
        if (this.ifruBroadaddr != other.ifruBroadaddr) return false
        if (this.ifruBuffer != other.ifruBuffer) return false
        if (!this.ifruFlags.contentEquals(other.ifruFlags)) return false
        if (this.ifruIndex != other.ifruIndex) return false
        if (this.ifruJid != other.ifruJid) return false
        if (this.ifruMetric != other.ifruMetric) return false
        if (this.ifruMtu != other.ifruMtu) return false
        if (this.ifruPhys != other.ifruPhys) return false
        if (this.ifruMedia != other.ifruMedia) return false
        if (this.ifruData != other.ifruData) return false
        if (!this.ifruCap.contentEquals(other.ifruCap)) return false
        if (this.ifruFib != other.ifruFib) return false
        if (this.ifruVlanPcp != other.ifruVlanPcp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifruAddr.hashCode()
        result = 31 * result + this.ifruDstaddr.hashCode()
        result = 31 * result + this.ifruBroadaddr.hashCode()
        result = 31 * result + this.ifruBuffer.hashCode()
        result = 31 * result + this.ifruFlags.contentHashCode()
        result = 31 * result + this.ifruIndex.hashCode()
        result = 31 * result + this.ifruJid.hashCode()
        result = 31 * result + this.ifruMetric.hashCode()
        result = 31 * result + this.ifruMtu.hashCode()
        result = 31 * result + this.ifruPhys.hashCode()
        result = 31 * result + this.ifruMedia.hashCode()
        result = 31 * result + this.ifruData.hashCode()
        result = 31 * result + this.ifruCap.contentHashCode()
        result = 31 * result + this.ifruFib.hashCode()
        result = 31 * result + this.ifruVlanPcp.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ifruAddr: Sockaddr = Sockaddr(),
            ifruDstaddr: Sockaddr = Sockaddr(),
            ifruBroadaddr: Sockaddr = Sockaddr(),
            ifruBuffer: IfreqBuffer = IfreqBuffer(),
            ifruFlags: ShortArray = ShortArray(2),
            ifruIndex: CShort = 0,
            ifruJid: CInt = 0,
            ifruMetric: CInt = 0,
            ifruMtu: CInt = 0,
            ifruPhys: CInt = 0,
            ifruMedia: CInt = 0,
            ifruData: MutPtr<CChar> = MutPtr(0L),
            ifruCap: IntArray = IntArray(2),
            ifruFib: CUint = 0u,
            ifruVlanPcp: CUchar = 0u,
        ): CAnonymousIfrIfru =
            CAnonymousIfrIfru(
                ifruAddr = ifruAddr,
                ifruDstaddr = ifruDstaddr,
                ifruBroadaddr = ifruBroadaddr,
                ifruBuffer = ifruBuffer,
                ifruFlags = ifruFlags,
                ifruIndex = ifruIndex,
                ifruJid = ifruJid,
                ifruMetric = ifruMetric,
                ifruMtu = ifruMtu,
                ifruPhys = ifruPhys,
                ifruMedia = ifruMedia,
                ifruDataCtorArg = ifruData,
                ifruCap = ifruCap,
                ifruFib = ifruFib,
                ifruVlanPcp = ifruVlanPcp,
            )
    }
}

public data class Ifreq(
    /**
     * if name, e.g. "en0"
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

public class IfreqBuffer internal constructor(
    public var length: SizeT,
    bufferCtorArg: MutPtr<CVoid>,
) {
    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        length = 0uL,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): SizeT = this.length

    public operator fun component2(): MutPtr<CVoid> = this.buffer

    public fun copy(length: SizeT = this.length, buffer: MutPtr<CVoid> = this.buffer): IfreqBuffer = IfreqBuffer(length = length, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IfreqBuffer) return false
        if (this.length != other.length) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfreqBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfreqBuffer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): IfreqBuffer =
                    IfreqBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IfreqBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.buffer)
                }
            }

        public operator fun invoke(
            length: SizeT = 0uL,
            buffer: MutPtr<CVoid> = MutPtr(0L),
        ): IfreqBuffer =
            IfreqBuffer(
                length = length,
                bufferCtorArg = buffer,
            )
    }
}
