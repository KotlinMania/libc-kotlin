@file:OptIn(kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc

import kotlin.wasm.WasmImport

@WasmImport("kotlinmania_macro_fixture", "value")
private external fun cLayoutValue(index: Int): Long

internal actual fun macroLayoutValue(index: Int): ULong = cLayoutValue(index).toULong()
