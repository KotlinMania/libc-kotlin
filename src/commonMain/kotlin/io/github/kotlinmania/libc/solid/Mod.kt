// port-lint: source libc/src/solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public typealias IntmaxT = Long
public typealias UintmaxT = ULong
public typealias UintptrT = ULong
public typealias IntptrT = Long
public typealias PtrdiffT = Long
public typealias SizeT = UintptrT
public typealias SsizeT = IntptrT
public typealias ClockT = CUInt
public typealias TimeT = Long
public typealias ClockidT = CInt
public typealias TimerT = CInt
public typealias SusecondsT = CInt
public typealias UsecondsT = CUInt
public typealias SighandlerT = ULong
public typealias CaddrT = String?
public typealias GidT = UInt
public typealias InAddrT = UInt
public typealias InPortT = UShort
public typealias ModeT = UInt
public typealias OffT = Long
public typealias PidT = Int
public typealias SaFamilyT = UByte
public typealias SocklenT = CUInt
public typealias UidT = UInt
public typealias FsblkcntT = ULong
public typealias FsfilcntT = ULong
public typealias LocaleT = ULong
public typealias NlItem = CLong
public typealias VaList = String?
public typealias UInt8T = UByte
public typealias UInt16T = UShort
public typealias UInt32T = UInt
public typealias UInt64T = ULong
public typealias UChar = CUChar
public typealias UShort = CUShort
public typealias UInt = CUInt
public typealias ULong = CULong
public typealias Unchar = CUChar
public typealias Ushort = CUShort
public typealias Uint = CUInt
public typealias Ulong = CULong
public typealias UQuadT = ULong
public typealias QuadT = Long
public typealias QaddrT = QuadT?
public typealias LonglongT = Long
public typealias ULonglongT = ULong
public typealias BlkcntT = Long
public typealias BlksizeT = Int
public typealias DaddrT = Long
public typealias DevT = ULong
public typealias FixptT = UInt
public typealias IdtypeT = CInt
public typealias IdT = UInt
public typealias InoT = ULong
public typealias KeyT = CLong
public typealias NlinkT = UInt
public typealias LwpidT = Int
public typealias RlimT = ULong
public typealias SegszT = Int
public typealias SwblkT = Int
public typealias MqdT = CInt
public typealias CpuidT = CULong
public typealias PsetidT = CInt

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stMode: CShort,
    val stNlink: CShort,
    val stUid: CShort,
    val stGid: CShort,
    val stRdev: DevT,
    val stSize: OffT,
    val stAtime: TimeT,
    val stMtime: TimeT,
    val stCtime: TimeT,
    val stBlksize: BlksizeT,
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
    val tmGmtoff: CLong,
    val tmZone: String?,
)

public data class QdivT(
    val quot: QuadT,
    val rem: QuadT,
)

public data class LldivT(
    val quot: CLongLong,
    val rem: CLongLong,
)

public data class DivT(
    val quot: CInt,
    val rem: CInt,
)

public data class LdivT(
    val quot: CLong,
    val rem: CLong,
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
    val intNCsPrecedes: CChar,
    val intPSepBySpace: CChar,
    val intNSepBySpace: CChar,
    val intPSignPosn: CChar,
    val intNSignPosn: CChar,
)

public data class Iovec(
    val iovBase: COpaquePointer?,
    val iovLen: ULong,
)

public data class Timeval(
    val tvSec: CLong,
    val tvUsec: CLong,
)

