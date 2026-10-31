// port-lint: source new/common/linux_like/pthread.rs
package io.github.kotlinmania.libc.new.common.linuxlike.pthread

import io.github.kotlinmania.libc.new.common.posix.pthread.PthreadAttrT
import io.github.kotlinmania.libc.new.common.posix.pthread.PthreadT

/**
 * Linux-like `<pthread.h>` non-portable extensions.
 */

/** Opaque CPU affinity bitset. */
public expect class CpuSetT

public expect fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int

public expect fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT): Int

public expect fun pthreadGetnameNp(thread: PthreadT, name: ByteArray, len: ULong): Int

public expect fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int

public expect fun pthreadSetnameNp(thread: PthreadT, name: String): Int
