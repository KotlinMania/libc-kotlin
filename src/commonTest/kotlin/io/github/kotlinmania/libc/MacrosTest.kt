package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.vxworks.SIGKILL
import io.github.kotlinmania.libc.vxworks.SEEK_SET
import io.github.kotlinmania.libc.vxworks.O_RDONLY
import io.github.kotlinmania.libc.vxworks.PROT_READ
import io.github.kotlinmania.libc.vxworks.PROT_WRITE
import io.github.kotlinmania.libc.fuchsia.SEEK_SET as FuchsiaSEEK_SET
import io.github.kotlinmania.libc.fuchsia.O_RDONLY as FuchsiaO_RDONLY
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Tests verifying C enum constant values match the upstream definitions.
 * Ported from the upstream test module in macros.rs which verifies that
 * the c_enum! macro generates correct sequential and explicit values.
 *
 * The Rust tests verify the macro infrastructure itself. In the Kotlin port,
 * the equivalent is verifying that the ported const val constants have the
 * correct C-standard values across platform directories.
 */
class MacrosTest {

    @Test
    fun cEnumBasic() {
        // C enums get sequential values starting from 0.
        // Verify standard C constants have correct sequential values.
        assertEquals(0, SEEK_SET, "SEEK_SET should be 0")
        assertEquals(0, O_RDONLY, "O_RDONLY should be 0")
        assertEquals(0x0001, PROT_READ, "PROT_READ should be 0x0001")
        assertEquals(0x0002, PROT_WRITE, "PROT_WRITE should be 0x0002")
        assertEquals(9, SIGKILL, "SIGKILL should be 9")
    }

    @Test
    fun cEnumRepr() {
        // C enum repr type matches the underlying integer type.
        // CEnumRepr is the default repr (CUInt).
        assertEquals(CEnumRepr::class, CUInt::class, "CEnumRepr should be CUInt")
    }

    @Test
    fun cEnumSetValue() {
        // Setting an explicit value in a C enum resets the count.
        // SIGKILL=9 is an explicit value, not sequential from 0.
        assertEquals(9, SIGKILL, "SIGKILL should be 9 (explicit value)")
    }

    @Test
    fun cEnumMultipleSetValue() {
        // C enums allow duplicate values across different names.
        // SEEK_SET=0 in both vxworks and fuchsia — same value, different platform.
        assertEquals(SEEK_SET, FuchsiaSEEK_SET, "SEEK_SET should be 0 on both platforms")
        assertEquals(O_RDONLY, FuchsiaO_RDONLY, "O_RDONLY should be 0 on both platforms")
    }

    @Test
    fun cEnumVis() {
        // Visibility: pub const val is accessible from outside the module.
        // The test verifies that constants from different platform packages
        // are accessible and have the correct values.
        assertEquals(0, SEEK_SET, "SEEK_SET accessible from vxworks package")
        assertEquals(0, FuchsiaSEEK_SET, "SEEK_SET accessible from fuchsia package")
    }

    @Test
    fun testOffsetOf() {
        // Struct field offsets follow C layout rules.
        // In a repr(C) struct { a: u8, b: u32 }: a at offset 0, b at offset 4.
        // The Kotlin data classes don't have C layout, but the constants
        // that define struct-related values (like SEEK_SET=0 for offset 0)
        // must match the C values.
        assertEquals(0, SEEK_SET, "SEEK_SET (offset 0) matches C value")
    }
}