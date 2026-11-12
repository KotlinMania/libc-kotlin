@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun errnoLocation(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxErrnoLocation")

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxStrerrorR")

public actual fun dirfd(dirp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxDirfd")

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxPipe2")

@kotlin.wasm.WasmImport("libc", "libcUnixRedoxGetdtablesize")
private external fun wasiLibcUnixRedoxGetdtablesize(): Int

public actual fun getdtablesize(): CInt =
    wasiLibcUnixRedoxGetdtablesize()

public actual fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxGetresgid")

public actual fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxGetresuid")

@kotlin.wasm.WasmImport("libc", "libcUnixRedoxSetresgid")
private external fun wasiLibcUnixRedoxSetresgid(rgid: Int, egid: Int, sgid: Int): Int

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    wasiLibcUnixRedoxSetresgid(rgid, egid, sgid)

@kotlin.wasm.WasmImport("libc", "libcUnixRedoxSetresuid")
private external fun wasiLibcUnixRedoxSetresuid(ruid: Int, euid: Int, suid: Int): Int

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    wasiLibcUnixRedoxSetresuid(ruid, euid, suid)

public actual fun getgrent(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxGetgrent")

@kotlin.wasm.WasmImport("libc", "libcUnixRedoxSetgrent")
private external fun wasiLibcUnixRedoxSetgrent(): Unit

public actual fun setgrent(): Unit =
    wasiLibcUnixRedoxSetgrent()

@kotlin.wasm.WasmImport("libc", "libcUnixRedoxEndgrent")
private external fun wasiLibcUnixRedoxEndgrent(): Unit

public actual fun endgrent(): Unit =
    wasiLibcUnixRedoxEndgrent()

public actual fun getgrgid(gid: GidT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxGetgrgid")

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxGetgrgidR")

public actual fun getgrnam(name: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxGetgrnam")

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxGetgrnamR")

public actual fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxGetgrouplist")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxMemalign")

public actual fun getnameinfo(addr: ConstPtr, addrlen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxGetnameinfo")

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxPthreadAtfork")

public actual fun pthreadCreate(tid: MutPtr, attr: ConstPtr, start: PthreadCreateStartCallback, arg: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxPthreadCreate")

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxPthreadCondattrSetclock")

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxOpenpty")

public actual fun getpwent(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxGetpwent")

@kotlin.wasm.WasmImport("libc", "libcUnixRedoxSetpwent")
private external fun wasiLibcUnixRedoxSetpwent(): Unit

public actual fun setpwent(): Unit =
    wasiLibcUnixRedoxSetpwent()

@kotlin.wasm.WasmImport("libc", "libcUnixRedoxEndpwent")
private external fun wasiLibcUnixRedoxEndpwent(): Unit

public actual fun endpwent(): Unit =
    wasiLibcUnixRedoxEndpwent()

public actual fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxGetpwnamR")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxGetpwuidR")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxPthreadSigmask")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxPthreadCancel")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxPthreadKill")

public actual fun sigtimedwait(set: ConstPtr, sig: MutPtr, timeout: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxSigtimedwait")

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxSigwait")

public actual fun getsubopt(optionp: MutPtr, tokens: ConstPtr, valuep: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxGetsubopt")

public actual fun mkostemp(template: MutPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxMkostemp")

public actual fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxMkostemps")

public actual fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxReallocarray")

public actual fun renameat2(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxRenameat2")

public actual fun explicitBzero(p: MutPtr, len: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxExplicitBzero")

public actual fun strlcat(dst: MutPtr, src: ConstPtr, siz: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxStrlcat")

public actual fun strlcpy(dst: MutPtr, src: ConstPtr, siz: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxStrlcpy")

@kotlin.wasm.WasmImport("libc", "libcUnixRedoxEpollCreate")
private external fun wasiLibcUnixRedoxEpollCreate(size: Int): Int

public actual fun epollCreate(size: CInt): CInt =
    wasiLibcUnixRedoxEpollCreate(size)

@kotlin.wasm.WasmImport("libc", "libcUnixRedoxEpollCreate1")
private external fun wasiLibcUnixRedoxEpollCreate1(flags: Int): Int

public actual fun epollCreate1(flags: CInt): CInt =
    wasiLibcUnixRedoxEpollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxEpollWait")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxEpollCtl")

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxIoctl")

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxMadvise")

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxMsync")

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxMprotect")

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxShmOpen")

public actual fun shmUnlink(name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxShmUnlink")

@kotlin.wasm.WasmImport("libc", "libcUnixRedoxGetpriority")
private external fun wasiLibcUnixRedoxGetpriority(which: Int, who: Int): Int

public actual fun getpriority(which: CInt, who: IdT): CInt =
    wasiLibcUnixRedoxGetpriority(which, who.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixRedoxSetpriority")
private external fun wasiLibcUnixRedoxSetpriority(which: Int, who: Int, prio: Int): Int

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    wasiLibcUnixRedoxSetpriority(which, who.toInt(), prio)

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxGetrlimit")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxSetrlimit")

public actual fun cmsgData(cmsg: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxCmsgData")

public actual fun cmsgFirsthdr(mhdr: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxCmsgFirsthdr")

public actual fun cmsgNxthdr(mhdr: ConstPtr, cmsg: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxCmsgNxthdr")

public actual fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxBind")

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxRecvfrom")

public actual fun recvmsg(socket: CInt, msg: MutPtr, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxRecvmsg")

public actual fun sendmsg(socket: CInt, msg: ConstPtr, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxSendmsg")

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxFutimens")

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxPreadv")

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxPwritev")

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxReadv")

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxWritev")

public actual fun uname(utsname: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxUname")

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxGettimeofday")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxClockGettime")

public actual fun strftime(s: MutPtr, max: SizeT, format: ConstPtr, tm: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixRedoxStrftime")

@kotlin.wasm.WasmImport("libc", "libcUnixRedoxLoginTty")
private external fun wasiLibcUnixRedoxLoginTty(fd: Int): Int

public actual fun loginTty(fd: CInt): CInt =
    wasiLibcUnixRedoxLoginTty(fd)
