@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc

internal actual fun macroLayoutValue(index: Int): ULong = libc.cinterop.libc_macro_layout_value(index).toULong()
