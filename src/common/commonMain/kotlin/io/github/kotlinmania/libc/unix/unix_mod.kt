// port-lint: source unix/unix_mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.ClockT
import io.github.kotlinmania.libc.DevT
import io.github.kotlinmania.libc.Dirent
import io.github.kotlinmania.libc.PthreadAttrT
import io.github.kotlinmania.libc.PthreadCondT
import io.github.kotlinmania.libc.PthreadCondattrT
import io.github.kotlinmania.libc.PthreadKeyT
import io.github.kotlinmania.libc.PthreadMutexT
import io.github.kotlinmania.libc.PthreadMutexattrT
import io.github.kotlinmania.libc.PthreadRwlockT
import io.github.kotlinmania.libc.PthreadRwlockattrT
import io.github.kotlinmania.libc.PthreadT
import io.github.kotlinmania.libc.SocklenT
import io.github.kotlinmania.libc.SpeedT
import io.github.kotlinmania.libc.Statvfs
import io.github.kotlinmania.libc.SusecondsT
import io.github.kotlinmania.libc.Termios
import io.github.kotlinmania.libc.Tm

// Definitions found commonly among almost all Unix derivatives
//
// More functions and definitions can be found in the more specific modules
// according to the platform in question.

public fun interface QsortComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?): CInt
}

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: COpaquePointer?)
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

public typealias PidT = Int

public typealias InAddrT = UInt

public typealias InPortT = UShort

public typealias SighandlerT = SizeT

public typealias CcT = CUchar

public typealias UidT = CUshort

public typealias GidT = CUshort

public open class DIR(val handle: Long = 0L)

public typealias LocaleT = COpaquePointer?

public open class Group(
    public var grName: COpaquePointer?,
    public var grPasswd: COpaquePointer?,
    public var grGid: io.github.kotlinmania.libc.GidT,
    public var grMem: COpaquePointer?,
)

public open class Utimbuf(public var actime: TimeT, public var modtime: TimeT)

public open class Timeval(public var tvSec: TimeT, public var tvUsec: SusecondsT)

public open class Timespec(
    public var tvSec: TimeT,
    public var tvNsec: CLong,
    public var pad0: UInt,
)

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
    public var reserved: List<CLong>,
)

public open class Ipv6Mreq(public var ipv6mrMultiaddr: In6Addr, public var ipv6mrInterface: CInt)

public open class Hostent(
    public var hName: COpaquePointer?,
    public var hAliases: COpaquePointer?,
    public var hAddrtype: CInt,
    public var hLength: CInt,
    public var hAddrList: COpaquePointer?,
)

public open class Iovec(public var iovBase: COpaquePointer?, public var iovLen: SizeT)

public open class Pollfd(
    public var fd: CInt,
    public var events: CShort,
    public var revents: CShort,
)

public open class Winsize(
    public var wsRow: CUshort,
    public var wsCol: CUshort,
    public var wsXpixel: CUshort,
    public var wsYpixel: CUshort,
)

public open class Linger(public var lOnoff: CInt, public var lLinger: CInt)

public open class Sigval(
    // Actually a union of an int and a void*
    public var sivalPtr: COpaquePointer?,
)

// <sys/time.h>
public open class Itimerval(public var itInterval: io.github.kotlinmania.libc.Timeval, public var itValue: io.github.kotlinmania.libc.Timeval)

// <sys/times.h>
public open class Tms(
    public var tmsUtime: ClockT,
    public var tmsStime: ClockT,
    public var tmsCutime: ClockT,
    public var tmsCstime: ClockT,
)

public open class Servent(
    public var sName: COpaquePointer?,
    public var sAliases: COpaquePointer?,
    public var sPort: CShort,
    public var sProto: COpaquePointer?,
)

public open class Protoent(
    public var pName: COpaquePointer?,
    public var pAliases: COpaquePointer?,
    public var pProto: CInt,
)

public open class In6Addr(public var s6Addr: List<UByte>)

public val INT_MIN: CInt = -2147483648

public val INT_MAX: CInt = 2147483647

public val SIG_DFL: SighandlerT = 0.toULong()

public val SIG_IGN: SighandlerT = 1.toULong()

public val SIG_ERR: SighandlerT = (0.inv()).toULong()

public val DT_UNKNOWN: UByte = 0u

public val DT_FIFO: UByte = 1u

public val DT_CHR: UByte = 2u

public val DT_DIR: UByte = 4u

public val DT_BLK: UByte = 6u

public val DT_REG: UByte = 8u

public val DT_LNK: UByte = 10u

