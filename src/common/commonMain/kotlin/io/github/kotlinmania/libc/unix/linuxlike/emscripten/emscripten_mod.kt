// port-lint: source unix/linux_like/emscripten/emscripten_mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CcT
import io.github.kotlinmania.libc.ClockidT
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FIONREAD
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.Group
import io.github.kotlinmania.libc.IdT
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.KeyT
import io.github.kotlinmania.libc.LocaleT
import io.github.kotlinmania.libc.Mmsghdr
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.Rlimit
import io.github.kotlinmania.libc.SIGSYS
import io.github.kotlinmania.libc.SighandlerT
import io.github.kotlinmania.libc.Sockaddr
import io.github.kotlinmania.libc.SpeedT
import io.github.kotlinmania.libc.TcflagT
import io.github.kotlinmania.libc.Timespec
import io.github.kotlinmania.libc.Timeval
import io.github.kotlinmania.libc.UidT

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: COpaquePointer?, errno: CInt): CInt
}

public typealias WcharT = Int

public typealias DevT = UInt

public typealias SocklenT = UInt

public typealias PthreadT = CUlong

public typealias ModeT = UInt

public typealias ShmattT = CUlong

public typealias MqdT = CInt

public typealias MsgqnumT = CUlong

public typealias MsglenT = CUlong

public typealias NfdsT = CUlong

public typealias NlItem = CInt

public typealias IdtypeT = CUint

public typealias LoffT = Long

public typealias PthreadKeyT = CUint

public typealias ClockT = CLong

public typealias TimeT = Long

public typealias SusecondsT = CLong

public typealias InoT = ULong

public typealias OffT = Long

public typealias BlkcntT = Int

public typealias BlksizeT = CLong

public typealias FsblkcntT = UInt

public typealias FsfilcntT = UInt

public typealias RlimT = ULong

public typealias NlinkT = UInt

public typealias Ino64T = io.github.kotlinmania.libc.InoT

public typealias Off64T = OffT

public typealias Blkcnt64T = io.github.kotlinmania.libc.BlkcntT

public typealias Rlim64T = io.github.kotlinmania.libc.RlimT

public typealias Rlimit64 = Rlimit

public typealias Flock64 = io.github.kotlinmania.libc.Flock

public typealias Stat64 = io.github.kotlinmania.libc.Stat

public typealias Statfs64 = io.github.kotlinmania.libc.Statfs

public typealias Statvfs64 = io.github.kotlinmania.libc.Statvfs

public typealias Dirent64 = io.github.kotlinmania.libc.Dirent

public sealed class Fpos64T {
}

public open class GlobT(
    public var glPathc: SizeT,
    public var glPathv: COpaquePointer?,
    public var glOffs: SizeT,
    public var glFlags: CInt,
    public var unused1: COpaquePointer?,
    public var unused2: COpaquePointer?,
    public var unused3: COpaquePointer?,
    public var unused4: COpaquePointer?,
    public var unused5: COpaquePointer?,
)

public open class Passwd(
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: UidT,
    public var pwGid: GidT,
    public var pwGecos: COpaquePointer?,
    public var pwDir: COpaquePointer?,
    public var pwShell: COpaquePointer?,
)

public open class Spwd(
    public var spNamp: COpaquePointer?,
    public var spPwdp: COpaquePointer?,
    public var spLstchg: CLong,
    public var spMin: CLong,
    public var spMax: CLong,
    public var spWarn: CLong,
    public var spInact: CLong,
    public var spExpire: CLong,
    public var spFlag: CUlong,
)

