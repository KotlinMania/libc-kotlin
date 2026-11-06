package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.COpaquePointer

internal object GnuModRawLibc {
    external fun fgetspentR(fp: Long, spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int
    external fun sgetspentR(s: String?, spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int
    external fun getspentR(spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int
    external fun qsortR(base: Long, num: Long, size: Long, compar: Long, arg: Long)
    external fun sendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int
    external fun recvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int
    external fun getrlimit64(resource: Long, rlim: Long): Int
    external fun setrlimit64(resource: Long, rlim: Long): Int
    external fun getrlimit(resource: Long, rlim: Long): Int
    external fun setrlimit(resource: Long, rlim: Long): Int
    external fun prlimit(pid: Int, resource: Long, newLimit: Long, oldLimit: Long): Int
    external fun prlimit64(pid: Int, resource: Long, newLimit: Long, oldLimit: Long): Int
    external fun utmpname(file: String?): Int
    external fun utmpxname(file: String?): Int
    external fun getutxent(): Long?
    external fun getutxid(ut: Long): Long?
    external fun getutxline(ut: Long): Long?
    external fun pututxline(ut: Long): Long?
    external fun setutxent()
    external fun endutxent()
    external fun getpt(): Int
    external fun mallopt(param: Int, value: Int): Int
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun getentropy(buf: Long, buflen: Long): Int
    external fun getrandom(buf: Long, buflen: Long, flags: Int): Long
    external fun getauxval(type: Long): Long
    external fun adjtimex(buf: Long): Int
    external fun ntpAdjtime(buf: Long): Int
    external fun ntpGettime(buf: Long): Int
    external fun clockAdjtime(clkId: Int, buf: Long): Int
    external fun fanotifyMark(fd: Int, flags: Int, mask: Long, dirfd: Int, path: String?): Int
    external fun preadv2(fd: Int, iov: Long, iovcnt: Int, offset: Long, flags: Int): Long
    external fun pwritev2(fd: Int, iov: Long, iovcnt: Int, offset: Long, flags: Int): Long
    external fun preadv64v2(fd: Int, iov: Long, iovcnt: Int, offset: Long, flags: Int): Long
    external fun pwritev64v2(fd: Int, iov: Long, iovcnt: Int, offset: Long, flags: Int): Long
    external fun renameat2(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int
    external fun explicitBzero(s: Long, len: Long)
    external fun reallocarray(ptr: Long, nmemb: Long, size: Long): Long?
    external fun ctermid(s: Long): Long?
    external fun backtrace(buf: Long, sz: Int): Int
    external fun backtraceSymbols(buffer: Long, len: Int): Long?
    external fun backtraceSymbolsFd(buffer: Long, len: Int, fd: Int)
    external fun glob64(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int
    external fun globfree64(pglob: Long)
    external fun pthreadAttrGetaffinityNp(attr: Long, cpusetsize: Long, cpuset: Long): Int
    external fun pthreadAttrSetaffinityNp(attr: Long, cpusetsize: Long, cpuset: Long): Int
    external fun getpriority(which: Long, who: Long): Int
    external fun setpriority(which: Long, who: Long, prio: Int): Int
    external fun pthreadRwlockattrGetkindNp(attr: Long, value: Long): Int
    external fun pthreadRwlockattrSetkindNp(attr: Long, value: Int): Int
    external fun pthreadSigqueue(thread: Long, sig: Int, value: Long): Int
    external fun pthreadTryjoinNp(thread: Long, retval: Long): Int
    external fun pthreadTimedjoinNp(thread: Long, retval: Long, abstime: Long): Int
    external fun mallinfo(): Long
    external fun mallinfo2(): Long
    external fun mallocStats()
    external fun mallocInfo(options: Int, stream: Long): Int
    external fun mallocUsableSize(ptr: Long): Long
    external fun getpwentR(pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getgrentR(grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun fgetpwentR(stream: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun fgetgrentR(stream: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun putpwent(p: Long, stream: Long): Int
    external fun putgrent(grp: Long, stream: Long): Int
    external fun sethostid(hostid: Long): Int
    external fun memfdCreate(name: String?, flags: Int): Int
    external fun mlock2(addr: Long, len: Long, flags: Int): Int
    external fun euidaccess(pathname: String?, mode: Int): Int
    external fun eaccess(pathname: String?, mode: Int): Int
    external fun asctimeR(tm: Long, buf: Long): Long?
    external fun ctimeR(timep: Long, buf: Long): Long?
    external fun dirname(path: Long): Long?
    external fun posixBasename(path: Long): Long?
    external fun gnuBasename(path: String?): Long?
    external fun dlmopen(lmid: Long, filename: String?, flag: Int): Long?
    external fun dlinfo(handle: Long, request: Int, info: Long): Int
    external fun dladdr1(addr: Long, info: Long, extraInfo: Long, flags: Int): Int
    external fun dlvsym(handle: Long, symbol: String?, version: String?): Long?
    external fun mallocTrim(pad: Long): Int
    external fun gnuGetLibcRelease(): Long?
    external fun gnuGetLibcVersion(): Long?
    external fun posixSpawnFileActionsAddchdirNp(actions: Long, path: String?): Int
    external fun posixSpawnFileActionsAddfchdirNp(actions: Long, fd: Int): Int
    external fun posixSpawnFileActionsAddclosefromNp(actions: Long, from: Int): Int
    external fun posixSpawnFileActionsAddtcsetpgrpNp(actions: Long, tcfd: Int): Int
    external fun getmntentR(stream: Long, mntbuf: Long, buf: Long, buflen: Int): Long?
    external fun execveat(dirfd: Int, pathname: String?, argv: Long, envp: Long, flags: Int): Int
    external fun closeRange(first: Int, last: Int, flags: Int): Int
    external fun mqNotify(mqdes: Long, sevp: Long): Int
    external fun epollPwait2(epfd: Int, events: Long, maxevents: Int, timeout: Long, sigmask: Long): Int
    external fun mempcpy(dest: Long, src: Long, n: Long): Long?
    external fun tgkill(tgid: Int, tid: Int, sig: Int): Int
    external fun strcasecmp(s1: String?, s2: String?): Int
    external fun strncasecmp(s1: String?, s2: String?, n: Long): Int
    external fun wmemchr(cx: Long, c: Int, n: Long): Long?
}

public actual fun fgetspentR(fp: FILE?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    GnuModRawLibc.fgetspentR(fp?.toLong() ?: 0L, spbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen, spbufp?.value ?: 0L)

public actual fun sgetspentR(s: String?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    GnuModRawLibc.sgetspentR(s, spbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen, spbufp?.value ?: 0L)

public actual fun getspentR(spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    GnuModRawLibc.getspentR(spbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen, spbufp?.value ?: 0L)

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    GnuModRawLibc.qsortR(base?.value ?: 0L, num, size, compar?.toLong() ?: 0L, arg?.value ?: 0L)
}

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt =
    GnuModRawLibc.sendmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: io.github.kotlinmania.libc.Timespec?): CInt =
    GnuModRawLibc.recvmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)

public actual fun getrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt =
    GnuModRawLibc.getrlimit64(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt =
    GnuModRawLibc.setrlimit64(resource, rlim?.toLong() ?: 0L)

public actual fun getrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    GnuModRawLibc.getrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    GnuModRawLibc.setrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun prlimit(pid: PidT, resource: io.github.kotlinmania.libc.RlimitResourceT, newLimit: Rlimit?, oldLimit: Rlimit?): CInt =
    GnuModRawLibc.prlimit(pid, resource, newLimit?.toLong() ?: 0L, oldLimit?.toLong() ?: 0L)

public actual fun prlimit64(pid: PidT, resource: io.github.kotlinmania.libc.RlimitResourceT, newLimit: Rlimit64?, oldLimit: Rlimit64?): CInt =
    GnuModRawLibc.prlimit64(pid, resource, newLimit?.toLong() ?: 0L, oldLimit?.toLong() ?: 0L)

public actual fun utmpname(file: String?): CInt =
    GnuModRawLibc.utmpname(file)

public actual fun utmpxname(file: String?): CInt =
    GnuModRawLibc.utmpxname(file)

public actual fun getutxent(): Utmpx? =
    GnuModRawLibc.getutxent()

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    GnuModRawLibc.getutxid(ut?.toLong() ?: 0L)

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    GnuModRawLibc.getutxline(ut?.toLong() ?: 0L)

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    GnuModRawLibc.pututxline(ut?.toLong() ?: 0L)

public actual fun setutxent() {
    GnuModRawLibc.setutxent()
}

public actual fun endutxent() {
    GnuModRawLibc.endutxent()
}

public actual fun getpt(): CInt =
    GnuModRawLibc.getpt()

public actual fun mallopt(param: CInt, value: CInt): CInt =
    GnuModRawLibc.mallopt(param, value)

public actual fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: Timezone?): CInt =
    GnuModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.toLong() ?: 0L)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    GnuModRawLibc.getentropy(buf?.value ?: 0L, buflen)

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    GnuModRawLibc.getrandom(buf?.value ?: 0L, buflen, flags)

public actual fun getauxval(type: CUlong): CUlong =
    GnuModRawLibc.getauxval(type)

public actual fun adjtimex(buf: Timex?): CInt =
    GnuModRawLibc.adjtimex(buf?.toLong() ?: 0L)

public actual fun ntpAdjtime(buf: Timex?): CInt =
    GnuModRawLibc.ntpAdjtime(buf?.toLong() ?: 0L)

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    GnuModRawLibc.ntpGettime(buf?.toLong() ?: 0L)

public actual fun clockAdjtime(clkId: ClockidT, buf: Timex?): CInt =
    GnuModRawLibc.clockAdjtime(clkId, buf?.toLong() ?: 0L)

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt =
    GnuModRawLibc.fanotifyMark(fd, flags, mask, dirfd, path)

public actual fun preadv2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    GnuModRawLibc.preadv2(fd, iov?.toLong() ?: 0L, iovcnt, offset, flags)

public actual fun pwritev2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    GnuModRawLibc.pwritev2(fd, iov?.toLong() ?: 0L, iovcnt, offset, flags)

public actual fun preadv64v2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    GnuModRawLibc.preadv64v2(fd, iov?.toLong() ?: 0L, iovcnt, offset, flags)

public actual fun pwritev64v2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    GnuModRawLibc.pwritev64v2(fd, iov?.toLong() ?: 0L, iovcnt, offset, flags)

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    GnuModRawLibc.renameat2(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    GnuModRawLibc.explicitBzero(s?.value ?: 0L, len)
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    GnuModRawLibc.reallocarray(ptr?.value ?: 0L, nmemb, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    GnuModRawLibc.ctermid(s?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    GnuModRawLibc.backtrace(buf?.value ?: 0L, sz)

public actual fun backtraceSymbols(buffer: COpaquePointer?, len: CInt): COpaquePointer? =
    GnuModRawLibc.backtraceSymbols(buffer?.value ?: 0L, len).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, len: CInt, fd: CInt) {
    GnuModRawLibc.backtraceSymbolsFd(buffer?.value ?: 0L, len, fd)
}

public actual fun glob64(pattern: String?, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: Glob64T?): CInt =
    GnuModRawLibc.glob64(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)

public actual fun globfree64(pglob: Glob64T?) {
    GnuModRawLibc.globfree64(pglob?.toLong() ?: 0L)
}

public actual fun pthreadAttrGetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    GnuModRawLibc.pthreadAttrGetaffinityNp(attr?.toLong() ?: 0L, cpusetsize, cpuset?.toLong() ?: 0L)

public actual fun pthreadAttrSetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    GnuModRawLibc.pthreadAttrSetaffinityNp(attr?.toLong() ?: 0L, cpusetsize, cpuset?.toLong() ?: 0L)

public actual fun getpriority(which: io.github.kotlinmania.libc.PriorityWhichT, who: IdT): CInt =
    GnuModRawLibc.getpriority(which, who)

public actual fun setpriority(which: io.github.kotlinmania.libc.PriorityWhichT, who: IdT, prio: CInt): CInt =
    GnuModRawLibc.setpriority(which, who, prio)

public actual fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT?, value: CInt?): CInt =
    GnuModRawLibc.pthreadRwlockattrGetkindNp(attr?.toLong() ?: 0L, value?.toLong() ?: 0L)

public actual fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT?, value: CInt): CInt =
    GnuModRawLibc.pthreadRwlockattrSetkindNp(attr?.toLong() ?: 0L, value)

public actual fun pthreadSigqueue(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt, value: Sigval): CInt =
    GnuModRawLibc.pthreadSigqueue(thread, sig, value)

public actual fun pthreadTryjoinNp(thread: io.github.kotlinmania.libc.PthreadT, retval: COpaquePointer?): CInt =
    GnuModRawLibc.pthreadTryjoinNp(thread, retval?.value ?: 0L)

public actual fun pthreadTimedjoinNp(thread: io.github.kotlinmania.libc.PthreadT, retval: COpaquePointer?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    GnuModRawLibc.pthreadTimedjoinNp(thread, retval?.value ?: 0L, abstime?.toLong() ?: 0L)

public actual fun mallinfo(): io.github.kotlinmania.libc.Mallinfo =
    GnuModRawLibc.mallinfo()

public actual fun mallinfo2(): io.github.kotlinmania.libc.Mallinfo2 =
    GnuModRawLibc.mallinfo2()

public actual fun mallocStats() {
    GnuModRawLibc.mallocStats()
}

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    GnuModRawLibc.mallocInfo(options, stream?.toLong() ?: 0L)

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    GnuModRawLibc.mallocUsableSize(ptr?.value ?: 0L)

public actual fun getpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    GnuModRawLibc.getpwentR(pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    GnuModRawLibc.getgrentR(grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun fgetpwentR(stream: FILE?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    GnuModRawLibc.fgetpwentR(stream?.toLong() ?: 0L, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun fgetgrentR(stream: FILE?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    GnuModRawLibc.fgetgrentR(stream?.toLong() ?: 0L, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun putpwent(p: Passwd?, stream: FILE?): CInt =
    GnuModRawLibc.putpwent(p?.toLong() ?: 0L, stream?.toLong() ?: 0L)

public actual fun putgrent(grp: Group?, stream: FILE?): CInt =
    GnuModRawLibc.putgrent(grp?.toLong() ?: 0L, stream?.toLong() ?: 0L)

public actual fun sethostid(hostid: CLong): CInt =
    GnuModRawLibc.sethostid(hostid)

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    GnuModRawLibc.memfdCreate(name, flags)

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt =
    GnuModRawLibc.mlock2(addr?.value ?: 0L, len, flags)

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    GnuModRawLibc.euidaccess(pathname, mode)

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    GnuModRawLibc.eaccess(pathname, mode)

public actual fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer? =
    GnuModRawLibc.asctimeR(tm?.toLong() ?: 0L, buf?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(timep: TimeT?, buf: COpaquePointer?): COpaquePointer? =
    GnuModRawLibc.ctimeR(timep?.toLong() ?: 0L, buf?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    GnuModRawLibc.dirname(path?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixBasename(path: COpaquePointer?): COpaquePointer? =
    GnuModRawLibc.posixBasename(path?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gnuBasename(path: String?): COpaquePointer? =
    GnuModRawLibc.gnuBasename(path).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    GnuModRawLibc.dlmopen(lmid, filename, flag).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    GnuModRawLibc.dlinfo(handle?.value ?: 0L, request, info?.value ?: 0L)

public actual fun dladdr1(addr: COpaquePointer?, info: DlInfo?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    GnuModRawLibc.dladdr1(addr?.value ?: 0L, info?.toLong() ?: 0L, extraInfo?.value ?: 0L, flags)

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    GnuModRawLibc.dlvsym(handle?.value ?: 0L, symbol, version).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocTrim(pad: SizeT): CInt =
    GnuModRawLibc.mallocTrim(pad)

public actual fun gnuGetLibcRelease(): COpaquePointer? =
    GnuModRawLibc.gnuGetLibcRelease().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gnuGetLibcVersion(): COpaquePointer? =
    GnuModRawLibc.gnuGetLibcVersion().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT?, path: String?): CInt =
    GnuModRawLibc.posixSpawnFileActionsAddchdirNp(actions?.toLong() ?: 0L, path)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    GnuModRawLibc.posixSpawnFileActionsAddfchdirNp(actions?.toLong() ?: 0L, fd)

public actual fun posixSpawnFileActionsAddclosefromNp(actions: PosixSpawnFileActionsT?, from: CInt): CInt =
    GnuModRawLibc.posixSpawnFileActionsAddclosefromNp(actions?.toLong() ?: 0L, from)

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: PosixSpawnFileActionsT?, tcfd: CInt): CInt =
    GnuModRawLibc.posixSpawnFileActionsAddtcsetpgrpNp(actions?.toLong() ?: 0L, tcfd)

public actual fun getmntentR(stream: FILE?, mntbuf: Mntent?, buf: COpaquePointer?, buflen: CInt): Mntent? =
    GnuModRawLibc.getmntentR(stream?.toLong() ?: 0L, mntbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen)

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    GnuModRawLibc.execveat(dirfd, pathname, argv?.value ?: 0L, envp?.value ?: 0L, flags)

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    GnuModRawLibc.closeRange(first, last, flags)

public actual fun mqNotify(mqdes: MqdT, sevp: Sigevent?): CInt =
    GnuModRawLibc.mqNotify(mqdes, sevp?.toLong() ?: 0L)

public actual fun epollPwait2(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: io.github.kotlinmania.libc.Timespec?, sigmask: SigsetT?): CInt =
    GnuModRawLibc.epollPwait2(epfd, events?.toLong() ?: 0L, maxevents, timeout?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)

public actual fun mempcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    GnuModRawLibc.mempcpy(dest?.value ?: 0L, src?.value ?: 0L, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    GnuModRawLibc.tgkill(tgid, tid, sig)

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    GnuModRawLibc.strcasecmp(s1, s2)

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    GnuModRawLibc.strncasecmp(s1, s2, n)

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: SizeT): WcharT? =
    GnuModRawLibc.wmemchr(cx?.toLong() ?: 0L, c, n)
