@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.time

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.ClockT
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.TimeT
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.libc.new.qurt.Tm
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewQurtTimeJniBridge {
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
        val stream = NewQurtTimeJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcNewQurtTimeTime(tloc: Long): Long

    @JvmStatic
    external fun libcNewQurtTimeClock(): Long

    @JvmStatic
    external fun libcNewQurtTimeDifftime(time1: Long, time0: Long): Double

    @JvmStatic
    external fun libcNewQurtTimeMktime(tm: Long): Long

    @JvmStatic
    external fun libcNewQurtTimeGmtime(timep: Long): Long

    @JvmStatic
    external fun libcNewQurtTimeGmtimeR(timep: Long, result: Long): Long

    @JvmStatic
    external fun libcNewQurtTimeLocaltime(timep: Long): Long

    @JvmStatic
    external fun libcNewQurtTimeLocaltimeR(timep: Long, result: Long): Long

    @JvmStatic
    external fun libcNewQurtTimeAsctime(tm: Long): Long

    @JvmStatic
    external fun libcNewQurtTimeAsctimeR(tm: Long, buf: Long): Long

    @JvmStatic
    external fun libcNewQurtTimeCtime(timep: Long): Long

    @JvmStatic
    external fun libcNewQurtTimeCtimeR(timep: Long, buf: Long): Long

    @JvmStatic
    external fun libcNewQurtTimeStrftime(s: Long, maxsize: Long, format: Long, timeptr: Long): Long

    @JvmStatic
    external fun libcNewQurtTimeStrptime(s: Long, format: Long, tm: Long): Long

    @JvmStatic
    external fun libcNewQurtTimeClockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcNewQurtTimeNanosleep(req: Long, rem: Long): Int
}

public actual fun time(tloc: MutPtr<TimeT>): TimeT =
    NewQurtTimeJniBridge.libcNewQurtTimeTime(tloc.rawAddress)

public actual fun clock(): ClockT =
    NewQurtTimeJniBridge.libcNewQurtTimeClock()

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    NewQurtTimeJniBridge.libcNewQurtTimeDifftime(time1, time0)

public actual fun mktime(tm: MutPtr<Tm>): TimeT =
    NewQurtTimeJniBridge.libcNewQurtTimeMktime(tm.rawAddress)

public actual fun gmtime(timep: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(NewQurtTimeJniBridge.libcNewQurtTimeGmtime(timep.rawAddress))

public actual fun gmtimeR(timep: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(NewQurtTimeJniBridge.libcNewQurtTimeGmtimeR(timep.rawAddress, result.rawAddress))

public actual fun localtime(timep: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(NewQurtTimeJniBridge.libcNewQurtTimeLocaltime(timep.rawAddress))

public actual fun localtimeR(timep: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(NewQurtTimeJniBridge.libcNewQurtTimeLocaltimeR(timep.rawAddress, result.rawAddress))

public actual fun asctime(tm: ConstPtr<Tm>): MutPtr<CChar> =
    MutPtr(NewQurtTimeJniBridge.libcNewQurtTimeAsctime(tm.rawAddress))

public actual fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(NewQurtTimeJniBridge.libcNewQurtTimeAsctimeR(tm.rawAddress, buf.rawAddress))

public actual fun ctime(timep: ConstPtr<TimeT>): MutPtr<CChar> =
    MutPtr(NewQurtTimeJniBridge.libcNewQurtTimeCtime(timep.rawAddress))

public actual fun ctimeR(timep: ConstPtr<TimeT>, buf: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(NewQurtTimeJniBridge.libcNewQurtTimeCtimeR(timep.rawAddress, buf.rawAddress))

public actual fun strftime(s: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>): SizeT =
    NewQurtTimeJniBridge.libcNewQurtTimeStrftime(s.rawAddress, maxsize.toLong(), format.rawAddress, timeptr.rawAddress).toULong()

public actual fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar> =
    MutPtr(NewQurtTimeJniBridge.libcNewQurtTimeStrptime(s.rawAddress, format.rawAddress, tm.rawAddress))

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    NewQurtTimeJniBridge.libcNewQurtTimeClockGettime(clkId, tp.rawAddress)

public actual fun nanosleep(req: ConstPtr<Timespec>, rem: MutPtr<Timespec>): CInt =
    NewQurtTimeJniBridge.libcNewQurtTimeNanosleep(req.rawAddress, rem.rawAddress)
