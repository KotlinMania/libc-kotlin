// port-lint: source new/qurt/qurt_mod.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

// QuRT (Qualcomm Real-Time OS) bindings
//
// QuRT is Qualcomm's real-time operating system for Hexagon DSP architectures.
// Headers available via the
// Hexagon SDK: https://softwarecenter.qualcomm.com/catalog/item/HexagonSdk

// Basic C types for QuRT
public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias PtrdiffT = Long

public typealias SizeT = UintptrT

public typealias SsizeT = CInt

// Process and system types
public typealias PidT = CInt

public typealias UidT = CUint

public typealias GidT = CUint

// Time types
public typealias TimeT = CLong

public typealias SusecondsT = CLong

public typealias UsecondsT = CUlong

public typealias ClockidT = CInt

public typealias TimerT = COpaquePointer?

// File system types
public typealias DevT = CUlonglong

public typealias InoT = CUlonglong

public typealias ModeT = CUint

public typealias NlinkT = CUint

public typealias OffT = CLong

public typealias BlkcntT = CLong

public typealias BlksizeT = CLong

// Thread types based on QuRT pthread implementation
public typealias PthreadT = CUint

public typealias PthreadKeyT = CInt

public typealias PthreadOnceT = CInt

public typealias PthreadMutexT = CUint

public typealias PthreadMutexattrT = CUint

public typealias PthreadCondT = CUint

public typealias PthreadCondattrT = CUint

public typealias PthreadAttrT = CUint

public typealias PthreadRwlockT = CUint

public typealias PthreadRwlockattrT = CUint

public typealias PthreadSpinlockT = CUint

public typealias PthreadBarrierT = CUint

public typealias PthreadBarrierattrT = CUint

// Network types
public typealias SocklenT = CUint

public typealias SaFamilyT = CUshort

public typealias InAddrT = CUint

public typealias InPortT = CUshort

// File descriptor types
public typealias FdSet = CUlong

// Standard C library types
// Division result types and structures
public sealed class FILE {
}

public typealias FposT = CLong

public typealias ClockT = CLong

// POSIX semaphore types
public typealias SemT = CUint

// Message queue types
public typealias MqdT = CInt

// Additional file system types
public typealias NfdsT = CUlong

// Signal types
public typealias SigsetT = CUlong

// Variadic argument list type
public typealias VaList = COpaquePointer?

// Additional missing types
public typealias CSchar = Byte

// Wide character type (hexagon-specific)
public typealias WcharT = UInt

// Error type (compatible with std expectations)
public typealias ErrnoT = CInt

// Resource limit type (for compatibility, not fully supported on QuRT)
public typealias RlimT = CUlong

// Terminal types (for compatibility, not fully supported on QuRT)
public typealias SpeedT = CUint

public typealias TcflagT = CUint

public open class DivT(public var quot: CInt, public var rem: CInt)

public open class LdivT(public var quot: CLong, public var rem: CLong)

public open class LldivT(public var quot: CLonglong, public var rem: CLonglong)

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stRdev: DevT,
    public var stSize: OffT,
    public var stAtime: TimeT,
    public var stMtime: TimeT,
    public var stCtime: TimeT,
)

public open class Tm(
    public var tmSec: CInt,
    public var tmMin: CInt,
    public var tmHour: CInt,
    public var tmMday: CInt,
    public var tmMon: CInt,
    public var tmYear: CInt,
    public var tmWday: CInt,
    public var tmYday: CInt,
    public var tmIsdst: CInt,
)

public open class Timespec(public var tvSec: TimeT, public var tvNsec: CLong)

public open class Timeval(public var tvSec: TimeT, public var tvUsec: SusecondsT)

public open class Itimerspec(public var itInterval: Timespec, public var itValue: Timespec)

public open class Dirent(public var dIno: CLong, public var dName: List<CChar>)

public open class DIR(public var index: CInt, public var entry: Dirent)

// Terminal I/O structure (for compatibility, limited support on QuRT)
public open class Termios(
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cCc: List<CUchar>,
    public var cIspeed: SpeedT,
    public var cOspeed: SpeedT,
)

// Resource limit structures (for compatibility, limited support on QuRT)
public open class Rlimit(public var rlimCur: RlimT, public var rlimMax: RlimT)

public open class Rusage(
    public var ruUtime: Timeval,
    public var ruStime: Timeval,
    public var ruMaxrss: CLong,
    public var ruIxrss: CLong,
    public var ruIdrss: CLong,
    public var ruIsrss: CLong,
    public var ruMinflt: CLong,
    public var ruMajflt: CLong,
    public var ruNswap: CLong,
    public var ruInblock: CLong,
    public var ruOublock: CLong,
    public var ruMsgsnd: CLong,
    public var ruMsgrcv: CLong,
    public var ruNsignals: CLong,
    public var ruNvcsw: CLong,
    public var ruNivcsw: CLong,
)

// File lock structure (for compatibility)
public open class Flock(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lStart: OffT,
    public var lLen: OffT,
    public var lPid: PidT,
)

// Additional pthread constants
public val PTHREAD_NAME_LEN: CInt = 16

public val PTHREAD_MAX_THREADS: CUint = 512u

public val PTHREAD_MIN_STACKSIZE: CInt = 512

public val PTHREAD_MAX_STACKSIZE: CInt = 1048576

public val PTHREAD_DEFAULT_STACKSIZE: CInt = 16384

public val PTHREAD_DEFAULT_PRIORITY: CInt = 1

public val PTHREAD_SPINLOCK_UNLOCKED: CInt = 0

public val PTHREAD_SPINLOCK_LOCKED: CInt = 1

// Additional time constants
public val TIME_CONV_SCLK_FREQ: CInt = 19200000

public val CLOCK_MONOTONIC_RAW: ClockidT = 4

public val CLOCK_REALTIME_COARSE: ClockidT = 5

public val CLOCK_MONOTONIC_COARSE: ClockidT = 6

public val CLOCK_BOOTTIME: ClockidT = 7

// Stdio constants
public val L_TMPNAM: CUint = 260u

public val TMP_MAX: CUint = 25u

public val FOPEN_MAX: CUint = 20u

// Error constants
public val EOK: CInt = 0

// Semaphore constants
public val SEM_FAILED: CUint? = null

// Page size constants (hexagon-specific)
public val PAGESIZE: SizeT = 4096uL

public val PAGE_SIZE: SizeT = 4096uL

// Directory entry types (hexagon-specific)
public val DT_UNKNOWN: CUchar = 0u

public val DT_FIFO: CUchar = 1u

public val DT_CHR: CUchar = 2u

public val DT_DIR: CUchar = 4u

public val DT_BLK: CUchar = 6u

public val DT_REG: CUchar = 8u

public val DT_LNK: CUchar = 10u

public val DT_SOCK: CUchar = 12u

// Directory functions (dirent.h)
public expect fun opendir(name: String?): DIR?

public expect fun readdir(dirp: DIR?): Dirent?

public expect fun closedir(dirp: DIR?): CInt

public expect fun mkdir(path: String?, mode: ModeT): CInt

// Additional pthread functions
public expect fun pthreadAttrGetstack(attr: CUint?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt

public expect fun pthreadAttrSetstack(attr: CUint?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt

// Additional time functions
public expect fun clockGetcpuclockid(pid: PidT, clockId: CInt?): CInt

// POSIX semaphore functions
public expect fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): CUint?

public expect fun semClose(sem: CUint?): CInt

public expect fun semUnlink(name: String?): CInt

// Additional stdlib functions
public expect fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer?

// String functions (string.h)
public expect fun strlen(s: String?): SizeT

public expect fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer?

public expect fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer?

public expect fun strcat(dest: COpaquePointer?, src: String?): COpaquePointer?

public expect fun strncat(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer?

public expect fun strcmp(s1: String?, s2: String?): CInt

public expect fun strncmp(s1: String?, s2: String?, n: SizeT): CInt

public expect fun strcoll(s1: String?, s2: String?): CInt

public expect fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT

public expect fun strchr(s: String?, c: CInt): COpaquePointer?

public expect fun strrchr(s: String?, c: CInt): COpaquePointer?

public expect fun strspn(s: String?, accept: String?): SizeT

public expect fun strcspn(s: String?, reject: String?): SizeT

public expect fun strpbrk(s: String?, accept: String?): COpaquePointer?

public expect fun strstr(haystack: String?, needle: String?): COpaquePointer?

public expect fun strtok(s: COpaquePointer?, delim: String?): COpaquePointer?

public expect fun strerror(errnum: CInt): COpaquePointer?

public expect fun memchr(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: SizeT): CInt

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memset(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

// Additional unistd functions
public expect fun fork(): PidT

public expect fun execve(filename: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

// Character classification functions (ctype.h)
public expect fun isalnum(c: CInt): CInt

public expect fun isalpha(c: CInt): CInt

public expect fun iscntrl(c: CInt): CInt

public expect fun isdigit(c: CInt): CInt

public expect fun isgraph(c: CInt): CInt

public expect fun islower(c: CInt): CInt

public expect fun isprint(c: CInt): CInt

public expect fun ispunct(c: CInt): CInt

public expect fun isspace(c: CInt): CInt

public expect fun isupper(c: CInt): CInt

public expect fun isxdigit(c: CInt): CInt

public expect fun tolower(c: CInt): CInt

public expect fun toupper(c: CInt): CInt
