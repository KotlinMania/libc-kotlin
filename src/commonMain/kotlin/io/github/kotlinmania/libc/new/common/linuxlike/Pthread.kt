// port-lint: source new/common/linux_like/pthread.rs
package io.github.kotlinmania.libc.new.common.linuxlike

import io.github.kotlinmania.libc.*

/**
 * Non-portable pthread extensions shared across linux-like targets.
 */

// Platforms: Linux, l4re.
public expect fun pthreadGetaffinityNp(
    thread: PthreadT,
    cpusetsize: ULong,
    cpuset: CpuSetT?,
): CInt

public expect fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT?): CInt

// Platforms: Linux.
public expect fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): CInt

// Platforms: Linux, l4re.
public expect fun pthreadSetaffinityNp(
    thread: PthreadT,
    cpusetsize: ULong,
    cpuset: CpuSetT?,
): CInt

// Platforms: Android, Linux.
public expect fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt
