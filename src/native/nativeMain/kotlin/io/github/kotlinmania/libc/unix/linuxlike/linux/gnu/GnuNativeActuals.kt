@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun fgetspentR(fp: FILE?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_fgetspentR(fp?.handle?.toCPointer<ByteVar>(), spbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, spbufp?.value?.toCPointer<ByteVar>())

public actual fun sgetspentR(s: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_sgetspentR(s, spbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, spbufp?.value?.toCPointer<ByteVar>())

public actual fun getspentR(spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_getspentR(spbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, spbufp?.value?.toCPointer<ByteVar>())

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_qsortR(base?.value?.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())
}

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_sendmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_recvmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_getrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_setrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_prlimit(pid, resource, newLimit?.value?.toCPointer<ByteVar>(), oldLimit?.value?.toCPointer<ByteVar>())

public actual fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_prlimit64(pid, resource, newLimit?.value?.toCPointer<ByteVar>(), oldLimit?.value?.toCPointer<ByteVar>())

public actual fun utmpname(file: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_utmpname(file)

public actual fun utmpxname(file: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_utmpxname(file)

public actual fun getutxent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setutxent() {
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_setutxent()
}

public actual fun endutxent() {
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_endutxent()
}

public actual fun getpt(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_getpt()

public actual fun mallopt(param: CInt, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_mallopt(param, value)

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_getrandom(buf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun getauxval(type: CUlong): CUlong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_getauxval(type)

public actual fun adjtimex(buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_adjtimex(buf?.value?.toCPointer<ByteVar>())

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_ntpAdjtime(buf?.value?.toCPointer<ByteVar>())

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_ntpGettime(buf?.value?.toCPointer<ByteVar>())

public actual fun clockAdjtime(clkId: ClockidT, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_clockAdjtime(clkId, buf?.value?.toCPointer<ByteVar>())

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_fanotifyMark(fd, flags, mask, dirfd, path)

public actual fun preadv2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_preadv2(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun pwritev2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_pwritev2(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun preadv64v2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_preadv64v2(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun pwritev64v2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_pwritev64v2(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_renameat2(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_explicitBzero(s?.value?.toCPointer<ByteVar>(), len)
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_reallocarray(ptr?.value?.toCPointer<ByteVar>(), nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_ctermid(s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_backtrace(buf?.value?.toCPointer<ByteVar>(), sz)

public actual fun backtraceSymbols(buffer: COpaquePointer?, len: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_backtraceSymbols(buffer?.value?.toCPointer<ByteVar>(), len)?.let { COpaquePointer(it.toLong()) }

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, len: CInt, fd: CInt) {
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_backtraceSymbolsFd(buffer?.value?.toCPointer<ByteVar>(), len, fd)
}

public actual fun glob64(pattern: String?, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_glob64(pattern, flags, 0L.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree64(pglob: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_globfree64(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun ptrace(request: CUint): CLong =
    0L

public actual fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_pthreadAttrGetaffinityNp(attr?.value?.toCPointer<ByteVar>(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_pthreadAttrSetaffinityNp(attr?.value?.toCPointer<ByteVar>(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_getpriority(which, who)

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_setpriority(which, who, prio)

public actual fun pthreadRwlockattrGetkindNp(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_pthreadRwlockattrGetkindNp(attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetkindNp(attr: COpaquePointer?, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_pthreadRwlockattrSetkindNp(attr?.value?.toCPointer<ByteVar>(), value)

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    0

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_pthreadTryjoinNp(thread.toLong().toCPointer<ByteVar>(), retval?.value?.toCPointer<ByteVar>())

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_pthreadTimedjoinNp(thread.toLong().toCPointer<ByteVar>(), retval?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun mallinfo(): Mallinfo =
    null as Mallinfo

public actual fun mallinfo2(): Mallinfo2 =
    null as Mallinfo2

public actual fun mallocStats() {
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_mallocStats()
}

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_mallocInfo(options, stream?.handle?.toCPointer<ByteVar>())

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_mallocUsableSize(ptr?.value?.toCPointer<ByteVar>())

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_getpwentR(pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_getgrentR(grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun fgetpwentR(stream: FILE?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_fgetpwentR(stream?.handle?.toCPointer<ByteVar>(), pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun fgetgrentR(stream: FILE?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_fgetgrentR(stream?.handle?.toCPointer<ByteVar>(), grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun putpwent(p: COpaquePointer?, stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_putpwent(p?.value?.toCPointer<ByteVar>(), stream?.handle?.toCPointer<ByteVar>())

public actual fun putgrent(grp: COpaquePointer?, stream: FILE?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_putgrent(grp?.value?.toCPointer<ByteVar>(), stream?.handle?.toCPointer<ByteVar>())

public actual fun sethostid(hostid: CLong): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_sethostid(hostid)

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_memfdCreate(name, flags)

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_mlock2(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_euidaccess(pathname, mode)

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_eaccess(pathname, mode)

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_asctimeR(tm?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_ctimeR(timep?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun posixBasename(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_posixBasename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun gnuBasename(path: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_gnuBasename(path)?.let { COpaquePointer(it.toLong()) }

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_dlmopen(lmid, filename, flag)?.let { COpaquePointer(it.toLong()) }

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_dlinfo(handle?.value?.toCPointer<ByteVar>(), request, info?.value?.toCPointer<ByteVar>())

public actual fun dladdr1(addr: COpaquePointer?, info: COpaquePointer?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_dladdr1(addr?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), extraInfo?.value?.toCPointer<ByteVar>(), flags)

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_dlvsym(handle?.value?.toCPointer<ByteVar>(), symbol, version)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocTrim(pad: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_mallocTrim(pad)

public actual fun gnuGetLibcRelease(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_gnuGetLibcRelease()?.let { COpaquePointer(it.toLong()) }

public actual fun gnuGetLibcVersion(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_gnuGetLibcVersion()?.let { COpaquePointer(it.toLong()) }

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddchdirNp(actions?.value?.toCPointer<ByteVar>(), path)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddfchdirNp(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAddclosefromNp(actions: COpaquePointer?, from: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddclosefromNp(actions?.value?.toCPointer<ByteVar>(), from)

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: COpaquePointer?, tcfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddtcsetpgrpNp(actions?.value?.toCPointer<ByteVar>(), tcfd)

public actual fun getmntentR(stream: FILE?, mntbuf: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_getmntentR(stream?.handle?.toCPointer<ByteVar>(), mntbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen)?.let { COpaquePointer(it.toLong()) }

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_execveat(dirfd, pathname, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>(), flags)

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_closeRange(first, last, flags)

public actual fun mqNotify(mqdes: MqdT, sevp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_mqNotify(mqdes.toLong().toCPointer<ByteVar>(), sevp?.value?.toCPointer<ByteVar>())

public actual fun epollPwait2(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_epollPwait2(epfd, events?.value?.toCPointer<ByteVar>(), maxevents, timeout?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun mempcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_mempcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libc_unix_linuxlike_linux_gnu_tgkill(tgid, tid, sig)
