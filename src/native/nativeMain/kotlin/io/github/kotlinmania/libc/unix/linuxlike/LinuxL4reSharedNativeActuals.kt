@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedAbs
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedAddmntent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedAioCancel
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedAioError
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedAioFsync
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedAioRead
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedAioReturn
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedAioSuspend
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedAioWrite
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedCopyFileRange
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedDaemon
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedDlIteratePhdr
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedDrand48
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedEndgrent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedEndmntent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedEndpwent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedEndspent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedErand48
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedErrnoLocation
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedFaccessat
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedFreopen64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedFseeko64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedFsetpos64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedFtello64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedFutimes
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedGetgrent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedGetgrgid
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedGetgrgidR
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedGetgrnam
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedGetgrnamR
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedGetloadavg
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedGetmntent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedGetnameinfo
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedGetoptLong
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedGetpwent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedGetspent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedGetspnam
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedGettid
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedGlob
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedGlobfree
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedHasmntopt
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedIconv
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedIconvClose
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedIconvOpen
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedInitgroups
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedIoperm
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedIopl
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedJrand48
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedLabs
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedLioListio
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedLrand48
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedMadvise
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedMemmem
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedMount
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedMprotect
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedMremap
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedMsync
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedNlLanginfo
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedNlLanginfoL
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedNrand48
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedPopen
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedPpoll
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedPrctl
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedPreadv
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedProcessVmReadv
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedProcessVmWritev
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedPwritev
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedRand
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedRecvfrom
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedRegcomp
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedRegerror
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedRegexec
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedRegfree
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMax
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMin
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSchedGetaffinity
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSchedGetcpu
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSeekdir
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSemClose
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSemGetvalue
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSemOpen
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSemTimedwait
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSemUnlink
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSetgrent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSethostname
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSetmntent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSetpwent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSetspent
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSettimeofday
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedShmat
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedShmctl
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedShmdt
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedShmget
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSigsuspend
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSigwait
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSrand
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSrand48
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedStrerrorR
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedSysinfo
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedTelldir
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedTimerCreate
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedTimerDelete
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedTimerGetoverrun
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedTimerGettime
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLinuxL4reSharedTimerSettime
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NlItem
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun iopl(level: CInt): CInt =
    libcUnixLinuxlikeLinuxL4reSharedIopl(level)

public actual fun ioperm(from: CUlong, num: CUlong, turnOn: CInt): CInt =
    libcUnixLinuxlikeLinuxL4reSharedIoperm(from, num, turnOn)

public actual fun aioRead(aiocbp: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedAioRead(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedAioWrite(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedAioFsync(op, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedAioError(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    libcUnixLinuxlikeLinuxL4reSharedAioReturn(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedAioSuspend(aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedAioCancel(fd, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedLioListio(mode, aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, sevp.rawAddress.toCPointer<ByteVar>())

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    libcUnixLinuxlikeLinuxL4reSharedPwritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    libcUnixLinuxlikeLinuxL4reSharedPreadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxL4reSharedGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt =
    libcUnixLinuxlikeLinuxL4reSharedGetloadavg(loadavg.rawAddress.toCPointer<ByteVar>(), nelem)

public actual fun processVmReadv(pid: PidT, localIov: ConstPtr, liovcnt: CUlong, remoteIov: ConstPtr, riovcnt: CUlong, flags: CUlong): Long =
    libcUnixLinuxlikeLinuxL4reSharedProcessVmReadv(pid, localIov.rawAddress.toCPointer<ByteVar>(), liovcnt, remoteIov.rawAddress.toCPointer<ByteVar>(), riovcnt, flags)

public actual fun processVmWritev(pid: PidT, localIov: ConstPtr, liovcnt: CUlong, remoteIov: ConstPtr, riovcnt: CUlong, flags: CUlong): Long =
    libcUnixLinuxlikeLinuxL4reSharedProcessVmWritev(pid, localIov.rawAddress.toCPointer<ByteVar>(), liovcnt, remoteIov.rawAddress.toCPointer<ByteVar>(), riovcnt, flags)

public actual fun futimes(fd: CInt, times: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedFutimes(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    libcUnixLinuxlikeLinuxL4reSharedStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun abs(i: CInt): CInt =
    libcUnixLinuxlikeLinuxL4reSharedAbs(i)

public actual fun labs(i: CLong): CLong =
    libcUnixLinuxlikeLinuxL4reSharedLabs(i)

public actual fun rand(): CInt =
    libcUnixLinuxlikeLinuxL4reSharedRand()

public actual fun srand(seed: CUint) {
    libcUnixLinuxlikeLinuxL4reSharedSrand(seed)
}

public actual fun drand48(): CDouble =
    libcUnixLinuxlikeLinuxL4reSharedDrand48()

public actual fun erand48(xseed: MutPtr): CDouble =
    libcUnixLinuxlikeLinuxL4reSharedErand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun lrand48(): CLong =
    libcUnixLinuxlikeLinuxL4reSharedLrand48()

public actual fun nrand48(xseed: MutPtr): CLong =
    libcUnixLinuxlikeLinuxL4reSharedNrand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun jrand48(xseed: MutPtr): CLong =
    libcUnixLinuxlikeLinuxL4reSharedJrand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun srand48(seed: CLong) {
    libcUnixLinuxlikeLinuxL4reSharedSrand48(seed)
}

public actual fun setpwent() {
    libcUnixLinuxlikeLinuxL4reSharedSetpwent()
}

public actual fun endpwent() {
    libcUnixLinuxlikeLinuxL4reSharedEndpwent()
}

public actual fun getpwent(): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedGetpwent()?.toLong() ?: 0L)

public actual fun setgrent() {
    libcUnixLinuxlikeLinuxL4reSharedSetgrent()
}

public actual fun endgrent() {
    libcUnixLinuxlikeLinuxL4reSharedEndgrent()
}

public actual fun getgrent(): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedGetgrent()?.toLong() ?: 0L)

public actual fun setspent() {
    libcUnixLinuxlikeLinuxL4reSharedSetspent()
}

public actual fun endspent() {
    libcUnixLinuxlikeLinuxL4reSharedEndspent()
}

public actual fun getspent(): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedGetspent()?.toLong() ?: 0L)

public actual fun getspnam(name: ConstPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedGetspnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    libcUnixLinuxlikeLinuxL4reSharedShmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedShmat(shmid, shmaddr.rawAddress.toCPointer<ByteVar>(), shmflg)?.toLong() ?: 0L)

public actual fun shmdt(shmaddr: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedShmdt(shmaddr.rawAddress.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedShmctl(shmid, cmd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    libcUnixLinuxlikeLinuxL4reSharedMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun errnoLocation(): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedErrnoLocation()?.toLong() ?: 0L)

public actual fun mremap(addr: MutPtr, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedMremap(addr.rawAddress.toCPointer<ByteVar>(), len, newLen, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedGlob(pattern.rawAddress.toCPointer<ByteVar>(), flags, 0L.toCPointer<ByteVar>(), pglob.rawAddress.toCPointer<ByteVar>())

public actual fun globfree(pglob: MutPtr) {
    libcUnixLinuxlikeLinuxL4reSharedGlobfree(pglob.rawAddress.toCPointer<ByteVar>())
}

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    libcUnixLinuxlikeLinuxL4reSharedSeekdir(dirp.rawAddress.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: MutPtr): CLong =
    libcUnixLinuxlikeLinuxL4reSharedTelldir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    libcUnixLinuxlikeLinuxL4reSharedMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxL4reSharedMsync(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    libcUnixLinuxlikeLinuxL4reSharedRecvfrom(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun nlLanginfo(item: NlItem): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedNlLanginfo(item)?.toLong() ?: 0L)

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedNlLanginfoL(item, locale.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedSchedGetaffinity(pid, cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMax(policy)

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedSettimeofday(tv.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedSemTimedwait(sem.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedSemGetvalue(sem.rawAddress.toCPointer<ByteVar>(), sval.rawAddress.toCPointer<ByteVar>())

public actual fun mount(src: ConstPtr, target: ConstPtr, fstype: ConstPtr, flags: CUlong, data: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedMount(src.rawAddress.toCPointer<ByteVar>(), target.rawAddress.toCPointer<ByteVar>(), fstype.rawAddress.toCPointer<ByteVar>(), flags, data.rawAddress.toCPointer<ByteVar>())

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    libcUnixLinuxlikeLinuxL4reSharedPrctl(option, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedPpoll(fds.rawAddress.toCPointer<ByteVar>(), nfds, timeout.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun sethostname(name: ConstPtr, len: SizeT): CInt =
    libcUnixLinuxlikeLinuxL4reSharedSethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMin(policy)

public actual fun sysinfo(info: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedSysinfo(info.rawAddress.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedSigsuspend(mask.rawAddress.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedGetgrgidR(gid, grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun semClose(sem: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedSemClose(sem.rawAddress.toCPointer<ByteVar>())

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedGetgrnamR(name.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun initgroups(user: ConstPtr, group: GidT): CInt =
    libcUnixLinuxlikeLinuxL4reSharedInitgroups(user.rawAddress.toCPointer<ByteVar>(), group)

public actual fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedSemOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun getgrnam(name: ConstPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedGetgrnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun semUnlink(name: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedSemUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libcUnixLinuxlikeLinuxL4reSharedDaemon(nochdir, noclose)

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedSigwait(set.rawAddress.toCPointer<ByteVar>(), sig.rawAddress.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedGetgrgid(gid)?.toLong() ?: 0L)

public actual fun popen(command: ConstPtr, mode: ConstPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedPopen(command.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxL4reSharedFaccessat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedDlIteratePhdr(0L.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>())

public actual fun setmntent(filename: ConstPtr, ty: ConstPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedSetmntent(filename.rawAddress.toCPointer<ByteVar>(), ty.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getmntent(stream: MutPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedGetmntent(stream.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun addmntent(stream: MutPtr, mnt: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedAddmntent(stream.rawAddress.toCPointer<ByteVar>(), mnt.rawAddress.toCPointer<ByteVar>())

public actual fun endmntent(streamp: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedEndmntent(streamp.rawAddress.toCPointer<ByteVar>())

public actual fun hasmntopt(mnt: ConstPtr, opt: ConstPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedHasmntopt(mnt.rawAddress.toCPointer<ByteVar>(), opt.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun regcomp(preg: MutPtr, pattern: ConstPtr, cflags: CInt): CInt =
    libcUnixLinuxlikeLinuxL4reSharedRegcomp(preg.rawAddress.toCPointer<ByteVar>(), pattern.rawAddress.toCPointer<ByteVar>(), cflags)

public actual fun regexec(preg: ConstPtr, input: ConstPtr, nmatch: SizeT, pmatch: MutPtr, eflags: CInt): CInt =
    libcUnixLinuxlikeLinuxL4reSharedRegexec(preg.rawAddress.toCPointer<ByteVar>(), input.rawAddress.toCPointer<ByteVar>(), nmatch, pmatch.rawAddress.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: ConstPtr, errbuf: MutPtr, errbufSize: SizeT): SizeT =
    libcUnixLinuxlikeLinuxL4reSharedRegerror(errcode, preg.rawAddress.toCPointer<ByteVar>(), errbuf.rawAddress.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: MutPtr) {
    libcUnixLinuxlikeLinuxL4reSharedRegfree(preg.rawAddress.toCPointer<ByteVar>())
}

public actual fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedIconvOpen(tocode.rawAddress.toCPointer<ByteVar>(), fromcode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT =
    libcUnixLinuxlikeLinuxL4reSharedIconv(cd.rawAddress.toCPointer<ByteVar>(), inbuf.rawAddress.toCPointer<ByteVar>(), inbytesleft.rawAddress.toCPointer<ByteVar>(), outbuf.rawAddress.toCPointer<ByteVar>(), outbytesleft.rawAddress.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    libcUnixLinuxlikeLinuxL4reSharedIconvClose(cd.rawAddress.toCPointer<ByteVar>())

public actual fun gettid(): PidT =
    libcUnixLinuxlikeLinuxL4reSharedGettid()

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr, timerid: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedTimerCreate(clockid, sevp.rawAddress.toCPointer<ByteVar>(), timerid.rawAddress.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    libcUnixLinuxlikeLinuxL4reSharedTimerDelete(timerid.rawAddress.toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    libcUnixLinuxlikeLinuxL4reSharedTimerGetoverrun(timerid.rawAddress.toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedTimerGettime(timerid.rawAddress.toCPointer<ByteVar>(), currValue.rawAddress.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedTimerSettime(timerid.rawAddress.toCPointer<ByteVar>(), flags, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedMemmem(haystack.rawAddress.toCPointer<ByteVar>(), haystacklen, needle.rawAddress.toCPointer<ByteVar>(), needlelen)?.toLong() ?: 0L)

public actual fun schedGetcpu(): CInt =
    libcUnixLinuxlikeLinuxL4reSharedSchedGetcpu()

public actual fun getoptLong(argc: CInt, argv: ConstPtr, optstring: ConstPtr, longopts: ConstPtr, longindex: MutPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedGetoptLong(argc, argv.rawAddress.toCPointer<ByteVar>(), optstring.rawAddress.toCPointer<ByteVar>(), longopts.rawAddress.toCPointer<ByteVar>(), longindex.rawAddress.toCPointer<ByteVar>())

public actual fun copyFileRange(fdIn: CInt, offIn: MutPtr, fdOut: CInt, offOut: MutPtr, len: SizeT, flags: CUint): SsizeT =
    libcUnixLinuxlikeLinuxL4reSharedCopyFileRange(fdIn, offIn.rawAddress.toCPointer<ByteVar>(), fdOut, offOut.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun freopen64(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxL4reSharedFreopen64(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fseeko64(stream: MutPtr, offset: Off64T, whence: CInt): CInt =
    libcUnixLinuxlikeLinuxL4reSharedFseeko64(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun fsetpos64(stream: MutPtr, ptr: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxL4reSharedFsetpos64(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun ftello64(stream: MutPtr): Off64T =
    libcUnixLinuxlikeLinuxL4reSharedFtello64(stream.rawAddress.toCPointer<ByteVar>())
