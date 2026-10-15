// port-lint: source new/common/linux_like/pthread.rs
package io.github.kotlinmania.libc.new.common.linuxlike

import io.github.kotlinmania.libc.*

public expect fun pthreadGetaffinityNp(thread: ULong, cpusetsize: ULong, cpuset: ULong?): Int

public expect fun pthreadGetattrNp(native: ULong, attr: io.github.kotlinmania.libc.COpaquePointer?): Int

public expect fun pthreadGetnameNp(thread: ULong, name: String?, len: ULong): Int

public expect fun pthreadSetaffinityNp(thread: ULong, cpusetsize: ULong, cpuset: ULong?): Int

public expect fun pthreadSetnameNp(thread: ULong, name: String?): Int
