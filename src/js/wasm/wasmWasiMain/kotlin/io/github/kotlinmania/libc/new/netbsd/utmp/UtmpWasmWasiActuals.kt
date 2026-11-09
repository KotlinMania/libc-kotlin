@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.utmp

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

public actual fun utmpname(file: String?): CInt =
    0

public actual fun setutent() {
}

public actual fun getutent(): COpaquePointer? =
    null

public actual fun endutent() {
}