public const val INT_MIN: CInt = -2147483648
public const val INT_MAX: CInt = 2147483647
public const val EXIT_FAILURE: CInt = 1
public const val EXIT_SUCCESS: CInt = 0
public const val RAND_MAX: CInt = 0x7fffffff
public const val EOF: CInt = -1
public const val SEEK_SET: CInt = 0
public const val SEEK_CUR: CInt = 1
public const val SEEK_END: CInt = 2
public const val _IOFBF: CInt = 0
public const val _IONBF: CInt = 2
public const val _IOLBF: CInt = 1
public const val BUFSIZ: CUInt = 1024u
public const val FOPEN_MAX: CUInt = 20u
public const val FILENAME_MAX: CUInt = 1024u
public const val O_RDONLY: CInt = 1
public const val O_WRONLY: CInt = 2
public const val O_RDWR: CInt = 4
public const val O_APPEND: CInt = 8
public const val O_CREAT: CInt = 0x10
public const val O_EXCL: CInt = 0x400
public const val O_TEXT: CInt = 0x100
public const val O_BINARY: CInt = 0x200
public const val O_TRUNC: CInt = 0x20
public const val S_IEXEC: CShort = 64
public const val S_IWRITE: CShort = 128
public const val S_IREAD: CShort = 256
public const val S_IFCHR: CShort = 8192
public const val S_IFDIR: CShort = 16384
public const val S_IFMT: CShort = 57344.toShort()
public const val S_IFIFO: CShort = 4096
public const val S_IFBLK: CShort = 24576
public const val S_IFREG: CShort = 32768.toShort()
public const val LC_ALL: CInt = 0
public const val LC_COLLATE: CInt = 1
public const val LC_CTYPE: CInt = 2
public const val LC_MONETARY: CInt = 3
public const val LC_NUMERIC: CInt = 4
public const val LC_TIME: CInt = 5
public const val LC_MESSAGES: CInt = 6
public const val _LC_LAST: CInt = 7
public const val EPERM: CInt = 1
public const val ENOENT: CInt = 2
public const val ESRCH: CInt = 3
public const val EINTR: CInt = 4
public const val EIO: CInt = 5
public const val ENXIO: CInt = 6
public const val E2BIG: CInt = 7
public const val ENOEXEC: CInt = 8
public const val EBADF: CInt = 9
public const val ECHILD: CInt = 10
public const val EAGAIN: CInt = 11
public const val ENOMEM: CInt = 12
public const val EACCES: CInt = 13
public const val EFAULT: CInt = 14
public const val ENOTBLK: CInt = 15
public const val EBUSY: CInt = 16
public const val EEXIST: CInt = 17
public const val EXDEV: CInt = 18
public const val ENODEV: CInt = 19
public const val ENOTDIR: CInt = 20
public const val EISDIR: CInt = 21
public const val EINVAL: CInt = 22
public const val ENFILE: CInt = 23
public const val EMFILE: CInt = 24
public const val ENOTTY: CInt = 25
public const val ETXTBSY: CInt = 26
public const val EFBIG: CInt = 27
public const val ENOSPC: CInt = 28
public const val ESPIPE: CInt = 29
public const val EROFS: CInt = 30
public const val EMLINK: CInt = 31
public const val EPIPE: CInt = 32
public const val EDOM: CInt = 33
public const val ERANGE: CInt = 34
public const val EDEADLK: CInt = 35
public const val ENAMETOOLONG: CInt = 36
public const val ENOLCK: CInt = 37
public const val ENOSYS: CInt = 38
public const val ENOTEMPTY: CInt = 39
public const val ELOOP: CInt = 40
public const val EWOULDBLOCK: CInt = EAGAIN
public const val ENOMSG: CInt = 42
public const val EIDRM: CInt = 43
public const val ECHRNG: CInt = 44
public const val EL2NSYNC: CInt = 45
public const val EL3HLT: CInt = 46
public const val EL3RST: CInt = 47
public const val ELNRNG: CInt = 48
public const val EUNATCH: CInt = 49
public const val ENOCSI: CInt = 50
public const val EL2HLT: CInt = 51
public const val EBADE: CInt = 52
public const val EBADR: CInt = 53
public const val EXFULL: CInt = 54
public const val ENOANO: CInt = 55
public const val EBADRQC: CInt = 56
public const val EBADSLT: CInt = 57
public const val EDEADLOCK: CInt = EDEADLK
public const val EBFONT: CInt = 59
public const val ENOSTR: CInt = 60
public const val ENODATA: CInt = 61
public const val ETIME: CInt = 62
public const val ENOSR: CInt = 63
public const val ENONET: CInt = 64
public const val ENOPKG: CInt = 65
public const val EREMOTE: CInt = 66
public const val ENOLINK: CInt = 67
public const val EADV: CInt = 68
public const val ESRMNT: CInt = 69
public const val ECOMM: CInt = 70
public const val EPROTO: CInt = 71
public const val EMULTIHOP: CInt = 72
public const val EDOTDOT: CInt = 73
public const val EBADMSG: CInt = 74
public const val EOVERFLOW: CInt = 75
public const val ENOTUNIQ: CInt = 76
public const val EBADFD: CInt = 77
public const val EREMCHG: CInt = 78
public const val ELIBACC: CInt = 79
public const val ELIBBAD: CInt = 80
public const val ELIBSCN: CInt = 81
public const val ELIBMAX: CInt = 82
public const val ELIBEXEC: CInt = 83
public const val EILSEQ: CInt = 84
public const val ERESTART: CInt = 85
public const val ESTRPIPE: CInt = 86
public const val EUSERS: CInt = 87
public const val ENOTSOCK: CInt = 88
public const val EDESTADDRREQ: CInt = 89
public const val EMSGSIZE: CInt = 90
public const val EPROTOTYPE: CInt = 91
public const val ENOPROTOOPT: CInt = 92
public const val EPROTONOSUPPORT: CInt = 93
public const val ESOCKTNOSUPPORT: CInt = 94
public const val EOPNOTSUPP: CInt = 95
public const val EPFNOSUPPORT: CInt = 96
public const val EAFNOSUPPORT: CInt = 97
public const val EADDRINUSE: CInt = 98
public const val EADDRNOTAVAIL: CInt = 99
public const val ENETDOWN: CInt = 100
public const val ENETUNREACH: CInt = 101
public const val ENETRESET: CInt = 102
public const val ECONNABORTED: CInt = 103
public const val ECONNRESET: CInt = 104
public const val ENOBUFS: CInt = 105
public const val EISCONN: CInt = 106
public const val ENOTCONN: CInt = 107
public const val ESHUTDOWN: CInt = 108
public const val ETOOMANYREFS: CInt = 109
public const val ETIMEDOUT: CInt = 110
public const val ECONNREFUSED: CInt = 111
public const val EHOSTDOWN: CInt = 112
public const val EHOSTUNREACH: CInt = 113
public const val EALREADY: CInt = 114
public const val EINPROGRESS: CInt = 115
public const val ESTALE: CInt = 116
public const val EUCLEAN: CInt = 117
public const val ENOTNAM: CInt = 118
public const val ENAVAIL: CInt = 119
public const val EISNAM: CInt = 120
public const val EREMOTEIO: CInt = 121
public const val EDQUOT: CInt = 122
public const val ENOMEDIUM: CInt = 123
public const val EMEDIUMTYPE: CInt = 124
public const val ECANCELED: CInt = 125
public const val ENOKEY: CInt = 126
public const val EKEYEXPIRED: CInt = 127
public const val EKEYREVOKED: CInt = 128
public const val EKEYREJECTED: CInt = 129
public const val EOWNERDEAD: CInt = 130
public const val ENOTRECOVERABLE: CInt = 131
public const val ENOTSUP: CInt = 132
public const val EFTYPE: CInt = 133
public const val SIGHUP: CInt = 1
public const val SIGINT: CInt = 2
public const val SIGQUIT: CInt = 3
public const val SIGILL: CInt = 4
public const val SIGTRAP: CInt = 5
public const val SIGABRT: CInt = 6
public const val SIGIOT: CInt = SIGABRT
public const val SIGEMT: CInt = 7
public const val SIGFPE: CInt = 8
public const val SIGKILL: CInt = 9
public const val SIGBUS: CInt = 10
public const val SIGSEGV: CInt = 11
public const val SIGSYS: CInt = 12
public const val SIGPIPE: CInt = 13
public const val SIGALRM: CInt = 14
public const val SIGTERM: CInt = 15
public const val SIGURG: CInt = 16
public const val SIGSTOP: CInt = 17
public const val SIGTSTP: CInt = 18
public const val SIGCONT: CInt = 19
public const val SIGCHLD: CInt = 20
public const val SIGTTIN: CInt = 21
public const val SIGTTOU: CInt = 22
public const val SIGIO: CInt = 23
public const val SIGXCPU: CInt = 24
public const val SIGXFSZ: CInt = 25
public const val SIGVTALRM: CInt = 26
public const val SIGPROF: CInt = 27
public const val SIGWINCH: CInt = 28
public const val SIGINFO: CInt = 29
public const val SIGUSR1: CInt = 30
public const val SIGUSR2: CInt = 31
public const val SIGPWR: CInt = 32

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

