// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

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
public typealias UidT = Int
public typealias GidT = Int
public typealias UidT = UInt
public typealias GidT = UInt
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
    val tvUsec: Suseconds64T,
)

public data class Timespec(
    val tvSec: TimeT,
    val tvNsec: Long,
    val tvNsec: CLong,
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
    val ipv6mrInterface: CUInt,
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
    val sPort: CInt,
    val sProto: String?,
)

public data class Protoent(
    val pName: String?,
    val pAliases: COpaquePointer?,
    val pProto: CInt,
    val pProto: CShort,
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
public const val S_ISUID: ModeT = 2048
public const val S_ISGID: ModeT = 1024
public const val S_ISVTX: ModeT = 512
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
public const val INADDR_LOOPBACK: InAddrT = 2130706433
public const val INADDR_ANY: InAddrT = 0
public const val INADDR_BROADCAST: InAddrT = 4294967295
public const val INADDR_NONE: InAddrT = 4294967295
public val IN6ADDR_LOOPBACK_INIT: In6Addr = In6Addr(s6Addr = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1])
public val IN6ADDR_ANY_INIT: In6Addr = In6Addr(s6Addr = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0])
public val ARPOP_REQUEST: UShort = (1).toUShort()
public val ARPOP_REPLY: UShort = (2).toUShort()
public const val ATF_COM: CInt = 0x02
public const val ATF_PERM: CInt = 0x04
public const val ATF_PUBL: CInt = 0x08
public const val ATF_USETRAILERS: CInt = 0x10
public val FNM_PERIOD: CInt = 1 shl 1
public val FNM_PERIOD: CInt = 1 shl 2
public const val FNM_NOMATCH: CInt = 1
public val FNM_CASEFOLD: CInt = 1 shl 3
public val FNM_CASEFOLD: CInt = 1 shl 4
public val FNM_PATHNAME: CInt = 1 shl 1
public val FNM_PATHNAME: CInt = 1 shl 0
public val FNM_NOESCAPE: CInt = 1 shl 0
public val FNM_NOESCAPE: CInt = 1 shl 2
public val FNM_NOESCAPE: CInt = 1 shl 3
public val FNM_NOESCAPE: CInt = 1 shl 1

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
public expect fun bsearch(key: COpaquePointer?, base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer?
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
public expect fun clearerr(stream: FILE?)
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
public expect fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer?
public expect fun free(p: COpaquePointer?)
public expect fun abort(): !
public expect fun exit(status: CInt): !
public expect fun exit(status: CInt): !
public expect fun system(s: String?): CInt
public expect fun getenv(s: String?): String?
public expect fun strcpy(dst: String?, src: String?): String?
public expect fun strncpy(dst: String?, src: String?, n: ULong): String?
public expect fun stpcpy(dst: String?, src: String?): String?
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
public expect fun strtokR(s: String?, t: String?, p: COpaquePointer?): String?
public expect fun strxfrm(s: String?, ct: String?, n: ULong): ULong
public expect fun strsignal(sig: CInt): String?
public expect fun wcslen(buf: WcharT?): ULong
public expect fun wcstombs(dest: String?, src: WcharT?, n: ULong): ULong
public expect fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?
public expect fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT?
public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt
public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer?
public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer?
public expect fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?
public expect fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?
public expect fun getpwnam(name: String?): Passwd?
public expect fun getpwuid(uid: UidT): Passwd?
public expect fun fprintf(stream: FILE?, format: String?, ...): CInt
public expect fun printf(format: String?, ...): CInt
public expect fun snprintf(s: String?, n: ULong, format: String?, ...): CInt
public expect fun sprintf(s: String?, format: String?, ...): CInt
public expect fun fscanf(stream: FILE?, format: String?, ...): CInt
public expect fun scanf(format: String?, ...): CInt
public expect fun sscanf(s: String?, format: String?, ...): CInt
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
public expect fun sendto(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT
public expect fun shutdown(socket: CInt, how: CInt): CInt
public expect fun chmod(path: String?, mode: ModeT): CInt
public expect fun fchmod(fd: CInt, mode: ModeT): CInt
public expect fun fstat(fildes: CInt, buf: Stat?): CInt
public expect fun mkdir(path: String?, mode: ModeT): CInt
public expect fun stat(path: String?, buf: Stat?): CInt
public expect fun pclose(stream: FILE?): CInt
public expect fun fdopen(fd: CInt, mode: String?): FILE?
public expect fun fileno(stream: FILE?): CInt
public expect fun open(path: String?, oflag: CInt, ...): CInt
public expect fun creat(path: String?, mode: ModeT): CInt
public expect fun fcntl(fd: CInt, cmd: CInt, ...): CInt
public expect fun opendir(dirname: String?): DIR?
public expect fun readdir(dirp: DIR?): Dirent?
public expect fun closedir(dirp: DIR?): CInt
public expect fun rewinddir(dirp: DIR?)
public expect fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt
public expect fun fchown(fd: CInt, owner: UidT, group: GidT): CInt
public expect fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt
public expect fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt
public expect fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt
public expect fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt
public expect fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt
public expect fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt
public expect fun access(path: String?, amode: CInt): CInt
public expect fun alarm(seconds: CUInt): CUInt
public expect fun chdir(dir: String?): CInt
public expect fun fchdir(dirfd: CInt): CInt
public expect fun chown(path: String?, uid: UidT, gid: GidT): CInt
public expect fun lchown(path: String?, uid: UidT, gid: GidT): CInt
public expect fun close(fd: CInt): CInt
public expect fun dup(fd: CInt): CInt
public expect fun dup2(src: CInt, dst: CInt): CInt
public expect fun execl(path: String?, arg0: String?, ...): CInt
public expect fun execle(path: String?, arg0: String?, ...): CInt
public expect fun execlp(file: String?, arg0: String?, ...): CInt
public expect fun execv(prog: String?, argv: COpaquePointer?): CInt
public expect fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt
public expect fun execvp(c: String?, argv: COpaquePointer?): CInt
public expect fun fork(): PidT
public expect fun fpathconf(filedes: CInt, name: CInt): CLong
public expect fun getcwd(buf: String?, size: ULong): String?
public expect fun getegid(): GidT
public expect fun geteuid(): UidT
public expect fun getgid(): GidT
public expect fun getgroups(ngroupsMax: CInt, groups: GidT?): CInt
public expect fun getlogin(): String?
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
public expect fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): CInt
public expect fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer?
public expect fun read(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT
public expect fun rmdir(path: String?): CInt
public expect fun seteuid(uid: UidT): CInt
public expect fun setegid(gid: GidT): CInt
public expect fun setgid(gid: GidT): CInt
public expect fun setpgid(pid: PidT, pgid: PidT): CInt
public expect fun setsid(): PidT
public expect fun setuid(uid: UidT): CInt
public expect fun setreuid(ruid: UidT, euid: UidT): CInt
public expect fun setregid(rgid: GidT, egid: GidT): CInt
public expect fun sleep(secs: CUInt): CUInt
public expect fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt
public expect fun tcgetpgrp(fd: CInt): PidT
public expect fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt
public expect fun ttyname(fd: CInt): String?
public expect fun ttynameR(fd: CInt, buf: String?, buflen: ULong): CInt
public expect fun unlink(c: String?): CInt
public expect fun wait(status: CInt?): PidT
public expect fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT
public expect fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT
public expect fun pread(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT
public expect fun pwrite(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT
public expect fun umask(mask: ModeT): ModeT
public expect fun utime(file: String?, buf: Utimbuf?): CInt
public expect fun kill(pid: PidT, sig: CInt): CInt
public expect fun killpg(pgrp: PidT, sig: CInt): CInt
public expect fun mlock(addr: COpaquePointer?, len: ULong): CInt
public expect fun munlock(addr: COpaquePointer?, len: ULong): CInt
public expect fun mlockall(flags: CInt): CInt
public expect fun munlockall(): CInt
public expect fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer?
public expect fun munmap(addr: COpaquePointer?, len: ULong): CInt
public expect fun ifNametoindex(ifname: String?): CUInt
public expect fun ifIndextoname(ifindex: CUInt, ifname: String?): String?
public expect fun lstat(path: String?, buf: Stat?): CInt
public expect fun fsync(fd: CInt): CInt
public expect fun setenv(name: String?, `val`: String?, overwrite: CInt): CInt
public expect fun unsetenv(name: String?): CInt
public expect fun symlink(path1: String?, path2: String?): CInt
public expect fun truncate(path: String?, length: OffT): CInt
public expect fun ftruncate(fd: CInt, length: OffT): CInt
public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT
public expect fun getrusage(resource: CInt, usage: Rusage?): CInt
public expect fun realpath(pathname: String?, resolved: String?): String?
public expect fun times(buf: Tms?): ClockT
public expect fun pthreadSelf(): PthreadT
public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt
public expect fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt
public expect fun pthreadExit(value: COpaquePointer?): !
public expect fun pthreadAttrInit(attr: PthreadAttrT?): CInt
public expect fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt
public expect fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt
public expect fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): CInt
public expect fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt
public expect fun pthreadDetach(thread: PthreadT): CInt
public expect fun schedYield(): CInt
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
public expect fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt
public expect fun raise(signum: CInt): CInt
public expect fun utimes(filename: String?, times: Timeval?): CInt
public expect fun dlopen(filename: String?, flag: CInt): COpaquePointer?
public expect fun dlerror(): String?
public expect fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer?
public expect fun dlclose(handle: COpaquePointer?): CInt
public expect fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt
public expect fun freeaddrinfo(res: Addrinfo?)
public expect fun hstrerror(errcode: CInt): String?
public expect fun gaiStrerror(errcode: CInt): String?
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
public expect fun gethostname(name: String?, len: ULong): CInt
public expect fun endservent()
public expect fun getservbyname(name: String?, proto: String?): Servent?
public expect fun getservbyport(port: CInt, proto: String?): Servent?
public expect fun getservent(): Servent?
public expect fun setservent(stayopen: CInt)
public expect fun getprotobyname(name: String?): Protoent?
public expect fun getprotobynumber(proto: CInt): Protoent?
public expect fun chroot(name: String?): CInt
public expect fun usleep(secs: UsecondsT): CInt
public expect fun usleep(secs: CUInt): CInt
public expect fun send(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT
public expect fun recv(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT
public expect fun putenv(string: String?): CInt
public expect fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt
public expect fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt
public expect fun setlocale(category: CInt, locale: String?): String?
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
public expect fun tcgetsid(fd: CInt): PidT
public expect fun tcsendbreak(fd: CInt, duration: CInt): CInt
public expect fun mkstemp(template: String?): CInt
public expect fun mkdtemp(template: String?): String?
public expect fun tmpnam(ptr: String?): String?
public expect fun openlog(ident: String?, logopt: CInt, facility: CInt)
public expect fun closelog()
public expect fun setlogmask(maskpri: CInt): CInt
public expect fun syslog(priority: CInt, message: String?, ...)
public expect fun nice(incr: CInt): CInt
public expect fun grantpt(fd: CInt): CInt
public expect fun posixOpenpt(flags: CInt): CInt
public expect fun ptsname(fd: CInt): String?
public expect fun unlockpt(fd: CInt): CInt
public expect fun strcasestr(cs: String?, ct: String?): String?
public expect fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT
public expect fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt
public expect fun adjtime(delta: Timeval?, olddelta: Timeval?): CInt
public expect fun adjtime(delta: Timeval?, olddelta: Timeval?): CInt
public expect fun stpncpy(dst: String?, src: String?, n: ULong): String?
public expect fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt
public expect fun confstr(name: CInt, buf: String?, len: ULong): ULong
public expect fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt
public expect fun flock(fd: CInt, operation: CInt): CInt
public expect fun openWmemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE?
public expect fun getsid(pid: PidT): PidT
public expect fun pause(): CInt
public expect fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt
public expect fun openat(dirfd: CInt, pathname: String?, flags: CInt, ...): CInt
public expect fun fdopendir(fd: CInt): DIR?
public expect fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): CInt
public expect fun readlinkat(dirfd: CInt, pathname: String?, buf: String?, bufsiz: ULong): CInt
public expect fun readlink(path: String?, buf: String?, bufsz: ULong): CInt
public expect fun pselect(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): CInt
public expect fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt
public expect fun readlinkat(dirfd: CInt, pathname: String?, buf: String?, bufsiz: ULong): SsizeT
public expect fun fmemopen(buf: COpaquePointer?, size: ULong, mode: String?): FILE?
public expect fun openMemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE?
public expect fun atexit(cb: (() -> Unit)?): CInt
public expect fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt
public expect fun readlink(path: String?, buf: String?, bufsz: ULong): SsizeT
public expect fun pselect(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): CInt
public expect fun cfmakeraw(termios: Termios?): CInt
public expect fun cfmakeraw(termios: Termios?)
public expect fun cfsetspeed(termios: Termios?, speed: SpeedT): CInt
public expect fun cfsetspeed(termios: Termios?, speed: SpeedT): CInt
public expect fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt
