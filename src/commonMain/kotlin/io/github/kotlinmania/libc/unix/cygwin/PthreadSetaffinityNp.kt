package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun pthreadSetaffinityNp(thread: io.github.kotlinmania.libc.COpaquePointer?, cpusetsize: ULong, cpuset: CpuSetT?): Int
