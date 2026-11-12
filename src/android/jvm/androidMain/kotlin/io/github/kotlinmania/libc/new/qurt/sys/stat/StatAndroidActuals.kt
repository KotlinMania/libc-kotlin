@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.sys.stat

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.Stat
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

public actual fun stat(pathname: ConstPtr<CChar>, statbuf: MutPtr<Stat>): CInt =
    NewQurtSysStatJniBridge.libcNewQurtSysStatStat(pathname.rawAddress, statbuf.rawAddress)

public actual fun fstat(fd: CInt, statbuf: MutPtr<Stat>): CInt =
    NewQurtSysStatJniBridge.libcNewQurtSysStatFstat(fd, statbuf.rawAddress)
