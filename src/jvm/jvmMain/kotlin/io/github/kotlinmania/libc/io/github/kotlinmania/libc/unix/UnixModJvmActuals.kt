package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.COpaquePointer

internal object UnixModRawLibc {
    external fun isalnum(c: Int): Int
    external fun isalpha(c: Int): Int
    external fun iscntrl(c: Int): Int
    external fun isdigit(c: Int): Int
    external fun isgraph(c: Int): Int
    external fun islower(c: Int): Int
    external fun isprint(c: Int): Int
    external fun ispunct(c: Int): Int
    external fun isspace(c: Int): Int
    external fun isupper(c: Int): Int
    external fun isxdigit(c: Int): Int
    external fun isblank(c: Int): Int
    external fun tolower(c: Int): Int
    external fun toupper(c: Int): Int
    external fun qsort(base: Long, num: Long, size: Long, compar: Long)
    external fun bsearch(key: Long, base: Long, num: Long, size: Long, compar: Long): Long?
    external fun fopen(filename: String?, mode: String?): Long?
    external fun freopen(filename: String?, mode: String?, file: Long): Long?
    external fun fflush(file: Long): Int
    external fun fclose(file: Long): Int
    external fun remove(filename: String?): Int
    external fun rename(oldname: String?, newname: String?): Int
    external fun tmpfile(): Long?
    external fun setvbuf(stream: Long, buffer: Long, mode: Int, size: Long): Int
    external fun setbuf(stream: Long, buf: Long)
    external fun getchar(): Int
    external fun putchar(c: Int): Int
    external fun fgetc(stream: Long): Int
    external fun fgets(buf: Long, n: Int, stream: Long): Long?
    external fun fputc(c: Int, stream: Long): Int
    external fun fputs(s: String?, stream: Long): Int
    external fun puts(s: String?): Int
    external fun ungetc(c: Int, stream: Long): Int
    external fun fread(ptr: Long, size: Long, nobj: Long, stream: Long): Long
    external fun fwrite(ptr: Long, size: Long, nobj: Long, stream: Long): Long
    external fun fseek(stream: Long, offset: Long, whence: Int): Int
    external fun ftell(stream: Long): Long
    external fun rewind(stream: Long)
    external fun fgetpos(stream: Long, ptr: Long): Int
    external fun fsetpos(stream: Long, ptr: Long): Int
    external fun feof(stream: Long): Int
    external fun ferror(stream: Long): Int
    external fun clearerr(stream: Long)
    external fun perror(s: String?)
    external fun atof(s: String?): Double
    external fun atoi(s: String?): Int
    external fun atol(s: String?): Long
    external fun atoll(s: String?): Long
    external fun strtod(s: String?, endp: Long): Double
    external fun strtof(s: String?, endp: Long): Float
    external fun strtol(s: String?, endp: Long, base: Int): Long
    external fun strtoll(s: String?, endp: Long, base: Int): Long
    external fun strtoul(s: String?, endp: Long, base: Int): Long
    external fun strtoull(s: String?, endp: Long, base: Int): Long
    external fun calloc(nobj: Long, size: Long): Long?
    external fun malloc(size: Long): Long?
    external fun realloc(p: Long, size: Long): Long?
    external fun free(p: Long)
    external fun abort(): Long
    external fun exit(status: Int): Long
    external fun system(s: String?): Int
    external fun getenv(s: String?): Long?
    external fun strcpy(dst: Long, src: String?): Long?
    external fun strncpy(dst: Long, src: String?, n: Long): Long?
    external fun stpcpy(dst: Long, src: String?): Long?
    external fun strcat(s: Long, ct: String?): Long?
    external fun strncat(s: Long, ct: String?, n: Long): Long?
    external fun strcmp(cs: String?, ct: String?): Int
    external fun strncmp(cs: String?, ct: String?, n: Long): Int
    external fun strcoll(cs: String?, ct: String?): Int
    external fun strchr(cs: String?, c: Int): Long?
    external fun strrchr(cs: String?, c: Int): Long?
    external fun strspn(cs: String?, ct: String?): Long
    external fun strcspn(cs: String?, ct: String?): Long
    external fun strdup(cs: String?): Long?
    external fun strndup(cs: String?, n: Long): Long?
    external fun strpbrk(cs: String?, ct: String?): Long?
    external fun strstr(cs: String?, ct: String?): Long?
    external fun strcasecmp(s1: String?, s2: String?): Int
    external fun strncasecmp(s1: String?, s2: String?, n: Long): Int
    external fun strlen(cs: String?): Long
    external fun strnlen(cs: String?, maxlen: Long): Long
    external fun strerror(n: Int): Long?
    external fun strtok(s: Long, t: String?): Long?
    external fun strtokR(s: Long, t: String?, p: Long): Long?
    external fun strxfrm(s: Long, ct: String?, n: Long): Long
    external fun strsignal(sig: Int): Long?
    external fun wcslen(buf: Long): Long
    external fun wcstombs(dest: Long, src: Long, n: Long): Long
    external fun memchr(cx: Long, c: Int, n: Long): Long?
    external fun wmemchr(cx: Long, c: Int, n: Long): Long?
    external fun memcmp(cx: Long, ct: Long, n: Long): Int
    external fun memcpy(dest: Long, src: Long, n: Long): Long?
    external fun memmove(dest: Long, src: Long, n: Long): Long?
    external fun memset(dest: Long, c: Int, n: Long): Long?
    external fun memccpy(dest: Long, src: Long, c: Int, n: Long): Long?
    external fun getpwnam(name: String?): Long?
    external fun getpwuid(uid: Long): Long?
    external fun getcharUnlocked(): Int
    external fun putcharUnlocked(c: Int): Int
    external fun socket(domain: Int, ty: Int, protocol: Int): Int
    external fun connect(socket: Int, address: Long, len: Int): Int
    external fun listen(socket: Int, backlog: Int): Int
    external fun accept(socket: Int, address: Long, addressLen: Long): Int
    external fun getpeername(socket: Int, address: Long, addressLen: Long): Int
    external fun getsockname(socket: Int, address: Long, addressLen: Long): Int
    external fun setsockopt(socket: Int, level: Int, name: Int, value: Long, optionLen: Int): Int
    external fun socketpair(domain: Int, type: Int, protocol: Int, socketVector: Long): Int
    external fun sendto(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Int): Long
    external fun shutdown(socket: Int, how: Int): Int
    external fun chmod(path: String?, mode: Int): Int
    external fun fchmod(fd: Int, mode: Int): Int
    external fun fstat(fildes: Int, buf: Long): Int
    external fun mkdir(path: String?, mode: Int): Int
    external fun stat(path: String?, buf: Long): Int
    external fun pclose(stream: Long): Int
    external fun fdopen(fd: Int, mode: String?): Long?
    external fun fileno(stream: Long): Int
    external fun creat(path: String?, mode: Int): Int
    external fun opendir(dirname: String?): Long?
    external fun readdir(dirp: Long): Long?
    external fun closedir(dirp: Long): Int
    external fun rewinddir(dirp: Long)
    external fun fchmodat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int
    external fun fchown(fd: Int, owner: Long, group: Long): Int
    external fun fchownat(dirfd: Int, pathname: String?, owner: Long, group: Long, flags: Int): Int
    external fun fstatat(dirfd: Int, pathname: String?, buf: Long, flags: Int): Int
    external fun linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int
    external fun renameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int
    external fun symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int
    external fun unlinkat(dirfd: Int, pathname: String?, flags: Int): Int
    external fun access(path: String?, amode: Int): Int
    external fun alarm(seconds: Int): Int
    external fun chdir(dir: String?): Int
    external fun fchdir(dirfd: Int): Int
    external fun chown(path: String?, uid: Int, gid: Int): Int
    external fun lchown(path: String?, uid: Int, gid: Int): Int
    external fun close(fd: Int): Int
    external fun dup(fd: Int): Int
    external fun dup2(src: Int, dst: Int): Int
    external fun execv(prog: String?, argv: Long): Int
    external fun execve(prog: String?, argv: Long, envp: Long): Int
    external fun execvp(c: String?, argv: Long): Int
    external fun fork(): Int
    external fun fpathconf(filedes: Int, name: Int): Long
    external fun getcwd(buf: Long, size: Long): Long?
    external fun getegid(): Int
    external fun geteuid(): Int
    external fun getgid(): Int
    external fun getgroups(ngroupsMax: Int, groups: Long): Int
    external fun getlogin(): Long?
    external fun getopt(argc: Int, argv: Long, optstr: String?): Int
    external fun getpgid(pid: Int): Int
    external fun getpgrp(): Int
    external fun getpid(): Int
    external fun getppid(): Int
    external fun getuid(): Int
    external fun isatty(fd: Int): Int
    external fun link(src: String?, dst: String?): Int
    external fun lseek(fd: Int, offset: Long, whence: Int): Long
    external fun pathconf(path: String?, name: Int): Long
    external fun pipe(fds: Long): Int
    external fun posixMemalign(memptr: Long, align: Long, size: Long): Int
    external fun alignedAlloc(alignment: Long, size: Long): Long?
    external fun read(fd: Int, buf: Long, count: Long): Long
    external fun rmdir(path: String?): Int
    external fun seteuid(uid: Int): Int
    external fun setegid(gid: Int): Int
    external fun setgid(gid: Int): Int
    external fun setpgid(pid: Int, pgid: Int): Int
    external fun setsid(): Int
    external fun setuid(uid: Int): Int
    external fun setreuid(ruid: Int, euid: Int): Int
    external fun setregid(rgid: Int, egid: Int): Int
    external fun sleep(secs: Int): Int
    external fun nanosleep(rqtp: Long, rmtp: Long): Int
    external fun tcgetpgrp(fd: Int): Int
    external fun tcsetpgrp(fd: Int, pgrp: Long): Int
    external fun ttyname(fd: Int): Long?
    external fun ttynameR(fd: Int, buf: Long, buflen: Long): Int
    external fun unlink(c: String?): Int
    external fun wait(status: Long): Int
    external fun waitpid(pid: Int, status: Long, options: Int): Int
    external fun write(fd: Int, buf: Long, count: Long): Long
    external fun pread(fd: Int, buf: Long, count: Long, offset: Long): Long
    external fun pwrite(fd: Int, buf: Long, count: Long, offset: Long): Long
    external fun umask(mask: Int): Int
    external fun utime(file: String?, buf: Long): Int
    external fun kill(pid: Int, sig: Int): Int
    external fun killpg(pgrp: Int, sig: Int): Int
    external fun mlock(addr: Long, len: Long): Int
    external fun munlock(addr: Long, len: Long): Int
    external fun mlockall(flags: Int): Int
    external fun munlockall(): Int
    external fun mmap(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long?
    external fun munmap(addr: Long, len: Long): Int
    external fun ifNametoindex(ifname: String?): Int
    external fun ifIndextoname(ifindex: Int, ifname: Long): Long?
    external fun lstat(path: String?, buf: Long): Int
    external fun fsync(fd: Int): Int
    external fun setenv(name: String?, value: String?, overwrite: Int): Int
    external fun unsetenv(name: String?): Int
    external fun symlink(path1: String?, path2: String?): Int
    external fun truncate(path: String?, length: Long): Int
    external fun ftruncate(fd: Int, length: Long): Int
    external fun signal(signum: Int, handler: Long): Long
    external fun getrusage(resource: Int, usage: Long): Int
    external fun realpath(pathname: String?, resolved: Long): Long?
    external fun times(buf: Long): Long
    external fun pthreadSelf(): Long
    external fun pthreadEqual(t1: Long, t2: Long): Int
    external fun pthreadJoin(native: Long, value: Long): Int
    external fun pthreadExit(value: Long): Long
    external fun pthreadAttrInit(attr: Long): Int
    external fun pthreadAttrDestroy(attr: Long): Int
    external fun pthreadAttrGetstacksize(attr: Long, stacksize: Long): Int
    external fun pthreadAttrSetstacksize(attr: Long, stackSize: Long): Int
    external fun pthreadAttrSetdetachstate(attr: Long, state: Int): Int
    external fun pthreadDetach(thread: Long): Int
    external fun schedYield(): Int
    external fun pthreadKeyCreate(key: Long, dtor: Long): Int
    external fun pthreadKeyDelete(key: Long): Int
    external fun pthreadGetspecific(key: Long): Long?
    external fun pthreadSetspecific(key: Long, value: Long): Int
    external fun pthreadMutexInit(lock: Long, attr: Long): Int
    external fun pthreadMutexDestroy(lock: Long): Int
    external fun pthreadMutexLock(lock: Long): Int
    external fun pthreadMutexTrylock(lock: Long): Int
    external fun pthreadMutexUnlock(lock: Long): Int
    external fun pthreadMutexattrInit(attr: Long): Int
    external fun pthreadMutexattrDestroy(attr: Long): Int
    external fun pthreadMutexattrSettype(attr: Long, type: Int): Int
    external fun pthreadCondInit(cond: Long, attr: Long): Int
    external fun pthreadCondWait(cond: Long, lock: Long): Int
    external fun pthreadCondTimedwait(cond: Long, lock: Long, abstime: Long): Int
    external fun pthreadCondSignal(cond: Long): Int
    external fun pthreadCondBroadcast(cond: Long): Int
    external fun pthreadCondDestroy(cond: Long): Int
    external fun pthreadCondattrInit(attr: Long): Int
    external fun pthreadCondattrDestroy(attr: Long): Int
    external fun pthreadRwlockInit(lock: Long, attr: Long): Int
    external fun pthreadRwlockDestroy(lock: Long): Int
    external fun pthreadRwlockRdlock(lock: Long): Int
    external fun pthreadRwlockTryrdlock(lock: Long): Int
    external fun pthreadRwlockWrlock(lock: Long): Int
    external fun pthreadRwlockTrywrlock(lock: Long): Int
    external fun pthreadRwlockUnlock(lock: Long): Int
    external fun pthreadRwlockattrInit(attr: Long): Int
    external fun pthreadRwlockattrDestroy(attr: Long): Int
    external fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Long): Int
    external fun raise(signum: Int): Int
    external fun utimes(filename: String?, times: Long): Int
    external fun dlopen(filename: String?, flag: Int): Long?
    external fun dlerror(): Long?
    external fun dlsym(handle: Long, symbol: String?): Long?
    external fun dlclose(handle: Long): Int
    external fun getaddrinfo(node: String?, service: String?, hints: Long, res: Long): Int
    external fun freeaddrinfo(res: Long)
    external fun hstrerror(errcode: Int): Long?
    external fun gaiStrerror(errcode: Int): Long?
    external fun resInit(): Int
    external fun gmtimeR(timeP: Long, result: Long): Long?
    external fun localtimeR(timeP: Long, result: Long): Long?
    external fun mktime(tm: Long): Long
    external fun time(time: Long): Long
    external fun gmtime(timeP: Long): Long?
    external fun localtime(timeP: Long): Long?
    external fun difftime(time1: Long, time0: Long): Double
    external fun timegm(tm: Long): Long
    external fun mknod(pathname: String?, mode: Int, dev: Long): Int
    external fun gethostname(name: Long, len: Long): Int
    external fun endservent()
    external fun getservbyname(name: String?, proto: String?): Long?
    external fun getservbyport(port: Int, proto: String?): Long?
    external fun getservent(): Long?
    external fun setservent(stayopen: Int)
    external fun getprotobyname(name: String?): Long?
    external fun getprotobynumber(proto: Int): Long?
    external fun chroot(name: String?): Int
    external fun usleep(secs: Int): Int
    external fun send(socket: Int, buf: Long, len: Long, flags: Int): Long
    external fun recv(socket: Int, buf: Long, len: Long, flags: Int): Long
    external fun putenv(string: Long): Int
    external fun poll(fds: Long, nfds: Long, timeout: Int): Int
    external fun select(nfds: Int, readfds: Long, writefds: Long, errorfds: Long, timeout: Long): Int
    external fun setlocale(category: Int, locale: String?): Long?
    external fun localeconv(): Long?
    external fun semWait(sem: Long): Int
    external fun semTrywait(sem: Long): Int
    external fun semPost(sem: Long): Int
    external fun statvfs(path: String?, buf: Long): Int
    external fun fstatvfs(fd: Int, buf: Long): Int
    external fun sigemptyset(set: Long): Int
    external fun sigaddset(set: Long, signum: Int): Int
    external fun sigfillset(set: Long): Int
    external fun sigdelset(set: Long, signum: Int): Int
    external fun sigismember(set: Long, signum: Int): Int
    external fun sigprocmask(how: Int, set: Long, oldset: Long): Int
    external fun sigpending(set: Long): Int
    external fun sysconf(name: Int): Long
    external fun mkfifo(path: String?, mode: Int): Int
    external fun fseeko(stream: Long, offset: Long, whence: Int): Int
    external fun ftello(stream: Long): Long
    external fun tcdrain(fd: Int): Int
    external fun cfgetispeed(termios: Long): Long
    external fun cfgetospeed(termios: Long): Long
    external fun cfsetispeed(termios: Long, speed: Long): Int
    external fun cfsetospeed(termios: Long, speed: Long): Int
    external fun tcgetattr(fd: Int, termios: Long): Int
    external fun tcsetattr(fd: Int, optionalActions: Int, termios: Long): Int
    external fun tcflow(fd: Int, action: Int): Int
    external fun tcflush(fd: Int, action: Int): Int
    external fun tcgetsid(fd: Int): Long
    external fun tcsendbreak(fd: Int, duration: Int): Int
    external fun mkstemp(template: Long): Int
    external fun mkdtemp(template: Long): Long?
    external fun tmpnam(ptr: Long): Long?
    external fun openlog(ident: String?, logopt: Int, facility: Int)
    external fun closelog()
    external fun setlogmask(maskpri: Int): Int
    external fun nice(incr: Int): Int
    external fun grantpt(fd: Int): Int
    external fun posixOpenpt(flags: Int): Int
    external fun ptsname(fd: Int): Long?
    external fun unlockpt(fd: Int): Int
    external fun strcasestr(cs: String?, ct: String?): Long?
    external fun getline(lineptr: Long, n: Long, stream: Long): Long
    external fun lockf(fd: Int, cmd: Int, len: Long): Int
    external fun adjtime(delta: Long, olddelta: Long): Int
    external fun stpncpy(dst: Long, src: String?, n: Long): Long?
    external fun sigqueue(pid: Int, sig: Int, value: Long): Int
    external fun confstr(name: Int, buf: Long, len: Long): Long
    external fun dladdr(addr: Long, info: Long): Int
    external fun flock(fd: Int, operation: Int): Int
    external fun openWmemstream(ptr: Long, sizeloc: Long): Long?
    external fun getsid(pid: Int): Int
    external fun pause(): Int
    external fun mkdirat(dirfd: Int, pathname: String?, mode: Int): Int
    external fun fdopendir(fd: Int): Long?
    external fun readdirR(dirp: Long, entry: Long, result: Long): Int
    external fun readlinkat(dirfd: Int, pathname: String?, buf: Long, bufsiz: Long): Int
    external fun readlink(path: String?, buf: Long, bufsz: Long): Int
    external fun pselect(nfds: Int, readfds: Long, writefds: Long, errorfds: Long, timeout: Long, sigmask: Long): Int
    external fun sigaction(signum: Int, act: Long, oldact: Long): Int
    external fun fmemopen(buf: Long, size: Long, mode: String?): Long?
    external fun openMemstream(ptr: Long, sizeloc: Long): Long?
    external fun atexit(cb: Long): Int
    external fun cfmakeraw(termios: Long): Int
    external fun cfsetspeed(termios: Long, speed: Long): Int
    external fun fnmatch(pattern: String?, name: String?, flags: Int): Int
}

