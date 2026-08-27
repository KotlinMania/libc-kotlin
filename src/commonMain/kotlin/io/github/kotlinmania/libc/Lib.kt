// port-lint: source libc/src/lib.rs
package io.github.kotlinmania.libc

/**
 * Crate root: raw FFI bindings to platforms' system libraries.
 *
 * The upstream crate selects exactly one per-OS module at compile time via a
 * configuration ladder and re-exports its contents flat onto `libc::*`. Kotlin
 * `commonMain` cannot replicate compile-time module selection in one source set,
 * so this port keeps each OS module in its own sub-package. The dispatch table
 * below records which sub-package corresponds to which upstream target:
 *
 * - Windows targets: [io.github.kotlinmania.libc.windows]
 * - Fuchsia: [io.github.kotlinmania.libc.fuchsia]
 * - Switch: [io.github.kotlinmania.libc.switch]
 * - PSP: [io.github.kotlinmania.libc.psp]
 * - VxWorks: [io.github.kotlinmania.libc.vxworks]
 * - QURT: [io.github.kotlinmania.libc.qurt]
 * - SOLID (asp3): [io.github.kotlinmania.libc.solid]
 * - Unix family: [io.github.kotlinmania.libc.unix]
 * - Hermit: [io.github.kotlinmania.libc.hermit]
 * - TEEOS: [io.github.kotlinmania.libc.teeos]
 * - Trusty: [io.github.kotlinmania.libc.trusty]
 * - SGX (fortanix): [io.github.kotlinmania.libc.sgx]
 * - WASI: [io.github.kotlinmania.libc.wasi]
 * - Xous: [io.github.kotlinmania.libc.xous]
 *
 * The `new` sub-tree [io.github.kotlinmania.libc.new] mirrors the upstream
 * forward-looking layout that will eventually replace the per-OS modules above.
 *
 * Primitive C types ([CChar], [CInt], [CLong], etc.) live at the crate root in
 * [Primitives].
 */
