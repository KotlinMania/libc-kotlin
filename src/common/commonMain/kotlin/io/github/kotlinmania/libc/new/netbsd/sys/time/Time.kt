// port-lint: source new/netbsd/sys/time.rs
package io.github.kotlinmania.libc.new.netbsd.sys.time

import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.Timespec

// Header: `sys / time.h`
//
// <https://github.com/NetBSD/src/blob/trunk/sys/sys/time.h>

public open class Itimerspec(public var itInterval: Timespec, public var itValue: Timespec)

public val CLOCK_THREAD_CPUTIME_ID: ClockidT = 0x20000000

public val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 0x40000000