public actual fun isalnum(c: CInt): CInt =
    UnixModRawLibc.isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    UnixModRawLibc.isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    UnixModRawLibc.iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    UnixModRawLibc.isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    UnixModRawLibc.isgraph(c)

public actual fun islower(c: CInt): CInt =
    UnixModRawLibc.islower(c)

public actual fun isprint(c: CInt): CInt =
    UnixModRawLibc.isprint(c)

public actual fun ispunct(c: CInt): CInt =
    UnixModRawLibc.ispunct(c)

public actual fun isspace(c: CInt): CInt =
    UnixModRawLibc.isspace(c)

public actual fun isupper(c: CInt): CInt =
    UnixModRawLibc.isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    UnixModRawLibc.isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    UnixModRawLibc.isblank(c)

public actual fun tolower(c: CInt): CInt =
    UnixModRawLibc.tolower(c)

public actual fun toupper(c: CInt): CInt =
    UnixModRawLibc.toupper(c)

public actual fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    UnixModRawLibc.qsort(base?.value ?: 0L, num, size, compar?.toLong() ?: 0L)
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?): COpaquePointer? =
    UnixModRawLibc.bsearch(key?.value ?: 0L, base?.value ?: 0L, num, size, compar?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fopen(filename: String?, mode: String?): FILE? =
    UnixModRawLibc.fopen(filename, mode)

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    UnixModRawLibc.freopen(filename, mode, file?.toLong() ?: 0L)

public actual fun fflush(file: FILE?): CInt =
    UnixModRawLibc.fflush(file?.toLong() ?: 0L)

public actual fun fclose(file: FILE?): CInt =
    UnixModRawLibc.fclose(file?.toLong() ?: 0L)

public actual fun remove(filename: String?): CInt =
    UnixModRawLibc.remove(filename)

public actual fun rename(oldname: String?, newname: String?): CInt =
    UnixModRawLibc.rename(oldname, newname)

public actual fun tmpfile(): FILE? =
    UnixModRawLibc.tmpfile()

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    UnixModRawLibc.setvbuf(stream?.toLong() ?: 0L, buffer?.value ?: 0L, mode, size)

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    UnixModRawLibc.setbuf(stream?.toLong() ?: 0L, buf?.value ?: 0L)
}

public actual fun getchar(): CInt =
    UnixModRawLibc.getchar()

public actual fun putchar(c: CInt): CInt =
    UnixModRawLibc.putchar(c)

public actual fun fgetc(stream: FILE?): CInt =
    UnixModRawLibc.fgetc(stream?.toLong() ?: 0L)

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    UnixModRawLibc.fgets(buf?.value ?: 0L, n, stream?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    UnixModRawLibc.fputc(c, stream?.toLong() ?: 0L)

public actual fun fputs(s: String?, stream: FILE?): CInt =
    UnixModRawLibc.fputs(s, stream?.toLong() ?: 0L)

public actual fun puts(s: String?): CInt =
    UnixModRawLibc.puts(s)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    UnixModRawLibc.ungetc(c, stream?.toLong() ?: 0L)

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    UnixModRawLibc.fread(ptr?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    UnixModRawLibc.fwrite(ptr?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    UnixModRawLibc.fseek(stream?.toLong() ?: 0L, offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    UnixModRawLibc.ftell(stream?.toLong() ?: 0L)

public actual fun rewind(stream: FILE?) {
    UnixModRawLibc.rewind(stream?.toLong() ?: 0L)
}

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    UnixModRawLibc.fgetpos(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    UnixModRawLibc.fsetpos(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)

public actual fun feof(stream: FILE?): CInt =
    UnixModRawLibc.feof(stream?.toLong() ?: 0L)

public actual fun ferror(stream: FILE?): CInt =
    UnixModRawLibc.ferror(stream?.toLong() ?: 0L)

public actual fun clearerr(stream: FILE?) {
    UnixModRawLibc.clearerr(stream?.toLong() ?: 0L)
}

public actual fun perror(s: String?) {
    UnixModRawLibc.perror(s)
}

public actual fun atof(s: String?): CDouble =
    UnixModRawLibc.atof(s)

public actual fun atoi(s: String?): CInt =
    UnixModRawLibc.atoi(s)

public actual fun atol(s: String?): CLong =
    UnixModRawLibc.atol(s)

public actual fun atoll(s: String?): CLonglong =
    UnixModRawLibc.atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    UnixModRawLibc.strtod(s, endp?.value ?: 0L)

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    UnixModRawLibc.strtof(s, endp?.value ?: 0L)

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    UnixModRawLibc.strtol(s, endp?.value ?: 0L, base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    UnixModRawLibc.strtoll(s, endp?.value ?: 0L, base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    UnixModRawLibc.strtoul(s, endp?.value ?: 0L, base)

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    UnixModRawLibc.strtoull(s, endp?.value ?: 0L, base)

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    UnixModRawLibc.calloc(nobj, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    UnixModRawLibc.malloc(size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    UnixModRawLibc.realloc(p?.value ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(p: COpaquePointer?) {
    UnixModRawLibc.free(p?.value ?: 0L)
}

public actual fun abort(): Nothing =
    UnixModRawLibc.abort()

public actual fun exit(status: CInt): Nothing =
    UnixModRawLibc.exit(status)

public actual fun system(s: String?): CInt =
    UnixModRawLibc.system(s)

public actual fun getenv(s: String?): COpaquePointer? =
    UnixModRawLibc.getenv(s).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    UnixModRawLibc.strcpy(dst?.value ?: 0L, src).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    UnixModRawLibc.strncpy(dst?.value ?: 0L, src, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun stpcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    UnixModRawLibc.stpcpy(dst?.value ?: 0L, src).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    UnixModRawLibc.strcat(s?.value ?: 0L, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    UnixModRawLibc.strncat(s?.value ?: 0L, ct, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    UnixModRawLibc.strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    UnixModRawLibc.strncmp(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): CInt =
    UnixModRawLibc.strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    UnixModRawLibc.strchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    UnixModRawLibc.strrchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    UnixModRawLibc.strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    UnixModRawLibc.strcspn(cs, ct)

public actual fun strdup(cs: String?): COpaquePointer? =
    UnixModRawLibc.strdup(cs).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strndup(cs: String?, n: SizeT): COpaquePointer? =
    UnixModRawLibc.strndup(cs, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    UnixModRawLibc.strpbrk(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    UnixModRawLibc.strstr(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    UnixModRawLibc.strcasecmp(s1, s2)

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    UnixModRawLibc.strncasecmp(s1, s2, n)

public actual fun strlen(cs: String?): SizeT =
    UnixModRawLibc.strlen(cs)

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    UnixModRawLibc.strnlen(cs, maxlen)

public actual fun strerror(n: CInt): COpaquePointer? =
    UnixModRawLibc.strerror(n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    UnixModRawLibc.strtok(s?.value ?: 0L, t).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtokR(s: COpaquePointer?, t: String?, p: COpaquePointer?): COpaquePointer? =
    UnixModRawLibc.strtokR(s?.value ?: 0L, t, p?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    UnixModRawLibc.strxfrm(s?.value ?: 0L, ct, n)

public actual fun strsignal(sig: CInt): COpaquePointer? =
    UnixModRawLibc.strsignal(sig).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wcslen(buf: WcharT?): SizeT =
    UnixModRawLibc.wcslen(buf?.toLong() ?: 0L)

public actual fun wcstombs(dest: COpaquePointer?, src: WcharT?, n: SizeT): SizeT =
    UnixModRawLibc.wcstombs(dest?.value ?: 0L, src?.toLong() ?: 0L, n)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    UnixModRawLibc.memchr(cx?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: SizeT): WcharT? =
    UnixModRawLibc.wmemchr(cx?.toLong() ?: 0L, c, n)

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    UnixModRawLibc.memcmp(cx?.value ?: 0L, ct?.value ?: 0L, n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    UnixModRawLibc.memcpy(dest?.value ?: 0L, src?.value ?: 0L, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    UnixModRawLibc.memmove(dest?.value ?: 0L, src?.value ?: 0L, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    UnixModRawLibc.memset(dest?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    UnixModRawLibc.memccpy(dest?.value ?: 0L, src?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getpwnam(name: String?): Passwd? =
    UnixModRawLibc.getpwnam(name)

public actual fun getpwuid(uid: io.github.kotlinmania.libc.UidT): Passwd? =
    UnixModRawLibc.getpwuid(uid)

public actual fun getcharUnlocked(): CInt =
    UnixModRawLibc.getcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    UnixModRawLibc.putcharUnlocked(c)

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    UnixModRawLibc.socket(domain, ty, protocol)

public actual fun connect(socket: CInt, address: Sockaddr?, len: SocklenT): CInt =
    UnixModRawLibc.connect(socket, address?.toLong() ?: 0L, len)

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    UnixModRawLibc.listen(socket, backlog)

public actual fun accept(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    UnixModRawLibc.accept(socket, address?.toLong() ?: 0L, addressLen?.toLong() ?: 0L)

public actual fun getpeername(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    UnixModRawLibc.getpeername(socket, address?.toLong() ?: 0L, addressLen?.toLong() ?: 0L)

public actual fun getsockname(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    UnixModRawLibc.getsockname(socket, address?.toLong() ?: 0L, addressLen?.toLong() ?: 0L)

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    UnixModRawLibc.setsockopt(socket, level, name, value?.value ?: 0L, optionLen)

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: CInt?): CInt =
    UnixModRawLibc.socketpair(domain, type, protocol, socketVector?.toLong() ?: 0L)

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    UnixModRawLibc.sendto(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen)

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    UnixModRawLibc.shutdown(socket, how)

public actual fun chmod(path: String?, mode: ModeT): CInt =
    UnixModRawLibc.chmod(path, mode)

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    UnixModRawLibc.fchmod(fd, mode)

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    UnixModRawLibc.fstat(fildes, buf?.toLong() ?: 0L)

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    UnixModRawLibc.mkdir(path, mode)

public actual fun stat(path: String?, buf: Stat?): CInt =
    UnixModRawLibc.stat(path, buf?.toLong() ?: 0L)

public actual fun pclose(stream: FILE?): CInt =
    UnixModRawLibc.pclose(stream?.toLong() ?: 0L)

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    UnixModRawLibc.fdopen(fd, mode)

public actual fun fileno(stream: FILE?): CInt =
    UnixModRawLibc.fileno(stream?.toLong() ?: 0L)

public actual fun creat(path: String?, mode: ModeT): CInt =
    UnixModRawLibc.creat(path, mode)

public actual fun opendir(dirname: String?): DIR? =
    UnixModRawLibc.opendir(dirname)

public actual fun readdir(dirp: DIR?): Dirent? =
    UnixModRawLibc.readdir(dirp?.toLong() ?: 0L)

public actual fun closedir(dirp: DIR?): CInt =
    UnixModRawLibc.closedir(dirp?.toLong() ?: 0L)

public actual fun rewinddir(dirp: DIR?) {
    UnixModRawLibc.rewinddir(dirp?.toLong() ?: 0L)
}

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    UnixModRawLibc.fchmodat(dirfd, pathname, mode, flags)

public actual fun fchown(fd: CInt, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT): CInt =
    UnixModRawLibc.fchown(fd, owner, group)

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT, flags: CInt): CInt =
    UnixModRawLibc.fchownat(dirfd, pathname, owner, group, flags)

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt =
    UnixModRawLibc.fstatat(dirfd, pathname, buf?.toLong() ?: 0L, flags)

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    UnixModRawLibc.linkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    UnixModRawLibc.renameat(olddirfd, oldpath, newdirfd, newpath)

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    UnixModRawLibc.symlinkat(target, newdirfd, linkpath)

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    UnixModRawLibc.unlinkat(dirfd, pathname, flags)

public actual fun access(path: String?, amode: CInt): CInt =
    UnixModRawLibc.access(path, amode)

public actual fun alarm(seconds: CUint): CUint =
    UnixModRawLibc.alarm(seconds)

public actual fun chdir(dir: String?): CInt =
    UnixModRawLibc.chdir(dir)

public actual fun fchdir(dirfd: CInt): CInt =
    UnixModRawLibc.fchdir(dirfd)

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    UnixModRawLibc.chown(path, uid, gid)

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    UnixModRawLibc.lchown(path, uid, gid)

public actual fun close(fd: CInt): CInt =
    UnixModRawLibc.close(fd)

public actual fun dup(fd: CInt): CInt =
    UnixModRawLibc.dup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    UnixModRawLibc.dup2(src, dst)

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    UnixModRawLibc.execv(prog, argv?.value ?: 0L)

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixModRawLibc.execve(prog, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    UnixModRawLibc.execvp(c, argv?.value ?: 0L)

public actual fun fork(): PidT =
    UnixModRawLibc.fork()

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    UnixModRawLibc.fpathconf(filedes, name)

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    UnixModRawLibc.getcwd(buf?.value ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getegid(): GidT =
    UnixModRawLibc.getegid()

public actual fun geteuid(): UidT =
    UnixModRawLibc.geteuid()

public actual fun getgid(): GidT =
    UnixModRawLibc.getgid()

public actual fun getgroups(ngroupsMax: CInt, groups: CUshort?): CInt =
    UnixModRawLibc.getgroups(ngroupsMax, groups?.toLong() ?: 0L)

public actual fun getlogin(): COpaquePointer? =
    UnixModRawLibc.getlogin().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    UnixModRawLibc.getopt(argc, argv?.value ?: 0L, optstr)

public actual fun getpgid(pid: PidT): PidT =
    UnixModRawLibc.getpgid(pid)

public actual fun getpgrp(): PidT =
    UnixModRawLibc.getpgrp()

public actual fun getpid(): PidT =
    UnixModRawLibc.getpid()

public actual fun getppid(): PidT =
    UnixModRawLibc.getppid()

public actual fun getuid(): UidT =
    UnixModRawLibc.getuid()

public actual fun isatty(fd: CInt): CInt =
    UnixModRawLibc.isatty(fd)

public actual fun link(src: String?, dst: String?): CInt =
    UnixModRawLibc.link(src, dst)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    UnixModRawLibc.lseek(fd, offset, whence)

public actual fun pathconf(path: String?, name: CInt): CLong =
    UnixModRawLibc.pathconf(path, name)

public actual fun pipe(fds: CInt?): CInt =
    UnixModRawLibc.pipe(fds?.toLong() ?: 0L)

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    UnixModRawLibc.posixMemalign(memptr?.value ?: 0L, align, size)

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    UnixModRawLibc.alignedAlloc(alignment, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    UnixModRawLibc.read(fd, buf?.value ?: 0L, count)

public actual fun rmdir(path: String?): CInt =
    UnixModRawLibc.rmdir(path)

public actual fun seteuid(uid: UidT): CInt =
    UnixModRawLibc.seteuid(uid)

public actual fun setegid(gid: GidT): CInt =
    UnixModRawLibc.setegid(gid)

public actual fun setgid(gid: GidT): CInt =
    UnixModRawLibc.setgid(gid)

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    UnixModRawLibc.setpgid(pid, pgid)

public actual fun setsid(): PidT =
    UnixModRawLibc.setsid()

public actual fun setuid(uid: UidT): CInt =
    UnixModRawLibc.setuid(uid)

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    UnixModRawLibc.setreuid(ruid, euid)

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    UnixModRawLibc.setregid(rgid, egid)

public actual fun sleep(secs: CUint): CUint =
    UnixModRawLibc.sleep(secs)

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt =
    UnixModRawLibc.nanosleep(rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)

public actual fun tcgetpgrp(fd: CInt): PidT =
    UnixModRawLibc.tcgetpgrp(fd)

public actual fun tcsetpgrp(fd: CInt, pgrp: io.github.kotlinmania.libc.PidT): CInt =
    UnixModRawLibc.tcsetpgrp(fd, pgrp)

public actual fun ttyname(fd: CInt): COpaquePointer? =
    UnixModRawLibc.ttyname(fd).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ttynameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixModRawLibc.ttynameR(fd, buf?.value ?: 0L, buflen)

public actual fun unlink(c: String?): CInt =
    UnixModRawLibc.unlink(c)

public actual fun wait(status: CInt?): PidT =
    UnixModRawLibc.wait(status?.toLong() ?: 0L)

public actual fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT =
    UnixModRawLibc.waitpid(pid, status?.toLong() ?: 0L, options)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    UnixModRawLibc.write(fd, buf?.value ?: 0L, count)

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    UnixModRawLibc.pread(fd, buf?.value ?: 0L, count, offset)

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    UnixModRawLibc.pwrite(fd, buf?.value ?: 0L, count, offset)

public actual fun umask(mask: ModeT): ModeT =
    UnixModRawLibc.umask(mask)

public actual fun utime(file: String?, buf: Utimbuf?): CInt =
    UnixModRawLibc.utime(file, buf?.toLong() ?: 0L)

public actual fun kill(pid: PidT, sig: CInt): CInt =
    UnixModRawLibc.kill(pid, sig)

public actual fun killpg(pgrp: PidT, sig: CInt): CInt =
    UnixModRawLibc.killpg(pgrp, sig)

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    UnixModRawLibc.mlock(addr?.value ?: 0L, len)

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    UnixModRawLibc.munlock(addr?.value ?: 0L, len)

public actual fun mlockall(flags: CInt): CInt =
    UnixModRawLibc.mlockall(flags)

public actual fun munlockall(): CInt =
    UnixModRawLibc.munlockall()

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    UnixModRawLibc.mmap(addr?.value ?: 0L, len, prot, flags, fd, offset).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    UnixModRawLibc.munmap(addr?.value ?: 0L, len)

public actual fun ifNametoindex(ifname: String?): CUint =
    UnixModRawLibc.ifNametoindex(ifname)

public actual fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer? =
    UnixModRawLibc.ifIndextoname(ifindex, ifname?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lstat(path: String?, buf: Stat?): CInt =
    UnixModRawLibc.lstat(path, buf?.toLong() ?: 0L)

public actual fun fsync(fd: CInt): CInt =
    UnixModRawLibc.fsync(fd)

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    UnixModRawLibc.setenv(name, value, overwrite)

public actual fun unsetenv(name: String?): CInt =
    UnixModRawLibc.unsetenv(name)

public actual fun symlink(path1: String?, path2: String?): CInt =
    UnixModRawLibc.symlink(path1, path2)

public actual fun truncate(path: String?, length: OffT): CInt =
    UnixModRawLibc.truncate(path, length)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    UnixModRawLibc.ftruncate(fd, length)

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    UnixModRawLibc.signal(signum, handler)

public actual fun getrusage(resource: CInt, usage: Rusage?): CInt =
    UnixModRawLibc.getrusage(resource, usage?.toLong() ?: 0L)

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    UnixModRawLibc.realpath(pathname, resolved?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun times(buf: io.github.kotlinmania.libc.Tms?): ClockT =
    UnixModRawLibc.times(buf?.toLong() ?: 0L)

public actual fun pthreadSelf(): PthreadT =
    UnixModRawLibc.pthreadSelf()

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    UnixModRawLibc.pthreadEqual(t1, t2)

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    UnixModRawLibc.pthreadJoin(native, value?.value ?: 0L)

public actual fun pthreadExit(value: COpaquePointer?): Nothing =
    UnixModRawLibc.pthreadExit(value?.value ?: 0L)

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    UnixModRawLibc.pthreadAttrInit(attr?.toLong() ?: 0L)

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    UnixModRawLibc.pthreadAttrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt =
    UnixModRawLibc.pthreadAttrGetstacksize(attr?.toLong() ?: 0L, stacksize?.toLong() ?: 0L)

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: SizeT): CInt =
    UnixModRawLibc.pthreadAttrSetstacksize(attr?.toLong() ?: 0L, stackSize)

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt =
    UnixModRawLibc.pthreadAttrSetdetachstate(attr?.toLong() ?: 0L, state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    UnixModRawLibc.pthreadDetach(thread)

public actual fun schedYield(): CInt =
    UnixModRawLibc.schedYield()

public actual fun pthreadKeyCreate(key: PthreadKeyT?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    UnixModRawLibc.pthreadKeyCreate(key?.toLong() ?: 0L, dtor?.toLong() ?: 0L)

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    UnixModRawLibc.pthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    UnixModRawLibc.pthreadGetspecific(key).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    UnixModRawLibc.pthreadSetspecific(key, value?.value ?: 0L)

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    UnixModRawLibc.pthreadMutexInit(lock?.toLong() ?: 0L, attr?.toLong() ?: 0L)

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt =
    UnixModRawLibc.pthreadMutexDestroy(lock?.toLong() ?: 0L)

public actual fun pthreadMutexLock(lock: PthreadMutexT?): CInt =
    UnixModRawLibc.pthreadMutexLock(lock?.toLong() ?: 0L)

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt =
    UnixModRawLibc.pthreadMutexTrylock(lock?.toLong() ?: 0L)

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt =
    UnixModRawLibc.pthreadMutexUnlock(lock?.toLong() ?: 0L)

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    UnixModRawLibc.pthreadMutexattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    UnixModRawLibc.pthreadMutexattrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt =
    UnixModRawLibc.pthreadMutexattrSettype(attr?.toLong() ?: 0L, type)

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    UnixModRawLibc.pthreadCondInit(cond?.toLong() ?: 0L, attr?.toLong() ?: 0L)

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt =
    UnixModRawLibc.pthreadCondWait(cond?.toLong() ?: 0L, lock?.toLong() ?: 0L)

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    UnixModRawLibc.pthreadCondTimedwait(cond?.toLong() ?: 0L, lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    UnixModRawLibc.pthreadCondSignal(cond?.toLong() ?: 0L)

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    UnixModRawLibc.pthreadCondBroadcast(cond?.toLong() ?: 0L)

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    UnixModRawLibc.pthreadCondDestroy(cond?.toLong() ?: 0L)

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    UnixModRawLibc.pthreadCondattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    UnixModRawLibc.pthreadCondattrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): CInt =
    UnixModRawLibc.pthreadRwlockInit(lock?.toLong() ?: 0L, attr?.toLong() ?: 0L)

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT?): CInt =
    UnixModRawLibc.pthreadRwlockDestroy(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT?): CInt =
    UnixModRawLibc.pthreadRwlockRdlock(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): CInt =
    UnixModRawLibc.pthreadRwlockTryrdlock(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT?): CInt =
    UnixModRawLibc.pthreadRwlockWrlock(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): CInt =
    UnixModRawLibc.pthreadRwlockTrywrlock(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT?): CInt =
    UnixModRawLibc.pthreadRwlockUnlock(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt =
    UnixModRawLibc.pthreadRwlockattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt =
    UnixModRawLibc.pthreadRwlockattrDestroy(attr?.toLong() ?: 0L)

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt =
    UnixModRawLibc.getsockopt(sockfd, level, optname, optval?.value ?: 0L, optlen?.toLong() ?: 0L)

public actual fun raise(signum: CInt): CInt =
    UnixModRawLibc.raise(signum)

public actual fun utimes(filename: String?, times: io.github.kotlinmania.libc.Timeval?): CInt =
    UnixModRawLibc.utimes(filename, times?.toLong() ?: 0L)

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    UnixModRawLibc.dlopen(filename, flag).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlerror(): COpaquePointer? =
    UnixModRawLibc.dlerror().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    UnixModRawLibc.dlsym(handle?.value ?: 0L, symbol).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlclose(handle: COpaquePointer?): CInt =
    UnixModRawLibc.dlclose(handle?.value ?: 0L)

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt =
    UnixModRawLibc.getaddrinfo(node, service, hints?.toLong() ?: 0L, res?.value ?: 0L)

public actual fun freeaddrinfo(res: Addrinfo?) {
    UnixModRawLibc.freeaddrinfo(res?.toLong() ?: 0L)
}

public actual fun hstrerror(errcode: CInt): COpaquePointer? =
    UnixModRawLibc.hstrerror(errcode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    UnixModRawLibc.gaiStrerror(errcode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun resInit(): CInt =
    UnixModRawLibc.resInit()

public actual fun gmtimeR(timeP: TimeT?, result: Tm?): Tm? =
    UnixModRawLibc.gmtimeR(timeP?.toLong() ?: 0L, result?.toLong() ?: 0L)

public actual fun localtimeR(timeP: TimeT?, result: Tm?): Tm? =
    UnixModRawLibc.localtimeR(timeP?.toLong() ?: 0L, result?.toLong() ?: 0L)

public actual fun mktime(tm: Tm?): TimeT =
    UnixModRawLibc.mktime(tm?.toLong() ?: 0L)

public actual fun time(time: TimeT?): TimeT =
    UnixModRawLibc.time(time?.toLong() ?: 0L)

public actual fun gmtime(timeP: TimeT?): Tm? =
    UnixModRawLibc.gmtime(timeP?.toLong() ?: 0L)

public actual fun localtime(timeP: TimeT?): Tm? =
    UnixModRawLibc.localtime(timeP?.toLong() ?: 0L)

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    UnixModRawLibc.difftime(time1, time0)

public actual fun timegm(tm: Tm?): TimeT =
    UnixModRawLibc.timegm(tm?.toLong() ?: 0L)

public actual fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt =
    UnixModRawLibc.mknod(pathname, mode, dev)

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    UnixModRawLibc.gethostname(name?.value ?: 0L, len)

public actual fun endservent() {
    UnixModRawLibc.endservent()
}

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    UnixModRawLibc.getservbyname(name, proto)

public actual fun getservbyport(port: CInt, proto: String?): Servent? =
    UnixModRawLibc.getservbyport(port, proto)

public actual fun getservent(): Servent? =
    UnixModRawLibc.getservent()

public actual fun setservent(stayopen: CInt) {
    UnixModRawLibc.setservent(stayopen)
}

public actual fun getprotobyname(name: String?): Protoent? =
    UnixModRawLibc.getprotobyname(name)

public actual fun getprotobynumber(proto: CInt): Protoent? =
    UnixModRawLibc.getprotobynumber(proto)

public actual fun chroot(name: String?): CInt =
    UnixModRawLibc.chroot(name)

public actual fun usleep(secs: UsecondsT): CInt =
    UnixModRawLibc.usleep(secs)

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    UnixModRawLibc.send(socket, buf?.value ?: 0L, len, flags)

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    UnixModRawLibc.recv(socket, buf?.value ?: 0L, len, flags)

public actual fun putenv(string: COpaquePointer?): CInt =
    UnixModRawLibc.putenv(string?.value ?: 0L)

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    UnixModRawLibc.poll(fds?.toLong() ?: 0L, nfds, timeout)

public actual fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt =
    UnixModRawLibc.select(nfds, readfds?.toLong() ?: 0L, writefds?.toLong() ?: 0L, errorfds?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    UnixModRawLibc.setlocale(category, locale).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localeconv(): Lconv? =
    UnixModRawLibc.localeconv()

public actual fun semWait(sem: SemT?): CInt =
    UnixModRawLibc.semWait(sem?.toLong() ?: 0L)

public actual fun semTrywait(sem: SemT?): CInt =
    UnixModRawLibc.semTrywait(sem?.toLong() ?: 0L)

public actual fun semPost(sem: SemT?): CInt =
    UnixModRawLibc.semPost(sem?.toLong() ?: 0L)

public actual fun statvfs(path: String?, buf: Statvfs?): CInt =
    UnixModRawLibc.statvfs(path, buf?.toLong() ?: 0L)

public actual fun fstatvfs(fd: CInt, buf: Statvfs?): CInt =
    UnixModRawLibc.fstatvfs(fd, buf?.toLong() ?: 0L)

public actual fun sigemptyset(set: SigsetT?): CInt =
    UnixModRawLibc.sigemptyset(set?.toLong() ?: 0L)

public actual fun sigaddset(set: SigsetT?, signum: CInt): CInt =
    UnixModRawLibc.sigaddset(set?.toLong() ?: 0L, signum)

public actual fun sigfillset(set: SigsetT?): CInt =
    UnixModRawLibc.sigfillset(set?.toLong() ?: 0L)

public actual fun sigdelset(set: SigsetT?, signum: CInt): CInt =
    UnixModRawLibc.sigdelset(set?.toLong() ?: 0L, signum)

public actual fun sigismember(set: SigsetT?, signum: CInt): CInt =
    UnixModRawLibc.sigismember(set?.toLong() ?: 0L, signum)

public actual fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    UnixModRawLibc.sigprocmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)

public actual fun sigpending(set: SigsetT?): CInt =
    UnixModRawLibc.sigpending(set?.toLong() ?: 0L)

public actual fun sysconf(name: CInt): CLong =
    UnixModRawLibc.sysconf(name)

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    UnixModRawLibc.mkfifo(path, mode)

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    UnixModRawLibc.fseeko(stream?.toLong() ?: 0L, offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    UnixModRawLibc.ftello(stream?.toLong() ?: 0L)

public actual fun tcdrain(fd: CInt): CInt =
    UnixModRawLibc.tcdrain(fd)

public actual fun cfgetispeed(termios: Termios?): SpeedT =
    UnixModRawLibc.cfgetispeed(termios?.toLong() ?: 0L)

public actual fun cfgetospeed(termios: Termios?): SpeedT =
    UnixModRawLibc.cfgetospeed(termios?.toLong() ?: 0L)

public actual fun cfsetispeed(termios: Termios?, speed: SpeedT): CInt =
    UnixModRawLibc.cfsetispeed(termios?.toLong() ?: 0L, speed)

public actual fun cfsetospeed(termios: Termios?, speed: SpeedT): CInt =
    UnixModRawLibc.cfsetospeed(termios?.toLong() ?: 0L, speed)

public actual fun tcgetattr(fd: CInt, termios: Termios?): CInt =
    UnixModRawLibc.tcgetattr(fd, termios?.toLong() ?: 0L)

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: Termios?): CInt =
    UnixModRawLibc.tcsetattr(fd, optionalActions, termios?.toLong() ?: 0L)

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    UnixModRawLibc.tcflow(fd, action)

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    UnixModRawLibc.tcflush(fd, action)

public actual fun tcgetsid(fd: CInt): io.github.kotlinmania.libc.PidT =
    UnixModRawLibc.tcgetsid(fd)

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    UnixModRawLibc.tcsendbreak(fd, duration)

public actual fun mkstemp(template: COpaquePointer?): CInt =
    UnixModRawLibc.mkstemp(template?.value ?: 0L)

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    UnixModRawLibc.mkdtemp(template?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    UnixModRawLibc.tmpnam(ptr?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    UnixModRawLibc.openlog(ident, logopt, facility)
}

public actual fun closelog() {
    UnixModRawLibc.closelog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    UnixModRawLibc.setlogmask(maskpri)

public actual fun nice(incr: CInt): CInt =
    UnixModRawLibc.nice(incr)

public actual fun grantpt(fd: CInt): CInt =
    UnixModRawLibc.grantpt(fd)

public actual fun posixOpenpt(flags: CInt): CInt =
    UnixModRawLibc.posixOpenpt(flags)

public actual fun ptsname(fd: CInt): COpaquePointer? =
    UnixModRawLibc.ptsname(fd).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unlockpt(fd: CInt): CInt =
    UnixModRawLibc.unlockpt(fd)

public actual fun strcasestr(cs: String?, ct: String?): COpaquePointer? =
    UnixModRawLibc.strcasestr(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT =
    UnixModRawLibc.getline(lineptr?.value ?: 0L, n?.toLong() ?: 0L, stream?.toLong() ?: 0L)

public actual fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt =
    UnixModRawLibc.lockf(fd, cmd, len)

public actual fun adjtime(delta: Timeval?, olddelta: Timeval?): CInt =
    UnixModRawLibc.adjtime(delta?.toLong() ?: 0L, olddelta?.toLong() ?: 0L)

public actual fun stpncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    UnixModRawLibc.stpncpy(dst?.value ?: 0L, src, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sigqueue(pid: PidT, sig: CInt, value: io.github.kotlinmania.libc.Sigval): CInt =
    UnixModRawLibc.sigqueue(pid, sig, value)

public actual fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT =
    UnixModRawLibc.confstr(name, buf?.value ?: 0L, len)

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt =
    UnixModRawLibc.dladdr(addr?.value ?: 0L, info?.toLong() ?: 0L)

public actual fun flock(fd: CInt, operation: CInt): CInt =
    UnixModRawLibc.flock(fd, operation)

public actual fun openWmemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE? =
    UnixModRawLibc.openWmemstream(ptr?.value ?: 0L, sizeloc?.toLong() ?: 0L)

public actual fun getsid(pid: PidT): PidT =
    UnixModRawLibc.getsid(pid)

public actual fun pause(): CInt =
    UnixModRawLibc.pause()

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    UnixModRawLibc.mkdirat(dirfd, pathname, mode)

public actual fun fdopendir(fd: CInt): DIR? =
    UnixModRawLibc.fdopendir(fd)

public actual fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): CInt =
    UnixModRawLibc.readdirR(dirp?.toLong() ?: 0L, entry?.toLong() ?: 0L, result?.value ?: 0L)

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): CInt =
    UnixModRawLibc.readlinkat(dirfd, pathname, buf?.value ?: 0L, bufsiz)

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): CInt =
    UnixModRawLibc.readlink(path, buf?.value ?: 0L, bufsz)

public actual fun pselect(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): CInt =
    UnixModRawLibc.pselect(nfds, readfds?.toLong() ?: 0L, writefds?.toLong() ?: 0L, errorfds?.toLong() ?: 0L, timeout?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)

public actual fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt =
    UnixModRawLibc.sigaction(signum, act?.toLong() ?: 0L, oldact?.toLong() ?: 0L)

public actual fun fmemopen(buf: COpaquePointer?, size: SizeT, mode: String?): FILE? =
    UnixModRawLibc.fmemopen(buf?.value ?: 0L, size, mode)

public actual fun openMemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE? =
    UnixModRawLibc.openMemstream(ptr?.value ?: 0L, sizeloc?.toLong() ?: 0L)

public actual fun atexit(cb: AtexitCbCallback): CInt =
    UnixModRawLibc.atexit(cb)

public actual fun cfmakeraw(termios: Termios?): CInt =
    UnixModRawLibc.cfmakeraw(termios?.toLong() ?: 0L)

public actual fun cfsetspeed(termios: Termios?, speed: SpeedT): CInt =
    UnixModRawLibc.cfsetspeed(termios?.toLong() ?: 0L, speed)

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    UnixModRawLibc.fnmatch(pattern, name, flags)
