// port-lint: source libc/src/new/mod.rs
package io.github.kotlinmania.libc.new

/**
 * Module wiring for `new` (no definitions of its own; selects and re-exports submodules).
 *
 * This module contains the future directory structure. If possible, new definitions should
 * get added here.
 *
 * Eventually everything should be moved over, and we will move this directory to the top
 * level in `src`.
 *
 * # Basic structure
 *
 * Each child module here represents a library or group of libraries that we are binding. Each of
 * these has several submodules, representing either a directory or a header file in that library.
 *
 * `#include`s turn into `pub use ...*;` statements. Then at the root level (here), we choose
 * which top-level headers we want to reexport the definitions for.
 *
 * All modules are only crate-public since we don't reexport this structure.
 *
 * Submodules: aix, apple, bionic_libc, common, cygwin, dragonfly, emscripten, espidf, freebsd, fuchsia, glibc, haiku, hermit_abi, horizon, hurd, illumos, l4re, linux_uapi, musl, netbsd, newlib, nto, nuttx, openbsd, qurt, redox, relibc, rtems, sgx, solaris, solid, teeos, trusty, uclibc, ucrt, vita, vxworks, wasi, xous.
 *
 * Re-exports (resolved by callers in the wiring pass):
 * - ...*
 * - emscripten::sched::*
 * - qurt::*
 * - musl::sched::*
 * - sys::socket::*
 * - linux::can::bcm::*
 * - linux::can::error::*
 * - linux::can::j1939::*
 * - linux::can::raw::*
 * - linux::can::*
 * - linux::keyctl::*
 * - linux::membarrier::*
 * - linux::netlink::*
 * - net::route::*
 * - pthread::*
 * - pthread_::introspection::*
 * - pthread_::pthread_spis::*
 * - pthread_::spawn::*
 * - pthread_::stack_np::*
 * - signal::*
 * - net::if_::*
 * - sys::ipc::*
 * - sys::statvfs::*
 * - sys::time::*
 * - sys::timex::*
 * - sys::types::*
 * - utmp_::*
 * - utmpx_::*
 * - sys::ipc::*
 * - net::bpf::*
 * - net::if_::*
 * - sys::socket::*
 * - pthread::*
 * - unistd::*
 */
