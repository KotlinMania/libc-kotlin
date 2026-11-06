@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun time(tloc: TimeT?): TimeT =
    io.github.kotlinmania.libc.cinterop.libc_time_time(tloc?.value?.toCPointer<ByteVar>())

public actual fun clock(): ClockT =
    io.github.kotlinmania.libc.cinterop.libc_time_clock()

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    io.github.kotlinmania.libc.cinterop.libc_time_difftime(time1, time0)

public actual fun mktime(tm: Tm?): TimeT =
    io.github.kotlinmania.libc.cinterop.libc_time_mktime(tm?.value?.toCPointer<ByteVar>())

public actual fun gmtime(timep: TimeT?): Tm? =
    io.github.kotlinmania.libc.cinterop.libc_time_gmtime(timep?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun gmtimeR(timep: TimeT?, result: Tm?): Tm? =
    io.github.kotlinmania.libc.cinterop.libc_time_gmtime_r(timep?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtime(timep: TimeT?): Tm? =
    io.github.kotlinmania.libc.cinterop.libc_time_localtime(timep?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtimeR(timep: TimeT?, result: Tm?): Tm? =
    io.github.kotlinmania.libc.cinterop.libc_time_localtime_r(timep?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun asctime(tm: Tm?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_time_asctime(tm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_time_asctime_r(tm?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctime(timep: TimeT?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_time_ctime(timep?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctimeR(timep: TimeT?, buf: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_time_ctime_r(timep?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: Tm?): SizeT =
    io.github.kotlinmania.libc.cinterop.libc_time_strftime(s?.value?.toCPointer<ByteVar>(), maxsize, format, timeptr?.value?.toCPointer<ByteVar>())

public actual fun strptime(s: String?, format: String?, tm: Tm?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_time_strptime(s, format, tm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_time_clock_gettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun nanosleep(req: Timespec?, rem: Timespec?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_time_nanosleep(req?.value?.toCPointer<ByteVar>(), rem?.value?.toCPointer<ByteVar>())
