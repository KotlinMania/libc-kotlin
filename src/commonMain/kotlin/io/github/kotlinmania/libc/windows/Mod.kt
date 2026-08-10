// port-lint: source windows/mod.rs
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

public expect fun printf(format: String?, vararg args: Any?): CInt

public expect fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt

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

public expect fun qsort(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?)

public expect fun qsortS(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?, arg: COpaquePointer?)

public expect fun fopen(filename: String?, mode: String?): FILE?

public expect fun freopen(filename: String?, mode: String?, file: FILE?): FILE?

public expect fun fflush(file: FILE?): CInt

public expect fun fclose(file: FILE?): CInt

public expect fun remove(filename: String?): CInt

public expect fun rename(oldname: String?, newname: String?): CInt

public expect fun tmpfile(): FILE?

public expect fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt

public expect fun setbuf(stream: FILE?, buf: String?)

public expect fun getchar(): CInt

public expect fun putchar(c: CInt): CInt

public expect fun fgetc(stream: FILE?): CInt

public expect fun fgets(buf: String?, n: CInt, stream: FILE?): String?

public expect fun fputc(c: CInt, stream: FILE?): CInt

public expect fun fputs(s: String?, stream: FILE?): CInt

public expect fun puts(s: String?): CInt

public expect fun ungetc(c: CInt, stream: FILE?): CInt

public expect fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong

public expect fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong

public expect fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt

public expect fun ftell(stream: FILE?): CLong

public expect fun rewind(stream: FILE?)

public expect fun fgetpos(stream: FILE?, ptr: FposT?): CInt

public expect fun fsetpos(stream: FILE?, ptr: FposT?): CInt

public expect fun feof(stream: FILE?): CInt

public expect fun ferror(stream: FILE?): CInt

public expect fun perror(s: String?)

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

public expect fun calloc(nobj: ULong, size: ULong): COpaquePointer?

public expect fun malloc(size: ULong): COpaquePointer?

public expect fun msize(p: COpaquePointer?): ULong

public expect fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer?

public expect fun free(p: COpaquePointer?)

public expect fun abort(): Nothing

public expect fun exit(status: CInt): Nothing

public expect fun atexit(cb: (() -> Unit)?): CInt

public expect fun system(s: String?): CInt

public expect fun getenv(s: String?): String?

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

public expect fun strpbrk(cs: String?, ct: String?): String?

public expect fun strstr(cs: String?, ct: String?): String?

public expect fun strlen(cs: String?): ULong

public expect fun strnlen(cs: String?, maxlen: ULong): ULong

public expect fun strerror(n: CInt): String?

public expect fun strtok(s: String?, t: String?): String?

public expect fun strxfrm(s: String?, ct: String?, n: ULong): ULong

public expect fun wcslen(buf: WcharT?): ULong

public expect fun wcsnlen(str: WcharT?, numberOfElements: ULong): ULong

public expect fun wcstombs(dest: String?, src: WcharT?, n: ULong): ULong

public expect fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer?

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer?

public expect fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUInt)

public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

public expect fun raise(signum: CInt): CInt

public expect fun clock(): ClockT

public expect fun ctime(sourceTime: TimeT?): String?

public expect fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble

public expect fun gmtimeS(destTime: Tm?, srcTime: TimeT?): CInt

public expect fun getDaylight(hours: CInt?): ErrnoT

public expect fun getDstbias(seconds: CLong?): ErrnoT

public expect fun getTimezone(seconds: CLong?): ErrnoT

public expect fun getTzname(pReturnValue: ULong?, timeZoneName: String?, sizeInBytes: ULong, index: CInt): ErrnoT

public expect fun localtimeS(tmDest: Tm?, sourceTime: TimeT?): ErrnoT

public expect fun time(destTime: TimeT?): TimeT

public expect fun tzset()

public expect fun chmod(path: String?, mode: CInt): CInt

public expect fun wchmod(path: WcharT?, mode: CInt): CInt

public expect fun mkdir(path: String?): CInt

public expect fun wrmdir(path: WcharT?): CInt

public expect fun fstat(fildes: CInt, buf: Stat?): CInt

public expect fun stat(path: String?, buf: Stat?): CInt

public expect fun wstat(path: WcharT?, buf: Stat?): CInt

public expect fun wutime(file: WcharT?, buf: Utimbuf?): CInt

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun pclose(stream: FILE?): CInt

public expect fun fdopen(fd: CInt, mode: String?): FILE?

public expect fun fileno(stream: FILE?): CInt

public expect fun open(path: String?, oflag: CInt, vararg args: Any?): CInt

public expect fun wopen(path: WcharT?, oflag: CInt, vararg args: Any?): CInt

public expect fun creat(path: String?, mode: CInt): CInt

public expect fun access(path: String?, amode: CInt): CInt

public expect fun chdir(dir: String?): CInt

public expect fun close(fd: CInt): CInt

public expect fun dup(fd: CInt): CInt

public expect fun dup2(src: CInt, dst: CInt): CInt

public expect fun execl(path: String?, arg0: String?, vararg args: Any?): IntptrT

public expect fun wexecl(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT

public expect fun execle(path: String?, arg0: String?, vararg args: Any?): IntptrT

public expect fun wexecle(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT

public expect fun execlp(path: String?, arg0: String?, vararg args: Any?): IntptrT

public expect fun wexeclp(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT

public expect fun execlpe(path: String?, arg0: String?, vararg args: Any?): IntptrT

public expect fun wexeclpe(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT

public expect fun execv(prog: String?, argv: COpaquePointer?): IntptrT

public expect fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun execvp(c: String?, argv: COpaquePointer?): CInt

public expect fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun wexecv(prog: WcharT?, argv: COpaquePointer?): IntptrT

public expect fun wexecve(prog: WcharT?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT

public expect fun wexecvp(c: WcharT?, argv: COpaquePointer?): IntptrT

public expect fun wexecvpe(c: WcharT?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT

public expect fun getcwd(buf: String?, size: CInt): String?

public expect fun getpid(): CInt

public expect fun isatty(fd: CInt): CInt

public expect fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong

public expect fun lseek64(fd: CInt, offset: CLongLong, origin: CInt): CLongLong

public expect fun pipe(fds: CInt?, psize: CUInt, textmode: CInt): CInt

public expect fun read(fd: CInt, buf: COpaquePointer?, count: CUInt): CInt

public expect fun rmdir(path: String?): CInt

public expect fun unlink(c: String?): CInt

public expect fun write(fd: CInt, buf: COpaquePointer?, count: CUInt): CInt

public expect fun commit(fd: CInt): CInt

public expect fun getOsfhandle(fd: CInt): IntptrT

public expect fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt

public expect fun setlocale(category: CInt, locale: String?): String?

public expect fun wsetlocale(category: CInt, locale: WcharT?): WcharT?

public expect fun alignedMalloc(size: ULong, alignment: ULong): COpaquePointer?

public expect fun alignedFree(ptr: COpaquePointer?)

public expect fun alignedRealloc(memblock: COpaquePointer?, size: ULong, alignment: ULong): COpaquePointer?

public expect fun putenv(envstring: String?): CInt

public expect fun wputenv(envstring: WcharT?): CInt

public expect fun putenvS(envstring: String?, valueString: String?): ErrnoT

public expect fun wputenvS(envstring: WcharT?, valueString: WcharT?): ErrnoT
