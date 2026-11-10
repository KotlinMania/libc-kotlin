@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NlItem
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT

public actual fun iopl(level: CInt): CInt =
    0

public actual fun ioperm(from: CUlong, num: CUlong, turnOn: CInt): CInt =
    0

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    0L

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    0

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    0

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    0

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    0L

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    0L

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    0

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    0

public actual fun processVmReadv(pid: PidT, localIov: COpaquePointer?, liovcnt: CUlong, remoteIov: COpaquePointer?, riovcnt: CUlong, flags: CUlong): Long =
    0L

public actual fun processVmWritev(pid: PidT, localIov: COpaquePointer?, liovcnt: CUlong, remoteIov: COpaquePointer?, riovcnt: CUlong, flags: CUlong): Long =
    0L

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    0

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun abs(i: CInt): CInt =
    0

public actual fun labs(i: CLong): CLong =
    0L

public actual fun rand(): CInt =
    0

public actual fun srand(seed: CUint) {
}

public actual fun drand48(): CDouble =
    0.0

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    0.0

public actual fun lrand48(): CLong =
    0L

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    0L

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    0L

public actual fun srand48(seed: CLong) {
}

public actual fun setpwent() {
}

public actual fun endpwent() {
}

public actual fun getpwent(): COpaquePointer? =
    null

public actual fun setgrent() {
}

public actual fun endgrent() {
}

public actual fun getgrent(): COpaquePointer? =
    null

public actual fun setspent() {
}

public actual fun endspent() {
}

public actual fun getspent(): COpaquePointer? =
    null

public actual fun getspnam(name: String?): COpaquePointer? =
    null

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    0

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    null

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    0

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    0

public actual fun errnoLocation(): COpaquePointer? =
    null

public actual fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    0

public actual fun globfree(pglob: COpaquePointer?) {
}

public actual fun seekdir(dirp: DIR?, loc: CLong) {
}

public actual fun telldir(dirp: DIR?): CLong =
    0L

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    0

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    0

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    0L

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    null

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    null

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    0

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    0

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    0

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    0

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    0

public actual fun sethostname(name: String?, len: SizeT): CInt =
    0

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    0

public actual fun sysinfo(info: COpaquePointer?): CInt =
    0

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    0

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun semClose(sem: COpaquePointer?): CInt =
    0

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun initgroups(user: String?, group: GidT): CInt =
    0

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    null

public actual fun semUnlink(name: String?): CInt =
    0

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    0

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    0

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    null

public actual fun popen(command: String?, mode: String?): FILE? =
    null

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    0

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    0

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    null

public actual fun getmntent(stream: FILE?): COpaquePointer? =
    null

public actual fun addmntent(stream: FILE?, mnt: COpaquePointer?): CInt =
    0

public actual fun endmntent(streamp: FILE?): CInt =
    0

public actual fun hasmntopt(mnt: COpaquePointer?, opt: String?): COpaquePointer? =
    null

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    0

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    0

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    0uL

public actual fun regfree(preg: COpaquePointer?) {
}

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    null

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    0uL

public actual fun iconvClose(cd: IconvT): CInt =
    0

public actual fun gettid(): PidT =
    0

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    0

public actual fun timerDelete(timerid: TimerT): CInt =
    0

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    0

public actual fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt =
    0

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    0

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    null

public actual fun schedGetcpu(): CInt =
    0

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    0

public actual fun copyFileRange(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    0L

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    null

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    0

public actual fun fsetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    0

public actual fun ftello64(stream: FILE?): Off64T =
    0L
