// port-lint: source new/common/linux_like/pthread.rs
package io.github.kotlinmania.libc.new.common.linuxlike.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadAttrT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.sys.types.CpuSetT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt

public expect fun pthreadGetattrNp(native: PthreadT, attr: MutPtr<PthreadAttrT>): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt

public expect fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt
