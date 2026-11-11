@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.time

import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.ClockT
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.TimeT
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libc_new_qurt_time_asctime
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libc_new_qurt_time_asctimeR
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libc_new_qurt_time_clock
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libc_new_qurt_time_clockGettime
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libc_new_qurt_time_ctime
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libc_new_qurt_time_ctimeR
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libc_new_qurt_time_difftime
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libc_new_qurt_time_gmtime
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libc_new_qurt_time_gmtimeR
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libc_new_qurt_time_localtime
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libc_new_qurt_time_localtimeR
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libc_new_qurt_time_mktime
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libc_new_qurt_time_nanosleep
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libc_new_qurt_time_strftime
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libc_new_qurt_time_strptime
import io.github.kotlinmania.libc.new.qurt.time.cinterop.libc_new_qurt_time_time
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun time(tloc: COpaquePointer?): TimeT =
    libc_new_qurt_time_time(tloc?.value?.toCPointer<ByteVar>())

public actual fun clock(): ClockT =
    libc_new_qurt_time_clock()

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    libc_new_qurt_time_difftime(time1, time0)

public actual fun mktime(tm: COpaquePointer?): TimeT =
    libc_new_qurt_time_mktime(tm?.value?.toCPointer<ByteVar>())

public actual fun gmtime(timep: COpaquePointer?): COpaquePointer? =
    libc_new_qurt_time_gmtime(timep?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun gmtimeR(timep: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    libc_new_qurt_time_gmtimeR(timep?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtime(timep: COpaquePointer?): COpaquePointer? =
    libc_new_qurt_time_localtime(timep?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtimeR(timep: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    libc_new_qurt_time_localtimeR(timep?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun asctime(tm: COpaquePointer?): COpaquePointer? =
    libc_new_qurt_time_asctime(tm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    libc_new_qurt_time_asctimeR(tm?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctime(timep: COpaquePointer?): COpaquePointer? =
    libc_new_qurt_time_ctime(timep?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    libc_new_qurt_time_ctimeR(timep?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT =
    libc_new_qurt_time_strftime(s?.value?.toCPointer<ByteVar>(), maxsize, format, timeptr?.value?.toCPointer<ByteVar>())

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    libc_new_qurt_time_strptime(s, format, tm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    libc_new_qurt_time_clockGettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun nanosleep(req: COpaquePointer?, rem: COpaquePointer?): CInt =
    libc_new_qurt_time_nanosleep(req?.value?.toCPointer<ByteVar>(), rem?.value?.toCPointer<ByteVar>())
