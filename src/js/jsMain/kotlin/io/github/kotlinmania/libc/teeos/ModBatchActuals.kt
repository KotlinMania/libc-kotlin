package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    callocNapi(nobj, size)

public actual fun malloc(size: ULong): COpaquePointer? =
    mallocNapi(size)

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    reallocNapi(p, size)

public actual fun alignedAlloc(align: ULong, len: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc requires N-API addon")

public actual fun free(p: COpaquePointer?) {
    freeNapi(p)
}

public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): Int =
    throw UnsupportedOperationException("posixMemalign requires N-API addon")

public actual fun memchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires N-API addon")

public actual fun wmemchr(cx: UInt?, c: UInt, n: ULong): UInt? =
    throw UnsupportedOperationException("wmemchr requires N-API addon")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): Int =
    LibcNative.memcmp(cx?.value, ct?.value, n.toInt())

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    run {
        val r = LibcNative.memcpy(dest?.value, src?.value, n.toInt())
        if (r != null && r != 0) COpaquePointer(r.toLong()) else null
    }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires N-API addon")

public actual fun memset(dest: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    run {
        val r = LibcNative.memset(dest?.value, c, n.toInt())
        if (r != null && r != 0) COpaquePointer(r.toLong()) else null
    }

public actual fun pthreadJoin(native: ULong, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJoin requires N-API addon")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrInit requires N-API addon")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrDestroy requires N-API addon")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack requires N-API addon")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires N-API addon")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires N-API addon")

public actual fun pthreadAttrSettee(attr: PthreadAttrT?, ca: Int, taskId: Int, shadow: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSettee requires N-API addon")

public actual fun schedYield(): Int =
    throw UnsupportedOperationException("schedYield requires N-API addon")

public actual fun pthreadKeyDelete(key: UInt): Int =
    throw UnsupportedOperationException("pthreadKeyDelete requires N-API addon")

public actual fun pthreadGetspecific(key: UInt): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific requires N-API addon")

public actual fun pthreadSetspecific(key: UInt, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadSetspecific requires N-API addon")

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexDestroy requires N-API addon")

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexInit requires N-API addon")

public actual fun pthreadMutexLock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexLock requires N-API addon")

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexTrylock requires N-API addon")

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexUnlock requires N-API addon")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires N-API addon")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrInit requires N-API addon")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires N-API addon")

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared requires N-API addon")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondBroadcast requires N-API addon")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondDestroy requires N-API addon")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondInit requires N-API addon")

public actual fun pthreadCondSignal(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondSignal requires N-API addon")

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadCondWait requires N-API addon")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwait requires N-API addon")

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust requires N-API addon")

