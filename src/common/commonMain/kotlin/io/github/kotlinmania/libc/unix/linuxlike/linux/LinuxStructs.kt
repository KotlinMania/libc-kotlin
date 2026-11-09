@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
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

public class DebugStruct(
    private val out: StringBuilder,
    private val name: String,
) {
    private val fields: MutableList<String> = mutableListOf()

    public fun field(name: String, value: Any?): DebugStruct = apply {
        fields.add("$name: $value")
    }

    public fun finish() {
        if (fields.isEmpty()) {
            out.append(name)
        } else {
            out.append(name).append(" { ").append(fields.joinToString(", ")).append(" }")
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
)

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
)

public data class FanoutArgs(
    public var id: U16 = 0u,
    public var typeFlags: U16 = 0u,
    public var maxNumMembers: U32 = 0u,
)

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
}

public data class TpacketAuxdata(
    public var tpStatus: U32 = 0u,
    public var tpLen: U32 = 0u,
    public var tpSnaplen: U32 = 0u,
    public var tpMac: U16 = 0u,
    public var tpNet: U16 = 0u,
    public var tpVlanTci: U16 = 0u,
    public var tpVlanTpid: U16 = 0u,
)

public data class TpacketHdr(
    public var tpStatus: CUlong = 0uL,
    public var tpLen: CUint = 0u,
    public var tpSnaplen: CUint = 0u,
    public var tpMac: CUshort = 0u,
    public var tpNet: CUshort = 0u,
    public var tpSec: CUint = 0u,
    public var tpUsec: CUint = 0u,
)

public data class TpacketHdrVariant1(
    public var tpRxhash: U32 = 0u,
    public var tpVlanTci: U32 = 0u,
    public var tpVlanTpid: U16 = 0u,
    public var tpPadding: U16 = 0u,
)

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
}

public data class TpacketReq(
    public var tpBlockSize: CUint = 0u,
    public var tpBlockNr: CUint = 0u,
    public var tpFrameSize: CUint = 0u,
    public var tpFrameNr: CUint = 0u,
)

public data class TpacketReq3(
    public var tpBlockSize: CUint = 0u,
    public var tpBlockNr: CUint = 0u,
    public var tpFrameSize: CUint = 0u,
    public var tpFrameNr: CUint = 0u,
    public var tpRetireBlkTov: CUint = 0u,
    public var tpSizeofPriv: CUint = 0u,
    public var tpFeatureReqWord: CUint = 0u,
)

public data class TpacketRolloverStats(
    public var tpAll: U64 = 0uL,
    public var tpHuge: U64 = 0uL,
    public var tpFailed: U64 = 0uL,
)

public data class TpacketStats(public var tpPackets: CUint = 0u, public var tpDrops: CUint = 0u)

public data class TpacketStatsV3(
    public var tpPackets: CUint = 0u,
    public var tpDrops: CUint = 0u,
    public var tpFreezeQCnt: CUint = 0u,
)

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
}

public data class TpacketBdTs(public var tsSec: CUint = 0u, public var tsUsec: CUint = 0u)

public data class TpacketHdrV1(
    public var blockStatus: U32 = 0u,
    public var numPkts: U32 = 0u,
    public var offsetToFirstPkt: U32 = 0u,
    public var blkLen: U32 = 0u,
    public var seqNum: U64 = 0uL,
    public var tsFirstPkt: TpacketBdTs = TpacketBdTs(),
    public var tsLastPkt: TpacketBdTs = TpacketBdTs(),
)

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
)

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
)

public data class InputAbsinfo(
    public var value: S32 = 0,
    public var minimum: S32 = 0,
    public var maximum: S32 = 0,
    public var fuzz: S32 = 0,
    public var flat: S32 = 0,
    public var resolution: S32 = 0,
)

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
}

public data class InputMask(
    public var type: U32 = 0u,
    public var codesSize: U32 = 0u,
    public var codesPtr: U64 = 0uL,
)

