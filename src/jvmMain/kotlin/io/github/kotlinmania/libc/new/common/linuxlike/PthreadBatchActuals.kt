// port-lint: source Pthread.rs
package io.github.kotlinmania.libc.new.common.linuxlike

import io.github.kotlinmania.libc.*

public actual fun pthreadGetaffinityNp(thread: ULong, cpusetsize: ULong, cpuset: ULong?): Int =
    throw UnsupportedOperationException("pthreadGetaffinityNp not available on JVM — no C library access")

public actual fun pthreadGetattrNp(native: ULong, attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadGetattrNp not available on JVM — no C library access")

public actual fun pthreadGetnameNp(thread: ULong, name: String?, len: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp not available on JVM — no C library access")

public actual fun pthreadSetaffinityNp(thread: ULong, cpusetsize: ULong, cpuset: ULong?): Int =
    throw UnsupportedOperationException("pthreadSetaffinityNp not available on JVM — no C library access")

public actual fun pthreadSetnameNp(thread: ULong, name: String?): Int =
    throw UnsupportedOperationException("pthreadSetnameNp not available on JVM — no C library access")
