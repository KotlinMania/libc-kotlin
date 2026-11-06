@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun iopl(level: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_iopl(level)

public actual fun ioperm(from: CUlong, num: CUlong, turnOn: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_ioperm(from, num, turnOn)

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_aio_read(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_aio_write(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_aio_fsync(op, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_aio_error(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_aio_return(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_aio_suspend(aiocbList?.value?.toCPointer<ByteVar>(), nitems, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_aio_cancel(fd, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_lio_listio(mode, aiocbList?.value?.toCPointer<ByteVar>(), nitems, sevp?.value?.toCPointer<ByteVar>())

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_getloadavg(loadavg?.value?.toCPointer<ByteVar>(), nelem)

public actual fun processVmReadv(pid: PidT, localIov: Iovec?, liovcnt: CUlong, remoteIov: Iovec?, riovcnt: CUlong, flags: CUlong): Long =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_process_vm_readv(pid, localIov?.value?.toCPointer<ByteVar>(), liovcnt, remoteIov?.value?.toCPointer<ByteVar>(), riovcnt, flags)

public actual fun processVmWritev(pid: PidT, localIov: Iovec?, liovcnt: CUlong, remoteIov: Iovec?, riovcnt: CUlong, flags: CUlong): Long =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_process_vm_writev(pid, localIov?.value?.toCPointer<ByteVar>(), liovcnt, remoteIov?.value?.toCPointer<ByteVar>(), riovcnt, flags)

public actual fun futimes(fd: CInt, times: Timeval?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_futimes(fd, times?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_strerror_r(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun abs(i: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_abs(i)

public actual fun labs(i: CLong): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_labs(i)

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_rand()

public actual fun srand(seed: CUint) {
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_srand(seed)
}

public actual fun drand48(): CDouble =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_drand48()

public actual fun erand48(xseed: CUshort?): CDouble =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_erand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun lrand48(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_lrand48()

public actual fun nrand48(xseed: CUshort?): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_nrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun jrand48(xseed: CUshort?): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_jrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun srand48(seed: CLong) {
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_srand48(seed)
}

public actual fun setpwent() {
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_setpwent()
}

public actual fun endpwent() {
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_endpwent()
}

public actual fun getpwent(): Passwd? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_setgrent()
}

public actual fun endgrent() {
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_endgrent()
}

public actual fun getgrent(): Group? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun setspent() {
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_setspent()
}

public actual fun endspent() {
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_endspent()
}

public actual fun getspent(): Spwd? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_getspent()?.let { COpaquePointer(it.toLong()) }

public actual fun getspnam(name: String?): Spwd? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_getspnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_shmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_shmat(shmid, shmaddr?.value?.toCPointer<ByteVar>(), shmflg)?.let { COpaquePointer(it.toLong()) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_shmdt(shmaddr?.value?.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_shmctl(shmid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun errnoLocation(): CInt? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_errno_location()?.let { COpaquePointer(it.toLong()) }

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_glob(pattern, flags, errfunc?.value?.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_nl_langinfo(item.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_nl_langinfo_l(item.toInt(), locale.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_sched_getaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_sched_get_priority_max(policy)

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_sem_timedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_sem_getvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_mount(src, target, fstype, flags, data?.value?.toCPointer<ByteVar>())

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_ppoll(fds?.value?.toCPointer<ByteVar>(), nfds.toInt(), timeout?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun sethostname(name: String?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_sethostname(name, len)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_sched_get_priority_min(policy)

public actual fun sysinfo(info: Sysinfo?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_sysinfo(info?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_getgrgid_r(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: SemT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_sem_close(sem?.value?.toCPointer<ByteVar>())

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_getgrnam_r(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun initgroups(user: String?, group: GidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_initgroups(user, group)

public actual fun getgrnam(name: String?): Group? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun semUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_sem_unlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_daemon(nochdir, noclose)

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): Group? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun popen(command: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_faccessat(dirfd, pathname, mode, flags)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_dl_iterate_phdr(callback?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_setmntent(filename, ty)?.let { FILE(it.toLong()) }

public actual fun getmntent(stream: FILE?): io.github.kotlinmania.libc.Mntent? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_getmntent(stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun addmntent(stream: FILE?, mnt: io.github.kotlinmania.libc.Mntent?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_addmntent(stream?.handle?.toCPointer<ByteVar>(), mnt?.value?.toCPointer<ByteVar>())

public actual fun endmntent(streamp: FILE?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_endmntent(streamp?.handle?.toCPointer<ByteVar>())

public actual fun hasmntopt(mnt: io.github.kotlinmania.libc.Mntent?, opt: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_hasmntopt(mnt?.value?.toCPointer<ByteVar>(), opt)?.let { COpaquePointer(it.toLong()) }

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_regcomp(preg?.value?.toCPointer<ByteVar>(), pattern, cflags)

public actual fun regexec(preg: RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_regexec(preg?.value?.toCPointer<ByteVar>(), input, nmatch, pmatch?.value?.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_regerror(errcode, preg?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: RegexT?) {
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_regfree(preg?.value?.toCPointer<ByteVar>())
}

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_iconv_open(tocode, fromcode)?.let { COpaquePointer(it.toLong()) }

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_iconv(cd?.value?.toCPointer<ByteVar>(), inbuf?.value?.toCPointer<ByteVar>(), inbytesleft?.value?.toCPointer<ByteVar>(), outbuf?.value?.toCPointer<ByteVar>(), outbytesleft?.value?.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_iconv_close(cd?.value?.toCPointer<ByteVar>())

public actual fun gettid(): PidT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_gettid()

public actual fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: TimerT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_timer_create(clockid, sevp?.value?.toCPointer<ByteVar>(), timerid?.value?.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_timer_delete(timerid.toInt())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_timer_getoverrun(timerid.toInt())

public actual fun timerGettime(timerid: TimerT, currValue: io.github.kotlinmania.libc.Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_timer_gettime(timerid.toInt(), currValue?.value?.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: io.github.kotlinmania.libc.Itimerspec?, oldValue: io.github.kotlinmania.libc.Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_timer_settime(timerid.toInt(), flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun schedGetcpu(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_sched_getcpu()

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_getopt_long(argc, argv?.value?.toCPointer<ByteVar>(), optstring, longopts?.value?.toCPointer<ByteVar>(), longindex?.value?.toCPointer<ByteVar>())

public actual fun copyFileRange(fdIn: CInt, offIn: Off64T?, fdOut: CInt, offOut: Off64T?, len: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_copy_file_range(fdIn, offIn?.value?.toCPointer<ByteVar>(), fdOut, offOut?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_freopen64(filename, mode, file?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_fseeko64(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun fsetpos64(stream: FILE?, ptr: io.github.kotlinmania.libc.Fpos64T?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_fsetpos64(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun ftello64(stream: FILE?): Off64T =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_l4re_shared_ftello64(stream?.handle?.toCPointer<ByteVar>())
