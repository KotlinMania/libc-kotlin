// port-lint: source Sched.rs
package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("schedYield requires N-API addon")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMax requires N-API addon")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMin requires N-API addon")

