package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.COpaquePointer

public actual fun sendmmsg(sockfd: CInt, msgvec: io.github.kotlinmania.libc.Mmsghdr?, vlen: CUint, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').sendmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags)") as CInt

public actual fun recvmmsg(sockfd: CInt, msgvec: io.github.kotlinmania.libc.Mmsghdr?, vlen: CUint, flags: CUint, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').recvmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)") as CInt

public actual fun semDestroy(sem: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semDestroy(sem?.toLong() ?: 0L)") as CInt

public actual fun semInit(sem: SyncT?, pshared: CInt, value: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').semInit(sem?.toLong() ?: 0L, pshared, value)") as CInt

public actual fun fdatasync(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fdatasync(fd)") as CInt

public actual fun getpriority(which: CInt, who: io.github.kotlinmania.libc.IdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpriority(which, who)") as CInt

public actual fun setpriority(which: CInt, who: io.github.kotlinmania.libc.IdT, prio: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setpriority(which, who, prio)") as CInt

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkfifoat(dirfd, pathname, mode)") as CInt

public actual fun mknodat(fd: CInt, pathname: String?, mode: ModeT, dev: io.github.kotlinmania.libc.DevT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mknodat(fd, pathname, mode, dev)") as CInt

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetres(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockSettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockGetcpuclockid(pid: PidT, clkId: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetcpuclockid(pid, clkId?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)") as CInt

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memalign(align, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setgroups(ngroups, ptr?.toLong() ?: 0L)") as CInt

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFadvise(fd, offset, len, advise)") as CInt

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimens(fd, times?.toLong() ?: 0L)") as CInt

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nlLanginfo(item)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').utimensat(dirfd, path, times?.toLong() ?: 0L, flag)") as CInt

public actual fun pthreadCondattrGetclock(attr: io.github.kotlinmania.libc.SyncAttr?, clockId: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrGetclock(attr?.toLong() ?: 0L, clockId?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.SyncAttr?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)") as CInt

public actual fun pthreadCondattrSetpshared(attr: io.github.kotlinmania.libc.SyncAttr?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetpshared(attr?.toLong() ?: 0L, pshared)") as CInt

public actual fun pthreadMutexattrSetpshared(attr: io.github.kotlinmania.libc.SyncAttr?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSetpshared(attr?.toLong() ?: 0L, pshared)") as CInt

public actual fun pthreadRwlockattrGetpshared(attr: io.github.kotlinmania.libc.SyncAttr?, value: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrGetpshared(attr?.toLong() ?: 0L, value?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrSetpshared(attr: io.github.kotlinmania.libc.SyncAttr?, value: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrSetpshared(attr?.toLong() ?: 0L, value)") as CInt

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ptsnameR(fd, buf?.value ?: 0L, buflen)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clearenv(): CInt =
    js("require('@kotlinmania/libc-native-bindings').clearenv()") as CInt

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').waitid(idtype, id, infop?.toLong() ?: 0L, options)") as CInt

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    js("require('@kotlinmania/libc-native-bindings').wait4(pid, status?.toLong() ?: 0L, options, rusage?.toLong() ?: 0L)") as PidT

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').execvpe(file, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getifaddrs(ifap?.value ?: 0L)") as CInt

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    js("require('@kotlinmania/libc-native-bindings').freeifaddrs(ifa?.toLong() ?: 0L)")
}

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    js("require('@kotlinmania/libc-native-bindings').bind(socket, address?.toLong() ?: 0L, addressLen)") as CInt

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').writev(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readv(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun sendmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendmsg(fd, msg?.toLong() ?: 0L, flags)") as SsizeT

public actual fun recvmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvmsg(fd, msg?.toLong() ?: 0L, flags)") as SsizeT

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    js("require('@kotlinmania/libc-native-bindings').openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as CInt

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    js("require('@kotlinmania/libc-native-bindings').forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as PidT

public actual fun loginTty(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').loginTty(fd)") as CInt

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    js("require('@kotlinmania/libc-native-bindings').uname(buf?.toLong() ?: 0L)") as CInt

public actual fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpeereid(socket, euid?.toLong() ?: 0L, egid?.toLong() ?: 0L)") as CInt

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strerrorR(errnum, buf?.value ?: 0L, buflen)") as CInt

public actual fun abs(i: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').abs(i)") as CInt

public actual fun labs(i: CLong): CLong =
    js("require('@kotlinmania/libc-native-bindings').labs(i)") as CLong

public actual fun rand(): CInt =
    js("require('@kotlinmania/libc-native-bindings').rand()") as CInt

public actual fun srand(seed: CUint) {
    js("require('@kotlinmania/libc-native-bindings').srand(seed)")
}

public actual fun setpwent() {
    js("require('@kotlinmania/libc-native-bindings').setpwent()")
}

public actual fun endpwent() {
    js("require('@kotlinmania/libc-native-bindings').endpwent()")
}

public actual fun getpwent(): Passwd? =
    js("require('@kotlinmania/libc-native-bindings').getpwent()") as Passwd?

public actual fun setgrent() {
    js("require('@kotlinmania/libc-native-bindings').setgrent()")
}

public actual fun endgrent() {
    js("require('@kotlinmania/libc-native-bindings').endgrent()")
}

public actual fun getgrent(): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrent()") as Group?

public actual fun setspent() {
    js("require('@kotlinmania/libc-native-bindings').setspent()")
}

public actual fun endspent() {
    js("require('@kotlinmania/libc-native-bindings').endspent()")
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmOpen(name, oflag, mode)") as CInt

public actual fun ftok(pathname: String?, projId: CInt): io.github.kotlinmania.libc.KeyT =
    js("require('@kotlinmania/libc-native-bindings').ftok(pathname, projId)") as io.github.kotlinmania.libc.KeyT

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mprotect(addr?.value ?: 0L, len, prot)") as CInt

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFallocate(fd, offset, len)") as CInt

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkostemp(template?.value ?: 0L, flags)") as CInt

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkostemps(template?.value ?: 0L, suffixlen, flags)") as CInt

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as CInt

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)") as CInt

public actual fun pthreadSetschedprio(native: io.github.kotlinmania.libc.PthreadT, priority: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetschedprio(native, priority)") as CInt

public actual fun ifNameindex(): IfNameindex? =
    js("require('@kotlinmania/libc-native-bindings').ifNameindex()") as IfNameindex?

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    js("require('@kotlinmania/libc-native-bindings').ifFreenameindex(ptr?.toLong() ?: 0L)")
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobTGlErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').glob(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)") as CInt

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    js("require('@kotlinmania/libc-native-bindings').globfree(pglob?.toLong() ?: 0L)")
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixMadvise(addr?.value ?: 0L, len, advice)") as CInt

public actual fun shmUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmUnlink(name)") as CInt

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    js("require('@kotlinmania/libc-native-bindings').seekdir(dirp?.toLong() ?: 0L, loc)")
}

public actual fun telldir(dirp: DIR?): CLong =
    js("require('@kotlinmania/libc-native-bindings').telldir(dirp?.toLong() ?: 0L)") as CLong

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msync(addr?.value ?: 0L, len, flags)") as CInt

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: UInt?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as SsizeT

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkstemps(template?.value ?: 0L, suffixlen)") as CInt

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getdomainname(name?.value ?: 0L, len)") as CInt

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setdomainname(name, len)") as CInt

public actual fun sync() {
    js("require('@kotlinmania/libc-native-bindings').sync()")
}

public actual fun pthreadGetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetschedparam(native, policy?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun umount(target: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').umount(target, flags)") as CInt

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetPriorityMax(policy)") as CInt

public actual fun settimeofday(tv: Timeval?, tz: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').settimeofday(tv?.toLong() ?: 0L, tz?.value ?: 0L)") as CInt

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedRrGetInterval(pid, tp?.toLong() ?: 0L)") as CInt

public actual fun semTimedwait(sem: SyncT?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semTimedwait(sem?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun semGetvalue(sem: SyncT?, sval: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semGetvalue(sem?.toLong() ?: 0L, sval?.toLong() ?: 0L)") as CInt

public actual fun schedSetparam(pid: PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun mount(specialDevice: String?, mountDirectory: String?, flags: CInt, mountType: String?, mountData: COpaquePointer?, mountDatalen: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mount(specialDevice, mountDirectory, flags, mountType, mountData?.value ?: 0L, mountDatalen)") as CInt

public actual fun schedGetparam(pid: PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexConsistent(mutex: io.github.kotlinmania.libc.SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexConsistent(mutex?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexTimedlock(lock: io.github.kotlinmania.libc.SyncT?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexTimedlock(lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinInit(lock: SyncT?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinInit(lock?.toLong() ?: 0L, pshared)") as CInt

public actual fun pthreadSpinDestroy(lock: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinDestroy(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinLock(lock: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinLock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinTrylock(lock: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinTrylock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinUnlock(lock: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinUnlock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierattrInit(attr: SyncAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierattrDestroy(attr: SyncAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierattrGetpshared(attr: SyncAttr?, pshared: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrGetpshared(attr?.toLong() ?: 0L, pshared?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierattrSetpshared(attr: SyncAttr?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrSetpshared(attr?.toLong() ?: 0L, pshared)") as CInt

public actual fun pthreadBarrierInit(barrier: io.github.kotlinmania.libc.PthreadBarrierT?, attr: SyncAttr?, count: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierInit(barrier?.toLong() ?: 0L, attr?.toLong() ?: 0L, count)") as CInt

public actual fun pthreadBarrierDestroy(barrier: io.github.kotlinmania.libc.PthreadBarrierT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierDestroy(barrier?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierWait(barrier: io.github.kotlinmania.libc.PthreadBarrierT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierWait(barrier?.toLong() ?: 0L)") as CInt

public actual fun schedGetscheduler(pid: PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetscheduler(pid)") as CInt

public actual fun clockNanosleep(clkId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetguardsize(attr?.toLong() ?: 0L, guardsize?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetguardsize(attr?.toLong() ?: 0L, guardsize)") as CInt

public actual fun sethostname(name: String?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sethostname(name, len)") as CInt

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetPriorityMin(policy)") as CInt

public actual fun pthreadCondattrGetpshared(attr: io.github.kotlinmania.libc.SyncAttr?, pshared: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrGetpshared(attr?.toLong() ?: 0L, pshared?.toLong() ?: 0L)") as CInt

public actual fun pthreadSetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetschedparam(native, policy, param?.toLong() ?: 0L)") as CInt

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetscheduler(pid, policy, param?.toLong() ?: 0L)") as CInt

public actual fun sigsuspend(mask: io.github.kotlinmania.libc.SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigsuspend(mask?.toLong() ?: 0L)") as CInt

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun semClose(sem: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semClose(sem?.toLong() ?: 0L)") as CInt

public actual fun getdtablesize(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getdtablesize()") as CInt

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun initgroups(user: String?, group: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').initgroups(user, group)") as CInt

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSigmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)") as CInt

public actual fun getgrnam(name: String?): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrnam(name)") as Group?

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCancel(thread)") as CInt

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKill(thread, sig)") as CInt

public actual fun semUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semUnlink(name)") as CInt

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').daemon(nochdir, noclose)") as CInt

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)") as CInt

public actual fun pthreadAtfork(prepare: FnCallback?, parent: FnCallback?, child: FnCallback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)") as CInt

public actual fun getgrgid(gid: GidT): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrgid(gid)") as Group?

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrouplist(user, group, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrGetpshared(attr: io.github.kotlinmania.libc.SyncAttr?, pshared: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrGetpshared(attr?.toLong() ?: 0L, pshared?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrGetrobust(attr: io.github.kotlinmania.libc.SyncAttr?, robustness: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrGetrobust(attr?.toLong() ?: 0L, robustness?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrSetrobust(attr: io.github.kotlinmania.libc.SyncAttr?, robustness: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSetrobust(attr?.toLong() ?: 0L, robustness)") as CInt

public actual fun pthreadCreate(native: CInt?, attr: io.github.kotlinmania.libc.PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)") as CInt

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getitimer(which, currValue?.toLong() ?: 0L)") as CInt

public actual fun setitimer(which: CInt, value: Itimerval?, ovalue: Itimerval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setitimer(which, value?.toLong() ?: 0L, ovalue?.toLong() ?: 0L)") as CInt

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: UintptrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.value ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: UintptrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.value ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun posixSpawnattrInit(attr: UintptrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrDestroy(attr: UintptrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetsigdefault(attr: UintptrT?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetsigdefault(attr: UintptrT?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetsigmask(attr: UintptrT?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetsigmask(attr: UintptrT?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetflags(attr: UintptrT?, flags: CShort?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetflags(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetflags(attr: UintptrT?, flags: CShort): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetflags(attr?.toLong() ?: 0L, flags)") as CInt

public actual fun posixSpawnattrGetpgroup(attr: UintptrT?, flags: PidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetpgroup(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetpgroup(attr: UintptrT?, flags: PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetpgroup(attr?.toLong() ?: 0L, flags)") as CInt

public actual fun posixSpawnattrGetschedpolicy(attr: UintptrT?, flags: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetschedpolicy(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetschedpolicy(attr: UintptrT?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetschedpolicy(attr?.toLong() ?: 0L, flags)") as CInt

public actual fun posixSpawnattrGetschedparam(attr: UintptrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetschedparam(attr: UintptrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsInit(actions?.value ?: 0L)") as CInt

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsDestroy(actions?.value ?: 0L)") as CInt

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddopen(actions?.value ?: 0L, fd, path, oflag, mode)") as CInt

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddclose(actions?.value ?: 0L, fd)") as CInt

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAdddup2(actions?.value ?: 0L, fd, newfd)") as CInt

public actual fun popen(command: String?, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').popen(command, mode)") as FILE?

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').faccessat(dirfd, pathname, mode, flags)") as CInt

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').inotifyRmWatch(fd, wd)") as CInt

public actual fun inotifyInit(): CInt =
    js("require('@kotlinmania/libc-native-bindings').inotifyInit()") as CInt

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').inotifyAddWatch(fd, path, mask)") as CInt

public actual fun gettid(): PidT =
    js("require('@kotlinmania/libc-native-bindings').gettid()") as PidT

public actual fun pthreadGetcpuclockid(thread: io.github.kotlinmania.libc.PthreadT, clkId: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetcpuclockid(thread, clkId?.toLong() ?: 0L)") as CInt

public actual fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)") as CInt

public actual fun mallopt(param: CInt, value: Long): CInt =
    js("require('@kotlinmania/libc-native-bindings').mallopt(param, value)") as CInt

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)") as CInt

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ctermid(s?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallinfo(): io.github.kotlinmania.libc.Mallinfo =
    js("require('@kotlinmania/libc-native-bindings').mallinfo()") as io.github.kotlinmania.libc.Mallinfo

public actual fun getpwentR(pwd: io.github.kotlinmania.libc.Passwd?, buf: COpaquePointer?, bufsize: CInt, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwentR(pwd?.toLong() ?: 0L, buf?.value ?: 0L, bufsize, result?.value ?: 0L)") as CInt

public actual fun pthreadGetnameNp(thread: io.github.kotlinmania.libc.PthreadT, name: COpaquePointer?, len: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetnameNp(thread, name?.value ?: 0L, len)") as CInt

public actual fun pthreadSetnameNp(thread: io.github.kotlinmania.libc.PthreadT, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetnameNp(thread, name)") as CInt

public actual fun sysctl(arg0: CInt?, arg1: CUint, arg2: COpaquePointer?, arg3: SizeT?, arg4: COpaquePointer?, arg5: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sysctl(arg0?.toLong() ?: 0L, arg1, arg2?.value ?: 0L, arg3?.toLong() ?: 0L, arg4?.value ?: 0L, arg5)") as CInt

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun setrlimit(resource: CInt, rlp: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit(resource, rlp?.toLong() ?: 0L)") as CInt

public actual fun lioListio(mode: CInt, list: COpaquePointer?, nent: CInt, sig: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lioListio(mode, list?.value ?: 0L, nent, sig?.toLong() ?: 0L)") as CInt

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)") as CInt

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').memsetS(s?.value ?: 0L, smax, c, n)") as CInt

public actual fun regcomp(preg: io.github.kotlinmania.libc.RegexT?, pattern: String?, cflags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').regcomp(preg?.toLong() ?: 0L, pattern, cflags)") as CInt

public actual fun regexec(preg: io.github.kotlinmania.libc.RegexT?, str: String?, nmatch: SizeT, pmatch: io.github.kotlinmania.libc.RegmatchT?, eflags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').regexec(preg?.toLong() ?: 0L, str, nmatch, pmatch?.toLong() ?: 0L, eflags)") as CInt

public actual fun regerror(errcode: CInt, preg: io.github.kotlinmania.libc.RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').regerror(errcode, preg?.toLong() ?: 0L, errbuf?.value ?: 0L, errbufSize)") as SizeT

public actual fun regfree(preg: io.github.kotlinmania.libc.RegexT?) {
    js("require('@kotlinmania/libc-native-bindings').regfree(preg?.toLong() ?: 0L)")
}

public actual fun dirfd(dirp: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dirfd(dirp?.toLong() ?: 0L)") as CInt

public actual fun aioCancel(fd: CInt, aiocbp: io.github.kotlinmania.libc.Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioCancel(fd, aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioError(aiocbp: io.github.kotlinmania.libc.Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioError(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioFsync(operation: CInt, aiocbp: io.github.kotlinmania.libc.Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioFsync(operation, aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioRead(aiocbp: io.github.kotlinmania.libc.Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioRead(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioReturn(aiocpb: io.github.kotlinmania.libc.Aiocb?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').aioReturn(aiocpb?.toLong() ?: 0L)") as SsizeT

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioSuspend(list?.value ?: 0L, nent, timeout?.toLong() ?: 0L)") as CInt

public actual fun aioWrite(aiocpb: io.github.kotlinmania.libc.Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioWrite(aiocpb?.toLong() ?: 0L)") as CInt

public actual fun mqClose(mqdes: io.github.kotlinmania.libc.MqdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqClose(mqdes)") as CInt

public actual fun mqGetattr(mqdes: io.github.kotlinmania.libc.MqdT, mqstat: io.github.kotlinmania.libc.MqAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqGetattr(mqdes, mqstat?.toLong() ?: 0L)") as CInt

public actual fun mqNotify(mqdes: io.github.kotlinmania.libc.MqdT, notification: io.github.kotlinmania.libc.Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqNotify(mqdes, notification?.toLong() ?: 0L)") as CInt

public actual fun mqReceive(mqdes: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').mqReceive(mqdes, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L)") as SsizeT

public actual fun mqSend(mqdes: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqSend(mqdes, msgPtr, msgLen, msgPrio)") as CInt

public actual fun mqSetattr(mqdes: io.github.kotlinmania.libc.MqdT, mqstat: MqAttr?, omqstat: MqAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqSetattr(mqdes, mqstat?.toLong() ?: 0L, omqstat?.toLong() ?: 0L)") as CInt

public actual fun mqTimedreceive(mqdes: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').mqTimedreceive(mqdes, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L, absTimeout?.toLong() ?: 0L)") as SsizeT

public actual fun mqTimedsend(mqdes: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqTimedsend(mqdes, msgPtr, msgLen, msgPrio, absTimeout?.toLong() ?: 0L)") as CInt

public actual fun mqUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqUnlink(name)") as CInt

public actual fun getErrnoPtr(): CInt? =
    js("require('@kotlinmania/libc-native-bindings').getErrnoPtr()") as CInt?

public actual fun myThreadExit(valuePtr: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').myThreadExit(valuePtr?.value ?: 0L)")
}

public actual fun cxaAtexit(cb: FnCallback, arg: COpaquePointer?, dso: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').cxaAtexit(cb, arg?.value ?: 0L, dso?.value ?: 0L)") as CInt
