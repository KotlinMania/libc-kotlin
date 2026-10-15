// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public actual fun setgrent(): Unit = throw UnsupportedOperationException("setgrent requires N-API addon")

public actual fun semDestroy(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semDestroy requires N-API addon")

public actual fun semInit(sem: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit requires N-API addon")

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    throw UnsupportedOperationException("daemon requires N-API addon")

public actual fun accept4(s: Int, addr: Sockaddr?, addrlen: UInt?, flags: Int): Int =
    throw UnsupportedOperationException("accept4 requires N-API addon")

public actual fun mincore(addr: COpaquePointer?, len: ULong, vec: String?): Int =
    throw UnsupportedOperationException("mincore requires N-API addon")

public actual fun clockGetres(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres requires N-API addon")

public actual fun clockGettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun clockSettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime requires N-API addon")

public actual fun errno(): Int? =
    throw UnsupportedOperationException("errno requires N-API addon")

public actual fun shmOpen(name: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("shmOpen requires N-API addon")

public actual fun memrchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires N-API addon")

public actual fun mkostemp(template: String?, flags: Int): Int =
    throw UnsupportedOperationException("mkostemp requires N-API addon")

public actual fun mkostemps(template: String?, suffixlen: Int, flags: Int): Int =
    throw UnsupportedOperationException("mkostemps requires N-API addon")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int =
    throw UnsupportedOperationException("utimensat requires N-API addon")

public actual fun fdatasync(fd: Int): Int =
    throw UnsupportedOperationException("fdatasync requires N-API addon")

public actual fun loginTty(fd: Int): Int =
    throw UnsupportedOperationException("loginTty requires N-API addon")

public actual fun getpriority(which: Int, who: UInt): Int =
    throw UnsupportedOperationException("getpriority requires N-API addon")

public actual fun setpriority(which: Int, who: UInt, prio: Int): Int =
    throw UnsupportedOperationException("setpriority requires N-API addon")

public actual fun mknodat(dirfd: Int, pathname: String?, mode: UInt, dev: ULong): Int =
    throw UnsupportedOperationException("mknodat requires N-API addon")

public actual fun mkfifoat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifoat requires N-API addon")

public actual fun semTimedwait(sem: io.github.kotlinmania.libc.COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("semTimedwait requires N-API addon")

public actual fun semGetvalue(sem: io.github.kotlinmania.libc.COpaquePointer?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue requires N-API addon")

public actual fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun sethostname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("sethostname requires N-API addon")

public actual fun pthreadMutexTimedlock(lock: io.github.kotlinmania.libc.COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires N-API addon")

public actual fun pthreadSpinInit(lock: Int?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadSpinInit requires N-API addon")

public actual fun pthreadSpinDestroy(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinDestroy requires N-API addon")

public actual fun pthreadSpinLock(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinLock requires N-API addon")

public actual fun pthreadSpinTrylock(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinTrylock requires N-API addon")

public actual fun pthreadSpinUnlock(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinUnlock requires N-API addon")

public actual fun pthreadSetschedparam(native: ULong, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadSetschedparam requires N-API addon")

public actual fun pthreadGetschedparam(native: ULong, policy: Int?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadGetschedparam requires N-API addon")

public actual fun pipe2(fds: Int?, flags: Int): Int =
    throw UnsupportedOperationException("pipe2 requires N-API addon")

public actual fun ppoll(fds: Pollfd?, nfds: UInt, ts: Timespec?, sigmask: ULong?): Int =
    throw UnsupportedOperationException("ppoll requires N-API addon")

public actual fun getgrouplist(name: String?, basegid: UInt, groups: UInt?, ngroups: Int?): Int =
    throw UnsupportedOperationException("getgrouplist requires N-API addon")

public actual fun initgroups(name: String?, basegid: UInt): Int =
    throw UnsupportedOperationException("initgroups requires N-API addon")

public actual fun getdomainname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("getdomainname requires N-API addon")

public actual fun setdomainname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("setdomainname requires N-API addon")

public actual fun uname(buf: Utsname?): Int =
    throw UnsupportedOperationException("uname requires N-API addon")

public actual fun shmget(key: Long, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget requires N-API addon")

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires N-API addon")

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("shmdt requires N-API addon")

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl requires N-API addon")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvpe requires N-API addon")

public actual fun waitid(idtype: Int, id: UInt, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid requires N-API addon")

public actual fun posixSpawn(pid: Int?, path: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawn requires N-API addon")

public actual fun posixSpawnp(pid: Int?, file: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnp requires N-API addon")

public actual fun posixSpawnattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrInit requires N-API addon")

public actual fun posixSpawnattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrDestroy requires N-API addon")

public actual fun posixSpawnattrGetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, default: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault requires N-API addon")

public actual fun posixSpawnattrSetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, default: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault requires N-API addon")

public actual fun posixSpawnattrGetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, default: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask requires N-API addon")

public actual fun posixSpawnattrSetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, default: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask requires N-API addon")

public actual fun posixSpawnattrGetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetflags requires N-API addon")

public actual fun posixSpawnattrSetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short): Int =
    throw UnsupportedOperationException("posixSpawnattrSetflags requires N-API addon")

public actual fun posixSpawnattrGetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup requires N-API addon")

public actual fun posixSpawnattrSetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup requires N-API addon")

public actual fun posixSpawnattrGetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy requires N-API addon")

public actual fun posixSpawnattrSetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy requires N-API addon")

public actual fun posixSpawnattrGetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam requires N-API addon")

public actual fun posixSpawnattrSetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam requires N-API addon")

public actual fun posixSpawnFileActionsInit(actions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires N-API addon")

public actual fun posixSpawnFileActionsDestroy(actions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires N-API addon")

public actual fun posixSpawnFileActionsAddopen(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int, path: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires N-API addon")

public actual fun posixSpawnFileActionsAddclose(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires N-API addon")

public actual fun posixSpawnFileActionsAdddup2(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int, newfd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires N-API addon")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires N-API addon")

public actual fun gethostid(): Long =
    throw UnsupportedOperationException("gethostid requires N-API addon")

public actual fun sethostid(hostid: Long): Int =
    throw UnsupportedOperationException("sethostid requires N-API addon")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname requires N-API addon")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename requires N-API addon")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy requires N-API addon")

public actual fun sendmmsg(sockfd: Int, mmsg: Mmsghdr?, vlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("sendmmsg requires N-API addon")

public actual fun recvmmsg(sockfd: Int, mmsg: Mmsghdr?, vlen: UInt, flags: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("recvmmsg requires N-API addon")

public actual fun closefrom(lowfd: Int): Int =
    throw UnsupportedOperationException("closefrom requires N-API addon")
