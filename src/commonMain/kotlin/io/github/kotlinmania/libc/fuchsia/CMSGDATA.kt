// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
// These take raw pointers (COpaquePointer) to C structs in a message buffer,
// matching the Rust signatures which use *const msghdr / *const cmsghdr.
public expect fun cMSGDATA(cmsg: COpaquePointer?): COpaquePointer?
