// port-lint: source Wali.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun syscallSYSRead(a1: Int, a2: Int, a3: UInt): CLong =
    throw UnsupportedOperationException("syscallSYSRead requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSWrite(a1: Int, a2: Int, a3: UInt): CLong =
    throw UnsupportedOperationException("syscallSYSWrite requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSOpen(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSOpen requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSClose(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSClose requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSStat(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSStat requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSFstat(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSFstat requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSLstat(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSLstat requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSPoll(a1: Int, a2: UInt, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSPoll requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSLseek(a1: Int, a2: Long, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSLseek requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSMmap(a1: Int, a2: UInt, a3: Int, a4: Int, a5: Int, a6: Long): CLong =
    throw UnsupportedOperationException("syscallSYSMmap requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSMprotect(a1: Int, a2: UInt, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSMprotect requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSMunmap(a1: Int, a2: UInt): CLong =
    throw UnsupportedOperationException("syscallSYSMunmap requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSBrk(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSBrk requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSRtSigaction(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    throw UnsupportedOperationException("syscallSYSRtSigaction requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSRtSigprocmask(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    throw UnsupportedOperationException("syscallSYSRtSigprocmask requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSRtSigreturn(a1: Long): CLong =
    throw UnsupportedOperationException("syscallSYSRtSigreturn requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSIoctl(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSIoctl requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSPread64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    throw UnsupportedOperationException("syscallSYSPread64 requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSPwrite64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    throw UnsupportedOperationException("syscallSYSPwrite64 requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSReadv(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSReadv requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSWritev(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSWritev requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSAccess(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSAccess requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSPipe(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSPipe requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSelect(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSelect requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSchedYield(): CLong =
    throw UnsupportedOperationException("syscallSYSSchedYield requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSMremap(a1: Int, a2: UInt, a3: UInt, a4: Int, a5: Int): CLong =
    throw UnsupportedOperationException("syscallSYSMremap requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSMsync(a1: Int, a2: UInt, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSMsync requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSMadvise(a1: Int, a2: UInt, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSMadvise requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSDup(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSDup requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSDup2(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSDup2 requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSNanosleep(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSNanosleep requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSAlarm(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSAlarm requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSetitimer(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSetitimer requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGetpid(): CLong =
    throw UnsupportedOperationException("syscallSYSGetpid requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSocket(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSocket requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSConnect(a1: Int, a2: Int, a3: UInt): CLong =
    throw UnsupportedOperationException("syscallSYSConnect requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSAccept(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSAccept requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSendto(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: UInt): CLong =
    throw UnsupportedOperationException("syscallSYSSendto requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSRecvfrom(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: Int): CLong =
    throw UnsupportedOperationException("syscallSYSRecvfrom requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSendmsg(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSendmsg requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSRecvmsg(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSRecvmsg requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSShutdown(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSShutdown requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSBind(a1: Int, a2: Int, a3: UInt): CLong =
    throw UnsupportedOperationException("syscallSYSBind requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSListen(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSListen requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGetsockname(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSGetsockname requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGetpeername(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSGetpeername requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSocketpair(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSocketpair requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: UInt): CLong =
    throw UnsupportedOperationException("syscallSYSSetsockopt requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    throw UnsupportedOperationException("syscallSYSGetsockopt requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSFork(): CLong =
    throw UnsupportedOperationException("syscallSYSFork requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSExecve(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSExecve requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSExit(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSExit requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSWait4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("syscallSYSWait4 requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSKill(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSKill requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSUname(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSUname requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSFcntl(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSFcntl requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSFlock(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSFlock requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSFsync(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSFsync requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSFdatasync(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSFdatasync requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSFtruncate(a1: Int, a2: Long): CLong =
    throw UnsupportedOperationException("syscallSYSFtruncate requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGetdents(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSGetdents requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGetcwd(a1: Int, a2: UInt): CLong =
    throw UnsupportedOperationException("syscallSYSGetcwd requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSChdir(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSChdir requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSFchdir(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSFchdir requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSRename(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSRename requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSMkdir(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSMkdir requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSRmdir(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSRmdir requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSLink(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSLink requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSUnlink(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSUnlink requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSymlink(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSymlink requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSReadlink(a1: Int, a2: Int, a3: UInt): CLong =
    throw UnsupportedOperationException("syscallSYSReadlink requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSChmod(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSChmod requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSFchmod(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSFchmod requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSChown(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSChown requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSFchown(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSFchown requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSUmask(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSUmask requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGetrlimit(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSGetrlimit requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGetrusage(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSGetrusage requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSysinfo(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSysinfo requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGetuid(): CLong =
    throw UnsupportedOperationException("syscallSYSGetuid requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGetgid(): CLong =
    throw UnsupportedOperationException("syscallSYSGetgid requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSetuid(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSetuid requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSetgid(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSetgid requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGeteuid(): CLong =
    throw UnsupportedOperationException("syscallSYSGeteuid requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGetegid(): CLong =
    throw UnsupportedOperationException("syscallSYSGetegid requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSetpgid(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSetpgid requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGetppid(): CLong =
    throw UnsupportedOperationException("syscallSYSGetppid requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSetsid(): CLong =
    throw UnsupportedOperationException("syscallSYSSetsid requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSetreuid(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSetreuid requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSetregid(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSetregid requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGetgroups(a1: UInt, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSGetgroups requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSetgroups(a1: UInt, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSetgroups requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSetresuid(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSetresuid requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSetresgid(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSetresgid requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGetpgid(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSGetpgid requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGetsid(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSGetsid requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSRtSigpending(a1: Int, a2: UInt): CLong =
    throw UnsupportedOperationException("syscallSYSRtSigpending requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSRtSigsuspend(a1: Int, a2: UInt): CLong =
    throw UnsupportedOperationException("syscallSYSRtSigsuspend requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSigaltstack(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSigaltstack requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSUtime(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSUtime requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSStatfs(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSStatfs requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSFstatfs(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSFstatfs requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSPrctl(a1: Int, a2: ULong, a3: ULong, a4: ULong, a5: ULong): CLong =
    throw UnsupportedOperationException("syscallSYSPrctl requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSetrlimit(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSetrlimit requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSChroot(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSChroot requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGettid(): CLong =
    throw UnsupportedOperationException("syscallSYSGettid requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSTkill(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSTkill requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSFutex(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    throw UnsupportedOperationException("syscallSYSFutex requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSchedGetaffinity(a1: Int, a2: UInt, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSchedGetaffinity requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGetdents64(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSGetdents64 requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSetTidAddress(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSetTidAddress requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSFadvise(a1: Int, a2: Long, a3: Long, a4: Int): CLong =
    throw UnsupportedOperationException("syscallSYSFadvise requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSClockGettime(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSClockGettime requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSClockGetres(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSClockGetres requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSClockNanosleep(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("syscallSYSClockNanosleep requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSExitGroup(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSExitGroup requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSEpollCtl(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("syscallSYSEpollCtl requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSOpenat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("syscallSYSOpenat requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSMkdirat(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSMkdirat requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSFchownat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    throw UnsupportedOperationException("syscallSYSFchownat requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSFstatat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("syscallSYSFstatat requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSUnlinkat(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSUnlinkat requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSLinkat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    throw UnsupportedOperationException("syscallSYSLinkat requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSSymlinkat(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSSymlinkat requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSReadlinkat(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    throw UnsupportedOperationException("syscallSYSReadlinkat requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSFchmodat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("syscallSYSFchmodat requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSFaccessat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("syscallSYSFaccessat requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSPselect6(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    throw UnsupportedOperationException("syscallSYSPselect6 requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSPpoll(a1: Int, a2: UInt, a3: Int, a4: Int, a5: UInt): CLong =
    throw UnsupportedOperationException("syscallSYSPpoll requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSUtimensat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("syscallSYSUtimensat requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSEpollPwait(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: UInt): CLong =
    throw UnsupportedOperationException("syscallSYSEpollPwait requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSEventfd(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSEventfd requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSAccept4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("syscallSYSAccept4 requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSEventfd2(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSEventfd2 requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSEpollCreate1(a1: Int): CLong =
    throw UnsupportedOperationException("syscallSYSEpollCreate1 requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSDup3(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSDup3 requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSPipe2(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("syscallSYSPipe2 requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSPrlimit64(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("syscallSYSPrlimit64 requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSRenameat2(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    throw UnsupportedOperationException("syscallSYSRenameat2 requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSGetrandom(a1: Int, a2: UInt, a3: Int): CLong =
    throw UnsupportedOperationException("syscallSYSGetrandom requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSStatx(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    throw UnsupportedOperationException("syscallSYSStatx requires manual FFI bridge — not yet implemented")

public actual fun syscallSYSFaccessat2(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("syscallSYSFaccessat2 requires manual FFI bridge — not yet implemented")
