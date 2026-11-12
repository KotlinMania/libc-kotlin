package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.fuchsia.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.mem.sizeOfVal
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: MutPtr)
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: ConstPtr, errnum: CInt): CInt
}

public fun interface CloneCbCallback {
    public operator fun invoke(arg0: MutPtr): CInt
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr): MutPtr
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: MutPtr, size: SizeT, data: MutPtr): CInt
}

// PUB_STRUCT
// intentionally not public, only used for fdSet
// END_PUB_CONST
public fun fdClr(fd: CInt, set: MutPtr) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U64) * 8
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / size] = cur.fdsBits[fd1 / size] and (1uL shl (fd1 % size)).inv()
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdIsset(fd: CInt, set: ConstPtr): Boolean {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U64) * 8
    return ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] and (1uL shl (fd1 % size))) != 0uL
}

public fun fdSet(fd: CInt, set: MutPtr) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U64) * 8
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / size] = cur.fdsBits[fd1 / size] or (1uL shl (fd1 % size))
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdZero(set: MutPtr) {
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    for (idx in cur.fdsBits.indices) {
        cur.fdsBits[idx] = 0uL
    }
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
}

public fun cpuZero(cpuset: CpuSetT) {
    for (idx in cpuset.bits.indices) {
        cpuset.bits[idx] = 0uL
    }
}

public fun cpuSet(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] or (1uL shl offset)
}

public fun cpuClr(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] and (1uL shl offset).inv()
}

public fun cpuIsset(cpu: Int, cpuset: CpuSetT): Boolean {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    return 0uL != (cpuset.bits[idx] and (1uL shl offset))
}

public fun cpuEqual(set1: CpuSetT, set2: CpuSetT): Boolean = set1.bits.contentEquals(set2.bits)

public fun cmsgData(cmsg: ConstPtr): MutPtr = MutPtr(ConstPtr((cmsg).rawAddress + ((1).toLong() * (Cmsghdr.typeLayout()).strideBytes)).rawAddress, ConstPtr((cmsg).rawAddress + ((1).toLong() * (Cmsghdr.typeLayout()).strideBytes)).rawMeta)

public fun cmsgNxthdr(mhdr: ConstPtr, cmsg: ConstPtr): MutPtr =
    if ((((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toULong()) < sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()).toULong()) {
        MutPtr(0L)
    } else if (((MutPtr((cmsgNext(cmsg)).rawAddress + ((sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())).toLong() * (PrimitiveLayouts.U8).strideBytes))).rawAddress.toULong() >= (mhdrEnd(mhdr)).rawAddress.toULong())) {
        MutPtr(0L)
    } else {
        MutPtr((cmsgNext(cmsg)).rawAddress)
    }

public fun cmsgFirsthdr(mhdr: ConstPtr): MutPtr =
    if (((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toULong() >= sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()).toULong()) {
        MutPtr(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress)
    } else {
        MutPtr(0L)
    }

public fun cmsgAlign(len: SizeT): SizeT = (len + sizeOf<SizeT>(typeLayoutT = PrimitiveLayouts.U64).toULong() - 1uL) and (sizeOf<SizeT>(typeLayoutT = PrimitiveLayouts.U64).toULong() - 1uL).inv()

public fun cmsgSpace(len: CUint): CUint = (cmsgAlign(len.toULong()) + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()).toULong())).toUInt()

public fun cmsgLen(len: CUint): CUint = (cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()).toULong()) + len.toULong()).toUInt()

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

public fun cmsgLen(cmsg: ConstPtr): SsizeT = ((((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toULong() + sizeOf<CLong>(typeLayoutT = PrimitiveLayouts.I64).toULong() - 1uL) and (sizeOf<CLong>(typeLayoutT = PrimitiveLayouts.I64).toULong() - 1uL).inv()).toLong()

public fun cmsgNext(cmsg: ConstPtr): MutPtr = MutPtr((ConstPtr((cmsg).rawAddress + ((cmsgLen(cmsg)) * (Cmsghdr.typeLayout()).strideBytes))).rawAddress, (ConstPtr((cmsg).rawAddress + ((cmsgLen(cmsg)) * (Cmsghdr.typeLayout()).strideBytes))).rawMeta)

public fun mhdrEnd(mhdr: ConstPtr): MutPtr = MutPtr((MutPtr(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress + ((((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()).toLong() * (PrimitiveLayouts.U8).strideBytes))).rawAddress)

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

public expect fun atexit(cb: SigactionSaRestorerCallback): CInt

public expect fun system(s: ConstPtr): CInt

public expect fun getenv(s: ConstPtr): MutPtr

public expect fun strcpy(dst: MutPtr, src: ConstPtr): MutPtr

public expect fun strncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr

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

public expect fun strpbrk(cs: ConstPtr, ct: ConstPtr): MutPtr

public expect fun strstr(cs: ConstPtr, ct: ConstPtr): MutPtr

public expect fun strlen(cs: ConstPtr): SizeT

public expect fun strnlen(cs: ConstPtr, maxlen: SizeT): SizeT

public expect fun strerror(n: CInt): MutPtr

public expect fun strtok(s: MutPtr, t: ConstPtr): MutPtr

public expect fun strxfrm(s: MutPtr, ct: ConstPtr, n: SizeT): SizeT

public expect fun wcslen(buf: ConstPtr): SizeT

public expect fun wcstombs(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT

public expect fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr

public expect fun wmemchr(cx: ConstPtr, c: WcharT, n: SizeT): MutPtr

public expect fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt

public expect fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

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

public expect fun readdirR(dirp: MutPtr, entry: MutPtr, result: MutPtr): CInt

public expect fun closedir(dirp: MutPtr): CInt

public expect fun rewinddir(dirp: MutPtr)

public expect fun openat(dirfd: CInt, pathname: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt

public expect fun fchmodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, flags: CInt): CInt

public expect fun fchown(fd: CInt, owner: UidT, group: GidT): CInt

public expect fun fchownat(dirfd: CInt, pathname: ConstPtr, owner: UidT, group: GidT, flags: CInt): CInt

public expect fun fstatat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, flags: CInt): CInt

public expect fun linkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt

public expect fun mkdirat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt

public expect fun readlinkat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, bufsiz: SizeT): SsizeT

public expect fun renameat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt

public expect fun symlinkat(target: ConstPtr, newdirfd: CInt, linkpath: ConstPtr): CInt

public expect fun unlinkat(dirfd: CInt, pathname: ConstPtr, flags: CInt): CInt

public expect fun access(path: ConstPtr, amode: CInt): CInt

public expect fun alarm(seconds: CUint): CUint

public expect fun chdir(dir: ConstPtr): CInt

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

public expect fun pause(): CInt

public expect fun pipe(fds: MutPtr): CInt

public expect fun posixMemalign(memptr: MutPtr, align: SizeT, size: SizeT): CInt

public expect fun read(fd: CInt, buf: MutPtr, count: SizeT): SsizeT

public expect fun rmdir(path: ConstPtr): CInt

public expect fun seteuid(uid: UidT): CInt

public expect fun setegid(gid: GidT): CInt

public expect fun setgid(gid: GidT): CInt

public expect fun setpgid(pid: PidT, pgid: PidT): CInt

public expect fun setsid(): PidT

public expect fun setuid(uid: UidT): CInt

public expect fun sleep(secs: CUint): CUint

public expect fun nanosleep(rqtp: ConstPtr, rmtp: MutPtr): CInt

public expect fun tcgetpgrp(fd: CInt): PidT

public expect fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt

public expect fun ttyname(fd: CInt): MutPtr

public expect fun unlink(c: ConstPtr): CInt

public expect fun wait(status: MutPtr): PidT

public expect fun waitpid(pid: PidT, status: MutPtr, options: CInt): PidT

public expect fun write(fd: CInt, buf: ConstPtr, count: SizeT): SsizeT

public expect fun pread(fd: CInt, buf: MutPtr, count: SizeT, offset: OffT): SsizeT

public expect fun pwrite(fd: CInt, buf: ConstPtr, count: SizeT, offset: OffT): SsizeT

public expect fun umask(mask: ModeT): ModeT

public expect fun utime(file: ConstPtr, buf: ConstPtr): CInt

public expect fun kill(pid: PidT, sig: CInt): CInt

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

public expect fun ftruncate(fd: CInt, length: OffT): CInt

public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

public expect fun realpath(pathname: ConstPtr, resolved: MutPtr): MutPtr

public expect fun flock(fd: CInt, operation: CInt): CInt

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun times(buf: MutPtr): ClockT

public expect fun pthreadSelf(): PthreadT

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

public expect fun pthreadGetnameNp(thread: PthreadT, name: MutPtr, len: SizeT): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr, optlen: MutPtr): CInt

public expect fun raise(signum: CInt): CInt

public expect fun sigaction(signum: CInt, act: ConstPtr, oldact: MutPtr): CInt

public expect fun utimes(filename: ConstPtr, times: ConstPtr): CInt

public expect fun dlopen(filename: ConstPtr, flag: CInt): MutPtr

public expect fun dlerror(): MutPtr

public expect fun dlsym(handle: MutPtr, symbol: ConstPtr): MutPtr

public expect fun dlclose(handle: MutPtr): CInt

public expect fun dladdr(addr: ConstPtr, info: MutPtr): CInt

public expect fun getaddrinfo(node: ConstPtr, service: ConstPtr, hints: ConstPtr, res: MutPtr): CInt

public expect fun freeaddrinfo(res: MutPtr)

public expect fun gaiStrerror(errcode: CInt): ConstPtr

public expect fun resInit(): CInt

public expect fun gmtimeR(timeP: ConstPtr, result: MutPtr): MutPtr

public expect fun localtimeR(timeP: ConstPtr, result: MutPtr): MutPtr

public expect fun mktime(tm: MutPtr): TimeT

public expect fun time(time: MutPtr): TimeT

public expect fun gmtime(timeP: ConstPtr): MutPtr

public expect fun localtime(timeP: ConstPtr): MutPtr

public expect fun mknod(pathname: ConstPtr, mode: ModeT, dev: DevT): CInt

public expect fun uname(buf: MutPtr): CInt

public expect fun gethostname(name: MutPtr, len: SizeT): CInt

public expect fun getservbyname(name: ConstPtr, proto: ConstPtr): MutPtr

public expect fun getprotobyname(name: ConstPtr): MutPtr

public expect fun getprotobynumber(proto: CInt): MutPtr

public expect fun usleep(secs: CUint): CInt

public expect fun send(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt): SsizeT

public expect fun recv(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt): SsizeT

public expect fun putenv(string: MutPtr): CInt

public expect fun poll(fds: MutPtr, nfds: NfdsT, timeout: CInt): CInt

public expect fun select(nfds: CInt, readfds: MutPtr, writefds: MutPtr, errorfds: MutPtr, timeout: MutPtr): CInt

public expect fun setlocale(category: CInt, locale: ConstPtr): MutPtr

public expect fun localeconv(): MutPtr

public expect fun semDestroy(sem: MutPtr): CInt

public expect fun semWait(sem: MutPtr): CInt

public expect fun semTrywait(sem: MutPtr): CInt

public expect fun semPost(sem: MutPtr): CInt

public expect fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt

public expect fun statvfs(path: ConstPtr, buf: MutPtr): CInt

public expect fun fstatvfs(fd: CInt, buf: MutPtr): CInt

public expect fun readlink(path: ConstPtr, buf: MutPtr, bufsz: SizeT): SsizeT

public expect fun sigemptyset(set: MutPtr): CInt

public expect fun sigaddset(set: MutPtr, signum: CInt): CInt

public expect fun sigfillset(set: MutPtr): CInt

public expect fun sigdelset(set: MutPtr, signum: CInt): CInt

public expect fun sigismember(set: ConstPtr, signum: CInt): CInt

public expect fun sigprocmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt

public expect fun sigpending(set: MutPtr): CInt

public expect fun timegm(tm: MutPtr): TimeT

public expect fun getsid(pid: PidT): PidT

public expect fun sysconf(name: CInt): CLong

public expect fun mkfifo(path: ConstPtr, mode: ModeT): CInt

public expect fun pselect(nfds: CInt, readfds: MutPtr, writefds: MutPtr, errorfds: MutPtr, timeout: ConstPtr, sigmask: ConstPtr): CInt

public expect fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: MutPtr): OffT

public expect fun tcdrain(fd: CInt): CInt

public expect fun cfgetispeed(termios: ConstPtr): SpeedT

public expect fun cfgetospeed(termios: ConstPtr): SpeedT

public expect fun cfmakeraw(termios: MutPtr)

public expect fun cfsetispeed(termios: MutPtr, speed: SpeedT): CInt

public expect fun cfsetospeed(termios: MutPtr, speed: SpeedT): CInt

public expect fun cfsetspeed(termios: MutPtr, speed: SpeedT): CInt

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

public expect fun grantpt(fd: CInt): CInt

public expect fun posixOpenpt(flags: CInt): CInt

public expect fun ptsname(fd: CInt): MutPtr

public expect fun unlockpt(fd: CInt): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt

public expect fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt

public expect fun dirfd(dirp: MutPtr): CInt

public expect fun pthreadGetattrNp(native: PthreadT, attr: MutPtr): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt

public expect fun memalign(align: SizeT, size: SizeT): MutPtr

public expect fun setgroups(ngroups: SizeT, ptr: ConstPtr): CInt

public expect fun pipe2(fds: MutPtr, flags: CInt): CInt

public expect fun statfs(path: ConstPtr, buf: MutPtr): CInt

public expect fun fstatfs(fd: CInt, buf: MutPtr): CInt

public expect fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun futimens(fd: CInt, times: ConstPtr): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun fdopendir(fd: CInt): MutPtr

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt

public expect fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt

public expect fun accept4(fd: CInt, addr: MutPtr, len: MutPtr, flg: CInt): CInt

public expect fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun clearenv(): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt

public expect fun setreuid(ruid: UidT, euid: UidT): CInt

public expect fun setregid(rgid: GidT, egid: GidT): CInt

public expect fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt

public expect fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt

public expect fun acct(filename: ConstPtr): CInt

public expect fun brk(addr: MutPtr): CInt

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

public expect fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun lutimes(file: ConstPtr, times: ConstPtr): CInt

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): MutPtr

