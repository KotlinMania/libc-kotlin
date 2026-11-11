@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_abs
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_addmntent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_aioCancel
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_aioError
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_aioFsync
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_aioRead
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_aioReturn
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_aioSuspend
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_aioWrite
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_copyFileRange
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_daemon
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_dlIteratePhdr
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_drand48
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_endgrent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_endmntent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_endpwent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_endspent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_erand48
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_errnoLocation
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_faccessat
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_freopen64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_fseeko64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_fsetpos64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_ftello64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_futimes
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_getgrent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_getgrgid
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_getgrgidR
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_getgrnam
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_getgrnamR
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_getloadavg
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_getmntent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_getnameinfo
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_getoptLong
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_getpwent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_getspent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_getspnam
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_gettid
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_glob
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_globfree
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_hasmntopt
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_iconv
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_iconvClose
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_iconvOpen
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_initgroups
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_ioperm
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_iopl
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_jrand48
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_labs
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_lioListio
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_lrand48
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_madvise
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_memmem
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_mount
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_mprotect
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_mremap
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_msync
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_nlLanginfo
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_nlLanginfoL
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_nrand48
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_popen
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_ppoll
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_prctl
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_preadv
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_processVmReadv
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_processVmWritev
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_pwritev
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_rand
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_recvfrom
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_regcomp
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_regerror
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_regexec
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_regfree
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_schedGetPriorityMax
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_schedGetPriorityMin
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_schedGetaffinity
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_schedGetcpu
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_seekdir
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_semClose
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_semGetvalue
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_semOpen
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_semTimedwait
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_semUnlink
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_setgrent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_sethostname
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_setmntent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_setpwent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_setspent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_settimeofday
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_shmat
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_shmctl
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_shmdt
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_shmget
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_sigsuspend
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_sigwait
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_srand
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_srand48
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_strerrorR
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_sysinfo
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_telldir
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_timerCreate
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_timerDelete
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_timerGetoverrun
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_timerGettime
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_linux_l4re_shared_timerSettime
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NlItem
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun iopl(level: CInt): CInt =
    libc_unix_linuxlike_linux_l4re_shared_iopl(level)

public actual fun ioperm(from: CUlong, num: CUlong, turnOn: CInt): CInt =
    libc_unix_linuxlike_linux_l4re_shared_ioperm(from, num, turnOn)

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_aioRead(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_aioWrite(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_aioFsync(op, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_aioError(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    libc_unix_linuxlike_linux_l4re_shared_aioReturn(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_aioSuspend(aiocbList?.value?.toCPointer<ByteVar>(), nitems, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_aioCancel(fd, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_lioListio(mode, aiocbList?.value?.toCPointer<ByteVar>(), nitems, sevp?.value?.toCPointer<ByteVar>())

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    libc_unix_linuxlike_linux_l4re_shared_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    libc_unix_linuxlike_linux_l4re_shared_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    libc_unix_linuxlike_linux_l4re_shared_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    libc_unix_linuxlike_linux_l4re_shared_getloadavg(loadavg?.value?.toCPointer<ByteVar>(), nelem)

public actual fun processVmReadv(pid: PidT, localIov: COpaquePointer?, liovcnt: CUlong, remoteIov: COpaquePointer?, riovcnt: CUlong, flags: CUlong): Long =
    libc_unix_linuxlike_linux_l4re_shared_processVmReadv(pid, localIov?.value?.toCPointer<ByteVar>(), liovcnt, remoteIov?.value?.toCPointer<ByteVar>(), riovcnt, flags)

public actual fun processVmWritev(pid: PidT, localIov: COpaquePointer?, liovcnt: CUlong, remoteIov: COpaquePointer?, riovcnt: CUlong, flags: CUlong): Long =
    libc_unix_linuxlike_linux_l4re_shared_processVmWritev(pid, localIov?.value?.toCPointer<ByteVar>(), liovcnt, remoteIov?.value?.toCPointer<ByteVar>(), riovcnt, flags)

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_futimes(fd, times?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    libc_unix_linuxlike_linux_l4re_shared_strerrorR(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun abs(i: CInt): CInt =
    libc_unix_linuxlike_linux_l4re_shared_abs(i)

public actual fun labs(i: CLong): CLong =
    libc_unix_linuxlike_linux_l4re_shared_labs(i)

public actual fun rand(): CInt =
    libc_unix_linuxlike_linux_l4re_shared_rand()

public actual fun srand(seed: CUint) {
    libc_unix_linuxlike_linux_l4re_shared_srand(seed)
}

public actual fun drand48(): CDouble =
    libc_unix_linuxlike_linux_l4re_shared_drand48()

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    libc_unix_linuxlike_linux_l4re_shared_erand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun lrand48(): CLong =
    libc_unix_linuxlike_linux_l4re_shared_lrand48()

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    libc_unix_linuxlike_linux_l4re_shared_nrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    libc_unix_linuxlike_linux_l4re_shared_jrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun srand48(seed: CLong) {
    libc_unix_linuxlike_linux_l4re_shared_srand48(seed)
}

public actual fun setpwent() {
    libc_unix_linuxlike_linux_l4re_shared_setpwent()
}

public actual fun endpwent() {
    libc_unix_linuxlike_linux_l4re_shared_endpwent()
}

public actual fun getpwent(): COpaquePointer? =
    libc_unix_linuxlike_linux_l4re_shared_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    libc_unix_linuxlike_linux_l4re_shared_setgrent()
}

public actual fun endgrent() {
    libc_unix_linuxlike_linux_l4re_shared_endgrent()
}

public actual fun getgrent(): COpaquePointer? =
    libc_unix_linuxlike_linux_l4re_shared_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun setspent() {
    libc_unix_linuxlike_linux_l4re_shared_setspent()
}

public actual fun endspent() {
    libc_unix_linuxlike_linux_l4re_shared_endspent()
}

public actual fun getspent(): COpaquePointer? =
    libc_unix_linuxlike_linux_l4re_shared_getspent()?.let { COpaquePointer(it.toLong()) }

public actual fun getspnam(name: String?): COpaquePointer? =
    libc_unix_linuxlike_linux_l4re_shared_getspnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    libc_unix_linuxlike_linux_l4re_shared_shmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    libc_unix_linuxlike_linux_l4re_shared_shmat(shmid, shmaddr?.value?.toCPointer<ByteVar>(), shmflg)?.let { COpaquePointer(it.toLong()) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_shmdt(shmaddr?.value?.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_shmctl(shmid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    libc_unix_linuxlike_linux_l4re_shared_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun errnoLocation(): COpaquePointer? =
    libc_unix_linuxlike_linux_l4re_shared_errnoLocation()?.let { COpaquePointer(it.toLong()) }

public actual fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    libc_unix_linuxlike_linux_l4re_shared_mremap(addr?.value?.toCPointer<ByteVar>(), len, newLen, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.let { COpaquePointer(it.toLong()) }

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_glob(pattern, flags, 0L.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: COpaquePointer?) {
    libc_unix_linuxlike_linux_l4re_shared_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    libc_unix_linuxlike_linux_l4re_shared_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    libc_unix_linuxlike_linux_l4re_shared_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    libc_unix_linuxlike_linux_l4re_shared_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    libc_unix_linuxlike_linux_l4re_shared_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    libc_unix_linuxlike_linux_l4re_shared_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    libc_unix_linuxlike_linux_l4re_shared_nlLanginfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    libc_unix_linuxlike_linux_l4re_shared_nlLanginfoL(item, locale?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_schedGetaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libc_unix_linuxlike_linux_l4re_shared_schedGetPriorityMax(policy)

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_semTimedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_semGetvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_mount(src, target, fstype, flags, data?.value?.toCPointer<ByteVar>())

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    libc_unix_linuxlike_linux_l4re_shared_prctl(option, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_ppoll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun sethostname(name: String?, len: SizeT): CInt =
    libc_unix_linuxlike_linux_l4re_shared_sethostname(name, len)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libc_unix_linuxlike_linux_l4re_shared_schedGetPriorityMin(policy)

public actual fun sysinfo(info: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_sysinfo(info?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_getgrgidR(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_semClose(sem?.value?.toCPointer<ByteVar>())

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_getgrnamR(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun initgroups(user: String?, group: GidT): CInt =
    libc_unix_linuxlike_linux_l4re_shared_initgroups(user, group)

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    libc_unix_linuxlike_linux_l4re_shared_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnam(name: String?): COpaquePointer? =
    libc_unix_linuxlike_linux_l4re_shared_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun semUnlink(name: String?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_semUnlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libc_unix_linuxlike_linux_l4re_shared_daemon(nochdir, noclose)

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    libc_unix_linuxlike_linux_l4re_shared_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun popen(command: String?, mode: String?): FILE? =
    libc_unix_linuxlike_linux_l4re_shared_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    libc_unix_linuxlike_linux_l4re_shared_faccessat(dirfd, pathname, mode, flags)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_dlIteratePhdr(0L.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    libc_unix_linuxlike_linux_l4re_shared_setmntent(filename, ty)?.let { FILE(it.toLong()) }

public actual fun getmntent(stream: FILE?): COpaquePointer? =
    libc_unix_linuxlike_linux_l4re_shared_getmntent(stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun addmntent(stream: FILE?, mnt: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_addmntent(stream?.handle?.toCPointer<ByteVar>(), mnt?.value?.toCPointer<ByteVar>())

public actual fun endmntent(streamp: FILE?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_endmntent(streamp?.handle?.toCPointer<ByteVar>())

public actual fun hasmntopt(mnt: COpaquePointer?, opt: String?): COpaquePointer? =
    libc_unix_linuxlike_linux_l4re_shared_hasmntopt(mnt?.value?.toCPointer<ByteVar>(), opt)?.let { COpaquePointer(it.toLong()) }

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    libc_unix_linuxlike_linux_l4re_shared_regcomp(preg?.value?.toCPointer<ByteVar>(), pattern, cflags)

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    libc_unix_linuxlike_linux_l4re_shared_regexec(preg?.value?.toCPointer<ByteVar>(), input, nmatch, pmatch?.value?.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    libc_unix_linuxlike_linux_l4re_shared_regerror(errcode, preg?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: COpaquePointer?) {
    libc_unix_linuxlike_linux_l4re_shared_regfree(preg?.value?.toCPointer<ByteVar>())
}

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    libc_unix_linuxlike_linux_l4re_shared_iconvOpen(tocode, fromcode)?.let { COpaquePointer(it.toLong()) }

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    libc_unix_linuxlike_linux_l4re_shared_iconv(cd?.value?.toCPointer<ByteVar>(), inbuf?.value?.toCPointer<ByteVar>(), inbytesleft?.value?.toCPointer<ByteVar>(), outbuf?.value?.toCPointer<ByteVar>(), outbytesleft?.value?.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    libc_unix_linuxlike_linux_l4re_shared_iconvClose(cd?.value?.toCPointer<ByteVar>())

public actual fun gettid(): PidT =
    libc_unix_linuxlike_linux_l4re_shared_gettid()

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_timerCreate(clockid, sevp?.value?.toCPointer<ByteVar>(), timerid?.value?.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    libc_unix_linuxlike_linux_l4re_shared_timerDelete(timerid?.value?.toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    libc_unix_linuxlike_linux_l4re_shared_timerGetoverrun(timerid?.value?.toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_timerGettime(timerid?.value?.toCPointer<ByteVar>(), currValue?.value?.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_timerSettime(timerid?.value?.toCPointer<ByteVar>(), flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    libc_unix_linuxlike_linux_l4re_shared_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun schedGetcpu(): CInt =
    libc_unix_linuxlike_linux_l4re_shared_schedGetcpu()

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_getoptLong(argc, argv?.value?.toCPointer<ByteVar>(), optstring, longopts?.value?.toCPointer<ByteVar>(), longindex?.value?.toCPointer<ByteVar>())

public actual fun copyFileRange(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    libc_unix_linuxlike_linux_l4re_shared_copyFileRange(fdIn, offIn?.value?.toCPointer<ByteVar>(), fdOut, offOut?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    libc_unix_linuxlike_linux_l4re_shared_freopen64(filename, mode, file?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    libc_unix_linuxlike_linux_l4re_shared_fseeko64(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun fsetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_l4re_shared_fsetpos64(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun ftello64(stream: FILE?): Off64T =
    libc_unix_linuxlike_linux_l4re_shared_ftello64(stream?.handle?.toCPointer<ByteVar>())
