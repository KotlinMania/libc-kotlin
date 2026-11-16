// port-lint: source new/qurt/semaphore.rs
package io.github.kotlinmania.libc.new.qurt.semaphore

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `semaphore.h`

public expect fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt

public expect fun semDestroy(sem: MutPtr): CInt

public expect fun semWait(sem: MutPtr): CInt

public expect fun semTrywait(sem: MutPtr): CInt

public expect fun semPost(sem: MutPtr): CInt

public expect fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt
