// port-lint: source new/qurt/time.rs
package io.github.kotlinmania.libc.new.qurt.time

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.ClockT
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.TimeT

// Header: `time.h`

// Clock types
public val CLOCK_REALTIME: ClockidT = 0

public val CLOCK_MONOTONIC: ClockidT = 1

public val CLOCK_THREAD_CPUTIME_ID: ClockidT = 2

public val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 3

public expect fun time(tloc: COpaquePointer?): TimeT

public expect fun clock(): ClockT

public expect fun difftime(time1: TimeT, time0: TimeT): CDouble

public expect fun mktime(tm: COpaquePointer?): TimeT

public expect fun gmtime(timep: COpaquePointer?): COpaquePointer?

public expect fun gmtimeR(timep: COpaquePointer?, result: COpaquePointer?): COpaquePointer?

public expect fun localtime(timep: COpaquePointer?): COpaquePointer?

public expect fun localtimeR(timep: COpaquePointer?, result: COpaquePointer?): COpaquePointer?

public expect fun asctime(tm: COpaquePointer?): COpaquePointer?

public expect fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer?

public expect fun ctime(timep: COpaquePointer?): COpaquePointer?

public expect fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer?

public expect fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT

public expect fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer?

public expect fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun nanosleep(req: COpaquePointer?, rem: COpaquePointer?): CInt
