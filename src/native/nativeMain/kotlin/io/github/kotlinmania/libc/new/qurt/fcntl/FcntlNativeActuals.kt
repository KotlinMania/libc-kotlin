@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.fcntl

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.ModeT
import io.github.kotlinmania.libc.new.qurt.fcntl.cinterop.libcNewQurtFcntlCreat
import io.github.kotlinmania.libc.new.qurt.fcntl.cinterop.libcNewQurtFcntlFcntl
import io.github.kotlinmania.libc.new.qurt.fcntl.cinterop.libcNewQurtFcntlOpen
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun open(pathname: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt =
    libcNewQurtFcntlOpen(pathname.rawAddress.toCPointer<ByteVar>(), flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(pathname: ConstPtr, mode: ModeT): CInt =
    libcNewQurtFcntlCreat(pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libcNewQurtFcntlFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
