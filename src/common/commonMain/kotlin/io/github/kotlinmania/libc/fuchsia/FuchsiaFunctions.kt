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

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: COpaquePointer?)
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: COpaquePointer?, errnum: CInt): CInt
}

public fun interface CloneCbCallback {
    public operator fun invoke(arg0: COpaquePointer?): CInt
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: COpaquePointer?, size: SizeT, data: COpaquePointer?): CInt
}

// PUB_STRUCT
// intentionally not public, only used for fdSet
// END_PUB_CONST
public fun fdClr(fd: CInt, set: FdSet?) {
    val fd1 = fd
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set.fdsBits[fd1 / size] and (1uL shl (fd1 % size)).inv()
    return
}

public fun fdIsset(fd: CInt, set: FdSet?): Boolean {
    val fd1 = fd
    val size = 8 * 8
    return (set!!.fdsBits[fd1 / size] and (1uL shl (fd1 % size))) != 0uL
}

public fun fdSet(fd: CInt, set: FdSet?) {
    val fd1 = fd
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set.fdsBits[fd1 / size] or (1uL shl (fd1 % size))
    return
}

public fun fdZero(set: FdSet?) {
    for (idx in (set!!.fdsBits).indices) {
        (set.fdsBits)[idx] = 0uL
    }
}

public fun cpuZero(cpuset: CpuSetT) {
    for (idx in cpuset.bits.indices) {
        cpuset.bits[idx] = 0uL
    }
}

public fun cpuSet(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * 8
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] or (1uL shl offset)
}

public fun cpuClr(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * 8
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] and (1uL shl offset).inv()
}

public fun cpuIsset(cpu: Int, cpuset: CpuSetT): Boolean {
    val sizeInBits = 8 * 8
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    return 0uL != (cpuset.bits[idx] and (1uL shl offset))
}

public fun cpuEqual(set1: CpuSetT, set2: CpuSetT): Boolean = set1.bits.contentEquals(set2.bits)

public fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? = COpaquePointer((cmsg).hashCode().toLong() + 1.toLong())

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    if (((cmsg!!.cmsgLen).toULong()) < 8uL) {
        null
    } else if ((cmsgNext(cmsg))?.let { COpaquePointer(it.rawValue + 8.toLong()) } >= mhdrEnd(mhdr)) {
        null
    } else {
        ((cmsgNext(cmsg) as Any?) as Cmsghdr?)
    }

public fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? =
    if ((mhdr!!.msgControllen).toULong() >= 8uL) {
        ((mhdr.msgControl as Any?) as Cmsghdr?)
    } else {
        null
    }

public fun cmsgAlign(len: SizeT): SizeT = (len + 8uL - 1uL) and (8uL - 1uL).inv()

public fun cmsgSpace(len: CUint): CUint = (cmsgAlign(len.toULong()) + cmsgAlign(8uL)).toUInt()

public fun cmsgLen(len: CUint): CUint = (cmsgAlign(8uL) + len.toULong()).toUInt()

public fun wifstopped(status: CInt): Boolean = (status and 0xff) == 0x7f

public fun wstopsig(status: CInt): CInt = (status shr 8) and 0xff

public fun wifcontinued(status: CInt): Boolean = status == 0xffff

public fun wifsignaled(status: CInt): Boolean = ((status and 0x7f) + 1).toByte() >= 2.toByte()

public fun wtermsig(status: CInt): CInt = status and 0x7f

public fun wifexited(status: CInt): Boolean = (status and 0x7f) == 0

public fun wexitstatus(status: CInt): CInt = (status shr 8) and 0xff

public fun wcoredump(status: CInt): Boolean = (status and 0x80) != 0

public fun qcmd(cmd: CInt, type: CInt): CInt = (cmd shl 8) or (type and 0x00ff)

public fun makedev(major: CUint, minor: CUint): DevT {
    val major1 = major.toULong()
    val minor1 = minor.toULong()
    var dev = 0uL
    dev = dev or ((major1 and 0x00000fffuL) shl 8)
    dev = dev or ((major1 and 0xfffff000uL) shl 32)
    dev = dev or ((minor1 and 0x000000ffuL) shl 0)
    dev = dev or ((minor1 and 0xffffff00uL) shl 12)
    return dev
}

public fun major(dev: DevT): CUint {
    var major = 0uL
    major = major or ((dev and 0x00000000000fff00uL) shr 8)
    major = major or ((dev and 0xfffff00000000000uL) shr 32)
    return major.toUInt()
}

public fun minor(dev: DevT): CUint {
    var minor = 0uL
    minor = minor or ((dev and 0x00000000000000ffuL) shr 0)
    minor = minor or ((dev and 0x00000ffffff00000uL) shr 12)
    return minor.toUInt()
}

public fun cmsgLen(cmsg: Cmsghdr?): SsizeT = (((cmsg!!.cmsgLen).toULong() + 8uL - 1uL) and (8uL - 1uL).inv()).toLong()

public fun cmsgNext(cmsg: Cmsghdr?): COpaquePointer? = (COpaquePointer((cmsg).hashCode().toLong() + cmsgLen(cmsg)))

public fun mhdrEnd(mhdr: Msghdr?): COpaquePointer? = (mhdr!!.msgControl)?.let { COpaquePointer(it.rawValue + (mhdr.msgControllen.toInt()).toLong()) }

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

public expect fun atexit(cb: SigactionSaRestorerCallback): CInt

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

public expect fun wcslen(buf: COpaquePointer?): SizeT

public expect fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT

public expect fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer?

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

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

public expect fun readdirR(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt

public expect fun closedir(dirp: DIR?): CInt

public expect fun rewinddir(dirp: DIR?)

public expect fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt

public expect fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt

public expect fun fchown(fd: CInt, owner: UidT, group: GidT): CInt

public expect fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt

public expect fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt

public expect fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt

public expect fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT

public expect fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt

public expect fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt

public expect fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt

public expect fun access(path: String?, amode: CInt): CInt

public expect fun alarm(seconds: CUint): CUint

public expect fun chdir(dir: String?): CInt

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

public expect fun pause(): CInt

public expect fun pipe(fds: COpaquePointer?): CInt

public expect fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt

public expect fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT

public expect fun rmdir(path: String?): CInt

public expect fun seteuid(uid: UidT): CInt

public expect fun setegid(gid: GidT): CInt

public expect fun setgid(gid: GidT): CInt

public expect fun setpgid(pid: PidT, pgid: PidT): CInt

public expect fun setsid(): PidT

public expect fun setuid(uid: UidT): CInt

public expect fun sleep(secs: CUint): CUint

public expect fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt

public expect fun tcgetpgrp(fd: CInt): PidT

public expect fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt

public expect fun ttyname(fd: CInt): COpaquePointer?

public expect fun unlink(c: String?): CInt

public expect fun wait(status: COpaquePointer?): PidT

public expect fun waitpid(pid: PidT, status: COpaquePointer?, options: CInt): PidT

public expect fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT

public expect fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT

public expect fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT

public expect fun umask(mask: ModeT): ModeT

public expect fun utime(file: String?, buf: COpaquePointer?): CInt

public expect fun kill(pid: PidT, sig: CInt): CInt

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

public expect fun ftruncate(fd: CInt, length: OffT): CInt

public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

public expect fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer?

public expect fun flock(fd: CInt, operation: CInt): CInt

public expect fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun times(buf: COpaquePointer?): ClockT

public expect fun pthreadSelf(): PthreadT

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

public expect fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt

public expect fun raise(signum: CInt): CInt

public expect fun sigaction(signum: CInt, act: COpaquePointer?, oldact: COpaquePointer?): CInt

public expect fun utimes(filename: String?, times: COpaquePointer?): CInt

public expect fun dlopen(filename: String?, flag: CInt): COpaquePointer?

public expect fun dlerror(): COpaquePointer?

public expect fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer?

public expect fun dlclose(handle: COpaquePointer?): CInt

public expect fun dladdr(addr: COpaquePointer?, info: COpaquePointer?): CInt

public expect fun getaddrinfo(node: String?, service: String?, hints: COpaquePointer?, res: COpaquePointer?): CInt

public expect fun freeaddrinfo(res: COpaquePointer?)

public expect fun gaiStrerror(errcode: CInt): COpaquePointer?

public expect fun resInit(): CInt

public expect fun gmtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer?

public expect fun localtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer?

public expect fun mktime(tm: COpaquePointer?): TimeT

public expect fun time(time: COpaquePointer?): TimeT

public expect fun gmtime(timeP: COpaquePointer?): COpaquePointer?

public expect fun localtime(timeP: COpaquePointer?): COpaquePointer?

public expect fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun uname(buf: COpaquePointer?): CInt

public expect fun gethostname(name: COpaquePointer?, len: SizeT): CInt

public expect fun getservbyname(name: String?, proto: String?): COpaquePointer?

public expect fun getprotobyname(name: String?): COpaquePointer?

public expect fun getprotobynumber(proto: CInt): COpaquePointer?

public expect fun usleep(secs: CUint): CInt

public expect fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT

public expect fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT

public expect fun putenv(string: COpaquePointer?): CInt

public expect fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt

public expect fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt

public expect fun setlocale(category: CInt, locale: String?): COpaquePointer?

public expect fun localeconv(): COpaquePointer?

public expect fun semDestroy(sem: COpaquePointer?): CInt

public expect fun semWait(sem: COpaquePointer?): CInt

public expect fun semTrywait(sem: COpaquePointer?): CInt

public expect fun semPost(sem: COpaquePointer?): CInt

public expect fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt

public expect fun statvfs(path: String?, buf: COpaquePointer?): CInt

public expect fun fstatvfs(fd: CInt, buf: COpaquePointer?): CInt

public expect fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT

public expect fun sigemptyset(set: COpaquePointer?): CInt

public expect fun sigaddset(set: COpaquePointer?, signum: CInt): CInt

public expect fun sigfillset(set: COpaquePointer?): CInt

public expect fun sigdelset(set: COpaquePointer?, signum: CInt): CInt

public expect fun sigismember(set: COpaquePointer?, signum: CInt): CInt

public expect fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt

public expect fun sigpending(set: COpaquePointer?): CInt

public expect fun timegm(tm: COpaquePointer?): TimeT

public expect fun getsid(pid: PidT): PidT

public expect fun sysconf(name: CInt): CLong

public expect fun mkfifo(path: String?, mode: ModeT): CInt

public expect fun pselect(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt

public expect fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: FILE?): OffT

public expect fun tcdrain(fd: CInt): CInt

public expect fun cfgetispeed(termios: COpaquePointer?): SpeedT

public expect fun cfgetospeed(termios: COpaquePointer?): SpeedT

public expect fun cfmakeraw(termios: COpaquePointer?)

public expect fun cfsetispeed(termios: COpaquePointer?, speed: SpeedT): CInt

public expect fun cfsetospeed(termios: COpaquePointer?, speed: SpeedT): CInt

public expect fun cfsetspeed(termios: COpaquePointer?, speed: SpeedT): CInt

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

public expect fun grantpt(fd: CInt): CInt

public expect fun posixOpenpt(flags: CInt): CInt

public expect fun ptsname(fd: CInt): COpaquePointer?

public expect fun unlockpt(fd: CInt): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun dirfd(dirp: DIR?): CInt

public expect fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt

public expect fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt

public expect fun memalign(align: SizeT, size: SizeT): COpaquePointer?

public expect fun setgroups(ngroups: SizeT, ptr: COpaquePointer?): CInt

public expect fun pipe2(fds: COpaquePointer?, flags: CInt): CInt

public expect fun statfs(path: String?, buf: COpaquePointer?): CInt

public expect fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt

public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun futimens(fd: CInt, times: COpaquePointer?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun fdopendir(fd: CInt): DIR?

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt

public expect fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt

public expect fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt

public expect fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun clearenv(): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt

public expect fun setreuid(ruid: UidT, euid: UidT): CInt

public expect fun setregid(rgid: GidT, egid: GidT): CInt

public expect fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt

public expect fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt

public expect fun acct(filename: String?): CInt

public expect fun brk(addr: COpaquePointer?): CInt

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

public expect fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun lutimes(file: String?, times: COpaquePointer?): CInt

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): COpaquePointer?

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

// System V IPC
public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer?

public expect fun shmdt(shmaddr: COpaquePointer?): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt

public expect fun ftok(pathname: String?, projId: CInt): KeyT

public expect fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt

public expect fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT

public expect fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun errnoLocation(): COpaquePointer?

public expect fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT

public expect fun signalfd(fd: CInt, mask: COpaquePointer?, flags: CInt): CInt

public expect fun timerfdCreate(clockid: CInt, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt

public expect fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt

public expect fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt

public expect fun mkostemp(template: COpaquePointer?, flags: CInt): CInt

public expect fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt

public expect fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt

public expect fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer?

public expect fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt

public expect fun reboot(howTo: CInt): CInt

public expect fun setfsgid(gid: GidT): CInt

public expect fun setfsuid(uid: UidT): CInt

// Not available now on Android
public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun ifNameindex(): COpaquePointer?

public expect fun ifFreenameindex(ptr: COpaquePointer?)

public expect fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt

public expect fun getifaddrs(ifap: COpaquePointer?): CInt

public expect fun freeifaddrs(ifa: COpaquePointer?)

public expect fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt

public expect fun globfree(pglob: COpaquePointer?)

public expect fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT

public expect fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt

public expect fun futimes(fd: CInt, times: COpaquePointer?): CInt

public expect fun nlLanginfo(item: NlItem): COpaquePointer?

public expect fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt

public expect fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun getdomainname(name: COpaquePointer?, len: SizeT): CInt

public expect fun setdomainname(name: String?, len: SizeT): CInt

public expect fun vhangup(): CInt

public expect fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt

public expect fun sync()

public expect fun syscall(num: CLong, vararg variadicArgs: Long): CLong

public expect fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt

public expect fun umount(target: String?): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT

public expect fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun splice(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT

public expect fun eventfd(initval: CUint, flags: CInt): CInt

public expect fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt

public expect fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt

public expect fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt

public expect fun swapoff(puath: String?): CInt

public expect fun vmsplice(fd: CInt, iov: COpaquePointer?, nrSegs: SizeT, flags: CUint): SsizeT

public expect fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt

public expect fun personality(persona: CUlong): CInt

public expect fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt

public expect fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt

public expect fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt

public expect fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt

public expect fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt

public expect fun sethostname(name: String?, len: SizeT): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun umount2(target: String?, flags: CInt): CInt

public expect fun swapon(path: String?, swapflags: CInt): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt

public expect fun sigsuspend(mask: COpaquePointer?): CInt

public expect fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt

public expect fun semClose(sem: COpaquePointer?): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun initgroups(user: String?, group: GidT): CInt

public expect fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer?

public expect fun getgrnam(name: String?): COpaquePointer?

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt

public expect fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt

public expect fun getgrgid(gid: GidT): COpaquePointer?

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): COpaquePointer?

public expect fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt
