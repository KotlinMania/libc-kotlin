@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosCalloc")

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosMalloc")

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosRealloc")

public actual fun alignedAlloc(align: SizeT, len: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosAlignedAlloc")

public actual fun free(p: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosFree")

public actual fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, align: SizeT, size: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPosixMemalign")

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosMemchr")

public actual fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosWmemchr")

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosMemcmp")

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosMemcpy")

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosMemmove")

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosMemset")

public actual fun pthreadSelf(): PthreadT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadSelf")

public actual fun pthreadJoin(native: PthreadT, value: MutPtr<MutPtr<CVoid>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadJoin")

public actual fun pthreadExit(value: MutPtr<CVoid>): Nothing =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadExit")

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadAttrInit")

public actual fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadAttrDestroy")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadAttrGetstack")

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stackSize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadAttrSetstacksize")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, size: MutPtr<SizeT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadAttrGetstacksize")

public actual fun pthreadAttrSettee(attr: MutPtr<PthreadAttrT>, ca: CInt, taskId: CInt, shadow: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadAttrSettee")

@kotlin.wasm.WasmImport("libc", "libcTeeosSchedYield")
private external fun wasiLibcTeeosSchedYield(): Int

public actual fun schedYield(): CInt =
    wasiLibcTeeosSchedYield().toInt()

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadKeyCreate")

@kotlin.wasm.WasmImport("libc", "libcTeeosPthreadKeyDelete")
private external fun wasiLibcTeeosPthreadKeyDelete(key: Int): Int

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    wasiLibcTeeosPthreadKeyDelete(key.toInt()).toInt()

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadGetspecific")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadSetspecific")

public actual fun pthreadMutexDestroy(lock: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexDestroy")

public actual fun pthreadMutexInit(lock: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexInit")

public actual fun pthreadMutexLock(lock: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexLock")

public actual fun pthreadMutexTrylock(lock: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexTrylock")

public actual fun pthreadMutexUnlock(lock: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexUnlock")

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexattrDestroy")

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexattrInit")

public actual fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, type: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexattrSettype")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexattrSetpshared")

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadCondBroadcast")

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadCondDestroy")

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadCondInit")

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadCondSignal")

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadCondWait")

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadCondTimedwait")

public actual fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robustness: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexattrSetrobust")

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadCreate")

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadSpinInit")

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadSpinDestroy")

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadSpinLock")

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadSpinTrylock")

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadSpinUnlock")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadSetschedprio")

public actual fun pthreadOnce(pot: MutPtr<PthreadOnceT>, f: OnceFn?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadOnce")

public actual fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadEqual")

public actual fun pthreadMutexattrSetprotocol(a: MutPtr<PthreadMutexattrT>, protocol: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexattrSetprotocol")

public actual fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stack: MutPtr<CVoid>, size: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadAttrSetstack")

public actual fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: ConstPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadSetaffinityNp")

public actual fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: MutPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadGetaffinityNp")

public actual fun printf(fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPrintf")

public actual fun scanf(fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosScanf")

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSnprintf")

public actual fun sprintf(s: MutPtr<CChar>, fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSprintf")

public actual fun vsnprintf(s: MutPtr<CChar>, n: SizeT, fmt: ConstPtr<CChar>, ap: VaList): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosVsnprintf")

public actual fun vsprintf(s: MutPtr<CChar>, fmt: ConstPtr<CChar>, ap: VaList): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosVsprintf")

@kotlin.wasm.WasmImport("libc", "libcTeeosAbort")
private external fun wasiLibcTeeosAbort(): Unit

public actual fun abort(): Nothing {
    wasiLibcTeeosAbort()
    error("C noreturn function libcTeeosAbort returned")
}

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSchedGetaffinity")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSchedSetaffinity")

@kotlin.wasm.WasmImport("libc", "libcTeeosSysconf")
private external fun wasiLibcTeeosSysconf(name: Int): Long

public actual fun sysconf(name: CInt): CLong =
    wasiLibcTeeosSysconf(name).toLong()

public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosMmap")

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosMunmap")

public actual fun errnoLocation(): MutPtr<CInt> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosErrnoLocation")

public actual fun strerror(e: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrerror")

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosClockGettime")

@kotlin.wasm.WasmImport("libc", "libcTeeosGetpid")
private external fun wasiLibcTeeosGetpid(): Int

public actual fun getpid(): PidT =
    wasiLibcTeeosGetpid().toInt()

public actual fun gettimeofday(tv: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosGettimeofday")

public actual fun strftime(restrict: MutPtr<CChar>, sz: SizeT, restrict_2: ConstPtr<CChar>, restrict_3: ConstPtr<Tm>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrftime")

public actual fun time(t: MutPtr<TimeT>): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosTime")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSemClose")

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSemDestroy")

public actual fun semGetvalue(sem: MutPtr<SemT>, valp: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSemGetvalue")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSemInit")

public actual fun semOpen(name: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSemOpen")

public actual fun semPost(sem: MutPtr<SemT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSemPost")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSemUnlink")

public actual fun semWait(sem: MutPtr<SemT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSemWait")

public actual fun setlocale(cat: CInt, name: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSetlocale")

public actual fun strcoll(l: ConstPtr<CChar>, r: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrcoll")

public actual fun strxfrm(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrxfrm")

public actual fun strtod(s: ConstPtr<CChar>, p: MutPtr<MutPtr<CChar>>): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrtod")

public actual fun mbrtowc(wc: MutPtr<WcharT>, src: ConstPtr<CChar>, n: SizeT, st: MutPtr<MbstateT>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosMbrtowc")

public actual fun wcrtomb(s: MutPtr<CChar>, wc: WcharT, st: MutPtr<MbstateT>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosWcrtomb")

@kotlin.wasm.WasmImport("libc", "libcTeeosWctob")
private external fun wasiLibcTeeosWctob(c: Int): Int

public actual fun wctob(c: WintT): CInt =
    wasiLibcTeeosWctob(c.toInt()).toInt()

@kotlin.wasm.WasmImport("libc", "libcTeeosSrandom")
private external fun wasiLibcTeeosSrandom(seed: Int): Unit

public actual fun srandom(seed: CUint): Unit =
    wasiLibcTeeosSrandom(seed.toInt())

public actual fun initstate(seed: CUint, state: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosInitstate")

public actual fun setstate(state: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSetstate")

@kotlin.wasm.WasmImport("libc", "libcTeeosRandom")
private external fun wasiLibcTeeosRandom(): Long

public actual fun random(): CLong =
    wasiLibcTeeosRandom().toLong()

public actual fun strchr(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrchr")

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrlen")

public actual fun strcmp(l: ConstPtr<CChar>, r: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrcmp")

public actual fun strcpy(dest: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrcpy")

public actual fun strncmp(l: ConstPtr<CChar>, r: ConstPtr<CChar>, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrncmp")

public actual fun strncpy(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrncpy")

public actual fun strnlen(cs: ConstPtr<CChar>, n: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrnlen")

public actual fun strrchr(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrrchr")

public actual fun strstr(h: ConstPtr<CChar>, n: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrstr")

public actual fun wcschr(s: ConstPtr<WcharT>, c: WcharT): MutPtr<WcharT> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosWcschr")

public actual fun wcslen(s: ConstPtr<WcharT>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosWcslen")

@kotlin.wasm.WasmImport("libc", "libcTeeosIsalpha")
private external fun wasiLibcTeeosIsalpha(c: Int): Int

public actual fun isalpha(c: CInt): CInt =
    wasiLibcTeeosIsalpha(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcTeeosIsascii")
private external fun wasiLibcTeeosIsascii(c: Int): Int

public actual fun isascii(c: CInt): CInt =
    wasiLibcTeeosIsascii(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcTeeosIsdigit")
private external fun wasiLibcTeeosIsdigit(c: Int): Int

public actual fun isdigit(c: CInt): CInt =
    wasiLibcTeeosIsdigit(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcTeeosIslower")
private external fun wasiLibcTeeosIslower(c: Int): Int

public actual fun islower(c: CInt): CInt =
    wasiLibcTeeosIslower(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcTeeosIsprint")
private external fun wasiLibcTeeosIsprint(c: Int): Int

public actual fun isprint(c: CInt): CInt =
    wasiLibcTeeosIsprint(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcTeeosIsspace")
private external fun wasiLibcTeeosIsspace(c: Int): Int

public actual fun isspace(c: CInt): CInt =
    wasiLibcTeeosIsspace(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcTeeosIswctype")
private external fun wasiLibcTeeosIswctype(wc: Int, ttype: Long): Int

public actual fun iswctype(wc: WintT, ttype: WctypeT): CInt =
    wasiLibcTeeosIswctype(wc.toInt(), ttype.toLong()).toInt()

@kotlin.wasm.WasmImport("libc", "libcTeeosIswdigit")
private external fun wasiLibcTeeosIswdigit(wc: Int): Int

public actual fun iswdigit(wc: WintT): CInt =
    wasiLibcTeeosIswdigit(wc.toInt()).toInt()

@kotlin.wasm.WasmImport("libc", "libcTeeosIswlower")
private external fun wasiLibcTeeosIswlower(wc: Int): Int

public actual fun iswlower(wc: WintT): CInt =
    wasiLibcTeeosIswlower(wc.toInt()).toInt()

@kotlin.wasm.WasmImport("libc", "libcTeeosIswspace")
private external fun wasiLibcTeeosIswspace(wc: Int): Int

public actual fun iswspace(wc: WintT): CInt =
    wasiLibcTeeosIswspace(wc.toInt()).toInt()

@kotlin.wasm.WasmImport("libc", "libcTeeosIswupper")
private external fun wasiLibcTeeosIswupper(wc: Int): Int

public actual fun iswupper(wc: WintT): CInt =
    wasiLibcTeeosIswupper(wc.toInt()).toInt()

@kotlin.wasm.WasmImport("libc", "libcTeeosTowupper")
private external fun wasiLibcTeeosTowupper(wc: Int): Int

public actual fun towupper(wc: WintT): WintT =
    wasiLibcTeeosTowupper(wc.toInt()).toUInt()

@kotlin.wasm.WasmImport("libc", "libcTeeosTowlower")
private external fun wasiLibcTeeosTowlower(wc: Int): Int

public actual fun towlower(wc: WintT): WintT =
    wasiLibcTeeosTowlower(wc.toInt()).toUInt()

@kotlin.wasm.WasmImport("libc", "libcTeeosAtan")
private external fun wasiLibcTeeosAtan(x: Double): Double

public actual fun atan(x: CDouble): CDouble =
    wasiLibcTeeosAtan(x).toDouble()

@kotlin.wasm.WasmImport("libc", "libcTeeosCeil")
private external fun wasiLibcTeeosCeil(x: Double): Double

public actual fun ceil(x: CDouble): CDouble =
    wasiLibcTeeosCeil(x).toDouble()

@kotlin.wasm.WasmImport("libc", "libcTeeosCeilf")
private external fun wasiLibcTeeosCeilf(x: Float): Float

public actual fun ceilf(x: CFloat): CFloat =
    wasiLibcTeeosCeilf(x).toFloat()

@kotlin.wasm.WasmImport("libc", "libcTeeosExp")
private external fun wasiLibcTeeosExp(x: Double): Double

public actual fun exp(x: CDouble): CDouble =
    wasiLibcTeeosExp(x).toDouble()

@kotlin.wasm.WasmImport("libc", "libcTeeosFabs")
private external fun wasiLibcTeeosFabs(x: Double): Double

public actual fun fabs(x: CDouble): CDouble =
    wasiLibcTeeosFabs(x).toDouble()

@kotlin.wasm.WasmImport("libc", "libcTeeosFloor")
private external fun wasiLibcTeeosFloor(x: Double): Double

public actual fun floor(x: CDouble): CDouble =
    wasiLibcTeeosFloor(x).toDouble()

public actual fun frexp(x: CDouble, e: MutPtr<CInt>): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosFrexp")

@kotlin.wasm.WasmImport("libc", "libcTeeosLog")
private external fun wasiLibcTeeosLog(x: Double): Double

public actual fun log(x: CDouble): CDouble =
    wasiLibcTeeosLog(x).toDouble()

@kotlin.wasm.WasmImport("libc", "libcTeeosLog2")
private external fun wasiLibcTeeosLog2(x: Double): Double

public actual fun log2(x: CDouble): CDouble =
    wasiLibcTeeosLog2(x).toDouble()

@kotlin.wasm.WasmImport("libc", "libcTeeosPow")
private external fun wasiLibcTeeosPow(x: Double, y: Double): Double

public actual fun pow(x: CDouble, y: CDouble): CDouble =
    wasiLibcTeeosPow(x, y).toDouble()

@kotlin.wasm.WasmImport("libc", "libcTeeosRoundf")
private external fun wasiLibcTeeosRoundf(x: Float): Float

public actual fun roundf(x: CFloat): CFloat =
    wasiLibcTeeosRoundf(x).toFloat()

@kotlin.wasm.WasmImport("libc", "libcTeeosScalbn")
private external fun wasiLibcTeeosScalbn(x: Double, n: Int): Double

public actual fun scalbn(x: CDouble, n: CInt): CDouble =
    wasiLibcTeeosScalbn(x, n).toDouble()

@kotlin.wasm.WasmImport("libc", "libcTeeosSqrt")
private external fun wasiLibcTeeosSqrt(x: Double): Double

public actual fun sqrt(x: CDouble): CDouble =
    wasiLibcTeeosSqrt(x).toDouble()

@kotlin.wasm.WasmImport("libc", "libcTeeosAbs")
private external fun wasiLibcTeeosAbs(x: Int): Int

public actual fun abs(x: CInt): CInt =
    wasiLibcTeeosAbs(x).toInt()

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosAtof")

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosAtoi")

public actual fun atol(s: ConstPtr<CChar>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosAtol")

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosAtoll")

public actual fun bsearch(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nel: SizeT, width: SizeT, cmp: Cmpfunc): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosBsearch")

public actual fun div(num: CInt, den: CInt): DivT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosDiv")

public actual fun ecvt(x: CDouble, n: CInt, dp: MutPtr<CInt>, sign: MutPtr<CInt>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosEcvt")

@kotlin.wasm.WasmImport("libc", "libcTeeosImaxabs")
private external fun wasiLibcTeeosImaxabs(a: Long): Long

public actual fun imaxabs(a: IntmaxT): IntmaxT =
    wasiLibcTeeosImaxabs(a).toLong()

@kotlin.wasm.WasmImport("libc", "libcTeeosLlabs")
private external fun wasiLibcTeeosLlabs(a: Long): Long

public actual fun llabs(a: CLonglong): CLonglong =
    wasiLibcTeeosLlabs(a).toLong()

public actual fun qsort(base: MutPtr<CVoid>, nel: SizeT, width: SizeT, cmp: Cmpfunc): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosQsort")

public actual fun strtoul(s: ConstPtr<CChar>, p: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrtoul")

public actual fun strtol(s: ConstPtr<CChar>, p: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrtol")

public actual fun wcstod(s: ConstPtr<WcharT>, p: MutPtr<MutPtr<WcharT>>): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosWcstod")
