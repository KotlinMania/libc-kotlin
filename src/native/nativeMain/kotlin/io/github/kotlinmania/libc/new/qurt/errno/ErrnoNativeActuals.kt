@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.errno

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.errno.cinterop.libc_new_qurt_errno_errnoLocation
import kotlinx.cinterop.toLong

public actual fun errnoLocation(): COpaquePointer? =
    libc_new_qurt_errno_errnoLocation()?.let { COpaquePointer(it.toLong()) }
