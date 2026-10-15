// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class ThreadAttr(
    val flags: Int,
    val stacksize: ULong,
    val stackaddr: COpaquePointer?,
    val exitfunc: ((COpaquePointer?) -> Unit)?,
    val policy: Int,
    val param: SchedParam,
    val guardsize: UInt,
    val prealloc: UInt,
    val spare: IntArray,
)
