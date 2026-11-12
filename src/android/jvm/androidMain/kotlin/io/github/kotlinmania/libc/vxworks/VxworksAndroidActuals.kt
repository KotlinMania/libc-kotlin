@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.vxworks.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object VxworksJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcVxworksIsalnum(c: Int): Int

    @JvmStatic
    external fun libcVxworksIsalpha(c: Int): Int

    @JvmStatic
    external fun libcVxworksIscntrl(c: Int): Int

    @JvmStatic
    external fun libcVxworksIsdigit(c: Int): Int

    @JvmStatic
    external fun libcVxworksIsgraph(c: Int): Int

    @JvmStatic
    external fun libcVxworksIslower(c: Int): Int

    @JvmStatic
    external fun libcVxworksIsprint(c: Int): Int

    @JvmStatic
    external fun libcVxworksIspunct(c: Int): Int

    @JvmStatic
    external fun libcVxworksIsspace(c: Int): Int

    @JvmStatic
    external fun libcVxworksIsupper(c: Int): Int

    @JvmStatic
    external fun libcVxworksIsxdigit(c: Int): Int

    @JvmStatic
    external fun libcVxworksIsblank(c: Int): Int

    @JvmStatic
    external fun libcVxworksTolower(c: Int): Int

    @JvmStatic
    external fun libcVxworksToupper(c: Int): Int

    @JvmStatic
    external fun libcVxworksFopen(filename: Long, mode: Long): Long

    @JvmStatic
    external fun libcVxworksFreopen(filename: Long, mode: Long, file: Long): Long

    @JvmStatic
    external fun libcVxworksFflush(file: Long): Int

    @JvmStatic
    external fun libcVxworksFclose(file: Long): Int

    @JvmStatic
    external fun libcVxworksRemove(filename: Long): Int

    @JvmStatic
    external fun libcVxworksRename(oldname: Long, newname: Long): Int

    @JvmStatic
    external fun libcVxworksTmpfile(): Long

    @JvmStatic
    external fun libcVxworksSetvbuf(stream: Long, buffer: Long, mode: Int, size: Long): Int

    @JvmStatic
    external fun libcVxworksSetbuf(stream: Long, buf: Long)

    @JvmStatic
    external fun libcVxworksGetchar(): Int

    @JvmStatic
    external fun libcVxworksPutchar(c: Int): Int

    @JvmStatic
    external fun libcVxworksFgetc(stream: Long): Int

    @JvmStatic
    external fun libcVxworksFgets(buf: Long, n: Int, stream: Long): Long

    @JvmStatic
    external fun libcVxworksFputc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libcVxworksFputs(s: Long, stream: Long): Int

    @JvmStatic
    external fun libcVxworksPuts(s: Long): Int

    @JvmStatic
    external fun libcVxworksUngetc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libcVxworksFread(ptr: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libcVxworksFwrite(ptr: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libcVxworksFseek(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libcVxworksFtell(stream: Long): Long

    @JvmStatic
    external fun libcVxworksRewind(stream: Long)

    @JvmStatic
    external fun libcVxworksFgetpos(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libcVxworksFsetpos(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libcVxworksFeof(stream: Long): Int

    @JvmStatic
    external fun libcVxworksFerror(stream: Long): Int

    @JvmStatic
    external fun libcVxworksPerror(s: Long)

    @JvmStatic
    external fun libcVxworksAtof(s: Long): Double

    @JvmStatic
    external fun libcVxworksAtoi(s: Long): Int

    @JvmStatic
    external fun libcVxworksAtol(s: Long): Long

    @JvmStatic
    external fun libcVxworksAtoll(s: Long): Long

    @JvmStatic
    external fun libcVxworksStrtod(s: Long, endp: Long): Double

    @JvmStatic
    external fun libcVxworksStrtof(s: Long, endp: Long): Float

    @JvmStatic
    external fun libcVxworksStrtol(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcVxworksStrtoll(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcVxworksStrtoul(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcVxworksStrtoull(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcVxworksCalloc(nobj: Long, size: Long): Long

    @JvmStatic
    external fun libcVxworksMalloc(size: Long): Long

    @JvmStatic
    external fun libcVxworksRealloc(p: Long, size: Long): Long

    @JvmStatic
    external fun libcVxworksFree(p: Long)

    @JvmStatic
    external fun libcVxworksAbort()

    @JvmStatic
    external fun libcVxworksExit(status: Int)

    @JvmStatic
    external fun libcVxworksAtexit(cb: Long): Int

    @JvmStatic
    external fun libcVxworksSystem(s: Long): Int

    @JvmStatic
    external fun libcVxworksGetenv(s: Long): Long

    @JvmStatic
    external fun libcVxworksCfgetospeed(termios: Long): Int

    @JvmStatic
    external fun libcVxworksCfmakeraw(termios: Long): Int

    @JvmStatic
    external fun libcVxworksCfsetispeed(termios: Long, speed: Int): Int

    @JvmStatic
    external fun libcVxworksCfsetospeed(termios: Long, speed: Int): Int

    @JvmStatic
    external fun libcVxworksStrcpy(dst: Long, src: Long): Long

    @JvmStatic
    external fun libcVxworksStrncpy(dst: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcVxworksStrcat(s: Long, ct: Long): Long

    @JvmStatic
    external fun libcVxworksStrncat(s: Long, ct: Long, n: Long): Long

    @JvmStatic
    external fun libcVxworksStrcmp(cs: Long, ct: Long): Int

    @JvmStatic
    external fun libcVxworksStrncmp(cs: Long, ct: Long, n: Long): Int

    @JvmStatic
    external fun libcVxworksStrcoll(cs: Long, ct: Long): Int

    @JvmStatic
    external fun libcVxworksStrchr(cs: Long, c: Int): Long

    @JvmStatic
    external fun libcVxworksStrrchr(cs: Long, c: Int): Long

    @JvmStatic
    external fun libcVxworksStrspn(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcVxworksStrcspn(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcVxworksStrdup(cs: Long): Long

    @JvmStatic
    external fun libcVxworksStrpbrk(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcVxworksStrstr(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcVxworksStrcasecmp(s1: Long, s2: Long): Int

    @JvmStatic
    external fun libcVxworksStrncasecmp(s1: Long, s2: Long, n: Long): Int

    @JvmStatic
    external fun libcVxworksStrlen(cs: Long): Long

    @JvmStatic
    external fun libcVxworksStrnlen(cs: Long, n: Long): Long

    @JvmStatic
    external fun libcVxworksStrerror(n: Int): Long

    @JvmStatic
    external fun libcVxworksStrtok(s: Long, t: Long): Long

    @JvmStatic
    external fun libcVxworksStrxfrm(s: Long, ct: Long, n: Long): Long

    @JvmStatic
    external fun libcVxworksWcslen(buf: Long): Long

    @JvmStatic
    external fun libcVxworksWcstombs(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcVxworksMemchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcVxworksWmemchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcVxworksMemcmp(cx: Long, ct: Long, n: Long): Int

    @JvmStatic
    external fun libcVxworksMemcpy(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcVxworksMemccpy(dest: Long, src: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcVxworksMemmove(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcVxworksMemset(dest: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcVxworksAlignedAlloc(alignment: Long, size: Long): Long

    @JvmStatic
    external fun libcVxworksUname(buf: Long): Int

    @JvmStatic
    external fun libcVxworksTimes(buf: Long): Long

    @JvmStatic
    external fun libcVxworksTcflush(fd: Int, action: Int): Int

    @JvmStatic
    external fun libcVxworksPclose(stream: Long): Int

    @JvmStatic
    external fun libcVxworksMkdtemp(template: Long): Long

    @JvmStatic
    external fun libcVxworksLinkat(olddirfd: Int, oldpath: Long, newdirfd: Int, newpath: Long, flags: Int): Int

    @JvmStatic
    external fun libcVxworksUnlinkat(dirfd: Int, pathname: Long, flags: Int): Int

    @JvmStatic
    external fun libcVxworksGetprotobyname(name: Long): Long

    @JvmStatic
    external fun libcVxworksGetprotobynumber(proto: Int): Long

    @JvmStatic
    external fun libcVxworksGetservbyname(name: Long, proto: Long): Long

    @JvmStatic
    external fun libcVxworksFchownat(dirfd: Int, pathname: Long, owner: Short, group: Short, flags: Int): Int

    @JvmStatic
    external fun libcVxworksFprintf(stream: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcVxworksPrintf(format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcVxworksSnprintf(s: Long, n: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcVxworksSprintf(s: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcVxworksFscanf(stream: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcVxworksScanf(format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcVxworksSscanf(s: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcVxworksGetcharUnlocked(): Int

    @JvmStatic
    external fun libcVxworksPutcharUnlocked(c: Int): Int

    @JvmStatic
    external fun libcVxworksStat(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcVxworksFdopen(fd: Int, mode: Long): Long

    @JvmStatic
    external fun libcVxworksFileno(stream: Long): Int

    @JvmStatic
    external fun libcVxworksCreat(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcVxworksRewinddir(dirp: Long)

    @JvmStatic
    external fun libcVxworksFchown(fd: Int, owner: Short, group: Short): Int

    @JvmStatic
    external fun libcVxworksAccess(path: Long, amode: Int): Int

    @JvmStatic
    external fun libcVxworksAlarm(seconds: Int): Int

    @JvmStatic
    external fun libcVxworksFchdir(dirfd: Int): Int

    @JvmStatic
    external fun libcVxworksChown(path: Long, uid: Short, gid: Short): Int

    @JvmStatic
    external fun libcVxworksFpathconf(filedes: Int, name: Int): Long

    @JvmStatic
    external fun libcVxworksGetegid(): Short

    @JvmStatic
    external fun libcVxworksGeteuid(): Short

    @JvmStatic
    external fun libcVxworksGetgroups(ngroupsMax: Int, groups: Long): Int

    @JvmStatic
    external fun libcVxworksGetlogin(): Long

    @JvmStatic
    external fun libcVxworksGetopt(argc: Int, argv: Long, optstr: Long): Int

    @JvmStatic
    external fun libcVxworksPathconf(path: Long, name: Int): Long

    @JvmStatic
    external fun libcVxworksPause(): Int

    @JvmStatic
    external fun libcVxworksSeteuid(uid: Short): Int

    @JvmStatic
    external fun libcVxworksSetegid(gid: Short): Int

    @JvmStatic
    external fun libcVxworksSleep(secs: Int): Int

    @JvmStatic
    external fun libcVxworksTtyname(fd: Int): Long

    @JvmStatic
    external fun libcVxworksWait(status: Long): Int

    @JvmStatic
    external fun libcVxworksUmask(mask: Int): Int

    @JvmStatic
    external fun libcVxworksMlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun libcVxworksMlockall(flags: Int): Int

    @JvmStatic
    external fun libcVxworksMunlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun libcVxworksMunlockall(): Int

    @JvmStatic
    external fun libcVxworksMmap(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long

    @JvmStatic
    external fun libcVxworksMunmap(addr: Long, len: Long): Int

    @JvmStatic
    external fun libcVxworksMprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcVxworksMsync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libcVxworksTruncate(path: Long, length: Long): Int

    @JvmStatic
    external fun libcVxworksShmOpen(name: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcVxworksShmUnlink(name: Long): Int

    @JvmStatic
    external fun libcVxworksGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadExit(value: Long)

    @JvmStatic
    external fun libcVxworksPthreadAttrSetdetachstate(attr: Long, state: Int): Int

    @JvmStatic
    external fun libcVxworksPthreadEqual(t1: Long, t2: Long): Int

    @JvmStatic
    external fun libcVxworksStrerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcVxworksSigaddset(set: Long, signum: Int): Int

    @JvmStatic
    external fun libcVxworksSigaction(signum: Int, act: Long, oldact: Long): Int

    @JvmStatic
    external fun libcVxworksUtimes(filename: Long, times: Long): Int

    @JvmStatic
    external fun libcVxworksFutimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcVxworksUtimensat(dirfd: Int, path: Long, times: Long, flag: Int): Int

    @JvmStatic
    external fun libcVxworksDlopen(filename: Long, flag: Int): Long

    @JvmStatic
    external fun libcVxworksDlerror(): Long

    @JvmStatic
    external fun libcVxworksDlsym(handle: Long, symbol: Long): Long

    @JvmStatic
    external fun libcVxworksDlclose(handle: Long): Int

    @JvmStatic
    external fun libcVxworksDladdr(addr: Long, info: Long): Int

    @JvmStatic
    external fun libcVxworksGmtimeR(timeP: Long, result: Long): Long

    @JvmStatic
    external fun libcVxworksLocaltimeR(timeP: Long, result: Long): Long

    @JvmStatic
    external fun libcVxworksMktime(tm: Long): Long

    @JvmStatic
    external fun libcVxworksTime(time: Long): Long

    @JvmStatic
    external fun libcVxworksGmtime(timeP: Long): Long

    @JvmStatic
    external fun libcVxworksLocaltime(timeP: Long): Long

    @JvmStatic
    external fun libcVxworksTimegm(tm: Long): Long

    @JvmStatic
    external fun libcVxworksDifftime(time1: Long, time0: Long): Double

    @JvmStatic
    external fun libcVxworksGethostname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcVxworksUsleep(secs: Long): Int

    @JvmStatic
    external fun libcVxworksPutenv(string: Long): Int

    @JvmStatic
    external fun libcVxworksSetlocale(category: Int, locale: Long): Long

    @JvmStatic
    external fun libcVxworksLocaleconv(): Long

    @JvmStatic
    external fun libcVxworksSigprocmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libcVxworksSigpending(set: Long): Int

    @JvmStatic
    external fun libcVxworksMkfifo(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcVxworksFseeko(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libcVxworksFtello(stream: Long): Long

    @JvmStatic
    external fun libcVxworksMkstemp(template: Long): Int

    @JvmStatic
    external fun libcVxworksTmpnam(ptr: Long): Long

    @JvmStatic
    external fun libcVxworksOpenlog(ident: Long, logopt: Int, facility: Int)

    @JvmStatic
    external fun libcVxworksCloselog()

    @JvmStatic
    external fun libcVxworksSetlogmask(maskpri: Int): Int

    @JvmStatic
    external fun libcVxworksSyslog(priority: Int, message: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun libcVxworksGetline(lineptr: Long, n: Long, stream: Long): Long

    @JvmStatic
    external fun libcVxworksTcsetattr(fd: Int, optionalActions: Int, termios: Long): Int

    @JvmStatic
    external fun libcVxworksTcgetattr(fd: Int, termios: Long): Int

    @JvmStatic
    external fun libcVxworksTcsendbreak(fd: Int, duration: Int): Int

    @JvmStatic
    external fun libcVxworksConfstr(name: Int, buf: Long, len: Long): Long

    @JvmStatic
    external fun libcVxworksFnmatch(pattern: Long, name: Long, flags: Int): Int

    @JvmStatic
    external fun libcVxworksSymlinkat(target: Long, newdirfd: Int, linkpath: Long): Int

    @JvmStatic
    external fun libcVxworksFchmodat(dirfd: Int, pathname: Long, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libcVxworksUtime(file: Long, buf: Long): Int

    @JvmStatic
    external fun libcVxworksMemalign(blockSize: Long, sizeArg: Long): Long

    @JvmStatic
    external fun libcVxworksGetcwd(buf: Long, size: Long): Long

    @JvmStatic
    external fun libcVxworksChdir(attr: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadMutexattrInit(attr: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadMutexattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadMutexattrSettype(pAttr: Long, pType: Int): Int

    @JvmStatic
    external fun libcVxworksPthreadMutexInit(mutex: Long, attr: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadMutexDestroy(mutex: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadMutexLock(mutex: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadMutexTrylock(mutex: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadMutexTimedlock(attr: Long, spec: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadMutexUnlock(mutex: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadAttrSetname(pAttr: Long, name: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadAttrSetstacksize(attr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadAttrGetstacksize(attr: Long, size: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadAttrInit(attr: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadCreate(pThread: Long, pAttr: Long, startRoutine: Long, value: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadAttrSetinheritsched(attr: Long, inheritsched: Int): Int

    @JvmStatic
    external fun libcVxworksPthreadAttrSetschedpolicy(attr: Long, policy: Int): Int

    @JvmStatic
    external fun libcVxworksPthreadAttrDestroy(thread: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadDetach(thread: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libcVxworksFstat(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libcVxworksLstat(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcVxworksFtruncate(fd: Int, length: Long): Int

    @JvmStatic
    external fun libcVxworksReaddirR(pDir: Long, entry: Long, result: Long): Int

    @JvmStatic
    external fun libcVxworksReaddir(pDir: Long): Long

    @JvmStatic
    external fun libcVxworksOpen(path: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcVxworksPoll(fds: Long, nfds: Int, timeout: Int): Int

    @JvmStatic
    external fun libcVxworksPthreadCondattrInit(attr: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadCondattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadCondattrGetclock(pAttr: Long, pClockId: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadCondattrSetclock(pAttr: Long, clockId: Int): Int

    @JvmStatic
    external fun libcVxworksPthreadCondInit(cond: Long, attr: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadCondDestroy(cond: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadCondSignal(cond: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadCondBroadcast(cond: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadCondWait(cond: Long, mutex: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadRwlockattrInit(attr: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadRwlockattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadRwlockattrSetmaxreaders(attr: Long, attr2: Int): Int

    @JvmStatic
    external fun libcVxworksPthreadRwlockInit(attr: Long, host: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadRwlockDestroy(attr: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadRwlockRdlock(attr: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadRwlockTryrdlock(attr: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadRwlockTimedrdlock(attr: Long, host: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadRwlockWrlock(attr: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadRwlockTrywrlock(attr: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadRwlockTimedwrlock(attr: Long, host: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadRwlockUnlock(attr: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadKeyCreate(key: Long, dtor: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadKeyDelete(key: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadSetspecific(key: Long, value: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadGetspecific(key: Long): Long

    @JvmStatic
    external fun libcVxworksPthreadCondTimedwait(cond: Long, mutex: Long, abstime: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadAttrGetname(attr: Long, name: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadJoin(thread: Long, status: Long): Int

    @JvmStatic
    external fun libcVxworksPthreadSelf(): Long

    @JvmStatic
    external fun libcVxworksClockGettime(clockId: Int, tp: Long): Int

    @JvmStatic
    external fun libcVxworksClockSettime(clockId: Int, tp: Long): Int

    @JvmStatic
    external fun libcVxworksClockGetres(clockId: Int, res: Long): Int

    @JvmStatic
    external fun libcVxworksClockNanosleep(clockId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libcVxworksNanosleep(rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libcVxworksAccept(s: Int, addr: Long, addrlen: Long): Int

    @JvmStatic
    external fun libcVxworksBind(fd: Int, addr: Long, len: Int): Int

    @JvmStatic
    external fun libcVxworksConnect(s: Int, name: Long, namelen: Int): Int

    @JvmStatic
    external fun libcVxworksGetpeername(s: Int, name: Long, namelen: Long): Int

    @JvmStatic
    external fun libcVxworksGetsockname(socket: Int, address: Long, addressLen: Long): Int

    @JvmStatic
    external fun libcVxworksGetsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Long): Int

    @JvmStatic
    external fun libcVxworksListen(socket: Int, backlog: Int): Int

    @JvmStatic
    external fun libcVxworksRecv(s: Int, buf: Long, bufLen: Long, flags: Int): Long

    @JvmStatic
    external fun libcVxworksRecvfrom(s: Int, buf: Long, bufLen: Long, flags: Int, from: Long, pFromLen: Long): Long

    @JvmStatic
    external fun libcVxworksRecvmsg(socket: Int, mp: Long, flags: Int): Long

    @JvmStatic
    external fun libcVxworksSend(socket: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcVxworksSendmsg(socket: Int, mp: Long, flags: Int): Long

    @JvmStatic
    external fun libcVxworksSendto(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Int): Long

    @JvmStatic
    external fun libcVxworksSetsockopt(socket: Int, level: Int, name: Int, value: Long, optionLen: Int): Int

    @JvmStatic
    external fun libcVxworksShutdown(s: Int, how: Int): Int

    @JvmStatic
    external fun libcVxworksSocket(domain: Int, type: Int, protocol: Int): Int

    @JvmStatic
    external fun libcVxworksIoctl(fd: Int, request: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcVxworksFcntl(fd: Int, cmd: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcVxworksGaiStrerror(errcode: Int): Long

    @JvmStatic
    external fun libcVxworksClose(fd: Int): Int

    @JvmStatic
    external fun libcVxworksRead(fd: Int, buf: Long, count: Long): Long

    @JvmStatic
    external fun libcVxworksWrite(fd: Int, buf: Long, count: Long): Long

    @JvmStatic
    external fun libcVxworksIsatty(fd: Int): Int

    @JvmStatic
    external fun libcVxworksDup(src: Int): Int

    @JvmStatic
    external fun libcVxworksDup2(src: Int, dst: Int): Int

    @JvmStatic
    external fun libcVxworksPipe(fds: Long): Int

    @JvmStatic
    external fun libcVxworksUnlink(pathname: Long): Int

    @JvmStatic
    external fun libcVxworksLseek(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libcVxworksGetaddrinfo(node: Long, service: Long, hints: Long, res: Long): Int

    @JvmStatic
    external fun libcVxworksFreeaddrinfo(res: Long)

    @JvmStatic
    external fun libcVxworksSignal(signum: Int, handler: Long): Long

    @JvmStatic
    external fun libcVxworksGetpid(): Int

    @JvmStatic
    external fun libcVxworksGetppid(): Int

    @JvmStatic
    external fun libcVxworksSetpgid(pid: Int, pgid: Int): Int

    @JvmStatic
    external fun libcVxworksWaitpid(pid: Int, status: Long, options: Int): Int

    @JvmStatic
    external fun libcVxworksSysconf(attr: Int): Long

    @JvmStatic
    external fun libcVxworksSetenv(envVarName: Long, envVarValue: Long, overwrite: Int): Int

    @JvmStatic
    external fun libcVxworksUnsetenv(envVarName: Long): Int

    @JvmStatic
    external fun libcVxworksRealpath(fileName: Long, resolvedName: Long): Long

    @JvmStatic
    external fun libcVxworksLink(src: Long, dst: Long): Int

    @JvmStatic
    external fun libcVxworksReadlink(path: Long, buf: Long, bufsize: Long): Long

    @JvmStatic
    external fun libcVxworksSymlink(path1: Long, path2: Long): Int

    @JvmStatic
    external fun libcVxworksOpendir(name: Long): Long

    @JvmStatic
    external fun libcVxworksRmdir(path: Long): Int

    @JvmStatic
    external fun libcVxworksMkdir(dirName: Long, mode: Int): Int

    @JvmStatic
    external fun libcVxworksChmod(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcVxworksFchmod(attr1: Int, attr2: Int): Int

    @JvmStatic
    external fun libcVxworksFsync(fd: Int): Int

    @JvmStatic
    external fun libcVxworksClosedir(ptr: Long): Int

    @JvmStatic
    external fun libcVxworksSchedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libcVxworksSchedGetPriorityMin(policy: Int): Int

    @JvmStatic
    external fun libcVxworksSchedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcVxworksSchedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcVxworksSchedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcVxworksSchedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libcVxworksSchedRrGetInterval(pid: Int, tp: Long): Int

    @JvmStatic
    external fun libcVxworksSchedYield(): Int

    @JvmStatic
    external fun libcVxworksErrnoSet(err: Int): Int

    @JvmStatic
    external fun libcVxworksErrnoGet(): Int

    @JvmStatic
    external fun libcVxworksSetgid(gid: Short): Int

    @JvmStatic
    external fun libcVxworksGetgid(): Short

    @JvmStatic
    external fun libcVxworksSetuid(uid: Short): Int

    @JvmStatic
    external fun libcVxworksGetuid(): Short

    @JvmStatic
    external fun libcVxworksSigemptyset(set: Long): Int

    @JvmStatic
    external fun libcVxworksSigfillset(set: Long): Int

    @JvmStatic
    external fun libcVxworksSigdelset(set: Long, signum: Int): Int

    @JvmStatic
    external fun libcVxworksSigismember(set: Long, signum: Int): Int

    @JvmStatic
    external fun libcVxworksPthreadSigmask(how: Int, set: Long, oset: Long): Int

    @JvmStatic
    external fun libcVxworksKill(pid: Int, signo: Int): Int

    @JvmStatic
    external fun libcVxworksTaskKill(taskId: Int, signo: Int): Int

    @JvmStatic
    external fun libcVxworksRaise(signo: Int): Int

    @JvmStatic
    external fun libcVxworksTaskIdSelf(): Int

    @JvmStatic
    external fun libcVxworksTaskDelay(ticks: Int): Int

    @JvmStatic
    external fun libcVxworksTaskNameSet(taskId: Int, taskName: Long): Int

    @JvmStatic
    external fun libcVxworksTaskNameGet(taskId: Int, bufName: Long, bufsize: Long): Int

    @JvmStatic
    external fun libcVxworksRtpInfoGet(rtpId: Int, rtpStruct: Long): Int

    @JvmStatic
    external fun libcVxworksRtpSpawn(pubrtpFileName: Long, argv: Long, envp: Long, priority: Int, uStackSize: Long, options: Int, taskOptions: Int): Int

    @JvmStatic
    external fun libcVxworksPathIsAbsolute(filepath: Long, pNameTail: Long): Int

    @JvmStatic
    external fun libcVxworksWritev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcVxworksReadv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcVxworksRandBytes(buf: Long, length: Int): Int

    @JvmStatic
    external fun libcVxworksRandABytes(buf: Long, length: Int): Int

    @JvmStatic
    external fun libcVxworksRandUBytes(buf: Long, length: Int): Int

    @JvmStatic
    external fun libcVxworksRandSecure(): Int

    @JvmStatic
    external fun libcVxworksMqOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcVxworksMqClose(mqd: Long): Int

    @JvmStatic
    external fun libcVxworksMqUnlink(name: Long): Int

    @JvmStatic
    external fun libcVxworksMqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long

    @JvmStatic
    external fun libcVxworksMqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long

    @JvmStatic
    external fun libcVxworksMqSend(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libcVxworksMqTimedsend(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Int, absTimeout: Long): Int

    @JvmStatic
    external fun libcVxworksMqGetattr(mqd: Long, attr: Long): Int

    @JvmStatic
    external fun libcVxworksMqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int

    @JvmStatic
    external fun libcVxworksVxCpuEnabledGet(): Int

    @JvmStatic
    external fun libcVxworksVxCpuConfiguredGet(): Int
}

public actual fun isalnum(c: CInt): CInt =
    VxworksJniBridge.libcVxworksIsalnum(c)

public actual fun isalpha(c: CInt): CInt =
    VxworksJniBridge.libcVxworksIsalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    VxworksJniBridge.libcVxworksIscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    VxworksJniBridge.libcVxworksIsdigit(c)

public actual fun isgraph(c: CInt): CInt =
    VxworksJniBridge.libcVxworksIsgraph(c)

public actual fun islower(c: CInt): CInt =
    VxworksJniBridge.libcVxworksIslower(c)

public actual fun isprint(c: CInt): CInt =
    VxworksJniBridge.libcVxworksIsprint(c)

public actual fun ispunct(c: CInt): CInt =
    VxworksJniBridge.libcVxworksIspunct(c)

public actual fun isspace(c: CInt): CInt =
    VxworksJniBridge.libcVxworksIsspace(c)

public actual fun isupper(c: CInt): CInt =
    VxworksJniBridge.libcVxworksIsupper(c)

public actual fun isxdigit(c: CInt): CInt =
    VxworksJniBridge.libcVxworksIsxdigit(c)

public actual fun isblank(c: CInt): CInt =
    VxworksJniBridge.libcVxworksIsblank(c)

public actual fun tolower(c: CInt): CInt =
    VxworksJniBridge.libcVxworksTolower(c)

public actual fun toupper(c: CInt): CInt =
    VxworksJniBridge.libcVxworksToupper(c)

public actual fun fopen(filename: ConstPtr, mode: ConstPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksFopen(filename.rawAddress, mode.rawAddress))

public actual fun freopen(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksFreopen(filename.rawAddress, mode.rawAddress, file.rawAddress))

public actual fun fflush(file: MutPtr): CInt =
    VxworksJniBridge.libcVxworksFflush(file.rawAddress)

public actual fun fclose(file: MutPtr): CInt =
    VxworksJniBridge.libcVxworksFclose(file.rawAddress)

public actual fun remove(filename: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksRemove(filename.rawAddress)

public actual fun rename(oldname: ConstPtr, newname: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksRename(oldname.rawAddress, newname.rawAddress)

public actual fun tmpfile(): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksTmpfile())

public actual fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt =
    VxworksJniBridge.libcVxworksSetvbuf(stream.rawAddress, buffer.rawAddress, mode, size.toLong())

public actual fun setbuf(stream: MutPtr, buf: MutPtr) {
    VxworksJniBridge.libcVxworksSetbuf(stream.rawAddress, buf.rawAddress)
}

public actual fun getchar(): CInt =
    VxworksJniBridge.libcVxworksGetchar()

public actual fun putchar(c: CInt): CInt =
    VxworksJniBridge.libcVxworksPutchar(c)

public actual fun fgetc(stream: MutPtr): CInt =
    VxworksJniBridge.libcVxworksFgetc(stream.rawAddress)

public actual fun fgets(buf: MutPtr, n: CInt, stream: MutPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksFgets(buf.rawAddress, n, stream.rawAddress))

public actual fun fputc(c: CInt, stream: MutPtr): CInt =
    VxworksJniBridge.libcVxworksFputc(c, stream.rawAddress)

public actual fun fputs(s: ConstPtr, stream: MutPtr): CInt =
    VxworksJniBridge.libcVxworksFputs(s.rawAddress, stream.rawAddress)

public actual fun puts(s: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksPuts(s.rawAddress)

public actual fun ungetc(c: CInt, stream: MutPtr): CInt =
    VxworksJniBridge.libcVxworksUngetc(c, stream.rawAddress)

public actual fun fread(ptr: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    VxworksJniBridge.libcVxworksFread(ptr.rawAddress, size.toLong(), nobj.toLong(), stream.rawAddress).toULong()

public actual fun fwrite(ptr: ConstPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    VxworksJniBridge.libcVxworksFwrite(ptr.rawAddress, size.toLong(), nobj.toLong(), stream.rawAddress).toULong()

public actual fun fseek(stream: MutPtr, offset: CLong, whence: CInt): CInt =
    VxworksJniBridge.libcVxworksFseek(stream.rawAddress, offset, whence)

public actual fun ftell(stream: MutPtr): CLong =
    VxworksJniBridge.libcVxworksFtell(stream.rawAddress)

public actual fun rewind(stream: MutPtr) {
    VxworksJniBridge.libcVxworksRewind(stream.rawAddress)
}

public actual fun fgetpos(stream: MutPtr, ptr: MutPtr): CInt =
    VxworksJniBridge.libcVxworksFgetpos(stream.rawAddress, ptr.rawAddress)

public actual fun fsetpos(stream: MutPtr, ptr: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksFsetpos(stream.rawAddress, ptr.rawAddress)

public actual fun feof(stream: MutPtr): CInt =
    VxworksJniBridge.libcVxworksFeof(stream.rawAddress)

public actual fun ferror(stream: MutPtr): CInt =
    VxworksJniBridge.libcVxworksFerror(stream.rawAddress)

public actual fun perror(s: ConstPtr) {
    VxworksJniBridge.libcVxworksPerror(s.rawAddress)
}

public actual fun atof(s: ConstPtr): CDouble =
    VxworksJniBridge.libcVxworksAtof(s.rawAddress)

public actual fun atoi(s: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksAtoi(s.rawAddress)

public actual fun atol(s: ConstPtr): CLong =
    VxworksJniBridge.libcVxworksAtol(s.rawAddress)

public actual fun atoll(s: ConstPtr): CLonglong =
    VxworksJniBridge.libcVxworksAtoll(s.rawAddress)

public actual fun strtod(s: ConstPtr, endp: MutPtr): CDouble =
    VxworksJniBridge.libcVxworksStrtod(s.rawAddress, endp.rawAddress)

public actual fun strtof(s: ConstPtr, endp: MutPtr): CFloat =
    VxworksJniBridge.libcVxworksStrtof(s.rawAddress, endp.rawAddress)

public actual fun strtol(s: ConstPtr, endp: MutPtr, base: CInt): CLong =
    VxworksJniBridge.libcVxworksStrtol(s.rawAddress, endp.rawAddress, base)

public actual fun strtoll(s: ConstPtr, endp: MutPtr, base: CInt): CLonglong =
    VxworksJniBridge.libcVxworksStrtoll(s.rawAddress, endp.rawAddress, base)

public actual fun strtoul(s: ConstPtr, endp: MutPtr, base: CInt): CUlong =
    VxworksJniBridge.libcVxworksStrtoul(s.rawAddress, endp.rawAddress, base).toULong()

public actual fun strtoull(s: ConstPtr, endp: MutPtr, base: CInt): CUlonglong =
    VxworksJniBridge.libcVxworksStrtoull(s.rawAddress, endp.rawAddress, base).toULong()

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksCalloc(nobj.toLong(), size.toLong()))

public actual fun malloc(size: SizeT): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksMalloc(size.toLong()))

public actual fun realloc(p: MutPtr, size: SizeT): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksRealloc(p.rawAddress, size.toLong()))

public actual fun free(p: MutPtr) {
    VxworksJniBridge.libcVxworksFree(p.rawAddress)
}

public actual fun abort(): Nothing {
    VxworksJniBridge.libcVxworksAbort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    VxworksJniBridge.libcVxworksExit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: AtexitCbCallback): CInt =
    VxworksJniBridge.libcVxworksAtexit(0L)

public actual fun system(s: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksSystem(s.rawAddress)

public actual fun getenv(s: ConstPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksGetenv(s.rawAddress))

public actual fun cfgetospeed(termios: ConstPtr): SpeedT =
    VxworksJniBridge.libcVxworksCfgetospeed(termios.rawAddress).toUInt()

public actual fun cfmakeraw(termios: MutPtr): CInt =
    VxworksJniBridge.libcVxworksCfmakeraw(termios.rawAddress)

public actual fun cfsetispeed(termios: MutPtr, speed: SpeedT): CInt =
    VxworksJniBridge.libcVxworksCfsetispeed(termios.rawAddress, speed.toInt())

public actual fun cfsetospeed(termios: MutPtr, speed: SpeedT): CInt =
    VxworksJniBridge.libcVxworksCfsetospeed(termios.rawAddress, speed.toInt())

public actual fun strcpy(dst: MutPtr, src: ConstPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksStrcpy(dst.rawAddress, src.rawAddress))

public actual fun strncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksStrncpy(dst.rawAddress, src.rawAddress, n.toLong()))

public actual fun strcat(s: MutPtr, ct: ConstPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksStrcat(s.rawAddress, ct.rawAddress))

public actual fun strncat(s: MutPtr, ct: ConstPtr, n: SizeT): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksStrncat(s.rawAddress, ct.rawAddress, n.toLong()))

public actual fun strcmp(cs: ConstPtr, ct: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksStrcmp(cs.rawAddress, ct.rawAddress)

public actual fun strncmp(cs: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    VxworksJniBridge.libcVxworksStrncmp(cs.rawAddress, ct.rawAddress, n.toLong())

public actual fun strcoll(cs: ConstPtr, ct: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksStrcoll(cs.rawAddress, ct.rawAddress)

public actual fun strchr(cs: ConstPtr, c: CInt): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksStrchr(cs.rawAddress, c))

public actual fun strrchr(cs: ConstPtr, c: CInt): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksStrrchr(cs.rawAddress, c))

public actual fun strspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    VxworksJniBridge.libcVxworksStrspn(cs.rawAddress, ct.rawAddress).toULong()

public actual fun strcspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    VxworksJniBridge.libcVxworksStrcspn(cs.rawAddress, ct.rawAddress).toULong()

public actual fun strdup(cs: ConstPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksStrdup(cs.rawAddress))

public actual fun strpbrk(cs: ConstPtr, ct: ConstPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksStrpbrk(cs.rawAddress, ct.rawAddress))

public actual fun strstr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksStrstr(cs.rawAddress, ct.rawAddress))

public actual fun strcasecmp(s1: ConstPtr, s2: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksStrcasecmp(s1.rawAddress, s2.rawAddress)

public actual fun strncasecmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    VxworksJniBridge.libcVxworksStrncasecmp(s1.rawAddress, s2.rawAddress, n.toLong())

public actual fun strlen(cs: ConstPtr): SizeT =
    VxworksJniBridge.libcVxworksStrlen(cs.rawAddress).toULong()

public actual fun strnlen(cs: ConstPtr, n: SizeT): SizeT =
    VxworksJniBridge.libcVxworksStrnlen(cs.rawAddress, n.toLong()).toULong()

public actual fun strerror(n: CInt): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksStrerror(n))

public actual fun strtok(s: MutPtr, t: ConstPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksStrtok(s.rawAddress, t.rawAddress))

public actual fun strxfrm(s: MutPtr, ct: ConstPtr, n: SizeT): SizeT =
    VxworksJniBridge.libcVxworksStrxfrm(s.rawAddress, ct.rawAddress, n.toLong()).toULong()

public actual fun wcslen(buf: ConstPtr): SizeT =
    VxworksJniBridge.libcVxworksWcslen(buf.rawAddress).toULong()

public actual fun wcstombs(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT =
    VxworksJniBridge.libcVxworksWcstombs(dest.rawAddress, src.rawAddress, n.toLong()).toULong()

public actual fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksMemchr(cx.rawAddress, c, n.toLong()))

public actual fun wmemchr(cx: ConstPtr, c: WcharT, n: SizeT): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksWmemchr(cx.rawAddress, c.toInt(), n.toLong()))

public actual fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    VxworksJniBridge.libcVxworksMemcmp(cx.rawAddress, ct.rawAddress, n.toLong())

public actual fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksMemcpy(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun memccpy(dest: MutPtr, src: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksMemccpy(dest.rawAddress, src.rawAddress, c, n.toLong()))

public actual fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksMemmove(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksMemset(dest.rawAddress, c, n.toLong()))

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksAlignedAlloc(alignment.toLong(), size.toLong()))

public actual fun uname(buf: MutPtr): CInt =
    VxworksJniBridge.libcVxworksUname(buf.rawAddress)

public actual fun times(buf: MutPtr): ClockT =
    VxworksJniBridge.libcVxworksTimes(buf.rawAddress)

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    VxworksJniBridge.libcVxworksTcflush(fd, action)

public actual fun pclose(stream: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPclose(stream.rawAddress)

public actual fun mkdtemp(template: MutPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksMkdtemp(template.rawAddress))

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt =
    VxworksJniBridge.libcVxworksLinkat(olddirfd, oldpath.rawAddress, newdirfd, newpath.rawAddress, flags)

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr, flags: CInt): CInt =
    VxworksJniBridge.libcVxworksUnlinkat(dirfd, pathname.rawAddress, flags)

public actual fun getprotobyname(name: ConstPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksGetprotobyname(name.rawAddress))

public actual fun getprotobynumber(proto: CInt): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksGetprotobynumber(proto))

public actual fun getservbyname(name: ConstPtr, proto: ConstPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksGetservbyname(name.rawAddress, proto.rawAddress))

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr, owner: UidT, group: GidT, flags: CInt): CInt =
    VxworksJniBridge.libcVxworksFchownat(dirfd, pathname.rawAddress, owner.toShort(), group.toShort(), flags)

public actual fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    VxworksJniBridge.libcVxworksFprintf(stream.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    VxworksJniBridge.libcVxworksPrintf(format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: MutPtr, n: SizeT, format: ConstPtr, vararg variadicArgs: Long): CInt =
    VxworksJniBridge.libcVxworksSnprintf(s.rawAddress, n.toLong(), format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    VxworksJniBridge.libcVxworksSprintf(s.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    VxworksJniBridge.libcVxworksFscanf(stream.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun scanf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    VxworksJniBridge.libcVxworksScanf(format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: ConstPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    VxworksJniBridge.libcVxworksSscanf(s.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getcharUnlocked(): CInt =
    VxworksJniBridge.libcVxworksGetcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    VxworksJniBridge.libcVxworksPutcharUnlocked(c)

public actual fun stat(path: ConstPtr, buf: MutPtr): CInt =
    VxworksJniBridge.libcVxworksStat(path.rawAddress, buf.rawAddress)

public actual fun fdopen(fd: CInt, mode: ConstPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksFdopen(fd, mode.rawAddress))

public actual fun fileno(stream: MutPtr): CInt =
    VxworksJniBridge.libcVxworksFileno(stream.rawAddress)

public actual fun creat(path: ConstPtr, mode: ModeT): CInt =
    VxworksJniBridge.libcVxworksCreat(path.rawAddress, mode)

public actual fun rewinddir(dirp: MutPtr) {
    VxworksJniBridge.libcVxworksRewinddir(dirp.rawAddress)
}

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    VxworksJniBridge.libcVxworksFchown(fd, owner.toShort(), group.toShort())

public actual fun access(path: ConstPtr, amode: CInt): CInt =
    VxworksJniBridge.libcVxworksAccess(path.rawAddress, amode)

public actual fun alarm(seconds: CUint): CUint =
    VxworksJniBridge.libcVxworksAlarm(seconds.toInt()).toUInt()

public actual fun fchdir(dirfd: CInt): CInt =
    VxworksJniBridge.libcVxworksFchdir(dirfd)

public actual fun chown(path: ConstPtr, uid: UidT, gid: GidT): CInt =
    VxworksJniBridge.libcVxworksChown(path.rawAddress, uid.toShort(), gid.toShort())

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    VxworksJniBridge.libcVxworksFpathconf(filedes, name)

public actual fun getegid(): GidT =
    VxworksJniBridge.libcVxworksGetegid().toUShort()

public actual fun geteuid(): UidT =
    VxworksJniBridge.libcVxworksGeteuid().toUShort()

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr): CInt =
    VxworksJniBridge.libcVxworksGetgroups(ngroupsMax, groups.rawAddress)

public actual fun getlogin(): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksGetlogin())

public actual fun getopt(argc: CInt, argv: ConstPtr, optstr: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksGetopt(argc, argv.rawAddress, optstr.rawAddress)

public actual fun pathconf(path: ConstPtr, name: CInt): CLong =
    VxworksJniBridge.libcVxworksPathconf(path.rawAddress, name)

public actual fun pause(): CInt =
    VxworksJniBridge.libcVxworksPause()

public actual fun seteuid(uid: UidT): CInt =
    VxworksJniBridge.libcVxworksSeteuid(uid.toShort())

public actual fun setegid(gid: GidT): CInt =
    VxworksJniBridge.libcVxworksSetegid(gid.toShort())

public actual fun sleep(secs: CUint): CUint =
    VxworksJniBridge.libcVxworksSleep(secs.toInt()).toUInt()

public actual fun ttyname(fd: CInt): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksTtyname(fd))

public actual fun wait(status: MutPtr): PidT =
    VxworksJniBridge.libcVxworksWait(status.rawAddress)

public actual fun umask(mask: ModeT): ModeT =
    VxworksJniBridge.libcVxworksUmask(mask)

public actual fun mlock(addr: ConstPtr, len: SizeT): CInt =
    VxworksJniBridge.libcVxworksMlock(addr.rawAddress, len.toLong())

public actual fun mlockall(flags: CInt): CInt =
    VxworksJniBridge.libcVxworksMlockall(flags)

public actual fun munlock(addr: ConstPtr, len: SizeT): CInt =
    VxworksJniBridge.libcVxworksMunlock(addr.rawAddress, len.toLong())

public actual fun munlockall(): CInt =
    VxworksJniBridge.libcVxworksMunlockall()

public actual fun mmap(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksMmap(addr.rawAddress, len.toLong(), prot, flags, fd, offset))

public actual fun munmap(addr: MutPtr, len: SizeT): CInt =
    VxworksJniBridge.libcVxworksMunmap(addr.rawAddress, len.toLong())

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    VxworksJniBridge.libcVxworksMprotect(addr.rawAddress, len.toLong(), prot)

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    VxworksJniBridge.libcVxworksMsync(addr.rawAddress, len.toLong(), flags)

public actual fun truncate(path: ConstPtr, length: OffT): CInt =
    VxworksJniBridge.libcVxworksTruncate(path.rawAddress, length)

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    VxworksJniBridge.libcVxworksShmOpen(name.rawAddress, oflag, mode)

public actual fun shmUnlink(name: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksShmUnlink(name.rawAddress)

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    VxworksJniBridge.libcVxworksGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun pthreadExit(value: MutPtr): Nothing {
    VxworksJniBridge.libcVxworksPthreadExit(value.rawAddress)
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrSetdetachstate(attr: MutPtr, state: CInt): CInt =
    VxworksJniBridge.libcVxworksPthreadAttrSetdetachstate(attr.rawAddress, state)

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    VxworksJniBridge.libcVxworksPthreadEqual(t1.toLong(), t2.toLong())

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    VxworksJniBridge.libcVxworksStrerrorR(errnum, buf.rawAddress, buflen.toLong())

public actual fun sigaddset(set: MutPtr, signum: CInt): CInt =
    VxworksJniBridge.libcVxworksSigaddset(set.rawAddress, signum)

public actual fun sigaction(signum: CInt, act: ConstPtr, oldact: MutPtr): CInt =
    VxworksJniBridge.libcVxworksSigaction(signum, act.rawAddress, oldact.rawAddress)

public actual fun utimes(filename: ConstPtr, times: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksUtimes(filename.rawAddress, times.rawAddress)

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksFutimens(fd, times.rawAddress)

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    VxworksJniBridge.libcVxworksUtimensat(dirfd, path.rawAddress, times.rawAddress, flag)

public actual fun dlopen(filename: ConstPtr, flag: CInt): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksDlopen(filename.rawAddress, flag))

public actual fun dlerror(): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksDlerror())

public actual fun dlsym(handle: MutPtr, symbol: ConstPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksDlsym(handle.rawAddress, symbol.rawAddress))

public actual fun dlclose(handle: MutPtr): CInt =
    VxworksJniBridge.libcVxworksDlclose(handle.rawAddress)

public actual fun dladdr(addr: MutPtr, info: MutPtr): CInt =
    VxworksJniBridge.libcVxworksDladdr(addr.rawAddress, info.rawAddress)

public actual fun gmtimeR(timeP: ConstPtr, result: MutPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksGmtimeR(timeP.rawAddress, result.rawAddress))

public actual fun localtimeR(timeP: ConstPtr, result: MutPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksLocaltimeR(timeP.rawAddress, result.rawAddress))

public actual fun mktime(tm: MutPtr): TimeT =
    VxworksJniBridge.libcVxworksMktime(tm.rawAddress)

public actual fun time(time: MutPtr): TimeT =
    VxworksJniBridge.libcVxworksTime(time.rawAddress)

public actual fun gmtime(timeP: ConstPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksGmtime(timeP.rawAddress))

public actual fun localtime(timeP: ConstPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksLocaltime(timeP.rawAddress))

public actual fun timegm(tm: MutPtr): TimeT =
    VxworksJniBridge.libcVxworksTimegm(tm.rawAddress)

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    VxworksJniBridge.libcVxworksDifftime(time1, time0)

public actual fun gethostname(name: MutPtr, len: SizeT): CInt =
    VxworksJniBridge.libcVxworksGethostname(name.rawAddress, len.toLong())

public actual fun usleep(secs: UsecondsT): CInt =
    VxworksJniBridge.libcVxworksUsleep(secs.toLong())

public actual fun putenv(string: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPutenv(string.rawAddress)

public actual fun setlocale(category: CInt, locale: ConstPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksSetlocale(category, locale.rawAddress))

public actual fun localeconv(): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksLocaleconv())

public actual fun sigprocmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    VxworksJniBridge.libcVxworksSigprocmask(how, set.rawAddress, oldset.rawAddress)

public actual fun sigpending(set: MutPtr): CInt =
    VxworksJniBridge.libcVxworksSigpending(set.rawAddress)

public actual fun mkfifo(path: ConstPtr, mode: ModeT): CInt =
    VxworksJniBridge.libcVxworksMkfifo(path.rawAddress, mode)

public actual fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt =
    VxworksJniBridge.libcVxworksFseeko(stream.rawAddress, offset, whence)

public actual fun ftello(stream: MutPtr): OffT =
    VxworksJniBridge.libcVxworksFtello(stream.rawAddress)

public actual fun mkstemp(template: MutPtr): CInt =
    VxworksJniBridge.libcVxworksMkstemp(template.rawAddress)

public actual fun tmpnam(ptr: MutPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksTmpnam(ptr.rawAddress))

public actual fun openlog(ident: ConstPtr, logopt: CInt, facility: CInt) {
    VxworksJniBridge.libcVxworksOpenlog(ident.rawAddress, logopt, facility)
}

public actual fun closelog() {
    VxworksJniBridge.libcVxworksCloselog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    VxworksJniBridge.libcVxworksSetlogmask(maskpri)

public actual fun syslog(priority: CInt, message: ConstPtr, vararg variadicArgs: Long) {
    VxworksJniBridge.libcVxworksSyslog(priority, message.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun getline(lineptr: MutPtr, n: MutPtr, stream: MutPtr): SsizeT =
    VxworksJniBridge.libcVxworksGetline(lineptr.rawAddress, n.rawAddress, stream.rawAddress)

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksTcsetattr(fd, optionalActions, termios.rawAddress)

public actual fun tcgetattr(fd: CInt, termios: MutPtr): CInt =
    VxworksJniBridge.libcVxworksTcgetattr(fd, termios.rawAddress)

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    VxworksJniBridge.libcVxworksTcsendbreak(fd, duration)

public actual fun confstr(name: CInt, buf: MutPtr, len: SizeT): SizeT =
    VxworksJniBridge.libcVxworksConfstr(name, buf.rawAddress, len.toLong()).toULong()

public actual fun fnmatch(pattern: ConstPtr, name: ConstPtr, flags: CInt): CInt =
    VxworksJniBridge.libcVxworksFnmatch(pattern.rawAddress, name.rawAddress, flags)

public actual fun symlinkat(target: ConstPtr, newdirfd: CInt, linkpath: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksSymlinkat(target.rawAddress, newdirfd, linkpath.rawAddress)

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, flags: CInt): CInt =
    VxworksJniBridge.libcVxworksFchmodat(dirfd, pathname.rawAddress, mode, flags)

public actual fun utime(file: ConstPtr, buf: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksUtime(file.rawAddress, buf.rawAddress)

public actual fun memalign(blockSize: SizeT, sizeArg: SizeT): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksMemalign(blockSize.toLong(), sizeArg.toLong()))

public actual fun getcwd(buf: MutPtr, size: SizeT): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksGetcwd(buf.rawAddress, size.toLong()))

public actual fun chdir(attr: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksChdir(attr.rawAddress)

public actual fun pthreadMutexattrInit(attr: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadMutexattrInit(attr.rawAddress)

public actual fun pthreadMutexattrDestroy(attr: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadMutexattrDestroy(attr.rawAddress)

public actual fun pthreadMutexattrSettype(pAttr: MutPtr, pType: CInt): CInt =
    VxworksJniBridge.libcVxworksPthreadMutexattrSettype(pAttr.rawAddress, pType)

public actual fun pthreadMutexInit(mutex: MutPtr, attr: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadMutexInit(mutex.rawAddress, attr.rawAddress)

public actual fun pthreadMutexDestroy(mutex: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadMutexDestroy(mutex.rawAddress)

public actual fun pthreadMutexLock(mutex: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadMutexLock(mutex.rawAddress)

public actual fun pthreadMutexTrylock(mutex: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadMutexTrylock(mutex.rawAddress)

public actual fun pthreadMutexTimedlock(attr: MutPtr, spec: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadMutexTimedlock(attr.rawAddress, spec.rawAddress)

public actual fun pthreadMutexUnlock(mutex: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadMutexUnlock(mutex.rawAddress)

public actual fun pthreadAttrSetname(pAttr: MutPtr, name: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadAttrSetname(pAttr.rawAddress, name.rawAddress)

public actual fun pthreadAttrSetstacksize(attr: MutPtr, stacksize: SizeT): CInt =
    VxworksJniBridge.libcVxworksPthreadAttrSetstacksize(attr.rawAddress, stacksize.toLong())

public actual fun pthreadAttrGetstacksize(attr: ConstPtr, size: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadAttrGetstacksize(attr.rawAddress, size.rawAddress)

public actual fun pthreadAttrInit(attr: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadAttrInit(attr.rawAddress)

public actual fun pthreadCreate(pThread: MutPtr, pAttr: ConstPtr, startRoutine: PthreadCreateStartRoutineCallback, value: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadCreate(pThread.rawAddress, pAttr.rawAddress, 0L, value.rawAddress)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadSetschedparam(native.toLong(), policy, param.rawAddress)

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadGetschedparam(native.toLong(), policy.rawAddress, param.rawAddress)

public actual fun pthreadAttrSetinheritsched(attr: MutPtr, inheritsched: CInt): CInt =
    VxworksJniBridge.libcVxworksPthreadAttrSetinheritsched(attr.rawAddress, inheritsched)

public actual fun pthreadAttrSetschedpolicy(attr: MutPtr, policy: CInt): CInt =
    VxworksJniBridge.libcVxworksPthreadAttrSetschedpolicy(attr.rawAddress, policy)

public actual fun pthreadAttrDestroy(thread: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadAttrDestroy(thread.rawAddress)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    VxworksJniBridge.libcVxworksPthreadDetach(thread.toLong())

public actual fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt =
    VxworksJniBridge.libcVxworksPthreadAtfork(0L, 0L, 0L)

public actual fun fstat(fildes: CInt, buf: MutPtr): CInt =
    VxworksJniBridge.libcVxworksFstat(fildes, buf.rawAddress)

public actual fun lstat(path: ConstPtr, buf: MutPtr): CInt =
    VxworksJniBridge.libcVxworksLstat(path.rawAddress, buf.rawAddress)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    VxworksJniBridge.libcVxworksFtruncate(fd, length)

public actual fun readdirR(pDir: MutPtr, entry: MutPtr, result: MutPtr): CInt =
    VxworksJniBridge.libcVxworksReaddirR(pDir.rawAddress, entry.rawAddress, result.rawAddress)

public actual fun readdir(pDir: MutPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksReaddir(pDir.rawAddress))

public actual fun open(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    VxworksJniBridge.libcVxworksOpen(path.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun poll(fds: MutPtr, nfds: NfdsT, timeout: CInt): CInt =
    VxworksJniBridge.libcVxworksPoll(fds.rawAddress, nfds.toInt(), timeout)

public actual fun pthreadCondattrInit(attr: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadCondattrInit(attr.rawAddress)

public actual fun pthreadCondattrDestroy(attr: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadCondattrDestroy(attr.rawAddress)

public actual fun pthreadCondattrGetclock(pAttr: ConstPtr, pClockId: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadCondattrGetclock(pAttr.rawAddress, pClockId.rawAddress)

public actual fun pthreadCondattrSetclock(pAttr: MutPtr, clockId: ClockidT): CInt =
    VxworksJniBridge.libcVxworksPthreadCondattrSetclock(pAttr.rawAddress, clockId)

public actual fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadCondInit(cond.rawAddress, attr.rawAddress)

public actual fun pthreadCondDestroy(cond: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadCondDestroy(cond.rawAddress)

public actual fun pthreadCondSignal(cond: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadCondSignal(cond.rawAddress)

public actual fun pthreadCondBroadcast(cond: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadCondBroadcast(cond.rawAddress)

public actual fun pthreadCondWait(cond: MutPtr, mutex: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadCondWait(cond.rawAddress, mutex.rawAddress)

public actual fun pthreadRwlockattrInit(attr: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadRwlockattrInit(attr.rawAddress)

public actual fun pthreadRwlockattrDestroy(attr: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadRwlockattrDestroy(attr.rawAddress)

public actual fun pthreadRwlockattrSetmaxreaders(attr: MutPtr, attr2: CUint): CInt =
    VxworksJniBridge.libcVxworksPthreadRwlockattrSetmaxreaders(attr.rawAddress, attr2.toInt())

public actual fun pthreadRwlockInit(attr: MutPtr, host: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadRwlockInit(attr.rawAddress, host.rawAddress)

public actual fun pthreadRwlockDestroy(attr: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadRwlockDestroy(attr.rawAddress)

public actual fun pthreadRwlockRdlock(attr: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadRwlockRdlock(attr.rawAddress)

public actual fun pthreadRwlockTryrdlock(attr: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadRwlockTryrdlock(attr.rawAddress)

public actual fun pthreadRwlockTimedrdlock(attr: MutPtr, host: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadRwlockTimedrdlock(attr.rawAddress, host.rawAddress)

public actual fun pthreadRwlockWrlock(attr: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadRwlockWrlock(attr.rawAddress)

public actual fun pthreadRwlockTrywrlock(attr: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadRwlockTrywrlock(attr.rawAddress)

public actual fun pthreadRwlockTimedwrlock(attr: MutPtr, host: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadRwlockTimedwrlock(attr.rawAddress, host.rawAddress)

public actual fun pthreadRwlockUnlock(attr: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadRwlockUnlock(attr.rawAddress)

public actual fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt =
    VxworksJniBridge.libcVxworksPthreadKeyCreate(key.rawAddress, 0L)

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    VxworksJniBridge.libcVxworksPthreadKeyDelete(key.toLong())

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadSetspecific(key.toLong(), value.rawAddress)

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksPthreadGetspecific(key.toLong()))

public actual fun pthreadCondTimedwait(cond: MutPtr, mutex: MutPtr, abstime: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadCondTimedwait(cond.rawAddress, mutex.rawAddress, abstime.rawAddress)

public actual fun pthreadAttrGetname(attr: MutPtr, name: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadAttrGetname(attr.rawAddress, name.rawAddress)

public actual fun pthreadJoin(thread: PthreadT, status: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadJoin(thread.toLong(), status.rawAddress)

public actual fun pthreadSelf(): PthreadT =
    VxworksJniBridge.libcVxworksPthreadSelf().toULong()

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr): CInt =
    VxworksJniBridge.libcVxworksClockGettime(clockId, tp.rawAddress)

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksClockSettime(clockId, tp.rawAddress)

public actual fun clockGetres(clockId: ClockidT, res: MutPtr): CInt =
    VxworksJniBridge.libcVxworksClockGetres(clockId, res.rawAddress)

public actual fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    VxworksJniBridge.libcVxworksClockNanosleep(clockId, flags, rqtp.rawAddress, rmtp.rawAddress)

public actual fun nanosleep(rqtp: ConstPtr, rmtp: MutPtr): CInt =
    VxworksJniBridge.libcVxworksNanosleep(rqtp.rawAddress, rmtp.rawAddress)

public actual fun accept(s: CInt, addr: MutPtr, addrlen: MutPtr): CInt =
    VxworksJniBridge.libcVxworksAccept(s, addr.rawAddress, addrlen.rawAddress)

public actual fun bind(fd: CInt, addr: ConstPtr, len: SocklenT): CInt =
    VxworksJniBridge.libcVxworksBind(fd, addr.rawAddress, len.toInt())

public actual fun connect(s: CInt, name: ConstPtr, namelen: SocklenT): CInt =
    VxworksJniBridge.libcVxworksConnect(s, name.rawAddress, namelen.toInt())

public actual fun getpeername(s: CInt, name: MutPtr, namelen: MutPtr): CInt =
    VxworksJniBridge.libcVxworksGetpeername(s, name.rawAddress, namelen.rawAddress)

public actual fun getsockname(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    VxworksJniBridge.libcVxworksGetsockname(socket, address.rawAddress, addressLen.rawAddress)

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr, optlen: MutPtr): CInt =
    VxworksJniBridge.libcVxworksGetsockopt(sockfd, level, optname, optval.rawAddress, optlen.rawAddress)

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    VxworksJniBridge.libcVxworksListen(socket, backlog)

public actual fun recv(s: CInt, buf: MutPtr, bufLen: SizeT, flags: CInt): SsizeT =
    VxworksJniBridge.libcVxworksRecv(s, buf.rawAddress, bufLen.toLong(), flags)

public actual fun recvfrom(s: CInt, buf: MutPtr, bufLen: SizeT, flags: CInt, from: MutPtr, pFromLen: MutPtr): SsizeT =
    VxworksJniBridge.libcVxworksRecvfrom(s, buf.rawAddress, bufLen.toLong(), flags, from.rawAddress, pFromLen.rawAddress)

public actual fun recvmsg(socket: CInt, mp: MutPtr, flags: CInt): SsizeT =
    VxworksJniBridge.libcVxworksRecvmsg(socket, mp.rawAddress, flags)

public actual fun send(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt): SsizeT =
    VxworksJniBridge.libcVxworksSend(socket, buf.rawAddress, len.toLong(), flags)

public actual fun sendmsg(socket: CInt, mp: ConstPtr, flags: CInt): SsizeT =
    VxworksJniBridge.libcVxworksSendmsg(socket, mp.rawAddress, flags)

public actual fun sendto(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt, addr: ConstPtr, addrlen: SocklenT): SsizeT =
    VxworksJniBridge.libcVxworksSendto(socket, buf.rawAddress, len.toLong(), flags, addr.rawAddress, addrlen.toInt())

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr, optionLen: SocklenT): CInt =
    VxworksJniBridge.libcVxworksSetsockopt(socket, level, name, value.rawAddress, optionLen.toInt())

public actual fun shutdown(s: CInt, how: CInt): CInt =
    VxworksJniBridge.libcVxworksShutdown(s, how)

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    VxworksJniBridge.libcVxworksSocket(domain, type, protocol)

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    VxworksJniBridge.libcVxworksIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    VxworksJniBridge.libcVxworksFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun gaiStrerror(errcode: CInt): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksGaiStrerror(errcode))

public actual fun close(fd: CInt): CInt =
    VxworksJniBridge.libcVxworksClose(fd)

public actual fun read(fd: CInt, buf: MutPtr, count: SizeT): SsizeT =
    VxworksJniBridge.libcVxworksRead(fd, buf.rawAddress, count.toLong())

public actual fun write(fd: CInt, buf: ConstPtr, count: SizeT): SsizeT =
    VxworksJniBridge.libcVxworksWrite(fd, buf.rawAddress, count.toLong())

public actual fun isatty(fd: CInt): CInt =
    VxworksJniBridge.libcVxworksIsatty(fd)

public actual fun dup(src: CInt): CInt =
    VxworksJniBridge.libcVxworksDup(src)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    VxworksJniBridge.libcVxworksDup2(src, dst)

public actual fun pipe(fds: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPipe(fds.rawAddress)

public actual fun unlink(pathname: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksUnlink(pathname.rawAddress)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    VxworksJniBridge.libcVxworksLseek(fd, offset, whence)

public actual fun getaddrinfo(node: ConstPtr, service: ConstPtr, hints: ConstPtr, res: MutPtr): CInt =
    VxworksJniBridge.libcVxworksGetaddrinfo(node.rawAddress, service.rawAddress, hints.rawAddress, res.rawAddress)

public actual fun freeaddrinfo(res: MutPtr) {
    VxworksJniBridge.libcVxworksFreeaddrinfo(res.rawAddress)
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    VxworksJniBridge.libcVxworksSignal(signum, handler.toLong()).toULong()

public actual fun getpid(): PidT =
    VxworksJniBridge.libcVxworksGetpid()

public actual fun getppid(): PidT =
    VxworksJniBridge.libcVxworksGetppid()

public actual fun setpgid(pid: PidT, pgid: PidT): PidT =
    VxworksJniBridge.libcVxworksSetpgid(pid, pgid)

public actual fun waitpid(pid: PidT, status: MutPtr, options: CInt): PidT =
    VxworksJniBridge.libcVxworksWaitpid(pid, status.rawAddress, options)

public actual fun sysconf(attr: CInt): CLong =
    VxworksJniBridge.libcVxworksSysconf(attr)

public actual fun setenv(envVarName: ConstPtr, envVarValue: ConstPtr, overwrite: CInt): CInt =
    VxworksJniBridge.libcVxworksSetenv(envVarName.rawAddress, envVarValue.rawAddress, overwrite)

public actual fun unsetenv(envVarName: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksUnsetenv(envVarName.rawAddress)

public actual fun realpath(fileName: ConstPtr, resolvedName: MutPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksRealpath(fileName.rawAddress, resolvedName.rawAddress))

public actual fun link(src: ConstPtr, dst: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksLink(src.rawAddress, dst.rawAddress)

public actual fun readlink(path: ConstPtr, buf: MutPtr, bufsize: SizeT): SsizeT =
    VxworksJniBridge.libcVxworksReadlink(path.rawAddress, buf.rawAddress, bufsize.toLong())

public actual fun symlink(path1: ConstPtr, path2: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksSymlink(path1.rawAddress, path2.rawAddress)

public actual fun opendir(name: ConstPtr): MutPtr =
    MutPtr(VxworksJniBridge.libcVxworksOpendir(name.rawAddress))

public actual fun rmdir(path: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksRmdir(path.rawAddress)

public actual fun mkdir(dirName: ConstPtr, mode: ModeT): CInt =
    VxworksJniBridge.libcVxworksMkdir(dirName.rawAddress, mode)

public actual fun chmod(path: ConstPtr, mode: ModeT): CInt =
    VxworksJniBridge.libcVxworksChmod(path.rawAddress, mode)

public actual fun fchmod(attr1: CInt, attr2: ModeT): CInt =
    VxworksJniBridge.libcVxworksFchmod(attr1, attr2)

public actual fun fsync(fd: CInt): CInt =
    VxworksJniBridge.libcVxworksFsync(fd)

public actual fun closedir(ptr: MutPtr): CInt =
    VxworksJniBridge.libcVxworksClosedir(ptr.rawAddress)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    VxworksJniBridge.libcVxworksSchedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    VxworksJniBridge.libcVxworksSchedGetPriorityMin(policy)

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksSchedSetparam(pid, param.rawAddress)

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    VxworksJniBridge.libcVxworksSchedGetparam(pid, param.rawAddress)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksSchedSetscheduler(pid, policy, param.rawAddress)

public actual fun schedGetscheduler(pid: PidT): CInt =
    VxworksJniBridge.libcVxworksSchedGetscheduler(pid)

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr): CInt =
    VxworksJniBridge.libcVxworksSchedRrGetInterval(pid, tp.rawAddress)

public actual fun schedYield(): CInt =
    VxworksJniBridge.libcVxworksSchedYield()

public actual fun errnoSet(err: CInt): CInt =
    VxworksJniBridge.libcVxworksErrnoSet(err)

public actual fun errnoGet(): CInt =
    VxworksJniBridge.libcVxworksErrnoGet()

public actual fun setgid(gid: GidT): CInt =
    VxworksJniBridge.libcVxworksSetgid(gid.toShort())

public actual fun getgid(): GidT =
    VxworksJniBridge.libcVxworksGetgid().toUShort()

public actual fun setuid(uid: UidT): CInt =
    VxworksJniBridge.libcVxworksSetuid(uid.toShort())

public actual fun getuid(): UidT =
    VxworksJniBridge.libcVxworksGetuid().toUShort()

public actual fun sigemptyset(set: MutPtr): CInt =
    VxworksJniBridge.libcVxworksSigemptyset(set.rawAddress)

public actual fun sigfillset(set: MutPtr): CInt =
    VxworksJniBridge.libcVxworksSigfillset(set.rawAddress)

public actual fun sigdelset(set: MutPtr, signum: CInt): CInt =
    VxworksJniBridge.libcVxworksSigdelset(set.rawAddress, signum)

public actual fun sigismember(set: ConstPtr, signum: CInt): CInt =
    VxworksJniBridge.libcVxworksSigismember(set.rawAddress, signum)

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oset: MutPtr): CInt =
    VxworksJniBridge.libcVxworksPthreadSigmask(how, set.rawAddress, oset.rawAddress)

public actual fun kill(pid: PidT, signo: CInt): CInt =
    VxworksJniBridge.libcVxworksKill(pid, signo)

public actual fun sigqueue(pid: PidT, signo: CInt, value: Sigval): CInt =
    0

public actual fun taskKill(taskId: TaskId, signo: CInt): CInt =
    VxworksJniBridge.libcVxworksTaskKill(taskId, signo)

public actual fun raise(signo: CInt): CInt =
    VxworksJniBridge.libcVxworksRaise(signo)

public actual fun taskIdSelf(): TaskId =
    VxworksJniBridge.libcVxworksTaskIdSelf()

public actual fun taskDelay(ticks: VxTicksT): CInt =
    VxworksJniBridge.libcVxworksTaskDelay(ticks.toInt())

public actual fun taskNameSet(taskId: TaskId, taskName: MutPtr): CInt =
    VxworksJniBridge.libcVxworksTaskNameSet(taskId, taskName.rawAddress)

public actual fun taskNameGet(taskId: TaskId, bufName: MutPtr, bufsize: SizeT): CInt =
    VxworksJniBridge.libcVxworksTaskNameGet(taskId, bufName.rawAddress, bufsize.toLong())

public actual fun rtpInfoGet(rtpId: RtpId, rtpStruct: MutPtr): CInt =
    VxworksJniBridge.libcVxworksRtpInfoGet(rtpId, rtpStruct.rawAddress)

public actual fun rtpSpawn(pubrtpFileName: ConstPtr, argv: MutPtr, envp: MutPtr, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId =
    VxworksJniBridge.libcVxworksRtpSpawn(pubrtpFileName.rawAddress, argv.rawAddress, envp.rawAddress, priority, uStackSize.toLong(), options, taskOptions)

public actual fun pathIsAbsolute(filepath: ConstPtr, pNameTail: MutPtr): Bool =
    VxworksJniBridge.libcVxworksPathIsAbsolute(filepath.rawAddress, pNameTail.rawAddress)

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    VxworksJniBridge.libcVxworksWritev(fd, iov.rawAddress, iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    VxworksJniBridge.libcVxworksReadv(fd, iov.rawAddress, iovcnt)

public actual fun randBytes(buf: MutPtr, length: CInt): CInt =
    VxworksJniBridge.libcVxworksRandBytes(buf.rawAddress, length)

public actual fun randABytes(buf: MutPtr, length: CInt): CInt =
    VxworksJniBridge.libcVxworksRandABytes(buf.rawAddress, length)

public actual fun randUBytes(buf: MutPtr, length: CInt): CInt =
    VxworksJniBridge.libcVxworksRandUBytes(buf.rawAddress, length)

public actual fun randSecure(): CInt =
    VxworksJniBridge.libcVxworksRandSecure()

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    VxworksJniBridge.libcVxworksMqOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toInt()

public actual fun mqClose(mqd: MqdT): CInt =
    VxworksJniBridge.libcVxworksMqClose(mqd.toLong())

public actual fun mqUnlink(name: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksMqUnlink(name.rawAddress)

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    VxworksJniBridge.libcVxworksMqReceive(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.rawAddress)

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    VxworksJniBridge.libcVxworksMqTimedreceive(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.rawAddress, absTimeout.rawAddress)

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    VxworksJniBridge.libcVxworksMqSend(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.toInt())

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    VxworksJniBridge.libcVxworksMqTimedsend(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.toInt(), absTimeout.rawAddress)

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt =
    VxworksJniBridge.libcVxworksMqGetattr(mqd.toLong(), attr.rawAddress)

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt =
    VxworksJniBridge.libcVxworksMqSetattr(mqd.toLong(), newattr.rawAddress, oldattr.rawAddress)

public actual fun vxCpuEnabledGet(): CpusetT =
    VxworksJniBridge.libcVxworksVxCpuEnabledGet().toUInt()

public actual fun vxCpuConfiguredGet(): CpusetT =
    VxworksJniBridge.libcVxworksVxCpuConfiguredGet().toUInt()
