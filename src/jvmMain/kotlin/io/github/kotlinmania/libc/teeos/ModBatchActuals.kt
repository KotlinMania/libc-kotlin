// port-lint: source Mod.rs
package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc not available on JVM — no C library access")

public actual fun malloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc not available on JVM — no C library access")

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc not available on JVM — no C library access")

public actual fun alignedAlloc(align: ULong, len: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc not available on JVM — no C library access")

public actual fun free(p: COpaquePointer?): Unit = throw UnsupportedOperationException("free not available on JVM — no C library access")

public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): Int =
    throw UnsupportedOperationException("posixMemalign not available on JVM — no C library access")

public actual fun memchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr not available on JVM — no C library access")

public actual fun wmemchr(cx: UInt?, c: UInt, n: ULong): UInt? =
    throw UnsupportedOperationException("wmemchr not available on JVM — no C library access")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): Int =
    throw UnsupportedOperationException("memcmp not available on JVM — no C library access")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy not available on JVM — no C library access")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove not available on JVM — no C library access")

public actual fun memset(dest: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset not available on JVM — no C library access")

public actual fun pthreadJoin(native: ULong, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJoin not available on JVM — no C library access")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrInit not available on JVM — no C library access")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrDestroy not available on JVM — no C library access")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on JVM — no C library access")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstacksize not available on JVM — no C library access")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstacksize not available on JVM — no C library access")

public actual fun pthreadAttrSettee(attr: PthreadAttrT?, ca: Int, taskId: Int, shadow: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSettee not available on JVM — no C library access")

public actual fun schedYield(): Int =
    throw UnsupportedOperationException("schedYield not available on JVM — no C library access")

public actual fun pthreadKeyDelete(key: UInt): Int =
    throw UnsupportedOperationException("pthreadKeyDelete not available on JVM — no C library access")

public actual fun pthreadGetspecific(key: UInt): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific not available on JVM — no C library access")

public actual fun pthreadSetspecific(key: UInt, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadSetspecific not available on JVM — no C library access")

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexDestroy not available on JVM — no C library access")

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexInit not available on JVM — no C library access")

public actual fun pthreadMutexLock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexLock not available on JVM — no C library access")

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexTrylock not available on JVM — no C library access")

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexUnlock not available on JVM — no C library access")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrDestroy not available on JVM — no C library access")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrInit not available on JVM — no C library access")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSettype not available on JVM — no C library access")

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared not available on JVM — no C library access")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondBroadcast not available on JVM — no C library access")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondDestroy not available on JVM — no C library access")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondInit not available on JVM — no C library access")

public actual fun pthreadCondSignal(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondSignal not available on JVM — no C library access")

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadCondWait not available on JVM — no C library access")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwait not available on JVM — no C library access")

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust not available on JVM — no C library access")

public actual fun pthreadSpinInit(lock: Int?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadSpinInit not available on JVM — no C library access")

public actual fun pthreadSpinDestroy(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinDestroy not available on JVM — no C library access")

public actual fun pthreadSpinLock(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinLock not available on JVM — no C library access")

public actual fun pthreadSpinTrylock(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinTrylock not available on JVM — no C library access")

public actual fun pthreadSpinUnlock(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinUnlock not available on JVM — no C library access")

public actual fun pthreadSetschedprio(native: ULong, priority: Int): Int =
    throw UnsupportedOperationException("pthreadSetschedprio not available on JVM — no C library access")

public actual fun pthreadOnce(pot: Int?, f: (() -> io.github.kotlinmania.libc.COpaquePointer?)?): Int =
    throw UnsupportedOperationException("pthreadOnce not available on JVM — no C library access")

public actual fun pthreadEqual(p1: ULong, p2: ULong): Int =
    throw UnsupportedOperationException("pthreadEqual not available on JVM — no C library access")

public actual fun pthreadMutexattrSetprotocol(a: PthreadMutexattrT?, protocol: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetprotocol not available on JVM — no C library access")

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stack: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstack not available on JVM — no C library access")

public actual fun pthreadSetaffinityNp(td: ULong, size: ULong, set: CpuSetT?): Int =
    throw UnsupportedOperationException("pthreadSetaffinityNp not available on JVM — no C library access")

public actual fun pthreadGetaffinityNp(td: ULong, size: ULong, set: CpuSetT?): Int =
    throw UnsupportedOperationException("pthreadGetaffinityNp not available on JVM — no C library access")

public actual fun printf(fmt: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("printf not available on JVM — no C library access")

public actual fun scanf(fmt: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("scanf not available on JVM — no C library access")

public actual fun snprintf(s: String?, n: ULong, fmt: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("snprintf not available on JVM — no C library access")

public actual fun sprintf(s: String?, fmt: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sprintf not available on JVM — no C library access")

public actual fun vsnprintf(s: String?, n: ULong, fmt: String?, ap: String?): Int =
    throw UnsupportedOperationException("vsnprintf not available on JVM — no C library access")

public actual fun vsprintf(s: String?, fmt: String?, ap: String?): Int =
    throw UnsupportedOperationException("vsprintf not available on JVM — no C library access")

public actual fun schedGetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedGetaffinity not available on JVM — no C library access")

public actual fun schedSetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedSetaffinity not available on JVM — no C library access")

public actual fun sysconf(name: Int): Long =
    throw UnsupportedOperationException("sysconf not available on JVM — no C library access")

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: Int, flags: Int, fd: Int, offset: Long): COpaquePointer? =
    throw UnsupportedOperationException("mmap not available on JVM — no C library access")

public actual fun munmap(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munmap not available on JVM — no C library access")

public actual fun errnoLocation(): Int? =
    throw UnsupportedOperationException("errnoLocation not available on JVM — no C library access")

public actual fun strerror(e: Int): String? =
    throw UnsupportedOperationException("strerror not available on JVM — no C library access")

public actual fun clockGettime(clockId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime not available on JVM — no C library access")

public actual fun getpid(): Int =
    throw UnsupportedOperationException("getpid not available on JVM — no C library access")

public actual fun gettimeofday(tv: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday not available on JVM — no C library access")

public actual fun strftime(s: String?, sz: ULong, format: String?, tm: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on JVM — no C library access")

public actual fun time(t: Long?): Long =
    throw UnsupportedOperationException("time not available on JVM — no C library access")

public actual fun semClose(sem: SemT?): Int =
    throw UnsupportedOperationException("semClose not available on JVM — no C library access")

public actual fun semDestroy(sem: SemT?): Int =
    throw UnsupportedOperationException("semDestroy not available on JVM — no C library access")

public actual fun semGetvalue(sem: SemT?, valp: Int?): Int =
    throw UnsupportedOperationException("semGetvalue not available on JVM — no C library access")

public actual fun semInit(sem: SemT?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit not available on JVM — no C library access")

public actual fun semOpen(name: String?, flags: Int, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen not available on JVM — no C library access")

public actual fun semPost(sem: SemT?): Int =
    throw UnsupportedOperationException("semPost not available on JVM — no C library access")

public actual fun semUnlink(name: String?): Int =
    throw UnsupportedOperationException("semUnlink not available on JVM — no C library access")

public actual fun semWait(sem: SemT?): Int =
    throw UnsupportedOperationException("semWait not available on JVM — no C library access")

public actual fun setlocale(cat: Int, name: String?): String? =
    throw UnsupportedOperationException("setlocale not available on JVM — no C library access")

public actual fun strcoll(l: String?, r: String?): Int =
    throw UnsupportedOperationException("strcoll not available on JVM — no C library access")

public actual fun strxfrm(dest: String?, src: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm not available on JVM — no C library access")

public actual fun mbrtowc(wc: UInt?, src: String?, n: ULong, st: MbstateT?): ULong =
    throw UnsupportedOperationException("mbrtowc not available on JVM — no C library access")

public actual fun wcrtomb(s: String?, wc: UInt, st: MbstateT?): ULong =
    throw UnsupportedOperationException("wcrtomb not available on JVM — no C library access")

public actual fun wctob(c: UInt): Int =
    throw UnsupportedOperationException("wctob not available on JVM — no C library access")

public actual fun srandom(seed: UInt): Unit = throw UnsupportedOperationException("srandom not available on JVM — no C library access")

public actual fun initstate(seed: UInt, state: String?, size: ULong): String? =
    throw UnsupportedOperationException("initstate not available on JVM — no C library access")

public actual fun setstate(state: String?): String? =
    throw UnsupportedOperationException("setstate not available on JVM — no C library access")

public actual fun random(): Long =
    throw UnsupportedOperationException("random not available on JVM — no C library access")

public actual fun strchr(s: String?, c: Int): String? =
    throw UnsupportedOperationException("strchr not available on JVM — no C library access")

public actual fun strlen(cs: String?): ULong =
    throw UnsupportedOperationException("strlen not available on JVM — no C library access")

public actual fun strcmp(l: String?, r: String?): Int =
    throw UnsupportedOperationException("strcmp not available on JVM — no C library access")

public actual fun strcpy(dest: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy not available on JVM — no C library access")

public actual fun strncmp(l: String?, r: String?, n: ULong): Int =
    throw UnsupportedOperationException("strncmp not available on JVM — no C library access")

public actual fun strncpy(dest: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy not available on JVM — no C library access")

public actual fun strnlen(cs: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strnlen not available on JVM — no C library access")

public actual fun strrchr(s: String?, c: Int): String? =
    throw UnsupportedOperationException("strrchr not available on JVM — no C library access")

public actual fun strstr(h: String?, n: String?): String? =
    throw UnsupportedOperationException("strstr not available on JVM — no C library access")

public actual fun wcschr(s: UInt?, c: UInt): UInt? =
    throw UnsupportedOperationException("wcschr not available on JVM — no C library access")

public actual fun wcslen(s: UInt?): ULong =
    throw UnsupportedOperationException("wcslen not available on JVM — no C library access")

public actual fun isalpha(c: Int): Int =
    throw UnsupportedOperationException("isalpha not available on JVM — no C library access")

public actual fun isascii(c: Int): Int =
    throw UnsupportedOperationException("isascii not available on JVM — no C library access")

public actual fun isdigit(c: Int): Int =
    throw UnsupportedOperationException("isdigit not available on JVM — no C library access")

public actual fun islower(c: Int): Int =
    throw UnsupportedOperationException("islower not available on JVM — no C library access")

public actual fun isprint(c: Int): Int =
    throw UnsupportedOperationException("isprint not available on JVM — no C library access")

public actual fun isspace(c: Int): Int =
    throw UnsupportedOperationException("isspace not available on JVM — no C library access")

public actual fun iswctype(wc: UInt, ttype: ULong): Int =
    throw UnsupportedOperationException("iswctype not available on JVM — no C library access")

public actual fun iswdigit(wc: UInt): Int =
    throw UnsupportedOperationException("iswdigit not available on JVM — no C library access")

public actual fun iswlower(wc: UInt): Int =
    throw UnsupportedOperationException("iswlower not available on JVM — no C library access")

public actual fun iswspace(wc: UInt): Int =
    throw UnsupportedOperationException("iswspace not available on JVM — no C library access")

public actual fun iswupper(wc: UInt): Int =
    throw UnsupportedOperationException("iswupper not available on JVM — no C library access")

public actual fun abs(x: Int): Int =
    throw UnsupportedOperationException("abs not available on JVM — no C library access")

public actual fun atoi(s: String?): Int =
    throw UnsupportedOperationException("atoi not available on JVM — no C library access")

public actual fun atol(s: String?): Long =
    throw UnsupportedOperationException("atol not available on JVM — no C library access")

public actual fun atoll(s: String?): Long =
    throw UnsupportedOperationException("atoll not available on JVM — no C library access")

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: ULong, width: ULong, cmp: ((io.github.kotlinmania.libc.COpaquePointer?, io.github.kotlinmania.libc.COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch not available on JVM — no C library access")

public actual fun ecvt(x: Double, n: Int, dp: Int?, sign: Int?): String? =
    throw UnsupportedOperationException("ecvt not available on JVM — no C library access")

public actual fun llabs(a: Long): Long =
    throw UnsupportedOperationException("llabs not available on JVM — no C library access")

public actual fun qsort(base: COpaquePointer?, nel: ULong, width: ULong, cmp: ((io.github.kotlinmania.libc.COpaquePointer?, io.github.kotlinmania.libc.COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsort not available on JVM — no C library access")

public actual fun strtoul(s: String?, p: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoul not available on JVM — no C library access")

public actual fun strtol(s: String?, p: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtol not available on JVM — no C library access")

public actual fun pthreadKeyCreate(key: UInt?, dtor: ((COpaquePointer?) -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadKeyCreate not available on JVM — no C library access")

public actual fun pthreadCreate(native: ULong?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate not available on JVM — no C library access")
