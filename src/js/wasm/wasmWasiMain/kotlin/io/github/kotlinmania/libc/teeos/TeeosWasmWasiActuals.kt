@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosCalloc")

public actual fun malloc(size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosMalloc")

public actual fun realloc(p: MutPtr, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosRealloc")

public actual fun alignedAlloc(align: SizeT, len: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosAlignedAlloc")

public actual fun free(p: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosFree")

public actual fun posixMemalign(memptr: MutPtr, align: SizeT, size: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPosixMemalign")

public actual fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosMemchr")

public actual fun wmemchr(cx: ConstPtr, c: WcharT, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosWmemchr")

public actual fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosMemcmp")

public actual fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosMemcpy")

public actual fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosMemmove")

public actual fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosMemset")

public actual fun pthreadSelf(): PthreadT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadSelf")

public actual fun pthreadJoin(native: PthreadT, value: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadJoin")

public actual fun pthreadExit(value: MutPtr): Nothing =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadExit")

public actual fun pthreadAttrInit(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadAttrInit")

public actual fun pthreadAttrDestroy(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadAttrDestroy")

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadAttrGetstack")

public actual fun pthreadAttrSetstacksize(attr: MutPtr, stackSize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadAttrSetstacksize")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr, size: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadAttrGetstacksize")

public actual fun pthreadAttrSettee(attr: MutPtr, ca: CInt, taskId: CInt, shadow: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadAttrSettee")

@kotlin.wasm.WasmImport("libc", "libcTeeosSchedYield")
private external fun wasiLibcTeeosSchedYield(): Int

public actual fun schedYield(): CInt =
    wasiLibcTeeosSchedYield()

public actual fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadKeyCreate")

@kotlin.wasm.WasmImport("libc", "libcTeeosPthreadKeyDelete")
private external fun wasiLibcTeeosPthreadKeyDelete(key: Int): Int

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    wasiLibcTeeosPthreadKeyDelete(key.toInt())

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadGetspecific")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadSetspecific")

public actual fun pthreadMutexDestroy(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexDestroy")

public actual fun pthreadMutexInit(lock: MutPtr, attr: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexInit")

public actual fun pthreadMutexLock(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexLock")

public actual fun pthreadMutexTrylock(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexTrylock")

public actual fun pthreadMutexUnlock(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexUnlock")

public actual fun pthreadMutexattrDestroy(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexattrDestroy")

public actual fun pthreadMutexattrInit(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexattrInit")

public actual fun pthreadMutexattrSettype(attr: MutPtr, type: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexattrSettype")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexattrSetpshared")

public actual fun pthreadCondBroadcast(cond: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadCondBroadcast")

public actual fun pthreadCondDestroy(cond: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadCondDestroy")

public actual fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadCondInit")

public actual fun pthreadCondSignal(cond: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadCondSignal")

public actual fun pthreadCondWait(cond: MutPtr, lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadCondWait")

public actual fun pthreadCondTimedwait(cond: MutPtr, lock: MutPtr, abstime: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadCondTimedwait")

public actual fun pthreadMutexattrSetrobust(attr: MutPtr, robustness: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexattrSetrobust")

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadCreate")

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadSpinInit")

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadSpinDestroy")

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadSpinLock")

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadSpinTrylock")

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadSpinUnlock")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadSetschedprio")

public actual fun pthreadOnce(pot: MutPtr, f: OnceFn?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadOnce")

public actual fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadEqual")

public actual fun pthreadMutexattrSetprotocol(a: MutPtr, protocol: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadMutexattrSetprotocol")

public actual fun pthreadAttrSetstack(attr: MutPtr, stack: MutPtr, size: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadAttrSetstack")

public actual fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadSetaffinityNp")

public actual fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPthreadGetaffinityNp")

public actual fun printf(fmt: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosPrintf")

public actual fun scanf(fmt: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosScanf")

public actual fun snprintf(s: MutPtr, n: SizeT, fmt: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSnprintf")

public actual fun sprintf(s: MutPtr, fmt: ConstPtr, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSprintf")

public actual fun vsnprintf(s: MutPtr, n: SizeT, fmt: ConstPtr, ap: VaList): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosVsnprintf")

public actual fun vsprintf(s: MutPtr, fmt: ConstPtr, ap: VaList): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosVsprintf")

@kotlin.wasm.WasmImport("libc", "libcTeeosAbort")
private external fun wasiLibcTeeosAbort(): Unit

public actual fun abort(): Nothing {
    wasiLibcTeeosAbort()
    error("C noreturn function libcTeeosAbort returned")
}

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSchedGetaffinity")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSchedSetaffinity")

@kotlin.wasm.WasmImport("libc", "libcTeeosSysconf")
private external fun wasiLibcTeeosSysconf(name: Int): Long

public actual fun sysconf(name: CInt): CLong =
    wasiLibcTeeosSysconf(name)

public actual fun mmap(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosMmap")

public actual fun munmap(addr: MutPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosMunmap")

public actual fun errnoLocation(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosErrnoLocation")

public actual fun strerror(e: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrerror")

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosClockGettime")

@kotlin.wasm.WasmImport("libc", "libcTeeosGetpid")
private external fun wasiLibcTeeosGetpid(): Int

public actual fun getpid(): PidT =
    wasiLibcTeeosGetpid()

public actual fun gettimeofday(tv: MutPtr, tz: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosGettimeofday")

public actual fun strftime(restrict: MutPtr, sz: SizeT, restrict_2: ConstPtr, restrict_3: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrftime")

public actual fun time(t: MutPtr): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosTime")

public actual fun semClose(sem: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSemClose")

public actual fun semDestroy(sem: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSemDestroy")

public actual fun semGetvalue(sem: MutPtr, valp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSemGetvalue")

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSemInit")

public actual fun semOpen(name: ConstPtr, flags: CInt, vararg variadicArgs: Long): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSemOpen")

public actual fun semPost(sem: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSemPost")

public actual fun semUnlink(name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSemUnlink")

public actual fun semWait(sem: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSemWait")

public actual fun setlocale(cat: CInt, name: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSetlocale")

public actual fun strcoll(l: ConstPtr, r: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrcoll")

public actual fun strxfrm(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrxfrm")

public actual fun strtod(s: ConstPtr, p: MutPtr): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrtod")

public actual fun mbrtowc(wc: MutPtr, src: ConstPtr, n: SizeT, st: MutPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosMbrtowc")

public actual fun wcrtomb(s: MutPtr, wc: WcharT, st: MutPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosWcrtomb")

@kotlin.wasm.WasmImport("libc", "libcTeeosWctob")
private external fun wasiLibcTeeosWctob(c: Int): Int

public actual fun wctob(c: WintT): CInt =
    wasiLibcTeeosWctob(c.toInt())

@kotlin.wasm.WasmImport("libc", "libcTeeosSrandom")
private external fun wasiLibcTeeosSrandom(seed: Int): Unit

public actual fun srandom(seed: CUint): Unit =
    wasiLibcTeeosSrandom(seed.toInt())

public actual fun initstate(seed: CUint, state: MutPtr, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosInitstate")

public actual fun setstate(state: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosSetstate")

@kotlin.wasm.WasmImport("libc", "libcTeeosRandom")
private external fun wasiLibcTeeosRandom(): Long

public actual fun random(): CLong =
    wasiLibcTeeosRandom()

public actual fun strchr(s: ConstPtr, c: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrchr")

public actual fun strlen(cs: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrlen")

public actual fun strcmp(l: ConstPtr, r: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrcmp")

public actual fun strcpy(dest: MutPtr, src: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrcpy")

public actual fun strncmp(l: ConstPtr, r: ConstPtr, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrncmp")

public actual fun strncpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrncpy")

public actual fun strnlen(cs: ConstPtr, n: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrnlen")

public actual fun strrchr(s: ConstPtr, c: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrrchr")

public actual fun strstr(h: ConstPtr, n: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrstr")

public actual fun wcschr(s: ConstPtr, c: WcharT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosWcschr")

public actual fun wcslen(s: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosWcslen")

@kotlin.wasm.WasmImport("libc", "libcTeeosIsalpha")
private external fun wasiLibcTeeosIsalpha(c: Int): Int

public actual fun isalpha(c: CInt): CInt =
    wasiLibcTeeosIsalpha(c)

@kotlin.wasm.WasmImport("libc", "libcTeeosIsascii")
private external fun wasiLibcTeeosIsascii(c: Int): Int

public actual fun isascii(c: CInt): CInt =
    wasiLibcTeeosIsascii(c)

@kotlin.wasm.WasmImport("libc", "libcTeeosIsdigit")
private external fun wasiLibcTeeosIsdigit(c: Int): Int

public actual fun isdigit(c: CInt): CInt =
    wasiLibcTeeosIsdigit(c)

@kotlin.wasm.WasmImport("libc", "libcTeeosIslower")
private external fun wasiLibcTeeosIslower(c: Int): Int

public actual fun islower(c: CInt): CInt =
    wasiLibcTeeosIslower(c)

@kotlin.wasm.WasmImport("libc", "libcTeeosIsprint")
private external fun wasiLibcTeeosIsprint(c: Int): Int

public actual fun isprint(c: CInt): CInt =
    wasiLibcTeeosIsprint(c)

@kotlin.wasm.WasmImport("libc", "libcTeeosIsspace")
private external fun wasiLibcTeeosIsspace(c: Int): Int

public actual fun isspace(c: CInt): CInt =
    wasiLibcTeeosIsspace(c)

@kotlin.wasm.WasmImport("libc", "libcTeeosIswctype")
private external fun wasiLibcTeeosIswctype(wc: Int, ttype: Long): Int

public actual fun iswctype(wc: WintT, ttype: WctypeT): CInt =
    wasiLibcTeeosIswctype(wc.toInt(), ttype.toLong())

@kotlin.wasm.WasmImport("libc", "libcTeeosIswdigit")
private external fun wasiLibcTeeosIswdigit(wc: Int): Int

public actual fun iswdigit(wc: WintT): CInt =
    wasiLibcTeeosIswdigit(wc.toInt())

@kotlin.wasm.WasmImport("libc", "libcTeeosIswlower")
private external fun wasiLibcTeeosIswlower(wc: Int): Int

public actual fun iswlower(wc: WintT): CInt =
    wasiLibcTeeosIswlower(wc.toInt())

@kotlin.wasm.WasmImport("libc", "libcTeeosIswspace")
private external fun wasiLibcTeeosIswspace(wc: Int): Int

public actual fun iswspace(wc: WintT): CInt =
    wasiLibcTeeosIswspace(wc.toInt())

@kotlin.wasm.WasmImport("libc", "libcTeeosIswupper")
private external fun wasiLibcTeeosIswupper(wc: Int): Int

public actual fun iswupper(wc: WintT): CInt =
    wasiLibcTeeosIswupper(wc.toInt())

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
    wasiLibcTeeosAtan(x)

@kotlin.wasm.WasmImport("libc", "libcTeeosCeil")
private external fun wasiLibcTeeosCeil(x: Double): Double

public actual fun ceil(x: CDouble): CDouble =
    wasiLibcTeeosCeil(x)

@kotlin.wasm.WasmImport("libc", "libcTeeosCeilf")
private external fun wasiLibcTeeosCeilf(x: Float): Float

public actual fun ceilf(x: CFloat): CFloat =
    wasiLibcTeeosCeilf(x)

@kotlin.wasm.WasmImport("libc", "libcTeeosExp")
private external fun wasiLibcTeeosExp(x: Double): Double

public actual fun exp(x: CDouble): CDouble =
    wasiLibcTeeosExp(x)

@kotlin.wasm.WasmImport("libc", "libcTeeosFabs")
private external fun wasiLibcTeeosFabs(x: Double): Double

public actual fun fabs(x: CDouble): CDouble =
    wasiLibcTeeosFabs(x)

@kotlin.wasm.WasmImport("libc", "libcTeeosFloor")
private external fun wasiLibcTeeosFloor(x: Double): Double

public actual fun floor(x: CDouble): CDouble =
    wasiLibcTeeosFloor(x)

public actual fun frexp(x: CDouble, e: MutPtr): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosFrexp")

@kotlin.wasm.WasmImport("libc", "libcTeeosLog")
private external fun wasiLibcTeeosLog(x: Double): Double

public actual fun log(x: CDouble): CDouble =
    wasiLibcTeeosLog(x)

@kotlin.wasm.WasmImport("libc", "libcTeeosLog2")
private external fun wasiLibcTeeosLog2(x: Double): Double

public actual fun log2(x: CDouble): CDouble =
    wasiLibcTeeosLog2(x)

@kotlin.wasm.WasmImport("libc", "libcTeeosPow")
private external fun wasiLibcTeeosPow(x: Double, y: Double): Double

public actual fun pow(x: CDouble, y: CDouble): CDouble =
    wasiLibcTeeosPow(x, y)

@kotlin.wasm.WasmImport("libc", "libcTeeosRoundf")
private external fun wasiLibcTeeosRoundf(x: Float): Float

public actual fun roundf(x: CFloat): CFloat =
    wasiLibcTeeosRoundf(x)

@kotlin.wasm.WasmImport("libc", "libcTeeosScalbn")
private external fun wasiLibcTeeosScalbn(x: Double, n: Int): Double

public actual fun scalbn(x: CDouble, n: CInt): CDouble =
    wasiLibcTeeosScalbn(x, n)

@kotlin.wasm.WasmImport("libc", "libcTeeosSqrt")
private external fun wasiLibcTeeosSqrt(x: Double): Double

public actual fun sqrt(x: CDouble): CDouble =
    wasiLibcTeeosSqrt(x)

@kotlin.wasm.WasmImport("libc", "libcTeeosAbs")
private external fun wasiLibcTeeosAbs(x: Int): Int

public actual fun abs(x: CInt): CInt =
    wasiLibcTeeosAbs(x)

public actual fun atof(s: ConstPtr): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosAtof")

public actual fun atoi(s: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosAtoi")

public actual fun atol(s: ConstPtr): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosAtol")

public actual fun atoll(s: ConstPtr): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosAtoll")

public actual fun bsearch(key: ConstPtr, base: ConstPtr, nel: SizeT, width: SizeT, cmp: Cmpfunc): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosBsearch")

public actual fun div(num: CInt, den: CInt): DivT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosDiv")

public actual fun ecvt(x: CDouble, n: CInt, dp: MutPtr, sign: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosEcvt")

@kotlin.wasm.WasmImport("libc", "libcTeeosImaxabs")
private external fun wasiLibcTeeosImaxabs(a: Long): Long

public actual fun imaxabs(a: IntmaxT): IntmaxT =
    wasiLibcTeeosImaxabs(a)

@kotlin.wasm.WasmImport("libc", "libcTeeosLlabs")
private external fun wasiLibcTeeosLlabs(a: Long): Long

public actual fun llabs(a: CLonglong): CLonglong =
    wasiLibcTeeosLlabs(a)

public actual fun qsort(base: MutPtr, nel: SizeT, width: SizeT, cmp: Cmpfunc): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosQsort")

public actual fun strtoul(s: ConstPtr, p: MutPtr, base: CInt): CUlong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrtoul")

public actual fun strtol(s: ConstPtr, p: MutPtr, base: CInt): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosStrtol")

public actual fun wcstod(s: ConstPtr, p: MutPtr): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcTeeosWcstod")
