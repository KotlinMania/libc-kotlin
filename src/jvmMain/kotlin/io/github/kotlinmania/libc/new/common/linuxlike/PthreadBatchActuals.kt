// port-lint: source Pthread.rs
package io.github.kotlinmania.libc.new.common.linuxlike

import io.github.kotlinmania.libc.*

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadGetaffinityNp not available on JVM — no C library access")

public actual fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT): CInt =
    throw UnsupportedOperationException("pthreadGetattrNp not available on JVM — no C library access")

public actual fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp not available on JVM — no C library access")

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadSetaffinityNp not available on JVM — no C library access")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    throw UnsupportedOperationException("pthreadSetnameNp not available on JVM — no C library access")

