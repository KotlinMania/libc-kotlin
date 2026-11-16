// port-lint: source types.rs
package io.github.kotlinmania.libc

import io.github.kotlinmania.fmt.Formatter
import io.github.kotlinmania.fmt.Result

// Platform-agnostic support types.

// This is restricted to `Copy` types since that's a loose indicator that zeros is actually
// a valid bitpattern. There is no technical reason this is required, though, so it could be
// lifted in the future if it becomes a problem.
/**
 * A transparent wrapper over `MaybeUninit<T>` to represent uninitialized padding
 * while providing `Default`.
 */
internal open class Padding<T>(public var value: T?) {
    public var field0: T?
        get() = value
        set(v) { value = v }

    public open fun fmt(f: Formatter): Result {
        // Taken frmo `MaybeUninit`s debug implementation
        // NB: there is no `.padFmt` so we can't use a simpler `formatArgs("Padding<{..}>").
        val fullName = typeName<Padding<T>>()
        val prefixLen = (fullName.indexOf("Padding").takeIf { it >= 0 })!!
        return f.append(fullName[prefixLen until fullName.size])
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
    public open fun eq(other: Padding<T>): Boolean {
        return true
    }

    /**
     * Mark that `Padding` implements `Eq` so that it can be used in types that implement it.
     */

    public companion object {
        public fun <T> default(): Padding<T> {
            return Padding(null)
        }

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
internal typealias CEnumRepr = CInt
