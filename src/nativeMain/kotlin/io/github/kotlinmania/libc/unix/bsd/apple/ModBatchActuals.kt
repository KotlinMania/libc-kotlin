@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.apple
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.linuxlike.Timezone
import io.github.kotlinmania.libc.unix.bsd.Utsname
import io.github.kotlinmania.libc.unix.Winsize

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.cmsgFirstHdr
import io.github.kotlinmania.libc.unix.getnameinfo
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.CPointerVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.LongVar
import kotlinx.cinterop.UByteVar
import kotlinx.cinterop.UIntVar
import kotlinx.cinterop.ULongVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.cstr
import kotlinx.cinterop.get
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.set
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKString
import kotlinx.cinterop.toLong
import kotlinx.cinterop.value
import libc.cinterop.libc_basename
import libc.cinterop.libc_clock_getres
import libc.cinterop.libc_clock_gettime
import libc.cinterop.libc_clock_settime
import libc.cinterop.libc_cmsg_data
import libc.cinterop.libc_cmsg_nxthdr
import libc.cinterop.libc_dirname
import libc.cinterop.libc_futimens
import libc.cinterop.libc_getdomainname
import libc.cinterop.libc_getentropy
import libc.cinterop.libc_getpriority
import libc.cinterop.libc_gettimeofday
import libc.cinterop.libc_initgroups
import libc.cinterop.libc_memmem
import libc.cinterop.libc_mincore
import libc.cinterop.libc_mknodat
import libc.cinterop.libc_preadv
import libc.cinterop.libc_pwritev
import libc.cinterop.libc_setdomainname
import libc.cinterop.libc_setgrent
import libc.cinterop.libc_sethostname
import libc.cinterop.libc_setpriority
import libc.cinterop.libc_settimeofday
import libc.cinterop.libc_strtonum
import libc.cinterop.libc_sysctl
import libc.cinterop.libc_uname
import libc.cinterop.libc_utimensat

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if (mhdr == null) return null
    if (cmsg == null) {
        return cmsgFirstHdr(mhdr)
    }
    val mhdrPtr: CPointer<ByteVar>? = mhdr.handle.toCPointer()
    val cmsgPtr: CPointer<ByteVar>? = cmsg.handle.toCPointer()
    if (mhdrPtr == null || cmsgPtr == null) return null
    val result = libc_cmsg_nxthdr(mhdrPtr, cmsgPtr) ?: return null
    val resultLong = result.toLong()
    val resultPtr: CPointer<ByteVar> = resultLong.toCPointer<ByteVar>() ?: return null
    val uintPtr: CPointer<UIntVar> = resultPtr.reinterpret()
    val uintVar: UIntVar = uintPtr.pointed
    val cmsgLen: UInt = uintVar.value
    val levelPtr: CPointer<IntVar> = (resultLong + 4).toCPointer<ByteVar>()!!.reinterpret()
    val levelVar: IntVar = levelPtr.pointed
    val cmsgLevel: Int = levelVar.value
    val typePtr: CPointer<IntVar> = (resultLong + 8).toCPointer<ByteVar>()!!.reinterpret()
    val typeVar: IntVar = typePtr.pointed
    val cmsgType: Int = typeVar.value
    return Cmsghdr(cmsgLen, cmsgLevel, cmsgType, resultLong)
}

public actual fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? {
    if (cmsg == null) return null
    val cmsgPtr: CPointer<ByteVar>? = cmsg.handle.toCPointer() ?: return null
    val result = libc_cmsg_data(cmsgPtr) ?: return null
    return COpaquePointer(result.toLong())
}

public actual fun setgrent() {
    libc_setgrent()
}

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    libc.cinterop.libc_daemon(nochdir, noclose)

public actual fun semDestroy(sem: Int?): Int {
    if (sem == null) return -1
    return libc.cinterop.libc_sem_destroy(sem.toLong().toCPointer<ByteVar>())
}

public actual fun semInit(sem: Int?, pshared: Int, value: UInt): Int {
    if (sem == null) return -1
    return libc.cinterop.libc_sem_init(sem.toLong().toCPointer<ByteVar>(), pshared, value)
}

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead requires manual FFI bridge — not yet implemented")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite requires manual FFI bridge — not yet implemented")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync requires manual FFI bridge — not yet implemented")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError requires manual FFI bridge — not yet implemented")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn requires manual FFI bridge — not yet implemented")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend requires manual FFI bridge — not yet implemented")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel requires manual FFI bridge — not yet implemented")

public actual fun chflags(path: String?, flags: UInt): Int {
    if (path == null) return -1
    return libc.cinterop.libc_chflags(path, flags)
}

public actual fun fchflags(fd: Int, flags: UInt): Int =
    libc.cinterop.libc_fchflags(fd, flags)

public actual fun clockGetres(clkId: UInt, tp: Timespec?): Int {
    if (tp == null) return -1
    return memScoped {
        val tpPtr = if (tp.handle != 0L) tp.handle.toCPointer<ByteVar>() else allocArray<ByteVar>(16)
        libc.cinterop.libc_clock_getres(clkId.toInt(), tpPtr)
    }
}

public actual fun clockGettime(clkId: UInt, tp: Timespec?): Int {
    if (tp == null) return -1
    return memScoped {
        val tpPtr = if (tp.handle != 0L) tp.handle.toCPointer<ByteVar>() else allocArray<ByteVar>(16)
        libc.cinterop.libc_clock_gettime(clkId.toInt(), tpPtr)
    }
}

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio requires manual FFI bridge — not yet implemented")

public actual fun dirfd(dirp: DIR?): Int =
    libc.cinterop.libc_dirfd(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun lutimes(file: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("lutimes requires manual FFI bridge — not yet implemented")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.value.toCPointer()
    val result = libc_gettimeofday(tpPtr, tzPtr)
    return result
}

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires manual FFI bridge — not yet implemented")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires manual FFI bridge — not yet implemented")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires manual FFI bridge — not yet implemented")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires manual FFI bridge — not yet implemented")

public actual fun setutxent(): Unit = throw UnsupportedOperationException("setutxent requires manual FFI bridge — not yet implemented")

public actual fun endutxent(): Unit = throw UnsupportedOperationException("endutxent requires manual FFI bridge — not yet implemented")

public actual fun utmpxname(file: String?): Int =
    throw UnsupportedOperationException("utmpxname requires manual FFI bridge — not yet implemented")

public actual fun asctime(tm: Tm?): String? =
    throw UnsupportedOperationException("asctime requires manual FFI bridge — not yet implemented")

public actual fun ctime(clock: Long?): String? =
    throw UnsupportedOperationException("ctime requires manual FFI bridge — not yet implemented")

public actual fun getdate(datestr: String?): Tm? =
    throw UnsupportedOperationException("getdate requires manual FFI bridge — not yet implemented")

public actual fun strptime(buf: String?, format: String?, timeptr: Tm?): String? =
    throw UnsupportedOperationException("strptime requires manual FFI bridge — not yet implemented")

public actual fun asctimeR(tm: Tm?, result: String?): String? =
    throw UnsupportedOperationException("asctimeR requires manual FFI bridge — not yet implemented")

public actual fun ctimeR(clock: Long?, result: String?): String? =
    throw UnsupportedOperationException("ctimeR requires manual FFI bridge — not yet implemented")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int {
    val hBuf = if (hostlen > 0u) ByteArray(hostlen.toInt().coerceAtMost(4096)) else null
    val sBuf = if (servlen > 0u) ByteArray(servlen.toInt().coerceAtMost(256)) else null
    return io.github.kotlinmania.libc.unix.getnameinfo(sa?.let { io.github.kotlinmania.libc.unix.linuxlike.Sockaddr(it.saFamily.toUShort(), it.saData) }, salen, hBuf, hostlen, sBuf, servlen, flags)
}

public actual fun mincore(addr: COpaquePointer?, len: ULong, vec: String?): Int =
    memScoped {
        val vecPtr = vec?.cstr?.getPointer(this)?.reinterpret<UByteVar>()
        libc.cinterop.libc_mincore(addr?.value?.toCPointer<ByteVar>(), len, vecPtr)
    }

public actual fun sysctlnametomib(name: String?, mibp: Int?, sizep: ULong?): Int =
    throw UnsupportedOperationException("sysctlnametomib requires manual FFI bridge — not yet implemented")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    libc.cinterop.libc_mprotect(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, prot)

public actual fun semget(key: Int, nsems: Int, semflg: Int): Int =
    throw UnsupportedOperationException("semget requires manual FFI bridge — not yet implemented")

