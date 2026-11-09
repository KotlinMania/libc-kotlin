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

private object UnixLinuxlikeLinuxL4reSharedJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_iopl(level: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_ioperm(from: Long, num: Long, turnOn: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_aioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_aioWrite(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_aioFsync(op: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_aioError(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_aioReturn(aiocbp: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_aioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_aioCancel(fd: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_lioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_getloadavg(loadavg: Long, nelem: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_processVmReadv(pid: Int, localIov: Long, liovcnt: Long, remoteIov: Long, riovcnt: Long, flags: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_processVmWritev(pid: Int, localIov: Long, liovcnt: Long, remoteIov: Long, riovcnt: Long, flags: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_futimes(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_strerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_abs(i: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_labs(i: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_rand(): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_srand(seed: Int)

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_drand48(): Double

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_erand48(xseed: Long): Double

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_lrand48(): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_nrand48(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_jrand48(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_srand48(seed: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_setpwent()

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_endpwent()

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_getpwent(): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_setgrent()

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_endgrent()

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_getgrent(): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_setspent()

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_endspent()

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_getspent(): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_getspnam(name: String?): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_shmget(key: Int, size: Long, shmflg: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_shmat(shmid: Int, shmaddr: Long, shmflg: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_shmdt(shmaddr: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_shmctl(shmid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_errnoLocation(): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_glob(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_globfree(pglob: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_seekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_telldir(dirp: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_madvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_msync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_nlLanginfo(item: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_nlLanginfoL(item: Int, locale: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_schedGetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_schedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_settimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_semTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_semGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_mount(src: String?, target: String?, fstype: String?, flags: Long, data: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_ppoll(fds: Long, nfds: Long, timeout: Long, sigmask: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_sethostname(name: String?, len: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_schedGetPriorityMin(policy: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_sysinfo(info: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_sigsuspend(mask: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_getgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_semClose(sem: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_initgroups(user: String?, group: Short): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_getgrnam(name: String?): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_semUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_daemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_sigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_getgrgid(gid: Short): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_popen(command: String?, mode: String?): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_dlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_setmntent(filename: String?, ty: String?): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_getmntent(stream: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_addmntent(stream: Long, mnt: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_endmntent(streamp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_hasmntopt(mnt: Long, opt: String?): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_regcomp(preg: Long, pattern: String?, cflags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_regexec(preg: Long, input: String?, nmatch: Long, pmatch: Long, eflags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_regerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_regfree(preg: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_iconvOpen(tocode: String?, fromcode: String?): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_iconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_iconvClose(cd: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_gettid(): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_timerCreate(clockid: Int, sevp: Long, timerid: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_timerDelete(timerid: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_timerGetoverrun(timerid: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_timerGettime(timerid: Long, currValue: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_timerSettime(timerid: Long, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_schedGetcpu(): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_getoptLong(argc: Int, argv: Long, optstring: String?, longopts: Long, longindex: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_copyFileRange(fdIn: Int, offIn: Long, fdOut: Int, offOut: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_freopen64(filename: String?, mode: String?, file: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_fseeko64(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_fsetpos64(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_l4re_shared_ftello64(stream: Long): Long
}

public actual fun iopl(level: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_iopl(level)

public actual fun ioperm(from: CUlong, num: CUlong, turnOn: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_ioperm(from.toLong(), num.toLong(), turnOn)

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_aioRead((aiocbp?.value ?: 0L))

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_aioWrite((aiocbp?.value ?: 0L))

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_aioFsync(op, (aiocbp?.value ?: 0L))

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_aioError((aiocbp?.value ?: 0L))

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_aioReturn((aiocbp?.value ?: 0L))

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_aioSuspend((aiocbList?.value ?: 0L), nitems, (timeout?.value ?: 0L))

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_aioCancel(fd, (aiocbp?.value ?: 0L))

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_lioListio(mode, (aiocbList?.value ?: 0L), nitems, (sevp?.value ?: 0L))

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_pwritev(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_preadv(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_getnameinfo((sa?.value ?: 0L), salen.toInt(), (host?.value ?: 0L), hostlen.toInt(), (serv?.value ?: 0L), servlen.toInt(), flags)

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_getloadavg((loadavg?.value ?: 0L), nelem)

public actual fun processVmReadv(pid: PidT, localIov: COpaquePointer?, liovcnt: CUlong, remoteIov: COpaquePointer?, riovcnt: CUlong, flags: CUlong): Long =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_processVmReadv(pid, (localIov?.value ?: 0L), liovcnt.toLong(), (remoteIov?.value ?: 0L), riovcnt.toLong(), flags.toLong())

public actual fun processVmWritev(pid: PidT, localIov: COpaquePointer?, liovcnt: CUlong, remoteIov: COpaquePointer?, riovcnt: CUlong, flags: CUlong): Long =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_processVmWritev(pid, (localIov?.value ?: 0L), liovcnt.toLong(), (remoteIov?.value ?: 0L), riovcnt.toLong(), flags.toLong())

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_futimes(fd, (times?.value ?: 0L))

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_strerrorR(errnum, (buf?.value ?: 0L), buflen.toLong())

public actual fun abs(i: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_abs(i)

public actual fun labs(i: CLong): CLong =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_labs(i)

public actual fun rand(): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_rand()

public actual fun srand(seed: CUint) {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_srand(seed.toInt())
}

public actual fun drand48(): CDouble =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_drand48()

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_erand48((xseed?.value ?: 0L))

public actual fun lrand48(): CLong =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_lrand48()

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_nrand48((xseed?.value ?: 0L))

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_jrand48((xseed?.value ?: 0L))

public actual fun srand48(seed: CLong) {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_srand48(seed)
}

public actual fun setpwent() {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_setpwent()
}

public actual fun endpwent() {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_endpwent()
}

public actual fun getpwent(): COpaquePointer? =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_getpwent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgrent() {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_setgrent()
}

public actual fun endgrent() {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_endgrent()
}

public actual fun getgrent(): COpaquePointer? =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_getgrent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setspent() {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_setspent()
}

public actual fun endspent() {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_endspent()
}

public actual fun getspent(): COpaquePointer? =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_getspent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getspnam(name: String?): COpaquePointer? =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_getspnam(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_shmget(key, size.toLong(), shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_shmat(shmid, (shmaddr?.value ?: 0L), shmflg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_shmdt((shmaddr?.value ?: 0L))

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_shmctl(shmid, cmd, (buf?.value ?: 0L))

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun errnoLocation(): COpaquePointer? =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_errnoLocation().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_glob(pattern, flags, 0L, (pglob?.value ?: 0L))

public actual fun globfree(pglob: COpaquePointer?) {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_globfree((pglob?.value ?: 0L))
}

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_seekdir((dirp?.handle ?: 0L), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_telldir((dirp?.handle ?: 0L))

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_madvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_msync((addr?.value ?: 0L), len.toLong(), flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_recvfrom(socket, (buf?.value ?: 0L), len.toLong(), flags, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_nlLanginfoL(item, (locale?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_schedGetaffinity(pid, cpusetsize.toLong(), (cpuset?.value ?: 0L))

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_schedGetPriorityMax(policy)

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_settimeofday((tv?.value ?: 0L), (tz?.value ?: 0L))

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_semTimedwait((sem?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_semGetvalue((sem?.value ?: 0L), (sval?.value ?: 0L))

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_mount(src, target, fstype, flags.toLong(), (data?.value ?: 0L))

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_ppoll((fds?.value ?: 0L), nfds.toLong(), (timeout?.value ?: 0L), (sigmask?.value ?: 0L))

public actual fun sethostname(name: String?, len: SizeT): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_sethostname(name, len.toLong())

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_schedGetPriorityMin(policy)

public actual fun sysinfo(info: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_sysinfo((info?.value ?: 0L))

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_sigsuspend((mask?.value ?: 0L))

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_getgrgidR(gid.toShort(), (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun semClose(sem: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_semClose((sem?.value ?: 0L))

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_getgrnamR(name, (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun initgroups(user: String?, group: GidT): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_initgroups(user, group.toShort())

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_getgrnam(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun semUnlink(name: String?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_semUnlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_daemon(nochdir, noclose)

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_sigwait((set?.value ?: 0L), (sig?.value ?: 0L))

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_getgrgid(gid.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun popen(command: String?, mode: String?): FILE? =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_popen(command, mode).let { if (it == 0L) null else FILE(it) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_faccessat(dirfd, pathname, mode, flags)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_dlIteratePhdr(0L, (data?.value ?: 0L))

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_setmntent(filename, ty).let { if (it == 0L) null else FILE(it) }

public actual fun getmntent(stream: FILE?): COpaquePointer? =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_getmntent((stream?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun addmntent(stream: FILE?, mnt: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_addmntent((stream?.handle ?: 0L), (mnt?.value ?: 0L))

public actual fun endmntent(streamp: FILE?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_endmntent((streamp?.handle ?: 0L))

public actual fun hasmntopt(mnt: COpaquePointer?, opt: String?): COpaquePointer? =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_hasmntopt((mnt?.value ?: 0L), opt).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_regcomp((preg?.value ?: 0L), pattern, cflags)

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_regexec((preg?.value ?: 0L), input, nmatch.toLong(), (pmatch?.value ?: 0L), eflags)

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_regerror(errcode, (preg?.value ?: 0L), (errbuf?.value ?: 0L), errbufSize.toLong()).toULong()

public actual fun regfree(preg: COpaquePointer?) {
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_regfree((preg?.value ?: 0L))
}

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_iconvOpen(tocode, fromcode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_iconv((cd?.value ?: 0L), (inbuf?.value ?: 0L), (inbytesleft?.value ?: 0L), (outbuf?.value ?: 0L), (outbytesleft?.value ?: 0L)).toULong()

public actual fun iconvClose(cd: IconvT): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_iconvClose((cd?.value ?: 0L))

public actual fun gettid(): PidT =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_gettid()

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_timerCreate(clockid, (sevp?.value ?: 0L), (timerid?.value ?: 0L))

public actual fun timerDelete(timerid: TimerT): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_timerDelete((timerid?.value ?: 0L))

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_timerGetoverrun((timerid?.value ?: 0L))

public actual fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_timerGettime((timerid?.value ?: 0L), (currValue?.value ?: 0L))

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_timerSettime((timerid?.value ?: 0L), flags, (newValue?.value ?: 0L), (oldValue?.value ?: 0L))

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_memmem((haystack?.value ?: 0L), haystacklen.toLong(), (needle?.value ?: 0L), needlelen.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun schedGetcpu(): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_schedGetcpu()

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_getoptLong(argc, (argv?.value ?: 0L), optstring, (longopts?.value ?: 0L), (longindex?.value ?: 0L))

public actual fun copyFileRange(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_copyFileRange(fdIn, (offIn?.value ?: 0L), fdOut, (offOut?.value ?: 0L), len.toLong(), flags.toInt())

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_freopen64(filename, mode, (file?.handle ?: 0L)).let { if (it == 0L) null else FILE(it) }

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_fseeko64((stream?.handle ?: 0L), offset, whence)

public actual fun fsetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_fsetpos64((stream?.handle ?: 0L), (ptr?.value ?: 0L))

public actual fun ftello64(stream: FILE?): Off64T =
    UnixLinuxlikeLinuxL4reSharedJniBridge.libc_unix_linuxlike_linux_l4re_shared_ftello64((stream?.handle ?: 0L))
