package io.github.kotlinmania.libc

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

public typealias SizeT = UintptrT

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

// ctype.h
public fun isalnum(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isalnum", -1, longArrayOf(c.toLong())).toInt()
}

public fun isalpha(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isalpha", -1, longArrayOf(c.toLong())).toInt()
}

public fun iscntrl(c: CInt): CInt {
    return LibcDynamicFfi.invoke("iscntrl", -1, longArrayOf(c.toLong())).toInt()
}

public fun isdigit(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isdigit", -1, longArrayOf(c.toLong())).toInt()
}

public fun isgraph(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isgraph", -1, longArrayOf(c.toLong())).toInt()
}

public fun islower(c: CInt): CInt {
    return LibcDynamicFfi.invoke("islower", -1, longArrayOf(c.toLong())).toInt()
}

public fun isprint(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isprint", -1, longArrayOf(c.toLong())).toInt()
}

public fun ispunct(c: CInt): CInt {
    return LibcDynamicFfi.invoke("ispunct", -1, longArrayOf(c.toLong())).toInt()
}

public fun isspace(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isspace", -1, longArrayOf(c.toLong())).toInt()
}

public fun isupper(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isupper", -1, longArrayOf(c.toLong())).toInt()
}

public fun isxdigit(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isxdigit", -1, longArrayOf(c.toLong())).toInt()
}

public fun isblank(c: CInt): CInt {
    return LibcDynamicFfi.invoke("isblank", -1, longArrayOf(c.toLong())).toInt()
}

public fun tolower(c: CInt): CInt {
    return LibcDynamicFfi.invoke("tolower", -1, longArrayOf(c.toLong())).toInt()
}

public fun toupper(c: CInt): CInt {
    return LibcDynamicFfi.invoke("toupper", -1, longArrayOf(c.toLong())).toInt()
}

// stdio.h
public fun getStdioFile(fileno: CInt): FILE? {
    val rawRet = LibcDynamicFfi.invoke("__get_stdio_file", -1, longArrayOf(fileno.toLong()))
    return if (rawRet == 0L) null else FILE(rawRet)
}

public fun clearerr(arg1: FILE?) {
    LibcDynamicFfi.invoke("clearerr", -1, longArrayOf(arg1?.handle ?: 0L))
}

public fun fclose(arg1: FILE?): CInt {
    return LibcDynamicFfi.invoke("fclose", -1, longArrayOf(arg1?.handle ?: 0L)).toInt()
}

public fun feof(arg1: FILE?): CInt {
    return LibcDynamicFfi.invoke("feof", -1, longArrayOf(arg1?.handle ?: 0L)).toInt()
}

public fun ferror(arg1: FILE?): CInt {
    return LibcDynamicFfi.invoke("ferror", -1, longArrayOf(arg1?.handle ?: 0L)).toInt()
}

public fun fflush(arg1: FILE?): CInt {
    return LibcDynamicFfi.invoke("fflush", -1, longArrayOf(arg1?.handle ?: 0L)).toInt()
}

public fun fgetc(arg1: FILE?): CInt {
    return LibcDynamicFfi.invoke("fgetc", -1, longArrayOf(arg1?.handle ?: 0L)).toInt()
}

public fun fgets(arg1: COpaquePointer?, arg2: CInt, arg3: FILE?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("fgets", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), arg3?.handle ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun fopen(arg1: String?, arg2: String?): FILE? {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        val rawRet = LibcDynamicFfi.invoke("fopen", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fprintf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("fprintf", 2, longArrayOf(arg1?.handle ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fputc(arg1: CInt, arg2: FILE?): CInt {
    return LibcDynamicFfi.invoke("fputc", -1, longArrayOf(arg1.toLong(), arg2?.handle ?: 0L)).toInt()
}

public fun fputs(arg1: String?, arg2: FILE?): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("fputs", -1, longArrayOf(__cstr_0, arg2?.handle ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fread(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT {
    return LibcDynamicFfi.invoke("fread", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), arg3.toLong(), arg4?.handle ?: 0L)).toULong()
}

public fun freopen(arg1: String?, arg2: String?, arg3: FILE?): FILE? {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        val rawRet = LibcDynamicFfi.invoke("freopen", -1, longArrayOf(__cstr_0, __cstr_1, arg3?.handle ?: 0L))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fscanf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("fscanf", 2, longArrayOf(arg1?.handle ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fseek(arg1: FILE?, arg2: CLong, arg3: CInt): CInt {
    return LibcDynamicFfi.invoke("fseek", -1, longArrayOf(arg1?.handle ?: 0L, arg2, arg3.toLong())).toInt()
}

public fun ftell(arg1: FILE?): CLong {
    return LibcDynamicFfi.invoke("ftell", -1, longArrayOf(arg1?.handle ?: 0L))
}

public fun fwrite(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT {
    return LibcDynamicFfi.invoke("fwrite", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), arg3.toLong(), arg4?.handle ?: 0L)).toULong()
}

public fun getc(arg1: FILE?): CInt {
    return LibcDynamicFfi.invoke("getc", -1, longArrayOf(arg1?.handle ?: 0L)).toInt()
}

public fun getchar(): CInt {
    return LibcDynamicFfi.invoke("getchar", -1, longArrayOf()).toInt()
}

public fun perror(arg1: String?) {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        LibcDynamicFfi.invoke("perror", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun printf(arg1: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("printf", 1, longArrayOf(__cstr_0) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun putc(arg1: CInt, arg2: FILE?): CInt {
    return LibcDynamicFfi.invoke("putc", -1, longArrayOf(arg1.toLong(), arg2?.handle ?: 0L)).toInt()
}

public fun putchar(arg1: CInt): CInt {
    return LibcDynamicFfi.invoke("putchar", -1, longArrayOf(arg1.toLong())).toInt()
}

public fun puts(arg1: String?): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("puts", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun remove(arg1: String?): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("remove", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun rewind(arg1: FILE?) {
    LibcDynamicFfi.invoke("rewind", -1, longArrayOf(arg1?.handle ?: 0L))
}

public fun scanf(arg1: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("scanf", 1, longArrayOf(__cstr_0) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun setbuf(arg1: FILE?, arg2: COpaquePointer?) {
    LibcDynamicFfi.invoke("setbuf", -1, longArrayOf(arg1?.handle ?: 0L, arg2?.value ?: 0L))
}

public fun setvbuf(arg1: FILE?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): CInt {
    return LibcDynamicFfi.invoke("setvbuf", -1, longArrayOf(arg1?.handle ?: 0L, arg2?.value ?: 0L, arg3.toLong(), arg4.toLong())).toInt()
}

public fun sscanf(arg1: String?, arg2: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("sscanf", 2, longArrayOf(__cstr_0, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun tmpfile(): FILE? {
    val rawRet = LibcDynamicFfi.invoke("tmpfile", -1, longArrayOf())
    return if (rawRet == 0L) null else FILE(rawRet)
}

public fun ungetc(arg1: CInt, arg2: FILE?): CInt {
    return LibcDynamicFfi.invoke("ungetc", -1, longArrayOf(arg1.toLong(), arg2?.handle ?: 0L)).toInt()
}

public fun vfprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("vfprintf", -1, longArrayOf(arg1?.handle ?: 0L, __cstr_1, arg3?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun vprintf(arg1: String?, arg2: VaList): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("vprintf", -1, longArrayOf(__cstr_0, arg2?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun gets(arg1: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("gets", -1, longArrayOf(arg1?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun sprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("sprintf", 2, longArrayOf(arg1?.value ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun tmpnam(arg1: String?): COpaquePointer? {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        val rawRet = LibcDynamicFfi.invoke("tmpnam", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun vsprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("vsprintf", -1, longArrayOf(arg1?.value ?: 0L, __cstr_1, arg3?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun rename(arg1: String?, arg2: String?): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("rename", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun asiprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("asiprintf", 2, longArrayOf(arg1?.value ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fiprintf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("fiprintf", 2, longArrayOf(arg1?.handle ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fiscanf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("fiscanf", 2, longArrayOf(arg1?.handle ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun iprintf(arg1: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("iprintf", 1, longArrayOf(__cstr_0) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun iscanf(arg1: String?, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("iscanf", 1, longArrayOf(__cstr_0) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun siprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("siprintf", 2, longArrayOf(arg1?.value ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun siscanf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("siscanf", 2, longArrayOf(arg1?.value ?: 0L, __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun sniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, vararg variadicArgs: Long): CInt {
    val __cstr_2 = if (arg3 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg3)
    try {
        return LibcDynamicFfi.invoke("sniprintf", 3, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), __cstr_2) + variadicArgs).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun vasiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("vasiprintf", -1, longArrayOf(arg1?.value ?: 0L, __cstr_1, arg3?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun vfiprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("vfiprintf", -1, longArrayOf(arg1?.handle ?: 0L, __cstr_1, arg3?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun vfiscanf(arg1: FILE?, arg2: String?, arg3: VaList): CInt {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("vfiscanf", -1, longArrayOf(arg1?.handle ?: 0L, __cstr_1, arg3?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun viprintf(arg1: String?, arg2: VaList): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("viprintf", -1, longArrayOf(__cstr_0, arg2?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun viscanf(arg1: String?, arg2: VaList): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("viscanf", -1, longArrayOf(__cstr_0, arg2?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun vsiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("vsiprintf", -1, longArrayOf(arg1?.value ?: 0L, __cstr_1, arg3?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun vsiscanf(arg1: String?, arg2: String?, arg3: VaList): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("vsiscanf", -1, longArrayOf(__cstr_0, __cstr_1, arg3?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun vsniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt {
    val __cstr_2 = if (arg3 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg3)
    try {
        return LibcDynamicFfi.invoke("vsniprintf", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), __cstr_2, arg4?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun vdiprintf(arg1: CInt, arg2: String?, arg3: VaList): CInt {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("vdiprintf", -1, longArrayOf(arg1.toLong(), __cstr_1, arg3?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun diprintf(arg1: CInt, arg2: String?, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("diprintf", 2, longArrayOf(arg1.toLong(), __cstr_1) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fgetpos(arg1: FILE?, arg2: FposT?): CInt {
    return LibcDynamicFfi.invoke("fgetpos", -1, longArrayOf(arg1?.handle ?: 0L, arg2?.value ?: 0L)).toInt()
}

public fun fsetpos(arg1: FILE?, arg2: FposT?): CInt {
    return LibcDynamicFfi.invoke("fsetpos", -1, longArrayOf(arg1?.handle ?: 0L, arg2?.value ?: 0L)).toInt()
}

public fun fdopen(arg1: CInt, arg2: String?): FILE? {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        val rawRet = LibcDynamicFfi.invoke("fdopen", -1, longArrayOf(arg1.toLong(), __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fileno(arg1: FILE?): CInt {
    return LibcDynamicFfi.invoke("fileno", -1, longArrayOf(arg1?.handle ?: 0L)).toInt()
}

public fun flockfile(arg1: FILE?) {
    LibcDynamicFfi.invoke("flockfile", -1, longArrayOf(arg1?.handle ?: 0L))
}

public fun ftrylockfile(arg1: FILE?): CInt {
    return LibcDynamicFfi.invoke("ftrylockfile", -1, longArrayOf(arg1?.handle ?: 0L)).toInt()
}

public fun funlockfile(arg1: FILE?) {
    LibcDynamicFfi.invoke("funlockfile", -1, longArrayOf(arg1?.handle ?: 0L))
}

public fun getcUnlocked(arg1: FILE?): CInt {
    return LibcDynamicFfi.invoke("getc_unlocked", -1, longArrayOf(arg1?.handle ?: 0L)).toInt()
}

public fun getcharUnlocked(): CInt {
    return LibcDynamicFfi.invoke("getchar_unlocked", -1, longArrayOf()).toInt()
}

public fun putcUnlocked(arg1: CInt, arg2: FILE?): CInt {
    return LibcDynamicFfi.invoke("putc_unlocked", -1, longArrayOf(arg1.toLong(), arg2?.handle ?: 0L)).toInt()
}

public fun putcharUnlocked(arg1: CInt): CInt {
    return LibcDynamicFfi.invoke("putchar_unlocked", -1, longArrayOf(arg1.toLong())).toInt()
}

public fun snprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, vararg variadicArgs: Long): CInt {
    val __cstr_2 = if (arg3 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg3)
    try {
        return LibcDynamicFfi.invoke("snprintf", 3, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), __cstr_2) + variadicArgs).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun vsnprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt {
    val __cstr_2 = if (arg3 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg3)
    try {
        return LibcDynamicFfi.invoke("vsnprintf", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), __cstr_2, arg4?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun getw(arg1: FILE?): CInt {
    return LibcDynamicFfi.invoke("getw", -1, longArrayOf(arg1?.handle ?: 0L)).toInt()
}

public fun putw(arg1: CInt, arg2: FILE?): CInt {
    return LibcDynamicFfi.invoke("putw", -1, longArrayOf(arg1.toLong(), arg2?.handle ?: 0L)).toInt()
}

public fun tempnam(arg1: String?, arg2: String?): COpaquePointer? {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        val rawRet = LibcDynamicFfi.invoke("tempnam", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt {
    return LibcDynamicFfi.invoke("fseeko", -1, longArrayOf(stream?.handle ?: 0L, offset, whence.toLong())).toInt()
}

public fun ftello(stream: FILE?): OffT {
    return LibcDynamicFfi.invoke("ftello", -1, longArrayOf(stream?.handle ?: 0L))
}

// stdlib.h
public fun atof(arg1: String?): Double {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invokeFp("atof", 0, false, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtod(arg1: String?, arg2: COpaquePointer?): Double {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invokeFp("strtod", 0, false, longArrayOf(__cstr_0, arg2?.value ?: 0L))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun drand48(): Double {
    return LibcDynamicFfi.invokeFp("drand48", 0, false, longArrayOf())
}

public fun erand48(arg1: CUshort?): Double {
    val __slot_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg1.toLong())
    try {
        return LibcDynamicFfi.invokeFp("erand48", 0, false, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun strtof(arg1: String?, arg2: COpaquePointer?): Float {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invokeFp("strtof", 0, true, longArrayOf(__cstr_0, arg2?.value ?: 0L)).toFloat()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtold(arg1: String?, arg2: COpaquePointer?): Double {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invokeFp("strtold", 0, false, longArrayOf(__cstr_0, arg2?.value ?: 0L))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtodL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invokeFp("strtod_l", 0, false, longArrayOf(__cstr_0, arg2?.value ?: 0L, arg3.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtofL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Float {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invokeFp("strtof_l", 0, true, longArrayOf(__cstr_0, arg2?.value ?: 0L, arg3.toLong())).toFloat()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoldL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invokeFp("strtold_l", 0, false, longArrayOf(__cstr_0, arg2?.value ?: 0L, arg3.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun exit(arg1: CInt): Nothing {
    LibcDynamicFfi.invoke("_Exit", -1, longArrayOf(arg1.toLong()))
    error("unreachable")
}

public fun abort(): Nothing {
    LibcDynamicFfi.invoke("abort", -1, longArrayOf())
    error("unreachable")
}

public fun abs(arg1: CInt): CInt {
    return LibcDynamicFfi.invoke("abs", -1, longArrayOf(arg1.toLong())).toInt()
}

public fun atexit(arg1: AtexitArg1Callback?): CInt {
    return LibcDynamicFfi.invoke("atexit", -1, longArrayOf(arg1?.value ?: 0L)).toInt()
}

public fun atoi(arg1: String?): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("atoi", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun atol(arg1: String?): CLong {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("atol", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun itoa(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("itoa", -1, longArrayOf(arg1.toLong(), arg2?.value ?: 0L, arg3.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ltoa(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("ltoa", -1, longArrayOf(arg1, arg2?.value ?: 0L, arg3.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ultoa(arg1: CUlong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("ultoa", -1, longArrayOf(arg1.toLong(), arg2?.value ?: 0L, arg3.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: SizeT, arg5: BsearchArg5Callback?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("bsearch", -1, longArrayOf(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3.toLong(), arg4.toLong(), arg5?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun calloc(arg1: SizeT, arg2: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("calloc", -1, longArrayOf(arg1.toLong(), arg2.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun div(arg1: CInt, arg2: CInt): DivT {
    LibcDynamicFfi.invoke("div", -1, longArrayOf(arg1.toLong(), arg2.toLong()))
    return null as DivT
}

public fun free(arg1: COpaquePointer?) {
    LibcDynamicFfi.invoke("free", -1, longArrayOf(arg1?.value ?: 0L))
}

public fun getenv(arg1: String?): COpaquePointer? {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        val rawRet = LibcDynamicFfi.invoke("getenv", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun labs(arg1: CLong): CLong {
    return LibcDynamicFfi.invoke("labs", -1, longArrayOf(arg1))
}

public fun ldiv(arg1: CLong, arg2: CLong): LdivT {
    LibcDynamicFfi.invoke("ldiv", -1, longArrayOf(arg1, arg2))
    return null as LdivT
}

public fun malloc(arg1: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("malloc", -1, longArrayOf(arg1.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun qsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?) {
    LibcDynamicFfi.invoke("qsort", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), arg3.toLong(), arg4?.value ?: 0L))
}

public fun rand(): CInt {
    return LibcDynamicFfi.invoke("rand", -1, longArrayOf()).toInt()
}

public fun realloc(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("realloc", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun srand(arg1: CUint) {
    LibcDynamicFfi.invoke("srand", -1, longArrayOf(arg1.toLong()))
}

public fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLong {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("strtol", -1, longArrayOf(__cstr_0, arg2?.value ?: 0L, arg3.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlong {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("strtoul", -1, longArrayOf(__cstr_0, arg2?.value ?: 0L, arg3.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun mblen(arg1: String?, arg2: SizeT): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("mblen", -1, longArrayOf(__cstr_0, arg2.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun mbstowcs(arg1: WcharT?, arg2: String?, arg3: SizeT): SizeT {
    val __slot_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg1.toLong())
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("mbstowcs", -1, longArrayOf(__slot_0, __cstr_1, arg3.toLong())).toULong()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wctomb(arg1: COpaquePointer?, arg2: WcharT): CInt {
    return LibcDynamicFfi.invoke("wctomb", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong())).toInt()
}

public fun mbtowc(arg1: WcharT?, arg2: String?, arg3: SizeT): CInt {
    val __slot_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg1.toLong())
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("mbtowc", -1, longArrayOf(__slot_0, __cstr_1, arg3.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wcstombs(arg1: COpaquePointer?, arg2: WcharT?, arg3: SizeT): SizeT {
    val __slot_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg2.toLong())
    try {
        return LibcDynamicFfi.invoke("wcstombs", -1, longArrayOf(arg1?.value ?: 0L, __slot_1, arg3.toLong())).toULong()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun randR(arg1: CUint?): CInt {
    val __slot_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg1.toLong())
    try {
        return LibcDynamicFfi.invoke("rand_r", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun jrand48(arg1: CUshort?): CLong {
    val __slot_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg1.toLong())
    try {
        return LibcDynamicFfi.invoke("jrand48", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun lcong48(arg1: CUshort?) {
    val __slot_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg1.toLong())
    try {
        LibcDynamicFfi.invoke("lcong48", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun lrand48(): CLong {
    return LibcDynamicFfi.invoke("lrand48", -1, longArrayOf())
}

public fun mrand48(): CLong {
    return LibcDynamicFfi.invoke("mrand48", -1, longArrayOf())
}

public fun nrand48(arg1: CUshort?): CLong {
    val __slot_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg1.toLong())
    try {
        return LibcDynamicFfi.invoke("nrand48", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun seed48(arg1: CUshort?): CUshort? {
    val __slot_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg1.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("seed48", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 2).toUShort()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun srand48(arg1: CLong) {
    LibcDynamicFfi.invoke("srand48", -1, longArrayOf(arg1))
}

public fun putenv(arg1: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("putenv", -1, longArrayOf(arg1?.value ?: 0L)).toInt()
}

public fun a64l(arg1: String?): CLong {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("a64l", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun l64a(arg1: CLong): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("l64a", -1, longArrayOf(arg1))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun random(): CLong {
    return LibcDynamicFfi.invoke("random", -1, longArrayOf())
}

public fun setstate(arg1: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("setstate", -1, longArrayOf(arg1?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun initstate(arg1: CUint, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("initstate", -1, longArrayOf(arg1.toLong(), arg2?.value ?: 0L, arg3.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun srandom(arg1: CUint) {
    LibcDynamicFfi.invoke("srandom", -1, longArrayOf(arg1.toLong()))
}

public fun mkostemp(arg1: COpaquePointer?, arg2: CInt): CInt {
    return LibcDynamicFfi.invoke("mkostemp", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong())).toInt()
}

public fun mkostemps(arg1: COpaquePointer?, arg2: CInt, arg3: CInt): CInt {
    return LibcDynamicFfi.invoke("mkostemps", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), arg3.toLong())).toInt()
}

public fun mkdtemp(arg1: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("mkdtemp", -1, longArrayOf(arg1?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun mkstemp(arg1: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("mkstemp", -1, longArrayOf(arg1?.value ?: 0L)).toInt()
}

public fun mktemp(arg1: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("mktemp", -1, longArrayOf(arg1?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun atoll(arg1: String?): CLonglong {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("atoll", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun llabs(arg1: CLonglong): CLonglong {
    return LibcDynamicFfi.invoke("llabs", -1, longArrayOf(arg1))
}

public fun lldiv(arg1: CLonglong, arg2: CLonglong): LldivT {
    LibcDynamicFfi.invoke("lldiv", -1, longArrayOf(arg1, arg2))
    return null as LldivT
}

public fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLonglong {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("strtoll", -1, longArrayOf(__cstr_0, arg2?.value ?: 0L, arg3.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlonglong {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("strtoull", -1, longArrayOf(__cstr_0, arg2?.value ?: 0L, arg3.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun alignedAlloc(arg1: SizeT, arg2: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("aligned_alloc", -1, longArrayOf(arg1.toLong(), arg2.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun atQuickExit(arg1: AtexitArg1Callback?): CInt {
    return LibcDynamicFfi.invoke("at_quick_exit", -1, longArrayOf(arg1?.value ?: 0L)).toInt()
}

public fun quickExit(arg1: CInt) {
    LibcDynamicFfi.invoke("quick_exit", -1, longArrayOf(arg1.toLong()))
}

public fun setenv(arg1: String?, arg2: String?, arg3: CInt): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("setenv", -1, longArrayOf(__cstr_0, __cstr_1, arg3.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun unsetenv(arg1: String?): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("unsetenv", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun humanizeNumber(arg1: COpaquePointer?, arg2: SizeT, arg3: Long, arg4: String?, arg5: CInt, arg6: CInt): CInt {
    val __cstr_3 = if (arg4 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg4)
    try {
        return LibcDynamicFfi.invoke("humanize_number", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), arg3, __cstr_3, arg5.toLong(), arg6.toLong())).toInt()
    } finally {
        if (__cstr_3 != 0L) LibcDynamicFfi.freeMem(__cstr_3)
    }
}

public fun dehumanizeNumber(arg1: String?, arg2: Long?): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __slot_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg2)
    try {
        return LibcDynamicFfi.invoke("dehumanize_number", -1, longArrayOf(__cstr_0, __slot_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun getenvR(arg1: String?, arg2: COpaquePointer?, arg3: SizeT): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("getenv_r", -1, longArrayOf(__cstr_0, arg2?.value ?: 0L, arg3.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun heapsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt {
    return LibcDynamicFfi.invoke("heapsort", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), arg3.toLong(), arg4?.value ?: 0L)).toInt()
}

public fun mergesort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt {
    return LibcDynamicFfi.invoke("mergesort", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), arg3.toLong(), arg4?.value ?: 0L)).toInt()
}

public fun radixsort(arg1: COpaquePointer?, arg2: CInt, arg3: CUchar?, arg4: CUint): CInt {
    val __slot_2 = if (arg3 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg3.toLong())
    try {
        return LibcDynamicFfi.invoke("radixsort", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), __slot_2, arg4.toLong())).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sradixsort(arg1: COpaquePointer?, arg2: CInt, arg3: CUchar?, arg4: CUint): CInt {
    val __slot_2 = if (arg3 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg3.toLong())
    try {
        return LibcDynamicFfi.invoke("sradixsort", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), __slot_2, arg4.toLong())).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun getprogname(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("getprogname", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setprogname(arg1: String?) {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        LibcDynamicFfi.invoke("setprogname", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun qabs(arg1: QuadT): QuadT {
    return LibcDynamicFfi.invoke("qabs", -1, longArrayOf(arg1))
}

public fun strtoq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): QuadT {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("strtoq", -1, longArrayOf(__cstr_0, arg2?.value ?: 0L, arg3.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtouq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): UQuadT {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("strtouq", -1, longArrayOf(__cstr_0, arg2?.value ?: 0L, arg3.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strsuftoll(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong): CLonglong {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("strsuftoll", -1, longArrayOf(__cstr_0, __cstr_1, arg3, arg4))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strsuftollx(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong, arg5: COpaquePointer?, arg6: SizeT): CLonglong {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("strsuftollx", -1, longArrayOf(__cstr_0, __cstr_1, arg3, arg4, arg5?.value ?: 0L, arg6.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun l64aR(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): CInt {
    return LibcDynamicFfi.invoke("l64a_r", -1, longArrayOf(arg1, arg2?.value ?: 0L, arg3.toLong())).toInt()
}

public fun qdiv(arg1: QuadT, arg2: QuadT): QdivT {
    LibcDynamicFfi.invoke("qdiv", -1, longArrayOf(arg1, arg2))
    return null as QdivT
}

public fun strtolL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLong {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("strtol_l", -1, longArrayOf(__cstr_0, arg2?.value ?: 0L, arg3.toLong(), arg4.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoulL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlong {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("strtoul_l", -1, longArrayOf(__cstr_0, arg2?.value ?: 0L, arg3.toLong(), arg4.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLonglong {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("strtoll_l", -1, longArrayOf(__cstr_0, arg2?.value ?: 0L, arg3.toLong(), arg4.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoullL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlonglong {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("strtoull_l", -1, longArrayOf(__cstr_0, arg2?.value ?: 0L, arg3.toLong(), arg4.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): QuadT {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("strtoq_l", -1, longArrayOf(__cstr_0, arg2?.value ?: 0L, arg3.toLong(), arg4.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtouqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): UQuadT {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("strtouq_l", -1, longArrayOf(__cstr_0, arg2?.value ?: 0L, arg3.toLong(), arg4.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun mbCurMaxL(arg1: LocaleT): SizeT {
    return LibcDynamicFfi.invoke("_mb_cur_max_l", -1, longArrayOf(arg1.toLong())).toULong()
}

public fun mblenL(arg1: String?, arg2: SizeT, arg3: LocaleT): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("mblen_l", -1, longArrayOf(__cstr_0, arg2.toLong(), arg3.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun mbstowcsL(arg1: WcharT?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT {
    val __slot_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg1.toLong())
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("mbstowcs_l", -1, longArrayOf(__slot_0, __cstr_1, arg3.toLong(), arg4.toLong())).toULong()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wctombL(arg1: COpaquePointer?, arg2: WcharT, arg3: LocaleT): CInt {
    return LibcDynamicFfi.invoke("wctomb_l", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), arg3.toLong())).toInt()
}

public fun mbtowcL(arg1: WcharT?, arg2: String?, arg3: SizeT, arg4: LocaleT): CInt {
    val __slot_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg1.toLong())
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("mbtowc_l", -1, longArrayOf(__slot_0, __cstr_1, arg3.toLong(), arg4.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wcstombsL(arg1: COpaquePointer?, arg2: WcharT?, arg3: SizeT, arg4: LocaleT): SizeT {
    val __slot_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg2.toLong())
    try {
        return LibcDynamicFfi.invoke("wcstombs_l", -1, longArrayOf(arg1?.value ?: 0L, __slot_1, arg3.toLong(), arg4.toLong())).toULong()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

// string.h
public fun memchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memchr", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), arg3.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt {
    return LibcDynamicFfi.invoke("memcmp", -1, longArrayOf(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3.toLong())).toInt()
}

public fun memcpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memcpy", -1, longArrayOf(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memmove(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memmove", -1, longArrayOf(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memset", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), arg3.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun strcat(arg1: COpaquePointer?, arg2: String?): COpaquePointer? {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        val rawRet = LibcDynamicFfi.invoke("strcat", -1, longArrayOf(arg1?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strchr(arg1: String?, arg2: CInt): COpaquePointer? {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        val rawRet = LibcDynamicFfi.invoke("strchr", -1, longArrayOf(__cstr_0, arg2.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strcmp(arg1: String?, arg2: String?): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("strcmp", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcoll(arg1: String?, arg2: String?): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("strcoll", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        val rawRet = LibcDynamicFfi.invoke("strcpy", -1, longArrayOf(arg1?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcspn(arg1: String?, arg2: String?): SizeT {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("strcspn", -1, longArrayOf(__cstr_0, __cstr_1)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strerror(arg1: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("strerror", -1, longArrayOf(arg1.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun strlen(arg1: String?): SizeT {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("strlen", -1, longArrayOf(__cstr_0)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strncat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        val rawRet = LibcDynamicFfi.invoke("strncat", -1, longArrayOf(arg1?.value ?: 0L, __cstr_1, arg3.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncmp(arg1: String?, arg2: String?, arg3: SizeT): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("strncmp", -1, longArrayOf(__cstr_0, __cstr_1, arg3.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        val rawRet = LibcDynamicFfi.invoke("strncpy", -1, longArrayOf(arg1?.value ?: 0L, __cstr_1, arg3.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strpbrk(arg1: String?, arg2: String?): COpaquePointer? {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        val rawRet = LibcDynamicFfi.invoke("strpbrk", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strrchr(arg1: String?, arg2: CInt): COpaquePointer? {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        val rawRet = LibcDynamicFfi.invoke("strrchr", -1, longArrayOf(__cstr_0, arg2.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strspn(arg1: String?, arg2: String?): SizeT {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("strspn", -1, longArrayOf(__cstr_0, __cstr_1)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strstr(arg1: String?, arg2: String?): COpaquePointer? {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        val rawRet = LibcDynamicFfi.invoke("strstr", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strtok(arg1: COpaquePointer?, arg2: String?): COpaquePointer? {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        val rawRet = LibcDynamicFfi.invoke("strtok", -1, longArrayOf(arg1?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strtokR(arg1: COpaquePointer?, arg2: String?, arg3: COpaquePointer?): COpaquePointer? {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        val rawRet = LibcDynamicFfi.invoke("strtok_r", -1, longArrayOf(arg1?.value ?: 0L, __cstr_1, arg3?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strerrorR(arg1: CInt, arg2: COpaquePointer?, arg3: SizeT): CInt {
    return LibcDynamicFfi.invoke("strerror_r", -1, longArrayOf(arg1.toLong(), arg2?.value ?: 0L, arg3.toLong())).toInt()
}

public fun strxfrm(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("strxfrm", -1, longArrayOf(arg1?.value ?: 0L, __cstr_1, arg3.toLong())).toULong()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memccpy", -1, longArrayOf(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3.toLong(), arg4.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun strdup(arg1: String?): COpaquePointer? {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        val rawRet = LibcDynamicFfi.invoke("strdup", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun stpcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        val rawRet = LibcDynamicFfi.invoke("stpcpy", -1, longArrayOf(arg1?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun stpncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        val rawRet = LibcDynamicFfi.invoke("stpncpy", -1, longArrayOf(arg1?.value ?: 0L, __cstr_1, arg3.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strnlen(arg1: String?, arg2: SizeT): SizeT {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("strnlen", -1, longArrayOf(__cstr_0, arg2.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun memmem(arg1: COpaquePointer?, arg2: SizeT, arg3: COpaquePointer?, arg4: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memmem", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), arg3?.value ?: 0L, arg4.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun strcasestr(arg1: String?, arg2: String?): COpaquePointer? {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        val rawRet = LibcDynamicFfi.invoke("strcasestr", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strlcat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("strlcat", -1, longArrayOf(arg1?.value ?: 0L, __cstr_1, arg3.toLong())).toULong()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strlcpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("strlcpy", -1, longArrayOf(arg1?.value ?: 0L, __cstr_1, arg3.toLong())).toULong()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strsep(arg1: COpaquePointer?, arg2: String?): COpaquePointer? {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        val rawRet = LibcDynamicFfi.invoke("strsep", -1, longArrayOf(arg1?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun stresep(arg1: COpaquePointer?, arg2: String?, arg3: CInt): COpaquePointer? {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        val rawRet = LibcDynamicFfi.invoke("stresep", -1, longArrayOf(arg1?.value ?: 0L, __cstr_1, arg3.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strndup(arg1: String?, arg2: SizeT): COpaquePointer? {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        val rawRet = LibcDynamicFfi.invoke("strndup", -1, longArrayOf(__cstr_0, arg2.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun memrchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memrchr", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), arg3.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun explicitMemset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("explicit_memset", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), arg3.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun consttimeMemequal(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt {
    return LibcDynamicFfi.invoke("consttime_memequal", -1, longArrayOf(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3.toLong())).toInt()
}

public fun strcollL(arg1: String?, arg2: String?, arg3: LocaleT): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("strcoll_l", -1, longArrayOf(__cstr_0, __cstr_1, arg3.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strxfrmL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("strxfrm_l", -1, longArrayOf(arg1?.value ?: 0L, __cstr_1, arg3.toLong(), arg4.toLong())).toULong()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strerrorL(arg1: CInt, arg2: LocaleT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("strerror_l", -1, longArrayOf(arg1.toLong(), arg2.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// strings.h
public fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt {
    return LibcDynamicFfi.invoke("bcmp", -1, longArrayOf(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3.toLong())).toInt()
}

public fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT) {
    LibcDynamicFfi.invoke("bcopy", -1, longArrayOf(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3.toLong()))
}

public fun bzero(arg1: COpaquePointer?, arg2: SizeT) {
    LibcDynamicFfi.invoke("bzero", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong()))
}

public fun ffs(arg1: CInt): CInt {
    return LibcDynamicFfi.invoke("ffs", -1, longArrayOf(arg1.toLong())).toInt()
}

public fun popcount(arg1: CUint): CUint {
    return LibcDynamicFfi.invoke("popcount", -1, longArrayOf(arg1.toLong())).toUInt()
}

public fun popcountl(arg1: CUlong): CUint {
    return LibcDynamicFfi.invoke("popcountl", -1, longArrayOf(arg1.toLong())).toUInt()
}

public fun popcountll(arg1: CUlonglong): CUint {
    return LibcDynamicFfi.invoke("popcountll", -1, longArrayOf(arg1.toLong())).toUInt()
}

public fun popcount32(arg1: UInt): CUint {
    return LibcDynamicFfi.invoke("popcount32", -1, longArrayOf(arg1.toLong())).toUInt()
}

public fun popcount64(arg1: ULong): CUint {
    return LibcDynamicFfi.invoke("popcount64", -1, longArrayOf(arg1.toLong())).toUInt()
}

public fun rindex(arg1: String?, arg2: CInt): COpaquePointer? {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        val rawRet = LibcDynamicFfi.invoke("rindex", -1, longArrayOf(__cstr_0, arg2.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strcasecmp(arg1: String?, arg2: String?): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("strcasecmp", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncasecmp(arg1: String?, arg2: String?, arg3: SizeT): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("strncasecmp", -1, longArrayOf(__cstr_0, __cstr_1, arg3.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// signal.h
public fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT {
    return LibcDynamicFfi.invoke("signal", -1, longArrayOf(arg1.toLong(), arg2.toLong())).toULong()
}

public fun raise(arg1: CInt): CInt {
    return LibcDynamicFfi.invoke("raise", -1, longArrayOf(arg1.toLong())).toInt()
}

// time.h
public fun asctime(arg1: Tm?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("asctime", -1, longArrayOf(arg1?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun clock(): ClockT {
    return LibcDynamicFfi.invoke("clock", -1, longArrayOf()).toUInt()
}

public fun ctime(arg1: Long?): COpaquePointer? {
    val __slot_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg1)
    try {
        val rawRet = LibcDynamicFfi.invoke("ctime", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun difftime(arg1: TimeT, arg2: TimeT): Double {
    return LibcDynamicFfi.invokeFp("difftime", 0, false, longArrayOf(arg1, arg2))
}

public fun gmtime(arg1: Long?): Tm? {
    val __slot_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg1)
    try {
        val rawRet = LibcDynamicFfi.invoke("gmtime", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun localtime(arg1: Long?): Tm? {
    val __slot_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg1)
    try {
        val rawRet = LibcDynamicFfi.invoke("localtime", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun time(arg1: Long?): TimeT {
    val __slot_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg1)
    try {
        return LibcDynamicFfi.invoke("time", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun mktime(arg1: Tm?): TimeT {
    return LibcDynamicFfi.invoke("mktime", -1, longArrayOf(arg1?.value ?: 0L))
}

public fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: Tm?): SizeT {
    val __cstr_2 = if (arg3 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg3)
    try {
        return LibcDynamicFfi.invoke("strftime", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong(), __cstr_2, arg4?.value ?: 0L)).toULong()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun utime(arg1: String?, arg2: Long?): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    val __slot_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg2)
    try {
        return LibcDynamicFfi.invoke("utime", -1, longArrayOf(__cstr_0, __slot_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun asctimeR(arg1: Tm?, arg2: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("asctime_r", -1, longArrayOf(arg1?.value ?: 0L, arg2?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ctimeR(arg1: Long?, arg2: COpaquePointer?): COpaquePointer? {
    val __slot_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg1)
    try {
        val rawRet = LibcDynamicFfi.invoke("ctime_r", -1, longArrayOf(__slot_0, arg2?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun gmtimeR(arg1: Long?, arg2: Tm?): Tm? {
    val __slot_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg1)
    try {
        val rawRet = LibcDynamicFfi.invoke("gmtime_r", -1, longArrayOf(__slot_0, arg2?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun localtimeR(arg1: Long?, arg2: Tm?): Tm? {
    val __slot_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg1)
    try {
        val rawRet = LibcDynamicFfi.invoke("localtime_r", -1, longArrayOf(__slot_0, arg2?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

// sys/stat.h
public fun stat(arg1: String?, arg2: Stat?): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("stat", -1, longArrayOf(__cstr_0, arg2?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun lstat(arg1: String?, arg2: Stat?): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("lstat", -1, longArrayOf(__cstr_0, arg2?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fstat(arg1: CInt, arg2: Stat?): CInt {
    return LibcDynamicFfi.invoke("fstat", -1, longArrayOf(arg1.toLong(), arg2?.value ?: 0L)).toInt()
}

public fun chmod(arg1: String?, arg2: ModeT): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("chmod", -1, longArrayOf(__cstr_0, arg2.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun mkdir(arg1: String?, arg2: ModeT): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("mkdir", -1, longArrayOf(__cstr_0, arg2.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// fcntl.h
public fun open(arg1: String?, arg2: CInt, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("open", 2, longArrayOf(__cstr_0, arg2.toLong()) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun creat(arg1: String?, arg2: CInt): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("creat", -1, longArrayOf(__cstr_0, arg2.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun close(arg1: CInt): CInt {
    return LibcDynamicFfi.invoke("close", -1, longArrayOf(arg1.toLong())).toInt()
}

public fun read(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt {
    return LibcDynamicFfi.invoke("read", -1, longArrayOf(arg1.toLong(), arg2?.value ?: 0L, arg3.toLong())).toInt()
}

public fun write(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt {
    return LibcDynamicFfi.invoke("write", -1, longArrayOf(arg1.toLong(), arg2?.value ?: 0L, arg3.toLong())).toInt()
}

public fun unlink(arg1: String?): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun tell(arg1: CInt): CLong {
    return LibcDynamicFfi.invoke("tell", -1, longArrayOf(arg1.toLong()))
}

public fun dup(arg1: CInt): CInt {
    return LibcDynamicFfi.invoke("dup", -1, longArrayOf(arg1.toLong())).toInt()
}

public fun dup2(arg1: CInt, arg2: CInt): CInt {
    return LibcDynamicFfi.invoke("dup2", -1, longArrayOf(arg1.toLong(), arg2.toLong())).toInt()
}

public fun access(arg1: String?, arg2: CInt): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("access", -1, longArrayOf(__cstr_0, arg2.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun rmdir(arg1: String?): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("rmdir", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun chdir(arg1: String?): CInt {
    val __cstr_0 = if (arg1 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg1)
    try {
        return LibcDynamicFfi.invoke("chdir", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getwd(arg1: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("getwd", -1, longArrayOf(arg1?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getcwd(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("getcwd", -1, longArrayOf(arg1?.value ?: 0L, arg2.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

private var __backing_OPTARG: COpaquePointer? = null

public var OPTARG: COpaquePointer?
    get() {
        val addr = LibcDynamicFfi.resolveSymbolAddress("optarg")
        if (addr == 0L) return __backing_OPTARG
        val ptr = LibcDynamicFfi.readScalarSlot(addr, 8)
        return if (ptr == 0L) null else COpaquePointer(ptr)
    }
    set(value) {
        __backing_OPTARG = value
        val addr = LibcDynamicFfi.resolveSymbolAddress("optarg")
        if (addr != 0L) LibcDynamicFfi.writeScalarSlot(addr, 8, value?.value ?: 0L)
    }

private var __backing_OPTERR: CInt = 0

public var OPTERR: CInt
    get() {
        val addr = LibcDynamicFfi.resolveSymbolAddress("opterr")
        return if (addr != 0L) LibcDynamicFfi.readScalarSlot(addr, 4).toInt() else __backing_OPTERR
    }
    set(value) {
        __backing_OPTERR = value
        val addr = LibcDynamicFfi.resolveSymbolAddress("opterr")
        if (addr != 0L) LibcDynamicFfi.writeScalarSlot(addr, 4, value.toLong())
    }

private var __backing_OPTIND: CInt = 0

public var OPTIND: CInt
    get() {
        val addr = LibcDynamicFfi.resolveSymbolAddress("optind")
        return if (addr != 0L) LibcDynamicFfi.readScalarSlot(addr, 4).toInt() else __backing_OPTIND
    }
    set(value) {
        __backing_OPTIND = value
        val addr = LibcDynamicFfi.resolveSymbolAddress("optind")
        if (addr != 0L) LibcDynamicFfi.writeScalarSlot(addr, 4, value.toLong())
    }

private var __backing_OPTOPT: CInt = 0

public var OPTOPT: CInt
    get() {
        val addr = LibcDynamicFfi.resolveSymbolAddress("optopt")
        return if (addr != 0L) LibcDynamicFfi.readScalarSlot(addr, 4).toInt() else __backing_OPTOPT
    }
    set(value) {
        __backing_OPTOPT = value
        val addr = LibcDynamicFfi.resolveSymbolAddress("optopt")
        if (addr != 0L) LibcDynamicFfi.writeScalarSlot(addr, 4, value.toLong())
    }

private var __backing_OPTRESET: CInt = 0

public var OPTRESET: CInt
    get() {
        val addr = LibcDynamicFfi.resolveSymbolAddress("optreset")
        return if (addr != 0L) LibcDynamicFfi.readScalarSlot(addr, 4).toInt() else __backing_OPTRESET
    }
    set(value) {
        __backing_OPTRESET = value
        val addr = LibcDynamicFfi.resolveSymbolAddress("optreset")
        if (addr != 0L) LibcDynamicFfi.writeScalarSlot(addr, 4, value.toLong())
    }

public fun getopt(arg1: CInt, arg2: COpaquePointer?, arg3: String?): CInt {
    val __cstr_2 = if (arg3 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg3)
    try {
        return LibcDynamicFfi.invoke("getopt", -1, longArrayOf(arg1.toLong(), arg2?.value ?: 0L, __cstr_2)).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

private var __backing_SUBOPTARG: COpaquePointer? = null

public var SUBOPTARG: COpaquePointer?
    get() {
        val addr = LibcDynamicFfi.resolveSymbolAddress("suboptarg")
        if (addr == 0L) return __backing_SUBOPTARG
        val ptr = LibcDynamicFfi.readScalarSlot(addr, 8)
        return if (ptr == 0L) null else COpaquePointer(ptr)
    }
    set(value) {
        __backing_SUBOPTARG = value
        val addr = LibcDynamicFfi.resolveSymbolAddress("suboptarg")
        if (addr != 0L) LibcDynamicFfi.writeScalarSlot(addr, 8, value?.value ?: 0L)
    }

public fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getsubopt", -1, longArrayOf(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3?.value ?: 0L)).toInt()
}

public fun fcntl(arg1: CInt, arg2: CInt, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("fcntl", 2, longArrayOf(arg1.toLong(), arg2.toLong()) + variadicArgs).toInt()
}

public fun getpid(): PidT {
    return LibcDynamicFfi.invoke("getpid", -1, longArrayOf()).toInt()
}

public fun sleep(arg1: CUint): CUint {
    return LibcDynamicFfi.invoke("sleep", -1, longArrayOf(arg1.toLong())).toUInt()
}

public fun usleep(arg1: UsecondsT): CInt {
    return LibcDynamicFfi.invoke("usleep", -1, longArrayOf(arg1.toLong())).toInt()
}

// locale.h
public fun localeconv(): Lconv? {
    val rawRet = LibcDynamicFfi.invoke("localeconv", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setlocale(arg1: CInt, arg2: String?): COpaquePointer? {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        val rawRet = LibcDynamicFfi.invoke("setlocale", -1, longArrayOf(arg1.toLong(), __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun duplocale(arg1: LocaleT): LocaleT {
    return LibcDynamicFfi.invoke("duplocale", -1, longArrayOf(arg1.toLong())).toULong()
}

public fun freelocale(arg1: LocaleT) {
    LibcDynamicFfi.invoke("freelocale", -1, longArrayOf(arg1.toLong()))
}

public fun localeconvL(arg1: LocaleT): Lconv? {
    val rawRet = LibcDynamicFfi.invoke("localeconv_l", -1, longArrayOf(arg1.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun newlocale(arg1: CInt, arg2: String?, arg3: LocaleT): LocaleT {
    val __cstr_1 = if (arg2 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg2)
    try {
        return LibcDynamicFfi.invoke("newlocale", -1, longArrayOf(arg1.toLong(), __cstr_1, arg3.toLong())).toULong()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// langinfo.h
public fun nlLanginfo(item: NlItem): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("nl_langinfo", -1, longArrayOf(item))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("nl_langinfo_l", -1, longArrayOf(item, locale.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// malloc.h
public fun memalign(align: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memalign", -1, longArrayOf(align.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// sys/types.h
public fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT {
    return LibcDynamicFfi.invoke("lseek", -1, longArrayOf(arg1.toLong(), arg2, arg3.toLong()))
}
