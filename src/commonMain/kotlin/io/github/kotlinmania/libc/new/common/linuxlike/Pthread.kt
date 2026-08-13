// port-lint: source new/common/linux_like/pthread.rs
package io.github.kotlinmania.libc.new.common.linuxlike

import io.github.kotlinmania.libc.*

public fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT?): CInt = -1

public fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT): CInt = -1

public fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): CInt = -1

public fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT?): CInt = -1

public fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt = -1
