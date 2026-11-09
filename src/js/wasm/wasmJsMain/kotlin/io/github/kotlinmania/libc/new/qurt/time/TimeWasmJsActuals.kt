@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.time

import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.ClockT
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.TimeT

public actual fun time(tloc: COpaquePointer?): TimeT =
    0L

public actual fun clock(): ClockT =
    0L

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    0.0

public actual fun mktime(tm: COpaquePointer?): TimeT =
    0L

public actual fun gmtime(timep: COpaquePointer?): COpaquePointer? =
    null

public actual fun gmtimeR(timep: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    null

public actual fun localtime(timep: COpaquePointer?): COpaquePointer? =
    null

public actual fun localtimeR(timep: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    null

public actual fun asctime(tm: COpaquePointer?): COpaquePointer? =
    null

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    null

public actual fun ctime(timep: COpaquePointer?): COpaquePointer? =
    null

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    null

public actual fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT =
    0uL

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    null

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun nanosleep(req: COpaquePointer?, rem: COpaquePointer?): CInt =
    0
