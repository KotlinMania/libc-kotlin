// port-lint: source solid/solid_mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

// Interface to the [SOLID] C library
//
// [SOLID]: https://solid.kmckk.com/

public fun interface AtexitArg1Callback {
    public operator fun invoke()
}

public fun interface BsearchArg5Callback {
    public operator fun invoke(arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias UintptrT = ULong

public typealias IntptrT = Long

public typealias PtrdiffT = Long

public typealias SizeT = io.github.kotlinmania.libc.UintptrT

public typealias SsizeT = IntptrT

public typealias ClockT = CUint

public typealias TimeT = Long

public typealias ClockidT = CInt

public typealias TimerT = CInt

public typealias SusecondsT = CInt

public typealias UsecondsT = CUint

public typealias SighandlerT = SizeT

// sys/ansi.h
public typealias CaddrT = COpaquePointer?

public typealias GidT = UInt

public typealias InAddrT = UInt

public typealias InPortT = UShort

public typealias ModeT = UInt

public typealias OffT = Long

public typealias PidT = Int

public typealias SaFamilyT = UByte

public typealias SocklenT = CUint

public typealias UidT = UInt

public typealias FsblkcntT = ULong

public typealias FsfilcntT = ULong

// locale.h
public typealias LocaleT = ULong

// nlTypes.h
public typealias NlItem = CLong

// sys/types.h
public typealias VaList = COpaquePointer?

public typealias UInt8T = UByte

public typealias UInt16T = UShort

public typealias UInt32T = UInt

public typealias UInt64T = ULong

public typealias UChar = CUchar

public typealias UShort = CUshort

public typealias UInt = CUint

public typealias ULong = CUlong

public typealias Unchar = CUchar

public typealias Ushort = CUshort

public typealias Uint = CUint

public typealias Ulong = CUlong

public typealias UQuadT = ULong

public typealias QuadT = Long

public typealias QaddrT = Long?

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

public typealias CpuidT = CUlong

public typealias PsetidT = CInt

// stat.h
public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: CShort,
    public var stNlink: CShort,
    public var stUid: CShort,
    public var stGid: CShort,
    public var stRdev: DevT,
    public var stSize: OffT,
    public var stAtime: TimeT,
    public var stMtime: TimeT,
    public var stCtime: TimeT,
    public var stBlksize: BlksizeT,
)

// time.h
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
    public var tmGmtoff: CLong,
    public var tmZone: COpaquePointer?,
)

// stdlib.h
public open class QdivT(public var quot: QuadT, public var rem: QuadT)

public open class LldivT(public var quot: CLonglong, public var rem: CLonglong)

public open class DivT(public var quot: CInt, public var rem: CInt)

public open class LdivT(public var quot: CLong, public var rem: CLong)

// locale.h
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
    public var intNCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intNSepBySpace: CChar,
    public var intPSignPosn: CChar,
    public var intNSignPosn: CChar,
)

public open class Iovec(public var iovBase: COpaquePointer?, public var iovLen: SizeT)

public open class Timeval(public var tvSec: CLong, public var tvUsec: CLong)

public val INT_MIN: CInt = -2147483648

public val INT_MAX: CInt = 2147483647

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val RAND_MAX: CInt = 0x7fffffff

public val EOF: CInt = -1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val IOFBF: CInt = 0

public val IONBF: CInt = 2

public val IOLBF: CInt = 1

public val BUFSIZ: CUint = 1024u

public val FOPEN_MAX: CUint = 20u

public val FILENAME_MAX: CUint = 1024u

public val O_RDONLY: CInt = 1

public val O_WRONLY: CInt = 2

public val O_RDWR: CInt = 4

public val O_APPEND: CInt = 8

public val O_CREAT: CInt = 0x10

public val O_EXCL: CInt = 0x400

public val O_TEXT: CInt = 0x100

public val O_BINARY: CInt = 0x200

public val O_TRUNC: CInt = 0x20

public val S_IEXEC: CShort = 64

public val S_IWRITE: CShort = 128

public val S_IREAD: CShort = 256

public val S_IFCHR: CShort = 8192

public val S_IFDIR: CShort = 16384

public val S_IFMT: CShort = 57344

public val S_IFIFO: CShort = 4096

public val S_IFBLK: CShort = 24576

public val S_IFREG: CShort = 32768

public val LC_ALL: CInt = 0

public val LC_COLLATE: CInt = 1

public val LC_CTYPE: CInt = 2

public val LC_MONETARY: CInt = 3

public val LC_NUMERIC: CInt = 4

public val LC_TIME: CInt = 5

public val LC_MESSAGES: CInt = 6

public val LC_LAST: CInt = 7

public val EPERM: CInt = 1

public val ENOENT: CInt = 2

public val ESRCH: CInt = 3

public val EINTR: CInt = 4

public val EIO: CInt = 5

public val ENXIO: CInt = 6

public val E2BIG: CInt = 7

public val ENOEXEC: CInt = 8

public val EBADF: CInt = 9

public val ECHILD: CInt = 10

public val EAGAIN: CInt = 11

public val ENOMEM: CInt = 12

public val EACCES: CInt = 13

public val EFAULT: CInt = 14

public val ENOTBLK: CInt = 15

public val EBUSY: CInt = 16

public val EEXIST: CInt = 17

public val EXDEV: CInt = 18

public val ENODEV: CInt = 19

public val ENOTDIR: CInt = 20

public val EISDIR: CInt = 21

public val EINVAL: CInt = 22

public val ENFILE: CInt = 23

public val EMFILE: CInt = 24

public val ENOTTY: CInt = 25

public val ETXTBSY: CInt = 26

public val EFBIG: CInt = 27

public val ENOSPC: CInt = 28

public val ESPIPE: CInt = 29

public val EROFS: CInt = 30

public val EMLINK: CInt = 31

public val EPIPE: CInt = 32

public val EDOM: CInt = 33

public val ERANGE: CInt = 34

public val EDEADLK: CInt = 35

public val ENAMETOOLONG: CInt = 36

public val ENOLCK: CInt = 37

public val ENOSYS: CInt = 38

public val ENOTEMPTY: CInt = 39

public val ELOOP: CInt = 40

public val EWOULDBLOCK: CInt = EAGAIN

public val ENOMSG: CInt = 42

public val EIDRM: CInt = 43

public val ECHRNG: CInt = 44

public val EL2NSYNC: CInt = 45

public val EL3HLT: CInt = 46

public val EL3RST: CInt = 47

public val ELNRNG: CInt = 48

public val EUNATCH: CInt = 49

public val ENOCSI: CInt = 50

public val EL2HLT: CInt = 51

public val EBADE: CInt = 52

public val EBADR: CInt = 53

public val EXFULL: CInt = 54

public val ENOANO: CInt = 55

public val EBADRQC: CInt = 56

public val EBADSLT: CInt = 57

public val EDEADLOCK: CInt = EDEADLK

public val EBFONT: CInt = 59

public val ENOSTR: CInt = 60

public val ENODATA: CInt = 61

public val ETIME: CInt = 62

public val ENOSR: CInt = 63

public val ENONET: CInt = 64

public val ENOPKG: CInt = 65

public val EREMOTE: CInt = 66

public val ENOLINK: CInt = 67

public val EADV: CInt = 68

public val ESRMNT: CInt = 69

public val ECOMM: CInt = 70

public val EPROTO: CInt = 71

public val EMULTIHOP: CInt = 72

public val EDOTDOT: CInt = 73

public val EBADMSG: CInt = 74

public val EOVERFLOW: CInt = 75

public val ENOTUNIQ: CInt = 76

public val EBADFD: CInt = 77

public val EREMCHG: CInt = 78

public val ELIBACC: CInt = 79

public val ELIBBAD: CInt = 80

public val ELIBSCN: CInt = 81

public val ELIBMAX: CInt = 82

public val ELIBEXEC: CInt = 83

public val EILSEQ: CInt = 84

public val ERESTART: CInt = 85

public val ESTRPIPE: CInt = 86

public val EUSERS: CInt = 87

public val ENOTSOCK: CInt = 88

public val EDESTADDRREQ: CInt = 89

public val EMSGSIZE: CInt = 90

public val EPROTOTYPE: CInt = 91

public val ENOPROTOOPT: CInt = 92

public val EPROTONOSUPPORT: CInt = 93

public val ESOCKTNOSUPPORT: CInt = 94

public val EOPNOTSUPP: CInt = 95

public val EPFNOSUPPORT: CInt = 96

public val EAFNOSUPPORT: CInt = 97

public val EADDRINUSE: CInt = 98

public val EADDRNOTAVAIL: CInt = 99

public val ENETDOWN: CInt = 100

public val ENETUNREACH: CInt = 101

public val ENETRESET: CInt = 102

public val ECONNABORTED: CInt = 103

public val ECONNRESET: CInt = 104

public val ENOBUFS: CInt = 105

public val EISCONN: CInt = 106

public val ENOTCONN: CInt = 107

public val ESHUTDOWN: CInt = 108

public val ETOOMANYREFS: CInt = 109

public val ETIMEDOUT: CInt = 110

public val ECONNREFUSED: CInt = 111

public val EHOSTDOWN: CInt = 112

public val EHOSTUNREACH: CInt = 113

public val EALREADY: CInt = 114

public val EINPROGRESS: CInt = 115

public val ESTALE: CInt = 116

public val EUCLEAN: CInt = 117

public val ENOTNAM: CInt = 118

public val ENAVAIL: CInt = 119

public val EISNAM: CInt = 120

public val EREMOTEIO: CInt = 121

public val EDQUOT: CInt = 122

public val ENOMEDIUM: CInt = 123

public val EMEDIUMTYPE: CInt = 124

public val ECANCELED: CInt = 125

public val ENOKEY: CInt = 126

public val EKEYEXPIRED: CInt = 127

public val EKEYREVOKED: CInt = 128

public val EKEYREJECTED: CInt = 129

public val EOWNERDEAD: CInt = 130

public val ENOTRECOVERABLE: CInt = 131

public val ENOTSUP: CInt = 132

public val EFTYPE: CInt = 133

// signal codes
public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGTRAP: CInt = 5

public val SIGABRT: CInt = 6

public val SIGIOT: CInt = SIGABRT

public val SIGEMT: CInt = 7

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGBUS: CInt = 10

public val SIGSEGV: CInt = 11

public val SIGSYS: CInt = 12

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val SIGURG: CInt = 16

public val SIGSTOP: CInt = 17

public val SIGTSTP: CInt = 18

public val SIGCONT: CInt = 19

public val SIGCHLD: CInt = 20

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGIO: CInt = 23

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGWINCH: CInt = 28

public val SIGINFO: CInt = 29

public val SIGUSR1: CInt = 30

public val SIGUSR2: CInt = 31

public val SIGPWR: CInt = 32

public sealed class FILE {
}

public sealed class FposT {
}

// ctype.h
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

// stdio.h
public expect fun getStdioFile(fileno: CInt): FILE?

public expect fun clearerr(arg1: FILE?)

public expect fun fclose(arg1: FILE?): CInt

public expect fun feof(arg1: FILE?): CInt

public expect fun ferror(arg1: FILE?): CInt

public expect fun fflush(arg1: FILE?): CInt

public expect fun fgetc(arg1: FILE?): CInt

public expect fun fgets(arg1: COpaquePointer?, arg2: CInt, arg3: FILE?): COpaquePointer?

public expect fun fopen(arg1: String?, arg2: String?): FILE?

public expect fun fprintf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt

public expect fun fputc(arg1: CInt, arg2: FILE?): CInt

public expect fun fputs(arg1: String?, arg2: FILE?): CInt

public expect fun fread(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT

public expect fun freopen(arg1: String?, arg2: String?, arg3: FILE?): FILE?

public expect fun fscanf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt

public expect fun fseek(arg1: FILE?, arg2: CLong, arg3: CInt): CInt

public expect fun ftell(arg1: FILE?): CLong

public expect fun fwrite(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT

public expect fun getc(arg1: FILE?): CInt

public expect fun getchar(): CInt

public expect fun perror(arg1: String?)

public expect fun printf(arg1: String?, vararg variadicArgs: Long): CInt

public expect fun putc(arg1: CInt, arg2: FILE?): CInt

public expect fun putchar(arg1: CInt): CInt

public expect fun puts(arg1: String?): CInt

public expect fun remove(arg1: String?): CInt

public expect fun rewind(arg1: FILE?)

public expect fun scanf(arg1: String?, vararg variadicArgs: Long): CInt

public expect fun setbuf(arg1: FILE?, arg2: COpaquePointer?)

public expect fun setvbuf(arg1: FILE?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): CInt

public expect fun sscanf(arg1: String?, arg2: String?, vararg variadicArgs: Long): CInt

public expect fun tmpfile(): FILE?

public expect fun ungetc(arg1: CInt, arg2: FILE?): CInt

public expect fun vfprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt

public expect fun vprintf(arg1: String?, arg2: VaList): CInt

public expect fun gets(arg1: COpaquePointer?): COpaquePointer?

public expect fun sprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt

public expect fun tmpnam(arg1: String?): COpaquePointer?

public expect fun vsprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt

public expect fun rename(arg1: String?, arg2: String?): CInt

public expect fun asiprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt

public expect fun fiprintf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt

public expect fun fiscanf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt

public expect fun iprintf(arg1: String?, vararg variadicArgs: Long): CInt

public expect fun iscanf(arg1: String?, vararg variadicArgs: Long): CInt

public expect fun siprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt

public expect fun siscanf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt

public expect fun sniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, vararg variadicArgs: Long): CInt

public expect fun vasiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt

public expect fun vfiprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt

public expect fun vfiscanf(arg1: FILE?, arg2: String?, arg3: VaList): CInt

public expect fun viprintf(arg1: String?, arg2: VaList): CInt

public expect fun viscanf(arg1: String?, arg2: VaList): CInt

public expect fun vsiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt

public expect fun vsiscanf(arg1: String?, arg2: String?, arg3: VaList): CInt

public expect fun vsniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt

public expect fun vdiprintf(arg1: CInt, arg2: String?, arg3: VaList): CInt

public expect fun diprintf(arg1: CInt, arg2: String?, vararg variadicArgs: Long): CInt

public expect fun fgetpos(arg1: FILE?, arg2: FposT?): CInt

public expect fun fsetpos(arg1: FILE?, arg2: FposT?): CInt

public expect fun fdopen(arg1: CInt, arg2: String?): FILE?

public expect fun fileno(arg1: FILE?): CInt

public expect fun flockfile(arg1: FILE?)

public expect fun ftrylockfile(arg1: FILE?): CInt

public expect fun funlockfile(arg1: FILE?)

public expect fun getcUnlocked(arg1: FILE?): CInt

public expect fun getcharUnlocked(): CInt

public expect fun putcUnlocked(arg1: CInt, arg2: FILE?): CInt

public expect fun putcharUnlocked(arg1: CInt): CInt

public expect fun snprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, vararg variadicArgs: Long): CInt

public expect fun vsnprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt

public expect fun getw(arg1: FILE?): CInt

public expect fun putw(arg1: CInt, arg2: FILE?): CInt

public expect fun tempnam(arg1: String?, arg2: String?): COpaquePointer?

public expect fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: FILE?): OffT

// stdlib.h
public expect fun atof(arg1: String?): Double

public expect fun strtod(arg1: String?, arg2: COpaquePointer?): Double

public expect fun drand48(): Double

public expect fun erand48(arg1: CUshort?): Double

public expect fun strtof(arg1: String?, arg2: COpaquePointer?): Float

public expect fun strtold(arg1: String?, arg2: COpaquePointer?): Double

public expect fun strtodL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double

public expect fun strtofL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Float

public expect fun strtoldL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double

public expect fun exit(arg1: CInt): Nothing

public expect fun abort(): Nothing

public expect fun abs(arg1: CInt): CInt

public expect fun atexit(arg1: AtexitArg1Callback?): CInt

public expect fun atoi(arg1: String?): CInt

public expect fun atol(arg1: String?): CLong

public expect fun itoa(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): COpaquePointer?

public expect fun ltoa(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer?

public expect fun ultoa(arg1: CUlong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer?

public expect fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: SizeT, arg5: BsearchArg5Callback?): COpaquePointer?

public expect fun calloc(arg1: SizeT, arg2: SizeT): COpaquePointer?

public expect fun div(arg1: CInt, arg2: CInt): DivT

public expect fun free(arg1: COpaquePointer?)

public expect fun getenv(arg1: String?): COpaquePointer?

public expect fun labs(arg1: CLong): CLong

public expect fun ldiv(arg1: CLong, arg2: CLong): LdivT

public expect fun malloc(arg1: SizeT): COpaquePointer?

public expect fun qsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?)

public expect fun rand(): CInt

public expect fun realloc(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer?

public expect fun srand(arg1: CUint)

public expect fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLong

public expect fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlong

public expect fun mblen(arg1: String?, arg2: SizeT): CInt

public expect fun mbstowcs(arg1: WcharT?, arg2: String?, arg3: SizeT): SizeT

public expect fun wctomb(arg1: COpaquePointer?, arg2: WcharT): CInt

public expect fun mbtowc(arg1: WcharT?, arg2: String?, arg3: SizeT): CInt

public expect fun wcstombs(arg1: COpaquePointer?, arg2: WcharT?, arg3: SizeT): SizeT

public expect fun randR(arg1: CUint?): CInt

public expect fun jrand48(arg1: CUshort?): CLong

public expect fun lcong48(arg1: CUshort?)

public expect fun lrand48(): CLong

public expect fun mrand48(): CLong

public expect fun nrand48(arg1: CUshort?): CLong

public expect fun seed48(arg1: CUshort?): CUshort?

public expect fun srand48(arg1: CLong)

public expect fun putenv(arg1: COpaquePointer?): CInt

public expect fun a64l(arg1: String?): CLong

public expect fun l64a(arg1: CLong): COpaquePointer?

public expect fun random(): CLong

public expect fun setstate(arg1: COpaquePointer?): COpaquePointer?

public expect fun initstate(arg1: CUint, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer?

public expect fun srandom(arg1: CUint)

public expect fun mkostemp(arg1: COpaquePointer?, arg2: CInt): CInt

public expect fun mkostemps(arg1: COpaquePointer?, arg2: CInt, arg3: CInt): CInt

public expect fun mkdtemp(arg1: COpaquePointer?): COpaquePointer?

public expect fun mkstemp(arg1: COpaquePointer?): CInt

public expect fun mktemp(arg1: COpaquePointer?): COpaquePointer?

public expect fun atoll(arg1: String?): CLonglong

public expect fun llabs(arg1: CLonglong): CLonglong

public expect fun lldiv(arg1: CLonglong, arg2: CLonglong): LldivT

public expect fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLonglong

public expect fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlonglong

public expect fun alignedAlloc(arg1: SizeT, arg2: SizeT): COpaquePointer?

public expect fun atQuickExit(arg1: AtexitArg1Callback?): CInt

public expect fun quickExit(arg1: CInt)

public expect fun setenv(arg1: String?, arg2: String?, arg3: CInt): CInt

public expect fun unsetenv(arg1: String?): CInt

public expect fun humanizeNumber(arg1: COpaquePointer?, arg2: SizeT, arg3: Long, arg4: String?, arg5: CInt, arg6: CInt): CInt

public expect fun dehumanizeNumber(arg1: String?, arg2: Long?): CInt

public expect fun getenvR(arg1: String?, arg2: COpaquePointer?, arg3: SizeT): CInt

public expect fun heapsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt

public expect fun mergesort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt

public expect fun radixsort(arg1: COpaquePointer?, arg2: CInt, arg3: CUchar?, arg4: CUint): CInt

public expect fun sradixsort(arg1: COpaquePointer?, arg2: CInt, arg3: CUchar?, arg4: CUint): CInt

public expect fun getprogname(): COpaquePointer?

public expect fun setprogname(arg1: String?)

public expect fun qabs(arg1: QuadT): QuadT

public expect fun strtoq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): QuadT

public expect fun strtouq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): UQuadT

public expect fun strsuftoll(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong): CLonglong

public expect fun strsuftollx(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong, arg5: COpaquePointer?, arg6: SizeT): CLonglong

public expect fun l64aR(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): CInt

public expect fun qdiv(arg1: QuadT, arg2: QuadT): QdivT

public expect fun strtolL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLong

public expect fun strtoulL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlong

public expect fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLonglong

public expect fun strtoullL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlonglong

public expect fun strtoqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): QuadT

public expect fun strtouqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): UQuadT

public expect fun mbCurMaxL(arg1: LocaleT): SizeT

public expect fun mblenL(arg1: String?, arg2: SizeT, arg3: LocaleT): CInt

public expect fun mbstowcsL(arg1: WcharT?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT

public expect fun wctombL(arg1: COpaquePointer?, arg2: WcharT, arg3: LocaleT): CInt

public expect fun mbtowcL(arg1: WcharT?, arg2: String?, arg3: SizeT, arg4: LocaleT): CInt

public expect fun wcstombsL(arg1: COpaquePointer?, arg2: WcharT?, arg3: SizeT, arg4: LocaleT): SizeT

// string.h
public expect fun memchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer?

public expect fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt

public expect fun memcpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer?

public expect fun memmove(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer?

public expect fun memset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer?

public expect fun strcat(arg1: COpaquePointer?, arg2: String?): COpaquePointer?

public expect fun strchr(arg1: String?, arg2: CInt): COpaquePointer?

public expect fun strcmp(arg1: String?, arg2: String?): CInt

public expect fun strcoll(arg1: String?, arg2: String?): CInt

public expect fun strcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer?

public expect fun strcspn(arg1: String?, arg2: String?): SizeT

public expect fun strerror(arg1: CInt): COpaquePointer?

public expect fun strlen(arg1: String?): SizeT

public expect fun strncat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer?

public expect fun strncmp(arg1: String?, arg2: String?, arg3: SizeT): CInt

public expect fun strncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer?

public expect fun strpbrk(arg1: String?, arg2: String?): COpaquePointer?

public expect fun strrchr(arg1: String?, arg2: CInt): COpaquePointer?

public expect fun strspn(arg1: String?, arg2: String?): SizeT

public expect fun strstr(arg1: String?, arg2: String?): COpaquePointer?

public expect fun strtok(arg1: COpaquePointer?, arg2: String?): COpaquePointer?

public expect fun strtokR(arg1: COpaquePointer?, arg2: String?, arg3: COpaquePointer?): COpaquePointer?

public expect fun strerrorR(arg1: CInt, arg2: COpaquePointer?, arg3: SizeT): CInt

public expect fun strxfrm(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT

public expect fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): COpaquePointer?

public expect fun strdup(arg1: String?): COpaquePointer?

public expect fun stpcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer?

public expect fun stpncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer?

public expect fun strnlen(arg1: String?, arg2: SizeT): SizeT

public expect fun memmem(arg1: COpaquePointer?, arg2: SizeT, arg3: COpaquePointer?, arg4: SizeT): COpaquePointer?

public expect fun strcasestr(arg1: String?, arg2: String?): COpaquePointer?

public expect fun strlcat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT

public expect fun strlcpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT

public expect fun strsep(arg1: COpaquePointer?, arg2: String?): COpaquePointer?

public expect fun stresep(arg1: COpaquePointer?, arg2: String?, arg3: CInt): COpaquePointer?

public expect fun strndup(arg1: String?, arg2: SizeT): COpaquePointer?

public expect fun memrchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer?

public expect fun explicitMemset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer?

public expect fun consttimeMemequal(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt

public expect fun strcollL(arg1: String?, arg2: String?, arg3: LocaleT): CInt

public expect fun strxfrmL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT

public expect fun strerrorL(arg1: CInt, arg2: LocaleT): COpaquePointer?

// strings.h
public expect fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt

public expect fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT)

public expect fun bzero(arg1: COpaquePointer?, arg2: SizeT)

public expect fun ffs(arg1: CInt): CInt

public expect fun popcount(arg1: CUint): CUint

public expect fun popcountl(arg1: CUlong): CUint

public expect fun popcountll(arg1: CUlonglong): CUint

public expect fun popcount32(arg1: UInt): CUint

public expect fun popcount64(arg1: ULong): CUint

public expect fun rindex(arg1: String?, arg2: CInt): COpaquePointer?

public expect fun strcasecmp(arg1: String?, arg2: String?): CInt

public expect fun strncasecmp(arg1: String?, arg2: String?, arg3: SizeT): CInt

// signal.h
public expect fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT

public expect fun raise(arg1: CInt): CInt

// time.h
public expect fun asctime(arg1: Tm?): COpaquePointer?

public expect fun clock(): ClockT

public expect fun ctime(arg1: Long?): COpaquePointer?

public expect fun difftime(arg1: TimeT, arg2: TimeT): Double

public expect fun gmtime(arg1: Long?): Tm?

public expect fun localtime(arg1: Long?): Tm?

public expect fun time(arg1: Long?): TimeT

public expect fun mktime(arg1: Tm?): TimeT

public expect fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: Tm?): SizeT

public expect fun utime(arg1: String?, arg2: Long?): CInt

public expect fun asctimeR(arg1: Tm?, arg2: COpaquePointer?): COpaquePointer?

public expect fun ctimeR(arg1: Long?, arg2: COpaquePointer?): COpaquePointer?

public expect fun gmtimeR(arg1: Long?, arg2: Tm?): Tm?

public expect fun localtimeR(arg1: Long?, arg2: Tm?): Tm?

// sys/stat.h
public expect fun stat(arg1: String?, arg2: Stat?): CInt

public expect fun lstat(arg1: String?, arg2: Stat?): CInt

public expect fun fstat(arg1: CInt, arg2: Stat?): CInt

public expect fun chmod(arg1: String?, arg2: ModeT): CInt

public expect fun mkdir(arg1: String?, arg2: ModeT): CInt

// fcntl.h
public expect fun open(arg1: String?, arg2: CInt, vararg variadicArgs: Long): CInt

public expect fun creat(arg1: String?, arg2: CInt): CInt

public expect fun close(arg1: CInt): CInt

public expect fun read(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt

public expect fun write(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt

public expect fun unlink(arg1: String?): CInt

public expect fun tell(arg1: CInt): CLong

public expect fun dup(arg1: CInt): CInt

public expect fun dup2(arg1: CInt, arg2: CInt): CInt

public expect fun access(arg1: String?, arg2: CInt): CInt

public expect fun rmdir(arg1: String?): CInt

public expect fun chdir(arg1: String?): CInt

public expect fun getwd(arg1: COpaquePointer?): COpaquePointer?

public expect fun getcwd(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer?

public expect var OPTARG: COpaquePointer?

public expect var OPTERR: CInt

public expect var OPTIND: CInt

public expect var OPTOPT: CInt

public expect var OPTRESET: CInt

public expect fun getopt(arg1: CInt, arg2: COpaquePointer?, arg3: String?): CInt

public expect var SUBOPTARG: COpaquePointer?

public expect fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): CInt

public expect fun fcntl(arg1: CInt, arg2: CInt, vararg variadicArgs: Long): CInt

public expect fun getpid(): PidT

public expect fun sleep(arg1: CUint): CUint

public expect fun usleep(arg1: UsecondsT): CInt

// locale.h
public expect fun localeconv(): Lconv?

public expect fun setlocale(arg1: CInt, arg2: String?): COpaquePointer?

public expect fun duplocale(arg1: LocaleT): LocaleT

public expect fun freelocale(arg1: LocaleT)

public expect fun localeconvL(arg1: LocaleT): Lconv?

public expect fun newlocale(arg1: CInt, arg2: String?, arg3: LocaleT): LocaleT

// langinfo.h
public expect fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer?

public expect fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: LocaleT): COpaquePointer?

// malloc.h
public expect fun memalign(align: SizeT, size: SizeT): COpaquePointer?

// sys/types.h
public expect fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT
