// port-lint: source new/qurt/time.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public const val CLOCK_REALTIME: Int = 0
public const val CLOCK_MONOTONIC: Int = 1
public const val CLOCK_THREAD_CPUTIME_ID: Int = 2
public const val CLOCK_PROCESS_CPUTIME_ID: Int = 3

public expect fun time(tloc: Long?): Long

public expect fun clock(): Long

public fun difftime(time1: Long, time0: Long): Double = 0.0

public expect fun mktime(tm: Tm?): Long

public expect fun gmtime(timep: Long?): Tm?

public expect fun gmtimeR(timep: Long?, result: Tm?): Tm?

public expect fun localtime(timep: Long?): Tm?

public expect fun localtimeR(timep: Long?, result: Tm?): Tm?

public expect fun asctime(tm: Tm?): String?

public expect fun asctimeR(tm: Tm?, buf: String?): String?

public expect fun ctime(timep: Long?): String?

public expect fun ctimeR(timep: Long?, buf: String?): String?

public expect fun strftime(s: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong

public expect fun strptime(s: String?, format: String?, tm: Tm?): String?

public expect fun clockGettime(clkId: Int, tp: Timespec?): Int

public expect fun nanosleep(req: Timespec?, rem: Timespec?): Int