public val DT_SOCK: UByte = 12u

public val FD_CLOEXEC: CInt = 0x1

public val USRQUOTA: CInt = 0

public val GRPQUOTA: CInt = 1

public val SIGIOT: CInt = 6

public val S_ISUID: ModeT = 2048u

public val S_ISGID: ModeT = 1024u

public val S_ISVTX: ModeT = 512u

public val IF_NAMESIZE: SizeT = 16uL

public val IFNAMSIZ: SizeT = IF_NAMESIZE

public val LOG_EMERG: CInt = 0

public val LOG_ALERT: CInt = 1

public val LOG_CRIT: CInt = 2

public val LOG_ERR: CInt = 3

public val LOG_WARNING: CInt = 4

public val LOG_NOTICE: CInt = 5

public val LOG_INFO: CInt = 6

public val LOG_DEBUG: CInt = 7

public val LOG_KERN: CInt = 0

public val LOG_USER: CInt = 1 shl 3

public val LOG_MAIL: CInt = 2 shl 3

public val LOG_DAEMON: CInt = 3 shl 3

public val LOG_AUTH: CInt = 4 shl 3

public val LOG_SYSLOG: CInt = 5 shl 3

public val LOG_LPR: CInt = 6 shl 3

public val LOG_NEWS: CInt = 7 shl 3

public val LOG_UUCP: CInt = 8 shl 3

public val LOG_LOCAL0: CInt = 16 shl 3

public val LOG_LOCAL1: CInt = 17 shl 3

public val LOG_LOCAL2: CInt = 18 shl 3

public val LOG_LOCAL3: CInt = 19 shl 3

public val LOG_LOCAL4: CInt = 20 shl 3

public val LOG_LOCAL5: CInt = 21 shl 3

public val LOG_LOCAL6: CInt = 22 shl 3

public val LOG_LOCAL7: CInt = 23 shl 3

public val LOG_PID: CInt = 0x01

public val LOG_CONS: CInt = 0x02

public val LOG_ODELAY: CInt = 0x04

public val LOG_NDELAY: CInt = 0x08

public val LOG_NOWAIT: CInt = 0x10

public val LOG_PRIMASK: CInt = 7

public val LOG_FACMASK: CInt = 0x3f8

public val PRIO_MIN: CInt = -20

public val PRIO_MAX: CInt = 20

public val IPPROTO_ICMP: CInt = 1

public val IPPROTO_ICMPV6: CInt = 58

public val IPPROTO_TCP: CInt = 6

public val IPPROTO_UDP: CInt = 17

public val IPPROTO_IP: CInt = 0

public val IPPROTO_IPV6: CInt = 41

public val INADDR_LOOPBACK: InAddrT = 2130706433u

public val INADDR_ANY: InAddrT = 0u

public val INADDR_BROADCAST: InAddrT = 4294967295u

public val INADDR_NONE: InAddrT = 4294967295u

public val IN6ADDR_LOOPBACK_INIT: In6Addr = Any(s6Addr = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1))

