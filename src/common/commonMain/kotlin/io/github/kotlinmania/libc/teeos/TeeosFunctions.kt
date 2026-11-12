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
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.mem.sizeOfVal
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>)
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>): MutPtr<CVoid>
}

// ---- ALLOC -----------------------------------------------------------------------------
public expect fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun malloc(size: SizeT): MutPtr<CVoid>

public expect fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid>

public expect fun alignedAlloc(align: SizeT, len: SizeT): MutPtr<CVoid>

public expect fun free(p: MutPtr<CVoid>)

public expect fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, align: SizeT, size: SizeT): CInt

public expect fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT>

public expect fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt

public expect fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid>

public expect fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid>

public expect fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

// ----- PTHREAD ---------------------------------------------------------------------------
public expect fun pthreadSelf(): PthreadT

public expect fun pthreadJoin(native: PthreadT, value: MutPtr<MutPtr<CVoid>>): CInt

// detach or pthreadAttrSetdetachstate must not be called!
// pub fn pthreadDetach(thread: pthreadT) -> cInt;
public expect fun pthreadExit(value: MutPtr<CVoid>): Nothing

public expect fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt

public expect fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt

public expect fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stackSize: SizeT): CInt

public expect fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, size: MutPtr<SizeT>): CInt

public expect fun pthreadAttrSettee(attr: MutPtr<PthreadAttrT>, ca: CInt, taskId: CInt, shadow: CInt): CInt

// C-TA API do not include this interface, but TA can use.
public expect fun schedYield(): CInt

public expect fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt

public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

public expect fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid>

public expect fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt

public expect fun pthreadMutexDestroy(lock: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexInit(lock: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt

public expect fun pthreadMutexLock(lock: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexTrylock(lock: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexUnlock(lock: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt

public expect fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt

public expect fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, type: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt

public expect fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt

public expect fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt

public expect fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt

public expect fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt

public expect fun pthreadCondWait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt

public expect fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robustness: CInt): CInt

public expect fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt

public expect fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt

public expect fun pthreadOnce(pot: MutPtr<PthreadOnceT>, f: OnceFn?): CInt

public expect fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt

public expect fun pthreadMutexattrSetprotocol(a: MutPtr<PthreadMutexattrT>, protocol: CInt): CInt

public expect fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stack: MutPtr<CVoid>, size: SizeT): CInt

public expect fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: ConstPtr<CpuSetT>): CInt

public expect fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: MutPtr<CpuSetT>): CInt

// stdio.h
public expect fun printf(fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun scanf(fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: MutPtr<CChar>, n: SizeT, fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: MutPtr<CChar>, fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun vsnprintf(s: MutPtr<CChar>, n: SizeT, fmt: ConstPtr<CChar>, ap: VaList): CInt

public expect fun vsprintf(s: MutPtr<CChar>, fmt: ConstPtr<CChar>, ap: VaList): CInt

// Not available.
// pub fn pthreadSetnameNp(thread: pthreadT, name: *const cChar) -> cInt;
public expect fun abort(): Nothing

// Not available.
// pub fn prctl(op: cInt, ...) -> cInt;
public expect fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt

// sysconf is currently only implemented as a Note.
public expect fun sysconf(name: CInt): CLong

// mman.h
public expect fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid>

public expect fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt

// errno.h
public expect fun errnoLocation(): MutPtr<CInt>

public expect fun strerror(e: CInt): MutPtr<CChar>

// time.h
public expect fun clockGettime(clockId: ClockidT, tp: MutPtr<Timespec>): CInt

// unistd
public expect fun getpid(): PidT

// time
public expect fun gettimeofday(tv: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt

public expect fun strftime(restrict: MutPtr<CChar>, sz: SizeT, restrict_2: ConstPtr<CChar>, restrict_3: ConstPtr<Tm>): SizeT

public expect fun time(t: MutPtr<TimeT>): TimeT

// sem
public expect fun semClose(sem: MutPtr<SemT>): CInt

public expect fun semDestroy(sem: MutPtr<SemT>): CInt

public expect fun semGetvalue(sem: MutPtr<SemT>, valp: MutPtr<CInt>): CInt

public expect fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt

public expect fun semOpen(name: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): MutPtr<SemT>

public expect fun semPost(sem: MutPtr<SemT>): CInt

public expect fun semUnlink(name: ConstPtr<CChar>): CInt

public expect fun semWait(sem: MutPtr<SemT>): CInt

// locale
public expect fun setlocale(cat: CInt, name: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strcoll(l: ConstPtr<CChar>, r: ConstPtr<CChar>): CInt

public expect fun strxfrm(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): SizeT

public expect fun strtod(s: ConstPtr<CChar>, p: MutPtr<MutPtr<CChar>>): CDouble

// multibyte
public expect fun mbrtowc(wc: MutPtr<WcharT>, src: ConstPtr<CChar>, n: SizeT, st: MutPtr<MbstateT>): SizeT

public expect fun wcrtomb(s: MutPtr<CChar>, wc: WcharT, st: MutPtr<MbstateT>): SizeT

public expect fun wctob(c: WintT): CInt

// prng
public expect fun srandom(seed: CUint)

public expect fun initstate(seed: CUint, state: MutPtr<CChar>, size: SizeT): MutPtr<CChar>

public expect fun setstate(state: MutPtr<CChar>): MutPtr<CChar>

public expect fun random(): CLong

// string
public expect fun strchr(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar>

public expect fun strlen(cs: ConstPtr<CChar>): SizeT

public expect fun strcmp(l: ConstPtr<CChar>, r: ConstPtr<CChar>): CInt

public expect fun strcpy(dest: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strncmp(l: ConstPtr<CChar>, r: ConstPtr<CChar>, n: SizeT): CInt

public expect fun strncpy(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar>

public expect fun strnlen(cs: ConstPtr<CChar>, n: SizeT): SizeT

public expect fun strrchr(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar>

public expect fun strstr(h: ConstPtr<CChar>, n: ConstPtr<CChar>): MutPtr<CChar>

public expect fun wcschr(s: ConstPtr<WcharT>, c: WcharT): MutPtr<WcharT>

public expect fun wcslen(s: ConstPtr<WcharT>): SizeT

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

public expect fun frexp(x: CDouble, e: MutPtr<CInt>): CDouble

public expect fun log(x: CDouble): CDouble

public expect fun log2(x: CDouble): CDouble

public expect fun pow(x: CDouble, y: CDouble): CDouble

public expect fun roundf(x: CFloat): CFloat

public expect fun scalbn(x: CDouble, n: CInt): CDouble

public expect fun sqrt(x: CDouble): CDouble

// stdlib
public expect fun abs(x: CInt): CInt

public expect fun atof(s: ConstPtr<CChar>): CDouble

public expect fun atoi(s: ConstPtr<CChar>): CInt

public expect fun atol(s: ConstPtr<CChar>): CLong

public expect fun atoll(s: ConstPtr<CChar>): CLonglong

public expect fun bsearch(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nel: SizeT, width: SizeT, cmp: Cmpfunc): MutPtr<CVoid>

public expect fun div(num: CInt, den: CInt): DivT

public expect fun ecvt(x: CDouble, n: CInt, dp: MutPtr<CInt>, sign: MutPtr<CInt>): MutPtr<CChar>

public expect fun imaxabs(a: IntmaxT): IntmaxT

public expect fun llabs(a: CLonglong): CLonglong

public expect fun qsort(base: MutPtr<CVoid>, nel: SizeT, width: SizeT, cmp: Cmpfunc)

public expect fun strtoul(s: ConstPtr<CChar>, p: MutPtr<MutPtr<CChar>>, base: CInt): CUlong

public expect fun strtol(s: ConstPtr<CChar>, p: MutPtr<MutPtr<CChar>>, base: CInt): CLong

public expect fun wcstod(s: ConstPtr<WcharT>, p: MutPtr<MutPtr<WcharT>>): CDouble

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
