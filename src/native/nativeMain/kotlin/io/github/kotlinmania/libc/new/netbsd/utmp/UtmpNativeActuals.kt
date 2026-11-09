@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.utmp

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.toLong

public actual fun utmpname(file: String?): CInt =
    io.github.kotlinmania.libc.new.netbsd.utmp.cinterop.libc_new_netbsd_utmp_utmpname(file)

public actual fun setutent() {
    io.github.kotlinmania.libc.new.netbsd.utmp.cinterop.libc_new_netbsd_utmp_setutent()
}

public actual fun getutent(): COpaquePointer? =
    io.github.kotlinmania.libc.new.netbsd.utmp.cinterop.libc_new_netbsd_utmp_getutent()?.let { COpaquePointer(it.toLong()) }

public actual fun endutent() {
    io.github.kotlinmania.libc.new.netbsd.utmp.cinterop.libc_new_netbsd_utmp_endutent()
}
