@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun timegm64(tm: COpaquePointer?): Time64T =
    io.github.kotlinmania.libc.unix.linuxlike.android.b32.cinterop.libc_unix_linuxlike_android_b32_timegm64(tm?.value?.toCPointer<ByteVar>())
