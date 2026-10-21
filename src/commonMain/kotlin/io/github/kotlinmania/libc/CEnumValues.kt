// port-lint: source macros.rs
package io.github.kotlinmania.libc

/** Assigns the next discriminant, restarting after every explicit value. */
internal class CEnumValues<T : Any>(
    private val zero: T,
    private val successor: (T) -> T,
) {
    private var previous: T? = null

    fun variant(explicit: T? = null): T {
        val value = explicit ?: previous?.let(successor) ?: zero
        previous = value
        return value
    }
}

internal fun cEnumValues(): CEnumValues<UInt> =
    CEnumValues(0u) {
        check(it < UInt.MAX_VALUE) { "Enum discriminant overflow" }
        it + 1u
    }

internal fun cEnumUShortValues(): CEnumValues<UShort> =
    CEnumValues(0u.toUShort()) {
        check(it < UShort.MAX_VALUE) { "Enum discriminant overflow" }
        (it + 1u).toUShort()
    }

internal fun cEnumUByteValues(): CEnumValues<UByte> =
    CEnumValues(0u.toUByte()) {
        check(it < UByte.MAX_VALUE) { "Enum discriminant overflow" }
        (it + 1u).toUByte()
    }
