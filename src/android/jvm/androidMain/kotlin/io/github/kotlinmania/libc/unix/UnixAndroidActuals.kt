@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

public actual fun qsort(base: MutPtr, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    UnixJniBridge.libcUnixQsort(base.rawAddress, num.toLong(), size.toLong(), 0L)
}

public actual fun bsearch(key: ConstPtr, base: ConstPtr, num: SizeT, size: SizeT, compar: QsortComparCallback?): MutPtr =
    MutPtr(UnixJniBridge.libcUnixBsearch(key.rawAddress, base.rawAddress, num.toLong(), size.toLong(), 0L))

public actual fun fopen(filename: ConstPtr, mode: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixFopen(filename.rawAddress, mode.rawAddress))

public actual fun freopen(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixFreopen(filename.rawAddress, mode.rawAddress, file.rawAddress))

public actual fun fflush(file: MutPtr): CInt =
    UnixJniBridge.libcUnixFflush(file.rawAddress)

public actual fun fclose(file: MutPtr): CInt =
    UnixJniBridge.libcUnixFclose(file.rawAddress)

public actual fun remove(filename: ConstPtr): CInt =
    UnixJniBridge.libcUnixRemove(filename.rawAddress)

public actual fun rename(oldname: ConstPtr, newname: ConstPtr): CInt =
    UnixJniBridge.libcUnixRename(oldname.rawAddress, newname.rawAddress)

public actual fun tmpfile(): MutPtr =
    MutPtr(UnixJniBridge.libcUnixTmpfile())

public actual fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt =
    UnixJniBridge.libcUnixSetvbuf(stream.rawAddress, buffer.rawAddress, mode, size.toLong())

public actual fun setbuf(stream: MutPtr, buf: MutPtr) {
    UnixJniBridge.libcUnixSetbuf(stream.rawAddress, buf.rawAddress)
}

public actual fun getchar(): CInt =
    UnixJniBridge.libcUnixGetchar()

public actual fun putchar(c: CInt): CInt =
    UnixJniBridge.libcUnixPutchar(c)

public actual fun fgetc(stream: MutPtr): CInt =
    UnixJniBridge.libcUnixFgetc(stream.rawAddress)

public actual fun fgets(buf: MutPtr, n: CInt, stream: MutPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixFgets(buf.rawAddress, n, stream.rawAddress))

public actual fun fputc(c: CInt, stream: MutPtr): CInt =
    UnixJniBridge.libcUnixFputc(c, stream.rawAddress)

public actual fun fputs(s: ConstPtr, stream: MutPtr): CInt =
    UnixJniBridge.libcUnixFputs(s.rawAddress, stream.rawAddress)

public actual fun puts(s: ConstPtr): CInt =
    UnixJniBridge.libcUnixPuts(s.rawAddress)

public actual fun ungetc(c: CInt, stream: MutPtr): CInt =
    UnixJniBridge.libcUnixUngetc(c, stream.rawAddress)

public actual fun fread(ptr: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    UnixJniBridge.libcUnixFread(ptr.rawAddress, size.toLong(), nobj.toLong(), stream.rawAddress).toULong()

public actual fun fwrite(ptr: ConstPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    UnixJniBridge.libcUnixFwrite(ptr.rawAddress, size.toLong(), nobj.toLong(), stream.rawAddress).toULong()

public actual fun fseek(stream: MutPtr, offset: CLong, whence: CInt): CInt =
    UnixJniBridge.libcUnixFseek(stream.rawAddress, offset, whence)

public actual fun ftell(stream: MutPtr): CLong =
    UnixJniBridge.libcUnixFtell(stream.rawAddress)

public actual fun rewind(stream: MutPtr) {
    UnixJniBridge.libcUnixRewind(stream.rawAddress)
}

public actual fun fgetpos(stream: MutPtr, ptr: MutPtr): CInt =
    UnixJniBridge.libcUnixFgetpos(stream.rawAddress, ptr.rawAddress)

public actual fun fsetpos(stream: MutPtr, ptr: ConstPtr): CInt =
    UnixJniBridge.libcUnixFsetpos(stream.rawAddress, ptr.rawAddress)

public actual fun feof(stream: MutPtr): CInt =
    UnixJniBridge.libcUnixFeof(stream.rawAddress)

public actual fun ferror(stream: MutPtr): CInt =
    UnixJniBridge.libcUnixFerror(stream.rawAddress)

public actual fun clearerr(stream: MutPtr) {
    UnixJniBridge.libcUnixClearerr(stream.rawAddress)
}

public actual fun perror(s: ConstPtr) {
    UnixJniBridge.libcUnixPerror(s.rawAddress)
}

public actual fun atof(s: ConstPtr): CDouble =
    UnixJniBridge.libcUnixAtof(s.rawAddress)

public actual fun atoi(s: ConstPtr): CInt =
    UnixJniBridge.libcUnixAtoi(s.rawAddress)

public actual fun atol(s: ConstPtr): CLong =
    UnixJniBridge.libcUnixAtol(s.rawAddress)

public actual fun atoll(s: ConstPtr): CLonglong =
    UnixJniBridge.libcUnixAtoll(s.rawAddress)

public actual fun strtod(s: ConstPtr, endp: MutPtr): CDouble =
    UnixJniBridge.libcUnixStrtod(s.rawAddress, endp.rawAddress)

public actual fun strtof(s: ConstPtr, endp: MutPtr): CFloat =
    UnixJniBridge.libcUnixStrtof(s.rawAddress, endp.rawAddress)

public actual fun strtol(s: ConstPtr, endp: MutPtr, base: CInt): CLong =
    UnixJniBridge.libcUnixStrtol(s.rawAddress, endp.rawAddress, base)

public actual fun strtoll(s: ConstPtr, endp: MutPtr, base: CInt): CLonglong =
    UnixJniBridge.libcUnixStrtoll(s.rawAddress, endp.rawAddress, base)

public actual fun strtoul(s: ConstPtr, endp: MutPtr, base: CInt): CUlong =
    UnixJniBridge.libcUnixStrtoul(s.rawAddress, endp.rawAddress, base).toULong()

public actual fun strtoull(s: ConstPtr, endp: MutPtr, base: CInt): CUlonglong =
    UnixJniBridge.libcUnixStrtoull(s.rawAddress, endp.rawAddress, base).toULong()

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr =
    MutPtr(UnixJniBridge.libcUnixCalloc(nobj.toLong(), size.toLong()))

public actual fun malloc(size: SizeT): MutPtr =
    MutPtr(UnixJniBridge.libcUnixMalloc(size.toLong()))

public actual fun realloc(p: MutPtr, size: SizeT): MutPtr =
    MutPtr(UnixJniBridge.libcUnixRealloc(p.rawAddress, size.toLong()))

public actual fun free(p: MutPtr) {
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

public actual fun system(s: ConstPtr): CInt =
    UnixJniBridge.libcUnixSystem(s.rawAddress)

public actual fun getenv(s: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixGetenv(s.rawAddress))

public actual fun strcpy(dst: MutPtr, src: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixStrcpy(dst.rawAddress, src.rawAddress))

public actual fun strncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(UnixJniBridge.libcUnixStrncpy(dst.rawAddress, src.rawAddress, n.toLong()))

public actual fun stpcpy(dst: MutPtr, src: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixStpcpy(dst.rawAddress, src.rawAddress))

public actual fun strcat(s: MutPtr, ct: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixStrcat(s.rawAddress, ct.rawAddress))

public actual fun strncat(s: MutPtr, ct: ConstPtr, n: SizeT): MutPtr =
    MutPtr(UnixJniBridge.libcUnixStrncat(s.rawAddress, ct.rawAddress, n.toLong()))

public actual fun strcmp(cs: ConstPtr, ct: ConstPtr): CInt =
    UnixJniBridge.libcUnixStrcmp(cs.rawAddress, ct.rawAddress)

public actual fun strncmp(cs: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    UnixJniBridge.libcUnixStrncmp(cs.rawAddress, ct.rawAddress, n.toLong())

public actual fun strcoll(cs: ConstPtr, ct: ConstPtr): CInt =
    UnixJniBridge.libcUnixStrcoll(cs.rawAddress, ct.rawAddress)

public actual fun strchr(cs: ConstPtr, c: CInt): MutPtr =
    MutPtr(UnixJniBridge.libcUnixStrchr(cs.rawAddress, c))

public actual fun strrchr(cs: ConstPtr, c: CInt): MutPtr =
    MutPtr(UnixJniBridge.libcUnixStrrchr(cs.rawAddress, c))

public actual fun strspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    UnixJniBridge.libcUnixStrspn(cs.rawAddress, ct.rawAddress).toULong()

public actual fun strcspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    UnixJniBridge.libcUnixStrcspn(cs.rawAddress, ct.rawAddress).toULong()

public actual fun strdup(cs: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixStrdup(cs.rawAddress))

public actual fun strndup(cs: ConstPtr, n: SizeT): MutPtr =
    MutPtr(UnixJniBridge.libcUnixStrndup(cs.rawAddress, n.toLong()))

public actual fun strpbrk(cs: ConstPtr, ct: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixStrpbrk(cs.rawAddress, ct.rawAddress))

public actual fun strstr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixStrstr(cs.rawAddress, ct.rawAddress))

public actual fun strcasecmp(s1: ConstPtr, s2: ConstPtr): CInt =
    UnixJniBridge.libcUnixStrcasecmp(s1.rawAddress, s2.rawAddress)

public actual fun strncasecmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    UnixJniBridge.libcUnixStrncasecmp(s1.rawAddress, s2.rawAddress, n.toLong())

public actual fun strlen(cs: ConstPtr): SizeT =
    UnixJniBridge.libcUnixStrlen(cs.rawAddress).toULong()

public actual fun strnlen(cs: ConstPtr, maxlen: SizeT): SizeT =
    UnixJniBridge.libcUnixStrnlen(cs.rawAddress, maxlen.toLong()).toULong()

public actual fun strerror(n: CInt): MutPtr =
    MutPtr(UnixJniBridge.libcUnixStrerror(n))

public actual fun strtok(s: MutPtr, t: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixStrtok(s.rawAddress, t.rawAddress))

public actual fun strtokR(s: MutPtr, t: ConstPtr, p: MutPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixStrtokR(s.rawAddress, t.rawAddress, p.rawAddress))

public actual fun strxfrm(s: MutPtr, ct: ConstPtr, n: SizeT): SizeT =
    UnixJniBridge.libcUnixStrxfrm(s.rawAddress, ct.rawAddress, n.toLong()).toULong()

public actual fun strsignal(sig: CInt): MutPtr =
    MutPtr(UnixJniBridge.libcUnixStrsignal(sig))

public actual fun wcslen(buf: ConstPtr): SizeT =
    UnixJniBridge.libcUnixWcslen(buf.rawAddress).toULong()

public actual fun wcstombs(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT =
    UnixJniBridge.libcUnixWcstombs(dest.rawAddress, src.rawAddress, n.toLong()).toULong()

public actual fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(UnixJniBridge.libcUnixMemchr(cx.rawAddress, c, n.toLong()))

public actual fun wmemchr(cx: ConstPtr, c: WcharT, n: SizeT): MutPtr =
    MutPtr(UnixJniBridge.libcUnixWmemchr(cx.rawAddress, c.toInt(), n.toLong()))

public actual fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    UnixJniBridge.libcUnixMemcmp(cx.rawAddress, ct.rawAddress, n.toLong())

public actual fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(UnixJniBridge.libcUnixMemcpy(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(UnixJniBridge.libcUnixMemmove(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(UnixJniBridge.libcUnixMemset(dest.rawAddress, c, n.toLong()))

public actual fun memccpy(dest: MutPtr, src: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(UnixJniBridge.libcUnixMemccpy(dest.rawAddress, src.rawAddress, c, n.toLong()))

public actual fun getpwnam(name: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixGetpwnam(name.rawAddress))

public actual fun getpwuid(uid: UidT): MutPtr =
    MutPtr(UnixJniBridge.libcUnixGetpwuid(uid.toShort()))

public actual fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixFprintf(stream.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixPrintf(format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: MutPtr, n: SizeT, format: ConstPtr, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixSnprintf(s.rawAddress, n.toLong(), format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixSprintf(s.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixFscanf(stream.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun scanf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixScanf(format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: ConstPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixSscanf(s.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getcharUnlocked(): CInt =
    UnixJniBridge.libcUnixGetcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    UnixJniBridge.libcUnixPutcharUnlocked(c)

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    UnixJniBridge.libcUnixSocket(domain, ty, protocol)

public actual fun connect(socket: CInt, address: ConstPtr, len: SocklenT): CInt =
    UnixJniBridge.libcUnixConnect(socket, address.rawAddress, len.toInt())

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    UnixJniBridge.libcUnixListen(socket, backlog)

public actual fun accept(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    UnixJniBridge.libcUnixAccept(socket, address.rawAddress, addressLen.rawAddress)

public actual fun getpeername(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    UnixJniBridge.libcUnixGetpeername(socket, address.rawAddress, addressLen.rawAddress)

public actual fun getsockname(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    UnixJniBridge.libcUnixGetsockname(socket, address.rawAddress, addressLen.rawAddress)

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr, optionLen: SocklenT): CInt =
    UnixJniBridge.libcUnixSetsockopt(socket, level, name, value.rawAddress, optionLen.toInt())

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: MutPtr): CInt =
    UnixJniBridge.libcUnixSocketpair(domain, type, protocol, socketVector.rawAddress)

public actual fun sendto(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt, addr: ConstPtr, addrlen: SocklenT): SsizeT =
    UnixJniBridge.libcUnixSendto(socket, buf.rawAddress, len.toLong(), flags, addr.rawAddress, addrlen.toInt())

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    UnixJniBridge.libcUnixShutdown(socket, how)

public actual fun chmod(path: ConstPtr, mode: ModeT): CInt =
    UnixJniBridge.libcUnixChmod(path.rawAddress, mode.toInt())

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    UnixJniBridge.libcUnixFchmod(fd, mode.toInt())

public actual fun fstat(fildes: CInt, buf: MutPtr): CInt =
    UnixJniBridge.libcUnixFstat(fildes, buf.rawAddress)

public actual fun mkdir(path: ConstPtr, mode: ModeT): CInt =
    UnixJniBridge.libcUnixMkdir(path.rawAddress, mode.toInt())

public actual fun stat(path: ConstPtr, buf: MutPtr): CInt =
    UnixJniBridge.libcUnixStat(path.rawAddress, buf.rawAddress)

public actual fun pclose(stream: MutPtr): CInt =
    UnixJniBridge.libcUnixPclose(stream.rawAddress)

public actual fun fdopen(fd: CInt, mode: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixFdopen(fd, mode.rawAddress))

public actual fun fileno(stream: MutPtr): CInt =
    UnixJniBridge.libcUnixFileno(stream.rawAddress)

public actual fun open(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixOpen(path.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(path: ConstPtr, mode: ModeT): CInt =
    UnixJniBridge.libcUnixCreat(path.rawAddress, mode.toInt())

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun opendir(dirname: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixOpendir(dirname.rawAddress))

public actual fun readdir(dirp: MutPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixReaddir(dirp.rawAddress))

public actual fun closedir(dirp: MutPtr): CInt =
    UnixJniBridge.libcUnixClosedir(dirp.rawAddress)

public actual fun rewinddir(dirp: MutPtr) {
    UnixJniBridge.libcUnixRewinddir(dirp.rawAddress)
}

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, flags: CInt): CInt =
    UnixJniBridge.libcUnixFchmodat(dirfd, pathname.rawAddress, mode.toInt(), flags)

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    UnixJniBridge.libcUnixFchown(fd, owner.toShort(), group.toShort())

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr, owner: UidT, group: GidT, flags: CInt): CInt =
    UnixJniBridge.libcUnixFchownat(dirfd, pathname.rawAddress, owner.toShort(), group.toShort(), flags)

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, flags: CInt): CInt =
    UnixJniBridge.libcUnixFstatat(dirfd, pathname.rawAddress, buf.rawAddress, flags)

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt =
    UnixJniBridge.libcUnixLinkat(olddirfd, oldpath.rawAddress, newdirfd, newpath.rawAddress, flags)

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt =
    UnixJniBridge.libcUnixRenameat(olddirfd, oldpath.rawAddress, newdirfd, newpath.rawAddress)

public actual fun symlinkat(target: ConstPtr, newdirfd: CInt, linkpath: ConstPtr): CInt =
    UnixJniBridge.libcUnixSymlinkat(target.rawAddress, newdirfd, linkpath.rawAddress)

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr, flags: CInt): CInt =
    UnixJniBridge.libcUnixUnlinkat(dirfd, pathname.rawAddress, flags)

public actual fun access(path: ConstPtr, amode: CInt): CInt =
    UnixJniBridge.libcUnixAccess(path.rawAddress, amode)

public actual fun alarm(seconds: CUint): CUint =
    UnixJniBridge.libcUnixAlarm(seconds.toInt()).toUInt()

public actual fun chdir(dir: ConstPtr): CInt =
    UnixJniBridge.libcUnixChdir(dir.rawAddress)

public actual fun fchdir(dirfd: CInt): CInt =
    UnixJniBridge.libcUnixFchdir(dirfd)

public actual fun chown(path: ConstPtr, uid: UidT, gid: GidT): CInt =
    UnixJniBridge.libcUnixChown(path.rawAddress, uid.toShort(), gid.toShort())

public actual fun lchown(path: ConstPtr, uid: UidT, gid: GidT): CInt =
    UnixJniBridge.libcUnixLchown(path.rawAddress, uid.toShort(), gid.toShort())

public actual fun close(fd: CInt): CInt =
    UnixJniBridge.libcUnixClose(fd)

public actual fun dup(fd: CInt): CInt =
    UnixJniBridge.libcUnixDup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    UnixJniBridge.libcUnixDup2(src, dst)

public actual fun execl(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixExecl(path.rawAddress, arg0.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execle(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixExecle(path.rawAddress, arg0.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execlp(file: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixExeclp(file.rawAddress, arg0.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execv(prog: ConstPtr, argv: ConstPtr): CInt =
    UnixJniBridge.libcUnixExecv(prog.rawAddress, argv.rawAddress)

public actual fun execve(prog: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    UnixJniBridge.libcUnixExecve(prog.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun execvp(c: ConstPtr, argv: ConstPtr): CInt =
    UnixJniBridge.libcUnixExecvp(c.rawAddress, argv.rawAddress)

public actual fun fork(): PidT =
    UnixJniBridge.libcUnixFork()

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    UnixJniBridge.libcUnixFpathconf(filedes, name)

public actual fun getcwd(buf: MutPtr, size: SizeT): MutPtr =
    MutPtr(UnixJniBridge.libcUnixGetcwd(buf.rawAddress, size.toLong()))

public actual fun getegid(): GidT =
    UnixJniBridge.libcUnixGetegid().toUShort()

public actual fun geteuid(): UidT =
    UnixJniBridge.libcUnixGeteuid().toUShort()

public actual fun getgid(): GidT =
    UnixJniBridge.libcUnixGetgid().toUShort()

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr): CInt =
    UnixJniBridge.libcUnixGetgroups(ngroupsMax, groups.rawAddress)

public actual fun getlogin(): MutPtr =
    MutPtr(UnixJniBridge.libcUnixGetlogin())

public actual fun getopt(argc: CInt, argv: ConstPtr, optstr: ConstPtr): CInt =
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

public actual fun link(src: ConstPtr, dst: ConstPtr): CInt =
    UnixJniBridge.libcUnixLink(src.rawAddress, dst.rawAddress)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    UnixJniBridge.libcUnixLseek(fd, offset, whence)

public actual fun pathconf(path: ConstPtr, name: CInt): CLong =
    UnixJniBridge.libcUnixPathconf(path.rawAddress, name)

public actual fun pipe(fds: MutPtr): CInt =
    UnixJniBridge.libcUnixPipe(fds.rawAddress)

public actual fun posixMemalign(memptr: MutPtr, align: SizeT, size: SizeT): CInt =
    UnixJniBridge.libcUnixPosixMemalign(memptr.rawAddress, align.toLong(), size.toLong())

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr =
    MutPtr(UnixJniBridge.libcUnixAlignedAlloc(alignment.toLong(), size.toLong()))

public actual fun read(fd: CInt, buf: MutPtr, count: SizeT): SsizeT =
    UnixJniBridge.libcUnixRead(fd, buf.rawAddress, count.toLong())

public actual fun rmdir(path: ConstPtr): CInt =
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

public actual fun nanosleep(rqtp: ConstPtr, rmtp: MutPtr): CInt =
    UnixJniBridge.libcUnixNanosleep(rqtp.rawAddress, rmtp.rawAddress)

public actual fun tcgetpgrp(fd: CInt): PidT =
    UnixJniBridge.libcUnixTcgetpgrp(fd)

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    UnixJniBridge.libcUnixTcsetpgrp(fd, pgrp)

public actual fun ttyname(fd: CInt): MutPtr =
    MutPtr(UnixJniBridge.libcUnixTtyname(fd))

public actual fun ttynameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt =
    UnixJniBridge.libcUnixTtynameR(fd, buf.rawAddress, buflen.toLong())

public actual fun unlink(c: ConstPtr): CInt =
    UnixJniBridge.libcUnixUnlink(c.rawAddress)

public actual fun wait(status: MutPtr): PidT =
    UnixJniBridge.libcUnixWait(status.rawAddress)

public actual fun waitpid(pid: PidT, status: MutPtr, options: CInt): PidT =
    UnixJniBridge.libcUnixWaitpid(pid, status.rawAddress, options)

public actual fun write(fd: CInt, buf: ConstPtr, count: SizeT): SsizeT =
    UnixJniBridge.libcUnixWrite(fd, buf.rawAddress, count.toLong())

public actual fun pread(fd: CInt, buf: MutPtr, count: SizeT, offset: OffT): SsizeT =
    UnixJniBridge.libcUnixPread(fd, buf.rawAddress, count.toLong(), offset)

public actual fun pwrite(fd: CInt, buf: ConstPtr, count: SizeT, offset: OffT): SsizeT =
    UnixJniBridge.libcUnixPwrite(fd, buf.rawAddress, count.toLong(), offset)

public actual fun umask(mask: ModeT): ModeT =
    UnixJniBridge.libcUnixUmask(mask.toInt()).toUInt()

public actual fun utime(file: ConstPtr, buf: ConstPtr): CInt =
    UnixJniBridge.libcUnixUtime(file.rawAddress, buf.rawAddress)

public actual fun kill(pid: PidT, sig: CInt): CInt =
    UnixJniBridge.libcUnixKill(pid, sig)

public actual fun killpg(pgrp: PidT, sig: CInt): CInt =
    UnixJniBridge.libcUnixKillpg(pgrp, sig)

public actual fun mlock(addr: ConstPtr, len: SizeT): CInt =
    UnixJniBridge.libcUnixMlock(addr.rawAddress, len.toLong())

public actual fun munlock(addr: ConstPtr, len: SizeT): CInt =
    UnixJniBridge.libcUnixMunlock(addr.rawAddress, len.toLong())

public actual fun mlockall(flags: CInt): CInt =
    UnixJniBridge.libcUnixMlockall(flags)

public actual fun munlockall(): CInt =
    UnixJniBridge.libcUnixMunlockall()

public actual fun mmap(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr =
    MutPtr(UnixJniBridge.libcUnixMmap(addr.rawAddress, len.toLong(), prot, flags, fd, offset))

public actual fun munmap(addr: MutPtr, len: SizeT): CInt =
    UnixJniBridge.libcUnixMunmap(addr.rawAddress, len.toLong())

public actual fun ifNametoindex(ifname: ConstPtr): CUint =
    UnixJniBridge.libcUnixIfNametoindex(ifname.rawAddress).toUInt()

public actual fun ifIndextoname(ifindex: CUint, ifname: MutPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixIfIndextoname(ifindex.toInt(), ifname.rawAddress))

public actual fun lstat(path: ConstPtr, buf: MutPtr): CInt =
    UnixJniBridge.libcUnixLstat(path.rawAddress, buf.rawAddress)

public actual fun fsync(fd: CInt): CInt =
    UnixJniBridge.libcUnixFsync(fd)

public actual fun setenv(name: ConstPtr, value: ConstPtr, overwrite: CInt): CInt =
    UnixJniBridge.libcUnixSetenv(name.rawAddress, value.rawAddress, overwrite)

public actual fun unsetenv(name: ConstPtr): CInt =
    UnixJniBridge.libcUnixUnsetenv(name.rawAddress)

public actual fun symlink(path1: ConstPtr, path2: ConstPtr): CInt =
    UnixJniBridge.libcUnixSymlink(path1.rawAddress, path2.rawAddress)

public actual fun truncate(path: ConstPtr, length: OffT): CInt =
    UnixJniBridge.libcUnixTruncate(path.rawAddress, length)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    UnixJniBridge.libcUnixFtruncate(fd, length)

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    UnixJniBridge.libcUnixSignal(signum, handler.toLong()).toULong()

public actual fun getrusage(resource: CInt, usage: MutPtr): CInt =
    UnixJniBridge.libcUnixGetrusage(resource, usage.rawAddress)

public actual fun realpath(pathname: ConstPtr, resolved: MutPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixRealpath(pathname.rawAddress, resolved.rawAddress))

public actual fun times(buf: MutPtr): ClockT =
    UnixJniBridge.libcUnixTimes(buf.rawAddress)

public actual fun pthreadSelf(): PthreadT =
    UnixJniBridge.libcUnixPthreadSelf().toULong()

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    UnixJniBridge.libcUnixPthreadEqual(t1.toLong(), t2.toLong())

public actual fun pthreadJoin(native: PthreadT, value: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadJoin(native.toLong(), value.rawAddress)

public actual fun pthreadExit(value: MutPtr): Nothing {
    UnixJniBridge.libcUnixPthreadExit(value.rawAddress)
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadAttrInit(attr.rawAddress)

public actual fun pthreadAttrDestroy(attr: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadAttrDestroy(attr.rawAddress)

public actual fun pthreadAttrGetstacksize(attr: ConstPtr, stacksize: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadAttrGetstacksize(attr.rawAddress, stacksize.rawAddress)

public actual fun pthreadAttrSetstacksize(attr: MutPtr, stackSize: SizeT): CInt =
    UnixJniBridge.libcUnixPthreadAttrSetstacksize(attr.rawAddress, stackSize.toLong())

public actual fun pthreadAttrSetdetachstate(attr: MutPtr, state: CInt): CInt =
    UnixJniBridge.libcUnixPthreadAttrSetdetachstate(attr.rawAddress, state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    UnixJniBridge.libcUnixPthreadDetach(thread.toLong())

public actual fun schedYield(): CInt =
    UnixJniBridge.libcUnixSchedYield()

public actual fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt =
    UnixJniBridge.libcUnixPthreadKeyCreate(key.rawAddress, 0L)

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    UnixJniBridge.libcUnixPthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr =
    MutPtr(UnixJniBridge.libcUnixPthreadGetspecific(key))

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt =
    UnixJniBridge.libcUnixPthreadSetspecific(key, value.rawAddress)

public actual fun pthreadMutexInit(lock: MutPtr, attr: ConstPtr): CInt =
    UnixJniBridge.libcUnixPthreadMutexInit(lock.rawAddress, attr.rawAddress)

public actual fun pthreadMutexDestroy(lock: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadMutexDestroy(lock.rawAddress)

public actual fun pthreadMutexLock(lock: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadMutexLock(lock.rawAddress)

public actual fun pthreadMutexTrylock(lock: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadMutexTrylock(lock.rawAddress)

public actual fun pthreadMutexUnlock(lock: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadMutexUnlock(lock.rawAddress)

public actual fun pthreadMutexattrInit(attr: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadMutexattrInit(attr.rawAddress)

public actual fun pthreadMutexattrDestroy(attr: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadMutexattrDestroy(attr.rawAddress)

public actual fun pthreadMutexattrSettype(attr: MutPtr, type: CInt): CInt =
    UnixJniBridge.libcUnixPthreadMutexattrSettype(attr.rawAddress, type)

public actual fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt =
    UnixJniBridge.libcUnixPthreadCondInit(cond.rawAddress, attr.rawAddress)

public actual fun pthreadCondWait(cond: MutPtr, lock: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadCondWait(cond.rawAddress, lock.rawAddress)

public actual fun pthreadCondTimedwait(cond: MutPtr, lock: MutPtr, abstime: ConstPtr): CInt =
    UnixJniBridge.libcUnixPthreadCondTimedwait(cond.rawAddress, lock.rawAddress, abstime.rawAddress)

public actual fun pthreadCondSignal(cond: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadCondSignal(cond.rawAddress)

public actual fun pthreadCondBroadcast(cond: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadCondBroadcast(cond.rawAddress)

public actual fun pthreadCondDestroy(cond: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadCondDestroy(cond.rawAddress)

public actual fun pthreadCondattrInit(attr: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadCondattrInit(attr.rawAddress)

public actual fun pthreadCondattrDestroy(attr: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadCondattrDestroy(attr.rawAddress)

public actual fun pthreadRwlockInit(lock: MutPtr, attr: ConstPtr): CInt =
    UnixJniBridge.libcUnixPthreadRwlockInit(lock.rawAddress, attr.rawAddress)

public actual fun pthreadRwlockDestroy(lock: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadRwlockDestroy(lock.rawAddress)

public actual fun pthreadRwlockRdlock(lock: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadRwlockRdlock(lock.rawAddress)

public actual fun pthreadRwlockTryrdlock(lock: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadRwlockTryrdlock(lock.rawAddress)

public actual fun pthreadRwlockWrlock(lock: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadRwlockWrlock(lock.rawAddress)

public actual fun pthreadRwlockTrywrlock(lock: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadRwlockTrywrlock(lock.rawAddress)

public actual fun pthreadRwlockUnlock(lock: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadRwlockUnlock(lock.rawAddress)

public actual fun pthreadRwlockattrInit(attr: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadRwlockattrInit(attr.rawAddress)

public actual fun pthreadRwlockattrDestroy(attr: MutPtr): CInt =
    UnixJniBridge.libcUnixPthreadRwlockattrDestroy(attr.rawAddress)

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr, optlen: MutPtr): CInt =
    UnixJniBridge.libcUnixGetsockopt(sockfd, level, optname, optval.rawAddress, optlen.rawAddress)

public actual fun raise(signum: CInt): CInt =
    UnixJniBridge.libcUnixRaise(signum)

public actual fun utimes(filename: ConstPtr, times: ConstPtr): CInt =
    UnixJniBridge.libcUnixUtimes(filename.rawAddress, times.rawAddress)

public actual fun dlopen(filename: ConstPtr, flag: CInt): MutPtr =
    MutPtr(UnixJniBridge.libcUnixDlopen(filename.rawAddress, flag))

public actual fun dlerror(): MutPtr =
    MutPtr(UnixJniBridge.libcUnixDlerror())

public actual fun dlsym(handle: MutPtr, symbol: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixDlsym(handle.rawAddress, symbol.rawAddress))

public actual fun dlclose(handle: MutPtr): CInt =
    UnixJniBridge.libcUnixDlclose(handle.rawAddress)

public actual fun getaddrinfo(node: ConstPtr, service: ConstPtr, hints: ConstPtr, res: MutPtr): CInt =
    UnixJniBridge.libcUnixGetaddrinfo(node.rawAddress, service.rawAddress, hints.rawAddress, res.rawAddress)

public actual fun freeaddrinfo(res: MutPtr) {
    UnixJniBridge.libcUnixFreeaddrinfo(res.rawAddress)
}

public actual fun hstrerror(errcode: CInt): ConstPtr =
    ConstPtr(UnixJniBridge.libcUnixHstrerror(errcode))

public actual fun gaiStrerror(errcode: CInt): ConstPtr =
    ConstPtr(UnixJniBridge.libcUnixGaiStrerror(errcode))

public actual fun resInit(): CInt =
    UnixJniBridge.libcUnixResInit()

public actual fun gmtimeR(timeP: ConstPtr, result: MutPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixGmtimeR(timeP.rawAddress, result.rawAddress))

public actual fun localtimeR(timeP: ConstPtr, result: MutPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixLocaltimeR(timeP.rawAddress, result.rawAddress))

public actual fun mktime(tm: MutPtr): TimeT =
    UnixJniBridge.libcUnixMktime(tm.rawAddress)

public actual fun time(time: MutPtr): TimeT =
    UnixJniBridge.libcUnixTime(time.rawAddress)

public actual fun gmtime(timeP: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixGmtime(timeP.rawAddress))

public actual fun localtime(timeP: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixLocaltime(timeP.rawAddress))

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    UnixJniBridge.libcUnixDifftime(time1, time0)

public actual fun timegm(tm: MutPtr): TimeT =
    UnixJniBridge.libcUnixTimegm(tm.rawAddress)

public actual fun mknod(pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    UnixJniBridge.libcUnixMknod(pathname.rawAddress, mode.toInt(), dev)

public actual fun gethostname(name: MutPtr, len: SizeT): CInt =
    UnixJniBridge.libcUnixGethostname(name.rawAddress, len.toLong())

public actual fun endservent() {
    UnixJniBridge.libcUnixEndservent()
}

public actual fun getservbyname(name: ConstPtr, proto: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixGetservbyname(name.rawAddress, proto.rawAddress))

public actual fun getservbyport(port: CInt, proto: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixGetservbyport(port, proto.rawAddress))

public actual fun getservent(): MutPtr =
    MutPtr(UnixJniBridge.libcUnixGetservent())

public actual fun setservent(stayopen: CInt) {
    UnixJniBridge.libcUnixSetservent(stayopen)
}

public actual fun getprotobyname(name: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixGetprotobyname(name.rawAddress))

public actual fun getprotobynumber(proto: CInt): MutPtr =
    MutPtr(UnixJniBridge.libcUnixGetprotobynumber(proto))

public actual fun chroot(name: ConstPtr): CInt =
    UnixJniBridge.libcUnixChroot(name.rawAddress)

public actual fun usleep(secs: UsecondsT): CInt =
    UnixJniBridge.libcUnixUsleep(secs.toInt())

public actual fun send(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt): SsizeT =
    UnixJniBridge.libcUnixSend(socket, buf.rawAddress, len.toLong(), flags)

public actual fun recv(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt): SsizeT =
    UnixJniBridge.libcUnixRecv(socket, buf.rawAddress, len.toLong(), flags)

public actual fun putenv(string: MutPtr): CInt =
    UnixJniBridge.libcUnixPutenv(string.rawAddress)

public actual fun poll(fds: MutPtr, nfds: NfdsT, timeout: CInt): CInt =
    UnixJniBridge.libcUnixPoll(fds.rawAddress, nfds.toLong(), timeout)

public actual fun select(nfds: CInt, readfds: MutPtr, writefds: MutPtr, errorfds: MutPtr, timeout: MutPtr): CInt =
    UnixJniBridge.libcUnixSelect(nfds, readfds.rawAddress, writefds.rawAddress, errorfds.rawAddress, timeout.rawAddress)

public actual fun setlocale(category: CInt, locale: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixSetlocale(category, locale.rawAddress))

public actual fun localeconv(): MutPtr =
    MutPtr(UnixJniBridge.libcUnixLocaleconv())

public actual fun semWait(sem: MutPtr): CInt =
    UnixJniBridge.libcUnixSemWait(sem.rawAddress)

public actual fun semTrywait(sem: MutPtr): CInt =
    UnixJniBridge.libcUnixSemTrywait(sem.rawAddress)

public actual fun semPost(sem: MutPtr): CInt =
    UnixJniBridge.libcUnixSemPost(sem.rawAddress)

public actual fun statvfs(path: ConstPtr, buf: MutPtr): CInt =
    UnixJniBridge.libcUnixStatvfs(path.rawAddress, buf.rawAddress)

public actual fun fstatvfs(fd: CInt, buf: MutPtr): CInt =
    UnixJniBridge.libcUnixFstatvfs(fd, buf.rawAddress)

public actual fun sigemptyset(set: MutPtr): CInt =
    UnixJniBridge.libcUnixSigemptyset(set.rawAddress)

public actual fun sigaddset(set: MutPtr, signum: CInt): CInt =
    UnixJniBridge.libcUnixSigaddset(set.rawAddress, signum)

public actual fun sigfillset(set: MutPtr): CInt =
    UnixJniBridge.libcUnixSigfillset(set.rawAddress)

public actual fun sigdelset(set: MutPtr, signum: CInt): CInt =
    UnixJniBridge.libcUnixSigdelset(set.rawAddress, signum)

public actual fun sigismember(set: ConstPtr, signum: CInt): CInt =
    UnixJniBridge.libcUnixSigismember(set.rawAddress, signum)

public actual fun sigprocmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    UnixJniBridge.libcUnixSigprocmask(how, set.rawAddress, oldset.rawAddress)

public actual fun sigpending(set: MutPtr): CInt =
    UnixJniBridge.libcUnixSigpending(set.rawAddress)

public actual fun sysconf(name: CInt): CLong =
    UnixJniBridge.libcUnixSysconf(name)

public actual fun mkfifo(path: ConstPtr, mode: ModeT): CInt =
    UnixJniBridge.libcUnixMkfifo(path.rawAddress, mode.toInt())

public actual fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt =
    UnixJniBridge.libcUnixFseeko(stream.rawAddress, offset, whence)

public actual fun ftello(stream: MutPtr): OffT =
    UnixJniBridge.libcUnixFtello(stream.rawAddress)

public actual fun tcdrain(fd: CInt): CInt =
    UnixJniBridge.libcUnixTcdrain(fd)

public actual fun cfgetispeed(termios: ConstPtr): SpeedT =
    UnixJniBridge.libcUnixCfgetispeed(termios.rawAddress).toUInt()

public actual fun cfgetospeed(termios: ConstPtr): SpeedT =
    UnixJniBridge.libcUnixCfgetospeed(termios.rawAddress).toUInt()

public actual fun cfsetispeed(termios: MutPtr, speed: SpeedT): CInt =
    UnixJniBridge.libcUnixCfsetispeed(termios.rawAddress, speed.toInt())

public actual fun cfsetospeed(termios: MutPtr, speed: SpeedT): CInt =
    UnixJniBridge.libcUnixCfsetospeed(termios.rawAddress, speed.toInt())

public actual fun tcgetattr(fd: CInt, termios: MutPtr): CInt =
    UnixJniBridge.libcUnixTcgetattr(fd, termios.rawAddress)

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr): CInt =
    UnixJniBridge.libcUnixTcsetattr(fd, optionalActions, termios.rawAddress)

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    UnixJniBridge.libcUnixTcflow(fd, action)

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    UnixJniBridge.libcUnixTcflush(fd, action)

public actual fun tcgetsid(fd: CInt): PidT =
    UnixJniBridge.libcUnixTcgetsid(fd)

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    UnixJniBridge.libcUnixTcsendbreak(fd, duration)

public actual fun mkstemp(template: MutPtr): CInt =
    UnixJniBridge.libcUnixMkstemp(template.rawAddress)

public actual fun mkdtemp(template: MutPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixMkdtemp(template.rawAddress))

public actual fun tmpnam(ptr: MutPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixTmpnam(ptr.rawAddress))

public actual fun openlog(ident: ConstPtr, logopt: CInt, facility: CInt) {
    UnixJniBridge.libcUnixOpenlog(ident.rawAddress, logopt, facility)
}

public actual fun closelog() {
    UnixJniBridge.libcUnixCloselog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    UnixJniBridge.libcUnixSetlogmask(maskpri)

public actual fun syslog(priority: CInt, message: ConstPtr, vararg variadicArgs: Long) {
    UnixJniBridge.libcUnixSyslog(priority, message.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun nice(incr: CInt): CInt =
    UnixJniBridge.libcUnixNice(incr)

public actual fun grantpt(fd: CInt): CInt =
    UnixJniBridge.libcUnixGrantpt(fd)

public actual fun posixOpenpt(flags: CInt): CInt =
    UnixJniBridge.libcUnixPosixOpenpt(flags)

public actual fun ptsname(fd: CInt): MutPtr =
    MutPtr(UnixJniBridge.libcUnixPtsname(fd))

public actual fun unlockpt(fd: CInt): CInt =
    UnixJniBridge.libcUnixUnlockpt(fd)

public actual fun strcasestr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixStrcasestr(cs.rawAddress, ct.rawAddress))

public actual fun getline(lineptr: MutPtr, n: MutPtr, stream: MutPtr): SsizeT =
    UnixJniBridge.libcUnixGetline(lineptr.rawAddress, n.rawAddress, stream.rawAddress)

public actual fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt =
    UnixJniBridge.libcUnixLockf(fd, cmd, len)

public actual fun adjtime(delta: ConstPtr, olddelta: MutPtr): CInt =
    UnixJniBridge.libcUnixAdjtime(delta.rawAddress, olddelta.rawAddress)

public actual fun stpncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(UnixJniBridge.libcUnixStpncpy(dst.rawAddress, src.rawAddress, n.toLong()))

public actual fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt =
    0

public actual fun confstr(name: CInt, buf: MutPtr, len: SizeT): SizeT =
    UnixJniBridge.libcUnixConfstr(name, buf.rawAddress, len.toLong()).toULong()

public actual fun dladdr(addr: ConstPtr, info: MutPtr): CInt =
    UnixJniBridge.libcUnixDladdr(addr.rawAddress, info.rawAddress)

public actual fun flock(fd: CInt, operation: CInt): CInt =
    UnixJniBridge.libcUnixFlock(fd, operation)

public actual fun openWmemstream(ptr: MutPtr, sizeloc: MutPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixOpenWmemstream(ptr.rawAddress, sizeloc.rawAddress))

public actual fun getsid(pid: PidT): PidT =
    UnixJniBridge.libcUnixGetsid(pid)

public actual fun pause(): CInt =
    UnixJniBridge.libcUnixPause()

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    UnixJniBridge.libcUnixMkdirat(dirfd, pathname.rawAddress, mode.toInt())

public actual fun openat(dirfd: CInt, pathname: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt =
    UnixJniBridge.libcUnixOpenat(dirfd, pathname.rawAddress, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fdopendir(fd: CInt): MutPtr =
    MutPtr(UnixJniBridge.libcUnixFdopendir(fd))

public actual fun readdirR(dirp: MutPtr, entry: MutPtr, result: MutPtr): CInt =
    UnixJniBridge.libcUnixReaddirR(dirp.rawAddress, entry.rawAddress, result.rawAddress)

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, bufsiz: SizeT): CInt =
    UnixJniBridge.libcUnixReadlinkat(dirfd, pathname.rawAddress, buf.rawAddress, bufsiz.toLong())

public actual fun readlink(path: ConstPtr, buf: MutPtr, bufsz: SizeT): CInt =
    UnixJniBridge.libcUnixReadlink(path.rawAddress, buf.rawAddress, bufsz.toLong())

public actual fun pselect(nfds: CInt, readfds: MutPtr, writefds: MutPtr, errorfds: MutPtr, timeout: MutPtr, sigmask: ConstPtr): CInt =
    UnixJniBridge.libcUnixPselect(nfds, readfds.rawAddress, writefds.rawAddress, errorfds.rawAddress, timeout.rawAddress, sigmask.rawAddress)

public actual fun sigaction(signum: CInt, act: ConstPtr, oldact: MutPtr): CInt =
    UnixJniBridge.libcUnixSigaction(signum, act.rawAddress, oldact.rawAddress)

public actual fun fmemopen(buf: MutPtr, size: SizeT, mode: ConstPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixFmemopen(buf.rawAddress, size.toLong(), mode.rawAddress))

public actual fun openMemstream(ptr: MutPtr, sizeloc: MutPtr): MutPtr =
    MutPtr(UnixJniBridge.libcUnixOpenMemstream(ptr.rawAddress, sizeloc.rawAddress))

public actual fun atexit(cb: AtexitCbCallback): CInt =
    UnixJniBridge.libcUnixAtexit(0L)

public actual fun cfmakeraw(termios: MutPtr): CInt =
    UnixJniBridge.libcUnixCfmakeraw(termios.rawAddress)

public actual fun cfsetspeed(termios: MutPtr, speed: SpeedT): CInt =
    UnixJniBridge.libcUnixCfsetspeed(termios.rawAddress, speed.toInt())

public actual fun fnmatch(pattern: ConstPtr, name: ConstPtr, flags: CInt): CInt =
    UnixJniBridge.libcUnixFnmatch(pattern.rawAddress, name.rawAddress, flags)
