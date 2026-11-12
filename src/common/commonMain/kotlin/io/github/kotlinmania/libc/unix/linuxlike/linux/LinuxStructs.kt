@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.IFNAMSIZ
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.SIZEOF_PTHREAD_COND_T
import io.github.kotlinmania.libc.unix.linuxlike.SaFamilyT
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.io
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SIZEOF_PTHREAD_RWLOCKATTR_T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.S64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.U64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664.SIZEOF_PTHREAD_BARRIERATTR_T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664.SIZEOF_PTHREAD_CONDATTR_T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664.SIZEOF_PTHREAD_MUTEXATTR_T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664.notx32.SIZEOF_PTHREAD_BARRIER_T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664.notx32.SIZEOF_PTHREAD_MUTEX_T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664.notx32.SIZEOF_PTHREAD_RWLOCK_T
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public class DebugStruct(
    private val out: StringBuilder,
    private val name: String,
) {
    private val fields: MutableList<String> = mutableListOf()

    public fun field(name: String, value: Any?): DebugStruct =
        apply {
            fields.add("$name: $value")
        }

    public fun finish() {
        if (fields.isEmpty()) {
            out.append(name)
        } else {
            out.append("$name { ${fields.joinToString(", ")} }")
        }
    }

    public fun finishNonExhaustive() {
        fields.add("..")
        finish()
    }
}

// linux/cnProc.h
// These functions are not available on OpenHarmony
// LFS64 extensions
//
// * musl has 64-bit versions only so aliases the LFS64 symbols to the standard ones
public data class Dqblk(
    public var dqbBhardlimit: ULong = 0uL,
    public var dqbBsoftlimit: ULong = 0uL,
    public var dqbCurspace: ULong = 0uL,
    public var dqbIhardlimit: ULong = 0uL,
    public var dqbIsoftlimit: ULong = 0uL,
    public var dqbCurinodes: ULong = 0uL,
    public var dqbBtime: ULong = 0uL,
    public var dqbItime: ULong = 0uL,
    public var dqbValid: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dqblk> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dqblk> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): Dqblk =
                    Dqblk(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: Dqblk) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dqbBhardlimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.dqbBsoftlimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.dqbCurspace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.dqbIhardlimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.dqbIsoftlimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.dqbCurinodes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.dqbBtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.dqbItime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.dqbValid)
                }
            }
    }
}

public class SignalfdSiginfo(
    public var ssiSigno: UInt = 0u,
    public var ssiErrno: Int = 0,
    public var ssiCode: Int = 0,
    public var ssiPid: UInt = 0u,
    public var ssiUid: UInt = 0u,
    public var ssiFd: Int = 0,
    public var ssiTid: UInt = 0u,
    public var ssiBand: UInt = 0u,
    public var ssiOverrun: UInt = 0u,
    public var ssiTrapno: UInt = 0u,
    public var ssiStatus: Int = 0,
    public var ssiInt: Int = 0,
    public var ssiPtr: ULong = 0uL,
    public var ssiUtime: ULong = 0uL,
    public var ssiStime: ULong = 0uL,
    public var ssiAddr: ULong = 0uL,
    public var ssiAddrLsb: UShort = 0u,
    public var pad2: UShort = 0u,
    public var ssiSyscall: Int = 0,
    public var ssiCallAddr: ULong = 0uL,
    public var ssiArch: UInt = 0u,
    public var pad: UByteArray = UByteArray(28),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SignalfdSiginfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SignalfdSiginfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): SignalfdSiginfo =
                    SignalfdSiginfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 82L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (28).toInt())
                        ).readNative(addr + 100L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SignalfdSiginfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ssiSigno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ssiErrno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ssiCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ssiPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ssiUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.ssiFd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.ssiTid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.ssiBand)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.ssiOverrun)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.ssiTrapno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.ssiStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.ssiInt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.ssiPtr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.ssiUtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.ssiStime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.ssiAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 80L, value.ssiAddrLsb)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 82L, value.pad2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 84L, value.ssiSyscall)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.ssiCallAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.ssiArch)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (28).toInt())
                    ).writeNative(addr + 100L, value.pad.toList())
                }
            }
    }
}

public data class FanoutArgs(
    public var id: U16 = 0u,
    public var typeFlags: U16 = 0u,
    public var maxNumMembers: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FanoutArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FanoutArgs> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FanoutArgs =
                    FanoutArgs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FanoutArgs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.typeFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxNumMembers)
                }
            }
    }
}

public data class SockaddrPkt(
    public var spktFamily: CUshort = 0u,
    public var spktDevice: UByteArray = UByteArray(14),
    public var spktProtocol: CUshort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrPkt) return false
        if (this.spktFamily != other.spktFamily) return false
        if (!this.spktDevice.contentEquals(other.spktDevice)) return false
        if (this.spktProtocol != other.spktProtocol) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.spktFamily.hashCode()
        result = 31 * result + this.spktDevice.contentHashCode()
        result = 31 * result + this.spktProtocol.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrPkt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrPkt> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 18L
                override fun readNative(addr: Long): SockaddrPkt =
                    SockaddrPkt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SockaddrPkt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.spktFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                    ).writeNative(addr + 2L, value.spktDevice.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.spktProtocol)
                }
            }
    }
}

public data class TpacketAuxdata(
    public var tpStatus: U32 = 0u,
    public var tpLen: U32 = 0u,
    public var tpSnaplen: U32 = 0u,
    public var tpMac: U16 = 0u,
    public var tpNet: U16 = 0u,
    public var tpVlanTci: U16 = 0u,
    public var tpVlanTpid: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketAuxdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketAuxdata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): TpacketAuxdata =
                    TpacketAuxdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                    )
                override fun writeNative(addr: Long, value: TpacketAuxdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tpStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.tpLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tpSnaplen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.tpMac)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.tpNet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.tpVlanTci)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.tpVlanTpid)
                }
            }
    }
}

public data class TpacketHdr(
    public var tpStatus: CUlong = 0uL,
    public var tpLen: CUint = 0u,
    public var tpSnaplen: CUint = 0u,
    public var tpMac: CUshort = 0u,
    public var tpNet: CUshort = 0u,
    public var tpSec: CUint = 0u,
    public var tpUsec: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketHdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketHdr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): TpacketHdr =
                    TpacketHdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: TpacketHdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.tpStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tpLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tpSnaplen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.tpMac)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.tpNet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.tpSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.tpUsec)
                }
            }
    }
}

public data class TpacketHdrVariant1(
    public var tpRxhash: U32 = 0u,
    public var tpVlanTci: U32 = 0u,
    public var tpVlanTpid: U16 = 0u,
    public var tpPadding: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketHdrVariant1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketHdrVariant1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): TpacketHdrVariant1 =
                    TpacketHdrVariant1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: TpacketHdrVariant1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tpRxhash)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.tpVlanTci)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.tpVlanTpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.tpPadding)
                }
            }
    }
}

public data class Tpacket2Hdr(
    public var tpStatus: U32 = 0u,
    public var tpLen: U32 = 0u,
    public var tpSnaplen: U32 = 0u,
    public var tpMac: U16 = 0u,
    public var tpNet: U16 = 0u,
    public var tpSec: U32 = 0u,
    public var tpNsec: U32 = 0u,
    public var tpVlanTci: U16 = 0u,
    public var tpVlanTpid: U16 = 0u,
    public var tpPadding: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tpacket2Hdr) return false
        if (this.tpStatus != other.tpStatus) return false
        if (this.tpLen != other.tpLen) return false
        if (this.tpSnaplen != other.tpSnaplen) return false
        if (this.tpMac != other.tpMac) return false
        if (this.tpNet != other.tpNet) return false
        if (this.tpSec != other.tpSec) return false
        if (this.tpNsec != other.tpNsec) return false
        if (this.tpVlanTci != other.tpVlanTci) return false
        if (this.tpVlanTpid != other.tpVlanTpid) return false
        if (!this.tpPadding.contentEquals(other.tpPadding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tpStatus.hashCode()
        result = 31 * result + this.tpLen.hashCode()
        result = 31 * result + this.tpSnaplen.hashCode()
        result = 31 * result + this.tpMac.hashCode()
        result = 31 * result + this.tpNet.hashCode()
        result = 31 * result + this.tpSec.hashCode()
        result = 31 * result + this.tpNsec.hashCode()
        result = 31 * result + this.tpVlanTci.hashCode()
        result = 31 * result + this.tpVlanTpid.hashCode()
        result = 31 * result + this.tpPadding.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tpacket2Hdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tpacket2Hdr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Tpacket2Hdr =
                    Tpacket2Hdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 28L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Tpacket2Hdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tpStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.tpLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tpSnaplen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.tpMac)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.tpNet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.tpSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.tpNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.tpVlanTci)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.tpVlanTpid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 28L, value.tpPadding.toList())
                }
            }
    }
}

public data class TpacketReq(
    public var tpBlockSize: CUint = 0u,
    public var tpBlockNr: CUint = 0u,
    public var tpFrameSize: CUint = 0u,
    public var tpFrameNr: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketReq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketReq> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TpacketReq =
                    TpacketReq(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: TpacketReq) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tpBlockSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.tpBlockNr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tpFrameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tpFrameNr)
                }
            }
    }
}

public data class TpacketReq3(
    public var tpBlockSize: CUint = 0u,
    public var tpBlockNr: CUint = 0u,
    public var tpFrameSize: CUint = 0u,
    public var tpFrameNr: CUint = 0u,
    public var tpRetireBlkTov: CUint = 0u,
    public var tpSizeofPriv: CUint = 0u,
    public var tpFeatureReqWord: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketReq3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketReq3> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): TpacketReq3 =
                    TpacketReq3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: TpacketReq3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tpBlockSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.tpBlockNr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tpFrameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tpFrameNr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.tpRetireBlkTov)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.tpSizeofPriv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.tpFeatureReqWord)
                }
            }
    }
}

public data class TpacketRolloverStats(
    public var tpAll: U64 = 0uL,
    public var tpHuge: U64 = 0uL,
    public var tpFailed: U64 = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketRolloverStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketRolloverStats> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): TpacketRolloverStats =
                    TpacketRolloverStats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: TpacketRolloverStats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.tpAll)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.tpHuge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.tpFailed)
                }
            }
    }
}

public data class TpacketStats(
    public var tpPackets: CUint = 0u,
    public var tpDrops: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketStats> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TpacketStats =
                    TpacketStats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TpacketStats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tpPackets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.tpDrops)
                }
            }
    }
}

public data class TpacketStatsV3(
    public var tpPackets: CUint = 0u,
    public var tpDrops: CUint = 0u,
    public var tpFreezeQCnt: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketStatsV3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketStatsV3> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): TpacketStatsV3 =
                    TpacketStatsV3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TpacketStatsV3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tpPackets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.tpDrops)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tpFreezeQCnt)
                }
            }
    }
}

public data class Tpacket3Hdr(
    public var tpNextOffset: U32 = 0u,
    public var tpSec: U32 = 0u,
    public var tpNsec: U32 = 0u,
    public var tpSnaplen: U32 = 0u,
    public var tpLen: U32 = 0u,
    public var tpStatus: U32 = 0u,
    public var tpMac: U16 = 0u,
    public var tpNet: U16 = 0u,
    public var hv1: TpacketHdrVariant1 = TpacketHdrVariant1(),
    public var tpPadding: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tpacket3Hdr) return false
        if (this.tpNextOffset != other.tpNextOffset) return false
        if (this.tpSec != other.tpSec) return false
        if (this.tpNsec != other.tpNsec) return false
        if (this.tpSnaplen != other.tpSnaplen) return false
        if (this.tpLen != other.tpLen) return false
        if (this.tpStatus != other.tpStatus) return false
        if (this.tpMac != other.tpMac) return false
        if (this.tpNet != other.tpNet) return false
        if (this.hv1 != other.hv1) return false
        if (!this.tpPadding.contentEquals(other.tpPadding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tpNextOffset.hashCode()
        result = 31 * result + this.tpSec.hashCode()
        result = 31 * result + this.tpNsec.hashCode()
        result = 31 * result + this.tpSnaplen.hashCode()
        result = 31 * result + this.tpLen.hashCode()
        result = 31 * result + this.tpStatus.hashCode()
        result = 31 * result + this.tpMac.hashCode()
        result = 31 * result + this.tpNet.hashCode()
        result = 31 * result + this.hv1.hashCode()
        result = 31 * result + this.tpPadding.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tpacket3Hdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tpacket3Hdr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Tpacket3Hdr =
                    Tpacket3Hdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (TpacketHdrVariant1.typeLayout()).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 40L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Tpacket3Hdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tpNextOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.tpSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tpNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tpSnaplen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.tpLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.tpStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.tpMac)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.tpNet)
                    (TpacketHdrVariant1.typeLayout()).writeNative(addr + 28L, value.hv1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 40L, value.tpPadding.toList())
                }
            }
    }
}

public data class TpacketBdTs(
    public var tsSec: CUint = 0u,
    public var tsUsec: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketBdTs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketBdTs> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TpacketBdTs =
                    TpacketBdTs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TpacketBdTs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tsSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.tsUsec)
                }
            }
    }
}

public data class TpacketHdrV1(
    public var blockStatus: U32 = 0u,
    public var numPkts: U32 = 0u,
    public var offsetToFirstPkt: U32 = 0u,
    public var blkLen: U32 = 0u,
    public var seqNum: U64 = 0uL,
    public var tsFirstPkt: TpacketBdTs = TpacketBdTs(),
    public var tsLastPkt: TpacketBdTs = TpacketBdTs(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketHdrV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TpacketHdrV1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): TpacketHdrV1 =
                    TpacketHdrV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (TpacketBdTs.typeLayout()).readNative(addr + 24L),
                        (TpacketBdTs.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: TpacketHdrV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.blockStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.offsetToFirstPkt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.blkLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.seqNum)
                    (TpacketBdTs.typeLayout()).writeNative(addr + 24L, value.tsFirstPkt)
                    (TpacketBdTs.typeLayout()).writeNative(addr + 32L, value.tsLastPkt)
                }
            }
    }
}

// System V IPC
public data class Msginfo(
    public var msgpool: CInt = 0,
    public var msgmap: CInt = 0,
    public var msgmax: CInt = 0,
    public var msgmnb: CInt = 0,
    public var msgmni: CInt = 0,
    public var msgssz: CInt = 0,
    public var msgtql: CInt = 0,
    public var msgseg: CUshort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msginfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msginfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Msginfo =
                    Msginfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Msginfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.msgpool)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.msgmap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.msgmax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.msgmnb)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.msgmni)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.msgssz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.msgtql)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 28L, value.msgseg)
                }
            }
    }
}

public data class InputEvent(
    // Note(1.0): Change to the commented variant, see https://github.com/rust-lang/libc/pull/4148#discussionR1857511742
    public var time: Timeval = Timeval(),
    public var type: U16 = 0u,
    public var code: U16 = 0u,
    public var value: S32 = 0,
)

public data class InputId(
    public var bustype: U16 = 0u,
    public var vendor: U16 = 0u,
    public var product: U16 = 0u,
    public var version: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputId> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): InputId =
                    InputId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: InputId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bustype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.vendor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.product)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.version)
                }
            }
    }
}

public data class InputAbsinfo(
    public var value: S32 = 0,
    public var minimum: S32 = 0,
    public var maximum: S32 = 0,
    public var fuzz: S32 = 0,
    public var flat: S32 = 0,
    public var resolution: S32 = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputAbsinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputAbsinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): InputAbsinfo =
                    InputAbsinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: InputAbsinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.minimum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.maximum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.fuzz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.flat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.resolution)
                }
            }
    }
}

public data class InputKeymapEntry(
    public var flags: U8 = 0u,
    public var len: U8 = 0u,
    public var index: U16 = 0u,
    public var keycode: U32 = 0u,
    public var scancode: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InputKeymapEntry) return false
        if (this.flags != other.flags) return false
        if (this.len != other.len) return false
        if (this.index != other.index) return false
        if (this.keycode != other.keycode) return false
        if (!this.scancode.contentEquals(other.scancode)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.len.hashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.keycode.hashCode()
        result = 31 * result + this.scancode.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputKeymapEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputKeymapEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): InputKeymapEntry =
                    InputKeymapEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: InputKeymapEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.len)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.keycode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 8L, value.scancode.toList())
                }
            }
    }
}

public data class InputMask(
    public var type: U32 = 0u,
    public var codesSize: U32 = 0u,
    public var codesPtr: U64 = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputMask> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputMask> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): InputMask =
                    InputMask(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: InputMask) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.codesSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.codesPtr)
                }
            }
    }
}

public data class FfReplay(
    public var length: U16 = 0u,
    public var delay: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfReplay> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfReplay> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): FfReplay =
                    FfReplay(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: FfReplay) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.delay)
                }
            }
    }
}

public data class FfTrigger(
    public var button: U16 = 0u,
    public var interval: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfTrigger> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfTrigger> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): FfTrigger =
                    FfTrigger(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: FfTrigger) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.button)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.interval)
                }
            }
    }
}

public data class FfEnvelope(
    public var attackLength: U16 = 0u,
    public var attackLevel: U16 = 0u,
    public var fadeLength: U16 = 0u,
    public var fadeLevel: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfEnvelope> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfEnvelope> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FfEnvelope =
                    FfEnvelope(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: FfEnvelope) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.attackLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.attackLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.fadeLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.fadeLevel)
                }
            }
    }
}

public data class FfConstantEffect(
    public var level: S16 = 0,
    public var envelope: FfEnvelope = FfEnvelope(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfConstantEffect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfConstantEffect> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): FfConstantEffect =
                    FfConstantEffect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (FfEnvelope.typeLayout()).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: FfConstantEffect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.level)
                    (FfEnvelope.typeLayout()).writeNative(addr + 2L, value.envelope)
                }
            }
    }
}

public data class FfRampEffect(
    public var startLevel: S16 = 0,
    public var endLevel: S16 = 0,
    public var envelope: FfEnvelope = FfEnvelope(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfRampEffect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfRampEffect> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): FfRampEffect =
                    FfRampEffect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (FfEnvelope.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FfRampEffect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.startLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.endLevel)
                    (FfEnvelope.typeLayout()).writeNative(addr + 4L, value.envelope)
                }
            }
    }
}

public data class FfConditionEffect(
    public var rightSaturation: U16 = 0u,
    public var leftSaturation: U16 = 0u,
    public var rightCoeff: S16 = 0,
    public var leftCoeff: S16 = 0,
    public var deadband: U16 = 0u,
    public var center: S16 = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfConditionEffect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfConditionEffect> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): FfConditionEffect =
                    FfConditionEffect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: FfConditionEffect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.rightSaturation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.leftSaturation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.rightCoeff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.leftCoeff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.deadband)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 10L, value.center)
                }
            }
    }
}

public class FfPeriodicEffect internal constructor(
    public var waveform: U16,
    public var period: U16,
    public var magnitude: S16,
    public var offset: S16,
    public var phase: U16,
    public var envelope: FfEnvelope,
    public var customLen: U32,
    customDataCtorArg: MutPtr<S16>,
) {
    public var customData: MutPtr<S16> = customDataCtorArg
        internal set

    public constructor() : this(
        waveform = 0u,
        period = 0u,
        magnitude = 0,
        offset = 0,
        phase = 0u,
        envelope = FfEnvelope(),
        customLen = 0u,
        customDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): U16 = this.waveform

    public operator fun component2(): U16 = this.period

    public operator fun component3(): S16 = this.magnitude

    public operator fun component4(): S16 = this.offset

    public operator fun component5(): U16 = this.phase

    public operator fun component6(): FfEnvelope = this.envelope

    public operator fun component7(): U32 = this.customLen

    public operator fun component8(): MutPtr<S16> = this.customData

    public fun copy(waveform: U16 = this.waveform, period: U16 = this.period, magnitude: S16 = this.magnitude, offset: S16 = this.offset, phase: U16 = this.phase, envelope: FfEnvelope = this.envelope, customLen: U32 = this.customLen, customData: MutPtr<S16> = this.customData): FfPeriodicEffect = FfPeriodicEffect(waveform = waveform, period = period, magnitude = magnitude, offset = offset, phase = phase, envelope = envelope, customLen = customLen, customDataCtorArg = customData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FfPeriodicEffect) return false
        if (this.waveform != other.waveform) return false
        if (this.period != other.period) return false
        if (this.magnitude != other.magnitude) return false
        if (this.offset != other.offset) return false
        if (this.phase != other.phase) return false
        if (this.envelope != other.envelope) return false
        if (this.customLen != other.customLen) return false
        if (this.customData != other.customData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.waveform.hashCode()
        result = 31 * result + this.period.hashCode()
        result = 31 * result + this.magnitude.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.phase.hashCode()
        result = 31 * result + this.envelope.hashCode()
        result = 31 * result + this.customLen.hashCode()
        result = 31 * result + this.customData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfPeriodicEffect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfPeriodicEffect> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): FfPeriodicEffect =
                    FfPeriodicEffect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (FfEnvelope.typeLayout()).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<S16>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FfPeriodicEffect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.waveform)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.period)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.magnitude)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.phase)
                    (FfEnvelope.typeLayout()).writeNative(addr + 10L, value.envelope)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.customLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<S16>(64)
                    ).writeNative(addr + 24L, value.customData)
                }
            }

        public operator fun invoke(
            waveform: U16 = 0u,
            period: U16 = 0u,
            magnitude: S16 = 0,
            offset: S16 = 0,
            phase: U16 = 0u,
            envelope: FfEnvelope = FfEnvelope(),
            customLen: U32 = 0u,
            customData: MutPtr<S16> = MutPtr(0L),
        ): FfPeriodicEffect =
            FfPeriodicEffect(
                waveform = waveform,
                period = period,
                magnitude = magnitude,
                offset = offset,
                phase = phase,
                envelope = envelope,
                customLen = customLen,
                customDataCtorArg = customData,
            )
    }
}

public data class FfRumbleEffect(
    public var strongMagnitude: U16 = 0u,
    public var weakMagnitude: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfRumbleEffect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfRumbleEffect> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): FfRumbleEffect =
                    FfRumbleEffect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: FfRumbleEffect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.strongMagnitude)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.weakMagnitude)
                }
            }
    }
}

public data class FfEffect(
    public var type: U16 = 0u,
    public var id: S16 = 0,
    public var direction: U16 = 0u,
    public var trigger: FfTrigger = FfTrigger(),
    public var replay: FfReplay = FfReplay(),
    // Note(1.0): this is actually a union
    public var u: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FfEffect) return false
        if (this.type != other.type) return false
        if (this.id != other.id) return false
        if (this.direction != other.direction) return false
        if (this.trigger != other.trigger) return false
        if (this.replay != other.replay) return false
        if (!this.u.contentEquals(other.u)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.id.hashCode()
        result = 31 * result + this.direction.hashCode()
        result = 31 * result + this.trigger.hashCode()
        result = 31 * result + this.replay.hashCode()
        result = 31 * result + this.u.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfEffect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfEffect> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): FfEffect =
                    FfEffect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (FfTrigger.typeLayout()).readNative(addr + 6L),
                        (FfReplay.typeLayout()).readNative(addr + 10L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                        ).readNative(addr + 16L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: FfEffect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.direction)
                    (FfTrigger.typeLayout()).writeNative(addr + 6L, value.trigger)
                    (FfReplay.typeLayout()).writeNative(addr + 10L, value.replay)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                    ).writeNative(addr + 16L, value.u.toList())
                }
            }
    }
}

public data class UinputFfUpload(
    public var requestId: U32 = 0u,
    public var retval: S32 = 0,
    public var effect: FfEffect = FfEffect(),
    public var old: FfEffect = FfEffect(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputFfUpload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputFfUpload> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): UinputFfUpload =
                    UinputFfUpload(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (FfEffect.typeLayout()).readNative(addr + 8L),
                        (FfEffect.typeLayout()).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: UinputFfUpload) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.requestId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.retval)
                    (FfEffect.typeLayout()).writeNative(addr + 8L, value.effect)
                    (FfEffect.typeLayout()).writeNative(addr + 56L, value.old)
                }
            }
    }
}

public data class UinputFfErase(
    public var requestId: U32 = 0u,
    public var retval: S32 = 0,
    public var effectId: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputFfErase> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputFfErase> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): UinputFfErase =
                    UinputFfErase(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UinputFfErase) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.requestId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.retval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.effectId)
                }
            }
    }
}

public data class UinputAbsSetup(
    public var code: U16 = 0u,
    public var absinfo: InputAbsinfo = InputAbsinfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputAbsSetup> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputAbsSetup> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): UinputAbsSetup =
                    UinputAbsSetup(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (InputAbsinfo.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: UinputAbsSetup) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.code)
                    (InputAbsinfo.typeLayout()).writeNative(addr + 4L, value.absinfo)
                }
            }
    }
}

public data class CAnonymousKernelFsidT(
    public var value: IntArray = IntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousKernelFsidT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousKernelFsidT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousKernelFsidT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CAnonymousKernelFsidT =
                    CAnonymousKernelFsidT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                        ).readNative(addr).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: CAnonymousKernelFsidT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                    ).writeNative(addr, value.value.toList())
                }
            }
    }
}

public class PosixSpawnFileActionsT internal constructor(
    public var allocated: CInt,
    public var used: CInt,
    actionsCtorArg: MutPtr<CInt>,
    public var pad: IntArray,
) {
    public var actions: MutPtr<CInt> = actionsCtorArg
        internal set

    public constructor() : this(
        allocated = 0,
        used = 0,
        actionsCtorArg = MutPtr(0L),
        pad = IntArray(16),
    )

    public operator fun component1(): CInt = this.allocated

    public operator fun component2(): CInt = this.used

    public operator fun component3(): MutPtr<CInt> = this.actions

    public operator fun component4(): IntArray = this.pad

    public fun copy(allocated: CInt = this.allocated, used: CInt = this.used, actions: MutPtr<CInt> = this.actions, pad: IntArray = this.pad): PosixSpawnFileActionsT = PosixSpawnFileActionsT(allocated = allocated, used = used, actionsCtorArg = actions, pad = pad)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PosixSpawnFileActionsT) return false
        if (this.allocated != other.allocated) return false
        if (this.used != other.used) return false
        if (this.actions != other.actions) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.allocated.hashCode()
        result = 31 * result + this.used.hashCode()
        result = 31 * result + this.actions.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PosixSpawnFileActionsT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PosixSpawnFileActionsT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): PosixSpawnFileActionsT =
                    PosixSpawnFileActionsT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CInt>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (16).toInt())
                        ).readNative(addr + 16L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: PosixSpawnFileActionsT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.allocated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.used)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CInt>(64)
                    ).writeNative(addr + 8L, value.actions)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (16).toInt())
                    ).writeNative(addr + 16L, value.pad.toList())
                }
            }

        public operator fun invoke(
            allocated: CInt = 0,
            used: CInt = 0,
            actions: MutPtr<CInt> = MutPtr(0L),
            pad: IntArray = IntArray(16),
        ): PosixSpawnFileActionsT =
            PosixSpawnFileActionsT(
                allocated = allocated,
                used = used,
                actionsCtorArg = actions,
                pad = pad,
            )
    }
}

public data class PosixSpawnattrT(
    public var flags: CShort = 0,
    public var pgrp: PidT = 0,
    public var sd: SigsetT = SigsetT(),
    public var ss: SigsetT = SigsetT(),
    public var prio: CInt = 0,
    public var sp: SchedParam = SchedParam(),
    public var policy: CInt = 0,
    public var pad: IntArray = IntArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PosixSpawnattrT) return false
        if (this.flags != other.flags) return false
        if (this.pgrp != other.pgrp) return false
        if (this.sd != other.sd) return false
        if (this.ss != other.ss) return false
        if (this.prio != other.prio) return false
        if (this.sp != other.sp) return false
        if (this.policy != other.policy) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.pgrp.hashCode()
        result = 31 * result + this.sd.hashCode()
        result = 31 * result + this.ss.hashCode()
        result = 31 * result + this.prio.hashCode()
        result = 31 * result + this.sp.hashCode()
        result = 31 * result + this.policy.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }
}

public data class Genlmsghdr(
    public var cmd: UByte = 0u,
    public var version: UByte = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Genlmsghdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Genlmsghdr> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Genlmsghdr =
                    Genlmsghdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Genlmsghdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.cmd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                }
            }
    }
}

public data class InotifyEvent(
    public var wd: CInt = 0,
    public var mask: UInt = 0u,
    public var cookie: UInt = 0u,
    public var len: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InotifyEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InotifyEvent> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): InotifyEvent =
                    InotifyEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: InotifyEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cookie)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.len)
                }
            }
    }
}

public data class FanotifyResponse(
    public var fd: CInt = 0,
    public var response: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FanotifyResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FanotifyResponse> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FanotifyResponse =
                    FanotifyResponse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FanotifyResponse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.response)
                }
            }
    }
}

public data class FanotifyEventInfoHeader(
    public var infoType: U8 = 0u,
    public var pad: U8 = 0u,
    public var len: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FanotifyEventInfoHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FanotifyEventInfoHeader> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): FanotifyEventInfoHeader =
                    FanotifyEventInfoHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: FanotifyEventInfoHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.infoType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.pad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.len)
                }
            }
    }
}

public data class FanotifyEventInfoFid(
    public var hdr: FanotifyEventInfoHeader = FanotifyEventInfoHeader(),
    public var fsid: KernelFsidT = CAnonymousKernelFsidT(),
    public var handle: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FanotifyEventInfoFid) return false
        if (this.hdr != other.hdr) return false
        if (this.fsid != other.fsid) return false
        if (!this.handle.contentEquals(other.handle)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.fsid.hashCode()
        result = 31 * result + this.handle.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FanotifyEventInfoFid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FanotifyEventInfoFid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): FanotifyEventInfoFid =
                    FanotifyEventInfoFid(
                        (FanotifyEventInfoHeader.typeLayout()).readNative(addr),
                        (CAnonymousKernelFsidT.typeLayout()).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: FanotifyEventInfoFid) {
                    (FanotifyEventInfoHeader.typeLayout()).writeNative(addr, value.hdr)
                    (CAnonymousKernelFsidT.typeLayout()).writeNative(addr + 4L, value.fsid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                    ).writeNative(addr + 12L, value.handle.toList())
                }
            }
    }
}

public data class SockaddrVm(
    public var svmFamily: SaFamilyT = 0u,
    public var svmReserved1: CUshort = 0u,
    public var svmPort: CUint = 0u,
    public var svmCid: CUint = 0u,
    public var svmZero: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrVm) return false
        if (this.svmFamily != other.svmFamily) return false
        if (this.svmReserved1 != other.svmReserved1) return false
        if (this.svmPort != other.svmPort) return false
        if (this.svmCid != other.svmCid) return false
        if (!this.svmZero.contentEquals(other.svmZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.svmFamily.hashCode()
        result = 31 * result + this.svmReserved1.hashCode()
        result = 31 * result + this.svmPort.hashCode()
        result = 31 * result + this.svmCid.hashCode()
        result = 31 * result + this.svmZero.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrVm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrVm> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SockaddrVm =
                    SockaddrVm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SockaddrVm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.svmFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.svmReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.svmPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.svmCid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 12L, value.svmZero.toList())
                }
            }
    }
}

public data class SockExtendedErr(
    public var eeErrno: UInt = 0u,
    public var eeOrigin: UByte = 0u,
    public var eeType: UByte = 0u,
    public var eeCode: UByte = 0u,
    public var eePad: UByte = 0u,
    public var eeInfo: UInt = 0u,
    public var eeData: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockExtendedErr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockExtendedErr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SockExtendedErr =
                    SockExtendedErr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SockExtendedErr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.eeErrno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.eeOrigin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.eeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.eeCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.eePad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.eeInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.eeData)
                }
            }
    }
}

// linux/seccomp.h
public data class SeccompData(
    public var nr: CInt = 0,
    public var arch: U32 = 0u,
    public var instructionPointer: U64 = 0uL,
    public var args: ULongArray = ULongArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SeccompData) return false
        if (this.nr != other.nr) return false
        if (this.arch != other.arch) return false
        if (this.instructionPointer != other.instructionPointer) return false
        if (!this.args.contentEquals(other.args)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nr.hashCode()
        result = 31 * result + this.arch.hashCode()
        result = 31 * result + this.instructionPointer.hashCode()
        result = 31 * result + this.args.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeccompData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeccompData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): SeccompData =
                    SeccompData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (6).toInt())
                        ).readNative(addr + 16L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: SeccompData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.nr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.arch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.instructionPointer)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (6).toInt())
                    ).writeNative(addr + 16L, value.args.toList())
                }
            }
    }
}

public data class SeccompNotifSizes(
    public var seccompNotif: U16 = 0u,
    public var seccompNotifResp: U16 = 0u,
    public var seccompData: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeccompNotifSizes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeccompNotifSizes> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): SeccompNotifSizes =
                    SeccompNotifSizes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SeccompNotifSizes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.seccompNotif)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.seccompNotifResp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.seccompData)
                }
            }
    }
}

public data class SeccompNotif(
    public var id: U64 = 0uL,
    public var pid: U32 = 0u,
    public var flags: U32 = 0u,
    public var data: SeccompData = SeccompData(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeccompNotif> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeccompNotif> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): SeccompNotif =
                    SeccompNotif(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (SeccompData.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SeccompNotif) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flags)
                    (SeccompData.typeLayout()).writeNative(addr + 16L, value.data)
                }
            }
    }
}

public data class SeccompNotifResp(
    public var id: U64 = 0uL,
    public var value: S64 = 0L,
    public var error: S32 = 0,
    public var flags: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeccompNotifResp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeccompNotifResp> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SeccompNotifResp =
                    SeccompNotifResp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: SeccompNotifResp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.error)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.flags)
                }
            }
    }
}

public data class SeccompNotifAddfd(
    public var id: U64 = 0uL,
    public var flags: U32 = 0u,
    public var srcfd: U32 = 0u,
    public var newfd: U32 = 0u,
    public var newfdFlags: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeccompNotifAddfd> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeccompNotifAddfd> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SeccompNotifAddfd =
                    SeccompNotifAddfd(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: SeccompNotifAddfd) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.srcfd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.newfd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.newfdFlags)
                }
            }
    }
}

public data class In6Ifreq(
    public var ifr6Addr: In6Addr = In6Addr(),
    public var ifr6Prefixlen: UInt = 0u,
    public var ifr6Ifindex: CInt = 0,
)

public data class OpenHow(
    public var flags: U64 = 0uL,
    public var mode: U64 = 0uL,
    public var resolve: U64 = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OpenHow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OpenHow> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): OpenHow =
                    OpenHow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: OpenHow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.resolve)
                }
            }
    }
}

// linux/ptpClock.h
public data class PtpClockTime(
    public var sec: S64 = 0L,
    public var nsec: U32 = 0u,
    public var reserved: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtpClockTime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtpClockTime> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PtpClockTime =
                    PtpClockTime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: PtpClockTime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.sec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class PtpExttsRequest(
    public var index: CUint = 0u,
    public var flags: CUint = 0u,
    public var rsv: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtpExttsRequest) return false
        if (this.index != other.index) return false
        if (this.flags != other.flags) return false
        if (!this.rsv.contentEquals(other.rsv)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.index.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.rsv.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtpExttsRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtpExttsRequest> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PtpExttsRequest =
                    PtpExttsRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 8L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: PtpExttsRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 8L, value.rsv.toList())
                }
            }
    }
}

public data class PtpSysOffsetExtended(
    public var nSamples: CUint = 0u,
    public var clockid: KernelClockidT = 0,
    public var rsv: UIntArray = UIntArray(2),
    public var ts: List<List<PtpClockTime>> = List(PTP_MAX_SAMPLES.toInt()) { emptyList() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtpSysOffsetExtended) return false
        if (this.nSamples != other.nSamples) return false
        if (this.clockid != other.clockid) return false
        if (!this.rsv.contentEquals(other.rsv)) return false
        if (this.ts != other.ts) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nSamples.hashCode()
        result = 31 * result + this.clockid.hashCode()
        result = 31 * result + this.rsv.contentHashCode()
        result = 31 * result + this.ts.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtpSysOffsetExtended> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtpSysOffsetExtended> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                16L + (
                                    (PTP_MAX_SAMPLES.toInt()).toLong() *
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .FixedArrayTypeLayout(PtpClockTime.typeLayout(), (3).toInt())
                                        ).strideBytes
                                )
                            ),
                            8L,
                        )
                override fun readNative(addr: Long): PtpSysOffsetExtended =
                    PtpSysOffsetExtended(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 8L).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem
                                        .FixedArrayTypeLayout(PtpClockTime.typeLayout(), (3).toInt()),
                                    (PTP_MAX_SAMPLES.toInt()).toInt(),
                                )
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PtpSysOffsetExtended) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nSamples)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.clockid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 8L, value.rsv.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(PtpClockTime.typeLayout(), (3).toInt()),
                                (PTP_MAX_SAMPLES.toInt()).toInt(),
                            )
                    ).writeNative(addr + 16L, value.ts)
                }
            }
    }
}

public data class PtpSysOffsetPrecise(
    public var device: PtpClockTime = PtpClockTime(),
    public var sysRealtime: PtpClockTime = PtpClockTime(),
    public var sysMonoraw: PtpClockTime = PtpClockTime(),
    public var rsv: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtpSysOffsetPrecise) return false
        if (this.device != other.device) return false
        if (this.sysRealtime != other.sysRealtime) return false
        if (this.sysMonoraw != other.sysMonoraw) return false
        if (!this.rsv.contentEquals(other.rsv)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.device.hashCode()
        result = 31 * result + this.sysRealtime.hashCode()
        result = 31 * result + this.sysMonoraw.hashCode()
        result = 31 * result + this.rsv.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtpSysOffsetPrecise> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtpSysOffsetPrecise> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): PtpSysOffsetPrecise =
                    PtpSysOffsetPrecise(
                        (PtpClockTime.typeLayout()).readNative(addr),
                        (PtpClockTime.typeLayout()).readNative(addr + 16L),
                        (PtpClockTime.typeLayout()).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 48L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: PtpSysOffsetPrecise) {
                    (PtpClockTime.typeLayout()).writeNative(addr, value.device)
                    (PtpClockTime.typeLayout()).writeNative(addr + 16L, value.sysRealtime)
                    (PtpClockTime.typeLayout()).writeNative(addr + 32L, value.sysMonoraw)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 48L, value.rsv.toList())
                }
            }
    }
}

public data class PtpExttsEvent(
    public var t: PtpClockTime = PtpClockTime(),
    public var index: CUint = 0u,
    public var flags: CUint = 0u,
    public var rsv: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtpExttsEvent) return false
        if (this.t != other.t) return false
        if (this.index != other.index) return false
        if (this.flags != other.flags) return false
        if (!this.rsv.contentEquals(other.rsv)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.t.hashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.rsv.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtpExttsEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtpExttsEvent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): PtpExttsEvent =
                    PtpExttsEvent(
                        (PtpClockTime.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 24L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: PtpExttsEvent) {
                    (PtpClockTime.typeLayout()).writeNative(addr, value.t)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 24L, value.rsv.toList())
                }
            }
    }
}

// linux/sctp.h
public data class SctpInitmsg(
    public var sinitNumOstreams: U16 = 0u,
    public var sinitMaxInstreams: U16 = 0u,
    public var sinitMaxAttempts: U16 = 0u,
    public var sinitMaxInitTimeo: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpInitmsg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpInitmsg> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SctpInitmsg =
                    SctpInitmsg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: SctpInitmsg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sinitNumOstreams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sinitMaxInstreams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.sinitMaxAttempts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.sinitMaxInitTimeo)
                }
            }
    }
}

public data class SctpSndrcvinfo(
    public var sinfoStream: U16 = 0u,
    public var sinfoSsn: U16 = 0u,
    public var sinfoFlags: U16 = 0u,
    public var sinfoPpid: U32 = 0u,
    public var sinfoContext: U32 = 0u,
    public var sinfoTimetolive: U32 = 0u,
    public var sinfoTsn: U32 = 0u,
    public var sinfoCumtsn: U32 = 0u,
    public var sinfoAssocId: SctpAssocT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSndrcvinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSndrcvinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SctpSndrcvinfo =
                    SctpSndrcvinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: SctpSndrcvinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sinfoStream)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sinfoSsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.sinfoFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sinfoPpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sinfoContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sinfoTimetolive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.sinfoTsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.sinfoCumtsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.sinfoAssocId)
                }
            }
    }
}

public data class SctpSndinfo(
    public var sndSid: U16 = 0u,
    public var sndFlags: U16 = 0u,
    public var sndPpid: U32 = 0u,
    public var sndContext: U32 = 0u,
    public var sndAssocId: SctpAssocT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSndinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSndinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SctpSndinfo =
                    SctpSndinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SctpSndinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sndSid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sndFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sndPpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sndContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.sndAssocId)
                }
            }
    }
}

public data class SctpRcvinfo(
    public var rcvSid: U16 = 0u,
    public var rcvSsn: U16 = 0u,
    public var rcvFlags: U16 = 0u,
    public var rcvPpid: U32 = 0u,
    public var rcvTsn: U32 = 0u,
    public var rcvCumtsn: U32 = 0u,
    public var rcvContext: U32 = 0u,
    public var rcvAssocId: SctpAssocT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpRcvinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpRcvinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): SctpRcvinfo =
                    SctpRcvinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SctpRcvinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.rcvSid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.rcvSsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.rcvFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.rcvPpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.rcvTsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.rcvCumtsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.rcvContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.rcvAssocId)
                }
            }
    }
}

public data class SctpNxtinfo(
    public var nxtSid: U16 = 0u,
    public var nxtFlags: U16 = 0u,
    public var nxtPpid: U32 = 0u,
    public var nxtLength: U32 = 0u,
    public var nxtAssocId: SctpAssocT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpNxtinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpNxtinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SctpNxtinfo =
                    SctpNxtinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SctpNxtinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.nxtSid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.nxtFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nxtPpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nxtLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.nxtAssocId)
                }
            }
    }
}

public data class SctpPrinfo(
    public var prPolicy: U16 = 0u,
    public var prValue: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpPrinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpPrinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SctpPrinfo =
                    SctpPrinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SctpPrinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.prPolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.prValue)
                }
            }
    }
}

public data class SctpAuthinfo(
    public var authKeynumber: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpAuthinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpAuthinfo> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): SctpAuthinfo =
                    SctpAuthinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SctpAuthinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.authKeynumber)
                }
            }
    }
}

// linux/tls.h
public data class TlsCryptoInfo(
    public var version: U16 = 0u,
    public var cipherType: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TlsCryptoInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TlsCryptoInfo> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): TlsCryptoInfo =
                    TlsCryptoInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: TlsCryptoInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.cipherType)
                }
            }
    }
}

public data class Tls12CryptoInfoAesGcm128(
    public var info: TlsCryptoInfo = TlsCryptoInfo(),
    public var iv: UByteArray = UByteArray(TLS_CIPHER_AES_GCM_128_IV_SIZE),
    public var key: UByteArray = UByteArray(TLS_CIPHER_AES_GCM_128_KEY_SIZE),
    public var salt: UByteArray = UByteArray(TLS_CIPHER_AES_GCM_128_SALT_SIZE),
    public var recSeq: UByteArray = UByteArray(TLS_CIPHER_AES_GCM_128_REC_SEQ_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tls12CryptoInfoAesGcm128) return false
        if (this.info != other.info) return false
        if (!this.iv.contentEquals(other.iv)) return false
        if (!this.key.contentEquals(other.key)) return false
        if (!this.salt.contentEquals(other.salt)) return false
        if (!this.recSeq.contentEquals(other.recSeq)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.info.hashCode()
        result = 31 * result + this.iv.contentHashCode()
        result = 31 * result + this.key.contentHashCode()
        result = 31 * result + this.salt.contentHashCode()
        result = 31 * result + this.recSeq.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tls12CryptoInfoAesGcm128> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tls12CryptoInfoAesGcm128> {
                override val alignBytes: Long = 2L
                private val off2: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((4L + ((TLS_CIPHER_AES_GCM_128_IV_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off3: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off2 + ((TLS_CIPHER_AES_GCM_128_KEY_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off4: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off3 + ((TLS_CIPHER_AES_GCM_128_SALT_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off4 + ((TLS_CIPHER_AES_GCM_128_REC_SEQ_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 2L)
                override fun readNative(addr: Long): Tls12CryptoInfoAesGcm128 =
                    Tls12CryptoInfoAesGcm128(
                        (TlsCryptoInfo.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_GCM_128_IV_SIZE).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_GCM_128_KEY_SIZE).toInt())
                        ).readNative(addr + off2).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_GCM_128_SALT_SIZE).toInt())
                        ).readNative(addr + off3).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_GCM_128_REC_SEQ_SIZE).toInt())
                        ).readNative(addr + off4).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Tls12CryptoInfoAesGcm128) {
                    (TlsCryptoInfo.typeLayout()).writeNative(addr, value.info)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_GCM_128_IV_SIZE).toInt())
                    ).writeNative(addr + 4L, value.iv.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_GCM_128_KEY_SIZE).toInt())
                    ).writeNative(addr + off2, value.key.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_GCM_128_SALT_SIZE).toInt())
                    ).writeNative(addr + off3, value.salt.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_GCM_128_REC_SEQ_SIZE).toInt())
                    ).writeNative(addr + off4, value.recSeq.toList())
                }
            }
    }
}

public data class Tls12CryptoInfoAesGcm256(
    public var info: TlsCryptoInfo = TlsCryptoInfo(),
    public var iv: UByteArray = UByteArray(TLS_CIPHER_AES_GCM_256_IV_SIZE),
    public var key: UByteArray = UByteArray(TLS_CIPHER_AES_GCM_256_KEY_SIZE),
    public var salt: UByteArray = UByteArray(TLS_CIPHER_AES_GCM_256_SALT_SIZE),
    public var recSeq: UByteArray = UByteArray(TLS_CIPHER_AES_GCM_256_REC_SEQ_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tls12CryptoInfoAesGcm256) return false
        if (this.info != other.info) return false
        if (!this.iv.contentEquals(other.iv)) return false
        if (!this.key.contentEquals(other.key)) return false
        if (!this.salt.contentEquals(other.salt)) return false
        if (!this.recSeq.contentEquals(other.recSeq)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.info.hashCode()
        result = 31 * result + this.iv.contentHashCode()
        result = 31 * result + this.key.contentHashCode()
        result = 31 * result + this.salt.contentHashCode()
        result = 31 * result + this.recSeq.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tls12CryptoInfoAesGcm256> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tls12CryptoInfoAesGcm256> {
                override val alignBytes: Long = 2L
                private val off2: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((4L + ((TLS_CIPHER_AES_GCM_256_IV_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off3: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off2 + ((TLS_CIPHER_AES_GCM_256_KEY_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off4: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off3 + ((TLS_CIPHER_AES_GCM_256_SALT_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off4 + ((TLS_CIPHER_AES_GCM_256_REC_SEQ_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 2L)
                override fun readNative(addr: Long): Tls12CryptoInfoAesGcm256 =
                    Tls12CryptoInfoAesGcm256(
                        (TlsCryptoInfo.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_GCM_256_IV_SIZE).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_GCM_256_KEY_SIZE).toInt())
                        ).readNative(addr + off2).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_GCM_256_SALT_SIZE).toInt())
                        ).readNative(addr + off3).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_GCM_256_REC_SEQ_SIZE).toInt())
                        ).readNative(addr + off4).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Tls12CryptoInfoAesGcm256) {
                    (TlsCryptoInfo.typeLayout()).writeNative(addr, value.info)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_GCM_256_IV_SIZE).toInt())
                    ).writeNative(addr + 4L, value.iv.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_GCM_256_KEY_SIZE).toInt())
                    ).writeNative(addr + off2, value.key.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_GCM_256_SALT_SIZE).toInt())
                    ).writeNative(addr + off3, value.salt.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_GCM_256_REC_SEQ_SIZE).toInt())
                    ).writeNative(addr + off4, value.recSeq.toList())
                }
            }
    }
}

public data class Tls12CryptoInfoAesCcm128(
    public var info: TlsCryptoInfo = TlsCryptoInfo(),
    public var iv: UByteArray = UByteArray(TLS_CIPHER_AES_CCM_128_IV_SIZE),
    public var key: UByteArray = UByteArray(TLS_CIPHER_AES_CCM_128_KEY_SIZE),
    public var salt: UByteArray = UByteArray(TLS_CIPHER_AES_CCM_128_SALT_SIZE),
    public var recSeq: UByteArray = UByteArray(TLS_CIPHER_AES_CCM_128_REC_SEQ_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tls12CryptoInfoAesCcm128) return false
        if (this.info != other.info) return false
        if (!this.iv.contentEquals(other.iv)) return false
        if (!this.key.contentEquals(other.key)) return false
        if (!this.salt.contentEquals(other.salt)) return false
        if (!this.recSeq.contentEquals(other.recSeq)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.info.hashCode()
        result = 31 * result + this.iv.contentHashCode()
        result = 31 * result + this.key.contentHashCode()
        result = 31 * result + this.salt.contentHashCode()
        result = 31 * result + this.recSeq.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tls12CryptoInfoAesCcm128> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tls12CryptoInfoAesCcm128> {
                override val alignBytes: Long = 2L
                private val off2: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((4L + ((TLS_CIPHER_AES_CCM_128_IV_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off3: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off2 + ((TLS_CIPHER_AES_CCM_128_KEY_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off4: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off3 + ((TLS_CIPHER_AES_CCM_128_SALT_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off4 + ((TLS_CIPHER_AES_CCM_128_REC_SEQ_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 2L)
                override fun readNative(addr: Long): Tls12CryptoInfoAesCcm128 =
                    Tls12CryptoInfoAesCcm128(
                        (TlsCryptoInfo.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_CCM_128_IV_SIZE).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_CCM_128_KEY_SIZE).toInt())
                        ).readNative(addr + off2).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_CCM_128_SALT_SIZE).toInt())
                        ).readNative(addr + off3).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_CCM_128_REC_SEQ_SIZE).toInt())
                        ).readNative(addr + off4).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Tls12CryptoInfoAesCcm128) {
                    (TlsCryptoInfo.typeLayout()).writeNative(addr, value.info)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_CCM_128_IV_SIZE).toInt())
                    ).writeNative(addr + 4L, value.iv.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_CCM_128_KEY_SIZE).toInt())
                    ).writeNative(addr + off2, value.key.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_CCM_128_SALT_SIZE).toInt())
                    ).writeNative(addr + off3, value.salt.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_AES_CCM_128_REC_SEQ_SIZE).toInt())
                    ).writeNative(addr + off4, value.recSeq.toList())
                }
            }
    }
}

public data class Tls12CryptoInfoChacha20Poly1305(
    public var info: TlsCryptoInfo = TlsCryptoInfo(),
    public var iv: UByteArray = UByteArray(TLS_CIPHER_CHACHA20_POLY1305_IV_SIZE),
    public var key: UByteArray = UByteArray(TLS_CIPHER_CHACHA20_POLY1305_KEY_SIZE),
    public var salt: UByteArray = UByteArray(TLS_CIPHER_CHACHA20_POLY1305_SALT_SIZE),
    public var recSeq: UByteArray = UByteArray(TLS_CIPHER_CHACHA20_POLY1305_REC_SEQ_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tls12CryptoInfoChacha20Poly1305) return false
        if (this.info != other.info) return false
        if (!this.iv.contentEquals(other.iv)) return false
        if (!this.key.contentEquals(other.key)) return false
        if (!this.salt.contentEquals(other.salt)) return false
        if (!this.recSeq.contentEquals(other.recSeq)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.info.hashCode()
        result = 31 * result + this.iv.contentHashCode()
        result = 31 * result + this.key.contentHashCode()
        result = 31 * result + this.salt.contentHashCode()
        result = 31 * result + this.recSeq.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tls12CryptoInfoChacha20Poly1305> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tls12CryptoInfoChacha20Poly1305> {
                override val alignBytes: Long = 2L
                private val off2: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((4L + ((TLS_CIPHER_CHACHA20_POLY1305_IV_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off3: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off2 + ((TLS_CIPHER_CHACHA20_POLY1305_KEY_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off4: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off3 + ((TLS_CIPHER_CHACHA20_POLY1305_SALT_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off4 + ((TLS_CIPHER_CHACHA20_POLY1305_REC_SEQ_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 2L)
                override fun readNative(addr: Long): Tls12CryptoInfoChacha20Poly1305 =
                    Tls12CryptoInfoChacha20Poly1305(
                        (TlsCryptoInfo.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_CHACHA20_POLY1305_IV_SIZE).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_CHACHA20_POLY1305_KEY_SIZE).toInt())
                        ).readNative(addr + off2).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_CHACHA20_POLY1305_SALT_SIZE).toInt())
                        ).readNative(addr + off3).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_CHACHA20_POLY1305_REC_SEQ_SIZE).toInt())
                        ).readNative(addr + off4).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Tls12CryptoInfoChacha20Poly1305) {
                    (TlsCryptoInfo.typeLayout()).writeNative(addr, value.info)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_CHACHA20_POLY1305_IV_SIZE).toInt())
                    ).writeNative(addr + 4L, value.iv.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_CHACHA20_POLY1305_KEY_SIZE).toInt())
                    ).writeNative(addr + off2, value.key.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_CHACHA20_POLY1305_SALT_SIZE).toInt())
                    ).writeNative(addr + off3, value.salt.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_CHACHA20_POLY1305_REC_SEQ_SIZE).toInt())
                    ).writeNative(addr + off4, value.recSeq.toList())
                }
            }
    }
}

public data class Tls12CryptoInfoSm4Gcm(
    public var info: TlsCryptoInfo = TlsCryptoInfo(),
    public var iv: UByteArray = UByteArray(TLS_CIPHER_SM4_GCM_IV_SIZE),
    public var key: UByteArray = UByteArray(TLS_CIPHER_SM4_GCM_KEY_SIZE),
    public var salt: UByteArray = UByteArray(TLS_CIPHER_SM4_GCM_SALT_SIZE),
    public var recSeq: UByteArray = UByteArray(TLS_CIPHER_SM4_GCM_REC_SEQ_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tls12CryptoInfoSm4Gcm) return false
        if (this.info != other.info) return false
        if (!this.iv.contentEquals(other.iv)) return false
        if (!this.key.contentEquals(other.key)) return false
        if (!this.salt.contentEquals(other.salt)) return false
        if (!this.recSeq.contentEquals(other.recSeq)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.info.hashCode()
        result = 31 * result + this.iv.contentHashCode()
        result = 31 * result + this.key.contentHashCode()
        result = 31 * result + this.salt.contentHashCode()
        result = 31 * result + this.recSeq.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tls12CryptoInfoSm4Gcm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tls12CryptoInfoSm4Gcm> {
                override val alignBytes: Long = 2L
                private val off2: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((4L + ((TLS_CIPHER_SM4_GCM_IV_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off3: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off2 + ((TLS_CIPHER_SM4_GCM_KEY_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off4: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off3 + ((TLS_CIPHER_SM4_GCM_SALT_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off4 + ((TLS_CIPHER_SM4_GCM_REC_SEQ_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 2L)
                override fun readNative(addr: Long): Tls12CryptoInfoSm4Gcm =
                    Tls12CryptoInfoSm4Gcm(
                        (TlsCryptoInfo.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_SM4_GCM_IV_SIZE).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_SM4_GCM_KEY_SIZE).toInt())
                        ).readNative(addr + off2).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_SM4_GCM_SALT_SIZE).toInt())
                        ).readNative(addr + off3).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_SM4_GCM_REC_SEQ_SIZE).toInt())
                        ).readNative(addr + off4).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Tls12CryptoInfoSm4Gcm) {
                    (TlsCryptoInfo.typeLayout()).writeNative(addr, value.info)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_SM4_GCM_IV_SIZE).toInt())
                    ).writeNative(addr + 4L, value.iv.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_SM4_GCM_KEY_SIZE).toInt())
                    ).writeNative(addr + off2, value.key.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_SM4_GCM_SALT_SIZE).toInt())
                    ).writeNative(addr + off3, value.salt.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_SM4_GCM_REC_SEQ_SIZE).toInt())
                    ).writeNative(addr + off4, value.recSeq.toList())
                }
            }
    }
}

public data class Tls12CryptoInfoSm4Ccm(
    public var info: TlsCryptoInfo = TlsCryptoInfo(),
    public var iv: UByteArray = UByteArray(TLS_CIPHER_SM4_CCM_IV_SIZE),
    public var key: UByteArray = UByteArray(TLS_CIPHER_SM4_CCM_KEY_SIZE),
    public var salt: UByteArray = UByteArray(TLS_CIPHER_SM4_CCM_SALT_SIZE),
    public var recSeq: UByteArray = UByteArray(TLS_CIPHER_SM4_CCM_REC_SEQ_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tls12CryptoInfoSm4Ccm) return false
        if (this.info != other.info) return false
        if (!this.iv.contentEquals(other.iv)) return false
        if (!this.key.contentEquals(other.key)) return false
        if (!this.salt.contentEquals(other.salt)) return false
        if (!this.recSeq.contentEquals(other.recSeq)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.info.hashCode()
        result = 31 * result + this.iv.contentHashCode()
        result = 31 * result + this.key.contentHashCode()
        result = 31 * result + this.salt.contentHashCode()
        result = 31 * result + this.recSeq.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tls12CryptoInfoSm4Ccm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tls12CryptoInfoSm4Ccm> {
                override val alignBytes: Long = 2L
                private val off2: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((4L + ((TLS_CIPHER_SM4_CCM_IV_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off3: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off2 + ((TLS_CIPHER_SM4_CCM_KEY_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off4: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off3 + ((TLS_CIPHER_SM4_CCM_SALT_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off4 + ((TLS_CIPHER_SM4_CCM_REC_SEQ_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 2L)
                override fun readNative(addr: Long): Tls12CryptoInfoSm4Ccm =
                    Tls12CryptoInfoSm4Ccm(
                        (TlsCryptoInfo.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_SM4_CCM_IV_SIZE).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_SM4_CCM_KEY_SIZE).toInt())
                        ).readNative(addr + off2).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_SM4_CCM_SALT_SIZE).toInt())
                        ).readNative(addr + off3).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_SM4_CCM_REC_SEQ_SIZE).toInt())
                        ).readNative(addr + off4).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Tls12CryptoInfoSm4Ccm) {
                    (TlsCryptoInfo.typeLayout()).writeNative(addr, value.info)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_SM4_CCM_IV_SIZE).toInt())
                    ).writeNative(addr + 4L, value.iv.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_SM4_CCM_KEY_SIZE).toInt())
                    ).writeNative(addr + off2, value.key.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_SM4_CCM_SALT_SIZE).toInt())
                    ).writeNative(addr + off3, value.salt.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_SM4_CCM_REC_SEQ_SIZE).toInt())
                    ).writeNative(addr + off4, value.recSeq.toList())
                }
            }
    }
}

public data class Tls12CryptoInfoAriaGcm128(
    public var info: TlsCryptoInfo = TlsCryptoInfo(),
    public var iv: UByteArray = UByteArray(TLS_CIPHER_ARIA_GCM_128_IV_SIZE),
    public var key: UByteArray = UByteArray(TLS_CIPHER_ARIA_GCM_128_KEY_SIZE),
    public var salt: UByteArray = UByteArray(TLS_CIPHER_ARIA_GCM_128_SALT_SIZE),
    public var recSeq: UByteArray = UByteArray(TLS_CIPHER_ARIA_GCM_128_REC_SEQ_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tls12CryptoInfoAriaGcm128) return false
        if (this.info != other.info) return false
        if (!this.iv.contentEquals(other.iv)) return false
        if (!this.key.contentEquals(other.key)) return false
        if (!this.salt.contentEquals(other.salt)) return false
        if (!this.recSeq.contentEquals(other.recSeq)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.info.hashCode()
        result = 31 * result + this.iv.contentHashCode()
        result = 31 * result + this.key.contentHashCode()
        result = 31 * result + this.salt.contentHashCode()
        result = 31 * result + this.recSeq.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tls12CryptoInfoAriaGcm128> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tls12CryptoInfoAriaGcm128> {
                override val alignBytes: Long = 2L
                private val off2: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((4L + ((TLS_CIPHER_ARIA_GCM_128_IV_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off3: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off2 + ((TLS_CIPHER_ARIA_GCM_128_KEY_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off4: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off3 + ((TLS_CIPHER_ARIA_GCM_128_SALT_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off4 + ((TLS_CIPHER_ARIA_GCM_128_REC_SEQ_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 2L)
                override fun readNative(addr: Long): Tls12CryptoInfoAriaGcm128 =
                    Tls12CryptoInfoAriaGcm128(
                        (TlsCryptoInfo.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_ARIA_GCM_128_IV_SIZE).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_ARIA_GCM_128_KEY_SIZE).toInt())
                        ).readNative(addr + off2).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_ARIA_GCM_128_SALT_SIZE).toInt())
                        ).readNative(addr + off3).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_ARIA_GCM_128_REC_SEQ_SIZE).toInt())
                        ).readNative(addr + off4).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Tls12CryptoInfoAriaGcm128) {
                    (TlsCryptoInfo.typeLayout()).writeNative(addr, value.info)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_ARIA_GCM_128_IV_SIZE).toInt())
                    ).writeNative(addr + 4L, value.iv.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_ARIA_GCM_128_KEY_SIZE).toInt())
                    ).writeNative(addr + off2, value.key.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_ARIA_GCM_128_SALT_SIZE).toInt())
                    ).writeNative(addr + off3, value.salt.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_ARIA_GCM_128_REC_SEQ_SIZE).toInt())
                    ).writeNative(addr + off4, value.recSeq.toList())
                }
            }
    }
}

public data class Tls12CryptoInfoAriaGcm256(
    public var info: TlsCryptoInfo = TlsCryptoInfo(),
    public var iv: UByteArray = UByteArray(TLS_CIPHER_ARIA_GCM_256_IV_SIZE),
    public var key: UByteArray = UByteArray(TLS_CIPHER_ARIA_GCM_256_KEY_SIZE),
    public var salt: UByteArray = UByteArray(TLS_CIPHER_ARIA_GCM_256_SALT_SIZE),
    public var recSeq: UByteArray = UByteArray(TLS_CIPHER_ARIA_GCM_256_REC_SEQ_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tls12CryptoInfoAriaGcm256) return false
        if (this.info != other.info) return false
        if (!this.iv.contentEquals(other.iv)) return false
        if (!this.key.contentEquals(other.key)) return false
        if (!this.salt.contentEquals(other.salt)) return false
        if (!this.recSeq.contentEquals(other.recSeq)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.info.hashCode()
        result = 31 * result + this.iv.contentHashCode()
        result = 31 * result + this.key.contentHashCode()
        result = 31 * result + this.salt.contentHashCode()
        result = 31 * result + this.recSeq.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tls12CryptoInfoAriaGcm256> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tls12CryptoInfoAriaGcm256> {
                override val alignBytes: Long = 2L
                private val off2: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((4L + ((TLS_CIPHER_ARIA_GCM_256_IV_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off3: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off2 + ((TLS_CIPHER_ARIA_GCM_256_KEY_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off4: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off3 + ((TLS_CIPHER_ARIA_GCM_256_SALT_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off4 + ((TLS_CIPHER_ARIA_GCM_256_REC_SEQ_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 2L)
                override fun readNative(addr: Long): Tls12CryptoInfoAriaGcm256 =
                    Tls12CryptoInfoAriaGcm256(
                        (TlsCryptoInfo.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_ARIA_GCM_256_IV_SIZE).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_ARIA_GCM_256_KEY_SIZE).toInt())
                        ).readNative(addr + off2).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_ARIA_GCM_256_SALT_SIZE).toInt())
                        ).readNative(addr + off3).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_ARIA_GCM_256_REC_SEQ_SIZE).toInt())
                        ).readNative(addr + off4).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Tls12CryptoInfoAriaGcm256) {
                    (TlsCryptoInfo.typeLayout()).writeNative(addr, value.info)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_ARIA_GCM_256_IV_SIZE).toInt())
                    ).writeNative(addr + 4L, value.iv.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_ARIA_GCM_256_KEY_SIZE).toInt())
                    ).writeNative(addr + off2, value.key.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_ARIA_GCM_256_SALT_SIZE).toInt())
                    ).writeNative(addr + off3, value.salt.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TLS_CIPHER_ARIA_GCM_256_REC_SEQ_SIZE).toInt())
                    ).writeNative(addr + off4, value.recSeq.toList())
                }
            }
    }
}

// linux/wireless.h
public data class IwParam(
    public var value: S32 = 0,
    public var fixed: U8 = 0u,
    public var disabled: U8 = 0u,
    public var flags: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IwParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IwParam> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IwParam =
                    IwParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: IwParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.fixed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.disabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.flags)
                }
            }
    }
}

public class IwPoint internal constructor(
    pointerCtorArg: MutPtr<CVoid>,
    public var length: U16,
    public var flags: U16,
) {
    public var pointer: MutPtr<CVoid> = pointerCtorArg
        internal set

    public constructor() : this(
        pointerCtorArg = MutPtr(0L),
        length = 0u,
        flags = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pointer

    public operator fun component2(): U16 = this.length

    public operator fun component3(): U16 = this.flags

    public fun copy(pointer: MutPtr<CVoid> = this.pointer, length: U16 = this.length, flags: U16 = this.flags): IwPoint = IwPoint(pointerCtorArg = pointer, length = length, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IwPoint) return false
        if (this.pointer != other.pointer) return false
        if (this.length != other.length) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pointer.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IwPoint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IwPoint> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): IwPoint =
                    IwPoint(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: IwPoint) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.pointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.flags)
                }
            }

        public operator fun invoke(
            pointer: MutPtr<CVoid> = MutPtr(0L),
            length: U16 = 0u,
            flags: U16 = 0u,
        ): IwPoint =
            IwPoint(
                pointerCtorArg = pointer,
                length = length,
                flags = flags,
            )
    }
}

public data class IwFreq(
    public var m: S32 = 0,
    public var e: S16 = 0,
    public var i: U8 = 0u,
    public var flags: U8 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IwFreq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IwFreq> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IwFreq =
                    IwFreq(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                    )
                override fun writeNative(addr: Long, value: IwFreq) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.m)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.e)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.i)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.flags)
                }
            }
    }
}

public data class IwQuality(
    public var qual: U8 = 0u,
    public var level: U8 = 0u,
    public var noise: U8 = 0u,
    public var updated: U8 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IwQuality> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IwQuality> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): IwQuality =
                    IwQuality(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: IwQuality) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.qual)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.level)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.noise)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.updated)
                }
            }
    }
}

public data class IwDiscarded(
    public var nwid: U32 = 0u,
    public var code: U32 = 0u,
    public var fragment: U32 = 0u,
    public var retries: U32 = 0u,
    public var pubmisc: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IwDiscarded> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IwDiscarded> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): IwDiscarded =
                    IwDiscarded(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IwDiscarded) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nwid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.code)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fragment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.retries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.pubmisc)
                }
            }
    }
}

public data class IwMissed(
    public var beacon: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IwMissed> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IwMissed> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): IwMissed =
                    IwMissed(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IwMissed) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.beacon)
                }
            }
    }
}

public data class IwScanReq(
    public var scanType: U8 = 0u,
    public var essidLen: U8 = 0u,
    public var numChannels: U8 = 0u,
    public var flags: U8 = 0u,
    public var bssid: Sockaddr = Sockaddr(),
    public var essid: UByteArray = UByteArray(IW_ESSID_MAX_SIZE),
    public var minChannelTime: U32 = 0u,
    public var maxChannelTime: U32 = 0u,
    public var channelList: List<IwFreq> = List(IW_MAX_FREQUENCIES) { IwFreq() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IwScanReq) return false
        if (this.scanType != other.scanType) return false
        if (this.essidLen != other.essidLen) return false
        if (this.numChannels != other.numChannels) return false
        if (this.flags != other.flags) return false
        if (this.bssid != other.bssid) return false
        if (!this.essid.contentEquals(other.essid)) return false
        if (this.minChannelTime != other.minChannelTime) return false
        if (this.maxChannelTime != other.maxChannelTime) return false
        if (this.channelList != other.channelList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scanType.hashCode()
        result = 31 * result + this.essidLen.hashCode()
        result = 31 * result + this.numChannels.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.bssid.hashCode()
        result = 31 * result + this.essid.contentHashCode()
        result = 31 * result + this.minChannelTime.hashCode()
        result = 31 * result + this.maxChannelTime.hashCode()
        result = 31 * result + this.channelList.hashCode()
        return result
    }
}

public data class IwEncodeExt(
    public var extFlags: U32 = 0u,
    public var txSeq: UByteArray = UByteArray(IW_ENCODE_SEQ_MAX_SIZE),
    public var rxSeq: UByteArray = UByteArray(IW_ENCODE_SEQ_MAX_SIZE),
    public var addr: Sockaddr = Sockaddr(),
    public var alg: U16 = 0u,
    public var keyLen: U16 = 0u,
    public var key: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IwEncodeExt) return false
        if (this.extFlags != other.extFlags) return false
        if (!this.txSeq.contentEquals(other.txSeq)) return false
        if (!this.rxSeq.contentEquals(other.rxSeq)) return false
        if (this.addr != other.addr) return false
        if (this.alg != other.alg) return false
        if (this.keyLen != other.keyLen) return false
        if (!this.key.contentEquals(other.key)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.extFlags.hashCode()
        result = 31 * result + this.txSeq.contentHashCode()
        result = 31 * result + this.rxSeq.contentHashCode()
        result = 31 * result + this.addr.hashCode()
        result = 31 * result + this.alg.hashCode()
        result = 31 * result + this.keyLen.hashCode()
        result = 31 * result + this.key.contentHashCode()
        return result
    }
}

public data class IwPmksa(
    public var cmd: U32 = 0u,
    public var bssid: Sockaddr = Sockaddr(),
    public var pmkid: UByteArray = UByteArray(IW_PMKID_LEN),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IwPmksa) return false
        if (this.cmd != other.cmd) return false
        if (this.bssid != other.bssid) return false
        if (!this.pmkid.contentEquals(other.pmkid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cmd.hashCode()
        result = 31 * result + this.bssid.hashCode()
        result = 31 * result + this.pmkid.contentHashCode()
        return result
    }
}

public data class IwPmkidCand(
    public var flags: U32 = 0u,
    public var index: U32 = 0u,
    public var bssid: Sockaddr = Sockaddr(),
)

public data class IwStatistics(
    public var status: U16 = 0u,
    public var qual: IwQuality = IwQuality(),
    public var discard: IwDiscarded = IwDiscarded(),
    public var miss: IwMissed = IwMissed(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IwStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IwStatistics> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): IwStatistics =
                    IwStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (IwQuality.typeLayout()).readNative(addr + 2L),
                        (IwDiscarded.typeLayout()).readNative(addr + 8L),
                        (IwMissed.typeLayout()).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: IwStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.status)
                    (IwQuality.typeLayout()).writeNative(addr + 2L, value.qual)
                    (IwDiscarded.typeLayout()).writeNative(addr + 8L, value.discard)
                    (IwMissed.typeLayout()).writeNative(addr + 28L, value.miss)
                }
            }
    }
}

public class IwRange(
    public var throughput: U32 = 0u,
    public var minNwid: U32 = 0u,
    public var maxNwid: U32 = 0u,
    public var oldNumChannels: U16 = 0u,
    public var oldNumFrequency: U8 = 0u,
    public var scanCapa: U8 = 0u,
    public var eventCapa: UIntArray = UIntArray(6),
    public var sensitivity: S32 = 0,
    public var maxQual: IwQuality = IwQuality(),
    public var avgQual: IwQuality = IwQuality(),
    public var numBitrates: U8 = 0u,
    public var bitrate: IntArray = IntArray(IW_MAX_BITRATES),
    public var minRts: S32 = 0,
    public var maxRts: S32 = 0,
    public var minFrag: S32 = 0,
    public var maxFrag: S32 = 0,
    public var minPmp: S32 = 0,
    public var maxPmp: S32 = 0,
    public var minPmt: S32 = 0,
    public var maxPmt: S32 = 0,
    public var pmpFlags: U16 = 0u,
    public var pmtFlags: U16 = 0u,
    public var pmCapa: U16 = 0u,
    public var encodingSize: UShortArray = UShortArray(IW_MAX_ENCODING_SIZES),
    public var numEncodingSizes: U8 = 0u,
    public var maxEncodingTokens: U8 = 0u,
    public var encodingLoginIndex: U8 = 0u,
    public var txpowerCapa: U16 = 0u,
    public var numTxpower: U8 = 0u,
    public var txpower: IntArray = IntArray(IW_MAX_TXPOWER),
    public var weVersionCompiled: U8 = 0u,
    public var weVersionSource: U8 = 0u,
    public var retryCapa: U16 = 0u,
    public var retryFlags: U16 = 0u,
    public var rTimeFlags: U16 = 0u,
    public var minRetry: S32 = 0,
    public var maxRetry: S32 = 0,
    public var minRTime: S32 = 0,
    public var maxRTime: S32 = 0,
    public var numChannels: U16 = 0u,
    public var numFrequency: U8 = 0u,
    public var freq: List<IwFreq> = List(IW_MAX_FREQUENCIES) { IwFreq() },
    public var encCapa: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IwRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IwRange> {
                override val alignBytes: Long = 4L
                private val off12: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((56L + ((IW_MAX_BITRATES).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).strideBytes)), 4L)
                private val off13: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off12 + 4L), 4L)
                private val off14: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off13 + 4L), 4L)
                private val off15: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off14 + 4L), 4L)
                private val off16: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off15 + 4L), 4L)
                private val off17: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off16 + 4L), 4L)
                private val off18: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off17 + 4L), 4L)
                private val off19: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off18 + 4L), 4L)
                private val off20: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off19 + 4L), 2L)
                private val off21: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off20 + 2L), 2L)
                private val off22: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off21 + 2L), 2L)
                private val off23: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off22 + 2L), 2L)
                private val off24: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off23 + ((IW_MAX_ENCODING_SIZES).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).strideBytes)), 1L)
                private val off25: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off24 + 1L), 1L)
                private val off26: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off25 + 1L), 1L)
                private val off27: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off26 + 1L), 2L)
                private val off28: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off27 + 2L), 1L)
                private val off29: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off28 + 1L), 4L)
                private val off30: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off29 + ((IW_MAX_TXPOWER).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).strideBytes)), 1L)
                private val off31: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off30 + 1L), 1L)
                private val off32: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off31 + 1L), 2L)
                private val off33: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off32 + 2L), 2L)
                private val off34: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off33 + 2L), 2L)
                private val off35: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off34 + 2L), 4L)
                private val off36: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off35 + 4L), 4L)
                private val off37: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off36 + 4L), 4L)
                private val off38: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off37 + 4L), 4L)
                private val off39: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off38 + 4L), 2L)
                private val off40: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off39 + 2L), 1L)
                private val off41: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off40 + 1L), 4L)
                private val off42: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off41 + ((IW_MAX_FREQUENCIES).toLong() * (IwFreq.typeLayout()).strideBytes)), 4L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off42 + 4L), 4L)
                override fun readNative(addr: Long): IwRange =
                    IwRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 15L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (6).toInt())
                        ).readNative(addr + 16L).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (IwQuality.typeLayout()).readNative(addr + 44L),
                        (IwQuality.typeLayout()).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 52L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (IW_MAX_BITRATES).toInt())
                        ).readNative(addr + 56L).toIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off12),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off13),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off14),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off15),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off16),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off17),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off18),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off19),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + off20),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + off21),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + off22),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (IW_MAX_ENCODING_SIZES).toInt())
                        ).readNative(addr + off23).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + off24),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + off25),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + off26),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + off27),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + off28),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (IW_MAX_TXPOWER).toInt())
                        ).readNative(addr + off29).toIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + off30),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + off31),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + off32),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + off33),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + off34),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off35),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off36),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off37),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off38),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + off39),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + off40),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(IwFreq.typeLayout(), (IW_MAX_FREQUENCIES).toInt())
                        ).readNative(addr + off41),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off42),
                    )
                override fun writeNative(addr: Long, value: IwRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.throughput)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.minNwid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maxNwid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.oldNumChannels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 14L, value.oldNumFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 15L, value.scanCapa)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (6).toInt())
                    ).writeNative(addr + 16L, value.eventCapa.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.sensitivity)
                    (IwQuality.typeLayout()).writeNative(addr + 44L, value.maxQual)
                    (IwQuality.typeLayout()).writeNative(addr + 48L, value.avgQual)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 52L, value.numBitrates)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (IW_MAX_BITRATES).toInt())
                    ).writeNative(addr + 56L, value.bitrate.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off12, value.minRts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off13, value.maxRts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off14, value.minFrag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off15, value.maxFrag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off16, value.minPmp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off17, value.maxPmp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off18, value.minPmt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off19, value.maxPmt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + off20, value.pmpFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + off21, value.pmtFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + off22, value.pmCapa)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (IW_MAX_ENCODING_SIZES).toInt())
                    ).writeNative(addr + off23, value.encodingSize.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + off24, value.numEncodingSizes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + off25, value.maxEncodingTokens)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + off26, value.encodingLoginIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + off27, value.txpowerCapa)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + off28, value.numTxpower)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (IW_MAX_TXPOWER).toInt())
                    ).writeNative(addr + off29, value.txpower.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + off30, value.weVersionCompiled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + off31, value.weVersionSource)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + off32, value.retryCapa)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + off33, value.retryFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + off34, value.rTimeFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off35, value.minRetry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off36, value.maxRetry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off37, value.minRTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off38, value.maxRTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + off39, value.numChannels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + off40, value.numFrequency)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(IwFreq.typeLayout(), (IW_MAX_FREQUENCIES).toInt())
                    ).writeNative(addr + off41, value.freq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off42, value.encCapa)
                }
            }
    }
}

public data class IwPrivArgs(
    public var cmd: U32 = 0u,
    public var setArgs: U16 = 0u,
    public var getArgs: U16 = 0u,
    public var name: UByteArray = UByteArray(IFNAMSIZ.toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IwPrivArgs) return false
        if (this.cmd != other.cmd) return false
        if (this.setArgs != other.setArgs) return false
        if (this.getArgs != other.getArgs) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cmd.hashCode()
        result = 31 * result + this.setArgs.hashCode()
        result = 31 * result + this.getArgs.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IwPrivArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IwPrivArgs> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((8L + ((IFNAMSIZ).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 4L)
                override fun readNative(addr: Long): IwPrivArgs =
                    IwPrivArgs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (IFNAMSIZ).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: IwPrivArgs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cmd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.setArgs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.getArgs)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (IFNAMSIZ).toInt())
                    ).writeNative(addr + 8L, value.name.toList())
                }
            }
    }
}

// #include <linux/eventpoll.h>
public data class EpollParams(
    public var busyPollUsecs: UInt = 0u,
    public var busyPollBudget: UShort = 0u,
    public var preferBusyPoll: UByte = 0u,
    public var pad: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EpollParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EpollParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): EpollParams =
                    EpollParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                    )
                override fun writeNative(addr: Long, value: EpollParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.busyPollUsecs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.busyPollBudget)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.preferBusyPoll)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.pad)
                }
            }
    }
}

public data class PthreadMutexattrT(
    public var size: UByteArray = UByteArray(SIZEOF_PTHREAD_MUTEXATTR_T),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexattrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexattrT> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((SIZEOF_PTHREAD_MUTEXATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 1L)
                override fun readNative(addr: Long): PthreadMutexattrT =
                    PthreadMutexattrT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_MUTEXATTR_T).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadMutexattrT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_MUTEXATTR_T).toInt())
                    ).writeNative(addr, value.size.toList())
                }
            }
    }
}

public data class PthreadRwlockattrT(
    public var size: UByteArray = UByteArray(SIZEOF_PTHREAD_RWLOCKATTR_T),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockattrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockattrT> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((SIZEOF_PTHREAD_RWLOCKATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 1L)
                override fun readNative(addr: Long): PthreadRwlockattrT =
                    PthreadRwlockattrT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_RWLOCKATTR_T).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadRwlockattrT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_RWLOCKATTR_T).toInt())
                    ).writeNative(addr, value.size.toList())
                }
            }
    }
}

public data class PthreadCondattrT(
    public var size: UByteArray = UByteArray(SIZEOF_PTHREAD_CONDATTR_T),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondattrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondattrT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((SIZEOF_PTHREAD_CONDATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L)
                override fun readNative(addr: Long): PthreadCondattrT =
                    PthreadCondattrT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_CONDATTR_T).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadCondattrT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_CONDATTR_T).toInt())
                    ).writeNative(addr, value.size.toList())
                }
            }
    }
}

public data class PthreadBarrierattrT(
    public var size: UByteArray = UByteArray(SIZEOF_PTHREAD_BARRIERATTR_T),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadBarrierattrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadBarrierattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadBarrierattrT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((SIZEOF_PTHREAD_BARRIERATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L)
                override fun readNative(addr: Long): PthreadBarrierattrT =
                    PthreadBarrierattrT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_BARRIERATTR_T).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadBarrierattrT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_BARRIERATTR_T).toInt())
                    ).writeNative(addr, value.size.toList())
                }
            }
    }
}

public data class FanotifyEventMetadata(
    public var eventLen: U32 = 0u,
    public var vers: U8 = 0u,
    public var reserved: U8 = 0u,
    public var metadataLen: U16 = 0u,
    public var mask: U64 = 0uL,
    public var fd: CInt = 0,
    public var pid: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FanotifyEventMetadata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FanotifyEventMetadata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): FanotifyEventMetadata =
                    FanotifyEventMetadata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: FanotifyEventMetadata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.eventLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.vers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.metadataLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.fd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.pid)
                }
            }
    }
}

// linux/ptpClock.h
public data class PtpSysOffset(
    public var nSamples: CUint = 0u,
    public var rsv: UIntArray = UIntArray(3),
    // Note(garando): replace length with `2 * PTP_MAX_SAMPLES + 1` when supported
    public var ts: List<PtpClockTime> = List(51) { PtpClockTime() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtpSysOffset) return false
        if (this.nSamples != other.nSamples) return false
        if (!this.rsv.contentEquals(other.rsv)) return false
        if (this.ts != other.ts) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nSamples.hashCode()
        result = 31 * result + this.rsv.contentHashCode()
        result = 31 * result + this.ts.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtpSysOffset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtpSysOffset> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 832L
                override fun readNative(addr: Long): PtpSysOffset =
                    PtpSysOffset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PtpClockTime.typeLayout(), (51).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PtpSysOffset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nSamples)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr + 4L, value.rsv.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PtpClockTime.typeLayout(), (51).toInt())
                    ).writeNative(addr + 16L, value.ts)
                }
            }
    }
}

public data class PtpPinDesc(
    public var name: UByteArray = UByteArray(64),
    public var index: CUint = 0u,
    public var func: CUint = 0u,
    public var chan: CUint = 0u,
    public var rsv: UIntArray = UIntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtpPinDesc) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.index != other.index) return false
        if (this.func != other.func) return false
        if (this.chan != other.chan) return false
        if (!this.rsv.contentEquals(other.rsv)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.func.hashCode()
        result = 31 * result + this.chan.hashCode()
        result = 31 * result + this.rsv.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtpPinDesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtpPinDesc> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): PtpPinDesc =
                    PtpPinDesc(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (5).toInt())
                        ).readNative(addr + 76L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: PtpPinDesc) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                    ).writeNative(addr, value.name.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.func)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.chan)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (5).toInt())
                    ).writeNative(addr + 76L, value.rsv.toList())
                }
            }
    }
}

public data class PtpClockCaps(
    public var maxAdj: CInt = 0,
    public var nAlarm: CInt = 0,
    public var nExtTs: CInt = 0,
    public var nPerOut: CInt = 0,
    public var pps: CInt = 0,
    public var nPins: CInt = 0,
    public var crossTimestamping: CInt = 0,
    public var adjustPhase: CInt = 0,
    public var maxPhaseAdj: CInt = 0,
    public var rsv: IntArray = IntArray(11),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtpClockCaps) return false
        if (this.maxAdj != other.maxAdj) return false
        if (this.nAlarm != other.nAlarm) return false
        if (this.nExtTs != other.nExtTs) return false
        if (this.nPerOut != other.nPerOut) return false
        if (this.pps != other.pps) return false
        if (this.nPins != other.nPins) return false
        if (this.crossTimestamping != other.crossTimestamping) return false
        if (this.adjustPhase != other.adjustPhase) return false
        if (this.maxPhaseAdj != other.maxPhaseAdj) return false
        if (!this.rsv.contentEquals(other.rsv)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxAdj.hashCode()
        result = 31 * result + this.nAlarm.hashCode()
        result = 31 * result + this.nExtTs.hashCode()
        result = 31 * result + this.nPerOut.hashCode()
        result = 31 * result + this.pps.hashCode()
        result = 31 * result + this.nPins.hashCode()
        result = 31 * result + this.crossTimestamping.hashCode()
        result = 31 * result + this.adjustPhase.hashCode()
        result = 31 * result + this.maxPhaseAdj.hashCode()
        result = 31 * result + this.rsv.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtpClockCaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtpClockCaps> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): PtpClockCaps =
                    PtpClockCaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (11).toInt())
                        ).readNative(addr + 36L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: PtpClockCaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.maxAdj)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.nAlarm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.nExtTs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.nPerOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.pps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.nPins)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.crossTimestamping)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.adjustPhase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.maxPhaseAdj)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (11).toInt())
                    ).writeNative(addr + 36L, value.rsv.toList())
                }
            }
    }
}

// linux/ifXdp.h
public data class SockaddrXdp(
    public var sxdpFamily: U16 = 0u,
    public var sxdpFlags: U16 = 0u,
    public var sxdpIfindex: U32 = 0u,
    public var sxdpQueueId: U32 = 0u,
    public var sxdpSharedUmemFd: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrXdp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrXdp> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SockaddrXdp =
                    SockaddrXdp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SockaddrXdp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sxdpFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sxdpFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sxdpIfindex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sxdpQueueId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sxdpSharedUmemFd)
                }
            }
    }
}

public data class XdpRingOffset(
    public var producer: U64 = 0uL,
    public var consumer: U64 = 0uL,
    public var desc: U64 = 0uL,
    public var flags: U64 = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpRingOffset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpRingOffset> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): XdpRingOffset =
                    XdpRingOffset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: XdpRingOffset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.producer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.consumer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.desc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.flags)
                }
            }
    }
}

public data class XdpMmapOffsets(
    public var rx: XdpRingOffset = XdpRingOffset(),
    public var tx: XdpRingOffset = XdpRingOffset(),
    public var fr: XdpRingOffset = XdpRingOffset(),
    public var cr: XdpRingOffset = XdpRingOffset(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpMmapOffsets> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpMmapOffsets> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): XdpMmapOffsets =
                    XdpMmapOffsets(
                        (XdpRingOffset.typeLayout()).readNative(addr),
                        (XdpRingOffset.typeLayout()).readNative(addr + 32L),
                        (XdpRingOffset.typeLayout()).readNative(addr + 64L),
                        (XdpRingOffset.typeLayout()).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: XdpMmapOffsets) {
                    (XdpRingOffset.typeLayout()).writeNative(addr, value.rx)
                    (XdpRingOffset.typeLayout()).writeNative(addr + 32L, value.tx)
                    (XdpRingOffset.typeLayout()).writeNative(addr + 64L, value.fr)
                    (XdpRingOffset.typeLayout()).writeNative(addr + 96L, value.cr)
                }
            }
    }
}

public data class XdpRingOffsetV1(
    public var producer: U64 = 0uL,
    public var consumer: U64 = 0uL,
    public var desc: U64 = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpRingOffsetV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpRingOffsetV1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): XdpRingOffsetV1 =
                    XdpRingOffsetV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: XdpRingOffsetV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.producer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.consumer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.desc)
                }
            }
    }
}

public data class XdpMmapOffsetsV1(
    public var rx: XdpRingOffsetV1 = XdpRingOffsetV1(),
    public var tx: XdpRingOffsetV1 = XdpRingOffsetV1(),
    public var fr: XdpRingOffsetV1 = XdpRingOffsetV1(),
    public var cr: XdpRingOffsetV1 = XdpRingOffsetV1(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpMmapOffsetsV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpMmapOffsetsV1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): XdpMmapOffsetsV1 =
                    XdpMmapOffsetsV1(
                        (XdpRingOffsetV1.typeLayout()).readNative(addr),
                        (XdpRingOffsetV1.typeLayout()).readNative(addr + 24L),
                        (XdpRingOffsetV1.typeLayout()).readNative(addr + 48L),
                        (XdpRingOffsetV1.typeLayout()).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: XdpMmapOffsetsV1) {
                    (XdpRingOffsetV1.typeLayout()).writeNative(addr, value.rx)
                    (XdpRingOffsetV1.typeLayout()).writeNative(addr + 24L, value.tx)
                    (XdpRingOffsetV1.typeLayout()).writeNative(addr + 48L, value.fr)
                    (XdpRingOffsetV1.typeLayout()).writeNative(addr + 72L, value.cr)
                }
            }
    }
}

public data class XdpUmemReg(
    public var addr: U64 = 0uL,
    public var len: U64 = 0uL,
    public var chunkSize: U32 = 0u,
    public var headroom: U32 = 0u,
    public var flags: U32 = 0u,
    public var txMetadataLen: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpUmemReg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpUmemReg> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): XdpUmemReg =
                    XdpUmemReg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: XdpUmemReg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.addr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.len)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.chunkSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.headroom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.txMetadataLen)
                }
            }
    }
}

public data class XdpUmemRegV1(
    public var addr: U64 = 0uL,
    public var len: U64 = 0uL,
    public var chunkSize: U32 = 0u,
    public var headroom: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpUmemRegV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpUmemRegV1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): XdpUmemRegV1 =
                    XdpUmemRegV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: XdpUmemRegV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.addr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.len)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.chunkSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.headroom)
                }
            }
    }
}

public data class XdpStatistics(
    public var rxDropped: U64 = 0uL,
    public var rxInvalidDescs: U64 = 0uL,
    public var txInvalidDescs: U64 = 0uL,
    public var rxRingFull: U64 = 0uL,
    public var rxFillRingEmptyDescs: U64 = 0uL,
    public var txRingEmptyDescs: U64 = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpStatistics> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): XdpStatistics =
                    XdpStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: XdpStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.rxDropped)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rxInvalidDescs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.txInvalidDescs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.rxRingFull)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.rxFillRingEmptyDescs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.txRingEmptyDescs)
                }
            }
    }
}

public data class XdpStatisticsV1(
    public var rxDropped: U64 = 0uL,
    public var rxInvalidDescs: U64 = 0uL,
    public var txInvalidDescs: U64 = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpStatisticsV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpStatisticsV1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): XdpStatisticsV1 =
                    XdpStatisticsV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: XdpStatisticsV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.rxDropped)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rxInvalidDescs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.txInvalidDescs)
                }
            }
    }
}

public data class XdpOptions(
    public var flags: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpOptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpOptions> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): XdpOptions =
                    XdpOptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: XdpOptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public data class XdpDesc(
    public var addr: U64 = 0uL,
    public var len: U32 = 0u,
    public var options: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpDesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XdpDesc> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): XdpDesc =
                    XdpDesc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: XdpDesc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.addr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.len)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.options)
                }
            }
    }
}

public data class XskTxMetadataCompletion(
    public var txTimestamp: U64 = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XskTxMetadataCompletion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XskTxMetadataCompletion> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): XskTxMetadataCompletion =
                    XskTxMetadataCompletion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: XskTxMetadataCompletion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.txTimestamp)
                }
            }
    }
}

public data class XskTxMetadataRequest(
    public var csumStart: U16 = 0u,
    public var csumOffset: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XskTxMetadataRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XskTxMetadataRequest> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): XskTxMetadataRequest =
                    XskTxMetadataRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: XskTxMetadataRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.csumStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.csumOffset)
                }
            }
    }
}

// linux/mount.h
public data class MountAttr(
    public var attrSet: U64 = 0uL,
    public var attrClr: U64 = 0uL,
    public var propagation: U64 = 0uL,
    public var usernsFd: U64 = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MountAttr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MountAttr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MountAttr =
                    MountAttr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MountAttr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.attrSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.attrClr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.propagation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.usernsFd)
                }
            }
    }
}

// linux/nsfs.h
public data class MntNsInfo(
    public var size: U32 = 0u,
    public var nrMounts: U32 = 0u,
    public var mntNsId: U64 = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MntNsInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MntNsInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MntNsInfo =
                    MntNsInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MntNsInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nrMounts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.mntNsId)
                }
            }
    }
}

public data class PidfdInfo(
    public var mask: U64 = 0uL,
    public var cgroupid: U64 = 0uL,
    public var pid: U32 = 0u,
    public var tgid: U32 = 0u,
    public var ppid: U32 = 0u,
    public var ruid: U32 = 0u,
    public var rgid: U32 = 0u,
    public var euid: U32 = 0u,
    public var egid: U32 = 0u,
    public var suid: U32 = 0u,
    public var sgid: U32 = 0u,
    public var fsuid: U32 = 0u,
    public var fsgid: U32 = 0u,
    public var exitCode: S32 = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PidfdInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PidfdInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): PidfdInfo =
                    PidfdInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                    )
                override fun writeNative(addr: Long, value: PidfdInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.cgroupid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.pid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.tgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.ppid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.ruid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.rgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.euid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.egid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.suid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.sgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.fsuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.fsgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.exitCode)
                }
            }
    }
}

// linux/uio.h
public data class DmabufCmsg(
    public var fragOffset: U64 = 0uL,
    public var fragSize: U32 = 0u,
    public var fragToken: U32 = 0u,
    public var dmabufId: U32 = 0u,
    public var flags: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmabufCmsg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmabufCmsg> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DmabufCmsg =
                    DmabufCmsg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: DmabufCmsg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.fragOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fragSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fragToken)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dmabufId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.flags)
                }
            }
    }
}

public data class DmabufToken(
    public var tokenStart: U32 = 0u,
    public var tokenCount: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmabufToken> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmabufToken> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DmabufToken =
                    DmabufToken(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DmabufToken) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tokenStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.tokenCount)
                }
            }
    }
}

public data class SockaddrAlg(
    public var salgFamily: SaFamilyT = 0u,
    public var salgType: UByteArray = UByteArray(14),
    public var salgFeat: UInt = 0u,
    public var salgMask: UInt = 0u,
    public var salgName: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrAlg) return false
        if (this.salgFamily != other.salgFamily) return false
        if (!this.salgType.contentEquals(other.salgType)) return false
        if (this.salgFeat != other.salgFeat) return false
        if (this.salgMask != other.salgMask) return false
        if (!this.salgName.contentEquals(other.salgName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.salgFamily.hashCode()
        result = 31 * result + this.salgType.contentHashCode()
        result = 31 * result + this.salgFeat.hashCode()
        result = 31 * result + this.salgMask.hashCode()
        result = 31 * result + this.salgName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrAlg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrAlg> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): SockaddrAlg =
                    SockaddrAlg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SockaddrAlg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.salgFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                    ).writeNative(addr + 2L, value.salgType.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.salgFeat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.salgMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                    ).writeNative(addr + 24L, value.salgName.toList())
                }
            }
    }
}

public data class PthreadCondT(
    public var size: UByteArray = UByteArray(SIZEOF_PTHREAD_COND_T),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondT> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((SIZEOF_PTHREAD_COND_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 1L)
                override fun readNative(addr: Long): PthreadCondT =
                    PthreadCondT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_COND_T).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadCondT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_COND_T).toInt())
                    ).writeNative(addr, value.size.toList())
                }
            }
    }
}

public data class PthreadMutexT(
    public var size: UByteArray = UByteArray(SIZEOF_PTHREAD_MUTEX_T),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexT> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((SIZEOF_PTHREAD_MUTEX_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 1L)
                override fun readNative(addr: Long): PthreadMutexT =
                    PthreadMutexT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_MUTEX_T).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadMutexT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_MUTEX_T).toInt())
                    ).writeNative(addr, value.size.toList())
                }
            }
    }
}

public data class PthreadRwlockT(
    public var size: UByteArray = UByteArray(SIZEOF_PTHREAD_RWLOCK_T),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((SIZEOF_PTHREAD_RWLOCK_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 1L)
                override fun readNative(addr: Long): PthreadRwlockT =
                    PthreadRwlockT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_RWLOCK_T).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadRwlockT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_RWLOCK_T).toInt())
                    ).writeNative(addr, value.size.toList())
                }
            }
    }
}

public data class PthreadBarrierT(
    public var size: UByteArray = UByteArray(SIZEOF_PTHREAD_BARRIER_T),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadBarrierT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadBarrierT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadBarrierT> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((SIZEOF_PTHREAD_BARRIER_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 1L)
                override fun readNative(addr: Long): PthreadBarrierT =
                    PthreadBarrierT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_BARRIER_T).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadBarrierT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_BARRIER_T).toInt())
                    ).writeNative(addr, value.size.toList())
                }
            }
    }
}

public data class UinputSetup(
    public var id: InputId = InputId(),
    public var name: UByteArray = UByteArray(UINPUT_MAX_NAME_SIZE),
    public var ffEffectsMax: U32 = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UinputSetup) return false
        if (this.id != other.id) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.ffEffectsMax != other.ffEffectsMax) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.ffEffectsMax.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputSetup> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputSetup> {
                override val alignBytes: Long = 4L
                private val off2: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((8L + ((UINPUT_MAX_NAME_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 4L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off2 + 4L), 4L)
                override fun readNative(addr: Long): UinputSetup =
                    UinputSetup(
                        (InputId.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UINPUT_MAX_NAME_SIZE).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off2),
                    )
                override fun writeNative(addr: Long, value: UinputSetup) {
                    (InputId.typeLayout()).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UINPUT_MAX_NAME_SIZE).toInt())
                    ).writeNative(addr + 8L, value.name.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off2, value.ffEffectsMax)
                }
            }
    }
}

public data class UinputUserDev(
    public var name: UByteArray = UByteArray(UINPUT_MAX_NAME_SIZE),
    public var id: InputId = InputId(),
    public var ffEffectsMax: U32 = 0u,
    public var absmax: IntArray = IntArray(ABS_CNT),
    public var absmin: IntArray = IntArray(ABS_CNT),
    public var absfuzz: IntArray = IntArray(ABS_CNT),
    public var absflat: IntArray = IntArray(ABS_CNT),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UinputUserDev) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.id != other.id) return false
        if (this.ffEffectsMax != other.ffEffectsMax) return false
        if (!this.absmax.contentEquals(other.absmax)) return false
        if (!this.absmin.contentEquals(other.absmin)) return false
        if (!this.absfuzz.contentEquals(other.absfuzz)) return false
        if (!this.absflat.contentEquals(other.absflat)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.id.hashCode()
        result = 31 * result + this.ffEffectsMax.hashCode()
        result = 31 * result + this.absmax.contentHashCode()
        result = 31 * result + this.absmin.contentHashCode()
        result = 31 * result + this.absfuzz.contentHashCode()
        result = 31 * result + this.absflat.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputUserDev> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputUserDev> {
                override val alignBytes: Long = 4L
                private val off1: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((UINPUT_MAX_NAME_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 2L)
                private val off2: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off1 + 8L), 4L)
                private val off3: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off2 + 4L), 4L)
                private val off4: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off3 + ((ABS_CNT).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).strideBytes)), 4L)
                private val off5: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off4 + ((ABS_CNT).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).strideBytes)), 4L)
                private val off6: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off5 + ((ABS_CNT).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).strideBytes)), 4L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off6 + ((ABS_CNT).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).strideBytes)), 4L)
                override fun readNative(addr: Long): UinputUserDev =
                    UinputUserDev(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UINPUT_MAX_NAME_SIZE).toInt())
                        ).readNative(addr).toUByteArray(),
                        (InputId.typeLayout()).readNative(addr + off1),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off2),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (ABS_CNT).toInt())
                        ).readNative(addr + off3).toIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (ABS_CNT).toInt())
                        ).readNative(addr + off4).toIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (ABS_CNT).toInt())
                        ).readNative(addr + off5).toIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (ABS_CNT).toInt())
                        ).readNative(addr + off6).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: UinputUserDev) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UINPUT_MAX_NAME_SIZE).toInt())
                    ).writeNative(addr, value.name.toList())
                    (InputId.typeLayout()).writeNative(addr + off1, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off2, value.ffEffectsMax)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (ABS_CNT).toInt())
                    ).writeNative(addr + off3, value.absmax.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (ABS_CNT).toInt())
                    ).writeNative(addr + off4, value.absmin.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (ABS_CNT).toInt())
                    ).writeNative(addr + off5, value.absfuzz.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (ABS_CNT).toInt())
                    ).writeNative(addr + off6, value.absflat.toList())
                }
            }
    }
}

// x32 compatibility
// See https://sourceware.org/bugzilla/showBug.cgi?id=21279
public data class MqAttr(
    public var mqFlags: CLong = 0L,
    public var mqMaxmsg: CLong = 0L,
    public var mqMsgsize: CLong = 0L,
    public var mqCurmsgs: CLong = 0L,
    public var pad: LongArray = LongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MqAttr) return false
        if (this.mqFlags != other.mqFlags) return false
        if (this.mqMaxmsg != other.mqMaxmsg) return false
        if (this.mqMsgsize != other.mqMsgsize) return false
        if (this.mqCurmsgs != other.mqCurmsgs) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mqFlags.hashCode()
        result = 31 * result + this.mqMaxmsg.hashCode()
        result = 31 * result + this.mqMsgsize.hashCode()
        result = 31 * result + this.mqCurmsgs.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MqAttr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MqAttr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): MqAttr =
                    MqAttr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (4).toInt())
                        ).readNative(addr + 32L).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: MqAttr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.mqFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.mqMaxmsg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.mqMsgsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.mqCurmsgs)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (4).toInt())
                    ).writeNative(addr + 32L, value.pad.toList())
                }
            }
    }
}

public data class HwtstampConfig(
    public var flags: CInt = 0,
    public var txType: CInt = 0,
    public var rxFilter: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HwtstampConfig> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HwtstampConfig> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): HwtstampConfig =
                    HwtstampConfig(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HwtstampConfig) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.txType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.rxFilter)
                }
            }
    }
}

public data class SchedAttr(
    public var size: U32 = 0u,
    public var schedPolicy: U32 = 0u,
    public var schedFlags: U64 = 0uL,
    public var schedNice: S32 = 0,
    public var schedPriority: U32 = 0u,
    public var schedRuntime: U64 = 0uL,
    public var schedDeadline: U64 = 0uL,
    public var schedPeriod: U64 = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchedAttr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchedAttr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): SchedAttr =
                    SchedAttr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: SchedAttr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.schedPolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.schedFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.schedNice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.schedPriority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.schedRuntime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.schedDeadline)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.schedPeriod)
                }
            }
    }
}

public data class IwThrspy(
    public var addr: Sockaddr = Sockaddr(),
    public var qual: IwQuality = IwQuality(),
    public var low: IwQuality = IwQuality(),
    public var high: IwQuality = IwQuality(),
)

public data class IwMlme(
    public var cmd: U16 = 0u,
    public var reasonCode: U16 = 0u,
    public var addr: Sockaddr = Sockaddr(),
)

public data class IwMichaelmicfailure(
    public var flags: U32 = 0u,
    public var srcAddr: Sockaddr = Sockaddr(),
    public var tsc: UByteArray = UByteArray(IW_ENCODE_SEQ_MAX_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IwMichaelmicfailure) return false
        if (this.flags != other.flags) return false
        if (this.srcAddr != other.srcAddr) return false
        if (!this.tsc.contentEquals(other.tsc)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.srcAddr.hashCode()
        result = 31 * result + this.tsc.contentHashCode()
        return result
    }
}

/**
 * WARNING: The `PartialEq`, `Eq` and `Hash` implementations of this
 * type are unsound and will be removed in the future.
 */
public data class AfAlgIv(
    public var ivlen: UInt = 0u,
    public var iv: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AfAlgIv) return false
        if (this.ivlen != other.ivlen) return false
        if (!this.iv.contentEquals(other.iv)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ivlen.hashCode()
        result = 31 * result + this.iv.contentHashCode()
        return result
    }

    public fun asSlice(): List<UByte> = this.iv.take(this.ivlen.toInt())

    public fun eq(other: AfAlgIv): Boolean = this.asSlice() == other.asSlice()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AfAlgIv> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AfAlgIv> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): AfAlgIv =
                    AfAlgIv(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: AfAlgIv) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ivlen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                    ).writeNative(addr + 4L, value.iv.toList())
                }
            }
    }
}

public data class TpacketReqU(
    public var req: TpacketReq = TpacketReq(),
    public var req3: TpacketReq3 = TpacketReq3(),
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "tpacket_req_u").finishNonExhaustive()
    }
}

public data class TpacketBdHeaderU(
    public var bh1: TpacketHdrV1 = TpacketHdrV1(),
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "tpacket_bd_header_u").finishNonExhaustive()
    }
}

public data class TpacketBlockDesc(
    public var version: U32 = 0u,
    public var offsetToPriv: U32 = 0u,
    public var hdr: TpacketBdHeaderU = TpacketBdHeaderU(),
)

// linux/netTstamp.h
public data class SockTxtime(
    public var clockid: ClockidT = 0,
    public var flags: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockTxtime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockTxtime> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SockTxtime =
                    SockTxtime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SockTxtime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.clockid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

// linux/wireless.h
public class IwreqData(
    public var name: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    public var essid: IwPoint = IwPoint(),
    public var nwid: IwParam = IwParam(),
    public var freq: IwFreq = IwFreq(),
    public var sens: IwParam = IwParam(),
    public var bitrate: IwParam = IwParam(),
    public var txpower: IwParam = IwParam(),
    public var rts: IwParam = IwParam(),
    public var frag: IwParam = IwParam(),
    public var mode: U32 = 0u,
    public var retry: IwParam = IwParam(),
    public var encoding: IwPoint = IwPoint(),
    public var power: IwParam = IwParam(),
    public var qual: IwQuality = IwQuality(),
    public var apAddr: Sockaddr = Sockaddr(),
    public var addr: Sockaddr = Sockaddr(),
    public var param: IwParam = IwParam(),
    public var data: IwPoint = IwPoint(),
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "iwreq_data").finishNonExhaustive()
    }
}

public data class IwEvent(
    public var len: U16 = 0u,
    public var cmd: U16 = 0u,
    public var u: IwreqData = IwreqData(),
)

public data class CAnonymousIwreq(
    public var ifrnName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIwreq) return false
        if (!this.ifrnName.contentEquals(other.ifrnName)) return false
        return true
    }

    override fun hashCode(): Int = this.ifrnName.contentHashCode()

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_iwreq").finishNonExhaustive()
    }
}

public data class Iwreq(
    public var ifrIfrn: CAnonymousIwreq = CAnonymousIwreq(),
    public var u: IwreqData = IwreqData(),
)

// linux/ptpClock.h
public data class CAnonymousPtpPeroutRequest1(
    public var start: PtpClockTime = PtpClockTime(),
    public var phase: PtpClockTime = PtpClockTime(),
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ptp_perout_request_1").finishNonExhaustive()
    }
}

public data class CAnonymousPtpPeroutRequest2(
    public var on: PtpClockTime = PtpClockTime(),
    public var rsv: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousPtpPeroutRequest2) return false
        if (this.on != other.on) return false
        if (!this.rsv.contentEquals(other.rsv)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.on.hashCode()
        result = 31 * result + this.rsv.contentHashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ptp_perout_request_2").finishNonExhaustive()
    }
}

public data class PtpPeroutRequest(
    public var anonymous1: CAnonymousPtpPeroutRequest1 = CAnonymousPtpPeroutRequest1(),
    public var period: PtpClockTime = PtpClockTime(),
    public var index: CUint = 0u,
    public var flags: CUint = 0u,
    public var anonymous2: CAnonymousPtpPeroutRequest2 = CAnonymousPtpPeroutRequest2(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtpPeroutRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtpPeroutRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): PtpPeroutRequest {
                    val startOrPhase = PtpClockTime.typeLayout().readNative(addr)
                    val periodVal = PtpClockTime.typeLayout().readNative(addr + 16L)
                    val indexVal =
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32
                            .readNative(addr + 32L)
                    val flagsVal =
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32
                            .readNative(addr + 36L)
                    val onVal = PtpClockTime.typeLayout().readNative(addr + 40L)
                    val rsvVal =
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, 4)
                            .readNative(addr + 40L)
                            .toUIntArray()
                    return PtpPeroutRequest(
                        anonymous1 = CAnonymousPtpPeroutRequest1(start = startOrPhase, phase = startOrPhase),
                        period = periodVal,
                        index = indexVal,
                        flags = flagsVal,
                        anonymous2 = CAnonymousPtpPeroutRequest2(on = onVal, rsv = rsvVal),
                    )
                }
                override fun writeNative(addr: Long, value: PtpPeroutRequest) {
                    PtpClockTime.typeLayout().writeNative(addr, value.anonymous1.start)
                    PtpClockTime.typeLayout().writeNative(addr + 16L, value.period)
                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32
                        .writeNative(addr + 32L, value.index)
                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32
                        .writeNative(addr + 36L, value.flags)
                    PtpClockTime.typeLayout().writeNative(addr + 40L, value.anonymous2.on)
                }
            }
    }
}

// linux/ifXdp.h
public data class XskTxMetadata(
    public var flags: U64 = 0uL,
    public var xskTxMetadataUnion: CAnonymousXskTxMetadataUnion = CAnonymousXskTxMetadataUnion(),
)

public data class CAnonymousXskTxMetadataUnion(
    public var request: XskTxMetadataRequest = XskTxMetadataRequest(),
    public var completion: XskTxMetadataCompletion = XskTxMetadataCompletion(),
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_xsk_tx_metadata_union").finishNonExhaustive()
    }
}
