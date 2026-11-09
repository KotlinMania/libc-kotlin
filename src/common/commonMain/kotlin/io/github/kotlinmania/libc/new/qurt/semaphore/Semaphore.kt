// port-lint: source new/qurt/semaphore.rs
package io.github.kotlinmania.libc.new.qurt.semaphore

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint

// Header: `semaphore.h`

public expect fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt

public expect fun semDestroy(sem: COpaquePointer?): CInt

public expect fun semWait(sem: COpaquePointer?): CInt

public expect fun semTrywait(sem: COpaquePointer?): CInt

public expect fun semPost(sem: COpaquePointer?): CInt

public expect fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt
