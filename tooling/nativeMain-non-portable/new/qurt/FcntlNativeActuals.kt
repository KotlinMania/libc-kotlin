@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

public actual fun creat(pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_fcntl_creat(pathname, mode)
