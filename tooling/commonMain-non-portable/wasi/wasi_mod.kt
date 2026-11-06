// port-lint: source wasi/wasi_mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

// [wasi-libc](https://github.com/WebAssembly/wasi-libc) definitions.
//
// `wasi - libc` project provides multiple libraries including emulated features, but we list only
// basic features with `libc.a` here.

public fun interface AtexitACallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: COpaquePointer?)
}

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias SizeT = ULong

public typealias SsizeT = Long

public typealias PtrdiffT = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias OffT = Long

public typealias PidT = Int

public typealias ClockT = CLonglong

public typealias TimeT = CLonglong

public typealias InoT = ULong

public typealias SigsetT = CUchar

public typealias SusecondsT = CLonglong

public typealias ModeT = UInt

public typealias DevT = ULong

public typealias UidT = UInt

public typealias GidT = UInt

public typealias NlinkT = ULong

public typealias BlksizeT = CLong

public typealias BlkcntT = Long

public typealias NfdsT = CUlong

public typealias WcharT = Int

public typealias NlItem = CInt

public typealias WasiRightsT = ULong

public typealias LocaleT = LocaleStruct?

public typealias PthreadT = COpaquePointer?

public typealias PthreadOnceT = CInt

public typealias PthreadKeyT = CUint

public typealias PthreadSpinlockT = CInt

public open class MaxAlignT(public var priv: List<Double>)

public sealed class FILE {
}

public sealed class DIR {
}

public sealed class LocaleStruct {
}

public open class ClockidT(public var value: COpaquePointer?) {
    public var field0: COpaquePointer?
        get() = value
        set(v) { value = v }
}

public open class FposT(public var data: List<UByte>)

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
    public var tmGmtoff: CInt,
    public var tmZone: COpaquePointer?,
    public var tmNsec: CInt,
)

public open class Timeval(public var tvSec: TimeT, public var tvUsec: SusecondsT)

public open class Timespec(public var tvSec: TimeT, public var tvNsec: CLong)

public open class Tms(
    public var tmsUtime: ClockT,
    public var tmsStime: ClockT,
    public var tmsCutime: ClockT,
    public var tmsCstime: ClockT,
)

public open class Itimerspec(public var itInterval: Timespec, public var itValue: Timespec)

public open class Iovec(public var iovBase: COpaquePointer?, public var iovLen: SizeT)

public open class Lconv(
    public var decimalPoint: COpaquePointer?,
    public var thousandsSep: COpaquePointer?,
    public var grouping: COpaquePointer?,
    public var intCurrSymbol: COpaquePointer?,
    public var currencySymbol: COpaquePointer?,
    public var monDecimalPoint: COpaquePointer?,
    public var monThousandsSep: COpaquePointer?,
    public var monGrouping: COpaquePointer?,
    public var positiveSign: COpaquePointer?,
    public var negativeSign: COpaquePointer?,
    public var intFracDigits: CChar,
    public var fracDigits: CChar,
    public var pCsPrecedes: CChar,
    public var pSepBySpace: CChar,
    public var nCsPrecedes: CChar,
    public var nSepBySpace: CChar,
    public var pSignPosn: CChar,
    public var nSignPosn: CChar,
    public var intPCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intNCsPrecedes: CChar,
    public var intNSepBySpace: CChar,
    public var intPSignPosn: CChar,
    public var intNSignPosn: CChar,
)

public open class Pollfd(
    public var fd: CInt,
    public var events: CShort,
    public var revents: CShort,
)

public open class Rusage(public var ruUtime: Timeval, public var ruStime: Timeval)

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stNlink: NlinkT,
    public var stMode: ModeT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var pad0: CUint,
    public var stRdev: DevT,
    public var stSize: OffT,
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stAtim: Timespec,
    public var stMtim: Timespec,
    public var stCtim: Timespec,
    public var reserved: List<CLonglong>,
)

public open class FdSet(public var nfds: Int, public var fds: List<CInt>)

