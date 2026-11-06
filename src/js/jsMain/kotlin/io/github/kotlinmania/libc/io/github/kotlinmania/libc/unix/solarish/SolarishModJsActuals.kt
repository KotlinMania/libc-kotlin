package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.COpaquePointer

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strerrorR(errnum, buf?.value ?: 0L, buflen)") as CInt

public actual fun semDestroy(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semDestroy(sem?.toLong() ?: 0L)") as CInt

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').semInit(sem?.toLong() ?: 0L, pshared, value)") as CInt

public actual fun abs(i: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').abs(i)") as CInt

public actual fun acct(filename: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').acct(filename)") as CInt

public actual fun dirfd(dirp: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dirfd(dirp?.toLong() ?: 0L)") as CInt

public actual fun labs(i: CLong): CLong =
    js("require('@kotlinmania/libc-native-bindings').labs(i)") as CLong

public actual fun rand(): CInt =
    js("require('@kotlinmania/libc-native-bindings').rand()") as CInt

public actual fun srand(seed: CUint) {
    js("require('@kotlinmania/libc-native-bindings').srand(seed)")
}

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getentropy(buf?.value ?: 0L, buflen)") as CInt

public actual fun getrandom(bbuf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').getrandom(bbuf?.value ?: 0L, buflen, flags)") as SsizeT

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)") as CInt

public actual fun settimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').settimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)") as CInt

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getifaddrs(ifap?.value ?: 0L)") as CInt

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    js("require('@kotlinmania/libc-native-bindings').freeifaddrs(ifa?.toLong() ?: 0L)")
}

public actual fun stackGetbounds(sp: io.github.kotlinmania.libc.StackT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').stackGetbounds(sp?.toLong() ?: 0L)") as CInt

public actual fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrouplist(name, basegid, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)") as CInt

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').initgroups(name, basegid)") as CInt

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setgroups(ngroups, ptr?.toLong() ?: 0L)") as CInt

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mprotect(addr?.value ?: 0L, len, prot)") as CInt

public actual fun errno(): CInt? =
    js("require('@kotlinmania/libc-native-bindings').errno()") as CInt?

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetres(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockNanosleep(clkId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)") as CInt

public actual fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockSettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)") as CInt

public actual fun setpwent() {
    js("require('@kotlinmania/libc-native-bindings').setpwent()")
}

public actual fun endpwent() {
    js("require('@kotlinmania/libc-native-bindings').endpwent()")
}

public actual fun getpwent(): Passwd? =
    js("require('@kotlinmania/libc-native-bindings').getpwent()") as Passwd?

public actual fun fdatasync(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fdatasync(fd)") as CInt

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: LocaleT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nlLanginfoL(item, locale)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun duplocale(base: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').duplocale(base)") as LocaleT

public actual fun freelocale(loc: LocaleT) {
    js("require('@kotlinmania/libc-native-bindings').freelocale(loc)")
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').newlocale(mask, locale, base)") as LocaleT

public actual fun uselocale(loc: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').uselocale(loc)") as LocaleT

public actual fun getprogname(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getprogname()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setprogname(name: String?) {
    js("require('@kotlinmania/libc-native-bindings').setprogname(name)")
}

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getloadavg(loadavg?.toLong() ?: 0L, nelem)") as CInt

public actual fun getpriority(which: CInt, who: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpriority(which, who)") as CInt

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setpriority(which, who, prio)") as CInt

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mknodat(dirfd, pathname, mode, dev)") as CInt

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkfifoat(dirfd, pathname, mode)") as CInt

public actual fun sethostname(name: String?, len: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sethostname(name, len)") as CInt

public actual fun ifNameindex(): IfNameindex? =
    js("require('@kotlinmania/libc-native-bindings').ifNameindex()") as IfNameindex?

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    js("require('@kotlinmania/libc-native-bindings').ifFreenameindex(ptr?.toLong() ?: 0L)")
}

public actual fun pthreadCreate(native: CUint?, attr: io.github.kotlinmania.libc.PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)") as CInt

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrGetclock(attr?.toLong() ?: 0L, clockId?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)") as CInt

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semTimedwait(sem?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semGetvalue(sem?.toLong() ?: 0L, sval?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexTimedlock(lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetnameNp(tid: io.github.kotlinmania.libc.PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetnameNp(tid, name?.value ?: 0L, len)") as CInt

public actual fun pthreadSetnameNp(tid: io.github.kotlinmania.libc.PthreadT, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetnameNp(tid, name)") as CInt

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').waitid(idtype, id, infop?.toLong() ?: 0L, options)") as CInt

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').glob(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)") as CInt

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    js("require('@kotlinmania/libc-native-bindings').globfree(pglob?.toLong() ?: 0L)")
}

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFallocate(fd, offset, len)") as CInt

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixMadvise(addr?.value ?: 0L, len, advice)") as CInt

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsInit(fileActions?.value ?: 0L)") as CInt

public actual fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsDestroy(fileActions?.value ?: 0L)") as CInt

public actual fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddopen(fileActions?.value ?: 0L, fildes, path, oflag, mode)") as CInt

public actual fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddclose(fileActions?.value ?: 0L, fildes)") as CInt

public actual fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAdddup2(fileActions?.value ?: 0L, fildes, newfildes)") as CInt

public actual fun posixSpawnFileActionsAddclosefromNp(fileActions: COpaquePointer?, lowfiledes: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddclosefromNp(fileActions?.value ?: 0L, lowfiledes)") as CInt

public actual fun posixSpawnFileActionsAddchdir(fileActions: COpaquePointer?, path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddchdir(fileActions?.value ?: 0L, path)") as CInt

public actual fun posixSpawnFileActionsAddchdirNp(fileActions: COpaquePointer?, path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddchdirNp(fileActions?.value ?: 0L, path)") as CInt

public actual fun posixSpawnFileActionsAddfchdir(fileActions: COpaquePointer?, fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddfchdir(fileActions?.value ?: 0L, fd)") as CInt

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrInit(attr?.value ?: 0L)") as CInt

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrDestroy(attr?.value ?: 0L)") as CInt

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetflags(attr?.value ?: 0L, flags)") as CInt

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetflags(attr?.value ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetpgroup(attr?.value ?: 0L, pgroup)") as CInt

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: PidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetpgroup(attr?.value ?: 0L, pgroup?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetschedparam(attr?.value ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetschedparam(attr?.value ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetschedpolicy(attr?.value ?: 0L, policy)") as CInt

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, policy: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetschedpolicy(attr?.value ?: 0L, policy?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigdefault(attr?.value ?: 0L, sigdefault?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigdefault(attr?.value ?: 0L, sigdefault?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetsigignoreNp(attr: COpaquePointer?, sigignore: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigignoreNp(attr?.value ?: 0L, sigignore?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetsigignoreNp(attr: COpaquePointer?, sigignore: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigignoreNp(attr?.value ?: 0L, sigignore?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigmask(attr?.value ?: 0L, sigmask?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigmask(attr?.value ?: 0L, sigmask?.toLong() ?: 0L)") as CInt

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').shmat(shmid, shmaddr?.value ?: 0L, shmflg)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmctl(shmid, cmd, buf?.toLong() ?: 0L)") as CInt

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmdt(shmaddr?.value ?: 0L)") as CInt

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmget(key, size, shmflg)") as CInt

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmOpen(name, oflag, mode)") as CInt

public actual fun shmUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmUnlink(name)") as CInt

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    js("require('@kotlinmania/libc-native-bindings').seekdir(dirp?.toLong() ?: 0L, loc)")
}

public actual fun telldir(dirp: DIR?): CLong =
    js("require('@kotlinmania/libc-native-bindings').telldir(dirp?.toLong() ?: 0L)") as CLong

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').madvise(addr?.value ?: 0L, len, advice)") as CInt

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msync(addr?.value ?: 0L, len, flags)") as CInt

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memalign(align, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CUint?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as SsizeT

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkstemps(template?.value ?: 0L, suffixlen)") as CInt

public actual fun futimesat(fd: CInt, path: String?, times: Timeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimesat(fd, path, times?.toLong() ?: 0L)") as CInt

public actual fun futimens(dirfd: CInt, times: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimens(dirfd, times?.toLong() ?: 0L)") as CInt

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').utimensat(dirfd, path, times?.toLong() ?: 0L, flag)") as CInt

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nlLanginfo(item)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

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

public actual fun accept4(fd: CInt, address: Sockaddr?, addressLen: CUint?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').accept4(fd, address?.toLong() ?: 0L, addressLen?.toLong() ?: 0L, flags)") as CInt

public actual fun mqClose(mqd: io.github.kotlinmania.libc.MqdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqClose(mqd)") as CInt

public actual fun mqUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqUnlink(name)") as CInt

public actual fun mqReceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').mqReceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L)") as SsizeT

public actual fun mqTimedreceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').mqTimedreceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L, absTimeout?.toLong() ?: 0L)") as SsizeT

public actual fun mqSend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqSend(mqd, msgPtr, msgLen, msgPrio)") as CInt

public actual fun mqTimedsend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqTimedsend(mqd, msgPtr, msgLen, msgPrio, absTimeout?.toLong() ?: 0L)") as CInt

public actual fun mqGetattr(mqd: io.github.kotlinmania.libc.MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqGetattr(mqd, attr?.toLong() ?: 0L)") as CInt

public actual fun mqSetattr(mqd: io.github.kotlinmania.libc.MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqSetattr(mqd, newattr?.toLong() ?: 0L, oldattr?.toLong() ?: 0L)") as CInt

public actual fun portCreate(): CInt =
    js("require('@kotlinmania/libc-native-bindings').portCreate()") as CInt

public actual fun portAssociate(port: CInt, source: CInt, obj: UintptrT, events: CInt, user: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').portAssociate(port, source, obj, events, user?.value ?: 0L)") as CInt

public actual fun portDissociate(port: CInt, source: CInt, obj: UintptrT): CInt =
    js("require('@kotlinmania/libc-native-bindings').portDissociate(port, source, obj)") as CInt

public actual fun portGet(port: CInt, pe: PortEvent?, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').portGet(port, pe?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as CInt

public actual fun portGetn(port: CInt, peList: PortEvent?, max: CUint, nget: CUint?, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').portGetn(port, peList?.toLong() ?: 0L, max, nget?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as CInt

public actual fun portSend(port: CInt, events: CInt, user: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').portSend(port, events, user?.value ?: 0L)") as CInt

public actual fun portSendn(portList: CInt?, errorList: CInt?, nent: CUint, events: CInt, user: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').portSendn(portList?.toLong() ?: 0L, errorList?.toLong() ?: 0L, nent, events, user?.value ?: 0L)") as CInt

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)") as CInt

public actual fun sigsuspend(mask: io.github.kotlinmania.libc.SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigsuspend(mask?.toLong() ?: 0L)") as CInt

public actual fun semClose(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semClose(sem?.toLong() ?: 0L)") as CInt

public actual fun getdtablesize(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getdtablesize()") as CInt

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun thrSelf(): io.github.kotlinmania.libc.ThreadT =
    js("require('@kotlinmania/libc-native-bindings').thrSelf()") as io.github.kotlinmania.libc.ThreadT

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSigmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)") as CInt

public actual fun getgrnam(name: String?): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrnam(name)") as Group?

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKill(thread, sig)") as CInt

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetPriorityMin(policy)") as CInt

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetPriorityMax(policy)") as CInt

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun schedGetscheduler(pid: PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetscheduler(pid)") as CInt

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetscheduler(pid, policy, param?.toLong() ?: 0L)") as CInt

public actual fun semUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semUnlink(name)") as CInt

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').daemon(nochdir, noclose)") as CInt

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun nativeGetpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: CInt): Passwd? =
    js("require('@kotlinmania/libc-native-bindings').nativeGetpwentR(pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen)") as Passwd?

public actual fun nativeGetgrentR(grp: Group?, buf: COpaquePointer?, buflen: CInt): Group? =
    js("require('@kotlinmania/libc-native-bindings').nativeGetgrentR(grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen)") as Group?

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)") as CInt

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)") as CInt

public actual fun getgrgid(gid: GidT): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrgid(gid)") as Group?

public actual fun setgrent() {
    js("require('@kotlinmania/libc-native-bindings').setgrent()")
}

public actual fun endgrent() {
    js("require('@kotlinmania/libc-native-bindings').endgrent()")
}

public actual fun getgrent(): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrent()") as Group?

public actual fun popen(command: String?, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').popen(command, mode)") as FILE?

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').dup3(src, dst, flags)") as CInt

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    js("require('@kotlinmania/libc-native-bindings').uname(buf?.toLong() ?: 0L)") as CInt

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pipe2(fds?.toLong() ?: 0L, flags)") as CInt

public actual fun makeutx(ux: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').makeutx(ux?.toLong() ?: 0L)") as Utmpx?

public actual fun modutx(ux: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').modutx(ux?.toLong() ?: 0L)") as Utmpx?

public actual fun updwtmpx(file: String?, ut: Utmpx?) {
    js("require('@kotlinmania/libc-native-bindings').updwtmpx(file, ut?.toLong() ?: 0L)")
}

public actual fun utmpxname(file: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').utmpxname(file)") as CInt

public actual fun getutxent(): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxent()") as Utmpx?

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxid(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxline(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').pututxline(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun setutxent() {
    js("require('@kotlinmania/libc-native-bindings').setutxent()")
}

public actual fun endutxent() {
    js("require('@kotlinmania/libc-native-bindings').endutxent()")
}

public actual fun endutent() {
    js("require('@kotlinmania/libc-native-bindings').endutent()")
}

public actual fun getutent(): Utmp? =
    js("require('@kotlinmania/libc-native-bindings').getutent()") as Utmp?

public actual fun getutid(u: Utmp?): Utmp? =
    js("require('@kotlinmania/libc-native-bindings').getutid(u?.toLong() ?: 0L)") as Utmp?

public actual fun getutline(u: Utmp?): Utmp? =
    js("require('@kotlinmania/libc-native-bindings').getutline(u?.toLong() ?: 0L)") as Utmp?

public actual fun pututline(u: Utmp?): Utmp? =
    js("require('@kotlinmania/libc-native-bindings').pututline(u?.toLong() ?: 0L)") as Utmp?

public actual fun setutent() {
    js("require('@kotlinmania/libc-native-bindings').setutent()")
}

public actual fun utmpname(file: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').utmpname(file)") as CInt

public actual fun getutmp(ux: Utmpx?, u: Utmp?) {
    js("require('@kotlinmania/libc-native-bindings').getutmp(ux?.toLong() ?: 0L, u?.toLong() ?: 0L)")
}

public actual fun getutmpx(u: Utmp?, ux: Utmpx?) {
    js("require('@kotlinmania/libc-native-bindings').getutmpx(u?.toLong() ?: 0L, ux?.toLong() ?: 0L)")
}

public actual fun updwtmp(file: String?, u: Utmp?) {
    js("require('@kotlinmania/libc-native-bindings').updwtmp(file, u?.toLong() ?: 0L)")
}

public actual fun ntpAdjtime(buf: Timex?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ntpAdjtime(buf?.toLong() ?: 0L)") as CInt

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ntpGettime(buf?.toLong() ?: 0L)") as CInt

public actual fun timerCreate(clockId: ClockidT, evp: Sigevent?, timerid: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerCreate(clockId, evp?.toLong() ?: 0L, timerid?.toLong() ?: 0L)") as CInt

public actual fun timerDelete(timerid: TimerT): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerDelete(timerid)") as CInt

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerGetoverrun(timerid)") as CInt

public actual fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerGettime(timerid, value?.toLong() ?: 0L)") as CInt

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: Itimerspec?, ovalue: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerSettime(timerid, flags, value?.toLong() ?: 0L, ovalue?.toLong() ?: 0L)") as CInt

public actual fun ucredGet(pid: PidT): UcredT? =
    js("require('@kotlinmania/libc-native-bindings').ucredGet(pid)") as UcredT?

public actual fun getpeerucred(fd: CInt, ucred: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpeerucred(fd, ucred?.value ?: 0L)") as CInt

public actual fun ucredFree(ucred: UcredT?) {
    js("require('@kotlinmania/libc-native-bindings').ucredFree(ucred?.toLong() ?: 0L)")
}

public actual fun ucredGeteuid(ucred: UcredT?): UidT =
    js("require('@kotlinmania/libc-native-bindings').ucredGeteuid(ucred?.toLong() ?: 0L)") as UidT

public actual fun ucredGetruid(ucred: UcredT?): UidT =
    js("require('@kotlinmania/libc-native-bindings').ucredGetruid(ucred?.toLong() ?: 0L)") as UidT

public actual fun ucredGetsuid(ucred: UcredT?): UidT =
    js("require('@kotlinmania/libc-native-bindings').ucredGetsuid(ucred?.toLong() ?: 0L)") as UidT

public actual fun ucredGetegid(ucred: UcredT?): GidT =
    js("require('@kotlinmania/libc-native-bindings').ucredGetegid(ucred?.toLong() ?: 0L)") as GidT

public actual fun ucredGetrgid(ucred: UcredT?): GidT =
    js("require('@kotlinmania/libc-native-bindings').ucredGetrgid(ucred?.toLong() ?: 0L)") as GidT

public actual fun ucredGetsgid(ucred: UcredT?): GidT =
    js("require('@kotlinmania/libc-native-bindings').ucredGetsgid(ucred?.toLong() ?: 0L)") as GidT

public actual fun ucredGetgroups(ucred: UcredT?, groups: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ucredGetgroups(ucred?.toLong() ?: 0L, groups?.value ?: 0L)") as CInt

public actual fun ucredGetpid(ucred: UcredT?): PidT =
    js("require('@kotlinmania/libc-native-bindings').ucredGetpid(ucred?.toLong() ?: 0L)") as PidT

public actual fun ucredGetprojid(ucred: UcredT?): ProjidT =
    js("require('@kotlinmania/libc-native-bindings').ucredGetprojid(ucred?.toLong() ?: 0L)") as ProjidT

public actual fun ucredGetzoneid(ucred: UcredT?): ZoneidT =
    js("require('@kotlinmania/libc-native-bindings').ucredGetzoneid(ucred?.toLong() ?: 0L)") as ZoneidT

public actual fun ucredGetpflags(ucred: UcredT?, flags: CUint): CUint =
    js("require('@kotlinmania/libc-native-bindings').ucredGetpflags(ucred?.toLong() ?: 0L, flags)") as CUint

public actual fun ucredSize(): SizeT =
    js("require('@kotlinmania/libc-native-bindings').ucredSize()") as SizeT

public actual fun psetCreate(newpset: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').psetCreate(newpset?.toLong() ?: 0L)") as CInt

public actual fun psetDestroy(pset: io.github.kotlinmania.libc.PsetidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').psetDestroy(pset)") as CInt

public actual fun psetAssign(pset: io.github.kotlinmania.libc.PsetidT, cpu: io.github.kotlinmania.libc.ProcessoridT, opset: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').psetAssign(pset, cpu, opset?.toLong() ?: 0L)") as CInt

public actual fun psetInfo(pset: io.github.kotlinmania.libc.PsetidT, tpe: CInt?, numcpus: CUint?, cpulist: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').psetInfo(pset, tpe?.toLong() ?: 0L, numcpus?.toLong() ?: 0L, cpulist?.toLong() ?: 0L)") as CInt

public actual fun psetBind(pset: io.github.kotlinmania.libc.PsetidT, idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT, opset: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').psetBind(pset, idtype, id, opset?.toLong() ?: 0L)") as CInt

public actual fun psetList(pset: CInt?, numpsets: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').psetList(pset?.toLong() ?: 0L, numpsets?.toLong() ?: 0L)") as CInt

public actual fun psetSetattr(pset: PsetidT, attr: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').psetSetattr(pset, attr)") as CInt

public actual fun psetGetattr(pset: PsetidT, attr: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').psetGetattr(pset, attr?.toLong() ?: 0L)") as CInt

public actual fun processorBind(idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT, newBinding: io.github.kotlinmania.libc.ProcessoridT, oldBinding: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').processorBind(idtype, id, newBinding, oldBinding?.toLong() ?: 0L)") as CInt

public actual fun pOnline(processorid: io.github.kotlinmania.libc.ProcessoridT, flag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pOnline(processorid, flag)") as CInt

public actual fun processorInfo(processorid: io.github.kotlinmania.libc.ProcessoridT, infop: ProcessorInfoT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').processorInfo(processorid, infop?.toLong() ?: 0L)") as CInt

public actual fun getexecname(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getexecname()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gethostid(): CLong =
    js("require('@kotlinmania/libc-native-bindings').gethostid()") as CLong

public actual fun getpflags(flags: CUint): CUint =
    js("require('@kotlinmania/libc-native-bindings').getpflags(flags)") as CUint

public actual fun setpflags(flags: CUint, value: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').setpflags(flags, value)") as CInt

public actual fun sysinfo(command: CInt, buf: COpaquePointer?, count: CLong): CInt =
    js("require('@kotlinmania/libc-native-bindings').sysinfo(command, buf?.value ?: 0L, count)") as CInt

public actual fun faccessat(fd: CInt, path: String?, amode: CInt, flag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').faccessat(fd, path, amode, flag)") as CInt

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)") as CInt

public actual fun getpagesize(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpagesize()") as CInt

public actual fun getpagesizes(pagesize: SizeT?, nelem: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpagesizes(pagesize?.toLong() ?: 0L, nelem)") as CInt

public actual fun mmapobj(fd: CInt, flags: CUint, storage: MmapobjResultT?, elements: CUint?, arg: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mmapobj(fd, flags, storage?.toLong() ?: 0L, elements?.toLong() ?: 0L, arg?.value ?: 0L)") as CInt

public actual fun meminfo(inaddr: ULong?, addrCount: CInt, infoReq: CUint?, infoCount: CInt, outdata: ULong?, validity: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').meminfo(inaddr?.toLong() ?: 0L, addrCount, infoReq?.toLong() ?: 0L, infoCount, outdata?.toLong() ?: 0L, validity?.toLong() ?: 0L)") as CInt

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strsep(string?.value ?: 0L, delim)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getisax(array: UInt?, n: CUint): CUint =
    js("require('@kotlinmania/libc-native-bindings').getisax(array?.toLong() ?: 0L, n)") as CUint

public actual fun backtrace(buffer: COpaquePointer?, size: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').backtrace(buffer?.value ?: 0L, size)") as CInt

public actual fun backtraceSymbols(buffer: COpaquePointer?, size: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').backtraceSymbols(buffer?.value ?: 0L, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, size: CInt, fd: CInt) {
    js("require('@kotlinmania/libc-native-bindings').backtraceSymbolsFd(buffer?.value ?: 0L, size, fd)")
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getoptLong(argc, argv?.value ?: 0L, optstring, longopts?.toLong() ?: 0L, longindex?.toLong() ?: 0L)") as CInt

public actual fun sync() {
    js("require('@kotlinmania/libc-native-bindings').sync()")
}

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioCancel(fd, aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioError(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioError(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioFsync(op, aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioRead(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').aioReturn(aiocbp?.toLong() ?: 0L)") as SsizeT

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioSuspend(aiocbList?.value ?: 0L, nitems, timeout?.toLong() ?: 0L)") as CInt

public actual fun aioWaitn(aiocbList: COpaquePointer?, nent: CUint, nwait: CUint?, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioWaitn(aiocbList?.value ?: 0L, nent, nwait?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as CInt

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioWrite(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lioListio(mode, aiocbList?.value ?: 0L, nitems, sevp?.toLong() ?: 0L)") as CInt

public actual fun major(version: CInt, devnum: io.github.kotlinmania.libc.DevT): io.github.kotlinmania.libc.MajorT =
    js("require('@kotlinmania/libc-native-bindings').major(version, devnum)") as io.github.kotlinmania.libc.MajorT

public actual fun minor(version: CInt, devnum: io.github.kotlinmania.libc.DevT): io.github.kotlinmania.libc.MinorT =
    js("require('@kotlinmania/libc-native-bindings').minor(version, devnum)") as io.github.kotlinmania.libc.MinorT

public actual fun makedev(version: CInt, majdev: io.github.kotlinmania.libc.MajorT, mindev: io.github.kotlinmania.libc.MinorT): io.github.kotlinmania.libc.DevT =
    js("require('@kotlinmania/libc-native-bindings').makedev(version, majdev, mindev)") as io.github.kotlinmania.libc.DevT

public actual fun arc4random(): UInt =
    js("require('@kotlinmania/libc-native-bindings').arc4random()") as UInt

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').arc4randomBuf(buf?.value ?: 0L, nbytes)")
}

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    js("require('@kotlinmania/libc-native-bindings').arc4randomUniform(upperBound)") as UInt

public actual fun secureGetenv(name: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').secureGetenv(name)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: io.github.kotlinmania.libc.Tm?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strftime(s?.value ?: 0L, maxsize, format, timeptr?.toLong() ?: 0L)") as SizeT

public actual fun strftimeL(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: io.github.kotlinmania.libc.Tm?, loc: LocaleT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strftimeL(s?.value ?: 0L, maxsize, format, timeptr?.toLong() ?: 0L, loc)") as SizeT

public actual fun sendfile(outFd: CInt, inFd: CInt, off: CLong?, len: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendfile(outFd, inFd, off?.toLong() ?: 0L, len)") as SsizeT

public actual fun sendfilev(fildes: CInt, vec: SendfilevecT?, sfvcnt: CInt, xferred: SizeT?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendfilev(fildes, vec?.toLong() ?: 0L, sfvcnt, xferred?.toLong() ?: 0L)") as SsizeT

public actual fun lgrpInit(view: LgrpViewT): LgrpCookieT =
    js("require('@kotlinmania/libc-native-bindings').lgrpInit(view)") as LgrpCookieT

public actual fun lgrpFini(cookie: LgrpCookieT): CInt =
    js("require('@kotlinmania/libc-native-bindings').lgrpFini(cookie)") as CInt

public actual fun lgrpAffinityGet(idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT, lgrp: io.github.kotlinmania.libc.LgrpIdT): LgrpAffinityT =
    js("require('@kotlinmania/libc-native-bindings').lgrpAffinityGet(idtype, id, lgrp)") as LgrpAffinityT

public actual fun lgrpAffinitySet(idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT, lgrp: io.github.kotlinmania.libc.LgrpIdT, aff: LgrpAffinityT): CInt =
    js("require('@kotlinmania/libc-native-bindings').lgrpAffinitySet(idtype, id, lgrp, aff)") as CInt

public actual fun lgrpCpus(cookie: io.github.kotlinmania.libc.LgrpCookieT, lgrp: io.github.kotlinmania.libc.LgrpIdT, cpuids: CInt?, count: CUint, content: io.github.kotlinmania.libc.LgrpContentT): CInt =
    js("require('@kotlinmania/libc-native-bindings').lgrpCpus(cookie, lgrp, cpuids?.toLong() ?: 0L, count, content)") as CInt

public actual fun lgrpMemSize(cookie: io.github.kotlinmania.libc.LgrpCookieT, lgrp: io.github.kotlinmania.libc.LgrpIdT, tpe: io.github.kotlinmania.libc.LgrpMemSizeFlagT, content: io.github.kotlinmania.libc.LgrpContentT): io.github.kotlinmania.libc.LgrpMemSizeT =
    js("require('@kotlinmania/libc-native-bindings').lgrpMemSize(cookie, lgrp, tpe, content)") as io.github.kotlinmania.libc.LgrpMemSizeT

public actual fun lgrpNlgrps(cookie: io.github.kotlinmania.libc.LgrpCookieT): CInt =
    js("require('@kotlinmania/libc-native-bindings').lgrpNlgrps(cookie)") as CInt

public actual fun lgrpView(cookie: io.github.kotlinmania.libc.LgrpCookieT): io.github.kotlinmania.libc.LgrpViewT =
    js("require('@kotlinmania/libc-native-bindings').lgrpView(cookie)") as io.github.kotlinmania.libc.LgrpViewT

public actual fun lgrpHome(idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT): io.github.kotlinmania.libc.LgrpIdT =
    js("require('@kotlinmania/libc-native-bindings').lgrpHome(idtype, id)") as io.github.kotlinmania.libc.LgrpIdT

public actual fun lgrpVersion(version: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').lgrpVersion(version)") as CInt

public actual fun lgrpResources(cookie: io.github.kotlinmania.libc.LgrpCookieT, lgrp: io.github.kotlinmania.libc.LgrpIdT, lgrps: CInt?, count: CUint, tpe: LgrpRsrcT): CInt =
    js("require('@kotlinmania/libc-native-bindings').lgrpResources(cookie, lgrp, lgrps?.toLong() ?: 0L, count, tpe)") as CInt

public actual fun lgrpRoot(cookie: io.github.kotlinmania.libc.LgrpCookieT): io.github.kotlinmania.libc.LgrpIdT =
    js("require('@kotlinmania/libc-native-bindings').lgrpRoot(cookie)") as io.github.kotlinmania.libc.LgrpIdT
