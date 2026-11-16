package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.mem.sizeOfVal
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: MutPtr)
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr): MutPtr
}

// ---- ALLOC -----------------------------------------------------------------------------
public expect fun calloc(nobj: SizeT, size: SizeT): MutPtr

public expect fun malloc(size: SizeT): MutPtr

public expect fun realloc(p: MutPtr, size: SizeT): MutPtr

public expect fun alignedAlloc(align: SizeT, len: SizeT): MutPtr

public expect fun free(p: MutPtr)

public expect fun posixMemalign(memptr: MutPtr, align: SizeT, size: SizeT): CInt

public expect fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr

public expect fun wmemchr(cx: ConstPtr, c: WcharT, n: SizeT): MutPtr

public expect fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt

public expect fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr

// ----- PTHREAD ---------------------------------------------------------------------------
public expect fun pthreadSelf(): PthreadT

public expect fun pthreadJoin(native: PthreadT, value: MutPtr): CInt

// detach or pthreadAttrSetdetachstate must not be called!
// pub fn pthreadDetach(thread: pthreadT) -> cInt;
public expect fun pthreadExit(value: MutPtr): Nothing

public expect fun pthreadAttrInit(attr: MutPtr): CInt

public expect fun pthreadAttrDestroy(attr: MutPtr): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt

public expect fun pthreadAttrSetstacksize(attr: MutPtr, stackSize: SizeT): CInt

public expect fun pthreadAttrGetstacksize(attr: ConstPtr, size: MutPtr): CInt

public expect fun pthreadAttrSettee(attr: MutPtr, ca: CInt, taskId: CInt, shadow: CInt): CInt

// C-TA API do not include this interface, but TA can use.
public expect fun schedYield(): CInt

public expect fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt

public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

public expect fun pthreadGetspecific(key: PthreadKeyT): MutPtr

public expect fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt

public expect fun pthreadMutexDestroy(lock: MutPtr): CInt

public expect fun pthreadMutexInit(lock: MutPtr, attr: ConstPtr): CInt

public expect fun pthreadMutexLock(lock: MutPtr): CInt

public expect fun pthreadMutexTrylock(lock: MutPtr): CInt

public expect fun pthreadMutexUnlock(lock: MutPtr): CInt

public expect fun pthreadMutexattrDestroy(attr: MutPtr): CInt

public expect fun pthreadMutexattrInit(attr: MutPtr): CInt

public expect fun pthreadMutexattrSettype(attr: MutPtr, type: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt

public expect fun pthreadCondBroadcast(cond: MutPtr): CInt

public expect fun pthreadCondDestroy(cond: MutPtr): CInt

public expect fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt

public expect fun pthreadCondSignal(cond: MutPtr): CInt

public expect fun pthreadCondWait(cond: MutPtr, lock: MutPtr): CInt

public expect fun pthreadCondTimedwait(cond: MutPtr, lock: MutPtr, abstime: ConstPtr): CInt

public expect fun pthreadMutexattrSetrobust(attr: MutPtr, robustness: CInt): CInt

public expect fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt

public expect fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr): CInt

public expect fun pthreadSpinLock(lock: MutPtr): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr): CInt

public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt

public expect fun pthreadOnce(pot: MutPtr, f: OnceFn?): CInt

public expect fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt

public expect fun pthreadMutexattrSetprotocol(a: MutPtr, protocol: CInt): CInt

public expect fun pthreadAttrSetstack(attr: MutPtr, stack: MutPtr, size: SizeT): CInt

public expect fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: ConstPtr): CInt

public expect fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: MutPtr): CInt

// stdio.h
public expect fun printf(fmt: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun scanf(fmt: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: MutPtr, n: SizeT, fmt: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: MutPtr, fmt: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun vsnprintf(s: MutPtr, n: SizeT, fmt: ConstPtr, ap: VaList): CInt

public expect fun vsprintf(s: MutPtr, fmt: ConstPtr, ap: VaList): CInt

// Not available.
// pub fn pthreadSetnameNp(thread: pthreadT, name: *const cChar) -> cInt;
public expect fun abort(): Nothing

// Not available.
// pub fn prctl(op: cInt, ...) -> cInt;
public expect fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr): CInt

// sysconf is currently only implemented as a Note.
public expect fun sysconf(name: CInt): CLong

// mman.h
public expect fun mmap(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr

public expect fun munmap(addr: MutPtr, len: SizeT): CInt

// errno.h
public expect fun errnoLocation(): MutPtr

public expect fun strerror(e: CInt): MutPtr

// time.h
public expect fun clockGettime(clockId: ClockidT, tp: MutPtr): CInt

// unistd
public expect fun getpid(): PidT

// time
public expect fun gettimeofday(tv: MutPtr, tz: MutPtr): CInt

public expect fun strftime(restrict: MutPtr, sz: SizeT, restrict_2: ConstPtr, restrict_3: ConstPtr): SizeT

public expect fun time(t: MutPtr): TimeT

// sem
public expect fun semClose(sem: MutPtr): CInt

public expect fun semDestroy(sem: MutPtr): CInt

public expect fun semGetvalue(sem: MutPtr, valp: MutPtr): CInt

public expect fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt

public expect fun semOpen(name: ConstPtr, flags: CInt, vararg variadicArgs: Long): MutPtr

public expect fun semPost(sem: MutPtr): CInt

public expect fun semUnlink(name: ConstPtr): CInt

public expect fun semWait(sem: MutPtr): CInt

// locale
public expect fun setlocale(cat: CInt, name: ConstPtr): MutPtr

public expect fun strcoll(l: ConstPtr, r: ConstPtr): CInt

public expect fun strxfrm(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT

public expect fun strtod(s: ConstPtr, p: MutPtr): CDouble

// multibyte
public expect fun mbrtowc(wc: MutPtr, src: ConstPtr, n: SizeT, st: MutPtr): SizeT

public expect fun wcrtomb(s: MutPtr, wc: WcharT, st: MutPtr): SizeT

public expect fun wctob(c: WintT): CInt

// prng
public expect fun srandom(seed: CUint)

public expect fun initstate(seed: CUint, state: MutPtr, size: SizeT): MutPtr

public expect fun setstate(state: MutPtr): MutPtr

public expect fun random(): CLong

// string
public expect fun strchr(s: ConstPtr, c: CInt): MutPtr

public expect fun strlen(cs: ConstPtr): SizeT

public expect fun strcmp(l: ConstPtr, r: ConstPtr): CInt

public expect fun strcpy(dest: MutPtr, src: ConstPtr): MutPtr

public expect fun strncmp(l: ConstPtr, r: ConstPtr, n: SizeT): CInt

public expect fun strncpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun strnlen(cs: ConstPtr, n: SizeT): SizeT

public expect fun strrchr(s: ConstPtr, c: CInt): MutPtr

public expect fun strstr(h: ConstPtr, n: ConstPtr): MutPtr

public expect fun wcschr(s: ConstPtr, c: WcharT): MutPtr

public expect fun wcslen(s: ConstPtr): SizeT

// ctype
public expect fun isalpha(c: CInt): CInt

public expect fun isascii(c: CInt): CInt

public expect fun isdigit(c: CInt): CInt

public expect fun islower(c: CInt): CInt

public expect fun isprint(c: CInt): CInt

public expect fun isspace(c: CInt): CInt

public expect fun iswctype(wc: WintT, ttype: WctypeT): CInt

public expect fun iswdigit(wc: WintT): CInt

public expect fun iswlower(wc: WintT): CInt

public expect fun iswspace(wc: WintT): CInt

public expect fun iswupper(wc: WintT): CInt

public expect fun towupper(wc: WintT): WintT

public expect fun towlower(wc: WintT): WintT

// cmath
public expect fun atan(x: CDouble): CDouble

public expect fun ceil(x: CDouble): CDouble

public expect fun ceilf(x: CFloat): CFloat

public expect fun exp(x: CDouble): CDouble

public expect fun fabs(x: CDouble): CDouble

public expect fun floor(x: CDouble): CDouble

public expect fun frexp(x: CDouble, e: MutPtr): CDouble

public expect fun log(x: CDouble): CDouble

public expect fun log2(x: CDouble): CDouble

public expect fun pow(x: CDouble, y: CDouble): CDouble

public expect fun roundf(x: CFloat): CFloat

public expect fun scalbn(x: CDouble, n: CInt): CDouble

public expect fun sqrt(x: CDouble): CDouble

// stdlib
public expect fun abs(x: CInt): CInt

public expect fun atof(s: ConstPtr): CDouble

public expect fun atoi(s: ConstPtr): CInt

public expect fun atol(s: ConstPtr): CLong

public expect fun atoll(s: ConstPtr): CLonglong

public expect fun bsearch(key: ConstPtr, base: ConstPtr, nel: SizeT, width: SizeT, cmp: Cmpfunc): MutPtr

public expect fun div(num: CInt, den: CInt): DivT

public expect fun ecvt(x: CDouble, n: CInt, dp: MutPtr, sign: MutPtr): MutPtr

public expect fun imaxabs(a: IntmaxT): IntmaxT

public expect fun llabs(a: CLonglong): CLonglong

public expect fun qsort(base: MutPtr, nel: SizeT, width: SizeT, cmp: Cmpfunc)

public expect fun strtoul(s: ConstPtr, p: MutPtr, base: CInt): CUlong

public expect fun strtol(s: ConstPtr, p: MutPtr, base: CInt): CLong

public expect fun wcstod(s: ConstPtr, p: MutPtr): CDouble

public fun errno(): CInt = (PrimitiveLayouts.I32).readNative((errnoLocation()).rawAddress)

public fun cpuCountS(size: Int, cpuset: CpuSetT): CInt {
    var s: UInt = 0u
    val sizeOfMask = sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    for (i in ((cpuset.bits).slice(0 until (size / sizeOfMask)))) {
        s += i.countOneBits().toUInt()
    }
    return s.toInt()
}

public fun cpuCount(cpuset: CpuSetT): CInt = cpuCountS(sizeOf<CpuSetT>(typeLayoutT = CpuSetT.typeLayout()), cpuset)