public actual fun pthreadSpinInit(lock: Int?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadSpinInit requires N-API addon")

public actual fun pthreadSpinDestroy(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinDestroy requires N-API addon")

public actual fun pthreadSpinLock(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinLock requires N-API addon")

public actual fun pthreadSpinTrylock(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinTrylock requires N-API addon")

public actual fun pthreadSpinUnlock(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinUnlock requires N-API addon")

public actual fun pthreadSetschedprio(native: ULong, priority: Int): Int =
    throw UnsupportedOperationException("pthreadSetschedprio requires N-API addon")

public actual fun pthreadOnce(pot: Int?, f: (() -> io.github.kotlinmania.libc.COpaquePointer?)?): Int =
    throw UnsupportedOperationException("pthreadOnce requires N-API addon")

public actual fun pthreadEqual(p1: ULong, p2: ULong): Int =
    throw UnsupportedOperationException("pthreadEqual requires N-API addon")

public actual fun pthreadMutexattrSetprotocol(a: PthreadMutexattrT?, protocol: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetprotocol requires N-API addon")

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stack: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstack requires N-API addon")

public actual fun pthreadSetaffinityNp(td: ULong, size: ULong, set: CpuSetT?): Int =
    throw UnsupportedOperationException("pthreadSetaffinityNp requires N-API addon")

public actual fun pthreadGetaffinityNp(td: ULong, size: ULong, set: CpuSetT?): Int =
    throw UnsupportedOperationException("pthreadGetaffinityNp requires N-API addon")

public actual fun printf(fmt: String?, vararg args: Any?): Int =
    if (fmt != null) LibcNative.printf(fmt) else -1

public actual fun scanf(fmt: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("scanf requires N-API addon")

public actual fun snprintf(s: String?, n: ULong, fmt: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("snprintf requires N-API addon")

public actual fun sprintf(s: String?, fmt: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sprintf requires N-API addon")

public actual fun vsnprintf(s: String?, n: ULong, fmt: String?, ap: String?): Int =
    throw UnsupportedOperationException("vsnprintf requires N-API addon")

public actual fun vsprintf(s: String?, fmt: String?, ap: String?): Int =
    throw UnsupportedOperationException("vsprintf requires N-API addon")

public actual fun schedGetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedGetaffinity requires N-API addon")

public actual fun schedSetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedSetaffinity requires N-API addon")

public actual fun sysconf(name: Int): Long =
    throw UnsupportedOperationException("sysconf requires N-API addon")

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: Int, flags: Int, fd: Int, offset: Long): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires N-API addon")

public actual fun munmap(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munmap requires N-API addon")

public actual fun errnoLocation(): Int? =
    throw UnsupportedOperationException("errnoLocation requires N-API addon")

public actual fun strerror(e: Int): String? =
    throw UnsupportedOperationException("strerror requires N-API addon")

public actual fun clockGettime(clockId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun getpid(): Int =
    getpidNapi()

public actual fun gettimeofday(tv: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun strftime(s: String?, sz: ULong, format: String?, tm: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires N-API addon")

public actual fun time(t: Long?): Long =
    throw UnsupportedOperationException("time requires N-API addon")

public actual fun semClose(sem: SemT?): Int =
    throw UnsupportedOperationException("semClose requires N-API addon")

public actual fun semDestroy(sem: SemT?): Int =
    throw UnsupportedOperationException("semDestroy requires N-API addon")

public actual fun semGetvalue(sem: SemT?, valp: Int?): Int =
    throw UnsupportedOperationException("semGetvalue requires N-API addon")

public actual fun semInit(sem: SemT?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit requires N-API addon")

public actual fun semOpen(name: String?, flags: Int, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires N-API addon")

public actual fun semPost(sem: SemT?): Int =
    throw UnsupportedOperationException("semPost requires N-API addon")

public actual fun semUnlink(name: String?): Int =
    throw UnsupportedOperationException("semUnlink requires N-API addon")

public actual fun semWait(sem: SemT?): Int =
    throw UnsupportedOperationException("semWait requires N-API addon")

public actual fun setlocale(cat: Int, name: String?): String? =
    throw UnsupportedOperationException("setlocale requires N-API addon")

public actual fun strcoll(l: String?, r: String?): Int =
    throw UnsupportedOperationException("strcoll requires N-API addon")

public actual fun strxfrm(dest: String?, src: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires N-API addon")

public actual fun mbrtowc(wc: UInt?, src: String?, n: ULong, st: MbstateT?): ULong =
    throw UnsupportedOperationException("mbrtowc requires N-API addon")

public actual fun wcrtomb(s: String?, wc: UInt, st: MbstateT?): ULong =
    throw UnsupportedOperationException("wcrtomb requires N-API addon")

public actual fun wctob(c: UInt): Int =
    throw UnsupportedOperationException("wctob requires N-API addon")

public actual fun srandom(seed: UInt): Unit = throw UnsupportedOperationException("srandom requires N-API addon")

public actual fun initstate(seed: UInt, state: String?, size: ULong): String? =
    throw UnsupportedOperationException("initstate requires N-API addon")

public actual fun setstate(state: String?): String? =
    throw UnsupportedOperationException("setstate requires N-API addon")

public actual fun random(): Long =
    throw UnsupportedOperationException("random requires N-API addon")

public actual fun strchr(s: String?, c: Int): String? =
    if (s == null) {
        null
    } else {
        val idx = s.indexOf(c.toChar())
        if (idx >= 0) s.substring(idx) else null
    }

public actual fun strlen(cs: String?): ULong =
    strlenNapi(cs)

public actual fun strcmp(l: String?, r: String?): Int =
    strcmpNapi(l, r)

public actual fun strcpy(dest: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy requires N-API addon")

public actual fun strncmp(l: String?, r: String?, n: ULong): Int =
    strncmpNapi(l, r, n)

public actual fun strncpy(dest: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires N-API addon")

public actual fun strnlen(cs: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strnlen requires N-API addon")

public actual fun strrchr(s: String?, c: Int): String? =
    throw UnsupportedOperationException("strrchr requires N-API addon")

public actual fun strstr(h: String?, n: String?): String? =
    throw UnsupportedOperationException("strstr requires N-API addon")

public actual fun wcschr(s: UInt?, c: UInt): UInt? =
    throw UnsupportedOperationException("wcschr requires N-API addon")

public actual fun wcslen(s: UInt?): ULong =
    throw UnsupportedOperationException("wcslen requires N-API addon")

public actual fun isalpha(c: Int): Int =
    throw UnsupportedOperationException("isalpha requires N-API addon")

public actual fun isascii(c: Int): Int =
    throw UnsupportedOperationException("isascii requires N-API addon")

public actual fun isdigit(c: Int): Int =
    throw UnsupportedOperationException("isdigit requires N-API addon")

public actual fun islower(c: Int): Int =
    throw UnsupportedOperationException("islower requires N-API addon")

public actual fun isprint(c: Int): Int =
    throw UnsupportedOperationException("isprint requires N-API addon")

public actual fun isspace(c: Int): Int =
    throw UnsupportedOperationException("isspace requires N-API addon")

public actual fun iswctype(wc: UInt, ttype: ULong): Int =
    throw UnsupportedOperationException("iswctype requires N-API addon")

public actual fun iswdigit(wc: UInt): Int =
    throw UnsupportedOperationException("iswdigit requires N-API addon")

public actual fun iswlower(wc: UInt): Int =
    throw UnsupportedOperationException("iswlower requires N-API addon")

public actual fun iswspace(wc: UInt): Int =
    throw UnsupportedOperationException("iswspace requires N-API addon")

public actual fun iswupper(wc: UInt): Int =
    throw UnsupportedOperationException("iswupper requires N-API addon")

public actual fun abs(x: Int): Int =
    LibcNative.abs(x)

public actual fun atoi(s: String?): Int =
    atoiNapi(s)

public actual fun atol(s: String?): Long =
    throw UnsupportedOperationException("atol requires N-API addon")

public actual fun atoll(s: String?): Long =
    throw UnsupportedOperationException("atoll requires N-API addon")

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: ULong, width: ULong, cmp: ((io.github.kotlinmania.libc.COpaquePointer?, io.github.kotlinmania.libc.COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch requires N-API addon")

public actual fun ecvt(x: Double, n: Int, dp: Int?, sign: Int?): String? =
    throw UnsupportedOperationException("ecvt requires N-API addon")

public actual fun llabs(a: Long): Long =
    throw UnsupportedOperationException("llabs requires N-API addon")

public actual fun qsort(base: COpaquePointer?, nel: ULong, width: ULong, cmp: ((io.github.kotlinmania.libc.COpaquePointer?, io.github.kotlinmania.libc.COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsort requires N-API addon")

public actual fun strtoul(s: String?, p: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoul requires N-API addon")

public actual fun strtol(s: String?, p: COpaquePointer?, base: Int): Long =
    strtolNapi(s, base)

public actual fun pthreadKeyCreate(key: UInt?, dtor: ((COpaquePointer?) -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadKeyCreate requires N-API addon")

public actual fun pthreadCreate(native: ULong?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires N-API addon")
