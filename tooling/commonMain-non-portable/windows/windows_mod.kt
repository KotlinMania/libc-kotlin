// port-lint: source windows/windows_mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

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

// Special handling for all print and scan type functions because of https://github.com/rust-lang/libc/issues/2860
public typealias TimeT = Long

public typealias OffT = Int

public typealias DevT = UInt

public typealias InoT = UShort

public sealed class Timezone {
}

public typealias Time64T = Long

public typealias Socket = io.github.kotlinmania.libc.UintptrT

// note this is the struct called stat64 in Windows. Not stat, nor stati64.
public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: UShort,
    public var stNlink: CShort,
    public var stUid: CShort,
    public var stGid: CShort,
    public var stRdev: DevT,
    public var stSize: Long,
    public var stAtime: Time64T,
    public var stMtime: Time64T,
    public var stCtime: Time64T,
)

// note that this is called utimbuf64 in Windows
public open class Utimbuf(public var actime: Time64T, public var modtime: Time64T)

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

public open class Timeval(public var tvSec: CLong, public var tvUsec: CLong)

public open class Timespec(public var tvSec: TimeT, public var tvNsec: CLong)

public open class Sockaddr(public var saFamily: CUshort, public var saData: List<CChar>)

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

public val SIG_DFL: io.github.kotlinmania.libc.SighandlerT = 0uL

public val SIG_IGN: io.github.kotlinmania.libc.SighandlerT = 1uL

public val SIG_GET: io.github.kotlinmania.libc.SighandlerT = 2uL

public val SIG_SGE: io.github.kotlinmania.libc.SighandlerT = 3uL

public val SIG_ACK: io.github.kotlinmania.libc.SighandlerT = 4uL

public val L_TMPNAM: CUint = 260u

public val TMP_MAX: CUint = 0x7fffffffu

public sealed class FILE {
}

public sealed class FposT {
}

public expect fun printf(format: String?, vararg variadicArgs: Long): CInt

public expect fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt

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

public expect fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?)

public expect fun qsortS(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortSComparCallback?, arg: COpaquePointer?)

public expect fun fopen(filename: String?, mode: String?): FILE?

public expect fun freopen(filename: String?, mode: String?, file: FILE?): FILE?

public expect fun fflush(file: FILE?): CInt

public expect fun fclose(file: FILE?): CInt

public expect fun remove(filename: String?): CInt

public expect fun rename(oldname: String?, newname: String?): CInt

public expect fun tmpfile(): FILE?

public expect fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt

public expect fun setbuf(stream: FILE?, buf: COpaquePointer?)

public expect fun getchar(): CInt

public expect fun putchar(c: CInt): CInt

public expect fun fgetc(stream: FILE?): CInt

public expect fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer?

public expect fun fputc(c: CInt, stream: FILE?): CInt

public expect fun fputs(s: String?, stream: FILE?): CInt

public expect fun puts(s: String?): CInt

public expect fun ungetc(c: CInt, stream: FILE?): CInt

public expect fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT

public expect fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT

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

public expect fun atoll(s: String?): CLonglong

public expect fun strtod(s: String?, endp: COpaquePointer?): CDouble

public expect fun strtof(s: String?, endp: COpaquePointer?): CFloat

public expect fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong

public expect fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong

public expect fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong

public expect fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong

public expect fun calloc(nobj: SizeT, size: SizeT): COpaquePointer?

public expect fun malloc(size: SizeT): COpaquePointer?

public expect fun msize(p: COpaquePointer?): SizeT

public expect fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun free(p: COpaquePointer?)

public expect fun abort(): Nothing

public expect fun exit(status: CInt): Nothing

public expect fun atexit(cb: AtexitCbCallback): CInt

public expect fun system(s: String?): CInt

public expect fun getenv(s: String?): COpaquePointer?

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

public expect fun strpbrk(cs: String?, ct: String?): COpaquePointer?

public expect fun strstr(cs: String?, ct: String?): COpaquePointer?

public expect fun strlen(cs: String?): SizeT

public expect fun strnlen(cs: String?, maxlen: SizeT): SizeT

public expect fun strerror(n: CInt): COpaquePointer?

public expect fun strtok(s: COpaquePointer?, t: String?): COpaquePointer?

public expect fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT

public expect fun wcslen(buf: UShort?): SizeT

public expect fun wcsnlen(str: UShort?, numberOfElements: SizeT): SizeT

public expect fun wcstombs(dest: COpaquePointer?, src: UShort?, n: SizeT): SizeT

public expect fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

public expect fun raise(signum: CInt): CInt

public expect fun clock(): ClockT

public expect fun ctime(sourceTime: Long?): COpaquePointer?

public expect fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble

public expect fun gmtimeS(destTime: Tm?, srcTime: Long?): CInt

public expect fun getDaylight(hours: CInt?): ErrnoT

public expect fun getDstbias(seconds: CLong?): ErrnoT

public expect fun getTimezone(seconds: CLong?): ErrnoT

public expect fun getTzname(pReturnValue: ULong?, timeZoneName: COpaquePointer?, sizeInBytes: SizeT, index: CInt): ErrnoT

public expect fun localtimeS(tmDest: Tm?, sourceTime: Long?): io.github.kotlinmania.libc.ErrnoT

public expect fun time(destTime: Long?): TimeT

public expect fun tzset()

public expect fun chmod(path: String?, mode: CInt): CInt

public expect fun wchmod(path: UShort?, mode: CInt): CInt

public expect fun mkdir(path: String?): CInt

public expect fun wrmdir(path: UShort?): CInt

public expect fun fstat(fildes: CInt, buf: Stat?): CInt

public expect fun stat(path: String?, buf: Stat?): CInt

public expect fun wstat(path: UShort?, buf: Stat?): CInt

public expect fun wutime(file: UShort?, buf: Utimbuf?): CInt

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun pclose(stream: FILE?): CInt

public expect fun fdopen(fd: CInt, mode: String?): FILE?

public expect fun fileno(stream: FILE?): CInt

public expect fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun wopen(path: UShort?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun creat(path: String?, mode: CInt): CInt

public expect fun access(path: String?, amode: CInt): CInt

public expect fun chdir(dir: String?): CInt

public expect fun close(fd: CInt): CInt

public expect fun dup(fd: CInt): CInt

public expect fun dup2(src: CInt, dst: CInt): CInt

public expect fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT

public expect fun wexecl(path: UShort?, arg0: UShort?, vararg variadicArgs: Long): IntptrT

public expect fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT

public expect fun wexecle(path: UShort?, arg0: UShort?, vararg variadicArgs: Long): IntptrT

public expect fun execlp(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT

public expect fun wexeclp(path: UShort?, arg0: UShort?, vararg variadicArgs: Long): IntptrT

public expect fun execlpe(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT

public expect fun wexeclpe(path: UShort?, arg0: UShort?, vararg variadicArgs: Long): IntptrT

// DIFF(main): changed to `intptrT` in e77f551de9
public expect fun execv(prog: String?, argv: COpaquePointer?): IntptrT

public expect fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun execvp(c: String?, argv: COpaquePointer?): CInt

public expect fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun wexecv(prog: UShort?, argv: COpaquePointer?): IntptrT

public expect fun wexecve(prog: UShort?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT

public expect fun wexecvp(c: UShort?, argv: COpaquePointer?): IntptrT

public expect fun wexecvpe(c: UShort?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT

public expect fun getcwd(buf: COpaquePointer?, size: CInt): COpaquePointer?

public expect fun getpid(): CInt

public expect fun isatty(fd: CInt): CInt

public expect fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong

public expect fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong

public expect fun pipe(fds: CInt?, psize: CUint, textmode: CInt): CInt

public expect fun read(fd: CInt, buf: COpaquePointer?, count: CUint): CInt

public expect fun rmdir(path: String?): CInt

public expect fun unlink(c: String?): CInt

public expect fun write(fd: CInt, buf: COpaquePointer?, count: CUint): CInt

public expect fun commit(fd: CInt): CInt

public expect fun getOsfhandle(fd: CInt): IntptrT

public expect fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt

public expect fun setlocale(category: CInt, locale: String?): COpaquePointer?

public expect fun wsetlocale(category: CInt, locale: UShort?): UShort?

public expect fun alignedMalloc(size: SizeT, alignment: SizeT): COpaquePointer?

public expect fun alignedFree(ptr: COpaquePointer?)

public expect fun alignedRealloc(memblock: COpaquePointer?, size: SizeT, alignment: SizeT): COpaquePointer?

public expect fun putenv(envstring: String?): CInt

public expect fun wputenv(envstring: UShort?): CInt

public expect fun putenvS(envstring: String?, valueString: String?): io.github.kotlinmania.libc.ErrnoT

public expect fun wputenvS(envstring: UShort?, valueString: UShort?): io.github.kotlinmania.libc.ErrnoT

public expect fun listen(s: Socket, backlog: CInt): CInt

public expect fun accept(s: Socket, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CInt?): Socket

public expect fun bind(s: Socket, name: io.github.kotlinmania.libc.Sockaddr?, namelen: CInt): CInt

public expect fun connect(s: Socket, name: io.github.kotlinmania.libc.Sockaddr?, namelen: CInt): CInt

public expect fun getpeername(s: Socket, name: io.github.kotlinmania.libc.Sockaddr?, nameln: CInt?): CInt

public expect fun getsockname(s: Socket, name: io.github.kotlinmania.libc.Sockaddr?, nameln: CInt?): CInt

public expect fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: CInt?): CInt

public expect fun recvfrom(s: Socket, buf: COpaquePointer?, len: CInt, flags: CInt, from: io.github.kotlinmania.libc.Sockaddr?, fromlen: CInt?): CInt

public expect fun sendto(s: Socket, buf: String?, len: CInt, flags: CInt, to: io.github.kotlinmania.libc.Sockaddr?, tolen: CInt): CInt

public expect fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: String?, optlen: CInt): CInt

public expect fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket
