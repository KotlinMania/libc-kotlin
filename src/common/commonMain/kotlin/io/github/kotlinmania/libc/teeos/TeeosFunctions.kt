package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: COpaquePointer?)
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

// ---- ALLOC -----------------------------------------------------------------------------
public expect fun calloc(nobj: SizeT, size: SizeT): COpaquePointer?

public expect fun malloc(size: SizeT): COpaquePointer?

public expect fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun alignedAlloc(align: SizeT, len: SizeT): COpaquePointer?

public expect fun free(p: COpaquePointer?)

public expect fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt

public expect fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer?

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

// ----- PTHREAD ---------------------------------------------------------------------------
public expect fun pthreadSelf(): PthreadT

public expect fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt

// detach or pthreadAttrSetdetachstate must not be called!
// pub fn pthreadDetach(thread: pthreadT) -> cInt;
public expect fun pthreadExit(value: COpaquePointer?): Nothing

public expect fun pthreadAttrInit(attr: COpaquePointer?): CInt

public expect fun pthreadAttrDestroy(attr: COpaquePointer?): CInt

public expect fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt

public expect fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt

public expect fun pthreadAttrGetstacksize(attr: COpaquePointer?, size: COpaquePointer?): CInt

public expect fun pthreadAttrSettee(attr: COpaquePointer?, ca: CInt, taskId: CInt, shadow: CInt): CInt

// C-TA API do not include this interface, but TA can use.
public expect fun schedYield(): CInt

public expect fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt

public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

public expect fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer?

public expect fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt

public expect fun pthreadMutexDestroy(lock: COpaquePointer?): CInt

public expect fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt

public expect fun pthreadMutexLock(lock: COpaquePointer?): CInt

public expect fun pthreadMutexTrylock(lock: COpaquePointer?): CInt

public expect fun pthreadMutexUnlock(lock: COpaquePointer?): CInt

public expect fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt

public expect fun pthreadMutexattrInit(attr: COpaquePointer?): CInt

public expect fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadCondBroadcast(cond: COpaquePointer?): CInt

public expect fun pthreadCondDestroy(cond: COpaquePointer?): CInt

public expect fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt

public expect fun pthreadCondSignal(cond: COpaquePointer?): CInt

public expect fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt

public expect fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robustness: CInt): CInt

public expect fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: COpaquePointer?): CInt

public expect fun pthreadSpinLock(lock: COpaquePointer?): CInt

public expect fun pthreadSpinTrylock(lock: COpaquePointer?): CInt

public expect fun pthreadSpinUnlock(lock: COpaquePointer?): CInt

public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt

public expect fun pthreadOnce(pot: COpaquePointer?, f: OnceFn?): CInt

public expect fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt

public expect fun pthreadMutexattrSetprotocol(a: COpaquePointer?, protocol: CInt): CInt

public expect fun pthreadAttrSetstack(attr: COpaquePointer?, stack: COpaquePointer?, size: SizeT): CInt

public expect fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: COpaquePointer?): CInt

public expect fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: COpaquePointer?): CInt

// stdio.h
public expect fun printf(fmt: String?, vararg variadicArgs: Long): CInt

public expect fun scanf(fmt: String?, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: COpaquePointer?, n: SizeT, fmt: String?, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: COpaquePointer?, fmt: String?, vararg variadicArgs: Long): CInt

public expect fun vsnprintf(s: COpaquePointer?, n: SizeT, fmt: String?, ap: VaList): CInt

public expect fun vsprintf(s: COpaquePointer?, fmt: String?, ap: VaList): CInt

// Not available.
// pub fn pthreadSetnameNp(thread: pthreadT, name: *const cChar) -> cInt;
public expect fun abort(): Nothing

// Not available.
// pub fn prctl(op: cInt, ...) -> cInt;
public expect fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt

// sysconf is currently only implemented as a Note.
public expect fun sysconf(name: CInt): CLong

// mman.h
public expect fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer?

public expect fun munmap(addr: COpaquePointer?, len: SizeT): CInt

// errno.h
public expect fun errnoLocation(): COpaquePointer?

