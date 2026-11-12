@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.sys.stat

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewQurtSysStatJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewQurtSysStatStat(pathname: Long, statbuf: Long): Int

    @JvmStatic
    external fun libcNewQurtSysStatFstat(fd: Int, statbuf: Long): Int
}

public actual fun stat(pathname: ConstPtr, statbuf: MutPtr): CInt =
    NewQurtSysStatJniBridge.libcNewQurtSysStatStat(pathname.rawAddress, statbuf.rawAddress)

public actual fun fstat(fd: CInt, statbuf: MutPtr): CInt =
    NewQurtSysStatJniBridge.libcNewQurtSysStatFstat(fd, statbuf.rawAddress)
