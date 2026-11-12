@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosAbort
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosAbs
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosAlignedAlloc
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosAtan
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosAtof
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosAtoi
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosAtol
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosAtoll
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosBsearch
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosCalloc
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosCeil
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosCeilf
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosClockGettime
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosEcvt
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosErrnoLocation
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosExp
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosFabs
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosFloor
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosFree
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosFrexp
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosGetpid
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosGettimeofday
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosImaxabs
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosInitstate
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosIsalpha
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosIsascii
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosIsdigit
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosIslower
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosIsprint
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosIsspace
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosIswctype
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosIswdigit
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosIswlower
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosIswspace
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosIswupper
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosLlabs
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosLog
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosLog2
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosMalloc
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosMbrtowc
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosMemchr
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosMemcmp
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosMemcpy
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosMemmove
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosMemset
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosMmap
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosMunmap
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPosixMemalign
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPow
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPrintf
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadAttrDestroy
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadAttrGetstack
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadAttrGetstacksize
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadAttrInit
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadAttrSetstack
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadAttrSetstacksize
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadAttrSettee
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadCondBroadcast
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadCondDestroy
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadCondInit
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadCondSignal
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadCondTimedwait
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadCondWait
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadCreate
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadEqual
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadExit
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadGetaffinityNp
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadGetspecific
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadJoin
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadKeyCreate
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadKeyDelete
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadMutexDestroy
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadMutexInit
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadMutexLock
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadMutexTrylock
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadMutexUnlock
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadMutexattrDestroy
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadMutexattrInit
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadMutexattrSetprotocol
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadMutexattrSetpshared
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadMutexattrSetrobust
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadMutexattrSettype
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadOnce
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadSelf
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadSetaffinityNp
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadSetschedprio
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadSetspecific
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadSpinDestroy
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadSpinInit
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadSpinLock
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadSpinTrylock
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosPthreadSpinUnlock
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosQsort
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosRandom
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosRealloc
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosRoundf
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosScalbn
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosScanf
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosSchedGetaffinity
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosSchedSetaffinity
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosSchedYield
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosSemClose
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosSemDestroy
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosSemGetvalue
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosSemInit
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosSemOpen
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosSemPost
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosSemUnlink
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosSemWait
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosSetlocale
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosSetstate
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosSnprintf
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosSprintf
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosSqrt
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosSrandom
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosStrchr
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosStrcmp
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosStrcoll
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosStrcpy
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosStrerror
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosStrftime
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosStrlen
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosStrncmp
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosStrncpy
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosStrnlen
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosStrrchr
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosStrstr
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosStrtod
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosStrtol
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosStrtoul
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosStrxfrm
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosSysconf
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosTime
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosTowlower
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosTowupper
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosVsnprintf
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosVsprintf
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosWcrtomb
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosWcschr
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosWcslen
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosWcstod
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosWctob
import io.github.kotlinmania.libc.teeos.cinterop.libcTeeosWmemchr
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcTeeosCalloc(nobj, size)?.toLong() ?: 0L)

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    MutPtr(libcTeeosMalloc(size)?.toLong() ?: 0L)

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcTeeosRealloc(p.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun alignedAlloc(align: SizeT, len: SizeT): MutPtr<CVoid> =
    MutPtr(libcTeeosAlignedAlloc(align, len)?.toLong() ?: 0L)

public actual fun free(p: MutPtr<CVoid>) {
    libcTeeosFree(p.rawAddress.toCPointer<ByteVar>())
}

public actual fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, align: SizeT, size: SizeT): CInt =
    libcTeeosPosixMemalign(memptr.rawAddress.toCPointer<ByteVar>(), align, size)

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcTeeosMemchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT> =
    MutPtr(libcTeeosWmemchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    libcTeeosMemcmp(cx.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcTeeosMemcpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcTeeosMemmove(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcTeeosMemset(dest.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun pthreadSelf(): PthreadT =
    (libcTeeosPthreadSelf()?.toLong() ?: 0L).toULong()

public actual fun pthreadJoin(native: PthreadT, value: MutPtr<MutPtr<CVoid>>): CInt =
    libcTeeosPthreadJoin(native.toLong().toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadExit(value: MutPtr<CVoid>): Nothing {
    libcTeeosPthreadExit(value.rawAddress.toCPointer<ByteVar>())
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    libcTeeosPthreadAttrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt =
    libcTeeosPthreadAttrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    libcTeeosPthreadAttrGetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stackSize: SizeT): CInt =
    libcTeeosPthreadAttrSetstacksize(attr.rawAddress.toCPointer<ByteVar>(), stackSize)

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, size: MutPtr<SizeT>): CInt =
    libcTeeosPthreadAttrGetstacksize(attr.rawAddress.toCPointer<ByteVar>(), size.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSettee(attr: MutPtr<PthreadAttrT>, ca: CInt, taskId: CInt, shadow: CInt): CInt =
    libcTeeosPthreadAttrSettee(attr.rawAddress.toCPointer<ByteVar>(), ca, taskId, shadow)

public actual fun schedYield(): CInt =
    libcTeeosSchedYield()

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt =
    libcTeeosPthreadKeyCreate(key.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    libcTeeosPthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    MutPtr(libcTeeosPthreadGetspecific(key)?.toLong() ?: 0L)

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    libcTeeosPthreadSetspecific(key, value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(lock: MutPtr<PthreadMutexT>): CInt =
    libcTeeosPthreadMutexDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(lock: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    libcTeeosPthreadMutexInit(lock.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(lock: MutPtr<PthreadMutexT>): CInt =
    libcTeeosPthreadMutexLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(lock: MutPtr<PthreadMutexT>): CInt =
    libcTeeosPthreadMutexTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(lock: MutPtr<PthreadMutexT>): CInt =
    libcTeeosPthreadMutexUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    libcTeeosPthreadMutexattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    libcTeeosPthreadMutexattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, type: CInt): CInt =
    libcTeeosPthreadMutexattrSettype(attr.rawAddress.toCPointer<ByteVar>(), type)

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    libcTeeosPthreadMutexattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    libcTeeosPthreadCondBroadcast(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    libcTeeosPthreadCondDestroy(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    libcTeeosPthreadCondInit(cond.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    libcTeeosPthreadCondSignal(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>): CInt =
    libcTeeosPthreadCondWait(cond.rawAddress.toCPointer<ByteVar>(), lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    libcTeeosPthreadCondTimedwait(cond.rawAddress.toCPointer<ByteVar>(), lock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robustness: CInt): CInt =
    libcTeeosPthreadMutexattrSetrobust(attr.rawAddress.toCPointer<ByteVar>(), robustness)

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    libcTeeosPthreadCreate(native.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    libcTeeosPthreadSpinInit(lock.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcTeeosPthreadSpinDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcTeeosPthreadSpinLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcTeeosPthreadSpinTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcTeeosPthreadSpinUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    libcTeeosPthreadSetschedprio(native.toLong().toCPointer<ByteVar>(), priority)

public actual fun pthreadOnce(pot: MutPtr<PthreadOnceT>, f: OnceFn?): CInt =
    libcTeeosPthreadOnce(pot.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt =
    libcTeeosPthreadEqual(p1.toLong().toCPointer<ByteVar>(), p2.toLong().toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetprotocol(a: MutPtr<PthreadMutexattrT>, protocol: CInt): CInt =
    libcTeeosPthreadMutexattrSetprotocol(a.rawAddress.toCPointer<ByteVar>(), protocol)

public actual fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stack: MutPtr<CVoid>, size: SizeT): CInt =
    libcTeeosPthreadAttrSetstack(attr.rawAddress.toCPointer<ByteVar>(), stack.rawAddress.toCPointer<ByteVar>(), size)

public actual fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: ConstPtr<CpuSetT>): CInt =
    libcTeeosPthreadSetaffinityNp(td.toLong().toCPointer<ByteVar>(), size, set.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: MutPtr<CpuSetT>): CInt =
    libcTeeosPthreadGetaffinityNp(td.toLong().toCPointer<ByteVar>(), size, set.rawAddress.toCPointer<ByteVar>())

public actual fun printf(fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcTeeosPrintf(fmt.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun scanf(fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcTeeosScanf(fmt.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcTeeosSnprintf(s.rawAddress.toCPointer<ByteVar>(), n, fmt.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: MutPtr<CChar>, fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcTeeosSprintf(s.rawAddress.toCPointer<ByteVar>(), fmt.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun vsnprintf(s: MutPtr<CChar>, n: SizeT, fmt: ConstPtr<CChar>, ap: VaList): CInt =
    libcTeeosVsnprintf(s.rawAddress.toCPointer<ByteVar>(), n, fmt.rawAddress.toCPointer<ByteVar>(), ap.rawAddress.toCPointer<ByteVar>())

public actual fun vsprintf(s: MutPtr<CChar>, fmt: ConstPtr<CChar>, ap: VaList): CInt =
    libcTeeosVsprintf(s.rawAddress.toCPointer<ByteVar>(), fmt.rawAddress.toCPointer<ByteVar>(), ap.rawAddress.toCPointer<ByteVar>())

public actual fun abort(): Nothing {
    libcTeeosAbort()
    error("Unreachable noreturn C function abort")
}

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    libcTeeosSchedGetaffinity(pid, cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    libcTeeosSchedSetaffinity(pid, cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun sysconf(name: CInt): CLong =
    libcTeeosSysconf(name)

public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    MutPtr(libcTeeosMmap(addr.rawAddress.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.toLong() ?: 0L)

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    libcTeeosMunmap(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun errnoLocation(): MutPtr<CInt> =
    MutPtr(libcTeeosErrnoLocation()?.toLong() ?: 0L)

public actual fun strerror(e: CInt): MutPtr<CChar> =
    MutPtr(libcTeeosStrerror(e)?.toLong() ?: 0L)

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcTeeosClockGettime(clockId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun getpid(): PidT =
    libcTeeosGetpid()

public actual fun gettimeofday(tv: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    libcTeeosGettimeofday(tv.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun strftime(restrict: MutPtr<CChar>, sz: SizeT, restrict_2: ConstPtr<CChar>, restrict_3: ConstPtr<Tm>): SizeT =
    libcTeeosStrftime(restrict.rawAddress.toCPointer<ByteVar>(), sz, restrict_2.rawAddress.toCPointer<ByteVar>(), restrict_3.rawAddress.toCPointer<ByteVar>())

public actual fun time(t: MutPtr<TimeT>): TimeT =
    libcTeeosTime(t.rawAddress.toCPointer<ByteVar>())

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    libcTeeosSemClose(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    libcTeeosSemDestroy(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: MutPtr<SemT>, valp: MutPtr<CInt>): CInt =
    libcTeeosSemGetvalue(sem.rawAddress.toCPointer<ByteVar>(), valp.rawAddress.toCPointer<ByteVar>())

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    libcTeeosSemInit(sem.rawAddress.toCPointer<ByteVar>(), pshared, value)

public actual fun semOpen(name: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    MutPtr(libcTeeosSemOpen(name.rawAddress.toCPointer<ByteVar>(), flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun semPost(sem: MutPtr<SemT>): CInt =
    libcTeeosSemPost(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    libcTeeosSemUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun semWait(sem: MutPtr<SemT>): CInt =
    libcTeeosSemWait(sem.rawAddress.toCPointer<ByteVar>())

public actual fun setlocale(cat: CInt, name: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcTeeosSetlocale(cat, name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strcoll(l: ConstPtr<CChar>, r: ConstPtr<CChar>): CInt =
    libcTeeosStrcoll(l.rawAddress.toCPointer<ByteVar>(), r.rawAddress.toCPointer<ByteVar>())

public actual fun strxfrm(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): SizeT =
    libcTeeosStrxfrm(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strtod(s: ConstPtr<CChar>, p: MutPtr<MutPtr<CChar>>): CDouble =
    libcTeeosStrtod(s.rawAddress.toCPointer<ByteVar>(), p.rawAddress.toCPointer<ByteVar>())

public actual fun mbrtowc(wc: MutPtr<WcharT>, src: ConstPtr<CChar>, n: SizeT, st: MutPtr<MbstateT>): SizeT =
    libcTeeosMbrtowc(wc.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n, st.rawAddress.toCPointer<ByteVar>())

public actual fun wcrtomb(s: MutPtr<CChar>, wc: WcharT, st: MutPtr<MbstateT>): SizeT =
    libcTeeosWcrtomb(s.rawAddress.toCPointer<ByteVar>(), wc, st.rawAddress.toCPointer<ByteVar>())

public actual fun wctob(c: WintT): CInt =
    libcTeeosWctob(c)

public actual fun srandom(seed: CUint) {
    libcTeeosSrandom(seed)
}

public actual fun initstate(seed: CUint, state: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    MutPtr(libcTeeosInitstate(seed, state.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun setstate(state: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcTeeosSetstate(state.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun random(): CLong =
    libcTeeosRandom()

public actual fun strchr(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(libcTeeosStrchr(s.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    libcTeeosStrlen(cs.rawAddress.toCPointer<ByteVar>())

public actual fun strcmp(l: ConstPtr<CChar>, r: ConstPtr<CChar>): CInt =
    libcTeeosStrcmp(l.rawAddress.toCPointer<ByteVar>(), r.rawAddress.toCPointer<ByteVar>())

public actual fun strcpy(dest: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcTeeosStrcpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncmp(l: ConstPtr<CChar>, r: ConstPtr<CChar>, n: SizeT): CInt =
    libcTeeosStrncmp(l.rawAddress.toCPointer<ByteVar>(), r.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strncpy(dest: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(libcTeeosStrncpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strnlen(cs: ConstPtr<CChar>, n: SizeT): SizeT =
    libcTeeosStrnlen(cs.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strrchr(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(libcTeeosStrrchr(s.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strstr(h: ConstPtr<CChar>, n: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcTeeosStrstr(h.rawAddress.toCPointer<ByteVar>(), n.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun wcschr(s: ConstPtr<WcharT>, c: WcharT): MutPtr<WcharT> =
    MutPtr(libcTeeosWcschr(s.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun wcslen(s: ConstPtr<WcharT>): SizeT =
    libcTeeosWcslen(s.rawAddress.toCPointer<ByteVar>())

public actual fun isalpha(c: CInt): CInt =
    libcTeeosIsalpha(c)

public actual fun isascii(c: CInt): CInt =
    libcTeeosIsascii(c)

public actual fun isdigit(c: CInt): CInt =
    libcTeeosIsdigit(c)

public actual fun islower(c: CInt): CInt =
    libcTeeosIslower(c)

public actual fun isprint(c: CInt): CInt =
    libcTeeosIsprint(c)

public actual fun isspace(c: CInt): CInt =
    libcTeeosIsspace(c)

public actual fun iswctype(wc: WintT, ttype: WctypeT): CInt =
    libcTeeosIswctype(wc, ttype)

public actual fun iswdigit(wc: WintT): CInt =
    libcTeeosIswdigit(wc)

public actual fun iswlower(wc: WintT): CInt =
    libcTeeosIswlower(wc)

public actual fun iswspace(wc: WintT): CInt =
    libcTeeosIswspace(wc)

public actual fun iswupper(wc: WintT): CInt =
    libcTeeosIswupper(wc)

public actual fun towupper(wc: WintT): WintT =
    libcTeeosTowupper(wc)

public actual fun towlower(wc: WintT): WintT =
    libcTeeosTowlower(wc)

public actual fun atan(x: CDouble): CDouble =
    libcTeeosAtan(x)

public actual fun ceil(x: CDouble): CDouble =
    libcTeeosCeil(x)

public actual fun ceilf(x: CFloat): CFloat =
    libcTeeosCeilf(x)

public actual fun exp(x: CDouble): CDouble =
    libcTeeosExp(x)

public actual fun fabs(x: CDouble): CDouble =
    libcTeeosFabs(x)

public actual fun floor(x: CDouble): CDouble =
    libcTeeosFloor(x)

public actual fun frexp(x: CDouble, e: MutPtr<CInt>): CDouble =
    libcTeeosFrexp(x, e.rawAddress.toCPointer<ByteVar>())

public actual fun log(x: CDouble): CDouble =
    libcTeeosLog(x)

public actual fun log2(x: CDouble): CDouble =
    libcTeeosLog2(x)

public actual fun pow(x: CDouble, y: CDouble): CDouble =
    libcTeeosPow(x, y)

public actual fun roundf(x: CFloat): CFloat =
    libcTeeosRoundf(x)

public actual fun scalbn(x: CDouble, n: CInt): CDouble =
    libcTeeosScalbn(x, n)

public actual fun sqrt(x: CDouble): CDouble =
    libcTeeosSqrt(x)

public actual fun abs(x: CInt): CInt =
    libcTeeosAbs(x)

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    libcTeeosAtof(s.rawAddress.toCPointer<ByteVar>())

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    libcTeeosAtoi(s.rawAddress.toCPointer<ByteVar>())

public actual fun atol(s: ConstPtr<CChar>): CLong =
    libcTeeosAtol(s.rawAddress.toCPointer<ByteVar>())

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    libcTeeosAtoll(s.rawAddress.toCPointer<ByteVar>())

public actual fun bsearch(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nel: SizeT, width: SizeT, cmp: Cmpfunc): MutPtr<CVoid> =
    MutPtr(libcTeeosBsearch(key.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), nel, width, 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun div(num: CInt, den: CInt): DivT =
    DivT()

public actual fun ecvt(x: CDouble, n: CInt, dp: MutPtr<CInt>, sign: MutPtr<CInt>): MutPtr<CChar> =
    MutPtr(libcTeeosEcvt(x, n, dp.rawAddress.toCPointer<ByteVar>(), sign.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun imaxabs(a: IntmaxT): IntmaxT =
    libcTeeosImaxabs(a)

public actual fun llabs(a: CLonglong): CLonglong =
    libcTeeosLlabs(a)

public actual fun qsort(base: MutPtr<CVoid>, nel: SizeT, width: SizeT, cmp: Cmpfunc) {
    libcTeeosQsort(base.rawAddress.toCPointer<ByteVar>(), nel, width, 0L.toCPointer<ByteVar>())
}

public actual fun strtoul(s: ConstPtr<CChar>, p: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    libcTeeosStrtoul(s.rawAddress.toCPointer<ByteVar>(), p.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtol(s: ConstPtr<CChar>, p: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    libcTeeosStrtol(s.rawAddress.toCPointer<ByteVar>(), p.rawAddress.toCPointer<ByteVar>(), base)

public actual fun wcstod(s: ConstPtr<WcharT>, p: MutPtr<MutPtr<WcharT>>): CDouble =
    libcTeeosWcstod(s.rawAddress.toCPointer<ByteVar>(), p.rawAddress.toCPointer<ByteVar>())