public expect fun strerror(e: CInt): COpaquePointer?

// time.h
public expect fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt

// unistd
public expect fun getpid(): PidT

// time
public expect fun gettimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun strftime(restrict: COpaquePointer?, sz: SizeT, restrict_2: String?, restrict_3: COpaquePointer?): SizeT

public expect fun time(t: COpaquePointer?): TimeT

// sem
public expect fun semClose(sem: COpaquePointer?): CInt

public expect fun semDestroy(sem: COpaquePointer?): CInt

public expect fun semGetvalue(sem: COpaquePointer?, valp: COpaquePointer?): CInt

public expect fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt

public expect fun semOpen(name: String?, flags: CInt, vararg variadicArgs: Long): COpaquePointer?

public expect fun semPost(sem: COpaquePointer?): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun semWait(sem: COpaquePointer?): CInt

// locale
public expect fun setlocale(cat: CInt, name: String?): COpaquePointer?

public expect fun strcoll(l: String?, r: String?): CInt

public expect fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT

public expect fun strtod(s: String?, p: COpaquePointer?): CDouble

// multibyte
public expect fun mbrtowc(wc: COpaquePointer?, src: String?, n: SizeT, st: COpaquePointer?): SizeT

public expect fun wcrtomb(s: COpaquePointer?, wc: WcharT, st: COpaquePointer?): SizeT

public expect fun wctob(c: WintT): CInt

// prng
public expect fun srandom(seed: CUint)

public expect fun initstate(seed: CUint, state: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun setstate(state: COpaquePointer?): COpaquePointer?

public expect fun random(): CLong

// string
public expect fun strchr(s: String?, c: CInt): COpaquePointer?

public expect fun strlen(cs: String?): SizeT

public expect fun strcmp(l: String?, r: String?): CInt

public expect fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer?

public expect fun strncmp(l: String?, r: String?, n: SizeT): CInt

public expect fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer?

public expect fun strnlen(cs: String?, n: SizeT): SizeT

public expect fun strrchr(s: String?, c: CInt): COpaquePointer?

public expect fun strstr(h: String?, n: String?): COpaquePointer?

public expect fun wcschr(s: COpaquePointer?, c: WcharT): COpaquePointer?

public expect fun wcslen(s: COpaquePointer?): SizeT

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

public expect fun frexp(x: CDouble, e: COpaquePointer?): CDouble

public expect fun log(x: CDouble): CDouble

public expect fun log2(x: CDouble): CDouble

public expect fun pow(x: CDouble, y: CDouble): CDouble

public expect fun roundf(x: CFloat): CFloat

public expect fun scalbn(x: CDouble, n: CInt): CDouble

public expect fun sqrt(x: CDouble): CDouble

// stdlib
public expect fun abs(x: CInt): CInt

public expect fun atof(s: String?): CDouble

public expect fun atoi(s: String?): CInt

public expect fun atol(s: String?): CLong

public expect fun atoll(s: String?): CLonglong

public expect fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc): COpaquePointer?

public expect fun div(num: CInt, den: CInt): DivT

public expect fun ecvt(x: CDouble, n: CInt, dp: COpaquePointer?, sign: COpaquePointer?): COpaquePointer?

public expect fun imaxabs(a: IntmaxT): IntmaxT

public expect fun llabs(a: CLonglong): CLonglong

public expect fun qsort(base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc)

public expect fun strtoul(s: String?, p: COpaquePointer?, base: CInt): CUlong

public expect fun strtol(s: String?, p: COpaquePointer?, base: CInt): CLong

public expect fun wcstod(s: COpaquePointer?, p: COpaquePointer?): CDouble

public fun errno(): CInt = (errnoLocation()?.rawValue ?: 0L).toInt()

public fun cpuCountS(size: Int, cpuset: CpuSetT): CInt {
    var s: UInt = 0u
    val sizeOfMask = 8
    for (i in ((cpuset.bits).slice(0 until (size / sizeOfMask)))) {
        s += i.countOneBits().toUInt()
    }
    return s.toInt()
}

public fun cpuCount(cpuset: CpuSetT): CInt = cpuCountS(8, cpuset)
