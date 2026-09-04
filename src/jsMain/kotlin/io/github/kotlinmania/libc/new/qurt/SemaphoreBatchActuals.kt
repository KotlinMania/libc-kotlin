// port-lint: source Semaphore.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit requires N-API addon")

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy requires N-API addon")

public actual fun semWait(sem: SemT?): CInt =
    throw UnsupportedOperationException("semWait requires N-API addon")

public actual fun semTrywait(sem: SemT?): CInt =
    throw UnsupportedOperationException("semTrywait requires N-API addon")

public actual fun semPost(sem: SemT?): CInt =
    throw UnsupportedOperationException("semPost requires N-API addon")

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue requires N-API addon")

