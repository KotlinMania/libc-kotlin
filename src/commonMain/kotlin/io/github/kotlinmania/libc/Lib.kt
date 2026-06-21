// port-lint: source lib.rs
package io.github.kotlinmania.libc

/**
 * libc - Raw FFI bindings to platforms' system libraries.
 *
 * This is the crate root. In Rust it performs no definitions of its own beyond re-exporting
 * `core::ffi::c_void` and the `new` module, then a `cfg_if!` chain selects exactly one platform
 * module per target and re-exports its contents (`pub use ...::*`). Those re-exports are the
 * crate's public surface; in the Kotlin port each platform module keeps its own package and
 * callers reference symbols directly, so this file records the target -> module wiring rather
 * than re-exporting (the "what does what" wiring pass resolves the per-source-set selection).
 *
 * Always re-exported: `core::ffi::c_void`, `new::*`.
 *
 * Target -> platform module (each also pulls in `primitives` and invokes `prelude!()`):
 * - windows                         -> windows
 * - target_os = "fuchsia"           -> fuchsia
 * - target_os = "switch"            -> switch
 * - target_os = "psp"               -> psp
 * - target_os = "vxworks"           -> vxworks
 * - target_os = "qurt"              -> qurt
 * - target_os = "solid_asp3"        -> solid
 * - unix                            -> unix
 * - target_os = "hermit"            -> hermit
 * - target_os = "teeos"             -> teeos
 * - target_os = "trusty"            -> trusty
 * - target_env = "sgx" (fortanix)   -> sgx
 * - target_env/os = "wasi"          -> wasi
 * - target_os = "xous"              -> xous
 * - otherwise                       -> empty (unsupported target)
 */
