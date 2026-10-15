// port-lint: source new/qurt/semaphore.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public expect fun semInit(sem: UInt?, pshared: Int, value: UInt): Int

public expect fun semDestroy(sem: UInt?): Int

public expect fun semWait(sem: UInt?): Int

public expect fun semTrywait(sem: UInt?): Int

public expect fun semPost(sem: UInt?): Int

public expect fun semGetvalue(sem: UInt?, sval: Int?): Int
