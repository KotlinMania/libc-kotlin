// port-lint: source libc/src/windows/mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

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

// Upstream uses cfg_if: time_t = i32 on 32-bit x86 GNU, i64 everywhere else.
// The 64-bit variant is the common case across modern Windows targets.
public typealias TimeT = Long
public typealias OffT = Int
public typealias DevT = UInt
public typealias InoT = UShort
public typealias Time64T = Long
public typealias SOCKET = UintptrT

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stMode: UShort,
    val stNlink: CShort,
    val stUid: CShort,
    val stGid: CShort,
    val stRdev: DevT,
    val stSize: Long,
    val stAtime: Time64T,
    val stMtime: Time64T,
    val stCtime: Time64T,
)

public data class Utimbuf(
    val actime: Time64T,
    val modtime: Time64T,
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

public data class Timeval(
    val tvSec: CLong,
    val tvUsec: CLong,
)

public data class Timespec(
    val tvSec: TimeT,
    val tvNsec: CLong,
)

public data class Sockaddr(
    val saFamily: CUShort,
    val saData: ByteArray,
)

public const val INT_MIN: CInt = -2147483648
public const val INT_MAX: CInt = 2147483647
public const val EXIT_FAILURE: CInt = 1
public const val EXIT_SUCCESS: CInt = 0
public const val RAND_MAX: CInt = 32767
public const val EOF: CInt = -1
public const val SEEK_SET: CInt = 0
public const val SEEK_CUR: CInt = 1
public const val SEEK_END: CInt = 2
public const val _IOFBF: CInt = 0
public const val _IONBF: CInt = 4
public const val _IOLBF: CInt = 64
public const val BUFSIZ: CUInt = 512u
public const val FOPEN_MAX: CUInt = 20u
public const val FILENAME_MAX: CUInt = 260u
public const val O_RDONLY: CInt = 0x0000
public const val O_WRONLY: CInt = 0x0001
public const val O_RDWR: CInt = 0x0002
public const val O_APPEND: CInt = 0x0008
public const val O_CREAT: CInt = 0x0100
public const val O_TRUNC: CInt = 0x0200
public const val O_EXCL: CInt = 0x0400
public const val O_TEXT: CInt = 0x4000
public const val O_BINARY: CInt = 0x8000
public const val _O_WTEXT: CInt = 0x10000
public const val _O_U16TEXT: CInt = 0x20000
public const val _O_U8TEXT: CInt = 0x40000
public const val O_RAW: CInt = O_BINARY
public const val O_NOINHERIT: CInt = 0x0080
public const val O_TEMPORARY: CInt = 0x0040
public const val _O_SHORT_LIVED: CInt = 0x1000
public const val _O_OBTAIN_DIR: CInt = 0x2000
public const val O_SEQUENTIAL: CInt = 0x0020
public const val O_RANDOM: CInt = 0x0010
public const val S_IFCHR: CInt = 8192
public const val S_IFDIR: CInt = 16384
public const val S_IFREG: CInt = 32768
public const val S_IFMT: CInt = 61440
public const val S_IEXEC: CInt = 64
public const val S_IWRITE: CInt = 128
public const val S_IREAD: CInt = 256
public const val LC_ALL: CInt = 0
public const val LC_COLLATE: CInt = 1
public const val LC_CTYPE: CInt = 2
public const val LC_MONETARY: CInt = 3
public const val LC_NUMERIC: CInt = 4
public const val LC_TIME: CInt = 5
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
public const val EFBIG: CInt = 27
public const val ENOSPC: CInt = 28
public const val ESPIPE: CInt = 29
public const val EROFS: CInt = 30
public const val EMLINK: CInt = 31
public const val EPIPE: CInt = 32
public const val EDOM: CInt = 33
public const val ERANGE: CInt = 34
public const val EDEADLK: CInt = 36
public const val EDEADLOCK: CInt = 36
public const val ENAMETOOLONG: CInt = 38
public const val ENOLCK: CInt = 39
public const val ENOSYS: CInt = 40
public const val ENOTEMPTY: CInt = 41
public const val EILSEQ: CInt = 42
public const val STRUNCATE: CInt = 80
public const val EADDRINUSE: CInt = 100
public const val EADDRNOTAVAIL: CInt = 101
public const val EAFNOSUPPORT: CInt = 102
public const val EALREADY: CInt = 103
public const val EBADMSG: CInt = 104
public const val ECANCELED: CInt = 105
public const val ECONNABORTED: CInt = 106
public const val ECONNREFUSED: CInt = 107
public const val ECONNRESET: CInt = 108
public const val EDESTADDRREQ: CInt = 109
public const val EHOSTUNREACH: CInt = 110
public const val EIDRM: CInt = 111
public const val EINPROGRESS: CInt = 112
public const val EISCONN: CInt = 113
public const val ELOOP: CInt = 114
public const val EMSGSIZE: CInt = 115
public const val ENETDOWN: CInt = 116
public const val ENETRESET: CInt = 117
public const val ENETUNREACH: CInt = 118
public const val ENOBUFS: CInt = 119
public const val ENODATA: CInt = 120
public const val ENOLINK: CInt = 121
public const val ENOMSG: CInt = 122
public const val ENOPROTOOPT: CInt = 123
public const val ENOSR: CInt = 124
public const val ENOSTR: CInt = 125
public const val ENOTCONN: CInt = 126
public const val ENOTRECOVERABLE: CInt = 127
public const val ENOTSOCK: CInt = 128
public const val ENOTSUP: CInt = 129
public const val EOPNOTSUPP: CInt = 130
public const val EOVERFLOW: CInt = 132
public const val EOWNERDEAD: CInt = 133
public const val EPROTO: CInt = 134
public const val EPROTONOSUPPORT: CInt = 135
public const val EPROTOTYPE: CInt = 136
public const val ETIME: CInt = 137
public const val ETIMEDOUT: CInt = 138
public const val ETXTBSY: CInt = 139
public const val EWOULDBLOCK: CInt = 140
public const val SIGINT: CInt = 2
public const val SIGILL: CInt = 4
public const val SIGFPE: CInt = 8
public const val SIGSEGV: CInt = 11
public const val SIGTERM: CInt = 15
public const val SIGABRT: CInt = 22
public const val NSIG: CInt = 23
public const val SIG_ERR: CInt = -1
public const val SIG_DFL: SighandlerT = 0uL
public const val SIG_IGN: SighandlerT = 1uL
public const val SIG_GET: SighandlerT = 2uL
public const val SIG_SGE: SighandlerT = 3uL
public const val SIG_ACK: SighandlerT = 4uL
public const val L_tmpnam: CUInt = 260u
public const val TMP_MAX: CUInt = 0x7fffffffu

public fun printf(format: String?, vararg args: Any?): CInt = -1

public fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt = -1

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

public fun qsort(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?) { }

public fun qsortS(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?, arg: COpaquePointer?) { }

public fun fopen(filename: String?, mode: String?): FILE? = null

public fun freopen(filename: String?, mode: String?, file: FILE?): FILE? = null

public fun fflush(file: FILE?): CInt = -1

public fun fclose(file: FILE?): CInt = -1

public fun remove(filename: String?): CInt = -1

public fun rename(oldname: String?, newname: String?): CInt = -1

public fun tmpfile(): FILE? = null

public fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt = -1

public fun setbuf(stream: FILE?, buf: String?) { }

public fun getchar(): CInt = -1

public fun putchar(c: CInt): CInt = -1

public fun fgetc(stream: FILE?): CInt = -1

public fun fgets(buf: String?, n: CInt, stream: FILE?): String? = null

public fun fputc(c: CInt, stream: FILE?): CInt = -1

public fun fputs(s: String?, stream: FILE?): CInt = -1

public fun puts(s: String?): CInt = -1

public fun ungetc(c: CInt, stream: FILE?): CInt = -1

public fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong = 0uL

public fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong = 0uL

public fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt = -1

public fun ftell(stream: FILE?): CLong = -1L

public fun rewind(stream: FILE?) { }

public fun fgetpos(stream: FILE?, ptr: FposT?): CInt = -1

public fun fsetpos(stream: FILE?, ptr: FposT?): CInt = -1

public fun feof(stream: FILE?): CInt = -1

public fun ferror(stream: FILE?): CInt = -1

public fun perror(s: String?) { }

public fun atof(s: String?): CDouble = 0.0

public fun atoi(s: String?): CInt = -1

public fun atol(s: String?): CLong = -1L

public fun atoll(s: String?): CLongLong = -1L

public fun strtod(s: String?, endp: COpaquePointer?): CDouble = 0.0

public fun strtof(s: String?, endp: COpaquePointer?): CFloat = 0.0f

public fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong = -1L

public fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLongLong = -1L

public fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CULong = 0uL

public fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CULongLong = 0uL

public fun calloc(nobj: ULong, size: ULong): COpaquePointer? = null

public fun malloc(size: ULong): COpaquePointer? = null

public fun msize(p: COpaquePointer?): ULong = 0uL

public fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? = null

public fun free(p: COpaquePointer?) { }

public fun abort(): Nothing = throw UnsupportedOperationException()

public fun exit(status: CInt): Nothing = throw UnsupportedOperationException()

public fun atexit(cb: (() -> Unit)?): CInt = -1

public fun system(s: String?): CInt = -1

public fun getenv(s: String?): String? = null

public fun strcpy(dst: String?, src: String?): String? = null

public fun strncpy(dst: String?, src: String?, n: ULong): String? = null

public fun strcat(s: String?, ct: String?): String? = null

public fun strncat(s: String?, ct: String?, n: ULong): String? = null

public fun strcmp(cs: String?, ct: String?): CInt = -1

public fun strncmp(cs: String?, ct: String?, n: ULong): CInt = -1

public fun strcoll(cs: String?, ct: String?): CInt = -1

public fun strchr(cs: String?, c: CInt): String? = null

public fun strrchr(cs: String?, c: CInt): String? = null

public fun strspn(cs: String?, ct: String?): ULong = 0uL

public fun strcspn(cs: String?, ct: String?): ULong = 0uL

public fun strdup(cs: String?): String? = null

public fun strpbrk(cs: String?, ct: String?): String? = null

public fun strstr(cs: String?, ct: String?): String? = null

public fun strlen(cs: String?): ULong = 0uL

public fun strnlen(cs: String?, maxlen: ULong): ULong = 0uL

public fun strerror(n: CInt): String? = null

public fun strtok(s: String?, t: String?): String? = null

public fun strxfrm(s: String?, ct: String?, n: ULong): ULong = 0uL

public fun wcslen(buf: WcharT?): ULong = 0uL

public fun wcsnlen(str: WcharT?, numberOfElements: ULong): ULong = 0uL

public fun wcstombs(dest: String?, src: WcharT?, n: ULong): ULong = 0uL

public fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? = null

public fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt = -1

public fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? = null

public fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? = null

public fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? = null

public fun abs(i: CInt): CInt = -1

public fun labs(i: CLong): CLong = -1L

public fun rand(): CInt = -1

public fun srand(seed: CUInt) { }

public fun signal(signum: CInt, handler: SighandlerT): SighandlerT = throw UnsupportedOperationException("Not implemented on this platform")

public fun raise(signum: CInt): CInt = -1

public fun clock(): ClockT = -1

public fun ctime(sourceTime: TimeT?): String? = null

public fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble = 0.0

public fun gmtimeS(destTime: Tm?, srcTime: TimeT?): CInt = -1

public fun getDaylight(hours: CInt?): ErrnoT = -1

public fun getDstbias(seconds: CLong?): ErrnoT = -1

public fun getTimezone(seconds: CLong?): ErrnoT = -1

public fun getTzname(pReturnValue: ULong?, timeZoneName: String?, sizeInBytes: ULong, index: CInt): ErrnoT = -1

public fun localtimeS(tmDest: Tm?, sourceTime: TimeT?): ErrnoT = -1

public fun time(destTime: TimeT?): TimeT = -1L

public fun tzset() { }

public fun chmod(path: String?, mode: CInt): CInt = -1

public fun wchmod(path: WcharT?, mode: CInt): CInt = -1

public fun mkdir(path: String?): CInt = -1

public fun wrmdir(path: WcharT?): CInt = -1

public fun fstat(fildes: CInt, buf: Stat?): CInt = -1

public fun stat(path: String?, buf: Stat?): CInt = -1

public fun wstat(path: WcharT?, buf: Stat?): CInt = -1

public fun wutime(file: WcharT?, buf: Utimbuf?): CInt = -1

public fun popen(command: String?, mode: String?): FILE? = null

public fun pclose(stream: FILE?): CInt = -1

public fun fdopen(fd: CInt, mode: String?): FILE? = null

public fun fileno(stream: FILE?): CInt = -1

public fun open(path: String?, oflag: CInt, vararg args: Any?): CInt = -1

public fun wopen(path: WcharT?, oflag: CInt, vararg args: Any?): CInt = -1

public fun creat(path: String?, mode: CInt): CInt = -1

public fun access(path: String?, amode: CInt): CInt = -1

public fun chdir(dir: String?): CInt = -1

public fun close(fd: CInt): CInt = -1

public fun dup(fd: CInt): CInt = -1

public fun dup2(src: CInt, dst: CInt): CInt = -1

public fun execl(path: String?, arg0: String?, vararg args: Any?): IntptrT = -1L

public fun wexecl(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT = -1L

public fun execle(path: String?, arg0: String?, vararg args: Any?): IntptrT = -1L

public fun wexecle(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT = -1L

public fun execlp(path: String?, arg0: String?, vararg args: Any?): IntptrT = -1L

public fun wexeclp(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT = -1L

public fun execlpe(path: String?, arg0: String?, vararg args: Any?): IntptrT = -1L

public fun wexeclpe(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT = -1L

public fun execv(prog: String?, argv: COpaquePointer?): IntptrT = -1L

public fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt = -1

public fun execvp(c: String?, argv: COpaquePointer?): CInt = -1

public fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt = -1

public fun wexecv(prog: WcharT?, argv: COpaquePointer?): IntptrT = -1L

public fun wexecve(prog: WcharT?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT = -1L

public fun wexecvp(c: WcharT?, argv: COpaquePointer?): IntptrT = -1L

public fun wexecvpe(c: WcharT?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT = -1L

public fun getcwd(buf: String?, size: CInt): String? = null

public fun getpid(): CInt = -1

public fun isatty(fd: CInt): CInt = -1

public fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong = -1L

public fun lseek64(fd: CInt, offset: CLongLong, origin: CInt): CLongLong = -1L

public fun pipe(fds: CInt?, psize: CUInt, textmode: CInt): CInt = -1

public fun read(fd: CInt, buf: COpaquePointer?, count: CUInt): CInt = -1

public fun rmdir(path: String?): CInt = -1

public fun unlink(c: String?): CInt = -1

public fun write(fd: CInt, buf: COpaquePointer?, count: CUInt): CInt = -1

public fun commit(fd: CInt): CInt = -1

public fun getOsfhandle(fd: CInt): IntptrT = -1L

public fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt = -1

public fun setlocale(category: CInt, locale: String?): String? = null

public fun wsetlocale(category: CInt, locale: WcharT?): WcharT? = null

public fun alignedMalloc(size: ULong, alignment: ULong): COpaquePointer? = null

public fun alignedFree(ptr: COpaquePointer?) { }

public fun alignedRealloc(memblock: COpaquePointer?, size: ULong, alignment: ULong): COpaquePointer? = null

public fun putenv(envstring: String?): CInt = -1

public fun wputenv(envstring: WcharT?): CInt = -1

public fun putenvS(envstring: String?, valueString: String?): ErrnoT = -1

public fun wputenvS(envstring: WcharT?, valueString: WcharT?): ErrnoT = -1
