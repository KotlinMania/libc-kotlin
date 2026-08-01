// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.ENODATA
import io.github.kotlinmania.libc.unix.linuxlike.IPC_STAT
import io.github.kotlinmania.libc.unix.linuxlike.MSG_FIN
import io.github.kotlinmania.libc.unix.linuxlike.NLMSG_MIN_TYPE
import io.github.kotlinmania.libc.unix.linuxlike.O_CLOEXEC
import io.github.kotlinmania.libc.unix.linuxlike.O_EXCL
import io.github.kotlinmania.libc.unix.linuxlike._IO
import io.github.kotlinmania.libc.unix.linuxlike.ioctlCode
import io.github.kotlinmania.libc.unix.linuxlike.ioReadCode
import io.github.kotlinmania.libc.unix.linuxlike.ioWriteCode
import io.github.kotlinmania.libc.unix.linuxlike.ioReadWriteCode
import io.github.kotlinmania.libc.unix.linuxlike.T_TYPE
import io.github.kotlinmania.libc.unix.linuxlike.cmsgAlign

public const val NLMSG_OVERRUN: CInt = 0x4
public typealias DevT = ULong
public typealias SocklenT = UInt
public typealias ModeT = UInt
public typealias Ino64T = ULong
public typealias Off64T = Long
public typealias Blkcnt64T = Long
public typealias Rlim64T = ULong
public typealias MqdT = CInt
public typealias NfdsT = CULong
public typealias NlItem = CInt
public typealias IdtypeT = CUInt
public typealias LoffT = CLongLong
public typealias PthreadKeyT = CUInt
public typealias PthreadOnceT = CInt
public typealias PthreadSpinlockT = CInt
public typealias KernelFsidT = CAnonymousKernelFsidT
public typealias KernelClockidT = CInt
public typealias U8 = CUChar
public typealias U16 = CUShort
public typealias S16 = CShort
public typealias U32 = CUInt
public typealias S32 = CInt
public typealias SctpAssocT = S32
public typealias EventfdT = ULong

public enum class TpacketVersions(
    public val value: UInt,
) {
    TPACKET_V1(0u),
    TPACKET_V2(1u),
    TPACKET_V3(2u),
}

public data class Dqblk(
    val dqbBhardlimit: ULong,
    val dqbBsoftlimit: ULong,
    val dqbCurspace: ULong,
    val dqbIhardlimit: ULong,
    val dqbIsoftlimit: ULong,
    val dqbCurinodes: ULong,
    val dqbBtime: ULong,
    val dqbItime: ULong,
    val dqbValid: UInt,
)

public data class SignalfdSiginfo(
    val ssiSigno: UInt,
    val ssiErrno: Int,
    val ssiCode: Int,
    val ssiPid: UInt,
    val ssiUid: UInt,
    val ssiFd: Int,
    val ssiTid: UInt,
    val ssiBand: UInt,
    val ssiOverrun: UInt,
    val ssiTrapno: UInt,
    val ssiStatus: Int,
    val ssiInt: Int,
    val ssiPtr: ULong,
    val ssiUtime: ULong,
    val ssiStime: ULong,
    val ssiAddr: ULong,
    val ssiAddrLsb: UShort,
    val ssiSyscall: Int,
    val ssiCallAddr: ULong,
    val ssiArch: UInt,
)

public data class FanoutArgs(
    val id: U16,
    val typeFlags: U16,
    val id2: U16,
    val maxNumMembers: U32,
)

public data class SockaddrPkt(
    val spktFamily: CUShort,
    val spktDevice: UByteArray,
    val spktProtocol: CUShort,
)

public data class TpacketAuxdata(
    val tpStatus: U32,
    val tpLen: U32,
    val tpSnaplen: U32,
    val tpMac: U16,
    val tpNet: U16,
    val tpVlanTci: U16,
    val tpVlanTpid: U16,
)

public data class TpacketHdr(
    val tpStatus: CULong,
    val tpLen: CUInt,
    val tpSnaplen: CUInt,
    val tpMac: CUShort,
    val tpNet: CUShort,
    val tpSec: CUInt,
    val tpUsec: CUInt,
)

public data class TpacketHdrVariant1(
    val tpRxhash: U32,
    val tpVlanTci: U32,
    val tpVlanTpid: U16,
    val tpPadding: U16,
)

public data class Tpacket2Hdr(
    val tpStatus: U32,
    val tpLen: U32,
    val tpSnaplen: U32,
    val tpMac: U16,
    val tpNet: U16,
    val tpSec: U32,
    val tpNsec: U32,
    val tpVlanTci: U16,
    val tpVlanTpid: U16,
    val tpPadding: List<U8>,
)

public data class TpacketReq(
    val tpBlockSize: CUInt,
    val tpBlockNr: CUInt,
    val tpFrameSize: CUInt,
    val tpFrameNr: CUInt,
)

public data class TpacketReq3(
    val tpBlockSize: CUInt,
    val tpBlockNr: CUInt,
    val tpFrameSize: CUInt,
    val tpFrameNr: CUInt,
    val tpRetireBlkTov: CUInt,
    val tpSizeofPriv: CUInt,
    val tpFeatureReqWord: CUInt,
)

public data class TpacketRolloverStats(
    val tpAll: U64,
    val tpHuge: U64,
    val tpFailed: U64,
)

public data class TpacketStats(
    val tpPackets: CUInt,
    val tpDrops: CUInt,
)

public data class TpacketStatsV3(
    val tpPackets: CUInt,
    val tpDrops: CUInt,
    val tpFreezeQCnt: CUInt,
)

public data class Tpacket3Hdr(
    val tpNextOffset: U32,
    val tpSec: U32,
    val tpNsec: U32,
    val tpSnaplen: U32,
    val tpLen: U32,
    val tpStatus: U32,
    val tpMac: U16,
    val tpNet: U16,
    val hv1: TpacketHdrVariant1,
    val tpPadding: List<U8>,
)

public data class TpacketBdTs(
    val tsSec: CUInt,
    val tsUsec: CUInt,
)

public data class TpacketHdrV1(
    val blockStatus: U32,
    val numPkts: U32,
    val offsetToFirstPkt: U32,
    val blkLen: U32,
    val seqNum: U64,
    val tsFirstPkt: TpacketBdTs,
    val tsLastPkt: TpacketBdTs,
)

public data class Msginfo(
    val msgpool: CInt,
    val msgmap: CInt,
    val msgmax: CInt,
    val msgmnb: CInt,
    val msgmni: CInt,
    val msgssz: CInt,
    val msgtql: CInt,
    val msgseg: CUShort,
)

public data class InputEvent(
    val time: Timeval,
    val inputEventSec: CULong,
    val inputEventUsec: CULong,
    val type: U16,
    val code: U16,
    val value: S32,
)

public data class InputId(
    val bustype: U16,
    val vendor: U16,
    val product: U16,
    val version: U16,
)

public data class InputAbsinfo(
    val value: S32,
    val minimum: S32,
    val maximum: S32,
    val fuzz: S32,
    val flat: S32,
    val resolution: S32,
)

public data class InputKeymapEntry(
    val flags: U8,
    val len: U8,
    val index: U16,
    val keycode: U32,
    val scancode: List<U8>,
)

public data class InputMask(
    val type: U32,
    val codesSize: U32,
    val codesPtr: U64,
)

public data class FfReplay(
    val length: U16,
    val delay: U16,
)

public data class FfTrigger(
    val button: U16,
    val interval: U16,
)

public data class FfEnvelope(
    val attackLength: U16,
    val attackLevel: U16,
    val fadeLength: U16,
    val fadeLevel: U16,
)

public data class FfConstantEffect(
    val level: S16,
    val envelope: FfEnvelope,
)

public data class FfRampEffect(
    val startLevel: S16,
    val endLevel: S16,
    val envelope: FfEnvelope,
)

public data class FfConditionEffect(
    val rightSaturation: U16,
    val leftSaturation: U16,
    val rightCoeff: S16,
    val leftCoeff: S16,
    val deadband: U16,
    val center: S16,
)

public data class FfPeriodicEffect(
    val waveform: U16,
    val period: U16,
    val magnitude: S16,
    val offset: S16,
    val phase: U16,
    val envelope: FfEnvelope,
    val customLen: U32,
    val customData: S16?,
)

public data class FfRumbleEffect(
    val strongMagnitude: U16,
    val weakMagnitude: U16,
)

public data class FfEffect(
    val type: U16,
    val id: S16,
    val direction: U16,
    val trigger: FfTrigger,
    val replay: FfReplay,
    val u: ULongArray,
    val u2: UIntArray,
)

public data class UinputFfUpload(
    val requestId: U32,
    val retval: S32,
    val effect: FfEffect,
    val old: FfEffect,
)

public data class UinputFfErase(
    val requestId: U32,
    val retval: S32,
    val effectId: U32,
)

public data class UinputAbsSetup(
    val code: U16,
    val absinfo: InputAbsinfo,
)

public data class CAnonymousKernelFsidT(
    val `val`: IntArray,
)

public data class PosixSpawnFileActionsT(
    val allocated: CInt,
    val used: CInt,
    val actions: CInt?,
)

public data class PosixSpawnattrT(
    val flags: CShort,
    val pgrp: PidT,
    val sd: SigsetT,
    val ss: SigsetT,
    val prio: CInt,
    val sp: SchedParam,
    val policy: CInt,
)

public data class Genlmsghdr(
    val cmd: UByte,
    val version: UByte,
    val reserved: UShort,
)

public data class InotifyEvent(
    val wd: CInt,
    val mask: UInt,
    val cookie: UInt,
    val len: UInt,
)

public data class FanotifyResponse(
    val fd: CInt,
    val response: U32,
)

public data class FanotifyEventInfoHeader(
    val infoType: U8,
    val pad: U8,
    val len: U16,
)

public data class FanotifyEventInfoFid(
    val hdr: FanotifyEventInfoHeader,
    val fsid: KernelFsidT,
    val handle: UByteArray,
)

public data class SockaddrVm(
    val svmFamily: SaFamilyT,
    val svmReserved1: CUShort,
    val svmPort: CUInt,
    val svmCid: CUInt,
    val svmZero: UByteArray,
)

public data class SockExtendedErr(
    val eeErrno: UInt,
    val eeOrigin: UByte,
    val eeType: UByte,
    val eeCode: UByte,
    val eePad: UByte,
    val eeInfo: UInt,
    val eeData: UInt,
)

public data class SeccompData(
    val nr: CInt,
    val arch: U32,
    val instructionPointer: U64,
    val args: List<U64>,
)

public data class SeccompNotifSizes(
    val seccompNotif: U16,
    val seccompNotifResp: U16,
    val seccompData: U16,
)

public data class SeccompNotif(
    val id: U64,
    val pid: U32,
    val flags: U32,
    val data: SeccompData,
)

public data class SeccompNotifResp(
    val id: U64,
    val `val`: S64,
    val error: S32,
    val flags: U32,
)

public data class SeccompNotifAddfd(
    val id: U64,
    val flags: U32,
    val srcfd: U32,
    val newfd: U32,
    val newfdFlags: U32,
)

public data class In6Ifreq(
    val ifr6Addr: In6Addr,
    val ifr6Prefixlen: UInt,
    val ifr6Ifindex: CInt,
)

public data class OpenHow(
    val flags: U64,
    val mode: U64,
    val resolve: U64,
)

public data class PtpClockTime(
    val sec: S64,
    val nsec: U32,
    val reserved: U32,
)

public data class PtpExttsRequest(
    val index: CUInt,
    val flags: CUInt,
    val rsv: UIntArray,
)

public data class PtpSysOffsetExtended(
    val nSamples: CUInt,
    val clockid: KernelClockidT,
    val rsv: UIntArray,
    val ts: List<PtpClockTime>,
)

public data class PtpSysOffsetPrecise(
    val device: PtpClockTime,
    val sysRealtime: PtpClockTime,
    val sysMonoraw: PtpClockTime,
    val rsv: UIntArray,
)

public data class PtpExttsEvent(
    val t: PtpClockTime,
    val index: CUInt,
    val flags: CUInt,
    val rsv: UIntArray,
)

public data class SctpInitmsg(
    val sinitNumOstreams: U16,
    val sinitMaxInstreams: U16,
    val sinitMaxAttempts: U16,
    val sinitMaxInitTimeo: U16,
)

public data class SctpSndrcvinfo(
    val sinfoStream: U16,
    val sinfoSsn: U16,
    val sinfoFlags: U16,
    val sinfoPpid: U32,
    val sinfoContext: U32,
    val sinfoTimetolive: U32,
    val sinfoTsn: U32,
    val sinfoCumtsn: U32,
    val sinfoAssocId: SctpAssocT,
)

public data class SctpSndinfo(
    val sndSid: U16,
    val sndFlags: U16,
    val sndPpid: U32,
    val sndContext: U32,
    val sndAssocId: SctpAssocT,
)

public data class SctpRcvinfo(
    val rcvSid: U16,
    val rcvSsn: U16,
    val rcvFlags: U16,
    val rcvPpid: U32,
    val rcvTsn: U32,
    val rcvCumtsn: U32,
    val rcvContext: U32,
    val rcvAssocId: SctpAssocT,
)

public data class SctpNxtinfo(
    val nxtSid: U16,
    val nxtFlags: U16,
    val nxtPpid: U32,
    val nxtLength: U32,
    val nxtAssocId: SctpAssocT,
)

public data class SctpPrinfo(
    val prPolicy: U16,
    val prValue: U32,
)

public data class SctpAuthinfo(
    val authKeynumber: U16,
)

public data class TlsCryptoInfo(
    val version: U16,
    val cipherType: U16,
)

public data class Tls12CryptoInfoAesGcm128(
    val info: TlsCryptoInfo,
    val iv: UByteArray,
    val key: UByteArray,
    val salt: UByteArray,
    val recSeq: UByteArray,
)

public data class Tls12CryptoInfoAesGcm256(
    val info: TlsCryptoInfo,
    val iv: UByteArray,
    val key: UByteArray,
    val salt: UByteArray,
    val recSeq: UByteArray,
)

public data class Tls12CryptoInfoAesCcm128(
    val info: TlsCryptoInfo,
    val iv: UByteArray,
    val key: UByteArray,
    val salt: UByteArray,
    val recSeq: UByteArray,
)

public data class Tls12CryptoInfoChacha20Poly1305(
    val info: TlsCryptoInfo,
    val iv: UByteArray,
    val key: UByteArray,
    val salt: UByteArray,
    val recSeq: UByteArray,
)

public data class Tls12CryptoInfoSm4Gcm(
    val info: TlsCryptoInfo,
    val iv: UByteArray,
    val key: UByteArray,
    val salt: UByteArray,
    val recSeq: UByteArray,
)

public data class Tls12CryptoInfoSm4Ccm(
    val info: TlsCryptoInfo,
    val iv: UByteArray,
    val key: UByteArray,
    val salt: UByteArray,
    val recSeq: UByteArray,
)

public data class Tls12CryptoInfoAriaGcm128(
    val info: TlsCryptoInfo,
    val iv: UByteArray,
    val key: UByteArray,
    val salt: UByteArray,
    val recSeq: UByteArray,
)

public data class Tls12CryptoInfoAriaGcm256(
    val info: TlsCryptoInfo,
    val iv: UByteArray,
    val key: UByteArray,
    val salt: UByteArray,
    val recSeq: UByteArray,
)

public data class IwParam(
    val value: S32,
    val fixed: U8,
    val disabled: U8,
    val flags: U16,
)

public data class IwPoint(
    val pointer: COpaquePointer?,
    val length: U16,
    val flags: U16,
)

public data class IwFreq(
    val m: S32,
    val e: S16,
    val i: U8,
    val flags: U8,
)

public data class IwQuality(
    val qual: U8,
    val level: U8,
    val noise: U8,
    val updated: U8,
)

public data class IwDiscarded(
    val nwid: U32,
    val code: U32,
    val fragment: U32,
    val retries: U32,
    val pubmisc: U32,
)

public data class IwMissed(
    val beacon: U32,
)

public data class IwScanReq(
    val scanType: U8,
    val essidLen: U8,
    val numChannels: U8,
    val flags: U8,
    val bssid: Sockaddr,
    val essid: List<U8>,
    val minChannelTime: U32,
    val maxChannelTime: U32,
    val channelList: List<IwFreq>,
)

public data class IwEncodeExt(
    val extFlags: U32,
    val txSeq: List<U8>,
    val rxSeq: List<U8>,
    val addr: Sockaddr,
    val alg: U16,
    val keyLen: U16,
    val key: List<U8>,
)

public data class IwPmksa(
    val cmd: U32,
    val bssid: Sockaddr,
    val pmkid: List<U8>,
)

public data class IwPmkidCand(
    val flags: U32,
    val index: U32,
    val bssid: Sockaddr,
)

public data class IwStatistics(
    val status: U16,
    val qual: IwQuality,
    val discard: IwDiscarded,
    val miss: IwMissed,
)

public data class IwRange(
    val throughput: U32,
    val minNwid: U32,
    val maxNwid: U32,
    val oldNumChannels: U16,
    val oldNumFrequency: U8,
    val scanCapa: U8,
    val eventCapa: List<U32>,
    val sensitivity: S32,
    val maxQual: IwQuality,
    val avgQual: IwQuality,
    val numBitrates: U8,
    val bitrate: List<S32>,
    val minRts: S32,
    val maxRts: S32,
    val minFrag: S32,
    val maxFrag: S32,
    val minPmp: S32,
    val maxPmp: S32,
    val minPmt: S32,
    val maxPmt: S32,
    val pmpFlags: U16,
    val pmtFlags: U16,
    val pmCapa: U16,
    val encodingSize: List<U16>,
    val numEncodingSizes: U8,
    val maxEncodingTokens: U8,
    val encodingLoginIndex: U8,
    val txpowerCapa: U16,
    val numTxpower: U8,
    val txpower: List<S32>,
    val weVersionCompiled: U8,
    val weVersionSource: U8,
    val retryCapa: U16,
    val retryFlags: U16,
    val rTimeFlags: U16,
    val minRetry: S32,
    val maxRetry: S32,
    val minRTime: S32,
    val maxRTime: S32,
    val numChannels: U16,
    val numFrequency: U8,
    val freq: List<IwFreq>,
    val encCapa: U32,
)

public data class IwPrivArgs(
    val cmd: U32,
    val setArgs: U16,
    val getArgs: U16,
    val name: ByteArray,
)

public data class EpollParams(
    val busyPollUsecs: UInt,
    val busyPollBudget: UShort,
    val preferBusyPoll: UByte,
    val pad: UByte,
)

public data class PthreadMutexattrT(
    val size: UByteArray,
)

public data class PthreadRwlockattrT(
    val size: UByteArray,
)

public data class PthreadCondattrT(
    val size: UByteArray,
)

public data class PthreadBarrierattrT(
    val size: UByteArray,
)

public data class FanotifyEventMetadata(
    val eventLen: U32,
    val vers: U8,
    val reserved: U8,
    val metadataLen: U16,
    val mask: U64,
    val fd: CInt,
    val pid: CInt,
)

public data class PtpSysOffset(
    val nSamples: CUInt,
    val rsv: UIntArray,
    val ts: List<PtpClockTime>,
)

public data class PtpPinDesc(
    val name: ByteArray,
    val index: CUInt,
    val func: CUInt,
    val chan: CUInt,
    val rsv: UIntArray,
)

public data class PtpClockCaps(
    val maxAdj: CInt,
    val nAlarm: CInt,
    val nExtTs: CInt,
    val nPerOut: CInt,
    val pps: CInt,
    val nPins: CInt,
    val crossTimestamping: CInt,
    val adjustPhase: CInt,
    val maxPhaseAdj: CInt,
    val rsv: IntArray,
)

public data class SockaddrXdp(
    val sxdpFamily: U16,
    val sxdpFlags: U16,
    val sxdpIfindex: U32,
    val sxdpQueueId: U32,
    val sxdpSharedUmemFd: U32,
)

public data class XdpRingOffset(
    val producer: U64,
    val consumer: U64,
    val desc: U64,
    val flags: U64,
)

public data class XdpMmapOffsets(
    val rx: XdpRingOffset,
    val tx: XdpRingOffset,
    val fr: XdpRingOffset,
    val cr: XdpRingOffset,
)

public data class XdpRingOffsetV1(
    val producer: U64,
    val consumer: U64,
    val desc: U64,
)

public data class XdpMmapOffsetsV1(
    val rx: XdpRingOffsetV1,
    val tx: XdpRingOffsetV1,
    val fr: XdpRingOffsetV1,
    val cr: XdpRingOffsetV1,
)

public data class XdpUmemReg(
    val addr: U64,
    val len: U64,
    val chunkSize: U32,
    val headroom: U32,
    val flags: U32,
    val txMetadataLen: U32,
)

public data class XdpUmemRegV1(
    val addr: U64,
    val len: U64,
    val chunkSize: U32,
    val headroom: U32,
)

public data class XdpStatistics(
    val rxDropped: U64,
    val rxInvalidDescs: U64,
    val txInvalidDescs: U64,
    val rxRingFull: U64,
    val rxFillRingEmptyDescs: U64,
    val txRingEmptyDescs: U64,
)

public data class XdpStatisticsV1(
    val rxDropped: U64,
    val rxInvalidDescs: U64,
    val txInvalidDescs: U64,
)

public data class XdpOptions(
    val flags: U32,
)

public data class XdpDesc(
    val addr: U64,
    val len: U32,
    val options: U32,
)

public data class XskTxMetadataCompletion(
    val txTimestamp: U64,
)

public data class XskTxMetadataRequest(
    val csumStart: U16,
    val csumOffset: U16,
)

public data class MountAttr(
    val attrSet: U64,
    val attrClr: U64,
    val propagation: U64,
    val usernsFd: U64,
)

public data class MntNsInfo(
    val size: U32,
    val nrMounts: U32,
    val mntNsId: U64,
)

public data class PidfdInfo(
    val mask: U64,
    val cgroupid: U64,
    val pid: U32,
    val tgid: U32,
    val ppid: U32,
    val ruid: U32,
    val rgid: U32,
    val euid: U32,
    val egid: U32,
    val suid: U32,
    val sgid: U32,
    val fsuid: U32,
    val fsgid: U32,
    val exitCode: S32,
)

public data class DmabufCmsg(
    val fragOffset: U64,
    val fragSize: U32,
    val fragToken: U32,
    val dmabufId: U32,
    val flags: U32,
)

public data class DmabufToken(
    val tokenStart: U32,
    val tokenCount: U32,
)

public data class SockaddrAlg(
    val salgFamily: SaFamilyT,
    val salgType: UByteArray,
    val salgFeat: UInt,
    val salgMask: UInt,
    val salgName: UByteArray,
)

public data class PthreadCondT(
    val size: UByteArray,
)

public data class PthreadMutexT(
    val size: ByteArray,
)

public data class PthreadRwlockT(
    val size: UByteArray,
)

public data class PthreadBarrierT(
    val size: UByteArray,
)

public data class UinputSetup(
    val id: InputId,
    val name: ByteArray,
    val ffEffectsMax: U32,
)

public data class UinputUserDev(
    val name: ByteArray,
    val id: InputId,
    val ffEffectsMax: U32,
    val absmax: List<S32>,
    val absmin: List<S32>,
    val absfuzz: List<S32>,
    val absflat: List<S32>,
)

public data class MqAttr(
    val mqFlags: Long,
    val mqMaxmsg: Long,
    val mqMsgsize: Long,
    val mqCurmsgs: Long,
    val mqFlags2: CLong,
    val mqMaxmsg2: CLong,
    val mqMsgsize2: CLong,
    val mqCurmsgs2: CLong,
)

public data class HwtstampConfig(
    val flags: CInt,
    val txType: CInt,
    val rxFilter: CInt,
)

public data class SchedAttr(
    val size: U32,
    val schedPolicy: U32,
    val schedFlags: U64,
    val schedNice: S32,
    val schedPriority: U32,
    val schedRuntime: U64,
    val schedDeadline: U64,
    val schedPeriod: U64,
)

public data class IwThrspy(
    val addr: Sockaddr,
    val qual: IwQuality,
    val low: IwQuality,
    val high: IwQuality,
)

public data class IwMlme(
    val cmd: U16,
    val reasonCode: U16,
    val addr: Sockaddr,
)

public data class IwMichaelmicfailure(
    val flags: U32,
    val srcAddr: Sockaddr,
    val tsc: List<U8>,
)

public data class AfAlgIv(
    val ivlen: UInt,
    val iv: UByteArray,
)

public data class TpacketBlockDesc(
    val version: U32,
    val offsetToPriv: U32,
    val hdr: TpacketBdHeaderU,
)

public data class SockTxtime(
    val clockid: ClockidT,
    val flags: U32,
)

public data class IwEvent(
    val len: U16,
    val cmd: U16,
    val u: IwreqData,
)

public data class Iwreq(
    val ifrIfrn: CAnonymousIwreq,
    val u: IwreqData,
)

public data class PtpPeroutRequest(
    val anonymous1: CAnonymousPtpPeroutRequest1,
    val period: PtpClockTime,
    val index: CUInt,
    val flags: CUInt,
    val anonymous2: CAnonymousPtpPeroutRequest2,
)

public data class XskTxMetadata(
    val flags: U64,
    val xskTxMetadataUnion: CAnonymousXskTxMetadataUnion,
)

// C union; only one variant is valid at a time.
public data class TpacketReqU(
    val req: TpacketReq? = null,
    val req3: TpacketReq3? = null,
)

// C union; only one variant is valid at a time.
public data class TpacketBdHeaderU(
    val bh1: TpacketHdrV1? = null,
)

// C union; only one variant is valid at a time.
public data class IwreqData(
    val name: ByteArray? = null,
    val essid: IwPoint? = null,
    val nwid: IwParam? = null,
    val freq: IwFreq? = null,
    val sens: IwParam? = null,
    val bitrate: IwParam? = null,
    val txpower: IwParam? = null,
    val rts: IwParam? = null,
    val frag: IwParam? = null,
    val mode: U32? = null,
    val retry: IwParam? = null,
    val encoding: IwPoint? = null,
    val power: IwParam? = null,
    val qual: IwQuality? = null,
    val apAddr: Sockaddr? = null,
    val addr: Sockaddr? = null,
    val param: IwParam? = null,
    val data: IwPoint? = null,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIwreq(
    val ifrnName: ByteArray? = null,
)

// C union; only one variant is valid at a time.
public data class CAnonymousPtpPeroutRequest1(
    val start: PtpClockTime? = null,
    val phase: PtpClockTime? = null,
)

// C union; only one variant is valid at a time.
public data class CAnonymousPtpPeroutRequest2(
    val on: PtpClockTime? = null,
    val rsv: UIntArray? = null,
)

// C union; only one variant is valid at a time.
public data class CAnonymousXskTxMetadataUnion(
    val request: XskTxMetadataRequest? = null,
    val completion: XskTxMetadataCompletion? = null,
)

public typealias PidType = CUInt

public const val PIDTYPE_PID: PidType = 0u
public const val PIDTYPE_TGID: PidType = 1u
public const val PIDTYPE_PGID: PidType = 2u
public const val PIDTYPE_SID: PidType = 3u
public const val PIDTYPE_MAX: PidType = 4u
public typealias ProcCnMcastOp = CUInt

public const val PROC_CN_MCAST_LISTEN: ProcCnMcastOp = 1u
public const val PROC_CN_MCAST_IGNORE: ProcCnMcastOp = 2u
public typealias ProcCnEvent = CUInt

public const val PROC_EVENT_NONE: ProcCnEvent = 0x00000000u
public const val PROC_EVENT_FORK: ProcCnEvent = 0x00000001u
public const val PROC_EVENT_EXEC: ProcCnEvent = 0x00000002u
public const val PROC_EVENT_UID: ProcCnEvent = 0x00000004u
public const val PROC_EVENT_GID: ProcCnEvent = 0x00000040u
public const val PROC_EVENT_SID: ProcCnEvent = 0x00000080u
public const val PROC_EVENT_PTRACE: ProcCnEvent = 0x00000100u
public const val PROC_EVENT_COMM: ProcCnEvent = 0x00000200u
public const val PROC_EVENT_NONZERO_EXIT: ProcCnEvent = 0x20000000u
public const val PROC_EVENT_COREDUMP: ProcCnEvent = 0x40000000u
public const val PROC_EVENT_EXIT: ProcCnEvent = 0x80000000u

public const val POSIX_SPAWN_USEVFORK: CInt = 64
public const val POSIX_SPAWN_SETSID: CInt = 128
public const val F_SEAL_FUTURE_WRITE: CInt = 0x0010
public const val F_SEAL_EXEC: CInt = 0x0020
public const val IFF_LOWER_UP: CInt = 0x10000
public const val IFF_DORMANT: CInt = 0x20000
public const val IFF_ECHO: CInt = 0x40000
public const val AT_EXECVE_CHECK: CInt = 0x10000
public val IFA_UNSPEC: CUShort = (0).toUShort()
public val IFA_ADDRESS: CUShort = (1).toUShort()
public val IFA_LOCAL: CUShort = (2).toUShort()
public val IFA_LABEL: CUShort = (3).toUShort()
public val IFA_BROADCAST: CUShort = (4).toUShort()
public val IFA_ANYCAST: CUShort = (5).toUShort()
public val IFA_CACHEINFO: CUShort = (6).toUShort()
public val IFA_MULTICAST: CUShort = (7).toUShort()
public val IFA_FLAGS: CUShort = (8).toUShort()
public const val IFA_F_SECONDARY: UInt = 0x01u
public const val IFA_F_TEMPORARY: UInt = 0x01u
public const val IFA_F_NODAD: UInt = 0x02u
public const val IFA_F_OPTIMISTIC: UInt = 0x04u
public const val IFA_F_DADFAILED: UInt = 0x08u
public const val IFA_F_HOMEADDRESS: UInt = 0x10u
public const val IFA_F_DEPRECATED: UInt = 0x20u
public const val IFA_F_TENTATIVE: UInt = 0x40u
public const val IFA_F_PERMANENT: UInt = 0x80u
public const val IFA_F_MANAGETEMPADDR: UInt = 0x100u
public const val IFA_F_NOPREFIXROUTE: UInt = 0x200u
public const val IFA_F_MCAUTOJOIN: UInt = 0x400u
public const val IFA_F_STABLE_PRIVACY: UInt = 0x800u
public const val RWF_HIPRI: CInt = 0x00000001
public const val RWF_DSYNC: CInt = 0x00000002
public const val RWF_SYNC: CInt = 0x00000004
public const val RWF_NOWAIT: CInt = 0x00000008
public const val RWF_APPEND: CInt = 0x00000010
public const val RWF_NOAPPEND: CInt = 0x00000020
public const val RWF_ATOMIC: CInt = 0x00000040
public const val RWF_DONTCACHE: CInt = 0x00000080
public val IFLA_UNSPEC: CUShort = (0).toUShort()
public val IFLA_ADDRESS: CUShort = (1).toUShort()
public val IFLA_BROADCAST: CUShort = (2).toUShort()
public val IFLA_IFNAME: CUShort = (3).toUShort()
public val IFLA_MTU: CUShort = (4).toUShort()
public val IFLA_LINK: CUShort = (5).toUShort()
public val IFLA_QDISC: CUShort = (6).toUShort()
public val IFLA_STATS: CUShort = (7).toUShort()
public val IFLA_COST: CUShort = (8).toUShort()
public val IFLA_PRIORITY: CUShort = (9).toUShort()
public val IFLA_MASTER: CUShort = (10).toUShort()
public val IFLA_WIRELESS: CUShort = (11).toUShort()
public val IFLA_PROTINFO: CUShort = (12).toUShort()
public val IFLA_TXQLEN: CUShort = (13).toUShort()
public val IFLA_MAP: CUShort = (14).toUShort()
public val IFLA_WEIGHT: CUShort = (15).toUShort()
public val IFLA_OPERSTATE: CUShort = (16).toUShort()
public val IFLA_LINKMODE: CUShort = (17).toUShort()
public val IFLA_LINKINFO: CUShort = (18).toUShort()
public val IFLA_NET_NS_PID: CUShort = (19).toUShort()
public val IFLA_IFALIAS: CUShort = (20).toUShort()
public val IFLA_NUM_VF: CUShort = (21).toUShort()
public val IFLA_VFINFO_LIST: CUShort = (22).toUShort()
public val IFLA_STATS64: CUShort = (23).toUShort()
public val IFLA_VF_PORTS: CUShort = (24).toUShort()
public val IFLA_PORT_SELF: CUShort = (25).toUShort()
public val IFLA_AF_SPEC: CUShort = (26).toUShort()
public val IFLA_GROUP: CUShort = (27).toUShort()
public val IFLA_NET_NS_FD: CUShort = (28).toUShort()
public val IFLA_EXT_MASK: CUShort = (29).toUShort()
public val IFLA_PROMISCUITY: CUShort = (30).toUShort()
public val IFLA_NUM_TX_QUEUES: CUShort = (31).toUShort()
public val IFLA_NUM_RX_QUEUES: CUShort = (32).toUShort()
public val IFLA_CARRIER: CUShort = (33).toUShort()
public val IFLA_PHYS_PORT_ID: CUShort = (34).toUShort()
public val IFLA_CARRIER_CHANGES: CUShort = (35).toUShort()
public val IFLA_PHYS_SWITCH_ID: CUShort = (36).toUShort()
public val IFLA_LINK_NETNSID: CUShort = (37).toUShort()
public val IFLA_PHYS_PORT_NAME: CUShort = (38).toUShort()
public val IFLA_PROTO_DOWN: CUShort = (39).toUShort()
public val IFLA_GSO_MAX_SEGS: CUShort = (40).toUShort()
public val IFLA_GSO_MAX_SIZE: CUShort = (41).toUShort()
public val IFLA_PAD: CUShort = (42).toUShort()
public val IFLA_XDP: CUShort = (43).toUShort()
public val IFLA_EVENT: CUShort = (44).toUShort()
public val IFLA_NEW_NETNSID: CUShort = (45).toUShort()
public val IFLA_IF_NETNSID: CUShort = (46).toUShort()
public val IFLA_TARGET_NETNSID: CUShort = IFLA_IF_NETNSID
public val IFLA_CARRIER_UP_COUNT: CUShort = (47).toUShort()
public val IFLA_CARRIER_DOWN_COUNT: CUShort = (48).toUShort()
public val IFLA_NEW_IFINDEX: CUShort = (49).toUShort()
public val IFLA_MIN_MTU: CUShort = (50).toUShort()
public val IFLA_MAX_MTU: CUShort = (51).toUShort()
public val IFLA_PROP_LIST: CUShort = (52).toUShort()
public val IFLA_ALT_IFNAME: CUShort = (53).toUShort()
public val IFLA_PERM_ADDRESS: CUShort = (54).toUShort()
public val IFLA_PROTO_DOWN_REASON: CUShort = (55).toUShort()
public val IFLA_PARENT_DEV_NAME: CUShort = (56).toUShort()
public val IFLA_PARENT_DEV_BUS_NAME: CUShort = (57).toUShort()
public val IFLA_GRO_MAX_SIZE: CUShort = (58).toUShort()
public val IFLA_TSO_MAX_SIZE: CUShort = (59).toUShort()
public val IFLA_TSO_MAX_SEGS: CUShort = (60).toUShort()
public val IFLA_ALLMULTI: CUShort = (61).toUShort()
public val IFLA_INFO_UNSPEC: CUShort = (0).toUShort()
public val IFLA_INFO_KIND: CUShort = (1).toUShort()
public val IFLA_INFO_DATA: CUShort = (2).toUShort()
public val IFLA_INFO_XSTATS: CUShort = (3).toUShort()
public val IFLA_INFO_SLAVE_KIND: CUShort = (4).toUShort()
public val IFLA_INFO_SLAVE_DATA: CUShort = (5).toUShort()
public const val SEEK_DATA: CInt = 3
public const val SEEK_HOLE: CInt = 4
public const val MPOL_DEFAULT: CInt = 0
public const val MPOL_PREFERRED: CInt = 1
public const val MPOL_BIND: CInt = 2
public const val MPOL_INTERLEAVE: CInt = 3
public const val MPOL_LOCAL: CInt = 4
public val MPOL_F_NUMA_BALANCING: CInt = 1 shl 13
public val MPOL_F_RELATIVE_NODES: CInt = 1 shl 14
public val MPOL_F_STATIC_NODES: CInt = 1 shl 15

// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = crate::pthread_mutex_t { size: [0 (initializer represented at the FFI boundary)
// PTHREAD_COND_INITIALIZER: PthreadCondT = crate::pthread_cond_t { size: [0 (initializer represented at the FFI boundary)
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = crate::pthread_rwlock_t { size: [0 (initializer represented at the FFI boundary)
public const val RENAME_NOREPLACE: CUInt = 1u
public const val RENAME_EXCHANGE: CUInt = 2u
public const val RENAME_WHITEOUT: CUInt = 4u
public val MSG_STAT: CInt = 11 or (IPC_STAT and 0x100)
public const val MSG_INFO: CInt = 12
public const val MSG_NOTIFICATION: CInt = 0x8000
public const val MSG_NOERROR: CInt = 4096
public const val MSG_EXCEPT: CInt = 8192
public const val MSG_ZEROCOPY: CInt = 0x4000000
public const val SEM_UNDO: CInt = 0x1000
public const val GETPID: CInt = 11
public const val GETVAL: CInt = 12
public const val GETALL: CInt = 13
public const val GETNCNT: CInt = 14
public const val GETZCNT: CInt = 15
public const val SETVAL: CInt = 16
public const val SETALL: CInt = 17
public val SEM_STAT: CInt = 18 or (IPC_STAT and 0x100)
public const val SEM_INFO: CInt = 19
public val SEM_STAT_ANY: CInt = 20 or (IPC_STAT and 0x100)
public const val QFMT_VFS_OLD: CInt = 1
public const val QFMT_VFS_V0: CInt = 2
public const val QFMT_VFS_V1: CInt = 4
public const val EFD_SEMAPHORE: CInt = 0x1
public val RB_AUTOBOOT: CInt = 0x01234567.toInt()
public val RB_HALT_SYSTEM: CInt = 0xcdef0123.toInt()
public val RB_ENABLE_CAD: CInt = 0x89abcdef.toInt()
public val RB_DISABLE_CAD: CInt = 0x00000000.toInt()
public val RB_POWER_OFF: CInt = 0x4321fedc.toInt()
public val RB_SW_SUSPEND: CInt = 0xd000fce2.toInt()
public val RB_KEXEC: CInt = 0x45584543.toInt()
public const val SYNC_FILE_RANGE_WAIT_BEFORE: CUInt = 1u
public const val SYNC_FILE_RANGE_WRITE: CUInt = 2u
public const val SYNC_FILE_RANGE_WAIT_AFTER: CUInt = 4u
public const val MREMAP_MAYMOVE: CInt = 1
public const val MREMAP_FIXED: CInt = 2
public const val MREMAP_DONTUNMAP: CInt = 4

internal const val NSIO: UInt = 0xb7u
internal const val PIDFS_IOCTL_MAGIC: UInt = 0xFFu
internal const val PTP_CLK_MAGIC: UInt = 61u

public val NS_GET_USERNS: Ioctl = _IO(NSIO, 0x1.toUInt())
public val NS_GET_PARENT: Ioctl = _IO(NSIO, 0x2.toUInt())
public val NS_GET_NSTYPE: Ioctl = _IO(NSIO, 0x3.toUInt())
public val NS_GET_OWNER_UID: Ioctl = _IO(NSIO, 0x4.toUInt())

// NS_GET_MNTNS_ID = _IOR(NSIO, 0x5, __u64) (ioctl request code; computed at the FFI boundary)
public val NS_GET_PID_FROM_PIDNS: Ioctl = ioctlCode<CInt>(NSIO, 0x6.toUInt())
public val NS_GET_TGID_FROM_PIDNS: Ioctl = ioctlCode<CInt>(NSIO, 0x7.toUInt())
public val NS_GET_PID_IN_PIDNS: Ioctl = ioctlCode<CInt>(NSIO, 0x8.toUInt())
public val NS_GET_TGID_IN_PIDNS: Ioctl = ioctlCode<CInt>(NSIO, 0x9.toUInt())
public const val MNT_NS_INFO_SIZE_VER0: Ioctl = 16
public val NS_MNT_GET_INFO: Ioctl = ioctlCode<MntNsInfo>(NSIO, 10.toUInt())
public val NS_MNT_GET_NEXT: Ioctl = ioctlCode<MntNsInfo>(NSIO, 11.toUInt())
public val NS_MNT_GET_PREV: Ioctl = ioctlCode<MntNsInfo>(NSIO, 12.toUInt())
public val PIDFD_NONBLOCK: CUInt = O_NONBLOCK.toUInt()
public val PIDFD_THREAD: CUInt = O_EXCL.toUInt()
public val PIDFD_SIGNAL_THREAD: CUInt = 1.toUInt() shl 0.toInt()
public val PIDFD_SIGNAL_THREAD_GROUP: CUInt = 1.toUInt() shl 1.toInt()
public val PIDFD_SIGNAL_PROCESS_GROUP: CUInt = 1.toUInt() shl 2.toInt()
public val PIDFD_INFO_PID: CUInt = 1.toUInt() shl 0.toInt()
public val PIDFD_INFO_CREDS: CUInt = 1.toUInt() shl 1.toInt()
public val PIDFD_INFO_CGROUPID: CUInt = 1.toUInt() shl 2.toInt()
public val PIDFD_INFO_EXIT: CUInt = 1.toUInt() shl 3.toInt()
public const val PIDFD_INFO_SIZE_VER0: CUInt = 64u
public val PIDFD_GET_CGROUP_NAMESPACE: Ioctl = _IO(PIDFS_IOCTL_MAGIC, 1.toUInt())
public val PIDFD_GET_IPC_NAMESPACE: Ioctl = _IO(PIDFS_IOCTL_MAGIC, 2.toUInt())
public val PIDFD_GET_MNT_NAMESPACE: Ioctl = _IO(PIDFS_IOCTL_MAGIC, 3.toUInt())
public val PIDFD_GET_NET_NAMESPACE: Ioctl = _IO(PIDFS_IOCTL_MAGIC, 4.toUInt())
public val PIDFD_GET_PID_NAMESPACE: Ioctl = _IO(PIDFS_IOCTL_MAGIC, 5.toUInt())
public val PIDFD_GET_PID_FOR_CHILDREN_NAMESPACE: Ioctl = _IO(PIDFS_IOCTL_MAGIC, 6.toUInt())
public val PIDFD_GET_TIME_NAMESPACE: Ioctl = _IO(PIDFS_IOCTL_MAGIC, 7.toUInt())
public val PIDFD_GET_TIME_FOR_CHILDREN_NAMESPACE: Ioctl = _IO(PIDFS_IOCTL_MAGIC, 8.toUInt())
public val PIDFD_GET_USER_NAMESPACE: Ioctl = _IO(PIDFS_IOCTL_MAGIC, 9.toUInt())
public val PIDFD_GET_UTS_NAMESPACE: Ioctl = _IO(PIDFS_IOCTL_MAGIC, 10.toUInt())
public val PIDFD_GET_INFO: Ioctl = ioctlCode<PidfdInfo>(PIDFS_IOCTL_MAGIC, 11.toUInt())
public const val PR_SET_MDWE: CInt = 65
public const val PR_GET_MDWE: CInt = 66
public val PR_MDWE_REFUSE_EXEC_GAIN: CUInt = 1.toUInt() shl 0
public val PR_MDWE_NO_INHERIT: CUInt = 1.toUInt() shl 1
public const val GRND_NONBLOCK: CUInt = 0x0001u
public const val GRND_RANDOM: CUInt = 0x0002u
public const val GRND_INSECURE: CUInt = 0x0004u
public const val SECCOMP_MODE_DISABLED: CUInt = 0u
public const val SECCOMP_MODE_STRICT: CUInt = 1u
public const val SECCOMP_MODE_FILTER: CUInt = 2u
public const val SECCOMP_SET_MODE_STRICT: CUInt = 0u
public const val SECCOMP_SET_MODE_FILTER: CUInt = 1u
public const val SECCOMP_GET_ACTION_AVAIL: CUInt = 2u
public const val SECCOMP_GET_NOTIF_SIZES: CUInt = 3u
public val SECCOMP_FILTER_FLAG_TSYNC: CULong = 1.toULong() shl 0
public val SECCOMP_FILTER_FLAG_LOG: CULong = 1.toULong() shl 1
public val SECCOMP_FILTER_FLAG_SPEC_ALLOW: CULong = 1.toULong() shl 2
public val SECCOMP_FILTER_FLAG_NEW_LISTENER: CULong = 1.toULong() shl 3
public val SECCOMP_FILTER_FLAG_TSYNC_ESRCH: CULong = 1.toULong() shl 4
public val SECCOMP_FILTER_FLAG_WAIT_KILLABLE_RECV: CULong = 1.toULong() shl 5
public const val SECCOMP_RET_KILL_PROCESS: CUInt = 0x80000000u
public const val SECCOMP_RET_KILL_THREAD: CUInt = 0x00000000u
public const val SECCOMP_RET_KILL: CUInt = SECCOMP_RET_KILL_THREAD
public const val SECCOMP_RET_TRAP: CUInt = 0x00030000u
public const val SECCOMP_RET_ERRNO: CUInt = 0x00050000u
public const val SECCOMP_RET_USER_NOTIF: CUInt = 0x7fc00000u
public const val SECCOMP_RET_TRACE: CUInt = 0x7ff00000u
public const val SECCOMP_RET_LOG: CUInt = 0x7ffc0000u
public const val SECCOMP_RET_ALLOW: CUInt = 0x7fff0000u
public const val SECCOMP_RET_ACTION_FULL: CUInt = 0xffff0000u
public const val SECCOMP_RET_ACTION: CUInt = 0x7fff0000u
public const val SECCOMP_RET_DATA: CUInt = 0x0000ffffu
public const val SECCOMP_USER_NOTIF_FLAG_CONTINUE: CULong = 1uL
public const val SECCOMP_ADDFD_FLAG_SETFD: CULong = 1uL
public const val SECCOMP_ADDFD_FLAG_SEND: CULong = 2uL
public const val TFD_CLOEXEC: CInt = O_CLOEXEC
public const val TFD_NONBLOCK: CInt = O_NONBLOCK
public const val TFD_TIMER_ABSTIME: CInt = 1
public const val TFD_TIMER_CANCEL_ON_SET: CInt = 2
public const val FALLOC_FL_KEEP_SIZE: CInt = 0x01
public const val FALLOC_FL_PUNCH_HOLE: CInt = 0x02
public const val FALLOC_FL_COLLAPSE_RANGE: CInt = 0x08
public const val FALLOC_FL_ZERO_RANGE: CInt = 0x10
public const val FALLOC_FL_INSERT_RANGE: CInt = 0x20
public const val FALLOC_FL_UNSHARE_RANGE: CInt = 0x40
public const val ENOATTR: CInt = ENODATA
public const val SO_ORIGINAL_DST: CInt = 80
public const val IP_RECVFRAGSIZE: CInt = 25
public const val IPV6_FLOWINFO: CInt = 11
public const val IPV6_FLOWLABEL_MGR: CInt = 32
public const val IPV6_FLOWINFO_SEND: CInt = 33
public const val IPV6_RECVFRAGSIZE: CInt = 77
public const val IPV6_FREEBIND: CInt = 78
public const val IPV6_FLOWINFO_FLOWLABEL: CInt = 0x000fffff
public const val IPV6_FLOWINFO_PRIORITY: CInt = 0x0ff00000
public const val SK_MEMINFO_RMEM_ALLOC: CInt = 0
public const val SK_MEMINFO_RCVBUF: CInt = 1
public const val SK_MEMINFO_WMEM_ALLOC: CInt = 2
public const val SK_MEMINFO_SNDBUF: CInt = 3
public const val SK_MEMINFO_FWD_ALLOC: CInt = 4
public const val SK_MEMINFO_WMEM_QUEUED: CInt = 5
public const val SK_MEMINFO_OPTMEM: CInt = 6
public const val SK_MEMINFO_BACKLOG: CInt = 7
public const val SK_MEMINFO_DROPS: CInt = 8
public val CLOSE_RANGE_UNSHARE: CUInt = 1.toUInt() shl 1
public val CLOSE_RANGE_CLOEXEC: CUInt = 1.toUInt() shl 2
public const val SKF_AD_OFF: CInt = -0x1000
public const val SKF_AD_PROTOCOL: CInt = 0
public const val SKF_AD_PKTTYPE: CInt = 4
public const val SKF_AD_IFINDEX: CInt = 8
public const val SKF_AD_NLATTR: CInt = 12
public const val SKF_AD_NLATTR_NEST: CInt = 16
public const val SKF_AD_MARK: CInt = 20
public const val SKF_AD_QUEUE: CInt = 24
public const val SKF_AD_HATYPE: CInt = 28
public const val SKF_AD_RXHASH: CInt = 32
public const val SKF_AD_CPU: CInt = 36
public const val SKF_AD_ALU_XOR_X: CInt = 40
public const val SKF_AD_VLAN_TAG: CInt = 44
public const val SKF_AD_VLAN_TAG_PRESENT: CInt = 48
public const val SKF_AD_PAY_OFFSET: CInt = 52
public const val SKF_AD_RANDOM: CInt = 56
public const val SKF_AD_VLAN_TPID: CInt = 60
public const val SKF_AD_MAX: CInt = 64
public const val SKF_NET_OFF: CInt = -0x100000
public const val SKF_LL_OFF: CInt = -0x200000
public const val BPF_NET_OFF: CInt = SKF_NET_OFF
public const val BPF_LL_OFF: CInt = SKF_LL_OFF
public const val BPF_MEMWORDS: CInt = 16
public const val BPF_MAXINSNS: CInt = 4096
public const val BPF_LD: U32 = 0x00u
public const val BPF_LDX: U32 = 0x01u
public const val BPF_ST: U32 = 0x02u
public const val BPF_STX: U32 = 0x03u
public const val BPF_ALU: U32 = 0x04u
public const val BPF_JMP: U32 = 0x05u
public const val BPF_RET: U32 = 0x06u
public const val BPF_MISC: U32 = 0x07u
public const val BPF_W: U32 = 0x00u
public const val BPF_H: U32 = 0x08u
public const val BPF_B: U32 = 0x10u
public const val BPF_IMM: U32 = 0x00u
public const val BPF_ABS: U32 = 0x20u
public const val BPF_IND: U32 = 0x40u
public const val BPF_MEM: U32 = 0x60u
public const val BPF_LEN: U32 = 0x80u
public const val BPF_MSH: U32 = 0xa0u
public const val BPF_ADD: U32 = 0x00u
public const val BPF_SUB: U32 = 0x10u
public const val BPF_MUL: U32 = 0x20u
public const val BPF_DIV: U32 = 0x30u
public const val BPF_OR: U32 = 0x40u
public const val BPF_AND: U32 = 0x50u
public const val BPF_LSH: U32 = 0x60u
public const val BPF_RSH: U32 = 0x70u
public const val BPF_NEG: U32 = 0x80u
public const val BPF_MOD: U32 = 0x90u
public const val BPF_XOR: U32 = 0xa0u
public const val BPF_JA: U32 = 0x00u
public const val BPF_JEQ: U32 = 0x10u
public const val BPF_JGT: U32 = 0x20u
public const val BPF_JGE: U32 = 0x30u
public const val BPF_JSET: U32 = 0x40u
public const val BPF_K: U32 = 0x00u
public const val BPF_X: U32 = 0x08u
public const val BPF_A: U32 = 0x10u
public const val BPF_TAX: U32 = 0x00u
public const val BPF_TXA: U32 = 0x80u
public const val RESOLVE_NO_XDEV: U64 = 0x01uL
public const val RESOLVE_NO_MAGICLINKS: U64 = 0x02uL
public const val RESOLVE_NO_SYMLINKS: U64 = 0x04uL
public const val RESOLVE_BENEATH: U64 = 0x08uL
public const val RESOLVE_IN_ROOT: U64 = 0x10uL
public const val RESOLVE_CACHED: U64 = 0x20uL
public const val ETH_ALEN: CInt = 6
public const val ETH_HLEN: CInt = 14
public const val ETH_ZLEN: CInt = 60
public const val ETH_DATA_LEN: CInt = 1500
public const val ETH_FRAME_LEN: CInt = 1514
public const val ETH_FCS_LEN: CInt = 4
public const val ETH_P_LOOP: CInt = 0x0060
public const val ETH_P_PUP: CInt = 0x0200
public const val ETH_P_PUPAT: CInt = 0x0201
public const val ETH_P_IP: CInt = 0x0800
public const val ETH_P_X25: CInt = 0x0805
public const val ETH_P_ARP: CInt = 0x0806
public const val ETH_P_BPQ: CInt = 0x08FF
public const val ETH_P_IEEEPUP: CInt = 0x0a00
public const val ETH_P_IEEEPUPAT: CInt = 0x0a01
public const val ETH_P_BATMAN: CInt = 0x4305
public const val ETH_P_DEC: CInt = 0x6000
public const val ETH_P_DNA_DL: CInt = 0x6001
public const val ETH_P_DNA_RC: CInt = 0x6002
public const val ETH_P_DNA_RT: CInt = 0x6003
public const val ETH_P_LAT: CInt = 0x6004
public const val ETH_P_DIAG: CInt = 0x6005
public const val ETH_P_CUST: CInt = 0x6006
public const val ETH_P_SCA: CInt = 0x6007
public const val ETH_P_TEB: CInt = 0x6558
public const val ETH_P_RARP: CInt = 0x8035
public const val ETH_P_ATALK: CInt = 0x809B
public const val ETH_P_AARP: CInt = 0x80F3
public const val ETH_P_8021Q: CInt = 0x8100
public const val ETH_P_IPX: CInt = 0x8137
public const val ETH_P_IPV6: CInt = 0x86DD
public const val ETH_P_PAUSE: CInt = 0x8808
public const val ETH_P_SLOW: CInt = 0x8809
public const val ETH_P_WCCP: CInt = 0x883E
public const val ETH_P_MPLS_UC: CInt = 0x8847
public const val ETH_P_MPLS_MC: CInt = 0x8848
public const val ETH_P_ATMMPOA: CInt = 0x884c
public const val ETH_P_PPP_DISC: CInt = 0x8863
public const val ETH_P_PPP_SES: CInt = 0x8864
public const val ETH_P_LINK_CTL: CInt = 0x886c
public const val ETH_P_ATMFATE: CInt = 0x8884
public const val ETH_P_PAE: CInt = 0x888E
public const val ETH_P_AOE: CInt = 0x88A2
public const val ETH_P_8021AD: CInt = 0x88A8
public const val ETH_P_802_EX1: CInt = 0x88B5
public const val ETH_P_TIPC: CInt = 0x88CA
public const val ETH_P_MACSEC: CInt = 0x88E5
public const val ETH_P_8021AH: CInt = 0x88E7
public const val ETH_P_MVRP: CInt = 0x88F5
public const val ETH_P_1588: CInt = 0x88F7
public const val ETH_P_PRP: CInt = 0x88FB
public const val ETH_P_FCOE: CInt = 0x8906
public const val ETH_P_TDLS: CInt = 0x890D
public const val ETH_P_FIP: CInt = 0x8914
public const val ETH_P_80221: CInt = 0x8917
public const val ETH_P_LOOPBACK: CInt = 0x9000
public const val ETH_P_QINQ1: CInt = 0x9100
public const val ETH_P_QINQ2: CInt = 0x9200
public const val ETH_P_QINQ3: CInt = 0x9300
public const val ETH_P_EDSA: CInt = 0xDADA
public const val ETH_P_AF_IUCV: CInt = 0xFBFB
public const val ETH_P_802_3_MIN: CInt = 0x0600
public const val ETH_P_802_3: CInt = 0x0001
public const val ETH_P_AX25: CInt = 0x0002
public const val ETH_P_ALL: CInt = 0x0003
public const val ETH_P_802_2: CInt = 0x0004
public const val ETH_P_SNAP: CInt = 0x0005
public const val ETH_P_DDCMP: CInt = 0x0006
public const val ETH_P_WAN_PPP: CInt = 0x0007
public const val ETH_P_PPP_MP: CInt = 0x0008
public const val ETH_P_LOCALTALK: CInt = 0x0009
public const val ETH_P_CANFD: CInt = 0x000D
public const val ETH_P_PPPTALK: CInt = 0x0010
public const val ETH_P_TR_802_2: CInt = 0x0011
public const val ETH_P_MOBITEX: CInt = 0x0015
public const val ETH_P_CONTROL: CInt = 0x0016
public const val ETH_P_IRDA: CInt = 0x0017
public const val ETH_P_ECONET: CInt = 0x0018
public const val ETH_P_HDLC: CInt = 0x0019
public const val ETH_P_ARCNET: CInt = 0x001A
public const val ETH_P_DSA: CInt = 0x001B
public const val ETH_P_TRAILER: CInt = 0x001C
public const val ETH_P_PHONET: CInt = 0x00F5
public const val ETH_P_IEEE802154: CInt = 0x00F6
public const val ETH_P_CAIF: CInt = 0x00F7
public const val POSIX_SPAWN_RESETIDS: CInt = 0x01
public const val POSIX_SPAWN_SETPGROUP: CInt = 0x02
public const val POSIX_SPAWN_SETSIGDEF: CInt = 0x04
public const val POSIX_SPAWN_SETSIGMASK: CInt = 0x08
public const val POSIX_SPAWN_SETSCHEDPARAM: CInt = 0x10
public const val POSIX_SPAWN_SETSCHEDULER: CInt = 0x20
public const val NFNLGRP_NONE: CInt = 0
public const val NFNLGRP_CONNTRACK_NEW: CInt = 1
public const val NFNLGRP_CONNTRACK_UPDATE: CInt = 2
public const val NFNLGRP_CONNTRACK_DESTROY: CInt = 3
public const val NFNLGRP_CONNTRACK_EXP_NEW: CInt = 4
public const val NFNLGRP_CONNTRACK_EXP_UPDATE: CInt = 5
public const val NFNLGRP_CONNTRACK_EXP_DESTROY: CInt = 6
public const val NFNLGRP_NFTABLES: CInt = 7
public const val NFNLGRP_ACCT_QUOTA: CInt = 8
public const val NFNLGRP_NFTRACE: CInt = 9
public const val NFNETLINK_V0: CInt = 0
public const val NFNL_SUBSYS_NONE: CInt = 0
public const val NFNL_SUBSYS_CTNETLINK: CInt = 1
public const val NFNL_SUBSYS_CTNETLINK_EXP: CInt = 2
public const val NFNL_SUBSYS_QUEUE: CInt = 3
public const val NFNL_SUBSYS_ULOG: CInt = 4
public const val NFNL_SUBSYS_OSF: CInt = 5
public const val NFNL_SUBSYS_IPSET: CInt = 6
public const val NFNL_SUBSYS_ACCT: CInt = 7
public const val NFNL_SUBSYS_CTNETLINK_TIMEOUT: CInt = 8
public const val NFNL_SUBSYS_CTHELPER: CInt = 9
public const val NFNL_SUBSYS_NFTABLES: CInt = 10
public const val NFNL_SUBSYS_NFT_COMPAT: CInt = 11
public const val NFNL_SUBSYS_HOOK: CInt = 12
public const val NFNL_SUBSYS_COUNT: CInt = 13
public const val NFNL_MSG_BATCH_BEGIN: CInt = NLMSG_MIN_TYPE
public val NFNL_MSG_BATCH_END: CInt = NLMSG_MIN_TYPE + 1
public const val NFNL_BATCH_UNSPEC: CInt = 0
public const val NFNL_BATCH_GENID: CInt = 1
public const val NFULNL_MSG_PACKET: CInt = 0
public const val NFULNL_MSG_CONFIG: CInt = 1
public const val NFULA_VLAN_UNSPEC: CInt = 0
public const val NFULA_VLAN_PROTO: CInt = 1
public const val NFULA_VLAN_TCI: CInt = 2
public const val NFULA_UNSPEC: CInt = 0
public const val NFULA_PACKET_HDR: CInt = 1
public const val NFULA_MARK: CInt = 2
public const val NFULA_TIMESTAMP: CInt = 3
public const val NFULA_IFINDEX_INDEV: CInt = 4
public const val NFULA_IFINDEX_OUTDEV: CInt = 5
public const val NFULA_IFINDEX_PHYSINDEV: CInt = 6
public const val NFULA_IFINDEX_PHYSOUTDEV: CInt = 7
public const val NFULA_HWADDR: CInt = 8
public const val NFULA_PAYLOAD: CInt = 9
public const val NFULA_PREFIX: CInt = 10
public const val NFULA_UID: CInt = 11
public const val NFULA_SEQ: CInt = 12
public const val NFULA_SEQ_GLOBAL: CInt = 13
public const val NFULA_GID: CInt = 14
public const val NFULA_HWTYPE: CInt = 15
public const val NFULA_HWHEADER: CInt = 16
public const val NFULA_HWLEN: CInt = 17
public const val NFULA_CT: CInt = 18
public const val NFULA_CT_INFO: CInt = 19
public const val NFULA_VLAN: CInt = 20
public const val NFULA_L2HDR: CInt = 21
public const val NFULNL_CFG_CMD_NONE: CInt = 0
public const val NFULNL_CFG_CMD_BIND: CInt = 1
public const val NFULNL_CFG_CMD_UNBIND: CInt = 2
public const val NFULNL_CFG_CMD_PF_BIND: CInt = 3
public const val NFULNL_CFG_CMD_PF_UNBIND: CInt = 4
public const val NFULA_CFG_UNSPEC: CInt = 0
public const val NFULA_CFG_CMD: CInt = 1
public const val NFULA_CFG_MODE: CInt = 2
public const val NFULA_CFG_NLBUFSIZ: CInt = 3
public const val NFULA_CFG_TIMEOUT: CInt = 4
public const val NFULA_CFG_QTHRESH: CInt = 5
public const val NFULA_CFG_FLAGS: CInt = 6
public const val NFULNL_COPY_NONE: CInt = 0x00
public const val NFULNL_COPY_META: CInt = 0x01
public const val NFULNL_COPY_PACKET: CInt = 0x02
public const val NFULNL_CFG_F_SEQ: CInt = 0x0001
public const val NFULNL_CFG_F_SEQ_GLOBAL: CInt = 0x0002
public const val NFULNL_CFG_F_CONNTRACK: CInt = 0x0004
public const val NFQNL_MSG_PACKET: CInt = 0
public const val NFQNL_MSG_VERDICT: CInt = 1
public const val NFQNL_MSG_CONFIG: CInt = 2
public const val NFQNL_MSG_VERDICT_BATCH: CInt = 3
public const val NFQA_UNSPEC: CInt = 0
public const val NFQA_PACKET_HDR: CInt = 1
public const val NFQA_VERDICT_HDR: CInt = 2
public const val NFQA_MARK: CInt = 3
public const val NFQA_TIMESTAMP: CInt = 4
public const val NFQA_IFINDEX_INDEV: CInt = 5
public const val NFQA_IFINDEX_OUTDEV: CInt = 6
public const val NFQA_IFINDEX_PHYSINDEV: CInt = 7
public const val NFQA_IFINDEX_PHYSOUTDEV: CInt = 8
public const val NFQA_HWADDR: CInt = 9
public const val NFQA_PAYLOAD: CInt = 10
public const val NFQA_CT: CInt = 11
public const val NFQA_CT_INFO: CInt = 12
public const val NFQA_CAP_LEN: CInt = 13
public const val NFQA_SKB_INFO: CInt = 14
public const val NFQA_EXP: CInt = 15
public const val NFQA_UID: CInt = 16
public const val NFQA_GID: CInt = 17
public const val NFQA_SECCTX: CInt = 18
public const val NFQA_VLAN: CInt = 19
public const val NFQA_L2HDR: CInt = 20
public const val NFQA_PRIORITY: CInt = 21
public const val NFQA_VLAN_UNSPEC: CInt = 0
public const val NFQA_VLAN_PROTO: CInt = 1
public const val NFQA_VLAN_TCI: CInt = 2
public const val NFQNL_CFG_CMD_NONE: CInt = 0
public const val NFQNL_CFG_CMD_BIND: CInt = 1
public const val NFQNL_CFG_CMD_UNBIND: CInt = 2
public const val NFQNL_CFG_CMD_PF_BIND: CInt = 3
public const val NFQNL_CFG_CMD_PF_UNBIND: CInt = 4
public const val NFQNL_COPY_NONE: CInt = 0
public const val NFQNL_COPY_META: CInt = 1
public const val NFQNL_COPY_PACKET: CInt = 2
public const val NFQA_CFG_UNSPEC: CInt = 0
public const val NFQA_CFG_CMD: CInt = 1
public const val NFQA_CFG_PARAMS: CInt = 2
public const val NFQA_CFG_QUEUE_MAXLEN: CInt = 3
public const val NFQA_CFG_MASK: CInt = 4
public const val NFQA_CFG_FLAGS: CInt = 5
public const val NFQA_CFG_F_FAIL_OPEN: CInt = 0x0001
public const val NFQA_CFG_F_CONNTRACK: CInt = 0x0002
public const val NFQA_CFG_F_GSO: CInt = 0x0004
public const val NFQA_CFG_F_UID_GID: CInt = 0x0008
public const val NFQA_CFG_F_SECCTX: CInt = 0x0010
public const val NFQA_CFG_F_MAX: CInt = 0x0020
public const val NFQA_SKB_CSUMNOTREADY: CInt = 0x0001
public const val NFQA_SKB_GSO: CInt = 0x0002
public const val NFQA_SKB_CSUM_NOTVERIFIED: CInt = 0x0004
public const val GENL_NAMSIZ: CInt = 16
public const val GENL_MIN_ID: CInt = NLMSG_MIN_TYPE
public const val GENL_MAX_ID: CInt = 1023
public const val GENL_ADMIN_PERM: CInt = 0x01
public const val GENL_CMD_CAP_DO: CInt = 0x02
public const val GENL_CMD_CAP_DUMP: CInt = 0x04
public const val GENL_CMD_CAP_HASPOL: CInt = 0x08
public const val GENL_ID_CTRL: CInt = NLMSG_MIN_TYPE
public const val CTRL_CMD_UNSPEC: CInt = 0
public const val CTRL_CMD_NEWFAMILY: CInt = 1
public const val CTRL_CMD_DELFAMILY: CInt = 2
public const val CTRL_CMD_GETFAMILY: CInt = 3
public const val CTRL_CMD_NEWOPS: CInt = 4
public const val CTRL_CMD_DELOPS: CInt = 5
public const val CTRL_CMD_GETOPS: CInt = 6
public const val CTRL_CMD_NEWMCAST_GRP: CInt = 7
public const val CTRL_CMD_DELMCAST_GRP: CInt = 8
public const val CTRL_CMD_GETMCAST_GRP: CInt = 9
public const val CTRL_ATTR_UNSPEC: CInt = 0
public const val CTRL_ATTR_FAMILY_ID: CInt = 1
public const val CTRL_ATTR_FAMILY_NAME: CInt = 2
public const val CTRL_ATTR_VERSION: CInt = 3
public const val CTRL_ATTR_HDRSIZE: CInt = 4
public const val CTRL_ATTR_MAXATTR: CInt = 5
public const val CTRL_ATTR_OPS: CInt = 6
public const val CTRL_ATTR_MCAST_GROUPS: CInt = 7
public const val CTRL_ATTR_OP_UNSPEC: CInt = 0
public const val CTRL_ATTR_OP_ID: CInt = 1
public const val CTRL_ATTR_OP_FLAGS: CInt = 2
public const val CTRL_ATTR_MCAST_GRP_UNSPEC: CInt = 0
public const val CTRL_ATTR_MCAST_GRP_NAME: CInt = 1
public const val CTRL_ATTR_MCAST_GRP_ID: CInt = 2
public const val PACKET_FANOUT: CInt = 18
public const val PACKET_TX_HAS_OFF: CInt = 19
public const val PACKET_QDISC_BYPASS: CInt = 20
public const val PACKET_ROLLOVER_STATS: CInt = 21
public const val PACKET_FANOUT_DATA: CInt = 22
public const val PACKET_IGNORE_OUTGOING: CInt = 23
public const val PACKET_VNET_HDR_SZ: CInt = 24
public const val PACKET_FANOUT_HASH: CUInt = 0u
public const val PACKET_FANOUT_LB: CUInt = 1u
public const val PACKET_FANOUT_CPU: CUInt = 2u
public const val PACKET_FANOUT_ROLLOVER: CUInt = 3u
public const val PACKET_FANOUT_RND: CUInt = 4u
public const val PACKET_FANOUT_QM: CUInt = 5u
public const val PACKET_FANOUT_CBPF: CUInt = 6u
public const val PACKET_FANOUT_EBPF: CUInt = 7u
public const val PACKET_FANOUT_FLAG_ROLLOVER: CUInt = 0x1000u
public const val PACKET_FANOUT_FLAG_UNIQUEID: CUInt = 0x2000u
public const val PACKET_FANOUT_FLAG_IGNORE_OUTGOING: CUInt = 0x4000u
public const val PACKET_FANOUT_FLAG_DEFRAG: CUInt = 0x8000u
public const val TP_STATUS_KERNEL: U32 = 0u
public val TP_STATUS_USER: U32 = 1.toUInt() shl 0
public val TP_STATUS_COPY: U32 = 1.toUInt() shl 1
public val TP_STATUS_LOSING: U32 = 1.toUInt() shl 2
public val TP_STATUS_CSUMNOTREADY: U32 = 1.toUInt() shl 3
public val TP_STATUS_VLAN_VALID: U32 = 1.toUInt() shl 4
public val TP_STATUS_BLK_TMO: U32 = 1.toUInt() shl 5
public val TP_STATUS_VLAN_TPID_VALID: U32 = 1.toUInt() shl 6
public val TP_STATUS_CSUM_VALID: U32 = 1.toUInt() shl 7
public const val TP_STATUS_AVAILABLE: U32 = 0u
public val TP_STATUS_SEND_REQUEST: U32 = 1.toUInt() shl 0
public val TP_STATUS_SENDING: U32 = 1.toUInt() shl 1
public val TP_STATUS_WRONG_FORMAT: U32 = 1.toUInt() shl 2
public val TP_STATUS_TS_SOFTWARE: U32 = 1.toUInt() shl 29
public val TP_STATUS_TS_SYS_HARDWARE: U32 = 1.toUInt() shl 30
public val TP_STATUS_TS_RAW_HARDWARE: U32 = 1.toUInt() shl 31
public const val TP_FT_REQ_FILL_RXHASH: U32 = 1u
public const val TPACKET_ALIGNMENT: ULong = 16uL

// TPACKET_HDRLEN = align(size_of<TpacketHdr>(), TPACKET_ALIGNMENT) + size_of<SockaddrLl>() (computed at the FFI boundary)
// TPACKET2_HDRLEN = align(size_of<Tpacket2Hdr>(), TPACKET_ALIGNMENT) + size_of<SockaddrLl>() (computed at the FFI boundary)
// TPACKET3_HDRLEN = align(size_of<Tpacket3Hdr>(), TPACKET_ALIGNMENT) + size_of<SockaddrLl>() (computed at the FFI boundary)
public const val NF_DROP: CInt = 0
public const val NF_ACCEPT: CInt = 1
public const val NF_STOLEN: CInt = 2
public const val NF_QUEUE: CInt = 3
public const val NF_REPEAT: CInt = 4
public const val NF_STOP: CInt = 5
public const val NF_MAX_VERDICT: CInt = NF_STOP
public const val NF_VERDICT_MASK: CInt = 0x000000ff
public const val NF_VERDICT_FLAG_QUEUE_BYPASS: CInt = 0x00008000
public const val NF_VERDICT_QMASK: CInt = -65536
public const val NF_VERDICT_QBITS: CInt = 16
public const val NF_VERDICT_BITS: CInt = 16
public const val NF_INET_PRE_ROUTING: CInt = 0
public const val NF_INET_LOCAL_IN: CInt = 1
public const val NF_INET_FORWARD: CInt = 2
public const val NF_INET_LOCAL_OUT: CInt = 3
public const val NF_INET_POST_ROUTING: CInt = 4
public const val NF_INET_NUMHOOKS: CInt = 5
public const val NF_INET_INGRESS: CInt = NF_INET_NUMHOOKS
public const val NF_NETDEV_INGRESS: CInt = 0
public const val NF_NETDEV_EGRESS: CInt = 1
public const val NF_NETDEV_NUMHOOKS: CInt = 2
public const val NFPROTO_UNSPEC: CInt = 0
public const val NFPROTO_INET: CInt = 1
public const val NFPROTO_IPV4: CInt = 2
public const val NFPROTO_ARP: CInt = 3
public const val NFPROTO_NETDEV: CInt = 5
public const val NFPROTO_BRIDGE: CInt = 7
public const val NFPROTO_IPV6: CInt = 10
public const val NFPROTO_DECNET: CInt = 12
public const val NFPROTO_NUMPROTO: CInt = 13
public const val NF_ARP: CInt = 0
public const val NF_ARP_IN: CInt = 0
public const val NF_ARP_OUT: CInt = 1
public const val NF_ARP_FORWARD: CInt = 2
public const val NF_ARP_NUMHOOKS: CInt = 3
public const val NF_BR_PRE_ROUTING: CInt = 0
public const val NF_BR_LOCAL_IN: CInt = 1
public const val NF_BR_FORWARD: CInt = 2
public const val NF_BR_LOCAL_OUT: CInt = 3
public const val NF_BR_POST_ROUTING: CInt = 4
public const val NF_BR_BROUTING: CInt = 5
public const val NF_BR_NUMHOOKS: CInt = 6
public const val NF_BR_PRI_FIRST: CInt = INT_MIN
public const val NF_BR_PRI_NAT_DST_BRIDGED: CInt = -300
public const val NF_BR_PRI_FILTER_BRIDGED: CInt = -200
public const val NF_BR_PRI_BRNF: CInt = 0
public const val NF_BR_PRI_NAT_DST_OTHER: CInt = 100
public const val NF_BR_PRI_FILTER_OTHER: CInt = 200
public const val NF_BR_PRI_NAT_SRC: CInt = 300
public const val NF_BR_PRI_LAST: CInt = INT_MAX
public const val NF_IP_PRE_ROUTING: CInt = 0
public const val NF_IP_LOCAL_IN: CInt = 1
public const val NF_IP_FORWARD: CInt = 2
public const val NF_IP_LOCAL_OUT: CInt = 3
public const val NF_IP_POST_ROUTING: CInt = 4
public const val NF_IP_NUMHOOKS: CInt = 5
public const val NF_IP_PRI_FIRST: CInt = INT_MIN
public const val NF_IP_PRI_RAW_BEFORE_DEFRAG: CInt = -450
public const val NF_IP_PRI_CONNTRACK_DEFRAG: CInt = -400
public const val NF_IP_PRI_RAW: CInt = -300
public const val NF_IP_PRI_SELINUX_FIRST: CInt = -225
public const val NF_IP_PRI_CONNTRACK: CInt = -200
public const val NF_IP_PRI_MANGLE: CInt = -150
public const val NF_IP_PRI_NAT_DST: CInt = -100
public const val NF_IP_PRI_FILTER: CInt = 0
public const val NF_IP_PRI_SECURITY: CInt = 50
public const val NF_IP_PRI_NAT_SRC: CInt = 100
public const val NF_IP_PRI_SELINUX_LAST: CInt = 225
public const val NF_IP_PRI_CONNTRACK_HELPER: CInt = 300
public const val NF_IP_PRI_CONNTRACK_CONFIRM: CInt = INT_MAX
public const val NF_IP_PRI_LAST: CInt = INT_MAX
public const val NF_IP6_PRE_ROUTING: CInt = 0
public const val NF_IP6_LOCAL_IN: CInt = 1
public const val NF_IP6_FORWARD: CInt = 2
public const val NF_IP6_LOCAL_OUT: CInt = 3
public const val NF_IP6_POST_ROUTING: CInt = 4
public const val NF_IP6_NUMHOOKS: CInt = 5
public const val NF_IP6_PRI_FIRST: CInt = INT_MIN
public const val NF_IP6_PRI_RAW_BEFORE_DEFRAG: CInt = -450
public const val NF_IP6_PRI_CONNTRACK_DEFRAG: CInt = -400
public const val NF_IP6_PRI_RAW: CInt = -300
public const val NF_IP6_PRI_SELINUX_FIRST: CInt = -225
public const val NF_IP6_PRI_CONNTRACK: CInt = -200
public const val NF_IP6_PRI_MANGLE: CInt = -150
public const val NF_IP6_PRI_NAT_DST: CInt = -100
public const val NF_IP6_PRI_FILTER: CInt = 0
public const val NF_IP6_PRI_SECURITY: CInt = 50
public const val NF_IP6_PRI_NAT_SRC: CInt = 100
public const val NF_IP6_PRI_SELINUX_LAST: CInt = 225
public const val NF_IP6_PRI_CONNTRACK_HELPER: CInt = 300
public const val NF_IP6_PRI_LAST: CInt = INT_MAX
public const val IP6T_SO_ORIGINAL_DST: CInt = 80
public const val SIOCSHWTSTAMP: CULong = 0x000089b0uL
public const val SIOCGHWTSTAMP: CULong = 0x000089b1uL
public const val WIRELESS_EXT: CULong = 0x16uL
public const val SIOCSIWCOMMIT: CULong = 0x8B00uL
public const val SIOCGIWNAME: CULong = 0x8B01uL
public const val SIOCSIWNWID: CULong = 0x8B02uL
public const val SIOCGIWNWID: CULong = 0x8B03uL
public const val SIOCSIWFREQ: CULong = 0x8B04uL
public const val SIOCGIWFREQ: CULong = 0x8B05uL
public const val SIOCSIWMODE: CULong = 0x8B06uL
public const val SIOCGIWMODE: CULong = 0x8B07uL
public const val SIOCSIWSENS: CULong = 0x8B08uL
public const val SIOCGIWSENS: CULong = 0x8B09uL
public const val SIOCSIWRANGE: CULong = 0x8B0AuL
public const val SIOCGIWRANGE: CULong = 0x8B0BuL
public const val SIOCSIWPRIV: CULong = 0x8B0CuL
public const val SIOCGIWPRIV: CULong = 0x8B0DuL
public const val SIOCSIWSTATS: CULong = 0x8B0EuL
public const val SIOCGIWSTATS: CULong = 0x8B0FuL
public const val SIOCSIWSPY: CULong = 0x8B10uL
public const val SIOCGIWSPY: CULong = 0x8B11uL
public const val SIOCSIWTHRSPY: CULong = 0x8B12uL
public const val SIOCGIWTHRSPY: CULong = 0x8B13uL
public const val SIOCSIWAP: CULong = 0x8B14uL
public const val SIOCGIWAP: CULong = 0x8B15uL
public const val SIOCGIWAPLIST: CULong = 0x8B17uL
public const val SIOCSIWSCAN: CULong = 0x8B18uL
public const val SIOCGIWSCAN: CULong = 0x8B19uL
public const val SIOCSIWESSID: CULong = 0x8B1AuL
public const val SIOCGIWESSID: CULong = 0x8B1BuL
public const val SIOCSIWNICKN: CULong = 0x8B1CuL
public const val SIOCGIWNICKN: CULong = 0x8B1DuL
public const val SIOCSIWRATE: CULong = 0x8B20uL
public const val SIOCGIWRATE: CULong = 0x8B21uL
public const val SIOCSIWRTS: CULong = 0x8B22uL
public const val SIOCGIWRTS: CULong = 0x8B23uL
public const val SIOCSIWFRAG: CULong = 0x8B24uL
public const val SIOCGIWFRAG: CULong = 0x8B25uL
public const val SIOCSIWTXPOW: CULong = 0x8B26uL
public const val SIOCGIWTXPOW: CULong = 0x8B27uL
public const val SIOCSIWRETRY: CULong = 0x8B28uL
public const val SIOCGIWRETRY: CULong = 0x8B29uL
public const val SIOCSIWENCODE: CULong = 0x8B2AuL
public const val SIOCGIWENCODE: CULong = 0x8B2BuL
public const val SIOCSIWPOWER: CULong = 0x8B2CuL
public const val SIOCGIWPOWER: CULong = 0x8B2DuL
public const val SIOCSIWGENIE: CULong = 0x8B30uL
public const val SIOCGIWGENIE: CULong = 0x8B31uL
public const val SIOCSIWMLME: CULong = 0x8B16uL
public const val SIOCSIWAUTH: CULong = 0x8B32uL
public const val SIOCGIWAUTH: CULong = 0x8B33uL
public const val SIOCSIWENCODEEXT: CULong = 0x8B34uL
public const val SIOCGIWENCODEEXT: CULong = 0x8B35uL
public const val SIOCSIWPMKSA: CULong = 0x8B36uL
public const val SIOCIWFIRSTPRIV: CULong = 0x8BE0uL
public const val SIOCIWLASTPRIV: CULong = 0x8BFFuL
public const val SIOCIWFIRST: CULong = 0x8B00uL
public const val SIOCIWLAST: CULong = SIOCIWLASTPRIV
public const val IWEVTXDROP: CULong = 0x8C00uL
public const val IWEVQUAL: CULong = 0x8C01uL
public const val IWEVCUSTOM: CULong = 0x8C02uL
public const val IWEVREGISTERED: CULong = 0x8C03uL
public const val IWEVEXPIRED: CULong = 0x8C04uL
public const val IWEVGENIE: CULong = 0x8C05uL
public const val IWEVMICHAELMICFAILURE: CULong = 0x8C06uL
public const val IWEVASSOCREQIE: CULong = 0x8C07uL
public const val IWEVASSOCRESPIE: CULong = 0x8C08uL
public const val IWEVPMKIDCAND: CULong = 0x8C09uL
public const val IWEVFIRST: CULong = 0x8C00uL
public const val IW_PRIV_TYPE_MASK: CULong = 0x7000uL
public const val IW_PRIV_TYPE_NONE: CULong = 0x0000uL
public const val IW_PRIV_TYPE_BYTE: CULong = 0x1000uL
public const val IW_PRIV_TYPE_CHAR: CULong = 0x2000uL
public const val IW_PRIV_TYPE_INT: CULong = 0x4000uL
public const val IW_PRIV_TYPE_FLOAT: CULong = 0x5000uL
public const val IW_PRIV_TYPE_ADDR: CULong = 0x6000uL
public const val IW_PRIV_SIZE_FIXED: CULong = 0x0800uL
public const val IW_PRIV_SIZE_MASK: CULong = 0x07FFuL
public const val IW_MAX_FREQUENCIES: ULong = 32uL
public const val IW_MAX_BITRATES: ULong = 32uL
public const val IW_MAX_TXPOWER: ULong = 8uL
public const val IW_MAX_SPY: ULong = 8uL
public const val IW_MAX_AP: ULong = 64uL
public const val IW_ESSID_MAX_SIZE: ULong = 32uL
public const val IW_MODE_AUTO: ULong = 0uL
public const val IW_MODE_ADHOC: ULong = 1uL
public const val IW_MODE_INFRA: ULong = 2uL
public const val IW_MODE_MASTER: ULong = 3uL
public const val IW_MODE_REPEAT: ULong = 4uL
public const val IW_MODE_SECOND: ULong = 5uL
public const val IW_MODE_MONITOR: ULong = 6uL
public const val IW_MODE_MESH: ULong = 7uL
public const val IW_QUAL_QUAL_UPDATED: CULong = 0x01uL
public const val IW_QUAL_LEVEL_UPDATED: CULong = 0x02uL
public const val IW_QUAL_NOISE_UPDATED: CULong = 0x04uL
public const val IW_QUAL_ALL_UPDATED: CULong = 0x07uL
public const val IW_QUAL_DBM: CULong = 0x08uL
public const val IW_QUAL_QUAL_INVALID: CULong = 0x10uL
public const val IW_QUAL_LEVEL_INVALID: CULong = 0x20uL
public const val IW_QUAL_NOISE_INVALID: CULong = 0x40uL
public const val IW_QUAL_RCPI: CULong = 0x80uL
public const val IW_QUAL_ALL_INVALID: CULong = 0x70uL
public const val IW_FREQ_AUTO: CULong = 0x00uL
public const val IW_FREQ_FIXED: CULong = 0x01uL
public const val IW_MAX_ENCODING_SIZES: ULong = 8uL
public const val IW_ENCODING_TOKEN_MAX: ULong = 64uL
public const val IW_ENCODE_INDEX: CULong = 0x00FFuL
public const val IW_ENCODE_FLAGS: CULong = 0xFF00uL
public const val IW_ENCODE_MODE: CULong = 0xF000uL
public const val IW_ENCODE_DISABLED: CULong = 0x8000uL
public const val IW_ENCODE_ENABLED: CULong = 0x0000uL
public const val IW_ENCODE_RESTRICTED: CULong = 0x4000uL
public const val IW_ENCODE_OPEN: CULong = 0x2000uL
public const val IW_ENCODE_NOKEY: CULong = 0x0800uL
public const val IW_ENCODE_TEMP: CULong = 0x0400uL
public const val IW_POWER_ON: CULong = 0x0000uL
public const val IW_POWER_TYPE: CULong = 0xF000uL
public const val IW_POWER_PERIOD: CULong = 0x1000uL
public const val IW_POWER_TIMEOUT: CULong = 0x2000uL
public const val IW_POWER_MODE: CULong = 0x0F00uL
public const val IW_POWER_UNICAST_R: CULong = 0x0100uL
public const val IW_POWER_MULTICAST_R: CULong = 0x0200uL
public const val IW_POWER_ALL_R: CULong = 0x0300uL
public const val IW_POWER_FORCE_S: CULong = 0x0400uL
public const val IW_POWER_REPEATER: CULong = 0x0800uL
public const val IW_POWER_MODIFIER: CULong = 0x000FuL
public const val IW_POWER_MIN: CULong = 0x0001uL
public const val IW_POWER_MAX: CULong = 0x0002uL
public const val IW_POWER_RELATIVE: CULong = 0x0004uL
public const val IW_TXPOW_TYPE: CULong = 0x00FFuL
public const val IW_TXPOW_DBM: CULong = 0x0000uL
public const val IW_TXPOW_MWATT: CULong = 0x0001uL
public const val IW_TXPOW_RELATIVE: CULong = 0x0002uL
public const val IW_TXPOW_RANGE: CULong = 0x1000uL
public const val IW_RETRY_ON: CULong = 0x0000uL
public const val IW_RETRY_TYPE: CULong = 0xF000uL
public const val IW_RETRY_LIMIT: CULong = 0x1000uL
public const val IW_RETRY_LIFETIME: CULong = 0x2000uL
public const val IW_RETRY_MODIFIER: CULong = 0x00FFuL
public const val IW_RETRY_MIN: CULong = 0x0001uL
public const val IW_RETRY_MAX: CULong = 0x0002uL
public const val IW_RETRY_RELATIVE: CULong = 0x0004uL
public const val IW_RETRY_SHORT: CULong = 0x0010uL
public const val IW_RETRY_LONG: CULong = 0x0020uL
public const val IW_SCAN_DEFAULT: CULong = 0x0000uL
public const val IW_SCAN_ALL_ESSID: CULong = 0x0001uL
public const val IW_SCAN_THIS_ESSID: CULong = 0x0002uL
public const val IW_SCAN_ALL_FREQ: CULong = 0x0004uL
public const val IW_SCAN_THIS_FREQ: CULong = 0x0008uL
public const val IW_SCAN_ALL_MODE: CULong = 0x0010uL
public const val IW_SCAN_THIS_MODE: CULong = 0x0020uL
public const val IW_SCAN_ALL_RATE: CULong = 0x0040uL
public const val IW_SCAN_THIS_RATE: CULong = 0x0080uL
public const val IW_SCAN_TYPE_ACTIVE: ULong = 0uL
public const val IW_SCAN_TYPE_PASSIVE: ULong = 1uL
public const val IW_SCAN_MAX_DATA: ULong = 4096uL
public const val IW_SCAN_CAPA_NONE: CULong = 0x00uL
public const val IW_SCAN_CAPA_ESSID: CULong = 0x01uL
public const val IW_SCAN_CAPA_BSSID: CULong = 0x02uL
public const val IW_SCAN_CAPA_CHANNEL: CULong = 0x04uL
public const val IW_SCAN_CAPA_MODE: CULong = 0x08uL
public const val IW_SCAN_CAPA_RATE: CULong = 0x10uL
public const val IW_SCAN_CAPA_TYPE: CULong = 0x20uL
public const val IW_SCAN_CAPA_TIME: CULong = 0x40uL
public const val IW_CUSTOM_MAX: CULong = 256uL
public const val IW_GENERIC_IE_MAX: CULong = 1024uL
public const val IW_MLME_DEAUTH: CULong = 0uL
public const val IW_MLME_DISASSOC: CULong = 1uL
public const val IW_MLME_AUTH: CULong = 2uL
public const val IW_MLME_ASSOC: CULong = 3uL
public const val IW_AUTH_INDEX: CULong = 0x0FFFuL
public const val IW_AUTH_FLAGS: CULong = 0xF000uL
public const val IW_AUTH_WPA_VERSION: ULong = 0uL
public const val IW_AUTH_CIPHER_PAIRWISE: ULong = 1uL
public const val IW_AUTH_CIPHER_GROUP: ULong = 2uL
public const val IW_AUTH_KEY_MGMT: ULong = 3uL
public const val IW_AUTH_TKIP_COUNTERMEASURES: ULong = 4uL
public const val IW_AUTH_DROP_UNENCRYPTED: ULong = 5uL
public const val IW_AUTH_80211_AUTH_ALG: ULong = 6uL
public const val IW_AUTH_WPA_ENABLED: ULong = 7uL
public const val IW_AUTH_RX_UNENCRYPTED_EAPOL: ULong = 8uL
public const val IW_AUTH_ROAMING_CONTROL: ULong = 9uL
public const val IW_AUTH_PRIVACY_INVOKED: ULong = 10uL
public const val IW_AUTH_CIPHER_GROUP_MGMT: ULong = 11uL
public const val IW_AUTH_MFP: ULong = 12uL
public const val IW_AUTH_WPA_VERSION_DISABLED: CULong = 0x00000001uL
public const val IW_AUTH_WPA_VERSION_WPA: CULong = 0x00000002uL
public const val IW_AUTH_WPA_VERSION_WPA2: CULong = 0x00000004uL
public const val IW_AUTH_CIPHER_NONE: CULong = 0x00000001uL
public const val IW_AUTH_CIPHER_WEP40: CULong = 0x00000002uL
public const val IW_AUTH_CIPHER_TKIP: CULong = 0x00000004uL
public const val IW_AUTH_CIPHER_CCMP: CULong = 0x00000008uL
public const val IW_AUTH_CIPHER_WEP104: CULong = 0x00000010uL
public const val IW_AUTH_CIPHER_AES_CMAC: CULong = 0x00000020uL
public const val IW_AUTH_KEY_MGMT_802_1X: ULong = 1uL
public const val IW_AUTH_KEY_MGMT_PSK: ULong = 2uL
public const val IW_AUTH_ALG_OPEN_SYSTEM: CULong = 0x00000001uL
public const val IW_AUTH_ALG_SHARED_KEY: CULong = 0x00000002uL
public const val IW_AUTH_ALG_LEAP: CULong = 0x00000004uL
public const val IW_AUTH_ROAMING_ENABLE: ULong = 0uL
public const val IW_AUTH_ROAMING_DISABLE: ULong = 1uL
public const val IW_AUTH_MFP_DISABLED: ULong = 0uL
public const val IW_AUTH_MFP_OPTIONAL: ULong = 1uL
public const val IW_AUTH_MFP_REQUIRED: ULong = 2uL
public const val IW_ENCODE_SEQ_MAX_SIZE: ULong = 8uL
public const val IW_ENCODE_ALG_NONE: ULong = 0uL
public const val IW_ENCODE_ALG_WEP: ULong = 1uL
public const val IW_ENCODE_ALG_TKIP: ULong = 2uL
public const val IW_ENCODE_ALG_CCMP: ULong = 3uL
public const val IW_ENCODE_ALG_PMK: ULong = 4uL
public const val IW_ENCODE_ALG_AES_CMAC: ULong = 5uL
public const val IW_ENCODE_EXT_TX_SEQ_VALID: CULong = 0x00000001uL
public const val IW_ENCODE_EXT_RX_SEQ_VALID: CULong = 0x00000002uL
public const val IW_ENCODE_EXT_GROUP_KEY: CULong = 0x00000004uL
public const val IW_ENCODE_EXT_SET_TX_KEY: CULong = 0x00000008uL
public const val IW_MICFAILURE_KEY_ID: CULong = 0x00000003uL
public const val IW_MICFAILURE_GROUP: CULong = 0x00000004uL
public const val IW_MICFAILURE_PAIRWISE: CULong = 0x00000008uL
public const val IW_MICFAILURE_STAKEY: CULong = 0x00000010uL
public const val IW_MICFAILURE_COUNT: CULong = 0x00000060uL
public const val IW_ENC_CAPA_WPA: CULong = 0x00000001uL
public const val IW_ENC_CAPA_WPA2: CULong = 0x00000002uL
public const val IW_ENC_CAPA_CIPHER_TKIP: CULong = 0x00000004uL
public const val IW_ENC_CAPA_CIPHER_CCMP: CULong = 0x00000008uL
public const val IW_ENC_CAPA_4WAY_HANDSHAKE: CULong = 0x00000010uL
public const val IW_EVENT_CAPA_K_0: CULong = 0x4000050uL
public const val IW_EVENT_CAPA_K_1: CULong = 0x400uL
public const val IW_PMKSA_ADD: ULong = 1uL
public const val IW_PMKSA_REMOVE: ULong = 2uL
public const val IW_PMKSA_FLUSH: ULong = 3uL
public const val IW_PMKID_LEN: ULong = 16uL
public const val IW_PMKID_CAND_PREAUTH: CULong = 0x00000001uL
public const val IW_EV_LCP_PK_LEN: ULong = 4uL
public const val IW_EV_CHAR_PK_LEN: ULong = 20uL
public const val IW_EV_UINT_PK_LEN: ULong = 8uL
public const val IW_EV_FREQ_PK_LEN: ULong = 12uL
public const val IW_EV_PARAM_PK_LEN: ULong = 12uL
public const val IW_EV_ADDR_PK_LEN: ULong = 20uL
public const val IW_EV_QUAL_PK_LEN: ULong = 8uL
public const val IW_EV_POINT_PK_LEN: ULong = 8uL
public val NUD_NONE: UShort = (0x00).toUShort()
public val NUD_INCOMPLETE: UShort = (0x01).toUShort()
public val NUD_REACHABLE: UShort = (0x02).toUShort()
public val NUD_STALE: UShort = (0x04).toUShort()
public val NUD_DELAY: UShort = (0x08).toUShort()
public val NUD_PROBE: UShort = (0x10).toUShort()
public val NUD_FAILED: UShort = (0x20).toUShort()
public val NUD_NOARP: UShort = (0x40).toUShort()
public val NUD_PERMANENT: UShort = (0x80).toUShort()
public val NTF_USE: UByte = (0x01).toUByte()
public val NTF_SELF: UByte = (0x02).toUByte()
public val NTF_MASTER: UByte = (0x04).toUByte()
public val NTF_PROXY: UByte = (0x08).toUByte()
public val NTF_ROUTER: UByte = (0x80).toUByte()
public val NDA_UNSPEC: CUShort = (0).toUShort()
public val NDA_DST: CUShort = (1).toUShort()
public val NDA_LLADDR: CUShort = (2).toUShort()
public val NDA_CACHEINFO: CUShort = (3).toUShort()
public val NDA_PROBES: CUShort = (4).toUShort()
public val NDA_VLAN: CUShort = (5).toUShort()
public val NDA_PORT: CUShort = (6).toUShort()
public val NDA_VNI: CUShort = (7).toUShort()
public val NDA_IFINDEX: CUShort = (8).toUShort()
public const val NLM_F_BULK: CInt = 0x200
public val TCA_UNSPEC: CUShort = (0).toUShort()
public val TCA_KIND: CUShort = (1).toUShort()
public val TCA_OPTIONS: CUShort = (2).toUShort()
public val TCA_STATS: CUShort = (3).toUShort()
public val TCA_XSTATS: CUShort = (4).toUShort()
public val TCA_RATE: CUShort = (5).toUShort()
public val TCA_FCNT: CUShort = (6).toUShort()
public val TCA_STATS2: CUShort = (7).toUShort()
public val TCA_STAB: CUShort = (8).toUShort()
public val RTM_NEWLINK: UShort = (16).toUShort()
public val RTM_DELLINK: UShort = (17).toUShort()
public val RTM_GETLINK: UShort = (18).toUShort()
public val RTM_SETLINK: UShort = (19).toUShort()
public val RTM_NEWADDR: UShort = (20).toUShort()
public val RTM_DELADDR: UShort = (21).toUShort()
public val RTM_GETADDR: UShort = (22).toUShort()
public val RTM_NEWROUTE: UShort = (24).toUShort()
public val RTM_DELROUTE: UShort = (25).toUShort()
public val RTM_GETROUTE: UShort = (26).toUShort()
public val RTM_NEWNEIGH: UShort = (28).toUShort()
public val RTM_DELNEIGH: UShort = (29).toUShort()
public val RTM_GETNEIGH: UShort = (30).toUShort()
public val RTM_NEWRULE: UShort = (32).toUShort()
public val RTM_DELRULE: UShort = (33).toUShort()
public val RTM_GETRULE: UShort = (34).toUShort()
public val RTM_NEWQDISC: UShort = (36).toUShort()
public val RTM_DELQDISC: UShort = (37).toUShort()
public val RTM_GETQDISC: UShort = (38).toUShort()
public val RTM_NEWTCLASS: UShort = (40).toUShort()
public val RTM_DELTCLASS: UShort = (41).toUShort()
public val RTM_GETTCLASS: UShort = (42).toUShort()
public val RTM_NEWTFILTER: UShort = (44).toUShort()
public val RTM_DELTFILTER: UShort = (45).toUShort()
public val RTM_GETTFILTER: UShort = (46).toUShort()
public val RTM_NEWACTION: UShort = (48).toUShort()
public val RTM_DELACTION: UShort = (49).toUShort()
public val RTM_GETACTION: UShort = (50).toUShort()
public val RTM_NEWPREFIX: UShort = (52).toUShort()
public val RTM_GETMULTICAST: UShort = (58).toUShort()
public val RTM_GETANYCAST: UShort = (62).toUShort()
public val RTM_NEWNEIGHTBL: UShort = (64).toUShort()
public val RTM_GETNEIGHTBL: UShort = (66).toUShort()
public val RTM_SETNEIGHTBL: UShort = (67).toUShort()
public val RTM_NEWNDUSEROPT: UShort = (68).toUShort()
public val RTM_NEWADDRLABEL: UShort = (72).toUShort()
public val RTM_DELADDRLABEL: UShort = (73).toUShort()
public val RTM_GETADDRLABEL: UShort = (74).toUShort()
public val RTM_GETDCB: UShort = (78).toUShort()
public val RTM_SETDCB: UShort = (79).toUShort()
public val RTM_NEWNETCONF: UShort = (80).toUShort()
public val RTM_GETNETCONF: UShort = (82).toUShort()
public val RTM_NEWMDB: UShort = (84).toUShort()
public val RTM_DELMDB: UShort = (85).toUShort()
public val RTM_GETMDB: UShort = (86).toUShort()
public val RTM_NEWNSID: UShort = (88).toUShort()
public val RTM_DELNSID: UShort = (89).toUShort()
public val RTM_GETNSID: UShort = (90).toUShort()
public const val RTM_F_NOTIFY: CUInt = 0x100u
public const val RTM_F_CLONED: CUInt = 0x200u
public const val RTM_F_EQUALIZE: CUInt = 0x400u
public const val RTM_F_PREFIX: CUInt = 0x800u
public val RTA_UNSPEC: CUShort = (0).toUShort()
public val RTA_DST: CUShort = (1).toUShort()
public val RTA_SRC: CUShort = (2).toUShort()
public val RTA_IIF: CUShort = (3).toUShort()
public val RTA_OIF: CUShort = (4).toUShort()
public val RTA_GATEWAY: CUShort = (5).toUShort()
public val RTA_PRIORITY: CUShort = (6).toUShort()
public val RTA_PREFSRC: CUShort = (7).toUShort()
public val RTA_METRICS: CUShort = (8).toUShort()
public val RTA_MULTIPATH: CUShort = (9).toUShort()
public val RTA_PROTOINFO: CUShort = (10).toUShort()
public val RTA_FLOW: CUShort = (11).toUShort()
public val RTA_CACHEINFO: CUShort = (12).toUShort()
public val RTA_SESSION: CUShort = (13).toUShort()
public val RTA_MP_ALGO: CUShort = (14).toUShort()
public val RTA_TABLE: CUShort = (15).toUShort()
public val RTA_MARK: CUShort = (16).toUShort()
public val RTA_MFC_STATS: CUShort = (17).toUShort()
public val RTN_UNSPEC: CUChar = (0).toUByte()
public val RTN_UNICAST: CUChar = (1).toUByte()
public val RTN_LOCAL: CUChar = (2).toUByte()
public val RTN_BROADCAST: CUChar = (3).toUByte()
public val RTN_ANYCAST: CUChar = (4).toUByte()
public val RTN_MULTICAST: CUChar = (5).toUByte()
public val RTN_BLACKHOLE: CUChar = (6).toUByte()
public val RTN_UNREACHABLE: CUChar = (7).toUByte()
public val RTN_PROHIBIT: CUChar = (8).toUByte()
public val RTN_THROW: CUChar = (9).toUByte()
public val RTN_NAT: CUChar = (10).toUByte()
public val RTN_XRESOLVE: CUChar = (11).toUByte()
public val RTPROT_UNSPEC: CUChar = (0).toUByte()
public val RTPROT_REDIRECT: CUChar = (1).toUByte()
public val RTPROT_KERNEL: CUChar = (2).toUByte()
public val RTPROT_BOOT: CUChar = (3).toUByte()
public val RTPROT_STATIC: CUChar = (4).toUByte()
public val RT_SCOPE_UNIVERSE: CUChar = (0).toUByte()
public val RT_SCOPE_SITE: CUChar = (200).toUByte()
public val RT_SCOPE_LINK: CUChar = (253).toUByte()
public val RT_SCOPE_HOST: CUChar = (254).toUByte()
public val RT_SCOPE_NOWHERE: CUChar = (255).toUByte()
public val RT_TABLE_UNSPEC: CUChar = (0).toUByte()
public val RT_TABLE_COMPAT: CUChar = (252).toUByte()
public val RT_TABLE_DEFAULT: CUChar = (253).toUByte()
public val RT_TABLE_MAIN: CUChar = (254).toUByte()
public val RT_TABLE_LOCAL: CUChar = (255).toUByte()
public val RTMSG_OVERRUN: UInt = NLMSG_OVERRUN.toUInt()
public const val RTMSG_NEWDEVICE: UInt = 0x11u
public const val RTMSG_DELDEVICE: UInt = 0x12u
public const val RTMSG_NEWROUTE: UInt = 0x21u
public const val RTMSG_DELROUTE: UInt = 0x22u
public const val RTMSG_NEWRULE: UInt = 0x31u
public const val RTMSG_DELRULE: UInt = 0x32u
public const val RTMSG_CONTROL: UInt = 0x40u
public const val RTMSG_AR_FAILED: UInt = 0x51u
public val RTEXT_FILTER_VF: CInt = 1 shl 0
public val RTEXT_FILTER_BRVLAN: CInt = 1 shl 1
public val RTEXT_FILTER_BRVLAN_COMPRESSED: CInt = 1 shl 2
public val RTEXT_FILTER_SKIP_STATS: CInt = 1 shl 3
public val RTEXT_FILTER_MRP: CInt = 1 shl 4
public val RTEXT_FILTER_CFM_CONFIG: CInt = 1 shl 5
public val RTEXT_FILTER_CFM_STATUS: CInt = 1 shl 6
public const val RTMGRP_LINK: CInt = 0x00001
public const val RTMGRP_NOTIFY: CInt = 0x00002
public const val RTMGRP_NEIGH: CInt = 0x00004
public const val RTMGRP_TC: CInt = 0x00008
public const val RTMGRP_IPV4_IFADDR: CInt = 0x00010
public const val RTMGRP_IPV4_MROUTE: CInt = 0x00020
public const val RTMGRP_IPV4_ROUTE: CInt = 0x00040
public const val RTMGRP_IPV4_RULE: CInt = 0x00080
public const val RTMGRP_IPV6_IFADDR: CInt = 0x00100
public const val RTMGRP_IPV6_MROUTE: CInt = 0x00200
public const val RTMGRP_IPV6_ROUTE: CInt = 0x00400
public const val RTMGRP_IPV6_IFINFO: CInt = 0x00800
public const val RTMGRP_DECnet_IFADDR: CInt = 0x01000
public const val RTMGRP_DECnet_ROUTE: CInt = 0x04000
public const val RTMGRP_IPV6_PREFIX: CInt = 0x20000
public const val RTNLGRP_NONE: CUInt = 0x00u
public const val RTNLGRP_LINK: CUInt = 0x01u
public const val RTNLGRP_NOTIFY: CUInt = 0x02u
public const val RTNLGRP_NEIGH: CUInt = 0x03u
public const val RTNLGRP_TC: CUInt = 0x04u
public const val RTNLGRP_IPV4_IFADDR: CUInt = 0x05u
public const val RTNLGRP_IPV4_MROUTE: CUInt = 0x06u
public const val RTNLGRP_IPV4_ROUTE: CUInt = 0x07u
public const val RTNLGRP_IPV4_RULE: CUInt = 0x08u
public const val RTNLGRP_IPV6_IFADDR: CUInt = 0x09u
public const val RTNLGRP_IPV6_MROUTE: CUInt = 0x0au
public const val RTNLGRP_IPV6_ROUTE: CUInt = 0x0bu
public const val RTNLGRP_IPV6_IFINFO: CUInt = 0x0cu
public const val RTNLGRP_DECnet_IFADDR: CUInt = 0x0du
public const val RTNLGRP_NOP2: CUInt = 0x0eu
public const val RTNLGRP_DECnet_ROUTE: CUInt = 0x0fu
public const val RTNLGRP_DECnet_RULE: CUInt = 0x10u
public const val RTNLGRP_NOP4: CUInt = 0x11u
public const val RTNLGRP_IPV6_PREFIX: CUInt = 0x12u
public const val RTNLGRP_IPV6_RULE: CUInt = 0x13u
public const val RTNLGRP_ND_USEROPT: CUInt = 0x14u
public const val RTNLGRP_PHONET_IFADDR: CUInt = 0x15u
public const val RTNLGRP_PHONET_ROUTE: CUInt = 0x16u
public const val RTNLGRP_DCB: CUInt = 0x17u
public const val RTNLGRP_IPV4_NETCONF: CUInt = 0x18u
public const val RTNLGRP_IPV6_NETCONF: CUInt = 0x19u
public const val RTNLGRP_MDB: CUInt = 0x1au
public const val RTNLGRP_MPLS_ROUTE: CUInt = 0x1bu
public const val RTNLGRP_NSID: CUInt = 0x1cu
public const val RTNLGRP_MPLS_NETCONF: CUInt = 0x1du
public const val RTNLGRP_IPV4_MROUTE_R: CUInt = 0x1eu
public const val RTNLGRP_IPV6_MROUTE_R: CUInt = 0x1fu
public const val RTNLGRP_NEXTHOP: CUInt = 0x20u
public const val RTNLGRP_BRVLAN: CUInt = 0x21u
public const val RTNLGRP_MCTP_IFADDR: CUInt = 0x22u
public const val RTNLGRP_TUNNEL: CUInt = 0x23u
public const val RTNLGRP_STATS: CUInt = 0x24u
public const val CN_IDX_PROC: CUInt = 0x1u
public const val CN_VAL_PROC: CUInt = 0x1u
public const val CN_IDX_CIFS: CUInt = 0x2u
public const val CN_VAL_CIFS: CUInt = 0x1u
public const val CN_W1_IDX: CUInt = 0x3u
public const val CN_W1_VAL: CUInt = 0x1u
public const val CN_IDX_V86D: CUInt = 0x4u
public const val CN_VAL_V86D_UVESAFB: CUInt = 0x1u
public const val CN_IDX_BB: CUInt = 0x5u
public const val CN_DST_IDX: CUInt = 0x6u
public const val CN_DST_VAL: CUInt = 0x1u
public const val CN_IDX_DM: CUInt = 0x7u
public const val CN_VAL_DM_USERSPACE_LOG: CUInt = 0x1u
public const val CN_IDX_DRBD: CUInt = 0x8u
public const val CN_VAL_DRBD: CUInt = 0x1u
public const val CN_KVP_IDX: CUInt = 0x9u
public const val CN_KVP_VAL: CUInt = 0x1u
public const val CN_VSS_IDX: CUInt = 0xAu
public const val CN_VSS_VAL: CUInt = 0x1u
public const val MODULE_INIT_IGNORE_MODVERSIONS: CUInt = 0x0001u
public const val MODULE_INIT_IGNORE_VERMAGIC: CUInt = 0x0002u
public val SOF_TIMESTAMPING_TX_HARDWARE: CUInt = 1.toUInt() shl 0
public val SOF_TIMESTAMPING_TX_SOFTWARE: CUInt = 1.toUInt() shl 1
public val SOF_TIMESTAMPING_RX_HARDWARE: CUInt = 1.toUInt() shl 2
public val SOF_TIMESTAMPING_RX_SOFTWARE: CUInt = 1.toUInt() shl 3
public val SOF_TIMESTAMPING_SOFTWARE: CUInt = 1.toUInt() shl 4
public val SOF_TIMESTAMPING_SYS_HARDWARE: CUInt = 1.toUInt() shl 5
public val SOF_TIMESTAMPING_RAW_HARDWARE: CUInt = 1.toUInt() shl 6
public val SOF_TIMESTAMPING_OPT_ID: CUInt = 1.toUInt() shl 7
public val SOF_TIMESTAMPING_TX_SCHED: CUInt = 1.toUInt() shl 8
public val SOF_TIMESTAMPING_TX_ACK: CUInt = 1.toUInt() shl 9
public val SOF_TIMESTAMPING_OPT_CMSG: CUInt = 1.toUInt() shl 10
public val SOF_TIMESTAMPING_OPT_TSONLY: CUInt = 1.toUInt() shl 11
public val SOF_TIMESTAMPING_OPT_STATS: CUInt = 1.toUInt() shl 12
public val SOF_TIMESTAMPING_OPT_PKTINFO: CUInt = 1.toUInt() shl 13
public val SOF_TIMESTAMPING_OPT_TX_SWHW: CUInt = 1.toUInt() shl 14
public val SOF_TIMESTAMPING_BIND_PHC: CUInt = 1.toUInt() shl 15
public val SOF_TIMESTAMPING_OPT_ID_TCP: CUInt = 1.toUInt() shl 16
public val SOF_TIMESTAMPING_OPT_RX_FILTER: CUInt = 1.toUInt() shl 17
public val SOF_TXTIME_DEADLINE_MODE: UInt = 1.toUInt() shl 0
public val SOF_TXTIME_REPORT_ERRORS: UInt = 1.toUInt() shl 1
public const val HWTSTAMP_TX_OFF: CUInt = 0u
public const val HWTSTAMP_TX_ON: CUInt = 1u
public const val HWTSTAMP_TX_ONESTEP_SYNC: CUInt = 2u
public const val HWTSTAMP_TX_ONESTEP_P2P: CUInt = 3u
public const val HWTSTAMP_FILTER_NONE: CUInt = 0u
public const val HWTSTAMP_FILTER_ALL: CUInt = 1u
public const val HWTSTAMP_FILTER_SOME: CUInt = 2u
public const val HWTSTAMP_FILTER_PTP_V1_L4_EVENT: CUInt = 3u
public const val HWTSTAMP_FILTER_PTP_V1_L4_SYNC: CUInt = 4u
public const val HWTSTAMP_FILTER_PTP_V1_L4_DELAY_REQ: CUInt = 5u
public const val HWTSTAMP_FILTER_PTP_V2_L4_EVENT: CUInt = 6u
public const val HWTSTAMP_FILTER_PTP_V2_L4_SYNC: CUInt = 7u
public const val HWTSTAMP_FILTER_PTP_V2_L4_DELAY_REQ: CUInt = 8u
public const val HWTSTAMP_FILTER_PTP_V2_L2_EVENT: CUInt = 9u
public const val HWTSTAMP_FILTER_PTP_V2_L2_SYNC: CUInt = 10u
public const val HWTSTAMP_FILTER_PTP_V2_L2_DELAY_REQ: CUInt = 11u
public const val HWTSTAMP_FILTER_PTP_V2_EVENT: CUInt = 12u
public const val HWTSTAMP_FILTER_PTP_V2_SYNC: CUInt = 13u
public const val HWTSTAMP_FILTER_PTP_V2_DELAY_REQ: CUInt = 14u
public const val HWTSTAMP_FILTER_NTP_ALL: CUInt = 15u
public const val PTP_MAX_SAMPLES: CUInt = 25u
public val PTP_CLOCK_GETCAPS: Ioctl = ioctlCode<PtpClockCaps>(PTP_CLK_MAGIC, 1.toUInt())
public val PTP_EXTTS_REQUEST: Ioctl = ioctlCode<PtpExttsRequest>(PTP_CLK_MAGIC, 2.toUInt())
public val PTP_PEROUT_REQUEST: Ioctl = ioctlCode<PtpPeroutRequest>(PTP_CLK_MAGIC, 3.toUInt())
public val PTP_ENABLE_PPS: Ioctl = ioctlCode<CInt>(PTP_CLK_MAGIC, 4.toUInt())
public val PTP_SYS_OFFSET: Ioctl = ioctlCode<PtpSysOffset>(PTP_CLK_MAGIC, 5.toUInt())
public val PTP_PIN_GETFUNC: Ioctl = ioctlCode<PtpPinDesc>(PTP_CLK_MAGIC, 6.toUInt())
public val PTP_PIN_SETFUNC: Ioctl = ioctlCode<PtpPinDesc>(PTP_CLK_MAGIC, 7.toUInt())
public val PTP_SYS_OFFSET_PRECISE: Ioctl = ioctlCode<PtpSysOffsetPrecise>(PTP_CLK_MAGIC, 8.toUInt())
public val PTP_SYS_OFFSET_EXTENDED: Ioctl = ioctlCode<PtpSysOffsetExtended>(PTP_CLK_MAGIC, 9.toUInt())
public val PTP_CLOCK_GETCAPS2: Ioctl = ioctlCode<PtpClockCaps>(PTP_CLK_MAGIC, 10.toUInt())
public val PTP_EXTTS_REQUEST2: Ioctl = ioctlCode<PtpExttsRequest>(PTP_CLK_MAGIC, 11.toUInt())
public val PTP_PEROUT_REQUEST2: Ioctl = ioctlCode<PtpPeroutRequest>(PTP_CLK_MAGIC, 12.toUInt())
public val PTP_ENABLE_PPS2: Ioctl = ioctlCode<CInt>(PTP_CLK_MAGIC, 13.toUInt())
public val PTP_SYS_OFFSET2: Ioctl = ioctlCode<PtpSysOffset>(PTP_CLK_MAGIC, 14.toUInt())
public val PTP_PIN_GETFUNC2: Ioctl = ioctlCode<PtpPinDesc>(PTP_CLK_MAGIC, 15.toUInt())
public val PTP_PIN_SETFUNC2: Ioctl = ioctlCode<PtpPinDesc>(PTP_CLK_MAGIC, 16.toUInt())
public val PTP_SYS_OFFSET_PRECISE2: Ioctl = ioctlCode<PtpSysOffsetPrecise>(PTP_CLK_MAGIC, 17.toUInt())
public val PTP_SYS_OFFSET_EXTENDED2: Ioctl = ioctlCode<PtpSysOffsetExtended>(PTP_CLK_MAGIC, 18.toUInt())
public const val PTP_PF_NONE: CUInt = 0u
public const val PTP_PF_EXTTS: CUInt = 1u
public const val PTP_PF_PEROUT: CUInt = 2u
public const val PTP_PF_PHYSYNC: CUInt = 3u
public const val TLS_TX: CInt = 1
public const val TLS_RX: CInt = 2
public const val TLS_TX_ZEROCOPY_RO: CInt = 3
public const val TLS_RX_EXPECT_NO_PAD: CInt = 4
public const val TLS_1_2_VERSION_MAJOR: U8 = 0x3u
public const val TLS_1_2_VERSION_MINOR: U8 = 0x3u
public const val TLS_1_3_VERSION_MAJOR: U8 = 0x3u
public const val TLS_1_3_VERSION_MINOR: U8 = 0x4u
public const val TLS_CIPHER_AES_GCM_128: U16 = 51u
public const val TLS_CIPHER_AES_GCM_128_IV_SIZE: ULong = 8uL
public const val TLS_CIPHER_AES_GCM_128_KEY_SIZE: ULong = 16uL
public const val TLS_CIPHER_AES_GCM_128_SALT_SIZE: ULong = 4uL
public const val TLS_CIPHER_AES_GCM_128_TAG_SIZE: ULong = 16uL
public const val TLS_CIPHER_AES_GCM_128_REC_SEQ_SIZE: ULong = 8uL
public const val TLS_CIPHER_AES_GCM_256: U16 = 52u
public const val TLS_CIPHER_AES_GCM_256_IV_SIZE: ULong = 8uL
public const val TLS_CIPHER_AES_GCM_256_KEY_SIZE: ULong = 32uL
public const val TLS_CIPHER_AES_GCM_256_SALT_SIZE: ULong = 4uL
public const val TLS_CIPHER_AES_GCM_256_TAG_SIZE: ULong = 16uL
public const val TLS_CIPHER_AES_GCM_256_REC_SEQ_SIZE: ULong = 8uL
public const val TLS_CIPHER_AES_CCM_128: U16 = 53u
public const val TLS_CIPHER_AES_CCM_128_IV_SIZE: ULong = 8uL
public const val TLS_CIPHER_AES_CCM_128_KEY_SIZE: ULong = 16uL
public const val TLS_CIPHER_AES_CCM_128_SALT_SIZE: ULong = 4uL
public const val TLS_CIPHER_AES_CCM_128_TAG_SIZE: ULong = 16uL
public const val TLS_CIPHER_AES_CCM_128_REC_SEQ_SIZE: ULong = 8uL
public const val TLS_CIPHER_CHACHA20_POLY1305: U16 = 54u
public const val TLS_CIPHER_CHACHA20_POLY1305_IV_SIZE: ULong = 12uL
public const val TLS_CIPHER_CHACHA20_POLY1305_KEY_SIZE: ULong = 32uL
public const val TLS_CIPHER_CHACHA20_POLY1305_SALT_SIZE: ULong = 0uL
public const val TLS_CIPHER_CHACHA20_POLY1305_TAG_SIZE: ULong = 16uL
public const val TLS_CIPHER_CHACHA20_POLY1305_REC_SEQ_SIZE: ULong = 8uL
public const val TLS_CIPHER_SM4_GCM: U16 = 55u
public const val TLS_CIPHER_SM4_GCM_IV_SIZE: ULong = 8uL
public const val TLS_CIPHER_SM4_GCM_KEY_SIZE: ULong = 16uL
public const val TLS_CIPHER_SM4_GCM_SALT_SIZE: ULong = 4uL
public const val TLS_CIPHER_SM4_GCM_TAG_SIZE: ULong = 16uL
public const val TLS_CIPHER_SM4_GCM_REC_SEQ_SIZE: ULong = 8uL
public const val TLS_CIPHER_SM4_CCM: U16 = 56u
public const val TLS_CIPHER_SM4_CCM_IV_SIZE: ULong = 8uL
public const val TLS_CIPHER_SM4_CCM_KEY_SIZE: ULong = 16uL
public const val TLS_CIPHER_SM4_CCM_SALT_SIZE: ULong = 4uL
public const val TLS_CIPHER_SM4_CCM_TAG_SIZE: ULong = 16uL
public const val TLS_CIPHER_SM4_CCM_REC_SEQ_SIZE: ULong = 8uL
public const val TLS_CIPHER_ARIA_GCM_128: U16 = 57u
public const val TLS_CIPHER_ARIA_GCM_128_IV_SIZE: ULong = 8uL
public const val TLS_CIPHER_ARIA_GCM_128_KEY_SIZE: ULong = 16uL
public const val TLS_CIPHER_ARIA_GCM_128_SALT_SIZE: ULong = 4uL
public const val TLS_CIPHER_ARIA_GCM_128_TAG_SIZE: ULong = 16uL
public const val TLS_CIPHER_ARIA_GCM_128_REC_SEQ_SIZE: ULong = 8uL
public const val TLS_CIPHER_ARIA_GCM_256: U16 = 58u
public const val TLS_CIPHER_ARIA_GCM_256_IV_SIZE: ULong = 8uL
public const val TLS_CIPHER_ARIA_GCM_256_KEY_SIZE: ULong = 32uL
public const val TLS_CIPHER_ARIA_GCM_256_SALT_SIZE: ULong = 4uL
public const val TLS_CIPHER_ARIA_GCM_256_TAG_SIZE: ULong = 16uL
public const val TLS_CIPHER_ARIA_GCM_256_REC_SEQ_SIZE: ULong = 8uL
public const val TLS_SET_RECORD_TYPE: CInt = 1
public const val TLS_GET_RECORD_TYPE: CInt = 2
public const val SOL_TLS: CInt = 282
public const val TLS_INFO_UNSPEC: CInt = 0x00
public const val TLS_INFO_VERSION: CInt = 0x01
public const val TLS_INFO_CIPHER: CInt = 0x02
public const val TLS_INFO_TXCONF: CInt = 0x03
public const val TLS_INFO_RXCONF: CInt = 0x04
public const val TLS_INFO_ZC_RO_TX: CInt = 0x05
public const val TLS_INFO_RX_NO_PAD: CInt = 0x06
public const val TLS_CONF_BASE: CInt = 1
public const val TLS_CONF_SW: CInt = 2
public const val TLS_CONF_HW: CInt = 3
public const val TLS_CONF_HW_RECORD: CInt = 4
public const val ALG_SET_KEY: CInt = 1
public const val ALG_SET_IV: CInt = 2
public const val ALG_SET_OP: CInt = 3
public const val ALG_SET_AEAD_ASSOCLEN: CInt = 4
public const val ALG_SET_AEAD_AUTHSIZE: CInt = 5
public const val ALG_SET_DRBG_ENTROPY: CInt = 6
public const val ALG_SET_KEY_BY_KEY_SERIAL: CInt = 7
public const val ALG_OP_DECRYPT: CInt = 0
public const val ALG_OP_ENCRYPT: CInt = 1
public const val IF_OPER_UNKNOWN: CInt = 0
public const val IF_OPER_NOTPRESENT: CInt = 1
public const val IF_OPER_DOWN: CInt = 2
public const val IF_OPER_LOWERLAYERDOWN: CInt = 3
public const val IF_OPER_TESTING: CInt = 4
public const val IF_OPER_DORMANT: CInt = 5
public const val IF_OPER_UP: CInt = 6
public const val IF_LINK_MODE_DEFAULT: CInt = 0
public const val IF_LINK_MODE_DORMANT: CInt = 1
public const val IF_LINK_MODE_TESTING: CInt = 2
public const val MAP_SHARED_VALIDATE: CInt = 0x3
public const val MAP_DROPPABLE: CInt = 0x8
public const val VMADDR_CID_ANY: CUInt = 0xFFFFFFFFu
public const val VMADDR_CID_HYPERVISOR: CUInt = 0u
public const val VMADDR_CID_RESERVED: CUInt = 1u
public const val VMADDR_CID_LOCAL: CUInt = 1u
public const val VMADDR_CID_HOST: CUInt = 2u
public const val VMADDR_PORT_ANY: CUInt = 0xFFFFFFFFu
public const val IN_ACCESS: UInt = 0x0000_0001u
public const val IN_MODIFY: UInt = 0x0000_0002u
public const val IN_ATTRIB: UInt = 0x0000_0004u
public const val IN_CLOSE_WRITE: UInt = 0x0000_0008u
public const val IN_CLOSE_NOWRITE: UInt = 0x0000_0010u
public val IN_CLOSE: UInt = IN_CLOSE_WRITE or IN_CLOSE_NOWRITE
public const val IN_OPEN: UInt = 0x0000_0020u
public const val IN_MOVED_FROM: UInt = 0x0000_0040u
public const val IN_MOVED_TO: UInt = 0x0000_0080u
public val IN_MOVE: UInt = IN_MOVED_FROM or IN_MOVED_TO
public const val IN_CREATE: UInt = 0x0000_0100u
public const val IN_DELETE: UInt = 0x0000_0200u
public const val IN_DELETE_SELF: UInt = 0x0000_0400u
public const val IN_MOVE_SELF: UInt = 0x0000_0800u
public const val IN_UNMOUNT: UInt = 0x0000_2000u
public const val IN_Q_OVERFLOW: UInt = 0x0000_4000u
public const val IN_IGNORED: UInt = 0x0000_8000u
public const val IN_ONLYDIR: UInt = 0x0100_0000u
public const val IN_DONT_FOLLOW: UInt = 0x0200_0000u
public const val IN_EXCL_UNLINK: UInt = 0x0400_0000u

public fun issecure_mask(x: CInt): CInt = 1 shl x

public const val SECURE_NOROOT: CInt = 0
public const val SECURE_NOROOT_LOCKED: CInt = 1
public const val SECURE_NO_SETUID_FIXUP: CInt = 2
public const val SECURE_NO_SETUID_FIXUP_LOCKED: CInt = 3
public const val SECURE_KEEP_CAPS: CInt = 4
public const val SECURE_KEEP_CAPS_LOCKED: CInt = 5
public const val SECURE_NO_CAP_AMBIENT_RAISE: CInt = 6
public const val SECURE_NO_CAP_AMBIENT_RAISE_LOCKED: CInt = 7
public const val SECURE_EXEC_RESTRICT_FILE: CInt = 8
public const val SECURE_EXEC_RESTRICT_FILE_LOCKED: CInt = 9
public const val SECURE_EXEC_DENY_INTERACTIVE: CInt = 10
public const val SECURE_EXEC_DENY_INTERACTIVE_LOCKED: CInt = 11

public val SECBIT_NOROOT: CInt = issecure_mask(SECURE_NOROOT)
public val SECBIT_NOROOT_LOCKED: CInt = issecure_mask(SECURE_NOROOT_LOCKED)
public val SECBIT_NO_SETUID_FIXUP: CInt = issecure_mask(SECURE_NO_SETUID_FIXUP)
public val SECBIT_NO_SETUID_FIXUP_LOCKED: CInt = issecure_mask(SECURE_NO_SETUID_FIXUP_LOCKED)
public val SECBIT_KEEP_CAPS: CInt = issecure_mask(SECURE_KEEP_CAPS)
public val SECBIT_KEEP_CAPS_LOCKED: CInt = issecure_mask(SECURE_KEEP_CAPS_LOCKED)
public val SECBIT_NO_CAP_AMBIENT_RAISE: CInt = issecure_mask(SECURE_NO_CAP_AMBIENT_RAISE)
public val SECBIT_EXEC_RESTRICT_FILE: CInt = issecure_mask(SECURE_EXEC_RESTRICT_FILE)
public val SECBIT_EXEC_RESTRICT_FILE_LOCKED: CInt = issecure_mask(SECURE_EXEC_RESTRICT_FILE_LOCKED)
public val SECBIT_EXEC_DENY_INTERACTIVE: CInt = issecure_mask(SECURE_EXEC_DENY_INTERACTIVE)
public const val SECUREBITS_DEFAULT: CInt = 0x00000000
public val SECURE_ALL_BITS: CInt = SECBIT_NOROOT or SECBIT_NO_SETUID_FIXUP or SECBIT_KEEP_CAPS or SECBIT_NO_CAP_AMBIENT_RAISE or SECBIT_EXEC_RESTRICT_FILE or SECBIT_EXEC_DENY_INTERACTIVE
public val SECURE_ALL_LOCKS: CInt = SECURE_ALL_BITS shl 1
public const val IN_MASK_CREATE: UInt = 0x1000_0000u
public const val IN_MASK_ADD: UInt = 0x2000_0000u
public const val IN_ISDIR: UInt = 0x4000_0000u
public const val IN_ONESHOT: UInt = 0x8000_0000u
public val IN_ALL_EVENTS: UInt = IN_ACCESS or IN_MODIFY or IN_ATTRIB or IN_CLOSE_WRITE or IN_CLOSE_NOWRITE or IN_OPEN or IN_MOVED_FROM or IN_MOVED_TO or IN_DELETE or IN_CREATE or IN_DELETE_SELF or IN_MOVE_SELF
public const val IN_CLOEXEC: CInt = O_CLOEXEC
public const val IN_NONBLOCK: CInt = O_NONBLOCK
public const val OPEN_TREE_CLONE: CUInt = 0x01u
public val OPEN_TREE_CLOEXEC: CUInt = O_CLOEXEC.toUInt()
public const val NFT_TABLE_MAXNAMELEN: CInt = 256
public const val NFT_CHAIN_MAXNAMELEN: CInt = 256
public const val NFT_SET_MAXNAMELEN: CInt = 256
public const val NFT_OBJ_MAXNAMELEN: CInt = 256
public const val NFT_USERDATA_MAXLEN: CInt = 256
public const val NFT_REG_VERDICT: CInt = 0
public const val NFT_REG_1: CInt = 1
public const val NFT_REG_2: CInt = 2
public const val NFT_REG_3: CInt = 3
public const val NFT_REG_4: CInt = 4
public const val __NFT_REG_MAX: CInt = 5
public const val NFT_REG32_00: CInt = 8
public const val NFT_REG32_01: CInt = 9
public const val NFT_REG32_02: CInt = 10
public const val NFT_REG32_03: CInt = 11
public const val NFT_REG32_04: CInt = 12
public const val NFT_REG32_05: CInt = 13
public const val NFT_REG32_06: CInt = 14
public const val NFT_REG32_07: CInt = 15
public const val NFT_REG32_08: CInt = 16
public const val NFT_REG32_09: CInt = 17
public const val NFT_REG32_10: CInt = 18
public const val NFT_REG32_11: CInt = 19
public const val NFT_REG32_12: CInt = 20
public const val NFT_REG32_13: CInt = 21
public const val NFT_REG32_14: CInt = 22
public const val NFT_REG32_15: CInt = 23
public const val NFT_REG_SIZE: CInt = 16
public const val NFT_REG32_SIZE: CInt = 4
public const val NFT_CONTINUE: CInt = -1
public const val NFT_BREAK: CInt = -2
public const val NFT_JUMP: CInt = -3
public const val NFT_GOTO: CInt = -4
public const val NFT_RETURN: CInt = -5
public const val NFT_MSG_NEWTABLE: CInt = 0
public const val NFT_MSG_GETTABLE: CInt = 1
public const val NFT_MSG_DELTABLE: CInt = 2
public const val NFT_MSG_NEWCHAIN: CInt = 3
public const val NFT_MSG_GETCHAIN: CInt = 4
public const val NFT_MSG_DELCHAIN: CInt = 5
public const val NFT_MSG_NEWRULE: CInt = 6
public const val NFT_MSG_GETRULE: CInt = 7
public const val NFT_MSG_DELRULE: CInt = 8
public const val NFT_MSG_NEWSET: CInt = 9
public const val NFT_MSG_GETSET: CInt = 10
public const val NFT_MSG_DELSET: CInt = 11
public const val NFT_MSG_NEWSETELEM: CInt = 12
public const val NFT_MSG_GETSETELEM: CInt = 13
public const val NFT_MSG_DELSETELEM: CInt = 14
public const val NFT_MSG_NEWGEN: CInt = 15
public const val NFT_MSG_GETGEN: CInt = 16
public const val NFT_MSG_TRACE: CInt = 17
public const val NFT_MSG_NEWOBJ: CInt = 18
public const val NFT_MSG_GETOBJ: CInt = 19
public const val NFT_MSG_DELOBJ: CInt = 20
public const val NFT_MSG_GETOBJ_RESET: CInt = 21
public const val NFT_MSG_MAX: CInt = 34
public const val NFT_SET_ANONYMOUS: CInt = 0x1
public const val NFT_SET_CONSTANT: CInt = 0x2
public const val NFT_SET_INTERVAL: CInt = 0x4
public const val NFT_SET_MAP: CInt = 0x8
public const val NFT_SET_TIMEOUT: CInt = 0x10
public const val NFT_SET_EVAL: CInt = 0x20
public const val NFT_SET_POL_PERFORMANCE: CInt = 0
public const val NFT_SET_POL_MEMORY: CInt = 1
public const val NFT_SET_ELEM_INTERVAL_END: CInt = 0x1
public const val NFT_DATA_VALUE: CUInt = 0u
public const val NFT_DATA_VERDICT: CUInt = 0xffffff00u
public const val NFT_DATA_RESERVED_MASK: CUInt = 0xffffff00u
public const val NFT_DATA_VALUE_MAXLEN: CInt = 64
public const val NFT_BYTEORDER_NTOH: CInt = 0
public const val NFT_BYTEORDER_HTON: CInt = 1
public const val NFT_CMP_EQ: CInt = 0
public const val NFT_CMP_NEQ: CInt = 1
public const val NFT_CMP_LT: CInt = 2
public const val NFT_CMP_LTE: CInt = 3
public const val NFT_CMP_GT: CInt = 4
public const val NFT_CMP_GTE: CInt = 5
public const val NFT_RANGE_EQ: CInt = 0
public const val NFT_RANGE_NEQ: CInt = 1
public val NFT_LOOKUP_F_INV: CInt = 1 shl 0
public const val NFT_DYNSET_OP_ADD: CInt = 0
public const val NFT_DYNSET_OP_UPDATE: CInt = 1
public val NFT_DYNSET_F_INV: CInt = 1 shl 0
public const val NFT_PAYLOAD_LL_HEADER: CInt = 0
public const val NFT_PAYLOAD_NETWORK_HEADER: CInt = 1
public const val NFT_PAYLOAD_TRANSPORT_HEADER: CInt = 2
public const val NFT_PAYLOAD_CSUM_NONE: CInt = 0
public const val NFT_PAYLOAD_CSUM_INET: CInt = 1
public const val NFT_META_LEN: CInt = 0
public const val NFT_META_PROTOCOL: CInt = 1
public const val NFT_META_PRIORITY: CInt = 2
public const val NFT_META_MARK: CInt = 3
public const val NFT_META_IIF: CInt = 4
public const val NFT_META_OIF: CInt = 5
public const val NFT_META_IIFNAME: CInt = 6
public const val NFT_META_OIFNAME: CInt = 7
public const val NFT_META_IIFTYPE: CInt = 8
public const val NFT_META_OIFTYPE: CInt = 9
public const val NFT_META_SKUID: CInt = 10
public const val NFT_META_SKGID: CInt = 11
public const val NFT_META_NFTRACE: CInt = 12
public const val NFT_META_RTCLASSID: CInt = 13
public const val NFT_META_SECMARK: CInt = 14
public const val NFT_META_NFPROTO: CInt = 15
public const val NFT_META_L4PROTO: CInt = 16
public const val NFT_META_BRI_IIFNAME: CInt = 17
public const val NFT_META_BRI_OIFNAME: CInt = 18
public const val NFT_META_PKTTYPE: CInt = 19
public const val NFT_META_CPU: CInt = 20
public const val NFT_META_IIFGROUP: CInt = 21
public const val NFT_META_OIFGROUP: CInt = 22
public const val NFT_META_CGROUP: CInt = 23
public const val NFT_META_PRANDOM: CInt = 24
public const val NFT_CT_STATE: CInt = 0
public const val NFT_CT_DIRECTION: CInt = 1
public const val NFT_CT_STATUS: CInt = 2
public const val NFT_CT_MARK: CInt = 3
public const val NFT_CT_SECMARK: CInt = 4
public const val NFT_CT_EXPIRATION: CInt = 5
public const val NFT_CT_HELPER: CInt = 6
public const val NFT_CT_L3PROTOCOL: CInt = 7
public const val NFT_CT_SRC: CInt = 8
public const val NFT_CT_DST: CInt = 9
public const val NFT_CT_PROTOCOL: CInt = 10
public const val NFT_CT_PROTO_SRC: CInt = 11
public const val NFT_CT_PROTO_DST: CInt = 12
public const val NFT_CT_LABELS: CInt = 13
public const val NFT_CT_PKTS: CInt = 14
public const val NFT_CT_BYTES: CInt = 15
public const val NFT_CT_AVGPKT: CInt = 16
public const val NFT_CT_ZONE: CInt = 17
public const val NFT_CT_EVENTMASK: CInt = 18
public const val NFT_CT_SRC_IP: CInt = 19
public const val NFT_CT_DST_IP: CInt = 20
public const val NFT_CT_SRC_IP6: CInt = 21
public const val NFT_CT_DST_IP6: CInt = 22
public const val NFT_LIMIT_PKTS: CInt = 0
public const val NFT_LIMIT_PKT_BYTES: CInt = 1
public val NFT_LIMIT_F_INV: CInt = 1 shl 0
public const val NFT_QUEUE_FLAG_BYPASS: CInt = 0x01
public const val NFT_QUEUE_FLAG_CPU_FANOUT: CInt = 0x02
public const val NFT_QUEUE_FLAG_MASK: CInt = 0x03
public val NFT_QUOTA_F_INV: CInt = 1 shl 0
public const val NFT_REJECT_ICMP_UNREACH: CInt = 0
public const val NFT_REJECT_TCP_RST: CInt = 1
public const val NFT_REJECT_ICMPX_UNREACH: CInt = 2
public const val NFT_REJECT_ICMPX_NO_ROUTE: CInt = 0
public const val NFT_REJECT_ICMPX_PORT_UNREACH: CInt = 1
public const val NFT_REJECT_ICMPX_HOST_UNREACH: CInt = 2
public const val NFT_REJECT_ICMPX_ADMIN_PROHIBITED: CInt = 3
public const val NFT_NAT_SNAT: CInt = 0
public const val NFT_NAT_DNAT: CInt = 1
public const val NFT_TRACETYPE_UNSPEC: CInt = 0
public const val NFT_TRACETYPE_POLICY: CInt = 1
public const val NFT_TRACETYPE_RETURN: CInt = 2
public const val NFT_TRACETYPE_RULE: CInt = 3
public const val NFT_NG_INCREMENTAL: CInt = 0
public const val NFT_NG_RANDOM: CInt = 1
public const val FF_MAX: U16 = 0x7fu
public val FF_CNT: ULong = FF_MAX.toULong() + 1u
public const val INPUT_PROP_POINTER: U16 = 0x00u
public const val INPUT_PROP_DIRECT: U16 = 0x01u
public const val INPUT_PROP_BUTTONPAD: U16 = 0x02u
public const val INPUT_PROP_SEMI_MT: U16 = 0x03u
public const val INPUT_PROP_TOPBUTTONPAD: U16 = 0x04u
public const val INPUT_PROP_POINTING_STICK: U16 = 0x05u
public const val INPUT_PROP_ACCELEROMETER: U16 = 0x06u
public const val INPUT_PROP_MAX: U16 = 0x1fu
public val INPUT_PROP_CNT: ULong = INPUT_PROP_MAX.toULong() + 1u
public const val EV_MAX: U16 = 0x1fu
public val EV_CNT: ULong = EV_MAX.toULong() + 1u
public const val SYN_MAX: U16 = 0xfu
public val SYN_CNT: ULong = SYN_MAX.toULong() + 1u
public const val KEY_MAX: U16 = 0x2ffu
public val KEY_CNT: ULong = KEY_MAX.toULong() + 1u
public const val REL_MAX: U16 = 0x0fu
public val REL_CNT: ULong = REL_MAX.toULong() + 1u
public const val ABS_MAX: U16 = 0x3fu
public val ABS_CNT: ULong = ABS_MAX.toULong() + 1u
public const val SW_MAX: U16 = 0x10u
public val SW_CNT: ULong = SW_MAX.toULong() + 1u
public const val MSC_MAX: U16 = 0x07u
public val MSC_CNT: ULong = MSC_MAX.toULong() + 1u
public const val LED_MAX: U16 = 0x0fu
public val LED_CNT: ULong = LED_MAX.toULong() + 1u
public const val REP_MAX: U16 = 0x01u
public val REP_CNT: ULong = REP_MAX.toULong() + 1u
public const val SND_MAX: U16 = 0x07u
public val SND_CNT: ULong = SND_MAX.toULong() + 1u
public const val UINPUT_VERSION: CUInt = 5u
public const val UINPUT_MAX_NAME_SIZE: ULong = 80uL
public const val FAN_ACCESS: ULong = 0x0000_0001uL
public const val FAN_MODIFY: ULong = 0x0000_0002uL
public const val FAN_ATTRIB: ULong = 0x0000_0004uL
public const val FAN_CLOSE_WRITE: ULong = 0x0000_0008uL
public const val FAN_CLOSE_NOWRITE: ULong = 0x0000_0010uL
public const val FAN_OPEN: ULong = 0x0000_0020uL
public const val FAN_MOVED_FROM: ULong = 0x0000_0040uL
public const val FAN_MOVED_TO: ULong = 0x0000_0080uL
public const val FAN_CREATE: ULong = 0x0000_0100uL
public const val FAN_DELETE: ULong = 0x0000_0200uL
public const val FAN_DELETE_SELF: ULong = 0x0000_0400uL
public const val FAN_MOVE_SELF: ULong = 0x0000_0800uL
public const val FAN_OPEN_EXEC: ULong = 0x0000_1000uL
public const val FAN_Q_OVERFLOW: ULong = 0x0000_4000uL
public const val FAN_FS_ERROR: ULong = 0x0000_8000uL
public const val FAN_OPEN_PERM: ULong = 0x0001_0000uL
public const val FAN_ACCESS_PERM: ULong = 0x0002_0000uL
public const val FAN_OPEN_EXEC_PERM: ULong = 0x0004_0000uL
public const val FAN_EVENT_ON_CHILD: ULong = 0x0800_0000uL
public const val FAN_RENAME: ULong = 0x1000_0000uL
public const val FAN_ONDIR: ULong = 0x4000_0000uL
public val FAN_CLOSE: ULong = FAN_CLOSE_WRITE or FAN_CLOSE_NOWRITE
public val FAN_MOVE: ULong = FAN_MOVED_FROM or FAN_MOVED_TO
public const val FAN_CLOEXEC: CUInt = 0x0000_0001u
public const val FAN_NONBLOCK: CUInt = 0x0000_0002u
public const val FAN_CLASS_NOTIF: CUInt = 0x0000_0000u
public const val FAN_CLASS_CONTENT: CUInt = 0x0000_0004u
public const val FAN_CLASS_PRE_CONTENT: CUInt = 0x0000_0008u
public const val FAN_UNLIMITED_QUEUE: CUInt = 0x0000_0010u
public const val FAN_UNLIMITED_MARKS: CUInt = 0x0000_0020u
public const val FAN_ENABLE_AUDIT: CUInt = 0x0000_0040u
public const val FAN_REPORT_PIDFD: CUInt = 0x0000_0080u
public const val FAN_REPORT_TID: CUInt = 0x0000_0100u
public const val FAN_REPORT_FID: CUInt = 0x0000_0200u
public const val FAN_REPORT_DIR_FID: CUInt = 0x0000_0400u
public const val FAN_REPORT_NAME: CUInt = 0x0000_0800u
public const val FAN_REPORT_TARGET_FID: CUInt = 0x0000_1000u
public val FAN_REPORT_DFID_NAME: CUInt = FAN_REPORT_DIR_FID or FAN_REPORT_NAME
public const val FAN_MARK_ADD: CUInt = 0x0000_0001u
public const val FAN_MARK_REMOVE: CUInt = 0x0000_0002u
public const val FAN_MARK_DONT_FOLLOW: CUInt = 0x0000_0004u
public const val FAN_MARK_ONLYDIR: CUInt = 0x0000_0008u
public const val FAN_MARK_IGNORED_MASK: CUInt = 0x0000_0020u
public const val FAN_MARK_IGNORED_SURV_MODIFY: CUInt = 0x0000_0040u
public const val FAN_MARK_FLUSH: CUInt = 0x0000_0080u
public const val FAN_MARK_EVICTABLE: CUInt = 0x0000_0200u
public const val FAN_MARK_IGNORE: CUInt = 0x0000_0400u
public const val FAN_MARK_INODE: CUInt = 0x0000_0000u
public const val FAN_MARK_MOUNT: CUInt = 0x0000_0010u
public const val FAN_MARK_FILESYSTEM: CUInt = 0x0000_0100u
public val FAN_MARK_IGNORE_SURV: CUInt = FAN_MARK_IGNORE or FAN_MARK_IGNORED_SURV_MODIFY
public val FANOTIFY_METADATA_VERSION: UByte = (3).toUByte()
public val FAN_EVENT_INFO_TYPE_FID: UByte = (1).toUByte()
public val FAN_EVENT_INFO_TYPE_DFID_NAME: UByte = (2).toUByte()
public val FAN_EVENT_INFO_TYPE_DFID: UByte = (3).toUByte()
public val FAN_EVENT_INFO_TYPE_PIDFD: UByte = (4).toUByte()
public val FAN_EVENT_INFO_TYPE_ERROR: UByte = (5).toUByte()
public val FAN_EVENT_INFO_TYPE_OLD_DFID_NAME: UByte = (10).toUByte()
public val FAN_EVENT_INFO_TYPE_NEW_DFID_NAME: UByte = (12).toUByte()
public val FAN_RESPONSE_INFO_NONE: UByte = (0).toUByte()
public val FAN_RESPONSE_INFO_AUDIT_RULE: UByte = (1).toUByte()
public const val FAN_ALLOW: UInt = 0x01u
public const val FAN_DENY: UInt = 0x02u
public const val FAN_AUDIT: UInt = 0x10u
public const val FAN_INFO: UInt = 0x20u
public const val FAN_NOFD: CInt = -1
public const val FAN_NOPIDFD: CInt = FAN_NOFD
public const val FAN_EPIDFD: CInt = -2
public const val FUTEX_WAIT: CInt = 0
public const val FUTEX_WAKE: CInt = 1
public const val FUTEX_FD: CInt = 2
public const val FUTEX_REQUEUE: CInt = 3
public const val FUTEX_CMP_REQUEUE: CInt = 4
public const val FUTEX_WAKE_OP: CInt = 5
public const val FUTEX_LOCK_PI: CInt = 6
public const val FUTEX_UNLOCK_PI: CInt = 7
public const val FUTEX_TRYLOCK_PI: CInt = 8
public const val FUTEX_WAIT_BITSET: CInt = 9
public const val FUTEX_WAKE_BITSET: CInt = 10
public const val FUTEX_WAIT_REQUEUE_PI: CInt = 11
public const val FUTEX_CMP_REQUEUE_PI: CInt = 12
public const val FUTEX_LOCK_PI2: CInt = 13
public const val FUTEX_PRIVATE_FLAG: CInt = 128
public const val FUTEX_CLOCK_REALTIME: CInt = 256
public val FUTEX_CMD_MASK: CInt = (FUTEX_PRIVATE_FLAG or FUTEX_CLOCK_REALTIME).inv()
public const val FUTEX_WAITERS: UInt = 0x80000000u
public const val FUTEX_OWNER_DIED: UInt = 0x40000000u
public const val FUTEX_TID_MASK: UInt = 0x3fffffffu
public const val FUTEX_BITSET_MATCH_ANY: CInt = -1

public fun FUTEX_OP(op: CInt, oparg: CInt, cmp: CInt, cmparg: CInt): CInt =
    ((op and 0xf) shl 28) or ((cmp and 0xf) shl 24) or ((oparg and 0xfff) shl 12) or (cmparg and 0xfff)

public const val FUTEX_OP_SET: CInt = 0
public const val FUTEX_OP_ADD: CInt = 1
public const val FUTEX_OP_OR: CInt = 2
public const val FUTEX_OP_ANDN: CInt = 3
public const val FUTEX_OP_XOR: CInt = 4
public const val FUTEX_OP_OPARG_SHIFT: CInt = 8
public const val FUTEX_OP_CMP_EQ: CInt = 0
public const val FUTEX_OP_CMP_NE: CInt = 1
public const val FUTEX_OP_CMP_LT: CInt = 2
public const val FUTEX_OP_CMP_LE: CInt = 3
public const val FUTEX_OP_CMP_GT: CInt = 4
public const val FUTEX_OP_CMP_GE: CInt = 5
public const val KEXEC_ON_CRASH: CInt = 0x00000001
public const val KEXEC_PRESERVE_CONTEXT: CInt = 0x00000002
public const val KEXEC_ARCH_MASK: CInt = -65536
public const val KEXEC_FILE_UNLOAD: CInt = 0x00000001
public const val KEXEC_FILE_ON_CRASH: CInt = 0x00000002
public const val KEXEC_FILE_NO_INITRAMFS: CInt = 0x00000004
public const val LINUX_REBOOT_MAGIC1: CInt = -18751827
public const val LINUX_REBOOT_MAGIC2: CInt = 672274793
public const val LINUX_REBOOT_MAGIC2A: CInt = 85072278
public const val LINUX_REBOOT_MAGIC2B: CInt = 369367448
public const val LINUX_REBOOT_MAGIC2C: CInt = 537993216
public const val LINUX_REBOOT_CMD_RESTART: CInt = 0x01234567
public const val LINUX_REBOOT_CMD_HALT: CInt = -839974621
public const val LINUX_REBOOT_CMD_CAD_ON: CInt = -1985229329
public const val LINUX_REBOOT_CMD_CAD_OFF: CInt = 0x00000000
public const val LINUX_REBOOT_CMD_POWER_OFF: CInt = 0x4321FEDC
public const val LINUX_REBOOT_CMD_RESTART2: CInt = -1582119980
public const val LINUX_REBOOT_CMD_SW_SUSPEND: CInt = -805241630
public const val LINUX_REBOOT_CMD_KEXEC: CInt = 0x45584543
public val SO_EE_ORIGIN_NONE: UByte = (0).toUByte()
public val SO_EE_ORIGIN_LOCAL: UByte = (1).toUByte()
public val SO_EE_ORIGIN_ICMP: UByte = (2).toUByte()
public val SO_EE_ORIGIN_ICMP6: UByte = (3).toUByte()
public val SO_EE_ORIGIN_TXSTATUS: UByte = (4).toUByte()
public val SO_EE_ORIGIN_TIMESTAMPING: UByte = SO_EE_ORIGIN_TXSTATUS
public const val SCTP_FUTURE_ASSOC: CInt = 0
public const val SCTP_CURRENT_ASSOC: CInt = 1
public const val SCTP_ALL_ASSOC: CInt = 2
public const val SCTP_RTOINFO: CInt = 0
public const val SCTP_ASSOCINFO: CInt = 1
public const val SCTP_INITMSG: CInt = 2
public const val SCTP_NODELAY: CInt = 3
public const val SCTP_AUTOCLOSE: CInt = 4
public const val SCTP_SET_PEER_PRIMARY_ADDR: CInt = 5
public const val SCTP_PRIMARY_ADDR: CInt = 6
public const val SCTP_ADAPTATION_LAYER: CInt = 7
public const val SCTP_DISABLE_FRAGMENTS: CInt = 8
public const val SCTP_PEER_ADDR_PARAMS: CInt = 9
public const val SCTP_DEFAULT_SEND_PARAM: CInt = 10
public const val SCTP_EVENTS: CInt = 11
public const val SCTP_I_WANT_MAPPED_V4_ADDR: CInt = 12
public const val SCTP_MAXSEG: CInt = 13
public const val SCTP_STATUS: CInt = 14
public const val SCTP_GET_PEER_ADDR_INFO: CInt = 15
public const val SCTP_DELAYED_ACK_TIME: CInt = 16
public const val SCTP_DELAYED_ACK: CInt = SCTP_DELAYED_ACK_TIME
public const val SCTP_DELAYED_SACK: CInt = SCTP_DELAYED_ACK_TIME
public const val SCTP_CONTEXT: CInt = 17
public const val SCTP_FRAGMENT_INTERLEAVE: CInt = 18
public const val SCTP_PARTIAL_DELIVERY_POINT: CInt = 19
public const val SCTP_MAX_BURST: CInt = 20
public const val SCTP_AUTH_CHUNK: CInt = 21
public const val SCTP_HMAC_IDENT: CInt = 22
public const val SCTP_AUTH_KEY: CInt = 23
public const val SCTP_AUTH_ACTIVE_KEY: CInt = 24
public const val SCTP_AUTH_DELETE_KEY: CInt = 25
public const val SCTP_PEER_AUTH_CHUNKS: CInt = 26
public const val SCTP_LOCAL_AUTH_CHUNKS: CInt = 27
public const val SCTP_GET_ASSOC_NUMBER: CInt = 28
public const val SCTP_GET_ASSOC_ID_LIST: CInt = 29
public const val SCTP_AUTO_ASCONF: CInt = 30
public const val SCTP_PEER_ADDR_THLDS: CInt = 31
public const val SCTP_RECVRCVINFO: CInt = 32
public const val SCTP_RECVNXTINFO: CInt = 33
public const val SCTP_DEFAULT_SNDINFO: CInt = 34
public const val SCTP_AUTH_DEACTIVATE_KEY: CInt = 35
public const val SCTP_REUSE_PORT: CInt = 36
public const val SCTP_PEER_ADDR_THLDS_V2: CInt = 37
public const val SCTP_PR_SCTP_NONE: CInt = 0x0000
public const val SCTP_PR_SCTP_TTL: CInt = 0x0010
public const val SCTP_PR_SCTP_RTX: CInt = 0x0020
public const val SCTP_PR_SCTP_PRIO: CInt = 0x0030
public const val SCTP_PR_SCTP_MAX: CInt = SCTP_PR_SCTP_PRIO
public const val SCTP_PR_SCTP_MASK: CInt = 0x0030
public const val SCTP_ENABLE_RESET_STREAM_REQ: CInt = 0x01
public const val SCTP_ENABLE_RESET_ASSOC_REQ: CInt = 0x02
public const val SCTP_ENABLE_CHANGE_ASSOC_REQ: CInt = 0x04
public const val SCTP_ENABLE_STRRESET_MASK: CInt = 0x07
public const val SCTP_STREAM_RESET_INCOMING: CInt = 0x01
public const val SCTP_STREAM_RESET_OUTGOING: CInt = 0x02
public const val SCTP_INIT: CInt = 0
public const val SCTP_SNDRCV: CInt = 1
public const val SCTP_SNDINFO: CInt = 2
public const val SCTP_RCVINFO: CInt = 3
public const val SCTP_NXTINFO: CInt = 4
public const val SCTP_PRINFO: CInt = 5
public const val SCTP_AUTHINFO: CInt = 6
public const val SCTP_DSTADDRV4: CInt = 7
public const val SCTP_DSTADDRV6: CInt = 8
public val SCTP_UNORDERED: CInt = 1 shl 0
public val SCTP_ADDR_OVER: CInt = 1 shl 1
public val SCTP_ABORT: CInt = 1 shl 2
public val SCTP_SACK_IMMEDIATELY: CInt = 1 shl 3
public val SCTP_SENDALL: CInt = 1 shl 6
public val SCTP_PR_SCTP_ALL: CInt = 1 shl 7
public const val SCTP_NOTIFICATION: CInt = MSG_NOTIFICATION
public const val SCTP_EOF: CInt = MSG_FIN
public const val DCCP_SOCKOPT_PACKET_SIZE: CInt = 1
public const val DCCP_SOCKOPT_SERVICE: CInt = 2
public const val DCCP_SOCKOPT_CHANGE_L: CInt = 3
public const val DCCP_SOCKOPT_CHANGE_R: CInt = 4
public const val DCCP_SOCKOPT_GET_CUR_MPS: CInt = 5
public const val DCCP_SOCKOPT_SERVER_TIMEWAIT: CInt = 6
public const val DCCP_SOCKOPT_SEND_CSCOV: CInt = 10
public const val DCCP_SOCKOPT_RECV_CSCOV: CInt = 11
public const val DCCP_SOCKOPT_AVAILABLE_CCIDS: CInt = 12
public const val DCCP_SOCKOPT_CCID: CInt = 13
public const val DCCP_SOCKOPT_TX_CCID: CInt = 14
public const val DCCP_SOCKOPT_RX_CCID: CInt = 15
public const val DCCP_SOCKOPT_QPOLICY_ID: CInt = 16
public const val DCCP_SOCKOPT_QPOLICY_TXQLEN: CInt = 17
public const val DCCP_SOCKOPT_CCID_RX_INFO: CInt = 128
public const val DCCP_SOCKOPT_CCID_TX_INFO: CInt = 192
public const val DCCP_SERVICE_LIST_MAX_LEN: CInt = 32
public const val CTL_KERN: CInt = 1
public const val CTL_VM: CInt = 2
public const val CTL_NET: CInt = 3
public const val CTL_FS: CInt = 5
public const val CTL_DEBUG: CInt = 6
public const val CTL_DEV: CInt = 7
public const val CTL_BUS: CInt = 8
public const val CTL_ABI: CInt = 9
public const val CTL_CPU: CInt = 10
public const val CTL_BUS_ISA: CInt = 1
public const val INOTIFY_MAX_USER_INSTANCES: CInt = 1
public const val INOTIFY_MAX_USER_WATCHES: CInt = 2
public const val INOTIFY_MAX_QUEUED_EVENTS: CInt = 3
public const val KERN_OSTYPE: CInt = 1
public const val KERN_OSRELEASE: CInt = 2
public const val KERN_OSREV: CInt = 3
public const val KERN_VERSION: CInt = 4
public const val KERN_SECUREMASK: CInt = 5
public const val KERN_PROF: CInt = 6
public const val KERN_NODENAME: CInt = 7
public const val KERN_DOMAINNAME: CInt = 8
public const val KERN_PANIC: CInt = 15
public const val KERN_REALROOTDEV: CInt = 16
public const val KERN_SPARC_REBOOT: CInt = 21
public const val KERN_CTLALTDEL: CInt = 22
public const val KERN_PRINTK: CInt = 23
public const val KERN_NAMETRANS: CInt = 24
public const val KERN_PPC_HTABRECLAIM: CInt = 25
public const val KERN_PPC_ZEROPAGED: CInt = 26
public const val KERN_PPC_POWERSAVE_NAP: CInt = 27
public const val KERN_MODPROBE: CInt = 28
public const val KERN_SG_BIG_BUFF: CInt = 29
public const val KERN_ACCT: CInt = 30
public const val KERN_PPC_L2CR: CInt = 31
public const val KERN_RTSIGNR: CInt = 32
public const val KERN_RTSIGMAX: CInt = 33
public const val KERN_SHMMAX: CInt = 34
public const val KERN_MSGMAX: CInt = 35
public const val KERN_MSGMNB: CInt = 36
public const val KERN_MSGPOOL: CInt = 37
public const val KERN_SYSRQ: CInt = 38
public const val KERN_MAX_THREADS: CInt = 39
public const val KERN_RANDOM: CInt = 40
public const val KERN_SHMALL: CInt = 41
public const val KERN_MSGMNI: CInt = 42
public const val KERN_SEM: CInt = 43
public const val KERN_SPARC_STOP_A: CInt = 44
public const val KERN_SHMMNI: CInt = 45
public const val KERN_OVERFLOWUID: CInt = 46
public const val KERN_OVERFLOWGID: CInt = 47
public const val KERN_SHMPATH: CInt = 48
public const val KERN_HOTPLUG: CInt = 49
public const val KERN_IEEE_EMULATION_WARNINGS: CInt = 50
public const val KERN_S390_USER_DEBUG_LOGGING: CInt = 51
public const val KERN_CORE_USES_PID: CInt = 52
public const val KERN_TAINTED: CInt = 53
public const val KERN_CADPID: CInt = 54
public const val KERN_PIDMAX: CInt = 55
public const val KERN_CORE_PATTERN: CInt = 56
public const val KERN_PANIC_ON_OOPS: CInt = 57
public const val KERN_HPPA_PWRSW: CInt = 58
public const val KERN_HPPA_UNALIGNED: CInt = 59
public const val KERN_PRINTK_RATELIMIT: CInt = 60
public const val KERN_PRINTK_RATELIMIT_BURST: CInt = 61
public const val KERN_PTY: CInt = 62
public const val KERN_NGROUPS_MAX: CInt = 63
public const val KERN_SPARC_SCONS_PWROFF: CInt = 64
public const val KERN_HZ_TIMER: CInt = 65
public const val KERN_UNKNOWN_NMI_PANIC: CInt = 66
public const val KERN_BOOTLOADER_TYPE: CInt = 67
public const val KERN_RANDOMIZE: CInt = 68
public const val KERN_SETUID_DUMPABLE: CInt = 69
public const val KERN_SPIN_RETRY: CInt = 70
public const val KERN_ACPI_VIDEO_FLAGS: CInt = 71
public const val KERN_IA64_UNALIGNED: CInt = 72
public const val KERN_COMPAT_LOG: CInt = 73
public const val KERN_MAX_LOCK_DEPTH: CInt = 74
public const val KERN_NMI_WATCHDOG: CInt = 75
public const val KERN_PANIC_ON_NMI: CInt = 76
public const val VM_OVERCOMMIT_MEMORY: CInt = 5
public const val VM_PAGE_CLUSTER: CInt = 10
public const val VM_DIRTY_BACKGROUND: CInt = 11
public const val VM_DIRTY_RATIO: CInt = 12
public const val VM_DIRTY_WB_CS: CInt = 13
public const val VM_DIRTY_EXPIRE_CS: CInt = 14
public const val VM_NR_PDFLUSH_THREADS: CInt = 15
public const val VM_OVERCOMMIT_RATIO: CInt = 16
public const val VM_PAGEBUF: CInt = 17
public const val VM_HUGETLB_PAGES: CInt = 18
public const val VM_SWAPPINESS: CInt = 19
public const val VM_LOWMEM_RESERVE_RATIO: CInt = 20
public const val VM_MIN_FREE_KBYTES: CInt = 21
public const val VM_MAX_MAP_COUNT: CInt = 22
public const val VM_LAPTOP_MODE: CInt = 23
public const val VM_BLOCK_DUMP: CInt = 24
public const val VM_HUGETLB_GROUP: CInt = 25
public const val VM_VFS_CACHE_PRESSURE: CInt = 26
public const val VM_LEGACY_VA_LAYOUT: CInt = 27
public const val VM_SWAP_TOKEN_TIMEOUT: CInt = 28
public const val VM_DROP_PAGECACHE: CInt = 29
public const val VM_PERCPU_PAGELIST_FRACTION: CInt = 30
public const val VM_ZONE_RECLAIM_MODE: CInt = 31
public const val VM_MIN_UNMAPPED: CInt = 32
public const val VM_PANIC_ON_OOM: CInt = 33
public const val VM_VDSO_ENABLED: CInt = 34
public const val VM_MIN_SLAB: CInt = 35
public const val NET_CORE: CInt = 1
public const val NET_ETHER: CInt = 2
public const val NET_802: CInt = 3
public const val NET_UNIX: CInt = 4
public const val NET_IPV4: CInt = 5
public const val NET_IPX: CInt = 6
public const val NET_ATALK: CInt = 7
public const val NET_NETROM: CInt = 8
public const val NET_AX25: CInt = 9
public const val NET_BRIDGE: CInt = 10
public const val NET_ROSE: CInt = 11
public const val NET_IPV6: CInt = 12
public const val NET_X25: CInt = 13
public const val NET_TR: CInt = 14
public const val NET_DECNET: CInt = 15
public const val NET_ECONET: CInt = 16
public const val NET_SCTP: CInt = 17
public const val NET_LLC: CInt = 18
public const val NET_NETFILTER: CInt = 19
public const val NET_DCCP: CInt = 20
public const val NET_IRDA: CInt = 412
public const val PF_VCPU: CInt = 0x00000001
public const val PF_IDLE: CInt = 0x00000002
public const val PF_EXITING: CInt = 0x00000004
public const val PF_POSTCOREDUMP: CInt = 0x00000008
public const val PF_IO_WORKER: CInt = 0x00000010
public const val PF_WQ_WORKER: CInt = 0x00000020
public const val PF_FORKNOEXEC: CInt = 0x00000040
public const val PF_MCE_PROCESS: CInt = 0x00000080
public const val PF_SUPERPRIV: CInt = 0x00000100
public const val PF_DUMPCORE: CInt = 0x00000200
public const val PF_SIGNALED: CInt = 0x00000400
public const val PF_MEMALLOC: CInt = 0x00000800
public const val PF_NPROC_EXCEEDED: CInt = 0x00001000
public const val PF_USED_MATH: CInt = 0x00002000
public const val PF_USER_WORKER: CInt = 0x00004000
public const val PF_NOFREEZE: CInt = 0x00008000
public const val PF_KSWAPD: CInt = 0x00020000
public const val PF_MEMALLOC_NOFS: CInt = 0x00040000
public const val PF_MEMALLOC_NOIO: CInt = 0x00080000
public const val PF_LOCAL_THROTTLE: CInt = 0x00100000
public const val PF_KTHREAD: CInt = 0x00200000
public const val PF_RANDOMIZE: CInt = 0x00400000
public const val PF_NO_SETAFFINITY: CInt = 0x04000000
public const val PF_MCE_EARLY: CInt = 0x08000000
public const val PF_MEMALLOC_PIN: CInt = 0x10000000
public const val PF_BLOCK_TS: CInt = 0x20000000
private const val PF_SUSPEND_TASK_UINT: CUInt = 0x80000000u
public val PF_SUSPEND_TASK: CInt = PF_SUSPEND_TASK_UINT.toInt()
public const val CLONE_PIDFD: CInt = 0x1000
public const val SCHED_FLAG_RESET_ON_FORK: CInt = 0x01
public const val SCHED_FLAG_RECLAIM: CInt = 0x02
public const val SCHED_FLAG_DL_OVERRUN: CInt = 0x04
public const val SCHED_FLAG_KEEP_POLICY: CInt = 0x08
public const val SCHED_FLAG_KEEP_PARAMS: CInt = 0x10
public const val SCHED_FLAG_UTIL_CLAMP_MIN: CInt = 0x20
public const val SCHED_FLAG_UTIL_CLAMP_MAX: CInt = 0x40
public val XDP_SHARED_UMEM: U16 = (1 shl 0).toUShort()
public val XDP_COPY: U16 = (1 shl 1).toUShort()
public val XDP_ZEROCOPY: U16 = (1 shl 2).toUShort()
public val XDP_USE_NEED_WAKEUP: U16 = (1 shl 3).toUShort()
public val XDP_USE_SG: U16 = (1 shl 4).toUShort()
public val XDP_UMEM_UNALIGNED_CHUNK_FLAG: U32 = 1.toUInt() shl 0
public val XDP_RING_NEED_WAKEUP: U32 = 1.toUInt() shl 0
public const val XDP_MMAP_OFFSETS: CInt = 1
public const val XDP_RX_RING: CInt = 2
public const val XDP_TX_RING: CInt = 3
public const val XDP_UMEM_REG: CInt = 4
public const val XDP_UMEM_FILL_RING: CInt = 5
public const val XDP_UMEM_COMPLETION_RING: CInt = 6
public const val XDP_STATISTICS: CInt = 7
public const val XDP_OPTIONS: CInt = 8
public val XDP_OPTIONS_ZEROCOPY: U32 = 1.toUInt() shl 0
public const val XDP_PGOFF_RX_RING: OffT = 0
public const val XDP_PGOFF_TX_RING: OffT = 0x80000000
public const val XDP_UMEM_PGOFF_FILL_RING: CULongLong = 0x100000000uL
public const val XDP_UMEM_PGOFF_COMPLETION_RING: CULongLong = 0x180000000uL
public const val XSK_UNALIGNED_BUF_OFFSET_SHIFT: CInt = 48
public val XDP_PKT_CONTD: U32 = 1.toUInt() shl 0
public val XDP_UMEM_TX_SW_CSUM: U32 = 1.toUInt() shl 1
public val XDP_UMEM_TX_METADATA_LEN: U32 = 1.toUInt() shl 2
public val XDP_TXMD_FLAGS_TIMESTAMP: U32 = 1.toUInt() shl 0
public val XDP_TXMD_FLAGS_CHECKSUM: U32 = 1.toUInt() shl 1
public val XDP_TX_METADATA: U32 = 1.toUInt() shl 1
public const val SOL_XDP: CInt = 283
public const val MOUNT_ATTR_RDONLY: U64 = 0x00000001uL
public const val MOUNT_ATTR_NOSUID: U64 = 0x00000002uL
public const val MOUNT_ATTR_NODEV: U64 = 0x00000004uL
public const val MOUNT_ATTR_NOEXEC: U64 = 0x00000008uL
public const val MOUNT_ATTR__ATIME: U64 = 0x00000070uL
public const val MOUNT_ATTR_RELATIME: U64 = 0x00000000uL
public const val MOUNT_ATTR_NOATIME: U64 = 0x00000010uL
public const val MOUNT_ATTR_STRICTATIME: U64 = 0x00000020uL
public const val MOUNT_ATTR_NODIRATIME: U64 = 0x00000080uL
public const val MOUNT_ATTR_IDMAP: U64 = 0x00100000uL
public const val MOUNT_ATTR_NOSYMFOLLOW: U64 = 0x00200000uL
public const val MOUNT_ATTR_SIZE_VER0: CInt = 32
public val SCHED_FLAG_KEEP_ALL: CInt = SCHED_FLAG_KEEP_POLICY or SCHED_FLAG_KEEP_PARAMS
public val SCHED_FLAG_UTIL_CLAMP: CInt = SCHED_FLAG_UTIL_CLAMP_MIN or SCHED_FLAG_UTIL_CLAMP_MAX
public val SCHED_FLAG_ALL: CInt = SCHED_FLAG_RESET_ON_FORK or SCHED_FLAG_RECLAIM or SCHED_FLAG_DL_OVERRUN or SCHED_FLAG_KEEP_ALL or SCHED_FLAG_UTIL_CLAMP
public const val EPIOCSPARAMS: Ioctl = 0x40088a01
public const val EPIOCGPARAMS: Ioctl = -2146924030
public const val SI_DETHREAD: CInt = -7
public const val TRAP_PERF: CInt = 6

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun sCTPPRINDEX(policy: CInt): CInt

public expect fun sCTPPRPOLICY(policy: CInt): CInt

public expect fun sCTPPRSETPOLICY(flags: CInt?, policy: CInt)

public expect fun sOEEOFFENDER(ee: SockExtendedErr?): Sockaddr?

public expect fun tPACKETALIGN(x: ULong): ULong

public expect fun bPFCLASS(code: U32): U32

public expect fun bPFSIZE(code: U32): U32

public expect fun bPFMODE(code: U32): U32

public expect fun bPFOP(code: U32): U32

public expect fun bPFSRC(code: U32): U32

public expect fun bPFRVAL(code: U32): U32

public expect fun bPFMISCOP(code: U32): U32

public expect fun bPFSTMT(code: U16, k: U32): SockFilter

public expect fun bPFJUMP(code: U16, k: U32, jt: U8, jf: U8): SockFilter

public expect fun sUNLEN(s: SockaddrUn): ULong

public expect fun getspnamR(name: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt

public expect fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqUnlink(name: String?): CInt

public expect fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt

public expect fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt

public expect fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt

public expect fun mrand48(): CLong

public expect fun seed48(xseed: CUShort?): CUShort?

public expect fun lcong48(p: CUShort?)

public expect fun lutimes(file: String?, times: Timeval?): CInt

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun ftok(pathname: String?, projId: CInt): KeyT

public expect fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt

public expect fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtyp: CLong, msgflg: CInt): SsizeT

public expect fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgflg: CInt): CInt

public expect fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun readahead(fd: CInt, offset: Off64T, count: ULong): SsizeT

public expect fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT

public expect fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT

public expect fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong): SsizeT

public expect fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt

public expect fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt

public expect fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt

public expect fun listxattr(path: String?, list: String?, size: ULong): SsizeT

public expect fun llistxattr(path: String?, list: String?, size: ULong): SsizeT

public expect fun flistxattr(filedes: CInt, list: String?, size: ULong): SsizeT

public expect fun removexattr(path: String?, name: String?): CInt

public expect fun lremovexattr(path: String?, name: String?): CInt

public expect fun fremovexattr(filedes: CInt, name: String?): CInt

public expect fun signalfd(fd: CInt, mask: SigsetT?, flags: CInt): CInt

public expect fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt

public expect fun quotactl(cmd: CInt, special: String?, id: CInt, data: String?): CInt

public expect fun epollPwait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt, sigmask: SigsetT?): CInt

public expect fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt

public expect fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt

public expect fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt

public expect fun accept4(fd: CInt, addr: Sockaddr?, len: SocklenT?, flg: CInt): CInt

public expect fun reboot(howTo: CInt): CInt

public expect fun setfsgid(gid: GidT): CInt

public expect fun setfsuid(uid: UidT): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUInt): CInt

public expect fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt

public expect fun remapFilePages(addr: COpaquePointer?, size: ULong, prot: CInt, pgoff: ULong, flags: CInt): CInt

public expect fun mkstemps(template: String?, suffixlen: CInt): CInt

public expect fun vhangup(): CInt

public expect fun sync()

public expect fun syncfs(fd: CInt): CInt

public expect fun syscall(num: CLong, vararg args: Any?): CLong

public expect fun schedSetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt

public expect fun epollCreate(size: CInt): CInt

public expect fun epollCreate1(flags: CInt): CInt

public expect fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt

public expect fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt

public expect fun unshare(flags: CInt): CInt

public expect fun umount(target: String?): CInt

public expect fun tee(fdIn: CInt, fdOut: CInt, len: ULong, flags: CUInt): SsizeT

public expect fun splice(fdIn: CInt, offIn: LoffT?, fdOut: CInt, offOut: LoffT?, len: ULong, flags: CUInt): SsizeT

public expect fun eventfd(initval: CUInt, flags: CInt): CInt

public expect fun eventfdRead(fd: CInt, value: EventfdT?): CInt

public expect fun eventfdWrite(fd: CInt, value: EventfdT): CInt

public expect fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt

public expect fun schedSetparam(pid: PidT, param: SchedParam?): CInt

public expect fun setns(fd: CInt, nstype: CInt): CInt

public expect fun swapoff(path: String?): CInt

public expect fun vmsplice(fd: CInt, iov: Iovec?, nrSegs: ULong, flags: CUInt): SsizeT

public expect fun personality(persona: CULong): CInt

public expect fun schedGetparam(pid: PidT, param: SchedParam?): CInt

public expect fun clone(cb: ((COpaquePointer?) -> CInt)?, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg args: Any?): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt

public expect fun umount2(target: String?, flags: CInt): CInt

public expect fun swapon(path: String?, swapflags: CInt): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt

public expect fun sendfile(outFd: CInt, inFd: CInt, offset: OffT?, count: ULong): SsizeT

public expect fun sigaltstack(ss: StackT?, oss: StackT?): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt

public expect fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

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

public expect fun freadUnlocked(buf: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong

public expect fun inotifyRmWatch(fd: CInt, wd: CInt): CInt

public expect fun inotifyInit(): CInt

public expect fun inotifyInit1(flags: CInt): CInt

public expect fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt

public expect fun fanotifyInit(flags: CUInt, eventFFlags: CUInt): CInt

public expect fun gethostid(): CLong

public expect fun klogctl(syslogType: CInt, bufp: String?, len: CInt): CInt

public expect fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt

public expect fun fgetpos64(stream: FILE?, ptr: Fpos64T?): CInt

public expect fun fopen64(filename: String?, mode: String?): FILE?

public expect fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt

public expect fun sendfile64(outFd: CInt, inFd: CInt, offset: Off64T?, count: ULong): SsizeT

public expect fun tmpfile64(): FILE?
