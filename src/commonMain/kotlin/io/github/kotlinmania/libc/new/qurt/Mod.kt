// port-lint: source new/qurt/mod.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public typealias IntptrT = Long
public typealias UintptrT = ULong
public typealias PtrdiffT = Long
public typealias SizeT = UintptrT
public typealias SsizeT = CInt
public typealias PidT = CInt
public typealias UidT = CUInt
public typealias GidT = CUInt
public typealias TimeT = CLong
public typealias SusecondsT = CLong
public typealias UsecondsT = CULong
public typealias ClockidT = CInt
public typealias TimerT = COpaquePointer?
public typealias DevT = CULongLong
public typealias InoT = CULongLong
public typealias ModeT = CUInt
public typealias NlinkT = CUInt
public typealias OffT = CLong
public typealias BlkcntT = CLong
public typealias BlksizeT = CLong
public typealias PthreadT = CUInt
public typealias PthreadKeyT = CInt
public typealias PthreadOnceT = CInt
public typealias PthreadMutexT = CUInt
public typealias PthreadMutexattrT = CUInt
public typealias PthreadCondT = CUInt
public typealias PthreadCondattrT = CUInt
public typealias PthreadAttrT = CUInt
public typealias PthreadRwlockT = CUInt
public typealias PthreadRwlockattrT = CUInt
public typealias PthreadSpinlockT = CUInt
public typealias PthreadBarrierT = CUInt
public typealias PthreadBarrierattrT = CUInt
public typealias SocklenT = CUInt
public typealias SaFamilyT = CUShort
public typealias InAddrT = CUInt
public typealias InPortT = CUShort
public typealias FdSet = CULong
public typealias FposT = CLong
public typealias ClockT = CLong
public typealias SemT = CUInt
public typealias MqdT = CInt
public typealias NfdsT = CULong
public typealias SigsetT = CULong
public typealias VaList = String?
public typealias CSchar = Byte
public typealias WcharT = UInt
public typealias ErrnoT = CInt
public typealias RlimT = CULong
public typealias SpeedT = CUInt
public typealias TcflagT = CUInt

public data class DivT(
    val quot: CInt,
    val rem: CInt,
)

public data class LdivT(
    val quot: CLong,
    val rem: CLong,
)

public data class LldivT(
    val quot: CLongLong,
    val rem: CLongLong,
)

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stRdev: DevT,
    val stSize: OffT,
    val stAtime: TimeT,
    val stMtime: TimeT,
    val stCtime: TimeT,
)

public data class Tm(
    val tmSec: CInt,
    val tmMin: CInt,
    val tmHour: CInt,
    val tmMday: CInt,
    val tmMon: CInt,
    val tmYear: CInt,
    val tmWday: CInt,
    val tmYday: CInt,
    val tmIsdst: CInt,
)

public data class Timespec(
    val tvSec: TimeT,
    val tvNsec: CLong,
)

public data class Timeval(
    val tvSec: TimeT,
    val tvUsec: SusecondsT,
)

public data class Itimerspec(
    val itInterval: Timespec,
    val itValue: Timespec,
)

public data class Dirent(
    val dIno: CLong,
    val dName: ByteArray,
)

public data class DIR(
    val index: CInt,
    val entry: Dirent,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cCc: UByteArray,
    val cIspeed: SpeedT,
    val cOspeed: SpeedT,
)

public data class Rlimit(
    val rlimCur: RlimT,
    val rlimMax: RlimT,
)

public data class Rusage(
    val ruUtime: Timeval,
    val ruStime: Timeval,
    val ruMaxrss: CLong,
    val ruIxrss: CLong,
    val ruIdrss: CLong,
    val ruIsrss: CLong,
    val ruMinflt: CLong,
    val ruMajflt: CLong,
    val ruNswap: CLong,
    val ruInblock: CLong,
    val ruOublock: CLong,
    val ruMsgsnd: CLong,
    val ruMsgrcv: CLong,
    val ruNsignals: CLong,
    val ruNvcsw: CLong,
    val ruNivcsw: CLong,
)

public data class Flock(
    val lType: CShort,
    val lWhence: CShort,
    val lStart: OffT,
    val lLen: OffT,
    val lPid: PidT,
)

