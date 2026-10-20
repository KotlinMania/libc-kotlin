// port-lint: tests macros.rs
package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.macros.priv1.*
import io.github.kotlinmania.libc.macros.priv2.*
import kotlin.reflect.KClass
import kotlin.test.Test
import kotlin.test.assertEquals

class MacrosTest {
    @Test
    fun cEnumBasic() {
        val e = cEnumValues()
        val var0 = e.variant()
        val var1 = e.variant()
        val var2 = e.variant()
        val anon = cEnumValues()
        val anon0 = anon.variant()
        val anon1 = anon.variant()
        val anon2 = anon.variant()

        assertEquals(UInt::class, typeIdOfVal(var0))
        assertEquals(0u, var0)
        assertEquals(1u, var1)
        assertEquals(2u, var2)
        assertEquals(UInt::class, typeIdOfVal(anon0))
        assertEquals(0u, anon0)
        assertEquals(1u, anon1)
        assertEquals(2u, anon2)
    }

    @Test
    fun cEnumRepr() {
        val e = cEnumUShortValues()
        val var0 = e.variant()
        val anon = cEnumUShortValues()
        val anon0 = anon.variant()

        assertEquals(UShort::class, typeIdOfVal(var0))
        assertEquals(0u.toUShort(), var0)
        assertEquals(UShort::class, typeIdOfVal(anon0))
        assertEquals(0u.toUShort(), anon0)
    }

    @Test
    fun cEnumSetValue() {
        val e = cEnumValues()
        val var2 = e.variant(2u)
        val var3 = e.variant()
        val var4 = e.variant()

        assertEquals(2u, var2)
        assertEquals(3u, var3)
        assertEquals(4u, var4)
    }

    @Test
    fun cEnumMultipleSetValue() {
        val e = cEnumValues()
        val var0 = e.variant()
        val var20 = e.variant(2u)
        val var30 = e.variant()
        val var40 = e.variant()
        val var21 = e.variant(2u)
        val var31 = e.variant()
        val var41 = e.variant()

        assertEquals(0u, var0)
        assertEquals(2u, var20)
        assertEquals(3u, var30)
        assertEquals(4u, var40)
        assertEquals(2u, var21)
        assertEquals(3u, var31)
        assertEquals(4u, var41)
    }

    @Test
    fun cEnumVis() {
        assertEquals(E1::class, typeIdOfVal(pub1))
        assertEquals(E2::class, typeIdOfVal(pub2))
        assertEquals((10u * 2u).toUByte(), pub1)
        assertEquals((42u * 2u).toUShort(), pub2)
        assertEquals(42u.toUShort(), privOn1)
    }

    private fun <T : Any> typeIdOfVal(value: T): KClass<out T> = value::class

    @Test
    fun testOffsetOf() {
        // The fixture must retain the zero-sized, 128-byte-aligned nested field.
        assertEquals(0uL, macroLayoutValue(10))
        assertEquals(128uL, macroLayoutValue(11))
        val base = COpaquePointer(macroLayoutValue(0).toLong())
        val size = macroLayoutValue(5)
        for (field in 0..3) {
            assertEquals(
                macroLayoutValue(6 + field),
                offsetOf(base, COpaquePointer(macroLayoutValue(1 + field).toLong()), size),
            )
        }
    }
}
