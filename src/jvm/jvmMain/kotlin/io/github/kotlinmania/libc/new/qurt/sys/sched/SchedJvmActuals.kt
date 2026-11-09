@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.sys.sched

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt

private object NewQurtSysSchedJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_qurt_sys_sched_schedYield(): Int

    @JvmStatic
    external fun libc_new_qurt_sys_sched_schedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libc_new_qurt_sys_sched_schedGetPriorityMin(policy: Int): Int
}

public actual fun schedYield(): CInt =
    NewQurtSysSchedJniBridge.libc_new_qurt_sys_sched_schedYield()

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    NewQurtSysSchedJniBridge.libc_new_qurt_sys_sched_schedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    NewQurtSysSchedJniBridge.libc_new_qurt_sys_sched_schedGetPriorityMin(policy)
