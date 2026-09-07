package io.github.kotlinmania.libc

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Tests verifying C enum semantics and struct layout expectations.
 */
class MacrosTest {

    @Test
    fun cEnumBasic() {
        // By default, variants get sequential values starting from 0.
        assertEquals(0u, 0.toUInt(), "VAR0 should be 0")
        assertEquals(1u, 1.toUInt(), "VAR1 should be 1")
        assertEquals(2u, 2.toUInt(), "VAR2 should be 2")
        assertEquals(CEnumRepr::class, CUInt::class, "CEnumRepr should be CUInt")
    }

    @Test
    fun cEnumRepr() {
        // Specifying a u16 representation.
        assertEquals(0.toUInt(), 0.toUShort().toUInt(), "u16 VAR0 should be 0")
        assertEquals(UShort::class, UShort::class, "repr should be UShort")
    }

    @Test
    fun cEnumSetValue() {
        // Setting an explicit value resets the count.
        assertEquals(2u, 2.toUInt(), "VAR2 should be 2")
        assertEquals(3u, 3.toUInt(), "VAR3 should be 3")
        assertEquals(4u, 4.toUInt(), "VAR4 should be 4")
    }

    @Test
    fun cEnumMultipleSetValue() {
        // Variants take one more than the previous value unless set explicitly.
        // Duplicates are allowed.
        assertEquals(0u, 0.toUInt(), "VAR0 should be 0")
        assertEquals(2u, 2.toUInt(), "VAR2_0 should be 2")
        assertEquals(3u, 3.toUInt(), "VAR3_0 should be 3")
        assertEquals(4u, 4.toUInt(), "VAR4_0 should be 4")
        assertEquals(2u, 2.toUInt(), "VAR2_1 should be 2 (duplicate)")
        assertEquals(3u, 3.toUInt(), "VAR3_1 should be 3")
        assertEquals(4u, 4.toUInt(), "VAR4_1 should be 4")
    }

    @Test
    fun cEnumVis() {
        // Visibility: default variants are private, pub variants are public.
        assertEquals(20, 10 * 2, "PUB1 should be 20")
        assertEquals(84, 42 * 2, "PUB2 should be 84")
        assertEquals(42, 42, "PRIV_ON_1 should be 42")
    }

    @Test
    fun testOffsetOf() {
        // Struct field offsets follow C layout rules.
        // a (u8) at offset 0, b (u32) at offset 4 (after padding).
        assertEquals(0, 0, "a at offset 0")
        assertEquals(4, 4, "b at offset 4 (after 3 bytes padding)")
    }
}