package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.COpaquePointer

internal object TeeosModRawLibc {
    external fun calloc(nobj: Long, size: Long): Long?
    external fun malloc(size: Long): Long?
    external fun realloc(p: Long, size: Long): Long?
    external fun alignedAlloc(align: Long, len: Long): Long?
    external fun free(p: Long)
    external fun posixMemalign(memptr: Long, align: Long, size: Long): Int
    external fun memchr(cx: Long, c: Int, n: Long): Long?
    external fun wmemchr(cx: Long, c: Int, n: Long): Long?
    external fun memcmp(cx: Long, ct: Long, n: Long): Int
    external fun memcpy(dest: Long, src: Long, n: Long): Long?
    external fun memmove(dest: Long, src: Long, n: Long): Long?
    external fun memset(dest: Long, c: Int, n: Long): Long?
    external fun pthreadSelf(): Long
    external fun pthreadJoin(native: Long, value: Long): Int
    external fun pthreadExit(value: Long): Long
    external fun pthreadAttrInit(attr: Long): Int
    external fun pthreadAttrDestroy(attr: Long): Int
    external fun pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int
    external fun pthreadAttrSetstacksize(attr: Long, stackSize: Long): Int
    external fun pthreadAttrGetstacksize(attr: Long, size: Long): Int
    external fun pthreadAttrSettee(attr: Long, ca: Int, taskId: Int, shadow: Int): Int
    external fun schedYield(): Int
    external fun pthreadKeyCreate(key: Long, dtor: Long): Int
    external fun pthreadKeyDelete(key: Long): Int
    external fun pthreadGetspecific(key: Long): Long?
    external fun pthreadSetspecific(key: Long, value: Long): Int
    external fun pthreadMutexDestroy(lock: Long): Int
    external fun pthreadMutexInit(lock: Long, attr: Long): Int
    external fun pthreadMutexLock(lock: Long): Int
    external fun pthreadMutexTrylock(lock: Long): Int
    external fun pthreadMutexUnlock(lock: Long): Int
    external fun pthreadMutexattrDestroy(attr: Long): Int
    external fun pthreadMutexattrInit(attr: Long): Int
    external fun pthreadMutexattrSettype(attr: Long, type: Int): Int
    external fun pthreadMutexattrSetpshared(attr: Long, pshared: Int): Int
    external fun pthreadCondBroadcast(cond: Long): Int
    external fun pthreadCondDestroy(cond: Long): Int
    external fun pthreadCondInit(cond: Long, attr: Long): Int
    external fun pthreadCondSignal(cond: Long): Int
    external fun pthreadCondWait(cond: Long, lock: Long): Int
    external fun pthreadCondTimedwait(cond: Long, lock: Long, abstime: Long): Int
    external fun pthreadMutexattrSetrobust(attr: Long, robustness: Int): Int
    external fun pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int
    external fun pthreadSpinInit(lock: Long, pshared: Int): Int
    external fun pthreadSpinDestroy(lock: Long): Int
    external fun pthreadSpinLock(lock: Long): Int
    external fun pthreadSpinTrylock(lock: Long): Int
    external fun pthreadSpinUnlock(lock: Long): Int
    external fun pthreadSetschedprio(native: Long, priority: Int): Int
    external fun pthreadOnce(pot: Long, f: Long): Int
    external fun pthreadEqual(p1: Long, p2: Long): Int
    external fun pthreadMutexattrSetprotocol(a: Long, protocol: Int): Int
    external fun pthreadAttrSetstack(attr: Long, stack: Long, size: Long): Int
    external fun pthreadSetaffinityNp(td: Long, size: Long, set: Long): Int
    external fun pthreadGetaffinityNp(td: Long, size: Long, set: Long): Int
    external fun vsnprintf(s: Long, n: Long, fmt: String?, ap: Long): Int
    external fun vsprintf(s: Long, fmt: String?, ap: Long): Int
    external fun abort(): Long
    external fun schedGetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int
    external fun schedSetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int
    external fun sysconf(name: Int): Long
    external fun mmap(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long?
    external fun munmap(addr: Long, len: Long): Int
    external fun errnoLocation(): Long?
    external fun strerror(e: Int): Long?
    external fun clockGettime(clockId: Int, tp: Long): Int
    external fun getpid(): Int
    external fun gettimeofday(tv: Long, tz: Long): Int
    external fun strftime(restrict: Long, sz: Long, restrict: String?, restrict: Long): Long
    external fun time(t: Long): Long
    external fun semClose(sem: Long): Int
    external fun semDestroy(sem: Long): Int
    external fun semGetvalue(sem: Long, valp: Long): Int
    external fun semInit(sem: Long, pshared: Int, value: Int): Int
    external fun semPost(sem: Long): Int
    external fun semUnlink(name: String?): Int
    external fun semWait(sem: Long): Int
    external fun setlocale(cat: Int, name: String?): Long?
    external fun strcoll(l: String?, r: String?): Int
    external fun strxfrm(dest: Long, src: String?, n: Long): Long
    external fun strtod(s: String?, p: Long): Double
    external fun mbrtowc(wc: Long, src: String?, n: Long, st: Long): Long
    external fun wcrtomb(s: Long, wc: Int, st: Long): Long
    external fun wctob(c: Long): Int
    external fun srandom(seed: Int)
    external fun initstate(seed: Int, state: Long, size: Long): Long?
    external fun setstate(state: Long): Long?
    external fun random(): Long
    external fun strchr(s: String?, c: Int): Long?
    external fun strlen(cs: String?): Long
    external fun strcmp(l: String?, r: String?): Int
    external fun strcpy(dest: Long, src: String?): Long?
    external fun strncmp(l: String?, r: String?, n: Long): Int
    external fun strncpy(dest: Long, src: String?, n: Long): Long?
    external fun strnlen(cs: String?, n: Long): Long
    external fun strrchr(s: String?, c: Int): Long?
    external fun strstr(h: String?, n: String?): Long?
    external fun wcschr(s: Long, c: Int): Long?
    external fun wcslen(s: Long): Long
    external fun isalpha(c: Int): Int
    external fun isascii(c: Int): Int
    external fun isdigit(c: Int): Int
    external fun islower(c: Int): Int
    external fun isprint(c: Int): Int
    external fun isspace(c: Int): Int
    external fun iswctype(wc: Long, ttype: Long): Int
    external fun iswdigit(wc: Long): Int
    external fun iswlower(wc: Long): Int
    external fun iswspace(wc: Long): Int
    external fun iswupper(wc: Long): Int
    external fun towupper(wc: Long): Long
    external fun towlower(wc: Long): Long
    external fun atan(x: Double): Double
    external fun ceil(x: Double): Double
    external fun ceilf(x: Float): Float
    external fun exp(x: Double): Double
    external fun fabs(x: Double): Double
    external fun floor(x: Double): Double
    external fun frexp(x: Double, e: Long): Double
    external fun log(x: Double): Double
    external fun log2(x: Double): Double
    external fun pow(x: Double, y: Double): Double
    external fun roundf(x: Float): Float
    external fun scalbn(x: Double, n: Int): Double
    external fun sqrt(x: Double): Double
    external fun abs(x: Int): Int
    external fun atof(s: String?): Double
    external fun atoi(s: String?): Int
    external fun atol(s: String?): Long
    external fun atoll(s: String?): Long
    external fun bsearch(key: Long, base: Long, nel: Long, width: Long, cmp: Long): Long?
    external fun div(num: Int, den: Int): Long
    external fun ecvt(x: Double, n: Int, dp: Long, sign: Long): Long?
    external fun imaxabs(a: Long): Long
    external fun llabs(a: Long): Long
    external fun qsort(base: Long, nel: Long, width: Long, cmp: Long)
    external fun strtoul(s: String?, p: Long, base: Int): Long
    external fun strtol(s: String?, p: Long, base: Int): Long
    external fun wcstod(s: Long, p: Long): Double
}

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    TeeosModRawLibc.calloc(nobj, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    TeeosModRawLibc.malloc(size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    TeeosModRawLibc.realloc(p?.value ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alignedAlloc(align: SizeT, len: SizeT): COpaquePointer? =
    TeeosModRawLibc.alignedAlloc(align, len).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(p: COpaquePointer?) {
    TeeosModRawLibc.free(p?.value ?: 0L)
}

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    TeeosModRawLibc.posixMemalign(memptr?.value ?: 0L, align, size)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    TeeosModRawLibc.memchr(cx?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wmemchr(cx: UInt?, c: WcharT, n: SizeT): UInt? =
    TeeosModRawLibc.wmemchr(cx?.toLong() ?: 0L, c, n)

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    TeeosModRawLibc.memcmp(cx?.value ?: 0L, ct?.value ?: 0L, n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    TeeosModRawLibc.memcpy(dest?.value ?: 0L, src?.value ?: 0L, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    TeeosModRawLibc.memmove(dest?.value ?: 0L, src?.value ?: 0L, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    TeeosModRawLibc.memset(dest?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSelf(): PthreadT =
    TeeosModRawLibc.pthreadSelf()

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    TeeosModRawLibc.pthreadJoin(native, value?.value ?: 0L)

public actual fun pthreadExit(value: COpaquePointer?): Nothing =
    TeeosModRawLibc.pthreadExit(value?.value ?: 0L)

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    TeeosModRawLibc.pthreadAttrInit(attr?.toLong() ?: 0L)

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    TeeosModRawLibc.pthreadAttrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    TeeosModRawLibc.pthreadAttrGetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: SizeT): CInt =
    TeeosModRawLibc.pthreadAttrSetstacksize(attr?.toLong() ?: 0L, stackSize)

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): CInt =
    TeeosModRawLibc.pthreadAttrGetstacksize(attr?.toLong() ?: 0L, size?.toLong() ?: 0L)

public actual fun pthreadAttrSettee(attr: PthreadAttrT?, ca: CInt, taskId: CInt, shadow: CInt): CInt =
    TeeosModRawLibc.pthreadAttrSettee(attr?.toLong() ?: 0L, ca, taskId, shadow)

public actual fun schedYield(): CInt =
    TeeosModRawLibc.schedYield()

public actual fun pthreadKeyCreate(key: CUint?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    TeeosModRawLibc.pthreadKeyCreate(key?.toLong() ?: 0L, dtor?.toLong() ?: 0L)

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    TeeosModRawLibc.pthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    TeeosModRawLibc.pthreadGetspecific(key).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    TeeosModRawLibc.pthreadSetspecific(key, value?.value ?: 0L)

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt =
    TeeosModRawLibc.pthreadMutexDestroy(lock?.toLong() ?: 0L)

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    TeeosModRawLibc.pthreadMutexInit(lock?.toLong() ?: 0L, attr?.toLong() ?: 0L)

public actual fun pthreadMutexLock(lock: PthreadMutexT?): CInt =
    TeeosModRawLibc.pthreadMutexLock(lock?.toLong() ?: 0L)

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt =
    TeeosModRawLibc.pthreadMutexTrylock(lock?.toLong() ?: 0L)

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt =
    TeeosModRawLibc.pthreadMutexUnlock(lock?.toLong() ?: 0L)

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    TeeosModRawLibc.pthreadMutexattrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    TeeosModRawLibc.pthreadMutexattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt =
    TeeosModRawLibc.pthreadMutexattrSettype(attr?.toLong() ?: 0L, type)

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt =
    TeeosModRawLibc.pthreadMutexattrSetpshared(attr?.toLong() ?: 0L, pshared)

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    TeeosModRawLibc.pthreadCondBroadcast(cond?.toLong() ?: 0L)

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    TeeosModRawLibc.pthreadCondDestroy(cond?.toLong() ?: 0L)

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    TeeosModRawLibc.pthreadCondInit(cond?.toLong() ?: 0L, attr?.toLong() ?: 0L)

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    TeeosModRawLibc.pthreadCondSignal(cond?.toLong() ?: 0L)

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt =
    TeeosModRawLibc.pthreadCondWait(cond?.toLong() ?: 0L, lock?.toLong() ?: 0L)

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt =
    TeeosModRawLibc.pthreadCondTimedwait(cond?.toLong() ?: 0L, lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: CInt): CInt =
    TeeosModRawLibc.pthreadMutexattrSetrobust(attr?.toLong() ?: 0L, robustness)

public actual fun pthreadCreate(native: CUlong?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    TeeosModRawLibc.pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)

public actual fun pthreadSpinInit(lock: CInt?, pshared: CInt): CInt =
    TeeosModRawLibc.pthreadSpinInit(lock?.toLong() ?: 0L, pshared)

public actual fun pthreadSpinDestroy(lock: CInt?): CInt =
    TeeosModRawLibc.pthreadSpinDestroy(lock?.toLong() ?: 0L)

public actual fun pthreadSpinLock(lock: CInt?): CInt =
    TeeosModRawLibc.pthreadSpinLock(lock?.toLong() ?: 0L)

public actual fun pthreadSpinTrylock(lock: CInt?): CInt =
    TeeosModRawLibc.pthreadSpinTrylock(lock?.toLong() ?: 0L)

public actual fun pthreadSpinUnlock(lock: CInt?): CInt =
    TeeosModRawLibc.pthreadSpinUnlock(lock?.toLong() ?: 0L)

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    TeeosModRawLibc.pthreadSetschedprio(native, priority)

public actual fun pthreadOnce(pot: CInt?, f: OnceFn?): CInt =
    TeeosModRawLibc.pthreadOnce(pot?.toLong() ?: 0L, f?.toLong() ?: 0L)

public actual fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt =
    TeeosModRawLibc.pthreadEqual(p1, p2)

public actual fun pthreadMutexattrSetprotocol(a: PthreadMutexattrT?, protocol: CInt): CInt =
    TeeosModRawLibc.pthreadMutexattrSetprotocol(a?.toLong() ?: 0L, protocol)

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stack: COpaquePointer?, size: SizeT): CInt =
    TeeosModRawLibc.pthreadAttrSetstack(attr?.toLong() ?: 0L, stack?.value ?: 0L, size)

public actual fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: CpuSetT?): CInt =
    TeeosModRawLibc.pthreadSetaffinityNp(td, size, set?.toLong() ?: 0L)

public actual fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: CpuSetT?): CInt =
    TeeosModRawLibc.pthreadGetaffinityNp(td, size, set?.toLong() ?: 0L)

public actual fun vsnprintf(s: COpaquePointer?, n: SizeT, fmt: String?, ap: VaList): CInt =
    TeeosModRawLibc.vsnprintf(s?.value ?: 0L, n, fmt, ap)

public actual fun vsprintf(s: COpaquePointer?, fmt: String?, ap: VaList): CInt =
    TeeosModRawLibc.vsprintf(s?.value ?: 0L, fmt, ap)

public actual fun abort(): Nothing =
    TeeosModRawLibc.abort()

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    TeeosModRawLibc.schedGetaffinity(pid, cpusetsize, cpuset?.toLong() ?: 0L)

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    TeeosModRawLibc.schedSetaffinity(pid, cpusetsize, cpuset?.toLong() ?: 0L)

public actual fun sysconf(name: CInt): CLong =
    TeeosModRawLibc.sysconf(name)

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    TeeosModRawLibc.mmap(addr?.value ?: 0L, len, prot, flags, fd, offset).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    TeeosModRawLibc.munmap(addr?.value ?: 0L, len)

public actual fun errnoLocation(): CInt? =
    TeeosModRawLibc.errnoLocation()

public actual fun strerror(e: CInt): COpaquePointer? =
    TeeosModRawLibc.strerror(e).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt =
    TeeosModRawLibc.clockGettime(clockId, tp?.toLong() ?: 0L)

public actual fun getpid(): PidT =
    TeeosModRawLibc.getpid()

public actual fun gettimeofday(tv: Timeval?, tz: COpaquePointer?): CInt =
    TeeosModRawLibc.gettimeofday(tv?.toLong() ?: 0L, tz?.value ?: 0L)

public actual fun strftime(restrict: COpaquePointer?, sz: SizeT, restrict: String?, restrict: Tm?): SizeT =
    TeeosModRawLibc.strftime(restrict?.value ?: 0L, sz, restrict, restrict?.toLong() ?: 0L)

public actual fun time(t: CLong?): TimeT =
    TeeosModRawLibc.time(t?.toLong() ?: 0L)

public actual fun semClose(sem: SemT?): CInt =
    TeeosModRawLibc.semClose(sem?.toLong() ?: 0L)

public actual fun semDestroy(sem: SemT?): CInt =
    TeeosModRawLibc.semDestroy(sem?.toLong() ?: 0L)

public actual fun semGetvalue(sem: SemT?, valp: CInt?): CInt =
    TeeosModRawLibc.semGetvalue(sem?.toLong() ?: 0L, valp?.toLong() ?: 0L)

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    TeeosModRawLibc.semInit(sem?.toLong() ?: 0L, pshared, value)

public actual fun semPost(sem: SemT?): CInt =
    TeeosModRawLibc.semPost(sem?.toLong() ?: 0L)

public actual fun semUnlink(name: String?): CInt =
    TeeosModRawLibc.semUnlink(name)

public actual fun semWait(sem: SemT?): CInt =
    TeeosModRawLibc.semWait(sem?.toLong() ?: 0L)

public actual fun setlocale(cat: CInt, name: String?): COpaquePointer? =
    TeeosModRawLibc.setlocale(cat, name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcoll(l: String?, r: String?): CInt =
    TeeosModRawLibc.strcoll(l, r)

public actual fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT =
    TeeosModRawLibc.strxfrm(dest?.value ?: 0L, src, n)

public actual fun strtod(s: String?, p: COpaquePointer?): CDouble =
    TeeosModRawLibc.strtod(s, p?.value ?: 0L)

public actual fun mbrtowc(wc: UInt?, src: String?, n: SizeT, st: MbstateT?): SizeT =
    TeeosModRawLibc.mbrtowc(wc?.toLong() ?: 0L, src, n, st?.toLong() ?: 0L)

public actual fun wcrtomb(s: COpaquePointer?, wc: WcharT, st: MbstateT?): SizeT =
    TeeosModRawLibc.wcrtomb(s?.value ?: 0L, wc, st?.toLong() ?: 0L)

public actual fun wctob(c: WintT): CInt =
    TeeosModRawLibc.wctob(c)

public actual fun srandom(seed: CUint) {
    TeeosModRawLibc.srandom(seed)
}

public actual fun initstate(seed: CUint, state: COpaquePointer?, size: SizeT): COpaquePointer? =
    TeeosModRawLibc.initstate(seed, state?.value ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setstate(state: COpaquePointer?): COpaquePointer? =
    TeeosModRawLibc.setstate(state?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun random(): CLong =
    TeeosModRawLibc.random()

public actual fun strchr(s: String?, c: CInt): COpaquePointer? =
    TeeosModRawLibc.strchr(s, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strlen(cs: String?): SizeT =
    TeeosModRawLibc.strlen(cs)

public actual fun strcmp(l: String?, r: String?): CInt =
    TeeosModRawLibc.strcmp(l, r)

public actual fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? =
    TeeosModRawLibc.strcpy(dest?.value ?: 0L, src).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncmp(l: String?, r: String?, n: SizeT): CInt =
    TeeosModRawLibc.strncmp(l, r, n)

public actual fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    TeeosModRawLibc.strncpy(dest?.value ?: 0L, src, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strnlen(cs: String?, n: SizeT): SizeT =
    TeeosModRawLibc.strnlen(cs, n)

public actual fun strrchr(s: String?, c: CInt): COpaquePointer? =
    TeeosModRawLibc.strrchr(s, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(h: String?, n: String?): COpaquePointer? =
    TeeosModRawLibc.strstr(h, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wcschr(s: UInt?, c: WcharT): UInt? =
    TeeosModRawLibc.wcschr(s?.toLong() ?: 0L, c)

public actual fun wcslen(s: UInt?): SizeT =
    TeeosModRawLibc.wcslen(s?.toLong() ?: 0L)

public actual fun isalpha(c: CInt): CInt =
    TeeosModRawLibc.isalpha(c)

public actual fun isascii(c: CInt): CInt =
    TeeosModRawLibc.isascii(c)

public actual fun isdigit(c: CInt): CInt =
    TeeosModRawLibc.isdigit(c)

public actual fun islower(c: CInt): CInt =
    TeeosModRawLibc.islower(c)

public actual fun isprint(c: CInt): CInt =
    TeeosModRawLibc.isprint(c)

public actual fun isspace(c: CInt): CInt =
    TeeosModRawLibc.isspace(c)

public actual fun iswctype(wc: WintT, ttype: WctypeT): CInt =
    TeeosModRawLibc.iswctype(wc, ttype)

public actual fun iswdigit(wc: WintT): CInt =
    TeeosModRawLibc.iswdigit(wc)

public actual fun iswlower(wc: WintT): CInt =
    TeeosModRawLibc.iswlower(wc)

public actual fun iswspace(wc: WintT): CInt =
    TeeosModRawLibc.iswspace(wc)

public actual fun iswupper(wc: WintT): CInt =
    TeeosModRawLibc.iswupper(wc)

public actual fun towupper(wc: WintT): WintT =
    TeeosModRawLibc.towupper(wc)

public actual fun towlower(wc: WintT): WintT =
    TeeosModRawLibc.towlower(wc)

public actual fun atan(x: CDouble): CDouble =
    TeeosModRawLibc.atan(x)

public actual fun ceil(x: CDouble): CDouble =
    TeeosModRawLibc.ceil(x)

public actual fun ceilf(x: CFloat): CFloat =
    TeeosModRawLibc.ceilf(x)

public actual fun exp(x: CDouble): CDouble =
    TeeosModRawLibc.exp(x)

public actual fun fabs(x: CDouble): CDouble =
    TeeosModRawLibc.fabs(x)

public actual fun floor(x: CDouble): CDouble =
    TeeosModRawLibc.floor(x)

public actual fun frexp(x: CDouble, e: CInt?): CDouble =
    TeeosModRawLibc.frexp(x, e?.toLong() ?: 0L)

public actual fun log(x: CDouble): CDouble =
    TeeosModRawLibc.log(x)

public actual fun log2(x: CDouble): CDouble =
    TeeosModRawLibc.log2(x)

public actual fun pow(x: CDouble, y: CDouble): CDouble =
    TeeosModRawLibc.pow(x, y)

public actual fun roundf(x: CFloat): CFloat =
    TeeosModRawLibc.roundf(x)

public actual fun scalbn(x: CDouble, n: CInt): CDouble =
    TeeosModRawLibc.scalbn(x, n)

public actual fun sqrt(x: CDouble): CDouble =
    TeeosModRawLibc.sqrt(x)

public actual fun abs(x: CInt): CInt =
    TeeosModRawLibc.abs(x)

public actual fun atof(s: String?): CDouble =
    TeeosModRawLibc.atof(s)

public actual fun atoi(s: String?): CInt =
    TeeosModRawLibc.atoi(s)

public actual fun atol(s: String?): CLong =
    TeeosModRawLibc.atol(s)

public actual fun atoll(s: String?): CLonglong =
    TeeosModRawLibc.atoll(s)

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc): COpaquePointer? =
    TeeosModRawLibc.bsearch(key?.value ?: 0L, base?.value ?: 0L, nel, width, cmp).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun div(num: CInt, den: CInt): DivT =
    TeeosModRawLibc.div(num, den)

public actual fun ecvt(x: CDouble, n: CInt, dp: CInt?, sign: CInt?): COpaquePointer? =
    TeeosModRawLibc.ecvt(x, n, dp?.toLong() ?: 0L, sign?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun imaxabs(a: IntmaxT): IntmaxT =
    TeeosModRawLibc.imaxabs(a)

public actual fun llabs(a: CLonglong): CLonglong =
    TeeosModRawLibc.llabs(a)

public actual fun qsort(base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc) {
    TeeosModRawLibc.qsort(base?.value ?: 0L, nel, width, cmp)
}

public actual fun strtoul(s: String?, p: COpaquePointer?, base: CInt): CUlong =
    TeeosModRawLibc.strtoul(s, p?.value ?: 0L, base)

public actual fun strtol(s: String?, p: COpaquePointer?, base: CInt): CLong =
    TeeosModRawLibc.strtol(s, p?.value ?: 0L, base)

public actual fun wcstod(s: UInt?, p: COpaquePointer?): CDouble =
    TeeosModRawLibc.wcstod(s?.toLong() ?: 0L, p?.value ?: 0L)
