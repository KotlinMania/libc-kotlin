@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.ShortVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_access
import libc.cinterop.libc_atoi
import libc.cinterop.libc_chdir
import libc.cinterop.libc_close
import libc.cinterop.libc_closedir
import libc.cinterop.libc_dup
import libc.cinterop.libc_dup2
import libc.cinterop.libc_fchdir
import libc.cinterop.libc_fileno
import libc.cinterop.libc_fseeko
import libc.cinterop.libc_fsync
import libc.cinterop.libc_ftruncate
import libc.cinterop.libc_futimens
import libc.cinterop.libc_gettimeofday
import libc.cinterop.libc_link
import libc.cinterop.libc_linkat
import libc.cinterop.libc_listen
import libc.cinterop.libc_mkdir
import libc.cinterop.libc_mkstemp
import libc.cinterop.libc_mlockall
import libc.cinterop.libc_munlockall
import libc.cinterop.libc_pause
import libc.cinterop.libc_poll
import libc.cinterop.libc_poll_single
import libc.cinterop.libc_pthread_setspecific
import libc.cinterop.libc_rmdir
import libc.cinterop.libc_sched_get_priority_max
import libc.cinterop.libc_sched_get_priority_min
import libc.cinterop.libc_sched_getscheduler
import libc.cinterop.libc_setegid
import libc.cinterop.libc_setenv
import libc.cinterop.libc_seteuid
import libc.cinterop.libc_setgid
import libc.cinterop.libc_setlogmask
import libc.cinterop.libc_setuid
import libc.cinterop.libc_shm_open
import libc.cinterop.libc_shm_unlink
import libc.cinterop.libc_shutdown
import libc.cinterop.libc_strcasecmp
import libc.cinterop.libc_strcmp
import libc.cinterop.libc_strcoll
import libc.cinterop.libc_strncasecmp
import libc.cinterop.libc_strncmp
import libc.cinterop.libc_symlink
import libc.cinterop.libc_symlinkat
import libc.cinterop.libc_system
import libc.cinterop.libc_tcsendbreak
import libc.cinterop.libc_tolower
import libc.cinterop.libc_toupper
import libc.cinterop.libc_truncate
import libc.cinterop.libc_uname
import libc.cinterop.libc_unlink
import libc.cinterop.libc_unlinkat
import libc.cinterop.libc_unsetenv
import libc.cinterop.libc_utimensat

public actual fun tolower(c: Int): Int = libc.cinterop.libc_tolower(c)

public actual fun toupper(c: Int): Int = libc.cinterop.libc_toupper(c)

public actual fun atoi(s: String?): Int {
    if (s == null) return 0
    return libc.cinterop.libc_atoi(s)
}

public actual fun system(s: String?): Int {
    if (s == null) return -1
    return libc.cinterop.libc_system(s)
}

public actual fun cfmakeraw(termios: Termios?): Int =
    throw UnsupportedOperationException("cfmakeraw requires manual FFI bridge — not yet implemented")

public actual fun cfsetispeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetispeed requires manual FFI bridge — not yet implemented")

public actual fun cfsetospeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetospeed requires manual FFI bridge — not yet implemented")

public actual fun strcmp(cs: String?, ct: String?): Int {
    if (cs == null) return -1
    if (ct == null) return -1
    return libc.cinterop.libc_strcmp(cs, ct)
}

public actual fun strncmp(cs: String?, ct: String?, n: ULong): Int =
    libc.cinterop.libc_strncmp(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): Int {
    if (cs == null) return -1
    if (ct == null) return -1
    return libc.cinterop.libc_strcoll(cs, ct)
}

public actual fun strcasecmp(s1: String?, s2: String?): Int {
    if (s1 == null) return -1
    if (s2 == null) return -1
    return libc.cinterop.libc_strcasecmp(s1, s2)
}

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): Int =
    libc.cinterop.libc_strncasecmp(s1, s2, n)

public actual fun uname(buf: Utsname?): Int {
    if (buf == null) return -1
    val bufPtr: CPointer<ByteVar>? = buf.handle.toCPointer()
    val result = libc_uname(bufPtr)
    return result
}

public actual fun pclose(stream: FILE?): Int =
    throw UnsupportedOperationException("pclose requires manual FFI bridge — not yet implemented")

public actual fun linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int {
    if (oldpath == null) return -1
    if (newpath == null) return -1
    return libc.cinterop.libc_linkat(olddirfd, oldpath, newdirfd, newpath, flags)
}

public actual fun unlinkat(dirfd: Int, pathname: String?, flags: Int): Int {
    if (pathname == null) return -1
    return libc.cinterop.libc_unlinkat(dirfd, pathname, flags)
}

public actual fun fchownat(dirfd: Int, pathname: String?, owner: UShort, group: UShort, flags: Int): Int =
    throw UnsupportedOperationException("fchownat requires manual FFI bridge — not yet implemented")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fprintf requires manual FFI bridge — not yet implemented")

public actual fun printf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("printf requires manual FFI bridge — not yet implemented")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("snprintf requires manual FFI bridge — not yet implemented")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sprintf requires manual FFI bridge — not yet implemented")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fscanf requires manual FFI bridge — not yet implemented")

public actual fun scanf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("scanf requires manual FFI bridge — not yet implemented")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sscanf requires manual FFI bridge — not yet implemented")

public actual fun getcharUnlocked(): Int =
    throw UnsupportedOperationException("getcharUnlocked requires manual FFI bridge — not yet implemented")

public actual fun putcharUnlocked(c: Int): Int =
    throw UnsupportedOperationException("putcharUnlocked requires manual FFI bridge — not yet implemented")

public actual fun stat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("stat requires manual FFI bridge — not yet implemented")

public actual fun fileno(stream: FILE?): Int =
    libc.cinterop.libc_fileno(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun creat(path: String?, mode: Int): Int =
    throw UnsupportedOperationException("creat requires FFI bridge")

public actual fun fchown(fd: Int, owner: UShort, group: UShort): Int =
    throw UnsupportedOperationException("fchown requires FFI bridge")

public actual fun access(path: String?, amode: Int): Int {
    if (path == null) return -1
    return libc.cinterop.libc_access(path, amode)
}

public actual fun fchdir(dirfd: Int): Int = libc.cinterop.libc_fchdir(dirfd)

public actual fun chown(path: String?, uid: UShort, gid: UShort): Int =
    throw UnsupportedOperationException("chown requires FFI bridge")

public actual fun getgroups(ngroupsMax: Int, groups: UShort?): Int =
    throw UnsupportedOperationException("getgroups requires manual FFI bridge — not yet implemented")

public actual fun getopt(argc: Int, argv: COpaquePointer?, optstr: String?): Int =
    throw UnsupportedOperationException("getopt requires manual FFI bridge — not yet implemented")

public actual fun pause(): Int = libc.cinterop.libc_pause()

public actual fun seteuid(uid: UShort): Int {
    val result = libc.cinterop.libc_seteuid(uid.toInt())
    return result
}

public actual fun setegid(gid: UShort): Int {
    val result = libc.cinterop.libc_setegid(gid.toInt())
    return result
}

public actual fun mlock(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("mlock requires FFI bridge")

public actual fun mlockall(flags: Int): Int = libc.cinterop.libc_mlockall(flags)

public actual fun munlock(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munlock requires FFI bridge")

public actual fun munlockall(): Int = libc.cinterop.libc_munlockall()

public actual fun munmap(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munmap requires FFI bridge")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires FFI bridge")

public actual fun truncate(path: String?, length: Long): Int {
    if (path == null) return -1
    return libc.cinterop.libc_truncate(path, length)
}

public actual fun shmOpen(name: String?, oflag: Int, mode: Int): Int {
    val result = libc.cinterop.libc_shm_open(name, oflag, mode)
    return result
}

public actual fun shmUnlink(name: String?): Int {
    val result = libc_shm_unlink(name)
    return result
}

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.value.toCPointer()
    val result = libc_gettimeofday(tpPtr, tzPtr)
    return result
}

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate requires manual FFI bridge — not yet implemented")

public actual fun pthreadEqual(t1: ULong, t2: ULong): Int =
    throw UnsupportedOperationException("pthreadEqual requires manual FFI bridge — not yet implemented")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires FFI bridge")

public actual fun sigaddset(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigaddset requires FFI bridge")

public actual fun sigaction(signum: Int, act: Sigaction?, oldact: Sigaction?): Int =
    throw UnsupportedOperationException("sigaction requires manual FFI bridge — not yet implemented")

public actual fun utimes(filename: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("utimes requires manual FFI bridge — not yet implemented")

public actual fun futimens(fd: Int, times: Timespec?): Int {
    if (times == null) return -1
    val timesPtr: CPointer<ByteVar>? = times.handle.toCPointer()
    val result = libc_futimens(fd, timesPtr)
    return result
}

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int {
    if (times == null) return -1
    val timesPtr: CPointer<ByteVar>? = times.handle.toCPointer()
    val result = libc_utimensat(dirfd, path, timesPtr, flag)
    return result
}

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): Int =
    throw UnsupportedOperationException("dladdr requires manual FFI bridge — not yet implemented")

public actual fun gethostname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("gethostname requires FFI bridge")

public actual fun usleep(secs: ULong): Int =
    throw UnsupportedOperationException("usleep requires manual FFI bridge — type mismatch")

public actual fun putenv(string: String?): Int =
    throw UnsupportedOperationException("putenv requires manual FFI bridge — not yet implemented")

public actual fun sigprocmask(how: Int, set: ULong?, oldset: ULong?): Int =
    throw UnsupportedOperationException("sigprocmask requires manual FFI bridge — not yet implemented")

public actual fun sigpending(set: ULong?): Int =
    throw UnsupportedOperationException("sigpending requires manual FFI bridge — not yet implemented")

public actual fun mkfifo(path: String?, mode: Int): Int =
    throw UnsupportedOperationException("mkfifo requires FFI bridge")

public actual fun fseeko(stream: FILE?, offset: Long, whence: Int): Int =
    libc.cinterop.libc_fseeko(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), offset, whence)

public actual fun mkstemp(template: String?): Int {
    if (template == null) return -1
    return libc.cinterop.libc_mkstemp(template)
}

public actual fun setlogmask(maskpri: Int): Int = libc.cinterop.libc_setlogmask(maskpri)

public actual fun tcsetattr(fd: Int, optionalActions: Int, termios: Termios?): Int =
    throw UnsupportedOperationException("tcsetattr requires manual FFI bridge — not yet implemented")

public actual fun tcgetattr(fd: Int, termios: Termios?): Int =
    throw UnsupportedOperationException("tcgetattr requires manual FFI bridge — not yet implemented")

public actual fun tcsendbreak(fd: Int, duration: Int): Int = libc.cinterop.libc_tcsendbreak(fd, duration)

public actual fun fnmatch(pattern: String?, name: String?, flags: Int): Int =
    throw UnsupportedOperationException("fnmatch requires manual FFI bridge — not yet implemented")

public actual fun symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int {
    if (target == null) return -1
    if (linkpath == null) return -1
    return libc.cinterop.libc_symlinkat(target, newdirfd, linkpath)
}

public actual fun fchmodat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("fchmodat requires FFI bridge")

public actual fun utime(file: String?, buf: Utimbuf?): Int =
    throw UnsupportedOperationException("utime requires manual FFI bridge — not yet implemented")

public actual fun chdir(attr: String?): Int {
    if (attr == null) return -1
    return libc.cinterop.libc_chdir(attr)
}

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSettype(pAttr: PthreadMutexattrT?, pType: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexDestroy(mutex: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexLock(mutex: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexLock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTrylock(mutex: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexTrylock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTimedlock(attr: PthreadMutexT?, spec: Timespec?): Int =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexUnlock(mutex: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetname(pAttr: PthreadAttrT?, name: String?): Int =
    throw UnsupportedOperationException("pthreadAttrSetname requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stacksize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetschedparam(native: ULong, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadSetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetschedparam(native: ULong, policy: Int?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadGetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetinheritsched(attr: PthreadAttrT?, inheritsched: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetinheritsched requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetschedpolicy(attr: PthreadAttrT?, policy: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetschedpolicy requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrDestroy(thread: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadDetach(thread: ULong): Int =
    throw UnsupportedOperationException("pthreadDetach requires manual FFI bridge — not yet implemented")

public actual fun fstat(fildes: Int, buf: Stat?): Int =
    throw UnsupportedOperationException("fstat requires manual FFI bridge — not yet implemented")

public actual fun lstat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("lstat requires manual FFI bridge — not yet implemented")

public actual fun ftruncate(fd: Int, length: Long): Int =
    libc.cinterop.libc_ftruncate(fd, length)

public actual fun readdirR(pDir: DIR?, entry: Dirent?, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("readdirR requires manual FFI bridge — not yet implemented")

public actual fun open(path: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open requires manual FFI bridge — not yet implemented")

public actual fun poll(fds: Pollfd?, nfds: UInt, timeout: Int): Int {
    if (fds == null || nfds == 0u) {
        return libc_poll(null, 0u, timeout)
    }
    return memScoped {
        val revents = alloc<ShortVar>()
        libc_poll_single(fds.fd, fds.events, revents.ptr, timeout)
    }
}

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrGetclock(pAttr: PthreadCondattrT?, pClockId: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrSetclock(pAttr: PthreadCondattrT?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondSignal(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondSignal requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondBroadcast requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondWait(cond: PthreadCondT?, mutex: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadCondWait requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrSetmaxreaders(attr: PthreadRwlockattrT?, attr2: UInt): Int =
    throw UnsupportedOperationException("pthreadRwlockattrSetmaxreaders requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockInit(attr: PthreadRwlockT?, host: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockDestroy(attr: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockRdlock(attr: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockRdlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockTryrdlock(attr: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockTimedrdlock(attr: PthreadRwlockT?, host: Timespec?): Int =
    throw UnsupportedOperationException("pthreadRwlockTimedrdlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockWrlock(attr: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockWrlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockTrywrlock(attr: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockTimedwrlock(attr: PthreadRwlockT?, host: Timespec?): Int =
    throw UnsupportedOperationException("pthreadRwlockTimedwrlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockUnlock(attr: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadKeyDelete(key: ULong): Int =
    throw UnsupportedOperationException("pthreadKeyDelete requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetspecific(key: ULong, value: COpaquePointer?): Int =
    libc_pthread_setspecific(key, value?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, mutex: PthreadMutexT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwait requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetname(attr: PthreadAttrT?, name: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrGetname requires manual FFI bridge — not yet implemented")

public actual fun pthreadJoin(thread: ULong, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJoin requires manual FFI bridge — not yet implemented")

public actual fun clockGettime(clockId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires FFI bridge")

public actual fun clockSettime(clockId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime requires FFI bridge")

public actual fun clockGetres(clockId: Int, res: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres requires FFI bridge")

public actual fun clockNanosleep(clockId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep requires FFI bridge")

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("nanosleep requires manual FFI bridge — not yet implemented")

public actual fun accept(s: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    throw UnsupportedOperationException("accept requires manual FFI bridge — not yet implemented")

public actual fun bind(fd: Int, addr: Sockaddr?, len: UInt): Int =
    throw UnsupportedOperationException("bind requires manual FFI bridge — not yet implemented")

public actual fun connect(s: Int, name: Sockaddr?, namelen: UInt): Int =
    throw UnsupportedOperationException("connect requires manual FFI bridge — not yet implemented")

public actual fun getpeername(s: Int, name: Sockaddr?, namelen: UInt?): Int =
    throw UnsupportedOperationException("getpeername requires manual FFI bridge — not yet implemented")

public actual fun getsockname(socket: Int, address: Sockaddr?, addressLen: UInt?): Int =
    throw UnsupportedOperationException("getsockname requires manual FFI bridge — not yet implemented")

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt?): Int =
    throw UnsupportedOperationException("getsockopt requires manual FFI bridge — not yet implemented")

public actual fun listen(socket: Int, backlog: Int): Int = libc.cinterop.libc_listen(socket, backlog)

public actual fun setsockopt(socket: Int, level: Int, name: Int, value: COpaquePointer?, optionLen: UInt): Int =
    throw UnsupportedOperationException("setsockopt requires manual FFI bridge — not yet implemented")

public actual fun shutdown(s: Int, how: Int): Int = libc.cinterop.libc_shutdown(s, how)

public actual fun ioctl(fd: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl requires manual FFI bridge — not yet implemented")

public actual fun fcntl(fd: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("fcntl requires manual FFI bridge — not yet implemented")

public actual fun close(fd: Int): Int = libc.cinterop.libc_close(fd)

public actual fun dup(src: Int): Int = libc.cinterop.libc_dup(src)

public actual fun dup2(src: Int, dst: Int): Int = libc.cinterop.libc_dup2(src, dst)

public actual fun pipe(fds: Int?): Int =
    throw UnsupportedOperationException("pipe requires manual FFI bridge — not yet implemented")

public actual fun unlink(pathname: String?): Int {
    if (pathname == null) return -1
    return libc.cinterop.libc_unlink(pathname)
}

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("getaddrinfo requires manual FFI bridge — not yet implemented")

public actual fun setenv(envVarName: String?, envVarValue: String?, overwrite: Int): Int {
    if (envVarName == null) return -1
    if (envVarValue == null) return -1
    return libc.cinterop.libc_setenv(envVarName, envVarValue, overwrite)
}

public actual fun unsetenv(envVarName: String?): Int {
    if (envVarName == null) return -1
    return libc.cinterop.libc_unsetenv(envVarName)
}

public actual fun link(src: String?, dst: String?): Int {
    if (src == null) return -1
    if (dst == null) return -1
    return libc.cinterop.libc_link(src, dst)
}

public actual fun symlink(path1: String?, path2: String?): Int {
    if (path1 == null) return -1
    if (path2 == null) return -1
    return libc.cinterop.libc_symlink(path1, path2)
}

public actual fun rmdir(path: String?): Int {
    if (path == null) return -1
    return libc.cinterop.libc_rmdir(path)
}

public actual fun mkdir(dirName: String?, mode: Int): Int {
    if (dirName == null) return -1
    return libc.cinterop.libc_mkdir(dirName, mode)
}

public actual fun chmod(path: String?, mode: Int): Int =
    throw UnsupportedOperationException("chmod requires FFI bridge")

public actual fun fchmod(attr1: Int, attr2: Int): Int =
    throw UnsupportedOperationException("fchmod requires FFI bridge")

public actual fun fsync(fd: Int): Int = libc.cinterop.libc_fsync(fd)

public actual fun closedir(ptr: DIR?): Int =
    libc.cinterop.libc_closedir(ptr?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun schedGetPriorityMax(policy: Int): Int {
    val result = libc_sched_get_priority_max(policy)
    return result
}

public actual fun schedGetPriorityMin(policy: Int): Int {
    val result = libc_sched_get_priority_min(policy)
    return result
}

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam requires manual FFI bridge — not yet implemented")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam requires manual FFI bridge — not yet implemented")

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler requires manual FFI bridge — not yet implemented")

public actual fun schedGetscheduler(pid: Int): Int {
    val result = libc_sched_getscheduler(pid)
    return result
}

public actual fun schedRrGetInterval(pid: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("schedRrGetInterval requires manual FFI bridge — not yet implemented")

public actual fun schedYield(): Int =
    throw UnsupportedOperationException("schedYield requires manual FFI bridge — not yet implemented")

public actual fun errnoSet(err: Int): Int =
    throw UnsupportedOperationException("errnoSet requires manual FFI bridge — not yet implemented")

public actual fun errnoGet(): Int =
    throw UnsupportedOperationException("errnoGet requires manual FFI bridge — not yet implemented")

public actual fun setgid(gid: UShort): Int {
    val result = libc.cinterop.libc_setgid(gid.toInt())
    return result
}

public actual fun setuid(uid: UShort): Int {
    val result = libc.cinterop.libc_setuid(uid.toInt())
    return result
}

public actual fun sigemptyset(set: ULong?): Int =
    throw UnsupportedOperationException("sigemptyset requires manual FFI bridge — not yet implemented")

public actual fun sigfillset(set: ULong?): Int =
    throw UnsupportedOperationException("sigfillset requires manual FFI bridge — not yet implemented")

public actual fun sigdelset(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigdelset requires manual FFI bridge — not yet implemented")

public actual fun sigismember(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigismember requires manual FFI bridge — not yet implemented")

public actual fun pthreadSigmask(how: Int, set: ULong?, oset: ULong?): Int =
    throw UnsupportedOperationException("pthreadSigmask requires manual FFI bridge — not yet implemented")

public actual fun taskKill(taskId: Int, signo: Int): Int =
    throw UnsupportedOperationException("taskKill requires manual FFI bridge — not yet implemented")

public actual fun taskDelay(ticks: UInt): Int =
    throw UnsupportedOperationException("taskDelay requires manual FFI bridge — not yet implemented")

public actual fun taskNameSet(taskId: Int, taskName: String?): Int =
    throw UnsupportedOperationException("taskNameSet requires manual FFI bridge — not yet implemented")

public actual fun taskNameGet(taskId: Int, bufName: String?, bufsize: ULong): Int =
    throw UnsupportedOperationException("taskNameGet requires manual FFI bridge — not yet implemented")

public actual fun rtpInfoGet(rtpId: Int, rtpStruct: RTPDESC?): Int =
    throw UnsupportedOperationException("rtpInfoGet requires manual FFI bridge — not yet implemented")

public actual fun randBytes(buf: COpaquePointer?, length: Int): Int =
    throw UnsupportedOperationException("randBytes requires manual FFI bridge — not yet implemented")

public actual fun randABytes(buf: COpaquePointer?, length: Int): Int =
    throw UnsupportedOperationException("randABytes requires manual FFI bridge — not yet implemented")

public actual fun randUBytes(buf: COpaquePointer?, length: Int): Int =
    throw UnsupportedOperationException("randUBytes requires manual FFI bridge — not yet implemented")

public actual fun randSecure(): Int =
    throw UnsupportedOperationException("randSecure requires manual FFI bridge — not yet implemented")

public actual fun mqClose(mqd: Int): Int =
    throw UnsupportedOperationException("mqClose requires manual FFI bridge — not yet implemented")

public actual fun mqUnlink(name: String?): Int =
    throw UnsupportedOperationException("mqUnlink requires manual FFI bridge — not yet implemented")

public actual fun mqSend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int =
    throw UnsupportedOperationException("mqSend requires manual FFI bridge — not yet implemented")

public actual fun mqTimedsend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt, absTimeout: Timespec?): Int =
    throw UnsupportedOperationException("mqTimedsend requires manual FFI bridge — not yet implemented")

public actual fun mqGetattr(mqd: Int, attr: MqAttr?): Int =
    throw UnsupportedOperationException("mqGetattr requires manual FFI bridge — not yet implemented")

public actual fun mqSetattr(mqd: Int, newattr: MqAttr?, oldattr: MqAttr?): Int =
    throw UnsupportedOperationException("mqSetattr requires manual FFI bridge — not yet implemented")
