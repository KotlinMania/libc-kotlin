// port-lint: source Wali.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32

import io.github.kotlinmania.libc.*

public actual fun syscallSYSRead(a1: Int, a2: Int, a3: UInt): Long =
    throw UnsupportedOperationException("syscallSYSRead not available on WASI — no C library access")

public actual fun syscallSYSWrite(a1: Int, a2: Int, a3: UInt): Long =
    throw UnsupportedOperationException("syscallSYSWrite not available on WASI — no C library access")

public actual fun syscallSYSOpen(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSOpen not available on WASI — no C library access")

public actual fun syscallSYSClose(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSClose not available on WASI — no C library access")

public actual fun syscallSYSStat(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSStat not available on WASI — no C library access")

public actual fun syscallSYSFstat(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSFstat not available on WASI — no C library access")

public actual fun syscallSYSLstat(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSLstat not available on WASI — no C library access")

public actual fun syscallSYSPoll(a1: Int, a2: UInt, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSPoll not available on WASI — no C library access")

public actual fun syscallSYSLseek(a1: Int, a2: Long, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSLseek not available on WASI — no C library access")

public actual fun syscallSYSMmap(a1: Int, a2: UInt, a3: Int, a4: Int, a5: Int, a6: Long): Long =
    throw UnsupportedOperationException("syscallSYSMmap not available on WASI — no C library access")

public actual fun syscallSYSMprotect(a1: Int, a2: UInt, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSMprotect not available on WASI — no C library access")

public actual fun syscallSYSMunmap(a1: Int, a2: UInt): Long =
    throw UnsupportedOperationException("syscallSYSMunmap not available on WASI — no C library access")

public actual fun syscallSYSBrk(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSBrk not available on WASI — no C library access")

public actual fun syscallSYSRtSigaction(a1: Int, a2: Int, a3: Int, a4: UInt): Long =
    throw UnsupportedOperationException("syscallSYSRtSigaction not available on WASI — no C library access")

public actual fun syscallSYSRtSigprocmask(a1: Int, a2: Int, a3: Int, a4: UInt): Long =
    throw UnsupportedOperationException("syscallSYSRtSigprocmask not available on WASI — no C library access")

public actual fun syscallSYSRtSigreturn(a1: Long): Long =
    throw UnsupportedOperationException("syscallSYSRtSigreturn not available on WASI — no C library access")

public actual fun syscallSYSIoctl(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSIoctl not available on WASI — no C library access")

public actual fun syscallSYSPread64(a1: Int, a2: Int, a3: UInt, a4: Long): Long =
    throw UnsupportedOperationException("syscallSYSPread64 not available on WASI — no C library access")

public actual fun syscallSYSPwrite64(a1: Int, a2: Int, a3: UInt, a4: Long): Long =
    throw UnsupportedOperationException("syscallSYSPwrite64 not available on WASI — no C library access")

public actual fun syscallSYSReadv(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSReadv not available on WASI — no C library access")

public actual fun syscallSYSWritev(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSWritev not available on WASI — no C library access")

public actual fun syscallSYSAccess(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSAccess not available on WASI — no C library access")

public actual fun syscallSYSPipe(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSPipe not available on WASI — no C library access")

public actual fun syscallSYSSelect(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long =
    throw UnsupportedOperationException("syscallSYSSelect not available on WASI — no C library access")

public actual fun syscallSYSSchedYield(): Long =
    throw UnsupportedOperationException("syscallSYSSchedYield not available on WASI — no C library access")

public actual fun syscallSYSMremap(a1: Int, a2: UInt, a3: UInt, a4: Int, a5: Int): Long =
    throw UnsupportedOperationException("syscallSYSMremap not available on WASI — no C library access")

public actual fun syscallSYSMsync(a1: Int, a2: UInt, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSMsync not available on WASI — no C library access")

public actual fun syscallSYSMadvise(a1: Int, a2: UInt, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSMadvise not available on WASI — no C library access")

public actual fun syscallSYSDup(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSDup not available on WASI — no C library access")

public actual fun syscallSYSDup2(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSDup2 not available on WASI — no C library access")

public actual fun syscallSYSNanosleep(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSNanosleep not available on WASI — no C library access")

public actual fun syscallSYSAlarm(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSAlarm not available on WASI — no C library access")

public actual fun syscallSYSSetitimer(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSSetitimer not available on WASI — no C library access")

public actual fun syscallSYSGetpid(): Long =
    throw UnsupportedOperationException("syscallSYSGetpid not available on WASI — no C library access")

public actual fun syscallSYSSocket(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSSocket not available on WASI — no C library access")

public actual fun syscallSYSConnect(a1: Int, a2: Int, a3: UInt): Long =
    throw UnsupportedOperationException("syscallSYSConnect not available on WASI — no C library access")

public actual fun syscallSYSAccept(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSAccept not available on WASI — no C library access")

public actual fun syscallSYSSendto(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: UInt): Long =
    throw UnsupportedOperationException("syscallSYSSendto not available on WASI — no C library access")

public actual fun syscallSYSRecvfrom(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: Int): Long =
    throw UnsupportedOperationException("syscallSYSRecvfrom not available on WASI — no C library access")

public actual fun syscallSYSSendmsg(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSSendmsg not available on WASI — no C library access")

public actual fun syscallSYSRecvmsg(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSRecvmsg not available on WASI — no C library access")

public actual fun syscallSYSShutdown(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSShutdown not available on WASI — no C library access")

public actual fun syscallSYSBind(a1: Int, a2: Int, a3: UInt): Long =
    throw UnsupportedOperationException("syscallSYSBind not available on WASI — no C library access")

public actual fun syscallSYSListen(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSListen not available on WASI — no C library access")

public actual fun syscallSYSGetsockname(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSGetsockname not available on WASI — no C library access")

public actual fun syscallSYSGetpeername(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSGetpeername not available on WASI — no C library access")

public actual fun syscallSYSSocketpair(a1: Int, a2: Int, a3: Int, a4: Int): Long =
    throw UnsupportedOperationException("syscallSYSSocketpair not available on WASI — no C library access")

public actual fun syscallSYSSetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: UInt): Long =
    throw UnsupportedOperationException("syscallSYSSetsockopt not available on WASI — no C library access")

public actual fun syscallSYSGetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long =
    throw UnsupportedOperationException("syscallSYSGetsockopt not available on WASI — no C library access")

public actual fun syscallSYSFork(): Long =
    throw UnsupportedOperationException("syscallSYSFork not available on WASI — no C library access")

public actual fun syscallSYSExecve(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSExecve not available on WASI — no C library access")

public actual fun syscallSYSExit(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSExit not available on WASI — no C library access")

public actual fun syscallSYSWait4(a1: Int, a2: Int, a3: Int, a4: Int): Long =
    throw UnsupportedOperationException("syscallSYSWait4 not available on WASI — no C library access")

public actual fun syscallSYSKill(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSKill not available on WASI — no C library access")

public actual fun syscallSYSUname(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSUname not available on WASI — no C library access")

public actual fun syscallSYSFcntl(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSFcntl not available on WASI — no C library access")

public actual fun syscallSYSFlock(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSFlock not available on WASI — no C library access")

public actual fun syscallSYSFsync(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSFsync not available on WASI — no C library access")

public actual fun syscallSYSFdatasync(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSFdatasync not available on WASI — no C library access")

public actual fun syscallSYSFtruncate(a1: Int, a2: Long): Long =
    throw UnsupportedOperationException("syscallSYSFtruncate not available on WASI — no C library access")

public actual fun syscallSYSGetdents(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSGetdents not available on WASI — no C library access")

public actual fun syscallSYSGetcwd(a1: Int, a2: UInt): Long =
    throw UnsupportedOperationException("syscallSYSGetcwd not available on WASI — no C library access")

public actual fun syscallSYSChdir(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSChdir not available on WASI — no C library access")

public actual fun syscallSYSFchdir(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSFchdir not available on WASI — no C library access")

public actual fun syscallSYSRename(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSRename not available on WASI — no C library access")

public actual fun syscallSYSMkdir(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSMkdir not available on WASI — no C library access")

public actual fun syscallSYSRmdir(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSRmdir not available on WASI — no C library access")

public actual fun syscallSYSLink(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSLink not available on WASI — no C library access")

public actual fun syscallSYSUnlink(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSUnlink not available on WASI — no C library access")

public actual fun syscallSYSSymlink(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSSymlink not available on WASI — no C library access")

public actual fun syscallSYSReadlink(a1: Int, a2: Int, a3: UInt): Long =
    throw UnsupportedOperationException("syscallSYSReadlink not available on WASI — no C library access")

public actual fun syscallSYSChmod(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSChmod not available on WASI — no C library access")

public actual fun syscallSYSFchmod(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSFchmod not available on WASI — no C library access")

public actual fun syscallSYSChown(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSChown not available on WASI — no C library access")

public actual fun syscallSYSFchown(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSFchown not available on WASI — no C library access")

public actual fun syscallSYSUmask(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSUmask not available on WASI — no C library access")

public actual fun syscallSYSGetrlimit(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSGetrlimit not available on WASI — no C library access")

public actual fun syscallSYSGetrusage(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSGetrusage not available on WASI — no C library access")

public actual fun syscallSYSSysinfo(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSSysinfo not available on WASI — no C library access")

public actual fun syscallSYSGetuid(): Long =
    throw UnsupportedOperationException("syscallSYSGetuid not available on WASI — no C library access")

public actual fun syscallSYSGetgid(): Long =
    throw UnsupportedOperationException("syscallSYSGetgid not available on WASI — no C library access")

public actual fun syscallSYSSetuid(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSSetuid not available on WASI — no C library access")

public actual fun syscallSYSSetgid(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSSetgid not available on WASI — no C library access")

public actual fun syscallSYSGeteuid(): Long =
    throw UnsupportedOperationException("syscallSYSGeteuid not available on WASI — no C library access")

public actual fun syscallSYSGetegid(): Long =
    throw UnsupportedOperationException("syscallSYSGetegid not available on WASI — no C library access")

public actual fun syscallSYSSetpgid(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSSetpgid not available on WASI — no C library access")

public actual fun syscallSYSGetppid(): Long =
    throw UnsupportedOperationException("syscallSYSGetppid not available on WASI — no C library access")

public actual fun syscallSYSSetsid(): Long =
    throw UnsupportedOperationException("syscallSYSSetsid not available on WASI — no C library access")

public actual fun syscallSYSSetreuid(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSSetreuid not available on WASI — no C library access")

public actual fun syscallSYSSetregid(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSSetregid not available on WASI — no C library access")

public actual fun syscallSYSGetgroups(a1: UInt, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSGetgroups not available on WASI — no C library access")

public actual fun syscallSYSSetgroups(a1: UInt, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSSetgroups not available on WASI — no C library access")

public actual fun syscallSYSSetresuid(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSSetresuid not available on WASI — no C library access")

public actual fun syscallSYSSetresgid(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSSetresgid not available on WASI — no C library access")

public actual fun syscallSYSGetpgid(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSGetpgid not available on WASI — no C library access")

public actual fun syscallSYSGetsid(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSGetsid not available on WASI — no C library access")

public actual fun syscallSYSRtSigpending(a1: Int, a2: UInt): Long =
    throw UnsupportedOperationException("syscallSYSRtSigpending not available on WASI — no C library access")

public actual fun syscallSYSRtSigsuspend(a1: Int, a2: UInt): Long =
    throw UnsupportedOperationException("syscallSYSRtSigsuspend not available on WASI — no C library access")

public actual fun syscallSYSSigaltstack(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSSigaltstack not available on WASI — no C library access")

public actual fun syscallSYSUtime(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSUtime not available on WASI — no C library access")

public actual fun syscallSYSStatfs(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSStatfs not available on WASI — no C library access")

public actual fun syscallSYSFstatfs(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSFstatfs not available on WASI — no C library access")

public actual fun syscallSYSPrctl(a1: Int, a2: ULong, a3: ULong, a4: ULong, a5: ULong): Long =
    throw UnsupportedOperationException("syscallSYSPrctl not available on WASI — no C library access")

public actual fun syscallSYSSetrlimit(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSSetrlimit not available on WASI — no C library access")

public actual fun syscallSYSChroot(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSChroot not available on WASI — no C library access")

public actual fun syscallSYSGettid(): Long =
    throw UnsupportedOperationException("syscallSYSGettid not available on WASI — no C library access")

public actual fun syscallSYSTkill(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSTkill not available on WASI — no C library access")

public actual fun syscallSYSFutex(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): Long =
    throw UnsupportedOperationException("syscallSYSFutex not available on WASI — no C library access")

public actual fun syscallSYSSchedGetaffinity(a1: Int, a2: UInt, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSSchedGetaffinity not available on WASI — no C library access")

public actual fun syscallSYSGetdents64(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSGetdents64 not available on WASI — no C library access")

public actual fun syscallSYSSetTidAddress(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSSetTidAddress not available on WASI — no C library access")

public actual fun syscallSYSFadvise(a1: Int, a2: Long, a3: Long, a4: Int): Long =
    throw UnsupportedOperationException("syscallSYSFadvise not available on WASI — no C library access")

public actual fun syscallSYSClockGettime(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSClockGettime not available on WASI — no C library access")

public actual fun syscallSYSClockGetres(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSClockGetres not available on WASI — no C library access")

public actual fun syscallSYSClockNanosleep(a1: Int, a2: Int, a3: Int, a4: Int): Long =
    throw UnsupportedOperationException("syscallSYSClockNanosleep not available on WASI — no C library access")

public actual fun syscallSYSExitGroup(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSExitGroup not available on WASI — no C library access")

public actual fun syscallSYSEpollCtl(a1: Int, a2: Int, a3: Int, a4: Int): Long =
    throw UnsupportedOperationException("syscallSYSEpollCtl not available on WASI — no C library access")

public actual fun syscallSYSOpenat(a1: Int, a2: Int, a3: Int, a4: Int): Long =
    throw UnsupportedOperationException("syscallSYSOpenat not available on WASI — no C library access")

public actual fun syscallSYSMkdirat(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSMkdirat not available on WASI — no C library access")

public actual fun syscallSYSFchownat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long =
    throw UnsupportedOperationException("syscallSYSFchownat not available on WASI — no C library access")

public actual fun syscallSYSFstatat(a1: Int, a2: Int, a3: Int, a4: Int): Long =
    throw UnsupportedOperationException("syscallSYSFstatat not available on WASI — no C library access")

public actual fun syscallSYSUnlinkat(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSUnlinkat not available on WASI — no C library access")

public actual fun syscallSYSLinkat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long =
    throw UnsupportedOperationException("syscallSYSLinkat not available on WASI — no C library access")

public actual fun syscallSYSSymlinkat(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSSymlinkat not available on WASI — no C library access")

public actual fun syscallSYSReadlinkat(a1: Int, a2: Int, a3: Int, a4: UInt): Long =
    throw UnsupportedOperationException("syscallSYSReadlinkat not available on WASI — no C library access")

public actual fun syscallSYSFchmodat(a1: Int, a2: Int, a3: Int, a4: Int): Long =
    throw UnsupportedOperationException("syscallSYSFchmodat not available on WASI — no C library access")

public actual fun syscallSYSFaccessat(a1: Int, a2: Int, a3: Int, a4: Int): Long =
    throw UnsupportedOperationException("syscallSYSFaccessat not available on WASI — no C library access")

public actual fun syscallSYSPselect6(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): Long =
    throw UnsupportedOperationException("syscallSYSPselect6 not available on WASI — no C library access")

public actual fun syscallSYSPpoll(a1: Int, a2: UInt, a3: Int, a4: Int, a5: UInt): Long =
    throw UnsupportedOperationException("syscallSYSPpoll not available on WASI — no C library access")

public actual fun syscallSYSUtimensat(a1: Int, a2: Int, a3: Int, a4: Int): Long =
    throw UnsupportedOperationException("syscallSYSUtimensat not available on WASI — no C library access")

public actual fun syscallSYSEpollPwait(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: UInt): Long =
    throw UnsupportedOperationException("syscallSYSEpollPwait not available on WASI — no C library access")

public actual fun syscallSYSEventfd(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSEventfd not available on WASI — no C library access")

public actual fun syscallSYSAccept4(a1: Int, a2: Int, a3: Int, a4: Int): Long =
    throw UnsupportedOperationException("syscallSYSAccept4 not available on WASI — no C library access")

public actual fun syscallSYSEventfd2(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSEventfd2 not available on WASI — no C library access")

public actual fun syscallSYSEpollCreate1(a1: Int): Long =
    throw UnsupportedOperationException("syscallSYSEpollCreate1 not available on WASI — no C library access")

public actual fun syscallSYSDup3(a1: Int, a2: Int, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSDup3 not available on WASI — no C library access")

public actual fun syscallSYSPipe2(a1: Int, a2: Int): Long =
    throw UnsupportedOperationException("syscallSYSPipe2 not available on WASI — no C library access")

public actual fun syscallSYSPrlimit64(a1: Int, a2: Int, a3: Int, a4: Int): Long =
    throw UnsupportedOperationException("syscallSYSPrlimit64 not available on WASI — no C library access")

public actual fun syscallSYSRenameat2(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long =
    throw UnsupportedOperationException("syscallSYSRenameat2 not available on WASI — no C library access")

public actual fun syscallSYSGetrandom(a1: Int, a2: UInt, a3: Int): Long =
    throw UnsupportedOperationException("syscallSYSGetrandom not available on WASI — no C library access")

public actual fun syscallSYSStatx(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long =
    throw UnsupportedOperationException("syscallSYSStatx not available on WASI — no C library access")

public actual fun syscallSYSFaccessat2(a1: Int, a2: Int, a3: Int, a4: Int): Long =
    throw UnsupportedOperationException("syscallSYSFaccessat2 not available on WASI — no C library access")
