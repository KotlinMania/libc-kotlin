// port-lint: source types.rs
package io.github.kotlinmania.libc

/**
 * Platform-agnostic support types.
 */

// Padding<T> upstream is a `MaybeUninit<T>` wrapper representing uninitialized
// struct padding. Kotlin has no equivalent for uninitialized memory, and the
// ported structs omit padding fields rather than model them, so it is not
// reproduced here.

/**
 * The default repr type used for C-style enums. This is `c_int` under MSVC and
 * `c_uint` everywhere else.
 */
public typealias CEnumRepr = CUInt
