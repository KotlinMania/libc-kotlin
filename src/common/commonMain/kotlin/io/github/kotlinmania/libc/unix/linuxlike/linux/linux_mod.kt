// port-lint: source unix/linux_like/linux/linux_mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.ClockidT
import io.github.kotlinmania.libc.CpuSetT
import io.github.kotlinmania.libc.ENODATA
import io.github.kotlinmania.libc.EpollEvent
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.Fpos64T
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.INT_MAX
import io.github.kotlinmania.libc.INT_MIN
import io.github.kotlinmania.libc.IO
import io.github.kotlinmania.libc.IOR
import io.github.kotlinmania.libc.IOW
import io.github.kotlinmania.libc.IOWR
import io.github.kotlinmania.libc.IPC_STAT
import io.github.kotlinmania.libc.In6Addr
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.Itimerspec
import io.github.kotlinmania.libc.KeyT
import io.github.kotlinmania.libc.MSG_FIN
import io.github.kotlinmania.libc.NLMSG_MIN_TYPE
import io.github.kotlinmania.libc.NLMSG_OVERRUN
import io.github.kotlinmania.libc.OffT
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.S64
import io.github.kotlinmania.libc.SIZEOF_PTHREAD_COND_T
import io.github.kotlinmania.libc.SIZEOF_PTHREAD_MUTEX_T
import io.github.kotlinmania.libc.SIZEOF_PTHREAD_RWLOCK_T
import io.github.kotlinmania.libc.SaFamilyT
import io.github.kotlinmania.libc.SchedParam
import io.github.kotlinmania.libc.Sembuf
import io.github.kotlinmania.libc.SigsetT
import io.github.kotlinmania.libc.SockFilter
import io.github.kotlinmania.libc.Sockaddr
import io.github.kotlinmania.libc.SockaddrLl
import io.github.kotlinmania.libc.SockaddrUn
import io.github.kotlinmania.libc.Spwd
import io.github.kotlinmania.libc.Timespec
import io.github.kotlinmania.libc.Timeval
import io.github.kotlinmania.libc.U64
import io.github.kotlinmania.libc.UidT
import io.github.kotlinmania.libc.pthreadCondT
import io.github.kotlinmania.libc.pthreadMutexT
import io.github.kotlinmania.libc.pthreadRwlockT
import io.github.kotlinmania.libc.strlen

// Linux-specific definitions for linux-like values

public fun interface CloneCbCallback {
    public operator fun invoke(arg0: COpaquePointer?): CInt
}

public typealias DevT = ULong

public typealias SocklenT = UInt

public typealias ModeT = UInt

public typealias Ino64T = ULong

public typealias Off64T = Long

public typealias Blkcnt64T = Long

public typealias Rlim64T = ULong

public typealias MqdT = CInt

public typealias NfdsT = CUlong

public typealias NlItem = CInt

public typealias IdtypeT = CUint

public typealias LoffT = CLonglong

public typealias PthreadKeyT = CUint

public typealias PthreadOnceT = CInt

public typealias PthreadSpinlockT = CInt

public typealias KernelFsidT = CAnonymousKernelFsidT

public typealias KernelClockidT = CInt

public typealias U8 = CUchar

public typealias U16 = CUshort

public typealias S16 = CShort

public typealias U32 = CUint

public typealias S32 = CInt

// linux/sctp.h
public typealias SctpAssocT = S32

public typealias EventfdT = ULong

// linux/cnProc.h
// These functions are not available on OpenHarmony
// LFS64 extensions
//
// * musl has 64-bit versions only so aliases the LFS64 symbols to the standard ones
public sealed class TpacketVersions {
    public data object TpacketV1 : TpacketVersions()
    public data object TpacketV2 : TpacketVersions()
    public data object TpacketV3 : TpacketVersions()
}

public typealias PidType = CEnumRepr

public val PIDTYPE_PID: PidType = 0

public val PIDTYPE_TGID: PidType = PIDTYPE_PID + 1

public val PIDTYPE_PGID: PidType = PIDTYPE_TGID + 1

public val PIDTYPE_SID: PidType = PIDTYPE_PGID + 1

public val PIDTYPE_MAX: PidType = PIDTYPE_SID + 1

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
    public var hv1: io.github.kotlinmania.libc.TpacketHdrVariant1,
    public var tpPadding: List<U8>,
)

public open class TpacketBdTs(public var tsSec: CUint, public var tsUsec: CUint)

public open class TpacketHdrV1(
    public var blockStatus: U32,
    public var numPkts: U32,
    public var offsetToFirstPkt: U32,
    public var blkLen: U32,
    public var seqNum: U64,
    public var tsFirstPkt: io.github.kotlinmania.libc.TpacketBdTs,
    public var tsLastPkt: io.github.kotlinmania.libc.TpacketBdTs,
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
    public var sinfoAssocId: io.github.kotlinmania.libc.SctpAssocT,
)

public open class SctpSndinfo(
    public var sndSid: U16,
    public var sndFlags: U16,
    public var sndPpid: U32,
    public var sndContext: U32,
    public var sndAssocId: io.github.kotlinmania.libc.SctpAssocT,
)

public open class SctpRcvinfo(
    public var rcvSid: U16,
    public var rcvSsn: U16,
    public var rcvFlags: U16,
    public var rcvPpid: U32,
    public var rcvTsn: U32,
    public var rcvCumtsn: U32,
    public var rcvContext: U32,
    public var rcvAssocId: io.github.kotlinmania.libc.SctpAssocT,
)

public open class SctpNxtinfo(
    public var nxtSid: U16,
    public var nxtFlags: U16,
    public var nxtPpid: U32,
    public var nxtLength: U32,
    public var nxtAssocId: io.github.kotlinmania.libc.SctpAssocT,
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
    public var sxdpFamily: io.github.kotlinmania.libc.U16,
    public var sxdpFlags: io.github.kotlinmania.libc.U16,
    public var sxdpIfindex: io.github.kotlinmania.libc.U32,
    public var sxdpQueueId: io.github.kotlinmania.libc.U32,
    public var sxdpSharedUmemFd: io.github.kotlinmania.libc.U32,
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
    public var chunkSize: io.github.kotlinmania.libc.U32,
    public var headroom: io.github.kotlinmania.libc.U32,
    public var flags: io.github.kotlinmania.libc.U32,
    public var txMetadataLen: io.github.kotlinmania.libc.U32,
)

public open class XdpUmemRegV1(
    public var addr: U64,
    public var len: U64,
    public var chunkSize: io.github.kotlinmania.libc.U32,
    public var headroom: io.github.kotlinmania.libc.U32,
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

public open class XdpOptions(public var flags: io.github.kotlinmania.libc.U32)

public open class XdpDesc(
    public var addr: U64,
    public var len: io.github.kotlinmania.libc.U32,
    public var options: io.github.kotlinmania.libc.U32,
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
    public var size: io.github.kotlinmania.libc.U32,
    public var nrMounts: io.github.kotlinmania.libc.U32,
    public var mntNsId: U64,
)

public open class PidfdInfo(
    public var mask: U64,
    public var cgroupid: U64,
    public var pid: io.github.kotlinmania.libc.U32,
    public var tgid: io.github.kotlinmania.libc.U32,
    public var ppid: io.github.kotlinmania.libc.U32,
    public var ruid: io.github.kotlinmania.libc.U32,
    public var rgid: io.github.kotlinmania.libc.U32,
    public var euid: io.github.kotlinmania.libc.U32,
    public var egid: io.github.kotlinmania.libc.U32,
    public var suid: io.github.kotlinmania.libc.U32,
    public var sgid: io.github.kotlinmania.libc.U32,
    public var fsuid: io.github.kotlinmania.libc.U32,
    public var fsgid: io.github.kotlinmania.libc.U32,
    public var exitCode: io.github.kotlinmania.libc.S32,
)

// linux/uio.h
public open class DmabufCmsg(
    public var fragOffset: U64,
    public var fragSize: io.github.kotlinmania.libc.U32,
    public var fragToken: io.github.kotlinmania.libc.U32,
    public var dmabufId: io.github.kotlinmania.libc.U32,
    public var flags: io.github.kotlinmania.libc.U32,
)

public open class DmabufToken(public var tokenStart: io.github.kotlinmania.libc.U32, public var tokenCount: io.github.kotlinmania.libc.U32)

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

public open class TpacketReqU(public var req: io.github.kotlinmania.libc.TpacketReq? = null, public var req3: io.github.kotlinmania.libc.TpacketReq3? = null)

public open class TpacketBdHeaderU(public var bh1: io.github.kotlinmania.libc.TpacketHdrV1? = null)

public open class TpacketBlockDesc(
    public var version: U32,
    public var offsetToPriv: U32,
    public var hdr: io.github.kotlinmania.libc.TpacketBdHeaderU,
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
)

public open class IwEvent(
    public var len: U16,
    public var cmd: U16,
    public var u: IwreqData,
)

public open class CAnonymousIwreq(public var ifrnName: List<CChar>? = null)

public open class Iwreq(public var ifrIfrn: CAnonymousIwreq, public var u: IwreqData)

// linux/ptpClock.h
public open class CAnonymousPtpPeroutRequest1(public var start: PtpClockTime? = null, public var phase: PtpClockTime? = null)

public open class CAnonymousPtpPeroutRequest2(public var on: PtpClockTime? = null, public var rsv: List<CUint>? = null)

public open class PtpPeroutRequest(
    public var anonymous1: CAnonymousPtpPeroutRequest1,
    public var period: PtpClockTime,
    public var index: CUint,
    public var flags: CUint,
    public var anonymous2: CAnonymousPtpPeroutRequest2,
)

// linux/ifXdp.h
public open class XskTxMetadata(public var flags: U64, public var xskTxMetadataUnion: CAnonymousXskTxMetadataUnion)

public open class CAnonymousXskTxMetadataUnion(public var request: XskTxMetadataRequest? = null, public var completion: XskTxMetadataCompletion? = null)

public val POSIX_SPAWN_USEVFORK: CInt = 64

public val POSIX_SPAWN_SETSID: CInt = 128

public val F_SEAL_FUTURE_WRITE: CInt = 0x0010

public val F_SEAL_EXEC: CInt = 0x0020

public val IFF_LOWER_UP: CInt = 0x10000

public val IFF_DORMANT: CInt = 0x20000

public val IFF_ECHO: CInt = 0x40000

// linux/fcntl.h
public val AT_EXECVE_CHECK: CInt = 0x10000

// linux/ifAddr.h
public val IFA_UNSPEC: CUshort = 0u

public val IFA_ADDRESS: CUshort = 1u

public val IFA_LOCAL: CUshort = 2u

public val IFA_LABEL: CUshort = 3u

public val IFA_BROADCAST: CUshort = 4u

public val IFA_ANYCAST: CUshort = 5u

public val IFA_CACHEINFO: CUshort = 6u

public val IFA_MULTICAST: CUshort = 7u

public val IFA_FLAGS: CUshort = 8u

public val IFA_F_SECONDARY: UInt = 0x01u

public val IFA_F_TEMPORARY: UInt = 0x01u

public val IFA_F_NODAD: UInt = 0x02u

public val IFA_F_OPTIMISTIC: UInt = 0x04u

public val IFA_F_DADFAILED: UInt = 0x08u

public val IFA_F_HOMEADDRESS: UInt = 0x10u

public val IFA_F_DEPRECATED: UInt = 0x20u

public val IFA_F_TENTATIVE: UInt = 0x40u

public val IFA_F_PERMANENT: UInt = 0x80u

public val IFA_F_MANAGETEMPADDR: UInt = 0x100u

public val IFA_F_NOPREFIXROUTE: UInt = 0x200u

public val IFA_F_MCAUTOJOIN: UInt = 0x400u

public val IFA_F_STABLE_PRIVACY: UInt = 0x800u

// linux/fs.h
// Flags for preadv2/pwritev2
public val RWF_HIPRI: CInt = 0x00000001

public val RWF_DSYNC: CInt = 0x00000002

public val RWF_SYNC: CInt = 0x00000004

public val RWF_NOWAIT: CInt = 0x00000008

public val RWF_APPEND: CInt = 0x00000010

public val RWF_NOAPPEND: CInt = 0x00000020

public val RWF_ATOMIC: CInt = 0x00000040

public val RWF_DONTCACHE: CInt = 0x00000080

// linux/ifLink.h
public val IFLA_UNSPEC: CUshort = 0u

public val IFLA_ADDRESS: CUshort = 1u

public val IFLA_BROADCAST: CUshort = 2u

public val IFLA_IFNAME: CUshort = 3u

public val IFLA_MTU: CUshort = 4u

public val IFLA_LINK: CUshort = 5u

public val IFLA_QDISC: CUshort = 6u

public val IFLA_STATS: CUshort = 7u

public val IFLA_COST: CUshort = 8u

public val IFLA_PRIORITY: CUshort = 9u

public val IFLA_MASTER: CUshort = 10u

public val IFLA_WIRELESS: CUshort = 11u

public val IFLA_PROTINFO: CUshort = 12u

public val IFLA_TXQLEN: CUshort = 13u

public val IFLA_MAP: CUshort = 14u

public val IFLA_WEIGHT: CUshort = 15u

public val IFLA_OPERSTATE: CUshort = 16u

public val IFLA_LINKMODE: CUshort = 17u

public val IFLA_LINKINFO: CUshort = 18u

public val IFLA_NET_NS_PID: CUshort = 19u

public val IFLA_IFALIAS: CUshort = 20u

public val IFLA_NUM_VF: CUshort = 21u

public val IFLA_VFINFO_LIST: CUshort = 22u

public val IFLA_STATS64: CUshort = 23u

public val IFLA_VF_PORTS: CUshort = 24u

public val IFLA_PORT_SELF: CUshort = 25u

public val IFLA_AF_SPEC: CUshort = 26u

public val IFLA_GROUP: CUshort = 27u

public val IFLA_NET_NS_FD: CUshort = 28u

public val IFLA_EXT_MASK: CUshort = 29u

public val IFLA_PROMISCUITY: CUshort = 30u

public val IFLA_NUM_TX_QUEUES: CUshort = 31u

public val IFLA_NUM_RX_QUEUES: CUshort = 32u

public val IFLA_CARRIER: CUshort = 33u

public val IFLA_PHYS_PORT_ID: CUshort = 34u

public val IFLA_CARRIER_CHANGES: CUshort = 35u

public val IFLA_PHYS_SWITCH_ID: CUshort = 36u

public val IFLA_LINK_NETNSID: CUshort = 37u

public val IFLA_PHYS_PORT_NAME: CUshort = 38u

public val IFLA_PROTO_DOWN: CUshort = 39u

public val IFLA_GSO_MAX_SEGS: CUshort = 40u

public val IFLA_GSO_MAX_SIZE: CUshort = 41u

public val IFLA_PAD: CUshort = 42u

public val IFLA_XDP: CUshort = 43u

public val IFLA_EVENT: CUshort = 44u

public val IFLA_NEW_NETNSID: CUshort = 45u

public val IFLA_IF_NETNSID: CUshort = 46u

public val IFLA_TARGET_NETNSID: CUshort = IFLA_IF_NETNSID

public val IFLA_CARRIER_UP_COUNT: CUshort = 47u

public val IFLA_CARRIER_DOWN_COUNT: CUshort = 48u

public val IFLA_NEW_IFINDEX: CUshort = 49u

public val IFLA_MIN_MTU: CUshort = 50u

public val IFLA_MAX_MTU: CUshort = 51u

public val IFLA_PROP_LIST: CUshort = 52u

public val IFLA_ALT_IFNAME: CUshort = 53u

public val IFLA_PERM_ADDRESS: CUshort = 54u

public val IFLA_PROTO_DOWN_REASON: CUshort = 55u

public val IFLA_PARENT_DEV_NAME: CUshort = 56u

public val IFLA_PARENT_DEV_BUS_NAME: CUshort = 57u

public val IFLA_GRO_MAX_SIZE: CUshort = 58u

public val IFLA_TSO_MAX_SIZE: CUshort = 59u

public val IFLA_TSO_MAX_SEGS: CUshort = 60u

public val IFLA_ALLMULTI: CUshort = 61u

public val IFLA_INFO_UNSPEC: CUshort = 0u

public val IFLA_INFO_KIND: CUshort = 1u

public val IFLA_INFO_DATA: CUshort = 2u

public val IFLA_INFO_XSTATS: CUshort = 3u

public val IFLA_INFO_SLAVE_KIND: CUshort = 4u

public val IFLA_INFO_SLAVE_DATA: CUshort = 5u

// Since Linux 3.1
public val SEEK_DATA: CInt = 3

public val SEEK_HOLE: CInt = 4

// linux/mempolicy.h
public val MPOL_DEFAULT: CInt = 0

public val MPOL_PREFERRED: CInt = 1

public val MPOL_BIND: CInt = 2

public val MPOL_INTERLEAVE: CInt = 3

public val MPOL_LOCAL: CInt = 4

public val MPOL_F_NUMA_BALANCING: CInt = 1 shl 13

public val MPOL_F_RELATIVE_NODES: CInt = 1 shl 14

public val MPOL_F_STATIC_NODES: CInt = 1 shl 15

public val PTHREAD_MUTEX_INITIALIZER: io.github.kotlinmania.libc.PthreadMutexT = pthreadMutexT(size = List(SIZEOF_PTHREAD_MUTEX_T) { 0 })

public val PTHREAD_COND_INITIALIZER: io.github.kotlinmania.libc.PthreadCondT = pthreadCondT(size = List(SIZEOF_PTHREAD_COND_T) { 0 })

public val PTHREAD_RWLOCK_INITIALIZER: io.github.kotlinmania.libc.PthreadRwlockT = pthreadRwlockT(size = List(SIZEOF_PTHREAD_RWLOCK_T) { 0 })

public val RENAME_NOREPLACE: CUint = 1u

public val RENAME_EXCHANGE: CUint = 2u

public val RENAME_WHITEOUT: CUint = 4u

public val MSG_STAT: CInt = 11 or (IPC_STAT and 0x100)

public val MSG_INFO: CInt = 12

public val MSG_NOTIFICATION: CInt = 0x8000

public val MSG_NOERROR: CInt = 4096

public val MSG_EXCEPT: CInt = 8192

public val MSG_ZEROCOPY: CInt = 0x4000000

public val SEM_UNDO: CInt = 0x1000

public val GETPID: CInt = 11

public val GETVAL: CInt = 12

public val GETALL: CInt = 13

public val GETNCNT: CInt = 14

public val GETZCNT: CInt = 15

public val SETVAL: CInt = 16

public val SETALL: CInt = 17

public val SEM_STAT: CInt = 18 or (IPC_STAT and 0x100)

public val SEM_INFO: CInt = 19

public val SEM_STAT_ANY: CInt = 20 or (IPC_STAT and 0x100)

public val QFMT_VFS_OLD: CInt = 1

public val QFMT_VFS_V0: CInt = 2

public val QFMT_VFS_V1: CInt = 4

public val EFD_SEMAPHORE: CInt = 0x1

public val RB_AUTOBOOT: CInt = 0x01234567u.toInt()

public val RB_HALT_SYSTEM: CInt = 0xcdef0123u.toInt()

public val RB_ENABLE_CAD: CInt = 0x89abcdefu.toInt()

public val RB_DISABLE_CAD: CInt = 0x00000000u.toInt()

public val RB_POWER_OFF: CInt = 0x4321fedcu.toInt()

public val RB_SW_SUSPEND: CInt = 0xd000fce2u.toInt()

public val RB_KEXEC: CInt = 0x45584543u.toInt()

public val SYNC_FILE_RANGE_WAIT_BEFORE: CUint = 1u

public val SYNC_FILE_RANGE_WRITE: CUint = 2u

public val SYNC_FILE_RANGE_WAIT_AFTER: CUint = 4u

public val MREMAP_MAYMOVE: CInt = 1

public val MREMAP_FIXED: CInt = 2

public val MREMAP_DONTUNMAP: CInt = 4

// linux/nsfs.h
public val NSIO: CUint = 0xb7u

public val NS_GET_USERNS: Ioctl = IO(NSIO, 0x1)

public val NS_GET_PARENT: Ioctl = IO(NSIO, 0x2)

public val NS_GET_NSTYPE: Ioctl = IO(NSIO, 0x3)

public val NS_GET_OWNER_UID: Ioctl = IO(NSIO, 0x4)

public val NS_GET_MNTNS_ID: Ioctl = IOR<U64>(NSIO, 0x5)

public val NS_GET_PID_FROM_PIDNS: Ioctl = IOR<CInt>(NSIO, 0x6)

public val NS_GET_TGID_FROM_PIDNS: Ioctl = IOR<CInt>(NSIO, 0x7)

public val NS_GET_PID_IN_PIDNS: Ioctl = IOR<CInt>(NSIO, 0x8)

public val NS_GET_TGID_IN_PIDNS: Ioctl = IOR<CInt>(NSIO, 0x9)

public val MNT_NS_INFO_SIZE_VER0: Ioctl = 16

public val NS_MNT_GET_INFO: Ioctl = IOR<MntNsInfo>(NSIO, 10)

public val NS_MNT_GET_NEXT: Ioctl = IOR<MntNsInfo>(NSIO, 11)

public val NS_MNT_GET_PREV: Ioctl = IOR<MntNsInfo>(NSIO, 12)

// linux/pidfd.h
public val PIDFD_NONBLOCK: CUint = O_NONBLOCK.toUInt()

public val PIDFD_THREAD: CUint = O_EXCL.toUInt()

public val PIDFD_SIGNAL_THREAD: CUint = 1u shl 0

public val PIDFD_SIGNAL_THREAD_GROUP: CUint = 1u shl 1

public val PIDFD_SIGNAL_PROCESS_GROUP: CUint = 1u shl 2

public val PIDFD_INFO_PID: CUint = 1u shl 0

public val PIDFD_INFO_CREDS: CUint = 1u shl 1

public val PIDFD_INFO_CGROUPID: CUint = 1u shl 2

public val PIDFD_INFO_EXIT: CUint = 1u shl 3

public val PIDFD_INFO_SIZE_VER0: CUint = 64u

public val PIDFS_IOCTL_MAGIC: CUint = 0xFFu

public val PIDFD_GET_CGROUP_NAMESPACE: Ioctl = IO(PIDFS_IOCTL_MAGIC, 1)

public val PIDFD_GET_IPC_NAMESPACE: Ioctl = IO(PIDFS_IOCTL_MAGIC, 2)

public val PIDFD_GET_MNT_NAMESPACE: Ioctl = IO(PIDFS_IOCTL_MAGIC, 3)

public val PIDFD_GET_NET_NAMESPACE: Ioctl = IO(PIDFS_IOCTL_MAGIC, 4)

public val PIDFD_GET_PID_NAMESPACE: Ioctl = IO(PIDFS_IOCTL_MAGIC, 5)

public val PIDFD_GET_PID_FOR_CHILDREN_NAMESPACE: Ioctl = IO(PIDFS_IOCTL_MAGIC, 6)

public val PIDFD_GET_TIME_NAMESPACE: Ioctl = IO(PIDFS_IOCTL_MAGIC, 7)

public val PIDFD_GET_TIME_FOR_CHILDREN_NAMESPACE: Ioctl = IO(PIDFS_IOCTL_MAGIC, 8)

public val PIDFD_GET_USER_NAMESPACE: Ioctl = IO(PIDFS_IOCTL_MAGIC, 9)

public val PIDFD_GET_UTS_NAMESPACE: Ioctl = IO(PIDFS_IOCTL_MAGIC, 10)

public val PIDFD_GET_INFO: Ioctl = IOWR<PidfdInfo>(PIDFS_IOCTL_MAGIC, 11)

public val PR_SET_MDWE: CInt = 65

public val PR_GET_MDWE: CInt = 66

public val PR_MDWE_REFUSE_EXEC_GAIN: CUint = 1u shl 0

public val PR_MDWE_NO_INHERIT: CUint = 1u shl 1

public val GRND_NONBLOCK: CUint = 0x0001u

public val GRND_RANDOM: CUint = 0x0002u

public val GRND_INSECURE: CUint = 0x0004u

// <linux/seccomp.h>
public val SECCOMP_MODE_DISABLED: CUint = 0u

public val SECCOMP_MODE_STRICT: CUint = 1u

public val SECCOMP_MODE_FILTER: CUint = 2u

public val SECCOMP_SET_MODE_STRICT: CUint = 0u

public val SECCOMP_SET_MODE_FILTER: CUint = 1u

public val SECCOMP_GET_ACTION_AVAIL: CUint = 2u

public val SECCOMP_GET_NOTIF_SIZES: CUint = 3u

public val SECCOMP_FILTER_FLAG_TSYNC: CUlong = 1uL shl 0

public val SECCOMP_FILTER_FLAG_LOG: CUlong = 1uL shl 1

public val SECCOMP_FILTER_FLAG_SPEC_ALLOW: CUlong = 1uL shl 2

public val SECCOMP_FILTER_FLAG_NEW_LISTENER: CUlong = 1uL shl 3

public val SECCOMP_FILTER_FLAG_TSYNC_ESRCH: CUlong = 1uL shl 4

public val SECCOMP_FILTER_FLAG_WAIT_KILLABLE_RECV: CUlong = 1uL shl 5

public val SECCOMP_RET_KILL_PROCESS: CUint = 0x80000000u

public val SECCOMP_RET_KILL_THREAD: CUint = 0x00000000u

public val SECCOMP_RET_KILL: CUint = SECCOMP_RET_KILL_THREAD

public val SECCOMP_RET_TRAP: CUint = 0x00030000u

public val SECCOMP_RET_ERRNO: CUint = 0x00050000u

public val SECCOMP_RET_USER_NOTIF: CUint = 0x7fc00000u

public val SECCOMP_RET_TRACE: CUint = 0x7ff00000u

public val SECCOMP_RET_LOG: CUint = 0x7ffc0000u

public val SECCOMP_RET_ALLOW: CUint = 0x7fff0000u

public val SECCOMP_RET_ACTION_FULL: CUint = 0xffff0000u

public val SECCOMP_RET_ACTION: CUint = 0x7fff0000u

public val SECCOMP_RET_DATA: CUint = 0x0000ffffu

public val SECCOMP_USER_NOTIF_FLAG_CONTINUE: CUlong = 1uL

public val SECCOMP_ADDFD_FLAG_SETFD: CUlong = 1uL

public val SECCOMP_ADDFD_FLAG_SEND: CUlong = 2uL

public val TFD_CLOEXEC: CInt = O_CLOEXEC

public val TFD_NONBLOCK: CInt = O_NONBLOCK

public val TFD_TIMER_ABSTIME: CInt = 1

public val TFD_TIMER_CANCEL_ON_SET: CInt = 2

public val FALLOC_FL_KEEP_SIZE: CInt = 0x01

public val FALLOC_FL_PUNCH_HOLE: CInt = 0x02

public val FALLOC_FL_COLLAPSE_RANGE: CInt = 0x08

public val FALLOC_FL_ZERO_RANGE: CInt = 0x10

public val FALLOC_FL_INSERT_RANGE: CInt = 0x20

public val FALLOC_FL_UNSHARE_RANGE: CInt = 0x40

public val ENOATTR: CInt = ENODATA

public val SO_ORIGINAL_DST: CInt = 80

public val IP_RECVFRAGSIZE: CInt = 25

public val IPV6_FLOWINFO: CInt = 11

public val IPV6_FLOWLABEL_MGR: CInt = 32

public val IPV6_FLOWINFO_SEND: CInt = 33

public val IPV6_RECVFRAGSIZE: CInt = 77

public val IPV6_FREEBIND: CInt = 78

public val IPV6_FLOWINFO_FLOWLABEL: CInt = 0x000fffff

public val IPV6_FLOWINFO_PRIORITY: CInt = 0x0ff00000

// SO_MEMINFO offsets
public val SK_MEMINFO_RMEM_ALLOC: CInt = 0

public val SK_MEMINFO_RCVBUF: CInt = 1

public val SK_MEMINFO_WMEM_ALLOC: CInt = 2

public val SK_MEMINFO_SNDBUF: CInt = 3

public val SK_MEMINFO_FWD_ALLOC: CInt = 4

public val SK_MEMINFO_WMEM_QUEUED: CInt = 5

public val SK_MEMINFO_OPTMEM: CInt = 6

public val SK_MEMINFO_BACKLOG: CInt = 7

public val SK_MEMINFO_DROPS: CInt = 8

// linux/closeRange.h
public val CLOSE_RANGE_UNSHARE: CUint = 1u shl 1

public val CLOSE_RANGE_CLOEXEC: CUint = 1u shl 2

// linux/filter.h
public val SKF_AD_OFF: CInt = -0x1000

public val SKF_AD_PROTOCOL: CInt = 0

public val SKF_AD_PKTTYPE: CInt = 4

public val SKF_AD_IFINDEX: CInt = 8

public val SKF_AD_NLATTR: CInt = 12

public val SKF_AD_NLATTR_NEST: CInt = 16

public val SKF_AD_MARK: CInt = 20

public val SKF_AD_QUEUE: CInt = 24

public val SKF_AD_HATYPE: CInt = 28

public val SKF_AD_RXHASH: CInt = 32

public val SKF_AD_CPU: CInt = 36

public val SKF_AD_ALU_XOR_X: CInt = 40

public val SKF_AD_VLAN_TAG: CInt = 44

public val SKF_AD_VLAN_TAG_PRESENT: CInt = 48

public val SKF_AD_PAY_OFFSET: CInt = 52

public val SKF_AD_RANDOM: CInt = 56

public val SKF_AD_VLAN_TPID: CInt = 60

public val SKF_AD_MAX: CInt = 64

public val SKF_NET_OFF: CInt = -0x100000

public val SKF_LL_OFF: CInt = -0x200000

public val BPF_NET_OFF: CInt = SKF_NET_OFF

public val BPF_LL_OFF: CInt = SKF_LL_OFF

public val BPF_MEMWORDS: CInt = 16

public val BPF_MAXINSNS: CInt = 4096

// linux/bpfCommon.h
public val BPF_LD: U32 = 0x00u

public val BPF_LDX: U32 = 0x01u

public val BPF_ST: U32 = 0x02u

public val BPF_STX: U32 = 0x03u

public val BPF_ALU: U32 = 0x04u

public val BPF_JMP: U32 = 0x05u

public val BPF_RET: U32 = 0x06u

public val BPF_MISC: U32 = 0x07u

public val BPF_W: U32 = 0x00u

public val BPF_H: U32 = 0x08u

public val BPF_B: U32 = 0x10u

public val BPF_IMM: U32 = 0x00u

public val BPF_ABS: U32 = 0x20u

public val BPF_IND: U32 = 0x40u

public val BPF_MEM: U32 = 0x60u

public val BPF_LEN: U32 = 0x80u

public val BPF_MSH: U32 = 0xa0u

public val BPF_ADD: U32 = 0x00u

public val BPF_SUB: U32 = 0x10u

public val BPF_MUL: U32 = 0x20u

public val BPF_DIV: U32 = 0x30u

public val BPF_OR: U32 = 0x40u

public val BPF_AND: U32 = 0x50u

public val BPF_LSH: U32 = 0x60u

public val BPF_RSH: U32 = 0x70u

public val BPF_NEG: U32 = 0x80u

public val BPF_MOD: U32 = 0x90u

public val BPF_XOR: U32 = 0xa0u

public val BPF_JA: U32 = 0x00u

public val BPF_JEQ: U32 = 0x10u

public val BPF_JGT: U32 = 0x20u

public val BPF_JGE: U32 = 0x30u

public val BPF_JSET: U32 = 0x40u

public val BPF_K: U32 = 0x00u

public val BPF_X: U32 = 0x08u

// linux/filter.h
public val BPF_A: U32 = 0x10u

public val BPF_TAX: U32 = 0x00u

public val BPF_TXA: U32 = 0x80u

// linux/openat2.h
public val RESOLVE_NO_XDEV: U64 = 0x01

public val RESOLVE_NO_MAGICLINKS: U64 = 0x02

public val RESOLVE_NO_SYMLINKS: U64 = 0x04

public val RESOLVE_BENEATH: U64 = 0x08

public val RESOLVE_IN_ROOT: U64 = 0x10

public val RESOLVE_CACHED: U64 = 0x20

// linux/ifEther.h
public val ETH_ALEN: CInt = 6

public val ETH_HLEN: CInt = 14

public val ETH_ZLEN: CInt = 60

public val ETH_DATA_LEN: CInt = 1500

public val ETH_FRAME_LEN: CInt = 1514

public val ETH_FCS_LEN: CInt = 4

// These are the defined Ethernet Protocol ID's.
public val ETH_P_LOOP: CInt = 0x0060

public val ETH_P_PUP: CInt = 0x0200

public val ETH_P_PUPAT: CInt = 0x0201

public val ETH_P_IP: CInt = 0x0800

public val ETH_P_X25: CInt = 0x0805

public val ETH_P_ARP: CInt = 0x0806

public val ETH_P_BPQ: CInt = 0x08FF

public val ETH_P_IEEEPUP: CInt = 0x0a00

public val ETH_P_IEEEPUPAT: CInt = 0x0a01

public val ETH_P_BATMAN: CInt = 0x4305

public val ETH_P_DEC: CInt = 0x6000

public val ETH_P_DNA_DL: CInt = 0x6001

public val ETH_P_DNA_RC: CInt = 0x6002

public val ETH_P_DNA_RT: CInt = 0x6003

public val ETH_P_LAT: CInt = 0x6004

public val ETH_P_DIAG: CInt = 0x6005

public val ETH_P_CUST: CInt = 0x6006

public val ETH_P_SCA: CInt = 0x6007

public val ETH_P_TEB: CInt = 0x6558

public val ETH_P_RARP: CInt = 0x8035

public val ETH_P_ATALK: CInt = 0x809B

public val ETH_P_AARP: CInt = 0x80F3

public val ETH_P_8021Q: CInt = 0x8100

public val ETH_P_IPX: CInt = 0x8137

public val ETH_P_IPV6: CInt = 0x86DD

public val ETH_P_PAUSE: CInt = 0x8808

public val ETH_P_SLOW: CInt = 0x8809

public val ETH_P_WCCP: CInt = 0x883E

public val ETH_P_MPLS_UC: CInt = 0x8847

public val ETH_P_MPLS_MC: CInt = 0x8848

public val ETH_P_ATMMPOA: CInt = 0x884c

public val ETH_P_PPP_DISC: CInt = 0x8863

public val ETH_P_PPP_SES: CInt = 0x8864

public val ETH_P_LINK_CTL: CInt = 0x886c

public val ETH_P_ATMFATE: CInt = 0x8884

public val ETH_P_PAE: CInt = 0x888E

public val ETH_P_AOE: CInt = 0x88A2

public val ETH_P_8021AD: CInt = 0x88A8

public val ETH_P_802_EX1: CInt = 0x88B5

public val ETH_P_TIPC: CInt = 0x88CA

public val ETH_P_MACSEC: CInt = 0x88E5

public val ETH_P_8021AH: CInt = 0x88E7

public val ETH_P_MVRP: CInt = 0x88F5

public val ETH_P_1588: CInt = 0x88F7

public val ETH_P_PRP: CInt = 0x88FB

public val ETH_P_FCOE: CInt = 0x8906

public val ETH_P_TDLS: CInt = 0x890D

public val ETH_P_FIP: CInt = 0x8914

public val ETH_P_80221: CInt = 0x8917

public val ETH_P_LOOPBACK: CInt = 0x9000

public val ETH_P_QINQ1: CInt = 0x9100

public val ETH_P_QINQ2: CInt = 0x9200

public val ETH_P_QINQ3: CInt = 0x9300

public val ETH_P_EDSA: CInt = 0xDADA

public val ETH_P_AF_IUCV: CInt = 0xFBFB

public val ETH_P_802_3_MIN: CInt = 0x0600

// Non DIX types. Won't clash for 1500 types.
public val ETH_P_802_3: CInt = 0x0001

public val ETH_P_AX25: CInt = 0x0002

public val ETH_P_ALL: CInt = 0x0003

public val ETH_P_802_2: CInt = 0x0004

public val ETH_P_SNAP: CInt = 0x0005

public val ETH_P_DDCMP: CInt = 0x0006

public val ETH_P_WAN_PPP: CInt = 0x0007

public val ETH_P_PPP_MP: CInt = 0x0008

public val ETH_P_LOCALTALK: CInt = 0x0009

public val ETH_P_CANFD: CInt = 0x000D

public val ETH_P_PPPTALK: CInt = 0x0010

public val ETH_P_TR_802_2: CInt = 0x0011

public val ETH_P_MOBITEX: CInt = 0x0015

public val ETH_P_CONTROL: CInt = 0x0016

public val ETH_P_IRDA: CInt = 0x0017

public val ETH_P_ECONET: CInt = 0x0018

public val ETH_P_HDLC: CInt = 0x0019

public val ETH_P_ARCNET: CInt = 0x001A

public val ETH_P_DSA: CInt = 0x001B

public val ETH_P_TRAILER: CInt = 0x001C

public val ETH_P_PHONET: CInt = 0x00F5

public val ETH_P_IEEE802154: CInt = 0x00F6

public val ETH_P_CAIF: CInt = 0x00F7

// DIFF(main): changed to `cShort` in f62eb023ab
public val POSIX_SPAWN_RESETIDS: CInt = 0x01

public val POSIX_SPAWN_SETPGROUP: CInt = 0x02

public val POSIX_SPAWN_SETSIGDEF: CInt = 0x04

public val POSIX_SPAWN_SETSIGMASK: CInt = 0x08

public val POSIX_SPAWN_SETSCHEDPARAM: CInt = 0x10

public val POSIX_SPAWN_SETSCHEDULER: CInt = 0x20

// linux/netfilter/nfnetlink.h
public val NFNLGRP_NONE: CInt = 0

public val NFNLGRP_CONNTRACK_NEW: CInt = 1

public val NFNLGRP_CONNTRACK_UPDATE: CInt = 2

public val NFNLGRP_CONNTRACK_DESTROY: CInt = 3

public val NFNLGRP_CONNTRACK_EXP_NEW: CInt = 4

public val NFNLGRP_CONNTRACK_EXP_UPDATE: CInt = 5

public val NFNLGRP_CONNTRACK_EXP_DESTROY: CInt = 6

public val NFNLGRP_NFTABLES: CInt = 7

public val NFNLGRP_ACCT_QUOTA: CInt = 8

public val NFNLGRP_NFTRACE: CInt = 9

public val NFNETLINK_V0: CInt = 0

public val NFNL_SUBSYS_NONE: CInt = 0

public val NFNL_SUBSYS_CTNETLINK: CInt = 1

public val NFNL_SUBSYS_CTNETLINK_EXP: CInt = 2

public val NFNL_SUBSYS_QUEUE: CInt = 3

public val NFNL_SUBSYS_ULOG: CInt = 4

public val NFNL_SUBSYS_OSF: CInt = 5

public val NFNL_SUBSYS_IPSET: CInt = 6

public val NFNL_SUBSYS_ACCT: CInt = 7

public val NFNL_SUBSYS_CTNETLINK_TIMEOUT: CInt = 8

public val NFNL_SUBSYS_CTHELPER: CInt = 9

public val NFNL_SUBSYS_NFTABLES: CInt = 10

public val NFNL_SUBSYS_NFT_COMPAT: CInt = 11

public val NFNL_SUBSYS_HOOK: CInt = 12

public val NFNL_SUBSYS_COUNT: CInt = 13

public val NFNL_MSG_BATCH_BEGIN: CInt = NLMSG_MIN_TYPE

public val NFNL_MSG_BATCH_END: CInt = NLMSG_MIN_TYPE + 1

public val NFNL_BATCH_UNSPEC: CInt = 0

public val NFNL_BATCH_GENID: CInt = 1

// linux/netfilter/nfnetlinkLog.h
public val NFULNL_MSG_PACKET: CInt = 0

public val NFULNL_MSG_CONFIG: CInt = 1

public val NFULA_VLAN_UNSPEC: CInt = 0

public val NFULA_VLAN_PROTO: CInt = 1

public val NFULA_VLAN_TCI: CInt = 2

public val NFULA_UNSPEC: CInt = 0

public val NFULA_PACKET_HDR: CInt = 1

public val NFULA_MARK: CInt = 2

public val NFULA_TIMESTAMP: CInt = 3

public val NFULA_IFINDEX_INDEV: CInt = 4

public val NFULA_IFINDEX_OUTDEV: CInt = 5

public val NFULA_IFINDEX_PHYSINDEV: CInt = 6

public val NFULA_IFINDEX_PHYSOUTDEV: CInt = 7

public val NFULA_HWADDR: CInt = 8

public val NFULA_PAYLOAD: CInt = 9

public val NFULA_PREFIX: CInt = 10

public val NFULA_UID: CInt = 11

public val NFULA_SEQ: CInt = 12

public val NFULA_SEQ_GLOBAL: CInt = 13

public val NFULA_GID: CInt = 14

public val NFULA_HWTYPE: CInt = 15

public val NFULA_HWHEADER: CInt = 16

public val NFULA_HWLEN: CInt = 17

public val NFULA_CT: CInt = 18

public val NFULA_CT_INFO: CInt = 19

public val NFULA_VLAN: CInt = 20

public val NFULA_L2HDR: CInt = 21

public val NFULNL_CFG_CMD_NONE: CInt = 0

public val NFULNL_CFG_CMD_BIND: CInt = 1

public val NFULNL_CFG_CMD_UNBIND: CInt = 2

public val NFULNL_CFG_CMD_PF_BIND: CInt = 3

public val NFULNL_CFG_CMD_PF_UNBIND: CInt = 4

public val NFULA_CFG_UNSPEC: CInt = 0

public val NFULA_CFG_CMD: CInt = 1

public val NFULA_CFG_MODE: CInt = 2

public val NFULA_CFG_NLBUFSIZ: CInt = 3

public val NFULA_CFG_TIMEOUT: CInt = 4

public val NFULA_CFG_QTHRESH: CInt = 5

public val NFULA_CFG_FLAGS: CInt = 6

public val NFULNL_COPY_NONE: CInt = 0x00

public val NFULNL_COPY_META: CInt = 0x01

public val NFULNL_COPY_PACKET: CInt = 0x02

public val NFULNL_CFG_F_SEQ: CInt = 0x0001

public val NFULNL_CFG_F_SEQ_GLOBAL: CInt = 0x0002

public val NFULNL_CFG_F_CONNTRACK: CInt = 0x0004

// linux/netfilter/nfnetlinkQueue.h
public val NFQNL_MSG_PACKET: CInt = 0

public val NFQNL_MSG_VERDICT: CInt = 1

public val NFQNL_MSG_CONFIG: CInt = 2

public val NFQNL_MSG_VERDICT_BATCH: CInt = 3

public val NFQA_UNSPEC: CInt = 0

public val NFQA_PACKET_HDR: CInt = 1

public val NFQA_VERDICT_HDR: CInt = 2

public val NFQA_MARK: CInt = 3

public val NFQA_TIMESTAMP: CInt = 4

public val NFQA_IFINDEX_INDEV: CInt = 5

public val NFQA_IFINDEX_OUTDEV: CInt = 6

public val NFQA_IFINDEX_PHYSINDEV: CInt = 7

public val NFQA_IFINDEX_PHYSOUTDEV: CInt = 8

public val NFQA_HWADDR: CInt = 9

public val NFQA_PAYLOAD: CInt = 10

public val NFQA_CT: CInt = 11

public val NFQA_CT_INFO: CInt = 12

public val NFQA_CAP_LEN: CInt = 13

public val NFQA_SKB_INFO: CInt = 14

public val NFQA_EXP: CInt = 15

public val NFQA_UID: CInt = 16

public val NFQA_GID: CInt = 17

public val NFQA_SECCTX: CInt = 18

public val NFQA_VLAN: CInt = 19

public val NFQA_L2HDR: CInt = 20

public val NFQA_PRIORITY: CInt = 21

public val NFQA_VLAN_UNSPEC: CInt = 0

public val NFQA_VLAN_PROTO: CInt = 1

public val NFQA_VLAN_TCI: CInt = 2

public val NFQNL_CFG_CMD_NONE: CInt = 0

public val NFQNL_CFG_CMD_BIND: CInt = 1

public val NFQNL_CFG_CMD_UNBIND: CInt = 2

public val NFQNL_CFG_CMD_PF_BIND: CInt = 3

public val NFQNL_CFG_CMD_PF_UNBIND: CInt = 4

public val NFQNL_COPY_NONE: CInt = 0

public val NFQNL_COPY_META: CInt = 1

public val NFQNL_COPY_PACKET: CInt = 2

public val NFQA_CFG_UNSPEC: CInt = 0

public val NFQA_CFG_CMD: CInt = 1

public val NFQA_CFG_PARAMS: CInt = 2

public val NFQA_CFG_QUEUE_MAXLEN: CInt = 3

public val NFQA_CFG_MASK: CInt = 4

public val NFQA_CFG_FLAGS: CInt = 5

public val NFQA_CFG_F_FAIL_OPEN: CInt = 0x0001

public val NFQA_CFG_F_CONNTRACK: CInt = 0x0002

public val NFQA_CFG_F_GSO: CInt = 0x0004

public val NFQA_CFG_F_UID_GID: CInt = 0x0008

public val NFQA_CFG_F_SECCTX: CInt = 0x0010

public val NFQA_CFG_F_MAX: CInt = 0x0020

public val NFQA_SKB_CSUMNOTREADY: CInt = 0x0001

public val NFQA_SKB_GSO: CInt = 0x0002

public val NFQA_SKB_CSUM_NOTVERIFIED: CInt = 0x0004

// linux/genetlink.h
public val GENL_NAMSIZ: CInt = 16

public val GENL_MIN_ID: CInt = NLMSG_MIN_TYPE

public val GENL_MAX_ID: CInt = 1023

public val GENL_ADMIN_PERM: CInt = 0x01

public val GENL_CMD_CAP_DO: CInt = 0x02

public val GENL_CMD_CAP_DUMP: CInt = 0x04

public val GENL_CMD_CAP_HASPOL: CInt = 0x08

public val GENL_ID_CTRL: CInt = NLMSG_MIN_TYPE

public val CTRL_CMD_UNSPEC: CInt = 0

public val CTRL_CMD_NEWFAMILY: CInt = 1

public val CTRL_CMD_DELFAMILY: CInt = 2

public val CTRL_CMD_GETFAMILY: CInt = 3

public val CTRL_CMD_NEWOPS: CInt = 4

public val CTRL_CMD_DELOPS: CInt = 5

public val CTRL_CMD_GETOPS: CInt = 6

public val CTRL_CMD_NEWMCAST_GRP: CInt = 7

public val CTRL_CMD_DELMCAST_GRP: CInt = 8

public val CTRL_CMD_GETMCAST_GRP: CInt = 9

public val CTRL_ATTR_UNSPEC: CInt = 0

public val CTRL_ATTR_FAMILY_ID: CInt = 1

public val CTRL_ATTR_FAMILY_NAME: CInt = 2

public val CTRL_ATTR_VERSION: CInt = 3

public val CTRL_ATTR_HDRSIZE: CInt = 4

public val CTRL_ATTR_MAXATTR: CInt = 5

public val CTRL_ATTR_OPS: CInt = 6

public val CTRL_ATTR_MCAST_GROUPS: CInt = 7

public val CTRL_ATTR_OP_UNSPEC: CInt = 0

public val CTRL_ATTR_OP_ID: CInt = 1

public val CTRL_ATTR_OP_FLAGS: CInt = 2

public val CTRL_ATTR_MCAST_GRP_UNSPEC: CInt = 0

public val CTRL_ATTR_MCAST_GRP_NAME: CInt = 1

public val CTRL_ATTR_MCAST_GRP_ID: CInt = 2

public val PACKET_FANOUT: CInt = 18

public val PACKET_TX_HAS_OFF: CInt = 19

public val PACKET_QDISC_BYPASS: CInt = 20

public val PACKET_ROLLOVER_STATS: CInt = 21

public val PACKET_FANOUT_DATA: CInt = 22

public val PACKET_IGNORE_OUTGOING: CInt = 23

public val PACKET_VNET_HDR_SZ: CInt = 24

public val PACKET_FANOUT_HASH: CUint = 0u

public val PACKET_FANOUT_LB: CUint = 1u

public val PACKET_FANOUT_CPU: CUint = 2u

public val PACKET_FANOUT_ROLLOVER: CUint = 3u

public val PACKET_FANOUT_RND: CUint = 4u

public val PACKET_FANOUT_QM: CUint = 5u

public val PACKET_FANOUT_CBPF: CUint = 6u

public val PACKET_FANOUT_EBPF: CUint = 7u

public val PACKET_FANOUT_FLAG_ROLLOVER: CUint = 0x1000u

public val PACKET_FANOUT_FLAG_UNIQUEID: CUint = 0x2000u

public val PACKET_FANOUT_FLAG_IGNORE_OUTGOING: CUint = 0x4000u

public val PACKET_FANOUT_FLAG_DEFRAG: CUint = 0x8000u

public val TP_STATUS_KERNEL: U32 = 0u

public val TP_STATUS_USER: U32 = 1u shl 0

public val TP_STATUS_COPY: U32 = 1u shl 1

public val TP_STATUS_LOSING: U32 = 1u shl 2

public val TP_STATUS_CSUMNOTREADY: U32 = 1u shl 3

public val TP_STATUS_VLAN_VALID: U32 = 1u shl 4

public val TP_STATUS_BLK_TMO: U32 = 1u shl 5

public val TP_STATUS_VLAN_TPID_VALID: U32 = 1u shl 6

public val TP_STATUS_CSUM_VALID: U32 = 1u shl 7

public val TP_STATUS_AVAILABLE: U32 = 0u

public val TP_STATUS_SEND_REQUEST: U32 = 1u shl 0

public val TP_STATUS_SENDING: U32 = 1u shl 1

public val TP_STATUS_WRONG_FORMAT: U32 = 1u shl 2

public val TP_STATUS_TS_SOFTWARE: U32 = 1u shl 29

public val TP_STATUS_TS_SYS_HARDWARE: U32 = 1u shl 30

public val TP_STATUS_TS_RAW_HARDWARE: U32 = 1u shl 31

public val TP_FT_REQ_FILL_RXHASH: U32 = 1u

public val TPACKET_ALIGNMENT: Int = 16

public val TPACKET_HDRLEN: Int = ((sizeOf<io.github.kotlinmania.libc.TpacketHdr>() + TPACKET_ALIGNMENT - 1) and (TPACKET_ALIGNMENT - 1).inv()) + sizeOf<SockaddrLl>()

public val TPACKET2_HDRLEN: Int = ((sizeOf<io.github.kotlinmania.libc.Tpacket2Hdr>() + TPACKET_ALIGNMENT - 1) and (TPACKET_ALIGNMENT - 1).inv()) + sizeOf<SockaddrLl>()

public val TPACKET3_HDRLEN: Int = ((sizeOf<io.github.kotlinmania.libc.Tpacket3Hdr>() + TPACKET_ALIGNMENT - 1) and (TPACKET_ALIGNMENT - 1).inv()) + sizeOf<SockaddrLl>()

// linux/netfilter.h
public val NF_DROP: CInt = 0

public val NF_ACCEPT: CInt = 1

public val NF_STOLEN: CInt = 2

public val NF_QUEUE: CInt = 3

public val NF_REPEAT: CInt = 4

public val NF_STOP: CInt = 5

public val NF_MAX_VERDICT: CInt = NF_STOP

public val NF_VERDICT_MASK: CInt = 0x000000ff

public val NF_VERDICT_FLAG_QUEUE_BYPASS: CInt = 0x00008000

public val NF_VERDICT_QMASK: CInt = 0xffff0000

public val NF_VERDICT_QBITS: CInt = 16

public val NF_VERDICT_BITS: CInt = 16

public val NF_INET_PRE_ROUTING: CInt = 0

public val NF_INET_LOCAL_IN: CInt = 1

public val NF_INET_FORWARD: CInt = 2

public val NF_INET_LOCAL_OUT: CInt = 3

public val NF_INET_POST_ROUTING: CInt = 4

public val NF_INET_NUMHOOKS: CInt = 5

public val NF_INET_INGRESS: CInt = NF_INET_NUMHOOKS

public val NF_NETDEV_INGRESS: CInt = 0

public val NF_NETDEV_EGRESS: CInt = 1

public val NF_NETDEV_NUMHOOKS: CInt = 2

// Some NFPROTO are not compatible with musl and are defined in submodules.
public val NFPROTO_UNSPEC: CInt = 0

public val NFPROTO_INET: CInt = 1

public val NFPROTO_IPV4: CInt = 2

public val NFPROTO_ARP: CInt = 3

public val NFPROTO_NETDEV: CInt = 5

public val NFPROTO_BRIDGE: CInt = 7

public val NFPROTO_IPV6: CInt = 10

public val NFPROTO_DECNET: CInt = 12

public val NFPROTO_NUMPROTO: CInt = 13

// linux/netfilterArp.h
public val NF_ARP: CInt = 0

public val NF_ARP_IN: CInt = 0

public val NF_ARP_OUT: CInt = 1

public val NF_ARP_FORWARD: CInt = 2

public val NF_ARP_NUMHOOKS: CInt = 3

// linux/netfilterBridge.h
public val NF_BR_PRE_ROUTING: CInt = 0

public val NF_BR_LOCAL_IN: CInt = 1

public val NF_BR_FORWARD: CInt = 2

public val NF_BR_LOCAL_OUT: CInt = 3

public val NF_BR_POST_ROUTING: CInt = 4

public val NF_BR_BROUTING: CInt = 5

public val NF_BR_NUMHOOKS: CInt = 6

public val NF_BR_PRI_FIRST: CInt = INT_MIN

public val NF_BR_PRI_NAT_DST_BRIDGED: CInt = -300

public val NF_BR_PRI_FILTER_BRIDGED: CInt = -200

public val NF_BR_PRI_BRNF: CInt = 0

public val NF_BR_PRI_NAT_DST_OTHER: CInt = 100

public val NF_BR_PRI_FILTER_OTHER: CInt = 200

public val NF_BR_PRI_NAT_SRC: CInt = 300

public val NF_BR_PRI_LAST: CInt = INT_MAX

// linux/netfilterIpv4.h
public val NF_IP_PRE_ROUTING: CInt = 0

public val NF_IP_LOCAL_IN: CInt = 1

public val NF_IP_FORWARD: CInt = 2

public val NF_IP_LOCAL_OUT: CInt = 3

public val NF_IP_POST_ROUTING: CInt = 4

public val NF_IP_NUMHOOKS: CInt = 5

public val NF_IP_PRI_FIRST: CInt = INT_MIN

public val NF_IP_PRI_RAW_BEFORE_DEFRAG: CInt = -450

public val NF_IP_PRI_CONNTRACK_DEFRAG: CInt = -400

public val NF_IP_PRI_RAW: CInt = -300

public val NF_IP_PRI_SELINUX_FIRST: CInt = -225

public val NF_IP_PRI_CONNTRACK: CInt = -200

public val NF_IP_PRI_MANGLE: CInt = -150

public val NF_IP_PRI_NAT_DST: CInt = -100

public val NF_IP_PRI_FILTER: CInt = 0

public val NF_IP_PRI_SECURITY: CInt = 50

public val NF_IP_PRI_NAT_SRC: CInt = 100

public val NF_IP_PRI_SELINUX_LAST: CInt = 225

public val NF_IP_PRI_CONNTRACK_HELPER: CInt = 300

public val NF_IP_PRI_CONNTRACK_CONFIRM: CInt = INT_MAX

public val NF_IP_PRI_LAST: CInt = INT_MAX

// linux/netfilterIpv6.h
public val NF_IP6_PRE_ROUTING: CInt = 0

public val NF_IP6_LOCAL_IN: CInt = 1

public val NF_IP6_FORWARD: CInt = 2

public val NF_IP6_LOCAL_OUT: CInt = 3

public val NF_IP6_POST_ROUTING: CInt = 4

public val NF_IP6_NUMHOOKS: CInt = 5

public val NF_IP6_PRI_FIRST: CInt = INT_MIN

public val NF_IP6_PRI_RAW_BEFORE_DEFRAG: CInt = -450

public val NF_IP6_PRI_CONNTRACK_DEFRAG: CInt = -400

public val NF_IP6_PRI_RAW: CInt = -300

public val NF_IP6_PRI_SELINUX_FIRST: CInt = -225

public val NF_IP6_PRI_CONNTRACK: CInt = -200

public val NF_IP6_PRI_MANGLE: CInt = -150

public val NF_IP6_PRI_NAT_DST: CInt = -100

public val NF_IP6_PRI_FILTER: CInt = 0

public val NF_IP6_PRI_SECURITY: CInt = 50

public val NF_IP6_PRI_NAT_SRC: CInt = 100

public val NF_IP6_PRI_SELINUX_LAST: CInt = 225

public val NF_IP6_PRI_CONNTRACK_HELPER: CInt = 300

public val NF_IP6_PRI_LAST: CInt = INT_MAX

// linux/netfilterIpv6/ip6Tables.h
public val IP6T_SO_ORIGINAL_DST: CInt = 80

public val SIOCSHWTSTAMP: CUlong = 0x000089b0uL

public val SIOCGHWTSTAMP: CUlong = 0x000089b1uL

// wireless.h
public val WIRELESS_EXT: CUlong = 0x16uL

public val SIOCSIWCOMMIT: CUlong = 0x8B00uL

public val SIOCGIWNAME: CUlong = 0x8B01uL

public val SIOCSIWNWID: CUlong = 0x8B02uL

public val SIOCGIWNWID: CUlong = 0x8B03uL

public val SIOCSIWFREQ: CUlong = 0x8B04uL

public val SIOCGIWFREQ: CUlong = 0x8B05uL

public val SIOCSIWMODE: CUlong = 0x8B06uL

public val SIOCGIWMODE: CUlong = 0x8B07uL

public val SIOCSIWSENS: CUlong = 0x8B08uL

public val SIOCGIWSENS: CUlong = 0x8B09uL

public val SIOCSIWRANGE: CUlong = 0x8B0AuL

public val SIOCGIWRANGE: CUlong = 0x8B0BuL

public val SIOCSIWPRIV: CUlong = 0x8B0CuL

public val SIOCGIWPRIV: CUlong = 0x8B0DuL

public val SIOCSIWSTATS: CUlong = 0x8B0EuL

public val SIOCGIWSTATS: CUlong = 0x8B0FuL

public val SIOCSIWSPY: CUlong = 0x8B10uL

public val SIOCGIWSPY: CUlong = 0x8B11uL

public val SIOCSIWTHRSPY: CUlong = 0x8B12uL

public val SIOCGIWTHRSPY: CUlong = 0x8B13uL

public val SIOCSIWAP: CUlong = 0x8B14uL

public val SIOCGIWAP: CUlong = 0x8B15uL

public val SIOCGIWAPLIST: CUlong = 0x8B17uL

public val SIOCSIWSCAN: CUlong = 0x8B18uL

public val SIOCGIWSCAN: CUlong = 0x8B19uL

public val SIOCSIWESSID: CUlong = 0x8B1AuL

public val SIOCGIWESSID: CUlong = 0x8B1BuL

public val SIOCSIWNICKN: CUlong = 0x8B1CuL

public val SIOCGIWNICKN: CUlong = 0x8B1DuL

public val SIOCSIWRATE: CUlong = 0x8B20uL

public val SIOCGIWRATE: CUlong = 0x8B21uL

public val SIOCSIWRTS: CUlong = 0x8B22uL

public val SIOCGIWRTS: CUlong = 0x8B23uL

public val SIOCSIWFRAG: CUlong = 0x8B24uL

public val SIOCGIWFRAG: CUlong = 0x8B25uL

public val SIOCSIWTXPOW: CUlong = 0x8B26uL

public val SIOCGIWTXPOW: CUlong = 0x8B27uL

public val SIOCSIWRETRY: CUlong = 0x8B28uL

public val SIOCGIWRETRY: CUlong = 0x8B29uL

public val SIOCSIWENCODE: CUlong = 0x8B2AuL

public val SIOCGIWENCODE: CUlong = 0x8B2BuL

public val SIOCSIWPOWER: CUlong = 0x8B2CuL

public val SIOCGIWPOWER: CUlong = 0x8B2DuL

public val SIOCSIWGENIE: CUlong = 0x8B30uL

public val SIOCGIWGENIE: CUlong = 0x8B31uL

public val SIOCSIWMLME: CUlong = 0x8B16uL

public val SIOCSIWAUTH: CUlong = 0x8B32uL

public val SIOCGIWAUTH: CUlong = 0x8B33uL

public val SIOCSIWENCODEEXT: CUlong = 0x8B34uL

public val SIOCGIWENCODEEXT: CUlong = 0x8B35uL

public val SIOCSIWPMKSA: CUlong = 0x8B36uL

public val SIOCIWFIRSTPRIV: CUlong = 0x8BE0uL

public val SIOCIWLASTPRIV: CUlong = 0x8BFFuL

public val SIOCIWFIRST: CUlong = 0x8B00uL

public val SIOCIWLAST: CUlong = SIOCIWLASTPRIV

public val IWEVTXDROP: CUlong = 0x8C00uL

public val IWEVQUAL: CUlong = 0x8C01uL

public val IWEVCUSTOM: CUlong = 0x8C02uL

public val IWEVREGISTERED: CUlong = 0x8C03uL

public val IWEVEXPIRED: CUlong = 0x8C04uL

public val IWEVGENIE: CUlong = 0x8C05uL

public val IWEVMICHAELMICFAILURE: CUlong = 0x8C06uL

public val IWEVASSOCREQIE: CUlong = 0x8C07uL

public val IWEVASSOCRESPIE: CUlong = 0x8C08uL

public val IWEVPMKIDCAND: CUlong = 0x8C09uL

public val IWEVFIRST: CUlong = 0x8C00uL

public val IW_PRIV_TYPE_MASK: CUlong = 0x7000uL

public val IW_PRIV_TYPE_NONE: CUlong = 0x0000uL

public val IW_PRIV_TYPE_BYTE: CUlong = 0x1000uL

public val IW_PRIV_TYPE_CHAR: CUlong = 0x2000uL

public val IW_PRIV_TYPE_INT: CUlong = 0x4000uL

public val IW_PRIV_TYPE_FLOAT: CUlong = 0x5000uL

public val IW_PRIV_TYPE_ADDR: CUlong = 0x6000uL

public val IW_PRIV_SIZE_FIXED: CUlong = 0x0800uL

public val IW_PRIV_SIZE_MASK: CUlong = 0x07FFuL

public val IW_MAX_FREQUENCIES: Int = 32

public val IW_MAX_BITRATES: Int = 32

public val IW_MAX_TXPOWER: Int = 8

public val IW_MAX_SPY: Int = 8

public val IW_MAX_AP: Int = 64

public val IW_ESSID_MAX_SIZE: Int = 32

public val IW_MODE_AUTO: Int = 0

public val IW_MODE_ADHOC: Int = 1

public val IW_MODE_INFRA: Int = 2

public val IW_MODE_MASTER: Int = 3

public val IW_MODE_REPEAT: Int = 4

public val IW_MODE_SECOND: Int = 5

public val IW_MODE_MONITOR: Int = 6

public val IW_MODE_MESH: Int = 7

public val IW_QUAL_QUAL_UPDATED: CUlong = 0x01uL

public val IW_QUAL_LEVEL_UPDATED: CUlong = 0x02uL

public val IW_QUAL_NOISE_UPDATED: CUlong = 0x04uL

public val IW_QUAL_ALL_UPDATED: CUlong = 0x07uL

public val IW_QUAL_DBM: CUlong = 0x08uL

public val IW_QUAL_QUAL_INVALID: CUlong = 0x10uL

public val IW_QUAL_LEVEL_INVALID: CUlong = 0x20uL

public val IW_QUAL_NOISE_INVALID: CUlong = 0x40uL

public val IW_QUAL_RCPI: CUlong = 0x80uL

public val IW_QUAL_ALL_INVALID: CUlong = 0x70uL

public val IW_FREQ_AUTO: CUlong = 0x00uL

public val IW_FREQ_FIXED: CUlong = 0x01uL

public val IW_MAX_ENCODING_SIZES: Int = 8

public val IW_ENCODING_TOKEN_MAX: Int = 64

public val IW_ENCODE_INDEX: CUlong = 0x00FFuL

public val IW_ENCODE_FLAGS: CUlong = 0xFF00uL

public val IW_ENCODE_MODE: CUlong = 0xF000uL

public val IW_ENCODE_DISABLED: CUlong = 0x8000uL

public val IW_ENCODE_ENABLED: CUlong = 0x0000uL

public val IW_ENCODE_RESTRICTED: CUlong = 0x4000uL

public val IW_ENCODE_OPEN: CUlong = 0x2000uL

public val IW_ENCODE_NOKEY: CUlong = 0x0800uL

public val IW_ENCODE_TEMP: CUlong = 0x0400uL

public val IW_POWER_ON: CUlong = 0x0000uL

public val IW_POWER_TYPE: CUlong = 0xF000uL

public val IW_POWER_PERIOD: CUlong = 0x1000uL

public val IW_POWER_TIMEOUT: CUlong = 0x2000uL

public val IW_POWER_MODE: CUlong = 0x0F00uL

public val IW_POWER_UNICAST_R: CUlong = 0x0100uL

public val IW_POWER_MULTICAST_R: CUlong = 0x0200uL

public val IW_POWER_ALL_R: CUlong = 0x0300uL

public val IW_POWER_FORCE_S: CUlong = 0x0400uL

public val IW_POWER_REPEATER: CUlong = 0x0800uL

public val IW_POWER_MODIFIER: CUlong = 0x000FuL

public val IW_POWER_MIN: CUlong = 0x0001uL

public val IW_POWER_MAX: CUlong = 0x0002uL

public val IW_POWER_RELATIVE: CUlong = 0x0004uL

public val IW_TXPOW_TYPE: CUlong = 0x00FFuL

public val IW_TXPOW_DBM: CUlong = 0x0000uL

public val IW_TXPOW_MWATT: CUlong = 0x0001uL

public val IW_TXPOW_RELATIVE: CUlong = 0x0002uL

public val IW_TXPOW_RANGE: CUlong = 0x1000uL

public val IW_RETRY_ON: CUlong = 0x0000uL

public val IW_RETRY_TYPE: CUlong = 0xF000uL

public val IW_RETRY_LIMIT: CUlong = 0x1000uL

public val IW_RETRY_LIFETIME: CUlong = 0x2000uL

public val IW_RETRY_MODIFIER: CUlong = 0x00FFuL

public val IW_RETRY_MIN: CUlong = 0x0001uL

public val IW_RETRY_MAX: CUlong = 0x0002uL

public val IW_RETRY_RELATIVE: CUlong = 0x0004uL

public val IW_RETRY_SHORT: CUlong = 0x0010uL

public val IW_RETRY_LONG: CUlong = 0x0020uL

public val IW_SCAN_DEFAULT: CUlong = 0x0000uL

public val IW_SCAN_ALL_ESSID: CUlong = 0x0001uL

public val IW_SCAN_THIS_ESSID: CUlong = 0x0002uL

public val IW_SCAN_ALL_FREQ: CUlong = 0x0004uL

public val IW_SCAN_THIS_FREQ: CUlong = 0x0008uL

public val IW_SCAN_ALL_MODE: CUlong = 0x0010uL

public val IW_SCAN_THIS_MODE: CUlong = 0x0020uL

public val IW_SCAN_ALL_RATE: CUlong = 0x0040uL

public val IW_SCAN_THIS_RATE: CUlong = 0x0080uL

public val IW_SCAN_TYPE_ACTIVE: Int = 0

public val IW_SCAN_TYPE_PASSIVE: Int = 1

public val IW_SCAN_MAX_DATA: Int = 4096

public val IW_SCAN_CAPA_NONE: CUlong = 0x00uL

public val IW_SCAN_CAPA_ESSID: CUlong = 0x01uL

public val IW_SCAN_CAPA_BSSID: CUlong = 0x02uL

public val IW_SCAN_CAPA_CHANNEL: CUlong = 0x04uL

public val IW_SCAN_CAPA_MODE: CUlong = 0x08uL

public val IW_SCAN_CAPA_RATE: CUlong = 0x10uL

public val IW_SCAN_CAPA_TYPE: CUlong = 0x20uL

public val IW_SCAN_CAPA_TIME: CUlong = 0x40uL

public val IW_CUSTOM_MAX: CUlong = 256uL

public val IW_GENERIC_IE_MAX: CUlong = 1024uL

public val IW_MLME_DEAUTH: CUlong = 0uL

public val IW_MLME_DISASSOC: CUlong = 1uL

public val IW_MLME_AUTH: CUlong = 2uL

public val IW_MLME_ASSOC: CUlong = 3uL

public val IW_AUTH_INDEX: CUlong = 0x0FFFuL

public val IW_AUTH_FLAGS: CUlong = 0xF000uL

public val IW_AUTH_WPA_VERSION: Int = 0

public val IW_AUTH_CIPHER_PAIRWISE: Int = 1

public val IW_AUTH_CIPHER_GROUP: Int = 2

public val IW_AUTH_KEY_MGMT: Int = 3

public val IW_AUTH_TKIP_COUNTERMEASURES: Int = 4

public val IW_AUTH_DROP_UNENCRYPTED: Int = 5

public val IW_AUTH_80211_AUTH_ALG: Int = 6

public val IW_AUTH_WPA_ENABLED: Int = 7

public val IW_AUTH_RX_UNENCRYPTED_EAPOL: Int = 8

public val IW_AUTH_ROAMING_CONTROL: Int = 9

public val IW_AUTH_PRIVACY_INVOKED: Int = 10

public val IW_AUTH_CIPHER_GROUP_MGMT: Int = 11

public val IW_AUTH_MFP: Int = 12

public val IW_AUTH_WPA_VERSION_DISABLED: CUlong = 0x00000001uL

public val IW_AUTH_WPA_VERSION_WPA: CUlong = 0x00000002uL

public val IW_AUTH_WPA_VERSION_WPA2: CUlong = 0x00000004uL

public val IW_AUTH_CIPHER_NONE: CUlong = 0x00000001uL

public val IW_AUTH_CIPHER_WEP40: CUlong = 0x00000002uL

public val IW_AUTH_CIPHER_TKIP: CUlong = 0x00000004uL

public val IW_AUTH_CIPHER_CCMP: CUlong = 0x00000008uL

public val IW_AUTH_CIPHER_WEP104: CUlong = 0x00000010uL

public val IW_AUTH_CIPHER_AES_CMAC: CUlong = 0x00000020uL

public val IW_AUTH_KEY_MGMT_802_1X: Int = 1

public val IW_AUTH_KEY_MGMT_PSK: Int = 2

public val IW_AUTH_ALG_OPEN_SYSTEM: CUlong = 0x00000001uL

public val IW_AUTH_ALG_SHARED_KEY: CUlong = 0x00000002uL

public val IW_AUTH_ALG_LEAP: CUlong = 0x00000004uL

public val IW_AUTH_ROAMING_ENABLE: Int = 0

public val IW_AUTH_ROAMING_DISABLE: Int = 1

public val IW_AUTH_MFP_DISABLED: Int = 0

public val IW_AUTH_MFP_OPTIONAL: Int = 1

public val IW_AUTH_MFP_REQUIRED: Int = 2

public val IW_ENCODE_SEQ_MAX_SIZE: Int = 8

public val IW_ENCODE_ALG_NONE: Int = 0

public val IW_ENCODE_ALG_WEP: Int = 1

public val IW_ENCODE_ALG_TKIP: Int = 2

public val IW_ENCODE_ALG_CCMP: Int = 3

public val IW_ENCODE_ALG_PMK: Int = 4

public val IW_ENCODE_ALG_AES_CMAC: Int = 5

public val IW_ENCODE_EXT_TX_SEQ_VALID: CUlong = 0x00000001uL

public val IW_ENCODE_EXT_RX_SEQ_VALID: CUlong = 0x00000002uL

public val IW_ENCODE_EXT_GROUP_KEY: CUlong = 0x00000004uL

public val IW_ENCODE_EXT_SET_TX_KEY: CUlong = 0x00000008uL

public val IW_MICFAILURE_KEY_ID: CUlong = 0x00000003uL

public val IW_MICFAILURE_GROUP: CUlong = 0x00000004uL

public val IW_MICFAILURE_PAIRWISE: CUlong = 0x00000008uL

public val IW_MICFAILURE_STAKEY: CUlong = 0x00000010uL

public val IW_MICFAILURE_COUNT: CUlong = 0x00000060uL

public val IW_ENC_CAPA_WPA: CUlong = 0x00000001uL

public val IW_ENC_CAPA_WPA2: CUlong = 0x00000002uL

public val IW_ENC_CAPA_CIPHER_TKIP: CUlong = 0x00000004uL

public val IW_ENC_CAPA_CIPHER_CCMP: CUlong = 0x00000008uL

public val IW_ENC_CAPA_4WAY_HANDSHAKE: CUlong = 0x00000010uL

public val IW_EVENT_CAPA_K_0: CUlong = 0x4000050uL

// IW_EVENT_CAPA_MASK(0x8B04) | IW_EVENT_CAPA_MASK(0x8B06) | IW_EVENT_CAPA_MASK(0x8B1A);
public val IW_EVENT_CAPA_K_1: CUlong = 0x400uL

// W_EVENT_CAPA_MASK(0x8B2A);
public val IW_PMKSA_ADD: Int = 1

public val IW_PMKSA_REMOVE: Int = 2

public val IW_PMKSA_FLUSH: Int = 3

public val IW_PMKID_LEN: Int = 16

public val IW_PMKID_CAND_PREAUTH: CUlong = 0x00000001uL

public val IW_EV_LCP_PK_LEN: Int = 4

public val IW_EV_CHAR_PK_LEN: Int = 20

// IW_EV_LCP_PK_LEN + crate::IFNAMSIZ;
public val IW_EV_UINT_PK_LEN: Int = 8

// IW_EV_LCP_PK_LEN + sizeOf::<u32>();
public val IW_EV_FREQ_PK_LEN: Int = 12

// IW_EV_LCP_PK_LEN + sizeOf::<iwFreq>();
public val IW_EV_PARAM_PK_LEN: Int = 12

// IW_EV_LCP_PK_LEN + sizeOf::<iwParam>();
public val IW_EV_ADDR_PK_LEN: Int = 20

// IW_EV_LCP_PK_LEN + sizeOf::<crate::sockaddr>();
public val IW_EV_QUAL_PK_LEN: Int = 8

// IW_EV_LCP_PK_LEN + sizeOf::<iwQuality>();
public val IW_EV_POINT_PK_LEN: Int = 8

// IW_EV_LCP_PK_LEN + 4;
// linux/neighbor.h
public val NUD_NONE: UShort = 0x00u

public val NUD_INCOMPLETE: UShort = 0x01u

public val NUD_REACHABLE: UShort = 0x02u

public val NUD_STALE: UShort = 0x04u

public val NUD_DELAY: UShort = 0x08u

public val NUD_PROBE: UShort = 0x10u

public val NUD_FAILED: UShort = 0x20u

public val NUD_NOARP: UShort = 0x40u

public val NUD_PERMANENT: UShort = 0x80u

public val NTF_USE: UByte = 0x01u

public val NTF_SELF: UByte = 0x02u

public val NTF_MASTER: UByte = 0x04u

public val NTF_PROXY: UByte = 0x08u

public val NTF_ROUTER: UByte = 0x80u

public val NDA_UNSPEC: CUshort = 0u

public val NDA_DST: CUshort = 1u

public val NDA_LLADDR: CUshort = 2u

public val NDA_CACHEINFO: CUshort = 3u

public val NDA_PROBES: CUshort = 4u

public val NDA_VLAN: CUshort = 5u

public val NDA_PORT: CUshort = 6u

public val NDA_VNI: CUshort = 7u

public val NDA_IFINDEX: CUshort = 8u

// linux/netlink.h
public val NLM_F_BULK: CInt = 0x200

// linux/rtnetlink.h
public val TCA_UNSPEC: CUshort = 0u

public val TCA_KIND: CUshort = 1u

public val TCA_OPTIONS: CUshort = 2u

public val TCA_STATS: CUshort = 3u

public val TCA_XSTATS: CUshort = 4u

public val TCA_RATE: CUshort = 5u

public val TCA_FCNT: CUshort = 6u

public val TCA_STATS2: CUshort = 7u

public val TCA_STAB: CUshort = 8u

public val RTM_NEWLINK: UShort = 16u

public val RTM_DELLINK: UShort = 17u

public val RTM_GETLINK: UShort = 18u

public val RTM_SETLINK: UShort = 19u

public val RTM_NEWADDR: UShort = 20u

public val RTM_DELADDR: UShort = 21u

public val RTM_GETADDR: UShort = 22u

public val RTM_NEWROUTE: UShort = 24u

public val RTM_DELROUTE: UShort = 25u

public val RTM_GETROUTE: UShort = 26u

public val RTM_NEWNEIGH: UShort = 28u

public val RTM_DELNEIGH: UShort = 29u

public val RTM_GETNEIGH: UShort = 30u

public val RTM_NEWRULE: UShort = 32u

public val RTM_DELRULE: UShort = 33u

public val RTM_GETRULE: UShort = 34u

public val RTM_NEWQDISC: UShort = 36u

public val RTM_DELQDISC: UShort = 37u

public val RTM_GETQDISC: UShort = 38u

public val RTM_NEWTCLASS: UShort = 40u

public val RTM_DELTCLASS: UShort = 41u

public val RTM_GETTCLASS: UShort = 42u

public val RTM_NEWTFILTER: UShort = 44u

public val RTM_DELTFILTER: UShort = 45u

public val RTM_GETTFILTER: UShort = 46u

public val RTM_NEWACTION: UShort = 48u

public val RTM_DELACTION: UShort = 49u

public val RTM_GETACTION: UShort = 50u

public val RTM_NEWPREFIX: UShort = 52u

public val RTM_GETMULTICAST: UShort = 58u

public val RTM_GETANYCAST: UShort = 62u

public val RTM_NEWNEIGHTBL: UShort = 64u

public val RTM_GETNEIGHTBL: UShort = 66u

public val RTM_SETNEIGHTBL: UShort = 67u

public val RTM_NEWNDUSEROPT: UShort = 68u

public val RTM_NEWADDRLABEL: UShort = 72u

public val RTM_DELADDRLABEL: UShort = 73u

public val RTM_GETADDRLABEL: UShort = 74u

public val RTM_GETDCB: UShort = 78u

public val RTM_SETDCB: UShort = 79u

public val RTM_NEWNETCONF: UShort = 80u

public val RTM_GETNETCONF: UShort = 82u

public val RTM_NEWMDB: UShort = 84u

public val RTM_DELMDB: UShort = 85u

public val RTM_GETMDB: UShort = 86u

public val RTM_NEWNSID: UShort = 88u

public val RTM_DELNSID: UShort = 89u

public val RTM_GETNSID: UShort = 90u

public val RTM_F_NOTIFY: CUint = 0x100u

public val RTM_F_CLONED: CUint = 0x200u

public val RTM_F_EQUALIZE: CUint = 0x400u

public val RTM_F_PREFIX: CUint = 0x800u

public val RTA_UNSPEC: CUshort = 0u

public val RTA_DST: CUshort = 1u

public val RTA_SRC: CUshort = 2u

public val RTA_IIF: CUshort = 3u

public val RTA_OIF: CUshort = 4u

public val RTA_GATEWAY: CUshort = 5u

public val RTA_PRIORITY: CUshort = 6u

public val RTA_PREFSRC: CUshort = 7u

public val RTA_METRICS: CUshort = 8u

public val RTA_MULTIPATH: CUshort = 9u

public val RTA_PROTOINFO: CUshort = 10u

// No longer used
public val RTA_FLOW: CUshort = 11u

public val RTA_CACHEINFO: CUshort = 12u

public val RTA_SESSION: CUshort = 13u

// No longer used
public val RTA_MP_ALGO: CUshort = 14u

// No longer used
public val RTA_TABLE: CUshort = 15u

public val RTA_MARK: CUshort = 16u

public val RTA_MFC_STATS: CUshort = 17u

public val RTN_UNSPEC: CUchar = 0u

public val RTN_UNICAST: CUchar = 1u

public val RTN_LOCAL: CUchar = 2u

public val RTN_BROADCAST: CUchar = 3u

public val RTN_ANYCAST: CUchar = 4u

public val RTN_MULTICAST: CUchar = 5u

public val RTN_BLACKHOLE: CUchar = 6u

public val RTN_UNREACHABLE: CUchar = 7u

public val RTN_PROHIBIT: CUchar = 8u

public val RTN_THROW: CUchar = 9u

public val RTN_NAT: CUchar = 10u

public val RTN_XRESOLVE: CUchar = 11u

public val RTPROT_UNSPEC: CUchar = 0u

public val RTPROT_REDIRECT: CUchar = 1u

public val RTPROT_KERNEL: CUchar = 2u

public val RTPROT_BOOT: CUchar = 3u

public val RTPROT_STATIC: CUchar = 4u

public val RT_SCOPE_UNIVERSE: CUchar = 0u

public val RT_SCOPE_SITE: CUchar = 200u

public val RT_SCOPE_LINK: CUchar = 253u

public val RT_SCOPE_HOST: CUchar = 254u

public val RT_SCOPE_NOWHERE: CUchar = 255u

public val RT_TABLE_UNSPEC: CUchar = 0u

public val RT_TABLE_COMPAT: CUchar = 252u

public val RT_TABLE_DEFAULT: CUchar = 253u

public val RT_TABLE_MAIN: CUchar = 254u

public val RT_TABLE_LOCAL: CUchar = 255u

public val RTMSG_OVERRUN: UInt = NLMSG_OVERRUN.toUInt()

public val RTMSG_NEWDEVICE: UInt = 0x11u

public val RTMSG_DELDEVICE: UInt = 0x12u

public val RTMSG_NEWROUTE: UInt = 0x21u

public val RTMSG_DELROUTE: UInt = 0x22u

public val RTMSG_NEWRULE: UInt = 0x31u

public val RTMSG_DELRULE: UInt = 0x32u

public val RTMSG_CONTROL: UInt = 0x40u

public val RTMSG_AR_FAILED: UInt = 0x51u

public val RTEXT_FILTER_VF: CInt = 1 shl 0

public val RTEXT_FILTER_BRVLAN: CInt = 1 shl 1

public val RTEXT_FILTER_BRVLAN_COMPRESSED: CInt = 1 shl 2

public val RTEXT_FILTER_SKIP_STATS: CInt = 1 shl 3

public val RTEXT_FILTER_MRP: CInt = 1 shl 4

public val RTEXT_FILTER_CFM_CONFIG: CInt = 1 shl 5

public val RTEXT_FILTER_CFM_STATUS: CInt = 1 shl 6

// userspace compat definitions for RTNLGRP_*
public val RTMGRP_LINK: CInt = 0x00001

public val RTMGRP_NOTIFY: CInt = 0x00002

public val RTMGRP_NEIGH: CInt = 0x00004

public val RTMGRP_TC: CInt = 0x00008

public val RTMGRP_IPV4_IFADDR: CInt = 0x00010

public val RTMGRP_IPV4_MROUTE: CInt = 0x00020

public val RTMGRP_IPV4_ROUTE: CInt = 0x00040

public val RTMGRP_IPV4_RULE: CInt = 0x00080

public val RTMGRP_IPV6_IFADDR: CInt = 0x00100

public val RTMGRP_IPV6_MROUTE: CInt = 0x00200

public val RTMGRP_IPV6_ROUTE: CInt = 0x00400

public val RTMGRP_IPV6_IFINFO: CInt = 0x00800

public val RTMGRP_DE_CNET_IFADDR: CInt = 0x01000

public val RTMGRP_DE_CNET_ROUTE: CInt = 0x04000

public val RTMGRP_IPV6_PREFIX: CInt = 0x20000

// enum rtnetlinkGroups
public val RTNLGRP_NONE: CUint = 0x00u

public val RTNLGRP_LINK: CUint = 0x01u

public val RTNLGRP_NOTIFY: CUint = 0x02u

public val RTNLGRP_NEIGH: CUint = 0x03u

public val RTNLGRP_TC: CUint = 0x04u

public val RTNLGRP_IPV4_IFADDR: CUint = 0x05u

public val RTNLGRP_IPV4_MROUTE: CUint = 0x06u

public val RTNLGRP_IPV4_ROUTE: CUint = 0x07u

public val RTNLGRP_IPV4_RULE: CUint = 0x08u

public val RTNLGRP_IPV6_IFADDR: CUint = 0x09u

public val RTNLGRP_IPV6_MROUTE: CUint = 0x0au

public val RTNLGRP_IPV6_ROUTE: CUint = 0x0bu

public val RTNLGRP_IPV6_IFINFO: CUint = 0x0cu

public val RTNLGRP_DE_CNET_IFADDR: CUint = 0x0du

public val RTNLGRP_NOP2: CUint = 0x0eu

public val RTNLGRP_DE_CNET_ROUTE: CUint = 0x0fu

public val RTNLGRP_DE_CNET_RULE: CUint = 0x10u

public val RTNLGRP_NOP4: CUint = 0x11u

public val RTNLGRP_IPV6_PREFIX: CUint = 0x12u

public val RTNLGRP_IPV6_RULE: CUint = 0x13u

public val RTNLGRP_ND_USEROPT: CUint = 0x14u

public val RTNLGRP_PHONET_IFADDR: CUint = 0x15u

public val RTNLGRP_PHONET_ROUTE: CUint = 0x16u

public val RTNLGRP_DCB: CUint = 0x17u

public val RTNLGRP_IPV4_NETCONF: CUint = 0x18u

public val RTNLGRP_IPV6_NETCONF: CUint = 0x19u

public val RTNLGRP_MDB: CUint = 0x1au

public val RTNLGRP_MPLS_ROUTE: CUint = 0x1bu

public val RTNLGRP_NSID: CUint = 0x1cu

public val RTNLGRP_MPLS_NETCONF: CUint = 0x1du

public val RTNLGRP_IPV4_MROUTE_R: CUint = 0x1eu

public val RTNLGRP_IPV6_MROUTE_R: CUint = 0x1fu

public val RTNLGRP_NEXTHOP: CUint = 0x20u

public val RTNLGRP_BRVLAN: CUint = 0x21u

public val RTNLGRP_MCTP_IFADDR: CUint = 0x22u

public val RTNLGRP_TUNNEL: CUint = 0x23u

public val RTNLGRP_STATS: CUint = 0x24u

public typealias ProcCnMcastOp = CEnumRepr

public val PROC_CN_MCAST_LISTEN: ProcCnMcastOp = 1

public val PROC_CN_MCAST_IGNORE: ProcCnMcastOp = 2

public typealias ProcCnEvent = CEnumRepr

public val PROC_EVENT_NONE: ProcCnEvent = 0x00000000

public val PROC_EVENT_FORK: ProcCnEvent = 0x00000001

public val PROC_EVENT_EXEC: ProcCnEvent = 0x00000002

public val PROC_EVENT_UID: ProcCnEvent = 0x00000004

public val PROC_EVENT_GID: ProcCnEvent = 0x00000040

public val PROC_EVENT_SID: ProcCnEvent = 0x00000080

public val PROC_EVENT_PTRACE: ProcCnEvent = 0x00000100

public val PROC_EVENT_COMM: ProcCnEvent = 0x00000200

public val PROC_EVENT_NONZERO_EXIT: ProcCnEvent = 0x20000000

public val PROC_EVENT_COREDUMP: ProcCnEvent = 0x40000000

public val PROC_EVENT_EXIT: ProcCnEvent = 0x80000000

// linux/connector.h
public val CN_IDX_PROC: CUint = 0x1u

public val CN_VAL_PROC: CUint = 0x1u

public val CN_IDX_CIFS: CUint = 0x2u

public val CN_VAL_CIFS: CUint = 0x1u

public val CN_W1_IDX: CUint = 0x3u

public val CN_W1_VAL: CUint = 0x1u

public val CN_IDX_V86D: CUint = 0x4u

public val CN_VAL_V86D_UVESAFB: CUint = 0x1u

public val CN_IDX_BB: CUint = 0x5u

public val CN_DST_IDX: CUint = 0x6u

public val CN_DST_VAL: CUint = 0x1u

public val CN_IDX_DM: CUint = 0x7u

public val CN_VAL_DM_USERSPACE_LOG: CUint = 0x1u

public val CN_IDX_DRBD: CUint = 0x8u

public val CN_VAL_DRBD: CUint = 0x1u

public val CN_KVP_IDX: CUint = 0x9u

public val CN_KVP_VAL: CUint = 0x1u

public val CN_VSS_IDX: CUint = 0xAu

public val CN_VSS_VAL: CUint = 0x1u

// linux/module.h
public val MODULE_INIT_IGNORE_MODVERSIONS: CUint = 0x0001u

public val MODULE_INIT_IGNORE_VERMAGIC: CUint = 0x0002u

// linux/netTstamp.h
public val SOF_TIMESTAMPING_TX_HARDWARE: CUint = 1u shl 0

public val SOF_TIMESTAMPING_TX_SOFTWARE: CUint = 1u shl 1

public val SOF_TIMESTAMPING_RX_HARDWARE: CUint = 1u shl 2

public val SOF_TIMESTAMPING_RX_SOFTWARE: CUint = 1u shl 3

public val SOF_TIMESTAMPING_SOFTWARE: CUint = 1u shl 4

public val SOF_TIMESTAMPING_SYS_HARDWARE: CUint = 1u shl 5

public val SOF_TIMESTAMPING_RAW_HARDWARE: CUint = 1u shl 6

public val SOF_TIMESTAMPING_OPT_ID: CUint = 1u shl 7

public val SOF_TIMESTAMPING_TX_SCHED: CUint = 1u shl 8

public val SOF_TIMESTAMPING_TX_ACK: CUint = 1u shl 9

public val SOF_TIMESTAMPING_OPT_CMSG: CUint = 1u shl 10

public val SOF_TIMESTAMPING_OPT_TSONLY: CUint = 1u shl 11

public val SOF_TIMESTAMPING_OPT_STATS: CUint = 1u shl 12

public val SOF_TIMESTAMPING_OPT_PKTINFO: CUint = 1u shl 13

public val SOF_TIMESTAMPING_OPT_TX_SWHW: CUint = 1u shl 14

public val SOF_TIMESTAMPING_BIND_PHC: CUint = 1u shl 15

public val SOF_TIMESTAMPING_OPT_ID_TCP: CUint = 1u shl 16

public val SOF_TIMESTAMPING_OPT_RX_FILTER: CUint = 1u shl 17

public val SOF_TXTIME_DEADLINE_MODE: UInt = 1u shl 0

public val SOF_TXTIME_REPORT_ERRORS: UInt = 1u shl 1

public val HWTSTAMP_TX_OFF: CUint = 0u

public val HWTSTAMP_TX_ON: CUint = 1u

public val HWTSTAMP_TX_ONESTEP_SYNC: CUint = 2u

public val HWTSTAMP_TX_ONESTEP_P2P: CUint = 3u

public val HWTSTAMP_FILTER_NONE: CUint = 0u

public val HWTSTAMP_FILTER_ALL: CUint = 1u

public val HWTSTAMP_FILTER_SOME: CUint = 2u

public val HWTSTAMP_FILTER_PTP_V1_L4_EVENT: CUint = 3u

public val HWTSTAMP_FILTER_PTP_V1_L4_SYNC: CUint = 4u

public val HWTSTAMP_FILTER_PTP_V1_L4_DELAY_REQ: CUint = 5u

public val HWTSTAMP_FILTER_PTP_V2_L4_EVENT: CUint = 6u

public val HWTSTAMP_FILTER_PTP_V2_L4_SYNC: CUint = 7u

public val HWTSTAMP_FILTER_PTP_V2_L4_DELAY_REQ: CUint = 8u

public val HWTSTAMP_FILTER_PTP_V2_L2_EVENT: CUint = 9u

public val HWTSTAMP_FILTER_PTP_V2_L2_SYNC: CUint = 10u

public val HWTSTAMP_FILTER_PTP_V2_L2_DELAY_REQ: CUint = 11u

public val HWTSTAMP_FILTER_PTP_V2_EVENT: CUint = 12u

public val HWTSTAMP_FILTER_PTP_V2_SYNC: CUint = 13u

public val HWTSTAMP_FILTER_PTP_V2_DELAY_REQ: CUint = 14u

public val HWTSTAMP_FILTER_NTP_ALL: CUint = 15u

// linux/ptpClock.h
public val PTP_MAX_SAMPLES: CUint = 25u

// Maximum allowed offset measurement samples.
public val PTP_CLK_MAGIC: UInt = 61u.toUInt()

public val PTP_CLOCK_GETCAPS: Ioctl = IOR<PtpClockCaps>(PTP_CLK_MAGIC, 1)

public val PTP_EXTTS_REQUEST: Ioctl = IOW<PtpExttsRequest>(PTP_CLK_MAGIC, 2)

public val PTP_PEROUT_REQUEST: Ioctl = IOW<PtpPeroutRequest>(PTP_CLK_MAGIC, 3)

public val PTP_ENABLE_PPS: Ioctl = IOW<CInt>(PTP_CLK_MAGIC, 4)

public val PTP_SYS_OFFSET: Ioctl = IOW<PtpSysOffset>(PTP_CLK_MAGIC, 5)

public val PTP_PIN_GETFUNC: Ioctl = IOWR<PtpPinDesc>(PTP_CLK_MAGIC, 6)

public val PTP_PIN_SETFUNC: Ioctl = IOW<PtpPinDesc>(PTP_CLK_MAGIC, 7)

public val PTP_SYS_OFFSET_PRECISE: Ioctl = IOWR<PtpSysOffsetPrecise>(PTP_CLK_MAGIC, 8)

public val PTP_SYS_OFFSET_EXTENDED: Ioctl = IOWR<PtpSysOffsetExtended>(PTP_CLK_MAGIC, 9)

public val PTP_CLOCK_GETCAPS2: Ioctl = IOR<PtpClockCaps>(PTP_CLK_MAGIC, 10)

public val PTP_EXTTS_REQUEST2: Ioctl = IOW<PtpExttsRequest>(PTP_CLK_MAGIC, 11)

public val PTP_PEROUT_REQUEST2: Ioctl = IOW<PtpPeroutRequest>(PTP_CLK_MAGIC, 12)

public val PTP_ENABLE_PPS2: Ioctl = IOW<CInt>(PTP_CLK_MAGIC, 13)

public val PTP_SYS_OFFSET2: Ioctl = IOW<PtpSysOffset>(PTP_CLK_MAGIC, 14)

public val PTP_PIN_GETFUNC2: Ioctl = IOWR<PtpPinDesc>(PTP_CLK_MAGIC, 15)

public val PTP_PIN_SETFUNC2: Ioctl = IOW<PtpPinDesc>(PTP_CLK_MAGIC, 16)

public val PTP_SYS_OFFSET_PRECISE2: Ioctl = IOWR<PtpSysOffsetPrecise>(PTP_CLK_MAGIC, 17)

public val PTP_SYS_OFFSET_EXTENDED2: Ioctl = IOWR<PtpSysOffsetExtended>(PTP_CLK_MAGIC, 18)

// enum ptpPinFunction
public val PTP_PF_NONE: CUint = 0u

public val PTP_PF_EXTTS: CUint = 1u

public val PTP_PF_PEROUT: CUint = 2u

public val PTP_PF_PHYSYNC: CUint = 3u

// linux/tls.h
public val TLS_TX: CInt = 1

public val TLS_RX: CInt = 2

public val TLS_TX_ZEROCOPY_RO: CInt = 3

public val TLS_RX_EXPECT_NO_PAD: CInt = 4

public val TLS_1_2_VERSION_MAJOR: U8 = 0x3u

public val TLS_1_2_VERSION_MINOR: U8 = 0x3u

public val TLS_1_2_VERSION: U16 = (((TLS_1_2_VERSION_MAJOR.toUShort()) shl 8) or (TLS_1_2_VERSION_MINOR.toUShort())).toUShort()

public val TLS_1_3_VERSION_MAJOR: U8 = 0x3u

public val TLS_1_3_VERSION_MINOR: U8 = 0x4u

public val TLS_1_3_VERSION: U16 = (((TLS_1_3_VERSION_MAJOR.toUShort()) shl 8) or (TLS_1_3_VERSION_MINOR.toUShort())).toUShort()

public val TLS_CIPHER_AES_GCM_128: U16 = 51u

public val TLS_CIPHER_AES_GCM_128_IV_SIZE: Int = 8

public val TLS_CIPHER_AES_GCM_128_KEY_SIZE: Int = 16

public val TLS_CIPHER_AES_GCM_128_SALT_SIZE: Int = 4

public val TLS_CIPHER_AES_GCM_128_TAG_SIZE: Int = 16

public val TLS_CIPHER_AES_GCM_128_REC_SEQ_SIZE: Int = 8

public val TLS_CIPHER_AES_GCM_256: U16 = 52u

public val TLS_CIPHER_AES_GCM_256_IV_SIZE: Int = 8

public val TLS_CIPHER_AES_GCM_256_KEY_SIZE: Int = 32

public val TLS_CIPHER_AES_GCM_256_SALT_SIZE: Int = 4

public val TLS_CIPHER_AES_GCM_256_TAG_SIZE: Int = 16

public val TLS_CIPHER_AES_GCM_256_REC_SEQ_SIZE: Int = 8

public val TLS_CIPHER_AES_CCM_128: U16 = 53u

public val TLS_CIPHER_AES_CCM_128_IV_SIZE: Int = 8

public val TLS_CIPHER_AES_CCM_128_KEY_SIZE: Int = 16

public val TLS_CIPHER_AES_CCM_128_SALT_SIZE: Int = 4

public val TLS_CIPHER_AES_CCM_128_TAG_SIZE: Int = 16

public val TLS_CIPHER_AES_CCM_128_REC_SEQ_SIZE: Int = 8

public val TLS_CIPHER_CHACHA20_POLY1305: U16 = 54u

public val TLS_CIPHER_CHACHA20_POLY1305_IV_SIZE: Int = 12

public val TLS_CIPHER_CHACHA20_POLY1305_KEY_SIZE: Int = 32

public val TLS_CIPHER_CHACHA20_POLY1305_SALT_SIZE: Int = 0

public val TLS_CIPHER_CHACHA20_POLY1305_TAG_SIZE: Int = 16

public val TLS_CIPHER_CHACHA20_POLY1305_REC_SEQ_SIZE: Int = 8

public val TLS_CIPHER_SM4_GCM: U16 = 55u

public val TLS_CIPHER_SM4_GCM_IV_SIZE: Int = 8

public val TLS_CIPHER_SM4_GCM_KEY_SIZE: Int = 16

public val TLS_CIPHER_SM4_GCM_SALT_SIZE: Int = 4

public val TLS_CIPHER_SM4_GCM_TAG_SIZE: Int = 16

public val TLS_CIPHER_SM4_GCM_REC_SEQ_SIZE: Int = 8

public val TLS_CIPHER_SM4_CCM: U16 = 56u

public val TLS_CIPHER_SM4_CCM_IV_SIZE: Int = 8

public val TLS_CIPHER_SM4_CCM_KEY_SIZE: Int = 16

public val TLS_CIPHER_SM4_CCM_SALT_SIZE: Int = 4

public val TLS_CIPHER_SM4_CCM_TAG_SIZE: Int = 16

public val TLS_CIPHER_SM4_CCM_REC_SEQ_SIZE: Int = 8

public val TLS_CIPHER_ARIA_GCM_128: U16 = 57u

public val TLS_CIPHER_ARIA_GCM_128_IV_SIZE: Int = 8

public val TLS_CIPHER_ARIA_GCM_128_KEY_SIZE: Int = 16

public val TLS_CIPHER_ARIA_GCM_128_SALT_SIZE: Int = 4

public val TLS_CIPHER_ARIA_GCM_128_TAG_SIZE: Int = 16

public val TLS_CIPHER_ARIA_GCM_128_REC_SEQ_SIZE: Int = 8

public val TLS_CIPHER_ARIA_GCM_256: U16 = 58u

public val TLS_CIPHER_ARIA_GCM_256_IV_SIZE: Int = 8

public val TLS_CIPHER_ARIA_GCM_256_KEY_SIZE: Int = 32

public val TLS_CIPHER_ARIA_GCM_256_SALT_SIZE: Int = 4

public val TLS_CIPHER_ARIA_GCM_256_TAG_SIZE: Int = 16

public val TLS_CIPHER_ARIA_GCM_256_REC_SEQ_SIZE: Int = 8

public val TLS_SET_RECORD_TYPE: CInt = 1

public val TLS_GET_RECORD_TYPE: CInt = 2

public val SOL_TLS: CInt = 282

// enum
public val TLS_INFO_UNSPEC: CInt = 0x00

public val TLS_INFO_VERSION: CInt = 0x01

public val TLS_INFO_CIPHER: CInt = 0x02

public val TLS_INFO_TXCONF: CInt = 0x03

public val TLS_INFO_RXCONF: CInt = 0x04

public val TLS_INFO_ZC_RO_TX: CInt = 0x05

public val TLS_INFO_RX_NO_PAD: CInt = 0x06

public val TLS_CONF_BASE: CInt = 1

public val TLS_CONF_SW: CInt = 2

public val TLS_CONF_HW: CInt = 3

public val TLS_CONF_HW_RECORD: CInt = 4

// linux/ifAlg.h
public val ALG_SET_KEY: CInt = 1

public val ALG_SET_IV: CInt = 2

public val ALG_SET_OP: CInt = 3

public val ALG_SET_AEAD_ASSOCLEN: CInt = 4

public val ALG_SET_AEAD_AUTHSIZE: CInt = 5

public val ALG_SET_DRBG_ENTROPY: CInt = 6

public val ALG_SET_KEY_BY_KEY_SERIAL: CInt = 7

public val ALG_OP_DECRYPT: CInt = 0

public val ALG_OP_ENCRYPT: CInt = 1

// include/uapi/linux/if.h
public val IF_OPER_UNKNOWN: CInt = 0

public val IF_OPER_NOTPRESENT: CInt = 1

public val IF_OPER_DOWN: CInt = 2

public val IF_OPER_LOWERLAYERDOWN: CInt = 3

public val IF_OPER_TESTING: CInt = 4

public val IF_OPER_DORMANT: CInt = 5

public val IF_OPER_UP: CInt = 6

public val IF_LINK_MODE_DEFAULT: CInt = 0

public val IF_LINK_MODE_DORMANT: CInt = 1

public val IF_LINK_MODE_TESTING: CInt = 2

// include/uapi/linux/mman.h
public val MAP_SHARED_VALIDATE: CInt = 0x3

public val MAP_DROPPABLE: CInt = 0x8

// uapi/linux/vmSockets.h
public val VMADDR_CID_ANY: CUint = 0xFFFFFFFFu

public val VMADDR_CID_HYPERVISOR: CUint = 0u

public val VMADDR_CID_RESERVED: CUint = 1u

public val VMADDR_CID_LOCAL: CUint = 1u

public val VMADDR_CID_HOST: CUint = 2u

public val VMADDR_PORT_ANY: CUint = 0xFFFFFFFFu

// uapi/linux/inotify.h
public val IN_ACCESS: UInt = 0x00000001u

public val IN_MODIFY: UInt = 0x00000002u

public val IN_ATTRIB: UInt = 0x00000004u

public val IN_CLOSE_WRITE: UInt = 0x00000008u

public val IN_CLOSE_NOWRITE: UInt = 0x00000010u

public val IN_CLOSE: UInt = IN_CLOSE_WRITE or IN_CLOSE_NOWRITE

public val IN_OPEN: UInt = 0x00000020u

public val IN_MOVED_FROM: UInt = 0x00000040u

public val IN_MOVED_TO: UInt = 0x00000080u

public val IN_MOVE: UInt = IN_MOVED_FROM or IN_MOVED_TO

public val IN_CREATE: UInt = 0x00000100u

public val IN_DELETE: UInt = 0x00000200u

public val IN_DELETE_SELF: UInt = 0x00000400u

public val IN_MOVE_SELF: UInt = 0x00000800u

public val IN_UNMOUNT: UInt = 0x00002000u

public val IN_Q_OVERFLOW: UInt = 0x00004000u

public val IN_IGNORED: UInt = 0x00008000u

public val IN_ONLYDIR: UInt = 0x01000000u

public val IN_DONT_FOLLOW: UInt = 0x02000000u

public val IN_EXCL_UNLINK: UInt = 0x04000000u

// uapi/linux/securebits.h
public val SECURE_NOROOT: CInt = 0

public val SECURE_NOROOT_LOCKED: CInt = 1

public val SECBIT_NOROOT: CInt = issecureMask(SECURE_NOROOT)

public val SECBIT_NOROOT_LOCKED: CInt = issecureMask(SECURE_NOROOT_LOCKED)

public val SECURE_NO_SETUID_FIXUP: CInt = 2

public val SECURE_NO_SETUID_FIXUP_LOCKED: CInt = 3

public val SECBIT_NO_SETUID_FIXUP: CInt = issecureMask(SECURE_NO_SETUID_FIXUP)

public val SECBIT_NO_SETUID_FIXUP_LOCKED: CInt = issecureMask(SECURE_NO_SETUID_FIXUP_LOCKED)

public val SECURE_KEEP_CAPS: CInt = 4

public val SECURE_KEEP_CAPS_LOCKED: CInt = 5

public val SECBIT_KEEP_CAPS: CInt = issecureMask(SECURE_KEEP_CAPS)

public val SECBIT_KEEP_CAPS_LOCKED: CInt = issecureMask(SECURE_KEEP_CAPS_LOCKED)

public val SECURE_NO_CAP_AMBIENT_RAISE: CInt = 6

public val SECURE_NO_CAP_AMBIENT_RAISE_LOCKED: CInt = 7

public val SECBIT_NO_CAP_AMBIENT_RAISE: CInt = issecureMask(SECURE_NO_CAP_AMBIENT_RAISE)

public val SECBIT_NO_CAP_AMBIENT_RAISE_LOCKED: CInt = issecureMask(SECURE_NO_CAP_AMBIENT_RAISE_LOCKED)

public val SECURE_EXEC_RESTRICT_FILE: CInt = 8

public val SECURE_EXEC_RESTRICT_FILE_LOCKED: CInt = 9

public val SECBIT_EXEC_RESTRICT_FILE: CInt = issecureMask(SECURE_EXEC_RESTRICT_FILE)

public val SECBIT_EXEC_RESTRICT_FILE_LOCKED: CInt = issecureMask(SECURE_EXEC_RESTRICT_FILE_LOCKED)

public val SECURE_EXEC_DENY_INTERACTIVE: CInt = 10

public val SECURE_EXEC_DENY_INTERACTIVE_LOCKED: CInt = 11

public val SECBIT_EXEC_DENY_INTERACTIVE: CInt = issecureMask(SECURE_EXEC_DENY_INTERACTIVE)

public val SECBIT_EXEC_DENY_INTERACTIVE_LOCKED: CInt = issecureMask(SECURE_EXEC_DENY_INTERACTIVE_LOCKED)

public val SECUREBITS_DEFAULT: CInt = 0x00000000

public val SECURE_ALL_BITS: CInt = SECBIT_NOROOT or SECBIT_NO_SETUID_FIXUP or SECBIT_KEEP_CAPS or SECBIT_NO_CAP_AMBIENT_RAISE or SECBIT_EXEC_RESTRICT_FILE or SECBIT_EXEC_DENY_INTERACTIVE

public val SECURE_ALL_LOCKS: CInt = SECURE_ALL_BITS shl 1

public val SECURE_ALL_UNPRIVILEGED: CInt = issecureMask(SECURE_EXEC_RESTRICT_FILE) or issecureMask(SECURE_EXEC_DENY_INTERACTIVE)

public fun issecureMask(x: CInt): CInt {
    return 1 shl x
}

public val IN_MASK_CREATE: UInt = 0x10000000u

public val IN_MASK_ADD: UInt = 0x20000000u

public val IN_ISDIR: UInt = 0x40000000u

public val IN_ONESHOT: UInt = 0x80000000u

public val IN_ALL_EVENTS: UInt = IN_ACCESS or IN_MODIFY or IN_ATTRIB or IN_CLOSE_WRITE or IN_CLOSE_NOWRITE or IN_OPEN or IN_MOVED_FROM or IN_MOVED_TO or IN_DELETE or IN_CREATE or IN_DELETE_SELF or IN_MOVE_SELF

public val IN_CLOEXEC: CInt = O_CLOEXEC

public val IN_NONBLOCK: CInt = O_NONBLOCK

// uapi/linux/mount.h
public val OPEN_TREE_CLONE: CUint = 0x01u

public val OPEN_TREE_CLOEXEC: CUint = O_CLOEXEC.toUInt()

// uapi/linux/netfilter/nfTables.h
public val NFT_TABLE_MAXNAMELEN: CInt = 256

public val NFT_CHAIN_MAXNAMELEN: CInt = 256

public val NFT_SET_MAXNAMELEN: CInt = 256

public val NFT_OBJ_MAXNAMELEN: CInt = 256

public val NFT_USERDATA_MAXLEN: CInt = 256

public val NFT_REG_VERDICT: CInt = 0

public val NFT_REG_1: CInt = 1

public val NFT_REG_2: CInt = 2

public val NFT_REG_3: CInt = 3

public val NFT_REG_4: CInt = 4

public val NFT_REG_MAX: CInt = 5

public val NFT_REG32_00: CInt = 8

public val NFT_REG32_01: CInt = 9

public val NFT_REG32_02: CInt = 10

public val NFT_REG32_03: CInt = 11

public val NFT_REG32_04: CInt = 12

public val NFT_REG32_05: CInt = 13

public val NFT_REG32_06: CInt = 14

public val NFT_REG32_07: CInt = 15

public val NFT_REG32_08: CInt = 16

public val NFT_REG32_09: CInt = 17

public val NFT_REG32_10: CInt = 18

public val NFT_REG32_11: CInt = 19

public val NFT_REG32_12: CInt = 20

public val NFT_REG32_13: CInt = 21

public val NFT_REG32_14: CInt = 22

public val NFT_REG32_15: CInt = 23

public val NFT_REG_SIZE: CInt = 16

public val NFT_REG32_SIZE: CInt = 4

public val NFT_CONTINUE: CInt = -1

public val NFT_BREAK: CInt = -2

public val NFT_JUMP: CInt = -3

public val NFT_GOTO: CInt = -4

public val NFT_RETURN: CInt = -5

public val NFT_MSG_NEWTABLE: CInt = 0

public val NFT_MSG_GETTABLE: CInt = 1

public val NFT_MSG_DELTABLE: CInt = 2

public val NFT_MSG_NEWCHAIN: CInt = 3

public val NFT_MSG_GETCHAIN: CInt = 4

public val NFT_MSG_DELCHAIN: CInt = 5

public val NFT_MSG_NEWRULE: CInt = 6

public val NFT_MSG_GETRULE: CInt = 7

public val NFT_MSG_DELRULE: CInt = 8

public val NFT_MSG_NEWSET: CInt = 9

public val NFT_MSG_GETSET: CInt = 10

public val NFT_MSG_DELSET: CInt = 11

public val NFT_MSG_NEWSETELEM: CInt = 12

public val NFT_MSG_GETSETELEM: CInt = 13

public val NFT_MSG_DELSETELEM: CInt = 14

public val NFT_MSG_NEWGEN: CInt = 15

public val NFT_MSG_GETGEN: CInt = 16

public val NFT_MSG_TRACE: CInt = 17

public val NFT_MSG_NEWOBJ: CInt = 18

public val NFT_MSG_GETOBJ: CInt = 19

public val NFT_MSG_DELOBJ: CInt = 20

public val NFT_MSG_GETOBJ_RESET: CInt = 21

public val NFT_MSG_MAX: CInt = 34

public val NFT_SET_ANONYMOUS: CInt = 0x1

public val NFT_SET_CONSTANT: CInt = 0x2

public val NFT_SET_INTERVAL: CInt = 0x4

public val NFT_SET_MAP: CInt = 0x8

public val NFT_SET_TIMEOUT: CInt = 0x10

public val NFT_SET_EVAL: CInt = 0x20

public val NFT_SET_POL_PERFORMANCE: CInt = 0

public val NFT_SET_POL_MEMORY: CInt = 1

public val NFT_SET_ELEM_INTERVAL_END: CInt = 0x1

public val NFT_DATA_VALUE: CUint = 0u

public val NFT_DATA_VERDICT: CUint = 0xffffff00u

public val NFT_DATA_RESERVED_MASK: CUint = 0xffffff00u

public val NFT_DATA_VALUE_MAXLEN: CInt = 64

public val NFT_BYTEORDER_NTOH: CInt = 0

public val NFT_BYTEORDER_HTON: CInt = 1

public val NFT_CMP_EQ: CInt = 0

public val NFT_CMP_NEQ: CInt = 1

public val NFT_CMP_LT: CInt = 2

public val NFT_CMP_LTE: CInt = 3

public val NFT_CMP_GT: CInt = 4

public val NFT_CMP_GTE: CInt = 5

public val NFT_RANGE_EQ: CInt = 0

public val NFT_RANGE_NEQ: CInt = 1

public val NFT_LOOKUP_F_INV: CInt = 1 shl 0

public val NFT_DYNSET_OP_ADD: CInt = 0

public val NFT_DYNSET_OP_UPDATE: CInt = 1

public val NFT_DYNSET_F_INV: CInt = 1 shl 0

public val NFT_PAYLOAD_LL_HEADER: CInt = 0

public val NFT_PAYLOAD_NETWORK_HEADER: CInt = 1

public val NFT_PAYLOAD_TRANSPORT_HEADER: CInt = 2

public val NFT_PAYLOAD_CSUM_NONE: CInt = 0

public val NFT_PAYLOAD_CSUM_INET: CInt = 1

public val NFT_META_LEN: CInt = 0

public val NFT_META_PROTOCOL: CInt = 1

public val NFT_META_PRIORITY: CInt = 2

public val NFT_META_MARK: CInt = 3

public val NFT_META_IIF: CInt = 4

public val NFT_META_OIF: CInt = 5

public val NFT_META_IIFNAME: CInt = 6

public val NFT_META_OIFNAME: CInt = 7

public val NFT_META_IIFTYPE: CInt = 8

public val NFT_META_OIFTYPE: CInt = 9

public val NFT_META_SKUID: CInt = 10

public val NFT_META_SKGID: CInt = 11

public val NFT_META_NFTRACE: CInt = 12

public val NFT_META_RTCLASSID: CInt = 13

public val NFT_META_SECMARK: CInt = 14

public val NFT_META_NFPROTO: CInt = 15

public val NFT_META_L4PROTO: CInt = 16

public val NFT_META_BRI_IIFNAME: CInt = 17

public val NFT_META_BRI_OIFNAME: CInt = 18

public val NFT_META_PKTTYPE: CInt = 19

public val NFT_META_CPU: CInt = 20

public val NFT_META_IIFGROUP: CInt = 21

public val NFT_META_OIFGROUP: CInt = 22

public val NFT_META_CGROUP: CInt = 23

public val NFT_META_PRANDOM: CInt = 24

public val NFT_CT_STATE: CInt = 0

public val NFT_CT_DIRECTION: CInt = 1

public val NFT_CT_STATUS: CInt = 2

public val NFT_CT_MARK: CInt = 3

public val NFT_CT_SECMARK: CInt = 4

public val NFT_CT_EXPIRATION: CInt = 5

public val NFT_CT_HELPER: CInt = 6

public val NFT_CT_L3PROTOCOL: CInt = 7

public val NFT_CT_SRC: CInt = 8

public val NFT_CT_DST: CInt = 9

public val NFT_CT_PROTOCOL: CInt = 10

public val NFT_CT_PROTO_SRC: CInt = 11

public val NFT_CT_PROTO_DST: CInt = 12

public val NFT_CT_LABELS: CInt = 13

public val NFT_CT_PKTS: CInt = 14

public val NFT_CT_BYTES: CInt = 15

public val NFT_CT_AVGPKT: CInt = 16

public val NFT_CT_ZONE: CInt = 17

public val NFT_CT_EVENTMASK: CInt = 18

public val NFT_CT_SRC_IP: CInt = 19

public val NFT_CT_DST_IP: CInt = 20

public val NFT_CT_SRC_IP6: CInt = 21

public val NFT_CT_DST_IP6: CInt = 22

public val NFT_LIMIT_PKTS: CInt = 0

public val NFT_LIMIT_PKT_BYTES: CInt = 1

public val NFT_LIMIT_F_INV: CInt = 1 shl 0

public val NFT_QUEUE_FLAG_BYPASS: CInt = 0x01

public val NFT_QUEUE_FLAG_CPU_FANOUT: CInt = 0x02

public val NFT_QUEUE_FLAG_MASK: CInt = 0x03

public val NFT_QUOTA_F_INV: CInt = 1 shl 0

public val NFT_REJECT_ICMP_UNREACH: CInt = 0

public val NFT_REJECT_TCP_RST: CInt = 1

public val NFT_REJECT_ICMPX_UNREACH: CInt = 2

public val NFT_REJECT_ICMPX_NO_ROUTE: CInt = 0

public val NFT_REJECT_ICMPX_PORT_UNREACH: CInt = 1

public val NFT_REJECT_ICMPX_HOST_UNREACH: CInt = 2

public val NFT_REJECT_ICMPX_ADMIN_PROHIBITED: CInt = 3

public val NFT_NAT_SNAT: CInt = 0

public val NFT_NAT_DNAT: CInt = 1

public val NFT_TRACETYPE_UNSPEC: CInt = 0

public val NFT_TRACETYPE_POLICY: CInt = 1

public val NFT_TRACETYPE_RETURN: CInt = 2

public val NFT_TRACETYPE_RULE: CInt = 3

public val NFT_NG_INCREMENTAL: CInt = 0

public val NFT_NG_RANDOM: CInt = 1

// linux/input.h
public val FF_MAX: U16 = 0x7fu

public val FF_CNT: Int = FF_MAX.toInt() + 1

// linux/input-event-codes.h
public val INPUT_PROP_POINTER: U16 = 0x00u

public val INPUT_PROP_DIRECT: U16 = 0x01u

public val INPUT_PROP_BUTTONPAD: U16 = 0x02u

public val INPUT_PROP_SEMI_MT: U16 = 0x03u

public val INPUT_PROP_TOPBUTTONPAD: U16 = 0x04u

public val INPUT_PROP_POINTING_STICK: U16 = 0x05u

public val INPUT_PROP_ACCELEROMETER: U16 = 0x06u

public val INPUT_PROP_MAX: U16 = 0x1fu

public val INPUT_PROP_CNT: Int = INPUT_PROP_MAX.toInt() + 1

public val EV_MAX: U16 = 0x1fu

public val EV_CNT: Int = EV_MAX.toInt() + 1

public val SYN_MAX: U16 = 0xfu

public val SYN_CNT: Int = SYN_MAX.toInt() + 1

public val KEY_MAX: U16 = 0x2ffu

public val KEY_CNT: Int = KEY_MAX.toInt() + 1

public val REL_MAX: U16 = 0x0fu

public val REL_CNT: Int = REL_MAX.toInt() + 1

public val ABS_MAX: U16 = 0x3fu

public val ABS_CNT: Int = ABS_MAX.toInt() + 1

public val SW_MAX: U16 = 0x10u

public val SW_CNT: Int = SW_MAX.toInt() + 1

public val MSC_MAX: U16 = 0x07u

public val MSC_CNT: Int = MSC_MAX.toInt() + 1

public val LED_MAX: U16 = 0x0fu

public val LED_CNT: Int = LED_MAX.toInt() + 1

public val REP_MAX: U16 = 0x01u

public val REP_CNT: Int = REP_MAX.toInt() + 1

public val SND_MAX: U16 = 0x07u

public val SND_CNT: Int = SND_MAX.toInt() + 1

// linux/uinput.h
public val UINPUT_VERSION: CUint = 5u

public val UINPUT_MAX_NAME_SIZE: Int = 80

// uapi/linux/fanotify.h
public val FAN_ACCESS: ULong = 0x00000001uL

public val FAN_MODIFY: ULong = 0x00000002uL

public val FAN_ATTRIB: ULong = 0x00000004uL

public val FAN_CLOSE_WRITE: ULong = 0x00000008uL

public val FAN_CLOSE_NOWRITE: ULong = 0x00000010uL

public val FAN_OPEN: ULong = 0x00000020uL

public val FAN_MOVED_FROM: ULong = 0x00000040uL

public val FAN_MOVED_TO: ULong = 0x00000080uL

public val FAN_CREATE: ULong = 0x00000100uL

public val FAN_DELETE: ULong = 0x00000200uL

public val FAN_DELETE_SELF: ULong = 0x00000400uL

public val FAN_MOVE_SELF: ULong = 0x00000800uL

public val FAN_OPEN_EXEC: ULong = 0x00001000uL

public val FAN_Q_OVERFLOW: ULong = 0x00004000uL

public val FAN_FS_ERROR: ULong = 0x00008000uL

public val FAN_OPEN_PERM: ULong = 0x00010000uL

public val FAN_ACCESS_PERM: ULong = 0x00020000uL

public val FAN_OPEN_EXEC_PERM: ULong = 0x00040000uL

public val FAN_EVENT_ON_CHILD: ULong = 0x08000000uL

public val FAN_RENAME: ULong = 0x10000000uL

public val FAN_ONDIR: ULong = 0x40000000uL

public val FAN_CLOSE: ULong = FAN_CLOSE_WRITE or FAN_CLOSE_NOWRITE

public val FAN_MOVE: ULong = FAN_MOVED_FROM or FAN_MOVED_TO

public val FAN_CLOEXEC: CUint = 0x00000001u

public val FAN_NONBLOCK: CUint = 0x00000002u

public val FAN_CLASS_NOTIF: CUint = 0x00000000u

public val FAN_CLASS_CONTENT: CUint = 0x00000004u

public val FAN_CLASS_PRE_CONTENT: CUint = 0x00000008u

public val FAN_UNLIMITED_QUEUE: CUint = 0x00000010u

public val FAN_UNLIMITED_MARKS: CUint = 0x00000020u

public val FAN_ENABLE_AUDIT: CUint = 0x00000040u

public val FAN_REPORT_PIDFD: CUint = 0x00000080u

public val FAN_REPORT_TID: CUint = 0x00000100u

public val FAN_REPORT_FID: CUint = 0x00000200u

public val FAN_REPORT_DIR_FID: CUint = 0x00000400u

public val FAN_REPORT_NAME: CUint = 0x00000800u

public val FAN_REPORT_TARGET_FID: CUint = 0x00001000u

public val FAN_REPORT_DFID_NAME: CUint = FAN_REPORT_DIR_FID or FAN_REPORT_NAME

public val FAN_REPORT_DFID_NAME_TARGET: CUint = FAN_REPORT_DFID_NAME or FAN_REPORT_FID or FAN_REPORT_TARGET_FID

public val FAN_MARK_ADD: CUint = 0x00000001u

public val FAN_MARK_REMOVE: CUint = 0x00000002u

public val FAN_MARK_DONT_FOLLOW: CUint = 0x00000004u

public val FAN_MARK_ONLYDIR: CUint = 0x00000008u

public val FAN_MARK_IGNORED_MASK: CUint = 0x00000020u

public val FAN_MARK_IGNORED_SURV_MODIFY: CUint = 0x00000040u

public val FAN_MARK_FLUSH: CUint = 0x00000080u

public val FAN_MARK_EVICTABLE: CUint = 0x00000200u

public val FAN_MARK_IGNORE: CUint = 0x00000400u

public val FAN_MARK_INODE: CUint = 0x00000000u

public val FAN_MARK_MOUNT: CUint = 0x00000010u

public val FAN_MARK_FILESYSTEM: CUint = 0x00000100u

public val FAN_MARK_IGNORE_SURV: CUint = FAN_MARK_IGNORE or FAN_MARK_IGNORED_SURV_MODIFY

public val FANOTIFY_METADATA_VERSION: UByte = 3u

public val FAN_EVENT_INFO_TYPE_FID: UByte = 1u

public val FAN_EVENT_INFO_TYPE_DFID_NAME: UByte = 2u

public val FAN_EVENT_INFO_TYPE_DFID: UByte = 3u

public val FAN_EVENT_INFO_TYPE_PIDFD: UByte = 4u

public val FAN_EVENT_INFO_TYPE_ERROR: UByte = 5u

public val FAN_EVENT_INFO_TYPE_OLD_DFID_NAME: UByte = 10u

public val FAN_EVENT_INFO_TYPE_NEW_DFID_NAME: UByte = 12u

public val FAN_RESPONSE_INFO_NONE: UByte = 0u

public val FAN_RESPONSE_INFO_AUDIT_RULE: UByte = 1u

public val FAN_ALLOW: UInt = 0x01u

public val FAN_DENY: UInt = 0x02u

public val FAN_AUDIT: UInt = 0x10u

public val FAN_INFO: UInt = 0x20u

public val FAN_NOFD: CInt = -1

public val FAN_NOPIDFD: CInt = FAN_NOFD

public val FAN_EPIDFD: CInt = -2

// linux/futex.h
public val FUTEX_WAIT: CInt = 0

public val FUTEX_WAKE: CInt = 1

public val FUTEX_FD: CInt = 2

public val FUTEX_REQUEUE: CInt = 3

public val FUTEX_CMP_REQUEUE: CInt = 4

public val FUTEX_WAKE_OP: CInt = 5

public val FUTEX_LOCK_PI: CInt = 6

public val FUTEX_UNLOCK_PI: CInt = 7

public val FUTEX_TRYLOCK_PI: CInt = 8

public val FUTEX_WAIT_BITSET: CInt = 9

public val FUTEX_WAKE_BITSET: CInt = 10

public val FUTEX_WAIT_REQUEUE_PI: CInt = 11

public val FUTEX_CMP_REQUEUE_PI: CInt = 12

public val FUTEX_LOCK_PI2: CInt = 13

public val FUTEX_PRIVATE_FLAG: CInt = 128

public val FUTEX_CLOCK_REALTIME: CInt = 256

public val FUTEX_CMD_MASK: CInt = (FUTEX_PRIVATE_FLAG or FUTEX_CLOCK_REALTIME).inv()

public val FUTEX_WAITERS: UInt = 0x80000000u

public val FUTEX_OWNER_DIED: UInt = 0x40000000u

public val FUTEX_TID_MASK: UInt = 0x3fffffffu

public val FUTEX_BITSET_MATCH_ANY: CInt = 0xffffffff

public val FUTEX_OP_SET: CInt = 0

public val FUTEX_OP_ADD: CInt = 1

public val FUTEX_OP_OR: CInt = 2

public val FUTEX_OP_ANDN: CInt = 3

public val FUTEX_OP_XOR: CInt = 4

public val FUTEX_OP_OPARG_SHIFT: CInt = 8

public val FUTEX_OP_CMP_EQ: CInt = 0

public val FUTEX_OP_CMP_NE: CInt = 1

public val FUTEX_OP_CMP_LT: CInt = 2

public val FUTEX_OP_CMP_LE: CInt = 3

public val FUTEX_OP_CMP_GT: CInt = 4

public val FUTEX_OP_CMP_GE: CInt = 5

public fun futexOp(op: CInt, oparg: CInt, cmp: CInt, cmparg: CInt): CInt {
    return ((op and 0xf) shl 28) or ((cmp and 0xf) shl 24) or ((oparg and 0xfff) shl 12) or (cmparg and 0xfff)
}

// linux/kexec.h
public val KEXEC_ON_CRASH: CInt = 0x00000001

public val KEXEC_PRESERVE_CONTEXT: CInt = 0x00000002

public val KEXEC_ARCH_MASK: CInt = 0xffff0000

public val KEXEC_FILE_UNLOAD: CInt = 0x00000001

public val KEXEC_FILE_ON_CRASH: CInt = 0x00000002

public val KEXEC_FILE_NO_INITRAMFS: CInt = 0x00000004

// linux/reboot.h
public val LINUX_REBOOT_MAGIC1: CInt = 0xfee1dead

public val LINUX_REBOOT_MAGIC2: CInt = 672274793

public val LINUX_REBOOT_MAGIC2A: CInt = 85072278

public val LINUX_REBOOT_MAGIC2B: CInt = 369367448

public val LINUX_REBOOT_MAGIC2C: CInt = 537993216

public val LINUX_REBOOT_CMD_RESTART: CInt = 0x01234567

public val LINUX_REBOOT_CMD_HALT: CInt = 0xCDEF0123

public val LINUX_REBOOT_CMD_CAD_ON: CInt = 0x89ABCDEF

public val LINUX_REBOOT_CMD_CAD_OFF: CInt = 0x00000000

public val LINUX_REBOOT_CMD_POWER_OFF: CInt = 0x4321FEDC

public val LINUX_REBOOT_CMD_RESTART2: CInt = 0xA1B2C3D4

public val LINUX_REBOOT_CMD_SW_SUSPEND: CInt = 0xD000FCE2

public val LINUX_REBOOT_CMD_KEXEC: CInt = 0x45584543

// linux/errqueue.h
public val SO_EE_ORIGIN_NONE: UByte = 0u

public val SO_EE_ORIGIN_LOCAL: UByte = 1u

public val SO_EE_ORIGIN_ICMP: UByte = 2u

public val SO_EE_ORIGIN_ICMP6: UByte = 3u

public val SO_EE_ORIGIN_TXSTATUS: UByte = 4u

public val SO_EE_ORIGIN_TIMESTAMPING: UByte = SO_EE_ORIGIN_TXSTATUS

// linux/sctp.h
public val SCTP_FUTURE_ASSOC: CInt = 0

public val SCTP_CURRENT_ASSOC: CInt = 1

public val SCTP_ALL_ASSOC: CInt = 2

public val SCTP_RTOINFO: CInt = 0

public val SCTP_ASSOCINFO: CInt = 1

public val SCTP_INITMSG: CInt = 2

public val SCTP_NODELAY: CInt = 3

public val SCTP_AUTOCLOSE: CInt = 4

public val SCTP_SET_PEER_PRIMARY_ADDR: CInt = 5

public val SCTP_PRIMARY_ADDR: CInt = 6

public val SCTP_ADAPTATION_LAYER: CInt = 7

public val SCTP_DISABLE_FRAGMENTS: CInt = 8

public val SCTP_PEER_ADDR_PARAMS: CInt = 9

public val SCTP_DEFAULT_SEND_PARAM: CInt = 10

public val SCTP_EVENTS: CInt = 11

public val SCTP_I_WANT_MAPPED_V4_ADDR: CInt = 12

public val SCTP_MAXSEG: CInt = 13

public val SCTP_STATUS: CInt = 14

public val SCTP_GET_PEER_ADDR_INFO: CInt = 15

public val SCTP_DELAYED_ACK_TIME: CInt = 16

public val SCTP_DELAYED_ACK: CInt = SCTP_DELAYED_ACK_TIME

public val SCTP_DELAYED_SACK: CInt = SCTP_DELAYED_ACK_TIME

public val SCTP_CONTEXT: CInt = 17

public val SCTP_FRAGMENT_INTERLEAVE: CInt = 18

public val SCTP_PARTIAL_DELIVERY_POINT: CInt = 19

public val SCTP_MAX_BURST: CInt = 20

public val SCTP_AUTH_CHUNK: CInt = 21

public val SCTP_HMAC_IDENT: CInt = 22

public val SCTP_AUTH_KEY: CInt = 23

public val SCTP_AUTH_ACTIVE_KEY: CInt = 24

public val SCTP_AUTH_DELETE_KEY: CInt = 25

public val SCTP_PEER_AUTH_CHUNKS: CInt = 26

public val SCTP_LOCAL_AUTH_CHUNKS: CInt = 27

public val SCTP_GET_ASSOC_NUMBER: CInt = 28

public val SCTP_GET_ASSOC_ID_LIST: CInt = 29

public val SCTP_AUTO_ASCONF: CInt = 30

public val SCTP_PEER_ADDR_THLDS: CInt = 31

public val SCTP_RECVRCVINFO: CInt = 32

public val SCTP_RECVNXTINFO: CInt = 33

public val SCTP_DEFAULT_SNDINFO: CInt = 34

public val SCTP_AUTH_DEACTIVATE_KEY: CInt = 35

public val SCTP_REUSE_PORT: CInt = 36

public val SCTP_PEER_ADDR_THLDS_V2: CInt = 37

public val SCTP_PR_SCTP_NONE: CInt = 0x0000

public val SCTP_PR_SCTP_TTL: CInt = 0x0010

public val SCTP_PR_SCTP_RTX: CInt = 0x0020

public val SCTP_PR_SCTP_PRIO: CInt = 0x0030

public val SCTP_PR_SCTP_MAX: CInt = SCTP_PR_SCTP_PRIO

public val SCTP_PR_SCTP_MASK: CInt = 0x0030

public val SCTP_ENABLE_RESET_STREAM_REQ: CInt = 0x01

public val SCTP_ENABLE_RESET_ASSOC_REQ: CInt = 0x02

public val SCTP_ENABLE_CHANGE_ASSOC_REQ: CInt = 0x04

public val SCTP_ENABLE_STRRESET_MASK: CInt = 0x07

public val SCTP_STREAM_RESET_INCOMING: CInt = 0x01

public val SCTP_STREAM_RESET_OUTGOING: CInt = 0x02

public val SCTP_INIT: CInt = 0

public val SCTP_SNDRCV: CInt = 1

public val SCTP_SNDINFO: CInt = 2

public val SCTP_RCVINFO: CInt = 3

public val SCTP_NXTINFO: CInt = 4

public val SCTP_PRINFO: CInt = 5

public val SCTP_AUTHINFO: CInt = 6

public val SCTP_DSTADDRV4: CInt = 7

public val SCTP_DSTADDRV6: CInt = 8

public val SCTP_UNORDERED: CInt = 1 shl 0

public val SCTP_ADDR_OVER: CInt = 1 shl 1

public val SCTP_ABORT: CInt = 1 shl 2

public val SCTP_SACK_IMMEDIATELY: CInt = 1 shl 3

public val SCTP_SENDALL: CInt = 1 shl 6

public val SCTP_PR_SCTP_ALL: CInt = 1 shl 7

public val SCTP_NOTIFICATION: CInt = MSG_NOTIFICATION

public val SCTP_EOF: CInt = MSG_FIN

// DCCP socket options
public val DCCP_SOCKOPT_PACKET_SIZE: CInt = 1

public val DCCP_SOCKOPT_SERVICE: CInt = 2

public val DCCP_SOCKOPT_CHANGE_L: CInt = 3

public val DCCP_SOCKOPT_CHANGE_R: CInt = 4

public val DCCP_SOCKOPT_GET_CUR_MPS: CInt = 5

public val DCCP_SOCKOPT_SERVER_TIMEWAIT: CInt = 6

public val DCCP_SOCKOPT_SEND_CSCOV: CInt = 10

public val DCCP_SOCKOPT_RECV_CSCOV: CInt = 11

public val DCCP_SOCKOPT_AVAILABLE_CCIDS: CInt = 12

public val DCCP_SOCKOPT_CCID: CInt = 13

public val DCCP_SOCKOPT_TX_CCID: CInt = 14

public val DCCP_SOCKOPT_RX_CCID: CInt = 15

public val DCCP_SOCKOPT_QPOLICY_ID: CInt = 16

public val DCCP_SOCKOPT_QPOLICY_TXQLEN: CInt = 17

public val DCCP_SOCKOPT_CCID_RX_INFO: CInt = 128

public val DCCP_SOCKOPT_CCID_TX_INFO: CInt = 192

/**
 * maximum number of services provided on the same listening port
 */
public val DCCP_SERVICE_LIST_MAX_LEN: CInt = 32

public val CTL_KERN: CInt = 1

public val CTL_VM: CInt = 2

public val CTL_NET: CInt = 3

public val CTL_FS: CInt = 5

public val CTL_DEBUG: CInt = 6

public val CTL_DEV: CInt = 7

public val CTL_BUS: CInt = 8

public val CTL_ABI: CInt = 9

public val CTL_CPU: CInt = 10

public val CTL_BUS_ISA: CInt = 1

public val INOTIFY_MAX_USER_INSTANCES: CInt = 1

public val INOTIFY_MAX_USER_WATCHES: CInt = 2

public val INOTIFY_MAX_QUEUED_EVENTS: CInt = 3

public val KERN_OSTYPE: CInt = 1

public val KERN_OSRELEASE: CInt = 2

public val KERN_OSREV: CInt = 3

public val KERN_VERSION: CInt = 4

public val KERN_SECUREMASK: CInt = 5

public val KERN_PROF: CInt = 6

public val KERN_NODENAME: CInt = 7

public val KERN_DOMAINNAME: CInt = 8

public val KERN_PANIC: CInt = 15

public val KERN_REALROOTDEV: CInt = 16

public val KERN_SPARC_REBOOT: CInt = 21

public val KERN_CTLALTDEL: CInt = 22

public val KERN_PRINTK: CInt = 23

public val KERN_NAMETRANS: CInt = 24

public val KERN_PPC_HTABRECLAIM: CInt = 25

public val KERN_PPC_ZEROPAGED: CInt = 26

public val KERN_PPC_POWERSAVE_NAP: CInt = 27

public val KERN_MODPROBE: CInt = 28

public val KERN_SG_BIG_BUFF: CInt = 29

public val KERN_ACCT: CInt = 30

public val KERN_PPC_L2CR: CInt = 31

public val KERN_RTSIGNR: CInt = 32

public val KERN_RTSIGMAX: CInt = 33

public val KERN_SHMMAX: CInt = 34

public val KERN_MSGMAX: CInt = 35

public val KERN_MSGMNB: CInt = 36

public val KERN_MSGPOOL: CInt = 37

public val KERN_SYSRQ: CInt = 38

public val KERN_MAX_THREADS: CInt = 39

public val KERN_RANDOM: CInt = 40

public val KERN_SHMALL: CInt = 41

public val KERN_MSGMNI: CInt = 42

public val KERN_SEM: CInt = 43

public val KERN_SPARC_STOP_A: CInt = 44

public val KERN_SHMMNI: CInt = 45

public val KERN_OVERFLOWUID: CInt = 46

public val KERN_OVERFLOWGID: CInt = 47

public val KERN_SHMPATH: CInt = 48

public val KERN_HOTPLUG: CInt = 49

public val KERN_IEEE_EMULATION_WARNINGS: CInt = 50

public val KERN_S390_USER_DEBUG_LOGGING: CInt = 51

public val KERN_CORE_USES_PID: CInt = 52

public val KERN_TAINTED: CInt = 53

public val KERN_CADPID: CInt = 54

public val KERN_PIDMAX: CInt = 55

public val KERN_CORE_PATTERN: CInt = 56

public val KERN_PANIC_ON_OOPS: CInt = 57

public val KERN_HPPA_PWRSW: CInt = 58

public val KERN_HPPA_UNALIGNED: CInt = 59

public val KERN_PRINTK_RATELIMIT: CInt = 60

public val KERN_PRINTK_RATELIMIT_BURST: CInt = 61

public val KERN_PTY: CInt = 62

public val KERN_NGROUPS_MAX: CInt = 63

public val KERN_SPARC_SCONS_PWROFF: CInt = 64

public val KERN_HZ_TIMER: CInt = 65

public val KERN_UNKNOWN_NMI_PANIC: CInt = 66

public val KERN_BOOTLOADER_TYPE: CInt = 67

public val KERN_RANDOMIZE: CInt = 68

public val KERN_SETUID_DUMPABLE: CInt = 69

public val KERN_SPIN_RETRY: CInt = 70

public val KERN_ACPI_VIDEO_FLAGS: CInt = 71

public val KERN_IA64_UNALIGNED: CInt = 72

public val KERN_COMPAT_LOG: CInt = 73

public val KERN_MAX_LOCK_DEPTH: CInt = 74

public val KERN_NMI_WATCHDOG: CInt = 75

public val KERN_PANIC_ON_NMI: CInt = 76

public val VM_OVERCOMMIT_MEMORY: CInt = 5

public val VM_PAGE_CLUSTER: CInt = 10

public val VM_DIRTY_BACKGROUND: CInt = 11

public val VM_DIRTY_RATIO: CInt = 12

public val VM_DIRTY_WB_CS: CInt = 13

public val VM_DIRTY_EXPIRE_CS: CInt = 14

public val VM_NR_PDFLUSH_THREADS: CInt = 15

public val VM_OVERCOMMIT_RATIO: CInt = 16

public val VM_PAGEBUF: CInt = 17

public val VM_HUGETLB_PAGES: CInt = 18

public val VM_SWAPPINESS: CInt = 19

public val VM_LOWMEM_RESERVE_RATIO: CInt = 20

public val VM_MIN_FREE_KBYTES: CInt = 21

public val VM_MAX_MAP_COUNT: CInt = 22

public val VM_LAPTOP_MODE: CInt = 23

public val VM_BLOCK_DUMP: CInt = 24

public val VM_HUGETLB_GROUP: CInt = 25

public val VM_VFS_CACHE_PRESSURE: CInt = 26

public val VM_LEGACY_VA_LAYOUT: CInt = 27

public val VM_SWAP_TOKEN_TIMEOUT: CInt = 28

public val VM_DROP_PAGECACHE: CInt = 29

public val VM_PERCPU_PAGELIST_FRACTION: CInt = 30

public val VM_ZONE_RECLAIM_MODE: CInt = 31

public val VM_MIN_UNMAPPED: CInt = 32

public val VM_PANIC_ON_OOM: CInt = 33

public val VM_VDSO_ENABLED: CInt = 34

public val VM_MIN_SLAB: CInt = 35

public val NET_CORE: CInt = 1

public val NET_ETHER: CInt = 2

public val NET_802: CInt = 3

public val NET_UNIX: CInt = 4

public val NET_IPV4: CInt = 5

public val NET_IPX: CInt = 6

public val NET_ATALK: CInt = 7

public val NET_NETROM: CInt = 8

public val NET_AX25: CInt = 9

public val NET_BRIDGE: CInt = 10

public val NET_ROSE: CInt = 11

public val NET_IPV6: CInt = 12

public val NET_X25: CInt = 13

public val NET_TR: CInt = 14

public val NET_DECNET: CInt = 15

public val NET_ECONET: CInt = 16

public val NET_SCTP: CInt = 17

public val NET_LLC: CInt = 18

public val NET_NETFILTER: CInt = 19

public val NET_DCCP: CInt = 20

public val NET_IRDA: CInt = 412

// include/linux/sched.h
/**
 * I'm a virtual CPU.
 */
public val PF_VCPU: CInt = 0x00000001

/**
 * I am an IDLE thread.
 */
public val PF_IDLE: CInt = 0x00000002

/**
 * Getting shut down.
 */
public val PF_EXITING: CInt = 0x00000004

/**
 * Coredumps should ignore this task.
 */
public val PF_POSTCOREDUMP: CInt = 0x00000008

/**
 * Task is an IO worker.
 */
public val PF_IO_WORKER: CInt = 0x00000010

/**
 * I'm a workqueue worker.
 */
public val PF_WQ_WORKER: CInt = 0x00000020

/**
 * Forked but didn't exec.
 */
public val PF_FORKNOEXEC: CInt = 0x00000040

/**
 * Process policy on mce errors.
 */
public val PF_MCE_PROCESS: CInt = 0x00000080

/**
 * Used super-user privileges.
 */
public val PF_SUPERPRIV: CInt = 0x00000100

/**
 * Dumped core.
 */
public val PF_DUMPCORE: CInt = 0x00000200

/**
 * Killed by a signal.
 */
public val PF_SIGNALED: CInt = 0x00000400

/**
 * Allocating memory to free memory.
 *
 * See `memallocNoreclaimSave()`.
 */
public val PF_MEMALLOC: CInt = 0x00000800

/**
 * `setUser()` noticed that `RLIMIT_NPROC` was exceeded.
 */
public val PF_NPROC_EXCEEDED: CInt = 0x00001000

/**
 * If unset the fpu must be initialized before use.
 */
public val PF_USED_MATH: CInt = 0x00002000

/**
 * Kernel thread cloned from userspace thread.
 */
public val PF_USER_WORKER: CInt = 0x00004000

/**
 * This thread should not be frozen.
 */
public val PF_NOFREEZE: CInt = 0x00008000

/**
 * I am `kswapd`.
 */
public val PF_KSWAPD: CInt = 0x00020000

/**
 * All allocations inherit `GFP_NOFS`.
 *
 * See `memallocNfsSave()`.
 */
public val PF_MEMALLOC_NOFS: CInt = 0x00040000

/**
 * All allocations inherit `GFP_NOIO`.
 *
 * See `memallocNoioSave()`.
 */
public val PF_MEMALLOC_NOIO: CInt = 0x00080000

/**
 * Throttle writes only against the bdi I write to, I am cleaning
 * dirty pages from some other bdi.
 */
public val PF_LOCAL_THROTTLE: CInt = 0x00100000

/**
 * I am a kernel thread.
 */
public val PF_KTHREAD: CInt = 0x00200000

/**
 * Randomize virtual address space.
 */
public val PF_RANDOMIZE: CInt = 0x00400000

/**
 * Userland is not allowed to meddle with `cpusMask`.
 */
public val PF_NO_SETAFFINITY: CInt = 0x04000000

/**
 * Early kill for mce process policy.
 */
public val PF_MCE_EARLY: CInt = 0x08000000

/**
 * Allocations constrained to zones which allow long term pinning.
 *
 * See `memallocPinSave()`.
 */
public val PF_MEMALLOC_PIN: CInt = 0x10000000

/**
 * Plug has ts that needs updating.
 */
public val PF_BLOCK_TS: CInt = 0x20000000

/**
 * This thread called `freezeProcesses()` and should not be frozen.
 */
public val PF_SUSPEND_TASK: CInt = PF_SUSPEND_TASK_UINT.toInt()

// The used value is the highest possible bit fitting on 32 bits, so directly
// defining it as a signed integer causes the compiler to report an overflow.
// Use instead a private intermediary that assuringly has the correct type and
// cast it where necessary to the wanted final type, which preserves the
// desired information as-is in terms of integer representation.
public val PF_SUSPEND_TASK_UINT: CUint = 0x80000000u

public val CLONE_PIDFD: CInt = 0x1000

public val SCHED_FLAG_RESET_ON_FORK: CInt = 0x01

public val SCHED_FLAG_RECLAIM: CInt = 0x02

public val SCHED_FLAG_DL_OVERRUN: CInt = 0x04

public val SCHED_FLAG_KEEP_POLICY: CInt = 0x08

public val SCHED_FLAG_KEEP_PARAMS: CInt = 0x10

public val SCHED_FLAG_UTIL_CLAMP_MIN: CInt = 0x20

public val SCHED_FLAG_UTIL_CLAMP_MAX: CInt = 0x40

// linux/ifXdp.h
public val XDP_SHARED_UMEM: io.github.kotlinmania.libc.U16 = (1u shl 0).toUShort()

public val XDP_COPY: io.github.kotlinmania.libc.U16 = (1u shl 1).toUShort()

public val XDP_ZEROCOPY: io.github.kotlinmania.libc.U16 = (1u shl 2).toUShort()

public val XDP_USE_NEED_WAKEUP: io.github.kotlinmania.libc.U16 = (1u shl 3).toUShort()

public val XDP_USE_SG: io.github.kotlinmania.libc.U16 = (1u shl 4).toUShort()

public val XDP_UMEM_UNALIGNED_CHUNK_FLAG: io.github.kotlinmania.libc.U32 = 1u shl 0

public val XDP_RING_NEED_WAKEUP: io.github.kotlinmania.libc.U32 = 1u shl 0

public val XDP_MMAP_OFFSETS: CInt = 1

public val XDP_RX_RING: CInt = 2

public val XDP_TX_RING: CInt = 3

public val XDP_UMEM_REG: CInt = 4

public val XDP_UMEM_FILL_RING: CInt = 5

public val XDP_UMEM_COMPLETION_RING: CInt = 6

public val XDP_STATISTICS: CInt = 7

public val XDP_OPTIONS: CInt = 8

public val XDP_OPTIONS_ZEROCOPY: io.github.kotlinmania.libc.U32 = 1u shl 0

public val XDP_PGOFF_RX_RING: OffT = 0L

public val XDP_PGOFF_TX_RING: OffT = 0x80000000L

public val XDP_UMEM_PGOFF_FILL_RING: CUlonglong = 0x100000000uL

public val XDP_UMEM_PGOFF_COMPLETION_RING: CUlonglong = 0x180000000uL

public val XSK_UNALIGNED_BUF_OFFSET_SHIFT: CInt = 48

public val XSK_UNALIGNED_BUF_ADDR_MASK: CUlonglong = (1uL shl XSK_UNALIGNED_BUF_OFFSET_SHIFT) - 1uL

public val XDP_PKT_CONTD: io.github.kotlinmania.libc.U32 = 1u shl 0

public val XDP_UMEM_TX_SW_CSUM: io.github.kotlinmania.libc.U32 = 1u shl 1

public val XDP_UMEM_TX_METADATA_LEN: io.github.kotlinmania.libc.U32 = 1u shl 2

public val XDP_TXMD_FLAGS_TIMESTAMP: io.github.kotlinmania.libc.U32 = 1u shl 0

public val XDP_TXMD_FLAGS_CHECKSUM: io.github.kotlinmania.libc.U32 = 1u shl 1

public val XDP_TX_METADATA: io.github.kotlinmania.libc.U32 = 1u shl 1

public val SOL_XDP: CInt = 283

// linux/mount.h
public val MOUNT_ATTR_RDONLY: U64 = 0x00000001

public val MOUNT_ATTR_NOSUID: U64 = 0x00000002

public val MOUNT_ATTR_NODEV: U64 = 0x00000004

public val MOUNT_ATTR_NOEXEC: U64 = 0x00000008

public val MOUNT_ATTR__ATIME: U64 = 0x00000070

public val MOUNT_ATTR_RELATIME: U64 = 0x00000000

public val MOUNT_ATTR_NOATIME: U64 = 0x00000010

public val MOUNT_ATTR_STRICTATIME: U64 = 0x00000020

public val MOUNT_ATTR_NODIRATIME: U64 = 0x00000080

public val MOUNT_ATTR_IDMAP: U64 = 0x00100000

public val MOUNT_ATTR_NOSYMFOLLOW: U64 = 0x00200000

public val MOUNT_ATTR_SIZE_VER0: CInt = 32

public val SCHED_FLAG_KEEP_ALL: CInt = SCHED_FLAG_KEEP_POLICY or SCHED_FLAG_KEEP_PARAMS

public val SCHED_FLAG_UTIL_CLAMP: CInt = SCHED_FLAG_UTIL_CLAMP_MIN or SCHED_FLAG_UTIL_CLAMP_MAX

public val SCHED_FLAG_ALL: CInt = SCHED_FLAG_RESET_ON_FORK or SCHED_FLAG_RECLAIM or SCHED_FLAG_DL_OVERRUN or SCHED_FLAG_KEEP_ALL or SCHED_FLAG_UTIL_CLAMP

// ioctlEventpoll: added in Linux 6.9
public val EPIOCSPARAMS: Ioctl = 0x40088a01

public val EPIOCGPARAMS: Ioctl = 0x80088a02

// siginfo.h
public val SI_DETHREAD: CInt = -7

public val TRAP_PERF: CInt = 6

public fun sctpPrIndex(policy: CInt): CInt {
    return policy shr (4 - 1)
}

public fun sctpPrPolicy(policy: CInt): CInt {
    return policy and SCTP_PR_SCTP_MASK
}

public fun sctpPrSetPolicy(flags: CInt, policy: CInt) {
    var flags = flags
    flags = flags and SCTP_PR_SCTP_MASK.inv()
    flags = flags or policy
}

public fun soEeOffender(ee: io.github.kotlinmania.libc.SockExtendedErr?): Sockaddr? {
    return null
}

public fun tpacketAlign(x: Int): Int {
    return (x + TPACKET_ALIGNMENT - 1) and (TPACKET_ALIGNMENT - 1).inv()
}

public fun bpfClass(code: U32): U32 {
    return code and 0x07u
}

public fun bpfSize(code: U32): U32 {
    return code and 0x18u
}

public fun bpfMode(code: U32): U32 {
    return code and 0xe0u
}

public fun bpfOp(code: U32): U32 {
    return code and 0xf0u
}

public fun bpfSrc(code: U32): U32 {
    return code and 0x08u
}

public fun bpfRval(code: U32): U32 {
    return code and 0x18u
}

public fun bpfMiscop(code: U32): U32 {
    return code and 0xf8u
}

public fun bpfStmt(code: U16, k: U32): SockFilter {
    return Any(code = code, jt = 0, jf = 0, k = k)
}

public fun bpfJump(code: U16, k: U32, jt: U8, jf: U8): SockFilter {
    return Any(code = code, jt = jt, jf = jf, k = k)
}

public fun sunLen(s: SockaddrUn): Int {
    return run {
        val unused: Any?
        val data = null
        val ptr = data
        val fptr = addrOf(ptr.sunPath)
        val off = ((((fptr.toInt())).toLong() - (ptr.toInt()).toLong()).takeIf { it in Int.MIN_VALUE..Int.MAX_VALUE }?.toInt())!!
        check(off <= sizeOf<SockaddrUn>())
        off
    } + strlen(s.sunPath).toInt()
}

public fun sctpPrTtlEnabled(policy: CInt): Boolean {
    return policy == SCTP_PR_SCTP_TTL
}

public fun sctpPrRtxEnabled(policy: CInt): Boolean {
    return policy == SCTP_PR_SCTP_RTX
}

public fun sctpPrPrioEnabled(policy: CInt): Boolean {
    return policy == SCTP_PR_SCTP_PRIO
}

// Only `getspnamR` is implemented for musl, out of all of the reenterant
// functions from `shadow.h`.
// https://git.musl-libc.org/cgit/musl/tree/include/shadow.h
public expect fun getspnamR(name: String?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt

public expect fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqUnlink(name: String?): CInt

public expect fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt

public expect fun mqGetattr(mqd: MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt

public expect fun mrand48(): CLong

public expect fun seed48(xseed: CUshort?): CUshort?

public expect fun lcong48(p: CUshort?)

public expect fun lutimes(file: String?, times: Timeval?): CInt

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: String?): CInt

// System V IPC
public expect fun ftok(pathname: String?, projId: CInt): KeyT

public expect fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt

public expect fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT

public expect fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt

public expect fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT

public expect fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT

public expect fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT

public expect fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT

public expect fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt

public expect fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt

public expect fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt

public expect fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT

public expect fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT

public expect fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT

public expect fun removexattr(path: String?, name: String?): CInt

public expect fun lremovexattr(path: String?, name: String?): CInt

public expect fun fremovexattr(filedes: CInt, name: String?): CInt

public expect fun signalfd(fd: CInt, mask: SigsetT?, flags: CInt): CInt

public expect fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt

public expect fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt

public expect fun epollPwait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt, sigmask: SigsetT?): CInt

public expect fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt

public expect fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt

public expect fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt

public expect fun accept4(fd: CInt, addr: Sockaddr?, len: UInt?, flg: CInt): CInt

public expect fun reboot(howTo: CInt): CInt

public expect fun setfsgid(gid: GidT): CInt

public expect fun setfsuid(uid: UidT): CInt

// Not available now on Android
public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt

public expect fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun remapFilePages(addr: COpaquePointer?, size: SizeT, prot: CInt, pgoff: SizeT, flags: CInt): CInt

public expect fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt

public expect fun vhangup(): CInt

public expect fun sync()

public expect fun syncfs(fd: CInt): CInt

public expect fun syscall(num: CLong, vararg variadicArgs: Long): CLong

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt

public expect fun epollCreate(size: CInt): CInt

public expect fun epollCreate1(flags: CInt): CInt

public expect fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt

public expect fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt

public expect fun unshare(flags: CInt): CInt

public expect fun umount(target: String?): CInt

public expect fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT

public expect fun splice(fdIn: CInt, offIn: CLonglong?, fdOut: CInt, offOut: CLonglong?, len: SizeT, flags: CUint): SsizeT

public expect fun eventfd(initval: CUint, flags: CInt): CInt

public expect fun eventfdRead(fd: CInt, value: ULong?): CInt

public expect fun eventfdWrite(fd: CInt, value: EventfdT): CInt

public expect fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt

public expect fun schedSetparam(pid: PidT, param: SchedParam?): CInt

public expect fun setns(fd: CInt, nstype: CInt): CInt

public expect fun swapoff(path: String?): CInt

public expect fun vmsplice(fd: CInt, iov: Iovec?, nrSegs: SizeT, flags: CUint): SsizeT

public expect fun personality(persona: CUlong): CInt

public expect fun schedGetparam(pid: PidT, param: SchedParam?): CInt

public expect fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt

public expect fun umount2(target: String?, flags: CInt): CInt

public expect fun swapon(path: String?, swapflags: CInt): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt

public expect fun sendfile(outFd: CInt, inFd: CInt, offset: OffT?, count: SizeT): SsizeT

public expect fun sigaltstack(ss: StackT?, oss: StackT?): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt

public expect fun posixSpawn(pid: PidT?, path: String?, fileActions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnp(pid: PidT?, file: String?, fileActions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt

public expect fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt

public expect fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt

public expect fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt

public expect fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt

public expect fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt

public expect fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt

public expect fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt

public expect fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt

public expect fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt

public expect fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt

public expect fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt

public expect fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt

public expect fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt

public expect fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT

public expect fun inotifyRmWatch(fd: CInt, wd: CInt): CInt

public expect fun inotifyInit(): CInt

public expect fun inotifyInit1(flags: CInt): CInt

public expect fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt

public expect fun fanotifyInit(flags: CUint, eventFFlags: CUint): CInt

public expect fun gethostid(): CLong

public expect fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt

public expect fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt

public expect fun fgetpos64(stream: FILE?, ptr: Fpos64T?): CInt

public expect fun fopen64(filename: String?, mode: String?): FILE?

public expect fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt

public expect fun sendfile64(outFd: CInt, inFd: CInt, offset: Long?, count: SizeT): SsizeT

public expect fun tmpfile64(): FILE?
