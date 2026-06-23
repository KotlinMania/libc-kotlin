// port-lint: source new/netbsd/sys/time.rs
package io.github.kotlinmania.libc.new.netbsd.sys

import io.github.kotlinmania.libc.*

public data class Itimerspec(
    val itInterval: Timespec,
    val itValue: Timespec,
)

public const val CLOCK_THREAD_CPUTIME_ID: ClockidT = 0x20000000
public const val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 0x40000000
