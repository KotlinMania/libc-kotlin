@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.semaphore

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    0

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    0

public actual fun semWait(sem: COpaquePointer?): CInt =
    0

public actual fun semTrywait(sem: COpaquePointer?): CInt =
    0

public actual fun semPost(sem: COpaquePointer?): CInt =
    0

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    0
