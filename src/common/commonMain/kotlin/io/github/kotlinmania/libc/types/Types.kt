// port-lint: source types.rs
package io.github.kotlinmania.libc.types

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt

// Platform-agnostic support types.

// This is restricted to `Copy` types since that's a loose indicator that zeros is actually
// a valid bitpattern. There is no technical reason this is required, though, so it could be
// lifted in the future if it becomes a problem.
/**
 * A transparent wrapper over `MaybeUninit<T>` to represent uninitialized padding
 * while providing `Default`.
 */
internal class Padding<T>(public var value: T? = null) {
    public var field0: T?
        get() = value
        set(v) { value = v }

    public fun fmt(f: StringBuilder) {
        // Taken frmo `MaybeUninit`s debug implementation
        // NB: there is no `.padFmt` so we can't use a simpler `formatArgs("Padding<{..}>").
        val fullName = "Padding"
        val prefixLen = (fullName.indexOf("Padding").takeIf { it >= 0 })!!
        f.append(fullName.substring(prefixLen))
    }

    /**
     * Do nothing when hashing to ignore the existence of padding fields.
     */
    public override fun hashCode(): Int {
        var state = 0
        return state
    }

    /**
     * Padding fields are all equal, regardless of what is inside them, so they do not affect anything.
     */
    public fun eq(other: Padding<T>): Boolean {
        return true
    }

    /**
     * Mark that `Padding` implements `Eq` so that it can be used in types that implement it.
     */

    public companion object {
        // Note: Change this into zeroed() and use MaybeUninit::zeroed()
        // when we depend on rustc 1.75.0.
        /**
         * Const constructor for uninitialized padding in const contexts.
         */
        internal fun <T> uninit(): Padding<T> {
            // We can still safely use uninit here, since padding is something
            // that is not meant to be read or written anyways.
            return Padding(null)
        }
    }
}

/**
 * The default repr type used for C style enums in Rust.
 */
public typealias CEnumRepr = CInt
