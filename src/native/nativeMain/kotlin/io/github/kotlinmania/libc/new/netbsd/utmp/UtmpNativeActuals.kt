@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.utmp

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.netbsd.utmp.cinterop.libcNewNetbsdUtmpEndutent
import io.github.kotlinmania.libc.new.netbsd.utmp.cinterop.libcNewNetbsdUtmpGetutent
import io.github.kotlinmania.libc.new.netbsd.utmp.cinterop.libcNewNetbsdUtmpSetutent
import io.github.kotlinmania.libc.new.netbsd.utmp.cinterop.libcNewNetbsdUtmpUtmpname
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun utmpname(file: ConstPtr): CInt =
    libcNewNetbsdUtmpUtmpname(file.rawAddress.toCPointer<ByteVar>())

public actual fun setutent() {
    libcNewNetbsdUtmpSetutent()
}

public actual fun getutent(): MutPtr =
    MutPtr(libcNewNetbsdUtmpGetutent()?.toLong() ?: 0L)

public actual fun endutent() {
    libcNewNetbsdUtmpEndutent()
}
