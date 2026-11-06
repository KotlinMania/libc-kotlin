package io.github.kotlinmania.libc.windows

// Windows CRT definitions

public fun interface QsortComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?): CInt
}

public fun interface QsortSComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

public fun interface AtexitCbCallback {
    public operator fun invoke()
}

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias SizeT = ULong

public typealias PtrdiffT = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias SsizeT = Long

public typealias SighandlerT = ULong

public typealias WcharT = UShort

public typealias ClockT = Int

public typealias ErrnoT = CInt

public typealias OffT = Int

public typealias DevT = UInt

public typealias InoT = UShort

public typealias Time64T = Long

public typealias Socket = UintptrT

public val INT_MIN: CInt = -2147483648

public val INT_MAX: CInt = 2147483647

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val RAND_MAX: CInt = 32767

public val EOF: CInt = -1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val IOFBF: CInt = 0

public val IONBF: CInt = 4

public val IOLBF: CInt = 64

public val BUFSIZ: CUint = 512u

public val FOPEN_MAX: CUint = 20u

public val FILENAME_MAX: CUint = 260u

// fcntl.h
public val O_RDONLY: CInt = 0x0000

public val O_WRONLY: CInt = 0x0001

public val O_RDWR: CInt = 0x0002

public val O_APPEND: CInt = 0x0008

public val O_CREAT: CInt = 0x0100

public val O_TRUNC: CInt = 0x0200

public val O_EXCL: CInt = 0x0400

public val O_TEXT: CInt = 0x4000

public val O_BINARY: CInt = 0x8000

public val O_WTEXT: CInt = 0x10000

public val O_U16TEXT: CInt = 0x20000

public val O_U8TEXT: CInt = 0x40000

public val O_RAW: CInt = O_BINARY

public val O_NOINHERIT: CInt = 0x0080

public val O_TEMPORARY: CInt = 0x0040

public val O_SHORT_LIVED: CInt = 0x1000

public val O_OBTAIN_DIR: CInt = 0x2000

public val O_SEQUENTIAL: CInt = 0x0020

public val O_RANDOM: CInt = 0x0010

public val S_IFCHR: CInt = 8192

public val S_IFDIR: CInt = 16384

public val S_IFREG: CInt = 32768

public val S_IFMT: CInt = 61440

public val S_IEXEC: CInt = 64

public val S_IWRITE: CInt = 128

public val S_IREAD: CInt = 256

public val LC_ALL: CInt = 0

public val LC_COLLATE: CInt = 1

public val LC_CTYPE: CInt = 2

public val LC_MONETARY: CInt = 3

public val LC_NUMERIC: CInt = 4

public val LC_TIME: CInt = 5

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

public val EFBIG: CInt = 27

public val ENOSPC: CInt = 28

public val ESPIPE: CInt = 29

public val EROFS: CInt = 30

public val EMLINK: CInt = 31

public val EPIPE: CInt = 32

public val EDOM: CInt = 33

public val ERANGE: CInt = 34

public val EDEADLK: CInt = 36

public val EDEADLOCK: CInt = 36

public val ENAMETOOLONG: CInt = 38

public val ENOLCK: CInt = 39

public val ENOSYS: CInt = 40

public val ENOTEMPTY: CInt = 41

public val EILSEQ: CInt = 42

public val STRUNCATE: CInt = 80

// POSIX Supplement (from errno.h)
public val EADDRINUSE: CInt = 100

public val EADDRNOTAVAIL: CInt = 101

public val EAFNOSUPPORT: CInt = 102

public val EALREADY: CInt = 103

public val EBADMSG: CInt = 104

public val ECANCELED: CInt = 105

public val ECONNABORTED: CInt = 106

public val ECONNREFUSED: CInt = 107

public val ECONNRESET: CInt = 108

public val EDESTADDRREQ: CInt = 109

public val EHOSTUNREACH: CInt = 110

public val EIDRM: CInt = 111

public val EINPROGRESS: CInt = 112

public val EISCONN: CInt = 113

public val ELOOP: CInt = 114

public val EMSGSIZE: CInt = 115

public val ENETDOWN: CInt = 116

public val ENETRESET: CInt = 117

public val ENETUNREACH: CInt = 118

public val ENOBUFS: CInt = 119

public val ENODATA: CInt = 120

public val ENOLINK: CInt = 121

public val ENOMSG: CInt = 122

public val ENOPROTOOPT: CInt = 123

public val ENOSR: CInt = 124

public val ENOSTR: CInt = 125

public val ENOTCONN: CInt = 126

public val ENOTRECOVERABLE: CInt = 127

