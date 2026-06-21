// port-lint: source new/common/mod.rs
package io.github.kotlinmania.libc.new.common

/**
 * Module wiring for `new/common` (no definitions of its own; selects and re-exports submodules).
 *
 * Interfaces that are common across multiple platforms
 *
 * We make these available everywhere but each platform must opt in to reexporting.
 *
 * There shouldn't be any repeated definitions or complex configuration in this module. On
 * platforms that don't use common APIs it is fine to use `#[cfg(not(...))]`, but if a platform
 * needs a custom definition then it should be defined in the platform-specific module.
 *
 * The goal is that platforms need to opt in to the definitions here, so that worst case we have
 * an unused warning on untested platforms (rather than exposing incorrect API).
 *
 * Submodules: bsd, freebsd_like, linux_like, netbsd_like, posix, solarish.
 */
