@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.errno

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

private object NewQurtErrnoJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_qurt_errno_errnoLocation(): Long
}

public actual fun errnoLocation(): COpaquePointer? =
    NewQurtErrnoJniBridge.libc_new_qurt_errno_errnoLocation().let { if (it == 0L) null else COpaquePointer(it) }
