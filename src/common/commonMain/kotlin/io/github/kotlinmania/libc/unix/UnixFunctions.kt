package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.bsd.UsecondsT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadKeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SpeedT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.ClockT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.PthreadT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.WcharT

public fun interface QsortComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?): CInt
}

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: COpaquePointer?)
}

public fun interface AtexitCbCallback {
    public operator fun invoke()
}

public expect val IN6ADDR_LOOPBACK: In6Addr

public expect val IN6ADDR_ANY: In6Addr

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

public expect fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt

public expect fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt

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

public expect fun wcslen(buf: COpaquePointer?): SizeT

public expect fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT

public expect fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer?

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun getpwnam(name: String?): COpaquePointer?

public expect fun getpwuid(uid: UidT): COpaquePointer?

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

public expect fun connect(socket: CInt, address: COpaquePointer?, len: SocklenT): CInt

public expect fun listen(socket: CInt, backlog: CInt): CInt

public expect fun accept(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt

public expect fun getpeername(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt

public expect fun getsockname(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt

public expect fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt

public expect fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: COpaquePointer?): CInt

public expect fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT

public expect fun shutdown(socket: CInt, how: CInt): CInt

public expect fun chmod(path: String?, mode: ModeT): CInt

public expect fun fchmod(fd: CInt, mode: ModeT): CInt

public expect fun fstat(fildes: CInt, buf: COpaquePointer?): CInt

public expect fun mkdir(path: String?, mode: ModeT): CInt

public expect fun stat(path: String?, buf: COpaquePointer?): CInt

public expect fun pclose(stream: FILE?): CInt

public expect fun fdopen(fd: CInt, mode: String?): FILE?

public expect fun fileno(stream: FILE?): CInt

public expect fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun creat(path: String?, mode: ModeT): CInt

public expect fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun opendir(dirname: String?): DIR?

public expect fun readdir(dirp: DIR?): COpaquePointer?

public expect fun closedir(dirp: DIR?): CInt

public expect fun rewinddir(dirp: DIR?)

public expect fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt

public expect fun fchown(fd: CInt, owner: UidT, group: GidT): CInt

public expect fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt

public expect fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt

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

public expect fun getgroups(ngroupsMax: CInt, groups: COpaquePointer?): CInt

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

public expect fun pipe(fds: COpaquePointer?): CInt

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

public expect fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt

public expect fun tcgetpgrp(fd: CInt): PidT

public expect fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt

public expect fun ttyname(fd: CInt): COpaquePointer?

public expect fun ttynameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun unlink(c: String?): CInt

public expect fun wait(status: COpaquePointer?): PidT

public expect fun waitpid(pid: PidT, status: COpaquePointer?, options: CInt): PidT

public expect fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT

public expect fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT

public expect fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT

public expect fun umask(mask: ModeT): ModeT

public expect fun utime(file: String?, buf: COpaquePointer?): CInt

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

public expect fun lstat(path: String?, buf: COpaquePointer?): CInt

public expect fun fsync(fd: CInt): CInt

public expect fun setenv(name: String?, value: String?, overwrite: CInt): CInt

public expect fun unsetenv(name: String?): CInt

public expect fun symlink(path1: String?, path2: String?): CInt

public expect fun truncate(path: String?, length: OffT): CInt

public expect fun ftruncate(fd: CInt, length: OffT): CInt

public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

public expect fun getrusage(resource: CInt, usage: COpaquePointer?): CInt

public expect fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer?

public expect fun times(buf: COpaquePointer?): ClockT

public expect fun pthreadSelf(): PthreadT

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

public expect fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt

public expect fun pthreadExit(value: COpaquePointer?): Nothing

public expect fun pthreadAttrInit(attr: COpaquePointer?): CInt

public expect fun pthreadAttrDestroy(attr: COpaquePointer?): CInt

public expect fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt

public expect fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt

public expect fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt

public expect fun pthreadDetach(thread: PthreadT): CInt

public expect fun schedYield(): CInt

public expect fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt

public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

public expect fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer?

public expect fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt

public expect fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt

public expect fun pthreadMutexDestroy(lock: COpaquePointer?): CInt

public expect fun pthreadMutexLock(lock: COpaquePointer?): CInt

public expect fun pthreadMutexTrylock(lock: COpaquePointer?): CInt

public expect fun pthreadMutexUnlock(lock: COpaquePointer?): CInt

public expect fun pthreadMutexattrInit(attr: COpaquePointer?): CInt

public expect fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt

public expect fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt

public expect fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt

public expect fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt

public expect fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun pthreadCondSignal(cond: COpaquePointer?): CInt

public expect fun pthreadCondBroadcast(cond: COpaquePointer?): CInt

public expect fun pthreadCondDestroy(cond: COpaquePointer?): CInt

public expect fun pthreadCondattrInit(attr: COpaquePointer?): CInt

public expect fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt

public expect fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt

public expect fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt

public expect fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt

public expect fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt

public expect fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt

public expect fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt

public expect fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt

public expect fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt

public expect fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt

public expect fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt

public expect fun raise(signum: CInt): CInt

public expect fun utimes(filename: String?, times: COpaquePointer?): CInt

public expect fun dlopen(filename: String?, flag: CInt): COpaquePointer?

public expect fun dlerror(): COpaquePointer?

public expect fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer?

public expect fun dlclose(handle: COpaquePointer?): CInt

public expect fun getaddrinfo(node: String?, service: String?, hints: COpaquePointer?, res: COpaquePointer?): CInt

public expect fun freeaddrinfo(res: COpaquePointer?)

public expect fun hstrerror(errcode: CInt): COpaquePointer?

public expect fun gaiStrerror(errcode: CInt): COpaquePointer?

public expect fun resInit(): CInt

public expect fun gmtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer?

public expect fun localtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer?

public expect fun mktime(tm: COpaquePointer?): TimeT

public expect fun time(time: COpaquePointer?): TimeT

public expect fun gmtime(timeP: COpaquePointer?): COpaquePointer?

public expect fun localtime(timeP: COpaquePointer?): COpaquePointer?

public expect fun difftime(time1: TimeT, time0: TimeT): CDouble

public expect fun timegm(tm: COpaquePointer?): TimeT

public expect fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun gethostname(name: COpaquePointer?, len: SizeT): CInt

public expect fun endservent()

public expect fun getservbyname(name: String?, proto: String?): COpaquePointer?

public expect fun getservbyport(port: CInt, proto: String?): COpaquePointer?

public expect fun getservent(): COpaquePointer?

public expect fun setservent(stayopen: CInt)

public expect fun getprotobyname(name: String?): COpaquePointer?

public expect fun getprotobynumber(proto: CInt): COpaquePointer?

public expect fun chroot(name: String?): CInt

public expect fun usleep(secs: UsecondsT): CInt

public expect fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT

public expect fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT

public expect fun putenv(string: COpaquePointer?): CInt

public expect fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt

public expect fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt

public expect fun setlocale(category: CInt, locale: String?): COpaquePointer?

public expect fun localeconv(): COpaquePointer?

public expect fun semWait(sem: COpaquePointer?): CInt

public expect fun semTrywait(sem: COpaquePointer?): CInt

public expect fun semPost(sem: COpaquePointer?): CInt

public expect fun statvfs(path: String?, buf: COpaquePointer?): CInt

public expect fun fstatvfs(fd: CInt, buf: COpaquePointer?): CInt

public expect fun sigemptyset(set: COpaquePointer?): CInt

public expect fun sigaddset(set: COpaquePointer?, signum: CInt): CInt

public expect fun sigfillset(set: COpaquePointer?): CInt

public expect fun sigdelset(set: COpaquePointer?, signum: CInt): CInt

public expect fun sigismember(set: COpaquePointer?, signum: CInt): CInt

public expect fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt

public expect fun sigpending(set: COpaquePointer?): CInt

public expect fun sysconf(name: CInt): CLong

public expect fun mkfifo(path: String?, mode: ModeT): CInt

public expect fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: FILE?): OffT

public expect fun tcdrain(fd: CInt): CInt

public expect fun cfgetispeed(termios: COpaquePointer?): SpeedT

public expect fun cfgetospeed(termios: COpaquePointer?): SpeedT

public expect fun cfsetispeed(termios: COpaquePointer?, speed: SpeedT): CInt

public expect fun cfsetospeed(termios: COpaquePointer?, speed: SpeedT): CInt

public expect fun tcgetattr(fd: CInt, termios: COpaquePointer?): CInt

public expect fun tcsetattr(fd: CInt, optionalActions: CInt, termios: COpaquePointer?): CInt

public expect fun tcflow(fd: CInt, action: CInt): CInt

public expect fun tcflush(fd: CInt, action: CInt): CInt

public expect fun tcgetsid(fd: CInt): PidT

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

public expect fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT

public expect fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt

public fun htonl(hostlong: UInt): UInt = ((((hostlong) shl 24)) or (((hostlong) and 0x0000FF00u) shl 8) or (((hostlong) shr 8) and 0x0000FF00u) or ((hostlong) shr 24))

public fun htons(hostshort: UShort): UShort = (((((hostshort).toUInt() and 0xFFu) shl 8) or (((hostshort).toUInt() shr 8) and 0xFFu)).toUShort())

public fun ntohl(netlong: UInt): UInt = ((((netlong) shl 24)) or (((netlong) and 0x0000FF00u) shl 8) or (((netlong) shr 8) and 0x0000FF00u) or ((netlong) shr 24))

public fun ntohs(netshort: UShort): UShort = (((((netshort).toUInt() and 0xFFu) shl 8) or (((netshort).toUInt() shr 8) and 0xFFu)).toUShort())

public expect fun adjtime(delta: COpaquePointer?, olddelta: COpaquePointer?): CInt

public expect fun stpncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer?

public expect fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt

public expect fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT

public expect fun dladdr(addr: COpaquePointer?, info: COpaquePointer?): CInt

public expect fun flock(fd: CInt, operation: CInt): CInt

public expect fun openWmemstream(ptr: COpaquePointer?, sizeloc: COpaquePointer?): FILE?

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
public expect fun readdirR(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt

public expect fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): CInt

public expect fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): CInt

public expect fun pselect(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt

public expect fun sigaction(signum: CInt, act: COpaquePointer?, oldact: COpaquePointer?): CInt

public expect fun fmemopen(buf: COpaquePointer?, size: SizeT, mode: String?): FILE?

public expect fun openMemstream(ptr: COpaquePointer?, sizeloc: COpaquePointer?): FILE?

public expect fun atexit(cb: AtexitCbCallback): CInt

public expect fun cfmakeraw(termios: COpaquePointer?): CInt

public expect fun cfsetspeed(termios: COpaquePointer?, speed: SpeedT): CInt

public expect fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt
