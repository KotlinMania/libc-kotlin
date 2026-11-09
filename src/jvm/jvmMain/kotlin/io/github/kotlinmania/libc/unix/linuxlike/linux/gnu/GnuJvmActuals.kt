@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.MqdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT

private object UnixLinuxlikeLinuxGnuJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_fgetspentR(fp: Long, spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_sgetspentR(s: String?, spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_getspentR(spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_qsortR(base: Long, num: Long, size: Long, compar: Long, arg: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_sendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_recvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_getrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_setrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_getrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_setrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_prlimit(pid: Int, resource: Int, newLimit: Long, oldLimit: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_prlimit64(pid: Int, resource: Int, newLimit: Long, oldLimit: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_utmpname(file: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_utmpxname(file: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_getutxent(): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_getutxid(ut: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_getutxline(ut: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_pututxline(ut: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_setutxent()

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_endutxent()

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_getpt(): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_mallopt(param: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_getentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_getrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_getauxval(type: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_adjtimex(buf: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_ntpAdjtime(buf: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_ntpGettime(buf: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_clockAdjtime(clkId: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_fanotifyMark(fd: Int, flags: Int, mask: Long, dirfd: Int, path: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_preadv2(fd: Int, iov: Long, iovcnt: Int, offset: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_pwritev2(fd: Int, iov: Long, iovcnt: Int, offset: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_preadv64v2(fd: Int, iov: Long, iovcnt: Int, offset: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_pwritev64v2(fd: Int, iov: Long, iovcnt: Int, offset: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_renameat2(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_explicitBzero(s: Long, len: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_reallocarray(ptr: Long, nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_ctermid(s: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_backtrace(buf: Long, sz: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_backtraceSymbols(buffer: Long, len: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_backtraceSymbolsFd(buffer: Long, len: Int, fd: Int)

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_glob64(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_globfree64(pglob: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_pthreadAttrGetaffinityNp(attr: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_pthreadAttrSetaffinityNp(attr: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_getpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_setpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_pthreadRwlockattrGetkindNp(attr: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_pthreadRwlockattrSetkindNp(attr: Long, value: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_pthreadTryjoinNp(thread: Long, retval: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_pthreadTimedjoinNp(thread: Long, retval: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_mallocStats()

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_mallocInfo(options: Int, stream: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_mallocUsableSize(ptr: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_getpwentR(pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_getgrentR(grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_fgetpwentR(stream: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_fgetgrentR(stream: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_putpwent(p: Long, stream: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_putgrent(grp: Long, stream: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_sethostid(hostid: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_memfdCreate(name: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_mlock2(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_euidaccess(pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_eaccess(pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_asctimeR(tm: Long, buf: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_ctimeR(timep: Long, buf: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_dirname(path: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_posixBasename(path: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_gnuBasename(path: String?): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_dlmopen(lmid: Long, filename: String?, flag: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_dlinfo(handle: Long, request: Int, info: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_dladdr1(addr: Long, info: Long, extraInfo: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_dlvsym(handle: Long, symbol: String?, version: String?): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_mallocTrim(pad: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_gnuGetLibcRelease(): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_gnuGetLibcVersion(): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddchdirNp(actions: Long, path: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddfchdirNp(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddclosefromNp(actions: Long, from: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddtcsetpgrpNp(actions: Long, tcfd: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_getmntentR(stream: Long, mntbuf: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_execveat(dirfd: Int, pathname: String?, argv: Long, envp: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_closeRange(first: Int, last: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_mqNotify(mqdes: Long, sevp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_epollPwait2(epfd: Int, events: Long, maxevents: Int, timeout: Long, sigmask: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_mempcpy(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gnu_tgkill(tgid: Int, tid: Int, sig: Int): Int
}

public actual fun fgetspentR(fp: FILE?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_fgetspentR((fp?.handle ?: 0L), (spbuf?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (spbufp?.value ?: 0L))

public actual fun sgetspentR(s: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_sgetspentR(s, (spbuf?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (spbufp?.value ?: 0L))

public actual fun getspentR(spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_getspentR((spbuf?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (spbufp?.value ?: 0L))

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_qsortR((base?.value ?: 0L), num.toLong(), size.toLong(), 0L, (arg?.value ?: 0L))
}

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_sendmmsg(sockfd, (msgvec?.value ?: 0L), vlen.toInt(), flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_recvmmsg(sockfd, (msgvec?.value ?: 0L), vlen.toInt(), flags, (timeout?.value ?: 0L))

public actual fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_getrlimit64(resource.toInt(), (rlim?.value ?: 0L))

public actual fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_setrlimit64(resource.toInt(), (rlim?.value ?: 0L))

public actual fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_getrlimit(resource.toInt(), (rlim?.value ?: 0L))

public actual fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_setrlimit(resource.toInt(), (rlim?.value ?: 0L))

public actual fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_prlimit(pid, resource.toInt(), (newLimit?.value ?: 0L), (oldLimit?.value ?: 0L))

public actual fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_prlimit64(pid, resource.toInt(), (newLimit?.value ?: 0L), (oldLimit?.value ?: 0L))

public actual fun utmpname(file: String?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_utmpname(file)

public actual fun utmpxname(file: String?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_utmpxname(file)

public actual fun getutxent(): COpaquePointer? =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_getutxent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_getutxid((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_getutxline((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_pututxline((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setutxent() {
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_setutxent()
}

public actual fun endutxent() {
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_endutxent()
}

public actual fun getpt(): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_getpt()

public actual fun mallopt(param: CInt, value: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_mallopt(param, value)

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_getentropy((buf?.value ?: 0L), buflen.toLong())

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_getrandom((buf?.value ?: 0L), buflen.toLong(), flags.toInt())

public actual fun getauxval(type: CUlong): CUlong =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_getauxval(type.toLong()).toULong()

public actual fun adjtimex(buf: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_adjtimex((buf?.value ?: 0L))

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_ntpAdjtime((buf?.value ?: 0L))

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_ntpGettime((buf?.value ?: 0L))

public actual fun clockAdjtime(clkId: ClockidT, buf: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_clockAdjtime(clkId, (buf?.value ?: 0L))

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_fanotifyMark(fd, flags.toInt(), mask.toLong(), dirfd, path)

public actual fun preadv2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_preadv2(fd, (iov?.value ?: 0L), iovcnt, offset, flags)

public actual fun pwritev2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_pwritev2(fd, (iov?.value ?: 0L), iovcnt, offset, flags)

public actual fun preadv64v2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_preadv64v2(fd, (iov?.value ?: 0L), iovcnt, offset, flags)

public actual fun pwritev64v2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_pwritev64v2(fd, (iov?.value ?: 0L), iovcnt, offset, flags)

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_renameat2(olddirfd, oldpath, newdirfd, newpath, flags.toInt())

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_explicitBzero((s?.value ?: 0L), len.toLong())
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_reallocarray((ptr?.value ?: 0L), nmemb.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_ctermid((s?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_backtrace((buf?.value ?: 0L), sz)

public actual fun backtraceSymbols(buffer: COpaquePointer?, len: CInt): COpaquePointer? =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_backtraceSymbols((buffer?.value ?: 0L), len).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, len: CInt, fd: CInt) {
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_backtraceSymbolsFd((buffer?.value ?: 0L), len, fd)
}

public actual fun glob64(pattern: String?, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_glob64(pattern, flags, 0L, (pglob?.value ?: 0L))

public actual fun globfree64(pglob: COpaquePointer?) {
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_globfree64((pglob?.value ?: 0L))
}

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    0L

public actual fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_pthreadAttrGetaffinityNp((attr?.value ?: 0L), cpusetsize.toLong(), (cpuset?.value ?: 0L))

public actual fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_pthreadAttrSetaffinityNp((attr?.value ?: 0L), cpusetsize.toLong(), (cpuset?.value ?: 0L))

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_getpriority(which.toInt(), who.toInt())

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_setpriority(which.toInt(), who.toInt(), prio)

public actual fun pthreadRwlockattrGetkindNp(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_pthreadRwlockattrGetkindNp((attr?.value ?: 0L), (value?.value ?: 0L))

public actual fun pthreadRwlockattrSetkindNp(attr: COpaquePointer?, value: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_pthreadRwlockattrSetkindNp((attr?.value ?: 0L), value)

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    0

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_pthreadTryjoinNp(thread.toLong(), (retval?.value ?: 0L))

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_pthreadTimedjoinNp(thread.toLong(), (retval?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallinfo2(): Mallinfo2 =
    Mallinfo2()

public actual fun mallocStats() {
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_mallocStats()
}

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_mallocInfo(options, (stream?.handle ?: 0L))

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_mallocUsableSize((ptr?.value ?: 0L)).toULong()

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_getpwentR((pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_getgrentR((grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun fgetpwentR(stream: FILE?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_fgetpwentR((stream?.handle ?: 0L), (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun fgetgrentR(stream: FILE?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_fgetgrentR((stream?.handle ?: 0L), (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun putpwent(p: COpaquePointer?, stream: FILE?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_putpwent((p?.value ?: 0L), (stream?.handle ?: 0L))

public actual fun putgrent(grp: COpaquePointer?, stream: FILE?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_putgrent((grp?.value ?: 0L), (stream?.handle ?: 0L))

public actual fun sethostid(hostid: CLong): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_sethostid(hostid)

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_memfdCreate(name, flags.toInt())

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_mlock2((addr?.value ?: 0L), len.toLong(), flags.toInt())

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_euidaccess(pathname, mode)

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_eaccess(pathname, mode)

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_asctimeR((tm?.value ?: 0L), (buf?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_ctimeR((timep?.value ?: 0L), (buf?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_dirname((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixBasename(path: COpaquePointer?): COpaquePointer? =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_posixBasename((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gnuBasename(path: String?): COpaquePointer? =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_gnuBasename(path).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_dlmopen(lmid, filename, flag).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_dlinfo((handle?.value ?: 0L), request, (info?.value ?: 0L))

public actual fun dladdr1(addr: COpaquePointer?, info: COpaquePointer?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_dladdr1((addr?.value ?: 0L), (info?.value ?: 0L), (extraInfo?.value ?: 0L), flags)

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_dlvsym((handle?.value ?: 0L), symbol, version).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocTrim(pad: SizeT): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_mallocTrim(pad.toLong())

public actual fun gnuGetLibcRelease(): COpaquePointer? =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_gnuGetLibcRelease().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gnuGetLibcVersion(): COpaquePointer? =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_gnuGetLibcVersion().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddchdirNp((actions?.value ?: 0L), path)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddfchdirNp((actions?.value ?: 0L), fd)

public actual fun posixSpawnFileActionsAddclosefromNp(actions: COpaquePointer?, from: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddclosefromNp((actions?.value ?: 0L), from)

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: COpaquePointer?, tcfd: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddtcsetpgrpNp((actions?.value ?: 0L), tcfd)

public actual fun getmntentR(stream: FILE?, mntbuf: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_getmntentR((stream?.handle ?: 0L), (mntbuf?.value ?: 0L), (buf?.value ?: 0L), buflen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_execveat(dirfd, pathname, (argv?.value ?: 0L), (envp?.value ?: 0L), flags)

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_closeRange(first.toInt(), last.toInt(), flags)

public actual fun mqNotify(mqdes: MqdT, sevp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_mqNotify(mqdes.toLong(), (sevp?.value ?: 0L))

public actual fun epollPwait2(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_epollPwait2(epfd, (events?.value ?: 0L), maxevents, (timeout?.value ?: 0L), (sigmask?.value ?: 0L))

public actual fun mempcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_mempcpy((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libc_unix_linuxlike_linux_gnu_tgkill(tgid, tid, sig)
