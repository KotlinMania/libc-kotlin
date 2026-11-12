@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Tm
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun timegm64(tm: ConstPtr<Tm>): Time64T =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAndroidB32Timegm64")
