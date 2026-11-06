@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.toLong
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun utmpname(file: String?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_utmp_utmpname(file)

public actual fun setutent() {
    io.github.kotlinmania.libc.cinterop.libc_utmp_setutent()
}

public actual fun getutent(): Utmp? =
    io.github.kotlinmania.libc.cinterop.libc_utmp_getutent()?.let { COpaquePointer(it.toLong()) }

public actual fun endutent() {
    io.github.kotlinmania.libc.cinterop.libc_utmp_endutent()
}