public data class FfReplay(public var length: U16 = 0u, public var delay: U16 = 0u)

public data class FfTrigger(public var button: U16 = 0u, public var interval: U16 = 0u)

public data class FfEnvelope(
    public var attackLength: U16 = 0u,
    public var attackLevel: U16 = 0u,
    public var fadeLength: U16 = 0u,
    public var fadeLevel: U16 = 0u,
)

public data class FfConstantEffect(public var level: S16 = 0, public var envelope: FfEnvelope = FfEnvelope())

public data class FfRampEffect(
    public var startLevel: S16 = 0,
    public var endLevel: S16 = 0,
    public var envelope: FfEnvelope = FfEnvelope(),
)

public data class FfConditionEffect(
    public var rightSaturation: U16 = 0u,
    public var leftSaturation: U16 = 0u,
    public var rightCoeff: S16 = 0,
    public var leftCoeff: S16 = 0,
    public var deadband: U16 = 0u,
    public var center: S16 = 0,
)

public data class FfPeriodicEffect(
    public var waveform: U16 = 0u,
    public var period: U16 = 0u,
    public var magnitude: S16 = 0,
    public var offset: S16 = 0,
    public var phase: U16 = 0u,
    public var envelope: FfEnvelope = FfEnvelope(),
    public var customLen: U32 = 0u,
    public var customData: CShort? = null,
)

public data class FfRumbleEffect(public var strongMagnitude: U16 = 0u, public var weakMagnitude: U16 = 0u)

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
}

public data class UinputFfUpload(
    public var requestId: U32 = 0u,
    public var retval: S32 = 0,
    public var effect: FfEffect = FfEffect(),
    public var old: FfEffect = FfEffect(),
)

public data class UinputFfErase(
    public var requestId: U32 = 0u,
    public var retval: S32 = 0,
    public var effectId: U32 = 0u,
)

public data class UinputAbsSetup(public var code: U16 = 0u, public var absinfo: InputAbsinfo = InputAbsinfo())

public data class CAnonymousKernelFsidT(public var value: IntArray = IntArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousKernelFsidT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.value.contentHashCode()
    }
}

public data class PosixSpawnFileActionsT(
    public var allocated: CInt = 0,
    public var used: CInt = 0,
    public var actions: CInt? = null,
    public var pad: IntArray = IntArray(16),
) {
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
)

public data class InotifyEvent(
    public var wd: CInt = 0,
    public var mask: UInt = 0u,
    public var cookie: UInt = 0u,
    public var len: UInt = 0u,
)

public data class FanotifyResponse(public var fd: CInt = 0, public var response: U32 = 0u)

public data class FanotifyEventInfoHeader(
    public var infoType: U8 = 0u,
    public var pad: U8 = 0u,
    public var len: U16 = 0u,
)

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
}

public data class SockExtendedErr(
    public var eeErrno: UInt = 0u,
    public var eeOrigin: UByte = 0u,
    public var eeType: UByte = 0u,
    public var eeCode: UByte = 0u,
    public var eePad: UByte = 0u,
    public var eeInfo: UInt = 0u,
    public var eeData: UInt = 0u,
)

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
}

public data class SeccompNotifSizes(
    public var seccompNotif: U16 = 0u,
    public var seccompNotifResp: U16 = 0u,
    public var seccompData: U16 = 0u,
)

public data class SeccompNotif(
    public var id: U64 = 0uL,
    public var pid: U32 = 0u,
    public var flags: U32 = 0u,
    public var data: SeccompData = SeccompData(),
)

public data class SeccompNotifResp(
    public var id: U64 = 0uL,
    public var value: S64 = 0L,
    public var error: S32 = 0,
    public var flags: U32 = 0u,
)

public data class SeccompNotifAddfd(
    public var id: U64 = 0uL,
    public var flags: U32 = 0u,
    public var srcfd: U32 = 0u,
    public var newfd: U32 = 0u,
    public var newfdFlags: U32 = 0u,
)

