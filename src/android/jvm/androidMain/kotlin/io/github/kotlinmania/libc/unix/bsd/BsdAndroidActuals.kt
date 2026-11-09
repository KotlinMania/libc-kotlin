@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.apple.ModeT
import io.github.kotlinmania.libc.unix.bsd.apple.NlItem

private object UnixBsdJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_bsd_getrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_setrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_strerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_abs(i: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_labs(i: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_rand(): Int

    @JvmStatic
    external fun libc_unix_bsd_srand(seed: Int)

    @JvmStatic
    external fun libc_unix_bsd_getifaddrs(ifap: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freeifaddrs(ifa: Long)

    @JvmStatic
    external fun libc_unix_bsd_setgroups(ngroups: Int, ptr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_setlogin(name: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_kqueue(): Int

    @JvmStatic
    external fun libc_unix_bsd_unmount(target: String?, arg: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_getpwent(): Long

    @JvmStatic
    external fun libc_unix_bsd_setpwent()

    @JvmStatic
    external fun libc_unix_bsd_endpwent()

    @JvmStatic
    external fun libc_unix_bsd_endgrent()

    @JvmStatic
    external fun libc_unix_bsd_getgrent(): Long

    @JvmStatic
    external fun libc_unix_bsd_getprogname(): Long

    @JvmStatic
    external fun libc_unix_bsd_setprogname(name: String?)

    @JvmStatic
    external fun libc_unix_bsd_getloadavg(loadavg: Long, nelem: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_ifNameindex(): Long

    @JvmStatic
    external fun libc_unix_bsd_ifFreenameindex(ptr: Long)

    @JvmStatic
    external fun libc_unix_bsd_getpeereid(socket: Int, euid: Long, egid: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_glob(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_globfree(pglob: Long)

    @JvmStatic
    external fun libc_unix_bsd_posixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_shmUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_seekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libc_unix_bsd_telldir(dirp: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_madvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_msync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_mkstemps(template: Long, suffixlen: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_futimes(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_nlLanginfo(item: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_bind(socket: Int, address: Long, addressLen: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_writev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_readv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_sendmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_recvmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_sync()

    @JvmStatic
    external fun libc_unix_bsd_getgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_sigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_sigsuspend(mask: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_semClose(sem: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_getdtablesize(): Int

    @JvmStatic
    external fun libc_unix_bsd_getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_pthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_getgrnam(name: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_pthreadCancel(thread: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_pthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_schedGetPriorityMin(policy: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_schedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_semUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_getpwuidR(uid: Short, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_sigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_pthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_getgrgid(gid: Short): Long

    @JvmStatic
    external fun libc_unix_bsd_popen(command: String?, mode: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_acct(filename: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_wait4(pid: Int, status: Long, options: Int, rusage: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_getitimer(which: Int, currValue: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_setitimer(which: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_regcomp(preg: Long, pattern: String?, cflags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_regexec(preg: Long, input: String?, nmatch: Long, pmatch: Long, eflags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_regerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_regfree(preg: Long)

    @JvmStatic
    external fun libc_unix_bsd_arc4random(): Int

    @JvmStatic
    external fun libc_unix_bsd_arc4randomBuf(buf: Long, size: Long)

    @JvmStatic
    external fun libc_unix_bsd_arc4randomUniform(l: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_drand48(): Double

    @JvmStatic
    external fun libc_unix_bsd_erand48(xseed: Long): Double

    @JvmStatic
    external fun libc_unix_bsd_lrand48(): Long

    @JvmStatic
    external fun libc_unix_bsd_nrand48(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_mrand48(): Long

    @JvmStatic
    external fun libc_unix_bsd_jrand48(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_srand48(seed: Long)

    @JvmStatic
    external fun libc_unix_bsd_seed48(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_lcong48(p: Long)

    @JvmStatic
    external fun libc_unix_bsd_getoptLong(argc: Int, argv: Long, optstring: String?, longopts: Long, longindex: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_strftime(buf: Long, maxsize: Long, format: String?, timeptr: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_strftimeL(buf: Long, maxsize: Long, format: String?, timeptr: Long, locale: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_devname(dev: Int, modeT: Short): Long

    @JvmStatic
    external fun libc_unix_bsd_issetugid(): Int
}

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_getrlimit(resource, (rlim?.value ?: 0L))

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_setrlimit(resource, (rlim?.value ?: 0L))

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixBsdJniBridge.libc_unix_bsd_strerrorR(errnum, (buf?.value ?: 0L), buflen.toLong())

public actual fun abs(i: CInt): CInt =
    UnixBsdJniBridge.libc_unix_bsd_abs(i)

public actual fun labs(i: CLong): CLong =
    UnixBsdJniBridge.libc_unix_bsd_labs(i)

public actual fun rand(): CInt =
    UnixBsdJniBridge.libc_unix_bsd_rand()

public actual fun srand(seed: CUint) {
    UnixBsdJniBridge.libc_unix_bsd_srand(seed.toInt())
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_getifaddrs((ifap?.value ?: 0L))

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    UnixBsdJniBridge.libc_unix_bsd_freeifaddrs((ifa?.value ?: 0L))
}

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_setgroups(ngroups, (ptr?.value ?: 0L))

public actual fun setlogin(name: String?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_setlogin(name)

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    0

public actual fun kqueue(): CInt =
    UnixBsdJniBridge.libc_unix_bsd_kqueue()

public actual fun unmount(target: String?, arg: CInt): CInt =
    UnixBsdJniBridge.libc_unix_bsd_unmount(target, arg)

public actual fun syscall(num: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun getpwent(): COpaquePointer? =
    UnixBsdJniBridge.libc_unix_bsd_getpwent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setpwent() {
    UnixBsdJniBridge.libc_unix_bsd_setpwent()
}

public actual fun endpwent() {
    UnixBsdJniBridge.libc_unix_bsd_endpwent()
}

public actual fun endgrent() {
    UnixBsdJniBridge.libc_unix_bsd_endgrent()
}

public actual fun getgrent(): COpaquePointer? =
    UnixBsdJniBridge.libc_unix_bsd_getgrent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getprogname(): COpaquePointer? =
    UnixBsdJniBridge.libc_unix_bsd_getprogname().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setprogname(name: String?) {
    UnixBsdJniBridge.libc_unix_bsd_setprogname(name)
}

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    UnixBsdJniBridge.libc_unix_bsd_getloadavg((loadavg?.value ?: 0L), nelem)

public actual fun ifNameindex(): COpaquePointer? =
    UnixBsdJniBridge.libc_unix_bsd_ifNameindex().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    UnixBsdJniBridge.libc_unix_bsd_ifFreenameindex((ptr?.value ?: 0L))
}

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_getpeereid(socket, (euid?.value ?: 0L), (egid?.value ?: 0L))

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_glob(pattern, flags, 0L, (pglob?.value ?: 0L))

public actual fun globfree(pglob: COpaquePointer?) {
    UnixBsdJniBridge.libc_unix_bsd_globfree((pglob?.value ?: 0L))
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    UnixBsdJniBridge.libc_unix_bsd_posixMadvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun shmUnlink(name: String?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    UnixBsdJniBridge.libc_unix_bsd_seekdir((dirp?.handle ?: 0L), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    UnixBsdJniBridge.libc_unix_bsd_telldir((dirp?.handle ?: 0L))

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    UnixBsdJniBridge.libc_unix_bsd_madvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    UnixBsdJniBridge.libc_unix_bsd_msync((addr?.value ?: 0L), len.toLong(), flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    UnixBsdJniBridge.libc_unix_bsd_recvfrom(socket, (buf?.value ?: 0L), len.toLong(), flags, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    UnixBsdJniBridge.libc_unix_bsd_mkstemps((template?.value ?: 0L), suffixlen)

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_futimes(fd, (times?.value ?: 0L))

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    UnixBsdJniBridge.libc_unix_bsd_nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    UnixBsdJniBridge.libc_unix_bsd_bind(socket, (address?.value ?: 0L), addressLen.toInt())

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    UnixBsdJniBridge.libc_unix_bsd_writev(fd, (iov?.value ?: 0L), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    UnixBsdJniBridge.libc_unix_bsd_readv(fd, (iov?.value ?: 0L), iovcnt)

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixBsdJniBridge.libc_unix_bsd_sendmsg(fd, (msg?.value ?: 0L), flags)

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixBsdJniBridge.libc_unix_bsd_recvmsg(fd, (msg?.value ?: 0L), flags)

public actual fun sync() {
    UnixBsdJniBridge.libc_unix_bsd_sync()
}

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_getgrgidR(gid.toShort(), (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_sigaltstack((ss?.value ?: 0L), (oss?.value ?: 0L))

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_sigsuspend((mask?.value ?: 0L))

public actual fun semClose(sem: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_semClose((sem?.value ?: 0L))

public actual fun getdtablesize(): CInt =
    UnixBsdJniBridge.libc_unix_bsd_getdtablesize()

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_getgrnamR(name, (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_pthreadSigmask(how, (set?.value ?: 0L), (oldset?.value ?: 0L))

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    UnixBsdJniBridge.libc_unix_bsd_getgrnam(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadCancel(thread: PthreadT): CInt =
    UnixBsdJniBridge.libc_unix_bsd_pthreadCancel(thread.toLong())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    UnixBsdJniBridge.libc_unix_bsd_pthreadKill(thread.toLong(), sig)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    UnixBsdJniBridge.libc_unix_bsd_schedGetPriorityMin(policy)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    UnixBsdJniBridge.libc_unix_bsd_schedGetPriorityMax(policy)

public actual fun semUnlink(name: String?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_semUnlink(name)

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_getpwnamR(name, (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_getpwuidR(uid.toShort(), (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_sigwait((set?.value ?: 0L), (sig?.value ?: 0L))

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_pthreadAtfork(0L, 0L, 0L)

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    UnixBsdJniBridge.libc_unix_bsd_getgrgid(gid.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun popen(command: String?, mode: String?): FILE? =
    UnixBsdJniBridge.libc_unix_bsd_popen(command, mode).let { if (it == 0L) null else FILE(it) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    UnixBsdJniBridge.libc_unix_bsd_faccessat(dirfd, pathname, mode, flags)

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_pthreadCreate((native?.value ?: 0L), (attr?.value ?: 0L), 0L, (value?.value ?: 0L))

public actual fun acct(filename: String?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_acct(filename)

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    UnixBsdJniBridge.libc_unix_bsd_wait4(pid, (status?.value ?: 0L), options, (rusage?.value ?: 0L))

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_getitimer(which, (currValue?.value ?: 0L))

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_setitimer(which, (newValue?.value ?: 0L), (oldValue?.value ?: 0L))

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    UnixBsdJniBridge.libc_unix_bsd_regcomp((preg?.value ?: 0L), pattern, cflags)

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    UnixBsdJniBridge.libc_unix_bsd_regexec((preg?.value ?: 0L), input, nmatch.toLong(), (pmatch?.value ?: 0L), eflags)

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    UnixBsdJniBridge.libc_unix_bsd_regerror(errcode, (preg?.value ?: 0L), (errbuf?.value ?: 0L), errbufSize.toLong()).toULong()

public actual fun regfree(preg: COpaquePointer?) {
    UnixBsdJniBridge.libc_unix_bsd_regfree((preg?.value ?: 0L))
}

public actual fun arc4random(): UInt =
    UnixBsdJniBridge.libc_unix_bsd_arc4random().toUInt()

public actual fun arc4randomBuf(buf: COpaquePointer?, size: SizeT) {
    UnixBsdJniBridge.libc_unix_bsd_arc4randomBuf((buf?.value ?: 0L), size.toLong())
}

public actual fun arc4randomUniform(l: UInt): UInt =
    UnixBsdJniBridge.libc_unix_bsd_arc4randomUniform(l.toInt()).toUInt()

public actual fun drand48(): CDouble =
    UnixBsdJniBridge.libc_unix_bsd_drand48()

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    UnixBsdJniBridge.libc_unix_bsd_erand48((xseed?.value ?: 0L))

public actual fun lrand48(): CLong =
    UnixBsdJniBridge.libc_unix_bsd_lrand48()

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    UnixBsdJniBridge.libc_unix_bsd_nrand48((xseed?.value ?: 0L))

public actual fun mrand48(): CLong =
    UnixBsdJniBridge.libc_unix_bsd_mrand48()

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    UnixBsdJniBridge.libc_unix_bsd_jrand48((xseed?.value ?: 0L))

public actual fun srand48(seed: CLong) {
    UnixBsdJniBridge.libc_unix_bsd_srand48(seed)
}

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    UnixBsdJniBridge.libc_unix_bsd_seed48((xseed?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lcong48(p: COpaquePointer?) {
    UnixBsdJniBridge.libc_unix_bsd_lcong48((p?.value ?: 0L))
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    UnixBsdJniBridge.libc_unix_bsd_getoptLong(argc, (argv?.value ?: 0L), optstring, (longopts?.value ?: 0L), (longindex?.value ?: 0L))

public actual fun strftime(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT =
    UnixBsdJniBridge.libc_unix_bsd_strftime((buf?.value ?: 0L), maxsize.toLong(), format, (timeptr?.value ?: 0L)).toULong()

public actual fun strftimeL(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?, locale: LocaleT): SizeT =
    UnixBsdJniBridge.libc_unix_bsd_strftimeL((buf?.value ?: 0L), maxsize.toLong(), format, (timeptr?.value ?: 0L), (locale?.value ?: 0L)).toULong()

public actual fun devname(dev: DevT, modeT: ModeT): COpaquePointer? =
    UnixBsdJniBridge.libc_unix_bsd_devname(dev, modeT.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun issetugid(): CInt =
    UnixBsdJniBridge.libc_unix_bsd_issetugid()
