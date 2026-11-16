@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.unix.cinterop.libcUnixAtexit
import io.github.kotlinmania.libc.unix.dlsym
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class AndroidBionicNativeTest {
    @Test
    fun bionicNativeSyscallsMacrosAndAliasesWork() {
        verifyAndroidBionicFfi()
    }

    @Test
    fun bionicNativeAtexitRegistersValidCFunctionViaCrtbegin() {
        val tzsetPtr =
            withCString("tzset") { sym ->
                dlsym(MutPtr(0L), sym)
            }
        assertFalse(tzsetPtr.isNull())
        assertEquals(0, libcUnixAtexit(tzsetPtr.rawAddress.toCPointer<ByteVar>()))
    }
}
