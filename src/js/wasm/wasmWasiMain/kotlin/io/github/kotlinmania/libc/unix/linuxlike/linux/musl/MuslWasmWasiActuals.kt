@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.Tm
import io.github.kotlinmania.libc.unix.linuxlike.linux.PosixSpawnFileActionsT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslGetrlimit")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslSetrlimit")

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: ConstPtr<Rlimit>, oldLimit: MutPtr<Rlimit>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslPrlimit")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslGettimeofday")

public actual fun ptrace(request: CInt, vararg variadicArgs: Long): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslPtrace")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslGetpriority")
private external fun wasiLibcUnixLinuxlikeLinuxMuslGetpriority(which: Int, who: Int): Int

public actual fun getpriority(which: CInt, who: IdT): CInt =
    wasiLibcUnixLinuxlikeLinuxMuslGetpriority(which, who.toInt()).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslSetpriority")
private external fun wasiLibcUnixLinuxlikeLinuxMuslSetpriority(which: Int, who: Int, prio: Int): Int

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxMuslSetpriority(which, who.toInt(), prio).toInt()

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: CUlonglong, dirfd: CInt, path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslFanotifyMark")

public actual fun preadv2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslPreadv2")

public actual fun pwritev2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslPwritev2")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslGetauxval")
private external fun wasiLibcUnixLinuxlikeLinuxMuslGetauxval(type: Long): Long

public actual fun getauxval(type: CUlong): CUlong =
    wasiLibcUnixLinuxlikeLinuxMuslGetauxval(type.toLong()).toULong()

public actual fun explicitBzero(s: MutPtr<CVoid>, len: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslExplicitBzero")

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslReallocarray")

public actual fun adjtimex(buf: MutPtr<Timex>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslAdjtimex")

public actual fun clockAdjtime(clkId: ClockidT, buf: MutPtr<Timex>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslClockAdjtime")

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslCtermid")

public actual fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslMemfdCreate")

public actual fun mlock2(addr: ConstPtr<CVoid>, len: SizeT, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslMlock2")

public actual fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslMallocUsableSize")

public actual fun euidaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslEuidaccess")

public actual fun eaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslEaccess")

public actual fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslAsctimeR")

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslDirname")

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslBasename")

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslGetrandom")

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddchdirNp")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslPosixSpawnFileActionsAddfchdirNp")

public actual fun getutxent(): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslGetutxent")

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslGetutxid")

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslGetutxline")

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslPututxline")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslSetutxent")
private external fun wasiLibcUnixLinuxlikeLinuxMuslSetutxent(): Unit

public actual fun setutxent(): Unit =
    wasiLibcUnixLinuxlikeLinuxMuslSetutxent()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMuslEndutxent")
private external fun wasiLibcUnixLinuxlikeLinuxMuslEndutxent(): Unit

public actual fun endutxent(): Unit =
    wasiLibcUnixLinuxlikeLinuxMuslEndutxent()

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslUtmpxname")

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslPthreadTryjoinNp")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMuslPthreadTimedjoinNp")
