// port-lint: source new/qurt/semaphore.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.*

// Header: `semaphore.h`

public expect fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt

public expect fun semDestroy(sem: SemT?): CInt

public expect fun semWait(sem: SemT?): CInt

public expect fun semTrywait(sem: SemT?): CInt

public expect fun semPost(sem: SemT?): CInt

public expect fun semGetvalue(sem: SemT?, sval: CInt?): CInt
