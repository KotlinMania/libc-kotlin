@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.windows.msvc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.windows.SizeT

private object WindowsMsvcJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_windows_msvc_stricmp(s1: String?, s2: String?): Int

    @JvmStatic
    external fun libc_windows_msvc_strnicmp(s1: String?, s2: String?, n: Long): Int

    @JvmStatic
    external fun libc_windows_msvc_memccpy(dest: Long, src: Long, c: Int, count: Long): Long
}

public actual fun stricmp(s1: String?, s2: String?): CInt =
    WindowsMsvcJniBridge.libc_windows_msvc_stricmp(s1, s2)

public actual fun strnicmp(s1: String?, s2: String?, n: SizeT): CInt =
    WindowsMsvcJniBridge.libc_windows_msvc_strnicmp(s1, s2, n.toLong())

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, count: SizeT): COpaquePointer? =
    WindowsMsvcJniBridge.libc_windows_msvc_memccpy((dest?.value ?: 0L), (src?.value ?: 0L), c, count.toLong()).let { if (it == 0L) null else COpaquePointer(it) }
