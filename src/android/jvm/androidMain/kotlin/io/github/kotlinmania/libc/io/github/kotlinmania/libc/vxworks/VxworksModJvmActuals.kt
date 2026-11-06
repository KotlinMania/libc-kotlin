package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.COpaquePointer

internal object VxworksModRawLibc {
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
    external fun cfgetospeed(termios: Long): Long
    external fun cfmakeraw(termios: Long): Int
    external fun cfsetispeed(termios: Long, speed: Long): Int
    external fun cfsetospeed(termios: Long, speed: Long): Int
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
    external fun strcasecmp(s1: String?, s2: String?): Int
    external fun strncasecmp(s1: String?, s2: String?, n: Long): Int
    external fun strlen(cs: String?): Long
    external fun strnlen(cs: String?, n: Long): Long
    external fun strerror(n: Int): Long?
    external fun strtok(s: Long, t: String?): Long?
    external fun strxfrm(s: Long, ct: String?, n: Long): Long
    external fun wcslen(buf: Long): Long
    external fun wcstombs(dest: Long, src: Long, n: Long): Long
    external fun memchr(cx: Long, c: Int, n: Long): Long?
    external fun wmemchr(cx: Long, c: Int, n: Long): Long?
    external fun memcmp(cx: Long, ct: Long, n: Long): Int
    external fun memcpy(dest: Long, src: Long, n: Long): Long?
    external fun memccpy(dest: Long, src: Long, c: Int, n: Long): Long?
    external fun memmove(dest: Long, src: Long, n: Long): Long?
    external fun memset(dest: Long, c: Int, n: Long): Long?
    external fun alignedAlloc(alignment: Long, size: Long): Long?
    external fun uname(buf: Long): Int
    external fun times(buf: Long): Long
    external fun tcflush(fd: Int, action: Int): Int
    external fun pclose(stream: Long): Int
    external fun mkdtemp(template: Long): Long?
    external fun linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int
    external fun unlinkat(dirfd: Int, pathname: String?, flags: Int): Int
    external fun getprotobyname(name: String?): Long?
    external fun getprotobynumber(proto: Int): Long?
    external fun getservbyname(name: String?, proto: String?): Long?
    external fun fchownat(dirfd: Int, pathname: String?, owner: Long, group: Long, flags: Int): Int
    external fun getcharUnlocked(): Int
    external fun putcharUnlocked(c: Int): Int
    external fun stat(path: String?, buf: Long): Int
    external fun fdopen(fd: Int, mode: String?): Long?
    external fun fileno(stream: Long): Int
    external fun creat(path: String?, mode: Int): Int
    external fun rewinddir(dirp: Long)
    external fun fchown(fd: Int, owner: Long, group: Long): Int
    external fun access(path: String?, amode: Int): Int
    external fun alarm(seconds: Int): Int
    external fun fchdir(dirfd: Int): Int
    external fun chown(path: String?, uid: Int, gid: Int): Int
    external fun fpathconf(filedes: Int, name: Int): Long
    external fun getegid(): Int
    external fun geteuid(): Int
    external fun getgroups(ngroupsMax: Int, groups: Long): Int
    external fun getlogin(): Long?
    external fun getopt(argc: Int, argv: Long, optstr: String?): Int
    external fun pathconf(path: String?, name: Int): Long
    external fun pause(): Int
    external fun seteuid(uid: Int): Int
    external fun setegid(gid: Int): Int
    external fun sleep(secs: Int): Int
    external fun ttyname(fd: Int): Long?
    external fun wait(status: Long): Int
    external fun umask(mask: Int): Int
    external fun mlock(addr: Long, len: Long): Int
    external fun mlockall(flags: Int): Int
    external fun munlock(addr: Long, len: Long): Int
    external fun munlockall(): Int
    external fun mmap(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long?
    external fun munmap(addr: Long, len: Long): Int
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun msync(addr: Long, len: Long, flags: Int): Int
    external fun truncate(path: String?, length: Long): Int
    external fun shmOpen(name: String?, oflag: Int, mode: Int): Int
    external fun shmUnlink(name: String?): Int
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun pthreadExit(value: Long): Long
    external fun pthreadAttrSetdetachstate(attr: Long, state: Int): Int
    external fun pthreadEqual(t1: Long, t2: Long): Int
    external fun strerrorR(errnum: Int, buf: Long, buflen: Long): Int
    external fun sigaddset(set: Long, signum: Int): Int
    external fun sigaction(signum: Int, act: Long, oldact: Long): Int
    external fun utimes(filename: String?, times: Long): Int
    external fun futimens(fd: Int, times: Long): Int
    external fun utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int
    external fun dlopen(filename: String?, flag: Int): Long?
    external fun dlerror(): Long?
    external fun dlsym(handle: Long, symbol: String?): Long?
    external fun dlclose(handle: Long): Int
    external fun dladdr(addr: Long, info: Long): Int
    external fun gmtimeR(timeP: Long, result: Long): Long?
    external fun localtimeR(timeP: Long, result: Long): Long?
    external fun mktime(tm: Long): Long
    external fun time(time: Long): Long
    external fun gmtime(timeP: Long): Long?
    external fun localtime(timeP: Long): Long?
    external fun timegm(tm: Long): Long
    external fun difftime(time1: Long, time0: Long): Double
    external fun gethostname(name: Long, len: Long): Int
    external fun usleep(secs: Long): Int
    external fun putenv(string: Long): Int
    external fun setlocale(category: Int, locale: String?): Long?
    external fun localeconv(): Long?
    external fun sigprocmask(how: Int, set: Long, oldset: Long): Int
    external fun sigpending(set: Long): Int
    external fun mkfifo(path: String?, mode: Int): Int
    external fun fseeko(stream: Long, offset: Long, whence: Int): Int
    external fun ftello(stream: Long): Long
    external fun mkstemp(template: Long): Int
    external fun tmpnam(ptr: Long): Long?
    external fun openlog(ident: String?, logopt: Int, facility: Int)
    external fun closelog()
    external fun setlogmask(maskpri: Int): Int
    external fun getline(lineptr: Long, n: Long, stream: Long): Long
    external fun tcsetattr(fd: Int, optionalActions: Int, termios: Long): Int
    external fun tcgetattr(fd: Int, termios: Long): Int
    external fun tcsendbreak(fd: Int, duration: Int): Int
    external fun confstr(name: Int, buf: Long, len: Long): Long
    external fun fnmatch(pattern: String?, name: String?, flags: Int): Int
    external fun symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int
    external fun fchmodat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int
    external fun utime(file: String?, buf: Long): Int
    external fun memalign(blockSize: Long, sizeArg: Long): Long?
    external fun getcwd(buf: Long, size: Long): Long?
    external fun chdir(attr: String?): Int
    external fun pthreadMutexattrInit(attr: Long): Int
    external fun pthreadMutexattrDestroy(attr: Long): Int
    external fun pthreadMutexattrSettype(pAttr: Long, pType: Int): Int
    external fun pthreadMutexInit(mutex: Long, attr: Long): Int
    external fun pthreadMutexDestroy(mutex: Long): Int
    external fun pthreadMutexLock(mutex: Long): Int
    external fun pthreadMutexTrylock(mutex: Long): Int
    external fun pthreadMutexTimedlock(attr: Long, spec: Long): Int
    external fun pthreadMutexUnlock(mutex: Long): Int
    external fun pthreadAttrSetname(pAttr: Long, name: Long): Int
    external fun pthreadAttrSetstacksize(attr: Long, stacksize: Long): Int
    external fun pthreadAttrGetstacksize(attr: Long, size: Long): Int
    external fun pthreadAttrInit(attr: Long): Int
    external fun pthreadCreate(pThread: Long, pAttr: Long, startRoutine: Long, value: Long): Int
    external fun pthreadSetschedparam(native: Long, policy: Int, param: Long): Int
    external fun pthreadGetschedparam(native: Long, policy: Long, param: Long): Int
    external fun pthreadAttrSetinheritsched(attr: Long, inheritsched: Int): Int
    external fun pthreadAttrSetschedpolicy(attr: Long, policy: Int): Int
    external fun pthreadAttrDestroy(thread: Long): Int
    external fun pthreadDetach(thread: Long): Int
    external fun pthreadAtfork(prepare: Long, parent: Long, child: Long): Int
    external fun fstat(fildes: Int, buf: Long): Int
    external fun lstat(path: String?, buf: Long): Int
    external fun ftruncate(fd: Int, length: Long): Int
    external fun readdirR(pDir: Long, entry: Long, result: Long): Int
    external fun readdir(pDir: Long): Long?
    external fun poll(fds: Long, nfds: Long, timeout: Int): Int
    external fun pthreadCondattrInit(attr: Long): Int
    external fun pthreadCondattrDestroy(attr: Long): Int
    external fun pthreadCondattrGetclock(pAttr: Long, pClockId: Long): Int
    external fun pthreadCondattrSetclock(pAttr: Long, clockId: Long): Int
    external fun pthreadCondInit(cond: Long, attr: Long): Int
    external fun pthreadCondDestroy(cond: Long): Int
    external fun pthreadCondSignal(cond: Long): Int
    external fun pthreadCondBroadcast(cond: Long): Int
    external fun pthreadCondWait(cond: Long, mutex: Long): Int
    external fun pthreadRwlockattrInit(attr: Long): Int
    external fun pthreadRwlockattrDestroy(attr: Long): Int
    external fun pthreadRwlockattrSetmaxreaders(attr: Long, attr2: Int): Int
    external fun pthreadRwlockInit(attr: Long, host: Long): Int
    external fun pthreadRwlockDestroy(attr: Long): Int
    external fun pthreadRwlockRdlock(attr: Long): Int
    external fun pthreadRwlockTryrdlock(attr: Long): Int
    external fun pthreadRwlockTimedrdlock(attr: Long, host: Long): Int
    external fun pthreadRwlockWrlock(attr: Long): Int
    external fun pthreadRwlockTrywrlock(attr: Long): Int
    external fun pthreadRwlockTimedwrlock(attr: Long, host: Long): Int
    external fun pthreadRwlockUnlock(attr: Long): Int
    external fun pthreadKeyCreate(key: Long, dtor: Long): Int
    external fun pthreadKeyDelete(key: Long): Int
    external fun pthreadSetspecific(key: Long, value: Long): Int
    external fun pthreadGetspecific(key: Long): Long?
    external fun pthreadCondTimedwait(cond: Long, mutex: Long, abstime: Long): Int
    external fun pthreadAttrGetname(attr: Long, name: Long): Int
    external fun pthreadJoin(thread: Long, status: Long): Int
    external fun pthreadSelf(): Long
    external fun clockGettime(clockId: Long, tp: Long): Int
    external fun clockSettime(clockId: Long, tp: Long): Int
    external fun clockGetres(clockId: Long, res: Long): Int
    external fun clockNanosleep(clockId: Long, flags: Int, rqtp: Long, rmtp: Long): Int
    external fun nanosleep(rqtp: Long, rmtp: Long): Int
    external fun accept(s: Int, addr: Long, addrlen: Long): Int
    external fun bind(fd: Int, addr: Long, len: Int): Int
    external fun connect(s: Int, name: Long, namelen: Long): Int
    external fun getpeername(s: Int, name: Long, namelen: Long): Int
    external fun getsockname(socket: Int, address: Long, addressLen: Long): Int
    external fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Long): Int
    external fun listen(socket: Int, backlog: Int): Int
    external fun recv(s: Int, buf: Long, bufLen: Long, flags: Int): Long
    external fun recvfrom(s: Int, buf: Long, bufLen: Long, flags: Int, from: Long, pFromLen: Long): Long
    external fun recvmsg(socket: Int, mp: Long, flags: Int): Long
    external fun send(socket: Int, buf: Long, len: Long, flags: Int): Long
    external fun sendmsg(socket: Int, mp: Long, flags: Int): Long
    external fun sendto(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Int): Long
    external fun setsockopt(socket: Int, level: Int, name: Int, value: Long, optionLen: Int): Int
    external fun shutdown(s: Int, how: Int): Int
    external fun socket(domain: Int, type: Int, protocol: Int): Int
    external fun gaiStrerror(errcode: Int): Long?
    external fun close(fd: Int): Int
    external fun read(fd: Int, buf: Long, count: Long): Long
    external fun write(fd: Int, buf: Long, count: Long): Long
    external fun isatty(fd: Int): Int
    external fun dup(src: Int): Int
    external fun dup2(src: Int, dst: Int): Int
    external fun pipe(fds: Long): Int
    external fun unlink(pathname: String?): Int
    external fun lseek(fd: Int, offset: Long, whence: Int): Long
    external fun getaddrinfo(node: String?, service: String?, hints: Long, res: Long): Int
    external fun freeaddrinfo(res: Long)
    external fun signal(signum: Int, handler: Long): Long
    external fun getpid(): Int
    external fun getppid(): Int
    external fun setpgid(pid: Int, pgid: Int): Int
    external fun waitpid(pid: Int, status: Long, options: Int): Int
    external fun sysconf(attr: Int): Long
    external fun setenv(envVarName: String?, envVarValue: String?, overwrite: Int): Int
    external fun unsetenv(envVarName: String?): Int
    external fun realpath(fileName: String?, resolvedName: Long): Long?
    external fun link(src: String?, dst: String?): Int
    external fun readlink(path: String?, buf: Long, bufsize: Long): Long
    external fun symlink(path1: String?, path2: String?): Int
    external fun opendir(name: String?): Long?
    external fun rmdir(path: String?): Int
    external fun mkdir(dirName: String?, mode: Int): Int
    external fun chmod(path: String?, mode: Int): Int
    external fun fchmod(attr1: Int, attr2: Int): Int
    external fun fsync(fd: Int): Int
    external fun closedir(ptr: Long): Int
    external fun schedGetPriorityMax(policy: Int): Int
    external fun schedGetPriorityMin(policy: Int): Int
    external fun schedSetparam(pid: Long, param: Long): Int
    external fun schedGetparam(pid: Long, param: Long): Int
    external fun schedSetscheduler(pid: Long, policy: Int, param: Long): Int
    external fun schedGetscheduler(pid: Long): Int
    external fun schedRrGetInterval(pid: Long, tp: Long): Int
    external fun schedYield(): Int
    external fun errnoSet(err: Int): Int
    external fun errnoGet(): Int
    external fun setgid(gid: Long): Int
    external fun getgid(): Long
    external fun setuid(uid: Long): Int
    external fun getuid(): Long
    external fun sigemptyset(set: Long): Int
    external fun sigfillset(set: Long): Int
    external fun sigdelset(set: Long, signum: Int): Int
    external fun sigismember(set: Long, signum: Int): Int
    external fun pthreadSigmask(how: Int, set: Long, oset: Long): Int
    external fun kill(pid: Int, signo: Int): Int
    external fun sigqueue(pid: Int, signo: Int, value: Long): Int
    external fun taskKill(taskId: Long, signo: Int): Int
    external fun raise(signo: Int): Int
    external fun taskIdSelf(): Long
    external fun taskDelay(ticks: Long): Int
    external fun taskNameSet(taskId: Long, taskName: Long): Int
    external fun taskNameGet(taskId: Long, bufName: Long, bufsize: Long): Int
    external fun rtpInfoGet(rtpId: Long, rtpStruct: Long): Int
    external fun rtpSpawn(pubrtpFileName: String?, argv: Long, envp: Long, priority: Int, uStackSize: Long, options: Int, taskOptions: Int): Long
    external fun pathIsAbsolute(filepath: String?, pNameTail: Long): Long
    external fun writev(fd: Int, iov: Long, iovcnt: Int): Long
    external fun readv(fd: Int, iov: Long, iovcnt: Int): Long
    external fun randBytes(buf: Long, length: Int): Int
    external fun randABytes(buf: Long, length: Int): Int
    external fun randUBytes(buf: Long, length: Int): Int
    external fun randSecure(): Int
    external fun mqClose(mqd: Long): Int
    external fun mqUnlink(name: String?): Int
    external fun mqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long
    external fun mqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long
    external fun mqSend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int): Int
    external fun mqTimedsend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int, absTimeout: Long): Int
    external fun mqGetattr(mqd: Long, attr: Long): Int
    external fun mqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int
    external fun vxCpuEnabledGet(): Long
    external fun vxCpuConfiguredGet(): Long
}

public actual fun isalnum(c: CInt): CInt =
    VxworksModRawLibc.isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    VxworksModRawLibc.isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    VxworksModRawLibc.iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    VxworksModRawLibc.isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    VxworksModRawLibc.isgraph(c)

public actual fun islower(c: CInt): CInt =
    VxworksModRawLibc.islower(c)

public actual fun isprint(c: CInt): CInt =
    VxworksModRawLibc.isprint(c)

public actual fun ispunct(c: CInt): CInt =
    VxworksModRawLibc.ispunct(c)

public actual fun isspace(c: CInt): CInt =
    VxworksModRawLibc.isspace(c)

public actual fun isupper(c: CInt): CInt =
    VxworksModRawLibc.isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    VxworksModRawLibc.isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    VxworksModRawLibc.isblank(c)

public actual fun tolower(c: CInt): CInt =
    VxworksModRawLibc.tolower(c)

public actual fun toupper(c: CInt): CInt =
    VxworksModRawLibc.toupper(c)

public actual fun fopen(filename: String?, mode: String?): FILE? =
    VxworksModRawLibc.fopen(filename, mode)

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    VxworksModRawLibc.freopen(filename, mode, file?.toLong() ?: 0L)

public actual fun fflush(file: FILE?): CInt =
    VxworksModRawLibc.fflush(file?.toLong() ?: 0L)

public actual fun fclose(file: FILE?): CInt =
    VxworksModRawLibc.fclose(file?.toLong() ?: 0L)

public actual fun remove(filename: String?): CInt =
    VxworksModRawLibc.remove(filename)

public actual fun rename(oldname: String?, newname: String?): CInt =
    VxworksModRawLibc.rename(oldname, newname)

public actual fun tmpfile(): FILE? =
    VxworksModRawLibc.tmpfile()

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    VxworksModRawLibc.setvbuf(stream?.toLong() ?: 0L, buffer?.value ?: 0L, mode, size)

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    VxworksModRawLibc.setbuf(stream?.toLong() ?: 0L, buf?.value ?: 0L)
}

public actual fun getchar(): CInt =
    VxworksModRawLibc.getchar()

public actual fun putchar(c: CInt): CInt =
    VxworksModRawLibc.putchar(c)

public actual fun fgetc(stream: FILE?): CInt =
    VxworksModRawLibc.fgetc(stream?.toLong() ?: 0L)

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    VxworksModRawLibc.fgets(buf?.value ?: 0L, n, stream?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    VxworksModRawLibc.fputc(c, stream?.toLong() ?: 0L)

public actual fun fputs(s: String?, stream: FILE?): CInt =
    VxworksModRawLibc.fputs(s, stream?.toLong() ?: 0L)

public actual fun puts(s: String?): CInt =
    VxworksModRawLibc.puts(s)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    VxworksModRawLibc.ungetc(c, stream?.toLong() ?: 0L)

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    VxworksModRawLibc.fread(ptr?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    VxworksModRawLibc.fwrite(ptr?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    VxworksModRawLibc.fseek(stream?.toLong() ?: 0L, offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    VxworksModRawLibc.ftell(stream?.toLong() ?: 0L)

public actual fun rewind(stream: FILE?) {
    VxworksModRawLibc.rewind(stream?.toLong() ?: 0L)
}

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    VxworksModRawLibc.fgetpos(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    VxworksModRawLibc.fsetpos(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)

public actual fun feof(stream: FILE?): CInt =
    VxworksModRawLibc.feof(stream?.toLong() ?: 0L)

public actual fun ferror(stream: FILE?): CInt =
    VxworksModRawLibc.ferror(stream?.toLong() ?: 0L)

public actual fun perror(s: String?) {
    VxworksModRawLibc.perror(s)
}

public actual fun atof(s: String?): CDouble =
    VxworksModRawLibc.atof(s)

public actual fun atoi(s: String?): CInt =
    VxworksModRawLibc.atoi(s)

public actual fun atol(s: String?): CLong =
    VxworksModRawLibc.atol(s)

public actual fun atoll(s: String?): CLonglong =
    VxworksModRawLibc.atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    VxworksModRawLibc.strtod(s, endp?.value ?: 0L)

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    VxworksModRawLibc.strtof(s, endp?.value ?: 0L)

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    VxworksModRawLibc.strtol(s, endp?.value ?: 0L, base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    VxworksModRawLibc.strtoll(s, endp?.value ?: 0L, base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    VxworksModRawLibc.strtoul(s, endp?.value ?: 0L, base)

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    VxworksModRawLibc.strtoull(s, endp?.value ?: 0L, base)

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    VxworksModRawLibc.calloc(nobj, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    VxworksModRawLibc.malloc(size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    VxworksModRawLibc.realloc(p?.value ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(p: COpaquePointer?) {
    VxworksModRawLibc.free(p?.value ?: 0L)
}

public actual fun abort(): Nothing =
    VxworksModRawLibc.abort()

public actual fun exit(status: CInt): Nothing =
    VxworksModRawLibc.exit(status)

public actual fun atexit(cb: AtexitCbCallback): CInt =
    VxworksModRawLibc.atexit(cb)

public actual fun system(s: String?): CInt =
    VxworksModRawLibc.system(s)

public actual fun getenv(s: String?): COpaquePointer? =
    VxworksModRawLibc.getenv(s).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cfgetospeed(termios: io.github.kotlinmania.libc.Termios?): io.github.kotlinmania.libc.SpeedT =
    VxworksModRawLibc.cfgetospeed(termios?.toLong() ?: 0L)

public actual fun cfmakeraw(termios: io.github.kotlinmania.libc.Termios?): CInt =
    VxworksModRawLibc.cfmakeraw(termios?.toLong() ?: 0L)

public actual fun cfsetispeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt =
    VxworksModRawLibc.cfsetispeed(termios?.toLong() ?: 0L, speed)

public actual fun cfsetospeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt =
    VxworksModRawLibc.cfsetospeed(termios?.toLong() ?: 0L, speed)

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    VxworksModRawLibc.strcpy(dst?.value ?: 0L, src).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    VxworksModRawLibc.strncpy(dst?.value ?: 0L, src, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    VxworksModRawLibc.strcat(s?.value ?: 0L, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    VxworksModRawLibc.strncat(s?.value ?: 0L, ct, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    VxworksModRawLibc.strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    VxworksModRawLibc.strncmp(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): CInt =
    VxworksModRawLibc.strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    VxworksModRawLibc.strchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    VxworksModRawLibc.strrchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    VxworksModRawLibc.strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    VxworksModRawLibc.strcspn(cs, ct)

public actual fun strdup(cs: String?): COpaquePointer? =
    VxworksModRawLibc.strdup(cs).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    VxworksModRawLibc.strpbrk(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    VxworksModRawLibc.strstr(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    VxworksModRawLibc.strcasecmp(s1, s2)

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    VxworksModRawLibc.strncasecmp(s1, s2, n)

public actual fun strlen(cs: String?): SizeT =
    VxworksModRawLibc.strlen(cs)

public actual fun strnlen(cs: String?, n: SizeT): SizeT =
    VxworksModRawLibc.strnlen(cs, n)

public actual fun strerror(n: CInt): COpaquePointer? =
    VxworksModRawLibc.strerror(n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    VxworksModRawLibc.strtok(s?.value ?: 0L, t).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    VxworksModRawLibc.strxfrm(s?.value ?: 0L, ct, n)

public actual fun wcslen(buf: WcharT?): SizeT =
    VxworksModRawLibc.wcslen(buf?.toLong() ?: 0L)

public actual fun wcstombs(dest: COpaquePointer?, src: WcharT?, n: SizeT): SizeT =
    VxworksModRawLibc.wcstombs(dest?.value ?: 0L, src?.toLong() ?: 0L, n)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    VxworksModRawLibc.memchr(cx?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: SizeT): WcharT? =
    VxworksModRawLibc.wmemchr(cx?.toLong() ?: 0L, c, n)

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    VxworksModRawLibc.memcmp(cx?.value ?: 0L, ct?.value ?: 0L, n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    VxworksModRawLibc.memcpy(dest?.value ?: 0L, src?.value ?: 0L, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    VxworksModRawLibc.memccpy(dest?.value ?: 0L, src?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    VxworksModRawLibc.memmove(dest?.value ?: 0L, src?.value ?: 0L, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    VxworksModRawLibc.memset(dest?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    VxworksModRawLibc.alignedAlloc(alignment, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    VxworksModRawLibc.uname(buf?.toLong() ?: 0L)

public actual fun times(buf: io.github.kotlinmania.libc.Tms?): io.github.kotlinmania.libc.ClockT =
    VxworksModRawLibc.times(buf?.toLong() ?: 0L)

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    VxworksModRawLibc.tcflush(fd, action)

public actual fun pclose(stream: FILE?): CInt =
    VxworksModRawLibc.pclose(stream?.toLong() ?: 0L)

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    VxworksModRawLibc.mkdtemp(template?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    VxworksModRawLibc.linkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    VxworksModRawLibc.unlinkat(dirfd, pathname, flags)

public actual fun getprotobyname(name: String?): Protoent? =
    VxworksModRawLibc.getprotobyname(name)

public actual fun getprotobynumber(proto: CInt): Protoent? =
    VxworksModRawLibc.getprotobynumber(proto)

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    VxworksModRawLibc.getservbyname(name, proto)

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT, flags: CInt): CInt =
    VxworksModRawLibc.fchownat(dirfd, pathname, owner, group, flags)

public actual fun getcharUnlocked(): CInt =
    VxworksModRawLibc.getcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    VxworksModRawLibc.putcharUnlocked(c)

public actual fun stat(path: String?, buf: Stat?): CInt =
    VxworksModRawLibc.stat(path, buf?.toLong() ?: 0L)

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    VxworksModRawLibc.fdopen(fd, mode)

public actual fun fileno(stream: FILE?): CInt =
    VxworksModRawLibc.fileno(stream?.toLong() ?: 0L)

public actual fun creat(path: String?, mode: ModeT): CInt =
    VxworksModRawLibc.creat(path, mode)

public actual fun rewinddir(dirp: DIR?) {
    VxworksModRawLibc.rewinddir(dirp?.toLong() ?: 0L)
}

public actual fun fchown(fd: CInt, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT): CInt =
    VxworksModRawLibc.fchown(fd, owner, group)

public actual fun access(path: String?, amode: CInt): CInt =
    VxworksModRawLibc.access(path, amode)

public actual fun alarm(seconds: CUint): CUint =
    VxworksModRawLibc.alarm(seconds)

public actual fun fchdir(dirfd: CInt): CInt =
    VxworksModRawLibc.fchdir(dirfd)

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    VxworksModRawLibc.chown(path, uid, gid)

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    VxworksModRawLibc.fpathconf(filedes, name)

public actual fun getegid(): GidT =
    VxworksModRawLibc.getegid()

public actual fun geteuid(): UidT =
    VxworksModRawLibc.geteuid()

public actual fun getgroups(ngroupsMax: CInt, groups: CUshort?): CInt =
    VxworksModRawLibc.getgroups(ngroupsMax, groups?.toLong() ?: 0L)

public actual fun getlogin(): COpaquePointer? =
    VxworksModRawLibc.getlogin().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    VxworksModRawLibc.getopt(argc, argv?.value ?: 0L, optstr)

public actual fun pathconf(path: String?, name: CInt): CLong =
    VxworksModRawLibc.pathconf(path, name)

public actual fun pause(): CInt =
    VxworksModRawLibc.pause()

public actual fun seteuid(uid: UidT): CInt =
    VxworksModRawLibc.seteuid(uid)

public actual fun setegid(gid: GidT): CInt =
    VxworksModRawLibc.setegid(gid)

public actual fun sleep(secs: CUint): CUint =
    VxworksModRawLibc.sleep(secs)

public actual fun ttyname(fd: CInt): COpaquePointer? =
    VxworksModRawLibc.ttyname(fd).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wait(status: CInt?): PidT =
    VxworksModRawLibc.wait(status?.toLong() ?: 0L)

public actual fun umask(mask: ModeT): ModeT =
    VxworksModRawLibc.umask(mask)

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    VxworksModRawLibc.mlock(addr?.value ?: 0L, len)

public actual fun mlockall(flags: CInt): CInt =
    VxworksModRawLibc.mlockall(flags)

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    VxworksModRawLibc.munlock(addr?.value ?: 0L, len)

public actual fun munlockall(): CInt =
    VxworksModRawLibc.munlockall()

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    VxworksModRawLibc.mmap(addr?.value ?: 0L, len, prot, flags, fd, offset).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    VxworksModRawLibc.munmap(addr?.value ?: 0L, len)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    VxworksModRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    VxworksModRawLibc.msync(addr?.value ?: 0L, len, flags)

public actual fun truncate(path: String?, length: OffT): CInt =
    VxworksModRawLibc.truncate(path, length)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    VxworksModRawLibc.shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    VxworksModRawLibc.shmUnlink(name)

public actual fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: COpaquePointer?): CInt =
    VxworksModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)

public actual fun pthreadExit(value: COpaquePointer?): Nothing =
    VxworksModRawLibc.pthreadExit(value?.value ?: 0L)

public actual fun pthreadAttrSetdetachstate(attr: io.github.kotlinmania.libc.PthreadAttrT?, state: CInt): CInt =
    VxworksModRawLibc.pthreadAttrSetdetachstate(attr?.toLong() ?: 0L, state)

public actual fun pthreadEqual(t1: io.github.kotlinmania.libc.PthreadT, t2: io.github.kotlinmania.libc.PthreadT): CInt =
    VxworksModRawLibc.pthreadEqual(t1, t2)

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    VxworksModRawLibc.strerrorR(errnum, buf?.value ?: 0L, buflen)

public actual fun sigaddset(set: CUlonglong?, signum: CInt): CInt =
    VxworksModRawLibc.sigaddset(set?.toLong() ?: 0L, signum)

public actual fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt =
    VxworksModRawLibc.sigaction(signum, act?.toLong() ?: 0L, oldact?.toLong() ?: 0L)

public actual fun utimes(filename: String?, times: io.github.kotlinmania.libc.Timeval?): CInt =
    VxworksModRawLibc.utimes(filename, times?.toLong() ?: 0L)

public actual fun futimens(fd: CInt, times: io.github.kotlinmania.libc.Timespec?): CInt =
    VxworksModRawLibc.futimens(fd, times?.toLong() ?: 0L)

public actual fun utimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flag: CInt): CInt =
    VxworksModRawLibc.utimensat(dirfd, path, times?.toLong() ?: 0L, flag)

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    VxworksModRawLibc.dlopen(filename, flag).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlerror(): COpaquePointer? =
    VxworksModRawLibc.dlerror().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    VxworksModRawLibc.dlsym(handle?.value ?: 0L, symbol).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlclose(handle: COpaquePointer?): CInt =
    VxworksModRawLibc.dlclose(handle?.value ?: 0L)

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt =
    VxworksModRawLibc.dladdr(addr?.value ?: 0L, info?.toLong() ?: 0L)

public actual fun gmtimeR(timeP: CLonglong?, result: Tm?): Tm? =
    VxworksModRawLibc.gmtimeR(timeP?.toLong() ?: 0L, result?.toLong() ?: 0L)

public actual fun localtimeR(timeP: CLonglong?, result: Tm?): Tm? =
    VxworksModRawLibc.localtimeR(timeP?.toLong() ?: 0L, result?.toLong() ?: 0L)

public actual fun mktime(tm: Tm?): TimeT =
    VxworksModRawLibc.mktime(tm?.toLong() ?: 0L)

public actual fun time(time: CLonglong?): TimeT =
    VxworksModRawLibc.time(time?.toLong() ?: 0L)

public actual fun gmtime(timeP: CLonglong?): Tm? =
    VxworksModRawLibc.gmtime(timeP?.toLong() ?: 0L)

public actual fun localtime(timeP: CLonglong?): Tm? =
    VxworksModRawLibc.localtime(timeP?.toLong() ?: 0L)

public actual fun timegm(tm: Tm?): TimeT =
    VxworksModRawLibc.timegm(tm?.toLong() ?: 0L)

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    VxworksModRawLibc.difftime(time1, time0)

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    VxworksModRawLibc.gethostname(name?.value ?: 0L, len)

public actual fun usleep(secs: io.github.kotlinmania.libc.UsecondsT): CInt =
    VxworksModRawLibc.usleep(secs)

public actual fun putenv(string: COpaquePointer?): CInt =
    VxworksModRawLibc.putenv(string?.value ?: 0L)

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    VxworksModRawLibc.setlocale(category, locale).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localeconv(): Lconv? =
    VxworksModRawLibc.localeconv()

public actual fun sigprocmask(how: CInt, set: CUlonglong?, oldset: CUlonglong?): CInt =
    VxworksModRawLibc.sigprocmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)

public actual fun sigpending(set: CUlonglong?): CInt =
    VxworksModRawLibc.sigpending(set?.toLong() ?: 0L)

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    VxworksModRawLibc.mkfifo(path, mode)

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    VxworksModRawLibc.fseeko(stream?.toLong() ?: 0L, offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    VxworksModRawLibc.ftello(stream?.toLong() ?: 0L)

public actual fun mkstemp(template: COpaquePointer?): CInt =
    VxworksModRawLibc.mkstemp(template?.value ?: 0L)

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    VxworksModRawLibc.tmpnam(ptr?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    VxworksModRawLibc.openlog(ident, logopt, facility)
}

public actual fun closelog() {
    VxworksModRawLibc.closelog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    VxworksModRawLibc.setlogmask(maskpri)

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT =
    VxworksModRawLibc.getline(lineptr?.value ?: 0L, n?.toLong() ?: 0L, stream?.toLong() ?: 0L)

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: io.github.kotlinmania.libc.Termios?): CInt =
    VxworksModRawLibc.tcsetattr(fd, optionalActions, termios?.toLong() ?: 0L)

public actual fun tcgetattr(fd: CInt, termios: io.github.kotlinmania.libc.Termios?): CInt =
    VxworksModRawLibc.tcgetattr(fd, termios?.toLong() ?: 0L)

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    VxworksModRawLibc.tcsendbreak(fd, duration)

public actual fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT =
    VxworksModRawLibc.confstr(name, buf?.value ?: 0L, len)

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    VxworksModRawLibc.fnmatch(pattern, name, flags)

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    VxworksModRawLibc.symlinkat(target, newdirfd, linkpath)

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    VxworksModRawLibc.fchmodat(dirfd, pathname, mode, flags)

public actual fun utime(file: String?, buf: Utimbuf?): CInt =
    VxworksModRawLibc.utime(file, buf?.toLong() ?: 0L)

public actual fun memalign(blockSize: SizeT, sizeArg: SizeT): COpaquePointer? =
    VxworksModRawLibc.memalign(blockSize, sizeArg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    VxworksModRawLibc.getcwd(buf?.value ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun chdir(attr: String?): CInt =
    VxworksModRawLibc.chdir(attr)

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    VxworksModRawLibc.pthreadMutexattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    VxworksModRawLibc.pthreadMutexattrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadMutexattrSettype(pAttr: io.github.kotlinmania.libc.PthreadMutexattrT?, pType: CInt): CInt =
    VxworksModRawLibc.pthreadMutexattrSettype(pAttr?.toLong() ?: 0L, pType)

public actual fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    VxworksModRawLibc.pthreadMutexInit(mutex?.toLong() ?: 0L, attr?.toLong() ?: 0L)

public actual fun pthreadMutexDestroy(mutex: PthreadMutexT?): CInt =
    VxworksModRawLibc.pthreadMutexDestroy(mutex?.toLong() ?: 0L)

public actual fun pthreadMutexLock(mutex: PthreadMutexT?): CInt =
    VxworksModRawLibc.pthreadMutexLock(mutex?.toLong() ?: 0L)

public actual fun pthreadMutexTrylock(mutex: PthreadMutexT?): CInt =
    VxworksModRawLibc.pthreadMutexTrylock(mutex?.toLong() ?: 0L)

public actual fun pthreadMutexTimedlock(attr: PthreadMutexT?, spec: Timespec?): CInt =
    VxworksModRawLibc.pthreadMutexTimedlock(attr?.toLong() ?: 0L, spec?.toLong() ?: 0L)

public actual fun pthreadMutexUnlock(mutex: PthreadMutexT?): CInt =
    VxworksModRawLibc.pthreadMutexUnlock(mutex?.toLong() ?: 0L)

public actual fun pthreadAttrSetname(pAttr: io.github.kotlinmania.libc.PthreadAttrT?, name: COpaquePointer?): CInt =
    VxworksModRawLibc.pthreadAttrSetname(pAttr?.toLong() ?: 0L, name?.value ?: 0L)

public actual fun pthreadAttrSetstacksize(attr: io.github.kotlinmania.libc.PthreadAttrT?, stacksize: SizeT): CInt =
    VxworksModRawLibc.pthreadAttrSetstacksize(attr?.toLong() ?: 0L, stacksize)

public actual fun pthreadAttrGetstacksize(attr: io.github.kotlinmania.libc.PthreadAttrT?, size: ULong?): CInt =
    VxworksModRawLibc.pthreadAttrGetstacksize(attr?.toLong() ?: 0L, size?.toLong() ?: 0L)

public actual fun pthreadAttrInit(attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    VxworksModRawLibc.pthreadAttrInit(attr?.toLong() ?: 0L)

public actual fun pthreadCreate(pThread: CUlong?, pAttr: io.github.kotlinmania.libc.PthreadAttrT?, startRoutine: PthreadCreateStartRoutineCallback, value: COpaquePointer?): CInt =
    VxworksModRawLibc.pthreadCreate(pThread?.toLong() ?: 0L, pAttr?.toLong() ?: 0L, startRoutine, value?.value ?: 0L)

public actual fun pthreadSetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    VxworksModRawLibc.pthreadSetschedparam(native, policy, param?.toLong() ?: 0L)

public actual fun pthreadGetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    VxworksModRawLibc.pthreadGetschedparam(native, policy?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun pthreadAttrSetinheritsched(attr: io.github.kotlinmania.libc.PthreadAttrT?, inheritsched: CInt): CInt =
    VxworksModRawLibc.pthreadAttrSetinheritsched(attr?.toLong() ?: 0L, inheritsched)

public actual fun pthreadAttrSetschedpolicy(attr: io.github.kotlinmania.libc.PthreadAttrT?, policy: CInt): CInt =
    VxworksModRawLibc.pthreadAttrSetschedpolicy(attr?.toLong() ?: 0L, policy)

public actual fun pthreadAttrDestroy(thread: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    VxworksModRawLibc.pthreadAttrDestroy(thread?.toLong() ?: 0L)

public actual fun pthreadDetach(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    VxworksModRawLibc.pthreadDetach(thread)

public actual fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt =
    VxworksModRawLibc.pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    VxworksModRawLibc.fstat(fildes, buf?.toLong() ?: 0L)

public actual fun lstat(path: String?, buf: Stat?): CInt =
    VxworksModRawLibc.lstat(path, buf?.toLong() ?: 0L)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    VxworksModRawLibc.ftruncate(fd, length)

public actual fun readdirR(pDir: DIR?, entry: io.github.kotlinmania.libc.Dirent?, result: COpaquePointer?): CInt =
    VxworksModRawLibc.readdirR(pDir?.toLong() ?: 0L, entry?.toLong() ?: 0L, result?.value ?: 0L)

public actual fun readdir(pDir: DIR?): io.github.kotlinmania.libc.Dirent? =
    VxworksModRawLibc.readdir(pDir?.toLong() ?: 0L)

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    VxworksModRawLibc.poll(fds?.toLong() ?: 0L, nfds, timeout)

public actual fun pthreadCondattrInit(attr: io.github.kotlinmania.libc.PthreadCondattrT?): CInt =
    VxworksModRawLibc.pthreadCondattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadCondattrDestroy(attr: io.github.kotlinmania.libc.PthreadCondattrT?): CInt =
    VxworksModRawLibc.pthreadCondattrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadCondattrGetclock(pAttr: io.github.kotlinmania.libc.PthreadCondattrT?, pClockId: CInt?): CInt =
    VxworksModRawLibc.pthreadCondattrGetclock(pAttr?.toLong() ?: 0L, pClockId?.toLong() ?: 0L)

public actual fun pthreadCondattrSetclock(pAttr: io.github.kotlinmania.libc.PthreadCondattrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    VxworksModRawLibc.pthreadCondattrSetclock(pAttr?.toLong() ?: 0L, clockId)

public actual fun pthreadCondInit(cond: io.github.kotlinmania.libc.PthreadCondT?, attr: io.github.kotlinmania.libc.PthreadCondattrT?): CInt =
    VxworksModRawLibc.pthreadCondInit(cond?.toLong() ?: 0L, attr?.toLong() ?: 0L)

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    VxworksModRawLibc.pthreadCondDestroy(cond?.toLong() ?: 0L)

public actual fun pthreadCondSignal(cond: io.github.kotlinmania.libc.PthreadCondT?): CInt =
    VxworksModRawLibc.pthreadCondSignal(cond?.toLong() ?: 0L)

public actual fun pthreadCondBroadcast(cond: io.github.kotlinmania.libc.PthreadCondT?): CInt =
    VxworksModRawLibc.pthreadCondBroadcast(cond?.toLong() ?: 0L)

public actual fun pthreadCondWait(cond: io.github.kotlinmania.libc.PthreadCondT?, mutex: io.github.kotlinmania.libc.PthreadMutexT?): CInt =
    VxworksModRawLibc.pthreadCondWait(cond?.toLong() ?: 0L, mutex?.toLong() ?: 0L)

public actual fun pthreadRwlockattrInit(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?): CInt =
    VxworksModRawLibc.pthreadRwlockattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadRwlockattrDestroy(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?): CInt =
    VxworksModRawLibc.pthreadRwlockattrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadRwlockattrSetmaxreaders(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?, attr2: CUint): CInt =
    VxworksModRawLibc.pthreadRwlockattrSetmaxreaders(attr?.toLong() ?: 0L, attr2)

public actual fun pthreadRwlockInit(attr: io.github.kotlinmania.libc.PthreadRwlockT?, host: io.github.kotlinmania.libc.PthreadRwlockattrT?): CInt =
    VxworksModRawLibc.pthreadRwlockInit(attr?.toLong() ?: 0L, host?.toLong() ?: 0L)

public actual fun pthreadRwlockDestroy(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt =
    VxworksModRawLibc.pthreadRwlockDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadRwlockRdlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt =
    VxworksModRawLibc.pthreadRwlockRdlock(attr?.toLong() ?: 0L)

public actual fun pthreadRwlockTryrdlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt =
    VxworksModRawLibc.pthreadRwlockTryrdlock(attr?.toLong() ?: 0L)

public actual fun pthreadRwlockTimedrdlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?, host: io.github.kotlinmania.libc.Timespec?): CInt =
    VxworksModRawLibc.pthreadRwlockTimedrdlock(attr?.toLong() ?: 0L, host?.toLong() ?: 0L)

public actual fun pthreadRwlockWrlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt =
    VxworksModRawLibc.pthreadRwlockWrlock(attr?.toLong() ?: 0L)

public actual fun pthreadRwlockTrywrlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt =
    VxworksModRawLibc.pthreadRwlockTrywrlock(attr?.toLong() ?: 0L)

public actual fun pthreadRwlockTimedwrlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?, host: io.github.kotlinmania.libc.Timespec?): CInt =
    VxworksModRawLibc.pthreadRwlockTimedwrlock(attr?.toLong() ?: 0L, host?.toLong() ?: 0L)

public actual fun pthreadRwlockUnlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt =
    VxworksModRawLibc.pthreadRwlockUnlock(attr?.toLong() ?: 0L)

public actual fun pthreadKeyCreate(key: CUlong?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    VxworksModRawLibc.pthreadKeyCreate(key?.toLong() ?: 0L, dtor?.toLong() ?: 0L)

public actual fun pthreadKeyDelete(key: io.github.kotlinmania.libc.PthreadKeyT): CInt =
    VxworksModRawLibc.pthreadKeyDelete(key)

public actual fun pthreadSetspecific(key: io.github.kotlinmania.libc.PthreadKeyT, value: COpaquePointer?): CInt =
    VxworksModRawLibc.pthreadSetspecific(key, value?.value ?: 0L)

public actual fun pthreadGetspecific(key: io.github.kotlinmania.libc.PthreadKeyT): COpaquePointer? =
    VxworksModRawLibc.pthreadGetspecific(key).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadCondTimedwait(cond: io.github.kotlinmania.libc.PthreadCondT?, mutex: io.github.kotlinmania.libc.PthreadMutexT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    VxworksModRawLibc.pthreadCondTimedwait(cond?.toLong() ?: 0L, mutex?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun pthreadAttrGetname(attr: io.github.kotlinmania.libc.PthreadAttrT?, name: COpaquePointer?): CInt =
    VxworksModRawLibc.pthreadAttrGetname(attr?.toLong() ?: 0L, name?.value ?: 0L)

public actual fun pthreadJoin(thread: io.github.kotlinmania.libc.PthreadT, status: COpaquePointer?): CInt =
    VxworksModRawLibc.pthreadJoin(thread, status?.value ?: 0L)

public actual fun pthreadSelf(): io.github.kotlinmania.libc.PthreadT =
    VxworksModRawLibc.pthreadSelf()

public actual fun clockGettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    VxworksModRawLibc.clockGettime(clockId, tp?.toLong() ?: 0L)

public actual fun clockSettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    VxworksModRawLibc.clockSettime(clockId, tp?.toLong() ?: 0L)

public actual fun clockGetres(clockId: io.github.kotlinmania.libc.ClockidT, res: io.github.kotlinmania.libc.Timespec?): CInt =
    VxworksModRawLibc.clockGetres(clockId, res?.toLong() ?: 0L)

public actual fun clockNanosleep(clockId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: io.github.kotlinmania.libc.Timespec?, rmtp: io.github.kotlinmania.libc.Timespec?): CInt =
    VxworksModRawLibc.clockNanosleep(clockId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)

public actual fun nanosleep(rqtp: io.github.kotlinmania.libc.Timespec?, rmtp: io.github.kotlinmania.libc.Timespec?): CInt =
    VxworksModRawLibc.nanosleep(rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)

public actual fun accept(s: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CUint?): CInt =
    VxworksModRawLibc.accept(s, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt =
    VxworksModRawLibc.bind(fd, addr?.toLong() ?: 0L, len)

public actual fun connect(s: CInt, name: io.github.kotlinmania.libc.Sockaddr?, namelen: io.github.kotlinmania.libc.SocklenT): CInt =
    VxworksModRawLibc.connect(s, name?.toLong() ?: 0L, namelen)

public actual fun getpeername(s: CInt, name: io.github.kotlinmania.libc.Sockaddr?, namelen: CUint?): CInt =
    VxworksModRawLibc.getpeername(s, name?.toLong() ?: 0L, namelen?.toLong() ?: 0L)

public actual fun getsockname(socket: CInt, address: Sockaddr?, addressLen: CUint?): CInt =
    VxworksModRawLibc.getsockname(socket, address?.toLong() ?: 0L, addressLen?.toLong() ?: 0L)

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: CUint?): CInt =
    VxworksModRawLibc.getsockopt(sockfd, level, optname, optval?.value ?: 0L, optlen?.toLong() ?: 0L)

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    VxworksModRawLibc.listen(socket, backlog)

public actual fun recv(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt): SsizeT =
    VxworksModRawLibc.recv(s, buf?.value ?: 0L, bufLen, flags)

public actual fun recvfrom(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt, from: io.github.kotlinmania.libc.Sockaddr?, pFromLen: CUint?): SsizeT =
    VxworksModRawLibc.recvfrom(s, buf?.value ?: 0L, bufLen, flags, from?.toLong() ?: 0L, pFromLen?.toLong() ?: 0L)

public actual fun recvmsg(socket: CInt, mp: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    VxworksModRawLibc.recvmsg(socket, mp?.toLong() ?: 0L, flags)

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    VxworksModRawLibc.send(socket, buf?.value ?: 0L, len, flags)

public actual fun sendmsg(socket: CInt, mp: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    VxworksModRawLibc.sendmsg(socket, mp?.toLong() ?: 0L, flags)

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    VxworksModRawLibc.sendto(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen)

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    VxworksModRawLibc.setsockopt(socket, level, name, value?.value ?: 0L, optionLen)

public actual fun shutdown(s: CInt, how: CInt): CInt =
    VxworksModRawLibc.shutdown(s, how)

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    VxworksModRawLibc.socket(domain, type, protocol)

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    VxworksModRawLibc.gaiStrerror(errcode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun close(fd: CInt): CInt =
    VxworksModRawLibc.close(fd)

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    VxworksModRawLibc.read(fd, buf?.value ?: 0L, count)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    VxworksModRawLibc.write(fd, buf?.value ?: 0L, count)

public actual fun isatty(fd: CInt): CInt =
    VxworksModRawLibc.isatty(fd)

public actual fun dup(src: CInt): CInt =
    VxworksModRawLibc.dup(src)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    VxworksModRawLibc.dup2(src, dst)

public actual fun pipe(fds: CInt?): CInt =
    VxworksModRawLibc.pipe(fds?.toLong() ?: 0L)

public actual fun unlink(pathname: String?): CInt =
    VxworksModRawLibc.unlink(pathname)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    VxworksModRawLibc.lseek(fd, offset, whence)

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt =
    VxworksModRawLibc.getaddrinfo(node, service, hints?.toLong() ?: 0L, res?.value ?: 0L)

public actual fun freeaddrinfo(res: Addrinfo?) {
    VxworksModRawLibc.freeaddrinfo(res?.toLong() ?: 0L)
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    VxworksModRawLibc.signal(signum, handler)

public actual fun getpid(): PidT =
    VxworksModRawLibc.getpid()

public actual fun getppid(): PidT =
    VxworksModRawLibc.getppid()

public actual fun setpgid(pid: PidT, pgid: PidT): PidT =
    VxworksModRawLibc.setpgid(pid, pgid)

public actual fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT =
    VxworksModRawLibc.waitpid(pid, status?.toLong() ?: 0L, options)

public actual fun sysconf(attr: CInt): CLong =
    VxworksModRawLibc.sysconf(attr)

public actual fun setenv(envVarName: String?, envVarValue: String?, overwrite: CInt): CInt =
    VxworksModRawLibc.setenv(envVarName, envVarValue, overwrite)

public actual fun unsetenv(envVarName: String?): CInt =
    VxworksModRawLibc.unsetenv(envVarName)

public actual fun realpath(fileName: String?, resolvedName: COpaquePointer?): COpaquePointer? =
    VxworksModRawLibc.realpath(fileName, resolvedName?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun link(src: String?, dst: String?): CInt =
    VxworksModRawLibc.link(src, dst)

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsize: SizeT): SsizeT =
    VxworksModRawLibc.readlink(path, buf?.value ?: 0L, bufsize)

public actual fun symlink(path1: String?, path2: String?): CInt =
    VxworksModRawLibc.symlink(path1, path2)

public actual fun opendir(name: String?): DIR? =
    VxworksModRawLibc.opendir(name)

public actual fun rmdir(path: String?): CInt =
    VxworksModRawLibc.rmdir(path)

public actual fun mkdir(dirName: String?, mode: ModeT): CInt =
    VxworksModRawLibc.mkdir(dirName, mode)

public actual fun chmod(path: String?, mode: ModeT): CInt =
    VxworksModRawLibc.chmod(path, mode)

public actual fun fchmod(attr1: CInt, attr2: ModeT): CInt =
    VxworksModRawLibc.fchmod(attr1, attr2)

public actual fun fsync(fd: CInt): CInt =
    VxworksModRawLibc.fsync(fd)

public actual fun closedir(ptr: DIR?): CInt =
    VxworksModRawLibc.closedir(ptr?.toLong() ?: 0L)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    VxworksModRawLibc.schedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    VxworksModRawLibc.schedGetPriorityMin(policy)

public actual fun schedSetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    VxworksModRawLibc.schedSetparam(pid, param?.toLong() ?: 0L)

public actual fun schedGetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    VxworksModRawLibc.schedGetparam(pid, param?.toLong() ?: 0L)

public actual fun schedSetscheduler(pid: io.github.kotlinmania.libc.PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    VxworksModRawLibc.schedSetscheduler(pid, policy, param?.toLong() ?: 0L)

public actual fun schedGetscheduler(pid: io.github.kotlinmania.libc.PidT): CInt =
    VxworksModRawLibc.schedGetscheduler(pid)

public actual fun schedRrGetInterval(pid: io.github.kotlinmania.libc.PidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    VxworksModRawLibc.schedRrGetInterval(pid, tp?.toLong() ?: 0L)

public actual fun schedYield(): CInt =
    VxworksModRawLibc.schedYield()

public actual fun errnoSet(err: CInt): CInt =
    VxworksModRawLibc.errnoSet(err)

public actual fun errnoGet(): CInt =
    VxworksModRawLibc.errnoGet()

public actual fun setgid(gid: io.github.kotlinmania.libc.GidT): CInt =
    VxworksModRawLibc.setgid(gid)

public actual fun getgid(): io.github.kotlinmania.libc.GidT =
    VxworksModRawLibc.getgid()

public actual fun setuid(uid: io.github.kotlinmania.libc.UidT): CInt =
    VxworksModRawLibc.setuid(uid)

public actual fun getuid(): io.github.kotlinmania.libc.UidT =
    VxworksModRawLibc.getuid()

public actual fun sigemptyset(set: CUlonglong?): CInt =
    VxworksModRawLibc.sigemptyset(set?.toLong() ?: 0L)

public actual fun sigfillset(set: CUlonglong?): CInt =
    VxworksModRawLibc.sigfillset(set?.toLong() ?: 0L)

public actual fun sigdelset(set: CUlonglong?, signum: CInt): CInt =
    VxworksModRawLibc.sigdelset(set?.toLong() ?: 0L, signum)

public actual fun sigismember(set: CUlonglong?, signum: CInt): CInt =
    VxworksModRawLibc.sigismember(set?.toLong() ?: 0L, signum)

public actual fun pthreadSigmask(how: CInt, set: CUlonglong?, oset: CUlonglong?): CInt =
    VxworksModRawLibc.pthreadSigmask(how, set?.toLong() ?: 0L, oset?.toLong() ?: 0L)

public actual fun kill(pid: PidT, signo: CInt): CInt =
    VxworksModRawLibc.kill(pid, signo)

public actual fun sigqueue(pid: PidT, signo: CInt, value: io.github.kotlinmania.libc.Sigval): CInt =
    VxworksModRawLibc.sigqueue(pid, signo, value)

public actual fun taskKill(taskId: io.github.kotlinmania.libc.TaskId, signo: CInt): CInt =
    VxworksModRawLibc.taskKill(taskId, signo)

public actual fun raise(signo: CInt): CInt =
    VxworksModRawLibc.raise(signo)

public actual fun taskIdSelf(): io.github.kotlinmania.libc.TaskId =
    VxworksModRawLibc.taskIdSelf()

public actual fun taskDelay(ticks: io.github.kotlinmania.libc.VxTicksT): CInt =
    VxworksModRawLibc.taskDelay(ticks)

public actual fun taskNameSet(taskId: io.github.kotlinmania.libc.TaskId, taskName: COpaquePointer?): CInt =
    VxworksModRawLibc.taskNameSet(taskId, taskName?.value ?: 0L)

public actual fun taskNameGet(taskId: io.github.kotlinmania.libc.TaskId, bufName: COpaquePointer?, bufsize: SizeT): CInt =
    VxworksModRawLibc.taskNameGet(taskId, bufName?.value ?: 0L, bufsize)

public actual fun rtpInfoGet(rtpId: io.github.kotlinmania.libc.RtpId, rtpStruct: io.github.kotlinmania.libc.RtpDesc?): CInt =
    VxworksModRawLibc.rtpInfoGet(rtpId, rtpStruct?.toLong() ?: 0L)

public actual fun rtpSpawn(pubrtpFileName: String?, argv: COpaquePointer?, envp: COpaquePointer?, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId =
    VxworksModRawLibc.rtpSpawn(pubrtpFileName, argv?.value ?: 0L, envp?.value ?: 0L, priority, uStackSize, options, taskOptions)

public actual fun pathIsAbsolute(filepath: String?, pNameTail: COpaquePointer?): Bool =
    VxworksModRawLibc.pathIsAbsolute(filepath, pNameTail?.value ?: 0L)

public actual fun writev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT =
    VxworksModRawLibc.writev(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun readv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT =
    VxworksModRawLibc.readv(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun randBytes(buf: CUchar?, length: CInt): CInt =
    VxworksModRawLibc.randBytes(buf?.toLong() ?: 0L, length)

public actual fun randABytes(buf: CUchar?, length: CInt): CInt =
    VxworksModRawLibc.randABytes(buf?.toLong() ?: 0L, length)

public actual fun randUBytes(buf: CUchar?, length: CInt): CInt =
    VxworksModRawLibc.randUBytes(buf?.toLong() ?: 0L, length)

public actual fun randSecure(): CInt =
    VxworksModRawLibc.randSecure()

public actual fun mqClose(mqd: io.github.kotlinmania.libc.MqdT): CInt =
    VxworksModRawLibc.mqClose(mqd)

public actual fun mqUnlink(name: String?): CInt =
    VxworksModRawLibc.mqUnlink(name)

public actual fun mqReceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    VxworksModRawLibc.mqReceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L)

public actual fun mqTimedreceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: io.github.kotlinmania.libc.Timespec?): SsizeT =
    VxworksModRawLibc.mqTimedreceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L, absTimeout?.toLong() ?: 0L)

public actual fun mqSend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    VxworksModRawLibc.mqSend(mqd, msgPtr, msgLen, msgPrio)

public actual fun mqTimedsend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: io.github.kotlinmania.libc.Timespec?): CInt =
    VxworksModRawLibc.mqTimedsend(mqd, msgPtr, msgLen, msgPrio, absTimeout?.toLong() ?: 0L)

public actual fun mqGetattr(mqd: io.github.kotlinmania.libc.MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt =
    VxworksModRawLibc.mqGetattr(mqd, attr?.toLong() ?: 0L)

public actual fun mqSetattr(mqd: io.github.kotlinmania.libc.MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt =
    VxworksModRawLibc.mqSetattr(mqd, newattr?.toLong() ?: 0L, oldattr?.toLong() ?: 0L)

public actual fun vxCpuEnabledGet(): io.github.kotlinmania.libc.CpusetT =
    VxworksModRawLibc.vxCpuEnabledGet()

public actual fun vxCpuConfiguredGet(): io.github.kotlinmania.libc.CpusetT =
    VxworksModRawLibc.vxCpuConfiguredGet()
