// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toLong
import kotlinx.cinterop.toKString
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.CPointer
import libc.cinterop.libc_aligned_alloc
import libc.cinterop.libc_atoll
import libc.cinterop.libc_calloc
import libc.cinterop.libc_clock_gettime
import libc.cinterop.libc_gettimeofday
import libc.cinterop.libc_llabs
import libc.cinterop.libc_malloc
import libc.cinterop.libc_memchr
import libc.cinterop.libc_memcpy
import libc.cinterop.libc_memmove
import libc.cinterop.libc_memset
import libc.cinterop.libc_realloc
import libc.cinterop.libc_sem_unlink
import libc.cinterop.libc_setlocale
import libc.cinterop.libc_strchr
import libc.cinterop.libc_strcpy
import libc.cinterop.libc_strerror
import libc.cinterop.libc_strncpy
import libc.cinterop.libc_strrchr
import libc.cinterop.libc_strstr

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? {
    val result = libc_calloc(nobj, size)
    return if (result != null) COpaquePointer(result.toLong()) else null
}
public actual fun malloc(size: ULong): COpaquePointer? {
    val result = libc_malloc(size)
    return if (result != null) COpaquePointer(result.toLong()) else null
}
public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? {
    if (p == null) return null
    val pPtr: CPointer<ByteVar>? = p.value.toCPointer()
    val result = libc_realloc(pPtr, size)
    return if (result != null) COpaquePointer(result.toLong()) else null
}
public actual fun alignedAlloc(align: ULong, len: ULong): COpaquePointer? {
    val result = libc_aligned_alloc(align, len)
    return if (result != null) COpaquePointer(result.toLong()) else null
}

public actual fun free(p: COpaquePointer?) {
    throw UnsupportedOperationException("free requires manual FFI bridge — not yet implemented")
}

public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): CInt =
    throw UnsupportedOperationException("posixMemalign requires manual FFI bridge — not yet implemented")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? {
    if (cx == null) return null
    val cxPtr: CPointer<ByteVar>? = cx.value.toCPointer()
    val result = libc_memchr(cxPtr, c, n)
    return if (result != null) COpaquePointer(result.toLong()) else null
}
public actual fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT? =
    throw UnsupportedOperationException("wmemchr requires manual FFI bridge — not yet implemented")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt =
    libc.cinterop.libc_memcmp(cx?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), ct?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), n)
public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? {
    if (dest == null) return null
    val destPtr: CPointer<ByteVar>? = dest.value.toCPointer()
    if (src == null) return null
    val srcPtr: CPointer<ByteVar>? = src.value.toCPointer()
    val result = libc_memcpy(destPtr, srcPtr, n)
    return if (result != null) COpaquePointer(result.toLong()) else null
}
public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? {
    if (dest == null) return null
    val destPtr: CPointer<ByteVar>? = dest.value.toCPointer()
    if (src == null) return null
    val srcPtr: CPointer<ByteVar>? = src.value.toCPointer()
    val result = libc_memmove(destPtr, srcPtr, n)
    return if (result != null) COpaquePointer(result.toLong()) else null
}
public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? {
    if (dest == null) return null
    val destPtr: CPointer<ByteVar>? = dest.value.toCPointer()
    val result = libc_memset(destPtr, c, n)
    return if (result != null) COpaquePointer(result.toLong()) else null
}
public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadJoin requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSettee(attr: PthreadAttrT?, ca: CInt, taskId: CInt, shadow: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSettee requires manual FFI bridge — not yet implemented")

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("schedYield requires manual FFI bridge — not yet implemented")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    throw UnsupportedOperationException("pthreadKeyDelete requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadSetspecific requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexLock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexLock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexTrylock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondBroadcast requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondSignal requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadCondWait requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadCondTimedwait requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadSpinInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinLock requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinTrylock requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    throw UnsupportedOperationException("pthreadSetschedprio requires manual FFI bridge — not yet implemented")

public actual fun pthreadOnce(pot: PthreadOnceT?, f: OnceFn): CInt =
    throw UnsupportedOperationException("pthreadOnce requires manual FFI bridge — not yet implemented")

public actual fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadEqual requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSetprotocol(a: PthreadMutexattrT?, protocol: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetprotocol requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stack: COpaquePointer?, size: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstack requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetaffinityNp(td: PthreadT, size: ULong, set: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadSetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetaffinityNp(td: PthreadT, size: ULong, set: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadGetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun printf(fmt: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf requires manual FFI bridge — not yet implemented")

public actual fun scanf(fmt: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("scanf requires manual FFI bridge — not yet implemented")

public actual fun snprintf(s: String?, n: ULong, fmt: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("snprintf requires manual FFI bridge — not yet implemented")

public actual fun sprintf(s: String?, fmt: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sprintf requires manual FFI bridge — not yet implemented")

public actual fun vsnprintf(s: String?, n: ULong, fmt: String?, ap: VaList): CInt =
    throw UnsupportedOperationException("vsnprintf requires manual FFI bridge — not yet implemented")

public actual fun vsprintf(s: String?, fmt: String?, ap: VaList): CInt =
    throw UnsupportedOperationException("vsprintf requires manual FFI bridge — not yet implemented")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedGetaffinity requires manual FFI bridge — not yet implemented")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedSetaffinity requires manual FFI bridge — not yet implemented")

public actual fun sysconf(name: CInt): CLong =
    libc.cinterop.libc_sysconf(name)
public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires manual FFI bridge — not yet implemented")

public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt =
    libc.cinterop.libc_munmap(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len)
public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation requires manual FFI bridge — not yet implemented")

public actual fun strerror(e: CInt): String? {
    val result = libc_strerror(e)
    return result?.toKString()
}
public actual fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    val result = libc_clock_gettime(clockId, tpPtr)
    return result
}

public actual fun getpid(): PidT =
    libc.cinterop.libc_getpid()
public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.value.toCPointer()
    val result = libc_gettimeofday(tpPtr, tzPtr)
    return result
}

public actual fun strftime(s: String?, sz: ULong, format: String?, tm: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires manual FFI bridge — not yet implemented")

public actual fun time(t: TimeT?): TimeT =
    throw UnsupportedOperationException("time requires manual FFI bridge — not yet implemented")

public actual fun semClose(sem: SemT?): CInt =
    throw UnsupportedOperationException("semClose requires manual FFI bridge — not yet implemented")

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy requires manual FFI bridge — not yet implemented")

public actual fun semGetvalue(sem: SemT?, valp: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue requires manual FFI bridge — not yet implemented")

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit requires manual FFI bridge — not yet implemented")

public actual fun semOpen(name: String?, flags: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires manual FFI bridge — not yet implemented")

public actual fun semPost(sem: SemT?): CInt =
    throw UnsupportedOperationException("semPost requires manual FFI bridge — not yet implemented")

public actual fun semUnlink(name: String?): CInt {
    val result = libc_sem_unlink(name)
    return result
}

public actual fun semWait(sem: SemT?): CInt =
    throw UnsupportedOperationException("semWait requires manual FFI bridge — not yet implemented")

public actual fun setlocale(cat: CInt, name: String?): String? {
    val result = libc_setlocale(cat, name)
    return result?.toKString()
}
public actual fun strcoll(l: String?, r: String?): CInt =
    libc.cinterop.libc_strcoll(l, r)
public actual fun strxfrm(dest: String?, src: String?, n: ULong): ULong =
    libc.cinterop.libc_strxfrm(dest, src, n)
public actual fun mbrtowc(wc: WcharT?, src: String?, n: ULong, st: MbstateT?): ULong =
    throw UnsupportedOperationException("mbrtowc requires manual FFI bridge — not yet implemented")

public actual fun wcrtomb(s: String?, wc: WcharT, st: MbstateT?): ULong =
    throw UnsupportedOperationException("wcrtomb requires manual FFI bridge — not yet implemented")

public actual fun wctob(c: WintT): CInt =
    throw UnsupportedOperationException("wctob requires manual FFI bridge — not yet implemented")

public actual fun srandom(seed: CUInt) {
    throw UnsupportedOperationException("srandom requires manual FFI bridge — not yet implemented")
}

public actual fun initstate(seed: CUInt, state: String?, size: ULong): String? =
    throw UnsupportedOperationException("initstate requires manual FFI bridge — not yet implemented")

public actual fun setstate(state: String?): String? =
    throw UnsupportedOperationException("setstate requires manual FFI bridge — not yet implemented")

public actual fun random(): CLong =
    libc.cinterop.libc_random()
public actual fun strchr(s: String?, c: CInt): String? {
    val result = libc_strchr(s, c)
    return result?.toKString()
}
public actual fun strlen(cs: String?): ULong =
    libc.cinterop.libc_strlen(cs)
public actual fun strcmp(l: String?, r: String?): CInt =
    libc.cinterop.libc_strcmp(l, r)
public actual fun strcpy(dst: String?, src: String?): String? {
    val result = libc_strcpy(dst, src)
    return result?.toKString()
}
public actual fun strncmp(l: String?, r: String?, n: ULong): CInt =
    libc.cinterop.libc_strncmp(l, r, n)
public actual fun strncpy(dst: String?, src: String?, n: ULong): String? {
    val result = libc_strncpy(dst, src, n)
    return result?.toKString()
}
public actual fun strnlen(cs: String?, n: ULong): ULong =
    libc.cinterop.libc_strnlen(cs, n)
public actual fun strrchr(s: String?, c: CInt): String? {
    val result = libc_strrchr(s, c)
    return result?.toKString()
}
public actual fun strstr(h: String?, n: String?): String? {
    val result = libc_strstr(h, n)
    return result?.toKString()
}
public actual fun wcschr(s: WcharT?, c: WcharT): WcharT? =
    throw UnsupportedOperationException("wcschr requires manual FFI bridge — not yet implemented")

public actual fun wcslen(s: WcharT?): ULong =
    throw UnsupportedOperationException("wcslen requires manual FFI bridge — not yet implemented")

public actual fun isalpha(c: CInt): CInt = libc.cinterop.libc_isalpha(c)
public actual fun isascii(c: CInt): CInt =
    libc.cinterop.libc_isascii(c)
public actual fun isdigit(c: CInt): CInt = libc.cinterop.libc_isdigit(c)
public actual fun islower(c: CInt): CInt = libc.cinterop.libc_islower(c)
public actual fun isprint(c: CInt): CInt = libc.cinterop.libc_isprint(c)
public actual fun isspace(c: CInt): CInt = libc.cinterop.libc_isspace(c)
public actual fun iswctype(wc: WintT, ttype: WctypeT): CInt =
    throw UnsupportedOperationException("iswctype requires manual FFI bridge — not yet implemented")

public actual fun iswdigit(wc: WintT): CInt =
    throw UnsupportedOperationException("iswdigit requires manual FFI bridge — not yet implemented")

public actual fun iswlower(wc: WintT): CInt =
    throw UnsupportedOperationException("iswlower requires manual FFI bridge — not yet implemented")

public actual fun iswspace(wc: WintT): CInt =
    throw UnsupportedOperationException("iswspace requires manual FFI bridge — not yet implemented")

public actual fun iswupper(wc: WintT): CInt =
    throw UnsupportedOperationException("iswupper requires manual FFI bridge — not yet implemented")

public actual fun abs(x: CInt): CInt =
    libc.cinterop.libc_abs(x)
public actual fun atoi(s: String?): CInt =
    libc.cinterop.libc_atoi(s)
public actual fun atol(s: String?): CLong =
    libc.cinterop.libc_atol(s)
public actual fun atoll(s: String?): CLongLong {
    val result = libc_atoll(s)
    return result
}
public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: ULong, width: ULong, cmp: Cmpfunc): COpaquePointer? =
    throw UnsupportedOperationException("bsearch requires manual FFI bridge — not yet implemented")

public actual fun ecvt(x: CDouble, n: CInt, dp: CInt?, sign: CInt?): String? =
    throw UnsupportedOperationException("ecvt requires manual FFI bridge — not yet implemented")

public actual fun llabs(a: CLongLong): CLongLong {
    val result = libc_llabs(a)
    return result
}
public actual fun qsort(base: COpaquePointer?, nel: ULong, width: ULong, cmp: Cmpfunc) {
    throw UnsupportedOperationException("qsort requires manual FFI bridge — not yet implemented")
}

public actual fun strtoul(s: String?, p: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul requires manual FFI bridge — not yet implemented")

public actual fun strtol(s: String?, p: COpaquePointer?, base: CInt): CLong =
    libc.cinterop.libc_strtol(s, p?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), base)
public actual fun pthreadKeyCreate(key: PthreadKeyT?, dtor: ((COpaquePointer?) -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadKeyCreate requires manual FFI bridge — not yet implemented")

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate requires manual FFI bridge — not yet implemented")
