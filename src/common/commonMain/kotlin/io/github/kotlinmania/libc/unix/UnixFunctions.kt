package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.bsd.FdSet
import io.github.kotlinmania.libc.unix.bsd.UsecondsT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.apple.Dirent
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Addrinfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.DlInfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Lconv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadCondattrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadKeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadMutexattrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadRwlockattrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SpeedT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Tm
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.ClockT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Passwd
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.PthreadCondT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.PthreadMutexT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.PthreadRwlockT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.PthreadT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.PthreadAttrT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Sigaction
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Stat
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.WcharT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664.notx32.Statvfs
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.SemT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.powerpc64.Termios
import io.github.kotlinmania.libc.unix.newlib.aarch64.Sockaddr
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface QsortComparCallback {
    public operator fun invoke(arg0: ConstPtr<CVoid>, arg1: ConstPtr<CVoid>): CInt
}

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>)
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

public expect fun qsort(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortComparCallback?)

public expect fun bsearch(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortComparCallback?): MutPtr<CVoid>

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

public expect fun clearerr(stream: MutPtr<FILE>)

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

public expect fun system(s: ConstPtr<CChar>): CInt

public expect fun getenv(s: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar>

public expect fun stpcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar>

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

public expect fun strndup(cs: ConstPtr<CChar>, n: SizeT): MutPtr<CChar>

public expect fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strcasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt

public expect fun strncasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt

public expect fun strlen(cs: ConstPtr<CChar>): SizeT

public expect fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT

public expect fun strerror(n: CInt): MutPtr<CChar>

public expect fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strtokR(s: MutPtr<CChar>, t: ConstPtr<CChar>, p: MutPtr<MutPtr<CChar>>): MutPtr<CChar>

public expect fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT

public expect fun strsignal(sig: CInt): MutPtr<CChar>

public expect fun wcslen(buf: ConstPtr<WcharT>): SizeT

public expect fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT

public expect fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT>

public expect fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt

public expect fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid>

public expect fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid>

public expect fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun memccpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

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

public expect fun closedir(dirp: MutPtr<DIR>): CInt

public expect fun rewinddir(dirp: MutPtr<DIR>)

public expect fun fchmodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, flags: CInt): CInt

public expect fun fchown(fd: CInt, owner: UidT, group: GidT): CInt

public expect fun fchownat(dirfd: CInt, pathname: ConstPtr<CChar>, owner: UidT, group: GidT, flags: CInt): CInt

public expect fun fstatat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt

public expect fun linkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt

public expect fun renameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt

public expect fun symlinkat(target: ConstPtr<CChar>, newdirfd: CInt, linkpath: ConstPtr<CChar>): CInt

public expect fun unlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt): CInt

public expect fun access(path: ConstPtr<CChar>, amode: CInt): CInt

public expect fun alarm(seconds: CUint): CUint

public expect fun chdir(dir: ConstPtr<CChar>): CInt

public expect fun fchdir(dirfd: CInt): CInt

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

public expect fun pipe(fds: MutPtr<CInt>): CInt

public expect fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, align: SizeT, size: SizeT): CInt

public expect fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun read(fd: CInt, buf: MutPtr<CVoid>, count: SizeT): SsizeT

public expect fun rmdir(path: ConstPtr<CChar>): CInt

public expect fun seteuid(uid: UidT): CInt

public expect fun setegid(gid: GidT): CInt

public expect fun setgid(gid: GidT): CInt

public expect fun setpgid(pid: PidT, pgid: PidT): CInt

public expect fun setsid(): PidT

public expect fun setuid(uid: UidT): CInt

public expect fun setreuid(ruid: UidT, euid: UidT): CInt

public expect fun setregid(rgid: GidT, egid: GidT): CInt

public expect fun sleep(secs: CUint): CUint

public expect fun nanosleep(rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt

public expect fun tcgetpgrp(fd: CInt): PidT

public expect fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt

public expect fun ttyname(fd: CInt): MutPtr<CChar>

public expect fun ttynameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun unlink(c: ConstPtr<CChar>): CInt

public expect fun wait(status: MutPtr<CInt>): PidT

public expect fun waitpid(pid: PidT, status: MutPtr<CInt>, options: CInt): PidT

public expect fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT

public expect fun pread(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: OffT): SsizeT

public expect fun pwrite(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: OffT): SsizeT

public expect fun umask(mask: ModeT): ModeT

public expect fun utime(file: ConstPtr<CChar>, buf: ConstPtr<Utimbuf>): CInt

public expect fun kill(pid: PidT, sig: CInt): CInt

public expect fun killpg(pgrp: PidT, sig: CInt): CInt

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

public expect fun truncate(path: ConstPtr<CChar>, length: OffT): CInt

public expect fun ftruncate(fd: CInt, length: OffT): CInt

public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

public expect fun getrusage(resource: CInt, usage: MutPtr<Rusage>): CInt

public expect fun realpath(pathname: ConstPtr<CChar>, resolved: MutPtr<CChar>): MutPtr<CChar>

public expect fun times(buf: MutPtr<Tms>): ClockT

public expect fun pthreadSelf(): PthreadT

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

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

public expect fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): CInt

public expect fun raise(signum: CInt): CInt

public expect fun utimes(filename: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt

public expect fun dlopen(filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid>

public expect fun dlerror(): MutPtr<CChar>

public expect fun dlsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>): MutPtr<CVoid>

public expect fun dlclose(handle: MutPtr<CVoid>): CInt

public expect fun getaddrinfo(node: ConstPtr<CChar>, service: ConstPtr<CChar>, hints: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): CInt

public expect fun freeaddrinfo(res: MutPtr<Addrinfo>)

public expect fun hstrerror(errcode: CInt): ConstPtr<CChar>

public expect fun gaiStrerror(errcode: CInt): ConstPtr<CChar>

public expect fun resInit(): CInt

public expect fun gmtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm>

public expect fun localtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm>

public expect fun mktime(tm: MutPtr<Tm>): TimeT

public expect fun time(time: MutPtr<TimeT>): TimeT

public expect fun gmtime(timeP: ConstPtr<TimeT>): MutPtr<Tm>

public expect fun localtime(timeP: ConstPtr<TimeT>): MutPtr<Tm>

public expect fun difftime(time1: TimeT, time0: TimeT): CDouble

public expect fun timegm(tm: MutPtr<Tm>): TimeT

public expect fun mknod(pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt

public expect fun gethostname(name: MutPtr<CChar>, len: SizeT): CInt

public expect fun endservent()

public expect fun getservbyname(name: ConstPtr<CChar>, proto: ConstPtr<CChar>): MutPtr<Servent>

public expect fun getservbyport(port: CInt, proto: ConstPtr<CChar>): MutPtr<Servent>

public expect fun getservent(): MutPtr<Servent>

public expect fun setservent(stayopen: CInt)

public expect fun getprotobyname(name: ConstPtr<CChar>): MutPtr<Protoent>

public expect fun getprotobynumber(proto: CInt): MutPtr<Protoent>

public expect fun chroot(name: ConstPtr<CChar>): CInt

public expect fun usleep(secs: UsecondsT): CInt

public expect fun send(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt): SsizeT

public expect fun recv(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt): SsizeT

public expect fun putenv(string: MutPtr<CChar>): CInt

public expect fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: CInt): CInt

public expect fun select(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: MutPtr<Timeval>): CInt

public expect fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar>

public expect fun localeconv(): MutPtr<Lconv>

public expect fun semWait(sem: MutPtr<SemT>): CInt

public expect fun semTrywait(sem: MutPtr<SemT>): CInt

public expect fun semPost(sem: MutPtr<SemT>): CInt

public expect fun statvfs(path: ConstPtr<CChar>, buf: MutPtr<Statvfs>): CInt

public expect fun fstatvfs(fd: CInt, buf: MutPtr<Statvfs>): CInt

public expect fun sigemptyset(set: MutPtr<SigsetT>): CInt

public expect fun sigaddset(set: MutPtr<SigsetT>, signum: CInt): CInt

public expect fun sigfillset(set: MutPtr<SigsetT>): CInt

public expect fun sigdelset(set: MutPtr<SigsetT>, signum: CInt): CInt

public expect fun sigismember(set: ConstPtr<SigsetT>, signum: CInt): CInt

public expect fun sigprocmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt

public expect fun sigpending(set: MutPtr<SigsetT>): CInt

public expect fun sysconf(name: CInt): CLong

public expect fun mkfifo(path: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: MutPtr<FILE>): OffT

public expect fun tcdrain(fd: CInt): CInt

public expect fun cfgetispeed(termios: ConstPtr<Termios>): SpeedT

public expect fun cfgetospeed(termios: ConstPtr<Termios>): SpeedT

public expect fun cfsetispeed(termios: MutPtr<Termios>, speed: SpeedT): CInt

public expect fun cfsetospeed(termios: MutPtr<Termios>, speed: SpeedT): CInt

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

public expect fun nice(incr: CInt): CInt

public expect fun grantpt(fd: CInt): CInt

public expect fun posixOpenpt(flags: CInt): CInt

public expect fun ptsname(fd: CInt): MutPtr<CChar>

public expect fun unlockpt(fd: CInt): CInt

public expect fun strcasestr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar>

public expect fun getline(lineptr: MutPtr<MutPtr<CChar>>, n: MutPtr<SizeT>, stream: MutPtr<FILE>): SsizeT

public expect fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt

public fun htonl(hostlong: UInt): UInt = ((((hostlong) shl 24)) or (((hostlong) and 0x0000FF00u) shl 8) or (((hostlong) shr 8) and 0x0000FF00u) or ((hostlong) shr 24))

public fun htons(hostshort: UShort): UShort = (((((hostshort).toUInt() and 0xFFu) shl 8) or (((hostshort).toUInt() shr 8) and 0xFFu)).toUShort())

public fun ntohl(netlong: UInt): UInt = ((((netlong) shl 24)) or (((netlong) and 0x0000FF00u) shl 8) or (((netlong) shr 8) and 0x0000FF00u) or ((netlong) shr 24))

public fun ntohs(netshort: UShort): UShort = (((((netshort).toUInt() and 0xFFu) shl 8) or (((netshort).toUInt() shr 8) and 0xFFu)).toUShort())

public expect fun adjtime(delta: ConstPtr<Timeval>, olddelta: MutPtr<Timeval>): CInt

public expect fun stpncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar>

public expect fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt

public expect fun confstr(name: CInt, buf: MutPtr<CChar>, len: SizeT): SizeT

public expect fun dladdr(addr: ConstPtr<CVoid>, info: MutPtr<DlInfo>): CInt

public expect fun flock(fd: CInt, operation: CInt): CInt

public expect fun openWmemstream(ptr: MutPtr<MutPtr<WcharT>>, sizeloc: MutPtr<SizeT>): MutPtr<FILE>

public expect fun getsid(pid: PidT): PidT

public expect fun pause(): CInt

public expect fun mkdirat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun openat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt

public expect fun fdopendir(fd: CInt): MutPtr<DIR>

// Note(docs): `<>` breaks line length limit.

/**
 * The 64-bit libc on Solaris and illumos only has readdirR. If a
 * 32-bit Solaris or illumos target is ever created, it should use
 * __posix_readdir_r. See libc(3LIB) on Solaris or illumos:
 * https://illumos.org/man/3lib/libc
 * https://docs.oracle.com/cd/E36784_01/html/E36873/libc-3lib.html
 * https://www.unix.com/man-page/opensolaris/3LIB/libc/
 */
public expect fun readdirR(dirp: MutPtr<DIR>, entry: MutPtr<Dirent>, result: MutPtr<MutPtr<Dirent>>): CInt

public expect fun readlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsiz: SizeT): CInt

public expect fun readlink(path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsz: SizeT): CInt

public expect fun pselect(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: MutPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt

public expect fun sigaction(signum: CInt, act: ConstPtr<Sigaction>, oldact: MutPtr<Sigaction>): CInt

public expect fun fmemopen(buf: MutPtr<CVoid>, size: SizeT, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun openMemstream(ptr: MutPtr<MutPtr<CChar>>, sizeloc: MutPtr<SizeT>): MutPtr<FILE>

public expect fun atexit(cb: AtexitCbCallback): CInt

public expect fun cfmakeraw(termios: MutPtr<Termios>): CInt

public expect fun cfsetspeed(termios: MutPtr<Termios>, speed: SpeedT): CInt

public expect fun fnmatch(pattern: ConstPtr<CChar>, name: ConstPtr<CChar>, flags: CInt): CInt
