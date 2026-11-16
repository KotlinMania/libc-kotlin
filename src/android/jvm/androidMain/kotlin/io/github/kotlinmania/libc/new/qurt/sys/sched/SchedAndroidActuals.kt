@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.sys.sched

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt

private object NewQurtSysSchedJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewQurtSysSchedSchedYield(): Int

    @JvmStatic
    external fun libcNewQurtSysSchedSchedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libcNewQurtSysSchedSchedGetPriorityMin(policy: Int): Int
}

public actual fun schedYield(): CInt =
    NewQurtSysSchedJniBridge.libcNewQurtSysSchedSchedYield()

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    NewQurtSysSchedJniBridge.libcNewQurtSysSchedSchedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    NewQurtSysSchedJniBridge.libcNewQurtSysSchedSchedGetPriorityMin(policy)
