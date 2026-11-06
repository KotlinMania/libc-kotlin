@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun fgetspentR(fp: FILE?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_fgetspent_r(fp?.handle?.toCPointer<ByteVar>(), spbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, spbufp?.value?.toCPointer<ByteVar>())

public actual fun sgetspentR(s: String?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_sgetspent_r(s, spbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, spbufp?.value?.toCPointer<ByteVar>())

public actual fun getspentR(spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_getspent_r(spbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, spbufp?.value?.toCPointer<ByteVar>())

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_qsort_r(base?.value?.toCPointer<ByteVar>(), num, size, compar?.value?.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())
}

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_sendmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_recvmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun getrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_getrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_setrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun prlimit(pid: PidT, resource: io.github.kotlinmania.libc.RlimitResourceT, newLimit: Rlimit?, oldLimit: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_prlimit(pid, resource, newLimit?.value?.toCPointer<ByteVar>(), oldLimit?.value?.toCPointer<ByteVar>())

public actual fun prlimit64(pid: PidT, resource: io.github.kotlinmania.libc.RlimitResourceT, newLimit: Rlimit64?, oldLimit: Rlimit64?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_prlimit64(pid, resource, newLimit?.value?.toCPointer<ByteVar>(), oldLimit?.value?.toCPointer<ByteVar>())

public actual fun utmpname(file: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_utmpname(file)

public actual fun utmpxname(file: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_utmpxname(file)

public actual fun getutxent(): Utmpx? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setutxent() {
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_setutxent()
}

public actual fun endutxent() {
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_endutxent()
}

public actual fun getpt(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_getpt()

public actual fun mallopt(param: CInt, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_mallopt(param, value)

public actual fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: Timezone?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_getrandom(buf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun getauxval(type: CUlong): CUlong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_getauxval(type)

public actual fun adjtimex(buf: Timex?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_adjtimex(buf?.value?.toCPointer<ByteVar>())

public actual fun ntpAdjtime(buf: Timex?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_ntp_adjtime(buf?.value?.toCPointer<ByteVar>())

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_ntp_gettime(buf?.value?.toCPointer<ByteVar>())

public actual fun clockAdjtime(clkId: ClockidT, buf: Timex?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_clock_adjtime(clkId, buf?.value?.toCPointer<ByteVar>())

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_fanotify_mark(fd, flags, mask, dirfd, path)

public actual fun preadv2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_preadv2(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun pwritev2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_pwritev2(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun preadv64v2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_preadv64v2(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun pwritev64v2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_pwritev64v2(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_renameat2(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_explicit_bzero(s?.value?.toCPointer<ByteVar>(), len)
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_reallocarray(ptr?.value?.toCPointer<ByteVar>(), nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_ctermid(s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_backtrace(buf?.value?.toCPointer<ByteVar>(), sz)

public actual fun backtraceSymbols(buffer: COpaquePointer?, len: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_backtrace_symbols(buffer?.value?.toCPointer<ByteVar>(), len)?.let { COpaquePointer(it.toLong()) }

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, len: CInt, fd: CInt) {
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_backtrace_symbols_fd(buffer?.value?.toCPointer<ByteVar>(), len, fd)
}

public actual fun glob64(pattern: String?, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: Glob64T?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_glob64(pattern, flags, errfunc?.value?.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree64(pglob: Glob64T?) {
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_globfree64(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun pthreadAttrGetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_pthread_attr_getaffinity_np(attr?.value?.toCPointer<ByteVar>(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_pthread_attr_setaffinity_np(attr?.value?.toCPointer<ByteVar>(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun getpriority(which: io.github.kotlinmania.libc.PriorityWhichT, who: IdT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_getpriority(which, who)

public actual fun setpriority(which: io.github.kotlinmania.libc.PriorityWhichT, who: IdT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_setpriority(which, who, prio)

public actual fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT?, value: CInt?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_pthread_rwlockattr_getkind_np(attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT?, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_pthread_rwlockattr_setkind_np(attr?.value?.toCPointer<ByteVar>(), value)

public actual fun pthreadSigqueue(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt, value: Sigval): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_pthread_sigqueue(thread, sig, value.toInt())

public actual fun pthreadTryjoinNp(thread: io.github.kotlinmania.libc.PthreadT, retval: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_pthread_tryjoin_np(thread, retval?.value?.toCPointer<ByteVar>())

public actual fun pthreadTimedjoinNp(thread: io.github.kotlinmania.libc.PthreadT, retval: COpaquePointer?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_pthread_timedjoin_np(thread, retval?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun mallinfo(): io.github.kotlinmania.libc.Mallinfo =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_mallinfo()

public actual fun mallinfo2(): io.github.kotlinmania.libc.Mallinfo2 =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_mallinfo2()

public actual fun mallocStats() {
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_malloc_stats()
}

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_malloc_info(options, stream?.handle?.toCPointer<ByteVar>())

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_malloc_usable_size(ptr?.value?.toCPointer<ByteVar>())

public actual fun getpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_getpwent_r(pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_getgrent_r(grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun fgetpwentR(stream: FILE?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_fgetpwent_r(stream?.handle?.toCPointer<ByteVar>(), pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun fgetgrentR(stream: FILE?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_fgetgrent_r(stream?.handle?.toCPointer<ByteVar>(), grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun putpwent(p: Passwd?, stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_putpwent(p?.value?.toCPointer<ByteVar>(), stream?.handle?.toCPointer<ByteVar>())

public actual fun putgrent(grp: Group?, stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_putgrent(grp?.value?.toCPointer<ByteVar>(), stream?.handle?.toCPointer<ByteVar>())

public actual fun sethostid(hostid: CLong): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_sethostid(hostid)

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_memfd_create(name, flags)

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_mlock2(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_euidaccess(pathname, mode)

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_eaccess(pathname, mode)

public actual fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_asctime_r(tm?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctimeR(timep: TimeT?, buf: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_ctime_r(timep?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun posixBasename(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_posix_basename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun gnuBasename(path: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_gnu_basename(path)?.let { COpaquePointer(it.toLong()) }

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_dlmopen(lmid, filename, flag)?.let { COpaquePointer(it.toLong()) }

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_dlinfo(handle?.value?.toCPointer<ByteVar>(), request, info?.value?.toCPointer<ByteVar>())

public actual fun dladdr1(addr: COpaquePointer?, info: DlInfo?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_dladdr1(addr?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), extraInfo?.value?.toCPointer<ByteVar>(), flags)

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_dlvsym(handle?.value?.toCPointer<ByteVar>(), symbol, version)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocTrim(pad: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_malloc_trim(pad)

public actual fun gnuGetLibcRelease(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_gnu_get_libc_release()?.let { COpaquePointer(it.toLong()) }

public actual fun gnuGetLibcVersion(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_gnu_get_libc_version()?.let { COpaquePointer(it.toLong()) }

public actual fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT?, path: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_posix_spawn_file_actions_addchdir_np(actions?.value?.toCPointer<ByteVar>(), path)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_posix_spawn_file_actions_addfchdir_np(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAddclosefromNp(actions: PosixSpawnFileActionsT?, from: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_posix_spawn_file_actions_addclosefrom_np(actions?.value?.toCPointer<ByteVar>(), from)

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: PosixSpawnFileActionsT?, tcfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_posix_spawn_file_actions_addtcsetpgrp_np(actions?.value?.toCPointer<ByteVar>(), tcfd)

public actual fun getmntentR(stream: FILE?, mntbuf: Mntent?, buf: COpaquePointer?, buflen: CInt): Mntent? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_getmntent_r(stream?.handle?.toCPointer<ByteVar>(), mntbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen)?.let { COpaquePointer(it.toLong()) }

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_execveat(dirfd, pathname, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>(), flags)

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_close_range(first, last, flags)

public actual fun mqNotify(mqdes: MqdT, sevp: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_mq_notify(mqdes.toInt(), sevp?.value?.toCPointer<ByteVar>())

public actual fun epollPwait2(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: io.github.kotlinmania.libc.Timespec?, sigmask: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_epoll_pwait2(epfd, events?.value?.toCPointer<ByteVar>(), maxevents, timeout?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun mempcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_mempcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_gnu_mod_tgkill(tgid, tid, sig)
