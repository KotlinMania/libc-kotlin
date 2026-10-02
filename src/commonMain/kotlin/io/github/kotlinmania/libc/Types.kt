// port-lint: source types.rs
package io.github.kotlinmania.libc

/**
 * Platform-agnostic support types.
 */

/**
 * A transparent wrapper that represents uninitialized padding while providing a default.
 */
internal data class Padding<T>(
    val value: T,
) {
    companion object {
        /**
         * Const constructor for uninitialized padding in const contexts.
         */
        fun <T> uninit(value: T): Padding<T> = Padding(value)
    }
}

/**
 * The default repr type used for C style enums.
 */
public typealias CEnumRepr = CUInt
