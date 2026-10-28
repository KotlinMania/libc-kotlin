@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.cstr
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKString
import kotlinx.cinterop.toLong
import libc.cinterop.libc_abs
import libc.cinterop.libc_atoi
import libc.cinterop.libc_atol
import libc.cinterop.libc_atoll
import libc.cinterop.libc_calloc
import libc.cinterop.libc_free
import libc.cinterop.libc_getpid
import libc.cinterop.libc_gettimeofday
import libc.cinterop.libc_isalpha
import libc.cinterop.libc_isascii
import libc.cinterop.libc_isdigit
import libc.cinterop.libc_islower
import libc.cinterop.libc_isprint
import libc.cinterop.libc_isspace
import libc.cinterop.libc_llabs
import libc.cinterop.libc_malloc
import libc.cinterop.libc_random
import libc.cinterop.libc_sem_unlink
import libc.cinterop.libc_setlocale
import libc.cinterop.libc_strchr
import libc.cinterop.libc_strcmp
import libc.cinterop.libc_strcoll
import libc.cinterop.libc_strcpy
import libc.cinterop.libc_strerror
import libc.cinterop.libc_strlen
import libc.cinterop.libc_strncmp
import libc.cinterop.libc_strnlen
import libc.cinterop.libc_strrchr
import libc.cinterop.libc_strstr

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    libc.cinterop.libc_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: ULong): COpaquePointer? =
    libc.cinterop.libc_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc requires FFI bridge")

public actual fun alignedAlloc(align: ULong, len: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc requires FFI bridge")

public actual fun free(p: COpaquePointer?) {
    if (p == null) return
    val pPtr: CPointer<ByteVar>? = p.value.toCPointer()
    if (p.allocationAlignment != 0uL) libc.cinterop.libc_aligned_free(pPtr) else libc.cinterop.libc_free(pPtr)
}

public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): Int =
    throw UnsupportedOperationException("posixMemalign requires manual FFI bridge — not yet implemented")

public actual fun memchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires FFI bridge")

public actual fun wmemchr(cx: UInt?, c: UInt, n: ULong): UInt? =
    throw UnsupportedOperationException("wmemchr requires manual FFI bridge — not yet implemented")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): Int =
    throw UnsupportedOperationException("memcmp requires FFI bridge")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy requires FFI bridge")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires FFI bridge")

public actual fun memset(dest: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset requires FFI bridge")

public actual fun pthreadJoin(native: ULong, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJoin requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSettee(attr: PthreadAttrT?, ca: Int, taskId: Int, shadow: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSettee requires manual FFI bridge — not yet implemented")

public actual fun schedYield(): Int =
    throw UnsupportedOperationException("schedYield requires manual FFI bridge — not yet implemented")

public actual fun pthreadKeyDelete(key: UInt): Int =
    throw UnsupportedOperationException("pthreadKeyDelete requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetspecific(key: UInt): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetspecific(key: UInt, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadSetspecific requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexLock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexLock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexTrylock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondBroadcast requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondSignal(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondSignal requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadCondWait requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwait requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinInit(lock: Int?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadSpinInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinDestroy(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinLock(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinLock requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinTrylock(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinTrylock requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinUnlock(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetschedprio(native: ULong, priority: Int): Int =
    throw UnsupportedOperationException("pthreadSetschedprio requires manual FFI bridge — not yet implemented")

public actual fun pthreadOnce(pot: Int?, f: (() -> io.github.kotlinmania.libc.COpaquePointer?)?): Int =
    throw UnsupportedOperationException("pthreadOnce requires manual FFI bridge — not yet implemented")

public actual fun pthreadEqual(p1: ULong, p2: ULong): Int =
    throw UnsupportedOperationException("pthreadEqual requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSetprotocol(a: PthreadMutexattrT?, protocol: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetprotocol requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stack: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstack requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetaffinityNp(td: ULong, size: ULong, set: CpuSetT?): Int =
    throw UnsupportedOperationException("pthreadSetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetaffinityNp(td: ULong, size: ULong, set: CpuSetT?): Int =
    throw UnsupportedOperationException("pthreadGetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun printf(fmt: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("printf requires manual FFI bridge — not yet implemented")

public actual fun scanf(fmt: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("scanf requires manual FFI bridge — not yet implemented")

public actual fun snprintf(s: String?, n: ULong, fmt: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("snprintf requires manual FFI bridge — not yet implemented")

public actual fun sprintf(s: String?, fmt: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sprintf requires manual FFI bridge — not yet implemented")

public actual fun vsnprintf(s: String?, n: ULong, fmt: String?, ap: String?): Int =
    throw UnsupportedOperationException("vsnprintf requires manual FFI bridge — not yet implemented")

public actual fun vsprintf(s: String?, fmt: String?, ap: String?): Int =
    throw UnsupportedOperationException("vsprintf requires manual FFI bridge — not yet implemented")

public actual fun schedGetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedGetaffinity requires manual FFI bridge — not yet implemented")

public actual fun schedSetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedSetaffinity requires manual FFI bridge — not yet implemented")

public actual fun sysconf(name: Int): Long =
    throw UnsupportedOperationException("sysconf requires FFI bridge")

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: Int, flags: Int, fd: Int, offset: Long): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires manual FFI bridge — not yet implemented")

public actual fun munmap(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munmap requires FFI bridge")

public actual fun errnoLocation(): Int? =
    throw UnsupportedOperationException("errnoLocation requires manual FFI bridge — not yet implemented")

public actual fun strerror(e: Int): String? {
    val result = libc_strerror(e)
    return result?.toKString()
}

public actual fun clockGettime(clockId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires FFI bridge")

public actual fun getpid(): Int =
    libc.cinterop.libc_getpid()

public actual fun gettimeofday(tv: Timeval?, tz: COpaquePointer?): Int {
    if (tv == null) return -1
    val tvPtr: CPointer<ByteVar>? = tv.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.value.toCPointer()
    val result = libc_gettimeofday(tvPtr, tzPtr)
    return result
}

public actual fun strftime(s: String?, sz: ULong, format: String?, tm: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires manual FFI bridge — not yet implemented")

public actual fun time(t: Long?): Long =
    throw UnsupportedOperationException("time requires manual FFI bridge — not yet implemented")

public actual fun semClose(sem: SemT?): Int =
    throw UnsupportedOperationException("semClose requires manual FFI bridge — not yet implemented")

public actual fun semDestroy(sem: SemT?): Int =
    throw UnsupportedOperationException("semDestroy requires manual FFI bridge — not yet implemented")

public actual fun semGetvalue(sem: SemT?, valp: Int?): Int =
    throw UnsupportedOperationException("semGetvalue requires manual FFI bridge — not yet implemented")

public actual fun semInit(sem: SemT?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit requires manual FFI bridge — not yet implemented")

public actual fun semOpen(name: String?, flags: Int, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires manual FFI bridge — not yet implemented")

public actual fun semPost(sem: SemT?): Int =
    throw UnsupportedOperationException("semPost requires manual FFI bridge — not yet implemented")

public actual fun semUnlink(name: String?): Int {
    val result = libc_sem_unlink(name)
    return result
}

public actual fun semWait(sem: SemT?): Int =
    throw UnsupportedOperationException("semWait requires manual FFI bridge — not yet implemented")

public actual fun setlocale(cat: Int, name: String?): String? {
    val result = libc_setlocale(cat, name)
    return result?.toKString()
}

public actual fun strcoll(l: String?, r: String?): Int {
    if (l == null) return -1
    if (r == null) return -1
    return libc.cinterop.libc_strcoll(l, r)
}

public actual fun strxfrm(dest: String?, src: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires FFI bridge")

public actual fun mbrtowc(wc: UInt?, src: String?, n: ULong, st: MbstateT?): ULong =
    throw UnsupportedOperationException("mbrtowc requires manual FFI bridge — not yet implemented")

public actual fun wcrtomb(s: String?, wc: UInt, st: MbstateT?): ULong =
    throw UnsupportedOperationException("wcrtomb requires manual FFI bridge — not yet implemented")

public actual fun wctob(c: UInt): Int =
    throw UnsupportedOperationException("wctob requires manual FFI bridge — not yet implemented")

public actual fun srandom(seed: UInt): Unit = throw UnsupportedOperationException("srandom requires manual FFI bridge — not yet implemented")

public actual fun initstate(seed: UInt, state: String?, size: ULong): String? =
    throw UnsupportedOperationException("initstate requires manual FFI bridge — not yet implemented")

public actual fun setstate(state: String?): String? =
    throw UnsupportedOperationException("setstate requires manual FFI bridge — not yet implemented")

public actual fun random(): Long =
    libc.cinterop.libc_random()

public actual fun strchr(s: String?, c: Int): String? {
    if (s == null) return null
    return memScoped {
        val cstr = s.cstr.ptr
        val result = libc.cinterop.libc_strchr(cstr, c)
        result?.toKString()
    }
}

public actual fun strlen(cs: String?): ULong =
    libc.cinterop.libc_strlen(cs)

public actual fun strcmp(l: String?, r: String?): Int {
    if (l == null) return -1
    if (r == null) return -1
    return libc.cinterop.libc_strcmp(l, r)
}

public actual fun strcpy(dest: String?, src: String?): String? {
    if (src == null) return null
    return memScoped {
        val srcBuf = src.cstr.ptr
        val len = src.length + 1
        val dstBuf = allocArray<ByteVar>(len)
        libc.cinterop.libc_strcpy(dstBuf, srcBuf)
        dstBuf.toKString()
    }
}

public actual fun strncmp(l: String?, r: String?, n: ULong): Int =
    libc.cinterop.libc_strncmp(l, r, n)

public actual fun strncpy(dest: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires FFI bridge")

public actual fun strnlen(cs: String?, n: ULong): ULong =
    libc.cinterop.libc_strnlen(cs, n)

public actual fun strrchr(s: String?, c: Int): String? {
    if (s == null) return null
    return memScoped {
        val cstr = s.cstr.ptr
        val result = libc.cinterop.libc_strrchr(cstr, c)
        result?.toKString()
    }
}

public actual fun strstr(h: String?, n: String?): String? {
    if (h == null) return null
    if (n == null) return null
    return memScoped {
        val cstr = h.cstr.ptr
        val nstr = n.cstr.ptr
        val result = libc.cinterop.libc_strstr(cstr, nstr)
        result?.toKString()
    }
}

public actual fun wcschr(s: UInt?, c: UInt): UInt? =
    throw UnsupportedOperationException("wcschr requires manual FFI bridge — not yet implemented")

public actual fun wcslen(s: UInt?): ULong =
    throw UnsupportedOperationException("wcslen requires manual FFI bridge — not yet implemented")

public actual fun isalpha(c: Int): Int = libc.cinterop.libc_isalpha(c)

public actual fun isascii(c: Int): Int =
    libc.cinterop.libc_isascii(c)

public actual fun isdigit(c: Int): Int = libc.cinterop.libc_isdigit(c)

public actual fun islower(c: Int): Int = libc.cinterop.libc_islower(c)

public actual fun isprint(c: Int): Int = libc.cinterop.libc_isprint(c)

public actual fun isspace(c: Int): Int = libc.cinterop.libc_isspace(c)

public actual fun iswctype(wc: UInt, ttype: ULong): Int =
    throw UnsupportedOperationException("iswctype requires manual FFI bridge — not yet implemented")

public actual fun iswdigit(wc: UInt): Int =
    throw UnsupportedOperationException("iswdigit requires manual FFI bridge — not yet implemented")

public actual fun iswlower(wc: UInt): Int =
    throw UnsupportedOperationException("iswlower requires manual FFI bridge — not yet implemented")

public actual fun iswspace(wc: UInt): Int =
    throw UnsupportedOperationException("iswspace requires manual FFI bridge — not yet implemented")

public actual fun iswupper(wc: UInt): Int =
    throw UnsupportedOperationException("iswupper requires manual FFI bridge — not yet implemented")

public actual fun abs(x: Int): Int =
    libc.cinterop.libc_abs(x)

public actual fun atoi(s: String?): Int {
    if (s == null) return 0
    return libc.cinterop.libc_atoi(s)
}

public actual fun atol(s: String?): Long =
    libc.cinterop.libc_atol(s)

public actual fun atoll(s: String?): Long {
    if (s == null) return 0
    val result = libc_atoll(s)
    return result
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: ULong, width: ULong, cmp: ((io.github.kotlinmania.libc.COpaquePointer?, io.github.kotlinmania.libc.COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch requires manual FFI bridge — not yet implemented")

public actual fun ecvt(x: Double, n: Int, dp: Int?, sign: Int?): String? =
    throw UnsupportedOperationException("ecvt requires manual FFI bridge — not yet implemented")

public actual fun llabs(a: Long): Long {
    val result = libc_llabs(a)
    return result
}

public actual fun qsort(base: COpaquePointer?, nel: ULong, width: ULong, cmp: ((io.github.kotlinmania.libc.COpaquePointer?, io.github.kotlinmania.libc.COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsort requires manual FFI bridge — not yet implemented")

public actual fun strtoul(s: String?, p: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoul requires manual FFI bridge — not yet implemented")

public actual fun strtol(s: String?, p: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtol requires FFI bridge")

public actual fun pthreadKeyCreate(key: UInt?, dtor: ((COpaquePointer?) -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadKeyCreate requires manual FFI bridge — not yet implemented")

public actual fun pthreadCreate(native: ULong?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires manual FFI bridge — not yet implemented")
