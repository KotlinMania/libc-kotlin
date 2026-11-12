@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object UnixJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixIsalnum(c: Int): Int

    @JvmStatic
    external fun libcUnixIsalpha(c: Int): Int

    @JvmStatic
    external fun libcUnixIscntrl(c: Int): Int

    @JvmStatic
    external fun libcUnixIsdigit(c: Int): Int

    @JvmStatic
    external fun libcUnixIsgraph(c: Int): Int

    @JvmStatic
    external fun libcUnixIslower(c: Int): Int

    @JvmStatic
    external fun libcUnixIsprint(c: Int): Int

    @JvmStatic
    external fun libcUnixIspunct(c: Int): Int

    @JvmStatic
    external fun libcUnixIsspace(c: Int): Int

    @JvmStatic
    external fun libcUnixIsupper(c: Int): Int

    @JvmStatic
    external fun libcUnixIsxdigit(c: Int): Int

    @JvmStatic
    external fun libcUnixIsblank(c: Int): Int

    @JvmStatic
    external fun libcUnixTolower(c: Int): Int

    @JvmStatic
    external fun libcUnixToupper(c: Int): Int

    @JvmStatic
    external fun libcUnixQsort(base: Long, num: Long, size: Long, compar: Long)

    @JvmStatic
    external fun libcUnixBsearch(key: Long, base: Long, num: Long, size: Long, compar: Long): Long

    @JvmStatic
    external fun libcUnixFopen(filename: Long, mode: Long): Long

    @JvmStatic
    external fun libcUnixFreopen(filename: Long, mode: Long, file: Long): Long

    @JvmStatic
    external fun libcUnixFflush(file: Long): Int

    @JvmStatic
    external fun libcUnixFclose(file: Long): Int

    @JvmStatic
    external fun libcUnixRemove(filename: Long): Int

    @JvmStatic
    external fun libcUnixRename(oldname: Long, newname: Long): Int

    @JvmStatic
    external fun libcUnixTmpfile(): Long

    @JvmStatic
    external fun libcUnixSetvbuf(stream: Long, buffer: Long, mode: Int, size: Long): Int

    @JvmStatic
    external fun libcUnixSetbuf(stream: Long, buf: Long)

    @JvmStatic
    external fun libcUnixGetchar(): Int

    @JvmStatic
    external fun libcUnixPutchar(c: Int): Int

    @JvmStatic
    external fun libcUnixFgetc(stream: Long): Int

    @JvmStatic
    external fun libcUnixFgets(buf: Long, n: Int, stream: Long): Long

    @JvmStatic
    external fun libcUnixFputc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libcUnixFputs(s: Long, stream: Long): Int

    @JvmStatic
    external fun libcUnixPuts(s: Long): Int

    @JvmStatic
    external fun libcUnixUngetc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libcUnixFread(ptr: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libcUnixFwrite(ptr: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libcUnixFseek(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libcUnixFtell(stream: Long): Long

    @JvmStatic
    external fun libcUnixRewind(stream: Long)

    @JvmStatic
    external fun libcUnixFgetpos(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libcUnixFsetpos(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libcUnixFeof(stream: Long): Int

    @JvmStatic
    external fun libcUnixFerror(stream: Long): Int

    @JvmStatic
    external fun libcUnixClearerr(stream: Long)

    @JvmStatic
    external fun libcUnixPerror(s: Long)

    @JvmStatic
    external fun libcUnixAtof(s: Long): Double

    @JvmStatic
    external fun libcUnixAtoi(s: Long): Int

    @JvmStatic
    external fun libcUnixAtol(s: Long): Long

    @JvmStatic
    external fun libcUnixAtoll(s: Long): Long

    @JvmStatic
    external fun libcUnixStrtod(s: Long, endp: Long): Double

    @JvmStatic
    external fun libcUnixStrtof(s: Long, endp: Long): Float

    @JvmStatic
    external fun libcUnixStrtol(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcUnixStrtoll(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcUnixStrtoul(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcUnixStrtoull(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcUnixCalloc(nobj: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixMalloc(size: Long): Long

    @JvmStatic
    external fun libcUnixRealloc(p: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixFree(p: Long)

    @JvmStatic
    external fun libcUnixAbort()

    @JvmStatic
    external fun libcUnixExit(status: Int)

    @JvmStatic
    external fun libcUnixSystem(s: Long): Int

    @JvmStatic
    external fun libcUnixGetenv(s: Long): Long

    @JvmStatic
    external fun libcUnixStrcpy(dst: Long, src: Long): Long

    @JvmStatic
    external fun libcUnixStrncpy(dst: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcUnixStpcpy(dst: Long, src: Long): Long

    @JvmStatic
    external fun libcUnixStrcat(s: Long, ct: Long): Long

    @JvmStatic
    external fun libcUnixStrncat(s: Long, ct: Long, n: Long): Long

    @JvmStatic
    external fun libcUnixStrcmp(cs: Long, ct: Long): Int

    @JvmStatic
    external fun libcUnixStrncmp(cs: Long, ct: Long, n: Long): Int

    @JvmStatic
    external fun libcUnixStrcoll(cs: Long, ct: Long): Int

    @JvmStatic
    external fun libcUnixStrchr(cs: Long, c: Int): Long

    @JvmStatic
    external fun libcUnixStrrchr(cs: Long, c: Int): Long

    @JvmStatic
    external fun libcUnixStrspn(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcUnixStrcspn(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcUnixStrdup(cs: Long): Long

    @JvmStatic
    external fun libcUnixStrndup(cs: Long, n: Long): Long

    @JvmStatic
    external fun libcUnixStrpbrk(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcUnixStrstr(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcUnixStrcasecmp(s1: Long, s2: Long): Int

    @JvmStatic
    external fun libcUnixStrncasecmp(s1: Long, s2: Long, n: Long): Int

    @JvmStatic
    external fun libcUnixStrlen(cs: Long): Long

    @JvmStatic
    external fun libcUnixStrnlen(cs: Long, maxlen: Long): Long

    @JvmStatic
    external fun libcUnixStrerror(n: Int): Long

    @JvmStatic
    external fun libcUnixStrtok(s: Long, t: Long): Long

    @JvmStatic
    external fun libcUnixStrtokR(s: Long, t: Long, p: Long): Long

    @JvmStatic
    external fun libcUnixStrxfrm(s: Long, ct: Long, n: Long): Long

    @JvmStatic
    external fun libcUnixStrsignal(sig: Int): Long

    @JvmStatic
    external fun libcUnixWcslen(buf: Long): Long

    @JvmStatic
    external fun libcUnixWcstombs(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcUnixMemchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcUnixWmemchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcUnixMemcmp(cx: Long, ct: Long, n: Long): Int

    @JvmStatic
    external fun libcUnixMemcpy(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcUnixMemmove(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcUnixMemset(dest: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcUnixMemccpy(dest: Long, src: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcUnixGetpwnam(name: Long): Long

    @JvmStatic
    external fun libcUnixGetpwuid(uid: Short): Long

    @JvmStatic
    external fun libcUnixFprintf(stream: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixPrintf(format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixSnprintf(s: Long, n: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixSprintf(s: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixFscanf(stream: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixScanf(format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixSscanf(s: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixGetcharUnlocked(): Int

    @JvmStatic
    external fun libcUnixPutcharUnlocked(c: Int): Int

    @JvmStatic
    external fun libcUnixSocket(domain: Int, ty: Int, protocol: Int): Int

    @JvmStatic
    external fun libcUnixConnect(socket: Int, address: Long, len: Int): Int

    @JvmStatic
    external fun libcUnixListen(socket: Int, backlog: Int): Int

    @JvmStatic
    external fun libcUnixAccept(socket: Int, address: Long, addressLen: Long): Int

    @JvmStatic
    external fun libcUnixGetpeername(socket: Int, address: Long, addressLen: Long): Int

    @JvmStatic
    external fun libcUnixGetsockname(socket: Int, address: Long, addressLen: Long): Int

    @JvmStatic
    external fun libcUnixSetsockopt(socket: Int, level: Int, name: Int, value: Long, optionLen: Int): Int

    @JvmStatic
    external fun libcUnixSocketpair(domain: Int, type: Int, protocol: Int, socketVector: Long): Int

    @JvmStatic
    external fun libcUnixSendto(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Int): Long

    @JvmStatic
    external fun libcUnixShutdown(socket: Int, how: Int): Int

    @JvmStatic
    external fun libcUnixChmod(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixFchmod(fd: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixFstat(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixMkdir(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixStat(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixPclose(stream: Long): Int

    @JvmStatic
    external fun libcUnixFdopen(fd: Int, mode: Long): Long

    @JvmStatic
    external fun libcUnixFileno(stream: Long): Int

    @JvmStatic
    external fun libcUnixOpen(path: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixCreat(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixFcntl(fd: Int, cmd: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixOpendir(dirname: Long): Long

    @JvmStatic
    external fun libcUnixReaddir(dirp: Long): Long

    @JvmStatic
    external fun libcUnixClosedir(dirp: Long): Int

    @JvmStatic
    external fun libcUnixRewinddir(dirp: Long)

    @JvmStatic
    external fun libcUnixFchmodat(dirfd: Int, pathname: Long, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixFchown(fd: Int, owner: Short, group: Short): Int

    @JvmStatic
    external fun libcUnixFchownat(dirfd: Int, pathname: Long, owner: Short, group: Short, flags: Int): Int

    @JvmStatic
    external fun libcUnixFstatat(dirfd: Int, pathname: Long, buf: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinkat(olddirfd: Int, oldpath: Long, newdirfd: Int, newpath: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixRenameat(olddirfd: Int, oldpath: Long, newdirfd: Int, newpath: Long): Int

    @JvmStatic
    external fun libcUnixSymlinkat(target: Long, newdirfd: Int, linkpath: Long): Int

    @JvmStatic
    external fun libcUnixUnlinkat(dirfd: Int, pathname: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixAccess(path: Long, amode: Int): Int

    @JvmStatic
    external fun libcUnixAlarm(seconds: Int): Int

    @JvmStatic
    external fun libcUnixChdir(dir: Long): Int

    @JvmStatic
    external fun libcUnixFchdir(dirfd: Int): Int

    @JvmStatic
    external fun libcUnixChown(path: Long, uid: Short, gid: Short): Int

    @JvmStatic
    external fun libcUnixLchown(path: Long, uid: Short, gid: Short): Int

    @JvmStatic
    external fun libcUnixClose(fd: Int): Int

    @JvmStatic
    external fun libcUnixDup(fd: Int): Int

    @JvmStatic
    external fun libcUnixDup2(src: Int, dst: Int): Int

    @JvmStatic
    external fun libcUnixExecl(path: Long, arg0: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixExecle(path: Long, arg0: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixExeclp(file: Long, arg0: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixExecv(prog: Long, argv: Long): Int

    @JvmStatic
    external fun libcUnixExecve(prog: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixExecvp(c: Long, argv: Long): Int

    @JvmStatic
    external fun libcUnixFork(): Int

    @JvmStatic
    external fun libcUnixFpathconf(filedes: Int, name: Int): Long

    @JvmStatic
    external fun libcUnixGetcwd(buf: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixGetegid(): Short

    @JvmStatic
    external fun libcUnixGeteuid(): Short

    @JvmStatic
    external fun libcUnixGetgid(): Short

    @JvmStatic
    external fun libcUnixGetgroups(ngroupsMax: Int, groups: Long): Int

    @JvmStatic
    external fun libcUnixGetlogin(): Long

    @JvmStatic
    external fun libcUnixGetopt(argc: Int, argv: Long, optstr: Long): Int

    @JvmStatic
    external fun libcUnixGetpgid(pid: Int): Int

    @JvmStatic
    external fun libcUnixGetpgrp(): Int

    @JvmStatic
    external fun libcUnixGetpid(): Int

    @JvmStatic
    external fun libcUnixGetppid(): Int

    @JvmStatic
    external fun libcUnixGetuid(): Short

    @JvmStatic
    external fun libcUnixIsatty(fd: Int): Int

    @JvmStatic
    external fun libcUnixLink(src: Long, dst: Long): Int

    @JvmStatic
    external fun libcUnixLseek(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libcUnixPathconf(path: Long, name: Int): Long

    @JvmStatic
    external fun libcUnixPipe(fds: Long): Int

    @JvmStatic
    external fun libcUnixPosixMemalign(memptr: Long, align: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixAlignedAlloc(alignment: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixRead(fd: Int, buf: Long, count: Long): Long

    @JvmStatic
    external fun libcUnixRmdir(path: Long): Int

    @JvmStatic
    external fun libcUnixSeteuid(uid: Short): Int

    @JvmStatic
    external fun libcUnixSetegid(gid: Short): Int

    @JvmStatic
    external fun libcUnixSetgid(gid: Short): Int

    @JvmStatic
    external fun libcUnixSetpgid(pid: Int, pgid: Int): Int

    @JvmStatic
    external fun libcUnixSetsid(): Int

    @JvmStatic
    external fun libcUnixSetuid(uid: Short): Int

    @JvmStatic
    external fun libcUnixSetreuid(ruid: Short, euid: Short): Int

    @JvmStatic
    external fun libcUnixSetregid(rgid: Short, egid: Short): Int

    @JvmStatic
    external fun libcUnixSleep(secs: Int): Int

    @JvmStatic
    external fun libcUnixNanosleep(rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libcUnixTcgetpgrp(fd: Int): Int

    @JvmStatic
    external fun libcUnixTcsetpgrp(fd: Int, pgrp: Int): Int

    @JvmStatic
    external fun libcUnixTtyname(fd: Int): Long

    @JvmStatic
    external fun libcUnixTtynameR(fd: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixUnlink(c: Long): Int

    @JvmStatic
    external fun libcUnixWait(status: Long): Int

    @JvmStatic
    external fun libcUnixWaitpid(pid: Int, status: Long, options: Int): Int

    @JvmStatic
    external fun libcUnixWrite(fd: Int, buf: Long, count: Long): Long

    @JvmStatic
    external fun libcUnixPread(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libcUnixPwrite(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libcUnixUmask(mask: Int): Int

    @JvmStatic
    external fun libcUnixUtime(file: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixKill(pid: Int, sig: Int): Int

    @JvmStatic
    external fun libcUnixKillpg(pgrp: Int, sig: Int): Int

    @JvmStatic
    external fun libcUnixMlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixMunlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixMlockall(flags: Int): Int

    @JvmStatic
    external fun libcUnixMunlockall(): Int

    @JvmStatic
    external fun libcUnixMmap(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixMunmap(addr: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixIfNametoindex(ifname: Long): Int

    @JvmStatic
    external fun libcUnixIfIndextoname(ifindex: Int, ifname: Long): Long

    @JvmStatic
    external fun libcUnixLstat(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixFsync(fd: Int): Int

    @JvmStatic
    external fun libcUnixSetenv(name: Long, value: Long, overwrite: Int): Int

    @JvmStatic
    external fun libcUnixUnsetenv(name: Long): Int

    @JvmStatic
    external fun libcUnixSymlink(path1: Long, path2: Long): Int

    @JvmStatic
    external fun libcUnixTruncate(path: Long, length: Long): Int

    @JvmStatic
    external fun libcUnixFtruncate(fd: Int, length: Long): Int

    @JvmStatic
    external fun libcUnixSignal(signum: Int, handler: Long): Long

    @JvmStatic
    external fun libcUnixGetrusage(resource: Int, usage: Long): Int

    @JvmStatic
    external fun libcUnixRealpath(pathname: Long, resolved: Long): Long

    @JvmStatic
    external fun libcUnixTimes(buf: Long): Int

    @JvmStatic
    external fun libcUnixPthreadSelf(): Long

    @JvmStatic
    external fun libcUnixPthreadEqual(t1: Long, t2: Long): Int

    @JvmStatic
    external fun libcUnixPthreadJoin(native: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixPthreadExit(value: Long)

    @JvmStatic
    external fun libcUnixPthreadAttrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixPthreadAttrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixPthreadAttrGetstacksize(attr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcUnixPthreadAttrSetstacksize(attr: Long, stackSize: Long): Int

    @JvmStatic
    external fun libcUnixPthreadAttrSetdetachstate(attr: Long, state: Int): Int

    @JvmStatic
    external fun libcUnixPthreadDetach(thread: Long): Int

    @JvmStatic
    external fun libcUnixSchedYield(): Int

    @JvmStatic
    external fun libcUnixPthreadKeyCreate(key: Long, dtor: Long): Int

    @JvmStatic
    external fun libcUnixPthreadKeyDelete(key: Int): Int

    @JvmStatic
    external fun libcUnixPthreadGetspecific(key: Int): Long

    @JvmStatic
    external fun libcUnixPthreadSetspecific(key: Int, value: Long): Int

    @JvmStatic
    external fun libcUnixPthreadMutexInit(lock: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixPthreadMutexDestroy(lock: Long): Int

    @JvmStatic
    external fun libcUnixPthreadMutexLock(lock: Long): Int

    @JvmStatic
    external fun libcUnixPthreadMutexTrylock(lock: Long): Int

    @JvmStatic
    external fun libcUnixPthreadMutexUnlock(lock: Long): Int

    @JvmStatic
    external fun libcUnixPthreadMutexattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixPthreadMutexattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixPthreadMutexattrSettype(attr: Long, type: Int): Int

    @JvmStatic
    external fun libcUnixPthreadCondInit(cond: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixPthreadCondWait(cond: Long, lock: Long): Int

    @JvmStatic
    external fun libcUnixPthreadCondTimedwait(cond: Long, lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixPthreadCondSignal(cond: Long): Int

    @JvmStatic
    external fun libcUnixPthreadCondBroadcast(cond: Long): Int

    @JvmStatic
    external fun libcUnixPthreadCondDestroy(cond: Long): Int

    @JvmStatic
    external fun libcUnixPthreadCondattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixPthreadCondattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixPthreadRwlockInit(lock: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixPthreadRwlockDestroy(lock: Long): Int

    @JvmStatic
    external fun libcUnixPthreadRwlockRdlock(lock: Long): Int

    @JvmStatic
    external fun libcUnixPthreadRwlockTryrdlock(lock: Long): Int

    @JvmStatic
    external fun libcUnixPthreadRwlockWrlock(lock: Long): Int

    @JvmStatic
    external fun libcUnixPthreadRwlockTrywrlock(lock: Long): Int

    @JvmStatic
    external fun libcUnixPthreadRwlockUnlock(lock: Long): Int

    @JvmStatic
    external fun libcUnixPthreadRwlockattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixPthreadRwlockattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixGetsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Long): Int

    @JvmStatic
    external fun libcUnixRaise(signum: Int): Int

    @JvmStatic
    external fun libcUnixUtimes(filename: Long, times: Long): Int

    @JvmStatic
    external fun libcUnixDlopen(filename: Long, flag: Int): Long

    @JvmStatic
    external fun libcUnixDlerror(): Long

    @JvmStatic
    external fun libcUnixDlsym(handle: Long, symbol: Long): Long

    @JvmStatic
    external fun libcUnixDlclose(handle: Long): Int

    @JvmStatic
    external fun libcUnixGetaddrinfo(node: Long, service: Long, hints: Long, res: Long): Int

    @JvmStatic
    external fun libcUnixFreeaddrinfo(res: Long)

    @JvmStatic
    external fun libcUnixHstrerror(errcode: Int): Long

    @JvmStatic
    external fun libcUnixGaiStrerror(errcode: Int): Long

    @JvmStatic
    external fun libcUnixResInit(): Int

    @JvmStatic
    external fun libcUnixGmtimeR(timeP: Long, result: Long): Long

    @JvmStatic
    external fun libcUnixLocaltimeR(timeP: Long, result: Long): Long

    @JvmStatic
    external fun libcUnixMktime(tm: Long): Long

    @JvmStatic
    external fun libcUnixTime(time: Long): Long

    @JvmStatic
    external fun libcUnixGmtime(timeP: Long): Long

    @JvmStatic
    external fun libcUnixLocaltime(timeP: Long): Long

    @JvmStatic
    external fun libcUnixDifftime(time1: Long, time0: Long): Double

    @JvmStatic
    external fun libcUnixTimegm(tm: Long): Long

    @JvmStatic
    external fun libcUnixMknod(pathname: Long, mode: Int, dev: Int): Int

    @JvmStatic
    external fun libcUnixGethostname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixEndservent()

    @JvmStatic
    external fun libcUnixGetservbyname(name: Long, proto: Long): Long

    @JvmStatic
    external fun libcUnixGetservbyport(port: Int, proto: Long): Long

    @JvmStatic
    external fun libcUnixGetservent(): Long

    @JvmStatic
    external fun libcUnixSetservent(stayopen: Int)

    @JvmStatic
    external fun libcUnixGetprotobyname(name: Long): Long

    @JvmStatic
    external fun libcUnixGetprotobynumber(proto: Int): Long

    @JvmStatic
    external fun libcUnixChroot(name: Long): Int

    @JvmStatic
    external fun libcUnixUsleep(secs: Int): Int

    @JvmStatic
    external fun libcUnixSend(socket: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixRecv(socket: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixPutenv(string: Long): Int

    @JvmStatic
    external fun libcUnixPoll(fds: Long, nfds: Long, timeout: Int): Int

    @JvmStatic
    external fun libcUnixSelect(nfds: Int, readfds: Long, writefds: Long, errorfds: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixSetlocale(category: Int, locale: Long): Long

    @JvmStatic
    external fun libcUnixLocaleconv(): Long

    @JvmStatic
    external fun libcUnixSemWait(sem: Long): Int

    @JvmStatic
    external fun libcUnixSemTrywait(sem: Long): Int

    @JvmStatic
    external fun libcUnixSemPost(sem: Long): Int

    @JvmStatic
    external fun libcUnixStatvfs(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixFstatvfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixSigemptyset(set: Long): Int

    @JvmStatic
    external fun libcUnixSigaddset(set: Long, signum: Int): Int

    @JvmStatic
    external fun libcUnixSigfillset(set: Long): Int

    @JvmStatic
    external fun libcUnixSigdelset(set: Long, signum: Int): Int

    @JvmStatic
    external fun libcUnixSigismember(set: Long, signum: Int): Int

    @JvmStatic
    external fun libcUnixSigprocmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libcUnixSigpending(set: Long): Int

    @JvmStatic
    external fun libcUnixSysconf(name: Int): Long

    @JvmStatic
    external fun libcUnixMkfifo(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixFseeko(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libcUnixFtello(stream: Long): Long

    @JvmStatic
    external fun libcUnixTcdrain(fd: Int): Int

    @JvmStatic
    external fun libcUnixCfgetispeed(termios: Long): Int

    @JvmStatic
    external fun libcUnixCfgetospeed(termios: Long): Int

    @JvmStatic
    external fun libcUnixCfsetispeed(termios: Long, speed: Int): Int

    @JvmStatic
    external fun libcUnixCfsetospeed(termios: Long, speed: Int): Int

    @JvmStatic
    external fun libcUnixTcgetattr(fd: Int, termios: Long): Int

    @JvmStatic
    external fun libcUnixTcsetattr(fd: Int, optionalActions: Int, termios: Long): Int

    @JvmStatic
    external fun libcUnixTcflow(fd: Int, action: Int): Int

    @JvmStatic
    external fun libcUnixTcflush(fd: Int, action: Int): Int

    @JvmStatic
    external fun libcUnixTcgetsid(fd: Int): Int

    @JvmStatic
    external fun libcUnixTcsendbreak(fd: Int, duration: Int): Int

    @JvmStatic
    external fun libcUnixMkstemp(template: Long): Int

    @JvmStatic
    external fun libcUnixMkdtemp(template: Long): Long

    @JvmStatic
    external fun libcUnixTmpnam(ptr: Long): Long

    @JvmStatic
    external fun libcUnixOpenlog(ident: Long, logopt: Int, facility: Int)

    @JvmStatic
    external fun libcUnixCloselog()

    @JvmStatic
    external fun libcUnixSetlogmask(maskpri: Int): Int

    @JvmStatic
    external fun libcUnixSyslog(priority: Int, message: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun libcUnixNice(incr: Int): Int

    @JvmStatic
    external fun libcUnixGrantpt(fd: Int): Int

    @JvmStatic
    external fun libcUnixPosixOpenpt(flags: Int): Int

    @JvmStatic
    external fun libcUnixPtsname(fd: Int): Long

    @JvmStatic
    external fun libcUnixUnlockpt(fd: Int): Int

    @JvmStatic
    external fun libcUnixStrcasestr(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcUnixGetline(lineptr: Long, n: Long, stream: Long): Long

    @JvmStatic
    external fun libcUnixLockf(fd: Int, cmd: Int, len: Long): Int

    @JvmStatic
    external fun libcUnixAdjtime(delta: Long, olddelta: Long): Int

    @JvmStatic
    external fun libcUnixStpncpy(dst: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcUnixConfstr(name: Int, buf: Long, len: Long): Long

    @JvmStatic
    external fun libcUnixDladdr(addr: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixFlock(fd: Int, operation: Int): Int

    @JvmStatic
    external fun libcUnixOpenWmemstream(ptr: Long, sizeloc: Long): Long

    @JvmStatic
    external fun libcUnixGetsid(pid: Int): Int

    @JvmStatic
    external fun libcUnixPause(): Int

    @JvmStatic
    external fun libcUnixMkdirat(dirfd: Int, pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixOpenat(dirfd: Int, pathname: Long, flags: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixFdopendir(fd: Int): Long

    @JvmStatic
    external fun libcUnixReaddirR(dirp: Long, entry: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixReadlinkat(dirfd: Int, pathname: Long, buf: Long, bufsiz: Long): Int

    @JvmStatic
    external fun libcUnixReadlink(path: Long, buf: Long, bufsz: Long): Int

    @JvmStatic
    external fun libcUnixPselect(nfds: Int, readfds: Long, writefds: Long, errorfds: Long, timeout: Long, sigmask: Long): Int

    @JvmStatic
    external fun libcUnixSigaction(signum: Int, act: Long, oldact: Long): Int

    @JvmStatic
    external fun libcUnixFmemopen(buf: Long, size: Long, mode: Long): Long

    @JvmStatic
    external fun libcUnixOpenMemstream(ptr: Long, sizeloc: Long): Long

    @JvmStatic
    external fun libcUnixAtexit(cb: Long): Int

    @JvmStatic
    external fun libcUnixCfmakeraw(termios: Long): Int

    @JvmStatic
    external fun libcUnixCfsetspeed(termios: Long, speed: Int): Int

    @JvmStatic
    external fun libcUnixFnmatch(pattern: Long, name: Long, flags: Int): Int
}

public actual val IN6ADDR_LOOPBACK: In6Addr
    get() = In6Addr()

public actual val IN6ADDR_ANY: In6Addr
    get() = In6Addr()

public actual fun isalnum(c: CInt): CInt =
    UnixJniBridge.libcUnixIsalnum(c)

public actual fun isalpha(c: CInt): CInt =
    UnixJniBridge.libcUnixIsalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    UnixJniBridge.libcUnixIscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    UnixJniBridge.libcUnixIsdigit(c)

public actual fun isgraph(c: CInt): CInt =
    UnixJniBridge.libcUnixIsgraph(c)

public actual fun islower(c: CInt): CInt =
    UnixJniBridge.libcUnixIslower(c)

public actual fun isprint(c: CInt): CInt =
    UnixJniBridge.libcUnixIsprint(c)

public actual fun ispunct(c: CInt): CInt =
    UnixJniBridge.libcUnixIspunct(c)

public actual fun isspace(c: CInt): CInt =
    UnixJniBridge.libcUnixIsspace(c)

public actual fun isupper(c: CInt): CInt =
    UnixJniBridge.libcUnixIsupper(c)

public actual fun isxdigit(c: CInt): CInt =
    UnixJniBridge.libcUnixIsxdigit(c)

public actual fun isblank(c: CInt): CInt =
    UnixJniBridge.libcUnixIsblank(c)

public actual fun tolower(c: CInt): CInt =
    UnixJniBridge.libcUnixTolower(c)

public actual fun toupper(c: CInt): CInt =
    UnixJniBridge.libcUnixToupper(c)

public actual fun qsort(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    UnixJniBridge.libcUnixQsort(base.rawAddress, num.toLong(), size.toLong(), 0L)
}

public actual fun bsearch(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortComparCallback?): MutPtr<CVoid> =
    MutPtr(UnixJniBridge.libcUnixBsearch(key.rawAddress, base.rawAddress, num.toLong(), size.toLong(), 0L))

public actual fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(UnixJniBridge.libcUnixFopen(filename.rawAddress, mode.rawAddress))

public actual fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    MutPtr(UnixJniBridge.libcUnixFreopen(filename.rawAddress, mode.rawAddress, file.rawAddress))

public actual fun fflush(file: MutPtr<FILE>): CInt =
    UnixJniBridge.libcUnixFflush(file.rawAddress)

public actual fun fclose(file: MutPtr<FILE>): CInt =
    UnixJniBridge.libcUnixFclose(file.rawAddress)

public actual fun remove(filename: ConstPtr<CChar>): CInt =
    UnixJniBridge.libcUnixRemove(filename.rawAddress)

public actual fun rename(oldname: ConstPtr<CChar>, newname: ConstPtr<CChar>): CInt =
    UnixJniBridge.libcUnixRename(oldname.rawAddress, newname.rawAddress)

public actual fun tmpfile(): MutPtr<FILE> =
    MutPtr(UnixJniBridge.libcUnixTmpfile())

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    UnixJniBridge.libcUnixSetvbuf(stream.rawAddress, buffer.rawAddress, mode, size.toLong())

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>) {
    UnixJniBridge.libcUnixSetbuf(stream.rawAddress, buf.rawAddress)
}

public actual fun getchar(): CInt =
    UnixJniBridge.libcUnixGetchar()

public actual fun putchar(c: CInt): CInt =
    UnixJniBridge.libcUnixPutchar(c)

public actual fun fgetc(stream: MutPtr<FILE>): CInt =
    UnixJniBridge.libcUnixFgetc(stream.rawAddress)

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixFgets(buf.rawAddress, n, stream.rawAddress))

public actual fun fputc(c: CInt, stream: MutPtr<FILE>): CInt =
    UnixJniBridge.libcUnixFputc(c, stream.rawAddress)

public actual fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt =
    UnixJniBridge.libcUnixFputs(s.rawAddress, stream.rawAddress)

public actual fun puts(s: ConstPtr<CChar>): CInt =
    UnixJniBridge.libcUnixPuts(s.rawAddress)

public actual fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt =
    UnixJniBridge.libcUnixUngetc(c, stream.rawAddress)

public actual fun fread(ptr: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    UnixJniBridge.libcUnixFread(ptr.rawAddress, size.toLong(), nobj.toLong(), stream.rawAddress).toULong()

public actual fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    UnixJniBridge.libcUnixFwrite(ptr.rawAddress, size.toLong(), nobj.toLong(), stream.rawAddress).toULong()

public actual fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt =
    UnixJniBridge.libcUnixFseek(stream.rawAddress, offset, whence)

public actual fun ftell(stream: MutPtr<FILE>): CLong =
    UnixJniBridge.libcUnixFtell(stream.rawAddress)

public actual fun rewind(stream: MutPtr<FILE>) {
    UnixJniBridge.libcUnixRewind(stream.rawAddress)
}

public actual fun fgetpos(stream: MutPtr<FILE>, ptr: MutPtr<FposT>): CInt =
    UnixJniBridge.libcUnixFgetpos(stream.rawAddress, ptr.rawAddress)

public actual fun fsetpos(stream: MutPtr<FILE>, ptr: ConstPtr<FposT>): CInt =
    UnixJniBridge.libcUnixFsetpos(stream.rawAddress, ptr.rawAddress)

public actual fun feof(stream: MutPtr<FILE>): CInt =
    UnixJniBridge.libcUnixFeof(stream.rawAddress)

public actual fun ferror(stream: MutPtr<FILE>): CInt =
    UnixJniBridge.libcUnixFerror(stream.rawAddress)

public actual fun clearerr(stream: MutPtr<FILE>) {
    UnixJniBridge.libcUnixClearerr(stream.rawAddress)
}

public actual fun perror(s: ConstPtr<CChar>) {
    UnixJniBridge.libcUnixPerror(s.rawAddress)
}

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    UnixJniBridge.libcUnixAtof(s.rawAddress)

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    UnixJniBridge.libcUnixAtoi(s.rawAddress)

public actual fun atol(s: ConstPtr<CChar>): CLong =
    UnixJniBridge.libcUnixAtol(s.rawAddress)

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    UnixJniBridge.libcUnixAtoll(s.rawAddress)

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    UnixJniBridge.libcUnixStrtod(s.rawAddress, endp.rawAddress)

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    UnixJniBridge.libcUnixStrtof(s.rawAddress, endp.rawAddress)

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    UnixJniBridge.libcUnixStrtol(s.rawAddress, endp.rawAddress, base)

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    UnixJniBridge.libcUnixStrtoll(s.rawAddress, endp.rawAddress, base)

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    UnixJniBridge.libcUnixStrtoul(s.rawAddress, endp.rawAddress, base).toULong()

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    UnixJniBridge.libcUnixStrtoull(s.rawAddress, endp.rawAddress, base).toULong()

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(UnixJniBridge.libcUnixCalloc(nobj.toLong(), size.toLong()))

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    MutPtr(UnixJniBridge.libcUnixMalloc(size.toLong()))

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    MutPtr(UnixJniBridge.libcUnixRealloc(p.rawAddress, size.toLong()))

public actual fun free(p: MutPtr<CVoid>) {
    UnixJniBridge.libcUnixFree(p.rawAddress)
}

public actual fun abort(): Nothing {
    UnixJniBridge.libcUnixAbort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    UnixJniBridge.libcUnixExit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun system(s: ConstPtr<CChar>): CInt =
    UnixJniBridge.libcUnixSystem(s.rawAddress)

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixGetenv(s.rawAddress))

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixStrcpy(dst.rawAddress, src.rawAddress))

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixStrncpy(dst.rawAddress, src.rawAddress, n.toLong()))

public actual fun stpcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixStpcpy(dst.rawAddress, src.rawAddress))

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixStrcat(s.rawAddress, ct.rawAddress))

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixStrncat(s.rawAddress, ct.rawAddress, n.toLong()))

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    UnixJniBridge.libcUnixStrcmp(cs.rawAddress, ct.rawAddress)

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    UnixJniBridge.libcUnixStrncmp(cs.rawAddress, ct.rawAddress, n.toLong())

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    UnixJniBridge.libcUnixStrcoll(cs.rawAddress, ct.rawAddress)

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixStrchr(cs.rawAddress, c))

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixStrrchr(cs.rawAddress, c))

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    UnixJniBridge.libcUnixStrspn(cs.rawAddress, ct.rawAddress).toULong()

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    UnixJniBridge.libcUnixStrcspn(cs.rawAddress, ct.rawAddress).toULong()

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixStrdup(cs.rawAddress))

public actual fun strndup(cs: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixStrndup(cs.rawAddress, n.toLong()))

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixStrpbrk(cs.rawAddress, ct.rawAddress))

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixStrstr(cs.rawAddress, ct.rawAddress))

public actual fun strcasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt =
    UnixJniBridge.libcUnixStrcasecmp(s1.rawAddress, s2.rawAddress)

public actual fun strncasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt =
    UnixJniBridge.libcUnixStrncasecmp(s1.rawAddress, s2.rawAddress, n.toLong())

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    UnixJniBridge.libcUnixStrlen(cs.rawAddress).toULong()

public actual fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT =
    UnixJniBridge.libcUnixStrnlen(cs.rawAddress, maxlen.toLong()).toULong()

public actual fun strerror(n: CInt): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixStrerror(n))

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixStrtok(s.rawAddress, t.rawAddress))

public actual fun strtokR(s: MutPtr<CChar>, t: ConstPtr<CChar>, p: MutPtr<MutPtr<CChar>>): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixStrtokR(s.rawAddress, t.rawAddress, p.rawAddress))

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    UnixJniBridge.libcUnixStrxfrm(s.rawAddress, ct.rawAddress, n.toLong()).toULong()

public actual fun strsignal(sig: CInt): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixStrsignal(sig))

public actual fun wcslen(buf: ConstPtr<WcharT>): SizeT =
    UnixJniBridge.libcUnixWcslen(buf.rawAddress).toULong()

public actual fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT =
    UnixJniBridge.libcUnixWcstombs(dest.rawAddress, src.rawAddress, n.toLong()).toULong()

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(UnixJniBridge.libcUnixMemchr(cx.rawAddress, c, n.toLong()))

public actual fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT> =
    MutPtr(UnixJniBridge.libcUnixWmemchr(cx.rawAddress, c.toInt(), n.toLong()))

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    UnixJniBridge.libcUnixMemcmp(cx.rawAddress, ct.rawAddress, n.toLong())

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(UnixJniBridge.libcUnixMemcpy(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(UnixJniBridge.libcUnixMemmove(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(UnixJniBridge.libcUnixMemset(dest.rawAddress, c, n.toLong()))

public actual fun memccpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(UnixJniBridge.libcUnixMemccpy(dest.rawAddress, src.rawAddress, c, n.toLong()))

public actual fun getpwnam(name: ConstPtr<CChar>): MutPtr<Passwd> =
    MutPtr(UnixJniBridge.libcUnixGetpwnam(name.rawAddress))

public actual fun getpwuid(uid: UidT): MutPtr<Passwd> =
    MutPtr(UnixJniBridge.libcUnixGetpwuid(uid.toShort()))

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixFprintf(stream.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixPrintf(format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixSnprintf(s.rawAddress, n.toLong(), format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixSprintf(s.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixFscanf(stream.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixScanf(format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixSscanf(s.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getcharUnlocked(): CInt =
    UnixJniBridge.libcUnixGetcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    UnixJniBridge.libcUnixPutcharUnlocked(c)

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    UnixJniBridge.libcUnixSocket(domain, ty, protocol)

public actual fun connect(socket: CInt, address: ConstPtr<Sockaddr>, len: SocklenT): CInt =
    UnixJniBridge.libcUnixConnect(socket, address.rawAddress, len.toInt())

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    UnixJniBridge.libcUnixListen(socket, backlog)

public actual fun accept(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    UnixJniBridge.libcUnixAccept(socket, address.rawAddress, addressLen.rawAddress)

public actual fun getpeername(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    UnixJniBridge.libcUnixGetpeername(socket, address.rawAddress, addressLen.rawAddress)

public actual fun getsockname(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    UnixJniBridge.libcUnixGetsockname(socket, address.rawAddress, addressLen.rawAddress)

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr<CVoid>, optionLen: SocklenT): CInt =
    UnixJniBridge.libcUnixSetsockopt(socket, level, name, value.rawAddress, optionLen.toInt())

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: MutPtr<CInt>): CInt =
    UnixJniBridge.libcUnixSocketpair(domain, type, protocol, socketVector.rawAddress)

public actual fun sendto(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): SsizeT =
    UnixJniBridge.libcUnixSendto(socket, buf.rawAddress, len.toLong(), flags, addr.rawAddress, addrlen.toInt())

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    UnixJniBridge.libcUnixShutdown(socket, how)

public actual fun chmod(path: ConstPtr<CChar>, mode: ModeT): CInt =
    UnixJniBridge.libcUnixChmod(path.rawAddress, mode.toInt())

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    UnixJniBridge.libcUnixFchmod(fd, mode.toInt())

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    UnixJniBridge.libcUnixFstat(fildes, buf.rawAddress)

public actual fun mkdir(path: ConstPtr<CChar>, mode: ModeT): CInt =
    UnixJniBridge.libcUnixMkdir(path.rawAddress, mode.toInt())

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    UnixJniBridge.libcUnixStat(path.rawAddress, buf.rawAddress)

public actual fun pclose(stream: MutPtr<FILE>): CInt =
    UnixJniBridge.libcUnixPclose(stream.rawAddress)

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(UnixJniBridge.libcUnixFdopen(fd, mode.rawAddress))

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    UnixJniBridge.libcUnixFileno(stream.rawAddress)

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixOpen(path.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(path: ConstPtr<CChar>, mode: ModeT): CInt =
    UnixJniBridge.libcUnixCreat(path.rawAddress, mode.toInt())

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun opendir(dirname: ConstPtr<CChar>): MutPtr<DIR> =
    MutPtr(UnixJniBridge.libcUnixOpendir(dirname.rawAddress))

public actual fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent> =
    MutPtr(UnixJniBridge.libcUnixReaddir(dirp.rawAddress))

public actual fun closedir(dirp: MutPtr<DIR>): CInt =
    UnixJniBridge.libcUnixClosedir(dirp.rawAddress)

public actual fun rewinddir(dirp: MutPtr<DIR>) {
    UnixJniBridge.libcUnixRewinddir(dirp.rawAddress)
}

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, flags: CInt): CInt =
    UnixJniBridge.libcUnixFchmodat(dirfd, pathname.rawAddress, mode.toInt(), flags)

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    UnixJniBridge.libcUnixFchown(fd, owner.toShort(), group.toShort())

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr<CChar>, owner: UidT, group: GidT, flags: CInt): CInt =
    UnixJniBridge.libcUnixFchownat(dirfd, pathname.rawAddress, owner.toShort(), group.toShort(), flags)

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    UnixJniBridge.libcUnixFstatat(dirfd, pathname.rawAddress, buf.rawAddress, flags)

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    UnixJniBridge.libcUnixLinkat(olddirfd, oldpath.rawAddress, newdirfd, newpath.rawAddress, flags)

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    UnixJniBridge.libcUnixRenameat(olddirfd, oldpath.rawAddress, newdirfd, newpath.rawAddress)

public actual fun symlinkat(target: ConstPtr<CChar>, newdirfd: CInt, linkpath: ConstPtr<CChar>): CInt =
    UnixJniBridge.libcUnixSymlinkat(target.rawAddress, newdirfd, linkpath.rawAddress)

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt): CInt =
    UnixJniBridge.libcUnixUnlinkat(dirfd, pathname.rawAddress, flags)

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    UnixJniBridge.libcUnixAccess(path.rawAddress, amode)

public actual fun alarm(seconds: CUint): CUint =
    UnixJniBridge.libcUnixAlarm(seconds.toInt()).toUInt()

public actual fun chdir(dir: ConstPtr<CChar>): CInt =
    UnixJniBridge.libcUnixChdir(dir.rawAddress)

public actual fun fchdir(dirfd: CInt): CInt =
    UnixJniBridge.libcUnixFchdir(dirfd)

public actual fun chown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt =
    UnixJniBridge.libcUnixChown(path.rawAddress, uid.toShort(), gid.toShort())

public actual fun lchown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt =
    UnixJniBridge.libcUnixLchown(path.rawAddress, uid.toShort(), gid.toShort())

public actual fun close(fd: CInt): CInt =
    UnixJniBridge.libcUnixClose(fd)

public actual fun dup(fd: CInt): CInt =
    UnixJniBridge.libcUnixDup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    UnixJniBridge.libcUnixDup2(src, dst)

public actual fun execl(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixExecl(path.rawAddress, arg0.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execle(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixExecle(path.rawAddress, arg0.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execlp(file: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixExeclp(file.rawAddress, arg0.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execv(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    UnixJniBridge.libcUnixExecv(prog.rawAddress, argv.rawAddress)

public actual fun execve(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    UnixJniBridge.libcUnixExecve(prog.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun execvp(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    UnixJniBridge.libcUnixExecvp(c.rawAddress, argv.rawAddress)

public actual fun fork(): PidT =
    UnixJniBridge.libcUnixFork()

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    UnixJniBridge.libcUnixFpathconf(filedes, name)

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixGetcwd(buf.rawAddress, size.toLong()))

public actual fun getegid(): GidT =
    UnixJniBridge.libcUnixGetegid().toUShort()

public actual fun geteuid(): UidT =
    UnixJniBridge.libcUnixGeteuid().toUShort()

public actual fun getgid(): GidT =
    UnixJniBridge.libcUnixGetgid().toUShort()

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr<GidT>): CInt =
    UnixJniBridge.libcUnixGetgroups(ngroupsMax, groups.rawAddress)

public actual fun getlogin(): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixGetlogin())

public actual fun getopt(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstr: ConstPtr<CChar>): CInt =
    UnixJniBridge.libcUnixGetopt(argc, argv.rawAddress, optstr.rawAddress)

public actual fun getpgid(pid: PidT): PidT =
    UnixJniBridge.libcUnixGetpgid(pid)

public actual fun getpgrp(): PidT =
    UnixJniBridge.libcUnixGetpgrp()

public actual fun getpid(): PidT =
    UnixJniBridge.libcUnixGetpid()

public actual fun getppid(): PidT =
    UnixJniBridge.libcUnixGetppid()

public actual fun getuid(): UidT =
    UnixJniBridge.libcUnixGetuid().toUShort()

public actual fun isatty(fd: CInt): CInt =
    UnixJniBridge.libcUnixIsatty(fd)

public actual fun link(src: ConstPtr<CChar>, dst: ConstPtr<CChar>): CInt =
    UnixJniBridge.libcUnixLink(src.rawAddress, dst.rawAddress)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    UnixJniBridge.libcUnixLseek(fd, offset, whence)

public actual fun pathconf(path: ConstPtr<CChar>, name: CInt): CLong =
    UnixJniBridge.libcUnixPathconf(path.rawAddress, name)

public actual fun pipe(fds: MutPtr<CInt>): CInt =
    UnixJniBridge.libcUnixPipe(fds.rawAddress)

public actual fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, align: SizeT, size: SizeT): CInt =
    UnixJniBridge.libcUnixPosixMemalign(memptr.rawAddress, align.toLong(), size.toLong())

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(UnixJniBridge.libcUnixAlignedAlloc(alignment.toLong(), size.toLong()))

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: SizeT): SsizeT =
    UnixJniBridge.libcUnixRead(fd, buf.rawAddress, count.toLong())

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
    UnixJniBridge.libcUnixRmdir(path.rawAddress)

public actual fun seteuid(uid: UidT): CInt =
    UnixJniBridge.libcUnixSeteuid(uid.toShort())

public actual fun setegid(gid: GidT): CInt =
    UnixJniBridge.libcUnixSetegid(gid.toShort())

public actual fun setgid(gid: GidT): CInt =
    UnixJniBridge.libcUnixSetgid(gid.toShort())

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    UnixJniBridge.libcUnixSetpgid(pid, pgid)

public actual fun setsid(): PidT =
    UnixJniBridge.libcUnixSetsid()

public actual fun setuid(uid: UidT): CInt =
    UnixJniBridge.libcUnixSetuid(uid.toShort())

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    UnixJniBridge.libcUnixSetreuid(ruid.toShort(), euid.toShort())

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    UnixJniBridge.libcUnixSetregid(rgid.toShort(), egid.toShort())

public actual fun sleep(secs: CUint): CUint =
    UnixJniBridge.libcUnixSleep(secs.toInt()).toUInt()

public actual fun nanosleep(rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    UnixJniBridge.libcUnixNanosleep(rqtp.rawAddress, rmtp.rawAddress)

public actual fun tcgetpgrp(fd: CInt): PidT =
    UnixJniBridge.libcUnixTcgetpgrp(fd)

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    UnixJniBridge.libcUnixTcsetpgrp(fd, pgrp)

public actual fun ttyname(fd: CInt): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixTtyname(fd))

public actual fun ttynameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    UnixJniBridge.libcUnixTtynameR(fd, buf.rawAddress, buflen.toLong())

public actual fun unlink(c: ConstPtr<CChar>): CInt =
    UnixJniBridge.libcUnixUnlink(c.rawAddress)

public actual fun wait(status: MutPtr<CInt>): PidT =
    UnixJniBridge.libcUnixWait(status.rawAddress)

public actual fun waitpid(pid: PidT, status: MutPtr<CInt>, options: CInt): PidT =
    UnixJniBridge.libcUnixWaitpid(pid, status.rawAddress, options)

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT =
    UnixJniBridge.libcUnixWrite(fd, buf.rawAddress, count.toLong())

public actual fun pread(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    UnixJniBridge.libcUnixPread(fd, buf.rawAddress, count.toLong(), offset)

public actual fun pwrite(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    UnixJniBridge.libcUnixPwrite(fd, buf.rawAddress, count.toLong(), offset)

public actual fun umask(mask: ModeT): ModeT =
    UnixJniBridge.libcUnixUmask(mask.toInt()).toUInt()

public actual fun utime(file: ConstPtr<CChar>, buf: ConstPtr<Utimbuf>): CInt =
    UnixJniBridge.libcUnixUtime(file.rawAddress, buf.rawAddress)

public actual fun kill(pid: PidT, sig: CInt): CInt =
    UnixJniBridge.libcUnixKill(pid, sig)

public actual fun killpg(pgrp: PidT, sig: CInt): CInt =
    UnixJniBridge.libcUnixKillpg(pgrp, sig)

public actual fun mlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    UnixJniBridge.libcUnixMlock(addr.rawAddress, len.toLong())

public actual fun munlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    UnixJniBridge.libcUnixMunlock(addr.rawAddress, len.toLong())

public actual fun mlockall(flags: CInt): CInt =
    UnixJniBridge.libcUnixMlockall(flags)

public actual fun munlockall(): CInt =
    UnixJniBridge.libcUnixMunlockall()

public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    MutPtr(UnixJniBridge.libcUnixMmap(addr.rawAddress, len.toLong(), prot, flags, fd, offset))

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    UnixJniBridge.libcUnixMunmap(addr.rawAddress, len.toLong())

public actual fun ifNametoindex(ifname: ConstPtr<CChar>): CUint =
    UnixJniBridge.libcUnixIfNametoindex(ifname.rawAddress).toUInt()

public actual fun ifIndextoname(ifindex: CUint, ifname: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixIfIndextoname(ifindex.toInt(), ifname.rawAddress))

public actual fun lstat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    UnixJniBridge.libcUnixLstat(path.rawAddress, buf.rawAddress)

public actual fun fsync(fd: CInt): CInt =
    UnixJniBridge.libcUnixFsync(fd)

public actual fun setenv(name: ConstPtr<CChar>, value: ConstPtr<CChar>, overwrite: CInt): CInt =
    UnixJniBridge.libcUnixSetenv(name.rawAddress, value.rawAddress, overwrite)

public actual fun unsetenv(name: ConstPtr<CChar>): CInt =
    UnixJniBridge.libcUnixUnsetenv(name.rawAddress)

public actual fun symlink(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>): CInt =
    UnixJniBridge.libcUnixSymlink(path1.rawAddress, path2.rawAddress)

public actual fun truncate(path: ConstPtr<CChar>, length: OffT): CInt =
    UnixJniBridge.libcUnixTruncate(path.rawAddress, length)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    UnixJniBridge.libcUnixFtruncate(fd, length)

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    UnixJniBridge.libcUnixSignal(signum, handler.toLong()).toULong()

public actual fun getrusage(resource: CInt, usage: MutPtr<Rusage>): CInt =
    UnixJniBridge.libcUnixGetrusage(resource, usage.rawAddress)

public actual fun realpath(pathname: ConstPtr<CChar>, resolved: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixRealpath(pathname.rawAddress, resolved.rawAddress))

public actual fun times(buf: MutPtr<Tms>): ClockT =
    UnixJniBridge.libcUnixTimes(buf.rawAddress)

public actual fun pthreadSelf(): PthreadT =
    UnixJniBridge.libcUnixPthreadSelf().toULong()

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    UnixJniBridge.libcUnixPthreadEqual(t1.toLong(), t2.toLong())

public actual fun pthreadJoin(native: PthreadT, value: MutPtr<MutPtr<CVoid>>): CInt =
    UnixJniBridge.libcUnixPthreadJoin(native.toLong(), value.rawAddress)

public actual fun pthreadExit(value: MutPtr<CVoid>): Nothing {
    UnixJniBridge.libcUnixPthreadExit(value.rawAddress)
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    UnixJniBridge.libcUnixPthreadAttrInit(attr.rawAddress)

public actual fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt =
    UnixJniBridge.libcUnixPthreadAttrDestroy(attr.rawAddress)

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, stacksize: MutPtr<SizeT>): CInt =
    UnixJniBridge.libcUnixPthreadAttrGetstacksize(attr.rawAddress, stacksize.rawAddress)

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stackSize: SizeT): CInt =
    UnixJniBridge.libcUnixPthreadAttrSetstacksize(attr.rawAddress, stackSize.toLong())

public actual fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, state: CInt): CInt =
    UnixJniBridge.libcUnixPthreadAttrSetdetachstate(attr.rawAddress, state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    UnixJniBridge.libcUnixPthreadDetach(thread.toLong())

public actual fun schedYield(): CInt =
    UnixJniBridge.libcUnixSchedYield()

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt =
    UnixJniBridge.libcUnixPthreadKeyCreate(key.rawAddress, 0L)

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    UnixJniBridge.libcUnixPthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    MutPtr(UnixJniBridge.libcUnixPthreadGetspecific(key))

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    UnixJniBridge.libcUnixPthreadSetspecific(key, value.rawAddress)

public actual fun pthreadMutexInit(lock: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    UnixJniBridge.libcUnixPthreadMutexInit(lock.rawAddress, attr.rawAddress)

public actual fun pthreadMutexDestroy(lock: MutPtr<PthreadMutexT>): CInt =
    UnixJniBridge.libcUnixPthreadMutexDestroy(lock.rawAddress)

public actual fun pthreadMutexLock(lock: MutPtr<PthreadMutexT>): CInt =
    UnixJniBridge.libcUnixPthreadMutexLock(lock.rawAddress)

public actual fun pthreadMutexTrylock(lock: MutPtr<PthreadMutexT>): CInt =
    UnixJniBridge.libcUnixPthreadMutexTrylock(lock.rawAddress)

public actual fun pthreadMutexUnlock(lock: MutPtr<PthreadMutexT>): CInt =
    UnixJniBridge.libcUnixPthreadMutexUnlock(lock.rawAddress)

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    UnixJniBridge.libcUnixPthreadMutexattrInit(attr.rawAddress)

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    UnixJniBridge.libcUnixPthreadMutexattrDestroy(attr.rawAddress)

public actual fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, type: CInt): CInt =
    UnixJniBridge.libcUnixPthreadMutexattrSettype(attr.rawAddress, type)

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    UnixJniBridge.libcUnixPthreadCondInit(cond.rawAddress, attr.rawAddress)

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>): CInt =
    UnixJniBridge.libcUnixPthreadCondWait(cond.rawAddress, lock.rawAddress)

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    UnixJniBridge.libcUnixPthreadCondTimedwait(cond.rawAddress, lock.rawAddress, abstime.rawAddress)

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    UnixJniBridge.libcUnixPthreadCondSignal(cond.rawAddress)

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    UnixJniBridge.libcUnixPthreadCondBroadcast(cond.rawAddress)

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    UnixJniBridge.libcUnixPthreadCondDestroy(cond.rawAddress)

public actual fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt =
    UnixJniBridge.libcUnixPthreadCondattrInit(attr.rawAddress)

public actual fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt =
    UnixJniBridge.libcUnixPthreadCondattrDestroy(attr.rawAddress)

public actual fun pthreadRwlockInit(lock: MutPtr<PthreadRwlockT>, attr: ConstPtr<PthreadRwlockattrT>): CInt =
    UnixJniBridge.libcUnixPthreadRwlockInit(lock.rawAddress, attr.rawAddress)

public actual fun pthreadRwlockDestroy(lock: MutPtr<PthreadRwlockT>): CInt =
    UnixJniBridge.libcUnixPthreadRwlockDestroy(lock.rawAddress)

public actual fun pthreadRwlockRdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    UnixJniBridge.libcUnixPthreadRwlockRdlock(lock.rawAddress)

public actual fun pthreadRwlockTryrdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    UnixJniBridge.libcUnixPthreadRwlockTryrdlock(lock.rawAddress)

public actual fun pthreadRwlockWrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    UnixJniBridge.libcUnixPthreadRwlockWrlock(lock.rawAddress)

public actual fun pthreadRwlockTrywrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    UnixJniBridge.libcUnixPthreadRwlockTrywrlock(lock.rawAddress)

public actual fun pthreadRwlockUnlock(lock: MutPtr<PthreadRwlockT>): CInt =
    UnixJniBridge.libcUnixPthreadRwlockUnlock(lock.rawAddress)

public actual fun pthreadRwlockattrInit(attr: MutPtr<PthreadRwlockattrT>): CInt =
    UnixJniBridge.libcUnixPthreadRwlockattrInit(attr.rawAddress)

public actual fun pthreadRwlockattrDestroy(attr: MutPtr<PthreadRwlockattrT>): CInt =
    UnixJniBridge.libcUnixPthreadRwlockattrDestroy(attr.rawAddress)

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): CInt =
    UnixJniBridge.libcUnixGetsockopt(sockfd, level, optname, optval.rawAddress, optlen.rawAddress)

public actual fun raise(signum: CInt): CInt =
    UnixJniBridge.libcUnixRaise(signum)

public actual fun utimes(filename: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    UnixJniBridge.libcUnixUtimes(filename.rawAddress, times.rawAddress)

public actual fun dlopen(filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    MutPtr(UnixJniBridge.libcUnixDlopen(filename.rawAddress, flag))

public actual fun dlerror(): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixDlerror())

public actual fun dlsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>): MutPtr<CVoid> =
    MutPtr(UnixJniBridge.libcUnixDlsym(handle.rawAddress, symbol.rawAddress))

public actual fun dlclose(handle: MutPtr<CVoid>): CInt =
    UnixJniBridge.libcUnixDlclose(handle.rawAddress)

public actual fun getaddrinfo(node: ConstPtr<CChar>, service: ConstPtr<CChar>, hints: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): CInt =
    UnixJniBridge.libcUnixGetaddrinfo(node.rawAddress, service.rawAddress, hints.rawAddress, res.rawAddress)

public actual fun freeaddrinfo(res: MutPtr<Addrinfo>) {
    UnixJniBridge.libcUnixFreeaddrinfo(res.rawAddress)
}

public actual fun hstrerror(errcode: CInt): ConstPtr<CChar> =
    ConstPtr(UnixJniBridge.libcUnixHstrerror(errcode))

public actual fun gaiStrerror(errcode: CInt): ConstPtr<CChar> =
    ConstPtr(UnixJniBridge.libcUnixGaiStrerror(errcode))

public actual fun resInit(): CInt =
    UnixJniBridge.libcUnixResInit()

public actual fun gmtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(UnixJniBridge.libcUnixGmtimeR(timeP.rawAddress, result.rawAddress))

public actual fun localtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(UnixJniBridge.libcUnixLocaltimeR(timeP.rawAddress, result.rawAddress))

public actual fun mktime(tm: MutPtr<Tm>): TimeT =
    UnixJniBridge.libcUnixMktime(tm.rawAddress)

public actual fun time(time: MutPtr<TimeT>): TimeT =
    UnixJniBridge.libcUnixTime(time.rawAddress)

public actual fun gmtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(UnixJniBridge.libcUnixGmtime(timeP.rawAddress))

public actual fun localtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(UnixJniBridge.libcUnixLocaltime(timeP.rawAddress))

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    UnixJniBridge.libcUnixDifftime(time1, time0)

public actual fun timegm(tm: MutPtr<Tm>): TimeT =
    UnixJniBridge.libcUnixTimegm(tm.rawAddress)

public actual fun mknod(pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    UnixJniBridge.libcUnixMknod(pathname.rawAddress, mode.toInt(), dev)

public actual fun gethostname(name: MutPtr<CChar>, len: SizeT): CInt =
    UnixJniBridge.libcUnixGethostname(name.rawAddress, len.toLong())

public actual fun endservent() {
    UnixJniBridge.libcUnixEndservent()
}

public actual fun getservbyname(name: ConstPtr<CChar>, proto: ConstPtr<CChar>): MutPtr<Servent> =
    MutPtr(UnixJniBridge.libcUnixGetservbyname(name.rawAddress, proto.rawAddress))

public actual fun getservbyport(port: CInt, proto: ConstPtr<CChar>): MutPtr<Servent> =
    MutPtr(UnixJniBridge.libcUnixGetservbyport(port, proto.rawAddress))

public actual fun getservent(): MutPtr<Servent> =
    MutPtr(UnixJniBridge.libcUnixGetservent())

public actual fun setservent(stayopen: CInt) {
    UnixJniBridge.libcUnixSetservent(stayopen)
}

public actual fun getprotobyname(name: ConstPtr<CChar>): MutPtr<Protoent> =
    MutPtr(UnixJniBridge.libcUnixGetprotobyname(name.rawAddress))

public actual fun getprotobynumber(proto: CInt): MutPtr<Protoent> =
    MutPtr(UnixJniBridge.libcUnixGetprotobynumber(proto))

public actual fun chroot(name: ConstPtr<CChar>): CInt =
    UnixJniBridge.libcUnixChroot(name.rawAddress)

public actual fun usleep(secs: UsecondsT): CInt =
    UnixJniBridge.libcUnixUsleep(secs.toInt())

public actual fun send(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    UnixJniBridge.libcUnixSend(socket, buf.rawAddress, len.toLong(), flags)

public actual fun recv(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    UnixJniBridge.libcUnixRecv(socket, buf.rawAddress, len.toLong(), flags)

public actual fun putenv(string: MutPtr<CChar>): CInt =
    UnixJniBridge.libcUnixPutenv(string.rawAddress)

public actual fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: CInt): CInt =
    UnixJniBridge.libcUnixPoll(fds.rawAddress, nfds.toLong(), timeout)

public actual fun select(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: MutPtr<Timeval>): CInt =
    UnixJniBridge.libcUnixSelect(nfds, readfds.rawAddress, writefds.rawAddress, errorfds.rawAddress, timeout.rawAddress)

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixSetlocale(category, locale.rawAddress))

public actual fun localeconv(): MutPtr<Lconv> =
    MutPtr(UnixJniBridge.libcUnixLocaleconv())

public actual fun semWait(sem: MutPtr<SemT>): CInt =
    UnixJniBridge.libcUnixSemWait(sem.rawAddress)

public actual fun semTrywait(sem: MutPtr<SemT>): CInt =
    UnixJniBridge.libcUnixSemTrywait(sem.rawAddress)

public actual fun semPost(sem: MutPtr<SemT>): CInt =
    UnixJniBridge.libcUnixSemPost(sem.rawAddress)

public actual fun statvfs(path: ConstPtr<CChar>, buf: MutPtr<Statvfs>): CInt =
    UnixJniBridge.libcUnixStatvfs(path.rawAddress, buf.rawAddress)

public actual fun fstatvfs(fd: CInt, buf: MutPtr<Statvfs>): CInt =
    UnixJniBridge.libcUnixFstatvfs(fd, buf.rawAddress)

public actual fun sigemptyset(set: MutPtr<SigsetT>): CInt =
    UnixJniBridge.libcUnixSigemptyset(set.rawAddress)

public actual fun sigaddset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    UnixJniBridge.libcUnixSigaddset(set.rawAddress, signum)

public actual fun sigfillset(set: MutPtr<SigsetT>): CInt =
    UnixJniBridge.libcUnixSigfillset(set.rawAddress)

public actual fun sigdelset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    UnixJniBridge.libcUnixSigdelset(set.rawAddress, signum)

public actual fun sigismember(set: ConstPtr<SigsetT>, signum: CInt): CInt =
    UnixJniBridge.libcUnixSigismember(set.rawAddress, signum)

public actual fun sigprocmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    UnixJniBridge.libcUnixSigprocmask(how, set.rawAddress, oldset.rawAddress)

public actual fun sigpending(set: MutPtr<SigsetT>): CInt =
    UnixJniBridge.libcUnixSigpending(set.rawAddress)

public actual fun sysconf(name: CInt): CLong =
    UnixJniBridge.libcUnixSysconf(name)

public actual fun mkfifo(path: ConstPtr<CChar>, mode: ModeT): CInt =
    UnixJniBridge.libcUnixMkfifo(path.rawAddress, mode.toInt())

public actual fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt =
    UnixJniBridge.libcUnixFseeko(stream.rawAddress, offset, whence)

public actual fun ftello(stream: MutPtr<FILE>): OffT =
    UnixJniBridge.libcUnixFtello(stream.rawAddress)

public actual fun tcdrain(fd: CInt): CInt =
    UnixJniBridge.libcUnixTcdrain(fd)

public actual fun cfgetispeed(termios: ConstPtr<Termios>): SpeedT =
    UnixJniBridge.libcUnixCfgetispeed(termios.rawAddress).toUInt()

public actual fun cfgetospeed(termios: ConstPtr<Termios>): SpeedT =
    UnixJniBridge.libcUnixCfgetospeed(termios.rawAddress).toUInt()

public actual fun cfsetispeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    UnixJniBridge.libcUnixCfsetispeed(termios.rawAddress, speed.toInt())

public actual fun cfsetospeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    UnixJniBridge.libcUnixCfsetospeed(termios.rawAddress, speed.toInt())

public actual fun tcgetattr(fd: CInt, termios: MutPtr<Termios>): CInt =
    UnixJniBridge.libcUnixTcgetattr(fd, termios.rawAddress)

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr<Termios>): CInt =
    UnixJniBridge.libcUnixTcsetattr(fd, optionalActions, termios.rawAddress)

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    UnixJniBridge.libcUnixTcflow(fd, action)

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    UnixJniBridge.libcUnixTcflush(fd, action)

public actual fun tcgetsid(fd: CInt): PidT =
    UnixJniBridge.libcUnixTcgetsid(fd)

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    UnixJniBridge.libcUnixTcsendbreak(fd, duration)

public actual fun mkstemp(template: MutPtr<CChar>): CInt =
    UnixJniBridge.libcUnixMkstemp(template.rawAddress)

public actual fun mkdtemp(template: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixMkdtemp(template.rawAddress))

public actual fun tmpnam(ptr: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixTmpnam(ptr.rawAddress))

public actual fun openlog(ident: ConstPtr<CChar>, logopt: CInt, facility: CInt) {
    UnixJniBridge.libcUnixOpenlog(ident.rawAddress, logopt, facility)
}

public actual fun closelog() {
    UnixJniBridge.libcUnixCloselog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    UnixJniBridge.libcUnixSetlogmask(maskpri)

public actual fun syslog(priority: CInt, message: ConstPtr<CChar>, vararg variadicArgs: Long) {
    UnixJniBridge.libcUnixSyslog(priority, message.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun nice(incr: CInt): CInt =
    UnixJniBridge.libcUnixNice(incr)

public actual fun grantpt(fd: CInt): CInt =
    UnixJniBridge.libcUnixGrantpt(fd)

public actual fun posixOpenpt(flags: CInt): CInt =
    UnixJniBridge.libcUnixPosixOpenpt(flags)

public actual fun ptsname(fd: CInt): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixPtsname(fd))

public actual fun unlockpt(fd: CInt): CInt =
    UnixJniBridge.libcUnixUnlockpt(fd)

public actual fun strcasestr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixStrcasestr(cs.rawAddress, ct.rawAddress))

public actual fun getline(lineptr: MutPtr<MutPtr<CChar>>, n: MutPtr<SizeT>, stream: MutPtr<FILE>): SsizeT =
    UnixJniBridge.libcUnixGetline(lineptr.rawAddress, n.rawAddress, stream.rawAddress)

public actual fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt =
    UnixJniBridge.libcUnixLockf(fd, cmd, len)

public actual fun adjtime(delta: ConstPtr<Timeval>, olddelta: MutPtr<Timeval>): CInt =
    UnixJniBridge.libcUnixAdjtime(delta.rawAddress, olddelta.rawAddress)

public actual fun stpncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(UnixJniBridge.libcUnixStpncpy(dst.rawAddress, src.rawAddress, n.toLong()))

public actual fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt =
    0

public actual fun confstr(name: CInt, buf: MutPtr<CChar>, len: SizeT): SizeT =
    UnixJniBridge.libcUnixConfstr(name, buf.rawAddress, len.toLong()).toULong()

public actual fun dladdr(addr: ConstPtr<CVoid>, info: MutPtr<DlInfo>): CInt =
    UnixJniBridge.libcUnixDladdr(addr.rawAddress, info.rawAddress)

public actual fun flock(fd: CInt, operation: CInt): CInt =
    UnixJniBridge.libcUnixFlock(fd, operation)

public actual fun openWmemstream(ptr: MutPtr<MutPtr<WcharT>>, sizeloc: MutPtr<SizeT>): MutPtr<FILE> =
    MutPtr(UnixJniBridge.libcUnixOpenWmemstream(ptr.rawAddress, sizeloc.rawAddress))

public actual fun getsid(pid: PidT): PidT =
    UnixJniBridge.libcUnixGetsid(pid)

public actual fun pause(): CInt =
    UnixJniBridge.libcUnixPause()

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    UnixJniBridge.libcUnixMkdirat(dirfd, pathname.rawAddress, mode.toInt())

public actual fun openat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixOpenat(dirfd, pathname.rawAddress, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fdopendir(fd: CInt): MutPtr<DIR> =
    MutPtr(UnixJniBridge.libcUnixFdopendir(fd))

public actual fun readdirR(dirp: MutPtr<DIR>, entry: MutPtr<Dirent>, result: MutPtr<MutPtr<Dirent>>): CInt =
    UnixJniBridge.libcUnixReaddirR(dirp.rawAddress, entry.rawAddress, result.rawAddress)

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsiz: SizeT): CInt =
    UnixJniBridge.libcUnixReadlinkat(dirfd, pathname.rawAddress, buf.rawAddress, bufsiz.toLong())

public actual fun readlink(path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsz: SizeT): CInt =
    UnixJniBridge.libcUnixReadlink(path.rawAddress, buf.rawAddress, bufsz.toLong())

public actual fun pselect(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: MutPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    UnixJniBridge.libcUnixPselect(nfds, readfds.rawAddress, writefds.rawAddress, errorfds.rawAddress, timeout.rawAddress, sigmask.rawAddress)

public actual fun sigaction(signum: CInt, act: ConstPtr<Sigaction>, oldact: MutPtr<Sigaction>): CInt =
    UnixJniBridge.libcUnixSigaction(signum, act.rawAddress, oldact.rawAddress)

public actual fun fmemopen(buf: MutPtr<CVoid>, size: SizeT, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(UnixJniBridge.libcUnixFmemopen(buf.rawAddress, size.toLong(), mode.rawAddress))

public actual fun openMemstream(ptr: MutPtr<MutPtr<CChar>>, sizeloc: MutPtr<SizeT>): MutPtr<FILE> =
    MutPtr(UnixJniBridge.libcUnixOpenMemstream(ptr.rawAddress, sizeloc.rawAddress))

public actual fun atexit(cb: AtexitCbCallback): CInt =
    UnixJniBridge.libcUnixAtexit(0L)

public actual fun cfmakeraw(termios: MutPtr<Termios>): CInt =
    UnixJniBridge.libcUnixCfmakeraw(termios.rawAddress)

public actual fun cfsetspeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    UnixJniBridge.libcUnixCfsetspeed(termios.rawAddress, speed.toInt())

public actual fun fnmatch(pattern: ConstPtr<CChar>, name: ConstPtr<CChar>, flags: CInt): CInt =
    UnixJniBridge.libcUnixFnmatch(pattern.rawAddress, name.rawAddress, flags)
