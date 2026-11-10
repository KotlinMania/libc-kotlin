@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong

public actual fun syscallSysRead(a1: Int, a2: Int, a3: UInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysWrite(a1: Int, a2: Int, a3: UInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysOpen(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysClose(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysStat(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysFstat(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysLstat(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysPoll(a1: Int, a2: UInt, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysLseek(a1: Int, a2: Long, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysMmap(a1: Int, a2: UInt, a3: Int, a4: Int, a5: Int, a6: Long): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysMprotect(a1: Int, a2: UInt, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysMunmap(a1: Int, a2: UInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysBrk(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysRtSigaction(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysRtSigprocmask(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysRtSigreturn(a1: Long): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysIoctl(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysPread64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysPwrite64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysReadv(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysWritev(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysAccess(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysPipe(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSelect(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSchedYield(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysMremap(a1: Int, a2: UInt, a3: UInt, a4: Int, a5: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysMsync(a1: Int, a2: UInt, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysMadvise(a1: Int, a2: UInt, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysDup(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysDup2(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysNanosleep(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysAlarm(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSetitimer(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGetpid(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSocket(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysConnect(a1: Int, a2: Int, a3: UInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysAccept(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSendto(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: UInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysRecvfrom(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSendmsg(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysRecvmsg(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysShutdown(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysBind(a1: Int, a2: Int, a3: UInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysListen(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGetsockname(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGetpeername(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSocketpair(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: UInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysFork(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysExecve(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysExit(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysWait4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysKill(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysUname(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysFcntl(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysFlock(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysFsync(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysFdatasync(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysFtruncate(a1: Int, a2: Long): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGetdents(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGetcwd(a1: Int, a2: UInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysChdir(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysFchdir(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysRename(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysMkdir(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysRmdir(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysLink(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysUnlink(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSymlink(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysReadlink(a1: Int, a2: Int, a3: UInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysChmod(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysFchmod(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysChown(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysFchown(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysUmask(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGetrlimit(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGetrusage(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSysinfo(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGetuid(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGetgid(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSetuid(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSetgid(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGeteuid(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGetegid(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSetpgid(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGetppid(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSetsid(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSetreuid(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSetregid(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGetgroups(a1: UInt, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSetgroups(a1: UInt, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSetresuid(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSetresgid(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGetpgid(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGetsid(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysRtSigpending(a1: Int, a2: UInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysRtSigsuspend(a1: Int, a2: UInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSigaltstack(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysUtime(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysStatfs(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysFstatfs(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysPrctl(a1: Int, a2: ULong, a3: ULong, a4: ULong, a5: ULong): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSetrlimit(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysChroot(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGettid(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysTkill(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysFutex(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSchedGetaffinity(a1: Int, a2: UInt, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGetdents64(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSetTidAddress(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysFadvise(a1: Int, a2: Long, a3: Long, a4: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysClockGettime(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysClockGetres(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysClockNanosleep(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysExitGroup(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysEpollCtl(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysOpenat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysMkdirat(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysFchownat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysFstatat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysUnlinkat(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysLinkat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysSymlinkat(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysReadlinkat(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysFchmodat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysFaccessat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysPselect6(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysPpoll(a1: Int, a2: UInt, a3: Int, a4: Int, a5: UInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysUtimensat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysEpollPwait(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: UInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysEventfd(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysAccept4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysEventfd2(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysEpollCreate1(a1: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysDup3(a1: Int, a2: Int, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysPipe2(a1: Int, a2: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysPrlimit64(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysRenameat2(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysGetrandom(a1: Int, a2: UInt, a3: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysStatx(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscallSysFaccessat2(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
