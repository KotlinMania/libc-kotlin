package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32

import io.github.kotlinmania.libc.COpaquePointer

internal object WaliRawLibc {
    external fun syscallSysRead(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysWrite(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysOpen(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysClose(a1: Int): Long
    external fun syscallSysStat(a1: Int, a2: Int): Long
    external fun syscallSysFstat(a1: Int, a2: Int): Long
    external fun syscallSysLstat(a1: Int, a2: Int): Long
    external fun syscallSysPoll(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysLseek(a1: Int, a2: Long, a3: Int): Long
    external fun syscallSysMmap(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Long): Long
    external fun syscallSysMprotect(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysMunmap(a1: Int, a2: Int): Long
    external fun syscallSysBrk(a1: Int): Long
    external fun syscallSysRtSigaction(a1: Int, a2: Int, a3: Int, a4: Int): Long
    external fun syscallSysRtSigprocmask(a1: Int, a2: Int, a3: Int, a4: Int): Long
    external fun syscallSysRtSigreturn(a1: Long): Long
    external fun syscallSysIoctl(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysPread64(a1: Int, a2: Int, a3: Int, a4: Long): Long
    external fun syscallSysPwrite64(a1: Int, a2: Int, a3: Int, a4: Long): Long
    external fun syscallSysReadv(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysWritev(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysAccess(a1: Int, a2: Int): Long
    external fun syscallSysPipe(a1: Int): Long
    external fun syscallSysSelect(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long
    external fun syscallSysSchedYield(): Long
    external fun syscallSysMremap(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long
    external fun syscallSysMsync(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysMadvise(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysDup(a1: Int): Long
    external fun syscallSysDup2(a1: Int, a2: Int): Long
    external fun syscallSysNanosleep(a1: Int, a2: Int): Long
    external fun syscallSysAlarm(a1: Int): Long
    external fun syscallSysSetitimer(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysGetpid(): Long
    external fun syscallSysSocket(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysConnect(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysAccept(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysSendto(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): Long
    external fun syscallSysRecvfrom(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): Long
    external fun syscallSysSendmsg(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysRecvmsg(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysShutdown(a1: Int, a2: Int): Long
    external fun syscallSysBind(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysListen(a1: Int, a2: Int): Long
    external fun syscallSysGetsockname(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysGetpeername(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysSocketpair(a1: Int, a2: Int, a3: Int, a4: Int): Long
    external fun syscallSysSetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long
    external fun syscallSysGetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long
    external fun syscallSysFork(): Long
    external fun syscallSysExecve(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysExit(a1: Int): Long
    external fun syscallSysWait4(a1: Int, a2: Int, a3: Int, a4: Int): Long
    external fun syscallSysKill(a1: Int, a2: Int): Long
    external fun syscallSysUname(a1: Int): Long
    external fun syscallSysFcntl(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysFlock(a1: Int, a2: Int): Long
    external fun syscallSysFsync(a1: Int): Long
    external fun syscallSysFdatasync(a1: Int): Long
    external fun syscallSysFtruncate(a1: Int, a2: Long): Long
    external fun syscallSysGetdents(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysGetcwd(a1: Int, a2: Int): Long
    external fun syscallSysChdir(a1: Int): Long
    external fun syscallSysFchdir(a1: Int): Long
    external fun syscallSysRename(a1: Int, a2: Int): Long
    external fun syscallSysMkdir(a1: Int, a2: Int): Long
    external fun syscallSysRmdir(a1: Int): Long
    external fun syscallSysLink(a1: Int, a2: Int): Long
    external fun syscallSysUnlink(a1: Int): Long
    external fun syscallSysSymlink(a1: Int, a2: Int): Long
    external fun syscallSysReadlink(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysChmod(a1: Int, a2: Int): Long
    external fun syscallSysFchmod(a1: Int, a2: Int): Long
    external fun syscallSysChown(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysFchown(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysUmask(a1: Int): Long
    external fun syscallSysGetrlimit(a1: Int, a2: Int): Long
    external fun syscallSysGetrusage(a1: Int, a2: Int): Long
    external fun syscallSysSysinfo(a1: Int): Long
    external fun syscallSysGetuid(): Long
    external fun syscallSysGetgid(): Long
    external fun syscallSysSetuid(a1: Int): Long
    external fun syscallSysSetgid(a1: Int): Long
    external fun syscallSysGeteuid(): Long
    external fun syscallSysGetegid(): Long
    external fun syscallSysSetpgid(a1: Int, a2: Int): Long
    external fun syscallSysGetppid(): Long
    external fun syscallSysSetsid(): Long
    external fun syscallSysSetreuid(a1: Int, a2: Int): Long
    external fun syscallSysSetregid(a1: Int, a2: Int): Long
    external fun syscallSysGetgroups(a1: Int, a2: Int): Long
    external fun syscallSysSetgroups(a1: Int, a2: Int): Long
    external fun syscallSysSetresuid(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysSetresgid(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysGetpgid(a1: Int): Long
    external fun syscallSysGetsid(a1: Int): Long
    external fun syscallSysRtSigpending(a1: Int, a2: Int): Long
    external fun syscallSysRtSigsuspend(a1: Int, a2: Int): Long
    external fun syscallSysSigaltstack(a1: Int, a2: Int): Long
    external fun syscallSysUtime(a1: Int, a2: Int): Long
    external fun syscallSysStatfs(a1: Int, a2: Int): Long
    external fun syscallSysFstatfs(a1: Int, a2: Int): Long
    external fun syscallSysPrctl(a1: Int, a2: Long, a3: Long, a4: Long, a5: Long): Long
    external fun syscallSysSetrlimit(a1: Int, a2: Int): Long
    external fun syscallSysChroot(a1: Int): Long
    external fun syscallSysGettid(): Long
    external fun syscallSysTkill(a1: Int, a2: Int): Long
    external fun syscallSysFutex(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): Long
    external fun syscallSysSchedGetaffinity(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysGetdents64(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysSetTidAddress(a1: Int): Long
    external fun syscallSysFadvise(a1: Int, a2: Long, a3: Long, a4: Int): Long
    external fun syscallSysClockGettime(a1: Int, a2: Int): Long
    external fun syscallSysClockGetres(a1: Int, a2: Int): Long
    external fun syscallSysClockNanosleep(a1: Int, a2: Int, a3: Int, a4: Int): Long
    external fun syscallSysExitGroup(a1: Int): Long
    external fun syscallSysEpollCtl(a1: Int, a2: Int, a3: Int, a4: Int): Long
    external fun syscallSysOpenat(a1: Int, a2: Int, a3: Int, a4: Int): Long
    external fun syscallSysMkdirat(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysFchownat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long
    external fun syscallSysFstatat(a1: Int, a2: Int, a3: Int, a4: Int): Long
    external fun syscallSysUnlinkat(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysLinkat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long
    external fun syscallSysSymlinkat(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysReadlinkat(a1: Int, a2: Int, a3: Int, a4: Int): Long
    external fun syscallSysFchmodat(a1: Int, a2: Int, a3: Int, a4: Int): Long
    external fun syscallSysFaccessat(a1: Int, a2: Int, a3: Int, a4: Int): Long
    external fun syscallSysPselect6(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): Long
    external fun syscallSysPpoll(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long
    external fun syscallSysUtimensat(a1: Int, a2: Int, a3: Int, a4: Int): Long
    external fun syscallSysEpollPwait(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): Long
    external fun syscallSysEventfd(a1: Int): Long
    external fun syscallSysAccept4(a1: Int, a2: Int, a3: Int, a4: Int): Long
    external fun syscallSysEventfd2(a1: Int, a2: Int): Long
    external fun syscallSysEpollCreate1(a1: Int): Long
    external fun syscallSysDup3(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysPipe2(a1: Int, a2: Int): Long
    external fun syscallSysPrlimit64(a1: Int, a2: Int, a3: Int, a4: Int): Long
    external fun syscallSysRenameat2(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long
    external fun syscallSysGetrandom(a1: Int, a2: Int, a3: Int): Long
    external fun syscallSysStatx(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long
    external fun syscallSysFaccessat2(a1: Int, a2: Int, a3: Int, a4: Int): Long
}

public actual fun syscallSysRead(a1: Int, a2: Int, a3: UInt): CLong =
    WaliRawLibc.syscallSysRead(a1, a2, a3)

public actual fun syscallSysWrite(a1: Int, a2: Int, a3: UInt): CLong =
    WaliRawLibc.syscallSysWrite(a1, a2, a3)

public actual fun syscallSysOpen(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysOpen(a1, a2, a3)

public actual fun syscallSysClose(a1: Int): CLong =
    WaliRawLibc.syscallSysClose(a1)

public actual fun syscallSysStat(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysStat(a1, a2)

public actual fun syscallSysFstat(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysFstat(a1, a2)

public actual fun syscallSysLstat(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysLstat(a1, a2)

public actual fun syscallSysPoll(a1: Int, a2: UInt, a3: Int): CLong =
    WaliRawLibc.syscallSysPoll(a1, a2, a3)

public actual fun syscallSysLseek(a1: Int, a2: Long, a3: Int): CLong =
    WaliRawLibc.syscallSysLseek(a1, a2, a3)

public actual fun syscallSysMmap(a1: Int, a2: UInt, a3: Int, a4: Int, a5: Int, a6: Long): CLong =
    WaliRawLibc.syscallSysMmap(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysMprotect(a1: Int, a2: UInt, a3: Int): CLong =
    WaliRawLibc.syscallSysMprotect(a1, a2, a3)

public actual fun syscallSysMunmap(a1: Int, a2: UInt): CLong =
    WaliRawLibc.syscallSysMunmap(a1, a2)

public actual fun syscallSysBrk(a1: Int): CLong =
    WaliRawLibc.syscallSysBrk(a1)

public actual fun syscallSysRtSigaction(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    WaliRawLibc.syscallSysRtSigaction(a1, a2, a3, a4)

public actual fun syscallSysRtSigprocmask(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    WaliRawLibc.syscallSysRtSigprocmask(a1, a2, a3, a4)

public actual fun syscallSysRtSigreturn(a1: Long): CLong =
    WaliRawLibc.syscallSysRtSigreturn(a1)

public actual fun syscallSysIoctl(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysIoctl(a1, a2, a3)

public actual fun syscallSysPread64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    WaliRawLibc.syscallSysPread64(a1, a2, a3, a4)

public actual fun syscallSysPwrite64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    WaliRawLibc.syscallSysPwrite64(a1, a2, a3, a4)

public actual fun syscallSysReadv(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysReadv(a1, a2, a3)

public actual fun syscallSysWritev(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysWritev(a1, a2, a3)

public actual fun syscallSysAccess(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysAccess(a1, a2)

public actual fun syscallSysPipe(a1: Int): CLong =
    WaliRawLibc.syscallSysPipe(a1)

public actual fun syscallSysSelect(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    WaliRawLibc.syscallSysSelect(a1, a2, a3, a4, a5)

public actual fun syscallSysSchedYield(): CLong =
    WaliRawLibc.syscallSysSchedYield()

public actual fun syscallSysMremap(a1: Int, a2: UInt, a3: UInt, a4: Int, a5: Int): CLong =
    WaliRawLibc.syscallSysMremap(a1, a2, a3, a4, a5)

public actual fun syscallSysMsync(a1: Int, a2: UInt, a3: Int): CLong =
    WaliRawLibc.syscallSysMsync(a1, a2, a3)

public actual fun syscallSysMadvise(a1: Int, a2: UInt, a3: Int): CLong =
    WaliRawLibc.syscallSysMadvise(a1, a2, a3)

public actual fun syscallSysDup(a1: Int): CLong =
    WaliRawLibc.syscallSysDup(a1)

public actual fun syscallSysDup2(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysDup2(a1, a2)

public actual fun syscallSysNanosleep(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysNanosleep(a1, a2)

public actual fun syscallSysAlarm(a1: Int): CLong =
    WaliRawLibc.syscallSysAlarm(a1)

public actual fun syscallSysSetitimer(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysSetitimer(a1, a2, a3)

public actual fun syscallSysGetpid(): CLong =
    WaliRawLibc.syscallSysGetpid()

public actual fun syscallSysSocket(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysSocket(a1, a2, a3)

public actual fun syscallSysConnect(a1: Int, a2: Int, a3: UInt): CLong =
    WaliRawLibc.syscallSysConnect(a1, a2, a3)

public actual fun syscallSysAccept(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysAccept(a1, a2, a3)

public actual fun syscallSysSendto(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: UInt): CLong =
    WaliRawLibc.syscallSysSendto(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysRecvfrom(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: Int): CLong =
    WaliRawLibc.syscallSysRecvfrom(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysSendmsg(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysSendmsg(a1, a2, a3)

public actual fun syscallSysRecvmsg(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysRecvmsg(a1, a2, a3)

public actual fun syscallSysShutdown(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysShutdown(a1, a2)

public actual fun syscallSysBind(a1: Int, a2: Int, a3: UInt): CLong =
    WaliRawLibc.syscallSysBind(a1, a2, a3)

public actual fun syscallSysListen(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysListen(a1, a2)

public actual fun syscallSysGetsockname(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysGetsockname(a1, a2, a3)

public actual fun syscallSysGetpeername(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysGetpeername(a1, a2, a3)

public actual fun syscallSysSocketpair(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    WaliRawLibc.syscallSysSocketpair(a1, a2, a3, a4)

public actual fun syscallSysSetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: UInt): CLong =
    WaliRawLibc.syscallSysSetsockopt(a1, a2, a3, a4, a5)

public actual fun syscallSysGetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    WaliRawLibc.syscallSysGetsockopt(a1, a2, a3, a4, a5)

public actual fun syscallSysFork(): CLong =
    WaliRawLibc.syscallSysFork()

public actual fun syscallSysExecve(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysExecve(a1, a2, a3)

public actual fun syscallSysExit(a1: Int): CLong =
    WaliRawLibc.syscallSysExit(a1)

public actual fun syscallSysWait4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    WaliRawLibc.syscallSysWait4(a1, a2, a3, a4)

public actual fun syscallSysKill(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysKill(a1, a2)

public actual fun syscallSysUname(a1: Int): CLong =
    WaliRawLibc.syscallSysUname(a1)

public actual fun syscallSysFcntl(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysFcntl(a1, a2, a3)

public actual fun syscallSysFlock(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysFlock(a1, a2)

public actual fun syscallSysFsync(a1: Int): CLong =
    WaliRawLibc.syscallSysFsync(a1)

public actual fun syscallSysFdatasync(a1: Int): CLong =
    WaliRawLibc.syscallSysFdatasync(a1)

public actual fun syscallSysFtruncate(a1: Int, a2: Long): CLong =
    WaliRawLibc.syscallSysFtruncate(a1, a2)

public actual fun syscallSysGetdents(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysGetdents(a1, a2, a3)

public actual fun syscallSysGetcwd(a1: Int, a2: UInt): CLong =
    WaliRawLibc.syscallSysGetcwd(a1, a2)

public actual fun syscallSysChdir(a1: Int): CLong =
    WaliRawLibc.syscallSysChdir(a1)

public actual fun syscallSysFchdir(a1: Int): CLong =
    WaliRawLibc.syscallSysFchdir(a1)

public actual fun syscallSysRename(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysRename(a1, a2)

public actual fun syscallSysMkdir(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysMkdir(a1, a2)

public actual fun syscallSysRmdir(a1: Int): CLong =
    WaliRawLibc.syscallSysRmdir(a1)

public actual fun syscallSysLink(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysLink(a1, a2)

public actual fun syscallSysUnlink(a1: Int): CLong =
    WaliRawLibc.syscallSysUnlink(a1)

public actual fun syscallSysSymlink(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysSymlink(a1, a2)

public actual fun syscallSysReadlink(a1: Int, a2: Int, a3: UInt): CLong =
    WaliRawLibc.syscallSysReadlink(a1, a2, a3)

public actual fun syscallSysChmod(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysChmod(a1, a2)

public actual fun syscallSysFchmod(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysFchmod(a1, a2)

public actual fun syscallSysChown(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysChown(a1, a2, a3)

public actual fun syscallSysFchown(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysFchown(a1, a2, a3)

public actual fun syscallSysUmask(a1: Int): CLong =
    WaliRawLibc.syscallSysUmask(a1)

public actual fun syscallSysGetrlimit(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysGetrlimit(a1, a2)

public actual fun syscallSysGetrusage(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysGetrusage(a1, a2)

public actual fun syscallSysSysinfo(a1: Int): CLong =
    WaliRawLibc.syscallSysSysinfo(a1)

public actual fun syscallSysGetuid(): CLong =
    WaliRawLibc.syscallSysGetuid()

public actual fun syscallSysGetgid(): CLong =
    WaliRawLibc.syscallSysGetgid()

public actual fun syscallSysSetuid(a1: Int): CLong =
    WaliRawLibc.syscallSysSetuid(a1)

public actual fun syscallSysSetgid(a1: Int): CLong =
    WaliRawLibc.syscallSysSetgid(a1)

public actual fun syscallSysGeteuid(): CLong =
    WaliRawLibc.syscallSysGeteuid()

public actual fun syscallSysGetegid(): CLong =
    WaliRawLibc.syscallSysGetegid()

public actual fun syscallSysSetpgid(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysSetpgid(a1, a2)

public actual fun syscallSysGetppid(): CLong =
    WaliRawLibc.syscallSysGetppid()

public actual fun syscallSysSetsid(): CLong =
    WaliRawLibc.syscallSysSetsid()

public actual fun syscallSysSetreuid(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysSetreuid(a1, a2)

public actual fun syscallSysSetregid(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysSetregid(a1, a2)

public actual fun syscallSysGetgroups(a1: UInt, a2: Int): CLong =
    WaliRawLibc.syscallSysGetgroups(a1, a2)

public actual fun syscallSysSetgroups(a1: UInt, a2: Int): CLong =
    WaliRawLibc.syscallSysSetgroups(a1, a2)

public actual fun syscallSysSetresuid(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysSetresuid(a1, a2, a3)

public actual fun syscallSysSetresgid(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysSetresgid(a1, a2, a3)

public actual fun syscallSysGetpgid(a1: Int): CLong =
    WaliRawLibc.syscallSysGetpgid(a1)

public actual fun syscallSysGetsid(a1: Int): CLong =
    WaliRawLibc.syscallSysGetsid(a1)

public actual fun syscallSysRtSigpending(a1: Int, a2: UInt): CLong =
    WaliRawLibc.syscallSysRtSigpending(a1, a2)

public actual fun syscallSysRtSigsuspend(a1: Int, a2: UInt): CLong =
    WaliRawLibc.syscallSysRtSigsuspend(a1, a2)

public actual fun syscallSysSigaltstack(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysSigaltstack(a1, a2)

public actual fun syscallSysUtime(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysUtime(a1, a2)

public actual fun syscallSysStatfs(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysStatfs(a1, a2)

public actual fun syscallSysFstatfs(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysFstatfs(a1, a2)

public actual fun syscallSysPrctl(a1: Int, a2: ULong, a3: ULong, a4: ULong, a5: ULong): CLong =
    WaliRawLibc.syscallSysPrctl(a1, a2, a3, a4, a5)

public actual fun syscallSysSetrlimit(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysSetrlimit(a1, a2)

public actual fun syscallSysChroot(a1: Int): CLong =
    WaliRawLibc.syscallSysChroot(a1)

public actual fun syscallSysGettid(): CLong =
    WaliRawLibc.syscallSysGettid()

public actual fun syscallSysTkill(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysTkill(a1, a2)

public actual fun syscallSysFutex(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    WaliRawLibc.syscallSysFutex(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysSchedGetaffinity(a1: Int, a2: UInt, a3: Int): CLong =
    WaliRawLibc.syscallSysSchedGetaffinity(a1, a2, a3)

public actual fun syscallSysGetdents64(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysGetdents64(a1, a2, a3)

public actual fun syscallSysSetTidAddress(a1: Int): CLong =
    WaliRawLibc.syscallSysSetTidAddress(a1)

public actual fun syscallSysFadvise(a1: Int, a2: Long, a3: Long, a4: Int): CLong =
    WaliRawLibc.syscallSysFadvise(a1, a2, a3, a4)

public actual fun syscallSysClockGettime(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysClockGettime(a1, a2)

public actual fun syscallSysClockGetres(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysClockGetres(a1, a2)

public actual fun syscallSysClockNanosleep(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    WaliRawLibc.syscallSysClockNanosleep(a1, a2, a3, a4)

public actual fun syscallSysExitGroup(a1: Int): CLong =
    WaliRawLibc.syscallSysExitGroup(a1)

public actual fun syscallSysEpollCtl(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    WaliRawLibc.syscallSysEpollCtl(a1, a2, a3, a4)

public actual fun syscallSysOpenat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    WaliRawLibc.syscallSysOpenat(a1, a2, a3, a4)

public actual fun syscallSysMkdirat(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysMkdirat(a1, a2, a3)

public actual fun syscallSysFchownat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    WaliRawLibc.syscallSysFchownat(a1, a2, a3, a4, a5)

public actual fun syscallSysFstatat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    WaliRawLibc.syscallSysFstatat(a1, a2, a3, a4)

public actual fun syscallSysUnlinkat(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysUnlinkat(a1, a2, a3)

public actual fun syscallSysLinkat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    WaliRawLibc.syscallSysLinkat(a1, a2, a3, a4, a5)

public actual fun syscallSysSymlinkat(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysSymlinkat(a1, a2, a3)

public actual fun syscallSysReadlinkat(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    WaliRawLibc.syscallSysReadlinkat(a1, a2, a3, a4)

public actual fun syscallSysFchmodat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    WaliRawLibc.syscallSysFchmodat(a1, a2, a3, a4)

public actual fun syscallSysFaccessat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    WaliRawLibc.syscallSysFaccessat(a1, a2, a3, a4)

public actual fun syscallSysPselect6(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    WaliRawLibc.syscallSysPselect6(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysPpoll(a1: Int, a2: UInt, a3: Int, a4: Int, a5: UInt): CLong =
    WaliRawLibc.syscallSysPpoll(a1, a2, a3, a4, a5)

public actual fun syscallSysUtimensat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    WaliRawLibc.syscallSysUtimensat(a1, a2, a3, a4)

public actual fun syscallSysEpollPwait(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: UInt): CLong =
    WaliRawLibc.syscallSysEpollPwait(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysEventfd(a1: Int): CLong =
    WaliRawLibc.syscallSysEventfd(a1)

public actual fun syscallSysAccept4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    WaliRawLibc.syscallSysAccept4(a1, a2, a3, a4)

public actual fun syscallSysEventfd2(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysEventfd2(a1, a2)

public actual fun syscallSysEpollCreate1(a1: Int): CLong =
    WaliRawLibc.syscallSysEpollCreate1(a1)

public actual fun syscallSysDup3(a1: Int, a2: Int, a3: Int): CLong =
    WaliRawLibc.syscallSysDup3(a1, a2, a3)

public actual fun syscallSysPipe2(a1: Int, a2: Int): CLong =
    WaliRawLibc.syscallSysPipe2(a1, a2)

public actual fun syscallSysPrlimit64(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    WaliRawLibc.syscallSysPrlimit64(a1, a2, a3, a4)

public actual fun syscallSysRenameat2(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    WaliRawLibc.syscallSysRenameat2(a1, a2, a3, a4, a5)

public actual fun syscallSysGetrandom(a1: Int, a2: UInt, a3: Int): CLong =
    WaliRawLibc.syscallSysGetrandom(a1, a2, a3)

public actual fun syscallSysStatx(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    WaliRawLibc.syscallSysStatx(a1, a2, a3, a4, a5)

public actual fun syscallSysFaccessat2(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    WaliRawLibc.syscallSysFaccessat2(a1, a2, a3, a4)
