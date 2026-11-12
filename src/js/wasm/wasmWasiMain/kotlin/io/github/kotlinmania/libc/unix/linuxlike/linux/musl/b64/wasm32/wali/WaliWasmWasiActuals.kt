@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong

// The host must provide the C companion wrapper exports in import module libc.
@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRead")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRead(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysRead(a1: Int, a2: Int, a3: UInt): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRead(a1, a2, a3.toInt()).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWrite")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWrite(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysWrite(a1: Int, a2: Int, a3: UInt): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWrite(a1, a2, a3.toInt()).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpen")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpen(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysOpen(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpen(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClose")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClose(a1: Int): Long

public actual fun syscallSysClose(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClose(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStat")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStat(a1: Int, a2: Int): Long

public actual fun syscallSysStat(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStat(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstat")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstat(a1: Int, a2: Int): Long

public actual fun syscallSysFstat(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstat(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLstat")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLstat(a1: Int, a2: Int): Long

public actual fun syscallSysLstat(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLstat(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPoll")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPoll(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysPoll(a1: Int, a2: UInt, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPoll(a1, a2.toInt(), a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLseek")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLseek(a1: Int, a2: Long, a3: Int): Long

public actual fun syscallSysLseek(a1: Int, a2: Long, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLseek(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMmap")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMmap(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Long): Long

public actual fun syscallSysMmap(a1: Int, a2: UInt, a3: Int, a4: Int, a5: Int, a6: Long): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMmap(a1, a2.toInt(), a3, a4, a5, a6).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMprotect")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMprotect(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysMprotect(a1: Int, a2: UInt, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMprotect(a1, a2.toInt(), a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMunmap")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMunmap(a1: Int, a2: Int): Long

public actual fun syscallSysMunmap(a1: Int, a2: UInt): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMunmap(a1, a2.toInt()).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBrk")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBrk(a1: Int): Long

public actual fun syscallSysBrk(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBrk(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigaction")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigaction(a1: Int, a2: Int, a3: Int, a4: Int): Long

public actual fun syscallSysRtSigaction(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigaction(a1, a2, a3, a4.toInt()).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigprocmask")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigprocmask(a1: Int, a2: Int, a3: Int, a4: Int): Long

public actual fun syscallSysRtSigprocmask(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigprocmask(a1, a2, a3, a4.toInt()).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigreturn")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigreturn(a1: Long): Long

public actual fun syscallSysRtSigreturn(a1: Long): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigreturn(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysIoctl")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysIoctl(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysIoctl(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysIoctl(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPread64")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPread64(a1: Int, a2: Int, a3: Int, a4: Long): Long

public actual fun syscallSysPread64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPread64(a1, a2, a3.toInt(), a4).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPwrite64")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPwrite64(a1: Int, a2: Int, a3: Int, a4: Long): Long

public actual fun syscallSysPwrite64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPwrite64(a1, a2, a3.toInt(), a4).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadv")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadv(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysReadv(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadv(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWritev")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWritev(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysWritev(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWritev(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccess")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccess(a1: Int, a2: Int): Long

public actual fun syscallSysAccess(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccess(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe(a1: Int): Long

public actual fun syscallSysPipe(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSelect")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSelect(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long

public actual fun syscallSysSelect(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSelect(a1, a2, a3, a4, a5).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedYield")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedYield(): Long

public actual fun syscallSysSchedYield(): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedYield().toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMremap")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMremap(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long

public actual fun syscallSysMremap(a1: Int, a2: UInt, a3: UInt, a4: Int, a5: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMremap(a1, a2.toInt(), a3.toInt(), a4, a5).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMsync")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMsync(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysMsync(a1: Int, a2: UInt, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMsync(a1, a2.toInt(), a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMadvise")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMadvise(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysMadvise(a1: Int, a2: UInt, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMadvise(a1, a2.toInt(), a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup(a1: Int): Long

public actual fun syscallSysDup(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup2")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup2(a1: Int, a2: Int): Long

public actual fun syscallSysDup2(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup2(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysNanosleep")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysNanosleep(a1: Int, a2: Int): Long

public actual fun syscallSysNanosleep(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysNanosleep(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAlarm")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAlarm(a1: Int): Long

public actual fun syscallSysAlarm(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAlarm(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetitimer")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetitimer(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysSetitimer(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetitimer(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpid")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpid(): Long

public actual fun syscallSysGetpid(): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpid().toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocket")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocket(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysSocket(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocket(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysConnect")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysConnect(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysConnect(a1: Int, a2: Int, a3: UInt): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysConnect(a1, a2, a3.toInt()).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysAccept(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendto")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendto(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): Long

public actual fun syscallSysSendto(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: UInt): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendto(a1, a2, a3.toInt(), a4, a5, a6.toInt()).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvfrom")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvfrom(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): Long

public actual fun syscallSysRecvfrom(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvfrom(a1, a2, a3.toInt(), a4, a5, a6).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendmsg")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendmsg(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysSendmsg(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendmsg(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvmsg")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvmsg(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysRecvmsg(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvmsg(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysShutdown")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysShutdown(a1: Int, a2: Int): Long

public actual fun syscallSysShutdown(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysShutdown(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBind")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBind(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysBind(a1: Int, a2: Int, a3: UInt): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBind(a1, a2, a3.toInt()).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysListen")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysListen(a1: Int, a2: Int): Long

public actual fun syscallSysListen(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysListen(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockname")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockname(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysGetsockname(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockname(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpeername")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpeername(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysGetpeername(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpeername(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocketpair")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocketpair(a1: Int, a2: Int, a3: Int, a4: Int): Long

public actual fun syscallSysSocketpair(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocketpair(a1, a2, a3, a4).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsockopt")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long

public actual fun syscallSysSetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: UInt): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsockopt(a1, a2, a3, a4, a5.toInt()).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockopt")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long

public actual fun syscallSysGetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockopt(a1, a2, a3, a4, a5).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFork")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFork(): Long

public actual fun syscallSysFork(): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFork().toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExecve")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExecve(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysExecve(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExecve(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExit")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExit(a1: Int): Long

public actual fun syscallSysExit(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExit(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWait4")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWait4(a1: Int, a2: Int, a3: Int, a4: Int): Long

public actual fun syscallSysWait4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWait4(a1, a2, a3, a4).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysKill")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysKill(a1: Int, a2: Int): Long

public actual fun syscallSysKill(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysKill(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUname")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUname(a1: Int): Long

public actual fun syscallSysUname(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUname(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFcntl")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFcntl(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysFcntl(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFcntl(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFlock")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFlock(a1: Int, a2: Int): Long

public actual fun syscallSysFlock(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFlock(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFsync")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFsync(a1: Int): Long

public actual fun syscallSysFsync(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFsync(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFdatasync")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFdatasync(a1: Int): Long

public actual fun syscallSysFdatasync(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFdatasync(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFtruncate")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFtruncate(a1: Int, a2: Long): Long

public actual fun syscallSysFtruncate(a1: Int, a2: Long): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFtruncate(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysGetdents(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetcwd")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetcwd(a1: Int, a2: Int): Long

public actual fun syscallSysGetcwd(a1: Int, a2: UInt): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetcwd(a1, a2.toInt()).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChdir")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChdir(a1: Int): Long

public actual fun syscallSysChdir(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChdir(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchdir")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchdir(a1: Int): Long

public actual fun syscallSysFchdir(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchdir(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRename")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRename(a1: Int, a2: Int): Long

public actual fun syscallSysRename(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRename(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdir")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdir(a1: Int, a2: Int): Long

public actual fun syscallSysMkdir(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdir(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRmdir")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRmdir(a1: Int): Long

public actual fun syscallSysRmdir(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRmdir(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLink")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLink(a1: Int, a2: Int): Long

public actual fun syscallSysLink(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLink(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlink")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlink(a1: Int): Long

public actual fun syscallSysUnlink(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlink(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlink")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlink(a1: Int, a2: Int): Long

public actual fun syscallSysSymlink(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlink(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlink")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlink(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysReadlink(a1: Int, a2: Int, a3: UInt): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlink(a1, a2, a3.toInt()).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChmod")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChmod(a1: Int, a2: Int): Long

public actual fun syscallSysChmod(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChmod(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmod")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmod(a1: Int, a2: Int): Long

public actual fun syscallSysFchmod(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmod(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChown")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChown(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysChown(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChown(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchown")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchown(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysFchown(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchown(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUmask")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUmask(a1: Int): Long

public actual fun syscallSysUmask(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUmask(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrlimit")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrlimit(a1: Int, a2: Int): Long

public actual fun syscallSysGetrlimit(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrlimit(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrusage")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrusage(a1: Int, a2: Int): Long

public actual fun syscallSysGetrusage(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrusage(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSysinfo")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSysinfo(a1: Int): Long

public actual fun syscallSysSysinfo(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSysinfo(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetuid")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetuid(): Long

public actual fun syscallSysGetuid(): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetuid().toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgid")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgid(): Long

public actual fun syscallSysGetgid(): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgid().toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetuid")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetuid(a1: Int): Long

public actual fun syscallSysSetuid(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetuid(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgid")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgid(a1: Int): Long

public actual fun syscallSysSetgid(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgid(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGeteuid")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGeteuid(): Long

public actual fun syscallSysGeteuid(): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGeteuid().toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetegid")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetegid(): Long

public actual fun syscallSysGetegid(): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetegid().toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetpgid")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetpgid(a1: Int, a2: Int): Long

public actual fun syscallSysSetpgid(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetpgid(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetppid")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetppid(): Long

public actual fun syscallSysGetppid(): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetppid().toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsid")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsid(): Long

public actual fun syscallSysSetsid(): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsid().toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetreuid")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetreuid(a1: Int, a2: Int): Long

public actual fun syscallSysSetreuid(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetreuid(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetregid")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetregid(a1: Int, a2: Int): Long

public actual fun syscallSysSetregid(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetregid(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgroups")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgroups(a1: Int, a2: Int): Long

public actual fun syscallSysGetgroups(a1: UInt, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgroups(a1.toInt(), a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgroups")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgroups(a1: Int, a2: Int): Long

public actual fun syscallSysSetgroups(a1: UInt, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgroups(a1.toInt(), a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresuid")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresuid(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysSetresuid(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresuid(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresgid")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresgid(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysSetresgid(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresgid(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpgid")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpgid(a1: Int): Long

public actual fun syscallSysGetpgid(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpgid(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsid")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsid(a1: Int): Long

public actual fun syscallSysGetsid(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsid(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigpending")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigpending(a1: Int, a2: Int): Long

public actual fun syscallSysRtSigpending(a1: Int, a2: UInt): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigpending(a1, a2.toInt()).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigsuspend")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigsuspend(a1: Int, a2: Int): Long

public actual fun syscallSysRtSigsuspend(a1: Int, a2: UInt): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigsuspend(a1, a2.toInt()).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSigaltstack")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSigaltstack(a1: Int, a2: Int): Long

public actual fun syscallSysSigaltstack(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSigaltstack(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtime")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtime(a1: Int, a2: Int): Long

public actual fun syscallSysUtime(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtime(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatfs")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatfs(a1: Int, a2: Int): Long

public actual fun syscallSysStatfs(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatfs(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatfs")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatfs(a1: Int, a2: Int): Long

public actual fun syscallSysFstatfs(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatfs(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrctl")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrctl(a1: Int, a2: Long, a3: Long, a4: Long, a5: Long): Long

public actual fun syscallSysPrctl(a1: Int, a2: ULong, a3: ULong, a4: ULong, a5: ULong): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrctl(a1, a2.toLong(), a3.toLong(), a4.toLong(), a5.toLong()).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetrlimit")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetrlimit(a1: Int, a2: Int): Long

public actual fun syscallSysSetrlimit(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetrlimit(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChroot")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChroot(a1: Int): Long

public actual fun syscallSysChroot(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChroot(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGettid")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGettid(): Long

public actual fun syscallSysGettid(): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGettid().toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysTkill")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysTkill(a1: Int, a2: Int): Long

public actual fun syscallSysTkill(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysTkill(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFutex")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFutex(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): Long

public actual fun syscallSysFutex(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFutex(a1, a2, a3, a4, a5, a6).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedGetaffinity")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedGetaffinity(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysSchedGetaffinity(a1: Int, a2: UInt, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedGetaffinity(a1, a2.toInt(), a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents64")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents64(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysGetdents64(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents64(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetTidAddress")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetTidAddress(a1: Int): Long

public actual fun syscallSysSetTidAddress(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetTidAddress(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFadvise")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFadvise(a1: Int, a2: Long, a3: Long, a4: Int): Long

public actual fun syscallSysFadvise(a1: Int, a2: Long, a3: Long, a4: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFadvise(a1, a2, a3, a4).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGettime")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGettime(a1: Int, a2: Int): Long

public actual fun syscallSysClockGettime(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGettime(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGetres")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGetres(a1: Int, a2: Int): Long

public actual fun syscallSysClockGetres(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGetres(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockNanosleep")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockNanosleep(a1: Int, a2: Int, a3: Int, a4: Int): Long

public actual fun syscallSysClockNanosleep(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockNanosleep(a1, a2, a3, a4).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExitGroup")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExitGroup(a1: Int): Long

public actual fun syscallSysExitGroup(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExitGroup(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCtl")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCtl(a1: Int, a2: Int, a3: Int, a4: Int): Long

public actual fun syscallSysEpollCtl(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCtl(a1, a2, a3, a4).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpenat")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpenat(a1: Int, a2: Int, a3: Int, a4: Int): Long

public actual fun syscallSysOpenat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpenat(a1, a2, a3, a4).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdirat")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdirat(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysMkdirat(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdirat(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchownat")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchownat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long

public actual fun syscallSysFchownat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchownat(a1, a2, a3, a4, a5).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatat")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatat(a1: Int, a2: Int, a3: Int, a4: Int): Long

public actual fun syscallSysFstatat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatat(a1, a2, a3, a4).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlinkat")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlinkat(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysUnlinkat(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlinkat(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLinkat")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLinkat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long

public actual fun syscallSysLinkat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLinkat(a1, a2, a3, a4, a5).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlinkat")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlinkat(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysSymlinkat(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlinkat(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlinkat")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlinkat(a1: Int, a2: Int, a3: Int, a4: Int): Long

public actual fun syscallSysReadlinkat(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlinkat(a1, a2, a3, a4.toInt()).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmodat")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmodat(a1: Int, a2: Int, a3: Int, a4: Int): Long

public actual fun syscallSysFchmodat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmodat(a1, a2, a3, a4).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat(a1: Int, a2: Int, a3: Int, a4: Int): Long

public actual fun syscallSysFaccessat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat(a1, a2, a3, a4).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPselect6")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPselect6(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): Long

public actual fun syscallSysPselect6(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPselect6(a1, a2, a3, a4, a5, a6).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPpoll")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPpoll(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long

public actual fun syscallSysPpoll(a1: Int, a2: UInt, a3: Int, a4: Int, a5: UInt): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPpoll(a1, a2.toInt(), a3, a4, a5.toInt()).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtimensat")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtimensat(a1: Int, a2: Int, a3: Int, a4: Int): Long

public actual fun syscallSysUtimensat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtimensat(a1, a2, a3, a4).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollPwait")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollPwait(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): Long

public actual fun syscallSysEpollPwait(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: UInt): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollPwait(a1, a2, a3, a4, a5, a6.toInt()).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd(a1: Int): Long

public actual fun syscallSysEventfd(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept4")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept4(a1: Int, a2: Int, a3: Int, a4: Int): Long

public actual fun syscallSysAccept4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept4(a1, a2, a3, a4).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd2")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd2(a1: Int, a2: Int): Long

public actual fun syscallSysEventfd2(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd2(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCreate1")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCreate1(a1: Int): Long

public actual fun syscallSysEpollCreate1(a1: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCreate1(a1).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup3")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup3(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysDup3(a1: Int, a2: Int, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup3(a1, a2, a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe2")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe2(a1: Int, a2: Int): Long

public actual fun syscallSysPipe2(a1: Int, a2: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe2(a1, a2).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrlimit64")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrlimit64(a1: Int, a2: Int, a3: Int, a4: Int): Long

public actual fun syscallSysPrlimit64(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrlimit64(a1, a2, a3, a4).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRenameat2")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRenameat2(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long

public actual fun syscallSysRenameat2(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRenameat2(a1, a2, a3, a4, a5).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrandom")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrandom(a1: Int, a2: Int, a3: Int): Long

public actual fun syscallSysGetrandom(a1: Int, a2: UInt, a3: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrandom(a1, a2.toInt(), a3).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatx")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatx(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): Long

public actual fun syscallSysStatx(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatx(a1, a2, a3, a4, a5).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat2")
private external fun wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat2(a1: Int, a2: Int, a3: Int, a4: Int): Long

public actual fun syscallSysFaccessat2(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    wasiLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat2(a1, a2, a3, a4).toLong()