public open class PthreadAttrT(public var size: List<CLong>)

public open class PthreadMutexattrT(public var attr: CUint)

public open class PthreadCondattrT(public var attr: CUint)

public open class PthreadBarrierattrT(public var attr: CUint)

public open class PthreadRwlockattrT(public var attr: List<CUint>)

public open class PthreadCondT(public var size: List<COpaquePointer?>)

public open class PthreadMutexT(public var size: List<COpaquePointer?>)

public open class PthreadRwlockT(public var size: List<COpaquePointer?>)

public open class PthreadBarrierT(public var size: List<COpaquePointer?>)

// Declare dirent outside of s! so that it doesn't implement Copy, Eq, Hash,
// etc., since it contains a flexible array member with a dynamic size.
public open class Dirent(
    public var dIno: InoT,
    public var dType: CUchar,
    /**
     * dName is declared in WASI libc as a flexible array member, which
     * can't be directly expressed in Rust. As an imperfect workaround,
     * declare it as a zero-length array instead.
     */
    public var dName: List<CChar>,
)

public val EXIT_SUCCESS: CInt = 0

public val EXIT_FAILURE: CInt = 1

public val STDIN_FILENO: CInt = 0

public val STDOUT_FILENO: CInt = 1

public val STDERR_FILENO: CInt = 2

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val IOFBF: CInt = 0

public val IONBF: CInt = 2

public val IOLBF: CInt = 1

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

public val FD_CLOEXEC: CInt = 1

public val FD_SETSIZE: SizeT = 1024uL

public val O_APPEND: CInt = 0x0001

public val O_DSYNC: CInt = 0x0002

public val O_NONBLOCK: CInt = 0x0004

public val O_RSYNC: CInt = 0x0008

public val O_SYNC: CInt = 0x0010

public val O_CREAT: CInt = 0x0001 shl 12

public val O_DIRECTORY: CInt = 0x0002 shl 12

public val O_EXCL: CInt = 0x0004 shl 12

public val O_TRUNC: CInt = 0x0008 shl 12

public val O_NOFOLLOW: CInt = 0x01000000

public val O_EXEC: CInt = 0x02000000

public val O_RDONLY: CInt = 0x04000000

public val O_SEARCH: CInt = 0x08000000

public val O_WRONLY: CInt = 0x10000000

public val O_CLOEXEC: CInt = 0x0

public val O_RDWR: CInt = O_WRONLY or O_RDONLY

public val O_ACCMODE: CInt = O_EXEC or O_RDWR or O_SEARCH

public val O_NOCTTY: CInt = 0x0

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

public val POSIX_FADV_NORMAL: CInt = 0

public val POSIX_FADV_RANDOM: CInt = 2

public val POSIX_FADV_SEQUENTIAL: CInt = 1

public val POSIX_FADV_WILLNEED: CInt = 3

public val AT_FDCWD: CInt = -2

public val AT_EACCESS: CInt = 0x0

public val AT_SYMLINK_NOFOLLOW: CInt = 0x1

public val AT_SYMLINK_FOLLOW: CInt = 0x2

public val AT_REMOVEDIR: CInt = 0x4

public val UTIME_OMIT: CLong = 0xfffffffeL

public val UTIME_NOW: CLong = 0xffffffffL

public val S_IFIFO: ModeT = 4096u

public val S_IFCHR: ModeT = 8192u

public val S_IFBLK: ModeT = 24576u

public val S_IFDIR: ModeT = 16384u

public val S_IFREG: ModeT = 32768u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_IFMT: ModeT = 61440u

public val S_IRWXO: ModeT = 7u

public val S_IXOTH: ModeT = 1u

public val S_IWOTH: ModeT = 2u

public val S_IROTH: ModeT = 4u

public val S_IRWXG: ModeT = 56u

public val S_IXGRP: ModeT = 8u

public val S_IWGRP: ModeT = 16u

public val S_IRGRP: ModeT = 32u