public data class In6Ifreq(
    public var ifr6Addr: In6Addr = In6Addr(),
    public var ifr6Prefixlen: UInt = 0u,
    public var ifr6Ifindex: CInt = 0,
)

public data class OpenHow(
    public var flags: U64 = 0uL,
    public var mode: U64 = 0uL,
    public var resolve: U64 = 0uL,
)

// linux/ptpClock.h
public data class PtpClockTime(
    public var sec: S64 = 0L,
    public var nsec: U32 = 0u,
    public var reserved: U32 = 0u,
)

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
}

// linux/sctp.h
public data class SctpInitmsg(
    public var sinitNumOstreams: U16 = 0u,
    public var sinitMaxInstreams: U16 = 0u,
    public var sinitMaxAttempts: U16 = 0u,
    public var sinitMaxInitTimeo: U16 = 0u,
)

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
)

public data class SctpSndinfo(
    public var sndSid: U16 = 0u,
    public var sndFlags: U16 = 0u,
    public var sndPpid: U32 = 0u,
    public var sndContext: U32 = 0u,
    public var sndAssocId: SctpAssocT = 0,
)

public data class SctpRcvinfo(
    public var rcvSid: U16 = 0u,
    public var rcvSsn: U16 = 0u,
    public var rcvFlags: U16 = 0u,
    public var rcvPpid: U32 = 0u,
    public var rcvTsn: U32 = 0u,
    public var rcvCumtsn: U32 = 0u,
    public var rcvContext: U32 = 0u,
    public var rcvAssocId: SctpAssocT = 0,
)

public data class SctpNxtinfo(
    public var nxtSid: U16 = 0u,
    public var nxtFlags: U16 = 0u,
    public var nxtPpid: U32 = 0u,
    public var nxtLength: U32 = 0u,
    public var nxtAssocId: SctpAssocT = 0,
)

public data class SctpPrinfo(public var prPolicy: U16 = 0u, public var prValue: U32 = 0u)

public data class SctpAuthinfo(public var authKeynumber: U16 = 0u)

// linux/tls.h
public data class TlsCryptoInfo(public var version: U16 = 0u, public var cipherType: U16 = 0u)

public data class Tls12CryptoInfoAesGcm128(
    public var info: TlsCryptoInfo = TlsCryptoInfo(),
    public var iv: UByteArray = UByteArray((TLS_CIPHER_AES_GCM_128_IV_SIZE).toInt()),
    public var key: UByteArray = UByteArray((TLS_CIPHER_AES_GCM_128_KEY_SIZE).toInt()),
    public var salt: UByteArray = UByteArray((TLS_CIPHER_AES_GCM_128_SALT_SIZE).toInt()),
    public var recSeq: UByteArray = UByteArray((TLS_CIPHER_AES_GCM_128_REC_SEQ_SIZE).toInt()),
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
}

public data class Tls12CryptoInfoAesGcm256(
    public var info: TlsCryptoInfo = TlsCryptoInfo(),
    public var iv: UByteArray = UByteArray((TLS_CIPHER_AES_GCM_256_IV_SIZE).toInt()),
    public var key: UByteArray = UByteArray((TLS_CIPHER_AES_GCM_256_KEY_SIZE).toInt()),
    public var salt: UByteArray = UByteArray((TLS_CIPHER_AES_GCM_256_SALT_SIZE).toInt()),
    public var recSeq: UByteArray = UByteArray((TLS_CIPHER_AES_GCM_256_REC_SEQ_SIZE).toInt()),
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
}

public data class Tls12CryptoInfoAesCcm128(
    public var info: TlsCryptoInfo = TlsCryptoInfo(),
    public var iv: UByteArray = UByteArray((TLS_CIPHER_AES_CCM_128_IV_SIZE).toInt()),
    public var key: UByteArray = UByteArray((TLS_CIPHER_AES_CCM_128_KEY_SIZE).toInt()),
    public var salt: UByteArray = UByteArray((TLS_CIPHER_AES_CCM_128_SALT_SIZE).toInt()),
    public var recSeq: UByteArray = UByteArray((TLS_CIPHER_AES_CCM_128_REC_SEQ_SIZE).toInt()),
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
}

public data class Tls12CryptoInfoChacha20Poly1305(
    public var info: TlsCryptoInfo = TlsCryptoInfo(),
    public var iv: UByteArray = UByteArray((TLS_CIPHER_CHACHA20_POLY1305_IV_SIZE).toInt()),
    public var key: UByteArray = UByteArray((TLS_CIPHER_CHACHA20_POLY1305_KEY_SIZE).toInt()),
    public var salt: UByteArray = UByteArray((TLS_CIPHER_CHACHA20_POLY1305_SALT_SIZE).toInt()),
    public var recSeq: UByteArray = UByteArray((TLS_CIPHER_CHACHA20_POLY1305_REC_SEQ_SIZE).toInt()),
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
}

public data class Tls12CryptoInfoSm4Gcm(
    public var info: TlsCryptoInfo = TlsCryptoInfo(),
    public var iv: UByteArray = UByteArray((TLS_CIPHER_SM4_GCM_IV_SIZE).toInt()),
    public var key: UByteArray = UByteArray((TLS_CIPHER_SM4_GCM_KEY_SIZE).toInt()),
    public var salt: UByteArray = UByteArray((TLS_CIPHER_SM4_GCM_SALT_SIZE).toInt()),
    public var recSeq: UByteArray = UByteArray((TLS_CIPHER_SM4_GCM_REC_SEQ_SIZE).toInt()),
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
}

public data class Tls12CryptoInfoSm4Ccm(
    public var info: TlsCryptoInfo = TlsCryptoInfo(),
    public var iv: UByteArray = UByteArray((TLS_CIPHER_SM4_CCM_IV_SIZE).toInt()),
    public var key: UByteArray = UByteArray((TLS_CIPHER_SM4_CCM_KEY_SIZE).toInt()),
    public var salt: UByteArray = UByteArray((TLS_CIPHER_SM4_CCM_SALT_SIZE).toInt()),
    public var recSeq: UByteArray = UByteArray((TLS_CIPHER_SM4_CCM_REC_SEQ_SIZE).toInt()),
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
}

public data class Tls12CryptoInfoAriaGcm128(
    public var info: TlsCryptoInfo = TlsCryptoInfo(),
    public var iv: UByteArray = UByteArray((TLS_CIPHER_ARIA_GCM_128_IV_SIZE).toInt()),
    public var key: UByteArray = UByteArray((TLS_CIPHER_ARIA_GCM_128_KEY_SIZE).toInt()),
    public var salt: UByteArray = UByteArray((TLS_CIPHER_ARIA_GCM_128_SALT_SIZE).toInt()),
    public var recSeq: UByteArray = UByteArray((TLS_CIPHER_ARIA_GCM_128_REC_SEQ_SIZE).toInt()),
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
}

public data class Tls12CryptoInfoAriaGcm256(
    public var info: TlsCryptoInfo = TlsCryptoInfo(),
    public var iv: UByteArray = UByteArray((TLS_CIPHER_ARIA_GCM_256_IV_SIZE).toInt()),
    public var key: UByteArray = UByteArray((TLS_CIPHER_ARIA_GCM_256_KEY_SIZE).toInt()),
    public var salt: UByteArray = UByteArray((TLS_CIPHER_ARIA_GCM_256_SALT_SIZE).toInt()),
    public var recSeq: UByteArray = UByteArray((TLS_CIPHER_ARIA_GCM_256_REC_SEQ_SIZE).toInt()),
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
}

// linux/wireless.h
public data class IwParam(
    public var value: S32 = 0,
    public var fixed: U8 = 0u,
    public var disabled: U8 = 0u,
    public var flags: U16 = 0u,
)

public data class IwPoint(
    public var pointer: COpaquePointer? = null,
    public var length: U16 = 0u,
    public var flags: U16 = 0u,
)

public data class IwFreq(
    public var m: S32 = 0,
    public var e: S16 = 0,
    public var i: U8 = 0u,
    public var flags: U8 = 0u,
)

public data class IwQuality(
    public var qual: U8 = 0u,
    public var level: U8 = 0u,
    public var noise: U8 = 0u,
    public var updated: U8 = 0u,
)

public data class IwDiscarded(
    public var nwid: U32 = 0u,
    public var code: U32 = 0u,
    public var fragment: U32 = 0u,
    public var retries: U32 = 0u,
    public var pubmisc: U32 = 0u,
)

public data class IwMissed(public var beacon: U32 = 0u)

public data class IwScanReq(
    public var scanType: U8 = 0u,
    public var essidLen: U8 = 0u,
    public var numChannels: U8 = 0u,
    public var flags: U8 = 0u,
    public var bssid: Sockaddr = Sockaddr(),
    public var essid: UByteArray = UByteArray((IW_ESSID_MAX_SIZE).toInt()),
    public var minChannelTime: U32 = 0u,
    public var maxChannelTime: U32 = 0u,
    public var channelList: List<IwFreq> = List((IW_MAX_FREQUENCIES).toInt()) { IwFreq() },
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
    public var txSeq: UByteArray = UByteArray((IW_ENCODE_SEQ_MAX_SIZE).toInt()),
    public var rxSeq: UByteArray = UByteArray((IW_ENCODE_SEQ_MAX_SIZE).toInt()),
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
    public var pmkid: UByteArray = UByteArray((IW_PMKID_LEN).toInt()),
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
)

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
    public var bitrate: IntArray = IntArray((IW_MAX_BITRATES).toInt()),
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
    public var encodingSize: UShortArray = UShortArray((IW_MAX_ENCODING_SIZES).toInt()),
    public var numEncodingSizes: U8 = 0u,
    public var maxEncodingTokens: U8 = 0u,
    public var encodingLoginIndex: U8 = 0u,
    public var txpowerCapa: U16 = 0u,
    public var numTxpower: U8 = 0u,
    public var txpower: IntArray = IntArray((IW_MAX_TXPOWER).toInt()),
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
    public var freq: List<IwFreq> = List((IW_MAX_FREQUENCIES).toInt()) { IwFreq() },
    public var encCapa: U32 = 0u,
)

public data class IwPrivArgs(
    public var cmd: U32 = 0u,
    public var setArgs: U16 = 0u,
    public var getArgs: U16 = 0u,
    public var name: UByteArray = UByteArray((IFNAMSIZ).toInt()),
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
}

// #include <linux/eventpoll.h>
public data class EpollParams(
    public var busyPollUsecs: UInt = 0u,
    public var busyPollBudget: UShort = 0u,
    public var preferBusyPoll: UByte = 0u,
    public var pad: UByte = 0u,
)

public data class PthreadMutexattrT(public var size: UByteArray = UByteArray((SIZEOF_PTHREAD_MUTEXATTR_T).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexattrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.size.contentHashCode()
    }
}

public data class PthreadRwlockattrT(public var size: UByteArray = UByteArray((SIZEOF_PTHREAD_RWLOCKATTR_T).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockattrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.size.contentHashCode()
    }
}

public data class PthreadCondattrT(public var size: UByteArray = UByteArray((SIZEOF_PTHREAD_CONDATTR_T).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondattrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.size.contentHashCode()
    }
}

public data class PthreadBarrierattrT(public var size: UByteArray = UByteArray((SIZEOF_PTHREAD_BARRIERATTR_T).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadBarrierattrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.size.contentHashCode()
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
)

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
}

// linux/ifXdp.h
public data class SockaddrXdp(
    public var sxdpFamily: U16 = 0u,
    public var sxdpFlags: U16 = 0u,
    public var sxdpIfindex: U32 = 0u,
    public var sxdpQueueId: U32 = 0u,
    public var sxdpSharedUmemFd: U32 = 0u,
)

public data class XdpRingOffset(
    public var producer: U64 = 0uL,
    public var consumer: U64 = 0uL,
    public var desc: U64 = 0uL,
    public var flags: U64 = 0uL,
)

public data class XdpMmapOffsets(
    public var rx: XdpRingOffset = XdpRingOffset(),
    public var tx: XdpRingOffset = XdpRingOffset(),
    public var fr: XdpRingOffset = XdpRingOffset(),
    public var cr: XdpRingOffset = XdpRingOffset(),
)

public data class XdpRingOffsetV1(
    public var producer: U64 = 0uL,
    public var consumer: U64 = 0uL,
    public var desc: U64 = 0uL,
)

public data class XdpMmapOffsetsV1(
    public var rx: XdpRingOffsetV1 = XdpRingOffsetV1(),
    public var tx: XdpRingOffsetV1 = XdpRingOffsetV1(),
    public var fr: XdpRingOffsetV1 = XdpRingOffsetV1(),
    public var cr: XdpRingOffsetV1 = XdpRingOffsetV1(),
)

public data class XdpUmemReg(
    public var addr: U64 = 0uL,
    public var len: U64 = 0uL,
    public var chunkSize: U32 = 0u,
    public var headroom: U32 = 0u,
    public var flags: U32 = 0u,
    public var txMetadataLen: U32 = 0u,
)

public data class XdpUmemRegV1(
    public var addr: U64 = 0uL,
    public var len: U64 = 0uL,
    public var chunkSize: U32 = 0u,
    public var headroom: U32 = 0u,
)

public data class XdpStatistics(
    public var rxDropped: U64 = 0uL,
    public var rxInvalidDescs: U64 = 0uL,
    public var txInvalidDescs: U64 = 0uL,
    public var rxRingFull: U64 = 0uL,
    public var rxFillRingEmptyDescs: U64 = 0uL,
    public var txRingEmptyDescs: U64 = 0uL,
)

public data class XdpStatisticsV1(
    public var rxDropped: U64 = 0uL,
    public var rxInvalidDescs: U64 = 0uL,
    public var txInvalidDescs: U64 = 0uL,
)

public data class XdpOptions(public var flags: U32 = 0u)

public data class XdpDesc(
    public var addr: U64 = 0uL,
    public var len: U32 = 0u,
    public var options: U32 = 0u,
)

public data class XskTxMetadataCompletion(public var txTimestamp: U64 = 0uL)

public data class XskTxMetadataRequest(public var csumStart: U16 = 0u, public var csumOffset: U16 = 0u)

// linux/mount.h
public data class MountAttr(
    public var attrSet: U64 = 0uL,
    public var attrClr: U64 = 0uL,
    public var propagation: U64 = 0uL,
    public var usernsFd: U64 = 0uL,
)

// linux/nsfs.h
public data class MntNsInfo(
    public var size: U32 = 0u,
    public var nrMounts: U32 = 0u,
    public var mntNsId: U64 = 0uL,
)

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
)

// linux/uio.h
public data class DmabufCmsg(
    public var fragOffset: U64 = 0uL,
    public var fragSize: U32 = 0u,
    public var fragToken: U32 = 0u,
    public var dmabufId: U32 = 0u,
    public var flags: U32 = 0u,
)

public data class DmabufToken(public var tokenStart: U32 = 0u, public var tokenCount: U32 = 0u)

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
}

public data class PthreadCondT(public var size: UByteArray = UByteArray((SIZEOF_PTHREAD_COND_T).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.size.contentHashCode()
    }
}

public data class PthreadMutexT(public var size: UByteArray = UByteArray((SIZEOF_PTHREAD_MUTEX_T).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.size.contentHashCode()
    }
}

public data class PthreadRwlockT(public var size: UByteArray = UByteArray((SIZEOF_PTHREAD_RWLOCK_T).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.size.contentHashCode()
    }
}

public data class PthreadBarrierT(public var size: UByteArray = UByteArray((SIZEOF_PTHREAD_BARRIER_T).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadBarrierT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.size.contentHashCode()
    }
}

public data class UinputSetup(
    public var id: InputId = InputId(),
    public var name: UByteArray = UByteArray((UINPUT_MAX_NAME_SIZE).toInt()),
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
}

public data class UinputUserDev(
    public var name: UByteArray = UByteArray((UINPUT_MAX_NAME_SIZE).toInt()),
    public var id: InputId = InputId(),
    public var ffEffectsMax: U32 = 0u,
    public var absmax: IntArray = IntArray((ABS_CNT).toInt()),
    public var absmin: IntArray = IntArray((ABS_CNT).toInt()),
    public var absfuzz: IntArray = IntArray((ABS_CNT).toInt()),
    public var absflat: IntArray = IntArray((ABS_CNT).toInt()),
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
}

public data class HwtstampConfig(
    public var flags: CInt = 0,
    public var txType: CInt = 0,
    public var rxFilter: CInt = 0,
)

public data class SchedAttr(
    public var size: U32 = 0u,
    public var schedPolicy: U32 = 0u,
    public var schedFlags: U64 = 0uL,
    public var schedNice: S32 = 0,
    public var schedPriority: U32 = 0u,
    public var schedRuntime: U64 = 0uL,
    public var schedDeadline: U64 = 0uL,
    public var schedPeriod: U64 = 0uL,
)

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
    public var tsc: UByteArray = UByteArray((IW_ENCODE_SEQ_MAX_SIZE).toInt()),
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
public data class AfAlgIv(public var ivlen: UInt = 0u, public var iv: UByteArray = UByteArray(0)) {
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

    public fun asSlice(): List<UByte> {
        return emptyList()
    }

    public fun eq(other: AfAlgIv): Boolean {
        return this.asSlice() == other.asSlice()
    }
}

public data class TpacketReqU(public var req: TpacketReq = TpacketReq(), public var req3: TpacketReq3 = TpacketReq3()) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "tpacket_req_u").finishNonExhaustive()
    }
}

public data class TpacketBdHeaderU(public var bh1: TpacketHdrV1 = TpacketHdrV1()) {
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
public data class SockTxtime(public var clockid: ClockidT = 0, public var flags: U32 = 0u)

// linux/wireless.h
public class IwreqData(
    public var name: UByteArray = UByteArray((IFNAMSIZ).toInt()),
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

public data class CAnonymousIwreq(public var ifrnName: UByteArray = UByteArray((IFNAMSIZ).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIwreq) return false
        if (!this.ifrnName.contentEquals(other.ifrnName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.ifrnName.contentHashCode()
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_iwreq").finishNonExhaustive()
    }
}

public data class Iwreq(public var ifrIfrn: CAnonymousIwreq = CAnonymousIwreq(), public var u: IwreqData = IwreqData())

// linux/ptpClock.h
public data class CAnonymousPtpPeroutRequest1(public var start: PtpClockTime = PtpClockTime(), public var phase: PtpClockTime = PtpClockTime()) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ptp_perout_request_1").finishNonExhaustive()
    }
}

public data class CAnonymousPtpPeroutRequest2(public var on: PtpClockTime = PtpClockTime(), public var rsv: UIntArray = UIntArray(4)) {
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
)

// linux/ifXdp.h
public data class XskTxMetadata(public var flags: U64 = 0uL, public var xskTxMetadataUnion: CAnonymousXskTxMetadataUnion = CAnonymousXskTxMetadataUnion())

public data class CAnonymousXskTxMetadataUnion(public var request: XskTxMetadataRequest = XskTxMetadataRequest(), public var completion: XskTxMetadataCompletion = XskTxMetadataCompletion()) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_xsk_tx_metadata_union").finishNonExhaustive()
    }
}
