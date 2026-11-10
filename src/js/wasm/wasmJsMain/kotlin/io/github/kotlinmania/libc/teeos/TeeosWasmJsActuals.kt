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

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun malloc(size: SizeT): COpaquePointer? =
    null

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    null

public actual fun alignedAlloc(align: SizeT, len: SizeT): COpaquePointer? =
    null

public actual fun free(p: COpaquePointer?) {
}

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    0

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    null

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    null

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    0

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    null

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    null

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    null

public actual fun pthreadSelf(): PthreadT =
    0uL

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    0

public actual fun pthreadExit(value: COpaquePointer?): Nothing =
    error("Unreachable noreturn C function pthreadExit")

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    0

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, size: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSettee(attr: COpaquePointer?, ca: CInt, taskId: CInt, shadow: CInt): CInt =
    0

public actual fun schedYield(): CInt =
    0

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    0

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    0

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    null

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    0

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    0

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    0

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    0

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    0

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    0

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    0

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robustness: CInt): CInt =
    0

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    0

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    0

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    0

public actual fun pthreadOnce(pot: COpaquePointer?, f: OnceFn?): CInt =
    0

public actual fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt =
    0

public actual fun pthreadMutexattrSetprotocol(a: COpaquePointer?, protocol: CInt): CInt =
    0

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stack: COpaquePointer?, size: SizeT): CInt =
    0

public actual fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: COpaquePointer?): CInt =
    0

public actual fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: COpaquePointer?): CInt =
    0

public actual fun printf(fmt: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun scanf(fmt: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun snprintf(s: COpaquePointer?, n: SizeT, fmt: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun sprintf(s: COpaquePointer?, fmt: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun vsnprintf(s: COpaquePointer?, n: SizeT, fmt: String?, ap: VaList): CInt =
    0

public actual fun vsprintf(s: COpaquePointer?, fmt: String?, ap: VaList): CInt =
    0

public actual fun abort(): Nothing =
    error("Unreachable noreturn C function abort")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    0

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    0

public actual fun sysconf(name: CInt): CLong =
    0L

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    null

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun errnoLocation(): COpaquePointer? =
    null

public actual fun strerror(e: CInt): COpaquePointer? =
    null

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun getpid(): PidT =
    0

public actual fun gettimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun strftime(restrict: COpaquePointer?, sz: SizeT, restrict_2: String?, restrict_3: COpaquePointer?): SizeT =
    0uL

public actual fun time(t: COpaquePointer?): TimeT =
    0L

public actual fun semClose(sem: COpaquePointer?): CInt =
    0

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    0

public actual fun semGetvalue(sem: COpaquePointer?, valp: COpaquePointer?): CInt =
    0

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    0

public actual fun semOpen(name: String?, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun semPost(sem: COpaquePointer?): CInt =
    0

public actual fun semUnlink(name: String?): CInt =
    0

public actual fun semWait(sem: COpaquePointer?): CInt =
    0

public actual fun setlocale(cat: CInt, name: String?): COpaquePointer? =
    null

public actual fun strcoll(l: String?, r: String?): CInt =
    0

public actual fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT =
    0uL

public actual fun strtod(s: String?, p: COpaquePointer?): CDouble =
    0.0

public actual fun mbrtowc(wc: COpaquePointer?, src: String?, n: SizeT, st: COpaquePointer?): SizeT =
    0uL

public actual fun wcrtomb(s: COpaquePointer?, wc: WcharT, st: COpaquePointer?): SizeT =
    0uL

public actual fun wctob(c: WintT): CInt =
    0

public actual fun srandom(seed: CUint) {
}

public actual fun initstate(seed: CUint, state: COpaquePointer?, size: SizeT): COpaquePointer? =
    null

public actual fun setstate(state: COpaquePointer?): COpaquePointer? =
    null

public actual fun random(): CLong =
    0L

public actual fun strchr(s: String?, c: CInt): COpaquePointer? =
    null

public actual fun strlen(cs: String?): SizeT =
    0uL

public actual fun strcmp(l: String?, r: String?): CInt =
    0

public actual fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? =
    null

public actual fun strncmp(l: String?, r: String?, n: SizeT): CInt =
    0

public actual fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    null

public actual fun strnlen(cs: String?, n: SizeT): SizeT =
    0uL

public actual fun strrchr(s: String?, c: CInt): COpaquePointer? =
    null

public actual fun strstr(h: String?, n: String?): COpaquePointer? =
    null

public actual fun wcschr(s: COpaquePointer?, c: WcharT): COpaquePointer? =
    null

public actual fun wcslen(s: COpaquePointer?): SizeT =
    0uL

public actual fun isalpha(c: CInt): CInt =
    0

public actual fun isascii(c: CInt): CInt =
    0

public actual fun isdigit(c: CInt): CInt =
    0

public actual fun islower(c: CInt): CInt =
    0

public actual fun isprint(c: CInt): CInt =
    0

public actual fun isspace(c: CInt): CInt =
    0

public actual fun iswctype(wc: WintT, ttype: WctypeT): CInt =
    0

public actual fun iswdigit(wc: WintT): CInt =
    0

public actual fun iswlower(wc: WintT): CInt =
    0

public actual fun iswspace(wc: WintT): CInt =
    0

public actual fun iswupper(wc: WintT): CInt =
    0

public actual fun towupper(wc: WintT): WintT =
    0u

public actual fun towlower(wc: WintT): WintT =
    0u

public actual fun atan(x: CDouble): CDouble =
    0.0

public actual fun ceil(x: CDouble): CDouble =
    0.0

public actual fun ceilf(x: CFloat): CFloat =
    0.0f

public actual fun exp(x: CDouble): CDouble =
    0.0

public actual fun fabs(x: CDouble): CDouble =
    0.0

public actual fun floor(x: CDouble): CDouble =
    0.0

public actual fun frexp(x: CDouble, e: COpaquePointer?): CDouble =
    0.0

public actual fun log(x: CDouble): CDouble =
    0.0

public actual fun log2(x: CDouble): CDouble =
    0.0

public actual fun pow(x: CDouble, y: CDouble): CDouble =
    0.0

public actual fun roundf(x: CFloat): CFloat =
    0.0f

public actual fun scalbn(x: CDouble, n: CInt): CDouble =
    0.0

public actual fun sqrt(x: CDouble): CDouble =
    0.0

public actual fun abs(x: CInt): CInt =
    0

public actual fun atof(s: String?): CDouble =
    0.0

public actual fun atoi(s: String?): CInt =
    0

public actual fun atol(s: String?): CLong =
    0L

public actual fun atoll(s: String?): CLonglong =
    0L

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc): COpaquePointer? =
    null

public actual fun div(num: CInt, den: CInt): DivT =
    DivT()

public actual fun ecvt(x: CDouble, n: CInt, dp: COpaquePointer?, sign: COpaquePointer?): COpaquePointer? =
    null

public actual fun imaxabs(a: IntmaxT): IntmaxT =
    0L

public actual fun llabs(a: CLonglong): CLonglong =
    0L

public actual fun qsort(base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc) {
}

public actual fun strtoul(s: String?, p: COpaquePointer?, base: CInt): CUlong =
    0uL

public actual fun strtol(s: String?, p: COpaquePointer?, base: CInt): CLong =
    0L

public actual fun wcstod(s: COpaquePointer?, p: COpaquePointer?): CDouble =
    0.0
