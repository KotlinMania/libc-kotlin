@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.common.posix.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.sched.SchedParam
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadAttrT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadCondattrT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadMutexT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadMutexattrT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadOnceT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadRwlockattrT
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadBarrierT
import io.github.kotlinmania.libc.new.qurt.PthreadBarrierattrT
import io.github.kotlinmania.libc.new.qurt.PthreadSpinlockT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewCommonPosixPthreadJniBridge {
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
        val stream = NewCommonPosixPthreadJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcNewCommonPosixPthreadPthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrGetinheritsched(attr: Long, inheritsched: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrGetschedpolicy(attr: Long, policy: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrSetinheritsched(attr: Long, inheritsched: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrSetschedpolicy(attr: Long, policy: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrSetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadBarrierDestroy(barrier: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadBarrierWait(barrier: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadBarrierattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadBarrierattrGetpshared(attr: Long, shared: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadBarrierattrInit(attr: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadBarrierattrSetpshared(attr: Long, shared: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadCancel(thread: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadCondattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadCondattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadGetcpuclockid(thread: Long, clkId: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadMutexConsistent(mutex: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadMutexattrGetprotocol(attr: Long, protocol: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadMutexattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadMutexattrGetrobust(attr: Long, robustness: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadMutexattrSetprotocol(attr: Long, protocol: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadMutexattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadMutexattrSetrobust(attr: Long, robustness: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadRwlockattrGetpshared(attr: Long, value: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadRwlockattrSetpshared(attr: Long, value: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadOnce(control: Long, routine: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadSetschedprio(native: Long, priority: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadSpinUnlock(lock: Long): Int
}

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAtfork(0L, 0L, 0L)

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrGetguardsize(attr.rawAddress, guardsize.rawAddress)

public actual fun pthreadAttrGetinheritsched(attr: ConstPtr<PthreadAttrT>, inheritsched: MutPtr<CInt>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrGetinheritsched(attr.rawAddress, inheritsched.rawAddress)

public actual fun pthreadAttrGetschedparam(attr: ConstPtr<PthreadAttrT>, param: MutPtr<SchedParam>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrGetschedparam(attr.rawAddress, param.rawAddress)

public actual fun pthreadAttrGetschedpolicy(attr: ConstPtr<PthreadAttrT>, policy: MutPtr<CInt>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrGetschedpolicy(attr.rawAddress, policy.rawAddress)

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrGetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.rawAddress)

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrSetguardsize(attr.rawAddress, guardsize.toLong())

public actual fun pthreadAttrSetinheritsched(attr: MutPtr<PthreadAttrT>, inheritsched: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrSetinheritsched(attr.rawAddress, inheritsched)

public actual fun pthreadAttrSetschedparam(attr: MutPtr<PthreadAttrT>, param: ConstPtr<SchedParam>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrSetschedparam(attr.rawAddress, param.rawAddress)

public actual fun pthreadAttrSetschedpolicy(attr: MutPtr<PthreadAttrT>, policy: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrSetschedpolicy(attr.rawAddress, policy)

public actual fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>, stacksize: SizeT): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrSetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.toLong())

public actual fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadBarrierDestroy(barrier.rawAddress)

public actual fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadBarrierInit(barrier.rawAddress, attr.rawAddress, count.toInt())

public actual fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadBarrierWait(barrier.rawAddress)

public actual fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadBarrierattrDestroy(attr.rawAddress)

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, shared: MutPtr<CInt>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadBarrierattrGetpshared(attr.rawAddress, shared.rawAddress)

public actual fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadBarrierattrInit(attr.rawAddress)

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, shared: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadBarrierattrSetpshared(attr.rawAddress, shared)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadCancel(thread.toLong())

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadCondattrGetclock(attr.rawAddress, clockId.rawAddress)

public actual fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadCondattrGetpshared(attr.rawAddress, pshared.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadCondattrSetclock(attr.rawAddress, clockId)

public actual fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadCondattrSetpshared(attr.rawAddress, pshared)

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadCreate(native.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr<ClockidT>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadGetcpuclockid(thread.toLong(), clkId.rawAddress)

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadGetschedparam(native.toLong(), policy.rawAddress, param.rawAddress)

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadKill(thread.toLong(), sig)

public actual fun pthreadMutexConsistent(mutex: MutPtr<PthreadMutexT>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadMutexConsistent(mutex.rawAddress)

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadMutexTimedlock(lock.rawAddress, abstime.rawAddress)

public actual fun pthreadMutexattrGetprotocol(attr: ConstPtr<PthreadMutexattrT>, protocol: MutPtr<CInt>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadMutexattrGetprotocol(attr.rawAddress, protocol.rawAddress)

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadMutexattrGetpshared(attr.rawAddress, pshared.rawAddress)

public actual fun pthreadMutexattrGetrobust(attr: ConstPtr<PthreadMutexattrT>, robustness: MutPtr<CInt>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadMutexattrGetrobust(attr.rawAddress, robustness.rawAddress)

public actual fun pthreadMutexattrSetprotocol(attr: MutPtr<PthreadMutexattrT>, protocol: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadMutexattrSetprotocol(attr.rawAddress, protocol)

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadMutexattrSetpshared(attr.rawAddress, pshared)

public actual fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robustness: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadMutexattrSetrobust(attr.rawAddress, robustness)

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadRwlockattrGetpshared(attr.rawAddress, value.rawAddress)

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadRwlockattrSetpshared(attr.rawAddress, value)

public actual fun pthreadOnce(control: MutPtr<PthreadOnceT>, routine: PthreadAtforkPrepareCallback): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadOnce(control.rawAddress, 0L)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadSetschedparam(native.toLong(), policy, param.rawAddress)

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadSetschedprio(native.toLong(), priority)

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadSigmask(how, set.rawAddress, oldset.rawAddress)

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadSpinDestroy(lock.rawAddress)

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadSpinInit(lock.rawAddress, pshared)

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadSpinLock(lock.rawAddress)

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadSpinTrylock(lock.rawAddress)

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadSpinUnlock(lock.rawAddress)