public val IN6ADDR_ANY_INIT: In6Addr = Any(s6Addr = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

public val ARPOP_REQUEST: UShort = 1u

public val ARPOP_REPLY: UShort = 2u

public val ATF_COM: CInt = 0x02

public val ATF_PERM: CInt = 0x04

public val ATF_PUBL: CInt = 0x08

public val ATF_USETRAILERS: CInt = 0x10

public val FNM_PERIOD: CInt = 1 shl 1

public val FNM_PERIOD1: CInt = 1 shl 2

public val FNM_NOMATCH: CInt = 1

public val FNM_CASEFOLD: CInt = 1 shl 3

public val FNM_CASEFOLD1: CInt = 1 shl 4

public val FNM_PATHNAME: CInt = 1 shl 1

public val FNM_PATHNAME1: CInt = 1 shl 0

public val FNM_NOESCAPE: CInt = 1 shl 0

public val FNM_NOESCAPE1: CInt = 1 shl 2

public val FNM_NOESCAPE2: CInt = 1 shl 3

public val FNM_NOESCAPE3: CInt = 1 shl 1

public expect val IN6ADDR_LOOPBACK: In6Addr

public expect val IN6ADDR_ANY: In6Addr

public sealed class FposT {
}

public open class FILE(val handle: Long = 0L)

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

public expect fun bsearch(key: COpaquePointer?, base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?): COpaquePointer?

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

public expect fun clearerr(stream: FILE?)

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

public expect fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun free(p: COpaquePointer?)

public expect fun abort(): Nothing

public expect fun exit(status: CInt): Nothing

public expect fun system(s: String?): CInt

public expect fun getenv(s: String?): COpaquePointer?

public expect fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer?

public expect fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer?

public expect fun stpcpy(dst: COpaquePointer?, src: String?): COpaquePointer?

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

public expect fun strtokR(s: COpaquePointer?, t: String?, p: COpaquePointer?): COpaquePointer?

public expect fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT

public expect fun strsignal(sig: CInt): COpaquePointer?

public expect fun wcslen(buf: WcharT?): SizeT

public expect fun wcstombs(dest: COpaquePointer?, src: WcharT?, n: SizeT): SizeT

public expect fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun wmemchr(cx: WcharT?, c: WcharT, n: SizeT): WcharT?

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun getpwnam(name: String?): Passwd?

public expect fun getpwuid(uid: io.github.kotlinmania.libc.UidT): Passwd?

public expect fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt

public expect fun printf(format: String?, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt

public expect fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt

public expect fun scanf(format: String?, vararg variadicArgs: Long): CInt

public expect fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt

public expect fun getcharUnlocked(): CInt

public expect fun putcharUnlocked(c: CInt): CInt

public expect fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt

public expect fun connect(socket: CInt, address: Sockaddr?, len: SocklenT): CInt

public expect fun listen(socket: CInt, backlog: CInt): CInt

public expect fun accept(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt

public expect fun getpeername(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt

public expect fun getsockname(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt

public expect fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt

public expect fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: CInt?): CInt

public expect fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT

public expect fun shutdown(socket: CInt, how: CInt): CInt

public expect fun chmod(path: String?, mode: ModeT): CInt

public expect fun fchmod(fd: CInt, mode: ModeT): CInt

public expect fun fstat(fildes: CInt, buf: Stat?): CInt

public expect fun mkdir(path: String?, mode: ModeT): CInt

public expect fun stat(path: String?, buf: Stat?): CInt

public expect fun pclose(stream: FILE?): CInt

public expect fun fdopen(fd: CInt, mode: String?): FILE?

public expect fun fileno(stream: FILE?): CInt

public expect fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun creat(path: String?, mode: ModeT): CInt

public expect fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun opendir(dirname: String?): DIR?

public expect fun readdir(dirp: DIR?): Dirent?

public expect fun closedir(dirp: DIR?): CInt

public expect fun rewinddir(dirp: DIR?)

public expect fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt

public expect fun fchown(fd: CInt, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT): CInt

public expect fun fchownat(dirfd: CInt, pathname: String?, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT, flags: CInt): CInt

public expect fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt

public expect fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt

public expect fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt

public expect fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt

public expect fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt

public expect fun access(path: String?, amode: CInt): CInt

public expect fun alarm(seconds: CUint): CUint

public expect fun chdir(dir: String?): CInt

public expect fun fchdir(dirfd: CInt): CInt

public expect fun chown(path: String?, uid: UidT, gid: GidT): CInt

public expect fun lchown(path: String?, uid: UidT, gid: GidT): CInt

public expect fun close(fd: CInt): CInt

public expect fun dup(fd: CInt): CInt

public expect fun dup2(src: CInt, dst: CInt): CInt

public expect fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): CInt

public expect fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): CInt

public expect fun execlp(file: String?, arg0: String?, vararg variadicArgs: Long): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execv(prog: String?, argv: COpaquePointer?): CInt

public expect fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun execvp(c: String?, argv: COpaquePointer?): CInt

public expect fun fork(): PidT

public expect fun fpathconf(filedes: CInt, name: CInt): CLong

public expect fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun getegid(): GidT

public expect fun geteuid(): UidT

public expect fun getgid(): GidT

public expect fun getgroups(ngroupsMax: CInt, groups: CUshort?): CInt

public expect fun getlogin(): COpaquePointer?

public expect fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt

public expect fun getpgid(pid: PidT): PidT

public expect fun getpgrp(): PidT

public expect fun getpid(): PidT

public expect fun getppid(): PidT

public expect fun getuid(): UidT

public expect fun isatty(fd: CInt): CInt

public expect fun link(src: String?, dst: String?): CInt

public expect fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT

public expect fun pathconf(path: String?, name: CInt): CLong

public expect fun pipe(fds: CInt?): CInt

public expect fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt

public expect fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer?

public expect fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT

public expect fun rmdir(path: String?): CInt

public expect fun seteuid(uid: UidT): CInt

public expect fun setegid(gid: GidT): CInt

public expect fun setgid(gid: GidT): CInt

public expect fun setpgid(pid: PidT, pgid: PidT): CInt

public expect fun setsid(): PidT

public expect fun setuid(uid: UidT): CInt

public expect fun setreuid(ruid: UidT, euid: UidT): CInt

public expect fun setregid(rgid: GidT, egid: GidT): CInt

public expect fun sleep(secs: CUint): CUint

public expect fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt

public expect fun tcgetpgrp(fd: CInt): PidT

public expect fun tcsetpgrp(fd: CInt, pgrp: io.github.kotlinmania.libc.PidT): CInt

public expect fun ttyname(fd: CInt): COpaquePointer?

public expect fun ttynameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun unlink(c: String?): CInt

public expect fun wait(status: CInt?): PidT

public expect fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT

public expect fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT

public expect fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT

public expect fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT

public expect fun umask(mask: ModeT): ModeT

public expect fun utime(file: String?, buf: Utimbuf?): CInt

public expect fun kill(pid: PidT, sig: CInt): CInt

public expect fun killpg(pgrp: PidT, sig: CInt): CInt

public expect fun mlock(addr: COpaquePointer?, len: SizeT): CInt

public expect fun munlock(addr: COpaquePointer?, len: SizeT): CInt

public expect fun mlockall(flags: CInt): CInt

public expect fun munlockall(): CInt

public expect fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer?

public expect fun munmap(addr: COpaquePointer?, len: SizeT): CInt

public expect fun ifNametoindex(ifname: String?): CUint

public expect fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer?

public expect fun lstat(path: String?, buf: Stat?): CInt

public expect fun fsync(fd: CInt): CInt

public expect fun setenv(name: String?, value: String?, overwrite: CInt): CInt

public expect fun unsetenv(name: String?): CInt

public expect fun symlink(path1: String?, path2: String?): CInt

public expect fun truncate(path: String?, length: OffT): CInt

public expect fun ftruncate(fd: CInt, length: OffT): CInt

public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

public expect fun getrusage(resource: CInt, usage: Rusage?): CInt

public expect fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer?

public expect fun times(buf: io.github.kotlinmania.libc.Tms?): ClockT

public expect fun pthreadSelf(): PthreadT

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

public expect fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt

public expect fun pthreadExit(value: COpaquePointer?): Nothing

public expect fun pthreadAttrInit(attr: PthreadAttrT?): CInt

public expect fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt

public expect fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt

public expect fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: SizeT): CInt

public expect fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt

public expect fun pthreadDetach(thread: PthreadT): CInt

public expect fun schedYield(): CInt

public expect fun pthreadKeyCreate(key: PthreadKeyT?, dtor: PthreadKeyCreateDtorCallback?): CInt

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

public expect fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt

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

public expect fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt

public expect fun raise(signum: CInt): CInt

public expect fun utimes(filename: String?, times: io.github.kotlinmania.libc.Timeval?): CInt

public expect fun dlopen(filename: String?, flag: CInt): COpaquePointer?

public expect fun dlerror(): COpaquePointer?

public expect fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer?

public expect fun dlclose(handle: COpaquePointer?): CInt

public expect fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt

public expect fun freeaddrinfo(res: Addrinfo?)

public expect fun hstrerror(errcode: CInt): COpaquePointer?

public expect fun gaiStrerror(errcode: CInt): COpaquePointer?

public expect fun resInit(): CInt

public expect fun gmtimeR(timeP: TimeT?, result: Tm?): Tm?

public expect fun localtimeR(timeP: TimeT?, result: Tm?): Tm?

public expect fun mktime(tm: Tm?): TimeT

public expect fun time(time: TimeT?): TimeT

public expect fun gmtime(timeP: TimeT?): Tm?

public expect fun localtime(timeP: TimeT?): Tm?

public expect fun difftime(time1: TimeT, time0: TimeT): CDouble

public expect fun timegm(tm: Tm?): TimeT

public expect fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun gethostname(name: COpaquePointer?, len: SizeT): CInt

public expect fun endservent()

public expect fun getservbyname(name: String?, proto: String?): Servent?

public expect fun getservbyport(port: CInt, proto: String?): Servent?

public expect fun getservent(): Servent?

public expect fun setservent(stayopen: CInt)

public expect fun getprotobyname(name: String?): Protoent?

public expect fun getprotobynumber(proto: CInt): Protoent?

public expect fun chroot(name: String?): CInt

public expect fun usleep(secs: UsecondsT): CInt


public expect fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT

public expect fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT

public expect fun putenv(string: COpaquePointer?): CInt

public expect fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt

public expect fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt

public expect fun setlocale(category: CInt, locale: String?): COpaquePointer?

public expect fun localeconv(): Lconv?

public expect fun semWait(sem: SemT?): CInt

public expect fun semTrywait(sem: SemT?): CInt

public expect fun semPost(sem: SemT?): CInt

public expect fun statvfs(path: String?, buf: Statvfs?): CInt

public expect fun fstatvfs(fd: CInt, buf: Statvfs?): CInt

public expect fun sigemptyset(set: SigsetT?): CInt

public expect fun sigaddset(set: SigsetT?, signum: CInt): CInt

public expect fun sigfillset(set: SigsetT?): CInt

public expect fun sigdelset(set: SigsetT?, signum: CInt): CInt

public expect fun sigismember(set: SigsetT?, signum: CInt): CInt

public expect fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt

public expect fun sigpending(set: SigsetT?): CInt

public expect fun sysconf(name: CInt): CLong

public expect fun mkfifo(path: String?, mode: ModeT): CInt

public expect fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: FILE?): OffT

public expect fun tcdrain(fd: CInt): CInt

public expect fun cfgetispeed(termios: Termios?): SpeedT

public expect fun cfgetospeed(termios: Termios?): SpeedT

public expect fun cfsetispeed(termios: Termios?, speed: SpeedT): CInt

public expect fun cfsetospeed(termios: Termios?, speed: SpeedT): CInt

public expect fun tcgetattr(fd: CInt, termios: Termios?): CInt

public expect fun tcsetattr(fd: CInt, optionalActions: CInt, termios: Termios?): CInt

public expect fun tcflow(fd: CInt, action: CInt): CInt

public expect fun tcflush(fd: CInt, action: CInt): CInt

public expect fun tcgetsid(fd: CInt): io.github.kotlinmania.libc.PidT

public expect fun tcsendbreak(fd: CInt, duration: CInt): CInt

public expect fun mkstemp(template: COpaquePointer?): CInt

public expect fun mkdtemp(template: COpaquePointer?): COpaquePointer?

public expect fun tmpnam(ptr: COpaquePointer?): COpaquePointer?

public expect fun openlog(ident: String?, logopt: CInt, facility: CInt)

public expect fun closelog()

public expect fun setlogmask(maskpri: CInt): CInt

public expect fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long)

public expect fun nice(incr: CInt): CInt

public expect fun grantpt(fd: CInt): CInt

public expect fun posixOpenpt(flags: CInt): CInt

public expect fun ptsname(fd: CInt): COpaquePointer?

public expect fun unlockpt(fd: CInt): CInt

public expect fun strcasestr(cs: String?, ct: String?): COpaquePointer?

public expect fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT

public expect fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt

public fun htonl(hostlong: UInt): UInt {
    return UInt.toBe(hostlong)
}

public fun htons(hostshort: UShort): UShort {
    return UShort.toBe(hostshort)
}

public fun ntohl(netlong: UInt): UInt {
    return UInt.fromBe(netlong)
}

public fun ntohs(netshort: UShort): UShort {
    return UShort.fromBe(netshort)
}

public expect fun adjtime(delta: Timeval?, olddelta: Timeval?): CInt

public expect fun stpncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer?

public expect fun sigqueue(pid: PidT, sig: CInt, value: io.github.kotlinmania.libc.Sigval): CInt

public expect fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT

public expect fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt

public expect fun flock(fd: CInt, operation: CInt): CInt

public expect fun openWmemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE?

public expect fun getsid(pid: PidT): PidT

public expect fun pause(): CInt

public expect fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt

public expect fun fdopendir(fd: CInt): DIR?

// Note(docs): `<>` breaks line length limit.
/**
 * The 64-bit libc on Solaris and illumos only has readdirR. If a
 * 32-bit Solaris or illumos target is ever created, it should use
 * __posix_readdir_r. See libc(3LIB) on Solaris or illumos:
 * https://illumos.org/man/3lib/libc
 * https://docs.oracle.com/cd/E36784_01/html/E36873/libc-3lib.html
 * https://www.unix.com/man-page/opensolaris/3LIB/libc/
 */
public expect fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): CInt

public expect fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): CInt

public expect fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): CInt

public expect fun pselect(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): CInt

public expect fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt

public expect fun fmemopen(buf: COpaquePointer?, size: SizeT, mode: String?): FILE?

public expect fun openMemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE?

public expect fun atexit(cb: AtexitCbCallback): CInt

public expect fun cfmakeraw(termios: Termios?): CInt

public expect fun cfsetspeed(termios: Termios?, speed: SpeedT): CInt

public expect fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt
