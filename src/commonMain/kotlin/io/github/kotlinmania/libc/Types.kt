// port-lint: source types.rs
package io.github.kotlinmania.libc

/**
 * Platform-agnostic support types.
 */

/**
 * A transparent wrapper that represents uninitialized padding while providing a default.
 *
 * In the upstream Rust this wraps `MaybeUninit<T>` so that the struct layout reserves space
 * for `T` without producing a meaningful value. Kotlin does not expose struct byte layout in
 * `commonMain`, so this port stores the same `T` slot without any uninit semantics; reads of
 * a defaulted [Padding] return whatever value `T`'s constructor or factory produced.
 */
public data class Padding<T>(public val value: T) {
    public companion object {
        /**
         * Const constructor for uninitialized padding in const contexts.
         *
         * The upstream comment notes this is intentionally `uninit()` rather than `zeroed()`
         * because padding is never meant to be read or written. In the Kotlin port the value
         * must exist, so the caller supplies one and reads should still be considered undefined.
         */
        public fun <T> uninit(value: T): Padding<T> = Padding(value)
    }
}

/**
 * The default repr type used for C style enums in Rust.
 *
 * In the upstream this resolves to [CInt] on MSVC and [CUInt] elsewhere. Kotlin `commonMain`
 * does not have configuration-gated type aliases; this port uses [CInt] uniformly.
 */
internal typealias CEnumRepr = CInt