public val S_IRWXU: ModeT = 448u

public val S_IXUSR: ModeT = 64u

public val S_IWUSR: ModeT = 128u

public val S_IRUSR: ModeT = 256u

public val S_ISVTX: ModeT = 512u

public val S_ISGID: ModeT = 1024u

public val S_ISUID: ModeT = 2048u

public val DT_UNKNOWN: UByte = 0u

public val DT_BLK: UByte = 1u

public val DT_CHR: UByte = 2u

public val DT_DIR: UByte = 3u

public val DT_REG: UByte = 4u

public val DT_FIFO: UByte = 6u

public val DT_LNK: UByte = 7u

public val DT_SOCK: UByte = 20u

public val FIONREAD: CInt = 1

public val FIONBIO: CInt = 2

public val F_OK: CInt = 0

public val R_OK: CInt = 4

public val W_OK: CInt = 2

public val X_OK: CInt = 1

public val POLLIN: CShort = 0x1

public val POLLOUT: CShort = 0x2

public val POLLERR: CShort = 0x1000

public val POLLHUP: CShort = 0x2000

public val POLLNVAL: CShort = 0x4000

public val POLLRDNORM: CShort = 0x1

public val POLLWRNORM: CShort = 0x2

public val E2BIG: CInt = 1

public val EACCES: CInt = 2

public val EADDRINUSE: CInt = 3

public val EADDRNOTAVAIL: CInt = 4

public val EAFNOSUPPORT: CInt = 5

public val EAGAIN: CInt = 6

public val EALREADY: CInt = 7

public val EBADF: CInt = 8

public val EBADMSG: CInt = 9

public val EBUSY: CInt = 10

public val ECANCELED: CInt = 11

public val ECHILD: CInt = 12

public val ECONNABORTED: CInt = 13

public val ECONNREFUSED: CInt = 14

public val ECONNRESET: CInt = 15

public val EDEADLK: CInt = 16

public val EDESTADDRREQ: CInt = 17

public val EDOM: CInt = 18

public val EDQUOT: CInt = 19

public val EEXIST: CInt = 20

public val EFAULT: CInt = 21

public val EFBIG: CInt = 22

public val EHOSTUNREACH: CInt = 23

public val EIDRM: CInt = 24

public val EILSEQ: CInt = 25

public val EINPROGRESS: CInt = 26

public val EINTR: CInt = 27

public val EINVAL: CInt = 28

public val EIO: CInt = 29

public val EISCONN: CInt = 30

public val EISDIR: CInt = 31

public val ELOOP: CInt = 32

public val EMFILE: CInt = 33

public val EMLINK: CInt = 34

public val EMSGSIZE: CInt = 35

public val EMULTIHOP: CInt = 36

public val ENAMETOOLONG: CInt = 37

public val ENETDOWN: CInt = 38

public val ENETRESET: CInt = 39

public val ENETUNREACH: CInt = 40

public val ENFILE: CInt = 41

public val ENOBUFS: CInt = 42

public val ENODEV: CInt = 43

public val ENOENT: CInt = 44

public val ENOEXEC: CInt = 45

public val ENOLCK: CInt = 46

public val ENOLINK: CInt = 47

public val ENOMEM: CInt = 48

public val ENOMSG: CInt = 49

public val ENOPROTOOPT: CInt = 50

public val ENOSPC: CInt = 51

public val ENOSYS: CInt = 52

public val ENOTCONN: CInt = 53

public val ENOTDIR: CInt = 54

public val ENOTEMPTY: CInt = 55

public val ENOTRECOVERABLE: CInt = 56

public val ENOTSOCK: CInt = 57

public val ENOTSUP: CInt = 58

public val ENOTTY: CInt = 59

public val ENXIO: CInt = 60

public val EOVERFLOW: CInt = 61

public val EOWNERDEAD: CInt = 62

public val EPERM: CInt = 63

public val EPIPE: CInt = 64

public val EPROTO: CInt = 65

public val EPROTONOSUPPORT: CInt = 66

public val EPROTOTYPE: CInt = 67

public val ERANGE: CInt = 68

public val EROFS: CInt = 69

public val ESPIPE: CInt = 70

public val ESRCH: CInt = 71

public val ESTALE: CInt = 72

public val ETIMEDOUT: CInt = 73

public val ETXTBSY: CInt = 74

public val EXDEV: CInt = 75

public val ENOTCAPABLE: CInt = 76

public val EOPNOTSUPP: CInt = ENOTSUP

public val EWOULDBLOCK: CInt = EAGAIN

public val SC_PAGESIZE: CInt = 30

public val SC_PAGE_SIZE: CInt = SC_PAGESIZE

public val SC_IOV_MAX: CInt = 60

public val SC_SYMLOOP_MAX: CInt = 173

// Note(msrv): `addrOf(EXTERN_STATIC)` is now safe; remove `unchecked` when MSRV >= 1.82
public var CLOCK_MONOTONIC: ClockidT = clockidT(addrOf(CLOCK_MONOTONIC))

public var CLOCK_REALTIME: ClockidT = clockidT(addrOf(CLOCK_REALTIME))

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

public val RADIXCHAR: io.github.kotlinmania.libc.NlItem = 0x10000

public val THOUSEP: io.github.kotlinmania.libc.NlItem = 0x10001

public val YESEXPR: io.github.kotlinmania.libc.NlItem = 0x50000

public val NOEXPR: io.github.kotlinmania.libc.NlItem = 0x50001

public val YESSTR: io.github.kotlinmania.libc.NlItem = 0x50002

public val NOSTR: io.github.kotlinmania.libc.NlItem = 0x50003

public val PTHREAD_STACK_MIN: Int = 2048

public val TIMER_ABSTIME: CInt = 1

public fun fdIsset(fd: CInt, set: FdSet?): Boolean {
    val set1 = set!!
    val n = set1.nfds
    return set1.fds[0 until n].iter().any({ p -> p == fd })
}

public fun fdSet(fd: CInt, set: FdSet?) {
    val set1 = set!!
    val n = set1.nfds
    if (!set1.fds[0 until n].iter().any({ p -> p == fd })) {
        set1.nfds = n + 1
        set1.fds[n] = fd
    }
}

public fun fdZero(set: FdSet?) {
    set!!.nfds = 0
    return
}

public expect fun exit(code: CInt): Nothing

public expect fun abort(): Nothing

public expect fun alignedAlloc(a: SizeT, b: SizeT): COpaquePointer?

public expect fun calloc(amt: SizeT, amt2: SizeT): COpaquePointer?

public expect fun free(ptr: COpaquePointer?)

public expect fun getenv(s: String?): COpaquePointer?

public expect fun malloc(amt: SizeT): COpaquePointer?

public expect fun mallocUsableSize(ptr: COpaquePointer?): SizeT

public expect fun sbrk(increment: IntptrT): COpaquePointer?

public expect fun rand(): CInt

public expect fun read(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT

public expect fun realloc(ptr: COpaquePointer?, amt: SizeT): COpaquePointer?

public expect fun setenv(k: String?, v: String?, a: CInt): CInt

public expect fun unsetenv(k: String?): CInt

public expect fun clearenv(): CInt

public expect fun write(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT

public expect var ENVIRON: COpaquePointer?

public expect fun fopen(a: String?, b: String?): FILE?

public expect fun freopen(a: String?, b: String?, f: FILE?): FILE?

public expect fun fclose(f: FILE?): CInt

public expect fun remove(a: String?): CInt

public expect fun rename(a: String?, b: String?): CInt

public expect fun feof(f: FILE?): CInt

public expect fun ferror(f: FILE?): CInt

public expect fun fflush(f: FILE?): CInt

public expect fun clearerr(f: FILE?)

public expect fun fseek(f: FILE?, b: CLong, c: CInt): CInt

public expect fun ftell(f: FILE?): CLong

public expect fun rewind(f: FILE?)

public expect fun fgetpos(f: FILE?, pos: FposT?): CInt

public expect fun fsetpos(f: FILE?, pos: FposT?): CInt

public expect fun fread(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT

public expect fun fwrite(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT

public expect fun fgetc(f: FILE?): CInt

public expect fun getc(f: FILE?): CInt

public expect fun getchar(): CInt

public expect fun ungetc(a: CInt, f: FILE?): CInt

public expect fun fputc(a: CInt, f: FILE?): CInt

public expect fun putc(a: CInt, f: FILE?): CInt

public expect fun putchar(a: CInt): CInt

public expect fun fputs(a: String?, f: FILE?): CInt

public expect fun puts(a: String?): CInt

public expect fun perror(a: String?)

public expect fun srand(a: CUint)

public expect fun atexit(a: AtexitACallback): CInt

public expect fun atQuickExit(a: AtexitACallback): CInt

public expect fun quickExit(a: CInt): Nothing

public expect fun posixMemalign(a: COpaquePointer?, b: SizeT, c: SizeT): CInt

public expect fun randR(a: CUint?): CInt

public expect fun random(): CLong

public expect fun srandom(a: CUint)

public expect fun putenv(a: COpaquePointer?): CInt

public expect fun clock(): ClockT

public expect fun time(a: CLonglong?): TimeT

public expect fun difftime(a: TimeT, b: TimeT): CDouble

public expect fun mktime(a: Tm?): TimeT

public expect fun strftime(a: COpaquePointer?, b: SizeT, c: String?, d: Tm?): SizeT

public expect fun gmtime(a: CLonglong?): Tm?

public expect fun gmtimeR(a: CLonglong?, b: Tm?): Tm?

public expect fun localtime(a: CLonglong?): Tm?

public expect fun localtimeR(a: CLonglong?, b: Tm?): Tm?

public expect fun asctimeR(a: Tm?, b: COpaquePointer?): COpaquePointer?

public expect fun ctimeR(a: CLonglong?, b: COpaquePointer?): COpaquePointer?

public expect val CLOCK_MONOTONIC1: UByte

public expect val CLOCK_REALTIME1: UByte

public expect fun nanosleep(a: Timespec?, b: Timespec?): CInt

public expect fun clockGetres(a: ClockidT, b: Timespec?): CInt

public expect fun clockGettime(a: ClockidT, b: Timespec?): CInt

public expect fun clockNanosleep(a: ClockidT, a2: CInt, b: Timespec?, c: Timespec?): CInt

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

public expect fun isblank(c: CInt): CInt

public expect fun tolower(c: CInt): CInt

public expect fun toupper(c: CInt): CInt

public expect fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt

public expect fun setbuf(stream: FILE?, buf: COpaquePointer?)

public expect fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer?

public expect fun atof(s: String?): CDouble

public expect fun atoi(s: String?): CInt

public expect fun atol(s: String?): CLong

public expect fun atoll(s: String?): CLonglong

public expect fun strtod(s: String?, endp: COpaquePointer?): CDouble

public expect fun strtof(s: String?, endp: COpaquePointer?): CFloat

public expect fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong

public expect fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong

public expect fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong

public expect fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong

public expect fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer?

public expect fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer?

public expect fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer?

public expect fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer?

public expect fun strcmp(cs: String?, ct: String?): CInt

public expect fun strncmp(cs: String?, ct: String?, n: SizeT): CInt

public expect fun strcoll(cs: String?, ct: String?): CInt

public expect fun strchr(cs: String?, c: CInt): COpaquePointer?

public expect fun strrchr(cs: String?, c: CInt): COpaquePointer?

public expect fun strspn(cs: String?, ct: String?): SizeT

public expect fun strcspn(cs: String?, ct: String?): SizeT

public expect fun strdup(cs: String?): COpaquePointer?

public expect fun strndup(cs: String?, n: SizeT): COpaquePointer?

public expect fun strpbrk(cs: String?, ct: String?): COpaquePointer?

public expect fun strstr(cs: String?, ct: String?): COpaquePointer?

public expect fun strcasecmp(s1: String?, s2: String?): CInt

public expect fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt

public expect fun strlen(cs: String?): SizeT

public expect fun strnlen(cs: String?, maxlen: SizeT): SizeT

public expect fun strerror(n: CInt): COpaquePointer?

public expect fun strtok(s: COpaquePointer?, t: String?): COpaquePointer?

public expect fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT

public expect fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt

public expect fun printf(format: String?, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt

public expect fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt

public expect fun scanf(format: String?, vararg variadicArgs: Long): CInt

public expect fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt

public expect fun getcharUnlocked(): CInt

public expect fun putcharUnlocked(c: CInt): CInt

public expect fun shutdown(socket: CInt, how: CInt): CInt

public expect fun fstat(fildes: CInt, buf: Stat?): CInt

public expect fun mkdir(path: String?, mode: ModeT): CInt

public expect fun stat(path: String?, buf: Stat?): CInt

public expect fun fdopen(fd: CInt, mode: String?): FILE?

public expect fun fileno(stream: FILE?): CInt

public expect fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun creat(path: String?, mode: ModeT): CInt

public expect fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun opendir(dirname: String?): DIR?

public expect fun fdopendir(fd: CInt): DIR?

public expect fun readdir(dirp: DIR?): io.github.kotlinmania.libc.Dirent?

public expect fun closedir(dirp: DIR?): CInt

public expect fun rewinddir(dirp: DIR?)

public expect fun dirfd(dirp: DIR?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt

public expect fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt

public expect fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt

public expect fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT

public expect fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt

public expect fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt

public expect fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt

public expect fun access(path: String?, amode: CInt): CInt

public expect fun close(fd: CInt): CInt

public expect fun fpathconf(filedes: CInt, name: CInt): CLong

public expect fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt

public expect fun isatty(fd: CInt): CInt

public expect fun link(src: String?, dst: String?): CInt

public expect fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT

public expect fun pathconf(path: String?, name: CInt): CLong

public expect fun rmdir(path: String?): CInt

public expect fun sleep(secs: CUint): CUint

public expect fun unlink(c: String?): CInt

public expect fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT

public expect fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT

public expect fun lstat(path: String?, buf: Stat?): CInt

public expect fun fsync(fd: CInt): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun symlink(path1: String?, path2: String?): CInt

public expect fun truncate(path: String?, length: OffT): CInt

public expect fun ftruncate(fd: CInt, length: OffT): CInt

public expect fun getrusage(resource: CInt, usage: Rusage?): CInt

public expect fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: COpaquePointer?): CInt

public expect fun times(buf: io.github.kotlinmania.libc.Tms?): io.github.kotlinmania.libc.ClockT

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun usleep(secs: CUint): CInt

public expect fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT

public expect fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT

public expect fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt

public expect fun setlocale(category: CInt, locale: String?): COpaquePointer?

public expect fun localeconv(): Lconv?

public expect fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT

public expect fun timegm(tm: io.github.kotlinmania.libc.Tm?): TimeT

public expect fun sysconf(name: CInt): CLong

public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: FILE?): OffT

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun strcasestr(cs: String?, ct: String?): COpaquePointer?

public expect fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun writev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT

public expect fun pwritev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun futimens(fd: CInt, times: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flag: CInt): CInt

public expect fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun duplocale(base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT

public expect fun freelocale(loc: io.github.kotlinmania.libc.LocaleT)

public expect fun newlocale(mask: CInt, locale: String?, base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT

public expect fun uselocale(loc: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT

public expect fun schedYield(): CInt

public expect fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun chdir(dir: String?): CInt

public expect fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer?

public expect fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, loc: io.github.kotlinmania.libc.LocaleT): COpaquePointer?

public expect fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt

public expect fun wasilibcRegisterPreopenedFd(fd: CInt, path: String?): CInt

public expect fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt

public expect fun wasilibcUnlinkat(fd: CInt, path: String?): CInt

public expect fun wasilibcRmdirat(fd: CInt, path: String?): CInt

public expect fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): CInt

public expect fun wasilibcTell(fd: CInt): OffT

public expect fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: String?): CInt

public expect fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: String?): CInt

public expect fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt

public expect fun wasilibcNocwdSymlinkat(target: String?, dirfd: CInt, path: String?): CInt

public expect fun wasilibcNocwdReadlinkat(dirfd: CInt, path: String?, buf: COpaquePointer?, bufsize: ULong): Long

public expect fun wasilibcNocwdFaccessat(dirfd: CInt, path: String?, mode: CInt, flags: CInt): CInt

public expect fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt

public expect fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: String?, flags: CInt): CInt

public expect fun wasilibcNocwdFstatat(dirfd: CInt, path: String?, buf: Stat?, flags: CInt): CInt

public expect fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: String?): CInt

public expect fun wasilibcNocwdUtimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flags: CInt): CInt

public expect fun wasilibcNocwdOpendirat(dirfd: CInt, path: String?): DIR?

public expect fun wasilibcAccess(pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun wasilibcStat(pathname: String?, buf: Stat?, flags: CInt): CInt

public expect fun wasilibcUtimens(pathname: String?, times: io.github.kotlinmania.libc.Timespec?, flags: CInt): CInt

public expect fun wasilibcLink(oldpath: String?, newpath: String?, flags: CInt): CInt

public expect fun wasilibcLinkOldat(olddirfd: CInt, oldpath: String?, newpath: String?, flags: CInt): CInt

public expect fun wasilibcLinkNewat(oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt

public expect fun wasilibcRenameOldat(olddirfd: CInt, oldpath: String?, newpath: String?): CInt

public expect fun wasilibcRenameNewat(oldpath: String?, newdirfd: CInt, newpath: String?): CInt

public expect fun arc4random(): UInt

public expect fun arc4randomBuf(a: COpaquePointer?, b: SizeT)

public expect fun arc4randomUniform(a: UInt): UInt

public expect fun errnoLocation(): CInt?

public expect fun chmod(path: String?, mode: ModeT): CInt

public expect fun fchmod(fd: CInt, mode: ModeT): CInt

public expect fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer?

public expect fun pthreadSelf(): PthreadT

public expect fun pthreadCreate(native: COpaquePointer?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

public expect fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt

public expect fun pthreadAttrInit(attr: PthreadAttrT?): CInt

public expect fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt

public expect fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt

public expect fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: SizeT): CInt

public expect fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt

public expect fun pthreadDetach(thread: PthreadT): CInt

public expect fun pthreadKeyCreate(key: CUint?, dtor: PthreadKeyCreateDtorCallback?): CInt

public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

public expect fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer?

public expect fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt

public expect fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt

public expect fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt

public expect fun pthreadMutexLock(lock: PthreadMutexT?): CInt

public expect fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt

public expect fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt

public expect fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt

public expect fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt

public expect fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt

public expect fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt

public expect fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt

public expect fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt

public expect fun pthreadCondSignal(cond: PthreadCondT?): CInt

public expect fun pthreadCondBroadcast(cond: PthreadCondT?): CInt

public expect fun pthreadCondDestroy(cond: PthreadCondT?): CInt

public expect fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt

public expect fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt

public expect fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): CInt

public expect fun pthreadRwlockDestroy(lock: PthreadRwlockT?): CInt

public expect fun pthreadRwlockRdlock(lock: PthreadRwlockT?): CInt

public expect fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): CInt

public expect fun pthreadRwlockWrlock(lock: PthreadRwlockT?): CInt

public expect fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): CInt

public expect fun pthreadRwlockUnlock(lock: PthreadRwlockT?): CInt

public expect fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt

public expect fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt
