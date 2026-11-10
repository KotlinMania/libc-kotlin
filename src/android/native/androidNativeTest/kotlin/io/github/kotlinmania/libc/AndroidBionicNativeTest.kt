@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.unix.cinterop.libc_unix_atexit
import io.github.kotlinmania.libc.unix.dlsym
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

class AndroidBionicNativeTest {
    @Test
    fun bionicNativeSyscallsMacrosAndAliasesWork() {
        verifyAndroidBionicFfi()
    }

    @Test
    fun bionicNativeAtexitRegistersValidCFunctionViaCrtbegin() {
        val tzsetPtr = assertNotNull(dlsym(null, "tzset"))
        assertEquals(0, libc_unix_atexit(tzsetPtr.value.toCPointer<ByteVar>()))
    }
}
