@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.utmp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

private object NewNetbsdUtmpJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_netbsd_utmp_utmpname(file: String?): Int

    @JvmStatic
    external fun libc_new_netbsd_utmp_setutent()

    @JvmStatic
    external fun libc_new_netbsd_utmp_getutent(): Long

    @JvmStatic
    external fun libc_new_netbsd_utmp_endutent()
}

public actual fun utmpname(file: String?): CInt =
    NewNetbsdUtmpJniBridge.libc_new_netbsd_utmp_utmpname(file)

public actual fun setutent() {
    NewNetbsdUtmpJniBridge.libc_new_netbsd_utmp_setutent()
}

public actual fun getutent(): COpaquePointer? =
    NewNetbsdUtmpJniBridge.libc_new_netbsd_utmp_getutent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun endutent() {
    NewNetbsdUtmpJniBridge.libc_new_netbsd_utmp_endutent()
}
