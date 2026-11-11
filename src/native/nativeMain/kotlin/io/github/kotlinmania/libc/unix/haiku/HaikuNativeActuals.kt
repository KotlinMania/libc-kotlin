@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_abs
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_accept4
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_bind
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_brk
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_clearenv
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_clockGetcpuclockid
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_clockGetres
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_clockGettime
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_clockSettime
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_ctermid
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_dirfd
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_drand48
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_endgrent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_endpwent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_endspent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_endusershell
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_endutxent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_erand48
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_errnop
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_execvpe
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_faccessat
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_fgetspent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_fgetspentR
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_freeifaddrs
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_ftok
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_futimens
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getdtablesize
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getentropy
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getgrent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getgrgid
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getgrgidR
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getgrnam
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getgrnamR
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getgrouplist
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getifaddrs
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getitimer
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getnameinfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getoptLong
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getpagesize
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getpass
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getpriority
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getpwent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getpwnamR
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getpwuidR
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getrlimit
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getspent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getspentR
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getspnam
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getspnamR
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_gettimeofday
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getusershell
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getutxent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getutxid
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_getutxline
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_glob
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_globfree
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_hcreate
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_hdestroy
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_initgroups
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_ioctl
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_issetugid
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_jrand48
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_labs
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_lcong48
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_lfind
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_lrand48
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_lsearch
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_madvise
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_mallocUsableSize
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_memalign
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_memmem
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_memrchr
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_mkfifoat
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_mknodat
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_mprotect
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_mrand48
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_msgctl
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_msgget
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_msgrcv
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_msgsnd
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_msync
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_nlLanginfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_nrand48
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_popen
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixFadvise
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixFallocate
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixMadvise
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixSpawn
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixSpawnFileActionsAddclose
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixSpawnFileActionsAdddup2
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixSpawnFileActionsAddopen
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixSpawnFileActionsDestroy
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixSpawnFileActionsInit
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixSpawnattrDestroy
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixSpawnattrGetflags
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixSpawnattrGetpgroup
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixSpawnattrGetsigdefault
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixSpawnattrGetsigmask
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixSpawnattrInit
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixSpawnattrSetflags
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixSpawnattrSetpgroup
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixSpawnattrSetsigdefault
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixSpawnattrSetsigmask
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_posixSpawnp
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_ppoll
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pthreadAtfork
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pthreadAttrGetguardsize
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pthreadAttrGetstack
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pthreadAttrSetguardsize
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pthreadCondattrGetclock
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pthreadCreate
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pthreadGetattrNp
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pthreadGetnameNp
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pthreadKill
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pthreadMutexTimedlock
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pthreadSetnameNp
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pthreadSigmask
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pthreadSpinDestroy
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pthreadSpinInit
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pthreadSpinLock
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pthreadSpinTrylock
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pthreadSpinUnlock
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_pututxline
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_rand
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_readv
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_recvfrom
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_recvmsg
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_regcomp
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_regerror
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_regexec
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_regfree
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_sbrk
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_seed48
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_seekdir
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_semClose
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_semDestroy
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_semInit
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_semOpen
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_semUnlink
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_semctl
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_semget
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_semop
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_sendmsg
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_setgrent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_setgroups
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_sethostname
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_setitimer
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_setpriority
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_setpwent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_setrlimit
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_setspent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_setusershell
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_setutxent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_sgetspent
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_sgetspentR
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_shmOpen
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_shmUnlink
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_sigaltstack
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_sigsuspend
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_sigtimedwait
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_sigwait
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_sigwaitinfo
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_srand
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_srand48
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_strcasecmpL
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_strerrorR
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_strncasecmpL
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_sync
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_telldir
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_uname
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_utimensat
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_valloc
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_waitid
import io.github.kotlinmania.libc.unix.haiku.cinterop.libc_unix_haiku_writev
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    libc_unix_haiku_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    libc_unix_haiku_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libc_unix_haiku_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    libc_unix_haiku_setpriority(which, who, priority)

public actual fun endusershell() {
    libc_unix_haiku_endusershell()
}

public actual fun getpass(prompt: String?): COpaquePointer? =
    libc_unix_haiku_getpass(prompt)?.let { COpaquePointer(it.toLong()) }

public actual fun getusershell(): COpaquePointer? =
    libc_unix_haiku_getusershell()?.let { COpaquePointer(it.toLong()) }

public actual fun issetugid(): CInt =
    libc_unix_haiku_issetugid()

public actual fun setusershell() {
    libc_unix_haiku_setusershell()
}

public actual fun utimensat(fd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    libc_unix_haiku_utimensat(fd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    libc_unix_haiku_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    libc_unix_haiku_strerrorR(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun errnop(): COpaquePointer? =
    libc_unix_haiku_errnop()?.let { COpaquePointer(it.toLong()) }

public actual fun abs(i: CInt): CInt =
    libc_unix_haiku_abs(i)

public actual fun labs(i: CLong): CLong =
    libc_unix_haiku_labs(i)

public actual fun rand(): CInt =
    libc_unix_haiku_rand()

public actual fun srand(seed: CUint) {
    libc_unix_haiku_srand(seed)
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    libc_unix_haiku_getifaddrs(ifap?.value?.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    libc_unix_haiku_freeifaddrs(ifa?.value?.toCPointer<ByteVar>())
}

public actual fun ppoll(fds: COpaquePointer?, numfds: NfdsT, timeout: COpaquePointer?, sigMask: COpaquePointer?): CInt =
    libc_unix_haiku_ppoll(fds?.value?.toCPointer<ByteVar>(), numfds, timeout?.value?.toCPointer<ByteVar>(), sigMask?.value?.toCPointer<ByteVar>())

public actual fun getspent(): COpaquePointer? =
    libc_unix_haiku_getspent()?.let { COpaquePointer(it.toLong()) }

public actual fun getspentR(pwd: COpaquePointer?, buf: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    libc_unix_haiku_getspentR(pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), bufferSize, res?.value?.toCPointer<ByteVar>())

public actual fun setspent() {
    libc_unix_haiku_setspent()
}

public actual fun endspent() {
    libc_unix_haiku_endspent()
}

public actual fun getspnam(name: String?): COpaquePointer? =
    libc_unix_haiku_getspnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getspnamR(name: String?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    libc_unix_haiku_getspnamR(name, spwd?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferSize, res?.value?.toCPointer<ByteVar>())

public actual fun sgetspent(line: String?): COpaquePointer? =
    libc_unix_haiku_sgetspent(line)?.let { COpaquePointer(it.toLong()) }

public actual fun sgetspentR(line: String?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    libc_unix_haiku_sgetspentR(line, spwd?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferSize, res?.value?.toCPointer<ByteVar>())

public actual fun fgetspent(file: FILE?): COpaquePointer? =
    libc_unix_haiku_fgetspent(file?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fgetspentR(file: FILE?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    libc_unix_haiku_fgetspentR(file?.handle?.toCPointer<ByteVar>(), spwd?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferSize, res?.value?.toCPointer<ByteVar>())

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    libc_unix_haiku_mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    libc_unix_haiku_mknodat(dirfd, pathname, mode, dev)

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    libc_unix_haiku_semDestroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    libc_unix_haiku_semInit(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    libc_unix_haiku_clockGetres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    libc_unix_haiku_clockGettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    libc_unix_haiku_clockSettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    libc_unix_haiku_clockGetcpuclockid(pid, clkId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    libc_unix_haiku_pthreadCreate(thread?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    libc_unix_haiku_pthreadAttrGetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    libc_unix_haiku_pthreadAttrSetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    libc_unix_haiku_pthreadAttrGetstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    libc_unix_haiku_pthreadCondattrGetclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    libc_unix_haiku_pthreadCondattrSetclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun valloc(numBytes: SizeT): COpaquePointer? =
    libc_unix_haiku_valloc(numBytes)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    libc_unix_haiku_mallocUsableSize(ptr?.value?.toCPointer<ByteVar>())

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    libc_unix_haiku_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    libc_unix_haiku_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    libc_unix_haiku_initgroups(name, basegid)

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    libc_unix_haiku_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    libc_unix_haiku_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun dirfd(dirp: DIR?): CInt =
    libc_unix_haiku_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    libc_unix_haiku_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    libc_unix_haiku_pthreadMutexTimedlock(lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    0

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    libc_unix_haiku_pthreadSpinInit(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    libc_unix_haiku_pthreadSpinDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    libc_unix_haiku_pthreadSpinLock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    libc_unix_haiku_pthreadSpinTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    libc_unix_haiku_pthreadSpinUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    libc_unix_haiku_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    libc_unix_haiku_glob(pattern, flags, 0L.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: COpaquePointer?) {
    libc_unix_haiku_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    libc_unix_haiku_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    libc_unix_haiku_posixMadvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    libc_unix_haiku_posixFadvise(fd, offset, len, advice)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libc_unix_haiku_posixFallocate(fd, offset, len)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    libc_unix_haiku_shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    libc_unix_haiku_shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    libc_unix_haiku_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    libc_unix_haiku_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    libc_unix_haiku_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    libc_unix_haiku_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    libc_unix_haiku_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    libc_unix_haiku_nlLanginfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    libc_unix_haiku_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun accept4(socket: CInt, address: COpaquePointer?, addressLength: COpaquePointer?, flags: CInt): CInt =
    libc_unix_haiku_accept4(socket, address?.value?.toCPointer<ByteVar>(), addressLength?.value?.toCPointer<ByteVar>(), flags)

public actual fun writev(fd: CInt, iov: COpaquePointer?, count: CInt): SsizeT =
    libc_unix_haiku_writev(fd, iov?.value?.toCPointer<ByteVar>(), count)

public actual fun readv(fd: CInt, iov: COpaquePointer?, count: CInt): SsizeT =
    libc_unix_haiku_readv(fd, iov?.value?.toCPointer<ByteVar>(), count)

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    libc_unix_haiku_sendmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    libc_unix_haiku_recvmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun execvpe(file: String?, argv: COpaquePointer?, environment: COpaquePointer?): CInt =
    libc_unix_haiku_execvpe(file, argv?.value?.toCPointer<ByteVar>(), environment?.value?.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_haiku_getgrgidR(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrouplist(user: String?, basegroup: GidT, grouplist: COpaquePointer?, groupcount: COpaquePointer?): CInt =
    libc_unix_haiku_getgrouplist(user, basegroup, grouplist?.value?.toCPointer<ByteVar>(), groupcount?.value?.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    libc_unix_haiku_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    libc_unix_haiku_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: COpaquePointer?): CInt =
    libc_unix_haiku_semClose(sem?.value?.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    libc_unix_haiku_getdtablesize()

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_haiku_getgrnamR(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    libc_unix_haiku_pthreadSigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    libc_unix_haiku_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnam(name: String?): COpaquePointer? =
    libc_unix_haiku_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libc_unix_haiku_pthreadKill(thread.toLong().toCPointer<ByteVar>(), sig)

public actual fun semUnlink(name: String?): CInt =
    libc_unix_haiku_semUnlink(name)

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_haiku_getpwnamR(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_haiku_getpwuidR(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwent(): COpaquePointer? =
    libc_unix_haiku_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setpwent() {
    libc_unix_haiku_setpwent()
}

public actual fun endpwent() {
    libc_unix_haiku_endpwent()
}

public actual fun endgrent() {
    libc_unix_haiku_endgrent()
}

public actual fun getgrent(): COpaquePointer? =
    libc_unix_haiku_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    libc_unix_haiku_setgrent()
}

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    libc_unix_haiku_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    libc_unix_haiku_pthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    libc_unix_haiku_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun popen(command: String?, mode: String?): FILE? =
    libc_unix_haiku_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun sethostname(name: String?, len: SizeT): CInt =
    libc_unix_haiku_sethostname(name, len)

public actual fun uname(buf: COpaquePointer?): CInt =
    libc_unix_haiku_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun getutxent(): COpaquePointer? =
    libc_unix_haiku_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    libc_unix_haiku_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    libc_unix_haiku_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    libc_unix_haiku_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setutxent() {
    libc_unix_haiku_setutxent()
}

public actual fun endutxent() {
    libc_unix_haiku_endutxent()
}

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    libc_unix_haiku_faccessat(dirfd, pathname, mode, flags)

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    libc_unix_haiku_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    libc_unix_haiku_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    libc_unix_haiku_getitimer(which, currValue?.value?.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    libc_unix_haiku_setitimer(which, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    libc_unix_haiku_regcomp(preg?.value?.toCPointer<ByteVar>(), pattern, cflags)

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    libc_unix_haiku_regexec(preg?.value?.toCPointer<ByteVar>(), input, nmatch, pmatch?.value?.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    libc_unix_haiku_regerror(errcode, preg?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: COpaquePointer?) {
    libc_unix_haiku_regfree(preg?.value?.toCPointer<ByteVar>())
}

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    libc_unix_haiku_msgctl(msqid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    libc_unix_haiku_msgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtype: CLong, msgflg: CInt): SsizeT =
    libc_unix_haiku_msgrcv(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgtype, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    libc_unix_haiku_msgsnd(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgflg)

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    libc_unix_haiku_semget(key, nsems, semflg)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libc_unix_haiku_semctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    libc_unix_haiku_semop(semid, sops?.value?.toCPointer<ByteVar>(), nsops)

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    libc_unix_haiku_ftok(pathname, projId)

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    libc_unix_haiku_memrchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    libc_unix_haiku_lsearch(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), nelp?.value?.toCPointer<ByteVar>(), width, 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    libc_unix_haiku_lfind(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), nelp?.value?.toCPointer<ByteVar>(), width, 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hcreate(nelt: SizeT): CInt =
    libc_unix_haiku_hcreate(nelt)

public actual fun hdestroy() {
    libc_unix_haiku_hdestroy()
}

public actual fun hsearch(entry: Entry, action: Action): COpaquePointer? =
    null

public actual fun drand48(): CDouble =
    libc_unix_haiku_drand48()

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    libc_unix_haiku_erand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun lrand48(): CLong =
    libc_unix_haiku_lrand48()

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    libc_unix_haiku_nrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun mrand48(): CLong =
    libc_unix_haiku_mrand48()

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    libc_unix_haiku_jrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun srand48(seed: CLong) {
    libc_unix_haiku_srand48(seed)
}

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    libc_unix_haiku_seed48(xseed?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lcong48(p: COpaquePointer?) {
    libc_unix_haiku_lcong48(p?.value?.toCPointer<ByteVar>())
}

public actual fun clearenv(): CInt =
    libc_unix_haiku_clearenv()

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    libc_unix_haiku_ctermid(s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun sync() {
    libc_unix_haiku_sync()
}

public actual fun getpagesize(): CInt =
    libc_unix_haiku_getpagesize()

public actual fun brk(addr: COpaquePointer?): CInt =
    libc_unix_haiku_brk(addr?.value?.toCPointer<ByteVar>())

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    libc_unix_haiku_sbrk(increment)?.let { COpaquePointer(it.toLong()) }

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_unix_haiku_posixSpawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_unix_haiku_posixSpawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt =
    libc_unix_haiku_posixSpawnFileActionsInit(fileActions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt =
    libc_unix_haiku_posixSpawnFileActionsDestroy(fileActions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    libc_unix_haiku_posixSpawnFileActionsAddopen(fileActions?.value?.toCPointer<ByteVar>(), fildes, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt =
    libc_unix_haiku_posixSpawnFileActionsAddclose(fileActions?.value?.toCPointer<ByteVar>(), fildes)

public actual fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt =
    libc_unix_haiku_posixSpawnFileActionsAdddup2(fileActions?.value?.toCPointer<ByteVar>(), fildes, newfildes)

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    libc_unix_haiku_posixSpawnattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    libc_unix_haiku_posixSpawnattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    libc_unix_haiku_posixSpawnattrGetflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    libc_unix_haiku_posixSpawnattrSetflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: COpaquePointer?): CInt =
    libc_unix_haiku_posixSpawnattrGetpgroup(attr?.value?.toCPointer<ByteVar>(), pgroup?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt =
    libc_unix_haiku_posixSpawnattrSetpgroup(attr?.value?.toCPointer<ByteVar>(), pgroup)

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    libc_unix_haiku_posixSpawnattrGetsigdefault(attr?.value?.toCPointer<ByteVar>(), sigdefault?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    libc_unix_haiku_posixSpawnattrSetsigdefault(attr?.value?.toCPointer<ByteVar>(), sigdefault?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    libc_unix_haiku_posixSpawnattrGetsigmask(attr?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    libc_unix_haiku_posixSpawnattrSetsigmask(attr?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    libc_unix_haiku_getoptLong(argc, argv?.value?.toCPointer<ByteVar>(), optstring, longopts?.value?.toCPointer<ByteVar>(), longindex?.value?.toCPointer<ByteVar>())

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    libc_unix_haiku_strcasecmpL(string1, string2, locale?.value?.toCPointer<ByteVar>())

public actual fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt =
    libc_unix_haiku_strncasecmpL(string1, string2, length, locale?.value?.toCPointer<ByteVar>())

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    libc_unix_haiku_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun memmem(source: COpaquePointer?, sourceLength: SizeT, search: COpaquePointer?, searchLength: SizeT): COpaquePointer? =
    libc_unix_haiku_memmem(source?.value?.toCPointer<ByteVar>(), sourceLength, search?.value?.toCPointer<ByteVar>(), searchLength)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadGetattrNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    libc_unix_haiku_pthreadGetattrNp(thread.toLong().toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: COpaquePointer?, length: SizeT): CInt =
    libc_unix_haiku_pthreadGetnameNp(thread.toLong().toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), length)

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    libc_unix_haiku_pthreadSetnameNp(thread.toLong().toCPointer<ByteVar>(), name)
