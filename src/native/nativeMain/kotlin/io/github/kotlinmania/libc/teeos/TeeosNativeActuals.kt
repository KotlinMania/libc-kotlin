@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_abort
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_abs
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_alignedAlloc
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_atan
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_atof
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_atoi
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_atol
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_atoll
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_bsearch
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_calloc
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_ceil
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_ceilf
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_clockGettime
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_ecvt
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_errnoLocation
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_exp
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_fabs
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_floor
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_free
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_frexp
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_getpid
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_gettimeofday
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_imaxabs
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_initstate
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_isalpha
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_isascii
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_isdigit
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_islower
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_isprint
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_isspace
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_iswctype
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_iswdigit
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_iswlower
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_iswspace
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_iswupper
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_llabs
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_log
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_log2
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_malloc
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mbrtowc
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_memchr
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_memcmp
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_memcpy
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_memmove
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_memset
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mmap
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_munmap
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_posixMemalign
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pow
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_printf
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadAttrDestroy
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadAttrGetstack
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadAttrGetstacksize
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadAttrInit
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadAttrSetstack
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadAttrSetstacksize
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadAttrSettee
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadCondBroadcast
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadCondDestroy
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadCondInit
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadCondSignal
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadCondTimedwait
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadCondWait
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadCreate
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadEqual
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadExit
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadGetaffinityNp
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadGetspecific
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadJoin
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadKeyCreate
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadKeyDelete
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexDestroy
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexInit
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexLock
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexTrylock
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexUnlock
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexattrDestroy
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexattrInit
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexattrSetprotocol
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexattrSetpshared
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexattrSetrobust
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexattrSettype
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadOnce
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadSelf
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadSetaffinityNp
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadSetschedprio
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadSetspecific
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadSpinDestroy
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadSpinInit
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadSpinLock
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadSpinTrylock
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadSpinUnlock
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_qsort
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_random
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_realloc
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_roundf
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_scalbn
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_scanf
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_schedGetaffinity
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_schedSetaffinity
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_schedYield
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_semClose
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_semDestroy
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_semGetvalue
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_semInit
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_semOpen
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_semPost
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_semUnlink
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_semWait
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_setlocale
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_setstate
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_snprintf
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_sprintf
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_sqrt
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_srandom
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strchr
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strcmp
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strcoll
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strcpy
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strerror
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strftime
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strlen
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strncmp
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strncpy
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strnlen
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strrchr
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strstr
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strtod
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strtol
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strtoul
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strxfrm
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_sysconf
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_time
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_towlower
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_towupper
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_vsnprintf
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_vsprintf
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_wcrtomb
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_wcschr
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_wcslen
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_wcstod
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_wctob
import io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_wmemchr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    libc_teeos_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    libc_teeos_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    libc_teeos_realloc(p?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun alignedAlloc(align: SizeT, len: SizeT): COpaquePointer? =
    libc_teeos_alignedAlloc(align, len)?.let { COpaquePointer(it.toLong()) }

public actual fun free(p: COpaquePointer?) {
    libc_teeos_free(p?.value?.toCPointer<ByteVar>())
}

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    libc_teeos_posixMemalign(memptr?.value?.toCPointer<ByteVar>(), align, size)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    libc_teeos_memchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    libc_teeos_wmemchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    libc_teeos_memcmp(cx?.value?.toCPointer<ByteVar>(), ct?.value?.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    libc_teeos_memcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    libc_teeos_memmove(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    libc_teeos_memset(dest?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSelf(): PthreadT =
    (libc_teeos_pthreadSelf()?.toLong() ?: 0L).toULong()

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    libc_teeos_pthreadJoin(native.toLong().toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    libc_teeos_pthreadExit(value?.value?.toCPointer<ByteVar>())
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    libc_teeos_pthreadAttrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    libc_teeos_pthreadAttrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    libc_teeos_pthreadAttrGetstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    libc_teeos_pthreadAttrSetstacksize(attr?.value?.toCPointer<ByteVar>(), stackSize)

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, size: COpaquePointer?): CInt =
    libc_teeos_pthreadAttrGetstacksize(attr?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSettee(attr: COpaquePointer?, ca: CInt, taskId: CInt, shadow: CInt): CInt =
    libc_teeos_pthreadAttrSettee(attr?.value?.toCPointer<ByteVar>(), ca, taskId, shadow)

public actual fun schedYield(): CInt =
    libc_teeos_schedYield()

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    libc_teeos_pthreadKeyCreate(key?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    libc_teeos_pthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    libc_teeos_pthreadGetspecific(key)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    libc_teeos_pthreadSetspecific(key, value?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    libc_teeos_pthreadMutexDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    libc_teeos_pthreadMutexInit(lock?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    libc_teeos_pthreadMutexLock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    libc_teeos_pthreadMutexTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    libc_teeos_pthreadMutexUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    libc_teeos_pthreadMutexattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    libc_teeos_pthreadMutexattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    libc_teeos_pthreadMutexattrSettype(attr?.value?.toCPointer<ByteVar>(), type)

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    libc_teeos_pthreadMutexattrSetpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    libc_teeos_pthreadCondBroadcast(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    libc_teeos_pthreadCondDestroy(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    libc_teeos_pthreadCondInit(cond?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    libc_teeos_pthreadCondSignal(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    libc_teeos_pthreadCondWait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    libc_teeos_pthreadCondTimedwait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robustness: CInt): CInt =
    libc_teeos_pthreadMutexattrSetrobust(attr?.value?.toCPointer<ByteVar>(), robustness)

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    libc_teeos_pthreadCreate(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    libc_teeos_pthreadSpinInit(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    libc_teeos_pthreadSpinDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    libc_teeos_pthreadSpinLock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    libc_teeos_pthreadSpinTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    libc_teeos_pthreadSpinUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    libc_teeos_pthreadSetschedprio(native.toLong().toCPointer<ByteVar>(), priority)

public actual fun pthreadOnce(pot: COpaquePointer?, f: OnceFn?): CInt =
    libc_teeos_pthreadOnce(pot?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt =
    libc_teeos_pthreadEqual(p1.toLong().toCPointer<ByteVar>(), p2.toLong().toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetprotocol(a: COpaquePointer?, protocol: CInt): CInt =
    libc_teeos_pthreadMutexattrSetprotocol(a?.value?.toCPointer<ByteVar>(), protocol)

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stack: COpaquePointer?, size: SizeT): CInt =
    libc_teeos_pthreadAttrSetstack(attr?.value?.toCPointer<ByteVar>(), stack?.value?.toCPointer<ByteVar>(), size)

public actual fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: COpaquePointer?): CInt =
    libc_teeos_pthreadSetaffinityNp(td.toLong().toCPointer<ByteVar>(), size, set?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: COpaquePointer?): CInt =
    libc_teeos_pthreadGetaffinityNp(td.toLong().toCPointer<ByteVar>(), size, set?.value?.toCPointer<ByteVar>())

public actual fun printf(fmt: String?, vararg variadicArgs: Long): CInt =
    libc_teeos_printf(fmt, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun scanf(fmt: String?, vararg variadicArgs: Long): CInt =
    libc_teeos_scanf(fmt, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: COpaquePointer?, n: SizeT, fmt: String?, vararg variadicArgs: Long): CInt =
    libc_teeos_snprintf(s?.value?.toCPointer<ByteVar>(), n, fmt, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: COpaquePointer?, fmt: String?, vararg variadicArgs: Long): CInt =
    libc_teeos_sprintf(s?.value?.toCPointer<ByteVar>(), fmt, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun vsnprintf(s: COpaquePointer?, n: SizeT, fmt: String?, ap: VaList): CInt =
    libc_teeos_vsnprintf(s?.value?.toCPointer<ByteVar>(), n, fmt, ap?.value?.toCPointer<ByteVar>())

public actual fun vsprintf(s: COpaquePointer?, fmt: String?, ap: VaList): CInt =
    libc_teeos_vsprintf(s?.value?.toCPointer<ByteVar>(), fmt, ap?.value?.toCPointer<ByteVar>())

public actual fun abort(): Nothing {
    libc_teeos_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    libc_teeos_schedGetaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    libc_teeos_schedSetaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun sysconf(name: CInt): CLong =
    libc_teeos_sysconf(name)

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    libc_teeos_mmap(addr?.value?.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.let { COpaquePointer(it.toLong()) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    libc_teeos_munmap(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun errnoLocation(): COpaquePointer? =
    libc_teeos_errnoLocation()?.let { COpaquePointer(it.toLong()) }

public actual fun strerror(e: CInt): COpaquePointer? =
    libc_teeos_strerror(e)?.let { COpaquePointer(it.toLong()) }

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    libc_teeos_clockGettime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun getpid(): PidT =
    libc_teeos_getpid()

public actual fun gettimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    libc_teeos_gettimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun strftime(restrict: COpaquePointer?, sz: SizeT, restrict_2: String?, restrict_3: COpaquePointer?): SizeT =
    libc_teeos_strftime(restrict?.value?.toCPointer<ByteVar>(), sz, restrict_2, restrict_3?.value?.toCPointer<ByteVar>())

public actual fun time(t: COpaquePointer?): TimeT =
    libc_teeos_time(t?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: COpaquePointer?): CInt =
    libc_teeos_semClose(sem?.value?.toCPointer<ByteVar>())

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    libc_teeos_semDestroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: COpaquePointer?, valp: COpaquePointer?): CInt =
    libc_teeos_semGetvalue(sem?.value?.toCPointer<ByteVar>(), valp?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    libc_teeos_semInit(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun semOpen(name: String?, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    libc_teeos_semOpen(name, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.let { COpaquePointer(it.toLong()) }

public actual fun semPost(sem: COpaquePointer?): CInt =
    libc_teeos_semPost(sem?.value?.toCPointer<ByteVar>())

public actual fun semUnlink(name: String?): CInt =
    libc_teeos_semUnlink(name)

public actual fun semWait(sem: COpaquePointer?): CInt =
    libc_teeos_semWait(sem?.value?.toCPointer<ByteVar>())

public actual fun setlocale(cat: CInt, name: String?): COpaquePointer? =
    libc_teeos_setlocale(cat, name)?.let { COpaquePointer(it.toLong()) }

public actual fun strcoll(l: String?, r: String?): CInt =
    libc_teeos_strcoll(l, r)

public actual fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT =
    libc_teeos_strxfrm(dest?.value?.toCPointer<ByteVar>(), src, n)

public actual fun strtod(s: String?, p: COpaquePointer?): CDouble =
    libc_teeos_strtod(s, p?.value?.toCPointer<ByteVar>())

public actual fun mbrtowc(wc: COpaquePointer?, src: String?, n: SizeT, st: COpaquePointer?): SizeT =
    libc_teeos_mbrtowc(wc?.value?.toCPointer<ByteVar>(), src, n, st?.value?.toCPointer<ByteVar>())

public actual fun wcrtomb(s: COpaquePointer?, wc: WcharT, st: COpaquePointer?): SizeT =
    libc_teeos_wcrtomb(s?.value?.toCPointer<ByteVar>(), wc, st?.value?.toCPointer<ByteVar>())

public actual fun wctob(c: WintT): CInt =
    libc_teeos_wctob(c)

public actual fun srandom(seed: CUint) {
    libc_teeos_srandom(seed)
}

public actual fun initstate(seed: CUint, state: COpaquePointer?, size: SizeT): COpaquePointer? =
    libc_teeos_initstate(seed, state?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun setstate(state: COpaquePointer?): COpaquePointer? =
    libc_teeos_setstate(state?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun random(): CLong =
    libc_teeos_random()

public actual fun strchr(s: String?, c: CInt): COpaquePointer? =
    libc_teeos_strchr(s, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strlen(cs: String?): SizeT =
    libc_teeos_strlen(cs)

public actual fun strcmp(l: String?, r: String?): CInt =
    libc_teeos_strcmp(l, r)

public actual fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? =
    libc_teeos_strcpy(dest?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strncmp(l: String?, r: String?, n: SizeT): CInt =
    libc_teeos_strncmp(l, r, n)

public actual fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    libc_teeos_strncpy(dest?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strnlen(cs: String?, n: SizeT): SizeT =
    libc_teeos_strnlen(cs, n)

public actual fun strrchr(s: String?, c: CInt): COpaquePointer? =
    libc_teeos_strrchr(s, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strstr(h: String?, n: String?): COpaquePointer? =
    libc_teeos_strstr(h, n)?.let { COpaquePointer(it.toLong()) }

public actual fun wcschr(s: COpaquePointer?, c: WcharT): COpaquePointer? =
    libc_teeos_wcschr(s?.value?.toCPointer<ByteVar>(), c)?.let { COpaquePointer(it.toLong()) }

public actual fun wcslen(s: COpaquePointer?): SizeT =
    libc_teeos_wcslen(s?.value?.toCPointer<ByteVar>())

public actual fun isalpha(c: CInt): CInt =
    libc_teeos_isalpha(c)

public actual fun isascii(c: CInt): CInt =
    libc_teeos_isascii(c)

public actual fun isdigit(c: CInt): CInt =
    libc_teeos_isdigit(c)

public actual fun islower(c: CInt): CInt =
    libc_teeos_islower(c)

public actual fun isprint(c: CInt): CInt =
    libc_teeos_isprint(c)

public actual fun isspace(c: CInt): CInt =
    libc_teeos_isspace(c)

public actual fun iswctype(wc: WintT, ttype: WctypeT): CInt =
    libc_teeos_iswctype(wc, ttype)

public actual fun iswdigit(wc: WintT): CInt =
    libc_teeos_iswdigit(wc)

public actual fun iswlower(wc: WintT): CInt =
    libc_teeos_iswlower(wc)

public actual fun iswspace(wc: WintT): CInt =
    libc_teeos_iswspace(wc)

public actual fun iswupper(wc: WintT): CInt =
    libc_teeos_iswupper(wc)

public actual fun towupper(wc: WintT): WintT =
    libc_teeos_towupper(wc)

public actual fun towlower(wc: WintT): WintT =
    libc_teeos_towlower(wc)

public actual fun atan(x: CDouble): CDouble =
    libc_teeos_atan(x)

public actual fun ceil(x: CDouble): CDouble =
    libc_teeos_ceil(x)

public actual fun ceilf(x: CFloat): CFloat =
    libc_teeos_ceilf(x)

public actual fun exp(x: CDouble): CDouble =
    libc_teeos_exp(x)

public actual fun fabs(x: CDouble): CDouble =
    libc_teeos_fabs(x)

public actual fun floor(x: CDouble): CDouble =
    libc_teeos_floor(x)

public actual fun frexp(x: CDouble, e: COpaquePointer?): CDouble =
    libc_teeos_frexp(x, e?.value?.toCPointer<ByteVar>())

public actual fun log(x: CDouble): CDouble =
    libc_teeos_log(x)

public actual fun log2(x: CDouble): CDouble =
    libc_teeos_log2(x)

public actual fun pow(x: CDouble, y: CDouble): CDouble =
    libc_teeos_pow(x, y)

public actual fun roundf(x: CFloat): CFloat =
    libc_teeos_roundf(x)

public actual fun scalbn(x: CDouble, n: CInt): CDouble =
    libc_teeos_scalbn(x, n)

public actual fun sqrt(x: CDouble): CDouble =
    libc_teeos_sqrt(x)

public actual fun abs(x: CInt): CInt =
    libc_teeos_abs(x)

public actual fun atof(s: String?): CDouble =
    libc_teeos_atof(s)

public actual fun atoi(s: String?): CInt =
    libc_teeos_atoi(s)

public actual fun atol(s: String?): CLong =
    libc_teeos_atol(s)

public actual fun atoll(s: String?): CLonglong =
    libc_teeos_atoll(s)

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc): COpaquePointer? =
    libc_teeos_bsearch(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), nel, width, 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun div(num: CInt, den: CInt): DivT =
    DivT()

public actual fun ecvt(x: CDouble, n: CInt, dp: COpaquePointer?, sign: COpaquePointer?): COpaquePointer? =
    libc_teeos_ecvt(x, n, dp?.value?.toCPointer<ByteVar>(), sign?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun imaxabs(a: IntmaxT): IntmaxT =
    libc_teeos_imaxabs(a)

public actual fun llabs(a: CLonglong): CLonglong =
    libc_teeos_llabs(a)

public actual fun qsort(base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc) {
    libc_teeos_qsort(base?.value?.toCPointer<ByteVar>(), nel, width, 0L.toCPointer<ByteVar>())
}

public actual fun strtoul(s: String?, p: COpaquePointer?, base: CInt): CUlong =
    libc_teeos_strtoul(s, p?.value?.toCPointer<ByteVar>(), base)

public actual fun strtol(s: String?, p: COpaquePointer?, base: CInt): CLong =
    libc_teeos_strtol(s, p?.value?.toCPointer<ByteVar>(), base)

public actual fun wcstod(s: COpaquePointer?, p: COpaquePointer?): CDouble =
    libc_teeos_wcstod(s?.value?.toCPointer<ByteVar>(), p?.value?.toCPointer<ByteVar>())
