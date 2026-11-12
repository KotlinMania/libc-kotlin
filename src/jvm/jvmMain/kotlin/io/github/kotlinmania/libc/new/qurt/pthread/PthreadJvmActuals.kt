@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadAttrT
import io.github.kotlinmania.libc.new.qurt.PthreadCondT
import io.github.kotlinmania.libc.new.qurt.PthreadCondattrT
import io.github.kotlinmania.libc.new.qurt.PthreadKeyT
import io.github.kotlinmania.libc.new.qurt.PthreadMutexT
import io.github.kotlinmania.libc.new.qurt.PthreadMutexattrT
import io.github.kotlinmania.libc.new.qurt.PthreadOnceT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.libc.new.qurt.sys.types.CpuSetT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewQurtPthreadJniBridge {
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
        val stream = NewQurtPthreadJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcNewQurtPthreadPthreadCreate(thread: Long, attr: Long, startRoutine: Long, arg: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadJoin(thread: Long, retval: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadDetach(thread: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadExit(retval: Long)

    @JvmStatic
    external fun libcNewQurtPthreadPthreadSelf(): Long

    @JvmStatic
    external fun libcNewQurtPthreadPthreadEqual(t1: Long, t2: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadAttrInit(attr: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadAttrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadAttrSetstacksize(attr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadAttrGetstacksize(attr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadAttrSetdetachstate(attr: Long, detachstate: Int): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadAttrGetdetachstate(attr: Long, detachstate: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadMutexInit(mutex: Long, attr: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadMutexDestroy(mutex: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadMutexLock(mutex: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadMutexTrylock(mutex: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadMutexUnlock(mutex: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadMutexattrInit(attr: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadMutexattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadMutexattrSettype(attr: Long, kind: Int): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadMutexattrGettype(attr: Long, kind: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadCondInit(cond: Long, attr: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadCondDestroy(cond: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadCondWait(cond: Long, mutex: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadCondTimedwait(cond: Long, mutex: Long, abstime: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadCondSignal(cond: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadCondBroadcast(cond: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadCondattrInit(attr: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadCondattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadKeyCreate(key: Long, destructor: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadKeyDelete(key: Int): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadGetspecific(key: Int): Long

    @JvmStatic
    external fun libcNewQurtPthreadPthreadSetspecific(key: Int, value: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadOnce(onceControl: Long, initRoutine: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadGetnameNp(thread: Long, name: Long, len: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadAttrSetaffinityNp(attr: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPthreadAttrGetaffinityNp(attr: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcNewQurtPthreadPosixMemalign(memptr: Long, alignment: Long, size: Long): Int
}

public actual fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr<CVoid>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadCreate(thread.rawAddress, attr.rawAddress, 0L, arg.rawAddress)

public actual fun pthreadJoin(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadJoin(thread.toLong(), retval.rawAddress)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadDetach(thread.toLong())

public actual fun pthreadExit(retval: MutPtr<CVoid>): Nothing {
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadExit(retval.rawAddress)
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadSelf(): PthreadT =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadSelf().toUInt()

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadEqual(t1.toLong(), t2.toLong())

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadAttrInit(attr.rawAddress)

public actual fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadAttrDestroy(attr.rawAddress)

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stacksize: SizeT): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadAttrSetstacksize(attr.rawAddress, stacksize.toLong())

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, stacksize: MutPtr<SizeT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadAttrGetstacksize(attr.rawAddress, stacksize.rawAddress)

public actual fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, detachstate: CInt): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadAttrSetdetachstate(attr.rawAddress, detachstate)

public actual fun pthreadAttrGetdetachstate(attr: ConstPtr<PthreadAttrT>, detachstate: MutPtr<CInt>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadAttrGetdetachstate(attr.rawAddress, detachstate.rawAddress)

public actual fun pthreadMutexInit(mutex: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadMutexInit(mutex.rawAddress, attr.rawAddress)

public actual fun pthreadMutexDestroy(mutex: MutPtr<PthreadMutexT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadMutexDestroy(mutex.rawAddress)

public actual fun pthreadMutexLock(mutex: MutPtr<PthreadMutexT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadMutexLock(mutex.rawAddress)

public actual fun pthreadMutexTrylock(mutex: MutPtr<PthreadMutexT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadMutexTrylock(mutex.rawAddress)

public actual fun pthreadMutexUnlock(mutex: MutPtr<PthreadMutexT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadMutexUnlock(mutex.rawAddress)

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadMutexattrInit(attr.rawAddress)

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadMutexattrDestroy(attr.rawAddress)

public actual fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, kind: CInt): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadMutexattrSettype(attr.rawAddress, kind)

public actual fun pthreadMutexattrGettype(attr: ConstPtr<PthreadMutexattrT>, kind: MutPtr<CInt>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadMutexattrGettype(attr.rawAddress, kind.rawAddress)

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadCondInit(cond.rawAddress, attr.rawAddress)

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadCondDestroy(cond.rawAddress)

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, mutex: MutPtr<PthreadMutexT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadCondWait(cond.rawAddress, mutex.rawAddress)

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, mutex: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadCondTimedwait(cond.rawAddress, mutex.rawAddress, abstime.rawAddress)

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadCondSignal(cond.rawAddress)

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadCondBroadcast(cond.rawAddress)

public actual fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadCondattrInit(attr.rawAddress)

public actual fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadCondattrDestroy(attr.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadCondattrSetclock(attr.rawAddress, clockId)

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, destructor: PthreadKeyCreateDestructorCallback?): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadKeyCreate(key.rawAddress, 0L)

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    MutPtr(NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadGetspecific(key))

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadSetspecific(key, value.rawAddress)

public actual fun pthreadOnce(onceControl: MutPtr<PthreadOnceT>, initRoutine: PthreadOnceInitRoutineCallback): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadOnce(onceControl.rawAddress, 0L)

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadGetnameNp(thread.toLong(), name.rawAddress, len.toLong())

public actual fun pthreadAttrSetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadAttrSetaffinityNp(attr.rawAddress, cpusetsize.toLong(), cpuset.rawAddress)

public actual fun pthreadAttrGetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPthreadAttrGetaffinityNp(attr.rawAddress, cpusetsize.toLong(), cpuset.rawAddress)

public actual fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, alignment: SizeT, size: SizeT): CInt =
    NewQurtPthreadJniBridge.libcNewQurtPthreadPosixMemalign(memptr.rawAddress, alignment.toLong(), size.toLong())
