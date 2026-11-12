@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.wasi

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
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object WasiJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcWasiGetENVIRON(): Long

    @JvmStatic
    external fun libcWasiSetENVIRON(value: Long)

    @JvmStatic
    external fun libcWasiGetCLOCKMONOTONIC1(): Byte

    @JvmStatic
    external fun libcWasiGetCLOCKREALTIME1(): Byte

    @JvmStatic
    external fun libcWasiExit(code: Int)

    @JvmStatic
    external fun libcWasiAbort()

    @JvmStatic
    external fun libcWasiAlignedAlloc(a: Long, b: Long): Long

    @JvmStatic
    external fun libcWasiCalloc(amt: Long, amt2: Long): Long

    @JvmStatic
    external fun libcWasiFree(ptr: Long)

    @JvmStatic
    external fun libcWasiGetenv(s: Long): Long

    @JvmStatic
    external fun libcWasiMalloc(amt: Long): Long

    @JvmStatic
    external fun libcWasiMallocUsableSize(ptr: Long): Long

    @JvmStatic
    external fun libcWasiSbrk(increment: Long): Long

    @JvmStatic
    external fun libcWasiRand(): Int

    @JvmStatic
    external fun libcWasiRead(fd: Int, ptr: Long, size: Long): Long

    @JvmStatic
    external fun libcWasiRealloc(ptr: Long, amt: Long): Long

    @JvmStatic
    external fun libcWasiSetenv(k: Long, v: Long, a: Int): Int

    @JvmStatic
    external fun libcWasiUnsetenv(k: Long): Int

    @JvmStatic
    external fun libcWasiClearenv(): Int

    @JvmStatic
    external fun libcWasiWrite(fd: Int, ptr: Long, size: Long): Long

    @JvmStatic
    external fun libcWasiFopen(a: Long, b: Long): Long

    @JvmStatic
    external fun libcWasiFreopen(a: Long, b: Long, f: Long): Long

    @JvmStatic
    external fun libcWasiFclose(f: Long): Int

    @JvmStatic
    external fun libcWasiRemove(a: Long): Int

    @JvmStatic
    external fun libcWasiRename(a: Long, b: Long): Int

    @JvmStatic
    external fun libcWasiFeof(f: Long): Int

    @JvmStatic
    external fun libcWasiFerror(f: Long): Int

    @JvmStatic
    external fun libcWasiFflush(f: Long): Int

    @JvmStatic
    external fun libcWasiClearerr(f: Long)

    @JvmStatic
    external fun libcWasiFseek(f: Long, b: Long, c: Int): Int

    @JvmStatic
    external fun libcWasiFtell(f: Long): Long

    @JvmStatic
    external fun libcWasiRewind(f: Long)

    @JvmStatic
    external fun libcWasiFgetpos(f: Long, pos: Long): Int

    @JvmStatic
    external fun libcWasiFsetpos(f: Long, pos: Long): Int

    @JvmStatic
    external fun libcWasiFread(buf: Long, a: Long, b: Long, f: Long): Long

    @JvmStatic
    external fun libcWasiFwrite(buf: Long, a: Long, b: Long, f: Long): Long

    @JvmStatic
    external fun libcWasiFgetc(f: Long): Int

    @JvmStatic
    external fun libcWasiGetc(f: Long): Int

    @JvmStatic
    external fun libcWasiGetchar(): Int

    @JvmStatic
    external fun libcWasiUngetc(a: Int, f: Long): Int

    @JvmStatic
    external fun libcWasiFputc(a: Int, f: Long): Int

    @JvmStatic
    external fun libcWasiPutc(a: Int, f: Long): Int

    @JvmStatic
    external fun libcWasiPutchar(a: Int): Int

    @JvmStatic
    external fun libcWasiFputs(a: Long, f: Long): Int

    @JvmStatic
    external fun libcWasiPuts(a: Long): Int

    @JvmStatic
    external fun libcWasiPerror(a: Long)

    @JvmStatic
    external fun libcWasiSrand(a: Int)

    @JvmStatic
    external fun libcWasiAtexit(a: Long): Int

    @JvmStatic
    external fun libcWasiAtQuickExit(a: Long): Int

    @JvmStatic
    external fun libcWasiQuickExit(a: Int)

    @JvmStatic
    external fun libcWasiPosixMemalign(a: Long, b: Long, c: Long): Int

    @JvmStatic
    external fun libcWasiRandR(a: Long): Int

    @JvmStatic
    external fun libcWasiRandom(): Long

    @JvmStatic
    external fun libcWasiSrandom(a: Int)

    @JvmStatic
    external fun libcWasiPutenv(a: Long): Int

    @JvmStatic
    external fun libcWasiClock(): Long

    @JvmStatic
    external fun libcWasiTime(a: Long): Long

    @JvmStatic
    external fun libcWasiDifftime(a: Long, b: Long): Double

    @JvmStatic
    external fun libcWasiMktime(a: Long): Long

    @JvmStatic
    external fun libcWasiStrftime(a: Long, b: Long, c: Long, d: Long): Long

    @JvmStatic
    external fun libcWasiGmtime(a: Long): Long

    @JvmStatic
    external fun libcWasiGmtimeR(a: Long, b: Long): Long

    @JvmStatic
    external fun libcWasiLocaltime(a: Long): Long

    @JvmStatic
    external fun libcWasiLocaltimeR(a: Long, b: Long): Long

    @JvmStatic
    external fun libcWasiAsctimeR(a: Long, b: Long): Long

    @JvmStatic
    external fun libcWasiCtimeR(a: Long, b: Long): Long

    @JvmStatic
    external fun libcWasiNanosleep(a: Long, b: Long): Int

    @JvmStatic
    external fun libcWasiIsalnum(c: Int): Int

    @JvmStatic
    external fun libcWasiIsalpha(c: Int): Int

    @JvmStatic
    external fun libcWasiIscntrl(c: Int): Int

    @JvmStatic
    external fun libcWasiIsdigit(c: Int): Int

    @JvmStatic
    external fun libcWasiIsgraph(c: Int): Int

    @JvmStatic
    external fun libcWasiIslower(c: Int): Int

    @JvmStatic
    external fun libcWasiIsprint(c: Int): Int

    @JvmStatic
    external fun libcWasiIspunct(c: Int): Int

    @JvmStatic
    external fun libcWasiIsspace(c: Int): Int

    @JvmStatic
    external fun libcWasiIsupper(c: Int): Int

    @JvmStatic
    external fun libcWasiIsxdigit(c: Int): Int

    @JvmStatic
    external fun libcWasiIsblank(c: Int): Int

    @JvmStatic
    external fun libcWasiTolower(c: Int): Int

    @JvmStatic
    external fun libcWasiToupper(c: Int): Int

    @JvmStatic
    external fun libcWasiSetvbuf(stream: Long, buffer: Long, mode: Int, size: Long): Int

    @JvmStatic
    external fun libcWasiSetbuf(stream: Long, buf: Long)

    @JvmStatic
    external fun libcWasiFgets(buf: Long, n: Int, stream: Long): Long

    @JvmStatic
    external fun libcWasiAtof(s: Long): Double

    @JvmStatic
    external fun libcWasiAtoi(s: Long): Int

    @JvmStatic
    external fun libcWasiAtol(s: Long): Long

    @JvmStatic
    external fun libcWasiAtoll(s: Long): Long

    @JvmStatic
    external fun libcWasiStrtod(s: Long, endp: Long): Double

    @JvmStatic
    external fun libcWasiStrtof(s: Long, endp: Long): Float

    @JvmStatic
    external fun libcWasiStrtol(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcWasiStrtoll(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcWasiStrtoul(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcWasiStrtoull(s: Long, endp: Long, base: Int): Long

    @JvmStatic
    external fun libcWasiStrcpy(dst: Long, src: Long): Long

    @JvmStatic
    external fun libcWasiStrncpy(dst: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcWasiStrcat(s: Long, ct: Long): Long

    @JvmStatic
    external fun libcWasiStrncat(s: Long, ct: Long, n: Long): Long

    @JvmStatic
    external fun libcWasiStrcmp(cs: Long, ct: Long): Int

    @JvmStatic
    external fun libcWasiStrncmp(cs: Long, ct: Long, n: Long): Int

    @JvmStatic
    external fun libcWasiStrcoll(cs: Long, ct: Long): Int

    @JvmStatic
    external fun libcWasiStrchr(cs: Long, c: Int): Long

    @JvmStatic
    external fun libcWasiStrrchr(cs: Long, c: Int): Long

    @JvmStatic
    external fun libcWasiStrspn(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcWasiStrcspn(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcWasiStrdup(cs: Long): Long

    @JvmStatic
    external fun libcWasiStrndup(cs: Long, n: Long): Long

    @JvmStatic
    external fun libcWasiStrpbrk(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcWasiStrstr(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcWasiStrcasecmp(s1: Long, s2: Long): Int

    @JvmStatic
    external fun libcWasiStrncasecmp(s1: Long, s2: Long, n: Long): Int

    @JvmStatic
    external fun libcWasiStrlen(cs: Long): Long

    @JvmStatic
    external fun libcWasiStrnlen(cs: Long, maxlen: Long): Long

    @JvmStatic
    external fun libcWasiStrerror(n: Int): Long

    @JvmStatic
    external fun libcWasiStrtok(s: Long, t: Long): Long

    @JvmStatic
    external fun libcWasiStrxfrm(s: Long, ct: Long, n: Long): Long

    @JvmStatic
    external fun libcWasiMemchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcWasiMemcmp(cx: Long, ct: Long, n: Long): Int

    @JvmStatic
    external fun libcWasiMemcpy(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcWasiMemmove(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcWasiMemset(dest: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcWasiFprintf(stream: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcWasiPrintf(format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcWasiSnprintf(s: Long, n: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcWasiSprintf(s: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcWasiFscanf(stream: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcWasiScanf(format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcWasiSscanf(s: Long, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcWasiGetcharUnlocked(): Int

    @JvmStatic
    external fun libcWasiPutcharUnlocked(c: Int): Int

    @JvmStatic
    external fun libcWasiShutdown(socket: Int, how: Int): Int

    @JvmStatic
    external fun libcWasiFstat(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libcWasiMkdir(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcWasiStat(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcWasiFdopen(fd: Int, mode: Long): Long

    @JvmStatic
    external fun libcWasiFileno(stream: Long): Int

    @JvmStatic
    external fun libcWasiOpen(path: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcWasiCreat(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcWasiFcntl(fd: Int, cmd: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcWasiOpendir(dirname: Long): Long

    @JvmStatic
    external fun libcWasiFdopendir(fd: Int): Long

    @JvmStatic
    external fun libcWasiReaddir(dirp: Long): Long

    @JvmStatic
    external fun libcWasiClosedir(dirp: Long): Int

    @JvmStatic
    external fun libcWasiRewinddir(dirp: Long)

    @JvmStatic
    external fun libcWasiDirfd(dirp: Long): Int

    @JvmStatic
    external fun libcWasiSeekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libcWasiTelldir(dirp: Long): Long

    @JvmStatic
    external fun libcWasiOpenat(dirfd: Int, pathname: Long, flags: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcWasiFstatat(dirfd: Int, pathname: Long, buf: Long, flags: Int): Int

    @JvmStatic
    external fun libcWasiLinkat(olddirfd: Int, oldpath: Long, newdirfd: Int, newpath: Long, flags: Int): Int

    @JvmStatic
    external fun libcWasiMkdirat(dirfd: Int, pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcWasiReadlinkat(dirfd: Int, pathname: Long, buf: Long, bufsiz: Long): Long

    @JvmStatic
    external fun libcWasiRenameat(olddirfd: Int, oldpath: Long, newdirfd: Int, newpath: Long): Int

    @JvmStatic
    external fun libcWasiSymlinkat(target: Long, newdirfd: Int, linkpath: Long): Int

    @JvmStatic
    external fun libcWasiUnlinkat(dirfd: Int, pathname: Long, flags: Int): Int

    @JvmStatic
    external fun libcWasiAccess(path: Long, amode: Int): Int

    @JvmStatic
    external fun libcWasiClose(fd: Int): Int

    @JvmStatic
    external fun libcWasiFpathconf(filedes: Int, name: Int): Long

    @JvmStatic
    external fun libcWasiGetopt(argc: Int, argv: Long, optstr: Long): Int

    @JvmStatic
    external fun libcWasiIsatty(fd: Int): Int

    @JvmStatic
    external fun libcWasiLink(src: Long, dst: Long): Int

    @JvmStatic
    external fun libcWasiLseek(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libcWasiPathconf(path: Long, name: Int): Long

    @JvmStatic
    external fun libcWasiRmdir(path: Long): Int

    @JvmStatic
    external fun libcWasiSleep(secs: Int): Int

    @JvmStatic
    external fun libcWasiUnlink(c: Long): Int

    @JvmStatic
    external fun libcWasiPread(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libcWasiPwrite(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libcWasiLstat(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcWasiFsync(fd: Int): Int

    @JvmStatic
    external fun libcWasiFdatasync(fd: Int): Int

    @JvmStatic
    external fun libcWasiSymlink(path1: Long, path2: Long): Int

    @JvmStatic
    external fun libcWasiTruncate(path: Long, length: Long): Int

    @JvmStatic
    external fun libcWasiFtruncate(fd: Int, length: Long): Int

    @JvmStatic
    external fun libcWasiGetrusage(resource: Int, usage: Long): Int

    @JvmStatic
    external fun libcWasiGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcWasiTimes(buf: Long): Long

    @JvmStatic
    external fun libcWasiStrerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcWasiUsleep(secs: Int): Int

    @JvmStatic
    external fun libcWasiSend(socket: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcWasiRecv(socket: Int, buf: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcWasiPoll(fds: Long, nfds: Long, timeout: Int): Int

    @JvmStatic
    external fun libcWasiSetlocale(category: Int, locale: Long): Long

    @JvmStatic
    external fun libcWasiLocaleconv(): Long

    @JvmStatic
    external fun libcWasiReadlink(path: Long, buf: Long, bufsz: Long): Long

    @JvmStatic
    external fun libcWasiTimegm(tm: Long): Long

    @JvmStatic
    external fun libcWasiSysconf(name: Int): Long

    @JvmStatic
    external fun libcWasiIoctl(fd: Int, request: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcWasiFseeko(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libcWasiFtello(stream: Long): Long

    @JvmStatic
    external fun libcWasiPosixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcWasiStrcasestr(cs: Long, ct: Long): Long

    @JvmStatic
    external fun libcWasiGetline(lineptr: Long, n: Long, stream: Long): Long

    @JvmStatic
    external fun libcWasiFaccessat(dirfd: Int, pathname: Long, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libcWasiWritev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcWasiReadv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcWasiPwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcWasiPreadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcWasiPosixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libcWasiFutimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcWasiUtimensat(dirfd: Int, path: Long, times: Long, flag: Int): Int

    @JvmStatic
    external fun libcWasiGetentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcWasiMemrchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcWasiAbs(i: Int): Int

    @JvmStatic
    external fun libcWasiLabs(i: Long): Long

    @JvmStatic
    external fun libcWasiDuplocale(base: Long): Long

    @JvmStatic
    external fun libcWasiFreelocale(loc: Long)

    @JvmStatic
    external fun libcWasiNewlocale(mask: Int, locale: Long, base: Long): Long

    @JvmStatic
    external fun libcWasiUselocale(loc: Long): Long

    @JvmStatic
    external fun libcWasiSchedYield(): Int

    @JvmStatic
    external fun libcWasiGetcwd(buf: Long, size: Long): Long

    @JvmStatic
    external fun libcWasiChdir(dir: Long): Int

    @JvmStatic
    external fun libcWasiNlLanginfo(item: Int): Long

    @JvmStatic
    external fun libcWasiNlLanginfoL(item: Int, loc: Long): Long

    @JvmStatic
    external fun libcWasiSelect(nfds: Int, readfds: Long, writefds: Long, errorfds: Long, timeout: Long): Int

    @JvmStatic
    external fun libcWasiWasilibcRegisterPreopenedFd(fd: Int, path: Long): Int

    @JvmStatic
    external fun libcWasiWasilibcFdRenumber(fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libcWasiWasilibcUnlinkat(fd: Int, path: Long): Int

    @JvmStatic
    external fun libcWasiWasilibcRmdirat(fd: Int, path: Long): Int

    @JvmStatic
    external fun libcWasiWasilibcFindRelpath(path: Long, absPrefix: Long, relativePath: Long, relativePathLen: Long): Int

    @JvmStatic
    external fun libcWasiWasilibcTell(fd: Int): Long

    @JvmStatic
    external fun libcWasiWasilibcNocwdWasilibcUnlinkat(dirfd: Int, path: Long): Int

    @JvmStatic
    external fun libcWasiWasilibcNocwdWasilibcRmdirat(dirfd: Int, path: Long): Int

    @JvmStatic
    external fun libcWasiWasilibcNocwdLinkat(olddirfd: Int, oldpath: Long, newdirfd: Int, newpath: Long, flags: Int): Int

    @JvmStatic
    external fun libcWasiWasilibcNocwdSymlinkat(target: Long, dirfd: Int, path: Long): Int

    @JvmStatic
    external fun libcWasiWasilibcNocwdReadlinkat(dirfd: Int, path: Long, buf: Long, bufsize: Long): Long

    @JvmStatic
    external fun libcWasiWasilibcNocwdFaccessat(dirfd: Int, path: Long, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libcWasiWasilibcNocwdRenameat(olddirfd: Int, oldpath: Long, newdirfd: Int, newpath: Long): Int

    @JvmStatic
    external fun libcWasiWasilibcNocwdOpenatNomode(dirfd: Int, path: Long, flags: Int): Int

    @JvmStatic
    external fun libcWasiWasilibcNocwdFstatat(dirfd: Int, path: Long, buf: Long, flags: Int): Int

    @JvmStatic
    external fun libcWasiWasilibcNocwdMkdiratNomode(dirfd: Int, path: Long): Int

    @JvmStatic
    external fun libcWasiWasilibcNocwdUtimensat(dirfd: Int, path: Long, times: Long, flags: Int): Int

    @JvmStatic
    external fun libcWasiWasilibcNocwdOpendirat(dirfd: Int, path: Long): Long

    @JvmStatic
    external fun libcWasiWasilibcAccess(pathname: Long, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libcWasiWasilibcStat(pathname: Long, buf: Long, flags: Int): Int

    @JvmStatic
    external fun libcWasiWasilibcUtimens(pathname: Long, times: Long, flags: Int): Int

    @JvmStatic
    external fun libcWasiWasilibcLink(oldpath: Long, newpath: Long, flags: Int): Int

    @JvmStatic
    external fun libcWasiWasilibcLinkOldat(olddirfd: Int, oldpath: Long, newpath: Long, flags: Int): Int

    @JvmStatic
    external fun libcWasiWasilibcLinkNewat(oldpath: Long, newdirfd: Int, newpath: Long, flags: Int): Int

    @JvmStatic
    external fun libcWasiWasilibcRenameOldat(olddirfd: Int, oldpath: Long, newpath: Long): Int

    @JvmStatic
    external fun libcWasiWasilibcRenameNewat(oldpath: Long, newdirfd: Int, newpath: Long): Int

    @JvmStatic
    external fun libcWasiArc4random(): Int

    @JvmStatic
    external fun libcWasiArc4randomBuf(a: Long, b: Long)

    @JvmStatic
    external fun libcWasiArc4randomUniform(a: Int): Int

    @JvmStatic
    external fun libcWasiErrnoLocation(): Long

    @JvmStatic
    external fun libcWasiChmod(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcWasiFchmod(fd: Int, mode: Int): Int

    @JvmStatic
    external fun libcWasiRealpath(pathname: Long, resolved: Long): Long

    @JvmStatic
    external fun libcWasiPthreadSelf(): Long

    @JvmStatic
    external fun libcWasiPthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libcWasiPthreadEqual(t1: Long, t2: Long): Int

    @JvmStatic
    external fun libcWasiPthreadJoin(native: Long, value: Long): Int

    @JvmStatic
    external fun libcWasiPthreadAttrInit(attr: Long): Int

    @JvmStatic
    external fun libcWasiPthreadAttrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcWasiPthreadAttrGetstacksize(attr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcWasiPthreadAttrSetstacksize(attr: Long, stackSize: Long): Int

    @JvmStatic
    external fun libcWasiPthreadAttrSetdetachstate(attr: Long, state: Int): Int

    @JvmStatic
    external fun libcWasiPthreadDetach(thread: Long): Int

    @JvmStatic
    external fun libcWasiPthreadKeyCreate(key: Long, dtor: Long): Int

    @JvmStatic
    external fun libcWasiPthreadKeyDelete(key: Int): Int

    @JvmStatic
    external fun libcWasiPthreadGetspecific(key: Int): Long

    @JvmStatic
    external fun libcWasiPthreadSetspecific(key: Int, value: Long): Int

    @JvmStatic
    external fun libcWasiPthreadMutexInit(lock: Long, attr: Long): Int

    @JvmStatic
    external fun libcWasiPthreadMutexDestroy(lock: Long): Int

    @JvmStatic
    external fun libcWasiPthreadMutexLock(lock: Long): Int

    @JvmStatic
    external fun libcWasiPthreadMutexTrylock(lock: Long): Int

    @JvmStatic
    external fun libcWasiPthreadMutexUnlock(lock: Long): Int

    @JvmStatic
    external fun libcWasiPthreadMutexattrInit(attr: Long): Int

    @JvmStatic
    external fun libcWasiPthreadMutexattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcWasiPthreadMutexattrSettype(attr: Long, type: Int): Int

    @JvmStatic
    external fun libcWasiPthreadCondInit(cond: Long, attr: Long): Int

    @JvmStatic
    external fun libcWasiPthreadCondWait(cond: Long, lock: Long): Int

    @JvmStatic
    external fun libcWasiPthreadCondTimedwait(cond: Long, lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libcWasiPthreadCondSignal(cond: Long): Int

    @JvmStatic
    external fun libcWasiPthreadCondBroadcast(cond: Long): Int

    @JvmStatic
    external fun libcWasiPthreadCondDestroy(cond: Long): Int

    @JvmStatic
    external fun libcWasiPthreadCondattrInit(attr: Long): Int

    @JvmStatic
    external fun libcWasiPthreadCondattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcWasiPthreadRwlockInit(lock: Long, attr: Long): Int

    @JvmStatic
    external fun libcWasiPthreadRwlockDestroy(lock: Long): Int

    @JvmStatic
    external fun libcWasiPthreadRwlockRdlock(lock: Long): Int

    @JvmStatic
    external fun libcWasiPthreadRwlockTryrdlock(lock: Long): Int

    @JvmStatic
    external fun libcWasiPthreadRwlockWrlock(lock: Long): Int

    @JvmStatic
    external fun libcWasiPthreadRwlockTrywrlock(lock: Long): Int

    @JvmStatic
    external fun libcWasiPthreadRwlockUnlock(lock: Long): Int

    @JvmStatic
    external fun libcWasiPthreadRwlockattrInit(attr: Long): Int

    @JvmStatic
    external fun libcWasiPthreadRwlockattrDestroy(attr: Long): Int
}

public actual var ENVIRON: MutPtr<MutPtr<CChar>>
    get() = MutPtr(WasiJniBridge.libcWasiGetENVIRON())
    set(value) {
        WasiJniBridge.libcWasiSetENVIRON(value.rawAddress)
    }

public actual val CLOCK_MONOTONIC1: UByte
    get() = WasiJniBridge.libcWasiGetCLOCKMONOTONIC1().toUByte()

public actual val CLOCK_REALTIME1: UByte
    get() = WasiJniBridge.libcWasiGetCLOCKREALTIME1().toUByte()

public actual fun exit(code: CInt): Nothing {
    WasiJniBridge.libcWasiExit(code)
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    WasiJniBridge.libcWasiAbort()
    error("Unreachable noreturn C function abort")
}

public actual fun alignedAlloc(a: SizeT, b: SizeT): MutPtr<CVoid> =
    MutPtr(WasiJniBridge.libcWasiAlignedAlloc(a.toLong(), b.toLong()))

public actual fun calloc(amt: SizeT, amt2: SizeT): MutPtr<CVoid> =
    MutPtr(WasiJniBridge.libcWasiCalloc(amt.toLong(), amt2.toLong()))

public actual fun free(ptr: MutPtr<CVoid>) {
    WasiJniBridge.libcWasiFree(ptr.rawAddress)
}

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiGetenv(s.rawAddress))

public actual fun malloc(amt: SizeT): MutPtr<CVoid> =
    MutPtr(WasiJniBridge.libcWasiMalloc(amt.toLong()))

public actual fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT =
    WasiJniBridge.libcWasiMallocUsableSize(ptr.rawAddress).toULong()

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    MutPtr(WasiJniBridge.libcWasiSbrk(increment))

public actual fun rand(): CInt =
    WasiJniBridge.libcWasiRand()

public actual fun read(fd: CInt, ptr: MutPtr<CVoid>, size: SizeT): SsizeT =
    WasiJniBridge.libcWasiRead(fd, ptr.rawAddress, size.toLong())

public actual fun realloc(ptr: MutPtr<CVoid>, amt: SizeT): MutPtr<CVoid> =
    MutPtr(WasiJniBridge.libcWasiRealloc(ptr.rawAddress, amt.toLong()))

public actual fun setenv(k: ConstPtr<CChar>, v: ConstPtr<CChar>, a: CInt): CInt =
    WasiJniBridge.libcWasiSetenv(k.rawAddress, v.rawAddress, a)

public actual fun unsetenv(k: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiUnsetenv(k.rawAddress)

public actual fun clearenv(): CInt =
    WasiJniBridge.libcWasiClearenv()

public actual fun write(fd: CInt, ptr: ConstPtr<CVoid>, size: SizeT): SsizeT =
    WasiJniBridge.libcWasiWrite(fd, ptr.rawAddress, size.toLong())

public actual fun fopen(a: ConstPtr<CChar>, b: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(WasiJniBridge.libcWasiFopen(a.rawAddress, b.rawAddress))

public actual fun freopen(a: ConstPtr<CChar>, b: ConstPtr<CChar>, f: MutPtr<FILE>): MutPtr<FILE> =
    MutPtr(WasiJniBridge.libcWasiFreopen(a.rawAddress, b.rawAddress, f.rawAddress))

public actual fun fclose(f: MutPtr<FILE>): CInt =
    WasiJniBridge.libcWasiFclose(f.rawAddress)

public actual fun remove(a: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiRemove(a.rawAddress)

public actual fun rename(a: ConstPtr<CChar>, b: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiRename(a.rawAddress, b.rawAddress)

public actual fun feof(f: MutPtr<FILE>): CInt =
    WasiJniBridge.libcWasiFeof(f.rawAddress)

public actual fun ferror(f: MutPtr<FILE>): CInt =
    WasiJniBridge.libcWasiFerror(f.rawAddress)

public actual fun fflush(f: MutPtr<FILE>): CInt =
    WasiJniBridge.libcWasiFflush(f.rawAddress)

public actual fun clearerr(f: MutPtr<FILE>) {
    WasiJniBridge.libcWasiClearerr(f.rawAddress)
}

public actual fun fseek(f: MutPtr<FILE>, b: CLong, c: CInt): CInt =
    WasiJniBridge.libcWasiFseek(f.rawAddress, b, c)

public actual fun ftell(f: MutPtr<FILE>): CLong =
    WasiJniBridge.libcWasiFtell(f.rawAddress)

public actual fun rewind(f: MutPtr<FILE>) {
    WasiJniBridge.libcWasiRewind(f.rawAddress)
}

public actual fun fgetpos(f: MutPtr<FILE>, pos: MutPtr<FposT>): CInt =
    WasiJniBridge.libcWasiFgetpos(f.rawAddress, pos.rawAddress)

public actual fun fsetpos(f: MutPtr<FILE>, pos: ConstPtr<FposT>): CInt =
    WasiJniBridge.libcWasiFsetpos(f.rawAddress, pos.rawAddress)

public actual fun fread(buf: MutPtr<CVoid>, a: SizeT, b: SizeT, f: MutPtr<FILE>): SizeT =
    WasiJniBridge.libcWasiFread(buf.rawAddress, a.toLong(), b.toLong(), f.rawAddress).toULong()

public actual fun fwrite(buf: ConstPtr<CVoid>, a: SizeT, b: SizeT, f: MutPtr<FILE>): SizeT =
    WasiJniBridge.libcWasiFwrite(buf.rawAddress, a.toLong(), b.toLong(), f.rawAddress).toULong()

public actual fun fgetc(f: MutPtr<FILE>): CInt =
    WasiJniBridge.libcWasiFgetc(f.rawAddress)

public actual fun getc(f: MutPtr<FILE>): CInt =
    WasiJniBridge.libcWasiGetc(f.rawAddress)

public actual fun getchar(): CInt =
    WasiJniBridge.libcWasiGetchar()

public actual fun ungetc(a: CInt, f: MutPtr<FILE>): CInt =
    WasiJniBridge.libcWasiUngetc(a, f.rawAddress)

public actual fun fputc(a: CInt, f: MutPtr<FILE>): CInt =
    WasiJniBridge.libcWasiFputc(a, f.rawAddress)

public actual fun putc(a: CInt, f: MutPtr<FILE>): CInt =
    WasiJniBridge.libcWasiPutc(a, f.rawAddress)

public actual fun putchar(a: CInt): CInt =
    WasiJniBridge.libcWasiPutchar(a)

public actual fun fputs(a: ConstPtr<CChar>, f: MutPtr<FILE>): CInt =
    WasiJniBridge.libcWasiFputs(a.rawAddress, f.rawAddress)

public actual fun puts(a: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiPuts(a.rawAddress)

public actual fun perror(a: ConstPtr<CChar>) {
    WasiJniBridge.libcWasiPerror(a.rawAddress)
}

public actual fun srand(a: CUint) {
    WasiJniBridge.libcWasiSrand(a.toInt())
}

public actual fun atexit(a: AtexitACallback): CInt =
    WasiJniBridge.libcWasiAtexit(0L)

public actual fun atQuickExit(a: AtexitACallback): CInt =
    WasiJniBridge.libcWasiAtQuickExit(0L)

public actual fun quickExit(a: CInt): Nothing {
    WasiJniBridge.libcWasiQuickExit(a)
    error("Unreachable noreturn C function quickExit")
}

public actual fun posixMemalign(a: MutPtr<MutPtr<CVoid>>, b: SizeT, c: SizeT): CInt =
    WasiJniBridge.libcWasiPosixMemalign(a.rawAddress, b.toLong(), c.toLong())

public actual fun randR(a: MutPtr<CUint>): CInt =
    WasiJniBridge.libcWasiRandR(a.rawAddress)

public actual fun random(): CLong =
    WasiJniBridge.libcWasiRandom()

public actual fun srandom(a: CUint) {
    WasiJniBridge.libcWasiSrandom(a.toInt())
}

public actual fun putenv(a: MutPtr<CChar>): CInt =
    WasiJniBridge.libcWasiPutenv(a.rawAddress)

public actual fun clock(): ClockT =
    WasiJniBridge.libcWasiClock()

public actual fun time(a: MutPtr<TimeT>): TimeT =
    WasiJniBridge.libcWasiTime(a.rawAddress)

public actual fun difftime(a: TimeT, b: TimeT): CDouble =
    WasiJniBridge.libcWasiDifftime(a, b)

public actual fun mktime(a: MutPtr<Tm>): TimeT =
    WasiJniBridge.libcWasiMktime(a.rawAddress)

public actual fun strftime(a: MutPtr<CChar>, b: SizeT, c: ConstPtr<CChar>, d: ConstPtr<Tm>): SizeT =
    WasiJniBridge.libcWasiStrftime(a.rawAddress, b.toLong(), c.rawAddress, d.rawAddress).toULong()

public actual fun gmtime(a: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(WasiJniBridge.libcWasiGmtime(a.rawAddress))

public actual fun gmtimeR(a: ConstPtr<TimeT>, b: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(WasiJniBridge.libcWasiGmtimeR(a.rawAddress, b.rawAddress))

public actual fun localtime(a: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(WasiJniBridge.libcWasiLocaltime(a.rawAddress))

public actual fun localtimeR(a: ConstPtr<TimeT>, b: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(WasiJniBridge.libcWasiLocaltimeR(a.rawAddress, b.rawAddress))

public actual fun asctimeR(a: ConstPtr<Tm>, b: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiAsctimeR(a.rawAddress, b.rawAddress))

public actual fun ctimeR(a: ConstPtr<TimeT>, b: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiCtimeR(a.rawAddress, b.rawAddress))

public actual fun nanosleep(a: ConstPtr<Timespec>, b: MutPtr<Timespec>): CInt =
    WasiJniBridge.libcWasiNanosleep(a.rawAddress, b.rawAddress)

public actual fun clockGetres(a: ClockidT, b: MutPtr<Timespec>): CInt =
    0

public actual fun clockGettime(a: ClockidT, b: MutPtr<Timespec>): CInt =
    0

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: ConstPtr<Timespec>, c: MutPtr<Timespec>): CInt =
    0

public actual fun isalnum(c: CInt): CInt =
    WasiJniBridge.libcWasiIsalnum(c)

public actual fun isalpha(c: CInt): CInt =
    WasiJniBridge.libcWasiIsalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    WasiJniBridge.libcWasiIscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    WasiJniBridge.libcWasiIsdigit(c)

public actual fun isgraph(c: CInt): CInt =
    WasiJniBridge.libcWasiIsgraph(c)

public actual fun islower(c: CInt): CInt =
    WasiJniBridge.libcWasiIslower(c)

public actual fun isprint(c: CInt): CInt =
    WasiJniBridge.libcWasiIsprint(c)

public actual fun ispunct(c: CInt): CInt =
    WasiJniBridge.libcWasiIspunct(c)

public actual fun isspace(c: CInt): CInt =
    WasiJniBridge.libcWasiIsspace(c)

public actual fun isupper(c: CInt): CInt =
    WasiJniBridge.libcWasiIsupper(c)

public actual fun isxdigit(c: CInt): CInt =
    WasiJniBridge.libcWasiIsxdigit(c)

public actual fun isblank(c: CInt): CInt =
    WasiJniBridge.libcWasiIsblank(c)

public actual fun tolower(c: CInt): CInt =
    WasiJniBridge.libcWasiTolower(c)

public actual fun toupper(c: CInt): CInt =
    WasiJniBridge.libcWasiToupper(c)

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    WasiJniBridge.libcWasiSetvbuf(stream.rawAddress, buffer.rawAddress, mode, size.toLong())

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>) {
    WasiJniBridge.libcWasiSetbuf(stream.rawAddress, buf.rawAddress)
}

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiFgets(buf.rawAddress, n, stream.rawAddress))

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    WasiJniBridge.libcWasiAtof(s.rawAddress)

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiAtoi(s.rawAddress)

public actual fun atol(s: ConstPtr<CChar>): CLong =
    WasiJniBridge.libcWasiAtol(s.rawAddress)

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    WasiJniBridge.libcWasiAtoll(s.rawAddress)

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    WasiJniBridge.libcWasiStrtod(s.rawAddress, endp.rawAddress)

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    WasiJniBridge.libcWasiStrtof(s.rawAddress, endp.rawAddress)

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    WasiJniBridge.libcWasiStrtol(s.rawAddress, endp.rawAddress, base)

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    WasiJniBridge.libcWasiStrtoll(s.rawAddress, endp.rawAddress, base)

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    WasiJniBridge.libcWasiStrtoul(s.rawAddress, endp.rawAddress, base).toULong()

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    WasiJniBridge.libcWasiStrtoull(s.rawAddress, endp.rawAddress, base).toULong()

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiStrcpy(dst.rawAddress, src.rawAddress))

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiStrncpy(dst.rawAddress, src.rawAddress, n.toLong()))

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiStrcat(s.rawAddress, ct.rawAddress))

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiStrncat(s.rawAddress, ct.rawAddress, n.toLong()))

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiStrcmp(cs.rawAddress, ct.rawAddress)

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    WasiJniBridge.libcWasiStrncmp(cs.rawAddress, ct.rawAddress, n.toLong())

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiStrcoll(cs.rawAddress, ct.rawAddress)

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiStrchr(cs.rawAddress, c))

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiStrrchr(cs.rawAddress, c))

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    WasiJniBridge.libcWasiStrspn(cs.rawAddress, ct.rawAddress).toULong()

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    WasiJniBridge.libcWasiStrcspn(cs.rawAddress, ct.rawAddress).toULong()

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiStrdup(cs.rawAddress))

public actual fun strndup(cs: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiStrndup(cs.rawAddress, n.toLong()))

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiStrpbrk(cs.rawAddress, ct.rawAddress))

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiStrstr(cs.rawAddress, ct.rawAddress))

public actual fun strcasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiStrcasecmp(s1.rawAddress, s2.rawAddress)

public actual fun strncasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt =
    WasiJniBridge.libcWasiStrncasecmp(s1.rawAddress, s2.rawAddress, n.toLong())

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    WasiJniBridge.libcWasiStrlen(cs.rawAddress).toULong()

public actual fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT =
    WasiJniBridge.libcWasiStrnlen(cs.rawAddress, maxlen.toLong()).toULong()

public actual fun strerror(n: CInt): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiStrerror(n))

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiStrtok(s.rawAddress, t.rawAddress))

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    WasiJniBridge.libcWasiStrxfrm(s.rawAddress, ct.rawAddress, n.toLong()).toULong()

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(WasiJniBridge.libcWasiMemchr(cx.rawAddress, c, n.toLong()))

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    WasiJniBridge.libcWasiMemcmp(cx.rawAddress, ct.rawAddress, n.toLong())

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(WasiJniBridge.libcWasiMemcpy(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(WasiJniBridge.libcWasiMemmove(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(WasiJniBridge.libcWasiMemset(dest.rawAddress, c, n.toLong()))

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    WasiJniBridge.libcWasiFprintf(stream.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    WasiJniBridge.libcWasiPrintf(format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    WasiJniBridge.libcWasiSnprintf(s.rawAddress, n.toLong(), format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    WasiJniBridge.libcWasiSprintf(s.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    WasiJniBridge.libcWasiFscanf(stream.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    WasiJniBridge.libcWasiScanf(format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    WasiJniBridge.libcWasiSscanf(s.rawAddress, format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getcharUnlocked(): CInt =
    WasiJniBridge.libcWasiGetcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    WasiJniBridge.libcWasiPutcharUnlocked(c)

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    WasiJniBridge.libcWasiShutdown(socket, how)

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    WasiJniBridge.libcWasiFstat(fildes, buf.rawAddress)

public actual fun mkdir(path: ConstPtr<CChar>, mode: ModeT): CInt =
    WasiJniBridge.libcWasiMkdir(path.rawAddress, mode.toInt())

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    WasiJniBridge.libcWasiStat(path.rawAddress, buf.rawAddress)

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(WasiJniBridge.libcWasiFdopen(fd, mode.rawAddress))

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    WasiJniBridge.libcWasiFileno(stream.rawAddress)

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    WasiJniBridge.libcWasiOpen(path.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(path: ConstPtr<CChar>, mode: ModeT): CInt =
    WasiJniBridge.libcWasiCreat(path.rawAddress, mode.toInt())

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    WasiJniBridge.libcWasiFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun opendir(dirname: ConstPtr<CChar>): MutPtr<DIR> =
    MutPtr(WasiJniBridge.libcWasiOpendir(dirname.rawAddress))

public actual fun fdopendir(fd: CInt): MutPtr<DIR> =
    MutPtr(WasiJniBridge.libcWasiFdopendir(fd))

public actual fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent> =
    MutPtr(WasiJniBridge.libcWasiReaddir(dirp.rawAddress))

public actual fun closedir(dirp: MutPtr<DIR>): CInt =
    WasiJniBridge.libcWasiClosedir(dirp.rawAddress)

public actual fun rewinddir(dirp: MutPtr<DIR>) {
    WasiJniBridge.libcWasiRewinddir(dirp.rawAddress)
}

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    WasiJniBridge.libcWasiDirfd(dirp.rawAddress)

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    WasiJniBridge.libcWasiSeekdir(dirp.rawAddress, loc)
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    WasiJniBridge.libcWasiTelldir(dirp.rawAddress)

public actual fun openat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    WasiJniBridge.libcWasiOpenat(dirfd, pathname.rawAddress, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    WasiJniBridge.libcWasiFstatat(dirfd, pathname.rawAddress, buf.rawAddress, flags)

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    WasiJniBridge.libcWasiLinkat(olddirfd, oldpath.rawAddress, newdirfd, newpath.rawAddress, flags)

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    WasiJniBridge.libcWasiMkdirat(dirfd, pathname.rawAddress, mode.toInt())

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsiz: SizeT): SsizeT =
    WasiJniBridge.libcWasiReadlinkat(dirfd, pathname.rawAddress, buf.rawAddress, bufsiz.toLong())

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiRenameat(olddirfd, oldpath.rawAddress, newdirfd, newpath.rawAddress)

public actual fun symlinkat(target: ConstPtr<CChar>, newdirfd: CInt, linkpath: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiSymlinkat(target.rawAddress, newdirfd, linkpath.rawAddress)

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt): CInt =
    WasiJniBridge.libcWasiUnlinkat(dirfd, pathname.rawAddress, flags)

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    WasiJniBridge.libcWasiAccess(path.rawAddress, amode)

public actual fun close(fd: CInt): CInt =
    WasiJniBridge.libcWasiClose(fd)

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    WasiJniBridge.libcWasiFpathconf(filedes, name)

public actual fun getopt(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstr: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiGetopt(argc, argv.rawAddress, optstr.rawAddress)

public actual fun isatty(fd: CInt): CInt =
    WasiJniBridge.libcWasiIsatty(fd)

public actual fun link(src: ConstPtr<CChar>, dst: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiLink(src.rawAddress, dst.rawAddress)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    WasiJniBridge.libcWasiLseek(fd, offset, whence)

public actual fun pathconf(path: ConstPtr<CChar>, name: CInt): CLong =
    WasiJniBridge.libcWasiPathconf(path.rawAddress, name)

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiRmdir(path.rawAddress)

public actual fun sleep(secs: CUint): CUint =
    WasiJniBridge.libcWasiSleep(secs.toInt()).toUInt()

public actual fun unlink(c: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiUnlink(c.rawAddress)

public actual fun pread(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    WasiJniBridge.libcWasiPread(fd, buf.rawAddress, count.toLong(), offset)

public actual fun pwrite(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    WasiJniBridge.libcWasiPwrite(fd, buf.rawAddress, count.toLong(), offset)

public actual fun lstat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    WasiJniBridge.libcWasiLstat(path.rawAddress, buf.rawAddress)

public actual fun fsync(fd: CInt): CInt =
    WasiJniBridge.libcWasiFsync(fd)

public actual fun fdatasync(fd: CInt): CInt =
    WasiJniBridge.libcWasiFdatasync(fd)

public actual fun symlink(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiSymlink(path1.rawAddress, path2.rawAddress)

public actual fun truncate(path: ConstPtr<CChar>, length: OffT): CInt =
    WasiJniBridge.libcWasiTruncate(path.rawAddress, length)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    WasiJniBridge.libcWasiFtruncate(fd, length)

public actual fun getrusage(resource: CInt, usage: MutPtr<Rusage>): CInt =
    WasiJniBridge.libcWasiGetrusage(resource, usage.rawAddress)

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    WasiJniBridge.libcWasiGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun times(buf: MutPtr<Tms>): ClockT =
    WasiJniBridge.libcWasiTimes(buf.rawAddress)

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    WasiJniBridge.libcWasiStrerrorR(errnum, buf.rawAddress, buflen.toLong())

public actual fun usleep(secs: CUint): CInt =
    WasiJniBridge.libcWasiUsleep(secs.toInt())

public actual fun send(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    WasiJniBridge.libcWasiSend(socket, buf.rawAddress, len.toLong(), flags)

public actual fun recv(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    WasiJniBridge.libcWasiRecv(socket, buf.rawAddress, len.toLong(), flags)

public actual fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: CInt): CInt =
    WasiJniBridge.libcWasiPoll(fds.rawAddress, nfds.toLong(), timeout)

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiSetlocale(category, locale.rawAddress))

public actual fun localeconv(): MutPtr<Lconv> =
    MutPtr(WasiJniBridge.libcWasiLocaleconv())

public actual fun readlink(path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsz: SizeT): SsizeT =
    WasiJniBridge.libcWasiReadlink(path.rawAddress, buf.rawAddress, bufsz.toLong())

public actual fun timegm(tm: MutPtr<Tm>): TimeT =
    WasiJniBridge.libcWasiTimegm(tm.rawAddress)

public actual fun sysconf(name: CInt): CLong =
    WasiJniBridge.libcWasiSysconf(name)

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    WasiJniBridge.libcWasiIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt =
    WasiJniBridge.libcWasiFseeko(stream.rawAddress, offset, whence)

public actual fun ftello(stream: MutPtr<FILE>): OffT =
    WasiJniBridge.libcWasiFtello(stream.rawAddress)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    WasiJniBridge.libcWasiPosixFallocate(fd, offset, len)

public actual fun strcasestr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiStrcasestr(cs.rawAddress, ct.rawAddress))

public actual fun getline(lineptr: MutPtr<MutPtr<CChar>>, n: MutPtr<SizeT>, stream: MutPtr<FILE>): SsizeT =
    WasiJniBridge.libcWasiGetline(lineptr.rawAddress, n.rawAddress, stream.rawAddress)

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    WasiJniBridge.libcWasiFaccessat(dirfd, pathname.rawAddress, mode, flags)

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    WasiJniBridge.libcWasiWritev(fd, iov.rawAddress, iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    WasiJniBridge.libcWasiReadv(fd, iov.rawAddress, iovcnt)

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    WasiJniBridge.libcWasiPwritev(fd, iov.rawAddress, iovcnt, offset)

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    WasiJniBridge.libcWasiPreadv(fd, iov.rawAddress, iovcnt, offset)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    WasiJniBridge.libcWasiPosixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    WasiJniBridge.libcWasiFutimens(fd, times.rawAddress)

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    WasiJniBridge.libcWasiUtimensat(dirfd, path.rawAddress, times.rawAddress, flag)

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    WasiJniBridge.libcWasiGetentropy(buf.rawAddress, buflen.toLong())

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(WasiJniBridge.libcWasiMemrchr(cx.rawAddress, c, n.toLong()))

public actual fun abs(i: CInt): CInt =
    WasiJniBridge.libcWasiAbs(i)

public actual fun labs(i: CLong): CLong =
    WasiJniBridge.libcWasiLabs(i)

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(WasiJniBridge.libcWasiDuplocale(base.rawAddress))

public actual fun freelocale(loc: LocaleT) {
    WasiJniBridge.libcWasiFreelocale(loc.rawAddress)
}

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    MutPtr(WasiJniBridge.libcWasiNewlocale(mask, locale.rawAddress, base.rawAddress))

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(WasiJniBridge.libcWasiUselocale(loc.rawAddress))

public actual fun schedYield(): CInt =
    WasiJniBridge.libcWasiSchedYield()

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiGetcwd(buf.rawAddress, size.toLong()))

public actual fun chdir(dir: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiChdir(dir.rawAddress)

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiNlLanginfo(item))

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiNlLanginfoL(item, loc.rawAddress))

public actual fun select(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: ConstPtr<Timeval>): CInt =
    WasiJniBridge.libcWasiSelect(nfds, readfds.rawAddress, writefds.rawAddress, errorfds.rawAddress, timeout.rawAddress)

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiWasilibcRegisterPreopenedFd(fd, path.rawAddress)

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    WasiJniBridge.libcWasiWasilibcFdRenumber(fd, newfd)

public actual fun wasilibcUnlinkat(fd: CInt, path: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiWasilibcUnlinkat(fd, path.rawAddress)

public actual fun wasilibcRmdirat(fd: CInt, path: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiWasilibcRmdirat(fd, path.rawAddress)

public actual fun wasilibcFindRelpath(path: ConstPtr<CChar>, absPrefix: MutPtr<ConstPtr<CChar>>, relativePath: MutPtr<MutPtr<CChar>>, relativePathLen: ULong): CInt =
    WasiJniBridge.libcWasiWasilibcFindRelpath(path.rawAddress, absPrefix.rawAddress, relativePath.rawAddress, relativePathLen.toLong())

public actual fun wasilibcTell(fd: CInt): OffT =
    WasiJniBridge.libcWasiWasilibcTell(fd)

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiWasilibcNocwdWasilibcUnlinkat(dirfd, path.rawAddress)

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiWasilibcNocwdWasilibcRmdirat(dirfd, path.rawAddress)

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    WasiJniBridge.libcWasiWasilibcNocwdLinkat(olddirfd, oldpath.rawAddress, newdirfd, newpath.rawAddress, flags)

public actual fun wasilibcNocwdSymlinkat(target: ConstPtr<CChar>, dirfd: CInt, path: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiWasilibcNocwdSymlinkat(target.rawAddress, dirfd, path.rawAddress)

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsize: ULong): Long =
    WasiJniBridge.libcWasiWasilibcNocwdReadlinkat(dirfd, path.rawAddress, buf.rawAddress, bufsize.toLong())

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    WasiJniBridge.libcWasiWasilibcNocwdFaccessat(dirfd, path.rawAddress, mode, flags)

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiWasilibcNocwdRenameat(olddirfd, oldpath.rawAddress, newdirfd, newpath.rawAddress)

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: ConstPtr<CChar>, flags: CInt): CInt =
    WasiJniBridge.libcWasiWasilibcNocwdOpenatNomode(dirfd, path.rawAddress, flags)

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    WasiJniBridge.libcWasiWasilibcNocwdFstatat(dirfd, path.rawAddress, buf.rawAddress, flags)

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiWasilibcNocwdMkdiratNomode(dirfd, path.rawAddress)

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flags: CInt): CInt =
    WasiJniBridge.libcWasiWasilibcNocwdUtimensat(dirfd, path.rawAddress, times.rawAddress, flags)

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: ConstPtr<CChar>): MutPtr<DIR> =
    MutPtr(WasiJniBridge.libcWasiWasilibcNocwdOpendirat(dirfd, path.rawAddress))

public actual fun wasilibcAccess(pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    WasiJniBridge.libcWasiWasilibcAccess(pathname.rawAddress, mode, flags)

public actual fun wasilibcStat(pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    WasiJniBridge.libcWasiWasilibcStat(pathname.rawAddress, buf.rawAddress, flags)

public actual fun wasilibcUtimens(pathname: ConstPtr<CChar>, times: ConstPtr<Timespec>, flags: CInt): CInt =
    WasiJniBridge.libcWasiWasilibcUtimens(pathname.rawAddress, times.rawAddress, flags)

public actual fun wasilibcLink(oldpath: ConstPtr<CChar>, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    WasiJniBridge.libcWasiWasilibcLink(oldpath.rawAddress, newpath.rawAddress, flags)

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    WasiJniBridge.libcWasiWasilibcLinkOldat(olddirfd, oldpath.rawAddress, newpath.rawAddress, flags)

public actual fun wasilibcLinkNewat(oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    WasiJniBridge.libcWasiWasilibcLinkNewat(oldpath.rawAddress, newdirfd, newpath.rawAddress, flags)

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newpath: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiWasilibcRenameOldat(olddirfd, oldpath.rawAddress, newpath.rawAddress)

public actual fun wasilibcRenameNewat(oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    WasiJniBridge.libcWasiWasilibcRenameNewat(oldpath.rawAddress, newdirfd, newpath.rawAddress)

public actual fun arc4random(): UInt =
    WasiJniBridge.libcWasiArc4random().toUInt()

public actual fun arc4randomBuf(a: MutPtr<CVoid>, b: SizeT) {
    WasiJniBridge.libcWasiArc4randomBuf(a.rawAddress, b.toLong())
}

public actual fun arc4randomUniform(a: UInt): UInt =
    WasiJniBridge.libcWasiArc4randomUniform(a.toInt()).toUInt()

public actual fun errnoLocation(): MutPtr<CInt> =
    MutPtr(WasiJniBridge.libcWasiErrnoLocation())

public actual fun chmod(path: ConstPtr<CChar>, mode: ModeT): CInt =
    WasiJniBridge.libcWasiChmod(path.rawAddress, mode.toInt())

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    WasiJniBridge.libcWasiFchmod(fd, mode.toInt())

public actual fun realpath(pathname: ConstPtr<CChar>, resolved: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(WasiJniBridge.libcWasiRealpath(pathname.rawAddress, resolved.rawAddress))

public actual fun pthreadSelf(): PthreadT =
    MutPtr(WasiJniBridge.libcWasiPthreadSelf())

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    WasiJniBridge.libcWasiPthreadCreate(native.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    WasiJniBridge.libcWasiPthreadEqual(t1.rawAddress, t2.rawAddress)

public actual fun pthreadJoin(native: PthreadT, value: MutPtr<MutPtr<CVoid>>): CInt =
    WasiJniBridge.libcWasiPthreadJoin(native.rawAddress, value.rawAddress)

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    WasiJniBridge.libcWasiPthreadAttrInit(attr.rawAddress)

public actual fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt =
    WasiJniBridge.libcWasiPthreadAttrDestroy(attr.rawAddress)

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, stacksize: MutPtr<SizeT>): CInt =
    WasiJniBridge.libcWasiPthreadAttrGetstacksize(attr.rawAddress, stacksize.rawAddress)

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stackSize: SizeT): CInt =
    WasiJniBridge.libcWasiPthreadAttrSetstacksize(attr.rawAddress, stackSize.toLong())

public actual fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, state: CInt): CInt =
    WasiJniBridge.libcWasiPthreadAttrSetdetachstate(attr.rawAddress, state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    WasiJniBridge.libcWasiPthreadDetach(thread.rawAddress)

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt =
    WasiJniBridge.libcWasiPthreadKeyCreate(key.rawAddress, 0L)

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    WasiJniBridge.libcWasiPthreadKeyDelete(key.toInt())

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    MutPtr(WasiJniBridge.libcWasiPthreadGetspecific(key.toInt()))

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    WasiJniBridge.libcWasiPthreadSetspecific(key.toInt(), value.rawAddress)

public actual fun pthreadMutexInit(lock: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    WasiJniBridge.libcWasiPthreadMutexInit(lock.rawAddress, attr.rawAddress)

public actual fun pthreadMutexDestroy(lock: MutPtr<PthreadMutexT>): CInt =
    WasiJniBridge.libcWasiPthreadMutexDestroy(lock.rawAddress)

public actual fun pthreadMutexLock(lock: MutPtr<PthreadMutexT>): CInt =
    WasiJniBridge.libcWasiPthreadMutexLock(lock.rawAddress)

public actual fun pthreadMutexTrylock(lock: MutPtr<PthreadMutexT>): CInt =
    WasiJniBridge.libcWasiPthreadMutexTrylock(lock.rawAddress)

public actual fun pthreadMutexUnlock(lock: MutPtr<PthreadMutexT>): CInt =
    WasiJniBridge.libcWasiPthreadMutexUnlock(lock.rawAddress)

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    WasiJniBridge.libcWasiPthreadMutexattrInit(attr.rawAddress)

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    WasiJniBridge.libcWasiPthreadMutexattrDestroy(attr.rawAddress)

public actual fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, type: CInt): CInt =
    WasiJniBridge.libcWasiPthreadMutexattrSettype(attr.rawAddress, type)

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    WasiJniBridge.libcWasiPthreadCondInit(cond.rawAddress, attr.rawAddress)

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>): CInt =
    WasiJniBridge.libcWasiPthreadCondWait(cond.rawAddress, lock.rawAddress)

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    WasiJniBridge.libcWasiPthreadCondTimedwait(cond.rawAddress, lock.rawAddress, abstime.rawAddress)

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    WasiJniBridge.libcWasiPthreadCondSignal(cond.rawAddress)

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    WasiJniBridge.libcWasiPthreadCondBroadcast(cond.rawAddress)

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    WasiJniBridge.libcWasiPthreadCondDestroy(cond.rawAddress)

public actual fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt =
    WasiJniBridge.libcWasiPthreadCondattrInit(attr.rawAddress)

public actual fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt =
    WasiJniBridge.libcWasiPthreadCondattrDestroy(attr.rawAddress)

public actual fun pthreadRwlockInit(lock: MutPtr<PthreadRwlockT>, attr: ConstPtr<PthreadRwlockattrT>): CInt =
    WasiJniBridge.libcWasiPthreadRwlockInit(lock.rawAddress, attr.rawAddress)

public actual fun pthreadRwlockDestroy(lock: MutPtr<PthreadRwlockT>): CInt =
    WasiJniBridge.libcWasiPthreadRwlockDestroy(lock.rawAddress)

public actual fun pthreadRwlockRdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    WasiJniBridge.libcWasiPthreadRwlockRdlock(lock.rawAddress)

public actual fun pthreadRwlockTryrdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    WasiJniBridge.libcWasiPthreadRwlockTryrdlock(lock.rawAddress)

public actual fun pthreadRwlockWrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    WasiJniBridge.libcWasiPthreadRwlockWrlock(lock.rawAddress)

public actual fun pthreadRwlockTrywrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    WasiJniBridge.libcWasiPthreadRwlockTrywrlock(lock.rawAddress)

public actual fun pthreadRwlockUnlock(lock: MutPtr<PthreadRwlockT>): CInt =
    WasiJniBridge.libcWasiPthreadRwlockUnlock(lock.rawAddress)

public actual fun pthreadRwlockattrInit(attr: MutPtr<PthreadRwlockattrT>): CInt =
    WasiJniBridge.libcWasiPthreadRwlockattrInit(attr.rawAddress)

public actual fun pthreadRwlockattrDestroy(attr: MutPtr<PthreadRwlockattrT>): CInt =
    WasiJniBridge.libcWasiPthreadRwlockattrDestroy(attr.rawAddress)
