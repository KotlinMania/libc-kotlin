@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.time

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.ClockT
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.TimeT
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.libc.new.qurt.Tm
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

public actual fun time(tloc: MutPtr<TimeT>): TimeT =
    libcNewQurtTimeTime(tloc.rawAddress.toCPointer<ByteVar>())

public actual fun clock(): ClockT =
    libcNewQurtTimeClock()

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    libcNewQurtTimeDifftime(time1, time0)

public actual fun mktime(tm: MutPtr<Tm>): TimeT =
    libcNewQurtTimeMktime(tm.rawAddress.toCPointer<ByteVar>())

public actual fun gmtime(timep: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(libcNewQurtTimeGmtime(timep.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun gmtimeR(timep: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(libcNewQurtTimeGmtimeR(timep.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtime(timep: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(libcNewQurtTimeLocaltime(timep.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtimeR(timep: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(libcNewQurtTimeLocaltimeR(timep.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun asctime(tm: ConstPtr<Tm>): MutPtr<CChar> =
    MutPtr(libcNewQurtTimeAsctime(tm.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcNewQurtTimeAsctimeR(tm.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ctime(timep: ConstPtr<TimeT>): MutPtr<CChar> =
    MutPtr(libcNewQurtTimeCtime(timep.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ctimeR(timep: ConstPtr<TimeT>, buf: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcNewQurtTimeCtimeR(timep.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strftime(s: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>): SizeT =
    libcNewQurtTimeStrftime(s.rawAddress.toCPointer<ByteVar>(), maxsize, format.rawAddress.toCPointer<ByteVar>(), timeptr.rawAddress.toCPointer<ByteVar>())

public actual fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar> =
    MutPtr(libcNewQurtTimeStrptime(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), tm.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcNewQurtTimeClockGettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun nanosleep(req: ConstPtr<Timespec>, rem: MutPtr<Timespec>): CInt =
    libcNewQurtTimeNanosleep(req.rawAddress.toCPointer<ByteVar>(), rem.rawAddress.toCPointer<ByteVar>())
