package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.COpaquePointer

public actual fun fgetspentR(fp: FILE?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetspentR(fp?.toLong() ?: 0L, spbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen, spbufp?.value ?: 0L)") as CInt

public actual fun sgetspentR(s: String?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sgetspentR(s, spbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen, spbufp?.value ?: 0L)") as CInt

public actual fun getspentR(spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getspentR(spbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen, spbufp?.value ?: 0L)") as CInt

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').qsortR(base?.value ?: 0L, num, size, compar?.toLong() ?: 0L, arg?.value ?: 0L)")
}

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sendmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags)") as CInt

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').recvmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)") as CInt

public actual fun getrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit64(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun setrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit64(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun getrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun setrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun prlimit(pid: PidT, resource: io.github.kotlinmania.libc.RlimitResourceT, newLimit: Rlimit?, oldLimit: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').prlimit(pid, resource, newLimit?.toLong() ?: 0L, oldLimit?.toLong() ?: 0L)") as CInt

public actual fun prlimit64(pid: PidT, resource: io.github.kotlinmania.libc.RlimitResourceT, newLimit: Rlimit64?, oldLimit: Rlimit64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').prlimit64(pid, resource, newLimit?.toLong() ?: 0L, oldLimit?.toLong() ?: 0L)") as CInt

public actual fun utmpname(file: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').utmpname(file)") as CInt

public actual fun utmpxname(file: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').utmpxname(file)") as CInt

public actual fun getutxent(): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxent()") as Utmpx?

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxid(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxline(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').pututxline(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun setutxent() {
    js("require('@kotlinmania/libc-native-bindings').setutxent()")
}

public actual fun endutxent() {
    js("require('@kotlinmania/libc-native-bindings').endutxent()")
}

public actual fun getpt(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpt()") as CInt

public actual fun mallopt(param: CInt, value: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mallopt(param, value)") as CInt

public actual fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: Timezone?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.toLong() ?: 0L)") as CInt

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getentropy(buf?.value ?: 0L, buflen)") as CInt

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').getrandom(buf?.value ?: 0L, buflen, flags)") as SsizeT

public actual fun getauxval(type: CUlong): CUlong =
    js("require('@kotlinmania/libc-native-bindings').getauxval(type)") as CUlong

public actual fun adjtimex(buf: Timex?): CInt =
    js("require('@kotlinmania/libc-native-bindings').adjtimex(buf?.toLong() ?: 0L)") as CInt

public actual fun ntpAdjtime(buf: Timex?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ntpAdjtime(buf?.toLong() ?: 0L)") as CInt

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ntpGettime(buf?.toLong() ?: 0L)") as CInt

public actual fun clockAdjtime(clkId: ClockidT, buf: Timex?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockAdjtime(clkId, buf?.toLong() ?: 0L)") as CInt

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fanotifyMark(fd, flags, mask, dirfd, path)") as CInt

public actual fun preadv2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv2(fd, iov?.toLong() ?: 0L, iovcnt, offset, flags)") as SsizeT

public actual fun pwritev2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev2(fd, iov?.toLong() ?: 0L, iovcnt, offset, flags)") as SsizeT

public actual fun preadv64v2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv64v2(fd, iov?.toLong() ?: 0L, iovcnt, offset, flags)") as SsizeT

public actual fun pwritev64v2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev64v2(fd, iov?.toLong() ?: 0L, iovcnt, offset, flags)") as SsizeT

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').renameat2(olddirfd, oldpath, newdirfd, newpath, flags)") as CInt

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').explicitBzero(s?.value ?: 0L, len)")
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').reallocarray(ptr?.value ?: 0L, nmemb, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ctermid(s?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').backtrace(buf?.value ?: 0L, sz)") as CInt

public actual fun backtraceSymbols(buffer: COpaquePointer?, len: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').backtraceSymbols(buffer?.value ?: 0L, len)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, len: CInt, fd: CInt) {
    js("require('@kotlinmania/libc-native-bindings').backtraceSymbolsFd(buffer?.value ?: 0L, len, fd)")
}

public actual fun glob64(pattern: String?, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: Glob64T?): CInt =
    js("require('@kotlinmania/libc-native-bindings').glob64(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)") as CInt

public actual fun globfree64(pglob: Glob64T?) {
    js("require('@kotlinmania/libc-native-bindings').globfree64(pglob?.toLong() ?: 0L)")
}

public actual fun pthreadAttrGetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetaffinityNp(attr?.toLong() ?: 0L, cpusetsize, cpuset?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetaffinityNp(attr?.toLong() ?: 0L, cpusetsize, cpuset?.toLong() ?: 0L)") as CInt

public actual fun getpriority(which: io.github.kotlinmania.libc.PriorityWhichT, who: IdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpriority(which, who)") as CInt

public actual fun setpriority(which: io.github.kotlinmania.libc.PriorityWhichT, who: IdT, prio: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setpriority(which, who, prio)") as CInt

public actual fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT?, value: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrGetkindNp(attr?.toLong() ?: 0L, value?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT?, value: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrSetkindNp(attr?.toLong() ?: 0L, value)") as CInt

public actual fun pthreadSigqueue(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt, value: Sigval): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSigqueue(thread, sig, value)") as CInt

public actual fun pthreadTryjoinNp(thread: io.github.kotlinmania.libc.PthreadT, retval: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadTryjoinNp(thread, retval?.value ?: 0L)") as CInt

public actual fun pthreadTimedjoinNp(thread: io.github.kotlinmania.libc.PthreadT, retval: COpaquePointer?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadTimedjoinNp(thread, retval?.value ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun mallinfo(): io.github.kotlinmania.libc.Mallinfo =
    js("require('@kotlinmania/libc-native-bindings').mallinfo()") as io.github.kotlinmania.libc.Mallinfo

public actual fun mallinfo2(): io.github.kotlinmania.libc.Mallinfo2 =
    js("require('@kotlinmania/libc-native-bindings').mallinfo2()") as io.github.kotlinmania.libc.Mallinfo2

public actual fun mallocStats() {
    js("require('@kotlinmania/libc-native-bindings').mallocStats()")
}

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mallocInfo(options, stream?.toLong() ?: 0L)") as CInt

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').mallocUsableSize(ptr?.value ?: 0L)") as SizeT

public actual fun getpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwentR(pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrentR(grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun fgetpwentR(stream: FILE?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetpwentR(stream?.toLong() ?: 0L, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun fgetgrentR(stream: FILE?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetgrentR(stream?.toLong() ?: 0L, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun putpwent(p: Passwd?, stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').putpwent(p?.toLong() ?: 0L, stream?.toLong() ?: 0L)") as CInt

public actual fun putgrent(grp: Group?, stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').putgrent(grp?.toLong() ?: 0L, stream?.toLong() ?: 0L)") as CInt

public actual fun sethostid(hostid: CLong): CInt =
    js("require('@kotlinmania/libc-native-bindings').sethostid(hostid)") as CInt

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').memfdCreate(name, flags)") as CInt

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').mlock2(addr?.value ?: 0L, len, flags)") as CInt

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').euidaccess(pathname, mode)") as CInt

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').eaccess(pathname, mode)") as CInt

public actual fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').asctimeR(tm?.toLong() ?: 0L, buf?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(timep: TimeT?, buf: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ctimeR(timep?.toLong() ?: 0L, buf?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dirname(path?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixBasename(path: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').posixBasename(path?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gnuBasename(path: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').gnuBasename(path)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dlmopen(lmid, filename, flag)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dlinfo(handle?.value ?: 0L, request, info?.value ?: 0L)") as CInt

public actual fun dladdr1(addr: COpaquePointer?, info: DlInfo?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').dladdr1(addr?.value ?: 0L, info?.toLong() ?: 0L, extraInfo?.value ?: 0L, flags)") as CInt

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dlvsym(handle?.value ?: 0L, symbol, version)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocTrim(pad: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mallocTrim(pad)") as CInt

public actual fun gnuGetLibcRelease(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').gnuGetLibcRelease()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gnuGetLibcVersion(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').gnuGetLibcVersion()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT?, path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddchdirNp(actions?.toLong() ?: 0L, path)") as CInt

public actual fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddfchdirNp(actions?.toLong() ?: 0L, fd)") as CInt

public actual fun posixSpawnFileActionsAddclosefromNp(actions: PosixSpawnFileActionsT?, from: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddclosefromNp(actions?.toLong() ?: 0L, from)") as CInt

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: PosixSpawnFileActionsT?, tcfd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddtcsetpgrpNp(actions?.toLong() ?: 0L, tcfd)") as CInt

public actual fun getmntentR(stream: FILE?, mntbuf: Mntent?, buf: COpaquePointer?, buflen: CInt): Mntent? =
    js("require('@kotlinmania/libc-native-bindings').getmntentR(stream?.toLong() ?: 0L, mntbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen)") as Mntent?

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').execveat(dirfd, pathname, argv?.value ?: 0L, envp?.value ?: 0L, flags)") as CInt

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').closeRange(first, last, flags)") as CInt

public actual fun mqNotify(mqdes: MqdT, sevp: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqNotify(mqdes, sevp?.toLong() ?: 0L)") as CInt

public actual fun epollPwait2(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: io.github.kotlinmania.libc.Timespec?, sigmask: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollPwait2(epfd, events?.toLong() ?: 0L, maxevents, timeout?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)") as CInt

public actual fun mempcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mempcpy(dest?.value ?: 0L, src?.value ?: 0L, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').tgkill(tgid, tid, sig)") as CInt

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').strcasecmp(s1, s2)") as CInt

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strncasecmp(s1, s2, n)") as CInt

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: SizeT): WcharT? =
    js("require('@kotlinmania/libc-native-bindings').wmemchr(cx?.toLong() ?: 0L, c, n)") as WcharT?