public const val PTHREAD_NAME_LEN: CInt = 16
public const val PTHREAD_MAX_THREADS: CUInt = 512u
public const val PTHREAD_MIN_STACKSIZE: CInt = 512
public const val PTHREAD_MAX_STACKSIZE: CInt = 1048576
public const val PTHREAD_DEFAULT_STACKSIZE: CInt = 16384
public const val PTHREAD_DEFAULT_PRIORITY: CInt = 1
public const val PTHREAD_SPINLOCK_UNLOCKED: CInt = 0
public const val PTHREAD_SPINLOCK_LOCKED: CInt = 1
public const val TIME_CONV_SCLK_FREQ: CInt = 19200000
public const val CLOCK_MONOTONIC_RAW: ClockidT = 4
public const val CLOCK_REALTIME_COARSE: ClockidT = 5
public const val CLOCK_MONOTONIC_COARSE: ClockidT = 6
public const val CLOCK_BOOTTIME: ClockidT = 7
public const val L_tmpnam: CUInt = 260u
public const val TMP_MAX: CUInt = 25u
public const val FOPEN_MAX: CUInt = 20u
public const val EOK: CInt = 0
public const val PAGESIZE: ULong = 4096uL
public const val PAGE_SIZE: ULong = 4096uL
public val DT_UNKNOWN: CUChar = (0).toUByte()
public val DT_FIFO: CUChar = (1).toUByte()
public val DT_CHR: CUChar = (2).toUByte()
public val DT_DIR: CUChar = (4).toUByte()
public val DT_BLK: CUChar = (6).toUByte()
public val DT_REG: CUChar = (8).toUByte()
public val DT_LNK: CUChar = (10).toUByte()
public val DT_SOCK: CUChar = (12).toUByte()

public fun opendir(name: String?): DIR? = null

public fun readdir(dirp: DIR?): Dirent? = null

public fun closedir(dirp: DIR?): CInt = -1

public fun mkdir(path: String?, mode: ModeT): CInt = -1

public fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt = -1

public fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong): CInt = -1

public fun clockGetcpuclockid(pid: PidT, clockId: ClockidT?): CInt = -1

public fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? = null

public fun semClose(sem: SemT?): CInt = -1

public fun semUnlink(name: String?): CInt = -1

public fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? = null

public fun strlen(s: String?): ULong = 0uL

public fun strcpy(dest: String?, src: String?): String? = null

public fun strncpy(dest: String?, src: String?, n: ULong): String? = null

public fun strcat(dest: String?, src: String?): String? = null

public fun strncat(dest: String?, src: String?, n: ULong): String? = null

public fun strcmp(s1: String?, s2: String?): CInt = -1

public fun strncmp(s1: String?, s2: String?, n: ULong): CInt = -1

public fun strcoll(s1: String?, s2: String?): CInt = -1

public fun strxfrm(dest: String?, src: String?, n: ULong): ULong = 0uL

public fun strchr(s: String?, c: CInt): String? = null

public fun strrchr(s: String?, c: CInt): String? = null

public fun strspn(s: String?, accept: String?): ULong = 0uL

public fun strcspn(s: String?, reject: String?): ULong = 0uL

public fun strpbrk(s: String?, accept: String?): String? = null

public fun strstr(haystack: String?, needle: String?): String? = null

public fun strtok(s: String?, delim: String?): String? = null

public fun strerror(errnum: CInt): String? = null

public fun memchr(s: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? = null

public fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: ULong): CInt = -1

public fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? = null

public fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? = null

public fun memset(s: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? = null

public fun fork(): PidT = -1

public fun execve(filename: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt = -1

public fun isalnum(c: CInt): CInt = -1

public fun isalpha(c: CInt): CInt = -1

public fun iscntrl(c: CInt): CInt = -1

public fun isdigit(c: CInt): CInt = -1

public fun isgraph(c: CInt): CInt = -1

public fun islower(c: CInt): CInt = -1

public fun isprint(c: CInt): CInt = -1

public fun ispunct(c: CInt): CInt = -1

public fun isspace(c: CInt): CInt = -1

public fun isupper(c: CInt): CInt = -1

public fun isxdigit(c: CInt): CInt = -1

public fun tolower(c: CInt): CInt = -1

public fun toupper(c: CInt): CInt = -1
