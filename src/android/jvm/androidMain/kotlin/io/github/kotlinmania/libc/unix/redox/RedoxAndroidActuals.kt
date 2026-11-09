@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT

private object UnixRedoxJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_redox_errnoLocation(): Long

    @JvmStatic
    external fun libc_unix_redox_strerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_redox_dirfd(dirp: Long): Int

    @JvmStatic
    external fun libc_unix_redox_pipe2(fds: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_redox_getdtablesize(): Int

    @JvmStatic
    external fun libc_unix_redox_getresgid(rgid: Long, egid: Long, sgid: Long): Int

    @JvmStatic
    external fun libc_unix_redox_getresuid(ruid: Long, euid: Long, suid: Long): Int

    @JvmStatic
    external fun libc_unix_redox_setresgid(rgid: Int, egid: Int, sgid: Int): Int

    @JvmStatic
    external fun libc_unix_redox_setresuid(ruid: Int, euid: Int, suid: Int): Int

    @JvmStatic
    external fun libc_unix_redox_getgrent(): Long

    @JvmStatic
    external fun libc_unix_redox_setgrent()

    @JvmStatic
    external fun libc_unix_redox_endgrent()

    @JvmStatic
    external fun libc_unix_redox_getgrgid(gid: Int): Long

    @JvmStatic
    external fun libc_unix_redox_getgrgidR(gid: Int, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_redox_getgrnam(name: String?): Long

    @JvmStatic
    external fun libc_unix_redox_getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_redox_getgrouplist(user: String?, group: Int, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libc_unix_redox_memalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_redox_getnameinfo(addr: Long, addrlen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_redox_pthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libc_unix_redox_pthreadCreate(tid: Long, attr: Long, start: Long, arg: Long): Int

    @JvmStatic
    external fun libc_unix_redox_pthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libc_unix_redox_openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_redox_getpwent(): Long

    @JvmStatic
    external fun libc_unix_redox_setpwent()

    @JvmStatic
    external fun libc_unix_redox_endpwent()

    @JvmStatic
    external fun libc_unix_redox_getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_redox_getpwuidR(uid: Int, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_redox_pthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libc_unix_redox_pthreadCancel(thread: Long): Int

    @JvmStatic
    external fun libc_unix_redox_pthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libc_unix_redox_sigtimedwait(set: Long, sig: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_redox_sigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libc_unix_redox_getsubopt(optionp: Long, tokens: Long, valuep: Long): Int

    @JvmStatic
    external fun libc_unix_redox_mkostemp(template: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_redox_mkostemps(template: Long, suffixlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_redox_reallocarray(ptr: Long, nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_redox_renameat2(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_redox_explicitBzero(p: Long, len: Long)

    @JvmStatic
    external fun libc_unix_redox_strlcat(dst: Long, src: String?, siz: Long): Long

    @JvmStatic
    external fun libc_unix_redox_strlcpy(dst: Long, src: String?, siz: Long): Long

    @JvmStatic
    external fun libc_unix_redox_epollCreate(size: Int): Int

    @JvmStatic
    external fun libc_unix_redox_epollCreate1(flags: Int): Int

    @JvmStatic
    external fun libc_unix_redox_epollWait(epfd: Int, events: Long, maxevents: Int, timeout: Int): Int

    @JvmStatic
    external fun libc_unix_redox_epollCtl(epfd: Int, op: Int, fd: Int, event: Long): Int

    @JvmStatic
    external fun libc_unix_redox_madvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_redox_msync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_redox_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_unix_redox_shmOpen(name: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_redox_shmUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_redox_getpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libc_unix_redox_setpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libc_unix_redox_getrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_redox_setrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_redox_cmsgData(cmsg: Long): Long

    @JvmStatic
    external fun libc_unix_redox_cmsgFirsthdr(mhdr: Long): Long

    @JvmStatic
    external fun libc_unix_redox_cmsgNxthdr(mhdr: Long, cmsg: Long): Long

    @JvmStatic
    external fun libc_unix_redox_bind(socket: Int, address: Long, addressLen: Int): Int

    @JvmStatic
    external fun libc_unix_redox_recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libc_unix_redox_recvmsg(socket: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_redox_sendmsg(socket: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_redox_futimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_unix_redox_preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_redox_pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_redox_readv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_unix_redox_writev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_unix_redox_uname(utsname: Long): Int

    @JvmStatic
    external fun libc_unix_redox_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_redox_clockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_redox_strftime(s: Long, max: Long, format: String?, tm: Long): Long

    @JvmStatic
    external fun libc_unix_redox_loginTty(fd: Int): Int
}

public actual fun errnoLocation(): COpaquePointer? =
    UnixRedoxJniBridge.libc_unix_redox_errnoLocation().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixRedoxJniBridge.libc_unix_redox_strerrorR(errnum, (buf?.value ?: 0L), buflen.toLong())

public actual fun dirfd(dirp: DIR?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_dirfd((dirp?.handle ?: 0L))

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    UnixRedoxJniBridge.libc_unix_redox_pipe2((fds?.value ?: 0L), flags)

public actual fun getdtablesize(): CInt =
    UnixRedoxJniBridge.libc_unix_redox_getdtablesize()

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_getresgid((rgid?.value ?: 0L), (egid?.value ?: 0L), (sgid?.value ?: 0L))

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_getresuid((ruid?.value ?: 0L), (euid?.value ?: 0L), (suid?.value ?: 0L))

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    UnixRedoxJniBridge.libc_unix_redox_setresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    UnixRedoxJniBridge.libc_unix_redox_setresuid(ruid, euid, suid)

public actual fun getgrent(): COpaquePointer? =
    UnixRedoxJniBridge.libc_unix_redox_getgrent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgrent() {
    UnixRedoxJniBridge.libc_unix_redox_setgrent()
}

public actual fun endgrent() {
    UnixRedoxJniBridge.libc_unix_redox_endgrent()
}

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    UnixRedoxJniBridge.libc_unix_redox_getgrgid(gid).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_getgrgidR(gid, (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getgrnam(name: String?): COpaquePointer? =
    UnixRedoxJniBridge.libc_unix_redox_getgrnam(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_getgrnamR(name, (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_getgrouplist(user, group, (groups?.value ?: 0L), (ngroups?.value ?: 0L))

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    UnixRedoxJniBridge.libc_unix_redox_memalign(align.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getnameinfo(addr: COpaquePointer?, addrlen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    UnixRedoxJniBridge.libc_unix_redox_getnameinfo((addr?.value ?: 0L), addrlen.toInt(), (host?.value ?: 0L), hostlen.toInt(), (serv?.value ?: 0L), servlen.toInt(), flags)

public actual fun pthreadAtfork(prepare: FnCallback?, parent: FnCallback?, child: FnCallback?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_pthreadAtfork(0L, 0L, 0L)

public actual fun pthreadCreate(tid: COpaquePointer?, attr: COpaquePointer?, start: FnCallback1, arg: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_pthreadCreate((tid?.value ?: 0L), (attr?.value ?: 0L), 0L, (arg?.value ?: 0L))

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    UnixRedoxJniBridge.libc_unix_redox_pthreadCondattrSetclock((attr?.value ?: 0L), clockId)

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_openpty((amaster?.value ?: 0L), (aslave?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun getpwent(): COpaquePointer? =
    UnixRedoxJniBridge.libc_unix_redox_getpwent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setpwent() {
    UnixRedoxJniBridge.libc_unix_redox_setpwent()
}

public actual fun endpwent() {
    UnixRedoxJniBridge.libc_unix_redox_endpwent()
}

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_getpwnamR(name, (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_getpwuidR(uid, (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_pthreadSigmask(how, (set?.value ?: 0L), (oldset?.value ?: 0L))

public actual fun pthreadCancel(thread: PthreadT): CInt =
    UnixRedoxJniBridge.libc_unix_redox_pthreadCancel((thread?.value ?: 0L))

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    UnixRedoxJniBridge.libc_unix_redox_pthreadKill((thread?.value ?: 0L), sig)

public actual fun sigtimedwait(set: COpaquePointer?, sig: COpaquePointer?, timeout: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_sigtimedwait((set?.value ?: 0L), (sig?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_sigwait((set?.value ?: 0L), (sig?.value ?: 0L))

public actual fun getsubopt(optionp: COpaquePointer?, tokens: COpaquePointer?, valuep: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_getsubopt((optionp?.value ?: 0L), (tokens?.value ?: 0L), (valuep?.value ?: 0L))

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    UnixRedoxJniBridge.libc_unix_redox_mkostemp((template?.value ?: 0L), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    UnixRedoxJniBridge.libc_unix_redox_mkostemps((template?.value ?: 0L), suffixlen, flags)

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    UnixRedoxJniBridge.libc_unix_redox_reallocarray((ptr?.value ?: 0L), nmemb.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    UnixRedoxJniBridge.libc_unix_redox_renameat2(olddirfd, oldpath, newdirfd, newpath, flags.toInt())

public actual fun explicitBzero(p: COpaquePointer?, len: SizeT) {
    UnixRedoxJniBridge.libc_unix_redox_explicitBzero((p?.value ?: 0L), len.toLong())
}

public actual fun strlcat(dst: COpaquePointer?, src: String?, siz: SizeT): SizeT =
    UnixRedoxJniBridge.libc_unix_redox_strlcat((dst?.value ?: 0L), src, siz.toLong()).toULong()

public actual fun strlcpy(dst: COpaquePointer?, src: String?, siz: SizeT): SizeT =
    UnixRedoxJniBridge.libc_unix_redox_strlcpy((dst?.value ?: 0L), src, siz.toLong()).toULong()

public actual fun epollCreate(size: CInt): CInt =
    UnixRedoxJniBridge.libc_unix_redox_epollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    UnixRedoxJniBridge.libc_unix_redox_epollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    UnixRedoxJniBridge.libc_unix_redox_epollWait(epfd, (events?.value ?: 0L), maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_epollCtl(epfd, op, fd, (event?.value ?: 0L))

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    0

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    UnixRedoxJniBridge.libc_unix_redox_madvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    UnixRedoxJniBridge.libc_unix_redox_msync((addr?.value ?: 0L), len.toLong(), flags)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    UnixRedoxJniBridge.libc_unix_redox_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    UnixRedoxJniBridge.libc_unix_redox_shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_shmUnlink(name)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixRedoxJniBridge.libc_unix_redox_getpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    UnixRedoxJniBridge.libc_unix_redox_setpriority(which, who.toInt(), prio)

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_getrlimit(resource, (rlim?.value ?: 0L))

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_setrlimit(resource, (rlim?.value ?: 0L))

public actual fun cmsgData(cmsg: COpaquePointer?): COpaquePointer? =
    UnixRedoxJniBridge.libc_unix_redox_cmsgData((cmsg?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cmsgFirsthdr(mhdr: COpaquePointer?): COpaquePointer? =
    UnixRedoxJniBridge.libc_unix_redox_cmsgFirsthdr((mhdr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cmsgNxthdr(mhdr: COpaquePointer?, cmsg: COpaquePointer?): COpaquePointer? =
    UnixRedoxJniBridge.libc_unix_redox_cmsgNxthdr((mhdr?.value ?: 0L), (cmsg?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    UnixRedoxJniBridge.libc_unix_redox_bind(socket, (address?.value ?: 0L), addressLen.toInt())

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    UnixRedoxJniBridge.libc_unix_redox_recvfrom(socket, (buf?.value ?: 0L), len.toLong(), flags, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun recvmsg(socket: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixRedoxJniBridge.libc_unix_redox_recvmsg(socket, (msg?.value ?: 0L), flags)

public actual fun sendmsg(socket: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixRedoxJniBridge.libc_unix_redox_sendmsg(socket, (msg?.value ?: 0L), flags)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_futimens(fd, (times?.value ?: 0L))

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    UnixRedoxJniBridge.libc_unix_redox_preadv(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    UnixRedoxJniBridge.libc_unix_redox_pwritev(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    UnixRedoxJniBridge.libc_unix_redox_readv(fd, (iov?.value ?: 0L), iovcnt)

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    UnixRedoxJniBridge.libc_unix_redox_writev(fd, (iov?.value ?: 0L), iovcnt)

public actual fun uname(utsname: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_uname((utsname?.value ?: 0L))

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixRedoxJniBridge.libc_unix_redox_clockGettime(clkId, (tp?.value ?: 0L))

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT =
    UnixRedoxJniBridge.libc_unix_redox_strftime((s?.value ?: 0L), max.toLong(), format, (tm?.value ?: 0L)).toULong()

public actual fun loginTty(fd: CInt): CInt =
    UnixRedoxJniBridge.libc_unix_redox_loginTty(fd)
