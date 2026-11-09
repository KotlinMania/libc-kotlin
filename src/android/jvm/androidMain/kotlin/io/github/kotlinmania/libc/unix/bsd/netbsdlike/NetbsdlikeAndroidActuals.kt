@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.IdtypeT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.DevT

private object UnixBsdNetbsdlikeJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_setgrent()

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_semDestroy(sem: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_semInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_daemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_accept4(s: Int, addr: Long, addrlen: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_mincore(addr: Long, len: Long, vec: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_clockGetres(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_clockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_clockSettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_errno(): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_shmOpen(name: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_memrchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_mkostemp(template: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_mkostemps(template: Long, suffixlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_futimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_fdatasync(fd: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_loginTty(fd: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_getpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_setpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_mknodat(dirfd: Int, pathname: String?, mode: Int, dev: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_semTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_semGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_pthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_sethostname(name: String?, len: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_pthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_pthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_pthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_pthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_pthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_pthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_pthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_pthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_pipe2(fds: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_ppoll(fds: Long, nfds: Int, ts: Long, sigmask: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_getgrouplist(name: String?, basegid: Short, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_initgroups(name: String?, basegid: Short): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_getdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_setdomainname(name: String?, len: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_uname(buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_shmget(key: Long, size: Long, shmflg: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_shmat(shmid: Int, shmaddr: Long, shmflg: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_shmdt(shmaddr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_shmctl(shmid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_execvpe(file: String?, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_waitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawn(pid: Long, path: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnp(pid: Long, file: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnattrGetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnattrSetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnattrGetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnattrSetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnattrGetpgroup(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnattrSetpgroup(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnattrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnattrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnFileActionsInit(actions: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnFileActionsDestroy(actions: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddopen(actions: Long, fd: Int, path: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddclose(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_posixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_reallocarray(ptr: Long, nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_gethostid(): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_sethostid(hostid: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_ftok(path: String?, id: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_dirname(path: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_basename(path: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_getentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_sendmmsg(sockfd: Int, mmsg: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_recvmmsg(sockfd: Int, mmsg: Long, vlen: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_netbsdlike_closefrom(lowfd: Int): Int
}

public actual fun setgrent() {
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_setgrent()
}

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_semDestroy((sem?.value ?: 0L))

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_semInit((sem?.value ?: 0L), pshared, value.toInt())

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_daemon(nochdir, noclose)

public actual fun accept4(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_accept4(s, (addr?.value ?: 0L), (addrlen?.value ?: 0L), flags)

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_mincore((addr?.value ?: 0L), len.toLong(), (vec?.value ?: 0L))

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_clockGetres(clkId, (tp?.value ?: 0L))

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_clockGettime(clkId, (tp?.value ?: 0L))

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_clockSettime(clkId, (tp?.value ?: 0L))

public actual fun errno(): COpaquePointer? =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_errno().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_shmOpen(name, oflag, mode.toInt())

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_memrchr((cx?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_mkostemp((template?.value ?: 0L), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_mkostemps((template?.value ?: 0L), suffixlen, flags)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_pwritev(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_preadv(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_futimens(fd, (times?.value ?: 0L))

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_utimensat(dirfd, path, (times?.value ?: 0L), flag)

public actual fun fdatasync(fd: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_fdatasync(fd)

public actual fun loginTty(fd: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_loginTty(fd)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_getpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_setpriority(which, who.toInt(), prio)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_mknodat(dirfd, pathname, mode.toInt(), dev)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_mkfifoat(dirfd, pathname, mode.toInt())

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_semTimedwait((sem?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_semGetvalue((sem?.value ?: 0L), (sval?.value ?: 0L))

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_pthreadCondattrSetclock((attr?.value ?: 0L), clockId)

public actual fun sethostname(name: String?, len: SizeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_sethostname(name, len.toLong())

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_pthreadMutexTimedlock((lock?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_pthreadSpinInit((lock?.value ?: 0L), pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_pthreadSpinDestroy((lock?.value ?: 0L))

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_pthreadSpinLock((lock?.value ?: 0L))

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_pthreadSpinTrylock((lock?.value ?: 0L))

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_pthreadSpinUnlock((lock?.value ?: 0L))

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_pthreadSetschedparam(native.toLong(), policy, (param?.value ?: 0L))

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_pthreadGetschedparam(native.toLong(), (policy?.value ?: 0L), (param?.value ?: 0L))

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_pipe2((fds?.value ?: 0L), flags)

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, ts: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_ppoll((fds?.value ?: 0L), nfds.toInt(), (ts?.value ?: 0L), (sigmask?.value ?: 0L))

public actual fun getgrouplist(name: String?, basegid: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_getgrouplist(name, basegid.toShort(), (groups?.value ?: 0L), (ngroups?.value ?: 0L))

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_initgroups(name, basegid.toShort())

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_getdomainname((name?.value ?: 0L), len.toLong())

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_setdomainname(name, len.toLong())

public actual fun uname(buf: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_uname((buf?.value ?: 0L))

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_shmget(key, size.toLong(), shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_shmat(shmid, (shmaddr?.value ?: 0L), shmflg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_shmdt((shmaddr?.value ?: 0L))

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_shmctl(shmid, cmd, (buf?.value ?: 0L))

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_execvpe(file, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_waitid(idtype, id.toInt(), (infop?.value ?: 0L), options)

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawn((pid?.value ?: 0L), path, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnp((pid?.value ?: 0L), file, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnattrInit((attr?.value ?: 0L))

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnattrDestroy((attr?.value ?: 0L))

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnattrGetsigdefault((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnattrSetsigdefault((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnattrGetsigmask((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnattrSetsigmask((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnattrGetflags((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnattrSetflags((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnattrGetpgroup((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnattrSetpgroup((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnattrGetschedpolicy((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnattrSetschedpolicy((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnattrGetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnattrSetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnFileActionsInit((actions?.value ?: 0L))

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnFileActionsDestroy((actions?.value ?: 0L))

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddopen((actions?.value ?: 0L), fd, path, oflag, mode.toInt())

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddclose((actions?.value ?: 0L), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_posixSpawnFileActionsAdddup2((actions?.value ?: 0L), fd, newfd)

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_reallocarray((ptr?.value ?: 0L), nmemb.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gethostid(): CLong =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_gethostid()

public actual fun sethostid(hostid: CLong): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_sethostid(hostid)

public actual fun ftok(path: String?, id: CInt): KeyT =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_ftok(path, id)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_dirname((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_basename((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_getentropy((buf?.value ?: 0L), buflen.toLong())

public actual fun sendmmsg(sockfd: CInt, mmsg: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_sendmmsg(sockfd, (mmsg?.value ?: 0L), vlen.toInt(), flags)

public actual fun recvmmsg(sockfd: CInt, mmsg: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_recvmmsg(sockfd, (mmsg?.value ?: 0L), vlen.toInt(), flags, (timeout?.value ?: 0L))

public actual fun closefrom(lowfd: CInt): CInt =
    UnixBsdNetbsdlikeJniBridge.libc_unix_bsd_netbsdlike_closefrom(lowfd)
