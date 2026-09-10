// port-lint: source Sched.rs
package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("schedYield not available on JVM — no C library access")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMax not available on JVM — no C library access")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMin not available on JVM — no C library access")

