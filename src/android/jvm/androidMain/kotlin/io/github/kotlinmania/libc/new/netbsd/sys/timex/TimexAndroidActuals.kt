@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.sys.timex

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewNetbsdSysTimexJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewNetbsdSysTimexNtpGettime(buf: Long): Int

    @JvmStatic
    external fun libcNewNetbsdSysTimexNtpAdjtime(buf: Long): Int
}

public actual fun ntpGettime(buf: MutPtr): CInt =
    NewNetbsdSysTimexJniBridge.libcNewNetbsdSysTimexNtpGettime(buf.rawAddress)

public actual fun ntpAdjtime(buf: MutPtr): CInt =
    NewNetbsdSysTimexJniBridge.libcNewNetbsdSysTimexNtpAdjtime(buf.rawAddress)
