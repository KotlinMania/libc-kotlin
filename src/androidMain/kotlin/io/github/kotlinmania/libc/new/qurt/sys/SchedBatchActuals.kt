// port-lint: source Sched.rs
package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.*

public actual fun schedYield(): Int =
    throw UnsupportedOperationException("schedYield not available on Android host — use androidNative target for FFI")

public actual fun schedGetPriorityMax(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMax not available on Android host — use androidNative target for FFI")

public actual fun schedGetPriorityMin(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMin not available on Android host — use androidNative target for FFI")
