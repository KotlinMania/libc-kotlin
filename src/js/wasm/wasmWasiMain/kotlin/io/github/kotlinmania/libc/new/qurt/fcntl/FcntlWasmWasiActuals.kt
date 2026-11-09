@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.fcntl

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.ModeT

public actual fun open(pathname: String?, flags: CInt): CInt =
    0

public actual fun creat(pathname: String?, mode: ModeT): CInt =
    0

public actual fun fcntl(fd: CInt, cmd: CInt): CInt =
    0
