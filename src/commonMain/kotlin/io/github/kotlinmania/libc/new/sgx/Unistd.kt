// port-lint: source new/sgx/unistd.rs
package io.github.kotlinmania.libc.new.sgx

/**
 * Header: `unistd.h`.
 *
 * The upstream Rust module re-exports `STDERR_FILENO`, `STDIN_FILENO`,
 * and `STDOUT_FILENO` from `crate::new::common::posix::unistd`. Per the
 * workspace porting rules, re-exports are not mirrored as Kotlin
 * `typealias`es; callers reference the constants directly through
 * [io.github.kotlinmania.libc.new.common.posix.STDIN_FILENO],
 * [io.github.kotlinmania.libc.new.common.posix.STDOUT_FILENO], and
 * [io.github.kotlinmania.libc.new.common.posix.STDERR_FILENO].
 */

// Callers migrated: (none yet — sgx surface is not in use within this crate)
