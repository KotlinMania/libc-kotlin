package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.COpaquePointer

internal object FuchsiaModRawLibc {
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
    external fun atexit(cb: Long): Int
    external fun system(s: String?): Int
    external fun getenv(s: String?): Long?
    external fun strcpy(dst: Long, src: String?): Long?
    external fun strncpy(dst: Long, src: String?, n: Long): Long?
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
    external fun strpbrk(cs: String?, ct: String?): Long?
    external fun strstr(cs: String?, ct: String?): Long?
    external fun strlen(cs: String?): Long
    external fun strnlen(cs: String?, maxlen: Long): Long
    external fun strerror(n: Int): Long?
    external fun strtok(s: Long, t: String?): Long?
    external fun strxfrm(s: Long, ct: String?, n: Long): Long
    external fun wcslen(buf: Long): Long
    external fun wcstombs(dest: Long, src: Long, n: Long): Long
    external fun memchr(cx: Long, c: Int, n: Long): Long?
    external fun wmemchr(cx: Long, c: Int, n: Long): Long?
    external fun memcmp(cx: Long, ct: Long, n: Long): Int
    external fun memcpy(dest: Long, src: Long, n: Long): Long?
    external fun memmove(dest: Long, src: Long, n: Long): Long?
    external fun memset(dest: Long, c: Int, n: Long): Long?
    external fun abs(i: Int): Int
    external fun labs(i: Long): Long
    external fun rand(): Int
    external fun srand(seed: Int)
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
    external fun readdirR(dirp: Long, entry: Long, result: Long): Int
    external fun closedir(dirp: Long): Int
    external fun rewinddir(dirp: Long)
    external fun fchmodat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int
    external fun fchown(fd: Int, owner: Long, group: Long): Int
    external fun fchownat(dirfd: Int, pathname: String?, owner: Long, group: Long, flags: Int): Int
    external fun fstatat(dirfd: Int, pathname: String?, buf: Long, flags: Int): Int
    external fun linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int
    external fun mkdirat(dirfd: Int, pathname: String?, mode: Int): Int
    external fun readlinkat(dirfd: Int, pathname: String?, buf: Long, bufsiz: Long): Long
    external fun renameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int
    external fun symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int
    external fun unlinkat(dirfd: Int, pathname: String?, flags: Int): Int
    external fun access(path: String?, amode: Int): Int
    external fun alarm(seconds: Int): Int
    external fun chdir(dir: String?): Int
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
    external fun pause(): Int
    external fun pipe(fds: Long): Int
    external fun posixMemalign(memptr: Long, align: Long, size: Long): Int
    external fun read(fd: Int, buf: Long, count: Long): Long
    external fun rmdir(path: String?): Int
    external fun seteuid(uid: Int): Int
    external fun setegid(gid: Int): Int
    external fun setgid(gid: Int): Int
    external fun setpgid(pid: Int, pgid: Int): Int
    external fun setsid(): Int
    external fun setuid(uid: Int): Int
    external fun sleep(secs: Int): Int
    external fun nanosleep(rqtp: Long, rmtp: Long): Int
    external fun tcgetpgrp(fd: Int): Int
    external fun tcsetpgrp(fd: Int, pgrp: Long): Int
    external fun ttyname(fd: Int): Long?
    external fun unlink(c: String?): Int
    external fun wait(status: Long): Int
    external fun waitpid(pid: Int, status: Long, options: Int): Int
    external fun write(fd: Int, buf: Long, count: Long): Long
    external fun pread(fd: Int, buf: Long, count: Long, offset: Long): Long
    external fun pwrite(fd: Int, buf: Long, count: Long, offset: Long): Long
    external fun umask(mask: Int): Int
    external fun utime(file: String?, buf: Long): Int
    external fun kill(pid: Int, sig: Int): Int
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
    external fun ftruncate(fd: Int, length: Long): Int
    external fun signal(signum: Int, handler: Long): Long
    external fun realpath(pathname: String?, resolved: Long): Long?
    external fun flock(fd: Int, operation: Int): Int
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun times(buf: Long): Long
    external fun pthreadSelf(): Long
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
    external fun pthreadGetnameNp(thread: Long, name: Long, len: Long): Int
    external fun pthreadSetnameNp(thread: Long, name: String?): Int
    external fun strerrorR(errnum: Int, buf: Long, buflen: Long): Int
    external fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Long): Int
    external fun raise(signum: Int): Int
    external fun sigaction(signum: Int, act: Long, oldact: Long): Int
    external fun utimes(filename: String?, times: Long): Int
    external fun dlopen(filename: String?, flag: Int): Long?
    external fun dlerror(): Long?
    external fun dlsym(handle: Long, symbol: String?): Long?
    external fun dlclose(handle: Long): Int
    external fun dladdr(addr: Long, info: Long): Int
    external fun getaddrinfo(node: String?, service: String?, hints: Long, res: Long): Int
    external fun freeaddrinfo(res: Long)
    external fun gaiStrerror(errcode: Int): Long?
    external fun resInit(): Int
    external fun gmtimeR(timeP: Long, result: Long): Long?
    external fun localtimeR(timeP: Long, result: Long): Long?
    external fun mktime(tm: Long): Long
    external fun time(time: Long): Long
    external fun gmtime(timeP: Long): Long?
    external fun localtime(timeP: Long): Long?
    external fun mknod(pathname: String?, mode: Int, dev: Long): Int
    external fun uname(buf: Long): Int
    external fun gethostname(name: Long, len: Long): Int
    external fun getservbyname(name: String?, proto: String?): Long?
    external fun getprotobyname(name: String?): Long?
    external fun getprotobynumber(proto: Int): Long?
    external fun usleep(secs: Int): Int
    external fun send(socket: Int, buf: Long, len: Long, flags: Int): Long
    external fun recv(socket: Int, buf: Long, len: Long, flags: Int): Long
    external fun putenv(string: Long): Int
    external fun poll(fds: Long, nfds: Long, timeout: Int): Int
    external fun select(nfds: Int, readfds: Long, writefds: Long, errorfds: Long, timeout: Long): Int
    external fun setlocale(category: Int, locale: String?): Long?
    external fun localeconv(): Long?
    external fun semDestroy(sem: Long): Int
    external fun semWait(sem: Long): Int
    external fun semTrywait(sem: Long): Int
    external fun semPost(sem: Long): Int
    external fun semInit(sem: Long, pshared: Int, value: Int): Int
    external fun statvfs(path: String?, buf: Long): Int
    external fun fstatvfs(fd: Int, buf: Long): Int
    external fun readlink(path: String?, buf: Long, bufsz: Long): Long
    external fun sigemptyset(set: Long): Int
    external fun sigaddset(set: Long, signum: Int): Int
    external fun sigfillset(set: Long): Int
    external fun sigdelset(set: Long, signum: Int): Int
    external fun sigismember(set: Long, signum: Int): Int
    external fun sigprocmask(how: Int, set: Long, oldset: Long): Int
    external fun sigpending(set: Long): Int
    external fun timegm(tm: Long): Long
    external fun getsid(pid: Int): Int
    external fun sysconf(name: Int): Long
    external fun mkfifo(path: String?, mode: Int): Int
    external fun pselect(nfds: Int, readfds: Long, writefds: Long, errorfds: Long, timeout: Long, sigmask: Long): Int
    external fun fseeko(stream: Long, offset: Long, whence: Int): Int
    external fun ftello(stream: Long): Long
    external fun tcdrain(fd: Int): Int
    external fun cfgetispeed(termios: Long): Long
    external fun cfgetospeed(termios: Long): Long
    external fun cfmakeraw(termios: Long)
    external fun cfsetispeed(termios: Long, speed: Long): Int
    external fun cfsetospeed(termios: Long, speed: Long): Int
    external fun cfsetspeed(termios: Long, speed: Long): Int
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
    external fun grantpt(fd: Int): Int
    external fun posixOpenpt(flags: Int): Int
    external fun ptsname(fd: Int): Long?
    external fun unlockpt(fd: Int): Int
    external fun fdatasync(fd: Int): Int
    external fun clockGetres(clkId: Long, tp: Long): Int
    external fun clockGettime(clkId: Long, tp: Long): Int
    external fun clockSettime(clkId: Long, tp: Long): Int
    external fun dirfd(dirp: Long): Int
    external fun pthreadGetattrNp(native: Long, attr: Long): Int
    external fun pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int
    external fun memalign(align: Long, size: Long): Long?
    external fun setgroups(ngroups: Long, ptr: Long): Int
    external fun pipe2(fds: Long, flags: Int): Int
    external fun statfs(path: String?, buf: Long): Int
    external fun fstatfs(fd: Int, buf: Long): Int
    external fun memrchr(cx: Long, c: Int, n: Long): Long?
    external fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int
    external fun futimens(fd: Int, times: Long): Int
    external fun utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int
    external fun duplocale(base: Long): Long
    external fun freelocale(loc: Long)
    external fun newlocale(mask: Int, locale: String?, base: Long): Long
    external fun uselocale(loc: Long): Long
    external fun fdopendir(fd: Int): Long?
    external fun mknodat(dirfd: Int, pathname: String?, mode: Int, dev: Long): Int
    external fun pthreadCondattrGetclock(attr: Long, clockId: Long): Int
    external fun pthreadCondattrSetclock(attr: Long, clockId: Long): Int
    external fun accept4(fd: Int, addr: Long, len: Long, flg: Int): Int
    external fun ptsnameR(fd: Int, buf: Long, buflen: Long): Int
    external fun clearenv(): Int
    external fun waitid(idtype: Long, id: Long, infop: Long, options: Int): Int
    external fun setreuid(ruid: Long, euid: Long): Int
    external fun setregid(rgid: Long, egid: Long): Int
    external fun getresuid(ruid: Long, euid: Long, suid: Long): Int
    external fun getresgid(rgid: Long, egid: Long, sgid: Long): Int
    external fun acct(filename: String?): Int
    external fun brk(addr: Long): Int
    external fun setresgid(rgid: Long, egid: Long, sgid: Long): Int
    external fun setresuid(ruid: Long, euid: Long, suid: Long): Int
    external fun openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int
    external fun execvpe(file: String?, argv: Long, envp: Long): Int
    external fun fexecve(fd: Int, argv: Long, envp: Long): Int
    external fun lutimes(file: String?, times: Long): Int
    external fun setpwent()
    external fun endpwent()
    external fun getpwent(): Long?
    external fun shmOpen(name: String?, oflag: Int, mode: Int): Int
    external fun shmget(key: Long, size: Long, shmflg: Int): Int
    external fun shmat(shmid: Int, shmaddr: Long, shmflg: Int): Long?
    external fun shmdt(shmaddr: Long): Int
    external fun shmctl(shmid: Int, cmd: Int, buf: Long): Int
    external fun ftok(pathname: String?, projId: Int): Long
    external fun semget(key: Long, nsems: Int, semflag: Int): Int
    external fun semop(semid: Int, sops: Long, nsops: Long): Int
    external fun msgctl(msqid: Int, cmd: Int, buf: Long): Int
    external fun msgget(key: Long, msgflg: Int): Int
    external fun msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Long
    external fun msgsnd(msqid: Int, msgp: Long, msgsz: Long, msgflg: Int): Int
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun errnoLocation(): Long?
    external fun fallocate(fd: Int, mode: Int, offset: Long, len: Long): Int
    external fun posixFallocate(fd: Int, offset: Long, len: Long): Int
    external fun readahead(fd: Int, offset: Long, count: Long): Long
    external fun signalfd(fd: Int, mask: Long, flags: Int): Int
    external fun timerfdCreate(clockid: Int, flags: Int): Int
    external fun timerfdGettime(fd: Int, currValue: Long): Int
    external fun timerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int
    external fun pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun quotactl(cmd: Int, special: String?, id: Int, data: Long): Int
    external fun dup3(oldfd: Int, newfd: Int, flags: Int): Int
    external fun mkostemp(template: Long, flags: Int): Int
    external fun mkostemps(template: Long, suffixlen: Int, flags: Int): Int
    external fun sigtimedwait(set: Long, info: Long, timeout: Long): Int
    external fun sigwaitinfo(set: Long, info: Long): Int
    external fun nlLanginfoL(item: Long, locale: Long): Long?
    external fun getnameinfo(sa: Long, salen: Long, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int
    external fun reboot(howTo: Int): Int
    external fun setfsgid(gid: Long): Int
    external fun setfsuid(uid: Long): Int
    external fun mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int
    external fun ifNameindex(): Long?
    external fun ifFreenameindex(ptr: Long)
    external fun syncFileRange(fd: Int, offset: Long, nbytes: Long, flags: Int): Int
    external fun getifaddrs(ifap: Long): Int
    external fun freeifaddrs(ifa: Long)
    external fun glob(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int
    external fun globfree(pglob: Long)
    external fun posixMadvise(addr: Long, len: Long, advice: Int): Int
    external fun shmUnlink(name: String?): Int
    external fun seekdir(dirp: Long, loc: Long)
    external fun telldir(dirp: Long): Long
    external fun madvise(addr: Long, len: Long, advice: Int): Int
    external fun msync(addr: Long, len: Long, flags: Int): Int
    external fun recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long
    external fun mkstemps(template: Long, suffixlen: Int): Int
    external fun futimes(fd: Int, times: Long): Int
    external fun nlLanginfo(item: Long): Long?
    external fun bind(socket: Int, address: Long, addressLen: Long): Int
    external fun writev(fd: Int, iov: Long, iovcnt: Int): Long
    external fun readv(fd: Int, iov: Long, iovcnt: Int): Long
    external fun sendmsg(fd: Int, msg: Long, flags: Int): Long
    external fun recvmsg(fd: Int, msg: Long, flags: Int): Long
    external fun getdomainname(name: Long, len: Long): Int
    external fun setdomainname(name: String?, len: Long): Int
    external fun vhangup(): Int
    external fun sendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int
    external fun recvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int
    external fun sync()
    external fun schedGetaffinity(pid: Long, cpusetsize: Long, cpuset: Long): Int
    external fun schedSetaffinity(pid: Long, cpusetsize: Long, cpuset: Long): Int
    external fun umount(target: String?): Int
    external fun schedGetPriorityMax(policy: Int): Int
    external fun tee(fdIn: Int, fdOut: Int, len: Long, flags: Int): Long
    external fun settimeofday(tv: Long, tz: Long): Int
    external fun splice(fdIn: Int, offIn: Long, fdOut: Int, offOut: Long, len: Long, flags: Int): Long
    external fun eventfd(initval: Int, flags: Int): Int
    external fun schedRrGetInterval(pid: Long, tp: Long): Int
    external fun semTimedwait(sem: Long, abstime: Long): Int
    external fun semGetvalue(sem: Long, sval: Long): Int
    external fun schedSetparam(pid: Long, param: Long): Int
    external fun swapoff(puath: String?): Int
    external fun vmsplice(fd: Int, iov: Long, nrSegs: Long, flags: Int): Long
    external fun mount(src: String?, target: String?, fstype: String?, flags: Long, data: Long): Int
    external fun personality(persona: Long): Int
    external fun schedGetparam(pid: Long, param: Long): Int
    external fun ppoll(fds: Long, nfds: Long, timeout: Long, sigmask: Long): Int
    external fun pthreadMutexTimedlock(lock: Long, abstime: Long): Int
    external fun schedGetscheduler(pid: Long): Int
    external fun clockNanosleep(clkId: Long, flags: Int, rqtp: Long, rmtp: Long): Int
    external fun pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int
    external fun pthreadAttrSetguardsize(attr: Long, guardsize: Long): Int
    external fun sethostname(name: String?, len: Long): Int
    external fun schedGetPriorityMin(policy: Int): Int
    external fun umount2(target: String?, flags: Int): Int
    external fun swapon(path: String?, swapflags: Int): Int
    external fun schedSetscheduler(pid: Long, policy: Int, param: Long): Int
    external fun sigsuspend(mask: Long): Int
    external fun getgrgidR(gid: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun sigaltstack(ss: Long, oss: Long): Int
    external fun semClose(sem: Long): Int
    external fun getdtablesize(): Int
    external fun getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun initgroups(user: String?, group: Long): Int
    external fun pthreadSigmask(how: Int, set: Long, oldset: Long): Int
    external fun getgrnam(name: String?): Long?
    external fun pthreadCancel(thread: Long): Int
    external fun pthreadKill(thread: Long, sig: Int): Int
    external fun semUnlink(name: String?): Int
    external fun daemon(nochdir: Int, noclose: Int): Int
    external fun getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getpwuidR(uid: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun sigwait(set: Long, sig: Long): Int
    external fun pthreadAtfork(prepare: Long, parent: Long, child: Long): Int
    external fun getgrgid(gid: Long): Long?
    external fun setgrent()
    external fun endgrent()
    external fun getgrent(): Long?
    external fun getgrouplist(user: String?, group: Long, groups: Long, ngroups: Long): Int
    external fun popen(command: String?, mode: String?): Long?
    external fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int
    external fun pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int
    external fun dlIteratePhdr(callback: Long, data: Long): Int
}

public actual fun isalnum(c: CInt): CInt =
    FuchsiaModRawLibc.isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    FuchsiaModRawLibc.isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    FuchsiaModRawLibc.iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    FuchsiaModRawLibc.isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    FuchsiaModRawLibc.isgraph(c)

public actual fun islower(c: CInt): CInt =
    FuchsiaModRawLibc.islower(c)

public actual fun isprint(c: CInt): CInt =
    FuchsiaModRawLibc.isprint(c)

public actual fun ispunct(c: CInt): CInt =
    FuchsiaModRawLibc.ispunct(c)

public actual fun isspace(c: CInt): CInt =
    FuchsiaModRawLibc.isspace(c)

public actual fun isupper(c: CInt): CInt =
    FuchsiaModRawLibc.isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    FuchsiaModRawLibc.isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    FuchsiaModRawLibc.isblank(c)

public actual fun tolower(c: CInt): CInt =
    FuchsiaModRawLibc.tolower(c)

public actual fun toupper(c: CInt): CInt =
    FuchsiaModRawLibc.toupper(c)

public actual fun fopen(filename: String?, mode: String?): FILE? =
    FuchsiaModRawLibc.fopen(filename, mode)

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    FuchsiaModRawLibc.freopen(filename, mode, file?.toLong() ?: 0L)

public actual fun fflush(file: FILE?): CInt =
    FuchsiaModRawLibc.fflush(file?.toLong() ?: 0L)

public actual fun fclose(file: FILE?): CInt =
    FuchsiaModRawLibc.fclose(file?.toLong() ?: 0L)

public actual fun remove(filename: String?): CInt =
    FuchsiaModRawLibc.remove(filename)

public actual fun rename(oldname: String?, newname: String?): CInt =
    FuchsiaModRawLibc.rename(oldname, newname)

public actual fun tmpfile(): FILE? =
    FuchsiaModRawLibc.tmpfile()

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    FuchsiaModRawLibc.setvbuf(stream?.toLong() ?: 0L, buffer?.value ?: 0L, mode, size)

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    FuchsiaModRawLibc.setbuf(stream?.toLong() ?: 0L, buf?.value ?: 0L)
}

public actual fun getchar(): CInt =
    FuchsiaModRawLibc.getchar()

public actual fun putchar(c: CInt): CInt =
    FuchsiaModRawLibc.putchar(c)

public actual fun fgetc(stream: FILE?): CInt =
    FuchsiaModRawLibc.fgetc(stream?.toLong() ?: 0L)

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    FuchsiaModRawLibc.fgets(buf?.value ?: 0L, n, stream?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    FuchsiaModRawLibc.fputc(c, stream?.toLong() ?: 0L)

public actual fun fputs(s: String?, stream: FILE?): CInt =
    FuchsiaModRawLibc.fputs(s, stream?.toLong() ?: 0L)

public actual fun puts(s: String?): CInt =
    FuchsiaModRawLibc.puts(s)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    FuchsiaModRawLibc.ungetc(c, stream?.toLong() ?: 0L)

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    FuchsiaModRawLibc.fread(ptr?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    FuchsiaModRawLibc.fwrite(ptr?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    FuchsiaModRawLibc.fseek(stream?.toLong() ?: 0L, offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    FuchsiaModRawLibc.ftell(stream?.toLong() ?: 0L)

public actual fun rewind(stream: FILE?) {
    FuchsiaModRawLibc.rewind(stream?.toLong() ?: 0L)
}

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    FuchsiaModRawLibc.fgetpos(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    FuchsiaModRawLibc.fsetpos(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)

public actual fun feof(stream: FILE?): CInt =
    FuchsiaModRawLibc.feof(stream?.toLong() ?: 0L)

public actual fun ferror(stream: FILE?): CInt =
    FuchsiaModRawLibc.ferror(stream?.toLong() ?: 0L)

public actual fun perror(s: String?) {
    FuchsiaModRawLibc.perror(s)
}

public actual fun atof(s: String?): CDouble =
    FuchsiaModRawLibc.atof(s)

public actual fun atoi(s: String?): CInt =
    FuchsiaModRawLibc.atoi(s)

public actual fun atol(s: String?): CLong =
    FuchsiaModRawLibc.atol(s)

public actual fun atoll(s: String?): CLonglong =
    FuchsiaModRawLibc.atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    FuchsiaModRawLibc.strtod(s, endp?.value ?: 0L)

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    FuchsiaModRawLibc.strtof(s, endp?.value ?: 0L)

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    FuchsiaModRawLibc.strtol(s, endp?.value ?: 0L, base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    FuchsiaModRawLibc.strtoll(s, endp?.value ?: 0L, base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    FuchsiaModRawLibc.strtoul(s, endp?.value ?: 0L, base)

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    FuchsiaModRawLibc.strtoull(s, endp?.value ?: 0L, base)

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    FuchsiaModRawLibc.calloc(nobj, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    FuchsiaModRawLibc.malloc(size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    FuchsiaModRawLibc.realloc(p?.value ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(p: COpaquePointer?) {
    FuchsiaModRawLibc.free(p?.value ?: 0L)
}

public actual fun abort(): Nothing =
    FuchsiaModRawLibc.abort()

public actual fun exit(status: CInt): Nothing =
    FuchsiaModRawLibc.exit(status)

public actual fun atexit(cb: SigactionSaRestorerCallback): CInt =
    FuchsiaModRawLibc.atexit(cb)

public actual fun system(s: String?): CInt =
    FuchsiaModRawLibc.system(s)

public actual fun getenv(s: String?): COpaquePointer? =
    FuchsiaModRawLibc.getenv(s).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    FuchsiaModRawLibc.strcpy(dst?.value ?: 0L, src).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    FuchsiaModRawLibc.strncpy(dst?.value ?: 0L, src, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    FuchsiaModRawLibc.strcat(s?.value ?: 0L, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    FuchsiaModRawLibc.strncat(s?.value ?: 0L, ct, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    FuchsiaModRawLibc.strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    FuchsiaModRawLibc.strncmp(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): CInt =
    FuchsiaModRawLibc.strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    FuchsiaModRawLibc.strchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    FuchsiaModRawLibc.strrchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    FuchsiaModRawLibc.strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    FuchsiaModRawLibc.strcspn(cs, ct)

public actual fun strdup(cs: String?): COpaquePointer? =
    FuchsiaModRawLibc.strdup(cs).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    FuchsiaModRawLibc.strpbrk(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    FuchsiaModRawLibc.strstr(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strlen(cs: String?): SizeT =
    FuchsiaModRawLibc.strlen(cs)

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    FuchsiaModRawLibc.strnlen(cs, maxlen)

public actual fun strerror(n: CInt): COpaquePointer? =
    FuchsiaModRawLibc.strerror(n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    FuchsiaModRawLibc.strtok(s?.value ?: 0L, t).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    FuchsiaModRawLibc.strxfrm(s?.value ?: 0L, ct, n)

public actual fun wcslen(buf: WcharT?): SizeT =
    FuchsiaModRawLibc.wcslen(buf?.toLong() ?: 0L)

public actual fun wcstombs(dest: COpaquePointer?, src: WcharT?, n: SizeT): SizeT =
    FuchsiaModRawLibc.wcstombs(dest?.value ?: 0L, src?.toLong() ?: 0L, n)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    FuchsiaModRawLibc.memchr(cx?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: SizeT): WcharT? =
    FuchsiaModRawLibc.wmemchr(cx?.toLong() ?: 0L, c, n)

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    FuchsiaModRawLibc.memcmp(cx?.value ?: 0L, ct?.value ?: 0L, n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    FuchsiaModRawLibc.memcpy(dest?.value ?: 0L, src?.value ?: 0L, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    FuchsiaModRawLibc.memmove(dest?.value ?: 0L, src?.value ?: 0L, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    FuchsiaModRawLibc.memset(dest?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun abs(i: CInt): CInt =
    FuchsiaModRawLibc.abs(i)

public actual fun labs(i: CLong): CLong =
    FuchsiaModRawLibc.labs(i)

public actual fun rand(): CInt =
    FuchsiaModRawLibc.rand()

public actual fun srand(seed: CUint) {
    FuchsiaModRawLibc.srand(seed)
}

public actual fun getpwnam(name: String?): Passwd? =
    FuchsiaModRawLibc.getpwnam(name)

public actual fun getpwuid(uid: io.github.kotlinmania.libc.UidT): Passwd? =
    FuchsiaModRawLibc.getpwuid(uid)

public actual fun getcharUnlocked(): CInt =
    FuchsiaModRawLibc.getcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    FuchsiaModRawLibc.putcharUnlocked(c)

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    FuchsiaModRawLibc.socket(domain, ty, protocol)

public actual fun connect(socket: CInt, address: Sockaddr?, len: SocklenT): CInt =
    FuchsiaModRawLibc.connect(socket, address?.toLong() ?: 0L, len)

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    FuchsiaModRawLibc.listen(socket, backlog)

public actual fun accept(socket: CInt, address: Sockaddr?, addressLen: UInt?): CInt =
    FuchsiaModRawLibc.accept(socket, address?.toLong() ?: 0L, addressLen?.toLong() ?: 0L)

public actual fun getpeername(socket: CInt, address: Sockaddr?, addressLen: UInt?): CInt =
    FuchsiaModRawLibc.getpeername(socket, address?.toLong() ?: 0L, addressLen?.toLong() ?: 0L)

public actual fun getsockname(socket: CInt, address: Sockaddr?, addressLen: UInt?): CInt =
    FuchsiaModRawLibc.getsockname(socket, address?.toLong() ?: 0L, addressLen?.toLong() ?: 0L)

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    FuchsiaModRawLibc.setsockopt(socket, level, name, value?.value ?: 0L, optionLen)

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: CInt?): CInt =
    FuchsiaModRawLibc.socketpair(domain, type, protocol, socketVector?.toLong() ?: 0L)

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    FuchsiaModRawLibc.sendto(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen)

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    FuchsiaModRawLibc.shutdown(socket, how)

public actual fun chmod(path: String?, mode: ModeT): CInt =
    FuchsiaModRawLibc.chmod(path, mode)

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    FuchsiaModRawLibc.fchmod(fd, mode)

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    FuchsiaModRawLibc.fstat(fildes, buf?.toLong() ?: 0L)

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    FuchsiaModRawLibc.mkdir(path, mode)

public actual fun stat(path: String?, buf: Stat?): CInt =
    FuchsiaModRawLibc.stat(path, buf?.toLong() ?: 0L)

public actual fun pclose(stream: FILE?): CInt =
    FuchsiaModRawLibc.pclose(stream?.toLong() ?: 0L)

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    FuchsiaModRawLibc.fdopen(fd, mode)

public actual fun fileno(stream: FILE?): CInt =
    FuchsiaModRawLibc.fileno(stream?.toLong() ?: 0L)

public actual fun creat(path: String?, mode: ModeT): CInt =
    FuchsiaModRawLibc.creat(path, mode)

public actual fun opendir(dirname: String?): DIR? =
    FuchsiaModRawLibc.opendir(dirname)

public actual fun readdir(dirp: DIR?): io.github.kotlinmania.libc.Dirent? =
    FuchsiaModRawLibc.readdir(dirp?.toLong() ?: 0L)

public actual fun readdirR(dirp: DIR?, entry: io.github.kotlinmania.libc.Dirent?, result: COpaquePointer?): CInt =
    FuchsiaModRawLibc.readdirR(dirp?.toLong() ?: 0L, entry?.toLong() ?: 0L, result?.value ?: 0L)

public actual fun closedir(dirp: DIR?): CInt =
    FuchsiaModRawLibc.closedir(dirp?.toLong() ?: 0L)

public actual fun rewinddir(dirp: DIR?) {
    FuchsiaModRawLibc.rewinddir(dirp?.toLong() ?: 0L)
}

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    FuchsiaModRawLibc.fchmodat(dirfd, pathname, mode, flags)

public actual fun fchown(fd: CInt, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT): CInt =
    FuchsiaModRawLibc.fchown(fd, owner, group)

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT, flags: CInt): CInt =
    FuchsiaModRawLibc.fchownat(dirfd, pathname, owner, group, flags)

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt =
    FuchsiaModRawLibc.fstatat(dirfd, pathname, buf?.toLong() ?: 0L, flags)

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    FuchsiaModRawLibc.linkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    FuchsiaModRawLibc.mkdirat(dirfd, pathname, mode)

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT =
    FuchsiaModRawLibc.readlinkat(dirfd, pathname, buf?.value ?: 0L, bufsiz)

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    FuchsiaModRawLibc.renameat(olddirfd, oldpath, newdirfd, newpath)

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    FuchsiaModRawLibc.symlinkat(target, newdirfd, linkpath)

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    FuchsiaModRawLibc.unlinkat(dirfd, pathname, flags)

public actual fun access(path: String?, amode: CInt): CInt =
    FuchsiaModRawLibc.access(path, amode)

public actual fun alarm(seconds: CUint): CUint =
    FuchsiaModRawLibc.alarm(seconds)

public actual fun chdir(dir: String?): CInt =
    FuchsiaModRawLibc.chdir(dir)

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    FuchsiaModRawLibc.chown(path, uid, gid)

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    FuchsiaModRawLibc.lchown(path, uid, gid)

public actual fun close(fd: CInt): CInt =
    FuchsiaModRawLibc.close(fd)

public actual fun dup(fd: CInt): CInt =
    FuchsiaModRawLibc.dup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    FuchsiaModRawLibc.dup2(src, dst)

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    FuchsiaModRawLibc.execv(prog, argv?.value ?: 0L)

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    FuchsiaModRawLibc.execve(prog, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    FuchsiaModRawLibc.execvp(c, argv?.value ?: 0L)

public actual fun fork(): PidT =
    FuchsiaModRawLibc.fork()

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    FuchsiaModRawLibc.fpathconf(filedes, name)

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    FuchsiaModRawLibc.getcwd(buf?.value ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getegid(): GidT =
    FuchsiaModRawLibc.getegid()

public actual fun geteuid(): UidT =
    FuchsiaModRawLibc.geteuid()

public actual fun getgid(): GidT =
    FuchsiaModRawLibc.getgid()

public actual fun getgroups(ngroupsMax: CInt, groups: UInt?): CInt =
    FuchsiaModRawLibc.getgroups(ngroupsMax, groups?.toLong() ?: 0L)

public actual fun getlogin(): COpaquePointer? =
    FuchsiaModRawLibc.getlogin().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    FuchsiaModRawLibc.getopt(argc, argv?.value ?: 0L, optstr)

public actual fun getpgid(pid: PidT): PidT =
    FuchsiaModRawLibc.getpgid(pid)

public actual fun getpgrp(): PidT =
    FuchsiaModRawLibc.getpgrp()

public actual fun getpid(): PidT =
    FuchsiaModRawLibc.getpid()

public actual fun getppid(): PidT =
    FuchsiaModRawLibc.getppid()

public actual fun getuid(): UidT =
    FuchsiaModRawLibc.getuid()

public actual fun isatty(fd: CInt): CInt =
    FuchsiaModRawLibc.isatty(fd)

public actual fun link(src: String?, dst: String?): CInt =
    FuchsiaModRawLibc.link(src, dst)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    FuchsiaModRawLibc.lseek(fd, offset, whence)

public actual fun pathconf(path: String?, name: CInt): CLong =
    FuchsiaModRawLibc.pathconf(path, name)

public actual fun pause(): CInt =
    FuchsiaModRawLibc.pause()

public actual fun pipe(fds: CInt?): CInt =
    FuchsiaModRawLibc.pipe(fds?.toLong() ?: 0L)

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    FuchsiaModRawLibc.posixMemalign(memptr?.value ?: 0L, align, size)

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    FuchsiaModRawLibc.read(fd, buf?.value ?: 0L, count)

public actual fun rmdir(path: String?): CInt =
    FuchsiaModRawLibc.rmdir(path)

public actual fun seteuid(uid: UidT): CInt =
    FuchsiaModRawLibc.seteuid(uid)

public actual fun setegid(gid: GidT): CInt =
    FuchsiaModRawLibc.setegid(gid)

public actual fun setgid(gid: GidT): CInt =
    FuchsiaModRawLibc.setgid(gid)

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    FuchsiaModRawLibc.setpgid(pid, pgid)

public actual fun setsid(): PidT =
    FuchsiaModRawLibc.setsid()

public actual fun setuid(uid: UidT): CInt =
    FuchsiaModRawLibc.setuid(uid)

public actual fun sleep(secs: CUint): CUint =
    FuchsiaModRawLibc.sleep(secs)

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt =
    FuchsiaModRawLibc.nanosleep(rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)

public actual fun tcgetpgrp(fd: CInt): PidT =
    FuchsiaModRawLibc.tcgetpgrp(fd)

public actual fun tcsetpgrp(fd: CInt, pgrp: io.github.kotlinmania.libc.PidT): CInt =
    FuchsiaModRawLibc.tcsetpgrp(fd, pgrp)

public actual fun ttyname(fd: CInt): COpaquePointer? =
    FuchsiaModRawLibc.ttyname(fd).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unlink(c: String?): CInt =
    FuchsiaModRawLibc.unlink(c)

public actual fun wait(status: CInt?): PidT =
    FuchsiaModRawLibc.wait(status?.toLong() ?: 0L)

public actual fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT =
    FuchsiaModRawLibc.waitpid(pid, status?.toLong() ?: 0L, options)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    FuchsiaModRawLibc.write(fd, buf?.value ?: 0L, count)

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    FuchsiaModRawLibc.pread(fd, buf?.value ?: 0L, count, offset)

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    FuchsiaModRawLibc.pwrite(fd, buf?.value ?: 0L, count, offset)

public actual fun umask(mask: ModeT): ModeT =
    FuchsiaModRawLibc.umask(mask)

public actual fun utime(file: String?, buf: Utimbuf?): CInt =
    FuchsiaModRawLibc.utime(file, buf?.toLong() ?: 0L)

public actual fun kill(pid: PidT, sig: CInt): CInt =
    FuchsiaModRawLibc.kill(pid, sig)

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    FuchsiaModRawLibc.mlock(addr?.value ?: 0L, len)

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    FuchsiaModRawLibc.munlock(addr?.value ?: 0L, len)

public actual fun mlockall(flags: CInt): CInt =
    FuchsiaModRawLibc.mlockall(flags)

public actual fun munlockall(): CInt =
    FuchsiaModRawLibc.munlockall()

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    FuchsiaModRawLibc.mmap(addr?.value ?: 0L, len, prot, flags, fd, offset).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    FuchsiaModRawLibc.munmap(addr?.value ?: 0L, len)

public actual fun ifNametoindex(ifname: String?): CUint =
    FuchsiaModRawLibc.ifNametoindex(ifname)

public actual fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer? =
    FuchsiaModRawLibc.ifIndextoname(ifindex, ifname?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lstat(path: String?, buf: Stat?): CInt =
    FuchsiaModRawLibc.lstat(path, buf?.toLong() ?: 0L)

public actual fun fsync(fd: CInt): CInt =
    FuchsiaModRawLibc.fsync(fd)

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    FuchsiaModRawLibc.setenv(name, value, overwrite)

public actual fun unsetenv(name: String?): CInt =
    FuchsiaModRawLibc.unsetenv(name)

public actual fun symlink(path1: String?, path2: String?): CInt =
    FuchsiaModRawLibc.symlink(path1, path2)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    FuchsiaModRawLibc.ftruncate(fd, length)

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    FuchsiaModRawLibc.signal(signum, handler)

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    FuchsiaModRawLibc.realpath(pathname, resolved?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun flock(fd: CInt, operation: CInt): CInt =
    FuchsiaModRawLibc.flock(fd, operation)

public actual fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: COpaquePointer?): CInt =
    FuchsiaModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)

public actual fun times(buf: io.github.kotlinmania.libc.Tms?): io.github.kotlinmania.libc.ClockT =
    FuchsiaModRawLibc.times(buf?.toLong() ?: 0L)

public actual fun pthreadSelf(): io.github.kotlinmania.libc.PthreadT =
    FuchsiaModRawLibc.pthreadSelf()

public actual fun pthreadJoin(native: io.github.kotlinmania.libc.PthreadT, value: COpaquePointer?): CInt =
    FuchsiaModRawLibc.pthreadJoin(native, value?.value ?: 0L)

public actual fun pthreadExit(value: COpaquePointer?): Nothing =
    FuchsiaModRawLibc.pthreadExit(value?.value ?: 0L)

public actual fun pthreadAttrInit(attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    FuchsiaModRawLibc.pthreadAttrInit(attr?.toLong() ?: 0L)

public actual fun pthreadAttrDestroy(attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    FuchsiaModRawLibc.pthreadAttrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadAttrGetstacksize(attr: io.github.kotlinmania.libc.PthreadAttrT?, stacksize: ULong?): CInt =
    FuchsiaModRawLibc.pthreadAttrGetstacksize(attr?.toLong() ?: 0L, stacksize?.toLong() ?: 0L)

public actual fun pthreadAttrSetstacksize(attr: io.github.kotlinmania.libc.PthreadAttrT?, stackSize: SizeT): CInt =
    FuchsiaModRawLibc.pthreadAttrSetstacksize(attr?.toLong() ?: 0L, stackSize)

public actual fun pthreadAttrSetdetachstate(attr: io.github.kotlinmania.libc.PthreadAttrT?, state: CInt): CInt =
    FuchsiaModRawLibc.pthreadAttrSetdetachstate(attr?.toLong() ?: 0L, state)

public actual fun pthreadDetach(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    FuchsiaModRawLibc.pthreadDetach(thread)

public actual fun schedYield(): CInt =
    FuchsiaModRawLibc.schedYield()

public actual fun pthreadKeyCreate(key: CUint?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    FuchsiaModRawLibc.pthreadKeyCreate(key?.toLong() ?: 0L, dtor?.toLong() ?: 0L)

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    FuchsiaModRawLibc.pthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    FuchsiaModRawLibc.pthreadGetspecific(key).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    FuchsiaModRawLibc.pthreadSetspecific(key, value?.value ?: 0L)

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    FuchsiaModRawLibc.pthreadMutexInit(lock?.toLong() ?: 0L, attr?.toLong() ?: 0L)

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt =
    FuchsiaModRawLibc.pthreadMutexDestroy(lock?.toLong() ?: 0L)

public actual fun pthreadMutexLock(lock: PthreadMutexT?): CInt =
    FuchsiaModRawLibc.pthreadMutexLock(lock?.toLong() ?: 0L)

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt =
    FuchsiaModRawLibc.pthreadMutexTrylock(lock?.toLong() ?: 0L)

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt =
    FuchsiaModRawLibc.pthreadMutexUnlock(lock?.toLong() ?: 0L)

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    FuchsiaModRawLibc.pthreadMutexattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    FuchsiaModRawLibc.pthreadMutexattrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt =
    FuchsiaModRawLibc.pthreadMutexattrSettype(attr?.toLong() ?: 0L, type)

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    FuchsiaModRawLibc.pthreadCondInit(cond?.toLong() ?: 0L, attr?.toLong() ?: 0L)

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt =
    FuchsiaModRawLibc.pthreadCondWait(cond?.toLong() ?: 0L, lock?.toLong() ?: 0L)

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    FuchsiaModRawLibc.pthreadCondTimedwait(cond?.toLong() ?: 0L, lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    FuchsiaModRawLibc.pthreadCondSignal(cond?.toLong() ?: 0L)

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    FuchsiaModRawLibc.pthreadCondBroadcast(cond?.toLong() ?: 0L)

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    FuchsiaModRawLibc.pthreadCondDestroy(cond?.toLong() ?: 0L)

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    FuchsiaModRawLibc.pthreadCondattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    FuchsiaModRawLibc.pthreadCondattrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): CInt =
    FuchsiaModRawLibc.pthreadRwlockInit(lock?.toLong() ?: 0L, attr?.toLong() ?: 0L)

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT?): CInt =
    FuchsiaModRawLibc.pthreadRwlockDestroy(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT?): CInt =
    FuchsiaModRawLibc.pthreadRwlockRdlock(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): CInt =
    FuchsiaModRawLibc.pthreadRwlockTryrdlock(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT?): CInt =
    FuchsiaModRawLibc.pthreadRwlockWrlock(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): CInt =
    FuchsiaModRawLibc.pthreadRwlockTrywrlock(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT?): CInt =
    FuchsiaModRawLibc.pthreadRwlockUnlock(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt =
    FuchsiaModRawLibc.pthreadRwlockattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt =
    FuchsiaModRawLibc.pthreadRwlockattrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadGetnameNp(thread: io.github.kotlinmania.libc.PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    FuchsiaModRawLibc.pthreadGetnameNp(thread, name?.value ?: 0L, len)

public actual fun pthreadSetnameNp(thread: io.github.kotlinmania.libc.PthreadT, name: String?): CInt =
    FuchsiaModRawLibc.pthreadSetnameNp(thread, name)

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    FuchsiaModRawLibc.strerrorR(errnum, buf?.value ?: 0L, buflen)

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: UInt?): CInt =
    FuchsiaModRawLibc.getsockopt(sockfd, level, optname, optval?.value ?: 0L, optlen?.toLong() ?: 0L)

public actual fun raise(signum: CInt): CInt =
    FuchsiaModRawLibc.raise(signum)

public actual fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt =
    FuchsiaModRawLibc.sigaction(signum, act?.toLong() ?: 0L, oldact?.toLong() ?: 0L)

public actual fun utimes(filename: String?, times: io.github.kotlinmania.libc.Timeval?): CInt =
    FuchsiaModRawLibc.utimes(filename, times?.toLong() ?: 0L)

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    FuchsiaModRawLibc.dlopen(filename, flag).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlerror(): COpaquePointer? =
    FuchsiaModRawLibc.dlerror().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    FuchsiaModRawLibc.dlsym(handle?.value ?: 0L, symbol).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlclose(handle: COpaquePointer?): CInt =
    FuchsiaModRawLibc.dlclose(handle?.value ?: 0L)

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt =
    FuchsiaModRawLibc.dladdr(addr?.value ?: 0L, info?.toLong() ?: 0L)

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt =
    FuchsiaModRawLibc.getaddrinfo(node, service, hints?.toLong() ?: 0L, res?.value ?: 0L)

public actual fun freeaddrinfo(res: Addrinfo?) {
    FuchsiaModRawLibc.freeaddrinfo(res?.toLong() ?: 0L)
}

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    FuchsiaModRawLibc.gaiStrerror(errcode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun resInit(): CInt =
    FuchsiaModRawLibc.resInit()

public actual fun gmtimeR(timeP: CLong?, result: Tm?): Tm? =
    FuchsiaModRawLibc.gmtimeR(timeP?.toLong() ?: 0L, result?.toLong() ?: 0L)

public actual fun localtimeR(timeP: CLong?, result: Tm?): Tm? =
    FuchsiaModRawLibc.localtimeR(timeP?.toLong() ?: 0L, result?.toLong() ?: 0L)

public actual fun mktime(tm: Tm?): TimeT =
    FuchsiaModRawLibc.mktime(tm?.toLong() ?: 0L)

public actual fun time(time: CLong?): TimeT =
    FuchsiaModRawLibc.time(time?.toLong() ?: 0L)

public actual fun gmtime(timeP: CLong?): Tm? =
    FuchsiaModRawLibc.gmtime(timeP?.toLong() ?: 0L)

public actual fun localtime(timeP: CLong?): Tm? =
    FuchsiaModRawLibc.localtime(timeP?.toLong() ?: 0L)

public actual fun mknod(pathname: String?, mode: ModeT, dev: io.github.kotlinmania.libc.DevT): CInt =
    FuchsiaModRawLibc.mknod(pathname, mode, dev)

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    FuchsiaModRawLibc.uname(buf?.toLong() ?: 0L)

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    FuchsiaModRawLibc.gethostname(name?.value ?: 0L, len)

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    FuchsiaModRawLibc.getservbyname(name, proto)

public actual fun getprotobyname(name: String?): Protoent? =
    FuchsiaModRawLibc.getprotobyname(name)

public actual fun getprotobynumber(proto: CInt): Protoent? =
    FuchsiaModRawLibc.getprotobynumber(proto)

public actual fun usleep(secs: CUint): CInt =
    FuchsiaModRawLibc.usleep(secs)

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    FuchsiaModRawLibc.send(socket, buf?.value ?: 0L, len, flags)

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    FuchsiaModRawLibc.recv(socket, buf?.value ?: 0L, len, flags)

public actual fun putenv(string: COpaquePointer?): CInt =
    FuchsiaModRawLibc.putenv(string?.value ?: 0L)

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    FuchsiaModRawLibc.poll(fds?.toLong() ?: 0L, nfds, timeout)

public actual fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt =
    FuchsiaModRawLibc.select(nfds, readfds?.toLong() ?: 0L, writefds?.toLong() ?: 0L, errorfds?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    FuchsiaModRawLibc.setlocale(category, locale).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localeconv(): Lconv? =
    FuchsiaModRawLibc.localeconv()

public actual fun semDestroy(sem: SemT?): CInt =
    FuchsiaModRawLibc.semDestroy(sem?.toLong() ?: 0L)

public actual fun semWait(sem: SemT?): CInt =
    FuchsiaModRawLibc.semWait(sem?.toLong() ?: 0L)

public actual fun semTrywait(sem: SemT?): CInt =
    FuchsiaModRawLibc.semTrywait(sem?.toLong() ?: 0L)

public actual fun semPost(sem: SemT?): CInt =
    FuchsiaModRawLibc.semPost(sem?.toLong() ?: 0L)

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    FuchsiaModRawLibc.semInit(sem?.toLong() ?: 0L, pshared, value)

public actual fun statvfs(path: String?, buf: Statvfs?): CInt =
    FuchsiaModRawLibc.statvfs(path, buf?.toLong() ?: 0L)

public actual fun fstatvfs(fd: CInt, buf: Statvfs?): CInt =
    FuchsiaModRawLibc.fstatvfs(fd, buf?.toLong() ?: 0L)

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT =
    FuchsiaModRawLibc.readlink(path, buf?.value ?: 0L, bufsz)

public actual fun sigemptyset(set: SigsetT?): CInt =
    FuchsiaModRawLibc.sigemptyset(set?.toLong() ?: 0L)

public actual fun sigaddset(set: SigsetT?, signum: CInt): CInt =
    FuchsiaModRawLibc.sigaddset(set?.toLong() ?: 0L, signum)

public actual fun sigfillset(set: SigsetT?): CInt =
    FuchsiaModRawLibc.sigfillset(set?.toLong() ?: 0L)

public actual fun sigdelset(set: SigsetT?, signum: CInt): CInt =
    FuchsiaModRawLibc.sigdelset(set?.toLong() ?: 0L, signum)

public actual fun sigismember(set: SigsetT?, signum: CInt): CInt =
    FuchsiaModRawLibc.sigismember(set?.toLong() ?: 0L, signum)

public actual fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    FuchsiaModRawLibc.sigprocmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)

public actual fun sigpending(set: SigsetT?): CInt =
    FuchsiaModRawLibc.sigpending(set?.toLong() ?: 0L)

public actual fun timegm(tm: io.github.kotlinmania.libc.Tm?): TimeT =
    FuchsiaModRawLibc.timegm(tm?.toLong() ?: 0L)

public actual fun getsid(pid: PidT): PidT =
    FuchsiaModRawLibc.getsid(pid)

public actual fun sysconf(name: CInt): CLong =
    FuchsiaModRawLibc.sysconf(name)

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    FuchsiaModRawLibc.mkfifo(path, mode)

public actual fun pselect(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: SigsetT?): CInt =
    FuchsiaModRawLibc.pselect(nfds, readfds?.toLong() ?: 0L, writefds?.toLong() ?: 0L, errorfds?.toLong() ?: 0L, timeout?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    FuchsiaModRawLibc.fseeko(stream?.toLong() ?: 0L, offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    FuchsiaModRawLibc.ftello(stream?.toLong() ?: 0L)

public actual fun tcdrain(fd: CInt): CInt =
    FuchsiaModRawLibc.tcdrain(fd)

public actual fun cfgetispeed(termios: io.github.kotlinmania.libc.Termios?): io.github.kotlinmania.libc.SpeedT =
    FuchsiaModRawLibc.cfgetispeed(termios?.toLong() ?: 0L)

public actual fun cfgetospeed(termios: io.github.kotlinmania.libc.Termios?): io.github.kotlinmania.libc.SpeedT =
    FuchsiaModRawLibc.cfgetospeed(termios?.toLong() ?: 0L)

public actual fun cfmakeraw(termios: io.github.kotlinmania.libc.Termios?) {
    FuchsiaModRawLibc.cfmakeraw(termios?.toLong() ?: 0L)
}

public actual fun cfsetispeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt =
    FuchsiaModRawLibc.cfsetispeed(termios?.toLong() ?: 0L, speed)

public actual fun cfsetospeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt =
    FuchsiaModRawLibc.cfsetospeed(termios?.toLong() ?: 0L, speed)

public actual fun cfsetspeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt =
    FuchsiaModRawLibc.cfsetspeed(termios?.toLong() ?: 0L, speed)

public actual fun tcgetattr(fd: CInt, termios: io.github.kotlinmania.libc.Termios?): CInt =
    FuchsiaModRawLibc.tcgetattr(fd, termios?.toLong() ?: 0L)

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: io.github.kotlinmania.libc.Termios?): CInt =
    FuchsiaModRawLibc.tcsetattr(fd, optionalActions, termios?.toLong() ?: 0L)

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    FuchsiaModRawLibc.tcflow(fd, action)

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    FuchsiaModRawLibc.tcflush(fd, action)

public actual fun tcgetsid(fd: CInt): io.github.kotlinmania.libc.PidT =
    FuchsiaModRawLibc.tcgetsid(fd)

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    FuchsiaModRawLibc.tcsendbreak(fd, duration)

public actual fun mkstemp(template: COpaquePointer?): CInt =
    FuchsiaModRawLibc.mkstemp(template?.value ?: 0L)

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    FuchsiaModRawLibc.mkdtemp(template?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    FuchsiaModRawLibc.tmpnam(ptr?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    FuchsiaModRawLibc.openlog(ident, logopt, facility)
}

public actual fun closelog() {
    FuchsiaModRawLibc.closelog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    FuchsiaModRawLibc.setlogmask(maskpri)

public actual fun grantpt(fd: CInt): CInt =
    FuchsiaModRawLibc.grantpt(fd)

public actual fun posixOpenpt(flags: CInt): CInt =
    FuchsiaModRawLibc.posixOpenpt(flags)

public actual fun ptsname(fd: CInt): COpaquePointer? =
    FuchsiaModRawLibc.ptsname(fd).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun unlockpt(fd: CInt): CInt =
    FuchsiaModRawLibc.unlockpt(fd)

public actual fun fdatasync(fd: CInt): CInt =
    FuchsiaModRawLibc.fdatasync(fd)

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    FuchsiaModRawLibc.clockGetres(clkId, tp?.toLong() ?: 0L)

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    FuchsiaModRawLibc.clockGettime(clkId, tp?.toLong() ?: 0L)

public actual fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    FuchsiaModRawLibc.clockSettime(clkId, tp?.toLong() ?: 0L)

public actual fun dirfd(dirp: DIR?): CInt =
    FuchsiaModRawLibc.dirfd(dirp?.toLong() ?: 0L)

public actual fun pthreadGetattrNp(native: io.github.kotlinmania.libc.PthreadT, attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    FuchsiaModRawLibc.pthreadGetattrNp(native, attr?.toLong() ?: 0L)

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    FuchsiaModRawLibc.pthreadAttrGetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    FuchsiaModRawLibc.memalign(align, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgroups(ngroups: SizeT, ptr: UInt?): CInt =
    FuchsiaModRawLibc.setgroups(ngroups, ptr?.toLong() ?: 0L)

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    FuchsiaModRawLibc.pipe2(fds?.toLong() ?: 0L, flags)

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    FuchsiaModRawLibc.statfs(path, buf?.toLong() ?: 0L)

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    FuchsiaModRawLibc.fstatfs(fd, buf?.toLong() ?: 0L)

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    FuchsiaModRawLibc.memrchr(cx?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    FuchsiaModRawLibc.posixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: io.github.kotlinmania.libc.Timespec?): CInt =
    FuchsiaModRawLibc.futimens(fd, times?.toLong() ?: 0L)

public actual fun utimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flag: CInt): CInt =
    FuchsiaModRawLibc.utimensat(dirfd, path, times?.toLong() ?: 0L, flag)

public actual fun duplocale(base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    FuchsiaModRawLibc.duplocale(base)

public actual fun freelocale(loc: io.github.kotlinmania.libc.LocaleT) {
    FuchsiaModRawLibc.freelocale(loc)
}

public actual fun newlocale(mask: CInt, locale: String?, base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    FuchsiaModRawLibc.newlocale(mask, locale, base)

public actual fun uselocale(loc: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    FuchsiaModRawLibc.uselocale(loc)

public actual fun fdopendir(fd: CInt): DIR? =
    FuchsiaModRawLibc.fdopendir(fd)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    FuchsiaModRawLibc.mknodat(dirfd, pathname, mode, dev)

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: CInt?): CInt =
    FuchsiaModRawLibc.pthreadCondattrGetclock(attr?.toLong() ?: 0L, clockId?.toLong() ?: 0L)

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    FuchsiaModRawLibc.pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)

public actual fun accept4(fd: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, len: UInt?, flg: CInt): CInt =
    FuchsiaModRawLibc.accept4(fd, addr?.toLong() ?: 0L, len?.toLong() ?: 0L, flg)

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    FuchsiaModRawLibc.ptsnameR(fd, buf?.value ?: 0L, buflen)

public actual fun clearenv(): CInt =
    FuchsiaModRawLibc.clearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt =
    FuchsiaModRawLibc.waitid(idtype, id, infop?.toLong() ?: 0L, options)

public actual fun setreuid(ruid: io.github.kotlinmania.libc.UidT, euid: io.github.kotlinmania.libc.UidT): CInt =
    FuchsiaModRawLibc.setreuid(ruid, euid)

public actual fun setregid(rgid: io.github.kotlinmania.libc.GidT, egid: io.github.kotlinmania.libc.GidT): CInt =
    FuchsiaModRawLibc.setregid(rgid, egid)

public actual fun getresuid(ruid: UInt?, euid: UInt?, suid: UInt?): CInt =
    FuchsiaModRawLibc.getresuid(ruid?.toLong() ?: 0L, euid?.toLong() ?: 0L, suid?.toLong() ?: 0L)

public actual fun getresgid(rgid: UInt?, egid: UInt?, sgid: UInt?): CInt =
    FuchsiaModRawLibc.getresgid(rgid?.toLong() ?: 0L, egid?.toLong() ?: 0L, sgid?.toLong() ?: 0L)

public actual fun acct(filename: String?): CInt =
    FuchsiaModRawLibc.acct(filename)

public actual fun brk(addr: COpaquePointer?): CInt =
    FuchsiaModRawLibc.brk(addr?.value ?: 0L)

public actual fun setresgid(rgid: io.github.kotlinmania.libc.GidT, egid: io.github.kotlinmania.libc.GidT, sgid: io.github.kotlinmania.libc.GidT): CInt =
    FuchsiaModRawLibc.setresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: io.github.kotlinmania.libc.UidT, euid: io.github.kotlinmania.libc.UidT, suid: io.github.kotlinmania.libc.UidT): CInt =
    FuchsiaModRawLibc.setresuid(ruid, euid, suid)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: io.github.kotlinmania.libc.Winsize?): CInt =
    FuchsiaModRawLibc.openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    FuchsiaModRawLibc.execvpe(file, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    FuchsiaModRawLibc.fexecve(fd, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun lutimes(file: String?, times: io.github.kotlinmania.libc.Timeval?): CInt =
    FuchsiaModRawLibc.lutimes(file, times?.toLong() ?: 0L)

public actual fun setpwent() {
    FuchsiaModRawLibc.setpwent()
}

public actual fun endpwent() {
    FuchsiaModRawLibc.endpwent()
}

public actual fun getpwent(): Passwd? =
    FuchsiaModRawLibc.getpwent()

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    FuchsiaModRawLibc.shmOpen(name, oflag, mode)

public actual fun shmget(key: io.github.kotlinmania.libc.KeyT, size: SizeT, shmflg: CInt): CInt =
    FuchsiaModRawLibc.shmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    FuchsiaModRawLibc.shmat(shmid, shmaddr?.value ?: 0L, shmflg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    FuchsiaModRawLibc.shmdt(shmaddr?.value ?: 0L)

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: io.github.kotlinmania.libc.ShmidDs?): CInt =
    FuchsiaModRawLibc.shmctl(shmid, cmd, buf?.toLong() ?: 0L)

public actual fun ftok(pathname: String?, projId: CInt): io.github.kotlinmania.libc.KeyT =
    FuchsiaModRawLibc.ftok(pathname, projId)

public actual fun semget(key: io.github.kotlinmania.libc.KeyT, nsems: CInt, semflag: CInt): CInt =
    FuchsiaModRawLibc.semget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: io.github.kotlinmania.libc.Sembuf?, nsops: SizeT): CInt =
    FuchsiaModRawLibc.semop(semid, sops?.toLong() ?: 0L, nsops)

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    FuchsiaModRawLibc.msgctl(msqid, cmd, buf?.toLong() ?: 0L)

public actual fun msgget(key: io.github.kotlinmania.libc.KeyT, msgflg: CInt): CInt =
    FuchsiaModRawLibc.msgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    FuchsiaModRawLibc.msgrcv(msqid, msgp?.value ?: 0L, msgsz, msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    FuchsiaModRawLibc.msgsnd(msqid, msgp?.value ?: 0L, msgsz, msgflg)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    FuchsiaModRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun errnoLocation(): CInt? =
    FuchsiaModRawLibc.errnoLocation()

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    FuchsiaModRawLibc.fallocate(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    FuchsiaModRawLibc.posixFallocate(fd, offset, len)

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    FuchsiaModRawLibc.readahead(fd, offset, count)

public actual fun signalfd(fd: CInt, mask: io.github.kotlinmania.libc.SigsetT?, flags: CInt): CInt =
    FuchsiaModRawLibc.signalfd(fd, mask?.toLong() ?: 0L, flags)

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    FuchsiaModRawLibc.timerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    FuchsiaModRawLibc.timerfdGettime(fd, currValue?.toLong() ?: 0L)

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    FuchsiaModRawLibc.timerfdSettime(fd, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)

public actual fun pwritev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    FuchsiaModRawLibc.pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun preadv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    FuchsiaModRawLibc.preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt =
    FuchsiaModRawLibc.quotactl(cmd, special, id, data?.value ?: 0L)

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    FuchsiaModRawLibc.dup3(oldfd, newfd, flags)

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    FuchsiaModRawLibc.mkostemp(template?.value ?: 0L, flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    FuchsiaModRawLibc.mkostemps(template?.value ?: 0L, suffixlen, flags)

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: io.github.kotlinmania.libc.Timespec?): CInt =
    FuchsiaModRawLibc.sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    FuchsiaModRawLibc.sigwaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: io.github.kotlinmania.libc.LocaleT): COpaquePointer? =
    FuchsiaModRawLibc.nlLanginfoL(item, locale).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    FuchsiaModRawLibc.getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)

public actual fun reboot(howTo: CInt): CInt =
    FuchsiaModRawLibc.reboot(howTo)

public actual fun setfsgid(gid: io.github.kotlinmania.libc.GidT): CInt =
    FuchsiaModRawLibc.setfsgid(gid)

public actual fun setfsuid(uid: io.github.kotlinmania.libc.UidT): CInt =
    FuchsiaModRawLibc.setfsuid(uid)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    FuchsiaModRawLibc.mkfifoat(dirfd, pathname, mode)

public actual fun ifNameindex(): IfNameindex? =
    FuchsiaModRawLibc.ifNameindex()

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    FuchsiaModRawLibc.ifFreenameindex(ptr?.toLong() ?: 0L)
}

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    FuchsiaModRawLibc.syncFileRange(fd, offset, nbytes, flags)

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    FuchsiaModRawLibc.getifaddrs(ifap?.value ?: 0L)

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    FuchsiaModRawLibc.freeifaddrs(ifa?.toLong() ?: 0L)
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    FuchsiaModRawLibc.glob(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    FuchsiaModRawLibc.globfree(pglob?.toLong() ?: 0L)
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    FuchsiaModRawLibc.posixMadvise(addr?.value ?: 0L, len, advice)

public actual fun shmUnlink(name: String?): CInt =
    FuchsiaModRawLibc.shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    FuchsiaModRawLibc.seekdir(dirp?.toLong() ?: 0L, loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    FuchsiaModRawLibc.telldir(dirp?.toLong() ?: 0L)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    FuchsiaModRawLibc.madvise(addr?.value ?: 0L, len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    FuchsiaModRawLibc.msync(addr?.value ?: 0L, len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: UInt?): SsizeT =
    FuchsiaModRawLibc.recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    FuchsiaModRawLibc.mkstemps(template?.value ?: 0L, suffixlen)

public actual fun futimes(fd: CInt, times: io.github.kotlinmania.libc.Timeval?): CInt =
    FuchsiaModRawLibc.futimes(fd, times?.toLong() ?: 0L)

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    FuchsiaModRawLibc.nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    FuchsiaModRawLibc.bind(socket, address?.toLong() ?: 0L, addressLen)

public actual fun writev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT =
    FuchsiaModRawLibc.writev(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun readv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT =
    FuchsiaModRawLibc.readv(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun sendmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    FuchsiaModRawLibc.sendmsg(fd, msg?.toLong() ?: 0L, flags)

public actual fun recvmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    FuchsiaModRawLibc.recvmsg(fd, msg?.toLong() ?: 0L, flags)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    FuchsiaModRawLibc.getdomainname(name?.value ?: 0L, len)

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    FuchsiaModRawLibc.setdomainname(name, len)

public actual fun vhangup(): CInt =
    FuchsiaModRawLibc.vhangup()

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt =
    FuchsiaModRawLibc.sendmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: io.github.kotlinmania.libc.Timespec?): CInt =
    FuchsiaModRawLibc.recvmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)

public actual fun sync() {
    FuchsiaModRawLibc.sync()
}

public actual fun schedGetaffinity(pid: io.github.kotlinmania.libc.PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    FuchsiaModRawLibc.schedGetaffinity(pid, cpusetsize, cpuset?.toLong() ?: 0L)

public actual fun schedSetaffinity(pid: io.github.kotlinmania.libc.PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    FuchsiaModRawLibc.schedSetaffinity(pid, cpusetsize, cpuset?.toLong() ?: 0L)

public actual fun umount(target: String?): CInt =
    FuchsiaModRawLibc.umount(target)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    FuchsiaModRawLibc.schedGetPriorityMax(policy)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    FuchsiaModRawLibc.tee(fdIn, fdOut, len, flags)

public actual fun settimeofday(tv: io.github.kotlinmania.libc.Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    FuchsiaModRawLibc.settimeofday(tv?.toLong() ?: 0L, tz?.toLong() ?: 0L)

public actual fun splice(fdIn: CInt, offIn: CLonglong?, fdOut: CInt, offOut: CLonglong?, len: SizeT, flags: CUint): SsizeT =
    FuchsiaModRawLibc.splice(fdIn, offIn?.toLong() ?: 0L, fdOut, offOut?.toLong() ?: 0L, len, flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    FuchsiaModRawLibc.eventfd(initval, flags)

public actual fun schedRrGetInterval(pid: io.github.kotlinmania.libc.PidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    FuchsiaModRawLibc.schedRrGetInterval(pid, tp?.toLong() ?: 0L)

public actual fun semTimedwait(sem: SemT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    FuchsiaModRawLibc.semTimedwait(sem?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    FuchsiaModRawLibc.semGetvalue(sem?.toLong() ?: 0L, sval?.toLong() ?: 0L)

public actual fun schedSetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    FuchsiaModRawLibc.schedSetparam(pid, param?.toLong() ?: 0L)

public actual fun swapoff(puath: String?): CInt =
    FuchsiaModRawLibc.swapoff(puath)

public actual fun vmsplice(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, nrSegs: SizeT, flags: CUint): SsizeT =
    FuchsiaModRawLibc.vmsplice(fd, iov?.toLong() ?: 0L, nrSegs, flags)

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    FuchsiaModRawLibc.mount(src, target, fstype, flags, data?.value ?: 0L)

public actual fun personality(persona: CUlong): CInt =
    FuchsiaModRawLibc.personality(persona)

public actual fun schedGetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    FuchsiaModRawLibc.schedGetparam(pid, param?.toLong() ?: 0L)

public actual fun ppoll(fds: io.github.kotlinmania.libc.Pollfd?, nfds: NfdsT, timeout: io.github.kotlinmania.libc.Timespec?, sigmask: SigsetT?): CInt =
    FuchsiaModRawLibc.ppoll(fds?.toLong() ?: 0L, nfds, timeout?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    FuchsiaModRawLibc.pthreadMutexTimedlock(lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun schedGetscheduler(pid: io.github.kotlinmania.libc.PidT): CInt =
    FuchsiaModRawLibc.schedGetscheduler(pid)

public actual fun clockNanosleep(clkId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: io.github.kotlinmania.libc.Timespec?, rmtp: io.github.kotlinmania.libc.Timespec?): CInt =
    FuchsiaModRawLibc.clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: ULong?): CInt =
    FuchsiaModRawLibc.pthreadAttrGetguardsize(attr?.toLong() ?: 0L, guardsize?.toLong() ?: 0L)

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: SizeT): CInt =
    FuchsiaModRawLibc.pthreadAttrSetguardsize(attr?.toLong() ?: 0L, guardsize)

public actual fun sethostname(name: String?, len: SizeT): CInt =
    FuchsiaModRawLibc.sethostname(name, len)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    FuchsiaModRawLibc.schedGetPriorityMin(policy)

public actual fun umount2(target: String?, flags: CInt): CInt =
    FuchsiaModRawLibc.umount2(target, flags)

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    FuchsiaModRawLibc.swapon(path, swapflags)

public actual fun schedSetscheduler(pid: io.github.kotlinmania.libc.PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    FuchsiaModRawLibc.schedSetscheduler(pid, policy, param?.toLong() ?: 0L)

public actual fun sigsuspend(mask: io.github.kotlinmania.libc.SigsetT?): CInt =
    FuchsiaModRawLibc.sigsuspend(mask?.toLong() ?: 0L)

public actual fun getgrgidR(gid: io.github.kotlinmania.libc.GidT, grp: io.github.kotlinmania.libc.Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    FuchsiaModRawLibc.getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    FuchsiaModRawLibc.sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)

public actual fun semClose(sem: SemT?): CInt =
    FuchsiaModRawLibc.semClose(sem?.toLong() ?: 0L)

public actual fun getdtablesize(): CInt =
    FuchsiaModRawLibc.getdtablesize()

public actual fun getgrnamR(name: String?, grp: io.github.kotlinmania.libc.Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    FuchsiaModRawLibc.getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun initgroups(user: String?, group: io.github.kotlinmania.libc.GidT): CInt =
    FuchsiaModRawLibc.initgroups(user, group)

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    FuchsiaModRawLibc.pthreadSigmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)

public actual fun getgrnam(name: String?): io.github.kotlinmania.libc.Group? =
    FuchsiaModRawLibc.getgrnam(name)

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    FuchsiaModRawLibc.pthreadCancel(thread)

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    FuchsiaModRawLibc.pthreadKill(thread, sig)

public actual fun semUnlink(name: String?): CInt =
    FuchsiaModRawLibc.semUnlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    FuchsiaModRawLibc.daemon(nochdir, noclose)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    FuchsiaModRawLibc.getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getpwuidR(uid: io.github.kotlinmania.libc.UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    FuchsiaModRawLibc.getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    FuchsiaModRawLibc.sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    FuchsiaModRawLibc.pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)

public actual fun getgrgid(gid: io.github.kotlinmania.libc.GidT): io.github.kotlinmania.libc.Group? =
    FuchsiaModRawLibc.getgrgid(gid)

public actual fun setgrent() {
    FuchsiaModRawLibc.setgrent()
}

public actual fun endgrent() {
    FuchsiaModRawLibc.endgrent()
}

public actual fun getgrent(): io.github.kotlinmania.libc.Group? =
    FuchsiaModRawLibc.getgrent()

public actual fun getgrouplist(user: String?, group: io.github.kotlinmania.libc.GidT, groups: UInt?, ngroups: CInt?): CInt =
    FuchsiaModRawLibc.getgrouplist(user, group, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)

public actual fun popen(command: String?, mode: String?): FILE? =
    FuchsiaModRawLibc.popen(command, mode)

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    FuchsiaModRawLibc.faccessat(dirfd, pathname, mode, flags)

public actual fun pthreadCreate(native: CUlong?, attr: io.github.kotlinmania.libc.PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    FuchsiaModRawLibc.pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    FuchsiaModRawLibc.dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)
