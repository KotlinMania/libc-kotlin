@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_realloc(p?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun alignedAlloc(align: SizeT, len: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_aligned_alloc(align, len)?.let { COpaquePointer(it.toLong()) }

public actual fun free(p: COpaquePointer?) {
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_free(p?.value?.toCPointer<ByteVar>())
}

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_posix_memalign(memptr?.value?.toCPointer<ByteVar>(), align, size)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_memchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun wmemchr(cx: UInt?, c: WcharT, n: SizeT): UInt? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_wmemchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_memcmp(cx?.value?.toCPointer<ByteVar>(), ct?.value?.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_memcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_memmove(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_memset(dest?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSelf(): PthreadT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_self()

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_join(native, value?.value?.toCPointer<ByteVar>())

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_exit(value?.value?.toCPointer<ByteVar>())
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_attr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_attr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_attr_getstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: SizeT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_attr_setstacksize(attr?.value?.toCPointer<ByteVar>(), stackSize)

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_attr_getstacksize(attr?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSettee(attr: PthreadAttrT?, ca: CInt, taskId: CInt, shadow: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_attr_settee(attr?.value?.toCPointer<ByteVar>(), ca, taskId, shadow)

public actual fun schedYield(): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_sched_yield()

public actual fun pthreadKeyCreate(key: CUint?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_key_create(key?.value?.toCPointer<ByteVar>(), dtor?.value?.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_key_delete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_getspecific(key)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_setspecific(key, value?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_mutex_destroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_mutex_init(lock?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_mutex_lock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_mutex_trylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_mutex_unlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_mutexattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_mutexattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_mutexattr_settype(attr?.value?.toCPointer<ByteVar>(), type)

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_mutexattr_setpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_cond_broadcast(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_cond_destroy(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_cond_init(cond?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_cond_signal(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_cond_wait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_cond_timedwait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_mutexattr_setrobust(attr?.value?.toCPointer<ByteVar>(), robustness)

public actual fun pthreadCreate(native: CUlong?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_create(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), f.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: CInt?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_spin_init(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: CInt?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_spin_destroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: CInt?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_spin_lock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: CInt?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_spin_trylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: CInt?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_spin_unlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_setschedprio(native, priority)

public actual fun pthreadOnce(pot: CInt?, f: OnceFn?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_once(pot?.value?.toCPointer<ByteVar>(), f?.value?.toCPointer<ByteVar>())

public actual fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_equal(p1, p2)

public actual fun pthreadMutexattrSetprotocol(a: PthreadMutexattrT?, protocol: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_mutexattr_setprotocol(a?.value?.toCPointer<ByteVar>(), protocol)

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stack: COpaquePointer?, size: SizeT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_attr_setstack(attr?.value?.toCPointer<ByteVar>(), stack?.value?.toCPointer<ByteVar>(), size)

public actual fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: CpuSetT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_setaffinity_np(td, size, set?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: CpuSetT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pthread_getaffinity_np(td, size, set?.value?.toCPointer<ByteVar>())

public actual fun vsnprintf(s: COpaquePointer?, n: SizeT, fmt: String?, ap: VaList): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_vsnprintf(s?.value?.toCPointer<ByteVar>(), n, fmt, ap?.value?.toCPointer<ByteVar>())

public actual fun vsprintf(s: COpaquePointer?, fmt: String?, ap: VaList): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_vsprintf(s?.value?.toCPointer<ByteVar>(), fmt, ap?.value?.toCPointer<ByteVar>())

public actual fun abort(): Nothing {
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_sched_getaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_sched_setaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun sysconf(name: CInt): CLong =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_sysconf(name)

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_mmap(addr?.value?.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.let { COpaquePointer(it.toLong()) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_munmap(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun errnoLocation(): CInt? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_errno_location()?.let { COpaquePointer(it.toLong()) }

public actual fun strerror(e: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_strerror(e)?.let { COpaquePointer(it.toLong()) }

public actual fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_clock_gettime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun getpid(): PidT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_getpid()

public actual fun gettimeofday(tv: Timeval?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_gettimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun strftime(restrict: COpaquePointer?, sz: SizeT, restrict: String?, restrict: Tm?): SizeT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_strftime(restrict?.value?.toCPointer<ByteVar>(), sz, restrict, restrict?.value?.toCPointer<ByteVar>())

public actual fun time(t: CLong?): TimeT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_time(t?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: SemT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_sem_close(sem?.value?.toCPointer<ByteVar>())

public actual fun semDestroy(sem: SemT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_sem_destroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: SemT?, valp: CInt?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_sem_getvalue(sem?.value?.toCPointer<ByteVar>(), valp?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_sem_init(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun semPost(sem: SemT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_sem_post(sem?.value?.toCPointer<ByteVar>())

public actual fun semUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_sem_unlink(name)

public actual fun semWait(sem: SemT?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_sem_wait(sem?.value?.toCPointer<ByteVar>())

public actual fun setlocale(cat: CInt, name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_setlocale(cat, name)?.let { COpaquePointer(it.toLong()) }

public actual fun strcoll(l: String?, r: String?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_strcoll(l, r)

public actual fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_strxfrm(dest?.value?.toCPointer<ByteVar>(), src, n)

public actual fun strtod(s: String?, p: COpaquePointer?): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_strtod(s, p?.value?.toCPointer<ByteVar>())

public actual fun mbrtowc(wc: UInt?, src: String?, n: SizeT, st: MbstateT?): SizeT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_mbrtowc(wc?.value?.toCPointer<ByteVar>(), src, n, st?.value?.toCPointer<ByteVar>())

public actual fun wcrtomb(s: COpaquePointer?, wc: WcharT, st: MbstateT?): SizeT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_wcrtomb(s?.value?.toCPointer<ByteVar>(), wc, st?.value?.toCPointer<ByteVar>())

public actual fun wctob(c: WintT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_wctob(c)

public actual fun srandom(seed: CUint) {
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_srandom(seed)
}

public actual fun initstate(seed: CUint, state: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_initstate(seed, state?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun setstate(state: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_setstate(state?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun random(): CLong =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_random()

public actual fun strchr(s: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_strchr(s, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strlen(cs: String?): SizeT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_strlen(cs)

public actual fun strcmp(l: String?, r: String?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_strcmp(l, r)

public actual fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_strcpy(dest?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strncmp(l: String?, r: String?, n: SizeT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_strncmp(l, r, n)

public actual fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_strncpy(dest?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strnlen(cs: String?, n: SizeT): SizeT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_strnlen(cs, n)

public actual fun strrchr(s: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_strrchr(s, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strstr(h: String?, n: String?): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_strstr(h, n)?.let { COpaquePointer(it.toLong()) }

public actual fun wcschr(s: UInt?, c: WcharT): UInt? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_wcschr(s?.value?.toCPointer<ByteVar>(), c)?.let { COpaquePointer(it.toLong()) }

public actual fun wcslen(s: UInt?): SizeT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_wcslen(s?.value?.toCPointer<ByteVar>())

public actual fun isalpha(c: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_isalpha(c)

public actual fun isascii(c: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_isascii(c)

public actual fun isdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_isdigit(c)

public actual fun islower(c: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_islower(c)

public actual fun isprint(c: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_isprint(c)

public actual fun isspace(c: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_isspace(c)

public actual fun iswctype(wc: WintT, ttype: WctypeT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_iswctype(wc, ttype)

public actual fun iswdigit(wc: WintT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_iswdigit(wc)

public actual fun iswlower(wc: WintT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_iswlower(wc)

public actual fun iswspace(wc: WintT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_iswspace(wc)

public actual fun iswupper(wc: WintT): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_iswupper(wc)

public actual fun towupper(wc: WintT): WintT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_towupper(wc)

public actual fun towlower(wc: WintT): WintT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_towlower(wc)

public actual fun atan(x: CDouble): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_atan(x)

public actual fun ceil(x: CDouble): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_ceil(x)

public actual fun ceilf(x: CFloat): CFloat =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_ceilf(x)

public actual fun exp(x: CDouble): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_exp(x)

public actual fun fabs(x: CDouble): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_fabs(x)

public actual fun floor(x: CDouble): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_floor(x)

public actual fun frexp(x: CDouble, e: CInt?): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_frexp(x, e?.value?.toCPointer<ByteVar>())

public actual fun log(x: CDouble): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_log(x)

public actual fun log2(x: CDouble): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_log2(x)

public actual fun pow(x: CDouble, y: CDouble): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_pow(x, y)

public actual fun roundf(x: CFloat): CFloat =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_roundf(x)

public actual fun scalbn(x: CDouble, n: CInt): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_scalbn(x, n)

public actual fun sqrt(x: CDouble): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_sqrt(x)

public actual fun abs(x: CInt): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_abs(x)

public actual fun atof(s: String?): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_atof(s)

public actual fun atoi(s: String?): CInt =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_atoi(s)

public actual fun atol(s: String?): CLong =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_atol(s)

public actual fun atoll(s: String?): CLonglong =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_atoll(s)

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_bsearch(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), nel, width, cmp.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun div(num: CInt, den: CInt): DivT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_div(num, den)

public actual fun ecvt(x: CDouble, n: CInt, dp: CInt?, sign: CInt?): COpaquePointer? =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_ecvt(x, n, dp?.value?.toCPointer<ByteVar>(), sign?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun imaxabs(a: IntmaxT): IntmaxT =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_imaxabs(a)

public actual fun llabs(a: CLonglong): CLonglong =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_llabs(a)

public actual fun qsort(base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc) {
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_qsort(base?.value?.toCPointer<ByteVar>(), nel, width, cmp.toInt())
}

public actual fun strtoul(s: String?, p: COpaquePointer?, base: CInt): CUlong =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_strtoul(s, p?.value?.toCPointer<ByteVar>(), base)

public actual fun strtol(s: String?, p: COpaquePointer?, base: CInt): CLong =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_strtol(s, p?.value?.toCPointer<ByteVar>(), base)

public actual fun wcstod(s: UInt?, p: COpaquePointer?): CDouble =
    io.github.kotlinmania.libc.teeos.cinterop.libc_teeos_mod_wcstod(s?.value?.toCPointer<ByteVar>(), p?.value?.toCPointer<ByteVar>())
