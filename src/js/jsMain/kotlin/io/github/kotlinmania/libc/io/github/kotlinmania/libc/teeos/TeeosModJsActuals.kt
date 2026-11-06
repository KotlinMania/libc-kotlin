package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.COpaquePointer

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').calloc(nobj, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').malloc(size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').realloc(p?.value ?: 0L, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alignedAlloc(align: SizeT, len: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').alignedAlloc(align, len)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(p: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').free(p?.value ?: 0L)")
}

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixMemalign(memptr?.value ?: 0L, align, size)") as CInt

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memchr(cx?.value ?: 0L, c, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wmemchr(cx: UInt?, c: WcharT, n: SizeT): UInt? =
    js("require('@kotlinmania/libc-native-bindings').wmemchr(cx?.toLong() ?: 0L, c, n)") as UInt?

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').memcmp(cx?.value ?: 0L, ct?.value ?: 0L, n)") as CInt

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memcpy(dest?.value ?: 0L, src?.value ?: 0L, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memmove(dest?.value ?: 0L, src?.value ?: 0L, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memset(dest?.value ?: 0L, c, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSelf(): PthreadT =
    js("require('@kotlinmania/libc-native-bindings').pthreadSelf()") as PthreadT

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadJoin(native, value?.value ?: 0L)") as CInt

public actual fun pthreadExit(value: COpaquePointer?): Nothing =
    js("require('@kotlinmania/libc-native-bindings').pthreadExit(value?.value ?: 0L)") as Nothing

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetstacksize(attr?.toLong() ?: 0L, stackSize)") as CInt

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstacksize(attr?.toLong() ?: 0L, size?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSettee(attr: PthreadAttrT?, ca: CInt, taskId: CInt, shadow: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSettee(attr?.toLong() ?: 0L, ca, taskId, shadow)") as CInt

public actual fun schedYield(): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedYield()") as CInt

public actual fun pthreadKeyCreate(key: CUint?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKeyCreate(key?.toLong() ?: 0L, dtor?.toLong() ?: 0L)") as CInt

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKeyDelete(key)") as CInt

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetspecific(key)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetspecific(key, value?.value ?: 0L)") as CInt

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexDestroy(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexInit(lock?.toLong() ?: 0L, attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexLock(lock: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexLock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexTrylock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexUnlock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSettype(attr?.toLong() ?: 0L, type)") as CInt

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSetpshared(attr?.toLong() ?: 0L, pshared)") as CInt

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondBroadcast(cond?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondDestroy(cond?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondInit(cond?.toLong() ?: 0L, attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondSignal(cond?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondWait(cond?.toLong() ?: 0L, lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondTimedwait(cond?.toLong() ?: 0L, lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSetrobust(attr?.toLong() ?: 0L, robustness)") as CInt

public actual fun pthreadCreate(native: CUlong?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)") as CInt

public actual fun pthreadSpinInit(lock: CInt?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinInit(lock?.toLong() ?: 0L, pshared)") as CInt

public actual fun pthreadSpinDestroy(lock: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinDestroy(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinLock(lock: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinLock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinTrylock(lock: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinTrylock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinUnlock(lock: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinUnlock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetschedprio(native, priority)") as CInt

public actual fun pthreadOnce(pot: CInt?, f: OnceFn?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadOnce(pot?.toLong() ?: 0L, f?.toLong() ?: 0L)") as CInt

public actual fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadEqual(p1, p2)") as CInt

public actual fun pthreadMutexattrSetprotocol(a: PthreadMutexattrT?, protocol: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSetprotocol(a?.toLong() ?: 0L, protocol)") as CInt

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stack: COpaquePointer?, size: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetstack(attr?.toLong() ?: 0L, stack?.value ?: 0L, size)") as CInt

public actual fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetaffinityNp(td, size, set?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetaffinityNp(td, size, set?.toLong() ?: 0L)") as CInt

public actual fun vsnprintf(s: COpaquePointer?, n: SizeT, fmt: String?, ap: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').vsnprintf(s?.value ?: 0L, n, fmt, ap)") as CInt

public actual fun vsprintf(s: COpaquePointer?, fmt: String?, ap: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').vsprintf(s?.value ?: 0L, fmt, ap)") as CInt

public actual fun abort(): Nothing =
    js("require('@kotlinmania/libc-native-bindings').abort()") as Nothing

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetaffinity(pid, cpusetsize, cpuset?.toLong() ?: 0L)") as CInt

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetaffinity(pid, cpusetsize, cpuset?.toLong() ?: 0L)") as CInt

public actual fun sysconf(name: CInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').sysconf(name)") as CLong

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mmap(addr?.value ?: 0L, len, prot, flags, fd, offset)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').munmap(addr?.value ?: 0L, len)") as CInt

public actual fun errnoLocation(): CInt? =
    js("require('@kotlinmania/libc-native-bindings').errnoLocation()") as CInt?

public actual fun strerror(e: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strerror(e)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(clockId, tp?.toLong() ?: 0L)") as CInt

public actual fun getpid(): PidT =
    js("require('@kotlinmania/libc-native-bindings').getpid()") as PidT

public actual fun gettimeofday(tv: Timeval?, tz: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tv?.toLong() ?: 0L, tz?.value ?: 0L)") as CInt

public actual fun strftime(restrict: COpaquePointer?, sz: SizeT, restrict: String?, restrict: Tm?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strftime(restrict?.value ?: 0L, sz, restrict, restrict?.toLong() ?: 0L)") as SizeT

public actual fun time(t: CLong?): TimeT =
    js("require('@kotlinmania/libc-native-bindings').time(t?.toLong() ?: 0L)") as TimeT

public actual fun semClose(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semClose(sem?.toLong() ?: 0L)") as CInt

public actual fun semDestroy(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semDestroy(sem?.toLong() ?: 0L)") as CInt

public actual fun semGetvalue(sem: SemT?, valp: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semGetvalue(sem?.toLong() ?: 0L, valp?.toLong() ?: 0L)") as CInt

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').semInit(sem?.toLong() ?: 0L, pshared, value)") as CInt

public actual fun semPost(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semPost(sem?.toLong() ?: 0L)") as CInt

public actual fun semUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semUnlink(name)") as CInt

public actual fun semWait(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semWait(sem?.toLong() ?: 0L)") as CInt

public actual fun setlocale(cat: CInt, name: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').setlocale(cat, name)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcoll(l: String?, r: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').strcoll(l, r)") as CInt

public actual fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strxfrm(dest?.value ?: 0L, src, n)") as SizeT

public actual fun strtod(s: String?, p: COpaquePointer?): CDouble =
    js("require('@kotlinmania/libc-native-bindings').strtod(s, p?.value ?: 0L)") as CDouble

public actual fun mbrtowc(wc: UInt?, src: String?, n: SizeT, st: MbstateT?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').mbrtowc(wc?.toLong() ?: 0L, src, n, st?.toLong() ?: 0L)") as SizeT

public actual fun wcrtomb(s: COpaquePointer?, wc: WcharT, st: MbstateT?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').wcrtomb(s?.value ?: 0L, wc, st?.toLong() ?: 0L)") as SizeT

public actual fun wctob(c: WintT): CInt =
    js("require('@kotlinmania/libc-native-bindings').wctob(c)") as CInt

public actual fun srandom(seed: CUint) {
    js("require('@kotlinmania/libc-native-bindings').srandom(seed)")
}

public actual fun initstate(seed: CUint, state: COpaquePointer?, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').initstate(seed, state?.value ?: 0L, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setstate(state: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').setstate(state?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun random(): CLong =
    js("require('@kotlinmania/libc-native-bindings').random()") as CLong

public actual fun strchr(s: String?, c: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strchr(s, c)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strlen(cs: String?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strlen(cs)") as SizeT

public actual fun strcmp(l: String?, r: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').strcmp(l, r)") as CInt

public actual fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strcpy(dest?.value ?: 0L, src)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncmp(l: String?, r: String?, n: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strncmp(l, r, n)") as CInt

public actual fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strncpy(dest?.value ?: 0L, src, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strnlen(cs: String?, n: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strnlen(cs, n)") as SizeT

public actual fun strrchr(s: String?, c: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strrchr(s, c)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(h: String?, n: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strstr(h, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wcschr(s: UInt?, c: WcharT): UInt? =
    js("require('@kotlinmania/libc-native-bindings').wcschr(s?.toLong() ?: 0L, c)") as UInt?

public actual fun wcslen(s: UInt?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').wcslen(s?.toLong() ?: 0L)") as SizeT

public actual fun isalpha(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isalpha(c)") as CInt

public actual fun isascii(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isascii(c)") as CInt

public actual fun isdigit(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isdigit(c)") as CInt

public actual fun islower(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').islower(c)") as CInt

public actual fun isprint(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isprint(c)") as CInt

public actual fun isspace(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isspace(c)") as CInt

public actual fun iswctype(wc: WintT, ttype: WctypeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').iswctype(wc, ttype)") as CInt

public actual fun iswdigit(wc: WintT): CInt =
    js("require('@kotlinmania/libc-native-bindings').iswdigit(wc)") as CInt

public actual fun iswlower(wc: WintT): CInt =
    js("require('@kotlinmania/libc-native-bindings').iswlower(wc)") as CInt

public actual fun iswspace(wc: WintT): CInt =
    js("require('@kotlinmania/libc-native-bindings').iswspace(wc)") as CInt

public actual fun iswupper(wc: WintT): CInt =
    js("require('@kotlinmania/libc-native-bindings').iswupper(wc)") as CInt

public actual fun towupper(wc: WintT): WintT =
    js("require('@kotlinmania/libc-native-bindings').towupper(wc)") as WintT

public actual fun towlower(wc: WintT): WintT =
    js("require('@kotlinmania/libc-native-bindings').towlower(wc)") as WintT

public actual fun atan(x: CDouble): CDouble =
    js("require('@kotlinmania/libc-native-bindings').atan(x)") as CDouble

public actual fun ceil(x: CDouble): CDouble =
    js("require('@kotlinmania/libc-native-bindings').ceil(x)") as CDouble

public actual fun ceilf(x: CFloat): CFloat =
    js("require('@kotlinmania/libc-native-bindings').ceilf(x)") as CFloat

public actual fun exp(x: CDouble): CDouble =
    js("require('@kotlinmania/libc-native-bindings').exp(x)") as CDouble

public actual fun fabs(x: CDouble): CDouble =
    js("require('@kotlinmania/libc-native-bindings').fabs(x)") as CDouble

public actual fun floor(x: CDouble): CDouble =
    js("require('@kotlinmania/libc-native-bindings').floor(x)") as CDouble

public actual fun frexp(x: CDouble, e: CInt?): CDouble =
    js("require('@kotlinmania/libc-native-bindings').frexp(x, e?.toLong() ?: 0L)") as CDouble

public actual fun log(x: CDouble): CDouble =
    js("require('@kotlinmania/libc-native-bindings').log(x)") as CDouble

public actual fun log2(x: CDouble): CDouble =
    js("require('@kotlinmania/libc-native-bindings').log2(x)") as CDouble

public actual fun pow(x: CDouble, y: CDouble): CDouble =
    js("require('@kotlinmania/libc-native-bindings').pow(x, y)") as CDouble

public actual fun roundf(x: CFloat): CFloat =
    js("require('@kotlinmania/libc-native-bindings').roundf(x)") as CFloat

public actual fun scalbn(x: CDouble, n: CInt): CDouble =
    js("require('@kotlinmania/libc-native-bindings').scalbn(x, n)") as CDouble

public actual fun sqrt(x: CDouble): CDouble =
    js("require('@kotlinmania/libc-native-bindings').sqrt(x)") as CDouble

public actual fun abs(x: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').abs(x)") as CInt

public actual fun atof(s: String?): CDouble =
    js("require('@kotlinmania/libc-native-bindings').atof(s)") as CDouble

public actual fun atoi(s: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').atoi(s)") as CInt

public actual fun atol(s: String?): CLong =
    js("require('@kotlinmania/libc-native-bindings').atol(s)") as CLong

public actual fun atoll(s: String?): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').atoll(s)") as CLonglong

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').bsearch(key?.value ?: 0L, base?.value ?: 0L, nel, width, cmp)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun div(num: CInt, den: CInt): DivT =
    js("require('@kotlinmania/libc-native-bindings').div(num, den)") as DivT

public actual fun ecvt(x: CDouble, n: CInt, dp: CInt?, sign: CInt?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ecvt(x, n, dp?.toLong() ?: 0L, sign?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun imaxabs(a: IntmaxT): IntmaxT =
    js("require('@kotlinmania/libc-native-bindings').imaxabs(a)") as IntmaxT

public actual fun llabs(a: CLonglong): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').llabs(a)") as CLonglong

public actual fun qsort(base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc) {
    js("require('@kotlinmania/libc-native-bindings').qsort(base?.value ?: 0L, nel, width, cmp)")
}

public actual fun strtoul(s: String?, p: COpaquePointer?, base: CInt): CUlong =
    js("require('@kotlinmania/libc-native-bindings').strtoul(s, p?.value ?: 0L, base)") as CUlong

public actual fun strtol(s: String?, p: COpaquePointer?, base: CInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').strtol(s, p?.value ?: 0L, base)") as CLong

public actual fun wcstod(s: UInt?, p: COpaquePointer?): CDouble =
    js("require('@kotlinmania/libc-native-bindings').wcstod(s?.toLong() ?: 0L, p?.value ?: 0L)") as CDouble
