// port-lint: source Semaphore.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun semInit(sem: UInt?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit not available on Android host — use androidNative target for FFI")

public actual fun semDestroy(sem: UInt?): Int =
    throw UnsupportedOperationException("semDestroy not available on Android host — use androidNative target for FFI")

public actual fun semWait(sem: UInt?): Int =
    throw UnsupportedOperationException("semWait not available on Android host — use androidNative target for FFI")

public actual fun semTrywait(sem: UInt?): Int =
    throw UnsupportedOperationException("semTrywait not available on Android host — use androidNative target for FFI")

public actual fun semPost(sem: UInt?): Int =
    throw UnsupportedOperationException("semPost not available on Android host — use androidNative target for FFI")

public actual fun semGetvalue(sem: UInt?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue not available on Android host — use androidNative target for FFI")
