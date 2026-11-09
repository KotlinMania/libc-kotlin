@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.sys.stat

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

private object NewQurtSysStatJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_qurt_sys_stat_stat(pathname: String?, statbuf: Long): Int

    @JvmStatic
    external fun libc_new_qurt_sys_stat_fstat(fd: Int, statbuf: Long): Int
}

public actual fun stat(pathname: String?, statbuf: COpaquePointer?): CInt =
    NewQurtSysStatJniBridge.libc_new_qurt_sys_stat_stat(pathname, (statbuf?.value ?: 0L))

public actual fun fstat(fd: CInt, statbuf: COpaquePointer?): CInt =
    NewQurtSysStatJniBridge.libc_new_qurt_sys_stat_fstat(fd, (statbuf?.value ?: 0L))
