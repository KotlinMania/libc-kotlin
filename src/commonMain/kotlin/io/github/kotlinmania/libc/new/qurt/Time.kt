// port-lint: source new/qurt/time.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

/**
 * Header: `time.h`.
 */

public const val CLOCK_REALTIME: ClockidT = 0
public const val CLOCK_MONOTONIC: ClockidT = 1
public const val CLOCK_THREAD_CPUTIME_ID: ClockidT = 2
public const val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 3

public expect fun time(tloc: TimeT?): TimeT

public expect fun clock(): ClockT

public expect fun difftime(time1: TimeT, time0: TimeT): CDouble

public expect fun mktime(tm: Tm?): TimeT

public expect fun gmtime(timep: TimeT?): Tm?

public expect fun gmtimeR(timep: TimeT?, result: Tm?): Tm?

public expect fun localtime(timep: TimeT?): Tm?

public expect fun localtimeR(timep: TimeT?, result: Tm?): Tm?

public expect fun asctime(tm: Tm?): String?

public expect fun asctimeR(tm: Tm?, buf: String?): String?

public expect fun ctime(timep: TimeT?): String?

public expect fun ctimeR(timep: TimeT?, buf: String?): String?

public expect fun strftime(s: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong

public expect fun strptime(s: String?, format: String?, tm: Tm?): String?

public expect fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt

public expect fun nanosleep(req: Timespec?, rem: Timespec?): CInt