public val ENOTSOCK: CInt = 128

public val ENOTSUP: CInt = 129

public val EOPNOTSUPP: CInt = 130

public val EOVERFLOW: CInt = 132

public val EOWNERDEAD: CInt = 133

public val EPROTO: CInt = 134

public val EPROTONOSUPPORT: CInt = 135

public val EPROTOTYPE: CInt = 136

public val ETIME: CInt = 137

public val ETIMEDOUT: CInt = 138

public val ETXTBSY: CInt = 139

public val EWOULDBLOCK: CInt = 140

// signal codes
public val SIGINT: CInt = 2

public val SIGILL: CInt = 4

public val SIGFPE: CInt = 8

public val SIGSEGV: CInt = 11

public val SIGTERM: CInt = 15

public val SIGABRT: CInt = 22

public val NSIG: CInt = 23

public val SIG_ERR: CInt = -1

public val SIG_DFL: SighandlerT = 0uL

public val SIG_IGN: SighandlerT = 1uL

public val SIG_GET: SighandlerT = 2uL

public val SIG_SGE: SighandlerT = 3uL

public val SIG_ACK: SighandlerT = 4uL

public val L_TMPNAM: CUint = 260u

public val TMP_MAX: CUint = 0x7fffffffu

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

public fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    LibcDynamicFfi.invoke("qsort", -1, longArrayOf(base?.value ?: 0L, num.toLong(), size.toLong(), compar?.value ?: 0L))
}

public fun qsortS(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortSComparCallback?, arg: COpaquePointer?) {
    LibcDynamicFfi.invoke("qsort_s", -1, longArrayOf(base?.value ?: 0L, num.toLong(), size.toLong(), compar?.value ?: 0L, arg?.value ?: 0L))
}

