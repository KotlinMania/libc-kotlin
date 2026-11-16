@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.aix.powerpc64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong

// The host must provide the C companion wrapper exports in import module libc.
@kotlin.wasm.WasmImport("libc", "libcUnixAixPowerpc64Getsystemcfg")
private external fun wasiLibcUnixAixPowerpc64Getsystemcfg(label: Int): Long

public actual fun getsystemcfg(label: CInt): CUlong =
    wasiLibcUnixAixPowerpc64Getsystemcfg(label).toULong()
