@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object TeeosJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "libc_jni.dll"
                "macos" -> "liblibc_jni.dylib"
                else -> "liblibc_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/libc/native/$hostPlatform-$hostArch/$libFileName"
        val stream = TeeosJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("libc_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcTeeosCalloc(nobj: Long, size: Long): Long

    @JvmStatic
    external fun libcTeeosMalloc(size: Long): Long

    @JvmStatic
    external fun libcTeeosRealloc(p: Long, size: Long): Long

    @JvmStatic
    external fun libcTeeosAlignedAlloc(align: Long, len: Long): Long

    @JvmStatic
    external fun libcTeeosFree(p: Long)

    @JvmStatic
    external fun libcTeeosPosixMemalign(memptr: Long, align: Long, size: Long): Int

    @JvmStatic
    external fun libcTeeosMemchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcTeeosWmemchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcTeeosMemcmp(cx: Long, ct: Long, n: Long): Int

    @JvmStatic
    external fun libcTeeosMemcpy(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcTeeosMemmove(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcTeeosMemset(dest: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcTeeosPthreadSelf(): Long

    @JvmStatic
    external fun libcTeeosPthreadJoin(native: Long, value: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadExit(value: Long)

    @JvmStatic
    external fun libcTeeosPthreadAttrInit(attr: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadAttrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadAttrSetstacksize(attr: Long, stackSize: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadAttrGetstacksize(attr: Long, size: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadAttrSettee(attr: Long, ca: Int, taskId: Int, shadow: Int): Int

    @JvmStatic
    external fun libcTeeosSchedYield(): Int

    @JvmStatic
    external fun libcTeeosPthreadKeyCreate(key: Long, dtor: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadKeyDelete(key: Int): Int

    @JvmStatic
    external fun libcTeeosPthreadGetspecific(key: Int): Long

    @JvmStatic
    external fun libcTeeosPthreadSetspecific(key: Int, value: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadMutexDestroy(lock: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadMutexInit(lock: Long, attr: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadMutexLock(lock: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadMutexTrylock(lock: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadMutexUnlock(lock: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadMutexattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadMutexattrInit(attr: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadMutexattrSettype(attr: Long, type: Int): Int

    @JvmStatic
    external fun libcTeeosPthreadMutexattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libcTeeosPthreadCondBroadcast(cond: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadCondDestroy(cond: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadCondInit(cond: Long, attr: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadCondSignal(cond: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadCondWait(cond: Long, lock: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadCondTimedwait(cond: Long, lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadMutexattrSetrobust(attr: Long, robustness: Int): Int

    @JvmStatic
    external fun libcTeeosPthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libcTeeosPthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadSetschedprio(native: Long, priority: Int): Int

    @JvmStatic
    external fun libcTeeosPthreadOnce(pot: Long, f: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadEqual(p1: Long, p2: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadMutexattrSetprotocol(a: Long, protocol: Int): Int

    @JvmStatic
    external fun libcTeeosPthreadAttrSetstack(attr: Long, stack: Long, size: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadSetaffinityNp(td: Long, size: Long, set: Long): Int

    @JvmStatic
    external fun libcTeeosPthreadGetaffinityNp(td: Long, size: Long, set: Long): Int

    @JvmStatic
    external fun libcTeeosPrintf(fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcTeeosScanf(fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcTeeosSnprintf(s: Long, n: Long, fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcTeeosSprintf(s: Long, fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcTeeosVsnprintf(s: Long, n: Long, fmt: Long, ap: Long): Int

    @JvmStatic
    external fun libcTeeosVsprintf(s: Long, fmt: Long, ap: Long): Int

    @JvmStatic
    external fun libcTeeosAbort()

    @JvmStatic
    external fun libcTeeosSchedGetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcTeeosSchedSetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcTeeosSysconf(name: Int): Long

    @JvmStatic
    external fun libcTeeosMmap(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long

    @JvmStatic
    external fun libcTeeosMunmap(addr: Long, len: Long): Int

    @JvmStatic
    external fun libcTeeosErrnoLocation(): Long

    @JvmStatic
    external fun libcTeeosStrerror(e: Int): Long

    @JvmStatic
    external fun libcTeeosClockGettime(clockId: Int, tp: Long): Int

    @JvmStatic
    external fun libcTeeosGetpid(): Int

    @JvmStatic
    external fun libcTeeosGettimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libcTeeosStrftime(restrict: Long, sz: Long, restrict_2: Long, restrict_3: Long): Long

    @JvmStatic
    external fun libcTeeosTime(t: Long): Long

    @JvmStatic
    external fun libcTeeosSemClose(sem: Long): Int

    @JvmStatic
    external fun libcTeeosSemDestroy(sem: Long): Int

    @JvmStatic
    external fun libcTeeosSemGetvalue(sem: Long, valp: Long): Int

    @JvmStatic
    external fun libcTeeosSemInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libcTeeosSemOpen(name: Long, flags: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcTeeosSemPost(sem: Long): Int

    @JvmStatic
    external fun libcTeeosSemUnlink(name: Long): Int

    @JvmStatic
    external fun libcTeeosSemWait(sem: Long): Int

    @JvmStatic
    external fun libcTeeosSetlocale(cat: Int, name: Long): Long

    @JvmStatic
    external fun libcTeeosStrcoll(l: Long, r: Long): Int

    @JvmStatic
    external fun libcTeeosStrxfrm(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcTeeosStrtod(s: Long, p: Long): Double

    @JvmStatic
    external fun libcTeeosMbrtowc(wc: Long, src: Long, n: Long, st: Long): Long

    @JvmStatic
    external fun libcTeeosWcrtomb(s: Long, wc: Int, st: Long): Long

    @JvmStatic
    external fun libcTeeosWctob(c: Int): Int

    @JvmStatic
    external fun libcTeeosSrandom(seed: Int)

    @JvmStatic
    external fun libcTeeosInitstate(seed: Int, state: Long, size: Long): Long

    @JvmStatic
    external fun libcTeeosSetstate(state: Long): Long

    @JvmStatic
    external fun libcTeeosRandom(): Long

    @JvmStatic
    external fun libcTeeosStrchr(s: Long, c: Int): Long

    @JvmStatic
    external fun libcTeeosStrlen(cs: Long): Long

    @JvmStatic
    external fun libcTeeosStrcmp(l: Long, r: Long): Int

    @JvmStatic
    external fun libcTeeosStrcpy(dest: Long, src: Long): Long

    @JvmStatic
    external fun libcTeeosStrncmp(l: Long, r: Long, n: Long): Int

    @JvmStatic
    external fun libcTeeosStrncpy(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcTeeosStrnlen(cs: Long, n: Long): Long

    @JvmStatic
    external fun libcTeeosStrrchr(s: Long, c: Int): Long

    @JvmStatic
    external fun libcTeeosStrstr(h: Long, n: Long): Long

    @JvmStatic
    external fun libcTeeosWcschr(s: Long, c: Int): Long

    @JvmStatic
    external fun libcTeeosWcslen(s: Long): Long

    @JvmStatic
    external fun libcTeeosIsalpha(c: Int): Int

    @JvmStatic
    external fun libcTeeosIsascii(c: Int): Int

    @JvmStatic
    external fun libcTeeosIsdigit(c: Int): Int

    @JvmStatic
    external fun libcTeeosIslower(c: Int): Int

    @JvmStatic
    external fun libcTeeosIsprint(c: Int): Int

    @JvmStatic
    external fun libcTeeosIsspace(c: Int): Int

    @JvmStatic
    external fun libcTeeosIswctype(wc: Int, ttype: Long): Int

    @JvmStatic
    external fun libcTeeosIswdigit(wc: Int): Int

    @JvmStatic
    external fun libcTeeosIswlower(wc: Int): Int

    @JvmStatic
    external fun libcTeeosIswspace(wc: Int): Int

    @JvmStatic
    external fun libcTeeosIswupper(wc: Int): Int

    @JvmStatic
    external fun libcTeeosTowupper(wc: Int): Int

    @JvmStatic
    external fun libcTeeosTowlower(wc: Int): Int

    @JvmStatic
    external fun libcTeeosAtan(x: Double): Double

    @JvmStatic
    external fun libcTeeosCeil(x: Double): Double

    @JvmStatic
    external fun libcTeeosCeilf(x: Float): Float

    @JvmStatic
    external fun libcTeeosExp(x: Double): Double

    @JvmStatic
    external fun libcTeeosFabs(x: Double): Double

    @JvmStatic
    external fun libcTeeosFloor(x: Double): Double

    @JvmStatic
    external fun libcTeeosFrexp(x: Double, e: Long): Double

    @JvmStatic
    external fun libcTeeosLog(x: Double): Double

    @JvmStatic
    external fun libcTeeosLog2(x: Double): Double

    @JvmStatic
    external fun libcTeeosPow(x: Double, y: Double): Double

    @JvmStatic
    external fun libcTeeosRoundf(x: Float): Float

    @JvmStatic
    external fun libcTeeosScalbn(x: Double, n: Int): Double

    @JvmStatic
    external fun libcTeeosSqrt(x: Double): Double

    @JvmStatic
    external fun libcTeeosAbs(x: Int): Int

    @JvmStatic
    external fun libcTeeosAtof(s: Long): Double

    @JvmStatic
    external fun libcTeeosAtoi(s: Long): Int

    @JvmStatic
    external fun libcTeeosAtol(s: Long): Long

    @JvmStatic
    external fun libcTeeosAtoll(s: Long): Long

    @JvmStatic
    external fun libcTeeosBsearch(key: Long, base: Long, nel: Long, width: Long, cmp: Long): Long

    @JvmStatic
    external fun libcTeeosEcvt(x: Double, n: Int, dp: Long, sign: Long): Long

    @JvmStatic
    external fun libcTeeosImaxabs(a: Long): Long

    @JvmStatic
    external fun libcTeeosLlabs(a: Long): Long

    @JvmStatic
    external fun libcTeeosQsort(base: Long, nel: Long, width: Long, cmp: Long)

    @JvmStatic
    external fun libcTeeosStrtoul(s: Long, p: Long, base: Int): Long

    @JvmStatic
    external fun libcTeeosStrtol(s: Long, p: Long, base: Int): Long

    @JvmStatic
    external fun libcTeeosWcstod(s: Long, p: Long): Double
}

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosCalloc(nobj.toLong(), size.toLong()))

public actual fun malloc(size: SizeT): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosMalloc(size.toLong()))

public actual fun realloc(p: MutPtr, size: SizeT): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosRealloc(p.rawAddress, size.toLong()))

public actual fun alignedAlloc(align: SizeT, len: SizeT): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosAlignedAlloc(align.toLong(), len.toLong()))

public actual fun free(p: MutPtr) {
    TeeosJniBridge.libcTeeosFree(p.rawAddress)
}

public actual fun posixMemalign(memptr: MutPtr, align: SizeT, size: SizeT): CInt =
    TeeosJniBridge.libcTeeosPosixMemalign(memptr.rawAddress, align.toLong(), size.toLong())

public actual fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosMemchr(cx.rawAddress, c, n.toLong()))

public actual fun wmemchr(cx: ConstPtr, c: WcharT, n: SizeT): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosWmemchr(cx.rawAddress, c.toInt(), n.toLong()))

public actual fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    TeeosJniBridge.libcTeeosMemcmp(cx.rawAddress, ct.rawAddress, n.toLong())

public actual fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosMemcpy(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosMemmove(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosMemset(dest.rawAddress, c, n.toLong()))

public actual fun pthreadSelf(): PthreadT =
    TeeosJniBridge.libcTeeosPthreadSelf().toULong()

public actual fun pthreadJoin(native: PthreadT, value: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadJoin(native.toLong(), value.rawAddress)

public actual fun pthreadExit(value: MutPtr): Nothing {
    TeeosJniBridge.libcTeeosPthreadExit(value.rawAddress)
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadAttrInit(attr.rawAddress)

public actual fun pthreadAttrDestroy(attr: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadAttrDestroy(attr.rawAddress)

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadAttrGetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.rawAddress)

public actual fun pthreadAttrSetstacksize(attr: MutPtr, stackSize: SizeT): CInt =
    TeeosJniBridge.libcTeeosPthreadAttrSetstacksize(attr.rawAddress, stackSize.toLong())

public actual fun pthreadAttrGetstacksize(attr: ConstPtr, size: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadAttrGetstacksize(attr.rawAddress, size.rawAddress)

public actual fun pthreadAttrSettee(attr: MutPtr, ca: CInt, taskId: CInt, shadow: CInt): CInt =
    TeeosJniBridge.libcTeeosPthreadAttrSettee(attr.rawAddress, ca, taskId, shadow)

public actual fun schedYield(): CInt =
    TeeosJniBridge.libcTeeosSchedYield()

public actual fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt =
    TeeosJniBridge.libcTeeosPthreadKeyCreate(key.rawAddress, 0L)

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    TeeosJniBridge.libcTeeosPthreadKeyDelete(key.toInt())

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosPthreadGetspecific(key.toInt()))

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadSetspecific(key.toInt(), value.rawAddress)

public actual fun pthreadMutexDestroy(lock: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadMutexDestroy(lock.rawAddress)

public actual fun pthreadMutexInit(lock: MutPtr, attr: ConstPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadMutexInit(lock.rawAddress, attr.rawAddress)

public actual fun pthreadMutexLock(lock: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadMutexLock(lock.rawAddress)

public actual fun pthreadMutexTrylock(lock: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadMutexTrylock(lock.rawAddress)

public actual fun pthreadMutexUnlock(lock: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadMutexUnlock(lock.rawAddress)

public actual fun pthreadMutexattrDestroy(attr: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadMutexattrDestroy(attr.rawAddress)

public actual fun pthreadMutexattrInit(attr: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadMutexattrInit(attr.rawAddress)

public actual fun pthreadMutexattrSettype(attr: MutPtr, type: CInt): CInt =
    TeeosJniBridge.libcTeeosPthreadMutexattrSettype(attr.rawAddress, type)

public actual fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    TeeosJniBridge.libcTeeosPthreadMutexattrSetpshared(attr.rawAddress, pshared)

public actual fun pthreadCondBroadcast(cond: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadCondBroadcast(cond.rawAddress)

public actual fun pthreadCondDestroy(cond: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadCondDestroy(cond.rawAddress)

public actual fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadCondInit(cond.rawAddress, attr.rawAddress)

public actual fun pthreadCondSignal(cond: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadCondSignal(cond.rawAddress)

public actual fun pthreadCondWait(cond: MutPtr, lock: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadCondWait(cond.rawAddress, lock.rawAddress)

public actual fun pthreadCondTimedwait(cond: MutPtr, lock: MutPtr, abstime: ConstPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadCondTimedwait(cond.rawAddress, lock.rawAddress, abstime.rawAddress)

public actual fun pthreadMutexattrSetrobust(attr: MutPtr, robustness: CInt): CInt =
    TeeosJniBridge.libcTeeosPthreadMutexattrSetrobust(attr.rawAddress, robustness)

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadCreate(native.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    TeeosJniBridge.libcTeeosPthreadSpinInit(lock.rawAddress, pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadSpinDestroy(lock.rawAddress)

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadSpinLock(lock.rawAddress)

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadSpinTrylock(lock.rawAddress)

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadSpinUnlock(lock.rawAddress)

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    TeeosJniBridge.libcTeeosPthreadSetschedprio(native.toLong(), priority)

public actual fun pthreadOnce(pot: MutPtr, f: OnceFn?): CInt =
    TeeosJniBridge.libcTeeosPthreadOnce(pot.rawAddress, 0L)

public actual fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt =
    TeeosJniBridge.libcTeeosPthreadEqual(p1.toLong(), p2.toLong())

public actual fun pthreadMutexattrSetprotocol(a: MutPtr, protocol: CInt): CInt =
    TeeosJniBridge.libcTeeosPthreadMutexattrSetprotocol(a.rawAddress, protocol)

public actual fun pthreadAttrSetstack(attr: MutPtr, stack: MutPtr, size: SizeT): CInt =
    TeeosJniBridge.libcTeeosPthreadAttrSetstack(attr.rawAddress, stack.rawAddress, size.toLong())

public actual fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: ConstPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadSetaffinityNp(td.toLong(), size.toLong(), set.rawAddress)

public actual fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: MutPtr): CInt =
    TeeosJniBridge.libcTeeosPthreadGetaffinityNp(td.toLong(), size.toLong(), set.rawAddress)

public actual fun printf(fmt: ConstPtr, vararg variadicArgs: Long): CInt =
    TeeosJniBridge.libcTeeosPrintf(fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun scanf(fmt: ConstPtr, vararg variadicArgs: Long): CInt =
    TeeosJniBridge.libcTeeosScanf(fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: MutPtr, n: SizeT, fmt: ConstPtr, vararg variadicArgs: Long): CInt =
    TeeosJniBridge.libcTeeosSnprintf(s.rawAddress, n.toLong(), fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: MutPtr, fmt: ConstPtr, vararg variadicArgs: Long): CInt =
    TeeosJniBridge.libcTeeosSprintf(s.rawAddress, fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun vsnprintf(s: MutPtr, n: SizeT, fmt: ConstPtr, ap: VaList): CInt =
    TeeosJniBridge.libcTeeosVsnprintf(s.rawAddress, n.toLong(), fmt.rawAddress, ap.rawAddress)

public actual fun vsprintf(s: MutPtr, fmt: ConstPtr, ap: VaList): CInt =
    TeeosJniBridge.libcTeeosVsprintf(s.rawAddress, fmt.rawAddress, ap.rawAddress)

public actual fun abort(): Nothing {
    TeeosJniBridge.libcTeeosAbort()
    error("Unreachable noreturn C function abort")
}

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    TeeosJniBridge.libcTeeosSchedGetaffinity(pid, cpusetsize.toLong(), cpuset.rawAddress)

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    TeeosJniBridge.libcTeeosSchedSetaffinity(pid, cpusetsize.toLong(), cpuset.rawAddress)

public actual fun sysconf(name: CInt): CLong =
    TeeosJniBridge.libcTeeosSysconf(name)

public actual fun mmap(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosMmap(addr.rawAddress, len.toLong(), prot, flags, fd, offset))

public actual fun munmap(addr: MutPtr, len: SizeT): CInt =
    TeeosJniBridge.libcTeeosMunmap(addr.rawAddress, len.toLong())

public actual fun errnoLocation(): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosErrnoLocation())

public actual fun strerror(e: CInt): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosStrerror(e))

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr): CInt =
    TeeosJniBridge.libcTeeosClockGettime(clockId, tp.rawAddress)

public actual fun getpid(): PidT =
    TeeosJniBridge.libcTeeosGetpid()

public actual fun gettimeofday(tv: MutPtr, tz: MutPtr): CInt =
    TeeosJniBridge.libcTeeosGettimeofday(tv.rawAddress, tz.rawAddress)

public actual fun strftime(restrict: MutPtr, sz: SizeT, restrict_2: ConstPtr, restrict_3: ConstPtr): SizeT =
    TeeosJniBridge.libcTeeosStrftime(restrict.rawAddress, sz.toLong(), restrict_2.rawAddress, restrict_3.rawAddress).toULong()

public actual fun time(t: MutPtr): TimeT =
    TeeosJniBridge.libcTeeosTime(t.rawAddress)

public actual fun semClose(sem: MutPtr): CInt =
    TeeosJniBridge.libcTeeosSemClose(sem.rawAddress)

public actual fun semDestroy(sem: MutPtr): CInt =
    TeeosJniBridge.libcTeeosSemDestroy(sem.rawAddress)

public actual fun semGetvalue(sem: MutPtr, valp: MutPtr): CInt =
    TeeosJniBridge.libcTeeosSemGetvalue(sem.rawAddress, valp.rawAddress)

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    TeeosJniBridge.libcTeeosSemInit(sem.rawAddress, pshared, value.toInt())

public actual fun semOpen(name: ConstPtr, flags: CInt, vararg variadicArgs: Long): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosSemOpen(name.rawAddress, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun semPost(sem: MutPtr): CInt =
    TeeosJniBridge.libcTeeosSemPost(sem.rawAddress)

public actual fun semUnlink(name: ConstPtr): CInt =
    TeeosJniBridge.libcTeeosSemUnlink(name.rawAddress)

public actual fun semWait(sem: MutPtr): CInt =
    TeeosJniBridge.libcTeeosSemWait(sem.rawAddress)

public actual fun setlocale(cat: CInt, name: ConstPtr): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosSetlocale(cat, name.rawAddress))

public actual fun strcoll(l: ConstPtr, r: ConstPtr): CInt =
    TeeosJniBridge.libcTeeosStrcoll(l.rawAddress, r.rawAddress)

public actual fun strxfrm(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT =
    TeeosJniBridge.libcTeeosStrxfrm(dest.rawAddress, src.rawAddress, n.toLong()).toULong()

public actual fun strtod(s: ConstPtr, p: MutPtr): CDouble =
    TeeosJniBridge.libcTeeosStrtod(s.rawAddress, p.rawAddress)

public actual fun mbrtowc(wc: MutPtr, src: ConstPtr, n: SizeT, st: MutPtr): SizeT =
    TeeosJniBridge.libcTeeosMbrtowc(wc.rawAddress, src.rawAddress, n.toLong(), st.rawAddress).toULong()

public actual fun wcrtomb(s: MutPtr, wc: WcharT, st: MutPtr): SizeT =
    TeeosJniBridge.libcTeeosWcrtomb(s.rawAddress, wc.toInt(), st.rawAddress).toULong()

public actual fun wctob(c: WintT): CInt =
    TeeosJniBridge.libcTeeosWctob(c.toInt())

public actual fun srandom(seed: CUint) {
    TeeosJniBridge.libcTeeosSrandom(seed.toInt())
}

public actual fun initstate(seed: CUint, state: MutPtr, size: SizeT): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosInitstate(seed.toInt(), state.rawAddress, size.toLong()))

public actual fun setstate(state: MutPtr): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosSetstate(state.rawAddress))

public actual fun random(): CLong =
    TeeosJniBridge.libcTeeosRandom()

public actual fun strchr(s: ConstPtr, c: CInt): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosStrchr(s.rawAddress, c))

public actual fun strlen(cs: ConstPtr): SizeT =
    TeeosJniBridge.libcTeeosStrlen(cs.rawAddress).toULong()

public actual fun strcmp(l: ConstPtr, r: ConstPtr): CInt =
    TeeosJniBridge.libcTeeosStrcmp(l.rawAddress, r.rawAddress)

public actual fun strcpy(dest: MutPtr, src: ConstPtr): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosStrcpy(dest.rawAddress, src.rawAddress))

public actual fun strncmp(l: ConstPtr, r: ConstPtr, n: SizeT): CInt =
    TeeosJniBridge.libcTeeosStrncmp(l.rawAddress, r.rawAddress, n.toLong())

public actual fun strncpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosStrncpy(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun strnlen(cs: ConstPtr, n: SizeT): SizeT =
    TeeosJniBridge.libcTeeosStrnlen(cs.rawAddress, n.toLong()).toULong()

public actual fun strrchr(s: ConstPtr, c: CInt): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosStrrchr(s.rawAddress, c))

public actual fun strstr(h: ConstPtr, n: ConstPtr): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosStrstr(h.rawAddress, n.rawAddress))

public actual fun wcschr(s: ConstPtr, c: WcharT): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosWcschr(s.rawAddress, c.toInt()))

public actual fun wcslen(s: ConstPtr): SizeT =
    TeeosJniBridge.libcTeeosWcslen(s.rawAddress).toULong()

public actual fun isalpha(c: CInt): CInt =
    TeeosJniBridge.libcTeeosIsalpha(c)

public actual fun isascii(c: CInt): CInt =
    TeeosJniBridge.libcTeeosIsascii(c)

public actual fun isdigit(c: CInt): CInt =
    TeeosJniBridge.libcTeeosIsdigit(c)

public actual fun islower(c: CInt): CInt =
    TeeosJniBridge.libcTeeosIslower(c)

public actual fun isprint(c: CInt): CInt =
    TeeosJniBridge.libcTeeosIsprint(c)

public actual fun isspace(c: CInt): CInt =
    TeeosJniBridge.libcTeeosIsspace(c)

public actual fun iswctype(wc: WintT, ttype: WctypeT): CInt =
    TeeosJniBridge.libcTeeosIswctype(wc.toInt(), ttype.toLong())

public actual fun iswdigit(wc: WintT): CInt =
    TeeosJniBridge.libcTeeosIswdigit(wc.toInt())

public actual fun iswlower(wc: WintT): CInt =
    TeeosJniBridge.libcTeeosIswlower(wc.toInt())

public actual fun iswspace(wc: WintT): CInt =
    TeeosJniBridge.libcTeeosIswspace(wc.toInt())

public actual fun iswupper(wc: WintT): CInt =
    TeeosJniBridge.libcTeeosIswupper(wc.toInt())

public actual fun towupper(wc: WintT): WintT =
    TeeosJniBridge.libcTeeosTowupper(wc.toInt()).toUInt()

public actual fun towlower(wc: WintT): WintT =
    TeeosJniBridge.libcTeeosTowlower(wc.toInt()).toUInt()

public actual fun atan(x: CDouble): CDouble =
    TeeosJniBridge.libcTeeosAtan(x)

public actual fun ceil(x: CDouble): CDouble =
    TeeosJniBridge.libcTeeosCeil(x)

public actual fun ceilf(x: CFloat): CFloat =
    TeeosJniBridge.libcTeeosCeilf(x)

public actual fun exp(x: CDouble): CDouble =
    TeeosJniBridge.libcTeeosExp(x)

public actual fun fabs(x: CDouble): CDouble =
    TeeosJniBridge.libcTeeosFabs(x)

public actual fun floor(x: CDouble): CDouble =
    TeeosJniBridge.libcTeeosFloor(x)

public actual fun frexp(x: CDouble, e: MutPtr): CDouble =
    TeeosJniBridge.libcTeeosFrexp(x, e.rawAddress)

public actual fun log(x: CDouble): CDouble =
    TeeosJniBridge.libcTeeosLog(x)

public actual fun log2(x: CDouble): CDouble =
    TeeosJniBridge.libcTeeosLog2(x)

public actual fun pow(x: CDouble, y: CDouble): CDouble =
    TeeosJniBridge.libcTeeosPow(x, y)

public actual fun roundf(x: CFloat): CFloat =
    TeeosJniBridge.libcTeeosRoundf(x)

public actual fun scalbn(x: CDouble, n: CInt): CDouble =
    TeeosJniBridge.libcTeeosScalbn(x, n)

public actual fun sqrt(x: CDouble): CDouble =
    TeeosJniBridge.libcTeeosSqrt(x)

public actual fun abs(x: CInt): CInt =
    TeeosJniBridge.libcTeeosAbs(x)

public actual fun atof(s: ConstPtr): CDouble =
    TeeosJniBridge.libcTeeosAtof(s.rawAddress)

public actual fun atoi(s: ConstPtr): CInt =
    TeeosJniBridge.libcTeeosAtoi(s.rawAddress)

public actual fun atol(s: ConstPtr): CLong =
    TeeosJniBridge.libcTeeosAtol(s.rawAddress)

public actual fun atoll(s: ConstPtr): CLonglong =
    TeeosJniBridge.libcTeeosAtoll(s.rawAddress)

public actual fun bsearch(key: ConstPtr, base: ConstPtr, nel: SizeT, width: SizeT, cmp: Cmpfunc): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosBsearch(key.rawAddress, base.rawAddress, nel.toLong(), width.toLong(), 0L))

public actual fun div(num: CInt, den: CInt): DivT =
    DivT()

public actual fun ecvt(x: CDouble, n: CInt, dp: MutPtr, sign: MutPtr): MutPtr =
    MutPtr(TeeosJniBridge.libcTeeosEcvt(x, n, dp.rawAddress, sign.rawAddress))

public actual fun imaxabs(a: IntmaxT): IntmaxT =
    TeeosJniBridge.libcTeeosImaxabs(a)

public actual fun llabs(a: CLonglong): CLonglong =
    TeeosJniBridge.libcTeeosLlabs(a)

public actual fun qsort(base: MutPtr, nel: SizeT, width: SizeT, cmp: Cmpfunc) {
    TeeosJniBridge.libcTeeosQsort(base.rawAddress, nel.toLong(), width.toLong(), 0L)
}

public actual fun strtoul(s: ConstPtr, p: MutPtr, base: CInt): CUlong =
    TeeosJniBridge.libcTeeosStrtoul(s.rawAddress, p.rawAddress, base).toULong()

public actual fun strtol(s: ConstPtr, p: MutPtr, base: CInt): CLong =
    TeeosJniBridge.libcTeeosStrtol(s.rawAddress, p.rawAddress, base)

public actual fun wcstod(s: ConstPtr, p: MutPtr): CDouble =
    TeeosJniBridge.libcTeeosWcstod(s.rawAddress, p.rawAddress)
