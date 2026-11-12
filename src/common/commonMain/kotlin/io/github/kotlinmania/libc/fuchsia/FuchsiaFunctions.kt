package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.fuchsia.aarch64.Stat
import io.github.kotlinmania.libc.fuchsia.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.mem.sizeOfVal
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>)
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: ConstPtr<CChar>, errnum: CInt): CInt
}

public fun interface CloneCbCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>): CInt
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>): MutPtr<CVoid>
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: MutPtr<DlPhdrInfo>, size: SizeT, data: MutPtr<CVoid>): CInt
}

// PUB_STRUCT
// intentionally not public, only used for fdSet
// END_PUB_CONST
public fun fdClr(fd: CInt, set: MutPtr<FdSet>) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U64) * 8
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / size] = cur.fdsBits[fd1 / size] and (1uL shl (fd1 % size)).inv()
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdIsset(fd: CInt, set: ConstPtr<FdSet>): Boolean {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U64) * 8
    return ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] and (1uL shl (fd1 % size))) != 0uL
}

public fun fdSet(fd: CInt, set: MutPtr<FdSet>) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U64) * 8
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / size] = cur.fdsBits[fd1 / size] or (1uL shl (fd1 % size))
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdZero(set: MutPtr<FdSet>) {
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

public fun cmsgData(cmsg: ConstPtr<Cmsghdr>): MutPtr<CUchar> = MutPtr<CUchar>(ConstPtr<CVoid>((cmsg).rawAddress + ((1).toLong() * (Cmsghdr.typeLayout()).strideBytes)).rawAddress, ConstPtr<CVoid>((cmsg).rawAddress + ((1).toLong() * (Cmsghdr.typeLayout()).strideBytes)).rawMeta)

public fun cmsgNxthdr(mhdr: ConstPtr<Msghdr>, cmsg: ConstPtr<Cmsghdr>): MutPtr<Cmsghdr> =
    if ((((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toULong()) < sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()).toULong()) {
        MutPtr<Cmsghdr>(0L)
    } else if (((MutPtr<CVoid>((cmsgNext(cmsg)).rawAddress + ((sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())).toLong() * (PrimitiveLayouts.U8).strideBytes))).rawAddress.toULong() >= (mhdrEnd(mhdr)).rawAddress.toULong())) {
        MutPtr<Cmsghdr>(0L)
    } else {
        MutPtr<Cmsghdr>((cmsgNext(cmsg)).rawAddress)
    }

public fun cmsgFirsthdr(mhdr: ConstPtr<Msghdr>): MutPtr<Cmsghdr> =
    if (((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toULong() >= sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()).toULong()) {
        MutPtr<Cmsghdr>(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress)
    } else {
        MutPtr<Cmsghdr>(0L)
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

public fun cmsgLen(cmsg: ConstPtr<Cmsghdr>): SsizeT = ((((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toULong() + sizeOf<CLong>(typeLayoutT = PrimitiveLayouts.I64).toULong() - 1uL) and (sizeOf<CLong>(typeLayoutT = PrimitiveLayouts.I64).toULong() - 1uL).inv()).toLong()

public fun cmsgNext(cmsg: ConstPtr<Cmsghdr>): MutPtr<CUchar> = MutPtr<CUchar>((ConstPtr<CVoid>((cmsg).rawAddress + ((cmsgLen(cmsg)) * (Cmsghdr.typeLayout()).strideBytes))).rawAddress, (ConstPtr<CVoid>((cmsg).rawAddress + ((cmsgLen(cmsg)) * (Cmsghdr.typeLayout()).strideBytes))).rawMeta)

public fun mhdrEnd(mhdr: ConstPtr<Msghdr>): MutPtr<CUchar> = MutPtr<CUchar>((MutPtr<CVoid>(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress + ((((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()).toLong() * (PrimitiveLayouts.U8).strideBytes))).rawAddress)

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

public expect fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE>

public expect fun fflush(file: MutPtr<FILE>): CInt

public expect fun fclose(file: MutPtr<FILE>): CInt

public expect fun remove(filename: ConstPtr<CChar>): CInt

public expect fun rename(oldname: ConstPtr<CChar>, newname: ConstPtr<CChar>): CInt

public expect fun tmpfile(): MutPtr<FILE>

public expect fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt

public expect fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>)

public expect fun getchar(): CInt

public expect fun putchar(c: CInt): CInt

public expect fun fgetc(stream: MutPtr<FILE>): CInt

public expect fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar>

public expect fun fputc(c: CInt, stream: MutPtr<FILE>): CInt

public expect fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt

public expect fun puts(s: ConstPtr<CChar>): CInt

public expect fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt

public expect fun fread(ptr: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT

public expect fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT

public expect fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt

public expect fun ftell(stream: MutPtr<FILE>): CLong

public expect fun rewind(stream: MutPtr<FILE>)

public expect fun fgetpos(stream: MutPtr<FILE>, ptr: MutPtr<FposT>): CInt

public expect fun fsetpos(stream: MutPtr<FILE>, ptr: ConstPtr<FposT>): CInt

public expect fun feof(stream: MutPtr<FILE>): CInt

public expect fun ferror(stream: MutPtr<FILE>): CInt

public expect fun perror(s: ConstPtr<CChar>)

public expect fun atof(s: ConstPtr<CChar>): CDouble

public expect fun atoi(s: ConstPtr<CChar>): CInt

public expect fun atol(s: ConstPtr<CChar>): CLong

public expect fun atoll(s: ConstPtr<CChar>): CLonglong

public expect fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble

public expect fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat

public expect fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong

public expect fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong

public expect fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong

public expect fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong

public expect fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun malloc(size: SizeT): MutPtr<CVoid>

public expect fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid>

public expect fun free(p: MutPtr<CVoid>)

public expect fun abort(): Nothing

public expect fun exit(status: CInt): Nothing

public expect fun atexit(cb: SigactionSaRestorerCallback): CInt

public expect fun system(s: ConstPtr<CChar>): CInt

public expect fun getenv(s: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar>

public expect fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar>

public expect fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt

public expect fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt

public expect fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt

public expect fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar>

public expect fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar>

public expect fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT

public expect fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT

public expect fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strlen(cs: ConstPtr<CChar>): SizeT

public expect fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT

public expect fun strerror(n: CInt): MutPtr<CChar>

public expect fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT

public expect fun wcslen(buf: ConstPtr<WcharT>): SizeT

public expect fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT

public expect fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT>

public expect fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt

public expect fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid>

public expect fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid>

public expect fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun getpwnam(name: ConstPtr<CChar>): MutPtr<Passwd>

public expect fun getpwuid(uid: UidT): MutPtr<Passwd>

public expect fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun getcharUnlocked(): CInt

public expect fun putcharUnlocked(c: CInt): CInt

public expect fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt

public expect fun connect(socket: CInt, address: ConstPtr<Sockaddr>, len: SocklenT): CInt

public expect fun listen(socket: CInt, backlog: CInt): CInt

public expect fun accept(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt

public expect fun getpeername(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt

public expect fun getsockname(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt

public expect fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr<CVoid>, optionLen: SocklenT): CInt

public expect fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: MutPtr<CInt>): CInt

public expect fun sendto(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): SsizeT

public expect fun shutdown(socket: CInt, how: CInt): CInt

public expect fun chmod(path: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun fchmod(fd: CInt, mode: ModeT): CInt

public expect fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt

public expect fun mkdir(path: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt

public expect fun pclose(stream: MutPtr<FILE>): CInt

public expect fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun fileno(stream: MutPtr<FILE>): CInt

public expect fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun creat(path: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun opendir(dirname: ConstPtr<CChar>): MutPtr<DIR>

public expect fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent>

public expect fun readdirR(dirp: MutPtr<DIR>, entry: MutPtr<Dirent>, result: MutPtr<MutPtr<Dirent>>): CInt

public expect fun closedir(dirp: MutPtr<DIR>): CInt

public expect fun rewinddir(dirp: MutPtr<DIR>)

public expect fun openat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt

public expect fun fchmodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, flags: CInt): CInt

public expect fun fchown(fd: CInt, owner: UidT, group: GidT): CInt

public expect fun fchownat(dirfd: CInt, pathname: ConstPtr<CChar>, owner: UidT, group: GidT, flags: CInt): CInt

public expect fun fstatat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt

public expect fun linkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt

public expect fun mkdirat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun readlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsiz: SizeT): SsizeT

public expect fun renameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt

public expect fun symlinkat(target: ConstPtr<CChar>, newdirfd: CInt, linkpath: ConstPtr<CChar>): CInt

public expect fun unlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt): CInt

public expect fun access(path: ConstPtr<CChar>, amode: CInt): CInt

public expect fun alarm(seconds: CUint): CUint

public expect fun chdir(dir: ConstPtr<CChar>): CInt

public expect fun chown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt

public expect fun lchown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt

public expect fun close(fd: CInt): CInt

public expect fun dup(fd: CInt): CInt

public expect fun dup2(src: CInt, dst: CInt): CInt

public expect fun execl(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun execle(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun execlp(file: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execv(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt

public expect fun execve(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt

public expect fun execvp(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt

public expect fun fork(): PidT

public expect fun fpathconf(filedes: CInt, name: CInt): CLong

public expect fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar>

public expect fun getegid(): GidT

public expect fun geteuid(): UidT

public expect fun getgid(): GidT

public expect fun getgroups(ngroupsMax: CInt, groups: MutPtr<GidT>): CInt

public expect fun getlogin(): MutPtr<CChar>

public expect fun getopt(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstr: ConstPtr<CChar>): CInt

public expect fun getpgid(pid: PidT): PidT

public expect fun getpgrp(): PidT

public expect fun getpid(): PidT

public expect fun getppid(): PidT

public expect fun getuid(): UidT

public expect fun isatty(fd: CInt): CInt

public expect fun link(src: ConstPtr<CChar>, dst: ConstPtr<CChar>): CInt

public expect fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT

public expect fun pathconf(path: ConstPtr<CChar>, name: CInt): CLong

public expect fun pause(): CInt

public expect fun pipe(fds: MutPtr<CInt>): CInt

public expect fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, align: SizeT, size: SizeT): CInt

public expect fun read(fd: CInt, buf: MutPtr<CVoid>, count: SizeT): SsizeT

public expect fun rmdir(path: ConstPtr<CChar>): CInt

public expect fun seteuid(uid: UidT): CInt

public expect fun setegid(gid: GidT): CInt

public expect fun setgid(gid: GidT): CInt

public expect fun setpgid(pid: PidT, pgid: PidT): CInt

public expect fun setsid(): PidT

public expect fun setuid(uid: UidT): CInt

public expect fun sleep(secs: CUint): CUint

public expect fun nanosleep(rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt

public expect fun tcgetpgrp(fd: CInt): PidT

public expect fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt

public expect fun ttyname(fd: CInt): MutPtr<CChar>

public expect fun unlink(c: ConstPtr<CChar>): CInt

public expect fun wait(status: MutPtr<CInt>): PidT

public expect fun waitpid(pid: PidT, status: MutPtr<CInt>, options: CInt): PidT

public expect fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT

public expect fun pread(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: OffT): SsizeT

public expect fun pwrite(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: OffT): SsizeT

public expect fun umask(mask: ModeT): ModeT

public expect fun utime(file: ConstPtr<CChar>, buf: ConstPtr<Utimbuf>): CInt

public expect fun kill(pid: PidT, sig: CInt): CInt

public expect fun mlock(addr: ConstPtr<CVoid>, len: SizeT): CInt

public expect fun munlock(addr: ConstPtr<CVoid>, len: SizeT): CInt

public expect fun mlockall(flags: CInt): CInt

public expect fun munlockall(): CInt

public expect fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid>

public expect fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt

public expect fun ifNametoindex(ifname: ConstPtr<CChar>): CUint

public expect fun ifIndextoname(ifindex: CUint, ifname: MutPtr<CChar>): MutPtr<CChar>

public expect fun lstat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt

public expect fun fsync(fd: CInt): CInt

public expect fun setenv(name: ConstPtr<CChar>, value: ConstPtr<CChar>, overwrite: CInt): CInt

public expect fun unsetenv(name: ConstPtr<CChar>): CInt

public expect fun symlink(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>): CInt

public expect fun ftruncate(fd: CInt, length: OffT): CInt

public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

public expect fun realpath(pathname: ConstPtr<CChar>, resolved: MutPtr<CChar>): MutPtr<CChar>

public expect fun flock(fd: CInt, operation: CInt): CInt

public expect fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt

public expect fun times(buf: MutPtr<Tms>): ClockT

public expect fun pthreadSelf(): PthreadT

public expect fun pthreadJoin(native: PthreadT, value: MutPtr<MutPtr<CVoid>>): CInt

public expect fun pthreadExit(value: MutPtr<CVoid>): Nothing

public expect fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt

public expect fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt

public expect fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, stacksize: MutPtr<SizeT>): CInt

public expect fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stackSize: SizeT): CInt

public expect fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, state: CInt): CInt

public expect fun pthreadDetach(thread: PthreadT): CInt

public expect fun schedYield(): CInt

public expect fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt

public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

public expect fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid>

public expect fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt

public expect fun pthreadMutexInit(lock: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt

public expect fun pthreadMutexDestroy(lock: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexLock(lock: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexTrylock(lock: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexUnlock(lock: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt

public expect fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt

public expect fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, type: CInt): CInt

public expect fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt

public expect fun pthreadCondWait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt

public expect fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt

public expect fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt

public expect fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt

public expect fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt

public expect fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt

public expect fun pthreadRwlockInit(lock: MutPtr<PthreadRwlockT>, attr: ConstPtr<PthreadRwlockattrT>): CInt

public expect fun pthreadRwlockDestroy(lock: MutPtr<PthreadRwlockT>): CInt

public expect fun pthreadRwlockRdlock(lock: MutPtr<PthreadRwlockT>): CInt

public expect fun pthreadRwlockTryrdlock(lock: MutPtr<PthreadRwlockT>): CInt

public expect fun pthreadRwlockWrlock(lock: MutPtr<PthreadRwlockT>): CInt

public expect fun pthreadRwlockTrywrlock(lock: MutPtr<PthreadRwlockT>): CInt

public expect fun pthreadRwlockUnlock(lock: MutPtr<PthreadRwlockT>): CInt

public expect fun pthreadRwlockattrInit(attr: MutPtr<PthreadRwlockattrT>): CInt

public expect fun pthreadRwlockattrDestroy(attr: MutPtr<PthreadRwlockattrT>): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): CInt

public expect fun raise(signum: CInt): CInt

public expect fun sigaction(signum: CInt, act: ConstPtr<Sigaction>, oldact: MutPtr<Sigaction>): CInt

public expect fun utimes(filename: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt

public expect fun dlopen(filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid>

public expect fun dlerror(): MutPtr<CChar>

public expect fun dlsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>): MutPtr<CVoid>

public expect fun dlclose(handle: MutPtr<CVoid>): CInt

public expect fun dladdr(addr: ConstPtr<CVoid>, info: MutPtr<DlInfo>): CInt

public expect fun getaddrinfo(node: ConstPtr<CChar>, service: ConstPtr<CChar>, hints: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): CInt

public expect fun freeaddrinfo(res: MutPtr<Addrinfo>)

public expect fun gaiStrerror(errcode: CInt): ConstPtr<CChar>

public expect fun resInit(): CInt

public expect fun gmtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm>

public expect fun localtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm>

public expect fun mktime(tm: MutPtr<Tm>): TimeT

public expect fun time(time: MutPtr<TimeT>): TimeT

public expect fun gmtime(timeP: ConstPtr<TimeT>): MutPtr<Tm>

public expect fun localtime(timeP: ConstPtr<TimeT>): MutPtr<Tm>

public expect fun mknod(pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt

public expect fun uname(buf: MutPtr<Utsname>): CInt

public expect fun gethostname(name: MutPtr<CChar>, len: SizeT): CInt

public expect fun getservbyname(name: ConstPtr<CChar>, proto: ConstPtr<CChar>): MutPtr<Servent>

public expect fun getprotobyname(name: ConstPtr<CChar>): MutPtr<Protoent>

public expect fun getprotobynumber(proto: CInt): MutPtr<Protoent>

public expect fun usleep(secs: CUint): CInt

public expect fun send(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt): SsizeT

public expect fun recv(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt): SsizeT

public expect fun putenv(string: MutPtr<CChar>): CInt

public expect fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: CInt): CInt

public expect fun select(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: MutPtr<Timeval>): CInt

public expect fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar>

public expect fun localeconv(): MutPtr<Lconv>

public expect fun semDestroy(sem: MutPtr<SemT>): CInt

public expect fun semWait(sem: MutPtr<SemT>): CInt

public expect fun semTrywait(sem: MutPtr<SemT>): CInt

public expect fun semPost(sem: MutPtr<SemT>): CInt

public expect fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt

public expect fun statvfs(path: ConstPtr<CChar>, buf: MutPtr<Statvfs>): CInt

public expect fun fstatvfs(fd: CInt, buf: MutPtr<Statvfs>): CInt

public expect fun readlink(path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsz: SizeT): SsizeT

public expect fun sigemptyset(set: MutPtr<SigsetT>): CInt

public expect fun sigaddset(set: MutPtr<SigsetT>, signum: CInt): CInt

public expect fun sigfillset(set: MutPtr<SigsetT>): CInt

public expect fun sigdelset(set: MutPtr<SigsetT>, signum: CInt): CInt

public expect fun sigismember(set: ConstPtr<SigsetT>, signum: CInt): CInt

public expect fun sigprocmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt

public expect fun sigpending(set: MutPtr<SigsetT>): CInt

public expect fun timegm(tm: MutPtr<Tm>): TimeT

public expect fun getsid(pid: PidT): PidT

public expect fun sysconf(name: CInt): CLong

public expect fun mkfifo(path: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun pselect(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt

public expect fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: MutPtr<FILE>): OffT

public expect fun tcdrain(fd: CInt): CInt

public expect fun cfgetispeed(termios: ConstPtr<Termios>): SpeedT

public expect fun cfgetospeed(termios: ConstPtr<Termios>): SpeedT

public expect fun cfmakeraw(termios: MutPtr<Termios>)

public expect fun cfsetispeed(termios: MutPtr<Termios>, speed: SpeedT): CInt

public expect fun cfsetospeed(termios: MutPtr<Termios>, speed: SpeedT): CInt

public expect fun cfsetspeed(termios: MutPtr<Termios>, speed: SpeedT): CInt

public expect fun tcgetattr(fd: CInt, termios: MutPtr<Termios>): CInt

public expect fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr<Termios>): CInt

public expect fun tcflow(fd: CInt, action: CInt): CInt

public expect fun tcflush(fd: CInt, action: CInt): CInt

public expect fun tcgetsid(fd: CInt): PidT

public expect fun tcsendbreak(fd: CInt, duration: CInt): CInt

public expect fun mkstemp(template: MutPtr<CChar>): CInt

public expect fun mkdtemp(template: MutPtr<CChar>): MutPtr<CChar>

public expect fun tmpnam(ptr: MutPtr<CChar>): MutPtr<CChar>

public expect fun openlog(ident: ConstPtr<CChar>, logopt: CInt, facility: CInt)

public expect fun closelog()

public expect fun setlogmask(maskpri: CInt): CInt

public expect fun syslog(priority: CInt, message: ConstPtr<CChar>, vararg variadicArgs: Long)

public expect fun grantpt(fd: CInt): CInt

public expect fun posixOpenpt(flags: CInt): CInt

public expect fun ptsname(fd: CInt): MutPtr<CChar>

public expect fun unlockpt(fd: CInt): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt

public expect fun dirfd(dirp: MutPtr<DIR>): CInt

public expect fun pthreadGetattrNp(native: PthreadT, attr: MutPtr<PthreadAttrT>): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt

public expect fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun setgroups(ngroups: SizeT, ptr: ConstPtr<GidT>): CInt

public expect fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt

public expect fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt

public expect fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt

public expect fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun fdopendir(fd: CInt): MutPtr<DIR>

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt

public expect fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt

public expect fun accept4(fd: CInt, addr: MutPtr<Sockaddr>, len: MutPtr<SocklenT>, flg: CInt): CInt

public expect fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun clearenv(): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt

public expect fun setreuid(ruid: UidT, euid: UidT): CInt

public expect fun setregid(rgid: GidT, egid: GidT): CInt

public expect fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt

public expect fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt

public expect fun acct(filename: ConstPtr<CChar>): CInt

public expect fun brk(addr: MutPtr<CVoid>): CInt

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

public expect fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt

public expect fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt

public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): MutPtr<Passwd>

public expect fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt

// System V IPC
public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid>

public expect fun shmdt(shmaddr: ConstPtr<CVoid>): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt

public expect fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT

public expect fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt

public expect fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT

public expect fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt

public expect fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt

public expect fun errnoLocation(): MutPtr<CInt>

public expect fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT

public expect fun signalfd(fd: CInt, mask: ConstPtr<SigsetT>, flags: CInt): CInt

public expect fun timerfdCreate(clockid: CInt, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt

public expect fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT

public expect fun quotactl(cmd: CInt, special: ConstPtr<CChar>, id: CInt, data: MutPtr<CChar>): CInt

public expect fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt

public expect fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt

public expect fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt

public expect fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt

public expect fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar>

public expect fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt

public expect fun reboot(howTo: CInt): CInt

public expect fun setfsgid(gid: GidT): CInt

public expect fun setfsuid(uid: UidT): CInt

// Not available now on Android
public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun ifNameindex(): MutPtr<IfNameindex>

public expect fun ifFreenameindex(ptr: MutPtr<IfNameindex>)

public expect fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt

public expect fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt

public expect fun freeifaddrs(ifa: MutPtr<Ifaddrs>)

public expect fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt

public expect fun globfree(pglob: MutPtr<GlobT>)

public expect fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt

public expect fun shmUnlink(name: ConstPtr<CChar>): CInt

public expect fun seekdir(dirp: MutPtr<DIR>, loc: CLong)

public expect fun telldir(dirp: MutPtr<DIR>): CLong

public expect fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT

public expect fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt

public expect fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt

public expect fun nlLanginfo(item: NlItem): MutPtr<CChar>

public expect fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt

public expect fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT

public expect fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt

public expect fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt

public expect fun vhangup(): CInt

public expect fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt

public expect fun sync()

public expect fun syscall(num: CLong, vararg variadicArgs: Long): CLong

public expect fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt

public expect fun umount(target: ConstPtr<CChar>): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT

public expect fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt

public expect fun splice(fdIn: CInt, offIn: MutPtr<LoffT>, fdOut: CInt, offOut: MutPtr<LoffT>, len: SizeT, flags: CUint): SsizeT

public expect fun eventfd(initval: CUint, flags: CInt): CInt

public expect fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt

public expect fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt

public expect fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt

public expect fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt

public expect fun swapoff(puath: ConstPtr<CChar>): CInt

public expect fun vmsplice(fd: CInt, iov: ConstPtr<Iovec>, nrSegs: SizeT, flags: CUint): SsizeT

public expect fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, fstype: ConstPtr<CChar>, flags: CUlong, data: ConstPtr<CVoid>): CInt

public expect fun personality(persona: CUlong): CInt

public expect fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt

public expect fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt

public expect fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt

public expect fun clone(cb: CloneCbCallback, childStack: MutPtr<CVoid>, flags: CInt, arg: MutPtr<CVoid>, vararg variadicArgs: Long): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt

public expect fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt

public expect fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt

public expect fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun umount2(target: ConstPtr<CChar>, flags: CInt): CInt

public expect fun swapon(path: ConstPtr<CChar>, swapflags: CInt): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun sigsuspend(mask: ConstPtr<SigsetT>): CInt

public expect fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt

public expect fun semClose(sem: MutPtr<SemT>): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt

public expect fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt

public expect fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT>

public expect fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group>

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun semUnlink(name: ConstPtr<CChar>): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt

public expect fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt

public expect fun getgrgid(gid: GidT): MutPtr<Group>

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): MutPtr<Group>

public expect fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt

public expect fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt

public expect fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt

public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt
