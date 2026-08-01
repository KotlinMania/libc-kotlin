// port-lint: source wasi/mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public typealias IntmaxT = Long
public typealias UintmaxT = ULong
public typealias SizeT = ULong
public typealias SsizeT = Long
public typealias PtrdiffT = Long
public typealias IntptrT = Long
public typealias UintptrT = ULong
public typealias OffT = Long
public typealias PidT = Int
public typealias ClockT = CLongLong
public typealias TimeT = CLongLong
public typealias InoT = ULong
public typealias SigsetT = CUChar
public typealias SusecondsT = CLongLong
public typealias ModeT = UInt
public typealias DevT = ULong
public typealias UidT = UInt
public typealias GidT = UInt
public typealias NlinkT = ULong
public typealias BlksizeT = CLong
public typealias BlkcntT = Long
public typealias NfdsT = CULong
public typealias WcharT = Int
public typealias NlItem = CInt
public typealias WasiRightsT = ULong
public typealias LocaleT = COpaquePointer?
public typealias PthreadT = COpaquePointer?
public typealias PthreadOnceT = CInt
public typealias PthreadKeyT = CUInt
public typealias PthreadSpinlockT = CInt

public data class MaxAlignT(
    val priv: List<Double>,
)

public data class FposT(
    val data: UByteArray,
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
    val tmGmtoff: CInt,
    val tmZone: String?,
    val tmNsec: CInt,
)

public data class Timeval(
    val tvSec: TimeT,
    val tvUsec: SusecondsT,
)

public data class Timespec(
    val tvSec: TimeT,
    val tvNsec: CLong,
)

public data class Tms(
    val tmsUtime: ClockT,
    val tmsStime: ClockT,
    val tmsCutime: ClockT,
    val tmsCstime: ClockT,
)

public data class Itimerspec(
    val itInterval: Timespec,
    val itValue: Timespec,
)

public data class Iovec(
    val iovBase: COpaquePointer?,
    val iovLen: ULong,
)

public data class Lconv(
    val decimalPoint: String?,
    val thousandsSep: String?,
    val grouping: String?,
    val intCurrSymbol: String?,
    val currencySymbol: String?,
    val monDecimalPoint: String?,
    val monThousandsSep: String?,
    val monGrouping: String?,
    val positiveSign: String?,
    val negativeSign: String?,
    val intFracDigits: CChar,
    val fracDigits: CChar,
    val pCsPrecedes: CChar,
    val pSepBySpace: CChar,
    val nCsPrecedes: CChar,
    val nSepBySpace: CChar,
    val pSignPosn: CChar,
    val nSignPosn: CChar,
    val intPCsPrecedes: CChar,
    val intPSepBySpace: CChar,
    val intNCsPrecedes: CChar,
    val intNSepBySpace: CChar,
    val intPSignPosn: CChar,
    val intNSignPosn: CChar,
)

public data class Pollfd(
    val fd: CInt,
    val events: CShort,
    val revents: CShort,
)

public data class Rusage(
    val ruUtime: Timeval,
    val ruStime: Timeval,
)

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stNlink: NlinkT,
    val stMode: ModeT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: OffT,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stAtim: Timespec,
    val stMtim: Timespec,
    val stCtim: Timespec,
)

public data class FdSet(
    val nfds: ULong,
    val fds: IntArray,
)

public data class PthreadAttrT(
    val size: LongArray,
)

public data class PthreadMutexattrT(
    val attr: CUInt,
)

public data class PthreadCondattrT(
    val attr: CUInt,
)

public data class PthreadBarrierattrT(
    val attr: CUInt,
)

public data class PthreadRwlockattrT(
    val attr: UIntArray,
)

public data class PthreadCondT(
    val size: List<COpaquePointer?>,
)

public data class PthreadMutexT(
    val size: List<COpaquePointer?>,
)

public data class PthreadRwlockT(
    val size: List<COpaquePointer?>,
)

public data class PthreadBarrierT(
    val size: List<COpaquePointer?>,
)

public data class Dirent(
    val dIno: InoT,
    val dType: CUChar,
    val dName: ByteArray,
)

public data class ClockidT(
    val value: COpaquePointer?,
)

public const val EXIT_SUCCESS: CInt = 0
public const val EXIT_FAILURE: CInt = 1
public const val STDIN_FILENO: CInt = 0
public const val STDOUT_FILENO: CInt = 1
public const val STDERR_FILENO: CInt = 2
public const val SEEK_SET: CInt = 0
public const val SEEK_CUR: CInt = 1
public const val SEEK_END: CInt = 2
public const val _IOFBF: CInt = 0
public const val _IONBF: CInt = 2
public const val _IOLBF: CInt = 1
public const val F_GETFD: CInt = 1
public const val F_SETFD: CInt = 2
public const val F_GETFL: CInt = 3
public const val F_SETFL: CInt = 4
public const val FD_CLOEXEC: CInt = 1
public const val FD_SETSIZE: ULong = 1024uL
public const val O_APPEND: CInt = 0x0001
public const val O_DSYNC: CInt = 0x0002
public const val O_NONBLOCK: CInt = 0x0004
public const val O_RSYNC: CInt = 0x0008
public const val O_SYNC: CInt = 0x0010
public val O_CREAT: CInt = 0x0001 shl 12
public val O_DIRECTORY: CInt = 0x0002 shl 12
public val O_EXCL: CInt = 0x0004 shl 12
public val O_TRUNC: CInt = 0x0008 shl 12
public const val O_NOFOLLOW: CInt = 0x01000000
public const val O_EXEC: CInt = 0x02000000
public const val O_RDONLY: CInt = 0x04000000
public const val O_SEARCH: CInt = 0x08000000
public const val O_WRONLY: CInt = 0x10000000
public const val O_CLOEXEC: CInt = 0x0
public val O_RDWR: CInt = O_WRONLY or O_RDONLY
public val O_ACCMODE: CInt = O_EXEC or O_RDWR or O_SEARCH
public const val O_NOCTTY: CInt = 0x0
public const val POSIX_FADV_DONTNEED: CInt = 4
public const val POSIX_FADV_NOREUSE: CInt = 5
public const val POSIX_FADV_NORMAL: CInt = 0
public const val POSIX_FADV_RANDOM: CInt = 2
public const val POSIX_FADV_SEQUENTIAL: CInt = 1
public const val POSIX_FADV_WILLNEED: CInt = 3
public const val AT_FDCWD: CInt = -2
public const val AT_EACCESS: CInt = 0x0
public const val AT_SYMLINK_NOFOLLOW: CInt = 0x1
public const val AT_SYMLINK_FOLLOW: CInt = 0x2
public const val AT_REMOVEDIR: CInt = 0x4
public const val UTIME_OMIT: CLong = 0xfffffffe
public const val UTIME_NOW: CLong = 0xffffffff
public const val S_IFIFO: ModeT = 4096u
public const val S_IFCHR: ModeT = 8192u
public const val S_IFBLK: ModeT = 24576u
public const val S_IFDIR: ModeT = 16384u
public const val S_IFREG: ModeT = 32768u
public const val S_IFLNK: ModeT = 40960u
public const val S_IFSOCK: ModeT = 49152u
public const val S_IFMT: ModeT = 61440u
public const val S_IRWXO: ModeT = 7u
public const val S_IXOTH: ModeT = 1u
public const val S_IWOTH: ModeT = 2u
public const val S_IROTH: ModeT = 4u
public const val S_IRWXG: ModeT = 56u
public const val S_IXGRP: ModeT = 8u
public const val S_IWGRP: ModeT = 16u
public const val S_IRGRP: ModeT = 32u
public const val S_IRWXU: ModeT = 448u
public const val S_IXUSR: ModeT = 64u
public const val S_IWUSR: ModeT = 128u
public const val S_IRUSR: ModeT = 256u
public const val S_ISVTX: ModeT = 512u
public const val S_ISGID: ModeT = 1024u
public const val S_ISUID: ModeT = 2048u
public val DT_UNKNOWN: UByte = (0).toUByte()
public val DT_BLK: UByte = (1).toUByte()
public val DT_CHR: UByte = (2).toUByte()
public val DT_DIR: UByte = (3).toUByte()
public val DT_REG: UByte = (4).toUByte()
public val DT_FIFO: UByte = (6).toUByte()
public val DT_LNK: UByte = (7).toUByte()
public val DT_SOCK: UByte = (20).toUByte()
public const val FIONREAD: CInt = 1
public const val FIONBIO: CInt = 2
public const val F_OK: CInt = 0
public const val R_OK: CInt = 4
public const val W_OK: CInt = 2
public const val X_OK: CInt = 1
public const val POLLIN: CShort = 0x1
public const val POLLOUT: CShort = 0x2
public const val POLLERR: CShort = 0x1000
public const val POLLHUP: CShort = 0x2000
public const val POLLNVAL: CShort = 0x4000
public const val POLLRDNORM: CShort = 0x1
public const val POLLWRNORM: CShort = 0x2
public const val E2BIG: CInt = 1
public const val EACCES: CInt = 2
public const val EADDRINUSE: CInt = 3
public const val EADDRNOTAVAIL: CInt = 4
public const val EAFNOSUPPORT: CInt = 5
public const val EAGAIN: CInt = 6
public const val EALREADY: CInt = 7
public const val EBADF: CInt = 8
public const val EBADMSG: CInt = 9
public const val EBUSY: CInt = 10
public const val ECANCELED: CInt = 11
public const val ECHILD: CInt = 12
public const val ECONNABORTED: CInt = 13
public const val ECONNREFUSED: CInt = 14
public const val ECONNRESET: CInt = 15
public const val EDEADLK: CInt = 16
public const val EDESTADDRREQ: CInt = 17
public const val EDOM: CInt = 18
public const val EDQUOT: CInt = 19
public const val EEXIST: CInt = 20
public const val EFAULT: CInt = 21
public const val EFBIG: CInt = 22
public const val EHOSTUNREACH: CInt = 23
public const val EIDRM: CInt = 24
public const val EILSEQ: CInt = 25
public const val EINPROGRESS: CInt = 26
public const val EINTR: CInt = 27
public const val EINVAL: CInt = 28
public const val EIO: CInt = 29
public const val EISCONN: CInt = 30
public const val EISDIR: CInt = 31
public const val ELOOP: CInt = 32
public const val EMFILE: CInt = 33
public const val EMLINK: CInt = 34
public const val EMSGSIZE: CInt = 35
public const val EMULTIHOP: CInt = 36
public const val ENAMETOOLONG: CInt = 37
public const val ENETDOWN: CInt = 38
public const val ENETRESET: CInt = 39
public const val ENETUNREACH: CInt = 40
public const val ENFILE: CInt = 41
public const val ENOBUFS: CInt = 42
public const val ENODEV: CInt = 43
public const val ENOENT: CInt = 44
public const val ENOEXEC: CInt = 45
public const val ENOLCK: CInt = 46
public const val ENOLINK: CInt = 47
public const val ENOMEM: CInt = 48
public const val ENOMSG: CInt = 49
public const val ENOPROTOOPT: CInt = 50
public const val ENOSPC: CInt = 51
public const val ENOSYS: CInt = 52
public const val ENOTCONN: CInt = 53
public const val ENOTDIR: CInt = 54
public const val ENOTEMPTY: CInt = 55
public const val ENOTRECOVERABLE: CInt = 56
public const val ENOTSOCK: CInt = 57
public const val ENOTSUP: CInt = 58
public const val ENOTTY: CInt = 59
public const val ENXIO: CInt = 60
public const val EOVERFLOW: CInt = 61
public const val EOWNERDEAD: CInt = 62
public const val EPERM: CInt = 63
public const val EPIPE: CInt = 64
public const val EPROTO: CInt = 65
public const val EPROTONOSUPPORT: CInt = 66
public const val EPROTOTYPE: CInt = 67
public const val ERANGE: CInt = 68
public const val EROFS: CInt = 69
public const val ESPIPE: CInt = 70
public const val ESRCH: CInt = 71
public const val ESTALE: CInt = 72
public const val ETIMEDOUT: CInt = 73
public const val ETXTBSY: CInt = 74
public const val EXDEV: CInt = 75
public const val ENOTCAPABLE: CInt = 76
public const val EOPNOTSUPP: CInt = ENOTSUP
public const val EWOULDBLOCK: CInt = EAGAIN
public const val _SC_PAGESIZE: CInt = 30
public const val _SC_PAGE_SIZE: CInt = _SC_PAGESIZE
public const val _SC_IOV_MAX: CInt = 60
public const val _SC_SYMLOOP_MAX: CInt = 173
public const val ABDAY_1: NlItem = 0x20000
public const val ABDAY_2: NlItem = 0x20001
public const val ABDAY_3: NlItem = 0x20002
public const val ABDAY_4: NlItem = 0x20003
public const val ABDAY_5: NlItem = 0x20004
public const val ABDAY_6: NlItem = 0x20005
public const val ABDAY_7: NlItem = 0x20006
public const val DAY_1: NlItem = 0x20007
public const val DAY_2: NlItem = 0x20008
public const val DAY_3: NlItem = 0x20009
public const val DAY_4: NlItem = 0x2000A
public const val DAY_5: NlItem = 0x2000B
public const val DAY_6: NlItem = 0x2000C
public const val DAY_7: NlItem = 0x2000D
public const val ABMON_1: NlItem = 0x2000E
public const val ABMON_2: NlItem = 0x2000F
public const val ABMON_3: NlItem = 0x20010
public const val ABMON_4: NlItem = 0x20011
public const val ABMON_5: NlItem = 0x20012
public const val ABMON_6: NlItem = 0x20013
public const val ABMON_7: NlItem = 0x20014
public const val ABMON_8: NlItem = 0x20015
public const val ABMON_9: NlItem = 0x20016
public const val ABMON_10: NlItem = 0x20017
public const val ABMON_11: NlItem = 0x20018
public const val ABMON_12: NlItem = 0x20019
public const val MON_1: NlItem = 0x2001A
public const val MON_2: NlItem = 0x2001B
public const val MON_3: NlItem = 0x2001C
public const val MON_4: NlItem = 0x2001D
public const val MON_5: NlItem = 0x2001E
public const val MON_6: NlItem = 0x2001F
public const val MON_7: NlItem = 0x20020
public const val MON_8: NlItem = 0x20021
public const val MON_9: NlItem = 0x20022
public const val MON_10: NlItem = 0x20023
public const val MON_11: NlItem = 0x20024
public const val MON_12: NlItem = 0x20025
public const val AM_STR: NlItem = 0x20026
public const val PM_STR: NlItem = 0x20027
public const val D_T_FMT: NlItem = 0x20028
public const val D_FMT: NlItem = 0x20029
public const val T_FMT: NlItem = 0x2002A
public const val T_FMT_AMPM: NlItem = 0x2002B
public const val ERA: NlItem = 0x2002C
public const val ERA_D_FMT: NlItem = 0x2002E
public const val ALT_DIGITS: NlItem = 0x2002F
public const val ERA_D_T_FMT: NlItem = 0x20030
public const val ERA_T_FMT: NlItem = 0x20031
public const val CODESET: NlItem = 14
public const val CRNCYSTR: NlItem = 0x4000F
public const val RADIXCHAR: NlItem = 0x10000
public const val THOUSEP: NlItem = 0x10001
public const val YESEXPR: NlItem = 0x50000
public const val NOEXPR: NlItem = 0x50001
public const val YESSTR: NlItem = 0x50002
public const val NOSTR: NlItem = 0x50003
public const val PTHREAD_STACK_MIN: ULong = 2048uL
public const val TIMER_ABSTIME: CInt = 1

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun fDISSET(fd: CInt, set: FdSet?): Boolean

