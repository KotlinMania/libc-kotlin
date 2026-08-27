// port-lint: source libc/src/new/qurt/semaphore.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt = -1

public fun semDestroy(sem: SemT?): CInt = -1

public fun semWait(sem: SemT?): CInt = -1

public fun semTrywait(sem: SemT?): CInt = -1

public fun semPost(sem: SemT?): CInt = -1

public fun semGetvalue(sem: SemT?, sval: CInt?): CInt = -1
