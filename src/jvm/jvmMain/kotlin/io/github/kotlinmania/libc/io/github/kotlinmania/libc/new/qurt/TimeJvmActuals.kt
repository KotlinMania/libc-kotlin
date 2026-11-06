package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

internal object TimeRawLibc {
    external fun time(tloc: Long): Long
    external fun clock(): Long
    external fun difftime(time1: Long, time0: Long): Double
    external fun mktime(tm: Long): Long
    external fun gmtime(timep: Long): Long?
    external fun gmtimeR(timep: Long, result: Long): Long?
    external fun localtime(timep: Long): Long?
    external fun localtimeR(timep: Long, result: Long): Long?
    external fun asctime(tm: Long): Long?
    external fun asctimeR(tm: Long, buf: Long): Long?
    external fun ctime(timep: Long): Long?
    external fun ctimeR(timep: Long, buf: Long): Long?
    external fun strftime(s: Long, maxsize: Long, format: String?, timeptr: Long): Long
    external fun strptime(s: String?, format: String?, tm: Long): Long?
    external fun clockGettime(clkId: Int, tp: Long): Int
    external fun nanosleep(req: Long, rem: Long): Int
}

public actual fun time(tloc: TimeT?): TimeT =
    TimeRawLibc.time(tloc?.toLong() ?: 0L)

public actual fun clock(): ClockT =
    TimeRawLibc.clock()

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    TimeRawLibc.difftime(time1, time0)

public actual fun mktime(tm: Tm?): TimeT =
    TimeRawLibc.mktime(tm?.toLong() ?: 0L)

public actual fun gmtime(timep: TimeT?): Tm? =
    TimeRawLibc.gmtime(timep?.toLong() ?: 0L)

public actual fun gmtimeR(timep: TimeT?, result: Tm?): Tm? =
    TimeRawLibc.gmtimeR(timep?.toLong() ?: 0L, result?.toLong() ?: 0L)

public actual fun localtime(timep: TimeT?): Tm? =
    TimeRawLibc.localtime(timep?.toLong() ?: 0L)

public actual fun localtimeR(timep: TimeT?, result: Tm?): Tm? =
    TimeRawLibc.localtimeR(timep?.toLong() ?: 0L, result?.toLong() ?: 0L)

public actual fun asctime(tm: Tm?): COpaquePointer? =
    TimeRawLibc.asctime(tm?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer? =
    TimeRawLibc.asctimeR(tm?.toLong() ?: 0L, buf?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctime(timep: TimeT?): COpaquePointer? =
    TimeRawLibc.ctime(timep?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(timep: TimeT?, buf: COpaquePointer?): COpaquePointer? =
    TimeRawLibc.ctimeR(timep?.toLong() ?: 0L, buf?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: Tm?): SizeT =
    TimeRawLibc.strftime(s?.value ?: 0L, maxsize, format, timeptr?.toLong() ?: 0L)

public actual fun strptime(s: String?, format: String?, tm: Tm?): COpaquePointer? =
    TimeRawLibc.strptime(s, format, tm?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    TimeRawLibc.clockGettime(clkId, tp?.toLong() ?: 0L)

public actual fun nanosleep(req: Timespec?, rem: Timespec?): CInt =
    TimeRawLibc.nanosleep(req?.toLong() ?: 0L, rem?.toLong() ?: 0L)