public expect fun fDSET(fd: CInt, set: FdSet?)

public expect fun fDZERO(set: FdSet?)

public expect fun exit(code: CInt): Nothing


public expect fun abort(): Nothing

public expect fun alignedAlloc(a: ULong, b: ULong): COpaquePointer?

public expect fun calloc(amt: ULong, amt2: ULong): COpaquePointer?


public expect fun free(ptr: COpaquePointer?)

public expect fun getenv(s: String?): String?

public expect fun malloc(amt: ULong): COpaquePointer?

public expect fun mallocUsableSize(ptr: COpaquePointer?): ULong

public expect fun sbrk(increment: IntptrT): COpaquePointer?

public expect fun rand(): CInt

public expect fun read(fd: CInt, ptr: COpaquePointer?, size: ULong): SsizeT

public expect fun realloc(ptr: COpaquePointer?, amt: ULong): COpaquePointer?

public expect fun setenv(k: String?, v: String?, a: CInt): CInt

public expect fun unsetenv(k: String?): CInt

public expect fun clearenv(): CInt

public expect fun write(fd: CInt, ptr: COpaquePointer?, size: ULong): SsizeT

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

public expect fun fread(buf: COpaquePointer?, a: ULong, b: ULong, f: FILE?): ULong

public expect fun fwrite(buf: COpaquePointer?, a: ULong, b: ULong, f: FILE?): ULong

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

public expect fun srand(a: CUInt)

public expect fun atexit(a: (() -> Unit)?): CInt

public expect fun atQuickExit(a: (() -> Unit)?): CInt

public expect fun quickExit(a: CInt): Nothing

public expect fun posixMemalign(a: COpaquePointer?, b: ULong, c: ULong): CInt

public expect fun randR(a: CUInt?): CInt

public expect fun random(): CLong

public expect fun srandom(a: CUInt)

public expect fun putenv(a: String?): CInt

public expect fun clock(): ClockT

public expect fun time(a: TimeT?): TimeT

public expect fun difftime(a: TimeT, b: TimeT): CDouble

public expect fun mktime(a: Tm?): TimeT

public expect fun strftime(a: String?, b: ULong, c: String?, d: Tm?): ULong

public expect fun gmtime(a: TimeT?): Tm?

public expect fun gmtimeR(a: TimeT?, b: Tm?): Tm?

public expect fun localtime(a: TimeT?): Tm?

public expect fun localtimeR(a: TimeT?, b: Tm?): Tm?

public expect fun asctimeR(a: Tm?, b: String?): String?

public expect fun ctimeR(a: TimeT?, b: String?): String?

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

public expect fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt

public expect fun setbuf(stream: FILE?, buf: String?)

public expect fun fgets(buf: String?, n: CInt, stream: FILE?): String?

public expect fun atof(s: String?): CDouble

public expect fun atoi(s: String?): CInt

public expect fun atol(s: String?): CLong

public expect fun atoll(s: String?): CLongLong

public expect fun strtod(s: String?, endp: COpaquePointer?): CDouble

public expect fun strtof(s: String?, endp: COpaquePointer?): CFloat

public expect fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong

public expect fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLongLong

public expect fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CULong

public expect fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CULongLong

public expect fun strcpy(dst: String?, src: String?): String?

public expect fun strncpy(dst: String?, src: String?, n: ULong): String?

public expect fun strcat(s: String?, ct: String?): String?

public expect fun strncat(s: String?, ct: String?, n: ULong): String?

public expect fun strcmp(cs: String?, ct: String?): CInt

public expect fun strncmp(cs: String?, ct: String?, n: ULong): CInt

public expect fun strcoll(cs: String?, ct: String?): CInt

public expect fun strchr(cs: String?, c: CInt): String?

public expect fun strrchr(cs: String?, c: CInt): String?

public expect fun strspn(cs: String?, ct: String?): ULong

public expect fun strcspn(cs: String?, ct: String?): ULong

public expect fun strdup(cs: String?): String?

public expect fun strndup(cs: String?, n: ULong): String?

public expect fun strpbrk(cs: String?, ct: String?): String?

public expect fun strstr(cs: String?, ct: String?): String?

public expect fun strcasecmp(s1: String?, s2: String?): CInt

public expect fun strncasecmp(s1: String?, s2: String?, n: ULong): CInt

public expect fun strlen(cs: String?): ULong

public expect fun strnlen(cs: String?, maxlen: ULong): ULong

public expect fun strerror(n: CInt): String?

public expect fun strtok(s: String?, t: String?): String?

public expect fun strxfrm(s: String?, ct: String?, n: ULong): ULong

public expect fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer?

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer?

public expect fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?

public expect fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt

public expect fun printf(format: String?, vararg args: Any?): CInt

public expect fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): CInt

public expect fun sprintf(s: String?, format: String?, vararg args: Any?): CInt

public expect fun fscanf(stream: FILE?, format: String?, vararg args: Any?): CInt

public expect fun scanf(format: String?, vararg args: Any?): CInt

public expect fun sscanf(s: String?, format: String?, vararg args: Any?): CInt

public expect fun getcharUnlocked(): CInt

public expect fun putcharUnlocked(c: CInt): CInt

public expect fun shutdown(socket: CInt, how: CInt): CInt

public expect fun fstat(fildes: CInt, buf: Stat?): CInt

public expect fun mkdir(path: String?, mode: ModeT): CInt

public expect fun stat(path: String?, buf: Stat?): CInt

public expect fun fdopen(fd: CInt, mode: String?): FILE?

public expect fun fileno(stream: FILE?): CInt

public expect fun open(path: String?, oflag: CInt, vararg args: Any?): CInt

public expect fun creat(path: String?, mode: ModeT): CInt

public expect fun fcntl(fd: CInt, cmd: CInt, vararg args: Any?): CInt

public expect fun opendir(dirname: String?): DIR?

