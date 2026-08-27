// port-lint: source libc/src/types.rs
package io.github.kotlinmania.libc

/**
 * Opaque C types used across the libc port.
 *
 * In the Rust upstream these are `*mut c_void` / `FILE` / `DIR` / `fpos_t` —
 * opaque pointers returned by the C standard library. The Kotlin port models
 * them as simple opaque classes so that function signatures match the C API
 * shape without requiring platform-specific kotlinx.cinterop definitions.
 */

/**
 * Opaque pointer to arbitrary C memory, equivalent to C's `void*`.
 * In kotlinx.cinterop this type exists natively; here it is modeled as an
 * opaque class with an optional address value so the same signatures compile
 * on all Kotlin targets.
 *
 * On JS/WASM, the [value] field holds the numeric pointer returned by the
 * N-API addon. On native targets using cinterop, this class is not used
 * (kotlinx.cinterop.COpaquePointer is used instead).
 */
public class COpaquePointer(
    public val value: Long = 0L,
)

/**
 * Opaque C stdio file handle (`FILE*` in C).
 * On JS/WASM, [handle] holds the numeric FILE pointer from N-API.
 */
public class FILE(
    public val handle: Int = -1,
)

/**
 * Opaque C directory stream handle (`DIR*` in C).
 */
public class DIR

/**
 * C file position type (`fpos_t` in C). Defined as a typealias where the
 * platform definition is a simple integer, or as a data class where the
 * platform defines a struct. This root declaration provides a default
 * opaque-Long representation that sub-packages may shadow with their own
 * `typealias FposT = ...` when they need a different width.
 */
public typealias FposT = Long