public fun isblank(c: CInt): CInt = -1

public fun tolower(c: CInt): CInt = -1

public fun toupper(c: CInt): CInt = -1

public fun getStdioFile(fileno: CInt): FILE? = null

public fun clearerr(arg1: FILE?) { }

public fun fclose(arg1: FILE?): CInt = -1

public fun feof(arg1: FILE?): CInt = -1

public fun ferror(arg1: FILE?): CInt = -1

public fun fflush(arg1: FILE?): CInt = -1

public fun fgetc(arg1: FILE?): CInt = -1

public fun fgets(arg1: String?, arg2: CInt, arg3: FILE?): String? = null

public fun fopen(arg1: String?, arg2: String?): FILE? = null

public fun fprintf(arg1: FILE?, arg2: String?, vararg args: Any?): CInt = -1

public fun fputc(arg1: CInt, arg2: FILE?): CInt = -1

public fun fputs(arg1: String?, arg2: FILE?): CInt = -1

public fun fread(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: FILE?): ULong = 0uL

public fun freopen(arg1: String?, arg2: String?, arg3: FILE?): FILE? = null

public fun fscanf(arg1: FILE?, arg2: String?, vararg args: Any?): CInt = -1

public fun fseek(arg1: FILE?, arg2: CLong, arg3: CInt): CInt = -1

public fun ftell(arg1: FILE?): CLong = -1L

public fun fwrite(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: FILE?): ULong = 0uL

public fun getc(arg1: FILE?): CInt = -1

public fun getchar(): CInt = -1

public fun perror(arg1: String?) { }

public fun printf(arg1: String?, vararg args: Any?): CInt = -1

public fun putc(arg1: CInt, arg2: FILE?): CInt = -1

public fun putchar(arg1: CInt): CInt = -1

public fun puts(arg1: String?): CInt = -1

public fun remove(arg1: String?): CInt = -1

public fun rewind(arg1: FILE?) { }

public fun scanf(arg1: String?, vararg args: Any?): CInt = -1

public fun setbuf(arg1: FILE?, arg2: String?) { }

public fun setvbuf(arg1: FILE?, arg2: String?, arg3: CInt, arg4: ULong): CInt = -1

public fun sscanf(arg1: String?, arg2: String?, vararg args: Any?): CInt = -1

public fun tmpfile(): FILE? = null

public fun ungetc(arg1: CInt, arg2: FILE?): CInt = -1

public fun vfprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt = -1

public fun vprintf(arg1: String?, arg2: VaList): CInt = -1

public fun gets(arg1: String?): String? = null

public fun sprintf(arg1: String?, arg2: String?, vararg args: Any?): CInt = -1

public fun tmpnam(arg1: String?): String? = null

public fun vsprintf(arg1: String?, arg2: String?, arg3: VaList): CInt = -1

public fun rename(arg1: String?, arg2: String?): CInt = -1

public fun asiprintf(arg1: COpaquePointer?, arg2: String?, vararg args: Any?): CInt = -1

public fun fiprintf(arg1: FILE?, arg2: String?, vararg args: Any?): CInt = -1

public fun fiscanf(arg1: FILE?, arg2: String?, vararg args: Any?): CInt = -1

public fun iprintf(arg1: String?, vararg args: Any?): CInt = -1

public fun iscanf(arg1: String?, vararg args: Any?): CInt = -1

public fun siprintf(arg1: String?, arg2: String?, vararg args: Any?): CInt = -1

public fun siscanf(arg1: String?, arg2: String?, vararg args: Any?): CInt = -1

public fun sniprintf(arg1: String?, arg2: ULong, arg3: String?, vararg args: Any?): CInt = -1

public fun vasiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt = -1

public fun vfiprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt = -1

public fun vfiscanf(arg1: FILE?, arg2: String?, arg3: VaList): CInt = -1

public fun viprintf(arg1: String?, arg2: VaList): CInt = -1

public fun viscanf(arg1: String?, arg2: VaList): CInt = -1

public fun vsiprintf(arg1: String?, arg2: String?, arg3: VaList): CInt = -1

public fun vsiscanf(arg1: String?, arg2: String?, arg3: VaList): CInt = -1

public fun vsniprintf(arg1: String?, arg2: ULong, arg3: String?, arg4: VaList): CInt = -1

public fun vdiprintf(arg1: CInt, arg2: String?, arg3: VaList): CInt = -1

public fun diprintf(arg1: CInt, arg2: String?, vararg args: Any?): CInt = -1

public fun fgetpos(arg1: FILE?, arg2: FposT?): CInt = -1

public fun fsetpos(arg1: FILE?, arg2: FposT?): CInt = -1

public fun fdopen(arg1: CInt, arg2: String?): FILE? = null

public fun fileno(arg1: FILE?): CInt = -1

public fun flockfile(arg1: FILE?) { }

public fun ftrylockfile(arg1: FILE?): CInt = -1

public fun funlockfile(arg1: FILE?) { }

public fun getcUnlocked(arg1: FILE?): CInt = -1

public fun getcharUnlocked(): CInt = -1

public fun putcUnlocked(arg1: CInt, arg2: FILE?): CInt = -1

public fun putcharUnlocked(arg1: CInt): CInt = -1

public fun snprintf(arg1: String?, arg2: ULong, arg3: String?, vararg args: Any?): CInt = -1

public fun vsnprintf(arg1: String?, arg2: ULong, arg3: String?, arg4: VaList): CInt = -1

public fun getw(arg1: FILE?): CInt = -1

public fun putw(arg1: CInt, arg2: FILE?): CInt = -1

public fun tempnam(arg1: String?, arg2: String?): String? = null

public fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt = -1

public fun ftello(stream: FILE?): OffT = -1L

public fun atof(arg1: String?): Double = 0.0

public fun strtod(arg1: String?, arg2: COpaquePointer?): Double = 0.0

public fun drand48(): Double = 0.0

public fun erand48(arg1: CUShort?): Double = 0.0

public fun strtof(arg1: String?, arg2: COpaquePointer?): Float = 0.0f

public fun strtold(arg1: String?, arg2: COpaquePointer?): Double = 0.0

public fun strtodL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double = 0.0

public fun strtofL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Float = 0.0f

public fun strtoldL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double = 0.0

public fun exit(arg1: CInt): Nothing = throw UnsupportedOperationException()

public fun abort(): Nothing = throw UnsupportedOperationException()

public fun abs(arg1: CInt): CInt = -1

public fun atexit(arg1: (() -> Unit)?): CInt = -1

public fun atoi(arg1: String?): CInt = -1

public fun atol(arg1: String?): CLong = -1L

public fun itoa(arg1: CInt, arg2: String?, arg3: CInt): String? = null

public fun ltoa(arg1: CLong, arg2: String?, arg3: CInt): String? = null

public fun ultoa(arg1: CULong, arg2: String?, arg3: CInt): String? = null

public fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong, arg4: ULong, arg5: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? = null

public fun calloc(arg1: ULong, arg2: ULong): COpaquePointer? = null

public fun div(arg1: CInt, arg2: CInt): DivT = throw UnsupportedOperationException("Not implemented on this platform")

public fun free(arg1: COpaquePointer?) { }

public fun getenv(arg1: String?): String? = null

public fun labs(arg1: CLong): CLong = -1L

public fun ldiv(arg1: CLong, arg2: CLong): LdivT = throw UnsupportedOperationException("Not implemented on this platform")

public fun malloc(arg1: ULong): COpaquePointer? = null

public fun qsort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> CInt)?) { }

public fun rand(): CInt = -1

public fun realloc(arg1: COpaquePointer?, arg2: ULong): COpaquePointer? = null

public fun srand(arg1: CUInt) { }

public fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLong = -1L

public fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CULong = 0uL

public fun mblen(arg1: String?, arg2: ULong): CInt = -1

public fun mbstowcs(arg1: WcharT?, arg2: String?, arg3: ULong): ULong = 0uL

public fun wctomb(arg1: String?, arg2: WcharT): CInt = -1

public fun mbtowc(arg1: WcharT?, arg2: String?, arg3: ULong): CInt = -1

public fun wcstombs(arg1: String?, arg2: WcharT?, arg3: ULong): ULong = 0uL

public fun randR(arg1: CUInt?): CInt = -1

public fun jrand48(arg1: CUShort?): CLong = -1L

public fun lcong48(arg1: CUShort?) { }

public fun lrand48(): CLong = -1L

public fun mrand48(): CLong = -1L

public fun nrand48(arg1: CUShort?): CLong = -1L

public fun seed48(arg1: CUShort?): CUShort? = null

public fun srand48(arg1: CLong) { }

public fun putenv(arg1: String?): CInt = -1

public fun a64l(arg1: String?): CLong = -1L

public fun l64a(arg1: CLong): String? = null

public fun random(): CLong = -1L

public fun setstate(arg1: String?): String? = null

public fun initstate(arg1: CUInt, arg2: String?, arg3: ULong): String? = null

public fun srandom(arg1: CUInt) { }

public fun mkostemp(arg1: String?, arg2: CInt): CInt = -1

public fun mkostemps(arg1: String?, arg2: CInt, arg3: CInt): CInt = -1

public fun mkdtemp(arg1: String?): String? = null

public fun mkstemp(arg1: String?): CInt = -1

public fun mktemp(arg1: String?): String? = null

public fun atoll(arg1: String?): CLongLong = -1L

public fun llabs(arg1: CLongLong): CLongLong = -1L

public fun lldiv(arg1: CLongLong, arg2: CLongLong): LldivT = throw UnsupportedOperationException("Not implemented on this platform")

public fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLongLong = -1L

public fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CULongLong = 0uL

public fun alignedAlloc(arg1: ULong, arg2: ULong): COpaquePointer? = null

public fun atQuickExit(arg1: (() -> Unit)?): CInt = -1

public fun quickExit(arg1: CInt) { }

public fun setenv(arg1: String?, arg2: String?, arg3: CInt): CInt = -1

public fun unsetenv(arg1: String?): CInt = -1

public fun humanizeNumber(arg1: String?, arg2: ULong, arg3: Long, arg4: String?, arg5: CInt, arg6: CInt): CInt = -1

public fun dehumanizeNumber(arg1: String?, arg2: Long?): CInt = -1

public fun getenvR(arg1: String?, arg2: String?, arg3: ULong): CInt = -1

public fun heapsort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> CInt)?): CInt = -1

public fun mergesort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> CInt)?): CInt = -1

public fun radixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUInt): CInt = -1

public fun sradixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUInt): CInt = -1

public fun getprogname(): String? = null

public fun setprogname(arg1: String?) { }

public fun qabs(arg1: QuadT): QuadT = throw UnsupportedOperationException("Not implemented on this platform")

public fun strtoq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): QuadT = throw UnsupportedOperationException("Not implemented on this platform")

public fun strtouq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): UQuadT = throw UnsupportedOperationException("Not implemented on this platform")

public fun strsuftoll(arg1: String?, arg2: String?, arg3: CLongLong, arg4: CLongLong): CLongLong = -1L

public fun strsuftollx(arg1: String?, arg2: String?, arg3: CLongLong, arg4: CLongLong, arg5: String?, arg6: ULong): CLongLong = -1L

public fun l64aR(arg1: CLong, arg2: String?, arg3: CInt): CInt = -1

public fun qdiv(arg1: QuadT, arg2: QuadT): QdivT = throw UnsupportedOperationException("Not implemented on this platform")

public fun strtolL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLong = -1L

public fun strtoulL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CULong = 0uL

public fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLongLong = -1L

public fun strtoullL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CULongLong = 0uL

public fun strtoqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): QuadT = throw UnsupportedOperationException("Not implemented on this platform")

public fun strtouqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): UQuadT = throw UnsupportedOperationException("Not implemented on this platform")

public fun mbCurMaxL(arg1: LocaleT): ULong = 0uL

public fun mblenL(arg1: String?, arg2: ULong, arg3: LocaleT): CInt = -1

public fun mbstowcsL(arg1: WcharT?, arg2: String?, arg3: ULong, arg4: LocaleT): ULong = 0uL

public fun wctombL(arg1: String?, arg2: WcharT, arg3: LocaleT): CInt = -1

public fun mbtowcL(arg1: WcharT?, arg2: String?, arg3: ULong, arg4: LocaleT): CInt = -1

public fun wcstombsL(arg1: String?, arg2: WcharT?, arg3: ULong, arg4: LocaleT): ULong = 0uL

public fun memchr(arg1: COpaquePointer?, arg2: CInt, arg3: ULong): COpaquePointer? = null

public fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): CInt = -1

public fun memcpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): COpaquePointer? = null

public fun memmove(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): COpaquePointer? = null

public fun memset(arg1: COpaquePointer?, arg2: CInt, arg3: ULong): COpaquePointer? = null

public fun strcat(arg1: String?, arg2: String?): String? = null

public fun strchr(arg1: String?, arg2: CInt): String? = null

public fun strcmp(arg1: String?, arg2: String?): CInt = -1

public fun strcoll(arg1: String?, arg2: String?): CInt = -1

public fun strcpy(arg1: String?, arg2: String?): String? = null

public fun strcspn(arg1: String?, arg2: String?): ULong = 0uL

public fun strerror(arg1: CInt): String? = null

public fun strlen(arg1: String?): ULong = 0uL

public fun strncat(arg1: String?, arg2: String?, arg3: ULong): String? = null

public fun strncmp(arg1: String?, arg2: String?, arg3: ULong): CInt = -1

public fun strncpy(arg1: String?, arg2: String?, arg3: ULong): String? = null

public fun strpbrk(arg1: String?, arg2: String?): String? = null

public fun strrchr(arg1: String?, arg2: CInt): String? = null

public fun strspn(arg1: String?, arg2: String?): ULong = 0uL

public fun strstr(arg1: String?, arg2: String?): String? = null

public fun strtok(arg1: String?, arg2: String?): String? = null

public fun strtokR(arg1: String?, arg2: String?, arg3: COpaquePointer?): String? = null

public fun strerrorR(arg1: CInt, arg2: String?, arg3: ULong): CInt = -1

public fun strxfrm(arg1: String?, arg2: String?, arg3: ULong): ULong = 0uL

public fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: CInt, arg4: ULong): COpaquePointer? = null

public fun strdup(arg1: String?): String? = null

public fun stpcpy(arg1: String?, arg2: String?): String? = null

public fun stpncpy(arg1: String?, arg2: String?, arg3: ULong): String? = null

public fun strnlen(arg1: String?, arg2: ULong): ULong = 0uL

public fun memmem(arg1: COpaquePointer?, arg2: ULong, arg3: COpaquePointer?, arg4: ULong): COpaquePointer? = null

public fun strcasestr(arg1: String?, arg2: String?): String? = null

public fun strlcat(arg1: String?, arg2: String?, arg3: ULong): ULong = 0uL

public fun strlcpy(arg1: String?, arg2: String?, arg3: ULong): ULong = 0uL

public fun strsep(arg1: COpaquePointer?, arg2: String?): String? = null

public fun stresep(arg1: COpaquePointer?, arg2: String?, arg3: CInt): String? = null

public fun strndup(arg1: String?, arg2: ULong): String? = null

public fun memrchr(arg1: COpaquePointer?, arg2: CInt, arg3: ULong): COpaquePointer? = null

public fun explicitMemset(arg1: COpaquePointer?, arg2: CInt, arg3: ULong): COpaquePointer? = null

public fun consttimeMemequal(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): CInt = -1

public fun strcollL(arg1: String?, arg2: String?, arg3: LocaleT): CInt = -1

public fun strxfrmL(arg1: String?, arg2: String?, arg3: ULong, arg4: LocaleT): ULong = 0uL

public fun strerrorL(arg1: CInt, arg2: LocaleT): String? = null

public fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): CInt = -1

public fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong) { }

public fun bzero(arg1: COpaquePointer?, arg2: ULong) { }

public fun ffs(arg1: CInt): CInt = -1

public fun popcount(arg1: CUInt): CUInt = 0u

public fun popcountl(arg1: CULong): CUInt = 0u

public fun popcountll(arg1: CULongLong): CUInt = 0u

public fun popcount32(arg1: UInt): CUInt = 0u

public fun popcount64(arg1: ULong): CUInt = 0u

public fun rindex(arg1: String?, arg2: CInt): String? = null

public fun strcasecmp(arg1: String?, arg2: String?): CInt = -1

public fun strncasecmp(arg1: String?, arg2: String?, arg3: ULong): CInt = -1

public fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT = throw UnsupportedOperationException("Not implemented on this platform")

public fun raise(arg1: CInt): CInt = -1

public fun asctime(arg1: Tm?): String? = null

public fun clock(): ClockT = 0u

public fun ctime(arg1: TimeT?): String? = null

public fun difftime(arg1: TimeT, arg2: TimeT): Double = 0.0

public fun gmtime(arg1: TimeT?): Tm? = null

public fun localtime(arg1: TimeT?): Tm? = null

public fun time(arg1: TimeT?): TimeT = -1L

public fun mktime(arg1: Tm?): TimeT = -1L

public fun strftime(arg1: String?, arg2: ULong, arg3: String?, arg4: Tm?): ULong = 0uL

public fun utime(arg1: String?, arg2: TimeT?): CInt = -1

public fun asctimeR(arg1: Tm?, arg2: String?): String? = null

public fun ctimeR(arg1: TimeT?, arg2: String?): String? = null

public fun gmtimeR(arg1: TimeT?, arg2: Tm?): Tm? = null

public fun localtimeR(arg1: TimeT?, arg2: Tm?): Tm? = null

public fun stat(arg1: String?, arg2: Stat?): CInt = -1

public fun lstat(arg1: String?, arg2: Stat?): CInt = -1

public fun fstat(arg1: CInt, arg2: Stat?): CInt = -1

public fun chmod(arg1: String?, arg2: ModeT): CInt = -1

public fun mkdir(arg1: String?, arg2: ModeT): CInt = -1

public fun open(arg1: String?, arg2: CInt, vararg args: Any?): CInt = -1

public fun creat(arg1: String?, arg2: CInt): CInt = -1

public fun close(arg1: CInt): CInt = -1

public fun read(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt = -1

public fun write(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt = -1

public fun unlink(arg1: String?): CInt = -1

public fun tell(arg1: CInt): CLong = -1L

public fun dup(arg1: CInt): CInt = -1

public fun dup2(arg1: CInt, arg2: CInt): CInt = -1

public fun access(arg1: String?, arg2: CInt): CInt = -1

public fun rmdir(arg1: String?): CInt = -1

public fun chdir(arg1: String?): CInt = -1

public fun getwd(arg1: String?): String? = null

public fun getcwd(arg1: String?, arg2: ULong): String? = null

public fun getopt(arg1: CInt, arg2: COpaquePointer?, arg3: String?): CInt = -1

public fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): CInt = -1

public fun fcntl(arg1: CInt, arg2: CInt, vararg args: Any?): CInt = -1

public fun getpid(): PidT = -1

public fun sleep(arg1: CUInt): CUInt = 0u

public fun usleep(arg1: UsecondsT): CInt = -1

public fun localeconv(): Lconv? = null

public fun setlocale(arg1: CInt, arg2: String?): String? = null

public fun duplocale(arg1: LocaleT): LocaleT = 0uL

public fun freelocale(arg1: LocaleT) { }

public fun localeconvL(arg1: LocaleT): Lconv? = null

public fun newlocale(arg1: CInt, arg2: String?, arg3: LocaleT): LocaleT = 0uL

public fun nlLanginfo(item: NlItem): String? = null

public fun nlLanginfoL(item: NlItem, locale: LocaleT): String? = null

public fun memalign(align: ULong, size: ULong): COpaquePointer? = null

public fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT = -1L
