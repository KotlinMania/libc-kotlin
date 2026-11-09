@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali

import io.github.kotlinmania.libc.CLong

public actual fun syscallSysRead(a1: Int, a2: Int, a3: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRead(a1, a2, a3)

public actual fun syscallSysWrite(a1: Int, a2: Int, a3: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysWrite(a1, a2, a3)

public actual fun syscallSysOpen(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysOpen(a1, a2, a3)

public actual fun syscallSysClose(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClose(a1)

public actual fun syscallSysStat(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysStat(a1, a2)

public actual fun syscallSysFstat(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFstat(a1, a2)

public actual fun syscallSysLstat(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLstat(a1, a2)

public actual fun syscallSysPoll(a1: Int, a2: UInt, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPoll(a1, a2, a3)

public actual fun syscallSysLseek(a1: Int, a2: Long, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLseek(a1, a2, a3)

public actual fun syscallSysMmap(a1: Int, a2: UInt, a3: Int, a4: Int, a5: Int, a6: Long): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMmap(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysMprotect(a1: Int, a2: UInt, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMprotect(a1, a2, a3)

public actual fun syscallSysMunmap(a1: Int, a2: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMunmap(a1, a2)

public actual fun syscallSysBrk(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysBrk(a1)

public actual fun syscallSysRtSigaction(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigaction(a1, a2, a3, a4)

public actual fun syscallSysRtSigprocmask(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigprocmask(a1, a2, a3, a4)

public actual fun syscallSysRtSigreturn(a1: Long): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigreturn(a1)

public actual fun syscallSysIoctl(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysIoctl(a1, a2, a3)

public actual fun syscallSysPread64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPread64(a1, a2, a3, a4)

public actual fun syscallSysPwrite64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPwrite64(a1, a2, a3, a4)

public actual fun syscallSysReadv(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysReadv(a1, a2, a3)

public actual fun syscallSysWritev(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysWritev(a1, a2, a3)

public actual fun syscallSysAccess(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAccess(a1, a2)

public actual fun syscallSysPipe(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPipe(a1)

public actual fun syscallSysSelect(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSelect(a1, a2, a3, a4, a5)

public actual fun syscallSysSchedYield(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSchedYield()

public actual fun syscallSysMremap(a1: Int, a2: UInt, a3: UInt, a4: Int, a5: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMremap(a1, a2, a3, a4, a5)

public actual fun syscallSysMsync(a1: Int, a2: UInt, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMsync(a1, a2, a3)

public actual fun syscallSysMadvise(a1: Int, a2: UInt, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMadvise(a1, a2, a3)

public actual fun syscallSysDup(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysDup(a1)

public actual fun syscallSysDup2(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysDup2(a1, a2)

public actual fun syscallSysNanosleep(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysNanosleep(a1, a2)

public actual fun syscallSysAlarm(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAlarm(a1)

public actual fun syscallSysSetitimer(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetitimer(a1, a2, a3)

public actual fun syscallSysGetpid(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetpid()

public actual fun syscallSysSocket(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSocket(a1, a2, a3)

public actual fun syscallSysConnect(a1: Int, a2: Int, a3: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysConnect(a1, a2, a3)

public actual fun syscallSysAccept(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAccept(a1, a2, a3)

public actual fun syscallSysSendto(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSendto(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysRecvfrom(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRecvfrom(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysSendmsg(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSendmsg(a1, a2, a3)

public actual fun syscallSysRecvmsg(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRecvmsg(a1, a2, a3)

public actual fun syscallSysShutdown(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysShutdown(a1, a2)

public actual fun syscallSysBind(a1: Int, a2: Int, a3: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysBind(a1, a2, a3)

public actual fun syscallSysListen(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysListen(a1, a2)

public actual fun syscallSysGetsockname(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetsockname(a1, a2, a3)

public actual fun syscallSysGetpeername(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetpeername(a1, a2, a3)

public actual fun syscallSysSocketpair(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSocketpair(a1, a2, a3, a4)

public actual fun syscallSysSetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetsockopt(a1, a2, a3, a4, a5)

public actual fun syscallSysGetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetsockopt(a1, a2, a3, a4, a5)

public actual fun syscallSysFork(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFork()

public actual fun syscallSysExecve(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysExecve(a1, a2, a3)

public actual fun syscallSysExit(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysExit(a1)

public actual fun syscallSysWait4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysWait4(a1, a2, a3, a4)

public actual fun syscallSysKill(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysKill(a1, a2)

public actual fun syscallSysUname(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUname(a1)

public actual fun syscallSysFcntl(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFcntl(a1, a2, a3)

public actual fun syscallSysFlock(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFlock(a1, a2)

public actual fun syscallSysFsync(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFsync(a1)

public actual fun syscallSysFdatasync(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFdatasync(a1)

public actual fun syscallSysFtruncate(a1: Int, a2: Long): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFtruncate(a1, a2)

public actual fun syscallSysGetdents(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetdents(a1, a2, a3)

public actual fun syscallSysGetcwd(a1: Int, a2: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetcwd(a1, a2)

public actual fun syscallSysChdir(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChdir(a1)

public actual fun syscallSysFchdir(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchdir(a1)

public actual fun syscallSysRename(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRename(a1, a2)

public actual fun syscallSysMkdir(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMkdir(a1, a2)

public actual fun syscallSysRmdir(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRmdir(a1)

public actual fun syscallSysLink(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLink(a1, a2)

public actual fun syscallSysUnlink(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUnlink(a1)

public actual fun syscallSysSymlink(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSymlink(a1, a2)

public actual fun syscallSysReadlink(a1: Int, a2: Int, a3: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysReadlink(a1, a2, a3)

public actual fun syscallSysChmod(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChmod(a1, a2)

public actual fun syscallSysFchmod(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchmod(a1, a2)

public actual fun syscallSysChown(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChown(a1, a2, a3)

public actual fun syscallSysFchown(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchown(a1, a2, a3)

public actual fun syscallSysUmask(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUmask(a1)

public actual fun syscallSysGetrlimit(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetrlimit(a1, a2)

public actual fun syscallSysGetrusage(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetrusage(a1, a2)

public actual fun syscallSysSysinfo(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSysinfo(a1)

public actual fun syscallSysGetuid(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetuid()

public actual fun syscallSysGetgid(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetgid()

public actual fun syscallSysSetuid(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetuid(a1)

public actual fun syscallSysSetgid(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetgid(a1)

public actual fun syscallSysGeteuid(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGeteuid()

public actual fun syscallSysGetegid(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetegid()

public actual fun syscallSysSetpgid(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetpgid(a1, a2)

public actual fun syscallSysGetppid(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetppid()

public actual fun syscallSysSetsid(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetsid()

public actual fun syscallSysSetreuid(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetreuid(a1, a2)

public actual fun syscallSysSetregid(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetregid(a1, a2)

public actual fun syscallSysGetgroups(a1: UInt, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetgroups(a1, a2)

public actual fun syscallSysSetgroups(a1: UInt, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetgroups(a1, a2)

public actual fun syscallSysSetresuid(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetresuid(a1, a2, a3)

public actual fun syscallSysSetresgid(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetresgid(a1, a2, a3)

public actual fun syscallSysGetpgid(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetpgid(a1)

public actual fun syscallSysGetsid(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetsid(a1)

public actual fun syscallSysRtSigpending(a1: Int, a2: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigpending(a1, a2)

public actual fun syscallSysRtSigsuspend(a1: Int, a2: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigsuspend(a1, a2)

public actual fun syscallSysSigaltstack(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSigaltstack(a1, a2)

public actual fun syscallSysUtime(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUtime(a1, a2)

public actual fun syscallSysStatfs(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysStatfs(a1, a2)

public actual fun syscallSysFstatfs(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFstatfs(a1, a2)

public actual fun syscallSysPrctl(a1: Int, a2: ULong, a3: ULong, a4: ULong, a5: ULong): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPrctl(a1, a2, a3, a4, a5)

public actual fun syscallSysSetrlimit(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetrlimit(a1, a2)

public actual fun syscallSysChroot(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChroot(a1)

public actual fun syscallSysGettid(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGettid()

public actual fun syscallSysTkill(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysTkill(a1, a2)

public actual fun syscallSysFutex(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFutex(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysSchedGetaffinity(a1: Int, a2: UInt, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSchedGetaffinity(a1, a2, a3)

public actual fun syscallSysGetdents64(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetdents64(a1, a2, a3)

public actual fun syscallSysSetTidAddress(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetTidAddress(a1)

public actual fun syscallSysFadvise(a1: Int, a2: Long, a3: Long, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFadvise(a1, a2, a3, a4)

public actual fun syscallSysClockGettime(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClockGettime(a1, a2)

public actual fun syscallSysClockGetres(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClockGetres(a1, a2)

public actual fun syscallSysClockNanosleep(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClockNanosleep(a1, a2, a3, a4)

public actual fun syscallSysExitGroup(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysExitGroup(a1)

public actual fun syscallSysEpollCtl(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEpollCtl(a1, a2, a3, a4)

public actual fun syscallSysOpenat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysOpenat(a1, a2, a3, a4)

public actual fun syscallSysMkdirat(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMkdirat(a1, a2, a3)

public actual fun syscallSysFchownat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchownat(a1, a2, a3, a4, a5)

public actual fun syscallSysFstatat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFstatat(a1, a2, a3, a4)

public actual fun syscallSysUnlinkat(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUnlinkat(a1, a2, a3)

public actual fun syscallSysLinkat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLinkat(a1, a2, a3, a4, a5)

public actual fun syscallSysSymlinkat(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSymlinkat(a1, a2, a3)

public actual fun syscallSysReadlinkat(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysReadlinkat(a1, a2, a3, a4)

public actual fun syscallSysFchmodat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchmodat(a1, a2, a3, a4)

public actual fun syscallSysFaccessat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFaccessat(a1, a2, a3, a4)

public actual fun syscallSysPselect6(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPselect6(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysPpoll(a1: Int, a2: UInt, a3: Int, a4: Int, a5: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPpoll(a1, a2, a3, a4, a5)

public actual fun syscallSysUtimensat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUtimensat(a1, a2, a3, a4)

public actual fun syscallSysEpollPwait(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: UInt): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEpollPwait(a1, a2, a3, a4, a5, a6)

public actual fun syscallSysEventfd(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEventfd(a1)

public actual fun syscallSysAccept4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAccept4(a1, a2, a3, a4)

public actual fun syscallSysEventfd2(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEventfd2(a1, a2)

public actual fun syscallSysEpollCreate1(a1: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEpollCreate1(a1)

public actual fun syscallSysDup3(a1: Int, a2: Int, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysDup3(a1, a2, a3)

public actual fun syscallSysPipe2(a1: Int, a2: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPipe2(a1, a2)

public actual fun syscallSysPrlimit64(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPrlimit64(a1, a2, a3, a4)

public actual fun syscallSysRenameat2(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRenameat2(a1, a2, a3, a4, a5)

public actual fun syscallSysGetrandom(a1: Int, a2: UInt, a3: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetrandom(a1, a2, a3)

public actual fun syscallSysStatx(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysStatx(a1, a2, a3, a4, a5)

public actual fun syscallSysFaccessat2(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali.cinterop.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFaccessat2(a1, a2, a3, a4)