public open class Statvfs(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: io.github.kotlinmania.libc.FsblkcntT,
    public var fBfree: io.github.kotlinmania.libc.FsblkcntT,
    public var fBavail: io.github.kotlinmania.libc.FsblkcntT,
    public var fFiles: io.github.kotlinmania.libc.FsfilcntT,
    public var fFfree: io.github.kotlinmania.libc.FsfilcntT,
    public var fFavail: io.github.kotlinmania.libc.FsfilcntT,
    public var fFsid: CUlong,
    public var fUnused: CInt,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fSpare: List<CInt>,
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

public open class FsidT(public var value: List<CInt>)

public open class CpuSetT(public var bits: List<UInt>)

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

public open class Sembuf(
    public var semNum: CUshort,
    public var semOp: CShort,
    public var semFlg: CShort,
)

public open class Sigaction(
    public var saSigaction: SighandlerT,
    public var saMask: io.github.kotlinmania.libc.SigsetT,
    public var saFlags: CInt,
    public var saRestorer: SigactionSaRestorerCallback?,
)

public open class IpcPerm(
    public var ipcPermKey: KeyT,
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: ModeT,
    public var seq: CInt,
    public var unused1: CLong,
    public var unused2: CLong,
)

public open class Termios(
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cLine: CcT,
    public var cCc: List<CcT>,
    public var cIspeed: SpeedT,
    public var cOspeed: SpeedT,
)

public open class Flock(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lStart: OffT,
    public var lLen: OffT,
    public var lPid: PidT,
)

public open class PthreadAttrT(public var size: List<UInt>)

public open class SigsetT(public var value: List<CUlong>)

public open class Msghdr(
    public var msgName: COpaquePointer?,
    public var msgNamelen: io.github.kotlinmania.libc.SocklenT,
    public var msgIov: Iovec?,
    public var msgIovlen: CInt,
    public var msgControl: COpaquePointer?,
    public var msgControllen: io.github.kotlinmania.libc.SocklenT,
    public var msgFlags: CInt,
)

public open class Cmsghdr(
    public var cmsgLen: io.github.kotlinmania.libc.SocklenT,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
)

public open class SemT(public var value: List<CInt>)

public open class Stat(
    public var stDev: io.github.kotlinmania.libc.DevT,
    public var stDevPadding: CInt,
    public var stInoTruncated: CLong,
    public var stMode: ModeT,
    public var stNlink: io.github.kotlinmania.libc.NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: io.github.kotlinmania.libc.DevT,
    public var stRdevPadding: CInt,
    public var stSize: OffT,
    public var stBlksize: io.github.kotlinmania.libc.BlksizeT,
    public var stBlocks: io.github.kotlinmania.libc.BlkcntT,
    public var stAtime: io.github.kotlinmania.libc.TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: io.github.kotlinmania.libc.TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: io.github.kotlinmania.libc.TimeT,
    public var stCtimeNsec: CLong,
    public var stIno: io.github.kotlinmania.libc.InoT,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssFlags: CInt,
    public var ssSize: SizeT,
)

public open class ShmidDs(
    public var shmPerm: io.github.kotlinmania.libc.IpcPerm,
    public var shmSegsz: SizeT,
    public var shmAtime: io.github.kotlinmania.libc.TimeT,
    public var shmDtime: io.github.kotlinmania.libc.TimeT,
    public var shmCtime: io.github.kotlinmania.libc.TimeT,
    public var shmCpid: PidT,
    public var shmLpid: PidT,
    public var shmNattch: CUlong,
    public var pad1: CUlong,
    public var pad2: CUlong,
)

public open class MsqidDs(
    public var msgPerm: io.github.kotlinmania.libc.IpcPerm,
    public var msgStime: io.github.kotlinmania.libc.TimeT,
    public var msgRtime: io.github.kotlinmania.libc.TimeT,
    public var msgCtime: io.github.kotlinmania.libc.TimeT,
    public var msgCbytes: CUlong,
    public var msgQnum: io.github.kotlinmania.libc.MsgqnumT,
    public var msgQbytes: io.github.kotlinmania.libc.MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var pad1: CUlong,
    public var pad2: CUlong,
)

public open class Statfs(
    public var fType: CUlong,
    public var fBsize: CUlong,
    public var fBlocks: io.github.kotlinmania.libc.FsblkcntT,
    public var fBfree: io.github.kotlinmania.libc.FsblkcntT,
    public var fBavail: io.github.kotlinmania.libc.FsblkcntT,
    public var fFiles: io.github.kotlinmania.libc.FsfilcntT,
    public var fFfree: io.github.kotlinmania.libc.FsfilcntT,
    public var fFsid: io.github.kotlinmania.libc.FsidT,
    public var fNamelen: CUlong,
    public var fFrsize: CUlong,
    public var fFlags: CUlong,
    public var fSpare: List<CUlong>,
)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siErrno: CInt,
    public var siCode: CInt,
    public var pad: List<CInt>,
    public var align: List<Int>,
)

public open class ArpdRequest(
    public var req: CUshort,
    public var ip: UInt,
    public var dev: CUlong,
    public var stamp: CUlong,
    public var updated: CUlong,
    public var ha: List<CUchar>,
)

public open class PthreadMutexT(public var size: List<UByte>)

public open class PthreadRwlockT(public var size: List<UByte>)

public open class PthreadMutexattrT(public var size: List<UByte>)

public open class PthreadRwlockattrT(public var size: List<UByte>)

public open class PthreadCondattrT(public var size: List<UByte>)

public open class Dirent(
    public var dIno: io.github.kotlinmania.libc.InoT,
    public var dOff: OffT,
    public var dReclen: CUshort,
    public var dType: CUchar,
    public var dName: List<CChar>,
)

public open class Sysinfo(
    public var uptime: CUlong,
    public var loads: List<CUlong>,
    public var totalram: CUlong,
    public var freeram: CUlong,
    public var sharedram: CUlong,
    public var bufferram: CUlong,
    public var totalswap: CUlong,
    public var freeswap: CUlong,
    public var procs: CUshort,
    public var pad: CUshort,
    public var totalhigh: CUlong,
    public var freehigh: CUlong,
    public var memUnit: CUint,
    public var reserved: List<CChar>,
)

public open class MqAttr(
    public var mqFlags: CLong,
    public var mqMaxmsg: CLong,
    public var mqMsgsize: CLong,
    public var mqCurmsgs: CLong,
    public var pad: List<CLong>,
)

public open class PthreadCondT(public var size: List<UByte>)

public open class MaxAlignT(public var priv: List<Double>)

public val MADV_SOFT_OFFLINE: CInt = 101

public val MS_NOUSER: CUlong = 0x80000000uL

public val MS_RMT_MASK: CUlong = 0x02800051uL

public val ABDAY_1: io.github.kotlinmania.libc.NlItem = 0x20000

public val ABDAY_2: io.github.kotlinmania.libc.NlItem = 0x20001

public val ABDAY_3: io.github.kotlinmania.libc.NlItem = 0x20002

public val ABDAY_4: io.github.kotlinmania.libc.NlItem = 0x20003

public val ABDAY_5: io.github.kotlinmania.libc.NlItem = 0x20004

public val ABDAY_6: io.github.kotlinmania.libc.NlItem = 0x20005

public val ABDAY_7: io.github.kotlinmania.libc.NlItem = 0x20006

public val DAY_1: io.github.kotlinmania.libc.NlItem = 0x20007

public val DAY_2: io.github.kotlinmania.libc.NlItem = 0x20008

public val DAY_3: io.github.kotlinmania.libc.NlItem = 0x20009

public val DAY_4: io.github.kotlinmania.libc.NlItem = 0x2000A

public val DAY_5: io.github.kotlinmania.libc.NlItem = 0x2000B

public val DAY_6: io.github.kotlinmania.libc.NlItem = 0x2000C

public val DAY_7: io.github.kotlinmania.libc.NlItem = 0x2000D

public val ABMON_1: io.github.kotlinmania.libc.NlItem = 0x2000E

public val ABMON_2: io.github.kotlinmania.libc.NlItem = 0x2000F

public val ABMON_3: io.github.kotlinmania.libc.NlItem = 0x20010

public val ABMON_4: io.github.kotlinmania.libc.NlItem = 0x20011

public val ABMON_5: io.github.kotlinmania.libc.NlItem = 0x20012

public val ABMON_6: io.github.kotlinmania.libc.NlItem = 0x20013

public val ABMON_7: io.github.kotlinmania.libc.NlItem = 0x20014

public val ABMON_8: io.github.kotlinmania.libc.NlItem = 0x20015

public val ABMON_9: io.github.kotlinmania.libc.NlItem = 0x20016

public val ABMON_10: io.github.kotlinmania.libc.NlItem = 0x20017

public val ABMON_11: io.github.kotlinmania.libc.NlItem = 0x20018

public val ABMON_12: io.github.kotlinmania.libc.NlItem = 0x20019

public val MON_1: io.github.kotlinmania.libc.NlItem = 0x2001A

public val MON_2: io.github.kotlinmania.libc.NlItem = 0x2001B

public val MON_3: io.github.kotlinmania.libc.NlItem = 0x2001C

public val MON_4: io.github.kotlinmania.libc.NlItem = 0x2001D

public val MON_5: io.github.kotlinmania.libc.NlItem = 0x2001E

public val MON_6: io.github.kotlinmania.libc.NlItem = 0x2001F

public val MON_7: io.github.kotlinmania.libc.NlItem = 0x20020

public val MON_8: io.github.kotlinmania.libc.NlItem = 0x20021

public val MON_9: io.github.kotlinmania.libc.NlItem = 0x20022

public val MON_10: io.github.kotlinmania.libc.NlItem = 0x20023

public val MON_11: io.github.kotlinmania.libc.NlItem = 0x20024

public val MON_12: io.github.kotlinmania.libc.NlItem = 0x20025

public val AM_STR: io.github.kotlinmania.libc.NlItem = 0x20026

public val PM_STR: io.github.kotlinmania.libc.NlItem = 0x20027

public val D_T_FMT: io.github.kotlinmania.libc.NlItem = 0x20028

public val D_FMT: io.github.kotlinmania.libc.NlItem = 0x20029

public val T_FMT: io.github.kotlinmania.libc.NlItem = 0x2002A

public val T_FMT_AMPM: io.github.kotlinmania.libc.NlItem = 0x2002B

public val ERA: io.github.kotlinmania.libc.NlItem = 0x2002C

public val ERA_D_FMT: io.github.kotlinmania.libc.NlItem = 0x2002E

public val ALT_DIGITS: io.github.kotlinmania.libc.NlItem = 0x2002F

public val ERA_D_T_FMT: io.github.kotlinmania.libc.NlItem = 0x20030

public val ERA_T_FMT: io.github.kotlinmania.libc.NlItem = 0x20031

public val CODESET: io.github.kotlinmania.libc.NlItem = 14

public val CRNCYSTR: io.github.kotlinmania.libc.NlItem = 0x4000F

public val RUSAGE_THREAD: CInt = 1

public val RUSAGE_CHILDREN: CInt = -1

public val RADIXCHAR: io.github.kotlinmania.libc.NlItem = 0x10000

public val THOUSEP: io.github.kotlinmania.libc.NlItem = 0x10001

public val YESEXPR: io.github.kotlinmania.libc.NlItem = 0x50000

public val NOEXPR: io.github.kotlinmania.libc.NlItem = 0x50001

public val YESSTR: io.github.kotlinmania.libc.NlItem = 0x50002

public val NOSTR: io.github.kotlinmania.libc.NlItem = 0x50003

public val FILENAME_MAX: CUint = 4096u

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

public val RLIM_SAVED_MAX: io.github.kotlinmania.libc.RlimT = RLIM_INFINITY

public val RLIM_SAVED_CUR: io.github.kotlinmania.libc.RlimT = RLIM_INFINITY

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

public val AT_EACCESS: CInt = 0x200

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

public val RTLD_NEXT: COpaquePointer? = COpaquePointer((-1L).toLong())

public val RTLD_DEFAULT: COpaquePointer? = null

public val RTLD_NODELETE: CInt = 0x1000

public val RTLD_NOW: CInt = 0x2

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(size = List(SIZEOF_PTHREAD_MUTEX_T) { 0 })

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(size = List(SIZEOF_PTHREAD_COND_T) { 0 })

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(size = List(SIZEOF_PTHREAD_RWLOCK_T) { 0 })

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_RECURSIVE: CInt = 1

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val PTHREAD_PROCESS_PRIVATE: CInt = 0

public val PTHREAD_PROCESS_SHARED: CInt = 1

public val SIZEOF_PTHREAD_COND_T: Int = 48

public val SCHED_OTHER: CInt = 0

public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

public val SCHED_BATCH: CInt = 3

public val SCHED_IDLE: CInt = 5

public val AF_IB: CInt = 27

public val AF_MPLS: CInt = 28

public val AF_NFC: CInt = 39

public val AF_VSOCK: CInt = 40

public val PF_IB: CInt = AF_IB

public val PF_MPLS: CInt = AF_MPLS

public val PF_NFC: CInt = AF_NFC

public val PF_VSOCK: CInt = AF_VSOCK

// System V IPC
public val IPC_PRIVATE: KeyT = 0

public val IPC_CREAT: CInt = 512

public val IPC_EXCL: CInt = 1024

public val IPC_NOWAIT: CInt = 2048

public val IPC_RMID: CInt = 0

public val IPC_SET: CInt = 1

public val IPC_STAT: CInt = 2

public val IPC_INFO: CInt = 3

public val MSG_STAT: CInt = 11

public val MSG_INFO: CInt = 12

public val MSG_NOERROR: CInt = 4096

public val MSG_EXCEPT: CInt = 8192

public val SHM_R: CInt = 256

public val SHM_W: CInt = 128

public val SHM_RDONLY: CInt = 4096

public val SHM_RND: CInt = 8192

public val SHM_REMAP: CInt = 16384

public val SHM_EXEC: CInt = 32768

public val SHM_LOCK: CInt = 11

public val SHM_UNLOCK: CInt = 12

public val SHM_HUGETLB: CInt = 2048

public val SHM_NORESERVE: CInt = 4096

public val LOG_NFACILITIES: CInt = 24

public val SEM_FAILED: io.github.kotlinmania.libc.SemT? = null

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

public val EAI_FAMILY: CInt = -6

public val EAI_SOCKTYPE: CInt = -7

public val EAI_SERVICE: CInt = -8

public val EAI_MEMORY: CInt = -10

public val EAI_OVERFLOW: CInt = -12

public val NI_NUMERICHOST: CInt = 1

public val NI_NUMERICSERV: CInt = 2

public val NI_NOFQDN: CInt = 4

public val NI_NAMEREQD: CInt = 8

public val NI_DGRAM: CInt = 16

public val SYNC_FILE_RANGE_WAIT_BEFORE: CUint = 1u

public val SYNC_FILE_RANGE_WRITE: CUint = 2u

public val SYNC_FILE_RANGE_WAIT_AFTER: CUint = 4u

public val EAI_SYSTEM: CInt = -11

public val MREMAP_MAYMOVE: CInt = 1

public val MREMAP_FIXED: CInt = 2

public val ITIMER_REAL: CInt = 0

public val ITIMER_VIRTUAL: CInt = 1

public val ITIMER_PROF: CInt = 2

public val POSIX_VDISABLE: CcT = 0

public val FALLOC_FL_KEEP_SIZE: CInt = 0x01

public val FALLOC_FL_PUNCH_HOLE: CInt = 0x02

public val NCCS: Int = 32

public val O_TRUNC: CInt = 512

public val O_NOATIME: CInt = 262144

public val O_CLOEXEC: CInt = 0x80000

// Defined as wasi value.
public val EPERM: CInt = 63

public val ENOENT: CInt = 44

public val ESRCH: CInt = 71

public val EINTR: CInt = 27

public val EIO: CInt = 29

public val ENXIO: CInt = 60

public val E2BIG: CInt = 1

public val ENOEXEC: CInt = 45

public val EBADF: CInt = 8

public val ECHILD: CInt = 12

public val EAGAIN: CInt = 6

public val ENOMEM: CInt = 48

public val EACCES: CInt = 2

public val EFAULT: CInt = 21

public val ENOTBLK: CInt = 105

public val EBUSY: CInt = 10

public val EEXIST: CInt = 20

public val EXDEV: CInt = 75

public val ENODEV: CInt = 43

public val ENOTDIR: CInt = 54

public val EISDIR: CInt = 31

public val EINVAL: CInt = 28

public val ENFILE: CInt = 41

public val EMFILE: CInt = 33

public val ENOTTY: CInt = 59

public val ETXTBSY: CInt = 74

public val EFBIG: CInt = 22

public val ENOSPC: CInt = 51

public val ESPIPE: CInt = 70

public val EROFS: CInt = 69

public val EMLINK: CInt = 34

public val EPIPE: CInt = 64

public val EDOM: CInt = 18

public val ERANGE: CInt = 68

public val EWOULDBLOCK: CInt = EAGAIN

public val ENOLINK: CInt = 47

public val EPROTO: CInt = 65

public val EDEADLK: CInt = 16

public val EDEADLOCK: CInt = EDEADLK

public val ENAMETOOLONG: CInt = 37

public val ENOLCK: CInt = 46

public val ENOSYS: CInt = 52

public val ENOTEMPTY: CInt = 55

public val ELOOP: CInt = 32

public val ENOMSG: CInt = 49

public val EIDRM: CInt = 24

public val EMULTIHOP: CInt = 36

public val EBADMSG: CInt = 9

public val EOVERFLOW: CInt = 61

public val EILSEQ: CInt = 25

public val ENOTSOCK: CInt = 57

public val EDESTADDRREQ: CInt = 17

public val EMSGSIZE: CInt = 35

public val EPROTOTYPE: CInt = 67

public val ENOPROTOOPT: CInt = 50

public val EPROTONOSUPPORT: CInt = 66

public val EAFNOSUPPORT: CInt = 5

public val EADDRINUSE: CInt = 3

public val EADDRNOTAVAIL: CInt = 4

public val ENETDOWN: CInt = 38

public val ENETUNREACH: CInt = 40

public val ENETRESET: CInt = 39

public val ECONNABORTED: CInt = 13

public val ECONNRESET: CInt = 15

public val ENOBUFS: CInt = 42

public val EISCONN: CInt = 30

public val ENOTCONN: CInt = 53

public val ETIMEDOUT: CInt = 73

public val ECONNREFUSED: CInt = 14

public val EHOSTUNREACH: CInt = 23

public val EALREADY: CInt = 7

public val EINPROGRESS: CInt = 26

public val ESTALE: CInt = 72

public val EDQUOT: CInt = 19

public val ECANCELED: CInt = 11

public val EOWNERDEAD: CInt = 62

public val ENOTRECOVERABLE: CInt = 56

public val ENOSTR: CInt = 100

public val EBFONT: CInt = 101

public val EBADSLT: CInt = 102

public val EBADRQC: CInt = 103

public val ENOANO: CInt = 104

public val ECHRNG: CInt = 106

public val EL3HLT: CInt = 107

public val EL3RST: CInt = 108

public val ELNRNG: CInt = 109

public val EUNATCH: CInt = 110

public val ENOCSI: CInt = 111

public val EL2HLT: CInt = 112

public val EBADE: CInt = 113

public val EBADR: CInt = 114

public val EXFULL: CInt = 115

public val ENODATA: CInt = 116

public val ETIME: CInt = 117

public val ENOSR: CInt = 118

public val ENONET: CInt = 119

public val ENOPKG: CInt = 120

public val EREMOTE: CInt = 121

public val EADV: CInt = 122

public val ESRMNT: CInt = 123

public val ECOMM: CInt = 124

public val EDOTDOT: CInt = 125

public val ENOTUNIQ: CInt = 126

public val EBADFD: CInt = 127

public val EREMCHG: CInt = 128

public val ELIBACC: CInt = 129

public val ELIBBAD: CInt = 130

public val ELIBSCN: CInt = 131

public val ELIBMAX: CInt = 132

public val ELIBEXEC: CInt = 133

public val ERESTART: CInt = 134

public val ESTRPIPE: CInt = 135

public val EUSERS: CInt = 136

public val ESOCKTNOSUPPORT: CInt = 137

public val EOPNOTSUPP: CInt = 138

public val ENOTSUP: CInt = EOPNOTSUPP

public val EPFNOSUPPORT: CInt = 139

public val ESHUTDOWN: CInt = 140

public val ETOOMANYREFS: CInt = 141

public val EHOSTDOWN: CInt = 142

public val EUCLEAN: CInt = 143

public val ENOTNAM: CInt = 144

public val ENAVAIL: CInt = 145

public val EISNAM: CInt = 146

public val EREMOTEIO: CInt = 147

public val ENOMEDIUM: CInt = 148

public val EMEDIUMTYPE: CInt = 149

public val ENOKEY: CInt = 150

public val EKEYEXPIRED: CInt = 151

public val EKEYREVOKED: CInt = 152

public val EKEYREJECTED: CInt = 153

public val ERFKILL: CInt = 154

public val EHWPOISON: CInt = 155

public val EL2NSYNC: CInt = 156

public val SA_NODEFER: CInt = 0x40000000

public val SA_RESETHAND: CInt = 0x80000000

public val SA_RESTART: CInt = 0x10000000

public val SA_NOCLDSTOP: CInt = 0x00000001

public val BUFSIZ: CUint = 1024u

public val TMP_MAX: CUint = 10000u

public val FOPEN_MAX: CUint = 1000u

public val O_PATH: CInt = 2097152

public val O_EXEC: CInt = 2097152

public val O_SEARCH: CInt = 2097152

public val O_ACCMODE: CInt = 2097155

public val O_NDELAY: CInt = O_NONBLOCK

public val NI_MAXHOST: io.github.kotlinmania.libc.SocklenT = 255u

public val PTHREAD_STACK_MIN: SizeT = 2048uL

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

public val POSIX_MADV_DONTNEED: CInt = 4

public val RLIM_INFINITY: io.github.kotlinmania.libc.RlimT = 0uL.inv()

public val RLIMIT_NLIMITS: CInt = 16

public val RLIM_NLIMITS: CInt = RLIMIT_NLIMITS

public val MAP_ANONYMOUS: CInt = MAP_ANON

public val SIGUNUSED: CInt = SIGSYS

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 4

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 4

public val SIZEOF_PTHREAD_RWLOCKATTR_T: Int = 8

public val CPU_SETSIZE: CInt = 1024

public val TCSANOW: CInt = 0

public val TCSADRAIN: CInt = 1

public val TCSAFLUSH: CInt = 2

public val TIOCINQ: CInt = FIONREAD

public val RTLD_GLOBAL: CInt = 0x100

public val RTLD_NOLOAD: CInt = 0x4

public val CLOCK_SGI_CYCLE: ClockidT = 10

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

public val SIGSTKSZ: SizeT = 8192uL

public val MINSIGSTKSZ: SizeT = 2048uL

public val CBAUD: TcflagT = 4111

public val TAB1: CInt = 0x00000800

public val TAB2: CInt = 0x00001000

public val TAB3: CInt = 0x00001800

public val CR1: CInt = 0x00000200

public val CR2: CInt = 0x00000400

public val CR3: CInt = 0x00000600

public val FF1: CInt = 0x00008000

public val BS1: CInt = 0x00002000

public val VT1: CInt = 0x00004000

public val VWERASE: Int = 14

public val VREPRINT: Int = 12

public val VSUSP: Int = 10

public val VSTART: Int = 8

public val VSTOP: Int = 9

public val VDISCARD: Int = 13

public val VTIME: Int = 5

public val IXON: TcflagT = 0x00000400

public val IXOFF: TcflagT = 0x00001000

public val ONLCR: TcflagT = 0x4

public val CSIZE: TcflagT = 0x00000030

public val CS6: TcflagT = 0x00000010

public val CS7: TcflagT = 0x00000020

public val CS8: TcflagT = 0x00000030

public val CSTOPB: TcflagT = 0x00000040

public val CREAD: TcflagT = 0x00000080

public val PARENB: TcflagT = 0x00000100

public val PARODD: TcflagT = 0x00000200

public val HUPCL: TcflagT = 0x00000400

public val CLOCAL: TcflagT = 0x00000800

public val ECHOKE: TcflagT = 0x00000800

public val ECHOE: TcflagT = 0x00000010

public val ECHOK: TcflagT = 0x00000020

public val ECHONL: TcflagT = 0x00000040

public val ECHOPRT: TcflagT = 0x00000400

public val ECHOCTL: TcflagT = 0x00000200

public val ISIG: TcflagT = 0x00000001

public val ICANON: TcflagT = 0x00000002

public val PENDIN: TcflagT = 0x00004000

public val NOFLSH: TcflagT = 0x00000080

public val CBAUDEX: TcflagT = 4096

public val VSWTC: Int = 7

public val OLCUC: TcflagT = 2

public val NLDLY: TcflagT = 256

public val CRDLY: TcflagT = 1536

public val TABDLY: TcflagT = 6144

public val BSDLY: TcflagT = 8192

public val FFDLY: TcflagT = 32768

public val VTDLY: TcflagT = 16384

public val XTABS: TcflagT = 6144

public val B0: SpeedT = 0

public val B50: SpeedT = 1

public val B75: SpeedT = 2

public val B110: SpeedT = 3

public val B134: SpeedT = 4

public val B150: SpeedT = 5

public val B200: SpeedT = 6

public val B300: SpeedT = 7

public val B600: SpeedT = 8

public val B1200: SpeedT = 9

public val B1800: SpeedT = 10

public val B2400: SpeedT = 11

public val B4800: SpeedT = 12

public val B9600: SpeedT = 13

public val B19200: SpeedT = 14

public val B38400: SpeedT = 15

public val B57600: SpeedT = 4097

public val B115200: SpeedT = 4098

public val B230400: SpeedT = 4099

public val B460800: SpeedT = 4100

public val B500000: SpeedT = 4101

public val B576000: SpeedT = 4102

public val B921600: SpeedT = 4103

public val B1000000: SpeedT = 4104

public val B1152000: SpeedT = 4105

public val B1500000: SpeedT = 4106

public val B2000000: SpeedT = 4107

public val B2500000: SpeedT = 4108

public val B3000000: SpeedT = 4109

public val B3500000: SpeedT = 4110

public val B4000000: SpeedT = 4111

public val SO_BINDTODEVICE: CInt = 25

public val SO_TIMESTAMP: CInt = 63

public val SO_MARK: CInt = 36

public val SO_RXQ_OVFL: CInt = 40

public val SO_PEEK_OFF: CInt = 42

public val SO_BUSY_POLL: CInt = 46

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 32

public val SIZEOF_PTHREAD_MUTEX_T: Int = 24

public val O_DIRECT: CInt = 0x4000

public val O_DIRECTORY: CInt = 0x10000

public val O_NOFOLLOW: CInt = 0x20000

public val O_ASYNC: CInt = 0x2000

public val FIOCLEX: CInt = 0x5451

public val FIONBIO: CInt = 0x5421

public val RLIMIT_RSS: CInt = 5

public val RLIMIT_NOFILE: CInt = 7

public val RLIMIT_AS: CInt = 9

public val RLIMIT_NPROC: CInt = 6

public val RLIMIT_MEMLOCK: CInt = 8

public val RLIMIT_CPU: CInt = 0

public val RLIMIT_FSIZE: CInt = 1

public val RLIMIT_DATA: CInt = 2

public val RLIMIT_STACK: CInt = 3

public val RLIMIT_CORE: CInt = 4

public val RLIMIT_LOCKS: CInt = 10

public val RLIMIT_SIGPENDING: CInt = 11

public val RLIMIT_MSGQUEUE: CInt = 12

public val RLIMIT_NICE: CInt = 13

public val RLIMIT_RTPRIO: CInt = 14

public val O_APPEND: CInt = 1024

public val O_CREAT: CInt = 64

public val O_EXCL: CInt = 128

public val O_NOCTTY: CInt = 256

public val O_NONBLOCK: CInt = 2048

public val O_SYNC: CInt = 1052672

public val O_RSYNC: CInt = 1052672

public val O_DSYNC: CInt = 4096

public val SOCK_NONBLOCK: CInt = 2048

public val MAP_ANON: CInt = 0x0020

public val MAP_GROWSDOWN: CInt = 0x0100

public val MAP_DENYWRITE: CInt = 0x0800

public val MAP_EXECUTABLE: CInt = 0x01000

public val MAP_LOCKED: CInt = 0x02000

public val MAP_NORESERVE: CInt = 0x04000

public val MAP_POPULATE: CInt = 0x08000

public val MAP_NONBLOCK: CInt = 0x010000

public val MAP_STACK: CInt = 0x020000

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SOCK_SEQPACKET: CInt = 5

public val IPPROTO_MAX: CInt = 263

public val SOL_SOCKET: CInt = 1

public val SO_REUSEADDR: CInt = 2

public val SO_TYPE: CInt = 3

public val SO_ERROR: CInt = 4

public val SO_DONTROUTE: CInt = 5

public val SO_BROADCAST: CInt = 6

public val SO_SNDBUF: CInt = 7

public val SO_RCVBUF: CInt = 8

public val SO_KEEPALIVE: CInt = 9

public val SO_OOBINLINE: CInt = 10

public val SO_LINGER: CInt = 13

public val SO_REUSEPORT: CInt = 15

public val SO_RCVLOWAT: CInt = 18

public val SO_SNDLOWAT: CInt = 19

public val SO_RCVTIMEO: CInt = 66

public val SO_SNDTIMEO: CInt = 67

public val SO_ACCEPTCONN: CInt = 30

public val IPV6_RTHDR_LOOSE: CInt = 0

public val IPV6_RTHDR_STRICT: CInt = 1

public val SA_ONSTACK: CInt = 0x08000000

public val SA_SIGINFO: CInt = 0x00000004

public val SA_NOCLDWAIT: CInt = 0x00000002

public val SIGCHLD: CInt = 17

public val SIGBUS: CInt = 7

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGWINCH: CInt = 28

public val SIGUSR1: CInt = 10

public val SIGUSR2: CInt = 12

public val SIGCONT: CInt = 18

public val SIGSTOP: CInt = 19

public val SIGTSTP: CInt = 20

public val SIGURG: CInt = 23

public val SIGIO: CInt = 29

public val SIGSYS: CInt = 31

public val SIGSTKFLT: CInt = 16

public val SIGPOLL: CInt = 29

public val SIGPWR: CInt = 30

public val SIG_SETMASK: CInt = 2

public val SIG_BLOCK: CInt = 0x000000

public val SIG_UNBLOCK: CInt = 0x01

public val EXTPROC: TcflagT = 0x00010000

public val MAP_HUGETLB: CInt = 0x040000

public val F_GETLK: CInt = 12

public val F_GETOWN: CInt = 9

public val F_SETLK: CInt = 13

public val F_SETLKW: CInt = 14

public val F_SETOWN: CInt = 8

public val F_OFD_GETLK: CInt = 36

public val F_OFD_SETLK: CInt = 37

public val F_OFD_SETLKW: CInt = 38

public val VEOF: Int = 4

public val VEOL: Int = 11

public val VEOL2: Int = 16

public val VMIN: Int = 6

public val IEXTEN: TcflagT = 0x00008000

public val TOSTOP: TcflagT = 0x00000100

public val FLUSHO: TcflagT = 0x00001000

public val TCGETS: CInt = 0x5401

public val TCSETS: CInt = 0x5402

public val TCSETSW: CInt = 0x5403

public val TCSETSF: CInt = 0x5404

public val TCGETA: CInt = 0x5405

public val TCSETA: CInt = 0x5406

public val TCSETAW: CInt = 0x5407

public val TCSETAF: CInt = 0x5408

public val TCSBRK: CInt = 0x5409

public val TCXONC: CInt = 0x540A

public val TCFLSH: CInt = 0x540B

public val TIOCGSOFTCAR: CInt = 0x5419

public val TIOCSSOFTCAR: CInt = 0x541A

public val TIOCLINUX: CInt = 0x541C

public val TIOCGSERIAL: CInt = 0x541E

public val TIOCEXCL: CInt = 0x540C

public val TIOCNXCL: CInt = 0x540D

public val TIOCSCTTY: CInt = 0x540E

public val TIOCGPGRP: CInt = 0x540F

public val TIOCSPGRP: CInt = 0x5410

public val TIOCOUTQ: CInt = 0x5411

public val TIOCSTI: CInt = 0x5412

public val TIOCGWINSZ: CInt = 0x5413

public val TIOCSWINSZ: CInt = 0x5414

public val TIOCMGET: CInt = 0x5415

public val TIOCMBIS: CInt = 0x5416

public val TIOCMBIC: CInt = 0x5417

public val TIOCMSET: CInt = 0x5418

public val FIONREAD: CInt = 0x541B

public val TIOCCONS: CInt = 0x541D

public val SYS_GETTID: CLong = 224L

// Valid for arm (32-bit) and x86 (32-bit)
public val POLLWRNORM: CShort = 0x100

public val POLLWRBAND: CShort = 0x200

public val TIOCM_LE: CInt = 0x001

public val TIOCM_DTR: CInt = 0x002

public val TIOCM_RTS: CInt = 0x004

public val TIOCM_ST: CInt = 0x008

public val TIOCM_SR: CInt = 0x010

public val TIOCM_CTS: CInt = 0x020

public val TIOCM_CAR: CInt = 0x040

public val TIOCM_RNG: CInt = 0x080

public val TIOCM_DSR: CInt = 0x100

public val TIOCM_CD: CInt = TIOCM_CAR

public val TIOCM_RI: CInt = TIOCM_RNG

public val O_TMPFILE: CInt = 0x410000

public val MAX_ADDR_LEN: Int = 7

public val ARPD_UPDATE: CUshort = 0x01u

public val ARPD_LOOKUP: CUshort = 0x02u

public val ARPD_FLUSH: CUshort = 0x03u

public val ATF_MAGIC: CInt = 0x80

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public val SOMAXCONN: CInt = 128

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if (((cmsg!!.cmsgLen).toInt()) < sizeOf<Cmsghdr>()) {
        return nullMut<Cmsghdr>()
    }
    val next = null
    val max = ((mhdr!!.msgControl)?.rawValue ?: 0L).toInt() + (mhdr!!.msgControllen).toInt()
    return if (((next)?.let { COpaquePointer(it.hashCode().toLong() + (1).toLong()) }).toInt() >= max) {
        nullMut<Cmsghdr>()
    } else {
        (next as Cmsghdr?)
    }
}

public fun cpuZero(cpuset: CpuSetT) {
    for (slot in cpuset.bits.iterMut()) {
        slot = 0
    }
}

public fun cpuSet(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * 8
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] or (1u shl offset)
    Unit
}

public fun cpuClr(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * 8
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] and (1u shl offset).inv()
    Unit
}

public fun cpuIsset(cpu: Int, cpuset: CpuSetT): Boolean {
    val sizeInBits = 8 * 8
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    return 0u != (cpuset.bits[idx] and (1u shl offset))
}

public fun cpuEqual(set1: CpuSetT, set2: CpuSetT): Boolean {
    return set1.bits == set2.bits
}

public fun makedev(major: CUint, minor: CUint): io.github.kotlinmania.libc.DevT {
    val major1 = major.toUInt()
    val minor1 = minor.toUInt()
    var dev = 0
    dev = dev or ((major1 and 0xfffff000u) shl 31 shl 1)
    dev = dev or ((major1 and 0x00000fffu) shl 8)
    dev = dev or ((minor1 and 0xffffff00u) shl 12)
    dev = dev or (minor1 and 0x000000ffu)
    return dev
}

public fun major(dev: io.github.kotlinmania.libc.DevT): CUint {
    // see
    // https://github.com/emscripten-core/emscripten/blob/
    // main/system/lib/libc/musl/include/sys/sysmacros.h
    var major = 0
    major = major or ((dev shr 31 shr 1) and 0xfffff000u)
    major = major or ((dev shr 8) and 0x00000fffu)
    return major.toUInt()
}

public fun minor(dev: io.github.kotlinmania.libc.DevT): CUint {
    // see
    // https://github.com/emscripten-core/emscripten/blob/
    // main/system/lib/libc/musl/include/sys/sysmacros.h
    var minor = 0
    minor = minor or ((dev shr 12) and 0xffffff00u)
    minor = minor or (dev and 0x000000ffu)
    return minor.toUInt()
}

public expect fun getrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun setrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): Passwd?

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun errnoLocation(): CInt?

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt

public expect fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: LocaleT): COpaquePointer?

public expect fun accept4(fd: CInt, addr: Sockaddr?, len: UInt?, flg: CInt): CInt

public expect fun getnameinfo(sa: Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt

public expect fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer?

public expect fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt

public expect fun globfree(pglob: io.github.kotlinmania.libc.GlobT?)

public expect fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: UInt?): SsizeT

public expect fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt

public expect fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer?

public expect fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CUint): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CUint, timeout: Timespec?): CInt

public expect fun sync()

public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt

// grp.h
public expect fun getgrgid(gid: GidT): Group?

public expect fun getgrnam(name: String?): Group?

public expect fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt
