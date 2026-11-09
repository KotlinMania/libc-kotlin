@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object TeeosJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_teeos_calloc(nobj: Long, size: Long): Long

    @JvmStatic
    external fun libc_teeos_malloc(size: Long): Long

    @JvmStatic
    external fun libc_teeos_realloc(p: Long, size: Long): Long

    @JvmStatic
    external fun libc_teeos_alignedAlloc(align: Long, len: Long): Long

    @JvmStatic
    external fun libc_teeos_free(p: Long)

    @JvmStatic
    external fun libc_teeos_posixMemalign(memptr: Long, align: Long, size: Long): Int

    @JvmStatic
    external fun libc_teeos_memchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_teeos_wmemchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_teeos_memcmp(cx: Long, ct: Long, n: Long): Int

    @JvmStatic
    external fun libc_teeos_memcpy(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_teeos_memmove(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_teeos_memset(dest: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_teeos_pthreadSelf(): Long

    @JvmStatic
    external fun libc_teeos_pthreadJoin(native: Long, value: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadExit(value: Long)

    @JvmStatic
    external fun libc_teeos_pthreadAttrInit(attr: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadAttrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadAttrSetstacksize(attr: Long, stackSize: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadAttrGetstacksize(attr: Long, size: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadAttrSettee(attr: Long, ca: Int, taskId: Int, shadow: Int): Int

    @JvmStatic
    external fun libc_teeos_schedYield(): Int

    @JvmStatic
    external fun libc_teeos_pthreadKeyCreate(key: Long, dtor: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadKeyDelete(key: Int): Int

    @JvmStatic
    external fun libc_teeos_pthreadGetspecific(key: Int): Long

    @JvmStatic
    external fun libc_teeos_pthreadSetspecific(key: Int, value: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadMutexDestroy(lock: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadMutexInit(lock: Long, attr: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadMutexLock(lock: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadMutexTrylock(lock: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadMutexUnlock(lock: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadMutexattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadMutexattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadMutexattrSettype(attr: Long, type: Int): Int

    @JvmStatic
    external fun libc_teeos_pthreadMutexattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_teeos_pthreadCondBroadcast(cond: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadCondDestroy(cond: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadCondInit(cond: Long, attr: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadCondSignal(cond: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadCondWait(cond: Long, lock: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadCondTimedwait(cond: Long, lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadMutexattrSetrobust(attr: Long, robustness: Int): Int

    @JvmStatic
    external fun libc_teeos_pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_teeos_pthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadSetschedprio(native: Long, priority: Int): Int

    @JvmStatic
    external fun libc_teeos_pthreadOnce(pot: Long, f: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadEqual(p1: Long, p2: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadMutexattrSetprotocol(a: Long, protocol: Int): Int

    @JvmStatic
    external fun libc_teeos_pthreadAttrSetstack(attr: Long, stack: Long, size: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadSetaffinityNp(td: Long, size: Long, set: Long): Int

    @JvmStatic
    external fun libc_teeos_pthreadGetaffinityNp(td: Long, size: Long, set: Long): Int

    @JvmStatic
    external fun libc_teeos_vsnprintf(s: Long, n: Long, fmt: String?, ap: Long): Int

    @JvmStatic
    external fun libc_teeos_vsprintf(s: Long, fmt: String?, ap: Long): Int

    @JvmStatic
    external fun libc_teeos_abort()

    @JvmStatic
    external fun libc_teeos_schedGetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_teeos_schedSetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_teeos_sysconf(name: Int): Long

    @JvmStatic
    external fun libc_teeos_mmap(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long

    @JvmStatic
    external fun libc_teeos_munmap(addr: Long, len: Long): Int

    @JvmStatic
    external fun libc_teeos_errnoLocation(): Long

    @JvmStatic
    external fun libc_teeos_strerror(e: Int): Long

    @JvmStatic
    external fun libc_teeos_clockGettime(clockId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_teeos_getpid(): Int

    @JvmStatic
    external fun libc_teeos_gettimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libc_teeos_strftime(restrict: Long, sz: Long, restrict_2: String?, restrict_3: Long): Long

    @JvmStatic
    external fun libc_teeos_time(t: Long): Long

    @JvmStatic
    external fun libc_teeos_semClose(sem: Long): Int

    @JvmStatic
    external fun libc_teeos_semDestroy(sem: Long): Int

    @JvmStatic
    external fun libc_teeos_semGetvalue(sem: Long, valp: Long): Int

    @JvmStatic
    external fun libc_teeos_semInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libc_teeos_semPost(sem: Long): Int

    @JvmStatic
    external fun libc_teeos_semUnlink(name: String?): Int

    @JvmStatic
    external fun libc_teeos_semWait(sem: Long): Int

    @JvmStatic
    external fun libc_teeos_setlocale(cat: Int, name: String?): Long

    @JvmStatic
    external fun libc_teeos_strcoll(l: String?, r: String?): Int

    @JvmStatic
    external fun libc_teeos_strxfrm(dest: Long, src: String?, n: Long): Long

    @JvmStatic
    external fun libc_teeos_strtod(s: String?, p: Long): Double

    @JvmStatic
    external fun libc_teeos_mbrtowc(wc: Long, src: String?, n: Long, st: Long): Long

    @JvmStatic
    external fun libc_teeos_wcrtomb(s: Long, wc: Int, st: Long): Long

    @JvmStatic
    external fun libc_teeos_wctob(c: Int): Int

    @JvmStatic
    external fun libc_teeos_srandom(seed: Int)

    @JvmStatic
    external fun libc_teeos_initstate(seed: Int, state: Long, size: Long): Long

    @JvmStatic
    external fun libc_teeos_setstate(state: Long): Long

    @JvmStatic
    external fun libc_teeos_random(): Long

    @JvmStatic
    external fun libc_teeos_strchr(s: String?, c: Int): Long

    @JvmStatic
    external fun libc_teeos_strlen(cs: String?): Long

    @JvmStatic
    external fun libc_teeos_strcmp(l: String?, r: String?): Int

    @JvmStatic
    external fun libc_teeos_strcpy(dest: Long, src: String?): Long

    @JvmStatic
    external fun libc_teeos_strncmp(l: String?, r: String?, n: Long): Int

    @JvmStatic
    external fun libc_teeos_strncpy(dest: Long, src: String?, n: Long): Long

    @JvmStatic
    external fun libc_teeos_strnlen(cs: String?, n: Long): Long

    @JvmStatic
    external fun libc_teeos_strrchr(s: String?, c: Int): Long

    @JvmStatic
    external fun libc_teeos_strstr(h: String?, n: String?): Long

    @JvmStatic
    external fun libc_teeos_wcschr(s: Long, c: Int): Long

    @JvmStatic
    external fun libc_teeos_wcslen(s: Long): Long

    @JvmStatic
    external fun libc_teeos_isalpha(c: Int): Int

    @JvmStatic
    external fun libc_teeos_isascii(c: Int): Int

    @JvmStatic
    external fun libc_teeos_isdigit(c: Int): Int

    @JvmStatic
    external fun libc_teeos_islower(c: Int): Int

    @JvmStatic
    external fun libc_teeos_isprint(c: Int): Int

    @JvmStatic
    external fun libc_teeos_isspace(c: Int): Int

    @JvmStatic
    external fun libc_teeos_iswctype(wc: Int, ttype: Long): Int

    @JvmStatic
    external fun libc_teeos_iswdigit(wc: Int): Int

    @JvmStatic
    external fun libc_teeos_iswlower(wc: Int): Int

    @JvmStatic
    external fun libc_teeos_iswspace(wc: Int): Int

    @JvmStatic
    external fun libc_teeos_iswupper(wc: Int): Int

    @JvmStatic
    external fun libc_teeos_towupper(wc: Int): Int

    @JvmStatic
    external fun libc_teeos_towlower(wc: Int): Int

    @JvmStatic
    external fun libc_teeos_atan(x: Double): Double

    @JvmStatic
    external fun libc_teeos_ceil(x: Double): Double

    @JvmStatic
    external fun libc_teeos_ceilf(x: Float): Float

    @JvmStatic
    external fun libc_teeos_exp(x: Double): Double

    @JvmStatic
    external fun libc_teeos_fabs(x: Double): Double

    @JvmStatic
    external fun libc_teeos_floor(x: Double): Double

    @JvmStatic
    external fun libc_teeos_frexp(x: Double, e: Long): Double

    @JvmStatic
    external fun libc_teeos_log(x: Double): Double

    @JvmStatic
    external fun libc_teeos_log2(x: Double): Double

    @JvmStatic
    external fun libc_teeos_pow(x: Double, y: Double): Double

    @JvmStatic
    external fun libc_teeos_roundf(x: Float): Float

    @JvmStatic
    external fun libc_teeos_scalbn(x: Double, n: Int): Double

    @JvmStatic
    external fun libc_teeos_sqrt(x: Double): Double

    @JvmStatic
    external fun libc_teeos_abs(x: Int): Int

    @JvmStatic
    external fun libc_teeos_atof(s: String?): Double

    @JvmStatic
    external fun libc_teeos_atoi(s: String?): Int

    @JvmStatic
    external fun libc_teeos_atol(s: String?): Long

    @JvmStatic
    external fun libc_teeos_atoll(s: String?): Long

    @JvmStatic
    external fun libc_teeos_bsearch(key: Long, base: Long, nel: Long, width: Long, cmp: Long): Long

    @JvmStatic
    external fun libc_teeos_ecvt(x: Double, n: Int, dp: Long, sign: Long): Long

    @JvmStatic
    external fun libc_teeos_imaxabs(a: Long): Long

    @JvmStatic
    external fun libc_teeos_llabs(a: Long): Long

    @JvmStatic
    external fun libc_teeos_qsort(base: Long, nel: Long, width: Long, cmp: Long)

    @JvmStatic
    external fun libc_teeos_strtoul(s: String?, p: Long, base: Int): Long

    @JvmStatic
    external fun libc_teeos_strtol(s: String?, p: Long, base: Int): Long

    @JvmStatic
    external fun libc_teeos_wcstod(s: Long, p: Long): Double
}

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    TeeosJniBridge.libc_teeos_calloc(nobj.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    TeeosJniBridge.libc_teeos_malloc(size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    TeeosJniBridge.libc_teeos_realloc((p?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alignedAlloc(align: SizeT, len: SizeT): COpaquePointer? =
    TeeosJniBridge.libc_teeos_alignedAlloc(align.toLong(), len.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(p: COpaquePointer?) {
    TeeosJniBridge.libc_teeos_free((p?.value ?: 0L))
}

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    TeeosJniBridge.libc_teeos_posixMemalign((memptr?.value ?: 0L), align.toLong(), size.toLong())

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    TeeosJniBridge.libc_teeos_memchr((cx?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    TeeosJniBridge.libc_teeos_wmemchr((cx?.value ?: 0L), c.toInt(), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    TeeosJniBridge.libc_teeos_memcmp((cx?.value ?: 0L), (ct?.value ?: 0L), n.toLong())

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    TeeosJniBridge.libc_teeos_memcpy((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    TeeosJniBridge.libc_teeos_memmove((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    TeeosJniBridge.libc_teeos_memset((dest?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSelf(): PthreadT =
    TeeosJniBridge.libc_teeos_pthreadSelf().toULong()

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadJoin(native.toLong(), (value?.value ?: 0L))

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    TeeosJniBridge.libc_teeos_pthreadExit((value?.value ?: 0L))
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadAttrInit((attr?.value ?: 0L))

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadAttrDestroy((attr?.value ?: 0L))

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadAttrGetstack((attr?.value ?: 0L), (stackaddr?.value ?: 0L), (stacksize?.value ?: 0L))

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    TeeosJniBridge.libc_teeos_pthreadAttrSetstacksize((attr?.value ?: 0L), stackSize.toLong())

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, size: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadAttrGetstacksize((attr?.value ?: 0L), (size?.value ?: 0L))

public actual fun pthreadAttrSettee(attr: COpaquePointer?, ca: CInt, taskId: CInt, shadow: CInt): CInt =
    TeeosJniBridge.libc_teeos_pthreadAttrSettee((attr?.value ?: 0L), ca, taskId, shadow)

public actual fun schedYield(): CInt =
    TeeosJniBridge.libc_teeos_schedYield()

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: FnCallback?): CInt =
    TeeosJniBridge.libc_teeos_pthreadKeyCreate((key?.value ?: 0L), 0L)

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    TeeosJniBridge.libc_teeos_pthreadKeyDelete(key.toInt())

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    TeeosJniBridge.libc_teeos_pthreadGetspecific(key.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadSetspecific(key.toInt(), (value?.value ?: 0L))

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadMutexDestroy((lock?.value ?: 0L))

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadMutexInit((lock?.value ?: 0L), (attr?.value ?: 0L))

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadMutexLock((lock?.value ?: 0L))

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadMutexTrylock((lock?.value ?: 0L))

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadMutexUnlock((lock?.value ?: 0L))

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadMutexattrDestroy((attr?.value ?: 0L))

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadMutexattrInit((attr?.value ?: 0L))

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    TeeosJniBridge.libc_teeos_pthreadMutexattrSettype((attr?.value ?: 0L), type)

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    TeeosJniBridge.libc_teeos_pthreadMutexattrSetpshared((attr?.value ?: 0L), pshared)

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadCondBroadcast((cond?.value ?: 0L))

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadCondDestroy((cond?.value ?: 0L))

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadCondInit((cond?.value ?: 0L), (attr?.value ?: 0L))

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadCondSignal((cond?.value ?: 0L))

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadCondWait((cond?.value ?: 0L), (lock?.value ?: 0L))

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadCondTimedwait((cond?.value ?: 0L), (lock?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robustness: CInt): CInt =
    TeeosJniBridge.libc_teeos_pthreadMutexattrSetrobust((attr?.value ?: 0L), robustness)

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: FnCallback1, value: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadCreate((native?.value ?: 0L), (attr?.value ?: 0L), 0L, (value?.value ?: 0L))

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    TeeosJniBridge.libc_teeos_pthreadSpinInit((lock?.value ?: 0L), pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadSpinDestroy((lock?.value ?: 0L))

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadSpinLock((lock?.value ?: 0L))

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadSpinTrylock((lock?.value ?: 0L))

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadSpinUnlock((lock?.value ?: 0L))

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    TeeosJniBridge.libc_teeos_pthreadSetschedprio(native.toLong(), priority)

public actual fun pthreadOnce(pot: COpaquePointer?, f: OnceFn?): CInt =
    TeeosJniBridge.libc_teeos_pthreadOnce((pot?.value ?: 0L), 0L)

public actual fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt =
    TeeosJniBridge.libc_teeos_pthreadEqual(p1.toLong(), p2.toLong())

public actual fun pthreadMutexattrSetprotocol(a: COpaquePointer?, protocol: CInt): CInt =
    TeeosJniBridge.libc_teeos_pthreadMutexattrSetprotocol((a?.value ?: 0L), protocol)

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stack: COpaquePointer?, size: SizeT): CInt =
    TeeosJniBridge.libc_teeos_pthreadAttrSetstack((attr?.value ?: 0L), (stack?.value ?: 0L), size.toLong())

public actual fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadSetaffinityNp(td.toLong(), size.toLong(), (set?.value ?: 0L))

public actual fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_pthreadGetaffinityNp(td.toLong(), size.toLong(), (set?.value ?: 0L))

public actual fun printf(fmt: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun scanf(fmt: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun snprintf(s: COpaquePointer?, n: SizeT, fmt: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun sprintf(s: COpaquePointer?, fmt: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun vsnprintf(s: COpaquePointer?, n: SizeT, fmt: String?, ap: VaList): CInt =
    TeeosJniBridge.libc_teeos_vsnprintf((s?.value ?: 0L), n.toLong(), fmt, (ap?.value ?: 0L))

public actual fun vsprintf(s: COpaquePointer?, fmt: String?, ap: VaList): CInt =
    TeeosJniBridge.libc_teeos_vsprintf((s?.value ?: 0L), fmt, (ap?.value ?: 0L))

public actual fun abort(): Nothing {
    TeeosJniBridge.libc_teeos_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_schedGetaffinity(pid, cpusetsize.toLong(), (cpuset?.value ?: 0L))

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_schedSetaffinity(pid, cpusetsize.toLong(), (cpuset?.value ?: 0L))

public actual fun sysconf(name: CInt): CLong =
    TeeosJniBridge.libc_teeos_sysconf(name)

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    TeeosJniBridge.libc_teeos_mmap((addr?.value ?: 0L), len.toLong(), prot, flags, fd, offset).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    TeeosJniBridge.libc_teeos_munmap((addr?.value ?: 0L), len.toLong())

public actual fun errnoLocation(): COpaquePointer? =
    TeeosJniBridge.libc_teeos_errnoLocation().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strerror(e: CInt): COpaquePointer? =
    TeeosJniBridge.libc_teeos_strerror(e).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_clockGettime(clockId, (tp?.value ?: 0L))

public actual fun getpid(): PidT =
    TeeosJniBridge.libc_teeos_getpid()

public actual fun gettimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_gettimeofday((tv?.value ?: 0L), (tz?.value ?: 0L))

public actual fun strftime(restrict: COpaquePointer?, sz: SizeT, restrict_2: String?, restrict_3: COpaquePointer?): SizeT =
    TeeosJniBridge.libc_teeos_strftime((restrict?.value ?: 0L), sz.toLong(), restrict_2, (restrict_3?.value ?: 0L)).toULong()

public actual fun time(t: COpaquePointer?): TimeT =
    TeeosJniBridge.libc_teeos_time((t?.value ?: 0L))

public actual fun semClose(sem: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_semClose((sem?.value ?: 0L))

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_semDestroy((sem?.value ?: 0L))

public actual fun semGetvalue(sem: COpaquePointer?, valp: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_semGetvalue((sem?.value ?: 0L), (valp?.value ?: 0L))

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    TeeosJniBridge.libc_teeos_semInit((sem?.value ?: 0L), pshared, value.toInt())

public actual fun semOpen(name: String?, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun semPost(sem: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_semPost((sem?.value ?: 0L))

public actual fun semUnlink(name: String?): CInt =
    TeeosJniBridge.libc_teeos_semUnlink(name)

public actual fun semWait(sem: COpaquePointer?): CInt =
    TeeosJniBridge.libc_teeos_semWait((sem?.value ?: 0L))

public actual fun setlocale(cat: CInt, name: String?): COpaquePointer? =
    TeeosJniBridge.libc_teeos_setlocale(cat, name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcoll(l: String?, r: String?): CInt =
    TeeosJniBridge.libc_teeos_strcoll(l, r)

public actual fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT =
    TeeosJniBridge.libc_teeos_strxfrm((dest?.value ?: 0L), src, n.toLong()).toULong()

public actual fun strtod(s: String?, p: COpaquePointer?): CDouble =
    TeeosJniBridge.libc_teeos_strtod(s, (p?.value ?: 0L))

public actual fun mbrtowc(wc: COpaquePointer?, src: String?, n: SizeT, st: COpaquePointer?): SizeT =
    TeeosJniBridge.libc_teeos_mbrtowc((wc?.value ?: 0L), src, n.toLong(), (st?.value ?: 0L)).toULong()

public actual fun wcrtomb(s: COpaquePointer?, wc: WcharT, st: COpaquePointer?): SizeT =
    TeeosJniBridge.libc_teeos_wcrtomb((s?.value ?: 0L), wc.toInt(), (st?.value ?: 0L)).toULong()

public actual fun wctob(c: WintT): CInt =
    TeeosJniBridge.libc_teeos_wctob(c.toInt())

public actual fun srandom(seed: CUint) {
    TeeosJniBridge.libc_teeos_srandom(seed.toInt())
}

public actual fun initstate(seed: CUint, state: COpaquePointer?, size: SizeT): COpaquePointer? =
    TeeosJniBridge.libc_teeos_initstate(seed.toInt(), (state?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setstate(state: COpaquePointer?): COpaquePointer? =
    TeeosJniBridge.libc_teeos_setstate((state?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun random(): CLong =
    TeeosJniBridge.libc_teeos_random()

public actual fun strchr(s: String?, c: CInt): COpaquePointer? =
    TeeosJniBridge.libc_teeos_strchr(s, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strlen(cs: String?): SizeT =
    TeeosJniBridge.libc_teeos_strlen(cs).toULong()

public actual fun strcmp(l: String?, r: String?): CInt =
    TeeosJniBridge.libc_teeos_strcmp(l, r)

public actual fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? =
    TeeosJniBridge.libc_teeos_strcpy((dest?.value ?: 0L), src).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncmp(l: String?, r: String?, n: SizeT): CInt =
    TeeosJniBridge.libc_teeos_strncmp(l, r, n.toLong())

public actual fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    TeeosJniBridge.libc_teeos_strncpy((dest?.value ?: 0L), src, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strnlen(cs: String?, n: SizeT): SizeT =
    TeeosJniBridge.libc_teeos_strnlen(cs, n.toLong()).toULong()

public actual fun strrchr(s: String?, c: CInt): COpaquePointer? =
    TeeosJniBridge.libc_teeos_strrchr(s, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(h: String?, n: String?): COpaquePointer? =
    TeeosJniBridge.libc_teeos_strstr(h, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wcschr(s: COpaquePointer?, c: WcharT): COpaquePointer? =
    TeeosJniBridge.libc_teeos_wcschr((s?.value ?: 0L), c.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wcslen(s: COpaquePointer?): SizeT =
    TeeosJniBridge.libc_teeos_wcslen((s?.value ?: 0L)).toULong()

public actual fun isalpha(c: CInt): CInt =
    TeeosJniBridge.libc_teeos_isalpha(c)

public actual fun isascii(c: CInt): CInt =
    TeeosJniBridge.libc_teeos_isascii(c)

public actual fun isdigit(c: CInt): CInt =
    TeeosJniBridge.libc_teeos_isdigit(c)

public actual fun islower(c: CInt): CInt =
    TeeosJniBridge.libc_teeos_islower(c)

public actual fun isprint(c: CInt): CInt =
    TeeosJniBridge.libc_teeos_isprint(c)

public actual fun isspace(c: CInt): CInt =
    TeeosJniBridge.libc_teeos_isspace(c)

public actual fun iswctype(wc: WintT, ttype: WctypeT): CInt =
    TeeosJniBridge.libc_teeos_iswctype(wc.toInt(), ttype.toLong())

public actual fun iswdigit(wc: WintT): CInt =
    TeeosJniBridge.libc_teeos_iswdigit(wc.toInt())

public actual fun iswlower(wc: WintT): CInt =
    TeeosJniBridge.libc_teeos_iswlower(wc.toInt())

public actual fun iswspace(wc: WintT): CInt =
    TeeosJniBridge.libc_teeos_iswspace(wc.toInt())

public actual fun iswupper(wc: WintT): CInt =
    TeeosJniBridge.libc_teeos_iswupper(wc.toInt())

public actual fun towupper(wc: WintT): WintT =
    TeeosJniBridge.libc_teeos_towupper(wc.toInt()).toUInt()

public actual fun towlower(wc: WintT): WintT =
    TeeosJniBridge.libc_teeos_towlower(wc.toInt()).toUInt()

public actual fun atan(x: CDouble): CDouble =
    TeeosJniBridge.libc_teeos_atan(x)

public actual fun ceil(x: CDouble): CDouble =
    TeeosJniBridge.libc_teeos_ceil(x)

public actual fun ceilf(x: CFloat): CFloat =
    TeeosJniBridge.libc_teeos_ceilf(x)

public actual fun exp(x: CDouble): CDouble =
    TeeosJniBridge.libc_teeos_exp(x)

public actual fun fabs(x: CDouble): CDouble =
    TeeosJniBridge.libc_teeos_fabs(x)

public actual fun floor(x: CDouble): CDouble =
    TeeosJniBridge.libc_teeos_floor(x)

public actual fun frexp(x: CDouble, e: COpaquePointer?): CDouble =
    TeeosJniBridge.libc_teeos_frexp(x, (e?.value ?: 0L))

public actual fun log(x: CDouble): CDouble =
    TeeosJniBridge.libc_teeos_log(x)

public actual fun log2(x: CDouble): CDouble =
    TeeosJniBridge.libc_teeos_log2(x)

public actual fun pow(x: CDouble, y: CDouble): CDouble =
    TeeosJniBridge.libc_teeos_pow(x, y)

public actual fun roundf(x: CFloat): CFloat =
    TeeosJniBridge.libc_teeos_roundf(x)

public actual fun scalbn(x: CDouble, n: CInt): CDouble =
    TeeosJniBridge.libc_teeos_scalbn(x, n)

public actual fun sqrt(x: CDouble): CDouble =
    TeeosJniBridge.libc_teeos_sqrt(x)

public actual fun abs(x: CInt): CInt =
    TeeosJniBridge.libc_teeos_abs(x)

public actual fun atof(s: String?): CDouble =
    TeeosJniBridge.libc_teeos_atof(s)

public actual fun atoi(s: String?): CInt =
    TeeosJniBridge.libc_teeos_atoi(s)

public actual fun atol(s: String?): CLong =
    TeeosJniBridge.libc_teeos_atol(s)

public actual fun atoll(s: String?): CLonglong =
    TeeosJniBridge.libc_teeos_atoll(s)

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc): COpaquePointer? =
    TeeosJniBridge.libc_teeos_bsearch((key?.value ?: 0L), (base?.value ?: 0L), nel.toLong(), width.toLong(), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun div(num: CInt, den: CInt): DivT =
    DivT()

public actual fun ecvt(x: CDouble, n: CInt, dp: COpaquePointer?, sign: COpaquePointer?): COpaquePointer? =
    TeeosJniBridge.libc_teeos_ecvt(x, n, (dp?.value ?: 0L), (sign?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun imaxabs(a: IntmaxT): IntmaxT =
    TeeosJniBridge.libc_teeos_imaxabs(a)

public actual fun llabs(a: CLonglong): CLonglong =
    TeeosJniBridge.libc_teeos_llabs(a)

public actual fun qsort(base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc) {
    TeeosJniBridge.libc_teeos_qsort((base?.value ?: 0L), nel.toLong(), width.toLong(), 0L)
}

public actual fun strtoul(s: String?, p: COpaquePointer?, base: CInt): CUlong =
    TeeosJniBridge.libc_teeos_strtoul(s, (p?.value ?: 0L), base).toULong()

public actual fun strtol(s: String?, p: COpaquePointer?, base: CInt): CLong =
    TeeosJniBridge.libc_teeos_strtol(s, (p?.value ?: 0L), base)

public actual fun wcstod(s: COpaquePointer?, p: COpaquePointer?): CDouble =
    TeeosJniBridge.libc_teeos_wcstod((s?.value ?: 0L), (p?.value ?: 0L))
