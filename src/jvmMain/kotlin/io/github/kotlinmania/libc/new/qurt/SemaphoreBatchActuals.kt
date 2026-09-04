// port-lint: source Semaphore.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit not available on JVM — no C library access")

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy not available on JVM — no C library access")

public actual fun semWait(sem: SemT?): CInt =
    throw UnsupportedOperationException("semWait not available on JVM — no C library access")

public actual fun semTrywait(sem: SemT?): CInt =
    throw UnsupportedOperationException("semTrywait not available on JVM — no C library access")

public actual fun semPost(sem: SemT?): CInt =
    throw UnsupportedOperationException("semPost not available on JVM — no C library access")

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue not available on JVM — no C library access")

