@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.utmp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewNetbsdUtmpJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewNetbsdUtmpUtmpname(file: Long): Int

    @JvmStatic
    external fun libcNewNetbsdUtmpSetutent()

    @JvmStatic
    external fun libcNewNetbsdUtmpGetutent(): Long

    @JvmStatic
    external fun libcNewNetbsdUtmpEndutent()
}

public actual fun utmpname(file: ConstPtr): CInt =
    NewNetbsdUtmpJniBridge.libcNewNetbsdUtmpUtmpname(file.rawAddress)

public actual fun setutent() {
    NewNetbsdUtmpJniBridge.libcNewNetbsdUtmpSetutent()
}

public actual fun getutent(): MutPtr =
    MutPtr(NewNetbsdUtmpJniBridge.libcNewNetbsdUtmpGetutent())

public actual fun endutent() {
    NewNetbsdUtmpJniBridge.libcNewNetbsdUtmpEndutent()
}
