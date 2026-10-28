@file:OptIn(kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.unix.clearerr
import io.github.kotlinmania.libc.unix.fclose
import io.github.kotlinmania.libc.unix.feof
import io.github.kotlinmania.libc.unix.ferror
import io.github.kotlinmania.libc.unix.fgetc
import io.github.kotlinmania.libc.unix.fgets
import io.github.kotlinmania.libc.unix.fopen
import io.github.kotlinmania.libc.unix.fputs
import io.github.kotlinmania.libc.unix.lastErrorNumber
import io.github.kotlinmania.libc.unix.remove
import io.github.kotlinmania.libc.unix.rename
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue
import kotlin.wasm.WasmExport

@WasmExport("verifyLibcPreopenedFiles")
fun verifyLibcPreopenedFiles(): Int {
    val fixture = assertNotNull(fopen("/sandbox/fixture.txt", "r"))
    try {
        assertEquals("host-created\n", fgets(null, 128, fixture))
        assertEquals(-1, fgetc(fixture))
        assertEquals(1, feof(fixture))
        assertEquals(0, ferror(fixture))
        clearerr(fixture)
        assertEquals(0, feof(fixture))
    } finally {
        assertEquals(0, fclose(fixture))
    }
    val created = assertNotNull(fopen("/sandbox/created.txt", "w"))
    try {
        assertTrue(fputs("Kotlin capability IO\n", created) >= 0)
    } finally {
        assertEquals(0, fclose(created))
    }
    assertEquals(0, rename("/sandbox/created.txt", "/sandbox/renamed.txt"))
    val reader = assertNotNull(fopen("/sandbox/renamed.txt", "r"))
    try {
        assertEquals("Kotlin capability IO\n", fgets(null, 128, reader))
        assertEquals(-1, fputs("must fail", reader))
        assertEquals(1, ferror(reader))
        assertTrue(lastErrorNumber() != 0)
        clearerr(reader)
        assertEquals(0, ferror(reader))
    } finally {
        assertEquals(0, fclose(reader))
    }
    val disposable = assertNotNull(fopen("/sandbox/delete.txt", "w"))
    assertEquals(0, fclose(disposable))
    assertEquals(0, remove("/sandbox/delete.txt"))
    assertNull(fopen("/sandbox/delete.txt", "r"))
    assertEquals(44, lastErrorNumber())
    assertNull(fopen("/outside/no-capability.txt", "w"))
    assertEquals(76, lastErrorNumber())
    return 1
}
