@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.solarish.illumos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.solarish.CaddrT
import io.github.kotlinmania.libc.unix.solarish.IdT
import io.github.kotlinmania.libc.unix.solarish.Itimerspec
import io.github.kotlinmania.libc.unix.solarish.OffT
import io.github.kotlinmania.libc.unix.solarish.PosixSpawnFileActionsT
import io.github.kotlinmania.libc.unix.solarish.PsetidT
import io.github.kotlinmania.libc.unix.solarish.PthreadAttrT
import io.github.kotlinmania.libc.unix.solarish.PthreadT
import io.github.kotlinmania.libc.unix.solarish.SigsetT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
@kotlin.wasm.WasmImport("libc", "libcUnixSolarishIllumosEventfd")
private external fun wasiLibcUnixSolarishIllumosEventfd(initval: Int, flags: Int): Int

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    wasiLibcUnixSolarishIllumosEventfd(initval.toInt(), flags).toInt()

public actual fun epollPwait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt, sigmask: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosEpollPwait")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishIllumosEpollCreate")
private external fun wasiLibcUnixSolarishIllumosEpollCreate(size: Int): Int

public actual fun epollCreate(size: CInt): CInt =
    wasiLibcUnixSolarishIllumosEpollCreate(size).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishIllumosEpollCreate1")
private external fun wasiLibcUnixSolarishIllumosEpollCreate1(flags: Int): Int

public actual fun epollCreate1(flags: CInt): CInt =
    wasiLibcUnixSolarishIllumosEpollCreate1(flags).toInt()

public actual fun epollWait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosEpollWait")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr<EpollEvent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosEpollCtl")

public actual fun mincore(addr: CaddrT, len: SizeT, vec: MutPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosMincore")

public actual fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: MutPtr<PsetidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosPsetBindLwp")

public actual fun psetGetloadavg(pset: PsetidT, load: MutPtr<CDouble>, num: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosPsetGetloadavg")

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosPthreadAttrGetNp")

public actual fun pthreadAttrGetstackaddr(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosPthreadAttrGetstackaddr")

public actual fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>, stacksize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosPthreadAttrSetstack")

public actual fun pthreadAttrSetstackaddr(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosPthreadAttrSetstackaddr")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishIllumosPosixFadvise")
private external fun wasiLibcUnixSolarishIllumosPosixFadvise(fd: Int, offset: Long, len: Long, advice: Int): Int

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    wasiLibcUnixSolarishIllumosPosixFadvise(fd, offset, len, advice).toInt()

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosPreadv")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosPwritev")

public actual fun getpagesizes2(pagesize: MutPtr<SizeT>, nelem: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosGetpagesizes2")

public actual fun posixSpawnFileActionsAddfchdirNp(fileActions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosPosixSpawnFileActionsAddfchdirNp")

public actual fun ptsnameR(fildes: CInt, name: MutPtr<CChar>, namelen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosPtsnameR")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishIllumosSyncfs")
private external fun wasiLibcUnixSolarishIllumosSyncfs(fd: Int): Int

public actual fun syncfs(fd: CInt): CInt =
    wasiLibcUnixSolarishIllumosSyncfs(fd).toInt()

public actual fun strcasecmpL(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, loc: LocaleT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosStrcasecmpL")

public actual fun strncasecmpL(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT, loc: LocaleT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosStrncasecmpL")

@kotlin.wasm.WasmImport("libc", "libcUnixSolarishIllumosTimerfdCreate")
private external fun wasiLibcUnixSolarishIllumosTimerfdCreate(clockid: Int, flags: Int): Int

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    wasiLibcUnixSolarishIllumosTimerfdCreate(clockid, flags).toInt()

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosTimerfdGettime")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishIllumosTimerfdSettime")
