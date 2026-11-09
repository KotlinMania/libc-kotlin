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
import io.github.kotlinmania.libc.new.qurt.errno.errnoLocation
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_realloc(p?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun alignedAlloc(align: SizeT, len: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_alignedAlloc(align, len)?.let { COpaquePointer(it.toLong()) }

public actual fun free(p: COpaquePointer?) {
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_free(p?.value?.toCPointer<ByteVar>())
}

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_posixMemalign(memptr?.value?.toCPointer<ByteVar>(), align, size)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_memchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_wmemchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_memcmp(cx?.value?.toCPointer<ByteVar>(), ct?.value?.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_memcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_memmove(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_memset(dest?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSelf(): PthreadT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadSelf()?.toLong() ?: 0L

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadJoin(native.toLong().toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadExit(value?.value?.toCPointer<ByteVar>())
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadAttrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadAttrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadAttrGetstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadAttrSetstacksize(attr?.value?.toCPointer<ByteVar>(), stackSize)

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, size: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadAttrGetstacksize(attr?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSettee(attr: COpaquePointer?, ca: CInt, taskId: CInt, shadow: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadAttrSettee(attr?.value?.toCPointer<ByteVar>(), ca, taskId, shadow)

public actual fun schedYield(): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_schedYield()

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadKeyCreate(key?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadGetspecific(key)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadSetspecific(key, value?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexInit(lock?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexLock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexattrSettype(attr?.value?.toCPointer<ByteVar>(), type)

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexattrSetpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadCondBroadcast(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadCondDestroy(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadCondInit(cond?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadCondSignal(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadCondWait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadCondTimedwait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robustness: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexattrSetrobust(attr?.value?.toCPointer<ByteVar>(), robustness)

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadCreate(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadSpinInit(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadSpinDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadSpinLock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadSpinTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadSpinUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadSetschedprio(native.toLong().toCPointer<ByteVar>(), priority)

public actual fun pthreadOnce(pot: COpaquePointer?, f: OnceFn?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadOnce(pot?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadEqual(p1.toLong().toCPointer<ByteVar>(), p2.toLong().toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetprotocol(a: COpaquePointer?, protocol: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadMutexattrSetprotocol(a?.value?.toCPointer<ByteVar>(), protocol)

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stack: COpaquePointer?, size: SizeT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadAttrSetstack(attr?.value?.toCPointer<ByteVar>(), stack?.value?.toCPointer<ByteVar>(), size)

public actual fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadSetaffinityNp(td.toLong().toCPointer<ByteVar>(), size, set?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pthreadGetaffinityNp(td.toLong().toCPointer<ByteVar>(), size, set?.value?.toCPointer<ByteVar>())

public actual fun printf(fmt: String?): CInt =
    0

public actual fun scanf(fmt: String?): CInt =
    0

public actual fun snprintf(s: COpaquePointer?, n: SizeT, fmt: String?): CInt =
    0

public actual fun sprintf(s: COpaquePointer?, fmt: String?): CInt =
    0

public actual fun vsnprintf(s: COpaquePointer?, n: SizeT, fmt: String?, ap: VaList): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_vsnprintf(s?.value?.toCPointer<ByteVar>(), n, fmt, ap?.value?.toCPointer<ByteVar>())

public actual fun vsprintf(s: COpaquePointer?, fmt: String?, ap: VaList): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_vsprintf(s?.value?.toCPointer<ByteVar>(), fmt, ap?.value?.toCPointer<ByteVar>())

public actual fun abort(): Nothing {
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_schedGetaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_schedSetaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun sysconf(name: CInt): CLong =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_sysconf(name)

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mmap(addr?.value?.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.let { COpaquePointer(it.toLong()) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_munmap(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun errnoLocation(): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_errnoLocation()?.let { COpaquePointer(it.toLong()) }

public actual fun strerror(e: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strerror(e)?.let { COpaquePointer(it.toLong()) }

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_clockGettime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun getpid(): PidT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_getpid()

public actual fun gettimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_gettimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun strftime(restrict: COpaquePointer?, sz: SizeT, restrict: String?, restrict: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strftime(restrict?.value?.toCPointer<ByteVar>(), sz, restrict, restrict?.value?.toCPointer<ByteVar>())

public actual fun time(t: COpaquePointer?): TimeT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_time(t?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_semClose(sem?.value?.toCPointer<ByteVar>())

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_semDestroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: COpaquePointer?, valp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_semGetvalue(sem?.value?.toCPointer<ByteVar>(), valp?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_semInit(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun semOpen(name: String?, flags: CInt): COpaquePointer? =
    null

public actual fun semPost(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_semPost(sem?.value?.toCPointer<ByteVar>())

public actual fun semUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_semUnlink(name)

public actual fun semWait(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_semWait(sem?.value?.toCPointer<ByteVar>())

public actual fun setlocale(cat: CInt, name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_setlocale(cat, name)?.let { COpaquePointer(it.toLong()) }

public actual fun strcoll(l: String?, r: String?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strcoll(l, r)

public actual fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strxfrm(dest?.value?.toCPointer<ByteVar>(), src, n)

public actual fun strtod(s: String?, p: COpaquePointer?): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strtod(s, p?.value?.toCPointer<ByteVar>())

public actual fun mbrtowc(wc: COpaquePointer?, src: String?, n: SizeT, st: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mbrtowc(wc?.value?.toCPointer<ByteVar>(), src, n, st?.value?.toCPointer<ByteVar>())

public actual fun wcrtomb(s: COpaquePointer?, wc: WcharT, st: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_wcrtomb(s?.value?.toCPointer<ByteVar>(), wc, st?.value?.toCPointer<ByteVar>())

public actual fun wctob(c: WintT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_wctob(c)

public actual fun srandom(seed: CUint) {
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_srandom(seed)
}

public actual fun initstate(seed: CUint, state: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_initstate(seed, state?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun setstate(state: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_setstate(state?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun random(): CLong =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_random()

public actual fun strchr(s: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strchr(s, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strlen(cs: String?): SizeT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strlen(cs)

public actual fun strcmp(l: String?, r: String?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strcmp(l, r)

public actual fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strcpy(dest?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strncmp(l: String?, r: String?, n: SizeT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strncmp(l, r, n)

public actual fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strncpy(dest?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strnlen(cs: String?, n: SizeT): SizeT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strnlen(cs, n)

public actual fun strrchr(s: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strrchr(s, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strstr(h: String?, n: String?): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strstr(h, n)?.let { COpaquePointer(it.toLong()) }

public actual fun wcschr(s: COpaquePointer?, c: WcharT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_wcschr(s?.value?.toCPointer<ByteVar>(), c)?.let { COpaquePointer(it.toLong()) }

public actual fun wcslen(s: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_wcslen(s?.value?.toCPointer<ByteVar>())

public actual fun isalpha(c: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_isalpha(c)

public actual fun isascii(c: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_isascii(c)

public actual fun isdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_isdigit(c)

public actual fun islower(c: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_islower(c)

public actual fun isprint(c: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_isprint(c)

public actual fun isspace(c: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_isspace(c)

public actual fun iswctype(wc: WintT, ttype: WctypeT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_iswctype(wc, ttype)

public actual fun iswdigit(wc: WintT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_iswdigit(wc)

public actual fun iswlower(wc: WintT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_iswlower(wc)

public actual fun iswspace(wc: WintT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_iswspace(wc)

public actual fun iswupper(wc: WintT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_iswupper(wc)

public actual fun towupper(wc: WintT): WintT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_towupper(wc)

public actual fun towlower(wc: WintT): WintT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_towlower(wc)

public actual fun atan(x: CDouble): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_atan(x)

public actual fun ceil(x: CDouble): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_ceil(x)

public actual fun ceilf(x: CFloat): CFloat =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_ceilf(x)

public actual fun exp(x: CDouble): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_exp(x)

public actual fun fabs(x: CDouble): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_fabs(x)

public actual fun floor(x: CDouble): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_floor(x)

public actual fun frexp(x: CDouble, e: COpaquePointer?): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_frexp(x, e?.value?.toCPointer<ByteVar>())

public actual fun log(x: CDouble): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_log(x)

public actual fun log2(x: CDouble): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_log2(x)

public actual fun pow(x: CDouble, y: CDouble): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_pow(x, y)

public actual fun roundf(x: CFloat): CFloat =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_roundf(x)

public actual fun scalbn(x: CDouble, n: CInt): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_scalbn(x, n)

public actual fun sqrt(x: CDouble): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_sqrt(x)

public actual fun abs(x: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_abs(x)

public actual fun atof(s: String?): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_atof(s)

public actual fun atoi(s: String?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_atoi(s)

public actual fun atol(s: String?): CLong =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_atol(s)

public actual fun atoll(s: String?): CLonglong =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_atoll(s)

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_bsearch(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), nel, width, 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun div(num: CInt, den: CInt): DivT =
    null as DivT

public actual fun ecvt(x: CDouble, n: CInt, dp: COpaquePointer?, sign: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_ecvt(x, n, dp?.value?.toCPointer<ByteVar>(), sign?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun imaxabs(a: IntmaxT): IntmaxT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_imaxabs(a)

public actual fun llabs(a: CLonglong): CLonglong =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_llabs(a)

public actual fun qsort(base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc) {
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_qsort(base?.value?.toCPointer<ByteVar>(), nel, width, 0L.toCPointer<ByteVar>())
}

public actual fun strtoul(s: String?, p: COpaquePointer?, base: CInt): CUlong =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strtoul(s, p?.value?.toCPointer<ByteVar>(), base)

public actual fun strtol(s: String?, p: COpaquePointer?, base: CInt): CLong =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_strtol(s, p?.value?.toCPointer<ByteVar>(), base)

public actual fun wcstod(s: COpaquePointer?, p: COpaquePointer?): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_wcstod(s?.value?.toCPointer<ByteVar>(), p?.value?.toCPointer<ByteVar>())
