// port-lint: source libc/src/new/common/linux_like/pthread.rs
package io.github.kotlinmania.libc.new.common.linuxlike.pthread

import io.github.kotlinmania.libc.new.common.posix.pthread.PthreadAttrT
import io.github.kotlinmania.libc.new.common.posix.pthread.PthreadT

// Apple libc has no _np extensions in the linux_like family. pthread_setname_np
// is Apple's own variant that names the *calling* thread, signature
// `int pthread_setname_np(const char*)` — not the linux_like 2-arg form.
// Apple has no affinity API at all (mach thread_policy_set fills that role).

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int = 38
public actual fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT): Int = 38
public actual fun pthreadGetnameNp(thread: PthreadT, name: ByteArray, len: ULong): Int = 38
public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int = 38
public actual fun pthreadSetnameNp(thread: PthreadT, name: String): Int = 38
