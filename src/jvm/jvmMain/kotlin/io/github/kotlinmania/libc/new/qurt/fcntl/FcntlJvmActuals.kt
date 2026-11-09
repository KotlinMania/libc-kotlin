@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.fcntl

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.ModeT

private object NewQurtFcntlJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_qurt_fcntl_creat(pathname: String?, mode: Int): Int
}

public actual fun open(pathname: String?, flags: CInt): CInt =
    0

public actual fun creat(pathname: String?, mode: ModeT): CInt =
    NewQurtFcntlJniBridge.libc_new_qurt_fcntl_creat(pathname, mode.toInt())

public actual fun fcntl(fd: CInt, cmd: CInt): CInt =
    0
