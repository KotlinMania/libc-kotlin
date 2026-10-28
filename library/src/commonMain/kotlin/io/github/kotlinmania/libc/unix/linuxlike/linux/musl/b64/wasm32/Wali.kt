// port-lint: source unix/linux_like/linux/musl/b64/wasm32/wali.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32

import io.github.kotlinmania.libc.*

public expect fun syscallSYSRead(a1: Int, a2: Int, a3: UInt): Long

public expect fun syscallSYSWrite(a1: Int, a2: Int, a3: UInt): Long

public expect fun syscallSYSOpen(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSClose(a1: Int): Long

public expect fun syscallSYSStat(a1: Int, a2: Int): Long

public expect fun syscallSYSFstat(a1: Int, a2: Int): Long

public expect fun syscallSYSLstat(a1: Int, a2: Int): Long

public expect fun syscallSYSPoll(a1: Int, a2: UInt, a3: Int): Long

public expect fun syscallSYSLseek(a1: Int, a2: Long, a3: Int): Long

public expect fun syscallSYSMmap(a1: Int, a2: UInt, a3: Int, a4: Int, a5: Int, a6: Long): Long

public expect fun syscallSYSMprotect(a1: Int, a2: UInt, a3: Int): Long

public expect fun syscallSYSMunmap(a1: Int, a2: UInt): Long

public expect fun syscallSYSBrk(a1: Int): Long

public expect fun syscallSYSRtSigaction(a1: Int, a2: Int, a3: Int, a4: UInt): Long

public expect fun syscallSYSRtSigprocmask(a1: Int, a2: Int, a3: Int, a4: UInt): Long

public expect fun syscallSYSRtSigreturn(a1: Long): Long

public expect fun syscallSYSIoctl(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSPread64(a1: Int, a2: Int, a3: UInt, a4: Long): Long

public expect fun syscallSYSPwrite64(a1: Int, a2: Int, a3: UInt, a4: Long): Long

public expect fun syscallSYSReadv(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSWritev(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSAccess(a1: Int, a2: Int): Long

public expect fun syscallSYSPipe(a1: Int): Long

public expect fun syscallSYSSelect(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long

public expect fun syscallSYSSchedYield(): Long

public expect fun syscallSYSMremap(a1: Int, a2: UInt, a3: UInt, a4: Int, a5: Int): Long

public expect fun syscallSYSMsync(a1: Int, a2: UInt, a3: Int): Long

public expect fun syscallSYSMadvise(a1: Int, a2: UInt, a3: Int): Long

public expect fun syscallSYSDup(a1: Int): Long

public expect fun syscallSYSDup2(a1: Int, a2: Int): Long

public expect fun syscallSYSNanosleep(a1: Int, a2: Int): Long

public expect fun syscallSYSAlarm(a1: Int): Long

public expect fun syscallSYSSetitimer(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSGetpid(): Long

public expect fun syscallSYSSocket(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSConnect(a1: Int, a2: Int, a3: UInt): Long

public expect fun syscallSYSAccept(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSSendto(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: UInt): Long

public expect fun syscallSYSRecvfrom(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: Int): Long

public expect fun syscallSYSSendmsg(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSRecvmsg(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSShutdown(a1: Int, a2: Int): Long

public expect fun syscallSYSBind(a1: Int, a2: Int, a3: UInt): Long

public expect fun syscallSYSListen(a1: Int, a2: Int): Long

public expect fun syscallSYSGetsockname(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSGetpeername(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSSocketpair(a1: Int, a2: Int, a3: Int, a4: Int): Long

public expect fun syscallSYSSetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: UInt): Long

public expect fun syscallSYSGetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long

public expect fun syscallSYSFork(): Long

public expect fun syscallSYSExecve(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSExit(a1: Int): Long

public expect fun syscallSYSWait4(a1: Int, a2: Int, a3: Int, a4: Int): Long

public expect fun syscallSYSKill(a1: Int, a2: Int): Long

public expect fun syscallSYSUname(a1: Int): Long

public expect fun syscallSYSFcntl(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSFlock(a1: Int, a2: Int): Long

public expect fun syscallSYSFsync(a1: Int): Long

public expect fun syscallSYSFdatasync(a1: Int): Long

public expect fun syscallSYSFtruncate(a1: Int, a2: Long): Long

public expect fun syscallSYSGetdents(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSGetcwd(a1: Int, a2: UInt): Long

public expect fun syscallSYSChdir(a1: Int): Long

public expect fun syscallSYSFchdir(a1: Int): Long

public expect fun syscallSYSRename(a1: Int, a2: Int): Long

public expect fun syscallSYSMkdir(a1: Int, a2: Int): Long

public expect fun syscallSYSRmdir(a1: Int): Long

public expect fun syscallSYSLink(a1: Int, a2: Int): Long

public expect fun syscallSYSUnlink(a1: Int): Long

public expect fun syscallSYSSymlink(a1: Int, a2: Int): Long

public expect fun syscallSYSReadlink(a1: Int, a2: Int, a3: UInt): Long

public expect fun syscallSYSChmod(a1: Int, a2: Int): Long

public expect fun syscallSYSFchmod(a1: Int, a2: Int): Long

public expect fun syscallSYSChown(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSFchown(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSUmask(a1: Int): Long

public expect fun syscallSYSGetrlimit(a1: Int, a2: Int): Long

public expect fun syscallSYSGetrusage(a1: Int, a2: Int): Long

public expect fun syscallSYSSysinfo(a1: Int): Long

public expect fun syscallSYSGetuid(): Long

public expect fun syscallSYSGetgid(): Long

public expect fun syscallSYSSetuid(a1: Int): Long

public expect fun syscallSYSSetgid(a1: Int): Long

public expect fun syscallSYSGeteuid(): Long

public expect fun syscallSYSGetegid(): Long

public expect fun syscallSYSSetpgid(a1: Int, a2: Int): Long

public expect fun syscallSYSGetppid(): Long

public expect fun syscallSYSSetsid(): Long

public expect fun syscallSYSSetreuid(a1: Int, a2: Int): Long

public expect fun syscallSYSSetregid(a1: Int, a2: Int): Long

public expect fun syscallSYSGetgroups(a1: UInt, a2: Int): Long

public expect fun syscallSYSSetgroups(a1: UInt, a2: Int): Long

public expect fun syscallSYSSetresuid(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSSetresgid(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSGetpgid(a1: Int): Long

public expect fun syscallSYSGetsid(a1: Int): Long

public expect fun syscallSYSRtSigpending(a1: Int, a2: UInt): Long

public expect fun syscallSYSRtSigsuspend(a1: Int, a2: UInt): Long

public expect fun syscallSYSSigaltstack(a1: Int, a2: Int): Long

public expect fun syscallSYSUtime(a1: Int, a2: Int): Long

public expect fun syscallSYSStatfs(a1: Int, a2: Int): Long

public expect fun syscallSYSFstatfs(a1: Int, a2: Int): Long

public expect fun syscallSYSPrctl(a1: Int, a2: ULong, a3: ULong, a4: ULong, a5: ULong): Long

public expect fun syscallSYSSetrlimit(a1: Int, a2: Int): Long

public expect fun syscallSYSChroot(a1: Int): Long

public expect fun syscallSYSGettid(): Long

public expect fun syscallSYSTkill(a1: Int, a2: Int): Long

public expect fun syscallSYSFutex(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): Long

public expect fun syscallSYSSchedGetaffinity(a1: Int, a2: UInt, a3: Int): Long

public expect fun syscallSYSGetdents64(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSSetTidAddress(a1: Int): Long

public expect fun syscallSYSFadvise(a1: Int, a2: Long, a3: Long, a4: Int): Long

public expect fun syscallSYSClockGettime(a1: Int, a2: Int): Long

public expect fun syscallSYSClockGetres(a1: Int, a2: Int): Long

public expect fun syscallSYSClockNanosleep(a1: Int, a2: Int, a3: Int, a4: Int): Long

public expect fun syscallSYSExitGroup(a1: Int): Long

public expect fun syscallSYSEpollCtl(a1: Int, a2: Int, a3: Int, a4: Int): Long

public expect fun syscallSYSOpenat(a1: Int, a2: Int, a3: Int, a4: Int): Long

public expect fun syscallSYSMkdirat(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSFchownat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long

public expect fun syscallSYSFstatat(a1: Int, a2: Int, a3: Int, a4: Int): Long

public expect fun syscallSYSUnlinkat(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSLinkat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long

public expect fun syscallSYSSymlinkat(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSReadlinkat(a1: Int, a2: Int, a3: Int, a4: UInt): Long

public expect fun syscallSYSFchmodat(a1: Int, a2: Int, a3: Int, a4: Int): Long

public expect fun syscallSYSFaccessat(a1: Int, a2: Int, a3: Int, a4: Int): Long

public expect fun syscallSYSPselect6(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): Long

public expect fun syscallSYSPpoll(a1: Int, a2: UInt, a3: Int, a4: Int, a5: UInt): Long

public expect fun syscallSYSUtimensat(a1: Int, a2: Int, a3: Int, a4: Int): Long

public expect fun syscallSYSEpollPwait(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: UInt): Long

public expect fun syscallSYSEventfd(a1: Int): Long

public expect fun syscallSYSAccept4(a1: Int, a2: Int, a3: Int, a4: Int): Long

public expect fun syscallSYSEventfd2(a1: Int, a2: Int): Long

public expect fun syscallSYSEpollCreate1(a1: Int): Long

public expect fun syscallSYSDup3(a1: Int, a2: Int, a3: Int): Long

public expect fun syscallSYSPipe2(a1: Int, a2: Int): Long

public expect fun syscallSYSPrlimit64(a1: Int, a2: Int, a3: Int, a4: Int): Long

public expect fun syscallSYSRenameat2(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long

public expect fun syscallSYSGetrandom(a1: Int, a2: UInt, a3: Int): Long

public expect fun syscallSYSStatx(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long

public expect fun syscallSYSFaccessat2(a1: Int, a2: Int, a3: Int, a4: Int): Long