public expect fun fdopendir(fd: CInt): DIR?

public expect fun readdir(dirp: DIR?): Dirent?

public expect fun closedir(dirp: DIR?): CInt

public expect fun rewinddir(dirp: DIR?)

public expect fun dirfd(dirp: DIR?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg args: Any?): CInt

public expect fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt

public expect fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt

public expect fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun readlinkat(dirfd: CInt, pathname: String?, buf: String?, bufsiz: ULong): SsizeT

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

public expect fun sleep(secs: CUInt): CUInt

public expect fun unlink(c: String?): CInt

public expect fun pread(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT

public expect fun pwrite(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT

public expect fun lstat(path: String?, buf: Stat?): CInt

public expect fun fsync(fd: CInt): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun symlink(path1: String?, path2: String?): CInt

public expect fun truncate(path: String?, length: OffT): CInt

public expect fun ftruncate(fd: CInt, length: OffT): CInt

public expect fun getrusage(resource: CInt, usage: Rusage?): CInt

public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt

public expect fun times(buf: Tms?): ClockT

public expect fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt

public expect fun usleep(secs: CUInt): CInt

public expect fun send(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT

public expect fun recv(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT

public expect fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt

public expect fun setlocale(category: CInt, locale: String?): String?

public expect fun localeconv(): Lconv?

public expect fun readlink(path: String?, buf: String?, bufsz: ULong): SsizeT

public expect fun timegm(tm: Tm?): TimeT

public expect fun sysconf(name: CInt): CLong

public expect fun ioctl(fd: CInt, request: CInt, vararg args: Any?): CInt

public expect fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: FILE?): OffT

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun strcasestr(cs: String?, ct: String?): String?

public expect fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun futimens(fd: CInt, times: Timespec?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt

public expect fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt

public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun schedYield(): CInt

public expect fun getcwd(buf: String?, size: ULong): String?

public expect fun chdir(dir: String?): CInt

public expect fun nlLanginfo(item: NlItem): String?

public expect fun nlLanginfoL(item: NlItem, loc: LocaleT): String?

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

public expect fun wasilibcNocwdReadlinkat(dirfd: CInt, path: String?, buf: String?, bufsize: ULong): Long

public expect fun wasilibcNocwdFaccessat(dirfd: CInt, path: String?, mode: CInt, flags: CInt): CInt

public expect fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt

public expect fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: String?, flags: CInt): CInt

public expect fun wasilibcNocwdFstatat(dirfd: CInt, path: String?, buf: Stat?, flags: CInt): CInt

public expect fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: String?): CInt

public expect fun wasilibcNocwdUtimensat(dirfd: CInt, path: String?, times: Timespec?, flags: CInt): CInt

public expect fun wasilibcNocwdOpendirat(dirfd: CInt, path: String?): DIR?

public expect fun wasilibcAccess(pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun wasilibcStat(pathname: String?, buf: Stat?, flags: CInt): CInt

public expect fun wasilibcUtimens(pathname: String?, times: Timespec?, flags: CInt): CInt

public expect fun wasilibcLink(oldpath: String?, newpath: String?, flags: CInt): CInt

public expect fun wasilibcLinkOldat(olddirfd: CInt, oldpath: String?, newpath: String?, flags: CInt): CInt

public expect fun wasilibcLinkNewat(oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt

public expect fun wasilibcRenameOldat(olddirfd: CInt, oldpath: String?, newpath: String?): CInt

public expect fun wasilibcRenameNewat(oldpath: String?, newdirfd: CInt, newpath: String?): CInt

public expect fun arc4random(): UInt

public expect fun arc4randomBuf(a: COpaquePointer?, b: ULong)

public expect fun arc4randomUniform(a: UInt): UInt

public expect fun errnoLocation(): CInt?

public expect fun chmod(path: String?, mode: ModeT): CInt

public expect fun fchmod(fd: CInt, mode: ModeT): CInt

public expect fun realpath(pathname: String?, resolved: String?): String?

public expect fun pthreadSelf(): PthreadT

public expect fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

public expect fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt

public expect fun pthreadAttrInit(attr: PthreadAttrT?): CInt

public expect fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt

public expect fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt

public expect fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): CInt

public expect fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt

public expect fun pthreadDetach(thread: PthreadT): CInt

public expect fun pthreadKeyCreate(key: PthreadKeyT?, dtor: ((COpaquePointer?) -> Unit)?): CInt

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
