// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

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
public typealias SighandlerT = ULong
public typealias CcT = CUChar
public typealias UidT = CUShort
public typealias GidT = CUShort
public typealias LocaleT = COpaquePointer?

public data class Group(
    val grName: String?,
    val grPasswd: String?,
    val grGid: GidT,
    val grMem: COpaquePointer?,
)

public data class Utimbuf(
    val actime: TimeT,
    val modtime: TimeT,
)

public data class Timeval(
    val tvSec: TimeT,
    val tvUsec: SusecondsT,
    val tvUsec2: Suseconds64T,
)

public data class Timespec(
    val tvSec: TimeT,
    val tvNsec: Long,
    val tvNsec2: CLong,
)

public data class Rlimit(
    val rlimCur: RlimT,
    val rlimMax: RlimT,
)

public data class Rusage(
    val ruUtime: Timeval,
    val ruStime: Timeval,
    val ruMaxrss: CLong,
    val ruIxrss: CLong,
    val ruIdrss: CLong,
    val ruIsrss: CLong,
    val ruMinflt: CLong,
    val ruMajflt: CLong,
    val ruNswap: CLong,
    val ruInblock: CLong,
    val ruOublock: CLong,
    val ruMsgsnd: CLong,
    val ruMsgrcv: CLong,
    val ruNsignals: CLong,
    val ruNvcsw: CLong,
    val ruNivcsw: CLong,
)

public data class Ipv6Mreq(
    val ipv6mrMultiaddr: In6Addr,
    val ipv6mrInterface: CInt,
    val ipv6mrInterface2: CUInt,
)

public data class Hostent(
    val hName: String?,
    val hAliases: COpaquePointer?,
    val hAddrtype: CInt,
    val hLength: CInt,
    val hAddrList: COpaquePointer?,
)

public data class Iovec(
    val iovBase: COpaquePointer?,
    val iovLen: ULong,
)

public data class Pollfd(
    val fd: CInt,
    val events: CShort,
    val revents: CShort,
)

public data class Winsize(
    val wsRow: CUShort,
    val wsCol: CUShort,
    val wsXpixel: CUShort,
    val wsYpixel: CUShort,
)

public data class Linger(
    val lOnoff: CInt,
    val lLinger: CInt,
)

public data class Sigval(
    val sivalPtr: COpaquePointer?,
)

public data class Itimerval(
    val itInterval: Timeval,
    val itValue: Timeval,
)

public data class Tms(
    val tmsUtime: ClockT,
    val tmsStime: ClockT,
    val tmsCutime: ClockT,
    val tmsCstime: ClockT,
)

public data class Servent(
    val sName: String?,
    val sAliases: COpaquePointer?,
    val sPort: CShort,
    val sPort2: CInt,
    val sProto: String?,
)

public data class Protoent(
    val pName: String?,
    val pAliases: COpaquePointer?,
    val pProto: CInt,
    val pProto2: CShort,
)

public data class In6Addr(
    val s6Addr: UByteArray,
)

public const val INT_MIN: CInt = -2147483648
public const val INT_MAX: CInt = 2147483647
public val SIG_DFL: SighandlerT = 0.toSighandlerT()
public val SIG_IGN: SighandlerT = 1.toSighandlerT()
public val SIG_ERR: SighandlerT = 0.toSighandlerT().inv()
public val DT_UNKNOWN: UByte = (0).toUByte()
public val DT_FIFO: UByte = (1).toUByte()
public val DT_CHR: UByte = (2).toUByte()
public val DT_DIR: UByte = (4).toUByte()
public val DT_BLK: UByte = (6).toUByte()
public val DT_REG: UByte = (8).toUByte()
public val DT_LNK: UByte = (10).toUByte()
public val DT_SOCK: UByte = (12).toUByte()
public const val FD_CLOEXEC: CInt = 0x1
public const val USRQUOTA: CInt = 0
public const val GRPQUOTA: CInt = 1
public const val SIGIOT: CInt = 6
public const val S_ISUID: ModeT = 2048u
public const val S_ISGID: ModeT = 1024u
public const val S_ISVTX: ModeT = 512u
public const val IF_NAMESIZE: ULong = 16uL
public const val IFNAMSIZ: ULong = IF_NAMESIZE
public const val LOG_EMERG: CInt = 0
public const val LOG_ALERT: CInt = 1
public const val LOG_CRIT: CInt = 2
public const val LOG_ERR: CInt = 3
public const val LOG_WARNING: CInt = 4
public const val LOG_NOTICE: CInt = 5
public const val LOG_INFO: CInt = 6
public const val LOG_DEBUG: CInt = 7
public const val LOG_KERN: CInt = 0
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
public const val LOG_PID: CInt = 0x01
public const val LOG_CONS: CInt = 0x02
public const val LOG_ODELAY: CInt = 0x04
public const val LOG_NDELAY: CInt = 0x08
public const val LOG_NOWAIT: CInt = 0x10
public const val LOG_PRIMASK: CInt = 7
public const val LOG_FACMASK: CInt = 0x3f8
public const val PRIO_MIN: CInt = -20
public const val PRIO_MAX: CInt = 20
public const val IPPROTO_ICMP: CInt = 1
public const val IPPROTO_ICMPV6: CInt = 58
public const val IPPROTO_TCP: CInt = 6
public const val IPPROTO_UDP: CInt = 17
public const val IPPROTO_IP: CInt = 0
public const val IPPROTO_IPV6: CInt = 41
public const val INADDR_LOOPBACK: InAddrT = 2130706433u
public const val INADDR_ANY: InAddrT = 0u
public const val INADDR_BROADCAST: InAddrT = 4294967295u
public const val INADDR_NONE: InAddrT = 4294967295u
public val IN6ADDR_LOOPBACK_INIT: In6Addr = In6Addr(s6Addr = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 1u))
public val IN6ADDR_ANY_INIT: In6Addr = In6Addr(s6Addr = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u))
public val ARPOP_REQUEST: UShort = (1).toUShort()
public val ARPOP_REPLY: UShort = (2).toUShort()
public const val ATF_COM: CInt = 0x02
public const val ATF_PERM: CInt = 0x04
public const val ATF_PUBL: CInt = 0x08
public const val ATF_USETRAILERS: CInt = 0x10
public val FNM_PERIOD: CInt = 1 shl 1
public const val FNM_NOMATCH: CInt = 1
public val FNM_CASEFOLD: CInt = 1 shl 3
public val FNM_PATHNAME: CInt = 1 shl 1
public val FNM_NOESCAPE: CInt = 1 shl 0

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

public fun bsearch(key: COpaquePointer?, base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? = null

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

public fun clearerr(stream: FILE?) { }

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

public fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? = null

public fun free(p: COpaquePointer?) { }

public fun abort(): Nothing { throw UnsupportedOperationException() }

public fun exit(status: CInt): Nothing { throw UnsupportedOperationException() }


public fun system(s: String?): CInt = -1

public fun getenv(s: String?): String? = null

public fun strcpy(dst: String?, src: String?): String? = null

public fun strncpy(dst: String?, src: String?, n: ULong): String? = null

public fun stpcpy(dst: String?, src: String?): String? = null

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

public fun strndup(cs: String?, n: ULong): String? = null

public fun strpbrk(cs: String?, ct: String?): String? = null

public fun strstr(cs: String?, ct: String?): String? = null

public fun strcasecmp(s1: String?, s2: String?): CInt = -1

public fun strncasecmp(s1: String?, s2: String?, n: ULong): CInt = -1

public fun strlen(cs: String?): ULong = 0uL

public fun strnlen(cs: String?, maxlen: ULong): ULong = 0uL

public fun strerror(n: CInt): String? = null

public fun strtok(s: String?, t: String?): String? = null

public fun strtokR(s: String?, t: String?, p: COpaquePointer?): String? = null

public fun strxfrm(s: String?, ct: String?, n: ULong): ULong = 0uL

public fun strsignal(sig: CInt): String? = null

public fun wcslen(buf: WcharT?): ULong = 0uL

public fun wcstombs(dest: String?, src: WcharT?, n: ULong): ULong = 0uL

public fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? = null

public fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT? = null

public fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt = -1

public fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? = null

public fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? = null

public fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? = null

public fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? = null

public fun getpwnam(name: String?): Passwd? = null

public fun getpwuid(uid: UidT): Passwd? = null

public fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt = -1

public fun printf(format: String?, vararg args: Any?): CInt = -1

public fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): CInt = -1

public fun sprintf(s: String?, format: String?, vararg args: Any?): CInt = -1

public fun fscanf(stream: FILE?, format: String?, vararg args: Any?): CInt = -1

public fun scanf(format: String?, vararg args: Any?): CInt = -1

public fun sscanf(s: String?, format: String?, vararg args: Any?): CInt = -1

public fun getcharUnlocked(): CInt = -1

public fun putcharUnlocked(c: CInt): CInt = -1

public fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt = -1

public fun connect(socket: CInt, address: Sockaddr?, len: SocklenT): CInt = -1

public fun listen(socket: CInt, backlog: CInt): CInt = -1

public fun accept(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt = -1

public fun getpeername(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt = -1

public fun getsockname(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt = -1

public fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt = -1

public fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: CInt?): CInt = -1

public fun sendto(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT = -1L

public fun shutdown(socket: CInt, how: CInt): CInt = -1

public fun chmod(path: String?, mode: ModeT): CInt = -1

public fun fchmod(fd: CInt, mode: ModeT): CInt = -1

public fun fstat(fildes: CInt, buf: Stat?): CInt = -1

public fun mkdir(path: String?, mode: ModeT): CInt = -1

public fun stat(path: String?, buf: Stat?): CInt = -1

public fun pclose(stream: FILE?): CInt = -1

public fun fdopen(fd: CInt, mode: String?): FILE? = null

public fun fileno(stream: FILE?): CInt = -1

public fun open(path: String?, oflag: CInt, vararg args: Any?): CInt = -1

public fun creat(path: String?, mode: ModeT): CInt = -1

public fun fcntl(fd: CInt, cmd: CInt, vararg args: Any?): CInt = -1

public fun opendir(dirname: String?): DIR? = null

public fun readdir(dirp: DIR?): Dirent? = null

public fun closedir(dirp: DIR?): CInt = -1

public fun rewinddir(dirp: DIR?) { }

public fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt = -1

public fun fchown(fd: CInt, owner: UidT, group: GidT): CInt = -1

public fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt = -1

public fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt = -1

public fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt = -1

public fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt = -1

public fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt = -1

public fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt = -1

public fun access(path: String?, amode: CInt): CInt = -1

public fun alarm(seconds: CUInt): CUInt = 0u

public fun chdir(dir: String?): CInt = -1

public fun fchdir(dirfd: CInt): CInt = -1

public fun chown(path: String?, uid: UidT, gid: GidT): CInt = -1

public fun lchown(path: String?, uid: UidT, gid: GidT): CInt = -1

public fun close(fd: CInt): CInt = -1

public fun dup(fd: CInt): CInt = -1

public fun dup2(src: CInt, dst: CInt): CInt = -1

public fun execl(path: String?, arg0: String?, vararg args: Any?): CInt = -1

public fun execle(path: String?, arg0: String?, vararg args: Any?): CInt = -1

public fun execlp(file: String?, arg0: String?, vararg args: Any?): CInt = -1

public fun execv(prog: String?, argv: COpaquePointer?): CInt = -1

public fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt = -1

public fun execvp(c: String?, argv: COpaquePointer?): CInt = -1

public fun fork(): PidT = -1

public fun fpathconf(filedes: CInt, name: CInt): CLong = -1L

public fun getcwd(buf: String?, size: ULong): String? = null

public fun getegid(): GidT { throw UnsupportedOperationException("Not implemented on this platform") }

public fun geteuid(): UidT { throw UnsupportedOperationException("Not implemented on this platform") }

public fun getgid(): GidT { throw UnsupportedOperationException("Not implemented on this platform") }

public fun getgroups(ngroupsMax: CInt, groups: GidT?): CInt = -1

public fun getlogin(): String? = null

public fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt = -1

public fun getpgid(pid: PidT): PidT = -1

public fun getpgrp(): PidT = -1

public fun getpid(): PidT = -1

public fun getppid(): PidT = -1

public fun getuid(): UidT { throw UnsupportedOperationException("Not implemented on this platform") }

public fun isatty(fd: CInt): CInt = -1

public fun link(src: String?, dst: String?): CInt = -1

public fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT = -1L

public fun pathconf(path: String?, name: CInt): CLong = -1L

public fun pipe(fds: CInt?): CInt = -1

public fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): CInt = -1

public fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer? = null

public fun read(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT = -1L

public fun rmdir(path: String?): CInt = -1

public fun seteuid(uid: UidT): CInt = -1

public fun setegid(gid: GidT): CInt = -1

public fun setgid(gid: GidT): CInt = -1

public fun setpgid(pid: PidT, pgid: PidT): CInt = -1

public fun setsid(): PidT = -1

public fun setuid(uid: UidT): CInt = -1

public fun setreuid(ruid: UidT, euid: UidT): CInt = -1

public fun setregid(rgid: GidT, egid: GidT): CInt = -1

public fun sleep(secs: CUInt): CUInt = 0u

public fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt = -1

public fun tcgetpgrp(fd: CInt): PidT = -1

public fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt = -1

public fun ttyname(fd: CInt): String? = null

public fun ttynameR(fd: CInt, buf: String?, buflen: ULong): CInt = -1

public fun unlink(c: String?): CInt = -1

public fun wait(status: CInt?): PidT = -1

public fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT = -1

public fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT = -1L

public fun pread(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT = -1L

public fun pwrite(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT = -1L

public fun umask(mask: ModeT): ModeT { throw UnsupportedOperationException("Not implemented on this platform") }

public fun utime(file: String?, buf: Utimbuf?): CInt = -1

public fun kill(pid: PidT, sig: CInt): CInt = -1

public fun killpg(pgrp: PidT, sig: CInt): CInt = -1

public fun mlock(addr: COpaquePointer?, len: ULong): CInt = -1

public fun munlock(addr: COpaquePointer?, len: ULong): CInt = -1

public fun mlockall(flags: CInt): CInt = -1

public fun munlockall(): CInt = -1

public fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? = null

public fun munmap(addr: COpaquePointer?, len: ULong): CInt = -1

public fun ifNametoindex(ifname: String?): CUInt = 0u

public fun ifIndextoname(ifindex: CUInt, ifname: String?): String? = null

public fun lstat(path: String?, buf: Stat?): CInt = -1

public fun fsync(fd: CInt): CInt = -1

public fun setenv(name: String?, `val`: String?, overwrite: CInt): CInt = -1

public fun unsetenv(name: String?): CInt = -1

public fun symlink(path1: String?, path2: String?): CInt = -1

public fun truncate(path: String?, length: OffT): CInt = -1

public fun ftruncate(fd: CInt, length: OffT): CInt = -1

public fun signal(signum: CInt, handler: SighandlerT): SighandlerT { throw UnsupportedOperationException("Not implemented on this platform") }

public fun getrusage(resource: CInt, usage: Rusage?): CInt = -1

public fun realpath(pathname: String?, resolved: String?): String? = null

public fun times(buf: Tms?): ClockT = -1L

public fun pthreadSelf(): PthreadT { throw UnsupportedOperationException("Not implemented on this platform") }

public fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt = -1

public fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt = -1

public fun pthreadExit(value: COpaquePointer?): Nothing { throw UnsupportedOperationException() }

public fun pthreadAttrInit(attr: PthreadAttrT): CInt = -1

public fun pthreadAttrDestroy(attr: PthreadAttrT): CInt = -1

public fun pthreadAttrGetstacksize(attr: PthreadAttrT, stacksize: ULong?): CInt = -1

public fun pthreadAttrSetstacksize(attr: PthreadAttrT, stackSize: ULong): CInt = -1

public fun pthreadAttrSetdetachstate(attr: PthreadAttrT, state: CInt): CInt = -1

public fun pthreadDetach(thread: PthreadT): CInt = -1

public fun schedYield(): CInt = -1

public fun pthreadKeyCreate(key: PthreadKeyT?, dtor: ((COpaquePointer?) -> Unit)?): CInt = -1

public fun pthreadKeyDelete(key: PthreadKeyT): CInt = -1

public fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? = null

public fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt = -1

public fun pthreadMutexInit(lock: PthreadMutexT, attr: PthreadMutexattrT): CInt = -1

public fun pthreadMutexDestroy(lock: PthreadMutexT): CInt = -1

public fun pthreadMutexLock(lock: PthreadMutexT): CInt = -1

public fun pthreadMutexTrylock(lock: PthreadMutexT): CInt = -1

public fun pthreadMutexUnlock(lock: PthreadMutexT): CInt = -1

public fun pthreadMutexattrInit(attr: PthreadMutexattrT): CInt = -1

public fun pthreadMutexattrDestroy(attr: PthreadMutexattrT): CInt = -1

public fun pthreadMutexattrSettype(attr: PthreadMutexattrT, type: CInt): CInt = -1

public fun pthreadCondInit(cond: PthreadCondT, attr: PthreadCondattrT): CInt = -1

public fun pthreadCondWait(cond: PthreadCondT, lock: PthreadMutexT): CInt = -1

public fun pthreadCondTimedwait(cond: PthreadCondT, lock: PthreadMutexT, abstime: Timespec?): CInt = -1

public fun pthreadCondSignal(cond: PthreadCondT): CInt = -1

public fun pthreadCondBroadcast(cond: PthreadCondT): CInt = -1

public fun pthreadCondDestroy(cond: PthreadCondT): CInt = -1

public fun pthreadCondattrInit(attr: PthreadCondattrT): CInt = -1

public fun pthreadCondattrDestroy(attr: PthreadCondattrT): CInt = -1

public fun pthreadRwlockInit(lock: PthreadRwlockT, attr: PthreadRwlockattrT): CInt = -1

public fun pthreadRwlockDestroy(lock: PthreadRwlockT): CInt = -1

public fun pthreadRwlockRdlock(lock: PthreadRwlockT): CInt = -1

public fun pthreadRwlockTryrdlock(lock: PthreadRwlockT): CInt = -1

public fun pthreadRwlockWrlock(lock: PthreadRwlockT): CInt = -1

public fun pthreadRwlockTrywrlock(lock: PthreadRwlockT): CInt = -1

public fun pthreadRwlockUnlock(lock: PthreadRwlockT): CInt = -1

public fun pthreadRwlockattrInit(attr: PthreadRwlockattrT): CInt = -1

public fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT): CInt = -1

public fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt = -1

public fun raise(signum: CInt): CInt = -1

public fun utimes(filename: String?, times: Timeval?): CInt = -1

public fun dlopen(filename: String?, flag: CInt): COpaquePointer? = null

public fun dlerror(): String? = null

public fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? = null

public fun dlclose(handle: COpaquePointer?): CInt = -1

public fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt = -1

public fun freeaddrinfo(res: Addrinfo?) { }

public fun hstrerror(errcode: CInt): String? = null

public fun gaiStrerror(errcode: CInt): String? = null

public fun resInit(): CInt = -1

public fun gmtimeR(timeP: TimeT?, result: Tm?): Tm? = null

public fun localtimeR(timeP: TimeT?, result: Tm?): Tm? = null

public fun mktime(tm: Tm?): TimeT = -1L

public fun time(time: TimeT?): TimeT = -1L

public fun gmtime(timeP: TimeT?): Tm? = null

public fun localtime(timeP: TimeT?): Tm? = null

public fun difftime(time1: TimeT, time0: TimeT): CDouble = 0.0

public fun timegm(tm: Tm?): TimeT = -1L

public fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt = -1

public fun gethostname(name: String?, len: ULong): CInt = -1

public fun endservent() { }

public fun getservbyname(name: String?, proto: String?): Servent? = null

public fun getservbyport(port: CInt, proto: String?): Servent? = null

public fun getservent(): Servent? = null

public fun setservent(stayopen: CInt) { }

public fun getprotobyname(name: String?): Protoent? = null

public fun getprotobynumber(proto: CInt): Protoent? = null

public fun chroot(name: String?): CInt = -1

public fun usleep(secs: UsecondsT): CInt = -1


public fun send(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT = -1L

public fun recv(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT = -1L

public fun putenv(string: String?): CInt = -1

public fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt = -1

public fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt = -1

public fun setlocale(category: CInt, locale: String?): String? = null

public fun localeconv(): Lconv? = null

public fun semWait(sem: SemT): CInt = -1

public fun semTrywait(sem: SemT): CInt = -1

public fun semPost(sem: SemT): CInt = -1

public fun statvfs(path: String?, buf: Statvfs?): CInt = -1

public fun fstatvfs(fd: CInt, buf: Statvfs?): CInt = -1

public fun sigemptyset(set: SigsetT?): CInt = -1

public fun sigaddset(set: SigsetT?, signum: CInt): CInt = -1

public fun sigfillset(set: SigsetT?): CInt = -1

public fun sigdelset(set: SigsetT?, signum: CInt): CInt = -1

public fun sigismember(set: SigsetT?, signum: CInt): CInt = -1

public fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt = -1

public fun sigpending(set: SigsetT?): CInt = -1

public fun sysconf(name: CInt): CLong = -1L

public fun mkfifo(path: String?, mode: ModeT): CInt = -1

public fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt = -1

public fun ftello(stream: FILE?): OffT = -1L

public fun tcdrain(fd: CInt): CInt = -1

public fun cfgetispeed(termios: Termios?): SpeedT { throw UnsupportedOperationException("Not implemented on this platform") }

public fun cfgetospeed(termios: Termios?): SpeedT { throw UnsupportedOperationException("Not implemented on this platform") }

public fun cfsetispeed(termios: Termios?, speed: SpeedT): CInt = -1

public fun cfsetospeed(termios: Termios?, speed: SpeedT): CInt = -1

public fun tcgetattr(fd: CInt, termios: Termios?): CInt = -1

public fun tcsetattr(fd: CInt, optionalActions: CInt, termios: Termios?): CInt = -1

public fun tcflow(fd: CInt, action: CInt): CInt = -1

public fun tcflush(fd: CInt, action: CInt): CInt = -1

public fun tcgetsid(fd: CInt): PidT = -1

public fun tcsendbreak(fd: CInt, duration: CInt): CInt = -1

public fun mkstemp(template: String?): CInt = -1

public fun mkdtemp(template: String?): String? = null

public fun tmpnam(ptr: String?): String? = null

public fun openlog(ident: String?, logopt: CInt, facility: CInt) { }

public fun closelog() { }

public fun setlogmask(maskpri: CInt): CInt = -1

public fun syslog(priority: CInt, message: String?, vararg args: Any?) { }

public fun nice(incr: CInt): CInt = -1

public fun grantpt(fd: CInt): CInt = -1

public fun posixOpenpt(flags: CInt): CInt = -1

public fun ptsname(fd: CInt): String? = null

public fun unlockpt(fd: CInt): CInt = -1

public fun strcasestr(cs: String?, ct: String?): String? = null

public fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT = -1L

public fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt = -1

public fun adjtime(delta: Timeval?, olddelta: Timeval?): CInt = -1


public fun stpncpy(dst: String?, src: String?, n: ULong): String? = null

public fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt = -1

public fun confstr(name: CInt, buf: String?, len: ULong): ULong = 0uL

public fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt = -1

public fun flock(fd: CInt, operation: CInt): CInt = -1

public fun openWmemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE? = null

public fun getsid(pid: PidT): PidT = -1

public fun pause(): CInt = -1

public fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt = -1

public fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg args: Any?): CInt = -1

public fun fdopendir(fd: CInt): DIR? = null

public fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): CInt = -1

public fun readlinkat(dirfd: CInt, pathname: String?, buf: String?, bufsiz: ULong): CInt = -1

public fun readlink(path: String?, buf: String?, bufsz: ULong): CInt = -1

public fun pselect(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): CInt = -1

public fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt = -1


public fun fmemopen(buf: COpaquePointer?, size: ULong, mode: String?): FILE? = null

public fun openMemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE? = null

public fun atexit(cb: (() -> Unit)?): CInt = -1




public fun cfmakeraw(termios: Termios?): CInt = -1


public fun cfsetspeed(termios: Termios?, speed: SpeedT): CInt = -1


public fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt = -1