public expect fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt

// System V IPC
public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr

public expect fun shmdt(shmaddr: ConstPtr): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt

public expect fun ftok(pathname: ConstPtr, projId: CInt): KeyT

public expect fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt

public expect fun semop(semid: CInt, sops: MutPtr, nsops: SizeT): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgrcv(msqid: CInt, msgp: MutPtr, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT

public expect fun msgsnd(msqid: CInt, msgp: ConstPtr, msgsz: SizeT, msgflg: CInt): CInt

public expect fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt

public expect fun errnoLocation(): MutPtr

public expect fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT

public expect fun signalfd(fd: CInt, mask: ConstPtr, flags: CInt): CInt

public expect fun timerfdCreate(clockid: CInt, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currValue: MutPtr): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt

public expect fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT

public expect fun quotactl(cmd: CInt, special: ConstPtr, id: CInt, data: MutPtr): CInt

public expect fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt

public expect fun mkostemp(template: MutPtr, flags: CInt): CInt

public expect fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt

public expect fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt

public expect fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr

public expect fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt

public expect fun reboot(howTo: CInt): CInt

public expect fun setfsgid(gid: GidT): CInt

public expect fun setfsuid(uid: UidT): CInt

// Not available now on Android
public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt

public expect fun ifNameindex(): MutPtr

public expect fun ifFreenameindex(ptr: MutPtr)

public expect fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt

public expect fun getifaddrs(ifap: MutPtr): CInt

public expect fun freeifaddrs(ifa: MutPtr)

public expect fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt

public expect fun globfree(pglob: MutPtr)

public expect fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun shmUnlink(name: ConstPtr): CInt

public expect fun seekdir(dirp: MutPtr, loc: CLong)

public expect fun telldir(dirp: MutPtr): CLong

public expect fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT

public expect fun mkstemps(template: MutPtr, suffixlen: CInt): CInt

public expect fun futimes(fd: CInt, times: ConstPtr): CInt

public expect fun nlLanginfo(item: NlItem): MutPtr

public expect fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt

public expect fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: ConstPtr, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: MutPtr, flags: CInt): SsizeT

public expect fun getdomainname(name: MutPtr, len: SizeT): CInt

public expect fun setdomainname(name: ConstPtr, len: SizeT): CInt

public expect fun vhangup(): CInt

public expect fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt, timeout: MutPtr): CInt

public expect fun sync()

public expect fun syscall(num: CLong, vararg variadicArgs: Long): CLong

public expect fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr): CInt

public expect fun umount(target: ConstPtr): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT

public expect fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt

public expect fun splice(fdIn: CInt, offIn: MutPtr, fdOut: CInt, offOut: MutPtr, len: SizeT, flags: CUint): SsizeT

public expect fun eventfd(initval: CUint, flags: CInt): CInt

public expect fun schedRrGetInterval(pid: PidT, tp: MutPtr): CInt

public expect fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt

public expect fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt

public expect fun schedSetparam(pid: PidT, param: ConstPtr): CInt

public expect fun swapoff(puath: ConstPtr): CInt

public expect fun vmsplice(fd: CInt, iov: ConstPtr, nrSegs: SizeT, flags: CUint): SsizeT

public expect fun mount(src: ConstPtr, target: ConstPtr, fstype: ConstPtr, flags: CUlong, data: ConstPtr): CInt

public expect fun personality(persona: CUlong): CInt

public expect fun schedGetparam(pid: PidT, param: MutPtr): CInt

public expect fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt

public expect fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt

public expect fun clone(cb: CloneCbCallback, childStack: MutPtr, flags: CInt, arg: MutPtr, vararg variadicArgs: Long): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt

public expect fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt

public expect fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt

public expect fun sethostname(name: ConstPtr, len: SizeT): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun umount2(target: ConstPtr, flags: CInt): CInt

public expect fun swapon(path: ConstPtr, swapflags: CInt): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt

public expect fun sigsuspend(mask: ConstPtr): CInt

public expect fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt

public expect fun semClose(sem: MutPtr): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun initgroups(user: ConstPtr, group: GidT): CInt

public expect fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt

public expect fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr

public expect fun getgrnam(name: ConstPtr): MutPtr

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun semUnlink(name: ConstPtr): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun sigwait(set: ConstPtr, sig: MutPtr): CInt

public expect fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt

public expect fun getgrgid(gid: GidT): MutPtr

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): MutPtr

public expect fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt

public expect fun popen(command: ConstPtr, mode: ConstPtr): MutPtr

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt

public expect fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt

public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt
