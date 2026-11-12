@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.errno

import io.github.kotlinmania.libc.new.qurt.errno.cinterop.libcNewQurtErrnoErrnoLocation
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.toLong

public actual fun errnoLocation(): MutPtr =
    MutPtr(libcNewQurtErrnoErrnoLocation()?.toLong() ?: 0L)
