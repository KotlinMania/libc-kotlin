@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.toLong
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun utmpname(file: String?): CInt =
    libc.cinterop.libc_utmp_utmpname(file)

public actual fun setutent() {
    libc.cinterop.libc_utmp_setutent()
}

public actual fun getutent(): Utmp? =
    libc.cinterop.libc_utmp_getutent()?.let { COpaquePointer(it.toLong()) }

public actual fun endutent() {
    libc.cinterop.libc_utmp_endutent()
}
