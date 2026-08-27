// port-lint: source libc/src/new/common/linux_like/pthread.rs
package io.github.kotlinmania.libc.new.common.linuxlike.pthread

import io.github.kotlinmania.libc.new.common.posix.pthread.PthreadAttrT
import io.github.kotlinmania.libc.new.common.posix.pthread.PthreadT

// winpthreads has no _np Linux extensions. Win32 has SetThreadAffinityMask
// and SetThreadDescription / GetThreadDescription which provide the same
// semantics but with different signatures — wiring that requires going through
// pthread_getw32threadhandle_np to get a Win32 HANDLE first.

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int = 38

public actual fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT): Int = 38

public actual fun pthreadGetnameNp(thread: PthreadT, name: ByteArray, len: ULong): Int = 38

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int = 38

public actual fun pthreadSetnameNp(thread: PthreadT, name: String): Int = 38
