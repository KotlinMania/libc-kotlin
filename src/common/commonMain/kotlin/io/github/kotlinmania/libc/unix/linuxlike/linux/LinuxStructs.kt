package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.SaFamilyT
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.S64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.U64

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
public open class Dqblk(
    public var dqbBhardlimit: ULong,
    public var dqbBsoftlimit: ULong,
    public var dqbCurspace: ULong,
    public var dqbIhardlimit: ULong,
    public var dqbIsoftlimit: ULong,
    public var dqbCurinodes: ULong,
    public var dqbBtime: ULong,
    public var dqbItime: ULong,
    public var dqbValid: UInt,
)

public open class SignalfdSiginfo(
    public var ssiSigno: UInt,
    public var ssiErrno: Int,
    public var ssiCode: Int,
    public var ssiPid: UInt,
    public var ssiUid: UInt,
    public var ssiFd: Int,
    public var ssiTid: UInt,
    public var ssiBand: UInt,
    public var ssiOverrun: UInt,
    public var ssiTrapno: UInt,
    public var ssiStatus: Int,
    public var ssiInt: Int,
    public var ssiPtr: ULong,
    public var ssiUtime: ULong,
    public var ssiStime: ULong,
    public var ssiAddr: ULong,
    public var ssiAddrLsb: UShort,
    public var pad2: UShort,
    public var ssiSyscall: Int,
    public var ssiCallAddr: ULong,
    public var ssiArch: UInt,
    public var pad: List<UByte>,
)

public open class FanoutArgs(
    public var id: U16,
    public var typeFlags: U16,
    public var maxNumMembers: U32,
)

public open class SockaddrPkt(
    public var spktFamily: CUshort,
    public var spktDevice: List<CUchar>,
    public var spktProtocol: CUshort,
)

public open class TpacketAuxdata(
    public var tpStatus: U32,
    public var tpLen: U32,
    public var tpSnaplen: U32,
    public var tpMac: U16,
    public var tpNet: U16,
    public var tpVlanTci: U16,
    public var tpVlanTpid: U16,
)

public open class TpacketHdr(
    public var tpStatus: CUlong,
    public var tpLen: CUint,
    public var tpSnaplen: CUint,
    public var tpMac: CUshort,
    public var tpNet: CUshort,
    public var tpSec: CUint,
    public var tpUsec: CUint,
)

public open class TpacketHdrVariant1(
    public var tpRxhash: U32,
    public var tpVlanTci: U32,
    public var tpVlanTpid: U16,
    public var tpPadding: U16,
)

public open class Tpacket2Hdr(
    public var tpStatus: U32,
    public var tpLen: U32,
    public var tpSnaplen: U32,
    public var tpMac: U16,
    public var tpNet: U16,
    public var tpSec: U32,
    public var tpNsec: U32,
    public var tpVlanTci: U16,
    public var tpVlanTpid: U16,
    public var tpPadding: List<U8>,
)

public open class TpacketReq(
    public var tpBlockSize: CUint,
    public var tpBlockNr: CUint,
    public var tpFrameSize: CUint,
    public var tpFrameNr: CUint,
)

public open class TpacketReq3(
    public var tpBlockSize: CUint,
    public var tpBlockNr: CUint,
    public var tpFrameSize: CUint,
    public var tpFrameNr: CUint,
    public var tpRetireBlkTov: CUint,
    public var tpSizeofPriv: CUint,
    public var tpFeatureReqWord: CUint,
)

public open class TpacketRolloverStats(
    public var tpAll: U64,
    public var tpHuge: U64,
    public var tpFailed: U64,
)

public open class TpacketStats(public var tpPackets: CUint, public var tpDrops: CUint)

public open class TpacketStatsV3(
    public var tpPackets: CUint,
    public var tpDrops: CUint,
    public var tpFreezeQCnt: CUint,
)

public open class Tpacket3Hdr(
    public var tpNextOffset: U32,
    public var tpSec: U32,
    public var tpNsec: U32,
    public var tpSnaplen: U32,
    public var tpLen: U32,
    public var tpStatus: U32,
    public var tpMac: U16,
    public var tpNet: U16,
    public var hv1: TpacketHdrVariant1,
    public var tpPadding: List<U8>,
)

public open class TpacketBdTs(public var tsSec: CUint, public var tsUsec: CUint)

public open class TpacketHdrV1(
    public var blockStatus: U32,
    public var numPkts: U32,
    public var offsetToFirstPkt: U32,
    public var blkLen: U32,
    public var seqNum: U64,
    public var tsFirstPkt: TpacketBdTs,
    public var tsLastPkt: TpacketBdTs,
)

// System V IPC
public open class Msginfo(
    public var msgpool: CInt,
    public var msgmap: CInt,
    public var msgmax: CInt,
    public var msgmnb: CInt,
    public var msgmni: CInt,
    public var msgssz: CInt,
    public var msgtql: CInt,
    public var msgseg: CUshort,
)

public open class InputEvent(
    // Note(1.0): Change to the commented variant, see https://github.com/rust-lang/libc/pull/4148#discussionR1857511742
    public var time: Timeval,
    public var type: U16,
    public var code: U16,
    public var value: S32,
)

public open class InputId(
    public var bustype: U16,
    public var vendor: U16,
    public var product: U16,
    public var version: U16,
)

public open class InputAbsinfo(
    public var value: S32,
    public var minimum: S32,
    public var maximum: S32,
    public var fuzz: S32,
    public var flat: S32,
    public var resolution: S32,
)

public open class InputKeymapEntry(
    public var flags: U8,
    public var len: U8,
    public var index: U16,
    public var keycode: U32,
    public var scancode: List<U8>,
)

public open class InputMask(
    public var type: U32,
    public var codesSize: U32,
    public var codesPtr: U64,
)

public open class FfReplay(public var length: U16, public var delay: U16)

public open class FfTrigger(public var button: U16, public var interval: U16)

public open class FfEnvelope(
    public var attackLength: U16,
    public var attackLevel: U16,
    public var fadeLength: U16,
    public var fadeLevel: U16,
)

public open class FfConstantEffect(public var level: S16, public var envelope: FfEnvelope)

public open class FfRampEffect(
    public var startLevel: S16,
    public var endLevel: S16,
    public var envelope: FfEnvelope,
)

public open class FfConditionEffect(
    public var rightSaturation: U16,
    public var leftSaturation: U16,
    public var rightCoeff: S16,
    public var leftCoeff: S16,
    public var deadband: U16,
    public var center: S16,
)

public open class FfPeriodicEffect(
    public var waveform: U16,
    public var period: U16,
    public var magnitude: S16,
    public var offset: S16,
    public var phase: U16,
    public var envelope: FfEnvelope,
    public var customLen: U32,
    public var customData: CShort?,
)

public open class FfRumbleEffect(public var strongMagnitude: U16, public var weakMagnitude: U16)

public open class FfEffect(
    public var type: U16,
    public var id: S16,
    public var direction: U16,
    public var trigger: FfTrigger,
    public var replay: FfReplay,
    // Note(1.0): this is actually a union
    public var u: List<ULong>,
)

public open class UinputFfUpload(
    public var requestId: U32,
    public var retval: S32,
    public var effect: FfEffect,
    public var old: FfEffect,
)

public open class UinputFfErase(
    public var requestId: U32,
    public var retval: S32,
    public var effectId: U32,
)

public open class UinputAbsSetup(public var code: U16, public var absinfo: InputAbsinfo)

public open class CAnonymousKernelFsidT(public var value: List<CInt>)

public open class PosixSpawnFileActionsT(
    public var allocated: CInt,
    public var used: CInt,
    public var actions: CInt?,
    public var pad: List<CInt>,
)

public open class PosixSpawnattrT(
    public var flags: CShort,
    public var pgrp: PidT,
    public var sd: SigsetT,
    public var ss: SigsetT,
    public var prio: CInt,
    public var sp: SchedParam,
    public var policy: CInt,
    public var pad: List<CInt>,
)

public open class Genlmsghdr(
    public var cmd: UByte,
    public var version: UByte,
    public var reserved: UShort,
)

public open class InotifyEvent(
    public var wd: CInt,
    public var mask: UInt,
    public var cookie: UInt,
    public var len: UInt,
)

public open class FanotifyResponse(public var fd: CInt, public var response: U32)

public open class FanotifyEventInfoHeader(
    public var infoType: U8,
    public var pad: U8,
    public var len: U16,
)

public open class FanotifyEventInfoFid(
    public var hdr: FanotifyEventInfoHeader,
    public var fsid: KernelFsidT,
    public var handle: List<CUchar>,
)

public open class SockaddrVm(
    public var svmFamily: SaFamilyT,
    public var svmReserved1: CUshort,
    public var svmPort: CUint,
    public var svmCid: CUint,
    public var svmZero: List<UByte>,
)

public open class SockExtendedErr(
    public var eeErrno: UInt,
    public var eeOrigin: UByte,
    public var eeType: UByte,
    public var eeCode: UByte,
    public var eePad: UByte,
    public var eeInfo: UInt,
    public var eeData: UInt,
)

// linux/seccomp.h
public open class SeccompData(
    public var nr: CInt,
    public var arch: U32,
    public var instructionPointer: U64,
    public var args: List<U64>,
)

public open class SeccompNotifSizes(
    public var seccompNotif: U16,
    public var seccompNotifResp: U16,
    public var seccompData: U16,
)

public open class SeccompNotif(
    public var id: U64,
    public var pid: U32,
    public var flags: U32,
    public var data: SeccompData,
)

public open class SeccompNotifResp(
    public var id: U64,
    public var value: S64,
    public var error: S32,
    public var flags: U32,
)

public open class SeccompNotifAddfd(
    public var id: U64,
    public var flags: U32,
    public var srcfd: U32,
    public var newfd: U32,
    public var newfdFlags: U32,
)

public open class In6Ifreq(
    public var ifr6Addr: In6Addr,
    public var ifr6Prefixlen: UInt,
    public var ifr6Ifindex: CInt,
)

public open class OpenHow(
    public var flags: U64,
    public var mode: U64,
    public var resolve: U64,
)

// linux/ptpClock.h
public open class PtpClockTime(
    public var sec: S64,
    public var nsec: U32,
    public var reserved: U32,
)

public open class PtpExttsRequest(
    public var index: CUint,
    public var flags: CUint,
    public var rsv: List<CUint>,
)

public open class PtpSysOffsetExtended(
    public var nSamples: CUint,
    public var clockid: KernelClockidT,
    public var rsv: List<CUint>,
    public var ts: List<List<PtpClockTime>>,
)

public open class PtpSysOffsetPrecise(
    public var device: PtpClockTime,
    public var sysRealtime: PtpClockTime,
    public var sysMonoraw: PtpClockTime,
    public var rsv: List<CUint>,
)

public open class PtpExttsEvent(
    public var t: PtpClockTime,
    public var index: CUint,
    public var flags: CUint,
    public var rsv: List<CUint>,
)

// linux/sctp.h
public open class SctpInitmsg(
    public var sinitNumOstreams: U16,
    public var sinitMaxInstreams: U16,
    public var sinitMaxAttempts: U16,
    public var sinitMaxInitTimeo: U16,
)

public open class SctpSndrcvinfo(
    public var sinfoStream: U16,
    public var sinfoSsn: U16,
    public var sinfoFlags: U16,
    public var sinfoPpid: U32,
    public var sinfoContext: U32,
    public var sinfoTimetolive: U32,
    public var sinfoTsn: U32,
    public var sinfoCumtsn: U32,
    public var sinfoAssocId: SctpAssocT,
)

public open class SctpSndinfo(
    public var sndSid: U16,
    public var sndFlags: U16,
    public var sndPpid: U32,
    public var sndContext: U32,
    public var sndAssocId: SctpAssocT,
)

public open class SctpRcvinfo(
    public var rcvSid: U16,
    public var rcvSsn: U16,
    public var rcvFlags: U16,
    public var rcvPpid: U32,
    public var rcvTsn: U32,
    public var rcvCumtsn: U32,
    public var rcvContext: U32,
    public var rcvAssocId: SctpAssocT,
)

public open class SctpNxtinfo(
    public var nxtSid: U16,
    public var nxtFlags: U16,
    public var nxtPpid: U32,
    public var nxtLength: U32,
    public var nxtAssocId: SctpAssocT,
)

public open class SctpPrinfo(public var prPolicy: U16, public var prValue: U32)

public open class SctpAuthinfo(public var authKeynumber: U16)

// linux/tls.h
public open class TlsCryptoInfo(public var version: U16, public var cipherType: U16)

public open class Tls12CryptoInfoAesGcm128(
    public var info: TlsCryptoInfo,
    public var iv: List<CUchar>,
    public var key: List<CUchar>,
    public var salt: List<CUchar>,
    public var recSeq: List<CUchar>,
)

public open class Tls12CryptoInfoAesGcm256(
    public var info: TlsCryptoInfo,
    public var iv: List<CUchar>,
    public var key: List<CUchar>,
    public var salt: List<CUchar>,
    public var recSeq: List<CUchar>,
)

public open class Tls12CryptoInfoAesCcm128(
    public var info: TlsCryptoInfo,
    public var iv: List<CUchar>,
    public var key: List<CUchar>,
    public var salt: List<CUchar>,
    public var recSeq: List<CUchar>,
)

public open class Tls12CryptoInfoChacha20Poly1305(
    public var info: TlsCryptoInfo,
    public var iv: List<CUchar>,
    public var key: List<CUchar>,
    public var salt: List<CUchar>,
    public var recSeq: List<CUchar>,
)

public open class Tls12CryptoInfoSm4Gcm(
    public var info: TlsCryptoInfo,
    public var iv: List<CUchar>,
    public var key: List<CUchar>,
    public var salt: List<CUchar>,
    public var recSeq: List<CUchar>,
)

public open class Tls12CryptoInfoSm4Ccm(
    public var info: TlsCryptoInfo,
    public var iv: List<CUchar>,
    public var key: List<CUchar>,
    public var salt: List<CUchar>,
    public var recSeq: List<CUchar>,
)

public open class Tls12CryptoInfoAriaGcm128(
    public var info: TlsCryptoInfo,
    public var iv: List<CUchar>,
    public var key: List<CUchar>,
    public var salt: List<CUchar>,
    public var recSeq: List<CUchar>,
)

public open class Tls12CryptoInfoAriaGcm256(
    public var info: TlsCryptoInfo,
    public var iv: List<CUchar>,
    public var key: List<CUchar>,
    public var salt: List<CUchar>,
    public var recSeq: List<CUchar>,
)

// linux/wireless.h
public open class IwParam(
    public var value: S32,
    public var fixed: U8,
    public var disabled: U8,
    public var flags: U16,
)

public open class IwPoint(
    public var pointer: COpaquePointer?,
    public var length: U16,
    public var flags: U16,
)

public open class IwFreq(
    public var m: S32,
    public var e: S16,
    public var i: U8,
    public var flags: U8,
)

public open class IwQuality(
    public var qual: U8,
    public var level: U8,
    public var noise: U8,
    public var updated: U8,
)

public open class IwDiscarded(
    public var nwid: U32,
    public var code: U32,
    public var fragment: U32,
    public var retries: U32,
    public var pubmisc: U32,
)

public open class IwMissed(public var beacon: U32)

public open class IwScanReq(
    public var scanType: U8,
    public var essidLen: U8,
    public var numChannels: U8,
    public var flags: U8,
    public var bssid: Sockaddr,
    public var essid: List<U8>,
    public var minChannelTime: U32,
    public var maxChannelTime: U32,
    public var channelList: List<IwFreq>,
)

public open class IwEncodeExt(
    public var extFlags: U32,
    public var txSeq: List<U8>,
    public var rxSeq: List<U8>,
    public var addr: Sockaddr,
    public var alg: U16,
    public var keyLen: U16,
    public var key: List<U8>,
)

public open class IwPmksa(
    public var cmd: U32,
    public var bssid: Sockaddr,
    public var pmkid: List<U8>,
)

public open class IwPmkidCand(
    public var flags: U32,
    public var index: U32,
    public var bssid: Sockaddr,
)

public open class IwStatistics(
    public var status: U16,
    public var qual: IwQuality,
    public var discard: IwDiscarded,
    public var miss: IwMissed,
)

public open class IwRange(
    public var throughput: U32,
    public var minNwid: U32,
    public var maxNwid: U32,
    public var oldNumChannels: U16,
    public var oldNumFrequency: U8,
    public var scanCapa: U8,
    public var eventCapa: List<U32>,
    public var sensitivity: S32,
    public var maxQual: IwQuality,
    public var avgQual: IwQuality,
    public var numBitrates: U8,
    public var bitrate: List<S32>,
    public var minRts: S32,
    public var maxRts: S32,
    public var minFrag: S32,
    public var maxFrag: S32,
    public var minPmp: S32,
    public var maxPmp: S32,
    public var minPmt: S32,
    public var maxPmt: S32,
    public var pmpFlags: U16,
    public var pmtFlags: U16,
    public var pmCapa: U16,
    public var encodingSize: List<U16>,
    public var numEncodingSizes: U8,
    public var maxEncodingTokens: U8,
    public var encodingLoginIndex: U8,
    public var txpowerCapa: U16,
    public var numTxpower: U8,
    public var txpower: List<S32>,
    public var weVersionCompiled: U8,
    public var weVersionSource: U8,
    public var retryCapa: U16,
    public var retryFlags: U16,
    public var rTimeFlags: U16,
    public var minRetry: S32,
    public var maxRetry: S32,
    public var minRTime: S32,
    public var maxRTime: S32,
    public var numChannels: U16,
    public var numFrequency: U8,
    public var freq: List<IwFreq>,
    public var encCapa: U32,
)

public open class IwPrivArgs(
    public var cmd: U32,
    public var setArgs: U16,
    public var getArgs: U16,
    public var name: List<CChar>,
)

// #include <linux/eventpoll.h>
public open class EpollParams(
    public var busyPollUsecs: UInt,
    public var busyPollBudget: UShort,
    public var preferBusyPoll: UByte,
    public var pad: UByte,
)

public open class PthreadMutexattrT(public var size: List<UByte>)

public open class PthreadRwlockattrT(public var size: List<UByte>)

public open class PthreadCondattrT(public var size: List<UByte>)

public open class PthreadBarrierattrT(public var size: List<UByte>)

public open class FanotifyEventMetadata(
    public var eventLen: U32,
    public var vers: U8,
    public var reserved: U8,
    public var metadataLen: U16,
    public var mask: U64,
    public var fd: CInt,
    public var pid: CInt,
)

// linux/ptpClock.h
public open class PtpSysOffset(
    public var nSamples: CUint,
    public var rsv: List<CUint>,
    // Note(garando): replace length with `2 * PTP_MAX_SAMPLES + 1` when supported
    public var ts: List<PtpClockTime>,
)

public open class PtpPinDesc(
    public var name: List<CChar>,
    public var index: CUint,
    public var func: CUint,
    public var chan: CUint,
    public var rsv: List<CUint>,
)

public open class PtpClockCaps(
    public var maxAdj: CInt,
    public var nAlarm: CInt,
    public var nExtTs: CInt,
    public var nPerOut: CInt,
    public var pps: CInt,
    public var nPins: CInt,
    public var crossTimestamping: CInt,
    public var adjustPhase: CInt,
    public var maxPhaseAdj: CInt,
    public var rsv: List<CInt>,
)

// linux/ifXdp.h
public open class SockaddrXdp(
    public var sxdpFamily: U16,
    public var sxdpFlags: U16,
    public var sxdpIfindex: U32,
    public var sxdpQueueId: U32,
    public var sxdpSharedUmemFd: U32,
)

public open class XdpRingOffset(
    public var producer: U64,
    public var consumer: U64,
    public var desc: U64,
    public var flags: U64,
)

public open class XdpMmapOffsets(
    public var rx: XdpRingOffset,
    public var tx: XdpRingOffset,
    public var fr: XdpRingOffset,
    public var cr: XdpRingOffset,
)

public open class XdpRingOffsetV1(
    public var producer: U64,
    public var consumer: U64,
    public var desc: U64,
)

public open class XdpMmapOffsetsV1(
    public var rx: XdpRingOffsetV1,
    public var tx: XdpRingOffsetV1,
    public var fr: XdpRingOffsetV1,
    public var cr: XdpRingOffsetV1,
)

public open class XdpUmemReg(
    public var addr: U64,
    public var len: U64,
    public var chunkSize: U32,
    public var headroom: U32,
    public var flags: U32,
    public var txMetadataLen: U32,
)

public open class XdpUmemRegV1(
    public var addr: U64,
    public var len: U64,
    public var chunkSize: U32,
    public var headroom: U32,
)

public open class XdpStatistics(
    public var rxDropped: U64,
    public var rxInvalidDescs: U64,
    public var txInvalidDescs: U64,
    public var rxRingFull: U64,
    public var rxFillRingEmptyDescs: U64,
    public var txRingEmptyDescs: U64,
)

public open class XdpStatisticsV1(
    public var rxDropped: U64,
    public var rxInvalidDescs: U64,
    public var txInvalidDescs: U64,
)

public open class XdpOptions(public var flags: U32)

public open class XdpDesc(
    public var addr: U64,
    public var len: U32,
    public var options: U32,
)

public open class XskTxMetadataCompletion(public var txTimestamp: U64)

public open class XskTxMetadataRequest(public var csumStart: U16, public var csumOffset: U16)

// linux/mount.h
public open class MountAttr(
    public var attrSet: U64,
    public var attrClr: U64,
    public var propagation: U64,
    public var usernsFd: U64,
)

// linux/nsfs.h
public open class MntNsInfo(
    public var size: U32,
    public var nrMounts: U32,
    public var mntNsId: U64,
)

public open class PidfdInfo(
    public var mask: U64,
    public var cgroupid: U64,
    public var pid: U32,
    public var tgid: U32,
    public var ppid: U32,
    public var ruid: U32,
    public var rgid: U32,
    public var euid: U32,
    public var egid: U32,
    public var suid: U32,
    public var sgid: U32,
    public var fsuid: U32,
    public var fsgid: U32,
    public var exitCode: S32,
)

// linux/uio.h
public open class DmabufCmsg(
    public var fragOffset: U64,
    public var fragSize: U32,
    public var fragToken: U32,
    public var dmabufId: U32,
    public var flags: U32,
)

public open class DmabufToken(public var tokenStart: U32, public var tokenCount: U32)

public open class SockaddrAlg(
    public var salgFamily: SaFamilyT,
    public var salgType: List<CUchar>,
    public var salgFeat: UInt,
    public var salgMask: UInt,
    public var salgName: List<CUchar>,
)

public open class PthreadCondT(public var size: List<UByte>)

public open class PthreadMutexT(public var size: List<CChar>)

public open class PthreadRwlockT(public var size: List<UByte>)

public open class PthreadBarrierT(public var size: List<UByte>)

public open class UinputSetup(
    public var id: InputId,
    public var name: List<CChar>,
    public var ffEffectsMax: U32,
)

public open class UinputUserDev(
    public var name: List<CChar>,
    public var id: InputId,
    public var ffEffectsMax: U32,
    public var absmax: List<S32>,
    public var absmin: List<S32>,
    public var absfuzz: List<S32>,
    public var absflat: List<S32>,
)

// x32 compatibility
// See https://sourceware.org/bugzilla/showBug.cgi?id=21279
public open class MqAttr(
    public var mqFlags: CLong,
    public var mqMaxmsg: CLong,
    public var mqMsgsize: CLong,
    public var mqCurmsgs: CLong,
    public var pad: List<CLong>,
)

public open class HwtstampConfig(
    public var flags: CInt,
    public var txType: CInt,
    public var rxFilter: CInt,
)

