@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.sys.sched

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.sys.sched.cinterop.libcNewQurtSysSchedSchedGetPriorityMax
import io.github.kotlinmania.libc.new.qurt.sys.sched.cinterop.libcNewQurtSysSchedSchedGetPriorityMin
import io.github.kotlinmania.libc.new.qurt.sys.sched.cinterop.libcNewQurtSysSchedSchedYield

public actual fun schedYield(): CInt =
    libcNewQurtSysSchedSchedYield()

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libcNewQurtSysSchedSchedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libcNewQurtSysSchedSchedGetPriorityMin(policy)
