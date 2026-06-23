// port-lint: source new/common/linux_like/pthread.rs
package io.github.kotlinmania.libc.new.common.linuxlike

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public expect fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT?): CInt
public expect fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT?): CInt
public expect fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): CInt
public expect fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT?): CInt
public expect fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt
