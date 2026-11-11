@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.fcntl

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.ModeT
import io.github.kotlinmania.libc.new.qurt.fcntl.cinterop.libc_new_qurt_fcntl_creat
import io.github.kotlinmania.libc.new.qurt.fcntl.cinterop.libc_new_qurt_fcntl_fcntl
import io.github.kotlinmania.libc.new.qurt.fcntl.cinterop.libc_new_qurt_fcntl_open

public actual fun open(pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    libc_new_qurt_fcntl_open(pathname, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(pathname: String?, mode: ModeT): CInt =
    libc_new_qurt_fcntl_creat(pathname, mode)

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libc_new_qurt_fcntl_fcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
