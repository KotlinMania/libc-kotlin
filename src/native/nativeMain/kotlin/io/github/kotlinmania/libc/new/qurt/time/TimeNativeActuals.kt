@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.time

import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.ClockT
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.TimeT
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libcNewQurtTimeAsctime
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libcNewQurtTimeAsctimeR
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libcNewQurtTimeClock
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libcNewQurtTimeClockGettime
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libcNewQurtTimeCtime
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libcNewQurtTimeCtimeR
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libcNewQurtTimeDifftime
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libcNewQurtTimeGmtime
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libcNewQurtTimeGmtimeR
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libcNewQurtTimeLocaltime
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libcNewQurtTimeLocaltimeR
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libcNewQurtTimeMktime
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libcNewQurtTimeNanosleep
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libcNewQurtTimeStrftime
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libcNewQurtTimeStrptime
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libcNewQurtTimeTime
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun time(tloc: MutPtr): TimeT =
    libcNewQurtTimeTime(tloc.rawAddress.toCPointer<ByteVar>())

public actual fun clock(): ClockT =
    libcNewQurtTimeClock()

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    libcNewQurtTimeDifftime(time1, time0)

public actual fun mktime(tm: MutPtr): TimeT =
    libcNewQurtTimeMktime(tm.rawAddress.toCPointer<ByteVar>())

public actual fun gmtime(timep: ConstPtr): MutPtr =
    MutPtr(libcNewQurtTimeGmtime(timep.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun gmtimeR(timep: ConstPtr, result: MutPtr): MutPtr =
    MutPtr(libcNewQurtTimeGmtimeR(timep.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtime(timep: ConstPtr): MutPtr =
    MutPtr(libcNewQurtTimeLocaltime(timep.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtimeR(timep: ConstPtr, result: MutPtr): MutPtr =
    MutPtr(libcNewQurtTimeLocaltimeR(timep.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun asctime(tm: ConstPtr): MutPtr =
    MutPtr(libcNewQurtTimeAsctime(tm.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr =
    MutPtr(libcNewQurtTimeAsctimeR(tm.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ctime(timep: ConstPtr): MutPtr =
    MutPtr(libcNewQurtTimeCtime(timep.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ctimeR(timep: ConstPtr, buf: MutPtr): MutPtr =
    MutPtr(libcNewQurtTimeCtimeR(timep.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strftime(s: MutPtr, maxsize: SizeT, format: ConstPtr, timeptr: ConstPtr): SizeT =
    libcNewQurtTimeStrftime(s.rawAddress.toCPointer<ByteVar>(), maxsize, format.rawAddress.toCPointer<ByteVar>(), timeptr.rawAddress.toCPointer<ByteVar>())

public actual fun strptime(s: ConstPtr, format: ConstPtr, tm: MutPtr): MutPtr =
    MutPtr(libcNewQurtTimeStrptime(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), tm.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    libcNewQurtTimeClockGettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun nanosleep(req: ConstPtr, rem: MutPtr): CInt =
    libcNewQurtTimeNanosleep(req.rawAddress.toCPointer<ByteVar>(), rem.rawAddress.toCPointer<ByteVar>())