public actual fun semctl(semid: Int, semnum: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("semctl requires manual FFI bridge — not yet implemented")

public actual fun semop(semid: Int, sops: Sembuf?, nsops: ULong): Int =
    throw UnsupportedOperationException("semop requires manual FFI bridge — not yet implemented")

public actual fun shmOpen(name: String?, oflag: Int, vararg args: Any?): Int {
    if (name == null) return -1
    val mode = if (args.isNotEmpty()) (args[0] as? Number)?.toInt() ?: 0 else 0
    return libc.cinterop.libc_shm_open(name, oflag, mode)
}

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    libc.cinterop.libc_shmat(shmid, shmaddr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), shmflg)?.let { COpaquePointer(it.toLong()) }

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    libc.cinterop.libc_shmdt(shmaddr?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl requires manual FFI bridge — not yet implemented")

public actual fun shmget(key: Int, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget requires manual FFI bridge — not yet implemented")

public actual fun sysctl(name: Int?, namelen: UInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    memScoped {
        val nameVar = if (name != null) alloc<IntVar>().also { it.value = name } else null
        val oldlenVar = if (oldlenp != null) alloc<ULongVar>().also { it.value = oldlenp } else null
        val oldPtr = oldp?.value?.toCPointer<ByteVar>()
        val newPtr = newp?.value?.toCPointer<ByteVar>()
        libc.cinterop.libc_sysctl(nameVar?.ptr, namelen, oldPtr, oldlenVar?.ptr, newPtr, newlen)
    }

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctlbyname requires manual FFI bridge — not yet implemented")

public actual fun machAbsoluteTime(): ULong =
    libc.cinterop.libc_mach_absolute_time()

public actual fun machTimebaseInfo(info: MachTimebaseInfo?): Int =
    throw UnsupportedOperationException("machTimebaseInfo requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondTimedwaitRelativeNp(cond: io.github.kotlinmania.libc.COpaquePointer?, lock: io.github.kotlinmania.libc.COpaquePointer?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwaitRelativeNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetscope(attr: io.github.kotlinmania.libc.COpaquePointer?, contentionscope: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetscope requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstackaddr(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstackaddr requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetdetachstate(attr: io.github.kotlinmania.libc.COpaquePointer?, detachstate: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetdetachstate requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetscope(attr: io.github.kotlinmania.libc.COpaquePointer?, contentionscope: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetscope requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstackaddr(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrSetstackaddr requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetnameNp(name: String?): Int =
    libc.cinterop.libc_pthread_setname_np_apple(name)

public actual fun pthreadGetnameNp(thread: ULong, name: String?, len: ULong): Int =
    memScoped {
        val buf = if (len > 0uL) allocArray<ByteVar>(len.toInt()) else null
        val threadPtr = thread.toLong().toCPointer<ByteVar>()
        libc.cinterop.libc_pthread_getname_np(threadPtr, buf, len)
    }

public actual fun pthreadGetStackaddrNp(thread: ULong): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetStackaddrNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetStacksizeNp(thread: ULong): ULong =
    throw UnsupportedOperationException("pthreadGetStacksizeNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadMainNp(): Int =
    libc.cinterop.libc_pthread_main_np()

public actual fun pthreadThreadidNp(thread: ULong, threadId: ULong?): Int =
    throw UnsupportedOperationException("pthreadThreadidNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadJitWriteProtectNp(enabled: Int): Unit = throw UnsupportedOperationException("pthreadJitWriteProtectNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadJitWriteProtectSupportedNp(): Int =
    throw UnsupportedOperationException("pthreadJitWriteProtectSupportedNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadJitWriteWithCallbackNp(callback: ((io.github.kotlinmania.libc.COpaquePointer?) -> Int)?, ctx: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJitWriteWithCallbackNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadJitWriteFreezeCallbacksNp(): Unit = throw UnsupportedOperationException("pthreadJitWriteFreezeCallbacksNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadCpuNumberNp(cpuNumberOut: ULong?): Int =
    throw UnsupportedOperationException("pthreadCpuNumberNp requires manual FFI bridge — not yet implemented")

public actual fun osSyncWaitOnAddress(addr: COpaquePointer?, value: ULong, size: ULong, flags: UInt): Int =
    throw UnsupportedOperationException("osSyncWaitOnAddress requires manual FFI bridge — not yet implemented")

public actual fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: ULong, flags: UInt, clockid: UInt, deadline: ULong): Int =
    throw UnsupportedOperationException("osSyncWaitOnAddressWithDeadline requires manual FFI bridge — not yet implemented")

public actual fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: ULong, flags: UInt, clockid: UInt, timeoutNs: ULong): Int =
    throw UnsupportedOperationException("osSyncWaitOnAddressWithTimeout requires manual FFI bridge — not yet implemented")

public actual fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: ULong, flags: UInt): Int =
    throw UnsupportedOperationException("osSyncWakeByAddressAny requires manual FFI bridge — not yet implemented")

public actual fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: ULong, flags: UInt): Int =
    throw UnsupportedOperationException("osSyncWakeByAddressAll requires manual FFI bridge — not yet implemented")

public actual fun osUnfairLockLock(lock: io.github.kotlinmania.libc.unix.bsd.apple.OsUnfairLockS?): Unit = throw UnsupportedOperationException("osUnfairLockLock requires manual FFI bridge — not yet implemented")

public actual fun osUnfairLockTrylock(lock: io.github.kotlinmania.libc.unix.bsd.apple.OsUnfairLockS?): Boolean =
    throw UnsupportedOperationException("osUnfairLockTrylock requires manual FFI bridge — not yet implemented")

public actual fun osUnfairLockUnlock(lock: io.github.kotlinmania.libc.unix.bsd.apple.OsUnfairLockS?): Unit = throw UnsupportedOperationException("osUnfairLockUnlock requires manual FFI bridge — not yet implemented")

public actual fun osUnfairLockAssertOwner(lock: io.github.kotlinmania.libc.unix.bsd.apple.OsUnfairLockS?): Unit = throw UnsupportedOperationException("osUnfairLockAssertOwner requires manual FFI bridge — not yet implemented")

public actual fun osUnfairLockAssertNotOwner(lock: io.github.kotlinmania.libc.unix.bsd.apple.OsUnfairLockS?): Unit = throw UnsupportedOperationException("osUnfairLockAssertNotOwner requires manual FFI bridge — not yet implemented")

public actual fun osLogTypeEnabled(oslog: io.github.kotlinmania.libc.COpaquePointer?, tpe: UByte): Boolean =
    throw UnsupportedOperationException("osLogTypeEnabled requires manual FFI bridge — not yet implemented")

public actual fun osSignpostEnabled(log: io.github.kotlinmania.libc.COpaquePointer?): Boolean =
    throw UnsupportedOperationException("osSignpostEnabled requires manual FFI bridge — not yet implemented")

public actual fun threadPolicySet(thread: UInt, flavor: UInt, policyInfo: Int?, count: UInt): Int =
    throw UnsupportedOperationException("threadPolicySet requires manual FFI bridge — not yet implemented")

public actual fun threadPolicyGet(thread: UInt, flavor: UInt, policyInfo: Int?, count: UInt?, getDefault: Int?): Int =
    throw UnsupportedOperationException("threadPolicyGet requires manual FFI bridge — not yet implemented")

public actual fun threadInfo(targetAct: UInt, flavor: UInt, threadInfoOut: Int?, threadInfoOutCnt: UInt?): Int =
    throw UnsupportedOperationException("threadInfo requires manual FFI bridge — not yet implemented")

public actual fun error(): Int? =
    libc.cinterop.libc_get_errno()

public actual fun backtrace(buf: COpaquePointer?, sz: Int): Int = libc.cinterop.libc_backtrace(buf?.value?.toCPointer<CPointerVar<ByteVar>>()?.reinterpret(), sz)

public actual fun backtraceSymbols(addrs: COpaquePointer?, sz: Int): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: Int, fd: Int): Unit = throw UnsupportedOperationException("backtraceSymbolsFd requires manual FFI bridge — not yet implemented")

public actual fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: Int): Int =
    throw UnsupportedOperationException("backtraceFromFp requires manual FFI bridge — not yet implemented")

public actual fun backtraceImageOffsets(array: COpaquePointer?, imageOffsets: ImageOffset?, size: Int): Unit = throw UnsupportedOperationException("backtraceImageOffsets requires manual FFI bridge — not yet implemented")

public actual fun backtraceAsync(array: COpaquePointer?, length: ULong, taskId: UInt?): ULong =
    throw UnsupportedOperationException("backtraceAsync requires manual FFI bridge — not yet implemented")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs requires manual FFI bridge — not yet implemented")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs requires manual FFI bridge — not yet implemented")

public actual fun kevent(kq: Int, changelist: Kevent?, nchanges: Int, eventlist: Kevent?, nevents: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("kevent requires manual FFI bridge — not yet implemented")

public actual fun kevent64(kq: Int, changelist: Kevent64S?, nchanges: Int, eventlist: Kevent64S?, nevents: Int, flags: UInt, timeout: Timespec?): Int =
    throw UnsupportedOperationException("kevent64 requires manual FFI bridge — not yet implemented")

public actual fun mount(src: String?, target: String?, flags: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("mount requires manual FFI bridge — not yet implemented")

public actual fun fmount(src: String?, fd: Int, flags: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("fmount requires manual FFI bridge — not yet implemented")

public actual fun ptrace(request: Int, pid: Int, addr: String?, data: Int): Int =
    throw UnsupportedOperationException("ptrace requires manual FFI bridge — not yet implemented")

public actual fun quotactl(special: String?, cmd: Int, id: Int, data: String?): Int =
    throw UnsupportedOperationException("quotactl requires manual FFI bridge — not yet implemented")

public actual fun sethostname(name: String?, len: Int): Int =
    libc.cinterop.libc_sethostname(name, len.toULong())

public actual fun sendfile(fd: Int, s: Int, offset: Long, len: Long?, hdtr: SfHdtr?, flags: Int): Int =
    throw UnsupportedOperationException("sendfile requires manual FFI bridge — not yet implemented")

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

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    memScoped {
        val masterVar = alloc<IntVar>()
        val slaveVar = alloc<IntVar>()
        val namePtr = name?.cstr?.getPointer(this)
        libc.cinterop.libc_openpty(masterVar.ptr, slaveVar.ptr, namePtr, null, null)
    }

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    memScoped {
        val masterVar = alloc<IntVar>()
        val namePtr = name?.cstr?.getPointer(this)
        libc.cinterop.libc_forkpty(masterVar.ptr, namePtr, null, null)
    }

public actual fun loginTty(fd: Int): Int =
    libc.cinterop.libc_login_tty(fd)

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? {
    val result = libc.cinterop.libc_duplocale(base?.value?.toCPointer<ByteVar>())
    return result?.let { COpaquePointer(it.toLong()) }
}

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")

public actual fun localeconvL(loc: io.github.kotlinmania.libc.COpaquePointer?): Lconv? =
    throw UnsupportedOperationException("localeconvL requires manual FFI bridge — not yet implemented")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    memScoped {
        val result = libc.cinterop.libc_newlocale(mask, locale, base?.value?.toCPointer<ByteVar>())
        result?.let { COpaquePointer(it.toLong()) }
    }

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale requires manual FFI bridge — not yet implemented")

public actual fun querylocale(mask: Int, loc: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("querylocale requires manual FFI bridge — not yet implemented")

public actual fun getpriority(which: Int, who: UInt): Int {
    val result = libc_getpriority(which, who.toInt())
    return result
}

public actual fun setpriority(which: Int, who: UInt, prio: Int): Int {
    val result = libc_setpriority(which, who.toInt(), prio)
    return result
}

public actual fun getdomainname(name: String?, len: Int): Int =
    libc.cinterop.libc_getdomainname(name, len.toULong())

public actual fun setdomainname(name: String?, len: Int): Int =
    libc.cinterop.libc_setdomainname(name, len.toULong())

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    memScoped {
        if (iov == null) return -1
        val iovPtr =
            if (iov.handle != 0L) {
                iov.handle.toCPointer<ByteVar>()
            } else {
                val buf = allocArray<ByteVar>(16)
                val basePtr = iov.iovBase?.value ?: 0L
                buf.reinterpret<LongVar>()[0] = basePtr
                buf.reinterpret<LongVar>()[1] = iov.iovLen.toLong()
                buf
            }
        libc.cinterop.libc_preadv(fd, iovPtr, iovcnt, offset)
    }

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    memScoped {
        if (iov == null) return -1
        val iovPtr =
            if (iov.handle != 0L) {
                iov.handle.toCPointer<ByteVar>()
            } else {
                val buf = allocArray<ByteVar>(16)
                val basePtr = iov.iovBase?.value ?: 0L
                buf.reinterpret<LongVar>()[0] = basePtr
                buf.reinterpret<LongVar>()[1] = iov.iovLen.toLong()
                buf
            }
        libc.cinterop.libc_pwritev(fd, iovPtr, iovcnt, offset)
    }

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: Int): Long =
    throw UnsupportedOperationException("getxattr requires manual FFI bridge — not yet implemented")

public actual fun fgetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: Int): Long =
    throw UnsupportedOperationException("fgetxattr requires manual FFI bridge — not yet implemented")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: Int): Int =
    throw UnsupportedOperationException("setxattr requires manual FFI bridge — not yet implemented")

public actual fun fsetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: Int): Int =
    throw UnsupportedOperationException("fsetxattr requires manual FFI bridge — not yet implemented")

public actual fun listxattr(path: String?, list: String?, size: ULong, flags: Int): Long =
    throw UnsupportedOperationException("listxattr requires manual FFI bridge — not yet implemented")

public actual fun flistxattr(filedes: Int, list: String?, size: ULong, flags: Int): Long =
    throw UnsupportedOperationException("flistxattr requires manual FFI bridge — not yet implemented")

public actual fun removexattr(path: String?, name: String?, flags: Int): Int =
    throw UnsupportedOperationException("removexattr requires manual FFI bridge — not yet implemented")

public actual fun renamexNp(from: String?, to: String?, flags: UInt): Int =
    throw UnsupportedOperationException("renamexNp requires manual FFI bridge — not yet implemented")

public actual fun renameatxNp(fromfd: Int, from: String?, tofd: Int, to: String?, flags: UInt): Int =
    throw UnsupportedOperationException("renameatxNp requires manual FFI bridge — not yet implemented")

public actual fun fremovexattr(filedes: Int, name: String?, flags: Int): Int =
    throw UnsupportedOperationException("fremovexattr requires manual FFI bridge — not yet implemented")

public actual fun getgrouplist(name: String?, basegid: Int, groups: Int?, ngroups: Int?): Int =
    memScoped {
        val groupsVar = if (groups != null) alloc<IntVar>().also { it.value = groups } else null
        val ngroupsVar = if (ngroups != null) alloc<IntVar>().also { it.value = ngroups } else null
        libc.cinterop.libc_getgrouplist(name, basegid, groupsVar?.ptr, ngroupsVar?.ptr)
    }

public actual fun initgroups(user: String?, basegroup: Int): Int {
    val result = libc_initgroups(user, basegroup)
    return result
}

public actual fun waitid(idtype: UInt, id: UInt, infop: SiginfoT?, options: Int): Int {
    val infoPtr = infop?.handle?.toCPointer<ByteVar>()
    return libc.cinterop.libc_waitid(idtype.toInt(), id.toInt(), infoPtr, options)
}

public actual fun brk(addr: COpaquePointer?): COpaquePointer? =
    libc.cinterop.libc_brk(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun sbrk(increment: Int): COpaquePointer? =
    throw UnsupportedOperationException("sbrk requires manual FFI bridge — not yet implemented")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): Int {
    if (tv == null) return -1
    val tvPtr: CPointer<ByteVar>? = tv.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.handle.toCPointer()
    val result = libc_settimeofday(tvPtr, tzPtr)
    return result
}

public actual fun dyldGetImageHeader(imageIndex: UInt): MachHeader? =
    throw UnsupportedOperationException("dyldGetImageHeader requires manual FFI bridge — not yet implemented")

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): Long =
    throw UnsupportedOperationException("dyldGetImageVmaddrSlide requires manual FFI bridge — not yet implemented")

public actual fun dyldGetImageName(imageIndex: UInt): String? =
    throw UnsupportedOperationException("dyldGetImageName requires manual FFI bridge — not yet implemented")

public actual fun posixSpawn(pid: Int?, path: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawn requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnp(pid: Int?, file: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrInit requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, default: UInt?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, default: UInt?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, default: UInt?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, default: UInt?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetflags requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short): Int =
    throw UnsupportedOperationException("posixSpawnattrSetflags requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetarchprefNp(attr: io.github.kotlinmania.libc.COpaquePointer?, count: ULong, pref: Int?, subpref: Int?, ocount: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetarchprefNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetarchprefNp(attr: io.github.kotlinmania.libc.COpaquePointer?, count: ULong, pref: Int?, subpref: Int?, ocount: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetarchprefNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetbinprefNp(attr: io.github.kotlinmania.libc.COpaquePointer?, count: ULong, pref: Int?, ocount: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetbinprefNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetbinprefNp(attr: io.github.kotlinmania.libc.COpaquePointer?, count: ULong, pref: Int?, ocount: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetbinprefNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsInit(actions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsDestroy(actions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddopen(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int, path: String?, oflag: Int, mode: UShort): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddclose(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAdddup2(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int, newfd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires manual FFI bridge — not yet implemented")

public actual fun uname(buf: Utsname?): Int {
    if (buf == null) return -1
    if (buf.handle != 0L) {
        val bufPtr: CPointer<ByteVar>? = buf.handle.toCPointer()
        libc_uname(bufPtr)
    }
    return memScoped {
        val sys = allocArray<ByteVar>(256)
        val node = allocArray<ByteVar>(256)
        val rel = allocArray<ByteVar>(256)
        val ver = allocArray<ByteVar>(256)
        val mach = allocArray<ByteVar>(256)
        val dom = allocArray<ByteVar>(256)
        val rc =
            libc.cinterop.libc_uname_fields(
                sys,
                256uL,
                node,
                256uL,
                rel,
                256uL,
                ver,
                256uL,
                mach,
                256uL,
                dom,
                256uL,
            )
        if (rc >= 0) {
            for (i in 0 until minOf(256, buf.sysname.size)) buf.sysname[i] = sys[i]
            for (i in 0 until minOf(256, buf.nodename.size)) buf.nodename[i] = node[i]
            for (i in 0 until minOf(256, buf.release.size)) buf.release[i] = rel[i]
            for (i in 0 until minOf(256, buf.version.size)) buf.version[i] = ver[i]
            for (i in 0 until minOf(256, buf.machine.size)) buf.machine[i] = mach[i]
        }
        rc
    }
}

public actual fun connectx(socket: Int, endpoints: SaEndpointsT?, associd: UInt, flags: UInt, iov: Iovec?, iovcnt: UInt, len: ULong?, connid: UInt?): Int =
    throw UnsupportedOperationException("connectx requires manual FFI bridge — not yet implemented")

public actual fun disconnectx(socket: Int, associd: UInt, connid: UInt): Int =
    throw UnsupportedOperationException("disconnectx requires manual FFI bridge — not yet implemented")

public actual fun ntpAdjtime(buf: Timex?): Int =
    throw UnsupportedOperationException("ntpAdjtime requires manual FFI bridge — not yet implemented")

public actual fun ntpGettime(buf: Ntptimeval?): Int =
    throw UnsupportedOperationException("ntpGettime requires manual FFI bridge — not yet implemented")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("getmntinfo requires manual FFI bridge — not yet implemented")

public actual fun getfsstat(mntbufp: Statfs?, bufsize: Int, flags: Int): Int =
    throw UnsupportedOperationException("getfsstat requires manual FFI bridge — not yet implemented")

public actual fun clonefile(src: String?, dst: String?, flags: UInt): Int =
    throw UnsupportedOperationException("clonefile requires manual FFI bridge — not yet implemented")

public actual fun clonefileat(srcDirfd: Int, src: String?, dstDirfd: Int, dst: String?, flags: UInt): Int =
    throw UnsupportedOperationException("clonefileat requires manual FFI bridge — not yet implemented")

public actual fun fclonefileat(srcfd: Int, dstDirfd: Int, dst: String?, flags: UInt): Int =
    throw UnsupportedOperationException("fclonefileat requires manual FFI bridge — not yet implemented")

public actual fun copyfile(from: String?, to: String?, state: io.github.kotlinmania.libc.COpaquePointer?, flags: UInt): Int =
    throw UnsupportedOperationException("copyfile requires manual FFI bridge — not yet implemented")

public actual fun fcopyfile(from: Int, to: Int, state: io.github.kotlinmania.libc.COpaquePointer?, flags: UInt): Int =
    throw UnsupportedOperationException("fcopyfile requires manual FFI bridge — not yet implemented")

public actual fun copyfileStateFree(s: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("copyfileStateFree requires manual FFI bridge — not yet implemented")

public actual fun copyfileStateGet(s: io.github.kotlinmania.libc.COpaquePointer?, flags: UInt, dst: COpaquePointer?): Int =
    throw UnsupportedOperationException("copyfileStateGet requires manual FFI bridge — not yet implemented")

public actual fun copyfileStateSet(s: io.github.kotlinmania.libc.COpaquePointer?, flags: UInt, src: COpaquePointer?): Int =
    throw UnsupportedOperationException("copyfileStateSet requires manual FFI bridge — not yet implemented")

public actual fun machErrorString(errorValue: Int): String? =
    throw UnsupportedOperationException("machErrorString requires manual FFI bridge — not yet implemented")

public actual fun memsetS(s: COpaquePointer?, smax: ULong, c: Int, n: ULong): Int =
    throw UnsupportedOperationException("memsetS requires manual FFI bridge — not yet implemented")

public actual fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("memsetPattern4 requires manual FFI bridge — not yet implemented")

public actual fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("memsetPattern8 requires manual FFI bridge — not yet implemented")

public actual fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("memsetPattern16 requires manual FFI bridge — not yet implemented")

public actual fun strtonum(numstr: String?, minval: Long, maxval: Long, errstrp: COpaquePointer?): Long {
    if (errstrp == null) return -1L
    val errstrpPtr: CPointer<ByteVar>? = errstrp.value.toCPointer()
    val result = libc_strtonum(numstr, minval, maxval, errstrpPtr)
    return result
}

public actual fun mallocPrintf(format: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("mallocPrintf requires manual FFI bridge — not yet implemented")

public actual fun mallocZoneCheck(zone: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("mallocZoneCheck requires manual FFI bridge — not yet implemented")

public actual fun mallocZonePrint(zone: io.github.kotlinmania.libc.COpaquePointer?, verbose: Int): Unit = throw UnsupportedOperationException("mallocZonePrint requires manual FFI bridge — not yet implemented")

public actual fun mallocZoneStatistics(zone: io.github.kotlinmania.libc.COpaquePointer?, stats: MallocStatisticsT?): Unit = throw UnsupportedOperationException("mallocZoneStatistics requires manual FFI bridge — not yet implemented")

public actual fun mallocZoneLog(zone: io.github.kotlinmania.libc.COpaquePointer?, address: COpaquePointer?): Unit = throw UnsupportedOperationException("mallocZoneLog requires manual FFI bridge — not yet implemented")

public actual fun mallocZonePrintPtrInfo(ptr: COpaquePointer?): Unit = throw UnsupportedOperationException("mallocZonePrintPtrInfo requires manual FFI bridge — not yet implemented")

public actual fun mallocDefaultZone(): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("mallocDefaultZone requires manual FFI bridge — not yet implemented")

public actual fun mallocZoneFromPtr(ptr: COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneFromPtr requires manual FFI bridge — not yet implemented")

public actual fun mallocZoneMalloc(zone: io.github.kotlinmania.libc.COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneMalloc requires manual FFI bridge — not yet implemented")

public actual fun mallocZoneValloc(zone: io.github.kotlinmania.libc.COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneValloc requires manual FFI bridge — not yet implemented")

public actual fun mallocZoneCalloc(zone: io.github.kotlinmania.libc.COpaquePointer?, numItems: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneCalloc requires manual FFI bridge — not yet implemented")

public actual fun mallocZoneRealloc(zone: io.github.kotlinmania.libc.COpaquePointer?, ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneRealloc requires manual FFI bridge — not yet implemented")

public actual fun mallocZoneFree(zone: io.github.kotlinmania.libc.COpaquePointer?, ptr: COpaquePointer?): Unit = throw UnsupportedOperationException("mallocZoneFree requires manual FFI bridge — not yet implemented")

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procListpids requires manual FFI bridge — not yet implemented")

public actual fun procListallpids(buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procListallpids requires manual FFI bridge — not yet implemented")

public actual fun procListpgrppids(pgrpid: Int, buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procListpgrppids requires manual FFI bridge — not yet implemented")

public actual fun procListchildpids(ppid: Int, buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procListchildpids requires manual FFI bridge — not yet implemented")

public actual fun procPidinfo(pid: Int, flavor: Int, arg: ULong, buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procPidinfo requires manual FFI bridge — not yet implemented")

public actual fun procPidfdinfo(pid: Int, fd: Int, flavor: Int, buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procPidfdinfo requires manual FFI bridge — not yet implemented")

public actual fun procPidfileportinfo(pid: Int, fileport: UInt, flavor: Int, buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procPidfileportinfo requires manual FFI bridge — not yet implemented")

public actual fun procPidpath(pid: Int, buffer: COpaquePointer?, buffersize: UInt): Int =
    throw UnsupportedOperationException("procPidpath requires manual FFI bridge — not yet implemented")

public actual fun procName(pid: Int, buffer: COpaquePointer?, buffersize: UInt): Int =
    throw UnsupportedOperationException("procName requires manual FFI bridge — not yet implemented")

public actual fun procRegionfilename(pid: Int, address: ULong, buffer: COpaquePointer?, buffersize: UInt): Int =
    throw UnsupportedOperationException("procRegionfilename requires manual FFI bridge — not yet implemented")

public actual fun procKmsgbuf(buffer: COpaquePointer?, buffersize: UInt): Int =
    throw UnsupportedOperationException("procKmsgbuf requires manual FFI bridge — not yet implemented")

public actual fun procLibversion(major: Int?, minor: Int?): Int =
    throw UnsupportedOperationException("procLibversion requires manual FFI bridge — not yet implemented")

public actual fun procPidRusage(pid: Int, flavor: Int, buffer: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("procPidRusage requires manual FFI bridge — not yet implemented")

public actual fun procSetNoSmt(): Int =
    throw UnsupportedOperationException("procSetNoSmt requires manual FFI bridge — not yet implemented")

public actual fun procSetthreadNoSmt(): Int =
    throw UnsupportedOperationException("procSetthreadNoSmt requires manual FFI bridge — not yet implemented")

public actual fun procSetCsm(flags: UInt): Int =
    throw UnsupportedOperationException("procSetCsm requires manual FFI bridge — not yet implemented")

public actual fun procSetthreadCsm(flags: UInt): Int =
    throw UnsupportedOperationException("procSetthreadCsm requires manual FFI bridge — not yet implemented")

public actual fun gethostuuid(id: COpaquePointer?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("gethostuuid requires manual FFI bridge — not yet implemented")

public actual fun gethostid(): Long =
    libc.cinterop.libc_gethostid()

public actual fun sethostid(hostid: Long): Unit = throw UnsupportedOperationException("sethostid requires manual FFI bridge — not yet implemented")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    libc.cinterop.libc_getentropy(buf?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), buflen)

public actual fun nsGetExecutablePath(buf: String?, bufsize: UInt?): Int =
    throw UnsupportedOperationException("nSGetExecutablePath requires manual FFI bridge — not yet implemented")

public actual fun nsGetArgv(): COpaquePointer? =
    throw UnsupportedOperationException("nSGetArgv requires manual FFI bridge — not yet implemented")

public actual fun nsGetArgc(): Int? =
    throw UnsupportedOperationException("nSGetArgc requires manual FFI bridge — not yet implemented")

public actual fun nsGetEnviron(): COpaquePointer? =
    throw UnsupportedOperationException("nSGetEnviron requires manual FFI bridge — not yet implemented")

public actual fun nsGetProgname(): COpaquePointer? =
    throw UnsupportedOperationException("nSGetProgname requires manual FFI bridge — not yet implemented")

public actual fun machVmMap(targetTask: UInt, address: ULong?, size: ULong, mask: ULong, flags: Int, `object`: UInt, offset: ULong, copy: Int, curProtection: Int, maxProtection: Int, inheritance: UInt): Int =
    throw UnsupportedOperationException("machVmMap requires manual FFI bridge — not yet implemented")

public actual fun vmAllocate(targetTask: UInt, address: ULong?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("vmAllocate requires manual FFI bridge — not yet implemented")

public actual fun vmDeallocate(targetTask: UInt, address: ULong, size: ULong): Int =
    throw UnsupportedOperationException("vmDeallocate requires manual FFI bridge — not yet implemented")

public actual fun hostStatistics64(hostPriv: UInt, flavor: Int, hostInfo64Out: Int?, hostInfo64OutCnt: UInt?): Int =
    throw UnsupportedOperationException("hostStatistics64 requires manual FFI bridge — not yet implemented")

public actual fun hostProcessorInfo(host: UInt, flavor: Int, outProcessorCount: UInt?, outProcessorInfo: Int?, outProcessorInfoCnt: UInt?): Int =
    throw UnsupportedOperationException("hostProcessorInfo requires manual FFI bridge — not yet implemented")

public actual fun taskForPid(host: UInt, pid: Int, task: UInt?): Int =
    throw UnsupportedOperationException("taskForPid requires manual FFI bridge — not yet implemented")

public actual fun taskInfo(host: UInt, flavor: UInt, taskInfoOut: Int?, taskInfoCount: UInt?): Int =
    throw UnsupportedOperationException("taskInfo requires manual FFI bridge — not yet implemented")

public actual fun taskCreate(targetTask: UInt, ledgers: UInt?, ledgersCnt: UInt, inheritMemory: Int, childTask: UInt?): Int =
    throw UnsupportedOperationException("taskCreate requires manual FFI bridge — not yet implemented")

public actual fun taskTerminate(targetTask: UInt): Int =
    throw UnsupportedOperationException("taskTerminate requires manual FFI bridge — not yet implemented")

public actual fun taskThreads(targetTask: UInt, actList: UInt?, actListCnt: UInt?): Int =
    throw UnsupportedOperationException("taskThreads requires manual FFI bridge — not yet implemented")

public actual fun hostStatistics(hostPriv: UInt, flavor: Int, hostInfoOut: Int?, hostInfoOutCnt: UInt?): Int =
    throw UnsupportedOperationException("hostStatistics requires manual FFI bridge — not yet implemented")

public actual fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): Int =
    throw UnsupportedOperationException("getattrlist requires manual FFI bridge — not yet implemented")

public actual fun fgetattrlist(fd: Int, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): Int =
    throw UnsupportedOperationException("fgetattrlist requires manual FFI bridge — not yet implemented")

public actual fun getattrlistat(fd: Int, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: ULong): Int =
    memScoped {
        val attrListPtr = attrList?.value?.toCPointer<ByteVar>()
        val attrBufPtr = attrBuf?.value?.toCPointer<ByteVar>()
        libc.cinterop.libc_getattrlistat(fd, path, attrListPtr, attrBufPtr, attrBufSize, options)
    }

public actual fun setattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): Int =
    throw UnsupportedOperationException("setattrlist requires manual FFI bridge — not yet implemented")

public actual fun fsetattrlist(fd: Int, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): Int =
    throw UnsupportedOperationException("fsetattrlist requires manual FFI bridge — not yet implemented")

public actual fun setattrlistat(dirFd: Int, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): Int =
    throw UnsupportedOperationException("setattrlistat requires manual FFI bridge — not yet implemented")

public actual fun getattrlistbulk(dirfd: Int, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: ULong): Int {
    val attrListPtr = attrList?.value?.toCPointer<ByteVar>()
    val attrBufPtr = attrBuf?.value?.toCPointer<ByteVar>()
    return libc.cinterop.libc_getattrlistbulk(dirfd, attrListPtr, attrBufPtr, attrBufSize, options)
}

public actual fun mallocSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocSize requires manual FFI bridge — not yet implemented")

public actual fun mallocGoodSize(size: ULong): ULong =
    throw UnsupportedOperationException("mallocGoodSize requires manual FFI bridge — not yet implemented")

public actual fun dirname(path: String?): String? {
    val result = libc_dirname(path)
    return result?.toKString()
}

public actual fun basename(path: String?): String? {
    val result = libc_basename(path)
    return result?.toKString()
}

public actual fun mkfifoat(dirfd: Int, pathname: String?, mode: UShort): Int =
    memScoped {
        libc.cinterop.libc_mkfifoat(dirfd, pathname, mode.toUInt())
    }

public actual fun mknodat(dirfd: Int, pathname: String?, mode: UShort, dev: Int): Int =
    memScoped {
        libc.cinterop.libc_mknodat(dirfd, pathname, mode.toInt(), dev.toULong())
    }

public actual fun freadlink(fd: Int, buf: String?, size: ULong): Int =
    throw UnsupportedOperationException("freadlink requires manual FFI bridge — not yet implemented")

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): Int {
    if (file == null) return -1
    if (searchPath == null) return -1
    return libc.cinterop.libc_execvP(file, searchPath, argv?.value?.toCPointer<kotlinx.cinterop.ByteVar>())
}

public actual fun clockSettime(clockId: UInt, tp: Timespec?): Int {
    if (tp == null) return -1
    return memScoped {
        val tpPtr =
            if (tp.handle != 0L) {
                tp.handle.toCPointer<ByteVar>()
            } else {
                val buf = allocArray<ByteVar>(16)
                buf.reinterpret<LongVar>()[0] = tp.tvSec
                buf.reinterpret<LongVar>()[1] = tp.tvNsec
                buf
            }
        libc.cinterop.libc_clock_settime(clockId.toInt(), tpPtr)
    }
}

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    libc.cinterop.libc_memmem(haystack?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), haystacklen, needle?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun taskSetInfo(targetTask: UInt, flavor: UInt, taskInfoIn: Int?, taskInfoInCnt: UInt): Int =
    throw UnsupportedOperationException("taskSetInfo requires manual FFI bridge — not yet implemented")

public actual fun iconv(cd: io.github.kotlinmania.libc.COpaquePointer?, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv requires manual FFI bridge — not yet implemented")

public actual fun iconvClose(cd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("iconvClose requires manual FFI bridge — not yet implemented")

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, arg: COpaquePointer?, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsortR requires manual FFI bridge — not yet implemented")
