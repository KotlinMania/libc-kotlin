package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
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
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface QsortComparCallback {
    public operator fun invoke(arg0: ConstPtr, arg1: ConstPtr): CInt
}

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: MutPtr)
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

public expect fun qsort(base: MutPtr, num: SizeT, size: SizeT, compar: QsortComparCallback?)

public expect fun bsearch(key: ConstPtr, base: ConstPtr, num: SizeT, size: SizeT, compar: QsortComparCallback?): MutPtr

public expect fun fopen(filename: ConstPtr, mode: ConstPtr): MutPtr

public expect fun freopen(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr

public expect fun fflush(file: MutPtr): CInt

public expect fun fclose(file: MutPtr): CInt

public expect fun remove(filename: ConstPtr): CInt

public expect fun rename(oldname: ConstPtr, newname: ConstPtr): CInt

public expect fun tmpfile(): MutPtr

public expect fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt

public expect fun setbuf(stream: MutPtr, buf: MutPtr)

public expect fun getchar(): CInt

public expect fun putchar(c: CInt): CInt

public expect fun fgetc(stream: MutPtr): CInt

public expect fun fgets(buf: MutPtr, n: CInt, stream: MutPtr): MutPtr

public expect fun fputc(c: CInt, stream: MutPtr): CInt

public expect fun fputs(s: ConstPtr, stream: MutPtr): CInt

public expect fun puts(s: ConstPtr): CInt

public expect fun ungetc(c: CInt, stream: MutPtr): CInt

public expect fun fread(ptr: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT

public expect fun fwrite(ptr: ConstPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT

public expect fun fseek(stream: MutPtr, offset: CLong, whence: CInt): CInt

public expect fun ftell(stream: MutPtr): CLong

public expect fun rewind(stream: MutPtr)

public expect fun fgetpos(stream: MutPtr, ptr: MutPtr): CInt

public expect fun fsetpos(stream: MutPtr, ptr: ConstPtr): CInt

public expect fun feof(stream: MutPtr): CInt

public expect fun ferror(stream: MutPtr): CInt

public expect fun clearerr(stream: MutPtr)

public expect fun perror(s: ConstPtr)

public expect fun atof(s: ConstPtr): CDouble

public expect fun atoi(s: ConstPtr): CInt

public expect fun atol(s: ConstPtr): CLong

public expect fun atoll(s: ConstPtr): CLonglong

public expect fun strtod(s: ConstPtr, endp: MutPtr): CDouble

public expect fun strtof(s: ConstPtr, endp: MutPtr): CFloat

public expect fun strtol(s: ConstPtr, endp: MutPtr, base: CInt): CLong

public expect fun strtoll(s: ConstPtr, endp: MutPtr, base: CInt): CLonglong

public expect fun strtoul(s: ConstPtr, endp: MutPtr, base: CInt): CUlong

public expect fun strtoull(s: ConstPtr, endp: MutPtr, base: CInt): CUlonglong

public expect fun calloc(nobj: SizeT, size: SizeT): MutPtr

public expect fun malloc(size: SizeT): MutPtr

public expect fun realloc(p: MutPtr, size: SizeT): MutPtr

public expect fun free(p: MutPtr)

public expect fun abort(): Nothing

public expect fun exit(status: CInt): Nothing

public expect fun system(s: ConstPtr): CInt

public expect fun getenv(s: ConstPtr): MutPtr

public expect fun strcpy(dst: MutPtr, src: ConstPtr): MutPtr

public expect fun strncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun stpcpy(dst: MutPtr, src: ConstPtr): MutPtr

public expect fun strcat(s: MutPtr, ct: ConstPtr): MutPtr

public expect fun strncat(s: MutPtr, ct: ConstPtr, n: SizeT): MutPtr

public expect fun strcmp(cs: ConstPtr, ct: ConstPtr): CInt

public expect fun strncmp(cs: ConstPtr, ct: ConstPtr, n: SizeT): CInt

public expect fun strcoll(cs: ConstPtr, ct: ConstPtr): CInt

public expect fun strchr(cs: ConstPtr, c: CInt): MutPtr

public expect fun strrchr(cs: ConstPtr, c: CInt): MutPtr

public expect fun strspn(cs: ConstPtr, ct: ConstPtr): SizeT

public expect fun strcspn(cs: ConstPtr, ct: ConstPtr): SizeT

public expect fun strdup(cs: ConstPtr): MutPtr

public expect fun strndup(cs: ConstPtr, n: SizeT): MutPtr

public expect fun strpbrk(cs: ConstPtr, ct: ConstPtr): MutPtr

public expect fun strstr(cs: ConstPtr, ct: ConstPtr): MutPtr

public expect fun strcasecmp(s1: ConstPtr, s2: ConstPtr): CInt

public expect fun strncasecmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt

public expect fun strlen(cs: ConstPtr): SizeT

public expect fun strnlen(cs: ConstPtr, maxlen: SizeT): SizeT

public expect fun strerror(n: CInt): MutPtr

public expect fun strtok(s: MutPtr, t: ConstPtr): MutPtr

public expect fun strtokR(s: MutPtr, t: ConstPtr, p: MutPtr): MutPtr

public expect fun strxfrm(s: MutPtr, ct: ConstPtr, n: SizeT): SizeT

public expect fun strsignal(sig: CInt): MutPtr

public expect fun wcslen(buf: ConstPtr): SizeT

public expect fun wcstombs(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT

public expect fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr

public expect fun wmemchr(cx: ConstPtr, c: WcharT, n: SizeT): MutPtr

public expect fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt

public expect fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr

public expect fun memccpy(dest: MutPtr, src: ConstPtr, c: CInt, n: SizeT): MutPtr

public expect fun getpwnam(name: ConstPtr): MutPtr

public expect fun getpwuid(uid: UidT): MutPtr

public expect fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: MutPtr, n: SizeT, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun fscanf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun scanf(format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun sscanf(s: ConstPtr, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun getcharUnlocked(): CInt

public expect fun putcharUnlocked(c: CInt): CInt

public expect fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt

public expect fun connect(socket: CInt, address: ConstPtr, len: SocklenT): CInt

public expect fun listen(socket: CInt, backlog: CInt): CInt

public expect fun accept(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt

public expect fun getpeername(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt

public expect fun getsockname(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt

public expect fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr, optionLen: SocklenT): CInt

public expect fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: MutPtr): CInt

public expect fun sendto(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt, addr: ConstPtr, addrlen: SocklenT): SsizeT

public expect fun shutdown(socket: CInt, how: CInt): CInt

public expect fun chmod(path: ConstPtr, mode: ModeT): CInt

public expect fun fchmod(fd: CInt, mode: ModeT): CInt

public expect fun fstat(fildes: CInt, buf: MutPtr): CInt

public expect fun mkdir(path: ConstPtr, mode: ModeT): CInt

public expect fun stat(path: ConstPtr, buf: MutPtr): CInt

public expect fun pclose(stream: MutPtr): CInt

public expect fun fdopen(fd: CInt, mode: ConstPtr): MutPtr

public expect fun fileno(stream: MutPtr): CInt

public expect fun open(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun creat(path: ConstPtr, mode: ModeT): CInt

public expect fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun opendir(dirname: ConstPtr): MutPtr

public expect fun readdir(dirp: MutPtr): MutPtr

public expect fun closedir(dirp: MutPtr): CInt

public expect fun rewinddir(dirp: MutPtr)

public expect fun fchmodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, flags: CInt): CInt

public expect fun fchown(fd: CInt, owner: UidT, group: GidT): CInt

public expect fun fchownat(dirfd: CInt, pathname: ConstPtr, owner: UidT, group: GidT, flags: CInt): CInt

public expect fun fstatat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, flags: CInt): CInt

public expect fun linkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt

public expect fun renameat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt

public expect fun symlinkat(target: ConstPtr, newdirfd: CInt, linkpath: ConstPtr): CInt

public expect fun unlinkat(dirfd: CInt, pathname: ConstPtr, flags: CInt): CInt

public expect fun access(path: ConstPtr, amode: CInt): CInt

public expect fun alarm(seconds: CUint): CUint

public expect fun chdir(dir: ConstPtr): CInt

public expect fun fchdir(dirfd: CInt): CInt

public expect fun chown(path: ConstPtr, uid: UidT, gid: GidT): CInt

public expect fun lchown(path: ConstPtr, uid: UidT, gid: GidT): CInt

public expect fun close(fd: CInt): CInt

public expect fun dup(fd: CInt): CInt

public expect fun dup2(src: CInt, dst: CInt): CInt

public expect fun execl(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun execle(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun execlp(file: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execv(prog: ConstPtr, argv: ConstPtr): CInt

public expect fun execve(prog: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun execvp(c: ConstPtr, argv: ConstPtr): CInt

public expect fun fork(): PidT

public expect fun fpathconf(filedes: CInt, name: CInt): CLong

public expect fun getcwd(buf: MutPtr, size: SizeT): MutPtr

public expect fun getegid(): GidT

public expect fun geteuid(): UidT

public expect fun getgid(): GidT

public expect fun getgroups(ngroupsMax: CInt, groups: MutPtr): CInt

public expect fun getlogin(): MutPtr

public expect fun getopt(argc: CInt, argv: ConstPtr, optstr: ConstPtr): CInt

public expect fun getpgid(pid: PidT): PidT

public expect fun getpgrp(): PidT

public expect fun getpid(): PidT

public expect fun getppid(): PidT

public expect fun getuid(): UidT

public expect fun isatty(fd: CInt): CInt

public expect fun link(src: ConstPtr, dst: ConstPtr): CInt

public expect fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT

public expect fun pathconf(path: ConstPtr, name: CInt): CLong

public expect fun pipe(fds: MutPtr): CInt

public expect fun posixMemalign(memptr: MutPtr, align: SizeT, size: SizeT): CInt

public expect fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr

public expect fun read(fd: CInt, buf: MutPtr, count: SizeT): SsizeT

public expect fun rmdir(path: ConstPtr): CInt

public expect fun seteuid(uid: UidT): CInt

public expect fun setegid(gid: GidT): CInt

public expect fun setgid(gid: GidT): CInt

public expect fun setpgid(pid: PidT, pgid: PidT): CInt

public expect fun setsid(): PidT

public expect fun setuid(uid: UidT): CInt

public expect fun setreuid(ruid: UidT, euid: UidT): CInt

public expect fun setregid(rgid: GidT, egid: GidT): CInt

public expect fun sleep(secs: CUint): CUint

public expect fun nanosleep(rqtp: ConstPtr, rmtp: MutPtr): CInt

public expect fun tcgetpgrp(fd: CInt): PidT

public expect fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt

public expect fun ttyname(fd: CInt): MutPtr

public expect fun ttynameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun unlink(c: ConstPtr): CInt

public expect fun wait(status: MutPtr): PidT

public expect fun waitpid(pid: PidT, status: MutPtr, options: CInt): PidT

public expect fun write(fd: CInt, buf: ConstPtr, count: SizeT): SsizeT

public expect fun pread(fd: CInt, buf: MutPtr, count: SizeT, offset: OffT): SsizeT

public expect fun pwrite(fd: CInt, buf: ConstPtr, count: SizeT, offset: OffT): SsizeT

public expect fun umask(mask: ModeT): ModeT

public expect fun utime(file: ConstPtr, buf: ConstPtr): CInt

public expect fun kill(pid: PidT, sig: CInt): CInt

public expect fun killpg(pgrp: PidT, sig: CInt): CInt

public expect fun mlock(addr: ConstPtr, len: SizeT): CInt

public expect fun munlock(addr: ConstPtr, len: SizeT): CInt

public expect fun mlockall(flags: CInt): CInt

public expect fun munlockall(): CInt

public expect fun mmap(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr

public expect fun munmap(addr: MutPtr, len: SizeT): CInt

public expect fun ifNametoindex(ifname: ConstPtr): CUint

public expect fun ifIndextoname(ifindex: CUint, ifname: MutPtr): MutPtr

public expect fun lstat(path: ConstPtr, buf: MutPtr): CInt

public expect fun fsync(fd: CInt): CInt

public expect fun setenv(name: ConstPtr, value: ConstPtr, overwrite: CInt): CInt

public expect fun unsetenv(name: ConstPtr): CInt

public expect fun symlink(path1: ConstPtr, path2: ConstPtr): CInt

public expect fun truncate(path: ConstPtr, length: OffT): CInt

public expect fun ftruncate(fd: CInt, length: OffT): CInt

public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

public expect fun getrusage(resource: CInt, usage: MutPtr): CInt

public expect fun realpath(pathname: ConstPtr, resolved: MutPtr): MutPtr

public expect fun times(buf: MutPtr): ClockT

public expect fun pthreadSelf(): PthreadT

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

public expect fun pthreadJoin(native: PthreadT, value: MutPtr): CInt

public expect fun pthreadExit(value: MutPtr): Nothing

public expect fun pthreadAttrInit(attr: MutPtr): CInt

public expect fun pthreadAttrDestroy(attr: MutPtr): CInt

public expect fun pthreadAttrGetstacksize(attr: ConstPtr, stacksize: MutPtr): CInt

public expect fun pthreadAttrSetstacksize(attr: MutPtr, stackSize: SizeT): CInt

public expect fun pthreadAttrSetdetachstate(attr: MutPtr, state: CInt): CInt

public expect fun pthreadDetach(thread: PthreadT): CInt

public expect fun schedYield(): CInt

public expect fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt

public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

public expect fun pthreadGetspecific(key: PthreadKeyT): MutPtr

public expect fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt

public expect fun pthreadMutexInit(lock: MutPtr, attr: ConstPtr): CInt

public expect fun pthreadMutexDestroy(lock: MutPtr): CInt

public expect fun pthreadMutexLock(lock: MutPtr): CInt

public expect fun pthreadMutexTrylock(lock: MutPtr): CInt

public expect fun pthreadMutexUnlock(lock: MutPtr): CInt

public expect fun pthreadMutexattrInit(attr: MutPtr): CInt

public expect fun pthreadMutexattrDestroy(attr: MutPtr): CInt

public expect fun pthreadMutexattrSettype(attr: MutPtr, type: CInt): CInt

public expect fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt

public expect fun pthreadCondWait(cond: MutPtr, lock: MutPtr): CInt

public expect fun pthreadCondTimedwait(cond: MutPtr, lock: MutPtr, abstime: ConstPtr): CInt

public expect fun pthreadCondSignal(cond: MutPtr): CInt

public expect fun pthreadCondBroadcast(cond: MutPtr): CInt

public expect fun pthreadCondDestroy(cond: MutPtr): CInt

public expect fun pthreadCondattrInit(attr: MutPtr): CInt

public expect fun pthreadCondattrDestroy(attr: MutPtr): CInt

public expect fun pthreadRwlockInit(lock: MutPtr, attr: ConstPtr): CInt

public expect fun pthreadRwlockDestroy(lock: MutPtr): CInt

public expect fun pthreadRwlockRdlock(lock: MutPtr): CInt

public expect fun pthreadRwlockTryrdlock(lock: MutPtr): CInt

public expect fun pthreadRwlockWrlock(lock: MutPtr): CInt

public expect fun pthreadRwlockTrywrlock(lock: MutPtr): CInt

public expect fun pthreadRwlockUnlock(lock: MutPtr): CInt

public expect fun pthreadRwlockattrInit(attr: MutPtr): CInt

public expect fun pthreadRwlockattrDestroy(attr: MutPtr): CInt

public expect fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr, optlen: MutPtr): CInt

public expect fun raise(signum: CInt): CInt

public expect fun utimes(filename: ConstPtr, times: ConstPtr): CInt

public expect fun dlopen(filename: ConstPtr, flag: CInt): MutPtr

public expect fun dlerror(): MutPtr

public expect fun dlsym(handle: MutPtr, symbol: ConstPtr): MutPtr

public expect fun dlclose(handle: MutPtr): CInt

public expect fun getaddrinfo(node: ConstPtr, service: ConstPtr, hints: ConstPtr, res: MutPtr): CInt

public expect fun freeaddrinfo(res: MutPtr)

public expect fun hstrerror(errcode: CInt): ConstPtr

public expect fun gaiStrerror(errcode: CInt): ConstPtr

public expect fun resInit(): CInt

public expect fun gmtimeR(timeP: ConstPtr, result: MutPtr): MutPtr

public expect fun localtimeR(timeP: ConstPtr, result: MutPtr): MutPtr

public expect fun mktime(tm: MutPtr): TimeT

public expect fun time(time: MutPtr): TimeT

public expect fun gmtime(timeP: ConstPtr): MutPtr

public expect fun localtime(timeP: ConstPtr): MutPtr

public expect fun difftime(time1: TimeT, time0: TimeT): CDouble

public expect fun timegm(tm: MutPtr): TimeT

public expect fun mknod(pathname: ConstPtr, mode: ModeT, dev: DevT): CInt

public expect fun gethostname(name: MutPtr, len: SizeT): CInt

public expect fun endservent()

public expect fun getservbyname(name: ConstPtr, proto: ConstPtr): MutPtr

public expect fun getservbyport(port: CInt, proto: ConstPtr): MutPtr

public expect fun getservent(): MutPtr

public expect fun setservent(stayopen: CInt)

public expect fun getprotobyname(name: ConstPtr): MutPtr

public expect fun getprotobynumber(proto: CInt): MutPtr

public expect fun chroot(name: ConstPtr): CInt

public expect fun usleep(secs: UsecondsT): CInt

public expect fun send(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt): SsizeT

public expect fun recv(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt): SsizeT

public expect fun putenv(string: MutPtr): CInt

public expect fun poll(fds: MutPtr, nfds: NfdsT, timeout: CInt): CInt

public expect fun select(nfds: CInt, readfds: MutPtr, writefds: MutPtr, errorfds: MutPtr, timeout: MutPtr): CInt

public expect fun setlocale(category: CInt, locale: ConstPtr): MutPtr

public expect fun localeconv(): MutPtr

public expect fun semWait(sem: MutPtr): CInt

public expect fun semTrywait(sem: MutPtr): CInt

public expect fun semPost(sem: MutPtr): CInt

public expect fun statvfs(path: ConstPtr, buf: MutPtr): CInt

public expect fun fstatvfs(fd: CInt, buf: MutPtr): CInt

public expect fun sigemptyset(set: MutPtr): CInt

public expect fun sigaddset(set: MutPtr, signum: CInt): CInt

public expect fun sigfillset(set: MutPtr): CInt

public expect fun sigdelset(set: MutPtr, signum: CInt): CInt

public expect fun sigismember(set: ConstPtr, signum: CInt): CInt

public expect fun sigprocmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt

public expect fun sigpending(set: MutPtr): CInt

public expect fun sysconf(name: CInt): CLong

public expect fun mkfifo(path: ConstPtr, mode: ModeT): CInt

public expect fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: MutPtr): OffT

public expect fun tcdrain(fd: CInt): CInt

public expect fun cfgetispeed(termios: ConstPtr): SpeedT

public expect fun cfgetospeed(termios: ConstPtr): SpeedT

public expect fun cfsetispeed(termios: MutPtr, speed: SpeedT): CInt

public expect fun cfsetospeed(termios: MutPtr, speed: SpeedT): CInt

public expect fun tcgetattr(fd: CInt, termios: MutPtr): CInt

public expect fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr): CInt

public expect fun tcflow(fd: CInt, action: CInt): CInt

public expect fun tcflush(fd: CInt, action: CInt): CInt

public expect fun tcgetsid(fd: CInt): PidT

public expect fun tcsendbreak(fd: CInt, duration: CInt): CInt

public expect fun mkstemp(template: MutPtr): CInt

public expect fun mkdtemp(template: MutPtr): MutPtr

public expect fun tmpnam(ptr: MutPtr): MutPtr

public expect fun openlog(ident: ConstPtr, logopt: CInt, facility: CInt)

public expect fun closelog()

public expect fun setlogmask(maskpri: CInt): CInt

public expect fun syslog(priority: CInt, message: ConstPtr, vararg variadicArgs: Long)

public expect fun nice(incr: CInt): CInt

public expect fun grantpt(fd: CInt): CInt

public expect fun posixOpenpt(flags: CInt): CInt

public expect fun ptsname(fd: CInt): MutPtr

public expect fun unlockpt(fd: CInt): CInt

public expect fun strcasestr(cs: ConstPtr, ct: ConstPtr): MutPtr

public expect fun getline(lineptr: MutPtr, n: MutPtr, stream: MutPtr): SsizeT

public expect fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt

public fun htonl(hostlong: UInt): UInt = ((((hostlong) shl 24)) or (((hostlong) and 0x0000FF00u) shl 8) or (((hostlong) shr 8) and 0x0000FF00u) or ((hostlong) shr 24))

public fun htons(hostshort: UShort): UShort = (((((hostshort).toUInt() and 0xFFu) shl 8) or (((hostshort).toUInt() shr 8) and 0xFFu)).toUShort())

public fun ntohl(netlong: UInt): UInt = ((((netlong) shl 24)) or (((netlong) and 0x0000FF00u) shl 8) or (((netlong) shr 8) and 0x0000FF00u) or ((netlong) shr 24))

public fun ntohs(netshort: UShort): UShort = (((((netshort).toUInt() and 0xFFu) shl 8) or (((netshort).toUInt() shr 8) and 0xFFu)).toUShort())

public expect fun adjtime(delta: ConstPtr, olddelta: MutPtr): CInt

public expect fun stpncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt

public expect fun confstr(name: CInt, buf: MutPtr, len: SizeT): SizeT

public expect fun dladdr(addr: ConstPtr, info: MutPtr): CInt

public expect fun flock(fd: CInt, operation: CInt): CInt

public expect fun openWmemstream(ptr: MutPtr, sizeloc: MutPtr): MutPtr

public expect fun getsid(pid: PidT): PidT

public expect fun pause(): CInt

public expect fun mkdirat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt

public expect fun openat(dirfd: CInt, pathname: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt

public expect fun fdopendir(fd: CInt): MutPtr

// Note(docs): `<>` breaks line length limit.

/**
 * The 64-bit libc on Solaris and illumos only has readdirR. If a
 * 32-bit Solaris or illumos target is ever created, it should use
 * __posix_readdir_r. See libc(3LIB) on Solaris or illumos:
 * https://illumos.org/man/3lib/libc
 * https://docs.oracle.com/cd/E36784_01/html/E36873/libc-3lib.html
 * https://www.unix.com/man-page/opensolaris/3LIB/libc/
 */
public expect fun readdirR(dirp: MutPtr, entry: MutPtr, result: MutPtr): CInt

public expect fun readlinkat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, bufsiz: SizeT): CInt

public expect fun readlink(path: ConstPtr, buf: MutPtr, bufsz: SizeT): CInt

public expect fun pselect(nfds: CInt, readfds: MutPtr, writefds: MutPtr, errorfds: MutPtr, timeout: MutPtr, sigmask: ConstPtr): CInt

public expect fun sigaction(signum: CInt, act: ConstPtr, oldact: MutPtr): CInt

public expect fun fmemopen(buf: MutPtr, size: SizeT, mode: ConstPtr): MutPtr

public expect fun openMemstream(ptr: MutPtr, sizeloc: MutPtr): MutPtr

public expect fun atexit(cb: AtexitCbCallback): CInt

public expect fun cfmakeraw(termios: MutPtr): CInt

public expect fun cfsetspeed(termios: MutPtr, speed: SpeedT): CInt

public expect fun fnmatch(pattern: ConstPtr, name: ConstPtr, flags: CInt): CInt
