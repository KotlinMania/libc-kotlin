@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.time

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.ClockT
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.TimeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewQurtTimeJniBridge {
    init {
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

public actual fun time(tloc: MutPtr): TimeT =
    NewQurtTimeJniBridge.libcNewQurtTimeTime(tloc.rawAddress)

public actual fun clock(): ClockT =
    NewQurtTimeJniBridge.libcNewQurtTimeClock()

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    NewQurtTimeJniBridge.libcNewQurtTimeDifftime(time1, time0)

public actual fun mktime(tm: MutPtr): TimeT =
    NewQurtTimeJniBridge.libcNewQurtTimeMktime(tm.rawAddress)

public actual fun gmtime(timep: ConstPtr): MutPtr =
    MutPtr(NewQurtTimeJniBridge.libcNewQurtTimeGmtime(timep.rawAddress))

public actual fun gmtimeR(timep: ConstPtr, result: MutPtr): MutPtr =
    MutPtr(NewQurtTimeJniBridge.libcNewQurtTimeGmtimeR(timep.rawAddress, result.rawAddress))

public actual fun localtime(timep: ConstPtr): MutPtr =
    MutPtr(NewQurtTimeJniBridge.libcNewQurtTimeLocaltime(timep.rawAddress))

public actual fun localtimeR(timep: ConstPtr, result: MutPtr): MutPtr =
    MutPtr(NewQurtTimeJniBridge.libcNewQurtTimeLocaltimeR(timep.rawAddress, result.rawAddress))

public actual fun asctime(tm: ConstPtr): MutPtr =
    MutPtr(NewQurtTimeJniBridge.libcNewQurtTimeAsctime(tm.rawAddress))

public actual fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr =
    MutPtr(NewQurtTimeJniBridge.libcNewQurtTimeAsctimeR(tm.rawAddress, buf.rawAddress))

public actual fun ctime(timep: ConstPtr): MutPtr =
    MutPtr(NewQurtTimeJniBridge.libcNewQurtTimeCtime(timep.rawAddress))

public actual fun ctimeR(timep: ConstPtr, buf: MutPtr): MutPtr =
    MutPtr(NewQurtTimeJniBridge.libcNewQurtTimeCtimeR(timep.rawAddress, buf.rawAddress))

public actual fun strftime(s: MutPtr, maxsize: SizeT, format: ConstPtr, timeptr: ConstPtr): SizeT =
    NewQurtTimeJniBridge.libcNewQurtTimeStrftime(s.rawAddress, maxsize.toLong(), format.rawAddress, timeptr.rawAddress).toULong()

public actual fun strptime(s: ConstPtr, format: ConstPtr, tm: MutPtr): MutPtr =
    MutPtr(NewQurtTimeJniBridge.libcNewQurtTimeStrptime(s.rawAddress, format.rawAddress, tm.rawAddress))

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    NewQurtTimeJniBridge.libcNewQurtTimeClockGettime(clkId, tp.rawAddress)

public actual fun nanosleep(req: ConstPtr, rem: MutPtr): CInt =
    NewQurtTimeJniBridge.libcNewQurtTimeNanosleep(req.rawAddress, rem.rawAddress)
