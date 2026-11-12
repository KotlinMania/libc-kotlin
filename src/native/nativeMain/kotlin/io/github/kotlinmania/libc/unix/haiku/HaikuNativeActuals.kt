@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuAbs
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuAccept4
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBind
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuBrk
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuClearenv
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuClockGetcpuclockid
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuClockGetres
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuClockGettime
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuClockSettime
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuCtermid
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuDirfd
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuDrand48
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuEndgrent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuEndpwent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuEndspent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuEndusershell
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuEndutxent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuErand48
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuErrnop
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuExecvpe
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuFaccessat
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuFgetspent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuFgetspentR
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuFreeifaddrs
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuFtok
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuFutimens
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetdtablesize
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetentropy
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetgrent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetgrgid
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetgrgidR
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetgrnam
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetgrnamR
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetgrouplist
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetifaddrs
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetitimer
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetnameinfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetoptLong
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetpagesize
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetpass
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetpriority
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetpwent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetpwnamR
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetpwuidR
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetrlimit
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetspent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetspentR
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetspnam
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetspnamR
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGettimeofday
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetusershell
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetutxent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetutxid
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGetutxline
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGlob
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuGlobfree
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuHcreate
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuHdestroy
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuInitgroups
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuIoctl
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuIssetugid
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuJrand48
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuLabs
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuLcong48
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuLfind
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuLrand48
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuLsearch
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuMadvise
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuMallocUsableSize
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuMemalign
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuMemmem
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuMemrchr
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuMkfifoat
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuMknodat
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuMprotect
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuMrand48
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuMsgctl
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuMsgget
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuMsgrcv
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuMsgsnd
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuMsync
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNlLanginfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuNrand48
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPopen
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixFadvise
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixFallocate
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixMadvise
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixSpawn
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixSpawnFileActionsAddclose
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixSpawnFileActionsAdddup2
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixSpawnFileActionsAddopen
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixSpawnFileActionsDestroy
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixSpawnFileActionsInit
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixSpawnattrDestroy
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixSpawnattrGetflags
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixSpawnattrGetpgroup
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixSpawnattrGetsigdefault
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixSpawnattrGetsigmask
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixSpawnattrInit
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixSpawnattrSetflags
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixSpawnattrSetpgroup
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixSpawnattrSetsigdefault
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixSpawnattrSetsigmask
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPosixSpawnp
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPpoll
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPthreadAtfork
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPthreadAttrGetguardsize
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPthreadAttrGetstack
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPthreadAttrSetguardsize
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPthreadCondattrGetclock
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPthreadCreate
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPthreadGetattrNp
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPthreadGetnameNp
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPthreadKill
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPthreadMutexTimedlock
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPthreadSetnameNp
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPthreadSigmask
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPthreadSpinDestroy
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPthreadSpinInit
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPthreadSpinLock
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPthreadSpinTrylock
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPthreadSpinUnlock
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuPututxline
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuRand
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuReadv
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuRecvfrom
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuRecvmsg
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuRegcomp
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuRegerror
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuRegexec
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuRegfree
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSbrk
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSeed48
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSeekdir
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSemClose
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSemDestroy
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSemInit
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSemOpen
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSemUnlink
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSemctl
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSemget
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSemop
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSendmsg
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSetgrent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSetgroups
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSethostname
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSetitimer
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSetpriority
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSetpwent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSetrlimit
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSetspent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSetusershell
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSetutxent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSgetspent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSgetspentR
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuShmOpen
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuShmUnlink
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSigaltstack
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSigsuspend
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSigtimedwait
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSigwait
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSigwaitinfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSrand
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSrand48
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuStrcasecmpL
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuStrerrorR
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuStrncasecmpL
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuSync
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuTelldir
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuUname
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuUtimensat
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuValloc
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuWaitid
import io.github.kotlinmania.libc.unix.haiku.cinterop.libcUnixHaikuWritev
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    libcUnixHaikuGetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    libcUnixHaikuSetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libcUnixHaikuGetpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    libcUnixHaikuSetpriority(which, who, priority)

public actual fun endusershell() {
    libcUnixHaikuEndusershell()
}

public actual fun getpass(prompt: ConstPtr): MutPtr =
    MutPtr(libcUnixHaikuGetpass(prompt.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getusershell(): MutPtr =
    MutPtr(libcUnixHaikuGetusershell()?.toLong() ?: 0L)

public actual fun issetugid(): CInt =
    libcUnixHaikuIssetugid()

public actual fun setusershell() {
    libcUnixHaikuSetusershell()
}

public actual fun utimensat(fd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    libcUnixHaikuUtimensat(fd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    libcUnixHaikuFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    libcUnixHaikuStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun errnop(): MutPtr =
    MutPtr(libcUnixHaikuErrnop()?.toLong() ?: 0L)

public actual fun abs(i: CInt): CInt =
    libcUnixHaikuAbs(i)

public actual fun labs(i: CLong): CLong =
    libcUnixHaikuLabs(i)

public actual fun rand(): CInt =
    libcUnixHaikuRand()

public actual fun srand(seed: CUint) {
    libcUnixHaikuSrand(seed)
}

public actual fun getifaddrs(ifap: MutPtr): CInt =
    libcUnixHaikuGetifaddrs(ifap.rawAddress.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: MutPtr) {
    libcUnixHaikuFreeifaddrs(ifa.rawAddress.toCPointer<ByteVar>())
}

public actual fun ppoll(fds: MutPtr, numfds: NfdsT, timeout: ConstPtr, sigMask: ConstPtr): CInt =
    libcUnixHaikuPpoll(fds.rawAddress.toCPointer<ByteVar>(), numfds, timeout.rawAddress.toCPointer<ByteVar>(), sigMask.rawAddress.toCPointer<ByteVar>())

public actual fun getspent(): MutPtr =
    MutPtr(libcUnixHaikuGetspent()?.toLong() ?: 0L)

public actual fun getspentR(pwd: MutPtr, buf: MutPtr, bufferSize: SizeT, res: MutPtr): CInt =
    libcUnixHaikuGetspentR(pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), bufferSize, res.rawAddress.toCPointer<ByteVar>())

public actual fun setspent() {
    libcUnixHaikuSetspent()
}

public actual fun endspent() {
    libcUnixHaikuEndspent()
}

public actual fun getspnam(name: ConstPtr): MutPtr =
    MutPtr(libcUnixHaikuGetspnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getspnamR(name: ConstPtr, spwd: MutPtr, buffer: MutPtr, bufferSize: SizeT, res: MutPtr): CInt =
    libcUnixHaikuGetspnamR(name.rawAddress.toCPointer<ByteVar>(), spwd.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), bufferSize, res.rawAddress.toCPointer<ByteVar>())

public actual fun sgetspent(line: ConstPtr): MutPtr =
    MutPtr(libcUnixHaikuSgetspent(line.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun sgetspentR(line: ConstPtr, spwd: MutPtr, buffer: MutPtr, bufferSize: SizeT, res: MutPtr): CInt =
    libcUnixHaikuSgetspentR(line.rawAddress.toCPointer<ByteVar>(), spwd.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), bufferSize, res.rawAddress.toCPointer<ByteVar>())

public actual fun fgetspent(file: MutPtr): MutPtr =
    MutPtr(libcUnixHaikuFgetspent(file.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fgetspentR(file: MutPtr, spwd: MutPtr, buffer: MutPtr, bufferSize: SizeT, res: MutPtr): CInt =
    libcUnixHaikuFgetspentR(file.rawAddress.toCPointer<ByteVar>(), spwd.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), bufferSize, res.rawAddress.toCPointer<ByteVar>())

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    libcUnixHaikuMkfifoat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    libcUnixHaikuMknodat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, dev)

public actual fun semDestroy(sem: MutPtr): CInt =
    libcUnixHaikuSemDestroy(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    libcUnixHaikuSemInit(sem.rawAddress.toCPointer<ByteVar>(), pshared, value)

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt =
    libcUnixHaikuClockGetres(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    libcUnixHaikuClockGettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt =
    libcUnixHaikuClockSettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt =
    libcUnixHaikuClockGetcpuclockid(pid, clkId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCreate(thread: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    libcUnixHaikuPthreadCreate(thread.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    libcUnixHaikuPthreadAttrGetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt =
    libcUnixHaikuPthreadAttrSetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    libcUnixHaikuPthreadAttrGetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    libcUnixHaikuPthreadCondattrGetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    libcUnixHaikuPthreadCondattrSetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun valloc(numBytes: SizeT): MutPtr =
    MutPtr(libcUnixHaikuValloc(numBytes)?.toLong() ?: 0L)

public actual fun mallocUsableSize(ptr: MutPtr): SizeT =
    libcUnixHaikuMallocUsableSize(ptr.rawAddress.toCPointer<ByteVar>())

public actual fun memalign(align: SizeT, size: SizeT): MutPtr =
    MutPtr(libcUnixHaikuMemalign(align, size)?.toLong() ?: 0L)

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr): CInt =
    libcUnixHaikuSetgroups(ngroups, ptr.rawAddress.toCPointer<ByteVar>())

public actual fun initgroups(name: ConstPtr, basegid: GidT): CInt =
    libcUnixHaikuInitgroups(name.rawAddress.toCPointer<ByteVar>(), basegid)

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    libcUnixHaikuIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    libcUnixHaikuMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun dirfd(dirp: MutPtr): CInt =
    libcUnixHaikuDirfd(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    libcUnixHaikuGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    libcUnixHaikuPthreadMutexTimedlock(lock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    0

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    libcUnixHaikuPthreadSpinInit(lock.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    libcUnixHaikuPthreadSpinDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    libcUnixHaikuPthreadSpinLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    libcUnixHaikuPthreadSpinTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    libcUnixHaikuPthreadSpinUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt =
    libcUnixHaikuWaitid(idtype, id, infop.rawAddress.toCPointer<ByteVar>(), options)

public actual fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt =
    libcUnixHaikuGlob(pattern.rawAddress.toCPointer<ByteVar>(), flags, 0L.toCPointer<ByteVar>(), pglob.rawAddress.toCPointer<ByteVar>())

public actual fun globfree(pglob: MutPtr) {
    libcUnixHaikuGlobfree(pglob.rawAddress.toCPointer<ByteVar>())
}

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    libcUnixHaikuGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    libcUnixHaikuPosixMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    libcUnixHaikuPosixFadvise(fd, offset, len, advice)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libcUnixHaikuPosixFallocate(fd, offset, len)

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    libcUnixHaikuShmOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun shmUnlink(name: ConstPtr): CInt =
    libcUnixHaikuShmUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    libcUnixHaikuSeekdir(dirp.rawAddress.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: MutPtr): CLong =
    libcUnixHaikuTelldir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    libcUnixHaikuMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    libcUnixHaikuMsync(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    libcUnixHaikuRecvfrom(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun nlLanginfo(item: NlItem): MutPtr =
    MutPtr(libcUnixHaikuNlLanginfo(item)?.toLong() ?: 0L)

public actual fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt =
    libcUnixHaikuBind(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen)

public actual fun accept4(socket: CInt, address: MutPtr, addressLength: MutPtr, flags: CInt): CInt =
    libcUnixHaikuAccept4(socket, address.rawAddress.toCPointer<ByteVar>(), addressLength.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun writev(fd: CInt, iov: ConstPtr, count: CInt): SsizeT =
    libcUnixHaikuWritev(fd, iov.rawAddress.toCPointer<ByteVar>(), count)

public actual fun readv(fd: CInt, iov: ConstPtr, count: CInt): SsizeT =
    libcUnixHaikuReadv(fd, iov.rawAddress.toCPointer<ByteVar>(), count)

public actual fun sendmsg(fd: CInt, msg: ConstPtr, flags: CInt): SsizeT =
    libcUnixHaikuSendmsg(fd, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: MutPtr, flags: CInt): SsizeT =
    libcUnixHaikuRecvmsg(fd, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun execvpe(file: ConstPtr, argv: ConstPtr, environment: ConstPtr): CInt =
    libcUnixHaikuExecvpe(file.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), environment.rawAddress.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixHaikuGetgrgidR(gid, grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrouplist(user: ConstPtr, basegroup: GidT, grouplist: MutPtr, groupcount: MutPtr): CInt =
    libcUnixHaikuGetgrouplist(user.rawAddress.toCPointer<ByteVar>(), basegroup, grouplist.rawAddress.toCPointer<ByteVar>(), groupcount.rawAddress.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt =
    libcUnixHaikuSigaltstack(ss.rawAddress.toCPointer<ByteVar>(), oss.rawAddress.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: ConstPtr): CInt =
    libcUnixHaikuSigsuspend(mask.rawAddress.toCPointer<ByteVar>())

public actual fun semClose(sem: MutPtr): CInt =
    libcUnixHaikuSemClose(sem.rawAddress.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    libcUnixHaikuGetdtablesize()

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixHaikuGetgrnamR(name.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    libcUnixHaikuPthreadSigmask(how, set.rawAddress.toCPointer<ByteVar>(), oldset.rawAddress.toCPointer<ByteVar>())

public actual fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr =
    MutPtr(libcUnixHaikuSemOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun getgrnam(name: ConstPtr): MutPtr =
    MutPtr(libcUnixHaikuGetgrnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libcUnixHaikuPthreadKill(thread.toLong().toCPointer<ByteVar>(), sig)

public actual fun semUnlink(name: ConstPtr): CInt =
    libcUnixHaikuSemUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixHaikuGetpwnamR(name.rawAddress.toCPointer<ByteVar>(), pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixHaikuGetpwuidR(uid, pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getpwent(): MutPtr =
    MutPtr(libcUnixHaikuGetpwent()?.toLong() ?: 0L)

public actual fun setpwent() {
    libcUnixHaikuSetpwent()
}

public actual fun endpwent() {
    libcUnixHaikuEndpwent()
}

public actual fun endgrent() {
    libcUnixHaikuEndgrent()
}

public actual fun getgrent(): MutPtr =
    MutPtr(libcUnixHaikuGetgrent()?.toLong() ?: 0L)

public actual fun setgrent() {
    libcUnixHaikuSetgrent()
}

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    libcUnixHaikuSigwait(set.rawAddress.toCPointer<ByteVar>(), sig.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    libcUnixHaikuPthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): MutPtr =
    MutPtr(libcUnixHaikuGetgrgid(gid)?.toLong() ?: 0L)

public actual fun popen(command: ConstPtr, mode: ConstPtr): MutPtr =
    MutPtr(libcUnixHaikuPopen(command.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun sethostname(name: ConstPtr, len: SizeT): CInt =
    libcUnixHaikuSethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun uname(buf: MutPtr): CInt =
    libcUnixHaikuUname(buf.rawAddress.toCPointer<ByteVar>())

public actual fun getutxent(): MutPtr =
    MutPtr(libcUnixHaikuGetutxent()?.toLong() ?: 0L)

public actual fun getutxid(ut: ConstPtr): MutPtr =
    MutPtr(libcUnixHaikuGetutxid(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getutxline(ut: ConstPtr): MutPtr =
    MutPtr(libcUnixHaikuGetutxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pututxline(ut: ConstPtr): MutPtr =
    MutPtr(libcUnixHaikuPututxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setutxent() {
    libcUnixHaikuSetutxent()
}

public actual fun endutxent() {
    libcUnixHaikuEndutxent()
}

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    libcUnixHaikuFaccessat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    libcUnixHaikuSigtimedwait(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt =
    libcUnixHaikuSigwaitinfo(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: MutPtr): CInt =
    libcUnixHaikuGetitimer(which, currValue.rawAddress.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    libcUnixHaikuSetitimer(which, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun regcomp(preg: MutPtr, pattern: ConstPtr, cflags: CInt): CInt =
    libcUnixHaikuRegcomp(preg.rawAddress.toCPointer<ByteVar>(), pattern.rawAddress.toCPointer<ByteVar>(), cflags)

public actual fun regexec(preg: ConstPtr, input: ConstPtr, nmatch: SizeT, pmatch: MutPtr, eflags: CInt): CInt =
    libcUnixHaikuRegexec(preg.rawAddress.toCPointer<ByteVar>(), input.rawAddress.toCPointer<ByteVar>(), nmatch, pmatch.rawAddress.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: ConstPtr, errbuf: MutPtr, errbufSize: SizeT): SizeT =
    libcUnixHaikuRegerror(errcode, preg.rawAddress.toCPointer<ByteVar>(), errbuf.rawAddress.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: MutPtr) {
    libcUnixHaikuRegfree(preg.rawAddress.toCPointer<ByteVar>())
}

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr): CInt =
    libcUnixHaikuMsgctl(msqid, cmd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    libcUnixHaikuMsgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: MutPtr, msgsz: SizeT, msgtype: CLong, msgflg: CInt): SsizeT =
    libcUnixHaikuMsgrcv(msqid, msgp.rawAddress.toCPointer<ByteVar>(), msgsz, msgtype, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr, msgsz: SizeT, msgflg: CInt): CInt =
    libcUnixHaikuMsgsnd(msqid, msgp.rawAddress.toCPointer<ByteVar>(), msgsz, msgflg)

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    libcUnixHaikuSemget(key, nsems, semflg)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libcUnixHaikuSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun semop(semid: CInt, sops: MutPtr, nsops: SizeT): CInt =
    libcUnixHaikuSemop(semid, sops.rawAddress.toCPointer<ByteVar>(), nsops)

public actual fun ftok(pathname: ConstPtr, projId: CInt): KeyT =
    libcUnixHaikuFtok(pathname.rawAddress.toCPointer<ByteVar>(), projId)

public actual fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(libcUnixHaikuMemrchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun lsearch(key: ConstPtr, base: MutPtr, nelp: MutPtr, width: SizeT, compar: LsearchComparCallback?): MutPtr =
    MutPtr(libcUnixHaikuLsearch(key.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), nelp.rawAddress.toCPointer<ByteVar>(), width, 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun lfind(key: ConstPtr, base: ConstPtr, nelp: MutPtr, width: SizeT, compar: LsearchComparCallback?): MutPtr =
    MutPtr(libcUnixHaikuLfind(key.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), nelp.rawAddress.toCPointer<ByteVar>(), width, 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hcreate(nelt: SizeT): CInt =
    libcUnixHaikuHcreate(nelt)

public actual fun hdestroy() {
    libcUnixHaikuHdestroy()
}

public actual fun hsearch(entry: Entry, action: Action): MutPtr =
    MutPtr(0L)

public actual fun drand48(): CDouble =
    libcUnixHaikuDrand48()

public actual fun erand48(xseed: MutPtr): CDouble =
    libcUnixHaikuErand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun lrand48(): CLong =
    libcUnixHaikuLrand48()

public actual fun nrand48(xseed: MutPtr): CLong =
    libcUnixHaikuNrand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun mrand48(): CLong =
    libcUnixHaikuMrand48()

public actual fun jrand48(xseed: MutPtr): CLong =
    libcUnixHaikuJrand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun srand48(seed: CLong) {
    libcUnixHaikuSrand48(seed)
}

public actual fun seed48(xseed: MutPtr): MutPtr =
    MutPtr(libcUnixHaikuSeed48(xseed.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun lcong48(p: MutPtr) {
    libcUnixHaikuLcong48(p.rawAddress.toCPointer<ByteVar>())
}

public actual fun clearenv(): CInt =
    libcUnixHaikuClearenv()

public actual fun ctermid(s: MutPtr): MutPtr =
    MutPtr(libcUnixHaikuCtermid(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun sync() {
    libcUnixHaikuSync()
}

public actual fun getpagesize(): CInt =
    libcUnixHaikuGetpagesize()

public actual fun brk(addr: MutPtr): CInt =
    libcUnixHaikuBrk(addr.rawAddress.toCPointer<ByteVar>())

public actual fun sbrk(increment: IntptrT): MutPtr =
    MutPtr(libcUnixHaikuSbrk(increment)?.toLong() ?: 0L)

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixHaikuPosixSpawn(pid.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixHaikuPosixSpawnp(pid.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(fileActions: MutPtr): CInt =
    libcUnixHaikuPosixSpawnFileActionsInit(fileActions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(fileActions: MutPtr): CInt =
    libcUnixHaikuPosixSpawnFileActionsDestroy(fileActions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(fileActions: MutPtr, fildes: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    libcUnixHaikuPosixSpawnFileActionsAddopen(fileActions.rawAddress.toCPointer<ByteVar>(), fildes, path.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun posixSpawnFileActionsAddclose(fileActions: MutPtr, fildes: CInt): CInt =
    libcUnixHaikuPosixSpawnFileActionsAddclose(fileActions.rawAddress.toCPointer<ByteVar>(), fildes)

public actual fun posixSpawnFileActionsAdddup2(fileActions: MutPtr, fildes: CInt, newfildes: CInt): CInt =
    libcUnixHaikuPosixSpawnFileActionsAdddup2(fileActions.rawAddress.toCPointer<ByteVar>(), fildes, newfildes)

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    libcUnixHaikuPosixSpawnattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    libcUnixHaikuPosixSpawnattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    libcUnixHaikuPosixSpawnattrGetflags(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    libcUnixHaikuPosixSpawnattrSetflags(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, pgroup: MutPtr): CInt =
    libcUnixHaikuPosixSpawnattrGetpgroup(attr.rawAddress.toCPointer<ByteVar>(), pgroup.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, pgroup: PidT): CInt =
    libcUnixHaikuPosixSpawnattrSetpgroup(attr.rawAddress.toCPointer<ByteVar>(), pgroup)

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, sigdefault: MutPtr): CInt =
    libcUnixHaikuPosixSpawnattrGetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), sigdefault.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, sigdefault: ConstPtr): CInt =
    libcUnixHaikuPosixSpawnattrSetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), sigdefault.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, sigmask: MutPtr): CInt =
    libcUnixHaikuPosixSpawnattrGetsigmask(attr.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, sigmask: ConstPtr): CInt =
    libcUnixHaikuPosixSpawnattrSetsigmask(attr.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun getoptLong(argc: CInt, argv: ConstPtr, optstring: ConstPtr, longopts: ConstPtr, longindex: MutPtr): CInt =
    libcUnixHaikuGetoptLong(argc, argv.rawAddress.toCPointer<ByteVar>(), optstring.rawAddress.toCPointer<ByteVar>(), longopts.rawAddress.toCPointer<ByteVar>(), longindex.rawAddress.toCPointer<ByteVar>())

public actual fun strcasecmpL(string1: ConstPtr, string2: ConstPtr, locale: LocaleT): CInt =
    libcUnixHaikuStrcasecmpL(string1.rawAddress.toCPointer<ByteVar>(), string2.rawAddress.toCPointer<ByteVar>(), locale.rawAddress.toCPointer<ByteVar>())

public actual fun strncasecmpL(string1: ConstPtr, string2: ConstPtr, length: SizeT, locale: LocaleT): CInt =
    libcUnixHaikuStrncasecmpL(string1.rawAddress.toCPointer<ByteVar>(), string2.rawAddress.toCPointer<ByteVar>(), length, locale.rawAddress.toCPointer<ByteVar>())

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    libcUnixHaikuGetentropy(buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun memmem(source: ConstPtr, sourceLength: SizeT, search: ConstPtr, searchLength: SizeT): MutPtr =
    MutPtr(libcUnixHaikuMemmem(source.rawAddress.toCPointer<ByteVar>(), sourceLength, search.rawAddress.toCPointer<ByteVar>(), searchLength)?.toLong() ?: 0L)

public actual fun pthreadGetattrNp(thread: PthreadT, attr: MutPtr): CInt =
    libcUnixHaikuPthreadGetattrNp(thread.toLong().toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: MutPtr, length: SizeT): CInt =
    libcUnixHaikuPthreadGetnameNp(thread.toLong().toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), length)

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr): CInt =
    libcUnixHaikuPthreadSetnameNp(thread.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())
