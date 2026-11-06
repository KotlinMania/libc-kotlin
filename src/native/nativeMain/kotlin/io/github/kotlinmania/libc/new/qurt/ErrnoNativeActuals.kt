@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.toLong

public actual fun errnoLocation(): CInt? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_errno_errno_location()?.let { COpaquePointer(it.toLong()) }
