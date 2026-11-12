@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.errno

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewQurtErrnoJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewQurtErrnoErrnoLocation(): Long
}

public actual fun errnoLocation(): MutPtr<CInt> =
    MutPtr(NewQurtErrnoJniBridge.libcNewQurtErrnoErrnoLocation())
