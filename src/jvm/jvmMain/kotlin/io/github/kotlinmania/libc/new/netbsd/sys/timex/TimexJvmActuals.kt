@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.sys.timex

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

private object NewNetbsdSysTimexJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_netbsd_sys_timex_ntpGettime(buf: Long): Int

    @JvmStatic
    external fun libc_new_netbsd_sys_timex_ntpAdjtime(buf: Long): Int
}

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    NewNetbsdSysTimexJniBridge.libc_new_netbsd_sys_timex_ntpGettime((buf?.value ?: 0L))

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    NewNetbsdSysTimexJniBridge.libc_new_netbsd_sys_timex_ntpAdjtime((buf?.value ?: 0L))
