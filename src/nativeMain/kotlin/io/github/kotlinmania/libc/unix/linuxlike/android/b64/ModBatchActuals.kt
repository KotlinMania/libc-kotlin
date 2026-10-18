@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b64
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun accept4(fd: Int, addr: Sockaddr?, len: UInt?, flg: Int): Int =
    throw UnsupportedOperationException("accept4 requires manual FFI bridge — not yet implemented")
