@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.EpollEvent
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Timezone
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Sysinfo
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidAndroidSetAbortMessage
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidArc4random
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidArc4randomBuf
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidArc4randomUniform
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidBasename
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidClockNanosleep
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidClone
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidDaemon
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidDirname
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidDlIteratePhdr
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidEndgrent
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidEpollCreate
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidEpollCreate1
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidEpollCtl
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidEpollWait
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidErrno
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidEventfd
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidEventfdRead
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidEventfdWrite
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidFaccessat
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidFallocate
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidFallocate64
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidFflushUnlocked
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidFgetsUnlocked
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidFgetxattr
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidFlistxattr
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidFreadUnlocked
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidFremovexattr
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidFsetxattr
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidFwriteUnlocked
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidGetauxval
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidGetentropy
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidGetgrent
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidGetgrgid
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidGetgrgidR
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidGetgrnam
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidGetgrnamR
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidGetgrouplist
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidGetnameinfo
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidGetoptLong
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidGetpriority
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidGetrandom
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidGetrlimit
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidGetrlimit64
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidGettid
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidGettimeofday
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidGetutent
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidGetxattr
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidInitgroups
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidInotifyAddWatch
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidInotifyInit
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidInotifyInit1
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidInotifyRmWatch
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidKlogctl
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidLgetxattr
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidListxattr
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidLlistxattr
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidLremovexattr
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidLsetxattr
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidMadvise
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidMallocInfo
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidMallocUsableSize
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidMemfdCreate
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidMemmem
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidMlock2
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidMount
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidMprotect
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidMsync
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidPersonality
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidPopen
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidPosixFallocate
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidPosixFallocate64
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidPpoll
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidPrctl
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidPreadv
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidPrlimit
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidPrlimit64
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidProcessVmReadv
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidProcessVmWritev
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidPtrace
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidPwritev
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidReallocarray
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidRegcomp
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidRegerror
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidRegexec
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidRegfree
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidRemovexattr
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidRenameat2
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSchedCpualloc
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSchedCpucount
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSchedCpufree
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSchedGetPriorityMax
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSchedGetPriorityMin
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSchedGetaffinity
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSchedGetcpu
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSchedGetparam
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSchedGetscheduler
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSchedRrGetInterval
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSchedSetaffinity
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSchedSetparam
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSchedSetscheduler
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSeekdir
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSemClose
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSemGetvalue
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSemOpen
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSemTimedwait
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSemUnlink
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSendfile
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSendfile64
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSetfsgid
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSetfsuid
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSetgrent
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSethostname
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSetns
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSetpriority
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSetrlimit
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSetrlimit64
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSettimeofday
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSetutent
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSetxattr
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSigaltstack
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSignalfd
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSigsuspend
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSigtimedwait
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSigwait
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSplice
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidStrerrorR
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSwapoff
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSwapon
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSync
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSyncfs
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSyscall
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSysinfo
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSystemPropertyFind
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSystemPropertyFindNth
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSystemPropertyForeach
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSystemPropertyGet
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidSystemPropertySet
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidTee
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidTelldir
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidTgkill
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidTimerfdCreate
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidTimerfdGettime
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidTimerfdSettime
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidUmount
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidUmount2
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidUnshare
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidUtmpname
import io.github.kotlinmania.libc.unix.linuxlike.android.cinterop.libcUnixLinuxlikeAndroidVmsplice
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun setgrent() {
    libcUnixLinuxlikeAndroidSetgrent()
}

public actual fun endgrent() {
    libcUnixLinuxlikeAndroidEndgrent()
}

public actual fun getgrent(): MutPtr<Group> =
    MutPtr(libcUnixLinuxlikeAndroidGetgrent()?.toLong() ?: 0L)

public actual fun getrlimit64(resource: CInt, rlim: MutPtr<Rlimit64>): CInt =
    libcUnixLinuxlikeAndroidGetrlimit64(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: CInt, rlim: ConstPtr<Rlimit64>): CInt =
    libcUnixLinuxlikeAndroidSetrlimit64(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    libcUnixLinuxlikeAndroidGetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    libcUnixLinuxlikeAndroidSetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: ConstPtr<Rlimit>, oldLimit: MutPtr<Rlimit>): CInt =
    libcUnixLinuxlikeAndroidPrlimit(pid, resource, newLimit.rawAddress.toCPointer<ByteVar>(), oldLimit.rawAddress.toCPointer<ByteVar>())

public actual fun prlimit64(pid: PidT, resource: CInt, newLimit: ConstPtr<Rlimit64>, oldLimit: MutPtr<Rlimit64>): CInt =
    libcUnixLinuxlikeAndroidPrlimit64(pid, resource, newLimit.rawAddress.toCPointer<ByteVar>(), oldLimit.rawAddress.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    libcUnixLinuxlikeAndroidStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    libcUnixLinuxlikeAndroidGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun mlock2(addr: ConstPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    libcUnixLinuxlikeAndroidMlock2(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    libcUnixLinuxlikeAndroidMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    libcUnixLinuxlikeAndroidMsync(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    libcUnixLinuxlikeAndroidMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SizeT, serv: MutPtr<CChar>, servlen: SizeT, flags: CInt): CInt =
    libcUnixLinuxlikeAndroidGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, count: CInt, offset: OffT): SsizeT =
    libcUnixLinuxlikeAndroidPreadv(fd, iov.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, count: CInt, offset: OffT): SsizeT =
    libcUnixLinuxlikeAndroidPwritev(fd, iov.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun processVmReadv(pid: PidT, localIov: ConstPtr<Iovec>, localIovCount: CUlong, remoteIov: ConstPtr<Iovec>, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    libcUnixLinuxlikeAndroidProcessVmReadv(pid, localIov.rawAddress.toCPointer<ByteVar>(), localIovCount, remoteIov.rawAddress.toCPointer<ByteVar>(), remoteIovCount, flags)

public actual fun processVmWritev(pid: PidT, localIov: ConstPtr<Iovec>, localIovCount: CUlong, remoteIov: ConstPtr<Iovec>, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    libcUnixLinuxlikeAndroidProcessVmWritev(pid, localIov.rawAddress.toCPointer<ByteVar>(), localIovCount, remoteIov.rawAddress.toCPointer<ByteVar>(), remoteIovCount, flags)

public actual fun ptrace(request: CInt, vararg variadicArgs: Long): CLong =
    libcUnixLinuxlikeAndroidPtrace(request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libcUnixLinuxlikeAndroidGetpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libcUnixLinuxlikeAndroidSetpriority(which, who, prio)

public actual fun schedCpualloc(count: SizeT): MutPtr<CpuSetT> =
    MutPtr(libcUnixLinuxlikeAndroidSchedCpualloc(count)?.toLong() ?: 0L)

public actual fun schedCpufree(set: MutPtr<CpuSetT>) {
    libcUnixLinuxlikeAndroidSchedCpufree(set.rawAddress.toCPointer<ByteVar>())
}

public actual fun schedCpucount(setsize: SizeT, set: ConstPtr<CpuSetT>): CInt =
    libcUnixLinuxlikeAndroidSchedCpucount(setsize, set.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetcpu(): CInt =
    libcUnixLinuxlikeAndroidSchedGetcpu()

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallocInfo(options: CInt, stream: MutPtr<FILE>): CInt =
    libcUnixLinuxlikeAndroidMallocInfo(options, stream.rawAddress.toCPointer<ByteVar>())

public actual fun mallocUsableSize(ptr: ConstPtr<CVoid>): SizeT =
    libcUnixLinuxlikeAndroidMallocUsableSize(ptr.rawAddress.toCPointer<ByteVar>())

public actual fun utmpname(name: ConstPtr<CChar>): CInt =
    libcUnixLinuxlikeAndroidUtmpname(name.rawAddress.toCPointer<ByteVar>())

public actual fun setutent() {
    libcUnixLinuxlikeAndroidSetutent()
}

public actual fun getutent(): MutPtr<Utmp> =
    MutPtr(libcUnixLinuxlikeAndroidGetutent()?.toLong() ?: 0L)

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    libcUnixLinuxlikeAndroidSeekdir(dirp.rawAddress.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    libcUnixLinuxlikeAndroidTelldir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    libcUnixLinuxlikeAndroidFallocate(fd, mode, offset, len)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    libcUnixLinuxlikeAndroidFallocate64(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libcUnixLinuxlikeAndroidPosixFallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    libcUnixLinuxlikeAndroidPosixFallocate64(fd, offset, len)

public actual fun getxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    libcUnixLinuxlikeAndroidGetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun lgetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    libcUnixLinuxlikeAndroidLgetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun fgetxattr(filedes: CInt, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    libcUnixLinuxlikeAndroidFgetxattr(filedes, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun setxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    libcUnixLinuxlikeAndroidSetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun lsetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    libcUnixLinuxlikeAndroidLsetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun fsetxattr(filedes: CInt, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    libcUnixLinuxlikeAndroidFsetxattr(filedes, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun listxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    libcUnixLinuxlikeAndroidListxattr(path.rawAddress.toCPointer<ByteVar>(), list.rawAddress.toCPointer<ByteVar>(), size)

public actual fun llistxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    libcUnixLinuxlikeAndroidLlistxattr(path.rawAddress.toCPointer<ByteVar>(), list.rawAddress.toCPointer<ByteVar>(), size)

public actual fun flistxattr(filedes: CInt, list: MutPtr<CChar>, size: SizeT): SsizeT =
    libcUnixLinuxlikeAndroidFlistxattr(filedes, list.rawAddress.toCPointer<ByteVar>(), size)

public actual fun removexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    libcUnixLinuxlikeAndroidRemovexattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun lremovexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    libcUnixLinuxlikeAndroidLremovexattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun fremovexattr(filedes: CInt, name: ConstPtr<CChar>): CInt =
    libcUnixLinuxlikeAndroidFremovexattr(filedes, name.rawAddress.toCPointer<ByteVar>())

public actual fun signalfd(fd: CInt, mask: ConstPtr<SigsetT>, flags: CInt): CInt =
    libcUnixLinuxlikeAndroidSignalfd(fd, mask.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun timerfdCreate(clock: ClockidT, flags: CInt): CInt =
    libcUnixLinuxlikeAndroidTimerfdCreate(clock, flags)

public actual fun timerfdGettime(fd: CInt, currentValue: MutPtr<Itimerspec>): CInt =
    libcUnixLinuxlikeAndroidTimerfdGettime(fd, currentValue.rawAddress.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    libcUnixLinuxlikeAndroidTimerfdSettime(fd, flags, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    libcUnixLinuxlikeAndroidSyscall(num, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    libcUnixLinuxlikeAndroidSchedGetaffinity(pid, cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    libcUnixLinuxlikeAndroidSchedSetaffinity(pid, cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun epollCreate(size: CInt): CInt =
    libcUnixLinuxlikeAndroidEpollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    libcUnixLinuxlikeAndroidEpollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt): CInt =
    libcUnixLinuxlikeAndroidEpollWait(epfd, events.rawAddress.toCPointer<ByteVar>(), maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr<EpollEvent>): CInt =
    libcUnixLinuxlikeAndroidEpollCtl(epfd, op, fd, event.rawAddress.toCPointer<ByteVar>())

public actual fun unshare(flags: CInt): CInt =
    libcUnixLinuxlikeAndroidUnshare(flags)

public actual fun umount(target: ConstPtr<CChar>): CInt =
    libcUnixLinuxlikeAndroidUmount(target.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libcUnixLinuxlikeAndroidSchedGetPriorityMax(policy)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    libcUnixLinuxlikeAndroidTee(fdIn, fdOut, len, flags)

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    libcUnixLinuxlikeAndroidSettimeofday(tv.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun splice(fdIn: CInt, offIn: MutPtr<LoffT>, fdOut: CInt, offOut: MutPtr<LoffT>, len: SizeT, flags: CUint): SsizeT =
    libcUnixLinuxlikeAndroidSplice(fdIn, offIn.rawAddress.toCPointer<ByteVar>(), fdOut, offOut.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    libcUnixLinuxlikeAndroidEventfd(initval, flags)

public actual fun eventfdRead(fd: CInt, value: MutPtr<EventfdT>): CInt =
    libcUnixLinuxlikeAndroidEventfdRead(fd, value.rawAddress.toCPointer<ByteVar>())

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    libcUnixLinuxlikeAndroidEventfdWrite(fd, value)

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    libcUnixLinuxlikeAndroidSchedRrGetInterval(pid, tp.rawAddress.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    libcUnixLinuxlikeAndroidSemTimedwait(sem.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    libcUnixLinuxlikeAndroidSemGetvalue(sem.rawAddress.toCPointer<ByteVar>(), sval.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    libcUnixLinuxlikeAndroidSchedSetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    libcUnixLinuxlikeAndroidSetns(fd, nstype)

public actual fun swapoff(puath: ConstPtr<CChar>): CInt =
    libcUnixLinuxlikeAndroidSwapoff(puath.rawAddress.toCPointer<ByteVar>())

public actual fun vmsplice(fd: CInt, iov: ConstPtr<Iovec>, nrSegs: SizeT, flags: CUint): SsizeT =
    libcUnixLinuxlikeAndroidVmsplice(fd, iov.rawAddress.toCPointer<ByteVar>(), nrSegs, flags)

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, fstype: ConstPtr<CChar>, flags: CUlong, data: ConstPtr<CVoid>): CInt =
    libcUnixLinuxlikeAndroidMount(src.rawAddress.toCPointer<ByteVar>(), target.rawAddress.toCPointer<ByteVar>(), fstype.rawAddress.toCPointer<ByteVar>(), flags, data.rawAddress.toCPointer<ByteVar>())

public actual fun personality(persona: CUint): CInt =
    libcUnixLinuxlikeAndroidPersonality(persona)

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    libcUnixLinuxlikeAndroidPrctl(option, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    libcUnixLinuxlikeAndroidSchedGetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    libcUnixLinuxlikeAndroidPpoll(fds.rawAddress.toCPointer<ByteVar>(), nfds, timeout.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun clone(cb: CloneCbCallback, childStack: MutPtr<CVoid>, flags: CInt, arg: MutPtr<CVoid>, vararg variadicArgs: Long): CInt =
    libcUnixLinuxlikeAndroidClone(0L.toCPointer<ByteVar>(), childStack.rawAddress.toCPointer<ByteVar>(), flags, arg.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetscheduler(pid: PidT): CInt =
    libcUnixLinuxlikeAndroidSchedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    libcUnixLinuxlikeAndroidClockNanosleep(clkId, flags, rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    libcUnixLinuxlikeAndroidSethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libcUnixLinuxlikeAndroidSchedGetPriorityMin(policy)

public actual fun sysinfo(info: MutPtr<Sysinfo>): CInt =
    libcUnixLinuxlikeAndroidSysinfo(info.rawAddress.toCPointer<ByteVar>())

public actual fun umount2(target: ConstPtr<CChar>, flags: CInt): CInt =
    libcUnixLinuxlikeAndroidUmount2(target.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun swapon(path: ConstPtr<CChar>, swapflags: CInt): CInt =
    libcUnixLinuxlikeAndroidSwapon(path.rawAddress.toCPointer<ByteVar>(), swapflags)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    libcUnixLinuxlikeAndroidSchedSetscheduler(pid, policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr<OffT>, count: SizeT): SsizeT =
    libcUnixLinuxlikeAndroidSendfile(outFd, inFd, offset.rawAddress.toCPointer<ByteVar>(), count)

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr<Off64T>, count: SizeT): SsizeT =
    libcUnixLinuxlikeAndroidSendfile64(outFd, inFd, offset.rawAddress.toCPointer<ByteVar>(), count)

public actual fun setfsgid(gid: GidT): CInt =
    libcUnixLinuxlikeAndroidSetfsgid(gid)

public actual fun setfsuid(uid: UidT): CInt =
    libcUnixLinuxlikeAndroidSetfsuid(uid)

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    libcUnixLinuxlikeAndroidSigsuspend(mask.rawAddress.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixLinuxlikeAndroidGetgrgidR(gid, grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    libcUnixLinuxlikeAndroidSigaltstack(ss.rawAddress.toCPointer<ByteVar>(), oss.rawAddress.toCPointer<ByteVar>())

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    libcUnixLinuxlikeAndroidSemClose(sem.rawAddress.toCPointer<ByteVar>())

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixLinuxlikeAndroidGetgrnamR(name.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    MutPtr(libcUnixLinuxlikeAndroidSemOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    MutPtr(libcUnixLinuxlikeAndroidGetgrnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    libcUnixLinuxlikeAndroidSemUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libcUnixLinuxlikeAndroidDaemon(nochdir, noclose)

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    libcUnixLinuxlikeAndroidSigtimedwait(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    libcUnixLinuxlikeAndroidSigwait(set.rawAddress.toCPointer<ByteVar>(), sig.rawAddress.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    MutPtr(libcUnixLinuxlikeAndroidGetgrgid(gid)?.toLong() ?: 0L)

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    libcUnixLinuxlikeAndroidGetgrouplist(user.rawAddress.toCPointer<ByteVar>(), group, groups.rawAddress.toCPointer<ByteVar>(), ngroups.rawAddress.toCPointer<ByteVar>())

public actual fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt =
    libcUnixLinuxlikeAndroidInitgroups(user.rawAddress.toCPointer<ByteVar>(), group)

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcUnixLinuxlikeAndroidPopen(command.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    libcUnixLinuxlikeAndroidFaccessat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun errno(): MutPtr<CInt> =
    MutPtr(libcUnixLinuxlikeAndroidErrno()?.toLong() ?: 0L)

public actual fun inotifyRmWatch(fd: CInt, wd: UInt): CInt =
    libcUnixLinuxlikeAndroidInotifyRmWatch(fd, wd)

public actual fun inotifyInit(): CInt =
    libcUnixLinuxlikeAndroidInotifyInit()

public actual fun inotifyInit1(flags: CInt): CInt =
    libcUnixLinuxlikeAndroidInotifyInit1(flags)

public actual fun inotifyAddWatch(fd: CInt, path: ConstPtr<CChar>, mask: UInt): CInt =
    libcUnixLinuxlikeAndroidInotifyAddWatch(fd, path.rawAddress.toCPointer<ByteVar>(), mask)

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    libcUnixLinuxlikeAndroidRegcomp(preg.rawAddress.toCPointer<ByteVar>(), pattern.rawAddress.toCPointer<ByteVar>(), cflags)

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    libcUnixLinuxlikeAndroidRegexec(preg.rawAddress.toCPointer<ByteVar>(), input.rawAddress.toCPointer<ByteVar>(), nmatch, pmatch.rawAddress.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    libcUnixLinuxlikeAndroidRegerror(errcode, preg.rawAddress.toCPointer<ByteVar>(), errbuf.rawAddress.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: MutPtr<RegexT>) {
    libcUnixLinuxlikeAndroidRegfree(preg.rawAddress.toCPointer<ByteVar>())
}

public actual fun androidSetAbortMessage(msg: ConstPtr<CChar>) {
    libcUnixLinuxlikeAndroidAndroidSetAbortMessage(msg.rawAddress.toCPointer<ByteVar>())
}

public actual fun gettid(): PidT =
    libcUnixLinuxlikeAndroidGettid()

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    libcUnixLinuxlikeAndroidTgkill(tgid, tid, sig)

public actual fun getauxval(type: CUlong): CUlong =
    libcUnixLinuxlikeAndroidGetauxval(type)

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    libcUnixLinuxlikeAndroidGetrandom(buf.rawAddress.toCPointer<ByteVar>(), buflen, flags)

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    libcUnixLinuxlikeAndroidGetentropy(buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun systemPropertySet(name: ConstPtr<CChar>, value: ConstPtr<CChar>): CInt =
    libcUnixLinuxlikeAndroidSystemPropertySet(name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun systemPropertyGet(name: ConstPtr<CChar>, value: MutPtr<CChar>): CInt =
    libcUnixLinuxlikeAndroidSystemPropertyGet(name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun systemPropertyFind(name: ConstPtr<CChar>): ConstPtr<PropInfo> =
    ConstPtr(libcUnixLinuxlikeAndroidSystemPropertyFind(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun systemPropertyFindNth(n: CUint): ConstPtr<PropInfo> =
    ConstPtr(libcUnixLinuxlikeAndroidSystemPropertyFindNth(n)?.toLong() ?: 0L)

public actual fun systemPropertyForeach(callback: SystemPropertyForeachCallbackCallback, cookie: MutPtr<CVoid>): CInt =
    libcUnixLinuxlikeAndroidSystemPropertyForeach(0L.toCPointer<ByteVar>(), cookie.rawAddress.toCPointer<ByteVar>())

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    libcUnixLinuxlikeAndroidDlIteratePhdr(0L.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>())

public actual fun arc4random(): UInt =
    libcUnixLinuxlikeAndroidArc4random()

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    libcUnixLinuxlikeAndroidArc4randomUniform(upperBound)

public actual fun arc4randomBuf(buf: MutPtr<CVoid>, n: SizeT) {
    libcUnixLinuxlikeAndroidArc4randomBuf(buf.rawAddress.toCPointer<ByteVar>(), n)
}

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixLinuxlikeAndroidReallocarray(ptr.rawAddress.toCPointer<ByteVar>(), nmemb, size)?.toLong() ?: 0L)

public actual fun dirname(path: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixLinuxlikeAndroidDirname(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun basename(path: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixLinuxlikeAndroidBasename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt =
    libcUnixLinuxlikeAndroidGetoptLong(argc, argv.rawAddress.toCPointer<ByteVar>(), optstring.rawAddress.toCPointer<ByteVar>(), longopts.rawAddress.toCPointer<ByteVar>(), longindex.rawAddress.toCPointer<ByteVar>())

public actual fun sync() {
    libcUnixLinuxlikeAndroidSync()
}

public actual fun syncfs(fd: CInt): CInt =
    libcUnixLinuxlikeAndroidSyncfs(fd)

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixLinuxlikeAndroidMemmem(haystack.rawAddress.toCPointer<ByteVar>(), haystacklen, needle.rawAddress.toCPointer<ByteVar>(), needlelen)?.toLong() ?: 0L)

public actual fun freadUnlocked(buf: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    libcUnixLinuxlikeAndroidFreadUnlocked(buf.rawAddress.toCPointer<ByteVar>(), size, nobj, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fwriteUnlocked(buf: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    libcUnixLinuxlikeAndroidFwriteUnlocked(buf.rawAddress.toCPointer<ByteVar>(), size, nobj, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fflushUnlocked(stream: MutPtr<FILE>): CInt =
    libcUnixLinuxlikeAndroidFflushUnlocked(stream.rawAddress.toCPointer<ByteVar>())

public actual fun fgetsUnlocked(buf: MutPtr<CChar>, size: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    MutPtr(libcUnixLinuxlikeAndroidFgetsUnlocked(buf.rawAddress.toCPointer<ByteVar>(), size, stream.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun klogctl(syslogType: CInt, bufp: MutPtr<CChar>, len: CInt): CInt =
    libcUnixLinuxlikeAndroidKlogctl(syslogType, bufp.rawAddress.toCPointer<ByteVar>(), len)

public actual fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt =
    libcUnixLinuxlikeAndroidMemfdCreate(name.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun renameat2(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CUint): CInt =
    libcUnixLinuxlikeAndroidRenameat2(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>(), flags)
