@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.new.qurt.sys.sched

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt

// The host must provide the C companion wrapper exports in import module libc.
@kotlin.wasm.WasmImport("libc", "libcNewQurtSysSchedSchedYield")
private external fun wasiLibcNewQurtSysSchedSchedYield(): Int

public actual fun schedYield(): CInt =
    wasiLibcNewQurtSysSchedSchedYield().toInt()

@kotlin.wasm.WasmImport("libc", "libcNewQurtSysSchedSchedGetPriorityMax")
private external fun wasiLibcNewQurtSysSchedSchedGetPriorityMax(policy: Int): Int

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    wasiLibcNewQurtSysSchedSchedGetPriorityMax(policy).toInt()

@kotlin.wasm.WasmImport("libc", "libcNewQurtSysSchedSchedGetPriorityMin")
private external fun wasiLibcNewQurtSysSchedSchedGetPriorityMin(policy: Int): Int

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    wasiLibcNewQurtSysSchedSchedGetPriorityMin(policy).toInt()
