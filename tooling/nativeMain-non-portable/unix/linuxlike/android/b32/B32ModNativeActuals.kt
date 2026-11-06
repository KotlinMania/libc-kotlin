@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun timegm64(tm: Tm?): io.github.kotlinmania.libc.Time64T =
    io.github.kotlinmania.libc.unix.linuxlike.android.b32.cinterop.libc_b32_mod_timegm64(tm?.value?.toCPointer<ByteVar>())
