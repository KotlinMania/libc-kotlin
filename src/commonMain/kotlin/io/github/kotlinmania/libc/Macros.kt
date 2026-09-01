// port-lint: source macros.rs
package io.github.kotlinmania.libc

/**
 * Internal `macro_rules!` definitions used throughout the crate. These are Rust compile-time
 * code generators with no Kotlin runtime equivalent; the Kotlin port applies their effects
 * inline at each call site (per the transliteration rules), so this file documents what each
 * macro expands to rather than defining a runtime construct.
 *
 * - `cfg_if!`            - selects one of several branches by `cfg(...)`; rendered as Kotlin
 *                          source-set selection / prose at each use.
 * - `prelude!`           - injects the common imports (`c_void`, the `c_*` primitive aliases,
 *                          `Option`, pointer helpers) into a module.
 * - `s!`                 - declares C-layout structs deriving Copy/Clone (plus PartialEq etc.);
 *                          rendered as Kotlin `data class`.
 * - `s_paren!`           - like `s!` for tuple structs.
 * - `s_no_extra_traits!` - `s!` without the extra trait derives (used for structs with
 *                          arrays/unions); rendered as a plain `data class` / class.
 * - `extern_ty!`         - declares an opaque extern type; rendered as an empty `class`.
 * - `e!`                 - declares C-style enums as integer constants.
 * - `c_enum!`            - declares a closed integer enum (newtype over an integer) with
 *                          associated constants.
 * - `f!`                 - defines an inline (non-extern) helper function with a real body.
 * - `safe_f!`            - like `f!` but the function is safe to call.
 * - `deprecated_mach!`   - re-declares Mach constants with a deprecation notice.
 * - `offset_of!`         - computes a field offset within a struct.
 */
