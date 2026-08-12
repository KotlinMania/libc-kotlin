// port-lint: source new/qurt/time.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public const val CLOCK_REALTIME: ClockidT = 0
public const val CLOCK_MONOTONIC: ClockidT = 1
public const val CLOCK_THREAD_CPUTIME_ID: ClockidT = 2
public const val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 3

public fun time(tloc: TimeT?): TimeT = -1L

public fun clock(): ClockT = -1L

public fun difftime(time1: TimeT, time0: TimeT): CDouble = 0.0

public fun mktime(tm: Tm?): TimeT = -1L

public fun gmtime(timep: TimeT?): Tm? = null

public fun gmtimeR(timep: TimeT?, result: Tm?): Tm? = null

public fun localtime(timep: TimeT?): Tm? = null

public fun localtimeR(timep: TimeT?, result: Tm?): Tm? = null

public fun asctime(tm: Tm?): String? = null

public fun asctimeR(tm: Tm?, buf: String?): String? = null

public fun ctime(timep: TimeT?): String? = null

public fun ctimeR(timep: TimeT?, buf: String?): String? = null

public fun strftime(s: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong = 0uL

public fun strptime(s: String?, format: String?, tm: Tm?): String? = null

public fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt = -1

public fun nanosleep(req: Timespec?, rem: Timespec?): CInt = -1
