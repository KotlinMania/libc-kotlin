// port-lint: source new/common/posix/mod.rs
package io.github.kotlinmania.libc.new.common.posix

/**
 * POSIX APIs that are used by a number of platforms.
 *
 * These can be found at:
 * [The Open Group Base Specifications](https://pubs.opengroup.org/onlinepubs/9699919799/basedefs/contents.html).
 *
 * Upstream module declarations:
 *
 *   - `pthread` (gated on Android / emscripten / l4re / Linux / qurt / Apple) — not yet ported.
 *   - `unistd` — see [Unistd.kt][Unistd] for the POSIX file-descriptor constants.
 *
 * The Rust crate gates `pthread` behind `#[cfg(any(target_os = ...))]` so it
 * only ever compiles for the platforms in that list. Kotlin Multiplatform
 * cannot express the same gate from `commonMain`; the Kotlin port of
 * `pthread.rs` therefore lives behind an `expect`/`actual` boundary instead,
 * and the per-platform actuals will land alongside their target source sets
 * when the pthread surface is ported.
 */
