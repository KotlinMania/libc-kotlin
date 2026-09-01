// port-lint: source unix/linux_like/linux/musl/b64/wasm32/wali.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32

import io.github.kotlinmania.libc.*

public fun syscallSYSRead(a1: Int, a2: Int, a3: UInt): CLong = -1L

public fun syscallSYSWrite(a1: Int, a2: Int, a3: UInt): CLong = -1L

public fun syscallSYSOpen(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSClose(a1: Int): CLong = -1L

public fun syscallSYSStat(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSFstat(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSLstat(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSPoll(a1: Int, a2: UInt, a3: Int): CLong = -1L

public fun syscallSYSLseek(a1: Int, a2: Long, a3: Int): CLong = -1L

public fun syscallSYSMmap(a1: Int, a2: UInt, a3: Int, a4: Int, a5: Int, a6: Long): CLong = -1L

public fun syscallSYSMprotect(a1: Int, a2: UInt, a3: Int): CLong = -1L

public fun syscallSYSMunmap(a1: Int, a2: UInt): CLong = -1L

public fun syscallSYSBrk(a1: Int): CLong = -1L

public fun syscallSYSRtSigaction(a1: Int, a2: Int, a3: Int, a4: UInt): CLong = -1L

public fun syscallSYSRtSigprocmask(a1: Int, a2: Int, a3: Int, a4: UInt): CLong = -1L

public fun syscallSYSRtSigreturn(a1: Long): CLong = -1L

public fun syscallSYSIoctl(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSPread64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong = -1L

public fun syscallSYSPwrite64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong = -1L

public fun syscallSYSReadv(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSWritev(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSAccess(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSPipe(a1: Int): CLong = -1L

public fun syscallSYSSelect(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong = -1L

public fun syscallSYSSchedYield(): CLong = -1L

public fun syscallSYSMremap(a1: Int, a2: UInt, a3: UInt, a4: Int, a5: Int): CLong = -1L

public fun syscallSYSMsync(a1: Int, a2: UInt, a3: Int): CLong = -1L

public fun syscallSYSMadvise(a1: Int, a2: UInt, a3: Int): CLong = -1L

public fun syscallSYSDup(a1: Int): CLong = -1L

public fun syscallSYSDup2(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSNanosleep(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSAlarm(a1: Int): CLong = -1L

public fun syscallSYSSetitimer(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSGetpid(): CLong = -1L

public fun syscallSYSSocket(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSConnect(a1: Int, a2: Int, a3: UInt): CLong = -1L

public fun syscallSYSAccept(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSSendto(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: UInt): CLong = -1L

public fun syscallSYSRecvfrom(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: Int): CLong = -1L

public fun syscallSYSSendmsg(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSRecvmsg(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSShutdown(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSBind(a1: Int, a2: Int, a3: UInt): CLong = -1L

public fun syscallSYSListen(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSGetsockname(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSGetpeername(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSSocketpair(a1: Int, a2: Int, a3: Int, a4: Int): CLong = -1L

public fun syscallSYSSetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: UInt): CLong = -1L

public fun syscallSYSGetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong = -1L

public fun syscallSYSFork(): CLong = -1L

public fun syscallSYSExecve(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSExit(a1: Int): CLong = -1L

public fun syscallSYSWait4(a1: Int, a2: Int, a3: Int, a4: Int): CLong = -1L

public fun syscallSYSKill(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSUname(a1: Int): CLong = -1L

public fun syscallSYSFcntl(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSFlock(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSFsync(a1: Int): CLong = -1L

public fun syscallSYSFdatasync(a1: Int): CLong = -1L

public fun syscallSYSFtruncate(a1: Int, a2: Long): CLong = -1L

public fun syscallSYSGetdents(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSGetcwd(a1: Int, a2: UInt): CLong = -1L

public fun syscallSYSChdir(a1: Int): CLong = -1L

public fun syscallSYSFchdir(a1: Int): CLong = -1L

public fun syscallSYSRename(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSMkdir(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSRmdir(a1: Int): CLong = -1L

public fun syscallSYSLink(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSUnlink(a1: Int): CLong = -1L

public fun syscallSYSSymlink(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSReadlink(a1: Int, a2: Int, a3: UInt): CLong = -1L

public fun syscallSYSChmod(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSFchmod(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSChown(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSFchown(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSUmask(a1: Int): CLong = -1L

public fun syscallSYSGetrlimit(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSGetrusage(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSSysinfo(a1: Int): CLong = -1L

public fun syscallSYSGetuid(): CLong = -1L

public fun syscallSYSGetgid(): CLong = -1L

public fun syscallSYSSetuid(a1: Int): CLong = -1L

public fun syscallSYSSetgid(a1: Int): CLong = -1L

public fun syscallSYSGeteuid(): CLong = -1L

public fun syscallSYSGetegid(): CLong = -1L

public fun syscallSYSSetpgid(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSGetppid(): CLong = -1L

public fun syscallSYSSetsid(): CLong = -1L

public fun syscallSYSSetreuid(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSSetregid(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSGetgroups(a1: UInt, a2: Int): CLong = -1L

public fun syscallSYSSetgroups(a1: UInt, a2: Int): CLong = -1L

public fun syscallSYSSetresuid(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSSetresgid(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSGetpgid(a1: Int): CLong = -1L

public fun syscallSYSGetsid(a1: Int): CLong = -1L

public fun syscallSYSRtSigpending(a1: Int, a2: UInt): CLong = -1L

public fun syscallSYSRtSigsuspend(a1: Int, a2: UInt): CLong = -1L

public fun syscallSYSSigaltstack(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSUtime(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSStatfs(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSFstatfs(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSPrctl(a1: Int, a2: ULong, a3: ULong, a4: ULong, a5: ULong): CLong = -1L

public fun syscallSYSSetrlimit(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSChroot(a1: Int): CLong = -1L

public fun syscallSYSGettid(): CLong = -1L

public fun syscallSYSTkill(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSFutex(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong = -1L

public fun syscallSYSSchedGetaffinity(a1: Int, a2: UInt, a3: Int): CLong = -1L

public fun syscallSYSGetdents64(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSSetTidAddress(a1: Int): CLong = -1L

public fun syscallSYSFadvise(a1: Int, a2: Long, a3: Long, a4: Int): CLong = -1L

public fun syscallSYSClockGettime(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSClockGetres(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSClockNanosleep(a1: Int, a2: Int, a3: Int, a4: Int): CLong = -1L

public fun syscallSYSExitGroup(a1: Int): CLong = -1L

public fun syscallSYSEpollCtl(a1: Int, a2: Int, a3: Int, a4: Int): CLong = -1L

public fun syscallSYSOpenat(a1: Int, a2: Int, a3: Int, a4: Int): CLong = -1L

public fun syscallSYSMkdirat(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSFchownat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong = -1L

public fun syscallSYSFstatat(a1: Int, a2: Int, a3: Int, a4: Int): CLong = -1L

public fun syscallSYSUnlinkat(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSLinkat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong = -1L

public fun syscallSYSSymlinkat(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSReadlinkat(a1: Int, a2: Int, a3: Int, a4: UInt): CLong = -1L

public fun syscallSYSFchmodat(a1: Int, a2: Int, a3: Int, a4: Int): CLong = -1L

public fun syscallSYSFaccessat(a1: Int, a2: Int, a3: Int, a4: Int): CLong = -1L

public fun syscallSYSPselect6(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong = -1L

public fun syscallSYSPpoll(a1: Int, a2: UInt, a3: Int, a4: Int, a5: UInt): CLong = -1L

public fun syscallSYSUtimensat(a1: Int, a2: Int, a3: Int, a4: Int): CLong = -1L

public fun syscallSYSEpollPwait(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: UInt): CLong = -1L

public fun syscallSYSEventfd(a1: Int): CLong = -1L

public fun syscallSYSAccept4(a1: Int, a2: Int, a3: Int, a4: Int): CLong = -1L

public fun syscallSYSEventfd2(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSEpollCreate1(a1: Int): CLong = -1L

public fun syscallSYSDup3(a1: Int, a2: Int, a3: Int): CLong = -1L

public fun syscallSYSPipe2(a1: Int, a2: Int): CLong = -1L

public fun syscallSYSPrlimit64(a1: Int, a2: Int, a3: Int, a4: Int): CLong = -1L

public fun syscallSYSRenameat2(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong = -1L

public fun syscallSYSGetrandom(a1: Int, a2: UInt, a3: Int): CLong = -1L

public fun syscallSYSStatx(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong = -1L

public fun syscallSYSFaccessat2(a1: Int, a2: Int, a3: Int, a4: Int): CLong = -1L
