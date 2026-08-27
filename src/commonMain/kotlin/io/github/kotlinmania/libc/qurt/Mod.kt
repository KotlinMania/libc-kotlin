// port-lint: source libc/src/qurt/mod.rs
package io.github.kotlinmania.libc.qurt

/**
 * Module wiring for `qurt` (no definitions of its own; selects and re-exports submodules).
 *
 * Interface to QuRT (Qualcomm Real-Time OS) C library
 *
 * This module re-exports items from the new module structure.
 * QuRT was introduced after the `src/new/` module structure was established,
 * so all definitions live in `src/new/qurt/` and are re-exported here
 * for compatibility with the existing libc structure.
 *
 * Re-exports (resolved by callers in the wiring pass):
 * - crate::new::qurt::*
 */
