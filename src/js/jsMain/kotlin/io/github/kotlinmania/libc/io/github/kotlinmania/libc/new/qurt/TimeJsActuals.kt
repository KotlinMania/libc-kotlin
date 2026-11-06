package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

public actual fun time(tloc: TimeT?): TimeT =
    js("require('@kotlinmania/libc-native-bindings').time(tloc?.toLong() ?: 0L)") as TimeT

public actual fun clock(): ClockT =
    js("require('@kotlinmania/libc-native-bindings').clock()") as ClockT

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    js("require('@kotlinmania/libc-native-bindings').difftime(time1, time0)") as CDouble

public actual fun mktime(tm: Tm?): TimeT =
    js("require('@kotlinmania/libc-native-bindings').mktime(tm?.toLong() ?: 0L)") as TimeT

public actual fun gmtime(timep: TimeT?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').gmtime(timep?.toLong() ?: 0L)") as Tm?

public actual fun gmtimeR(timep: TimeT?, result: Tm?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').gmtimeR(timep?.toLong() ?: 0L, result?.toLong() ?: 0L)") as Tm?

public actual fun localtime(timep: TimeT?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').localtime(timep?.toLong() ?: 0L)") as Tm?

public actual fun localtimeR(timep: TimeT?, result: Tm?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').localtimeR(timep?.toLong() ?: 0L, result?.toLong() ?: 0L)") as Tm?

public actual fun asctime(tm: Tm?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').asctime(tm?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').asctimeR(tm?.toLong() ?: 0L, buf?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctime(timep: TimeT?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ctime(timep?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(timep: TimeT?, buf: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ctimeR(timep?.toLong() ?: 0L, buf?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: Tm?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strftime(s?.value ?: 0L, maxsize, format, timeptr?.toLong() ?: 0L)") as SizeT

public actual fun strptime(s: String?, format: String?, tm: Tm?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strptime(s, format, tm?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun nanosleep(req: Timespec?, rem: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').nanosleep(req?.toLong() ?: 0L, rem?.toLong() ?: 0L)") as CInt
