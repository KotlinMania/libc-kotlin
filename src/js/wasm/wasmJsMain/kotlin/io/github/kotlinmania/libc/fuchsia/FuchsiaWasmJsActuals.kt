@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.fuchsia

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
import io.github.kotlinmania.libc.fuchsia.aarch64.WcharT

public actual fun isalnum(c: CInt): CInt =
    0

public actual fun isalpha(c: CInt): CInt =
    0

public actual fun iscntrl(c: CInt): CInt =
    0

public actual fun isdigit(c: CInt): CInt =
    0

public actual fun isgraph(c: CInt): CInt =
    0

public actual fun islower(c: CInt): CInt =
    0

public actual fun isprint(c: CInt): CInt =
    0

public actual fun ispunct(c: CInt): CInt =
    0

public actual fun isspace(c: CInt): CInt =
    0

public actual fun isupper(c: CInt): CInt =
    0

public actual fun isxdigit(c: CInt): CInt =
    0

public actual fun isblank(c: CInt): CInt =
    0

public actual fun tolower(c: CInt): CInt =
    0

public actual fun toupper(c: CInt): CInt =
    0

public actual fun fopen(filename: String?, mode: String?): FILE? =
    null

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    null

public actual fun fflush(file: FILE?): CInt =
    0

public actual fun fclose(file: FILE?): CInt =
    0

public actual fun remove(filename: String?): CInt =
    0

public actual fun rename(oldname: String?, newname: String?): CInt =
    0

public actual fun tmpfile(): FILE? =
    null

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    0

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
}

public actual fun getchar(): CInt =
    0

public actual fun putchar(c: CInt): CInt =
    0

public actual fun fgetc(stream: FILE?): CInt =
    0

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    null

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    0

public actual fun fputs(s: String?, stream: FILE?): CInt =
    0

public actual fun puts(s: String?): CInt =
    0

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    0

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    0uL

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    0uL

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    0

public actual fun ftell(stream: FILE?): CLong =
    0L

