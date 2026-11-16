// port-lint: source new/qurt/time.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.*

// Header: `time.h`

// Clock types
public val CLOCK_REALTIME: ClockidT = 0

public val CLOCK_MONOTONIC: ClockidT = 1

public val CLOCK_THREAD_CPUTIME_ID: ClockidT = 2

public val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 3

public expect fun time(tloc: TimeT?): TimeT

public expect fun clock(): ClockT

public expect fun difftime(time1: TimeT, time0: TimeT): CDouble

public expect fun mktime(tm: Tm?): TimeT

public expect fun gmtime(timep: TimeT?): Tm?

public expect fun gmtimeR(timep: TimeT?, result: Tm?): Tm?

public expect fun localtime(timep: TimeT?): Tm?

public expect fun localtimeR(timep: TimeT?, result: Tm?): Tm?

public expect fun asctime(tm: Tm?): COpaquePointer?

public expect fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer?

public expect fun ctime(timep: TimeT?): COpaquePointer?

public expect fun ctimeR(timep: TimeT?, buf: COpaquePointer?): COpaquePointer?

public expect fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: Tm?): SizeT

public expect fun strptime(s: String?, format: String?, tm: Tm?): COpaquePointer?

public expect fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt

public expect fun nanosleep(req: Timespec?, rem: Timespec?): CInt