public fun fopen(filename: String?, mode: String?): FILE? {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("fopen", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun freopen(filename: String?, mode: String?, file: FILE?): FILE? {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("freopen", -1, longArrayOf(__cstr_0, __cstr_1, file?.handle ?: 0L))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fflush(file: FILE?): CInt {
    return LibcDynamicFfi.invoke("fflush", -1, longArrayOf(file?.handle ?: 0L)).toInt()
}

public fun fclose(file: FILE?): CInt {
    return LibcDynamicFfi.invoke("fclose", -1, longArrayOf(file?.handle ?: 0L)).toInt()
}

public fun remove(filename: String?): CInt {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        return LibcDynamicFfi.invoke("remove", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun rename(oldname: String?, newname: String?): CInt {
    val __cstr_0 = if (oldname == null) 0L else LibcDynamicFfi.allocUtf8CString(oldname)
    val __cstr_1 = if (newname == null) 0L else LibcDynamicFfi.allocUtf8CString(newname)
    try {
        return LibcDynamicFfi.invoke("rename", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun tmpfile(): FILE? {
    val rawRet = LibcDynamicFfi.invoke("tmpfile", -1, longArrayOf())
    return if (rawRet == 0L) null else FILE(rawRet)
}

public fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt {
    return LibcDynamicFfi.invoke("setvbuf", -1, longArrayOf(stream?.handle ?: 0L, buffer?.value ?: 0L, mode.toLong(), size.toLong())).toInt()
}

public fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    LibcDynamicFfi.invoke("setbuf", -1, longArrayOf(stream?.handle ?: 0L, buf?.value ?: 0L))
}

public fun getchar(): CInt {
    return LibcDynamicFfi.invoke("getchar", -1, longArrayOf()).toInt()
}

public fun putchar(c: CInt): CInt {
    return LibcDynamicFfi.invoke("putchar", -1, longArrayOf(c.toLong())).toInt()
}

public fun fgetc(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("fgetc", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("fgets", -1, longArrayOf(buf?.value ?: 0L, n.toLong(), stream?.handle ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun fputc(c: CInt, stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("fputc", -1, longArrayOf(c.toLong(), stream?.handle ?: 0L)).toInt()
}

public fun fputs(s: String?, stream: FILE?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("fputs", -1, longArrayOf(__cstr_0, stream?.handle ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun puts(s: String?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("puts", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun ungetc(c: CInt, stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("ungetc", -1, longArrayOf(c.toLong(), stream?.handle ?: 0L)).toInt()
}

public fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT {
    return LibcDynamicFfi.invoke("fread", -1, longArrayOf(ptr?.value ?: 0L, size.toLong(), nobj.toLong(), stream?.handle ?: 0L)).toULong()
}

public fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT {
    return LibcDynamicFfi.invoke("fwrite", -1, longArrayOf(ptr?.value ?: 0L, size.toLong(), nobj.toLong(), stream?.handle ?: 0L)).toULong()
}

public fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt {
    return LibcDynamicFfi.invoke("fseek", -1, longArrayOf(stream?.handle ?: 0L, offset, whence.toLong())).toInt()
}

public fun ftell(stream: FILE?): CLong {
    return LibcDynamicFfi.invoke("ftell", -1, longArrayOf(stream?.handle ?: 0L))
}

public fun rewind(stream: FILE?) {
    LibcDynamicFfi.invoke("rewind", -1, longArrayOf(stream?.handle ?: 0L))
}

public fun fgetpos(stream: FILE?, ptr: FposT?): CInt {
    return LibcDynamicFfi.invoke("fgetpos", -1, longArrayOf(stream?.handle ?: 0L, ptr?.value ?: 0L)).toInt()
}

public fun fsetpos(stream: FILE?, ptr: FposT?): CInt {
    return LibcDynamicFfi.invoke("fsetpos", -1, longArrayOf(stream?.handle ?: 0L, ptr?.value ?: 0L)).toInt()
}

public fun feof(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("feof", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun ferror(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("ferror", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun perror(s: String?) {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        LibcDynamicFfi.invoke("perror", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun atof(s: String?): CDouble {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invokeFp("atof", 0, false, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun atoi(s: String?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("atoi", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun atol(s: String?): CLong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("atol", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun atoll(s: String?): CLonglong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("atoll", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtod(s: String?, endp: COpaquePointer?): CDouble {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invokeFp("strtod", 0, false, longArrayOf(__cstr_0, endp?.value ?: 0L))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtof(s: String?, endp: COpaquePointer?): CFloat {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invokeFp("strtof", 0, true, longArrayOf(__cstr_0, endp?.value ?: 0L)).toFloat()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strtol", -1, longArrayOf(__cstr_0, endp?.value ?: 0L, base.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strtoll", -1, longArrayOf(__cstr_0, endp?.value ?: 0L, base.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strtoul", -1, longArrayOf(__cstr_0, endp?.value ?: 0L, base.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("strtoull", -1, longArrayOf(__cstr_0, endp?.value ?: 0L, base.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("calloc", -1, longArrayOf(nobj.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun malloc(size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("malloc", -1, longArrayOf(size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun msize(p: COpaquePointer?): SizeT {
    return LibcDynamicFfi.invoke("_msize", -1, longArrayOf(p?.value ?: 0L)).toULong()
}

public fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("realloc", -1, longArrayOf(p?.value ?: 0L, size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun free(p: COpaquePointer?) {
    LibcDynamicFfi.invoke("free", -1, longArrayOf(p?.value ?: 0L))
}

public fun abort(): Nothing {
    LibcDynamicFfi.invoke("abort", -1, longArrayOf())
    error("unreachable")
}

public fun exit(status: CInt): Nothing {
    LibcDynamicFfi.invoke("exit", -1, longArrayOf(status.toLong()))
    error("unreachable")
}

public fun atexit(cb: AtexitCbCallback): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("atexit", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun system(s: String?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("system", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getenv(s: String?): COpaquePointer? {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        val rawRet = LibcDynamicFfi.invoke("getenv", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        val rawRet = LibcDynamicFfi.invoke("strcpy", -1, longArrayOf(dst?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        val rawRet = LibcDynamicFfi.invoke("strncpy", -1, longArrayOf(dst?.value ?: 0L, __cstr_1, n.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? {
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        val rawRet = LibcDynamicFfi.invoke("strcat", -1, longArrayOf(s?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? {
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        val rawRet = LibcDynamicFfi.invoke("strncat", -1, longArrayOf(s?.value ?: 0L, __cstr_1, n.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcmp(cs: String?, ct: String?): CInt {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strcmp", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strncmp(cs: String?, ct: String?, n: SizeT): CInt {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strncmp", -1, longArrayOf(__cstr_0, __cstr_1, n.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcoll(cs: String?, ct: String?): CInt {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strcoll", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strchr(cs: String?, c: CInt): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        val rawRet = LibcDynamicFfi.invoke("strchr", -1, longArrayOf(__cstr_0, c.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strrchr(cs: String?, c: CInt): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        val rawRet = LibcDynamicFfi.invoke("strrchr", -1, longArrayOf(__cstr_0, c.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strspn(cs: String?, ct: String?): SizeT {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strspn", -1, longArrayOf(__cstr_0, __cstr_1)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strcspn(cs: String?, ct: String?): SizeT {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strcspn", -1, longArrayOf(__cstr_0, __cstr_1)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strdup(cs: String?): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        val rawRet = LibcDynamicFfi.invoke("strdup", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strpbrk(cs: String?, ct: String?): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        val rawRet = LibcDynamicFfi.invoke("strpbrk", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strstr(cs: String?, ct: String?): COpaquePointer? {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        val rawRet = LibcDynamicFfi.invoke("strstr", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strlen(cs: String?): SizeT {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        return LibcDynamicFfi.invoke("strlen", -1, longArrayOf(__cstr_0)).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strnlen(cs: String?, maxlen: SizeT): SizeT {
    val __cstr_0 = if (cs == null) 0L else LibcDynamicFfi.allocUtf8CString(cs)
    try {
        return LibcDynamicFfi.invoke("strnlen", -1, longArrayOf(__cstr_0, maxlen.toLong())).toULong()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun strerror(n: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("strerror", -1, longArrayOf(n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? {
    val __cstr_1 = if (t == null) 0L else LibcDynamicFfi.allocUtf8CString(t)
    try {
        val rawRet = LibcDynamicFfi.invoke("strtok", -1, longArrayOf(s?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT {
    val __cstr_1 = if (ct == null) 0L else LibcDynamicFfi.allocUtf8CString(ct)
    try {
        return LibcDynamicFfi.invoke("strxfrm", -1, longArrayOf(s?.value ?: 0L, __cstr_1, n.toLong())).toULong()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wcslen(buf: UShort?): SizeT {
    val __slot_0 = if (buf == null) 0L else LibcDynamicFfi.allocScalarSlot(buf.toLong())
    try {
        return LibcDynamicFfi.invoke("wcslen", -1, longArrayOf(__slot_0)).toULong()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun wcsnlen(str: UShort?, numberOfElements: SizeT): SizeT {
    val __slot_0 = if (str == null) 0L else LibcDynamicFfi.allocScalarSlot(str.toLong())
    try {
        return LibcDynamicFfi.invoke("wcsnlen", -1, longArrayOf(__slot_0, numberOfElements.toLong())).toULong()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun wcstombs(dest: COpaquePointer?, src: UShort?, n: SizeT): SizeT {
    val __slot_1 = if (src == null) 0L else LibcDynamicFfi.allocScalarSlot(src.toLong())
    try {
        return LibcDynamicFfi.invoke("wcstombs", -1, longArrayOf(dest?.value ?: 0L, __slot_1, n.toLong())).toULong()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memchr", -1, longArrayOf(cx?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt {
    return LibcDynamicFfi.invoke("memcmp", -1, longArrayOf(cx?.value ?: 0L, ct?.value ?: 0L, n.toLong())).toInt()
}

public fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memcpy", -1, longArrayOf(dest?.value ?: 0L, src?.value ?: 0L, n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memmove", -1, longArrayOf(dest?.value ?: 0L, src?.value ?: 0L, n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memset", -1, longArrayOf(dest?.value ?: 0L, c.toLong(), n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun abs(i: CInt): CInt {
    return LibcDynamicFfi.invoke("abs", -1, longArrayOf(i.toLong())).toInt()
}

public fun labs(i: CLong): CLong {
    return LibcDynamicFfi.invoke("labs", -1, longArrayOf(i))
}

public fun rand(): CInt {
    return LibcDynamicFfi.invoke("rand", -1, longArrayOf()).toInt()
}

public fun srand(seed: CUint) {
    LibcDynamicFfi.invoke("srand", -1, longArrayOf(seed.toLong()))
}

public fun signal(signum: CInt, handler: SighandlerT): SighandlerT {
    return LibcDynamicFfi.invoke("signal", -1, longArrayOf(signum.toLong(), handler.toLong())).toULong()
}

public fun raise(signum: CInt): CInt {
    return LibcDynamicFfi.invoke("raise", -1, longArrayOf(signum.toLong())).toInt()
}

public fun clock(): ClockT {
    return LibcDynamicFfi.invoke("clock", -1, longArrayOf()).toInt()
}

public fun ctime(sourceTime: TimeT?): COpaquePointer? {
    val __slot_0 = if (sourceTime == null) 0L else LibcDynamicFfi.allocScalarSlot(sourceTime)
    try {
        val rawRet = LibcDynamicFfi.invoke("ctime", -1, longArrayOf(__slot_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble {
    return LibcDynamicFfi.invokeFp("difftime", 0, false, longArrayOf(timeEnd, timeStart))
}

public fun gmtimeS(destTime: Tm?, srcTime: TimeT?): CInt {
    val __slot_1 = if (srcTime == null) 0L else LibcDynamicFfi.allocScalarSlot(srcTime)
    try {
        return LibcDynamicFfi.invoke("_gmtime64_s", -1, longArrayOf(destTime?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun getDaylight(hours: CInt?): ErrnoT {
    val __slot_0 = if (hours == null) 0L else LibcDynamicFfi.allocScalarSlot(hours.toLong())
    try {
        return LibcDynamicFfi.invoke("_get_daylight", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun getDstbias(seconds: CLong?): ErrnoT {
    val __slot_0 = if (seconds == null) 0L else LibcDynamicFfi.allocScalarSlot(seconds)
    try {
        return LibcDynamicFfi.invoke("_get_dstbias", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun getTimezone(seconds: CLong?): ErrnoT {
    val __slot_0 = if (seconds == null) 0L else LibcDynamicFfi.allocScalarSlot(seconds)
    try {
        return LibcDynamicFfi.invoke("_get_timezone", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun getTzname(pReturnValue: ULong?, timeZoneName: COpaquePointer?, sizeInBytes: SizeT, index: CInt): ErrnoT {
    val __slot_0 = if (pReturnValue == null) 0L else LibcDynamicFfi.allocScalarSlot(pReturnValue.toLong())
    try {
        return LibcDynamicFfi.invoke("_get_tzname", -1, longArrayOf(__slot_0, timeZoneName?.value ?: 0L, sizeInBytes.toLong(), index.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun localtimeS(tmDest: Tm?, sourceTime: TimeT?): ErrnoT {
    val __slot_1 = if (sourceTime == null) 0L else LibcDynamicFfi.allocScalarSlot(sourceTime)
    try {
        return LibcDynamicFfi.invoke("_localtime64_s", -1, longArrayOf(tmDest?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun time(destTime: TimeT?): TimeT {
    val __slot_0 = if (destTime == null) 0L else LibcDynamicFfi.allocScalarSlot(destTime)
    try {
        return LibcDynamicFfi.invoke("_time64", -1, longArrayOf(__slot_0))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun tzset() {
    LibcDynamicFfi.invoke("_tzset", -1, longArrayOf())
}

public fun chmod(path: String?, mode: CInt): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("_chmod", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun wchmod(path: UShort?, mode: CInt): CInt {
    val __slot_0 = if (path == null) 0L else LibcDynamicFfi.allocScalarSlot(path.toLong())
    try {
        return LibcDynamicFfi.invoke("_wchmod", -1, longArrayOf(__slot_0, mode.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun mkdir(path: String?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("_mkdir", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun wrmdir(path: UShort?): CInt {
    val __slot_0 = if (path == null) 0L else LibcDynamicFfi.allocScalarSlot(path.toLong())
    try {
        return LibcDynamicFfi.invoke("_wrmdir", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun fstat(fildes: CInt, buf: Stat?): CInt {
    return LibcDynamicFfi.invoke("_fstat64", -1, longArrayOf(fildes.toLong(), buf?.value ?: 0L)).toInt()
}

public fun stat(path: String?, buf: Stat?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("_stat64", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun wstat(path: UShort?, buf: Stat?): CInt {
    val __slot_0 = if (path == null) 0L else LibcDynamicFfi.allocScalarSlot(path.toLong())
    try {
        return LibcDynamicFfi.invoke("_wstat64", -1, longArrayOf(__slot_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun wutime(file: UShort?, buf: Utimbuf?): CInt {
    val __slot_0 = if (file == null) 0L else LibcDynamicFfi.allocScalarSlot(file.toLong())
    try {
        return LibcDynamicFfi.invoke("_wutime64", -1, longArrayOf(__slot_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun popen(command: String?, mode: String?): FILE? {
    val __cstr_0 = if (command == null) 0L else LibcDynamicFfi.allocUtf8CString(command)
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("_popen", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun pclose(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("_pclose", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun fdopen(fd: CInt, mode: String?): FILE? {
    val __cstr_1 = if (mode == null) 0L else LibcDynamicFfi.allocUtf8CString(mode)
    try {
        val rawRet = LibcDynamicFfi.invoke("_fdopen", -1, longArrayOf(fd.toLong(), __cstr_1))
        return if (rawRet == 0L) null else FILE(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun fileno(stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("_fileno", -1, longArrayOf(stream?.handle ?: 0L)).toInt()
}

public fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("_open", 2, longArrayOf(__cstr_0, oflag.toLong()) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun wopen(path: UShort?, oflag: CInt, vararg variadicArgs: Long): CInt {
    val __slot_0 = if (path == null) 0L else LibcDynamicFfi.allocScalarSlot(path.toLong())
    try {
        return LibcDynamicFfi.invoke("_wopen", 2, longArrayOf(__slot_0, oflag.toLong()) + variadicArgs).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun creat(path: String?, mode: CInt): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("_creat", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun access(path: String?, amode: CInt): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("_access", -1, longArrayOf(__cstr_0, amode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun chdir(dir: String?): CInt {
    val __cstr_0 = if (dir == null) 0L else LibcDynamicFfi.allocUtf8CString(dir)
    try {
        return LibcDynamicFfi.invoke("_chdir", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun close(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("_close", -1, longArrayOf(fd.toLong())).toInt()
}

public fun dup(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("_dup", -1, longArrayOf(fd.toLong())).toInt()
}

public fun dup2(src: CInt, dst: CInt): CInt {
    return LibcDynamicFfi.invoke("_dup2", -1, longArrayOf(src.toLong(), dst.toLong())).toInt()
}

public fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (arg0 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg0)
    try {
        return LibcDynamicFfi.invoke("_execl", 2, longArrayOf(__cstr_0, __cstr_1) + variadicArgs)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wexecl(path: UShort?, arg0: UShort?, vararg variadicArgs: Long): IntptrT {
    val __slot_0 = if (path == null) 0L else LibcDynamicFfi.allocScalarSlot(path.toLong())
    val __slot_1 = if (arg0 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg0.toLong())
    try {
        return LibcDynamicFfi.invoke("_wexecl", 2, longArrayOf(__slot_0, __slot_1) + variadicArgs)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (arg0 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg0)
    try {
        return LibcDynamicFfi.invoke("_execle", 2, longArrayOf(__cstr_0, __cstr_1) + variadicArgs)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wexecle(path: UShort?, arg0: UShort?, vararg variadicArgs: Long): IntptrT {
    val __slot_0 = if (path == null) 0L else LibcDynamicFfi.allocScalarSlot(path.toLong())
    val __slot_1 = if (arg0 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg0.toLong())
    try {
        return LibcDynamicFfi.invoke("_wexecle", 2, longArrayOf(__slot_0, __slot_1) + variadicArgs)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun execlp(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (arg0 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg0)
    try {
        return LibcDynamicFfi.invoke("_execlp", 2, longArrayOf(__cstr_0, __cstr_1) + variadicArgs)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wexeclp(path: UShort?, arg0: UShort?, vararg variadicArgs: Long): IntptrT {
    val __slot_0 = if (path == null) 0L else LibcDynamicFfi.allocScalarSlot(path.toLong())
    val __slot_1 = if (arg0 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg0.toLong())
    try {
        return LibcDynamicFfi.invoke("_wexeclp", 2, longArrayOf(__slot_0, __slot_1) + variadicArgs)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun execlpe(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_1 = if (arg0 == null) 0L else LibcDynamicFfi.allocUtf8CString(arg0)
    try {
        return LibcDynamicFfi.invoke("_execlpe", 2, longArrayOf(__cstr_0, __cstr_1) + variadicArgs)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wexeclpe(path: UShort?, arg0: UShort?, vararg variadicArgs: Long): IntptrT {
    val __slot_0 = if (path == null) 0L else LibcDynamicFfi.allocScalarSlot(path.toLong())
    val __slot_1 = if (arg0 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg0.toLong())
    try {
        return LibcDynamicFfi.invoke("_wexeclpe", 2, longArrayOf(__slot_0, __slot_1) + variadicArgs)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

// DIFF(main): changed to `intptrT` in e77f551de9
public fun execv(prog: String?, argv: COpaquePointer?): IntptrT {
    val __cstr_0 = if (prog == null) 0L else LibcDynamicFfi.allocUtf8CString(prog)
    try {
        return LibcDynamicFfi.invoke("_execv", -1, longArrayOf(__cstr_0, argv?.value ?: 0L))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    val __cstr_0 = if (prog == null) 0L else LibcDynamicFfi.allocUtf8CString(prog)
    try {
        return LibcDynamicFfi.invoke("_execve", -1, longArrayOf(__cstr_0, argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun execvp(c: String?, argv: COpaquePointer?): CInt {
    val __cstr_0 = if (c == null) 0L else LibcDynamicFfi.allocUtf8CString(c)
    try {
        return LibcDynamicFfi.invoke("_execvp", -1, longArrayOf(__cstr_0, argv?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    val __cstr_0 = if (c == null) 0L else LibcDynamicFfi.allocUtf8CString(c)
    try {
        return LibcDynamicFfi.invoke("_execvpe", -1, longArrayOf(__cstr_0, argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun wexecv(prog: UShort?, argv: COpaquePointer?): IntptrT {
    val __slot_0 = if (prog == null) 0L else LibcDynamicFfi.allocScalarSlot(prog.toLong())
    try {
        return LibcDynamicFfi.invoke("_wexecv", -1, longArrayOf(__slot_0, argv?.value ?: 0L))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun wexecve(prog: UShort?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT {
    val __slot_0 = if (prog == null) 0L else LibcDynamicFfi.allocScalarSlot(prog.toLong())
    try {
        return LibcDynamicFfi.invoke("_wexecve", -1, longArrayOf(__slot_0, argv?.value ?: 0L, envp?.value ?: 0L))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun wexecvp(c: UShort?, argv: COpaquePointer?): IntptrT {
    val __slot_0 = if (c == null) 0L else LibcDynamicFfi.allocScalarSlot(c.toLong())
    try {
        return LibcDynamicFfi.invoke("_wexecvp", -1, longArrayOf(__slot_0, argv?.value ?: 0L))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun wexecvpe(c: UShort?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT {
    val __slot_0 = if (c == null) 0L else LibcDynamicFfi.allocScalarSlot(c.toLong())
    try {
        return LibcDynamicFfi.invoke("_wexecvpe", -1, longArrayOf(__slot_0, argv?.value ?: 0L, envp?.value ?: 0L))
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun getcwd(buf: COpaquePointer?, size: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("_getcwd", -1, longArrayOf(buf?.value ?: 0L, size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getpid(): CInt {
    return LibcDynamicFfi.invoke("_getpid", -1, longArrayOf()).toInt()
}

public fun isatty(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("_isatty", -1, longArrayOf(fd.toLong())).toInt()
}

public fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong {
    return LibcDynamicFfi.invoke("_lseek", -1, longArrayOf(fd.toLong(), offset, origin.toLong()))
}

public fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong {
    return LibcDynamicFfi.invoke("_lseeki64", -1, longArrayOf(fd.toLong(), offset, origin.toLong()))
}

public fun pipe(fds: CInt?, psize: CUint, textmode: CInt): CInt {
    val __slot_0 = if (fds == null) 0L else LibcDynamicFfi.allocScalarSlot(fds.toLong())
    try {
        return LibcDynamicFfi.invoke("_pipe", -1, longArrayOf(__slot_0, psize.toLong(), textmode.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun read(fd: CInt, buf: COpaquePointer?, count: CUint): CInt {
    return LibcDynamicFfi.invoke("_read", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, count.toLong())).toInt()
}

public fun rmdir(path: String?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("_rmdir", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun unlink(c: String?): CInt {
    val __cstr_0 = if (c == null) 0L else LibcDynamicFfi.allocUtf8CString(c)
    try {
        return LibcDynamicFfi.invoke("_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun write(fd: CInt, buf: COpaquePointer?, count: CUint): CInt {
    return LibcDynamicFfi.invoke("_write", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, count.toLong())).toInt()
}

public fun commit(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("_commit", -1, longArrayOf(fd.toLong())).toInt()
}

public fun getOsfhandle(fd: CInt): IntptrT {
    return LibcDynamicFfi.invoke("_get_osfhandle", -1, longArrayOf(fd.toLong()))
}

public fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("_open_osfhandle", -1, longArrayOf(osfhandle, flags.toLong())).toInt()
}

public fun setlocale(category: CInt, locale: String?): COpaquePointer? {
    val __cstr_1 = if (locale == null) 0L else LibcDynamicFfi.allocUtf8CString(locale)
    try {
        val rawRet = LibcDynamicFfi.invoke("setlocale", -1, longArrayOf(category.toLong(), __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wsetlocale(category: CInt, locale: UShort?): UShort? {
    val __slot_1 = if (locale == null) 0L else LibcDynamicFfi.allocScalarSlot(locale.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("_wsetlocale", -1, longArrayOf(category.toLong(), __slot_1))
        return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 2).toUShort()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun alignedMalloc(size: SizeT, alignment: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("_aligned_malloc", -1, longArrayOf(size.toLong(), alignment.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun alignedFree(ptr: COpaquePointer?) {
    LibcDynamicFfi.invoke("_aligned_free", -1, longArrayOf(ptr?.value ?: 0L))
}

public fun alignedRealloc(memblock: COpaquePointer?, size: SizeT, alignment: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("_aligned_realloc", -1, longArrayOf(memblock?.value ?: 0L, size.toLong(), alignment.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun putenv(envstring: String?): CInt {
    val __cstr_0 = if (envstring == null) 0L else LibcDynamicFfi.allocUtf8CString(envstring)
    try {
        return LibcDynamicFfi.invoke("_putenv", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun wputenv(envstring: UShort?): CInt {
    val __slot_0 = if (envstring == null) 0L else LibcDynamicFfi.allocScalarSlot(envstring.toLong())
    try {
        return LibcDynamicFfi.invoke("_wputenv", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun putenvS(envstring: String?, valueString: String?): ErrnoT {
    val __cstr_0 = if (envstring == null) 0L else LibcDynamicFfi.allocUtf8CString(envstring)
    val __cstr_1 = if (valueString == null) 0L else LibcDynamicFfi.allocUtf8CString(valueString)
    try {
        return LibcDynamicFfi.invoke("_putenv_s", -1, longArrayOf(__cstr_0, __cstr_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun wputenvS(envstring: UShort?, valueString: UShort?): ErrnoT {
    val __slot_0 = if (envstring == null) 0L else LibcDynamicFfi.allocScalarSlot(envstring.toLong())
    val __slot_1 = if (valueString == null) 0L else LibcDynamicFfi.allocScalarSlot(valueString.toLong())
    try {
        return LibcDynamicFfi.invoke("_wputenv_s", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun listen(s: Socket, backlog: CInt): CInt {
    return LibcDynamicFfi.invoke("listen", -1, longArrayOf(s.toLong(), backlog.toLong())).toInt()
}

public fun accept(s: Socket, addr: Sockaddr?, addrlen: CInt?): Socket {
    val __slot_2 = if (addrlen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrlen.toLong())
    try {
        return LibcDynamicFfi.invoke("accept", -1, longArrayOf(s.toLong(), addr?.value ?: 0L, __slot_2)).toULong()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun bind(s: Socket, name: Sockaddr?, namelen: CInt): CInt {
    return LibcDynamicFfi.invoke("bind", -1, longArrayOf(s.toLong(), name?.value ?: 0L, namelen.toLong())).toInt()
}

public fun connect(s: Socket, name: Sockaddr?, namelen: CInt): CInt {
    return LibcDynamicFfi.invoke("connect", -1, longArrayOf(s.toLong(), name?.value ?: 0L, namelen.toLong())).toInt()
}

public fun getpeername(s: Socket, name: Sockaddr?, nameln: CInt?): CInt {
    val __slot_2 = if (nameln == null) 0L else LibcDynamicFfi.allocScalarSlot(nameln.toLong())
    try {
        return LibcDynamicFfi.invoke("getpeername", -1, longArrayOf(s.toLong(), name?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun getsockname(s: Socket, name: Sockaddr?, nameln: CInt?): CInt {
    val __slot_2 = if (nameln == null) 0L else LibcDynamicFfi.allocScalarSlot(nameln.toLong())
    try {
        return LibcDynamicFfi.invoke("getsockname", -1, longArrayOf(s.toLong(), name?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: CInt?): CInt {
    val __slot_4 = if (optlen == null) 0L else LibcDynamicFfi.allocScalarSlot(optlen.toLong())
    try {
        return LibcDynamicFfi.invoke("getsockopt", -1, longArrayOf(s.toLong(), level.toLong(), optname.toLong(), optval?.value ?: 0L, __slot_4)).toInt()
    } finally {
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun recvfrom(s: Socket, buf: COpaquePointer?, len: CInt, flags: CInt, from: Sockaddr?, fromlen: CInt?): CInt {
    val __slot_5 = if (fromlen == null) 0L else LibcDynamicFfi.allocScalarSlot(fromlen.toLong())
    try {
        return LibcDynamicFfi.invoke("recvfrom", -1, longArrayOf(s.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong(), from?.value ?: 0L, __slot_5)).toInt()
    } finally {
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun sendto(s: Socket, buf: String?, len: CInt, flags: CInt, to: Sockaddr?, tolen: CInt): CInt {
    val __cstr_1 = if (buf == null) 0L else LibcDynamicFfi.allocUtf8CString(buf)
    try {
        return LibcDynamicFfi.invoke("sendto", -1, longArrayOf(s.toLong(), __cstr_1, len.toLong(), flags.toLong(), to?.value ?: 0L, tolen.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: String?, optlen: CInt): CInt {
    val __cstr_3 = if (optval == null) 0L else LibcDynamicFfi.allocUtf8CString(optval)
    try {
        return LibcDynamicFfi.invoke("setsockopt", -1, longArrayOf(s.toLong(), level.toLong(), optname.toLong(), __cstr_3, optlen.toLong())).toInt()
    } finally {
        if (__cstr_3 != 0L) LibcDynamicFfi.freeMem(__cstr_3)
    }
}

public fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket {
    return LibcDynamicFfi.invoke("socket", -1, longArrayOf(af.toLong(), socketType.toLong(), protocol.toLong())).toULong()
}
