package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32

import io.github.kotlinmania.libc.COpaquePointer

public actual fun syscallSysRead(a1: Int, a2: Int, a3: UInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysRead(a1, a2, a3)") as CLong

public actual fun syscallSysWrite(a1: Int, a2: Int, a3: UInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysWrite(a1, a2, a3)") as CLong

public actual fun syscallSysOpen(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysOpen(a1, a2, a3)") as CLong

public actual fun syscallSysClose(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysClose(a1)") as CLong

public actual fun syscallSysStat(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysStat(a1, a2)") as CLong

public actual fun syscallSysFstat(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysFstat(a1, a2)") as CLong

public actual fun syscallSysLstat(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysLstat(a1, a2)") as CLong

public actual fun syscallSysPoll(a1: Int, a2: UInt, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysPoll(a1, a2, a3)") as CLong

public actual fun syscallSysLseek(a1: Int, a2: Long, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysLseek(a1, a2, a3)") as CLong

public actual fun syscallSysMmap(a1: Int, a2: UInt, a3: Int, a4: Int, a5: Int, a6: Long): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysMmap(a1, a2, a3, a4, a5, a6)") as CLong

public actual fun syscallSysMprotect(a1: Int, a2: UInt, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysMprotect(a1, a2, a3)") as CLong

public actual fun syscallSysMunmap(a1: Int, a2: UInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysMunmap(a1, a2)") as CLong

public actual fun syscallSysBrk(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysBrk(a1)") as CLong

public actual fun syscallSysRtSigaction(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysRtSigaction(a1, a2, a3, a4)") as CLong

public actual fun syscallSysRtSigprocmask(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysRtSigprocmask(a1, a2, a3, a4)") as CLong

public actual fun syscallSysRtSigreturn(a1: Long): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysRtSigreturn(a1)") as CLong

public actual fun syscallSysIoctl(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysIoctl(a1, a2, a3)") as CLong

public actual fun syscallSysPread64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysPread64(a1, a2, a3, a4)") as CLong

public actual fun syscallSysPwrite64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysPwrite64(a1, a2, a3, a4)") as CLong

public actual fun syscallSysReadv(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysReadv(a1, a2, a3)") as CLong

public actual fun syscallSysWritev(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysWritev(a1, a2, a3)") as CLong

public actual fun syscallSysAccess(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysAccess(a1, a2)") as CLong

public actual fun syscallSysPipe(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysPipe(a1)") as CLong

public actual fun syscallSysSelect(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSelect(a1, a2, a3, a4, a5)") as CLong

public actual fun syscallSysSchedYield(): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSchedYield()") as CLong

public actual fun syscallSysMremap(a1: Int, a2: UInt, a3: UInt, a4: Int, a5: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysMremap(a1, a2, a3, a4, a5)") as CLong

public actual fun syscallSysMsync(a1: Int, a2: UInt, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysMsync(a1, a2, a3)") as CLong

public actual fun syscallSysMadvise(a1: Int, a2: UInt, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysMadvise(a1, a2, a3)") as CLong

public actual fun syscallSysDup(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysDup(a1)") as CLong

public actual fun syscallSysDup2(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysDup2(a1, a2)") as CLong

public actual fun syscallSysNanosleep(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysNanosleep(a1, a2)") as CLong

public actual fun syscallSysAlarm(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysAlarm(a1)") as CLong

public actual fun syscallSysSetitimer(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSetitimer(a1, a2, a3)") as CLong

public actual fun syscallSysGetpid(): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGetpid()") as CLong

public actual fun syscallSysSocket(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSocket(a1, a2, a3)") as CLong

public actual fun syscallSysConnect(a1: Int, a2: Int, a3: UInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysConnect(a1, a2, a3)") as CLong

public actual fun syscallSysAccept(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysAccept(a1, a2, a3)") as CLong

public actual fun syscallSysSendto(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: UInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSendto(a1, a2, a3, a4, a5, a6)") as CLong

public actual fun syscallSysRecvfrom(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysRecvfrom(a1, a2, a3, a4, a5, a6)") as CLong

public actual fun syscallSysSendmsg(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSendmsg(a1, a2, a3)") as CLong

public actual fun syscallSysRecvmsg(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysRecvmsg(a1, a2, a3)") as CLong

public actual fun syscallSysShutdown(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysShutdown(a1, a2)") as CLong

public actual fun syscallSysBind(a1: Int, a2: Int, a3: UInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysBind(a1, a2, a3)") as CLong

public actual fun syscallSysListen(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysListen(a1, a2)") as CLong

public actual fun syscallSysGetsockname(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGetsockname(a1, a2, a3)") as CLong

public actual fun syscallSysGetpeername(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGetpeername(a1, a2, a3)") as CLong

public actual fun syscallSysSocketpair(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSocketpair(a1, a2, a3, a4)") as CLong

public actual fun syscallSysSetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: UInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSetsockopt(a1, a2, a3, a4, a5)") as CLong

public actual fun syscallSysGetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGetsockopt(a1, a2, a3, a4, a5)") as CLong

public actual fun syscallSysFork(): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysFork()") as CLong

public actual fun syscallSysExecve(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysExecve(a1, a2, a3)") as CLong

public actual fun syscallSysExit(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysExit(a1)") as CLong

public actual fun syscallSysWait4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysWait4(a1, a2, a3, a4)") as CLong

public actual fun syscallSysKill(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysKill(a1, a2)") as CLong

public actual fun syscallSysUname(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysUname(a1)") as CLong

public actual fun syscallSysFcntl(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysFcntl(a1, a2, a3)") as CLong

public actual fun syscallSysFlock(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysFlock(a1, a2)") as CLong

public actual fun syscallSysFsync(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysFsync(a1)") as CLong

public actual fun syscallSysFdatasync(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysFdatasync(a1)") as CLong

public actual fun syscallSysFtruncate(a1: Int, a2: Long): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysFtruncate(a1, a2)") as CLong

public actual fun syscallSysGetdents(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGetdents(a1, a2, a3)") as CLong

public actual fun syscallSysGetcwd(a1: Int, a2: UInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGetcwd(a1, a2)") as CLong

public actual fun syscallSysChdir(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysChdir(a1)") as CLong

public actual fun syscallSysFchdir(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysFchdir(a1)") as CLong

public actual fun syscallSysRename(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysRename(a1, a2)") as CLong

public actual fun syscallSysMkdir(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysMkdir(a1, a2)") as CLong

public actual fun syscallSysRmdir(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysRmdir(a1)") as CLong

public actual fun syscallSysLink(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysLink(a1, a2)") as CLong

public actual fun syscallSysUnlink(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysUnlink(a1)") as CLong

public actual fun syscallSysSymlink(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSymlink(a1, a2)") as CLong

public actual fun syscallSysReadlink(a1: Int, a2: Int, a3: UInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysReadlink(a1, a2, a3)") as CLong

public actual fun syscallSysChmod(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysChmod(a1, a2)") as CLong

public actual fun syscallSysFchmod(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysFchmod(a1, a2)") as CLong

public actual fun syscallSysChown(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysChown(a1, a2, a3)") as CLong

public actual fun syscallSysFchown(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysFchown(a1, a2, a3)") as CLong

public actual fun syscallSysUmask(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysUmask(a1)") as CLong

public actual fun syscallSysGetrlimit(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGetrlimit(a1, a2)") as CLong

public actual fun syscallSysGetrusage(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGetrusage(a1, a2)") as CLong

public actual fun syscallSysSysinfo(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSysinfo(a1)") as CLong

public actual fun syscallSysGetuid(): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGetuid()") as CLong

public actual fun syscallSysGetgid(): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGetgid()") as CLong

public actual fun syscallSysSetuid(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSetuid(a1)") as CLong

public actual fun syscallSysSetgid(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSetgid(a1)") as CLong

public actual fun syscallSysGeteuid(): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGeteuid()") as CLong

public actual fun syscallSysGetegid(): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGetegid()") as CLong

public actual fun syscallSysSetpgid(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSetpgid(a1, a2)") as CLong

public actual fun syscallSysGetppid(): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGetppid()") as CLong

public actual fun syscallSysSetsid(): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSetsid()") as CLong

public actual fun syscallSysSetreuid(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSetreuid(a1, a2)") as CLong

public actual fun syscallSysSetregid(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSetregid(a1, a2)") as CLong

public actual fun syscallSysGetgroups(a1: UInt, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGetgroups(a1, a2)") as CLong

public actual fun syscallSysSetgroups(a1: UInt, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSetgroups(a1, a2)") as CLong

public actual fun syscallSysSetresuid(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSetresuid(a1, a2, a3)") as CLong

public actual fun syscallSysSetresgid(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSetresgid(a1, a2, a3)") as CLong

public actual fun syscallSysGetpgid(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGetpgid(a1)") as CLong

public actual fun syscallSysGetsid(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGetsid(a1)") as CLong

public actual fun syscallSysRtSigpending(a1: Int, a2: UInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysRtSigpending(a1, a2)") as CLong

public actual fun syscallSysRtSigsuspend(a1: Int, a2: UInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysRtSigsuspend(a1, a2)") as CLong

public actual fun syscallSysSigaltstack(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSigaltstack(a1, a2)") as CLong

public actual fun syscallSysUtime(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysUtime(a1, a2)") as CLong

public actual fun syscallSysStatfs(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysStatfs(a1, a2)") as CLong

public actual fun syscallSysFstatfs(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysFstatfs(a1, a2)") as CLong

public actual fun syscallSysPrctl(a1: Int, a2: ULong, a3: ULong, a4: ULong, a5: ULong): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysPrctl(a1, a2, a3, a4, a5)") as CLong

public actual fun syscallSysSetrlimit(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSetrlimit(a1, a2)") as CLong

public actual fun syscallSysChroot(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysChroot(a1)") as CLong

public actual fun syscallSysGettid(): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGettid()") as CLong

public actual fun syscallSysTkill(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysTkill(a1, a2)") as CLong

public actual fun syscallSysFutex(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysFutex(a1, a2, a3, a4, a5, a6)") as CLong

public actual fun syscallSysSchedGetaffinity(a1: Int, a2: UInt, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSchedGetaffinity(a1, a2, a3)") as CLong

public actual fun syscallSysGetdents64(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGetdents64(a1, a2, a3)") as CLong

public actual fun syscallSysSetTidAddress(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSetTidAddress(a1)") as CLong

public actual fun syscallSysFadvise(a1: Int, a2: Long, a3: Long, a4: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysFadvise(a1, a2, a3, a4)") as CLong

public actual fun syscallSysClockGettime(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysClockGettime(a1, a2)") as CLong

public actual fun syscallSysClockGetres(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysClockGetres(a1, a2)") as CLong

public actual fun syscallSysClockNanosleep(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysClockNanosleep(a1, a2, a3, a4)") as CLong

public actual fun syscallSysExitGroup(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysExitGroup(a1)") as CLong

public actual fun syscallSysEpollCtl(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysEpollCtl(a1, a2, a3, a4)") as CLong

public actual fun syscallSysOpenat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysOpenat(a1, a2, a3, a4)") as CLong

public actual fun syscallSysMkdirat(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysMkdirat(a1, a2, a3)") as CLong

public actual fun syscallSysFchownat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysFchownat(a1, a2, a3, a4, a5)") as CLong

public actual fun syscallSysFstatat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysFstatat(a1, a2, a3, a4)") as CLong

public actual fun syscallSysUnlinkat(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysUnlinkat(a1, a2, a3)") as CLong

public actual fun syscallSysLinkat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysLinkat(a1, a2, a3, a4, a5)") as CLong

public actual fun syscallSysSymlinkat(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysSymlinkat(a1, a2, a3)") as CLong

public actual fun syscallSysReadlinkat(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysReadlinkat(a1, a2, a3, a4)") as CLong

public actual fun syscallSysFchmodat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysFchmodat(a1, a2, a3, a4)") as CLong

public actual fun syscallSysFaccessat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysFaccessat(a1, a2, a3, a4)") as CLong

public actual fun syscallSysPselect6(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysPselect6(a1, a2, a3, a4, a5, a6)") as CLong

public actual fun syscallSysPpoll(a1: Int, a2: UInt, a3: Int, a4: Int, a5: UInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysPpoll(a1, a2, a3, a4, a5)") as CLong

public actual fun syscallSysUtimensat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysUtimensat(a1, a2, a3, a4)") as CLong

public actual fun syscallSysEpollPwait(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: UInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysEpollPwait(a1, a2, a3, a4, a5, a6)") as CLong

public actual fun syscallSysEventfd(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysEventfd(a1)") as CLong

public actual fun syscallSysAccept4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysAccept4(a1, a2, a3, a4)") as CLong

public actual fun syscallSysEventfd2(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysEventfd2(a1, a2)") as CLong

public actual fun syscallSysEpollCreate1(a1: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysEpollCreate1(a1)") as CLong

public actual fun syscallSysDup3(a1: Int, a2: Int, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysDup3(a1, a2, a3)") as CLong

public actual fun syscallSysPipe2(a1: Int, a2: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysPipe2(a1, a2)") as CLong

public actual fun syscallSysPrlimit64(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysPrlimit64(a1, a2, a3, a4)") as CLong

public actual fun syscallSysRenameat2(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysRenameat2(a1, a2, a3, a4, a5)") as CLong

public actual fun syscallSysGetrandom(a1: Int, a2: UInt, a3: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysGetrandom(a1, a2, a3)") as CLong

public actual fun syscallSysStatx(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysStatx(a1, a2, a3, a4, a5)") as CLong

public actual fun syscallSysFaccessat2(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    js("require('@kotlinmania/libc-native-bindings').syscallSysFaccessat2(a1, a2, a3, a4)") as CLong