public open class SchedAttr(
    public var size: U32,
    public var schedPolicy: U32,
    public var schedFlags: U64,
    public var schedNice: S32,
    public var schedPriority: U32,
    public var schedRuntime: U64,
    public var schedDeadline: U64,
    public var schedPeriod: U64,
)

public open class IwThrspy(
    public var addr: Sockaddr,
    public var qual: IwQuality,
    public var low: IwQuality,
    public var high: IwQuality,
)

public open class IwMlme(
    public var cmd: U16,
    public var reasonCode: U16,
    public var addr: Sockaddr,
)

public open class IwMichaelmicfailure(
    public var flags: U32,
    public var srcAddr: Sockaddr,
    public var tsc: List<U8>,
)

/**
 * WARNING: The `PartialEq`, `Eq` and `Hash` implementations of this
 * type are unsound and will be removed in the future.
 */
public open class AfAlgIv(public var ivlen: UInt, public var iv: List<CUchar>) {
    public open fun asSlice(): List<UByte> {
        return fromRawParts(this.iv, this.ivlen.toInt())
    }

    public open fun eq(other: AfAlgIv): Boolean {
        return this.asSlice() == other.asSlice()
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.asSlice()).hashCode()
        return state
    }
}

public open class TpacketReqU(public var req: TpacketReq? = null, public var req3: TpacketReq3? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "tpacket_req_u").finishNonExhaustive()
    }
}

public open class TpacketBdHeaderU(public var bh1: TpacketHdrV1? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "tpacket_bd_header_u").finishNonExhaustive()
    }
}

public open class TpacketBlockDesc(
    public var version: U32,
    public var offsetToPriv: U32,
    public var hdr: TpacketBdHeaderU,
)

// linux/netTstamp.h
public open class SockTxtime(public var clockid: ClockidT, public var flags: U32)

// linux/wireless.h
public open class IwreqData(
    public var name: List<CChar>? = null,
    public var essid: IwPoint? = null,
    public var nwid: IwParam? = null,
    public var freq: IwFreq? = null,
    public var sens: IwParam? = null,
    public var bitrate: IwParam? = null,
    public var txpower: IwParam? = null,
    public var rts: IwParam? = null,
    public var frag: IwParam? = null,
    public var mode: U32? = null,
    public var retry: IwParam? = null,
    public var encoding: IwPoint? = null,
    public var power: IwParam? = null,
    public var qual: IwQuality? = null,
    public var apAddr: Sockaddr? = null,
    public var addr: Sockaddr? = null,
    public var param: IwParam? = null,
    public var data: IwPoint? = null,
) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "iwreq_data").finishNonExhaustive()
    }
}

public open class IwEvent(
    public var len: U16,
    public var cmd: U16,
    public var u: IwreqData,
)

public open class CAnonymousIwreq(public var ifrnName: List<CChar>? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_iwreq").finishNonExhaustive()
    }
}

public open class Iwreq(public var ifrIfrn: CAnonymousIwreq, public var u: IwreqData)

// linux/ptpClock.h
public open class CAnonymousPtpPeroutRequest1(public var start: PtpClockTime? = null, public var phase: PtpClockTime? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ptp_perout_request_1").finishNonExhaustive()
    }
}

public open class CAnonymousPtpPeroutRequest2(public var on: PtpClockTime? = null, public var rsv: List<CUint>? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ptp_perout_request_2").finishNonExhaustive()
    }
}

public open class PtpPeroutRequest(
    public var anonymous1: CAnonymousPtpPeroutRequest1,
    public var period: PtpClockTime,
    public var index: CUint,
    public var flags: CUint,
    public var anonymous2: CAnonymousPtpPeroutRequest2,
)

// linux/ifXdp.h
public open class XskTxMetadata(public var flags: U64, public var xskTxMetadataUnion: CAnonymousXskTxMetadataUnion)

public open class CAnonymousXskTxMetadataUnion(public var request: XskTxMetadataRequest? = null, public var completion: XskTxMetadataCompletion? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_xsk_tx_metadata_union").finishNonExhaustive()
    }
}
