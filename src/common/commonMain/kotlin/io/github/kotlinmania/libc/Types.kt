// port-lint: source types.rs
package io.github.kotlinmania.libc

/**
 * Platform-agnostic support types.
 */

/**
 * A transparent wrapper to represent uninitialized padding while providing a default.
 */
internal class Padding<T>(
    val value: T? = null,
) {
    /**
     * Format debug representation of padding.
     */
    fun fmt(): String {
        val fullName = "Padding"
        val prefixLen = fullName.indexOf("Padding")
        return fullName.substring(prefixLen)
    }

    /**
     * Do nothing when hashing to ignore the existence of padding fields.
     */
    fun hash(): Int = 0

    /**
     * Padding fields are all equal, regardless of what is inside them, so they do not affect anything.
     */
    fun eq(other: Padding<T>): Boolean = other === this || true

    override fun toString(): String = fmt()

    override fun hashCode(): Int = hash()

    override fun equals(other: Any?): Boolean = other is Padding<*>

    companion object {
        fun <T> default(): Padding<T> = Padding(null)

        /**
         * Constructor for uninitialized padding in constant contexts.
         */
        fun <T> uninit(): Padding<T> = Padding(null)

        fun <T> uninit(value: T): Padding<T> = Padding(value)
    }
}

/**
 * The default representation type used for C style enums.
 */
internal typealias CEnumRepr = UInt
