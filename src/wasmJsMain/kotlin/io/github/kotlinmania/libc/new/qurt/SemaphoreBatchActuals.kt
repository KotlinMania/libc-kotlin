// port-lint: source Semaphore.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun semInit(sem: UInt?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit requires N-API addon")

public actual fun semDestroy(sem: UInt?): Int =
    throw UnsupportedOperationException("semDestroy requires N-API addon")

public actual fun semWait(sem: UInt?): Int =
    throw UnsupportedOperationException("semWait requires N-API addon")

public actual fun semTrywait(sem: UInt?): Int =
    throw UnsupportedOperationException("semTrywait requires N-API addon")

public actual fun semPost(sem: UInt?): Int =
    throw UnsupportedOperationException("semPost requires N-API addon")

public actual fun semGetvalue(sem: UInt?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue requires N-API addon")
