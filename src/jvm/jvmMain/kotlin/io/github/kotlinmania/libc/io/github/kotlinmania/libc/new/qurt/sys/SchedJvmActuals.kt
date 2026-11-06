package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.COpaquePointer

internal object SchedRawLibc {
    external fun schedYield(): Int
    external fun schedGetPriorityMax(policy: Int): Int
    external fun schedGetPriorityMin(policy: Int): Int
}

public actual fun schedYield(): CInt =
    SchedRawLibc.schedYield()

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    SchedRawLibc.schedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    SchedRawLibc.schedGetPriorityMin(policy)
