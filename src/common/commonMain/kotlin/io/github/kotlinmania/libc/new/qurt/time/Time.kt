// port-lint: source new/qurt/time.rs
package io.github.kotlinmania.libc.new.qurt.time

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.ClockT
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.TimeT
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.libc.new.qurt.Tm
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `time.h`

// Clock types
public val CLOCK_REALTIME: ClockidT = 0

public val CLOCK_MONOTONIC: ClockidT = 1

public val CLOCK_THREAD_CPUTIME_ID: ClockidT = 2

public val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 3

public expect fun time(tloc: MutPtr<TimeT>): TimeT

public expect fun clock(): ClockT

public expect fun difftime(time1: TimeT, time0: TimeT): CDouble

public expect fun mktime(tm: MutPtr<Tm>): TimeT

public expect fun gmtime(timep: ConstPtr<TimeT>): MutPtr<Tm>

public expect fun gmtimeR(timep: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm>

public expect fun localtime(timep: ConstPtr<TimeT>): MutPtr<Tm>

public expect fun localtimeR(timep: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm>

public expect fun asctime(tm: ConstPtr<Tm>): MutPtr<CChar>

public expect fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar>

public expect fun ctime(timep: ConstPtr<TimeT>): MutPtr<CChar>

public expect fun ctimeR(timep: ConstPtr<TimeT>, buf: MutPtr<CChar>): MutPtr<CChar>

public expect fun strftime(s: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>): SizeT

public expect fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar>

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun nanosleep(req: ConstPtr<Timespec>, rem: MutPtr<Timespec>): CInt
