// port-lint: source Arm.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b32
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun accept4(fd: Int, addr: Sockaddr?, len: Int?, flg: Int): Int =
    throw UnsupportedOperationException("accept4 requires manual FFI bridge — not yet implemented")
