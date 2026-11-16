// port-lint: source new/qurt/time.rs
package io.github.kotlinmania.libc.new.qurt.time

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.ClockT
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.TimeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `time.h`

// Clock types
public val CLOCK_REALTIME: ClockidT = 0

public val CLOCK_MONOTONIC: ClockidT = 1

public val CLOCK_THREAD_CPUTIME_ID: ClockidT = 2

public val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 3

public expect fun time(tloc: MutPtr): TimeT

public expect fun clock(): ClockT

public expect fun difftime(time1: TimeT, time0: TimeT): CDouble

public expect fun mktime(tm: MutPtr): TimeT

public expect fun gmtime(timep: ConstPtr): MutPtr

public expect fun gmtimeR(timep: ConstPtr, result: MutPtr): MutPtr

public expect fun localtime(timep: ConstPtr): MutPtr

public expect fun localtimeR(timep: ConstPtr, result: MutPtr): MutPtr

public expect fun asctime(tm: ConstPtr): MutPtr

public expect fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr

public expect fun ctime(timep: ConstPtr): MutPtr

public expect fun ctimeR(timep: ConstPtr, buf: MutPtr): MutPtr

public expect fun strftime(s: MutPtr, maxsize: SizeT, format: ConstPtr, timeptr: ConstPtr): SizeT

public expect fun strptime(s: ConstPtr, format: ConstPtr, tm: MutPtr): MutPtr

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt

public expect fun nanosleep(req: ConstPtr, rem: MutPtr): CInt
