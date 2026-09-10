// port-lint: source Mod.rs
package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc not available on Android host — use androidNative target for FFI")

public actual fun malloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc not available on Android host — use androidNative target for FFI")

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc not available on Android host — use androidNative target for FFI")

public actual fun alignedAlloc(align: ULong, len: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc not available on Android host — use androidNative target for FFI")

public actual fun free(p: COpaquePointer?) {
    throw UnsupportedOperationException("free not available on Android host — use androidNative target for FFI")
}

public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): CInt =
    throw UnsupportedOperationException("posixMemalign not available on Android host — use androidNative target for FFI")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr not available on Android host — use androidNative target for FFI")

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT? =
    throw UnsupportedOperationException("wmemchr not available on Android host — use androidNative target for FFI")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt =
    throw UnsupportedOperationException("memcmp not available on Android host — use androidNative target for FFI")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy not available on Android host — use androidNative target for FFI")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove not available on Android host — use androidNative target for FFI")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset not available on Android host — use androidNative target for FFI")

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadJoin not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstacksize not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstacksize not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSettee(attr: PthreadAttrT?, ca: CInt, taskId: CInt, shadow: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSettee not available on Android host — use androidNative target for FFI")

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("schedYield not available on Android host — use androidNative target for FFI")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    throw UnsupportedOperationException("pthreadKeyDelete not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadSetspecific not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexLock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexLock not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexTrylock not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexUnlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSettype not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondBroadcast not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondSignal not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadCondWait not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadCondTimedwait not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadSpinInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinLock not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinTrylock not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinUnlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    throw UnsupportedOperationException("pthreadSetschedprio not available on Android host — use androidNative target for FFI")

public actual fun pthreadOnce(pot: PthreadOnceT?, f: OnceFn): CInt =
    throw UnsupportedOperationException("pthreadOnce not available on Android host — use androidNative target for FFI")

public actual fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadEqual not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSetprotocol(a: PthreadMutexattrT?, protocol: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetprotocol not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stack: COpaquePointer?, size: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstack not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetaffinityNp(td: PthreadT, size: ULong, set: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadSetaffinityNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetaffinityNp(td: PthreadT, size: ULong, set: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadGetaffinityNp not available on Android host — use androidNative target for FFI")

public actual fun printf(fmt: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf not available on Android host — use androidNative target for FFI")

public actual fun scanf(fmt: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("scanf not available on Android host — use androidNative target for FFI")

public actual fun snprintf(s: String?, n: ULong, fmt: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("snprintf not available on Android host — use androidNative target for FFI")

public actual fun sprintf(s: String?, fmt: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sprintf not available on Android host — use androidNative target for FFI")

public actual fun vsnprintf(s: String?, n: ULong, fmt: String?, ap: VaList): CInt =
    throw UnsupportedOperationException("vsnprintf not available on Android host — use androidNative target for FFI")

public actual fun vsprintf(s: String?, fmt: String?, ap: VaList): CInt =
    throw UnsupportedOperationException("vsprintf not available on Android host — use androidNative target for FFI")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedGetaffinity not available on Android host — use androidNative target for FFI")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedSetaffinity not available on Android host — use androidNative target for FFI")

public actual fun sysconf(name: CInt): CLong =
    throw UnsupportedOperationException("sysconf not available on Android host — use androidNative target for FFI")

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    throw UnsupportedOperationException("mmap not available on Android host — use androidNative target for FFI")

public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munmap not available on Android host — use androidNative target for FFI")

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation not available on Android host — use androidNative target for FFI")

public actual fun strerror(e: CInt): String? =
    throw UnsupportedOperationException("strerror not available on Android host — use androidNative target for FFI")

public actual fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime not available on Android host — use androidNative target for FFI")

public actual fun getpid(): PidT =
    throw UnsupportedOperationException("getpid not available on Android host — use androidNative target for FFI")

public actual fun gettimeofday(tv: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday not available on Android host — use androidNative target for FFI")

public actual fun strftime(s: String?, sz: ULong, format: String?, tm: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on Android host — use androidNative target for FFI")

public actual fun time(t: TimeT?): TimeT =
    throw UnsupportedOperationException("time not available on Android host — use androidNative target for FFI")

public actual fun semClose(sem: SemT?): CInt =
    throw UnsupportedOperationException("semClose not available on Android host — use androidNative target for FFI")

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy not available on Android host — use androidNative target for FFI")

public actual fun semGetvalue(sem: SemT?, valp: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue not available on Android host — use androidNative target for FFI")

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit not available on Android host — use androidNative target for FFI")

public actual fun semOpen(name: String?, flags: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen not available on Android host — use androidNative target for FFI")

public actual fun semPost(sem: SemT?): CInt =
    throw UnsupportedOperationException("semPost not available on Android host — use androidNative target for FFI")

public actual fun semUnlink(name: String?): CInt =
    throw UnsupportedOperationException("semUnlink not available on Android host — use androidNative target for FFI")

public actual fun semWait(sem: SemT?): CInt =
    throw UnsupportedOperationException("semWait not available on Android host — use androidNative target for FFI")

public actual fun setlocale(cat: CInt, name: String?): String? =
    throw UnsupportedOperationException("setlocale not available on Android host — use androidNative target for FFI")

public actual fun strcoll(l: String?, r: String?): CInt =
    throw UnsupportedOperationException("strcoll not available on Android host — use androidNative target for FFI")

public actual fun strxfrm(dest: String?, src: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm not available on Android host — use androidNative target for FFI")

public actual fun mbrtowc(wc: WcharT?, src: String?, n: ULong, st: MbstateT?): ULong =
    throw UnsupportedOperationException("mbrtowc not available on Android host — use androidNative target for FFI")

public actual fun wcrtomb(s: String?, wc: WcharT, st: MbstateT?): ULong =
    throw UnsupportedOperationException("wcrtomb not available on Android host — use androidNative target for FFI")

public actual fun wctob(c: WintT): CInt =
    throw UnsupportedOperationException("wctob not available on Android host — use androidNative target for FFI")

public actual fun srandom(seed: CUInt) {
    throw UnsupportedOperationException("srandom not available on Android host — use androidNative target for FFI")
}

public actual fun initstate(seed: CUInt, state: String?, size: ULong): String? =
    throw UnsupportedOperationException("initstate not available on Android host — use androidNative target for FFI")

public actual fun setstate(state: String?): String? =
    throw UnsupportedOperationException("setstate not available on Android host — use androidNative target for FFI")

public actual fun random(): CLong =
    throw UnsupportedOperationException("random not available on Android host — use androidNative target for FFI")

public actual fun strchr(s: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchr not available on Android host — use androidNative target for FFI")

public actual fun strlen(cs: String?): ULong =
    throw UnsupportedOperationException("strlen not available on Android host — use androidNative target for FFI")

public actual fun strcmp(l: String?, r: String?): CInt =
    throw UnsupportedOperationException("strcmp not available on Android host — use androidNative target for FFI")

public actual fun strcpy(dest: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy not available on Android host — use androidNative target for FFI")

public actual fun strncmp(l: String?, r: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncmp not available on Android host — use androidNative target for FFI")

public actual fun strncpy(dest: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy not available on Android host — use androidNative target for FFI")

public actual fun strnlen(cs: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strnlen not available on Android host — use androidNative target for FFI")

public actual fun strrchr(s: String?, c: CInt): String? =
    throw UnsupportedOperationException("strrchr not available on Android host — use androidNative target for FFI")

public actual fun strstr(h: String?, n: String?): String? =
    throw UnsupportedOperationException("strstr not available on Android host — use androidNative target for FFI")

public actual fun wcschr(s: WcharT?, c: WcharT): WcharT? =
    throw UnsupportedOperationException("wcschr not available on Android host — use androidNative target for FFI")

public actual fun wcslen(s: WcharT?): ULong =
    throw UnsupportedOperationException("wcslen not available on Android host — use androidNative target for FFI")

public actual fun isalpha(c: CInt): CInt =
    throw UnsupportedOperationException("isalpha not available on Android host — use androidNative target for FFI")

public actual fun isascii(c: CInt): CInt =
    throw UnsupportedOperationException("isascii not available on Android host — use androidNative target for FFI")

public actual fun isdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isdigit not available on Android host — use androidNative target for FFI")

public actual fun islower(c: CInt): CInt =
    throw UnsupportedOperationException("islower not available on Android host — use androidNative target for FFI")

public actual fun isprint(c: CInt): CInt =
    throw UnsupportedOperationException("isprint not available on Android host — use androidNative target for FFI")

public actual fun isspace(c: CInt): CInt =
    throw UnsupportedOperationException("isspace not available on Android host — use androidNative target for FFI")

public actual fun iswctype(wc: WintT, ttype: WctypeT): CInt =
    throw UnsupportedOperationException("iswctype not available on Android host — use androidNative target for FFI")

public actual fun iswdigit(wc: WintT): CInt =
    throw UnsupportedOperationException("iswdigit not available on Android host — use androidNative target for FFI")

public actual fun iswlower(wc: WintT): CInt =
    throw UnsupportedOperationException("iswlower not available on Android host — use androidNative target for FFI")

public actual fun iswspace(wc: WintT): CInt =
    throw UnsupportedOperationException("iswspace not available on Android host — use androidNative target for FFI")

public actual fun iswupper(wc: WintT): CInt =
    throw UnsupportedOperationException("iswupper not available on Android host — use androidNative target for FFI")

public actual fun abs(x: CInt): CInt =
    throw UnsupportedOperationException("abs not available on Android host — use androidNative target for FFI")

public actual fun atoi(s: String?): CInt =
    throw UnsupportedOperationException("atoi not available on Android host — use androidNative target for FFI")

public actual fun atol(s: String?): CLong =
    throw UnsupportedOperationException("atol not available on Android host — use androidNative target for FFI")

public actual fun atoll(s: String?): CLongLong =
    throw UnsupportedOperationException("atoll not available on Android host — use androidNative target for FFI")

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: ULong, width: ULong, cmp: Cmpfunc): COpaquePointer? =
    throw UnsupportedOperationException("bsearch not available on Android host — use androidNative target for FFI")

public actual fun ecvt(x: CDouble, n: CInt, dp: CInt?, sign: CInt?): String? =
    throw UnsupportedOperationException("ecvt not available on Android host — use androidNative target for FFI")

public actual fun llabs(a: CLongLong): CLongLong =
    throw UnsupportedOperationException("llabs not available on Android host — use androidNative target for FFI")

public actual fun qsort(base: COpaquePointer?, nel: ULong, width: ULong, cmp: Cmpfunc) {
    throw UnsupportedOperationException("qsort not available on Android host — use androidNative target for FFI")
}

public actual fun strtoul(s: String?, p: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul not available on Android host — use androidNative target for FFI")

public actual fun strtol(s: String?, p: COpaquePointer?, base: CInt): CLong =
    throw UnsupportedOperationException("strtol not available on Android host — use androidNative target for FFI")


public actual fun pthreadKeyCreate(key: PthreadKeyT?, dtor: ((COpaquePointer?) -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadKeyCreate not available on Android host — use androidNative target for FFI")

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate not available on Android host — use androidNative target for FFI")
