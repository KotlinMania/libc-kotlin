@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.fcntl

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.ModeT

public actual fun open(pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun creat(pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.new.qurt.fcntl.cinterop.libc_new_qurt_fcntl_creat(pathname, mode)

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    0
