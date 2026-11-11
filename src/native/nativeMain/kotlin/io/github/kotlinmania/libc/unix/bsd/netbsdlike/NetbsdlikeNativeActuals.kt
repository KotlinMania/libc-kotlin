@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike

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
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_accept4
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_basename
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_clockGetres
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_clockGettime
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_clockSettime
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_closefrom
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_daemon
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_dirname
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_errno
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_execvpe
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_fdatasync
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_ftok
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_futimens
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_getdomainname
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_getentropy
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_getgrouplist
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_gethostid
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_getpriority
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_initgroups
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_loginTty
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_memrchr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_mincore
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_mkfifoat
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_mknodat
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_mkostemp
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_mkostemps
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_pipe2
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawn
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddclose
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnFileActionsAdddup2
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddopen
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnFileActionsDestroy
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnFileActionsInit
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnattrDestroy
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnattrGetflags
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnattrGetpgroup
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnattrGetschedparam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnattrGetschedpolicy
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnattrGetsigdefault
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnattrGetsigmask
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnattrInit
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnattrSetflags
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnattrSetpgroup
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnattrSetschedparam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnattrSetschedpolicy
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnattrSetsigdefault
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnattrSetsigmask
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_posixSpawnp
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_ppoll
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_preadv
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_pthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_pthreadGetschedparam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_pthreadMutexTimedlock
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_pthreadSetschedparam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_pthreadSpinDestroy
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_pthreadSpinInit
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_pthreadSpinLock
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_pthreadSpinTrylock
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_pthreadSpinUnlock
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_pwritev
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_reallocarray
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_recvmmsg
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_semDestroy
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_semGetvalue
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_semInit
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_semTimedwait
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_sendmmsg
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_setdomainname
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_setgrent
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_sethostid
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_sethostname
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_setpriority
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_shmOpen
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_shmat
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_shmctl
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_shmdt
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_shmget
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_uname
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_utimensat
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.cinterop.libc_unix_bsd_netbsdlike_waitid
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.IdtypeT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.DevT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setgrent() {
    libc_unix_bsd_netbsdlike_setgrent()
}

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_semDestroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    libc_unix_bsd_netbsdlike_semInit(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libc_unix_bsd_netbsdlike_daemon(nochdir, noclose)

public actual fun accept4(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt =
    libc_unix_bsd_netbsdlike_accept4(s, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>(), flags)

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_mincore(addr?.value?.toCPointer<ByteVar>(), len, vec?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_clockGetres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_clockGettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_clockSettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun errno(): COpaquePointer? =
    libc_unix_bsd_netbsdlike_errno()?.let { COpaquePointer(it.toLong()) }

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    libc_unix_bsd_netbsdlike_shmOpen(name, oflag, mode)

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    libc_unix_bsd_netbsdlike_memrchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    libc_unix_bsd_netbsdlike_mkostemp(template?.value?.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    libc_unix_bsd_netbsdlike_mkostemps(template?.value?.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    libc_unix_bsd_netbsdlike_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    libc_unix_bsd_netbsdlike_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    libc_unix_bsd_netbsdlike_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun fdatasync(fd: CInt): CInt =
    libc_unix_bsd_netbsdlike_fdatasync(fd)

public actual fun loginTty(fd: CInt): CInt =
    libc_unix_bsd_netbsdlike_loginTty(fd)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libc_unix_bsd_netbsdlike_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libc_unix_bsd_netbsdlike_setpriority(which, who, prio)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    libc_unix_bsd_netbsdlike_mknodat(dirfd, pathname, mode, dev)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    libc_unix_bsd_netbsdlike_mkfifoat(dirfd, pathname, mode)

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_semTimedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_semGetvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    libc_unix_bsd_netbsdlike_pthreadCondattrSetclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun sethostname(name: String?, len: SizeT): CInt =
    libc_unix_bsd_netbsdlike_sethostname(name, len)

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_pthreadMutexTimedlock(lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    libc_unix_bsd_netbsdlike_pthreadSpinInit(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_pthreadSpinDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_pthreadSpinLock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_pthreadSpinTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_pthreadSpinUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_pthreadSetschedparam(native.toLong().toCPointer<ByteVar>(), policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_pthreadGetschedparam(native.toLong().toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    libc_unix_bsd_netbsdlike_pipe2(fds?.value?.toCPointer<ByteVar>(), flags)

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, ts: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_ppoll(fds?.value?.toCPointer<ByteVar>(), nfds, ts?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun getgrouplist(name: String?, basegid: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_getgrouplist(name, basegid, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    libc_unix_bsd_netbsdlike_initgroups(name, basegid)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    libc_unix_bsd_netbsdlike_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    libc_unix_bsd_netbsdlike_setdomainname(name, len)

public actual fun uname(buf: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    libc_unix_bsd_netbsdlike_shmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    libc_unix_bsd_netbsdlike_shmat(shmid, shmaddr?.value?.toCPointer<ByteVar>(), shmflg)?.let { COpaquePointer(it.toLong()) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_shmdt(shmaddr?.value?.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_shmctl(shmid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_execvpe(file, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    libc_unix_bsd_netbsdlike_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_posixSpawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnattrGetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnattrSetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnattrGetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnattrSetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnattrGetflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnattrSetflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnattrGetpgroup(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnattrSetpgroup(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnattrGetschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnattrSetschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnattrGetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnattrSetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnFileActionsInit(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnFileActionsDestroy(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddopen(actions?.value?.toCPointer<ByteVar>(), fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddclose(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    libc_unix_bsd_netbsdlike_posixSpawnFileActionsAdddup2(actions?.value?.toCPointer<ByteVar>(), fd, newfd)

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    libc_unix_bsd_netbsdlike_reallocarray(ptr?.value?.toCPointer<ByteVar>(), nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun gethostid(): CLong =
    libc_unix_bsd_netbsdlike_gethostid()

public actual fun sethostid(hostid: CLong): CInt =
    libc_unix_bsd_netbsdlike_sethostid(hostid)

public actual fun ftok(path: String?, id: CInt): KeyT =
    libc_unix_bsd_netbsdlike_ftok(path, id)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_netbsdlike_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_netbsdlike_basename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    libc_unix_bsd_netbsdlike_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun sendmmsg(sockfd: CInt, mmsg: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    libc_unix_bsd_netbsdlike_sendmmsg(sockfd, mmsg?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, mmsg: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    libc_unix_bsd_netbsdlike_recvmmsg(sockfd, mmsg?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun closefrom(lowfd: CInt): CInt =
    libc_unix_bsd_netbsdlike_closefrom(lowfd)