public actual fun rewind(stream: FILE?) {
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    0

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    0

public actual fun feof(stream: FILE?): CInt =
    0

public actual fun ferror(stream: FILE?): CInt =
    0

public actual fun perror(s: String?) {
}

public actual fun atof(s: String?): CDouble =
    0.0

public actual fun atoi(s: String?): CInt =
    0

public actual fun atol(s: String?): CLong =
    0L

public actual fun atoll(s: String?): CLonglong =
    0L

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    0.0

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    0.0f

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    0L

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    0L

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    0uL

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    0uL

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun malloc(size: SizeT): COpaquePointer? =
    null

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    null

public actual fun free(p: COpaquePointer?) {
}

public actual fun abort(): Nothing =
    error("Unreachable noreturn C function abort")

public actual fun exit(status: CInt): Nothing =
    error("Unreachable noreturn C function exit")

public actual fun atexit(cb: SigactionSaRestorerCallback): CInt =
    0

public actual fun system(s: String?): CInt =
    0

public actual fun getenv(s: String?): COpaquePointer? =
    null

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    null

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    null

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    null

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    null

public actual fun strcmp(cs: String?, ct: String?): CInt =
    0

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    0

public actual fun strcoll(cs: String?, ct: String?): CInt =
    0

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    null

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    null

public actual fun strspn(cs: String?, ct: String?): SizeT =
    0uL

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    0uL

public actual fun strdup(cs: String?): COpaquePointer? =
    null

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    null

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    null

public actual fun strlen(cs: String?): SizeT =
    0uL

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    0uL

public actual fun strerror(n: CInt): COpaquePointer? =
    null

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    null

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    0uL

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    0uL

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    0uL

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    null

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    null

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    0

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    null

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    null

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    null

public actual fun abs(i: CInt): CInt =
    0

public actual fun labs(i: CLong): CLong =
    0L

public actual fun rand(): CInt =
    0

public actual fun srand(seed: CUint) {
}

public actual fun getpwnam(name: String?): COpaquePointer? =
    null

public actual fun getpwuid(uid: UidT): COpaquePointer? =
    null

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun getcharUnlocked(): CInt =
    0

public actual fun putcharUnlocked(c: CInt): CInt =
    0

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    0

public actual fun connect(socket: CInt, address: COpaquePointer?, len: SocklenT): CInt =
    0

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    0

public actual fun accept(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    0

public actual fun getpeername(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    0

public actual fun getsockname(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    0

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    0

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: COpaquePointer?): CInt =
    0

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    0L

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    0

public actual fun chmod(path: String?, mode: ModeT): CInt =
    0

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    0

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    0

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun pclose(stream: FILE?): CInt =
    0

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    null

public actual fun fileno(stream: FILE?): CInt =
    0

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun creat(path: String?, mode: ModeT): CInt =
    0

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun opendir(dirname: String?): DIR? =
    null

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    null

public actual fun readdirR(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    0

public actual fun closedir(dirp: DIR?): CInt =
    0

public actual fun rewinddir(dirp: DIR?) {
}

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    0

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    0

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    0

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    0

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    0

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT =
    0L

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    0

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    0

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    0

public actual fun access(path: String?, amode: CInt): CInt =
    0

public actual fun alarm(seconds: CUint): CUint =
    0u

public actual fun chdir(dir: String?): CInt =
    0

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    0

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    0

public actual fun close(fd: CInt): CInt =
    0

public actual fun dup(fd: CInt): CInt =
    0

public actual fun dup2(src: CInt, dst: CInt): CInt =
    0

public actual fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun execlp(file: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    0

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    0

public actual fun fork(): PidT =
    0

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    0L

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    null

public actual fun getegid(): GidT =
    0u

public actual fun geteuid(): UidT =
    0u

public actual fun getgid(): GidT =
    0u

public actual fun getgroups(ngroupsMax: CInt, groups: COpaquePointer?): CInt =
    0

public actual fun getlogin(): COpaquePointer? =
    null

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    0

public actual fun getpgid(pid: PidT): PidT =
    0

public actual fun getpgrp(): PidT =
    0

public actual fun getpid(): PidT =
    0

public actual fun getppid(): PidT =
    0

public actual fun getuid(): UidT =
    0u

public actual fun isatty(fd: CInt): CInt =
    0

public actual fun link(src: String?, dst: String?): CInt =
    0

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    0L

public actual fun pathconf(path: String?, name: CInt): CLong =
    0L

public actual fun pause(): CInt =
    0

public actual fun pipe(fds: COpaquePointer?): CInt =
    0

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    0

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    0L

public actual fun rmdir(path: String?): CInt =
    0

public actual fun seteuid(uid: UidT): CInt =
    0

public actual fun setegid(gid: GidT): CInt =
    0

public actual fun setgid(gid: GidT): CInt =
    0

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    0

public actual fun setsid(): PidT =
    0

public actual fun setuid(uid: UidT): CInt =
    0

public actual fun sleep(secs: CUint): CUint =
    0u

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    0

public actual fun tcgetpgrp(fd: CInt): PidT =
    0

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    0

public actual fun ttyname(fd: CInt): COpaquePointer? =
    null

public actual fun unlink(c: String?): CInt =
    0

public actual fun wait(status: COpaquePointer?): PidT =
    0

public actual fun waitpid(pid: PidT, status: COpaquePointer?, options: CInt): PidT =
    0

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    0L

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    0L

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    0L

public actual fun umask(mask: ModeT): ModeT =
    0u

public actual fun utime(file: String?, buf: COpaquePointer?): CInt =
    0

public actual fun kill(pid: PidT, sig: CInt): CInt =
    0

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun mlockall(flags: CInt): CInt =
    0

public actual fun munlockall(): CInt =
    0

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    null

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun ifNametoindex(ifname: String?): CUint =
    0u

public actual fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer? =
    null

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun fsync(fd: CInt): CInt =
    0

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    0

public actual fun unsetenv(name: String?): CInt =
    0

public actual fun symlink(path1: String?, path2: String?): CInt =
    0

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    0

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    0uL

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    null

public actual fun flock(fd: CInt, operation: CInt): CInt =
    0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun times(buf: COpaquePointer?): ClockT =
    0L

public actual fun pthreadSelf(): PthreadT =
    0uL

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    0

public actual fun pthreadExit(value: COpaquePointer?): Nothing =
    error("Unreachable noreturn C function pthreadExit")

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    0

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    0

public actual fun pthreadDetach(thread: PthreadT): CInt =
    0

public actual fun schedYield(): CInt =
    0

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    0

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    0

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    null

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    0

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    0

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    0

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    0

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    0

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    0

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    0

public actual fun raise(signum: CInt): CInt =
    0

public actual fun sigaction(signum: CInt, act: COpaquePointer?, oldact: COpaquePointer?): CInt =
    0

public actual fun utimes(filename: String?, times: COpaquePointer?): CInt =
    0

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    null

public actual fun dlerror(): COpaquePointer? =
    null

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    null

public actual fun dlclose(handle: COpaquePointer?): CInt =
    0

public actual fun dladdr(addr: COpaquePointer?, info: COpaquePointer?): CInt =
    0

public actual fun getaddrinfo(node: String?, service: String?, hints: COpaquePointer?, res: COpaquePointer?): CInt =
    0

public actual fun freeaddrinfo(res: COpaquePointer?) {
}

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    null

public actual fun resInit(): CInt =
    0

public actual fun gmtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    null

public actual fun localtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    null

public actual fun mktime(tm: COpaquePointer?): TimeT =
    0L

public actual fun time(time: COpaquePointer?): TimeT =
    0L

public actual fun gmtime(timeP: COpaquePointer?): COpaquePointer? =
    null

public actual fun localtime(timeP: COpaquePointer?): COpaquePointer? =
    null

public actual fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt =
    0

public actual fun uname(buf: COpaquePointer?): CInt =
    0

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun getservbyname(name: String?, proto: String?): COpaquePointer? =
    null

public actual fun getprotobyname(name: String?): COpaquePointer? =
    null

public actual fun getprotobynumber(proto: CInt): COpaquePointer? =
    null

public actual fun usleep(secs: CUint): CInt =
    0

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    0L

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    0L

public actual fun putenv(string: COpaquePointer?): CInt =
    0

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    0

public actual fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt =
    0

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    null

public actual fun localeconv(): COpaquePointer? =
    null

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    0

public actual fun semWait(sem: COpaquePointer?): CInt =
    0

public actual fun semTrywait(sem: COpaquePointer?): CInt =
    0

public actual fun semPost(sem: COpaquePointer?): CInt =
    0

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    0

public actual fun statvfs(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun fstatvfs(fd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT =
    0L

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    0

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    0

public actual fun sigfillset(set: COpaquePointer?): CInt =
    0

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    0

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    0

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    0

public actual fun sigpending(set: COpaquePointer?): CInt =
    0

public actual fun timegm(tm: COpaquePointer?): TimeT =
    0L

public actual fun getsid(pid: PidT): PidT =
    0

public actual fun sysconf(name: CInt): CLong =
    0L

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    0

public actual fun pselect(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    0

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    0

public actual fun ftello(stream: FILE?): OffT =
    0L

public actual fun tcdrain(fd: CInt): CInt =
    0

public actual fun cfgetispeed(termios: COpaquePointer?): SpeedT =
    0u

public actual fun cfgetospeed(termios: COpaquePointer?): SpeedT =
    0u

public actual fun cfmakeraw(termios: COpaquePointer?) {
}

public actual fun cfsetispeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    0

public actual fun cfsetospeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    0

public actual fun cfsetspeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    0

public actual fun tcgetattr(fd: CInt, termios: COpaquePointer?): CInt =
    0

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: COpaquePointer?): CInt =
    0

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    0

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    0

public actual fun tcgetsid(fd: CInt): PidT =
    0

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    0

public actual fun mkstemp(template: COpaquePointer?): CInt =
    0

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    null

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    null

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
}

public actual fun closelog() {
}

public actual fun setlogmask(maskpri: CInt): CInt =
    0

public actual fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long) {
}

public actual fun grantpt(fd: CInt): CInt =
    0

public actual fun posixOpenpt(flags: CInt): CInt =
    0

public actual fun ptsname(fd: CInt): COpaquePointer? =
    null

public actual fun unlockpt(fd: CInt): CInt =
    0

public actual fun fdatasync(fd: CInt): CInt =
    0

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun dirfd(dirp: DIR?): CInt =
    0

public actual fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    0

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun setgroups(ngroups: SizeT, ptr: COpaquePointer?): CInt =
    0

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    null

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    0

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    0

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    0

public actual fun duplocale(base: LocaleT): LocaleT =
    null

public actual fun freelocale(loc: LocaleT) {
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    null

public actual fun uselocale(loc: LocaleT): LocaleT =
    null

public actual fun fdopendir(fd: CInt): DIR? =
    null

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    0

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    0

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    0

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun clearenv(): CInt =
    0

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    0

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    0

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    0

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    0

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    0

public actual fun acct(filename: String?): CInt =
    0

public actual fun brk(addr: COpaquePointer?): CInt =
    0

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    0

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    0

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    0

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    0

public actual fun setpwent() {
}

public actual fun endpwent() {
}

public actual fun getpwent(): COpaquePointer? =
    null

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    0

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    0

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    null

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    0

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    0

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    0

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    0

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    0

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    0L

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    0

public actual fun errnoLocation(): COpaquePointer? =
    null

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    0

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    0

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    0L

public actual fun signalfd(fd: CInt, mask: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    0

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    0

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    0

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    0L

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    0L

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt =
    0

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    0

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    0

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    0

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    0

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    null

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    0

public actual fun reboot(howTo: CInt): CInt =
    0

public actual fun setfsgid(gid: GidT): CInt =
    0

public actual fun setfsuid(uid: UidT): CInt =
    0

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    0

public actual fun ifNameindex(): COpaquePointer? =
    null

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
}

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    0

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    0

public actual fun freeifaddrs(ifa: COpaquePointer?) {
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    0

public actual fun globfree(pglob: COpaquePointer?) {
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    0

public actual fun shmUnlink(name: String?): CInt =
    0

public actual fun seekdir(dirp: DIR?, loc: CLong) {
}

public actual fun telldir(dirp: DIR?): CLong =
    0L

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    0

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    0

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    0L

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    0

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    0

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    null

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    0

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    0L

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    0L

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    0L

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    0L

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    0

public actual fun vhangup(): CInt =
    0

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    0

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    0

public actual fun sync() {
}

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    0L

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    0

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    0

public actual fun umount(target: String?): CInt =
    0

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    0

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    0L

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun splice(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    0L

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    0

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    0

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    0

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    0

public actual fun swapoff(puath: String?): CInt =
    0

public actual fun vmsplice(fd: CInt, iov: COpaquePointer?, nrSegs: SizeT, flags: CUint): SsizeT =
    0L

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    0

public actual fun personality(persona: CUlong): CInt =
    0

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    0

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt =
    0

public actual fun schedGetscheduler(pid: PidT): CInt =
    0

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    0

public actual fun sethostname(name: String?, len: SizeT): CInt =
    0

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    0

public actual fun umount2(target: String?, flags: CInt): CInt =
    0

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    0

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    0

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    0

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    0

public actual fun semClose(sem: COpaquePointer?): CInt =
    0

public actual fun getdtablesize(): CInt =
    0

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun initgroups(user: String?, group: GidT): CInt =
    0

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    0

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    null

public actual fun pthreadCancel(thread: PthreadT): CInt =
    0

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    0

public actual fun semUnlink(name: String?): CInt =
    0

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    0

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    0

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    0

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    null

public actual fun setgrent() {
}

public actual fun endgrent() {
}

public actual fun getgrent(): COpaquePointer? =
    null

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    0

public actual fun popen(command: String?, mode: String?): FILE? =
    null

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    0

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    0

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    0
