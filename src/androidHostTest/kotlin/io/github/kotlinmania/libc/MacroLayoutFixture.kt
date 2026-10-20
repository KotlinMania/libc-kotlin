package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.internal.LibcJni

internal object MacroLayoutBackend {
    init { LibcJni.getErrno() }
    external fun value(index: Int): Long
}

internal actual fun macroLayoutValue(index: Int): ULong = MacroLayoutBackend.value(index).toULong()
