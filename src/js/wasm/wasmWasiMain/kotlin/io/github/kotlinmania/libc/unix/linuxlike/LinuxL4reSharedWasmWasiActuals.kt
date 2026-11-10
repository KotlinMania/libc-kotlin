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
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioperm(from: CUlong, num: CUlong, turnOn: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun processVmReadv(pid: PidT, localIov: COpaquePointer?, liovcnt: CUlong, remoteIov: COpaquePointer?, riovcnt: CUlong, flags: CUlong): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun processVmWritev(pid: PidT, localIov: COpaquePointer?, liovcnt: CUlong, remoteIov: COpaquePointer?, riovcnt: CUlong, flags: CUlong): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun srand(seed: CUint): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drand48(): CDouble =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lrand48(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun srand48(seed: CLong): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setpwent(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endpwent(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpwent(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setgrent(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endgrent(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getgrent(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setspent(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endspent(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getspent(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getspnam(name: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun errnoLocation(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globfree(pglob: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seekdir(dirp: DIR?, loc: CLong): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun telldir(dirp: DIR?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sethostname(name: String?, len: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sysinfo(info: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semClose(sem: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initgroups(user: String?, group: GidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getgrnam(name: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semUnlink(name: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getmntent(stream: FILE?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addmntent(stream: FILE?, mnt: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endmntent(streamp: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hasmntopt(mnt: COpaquePointer?, opt: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regfree(preg: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gettid(): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun schedGetcpu(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun copyFileRange(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ftello64(stream: FILE?): Off64T =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
