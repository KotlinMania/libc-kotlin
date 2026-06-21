// port-lint: source unix/linux_like/linux/musl/b64/wasm32/wali.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32

import io.github.kotlinmania.libc.*

/**
 * WALI (WebAssembly Linux Interface) raw syscall shims.
 */

public expect fun syscallSysRead(a1: Int, a2: Int, a3: UInt): CLong
public expect fun syscallSysWrite(a1: Int, a2: Int, a3: UInt): CLong
public expect fun syscallSysOpen(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysClose(a1: Int): CLong
public expect fun syscallSysStat(a1: Int, a2: Int): CLong
public expect fun syscallSysFstat(a1: Int, a2: Int): CLong
public expect fun syscallSysLstat(a1: Int, a2: Int): CLong
public expect fun syscallSysPoll(a1: Int, a2: UInt, a3: Int): CLong
public expect fun syscallSysLseek(a1: Int, a2: Long, a3: Int): CLong
public expect fun syscallSysMmap(a1: Int, a2: UInt, a3: Int, a4: Int, a5: Int, a6: Long): CLong
public expect fun syscallSysMprotect(a1: Int, a2: UInt, a3: Int): CLong
public expect fun syscallSysMunmap(a1: Int, a2: UInt): CLong
public expect fun syscallSysBrk(a1: Int): CLong
public expect fun syscallSysRtSigaction(a1: Int, a2: Int, a3: Int, a4: UInt): CLong
public expect fun syscallSysRtSigprocmask(a1: Int, a2: Int, a3: Int, a4: UInt): CLong
public expect fun syscallSysRtSigreturn(a1: Long): CLong
public expect fun syscallSysIoctl(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysPread64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong
public expect fun syscallSysPwrite64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong
public expect fun syscallSysReadv(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysWritev(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysAccess(a1: Int, a2: Int): CLong
public expect fun syscallSysPipe(a1: Int): CLong
public expect fun syscallSysSelect(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong
public expect fun syscallSysSchedYield(): CLong
public expect fun syscallSysMremap(a1: Int, a2: UInt, a3: UInt, a4: Int, a5: Int): CLong
public expect fun syscallSysMsync(a1: Int, a2: UInt, a3: Int): CLong
public expect fun syscallSysMadvise(a1: Int, a2: UInt, a3: Int): CLong
public expect fun syscallSysDup(a1: Int): CLong
public expect fun syscallSysDup2(a1: Int, a2: Int): CLong
public expect fun syscallSysNanosleep(a1: Int, a2: Int): CLong
public expect fun syscallSysAlarm(a1: Int): CLong
public expect fun syscallSysSetitimer(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysGetpid(): CLong
public expect fun syscallSysSocket(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysConnect(a1: Int, a2: Int, a3: UInt): CLong
public expect fun syscallSysAccept(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysSendto(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: UInt): CLong
public expect fun syscallSysRecvfrom(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: Int): CLong
public expect fun syscallSysSendmsg(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysRecvmsg(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysShutdown(a1: Int, a2: Int): CLong
public expect fun syscallSysBind(a1: Int, a2: Int, a3: UInt): CLong
public expect fun syscallSysListen(a1: Int, a2: Int): CLong
public expect fun syscallSysGetsockname(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysGetpeername(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysSocketpair(a1: Int, a2: Int, a3: Int, a4: Int): CLong
public expect fun syscallSysSetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: UInt): CLong
public expect fun syscallSysGetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong
public expect fun syscallSysFork(): CLong
public expect fun syscallSysExecve(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysExit(a1: Int): CLong
public expect fun syscallSysWait4(a1: Int, a2: Int, a3: Int, a4: Int): CLong
public expect fun syscallSysKill(a1: Int, a2: Int): CLong
public expect fun syscallSysUname(a1: Int): CLong
public expect fun syscallSysFcntl(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysFlock(a1: Int, a2: Int): CLong
public expect fun syscallSysFsync(a1: Int): CLong
public expect fun syscallSysFdatasync(a1: Int): CLong
public expect fun syscallSysFtruncate(a1: Int, a2: Long): CLong
public expect fun syscallSysGetdents(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysGetcwd(a1: Int, a2: UInt): CLong
public expect fun syscallSysChdir(a1: Int): CLong
public expect fun syscallSysFchdir(a1: Int): CLong
public expect fun syscallSysRename(a1: Int, a2: Int): CLong
public expect fun syscallSysMkdir(a1: Int, a2: Int): CLong
public expect fun syscallSysRmdir(a1: Int): CLong
public expect fun syscallSysLink(a1: Int, a2: Int): CLong
public expect fun syscallSysUnlink(a1: Int): CLong
public expect fun syscallSysSymlink(a1: Int, a2: Int): CLong
public expect fun syscallSysReadlink(a1: Int, a2: Int, a3: UInt): CLong
public expect fun syscallSysChmod(a1: Int, a2: Int): CLong
public expect fun syscallSysFchmod(a1: Int, a2: Int): CLong
public expect fun syscallSysChown(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysFchown(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysUmask(a1: Int): CLong
public expect fun syscallSysGetrlimit(a1: Int, a2: Int): CLong
public expect fun syscallSysGetrusage(a1: Int, a2: Int): CLong
public expect fun syscallSysSysinfo(a1: Int): CLong
public expect fun syscallSysGetuid(): CLong
public expect fun syscallSysGetgid(): CLong
public expect fun syscallSysSetuid(a1: Int): CLong
public expect fun syscallSysSetgid(a1: Int): CLong
public expect fun syscallSysGeteuid(): CLong
public expect fun syscallSysGetegid(): CLong
public expect fun syscallSysSetpgid(a1: Int, a2: Int): CLong
public expect fun syscallSysGetppid(): CLong
public expect fun syscallSysSetsid(): CLong
public expect fun syscallSysSetreuid(a1: Int, a2: Int): CLong
public expect fun syscallSysSetregid(a1: Int, a2: Int): CLong
public expect fun syscallSysGetgroups(a1: UInt, a2: Int): CLong
public expect fun syscallSysSetgroups(a1: UInt, a2: Int): CLong
public expect fun syscallSysSetresuid(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysSetresgid(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysGetpgid(a1: Int): CLong
public expect fun syscallSysGetsid(a1: Int): CLong
public expect fun syscallSysRtSigpending(a1: Int, a2: UInt): CLong
public expect fun syscallSysRtSigsuspend(a1: Int, a2: UInt): CLong
public expect fun syscallSysSigaltstack(a1: Int, a2: Int): CLong
public expect fun syscallSysUtime(a1: Int, a2: Int): CLong
public expect fun syscallSysStatfs(a1: Int, a2: Int): CLong
public expect fun syscallSysFstatfs(a1: Int, a2: Int): CLong
public expect fun syscallSysPrctl(a1: Int, a2: ULong, a3: ULong, a4: ULong, a5: ULong): CLong
public expect fun syscallSysSetrlimit(a1: Int, a2: Int): CLong
public expect fun syscallSysChroot(a1: Int): CLong
public expect fun syscallSysGettid(): CLong
public expect fun syscallSysTkill(a1: Int, a2: Int): CLong
public expect fun syscallSysFutex(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong
public expect fun syscallSysSchedGetaffinity(a1: Int, a2: UInt, a3: Int): CLong
public expect fun syscallSysGetdents64(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysSetTidAddress(a1: Int): CLong
public expect fun syscallSysFadvise(a1: Int, a2: Long, a3: Long, a4: Int): CLong
public expect fun syscallSysClockGettime(a1: Int, a2: Int): CLong
public expect fun syscallSysClockGetres(a1: Int, a2: Int): CLong
public expect fun syscallSysClockNanosleep(a1: Int, a2: Int, a3: Int, a4: Int): CLong
public expect fun syscallSysExitGroup(a1: Int): CLong
public expect fun syscallSysEpollCtl(a1: Int, a2: Int, a3: Int, a4: Int): CLong
public expect fun syscallSysOpenat(a1: Int, a2: Int, a3: Int, a4: Int): CLong
public expect fun syscallSysMkdirat(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysFchownat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong
public expect fun syscallSysFstatat(a1: Int, a2: Int, a3: Int, a4: Int): CLong
public expect fun syscallSysUnlinkat(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysLinkat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong
public expect fun syscallSysSymlinkat(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysReadlinkat(a1: Int, a2: Int, a3: Int, a4: UInt): CLong
public expect fun syscallSysFchmodat(a1: Int, a2: Int, a3: Int, a4: Int): CLong
public expect fun syscallSysFaccessat(a1: Int, a2: Int, a3: Int, a4: Int): CLong
public expect fun syscallSysPselect6(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong
public expect fun syscallSysPpoll(a1: Int, a2: UInt, a3: Int, a4: Int, a5: UInt): CLong
public expect fun syscallSysUtimensat(a1: Int, a2: Int, a3: Int, a4: Int): CLong
public expect fun syscallSysEpollPwait(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: UInt, ): CLong
public expect fun syscallSysEventfd(a1: Int): CLong
public expect fun syscallSysAccept4(a1: Int, a2: Int, a3: Int, a4: Int): CLong
public expect fun syscallSysEventfd2(a1: Int, a2: Int): CLong
public expect fun syscallSysEpollCreate1(a1: Int): CLong
public expect fun syscallSysDup3(a1: Int, a2: Int, a3: Int): CLong
public expect fun syscallSysPipe2(a1: Int, a2: Int): CLong
public expect fun syscallSysPrlimit64(a1: Int, a2: Int, a3: Int, a4: Int): CLong
public expect fun syscallSysRenameat2(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong
public expect fun syscallSysGetrandom(a1: Int, a2: UInt, a3: Int): CLong
public expect fun syscallSysStatx(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong
public expect fun syscallSysFaccessat2(a1: Int, a2: Int, a3: Int, a4: Int): CLong
