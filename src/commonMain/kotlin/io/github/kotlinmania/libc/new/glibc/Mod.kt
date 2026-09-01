// port-lint: source new/glibc/mod.rs
package io.github.kotlinmania.libc.new.glibc

/**
 * Module wiring for `new/glibc` (no definitions of its own; selects and re-exports submodules).
 *
 * GNU libc.
 *
 * * Headers: <https://sourceware.org/git/?p=glibc.git> (official)
 * * Headers: <https://github.com/bminor/glibc> (mirror)
 *
 * This module structure is modeled after glibc's source tree. Its build system selects headers
 * from different locations based on the platform, which we mimic here with reexports.
 *
 * Submodules: nptl, posix, sysdeps, unistd, unix.
 */
