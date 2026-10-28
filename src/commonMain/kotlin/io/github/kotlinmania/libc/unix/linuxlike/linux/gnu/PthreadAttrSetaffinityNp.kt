package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrSetaffinityNp(attr: io.github.kotlinmania.libc.COpaquePointer?, cpusetsize: ULong, cpuset: ULong?): Int
