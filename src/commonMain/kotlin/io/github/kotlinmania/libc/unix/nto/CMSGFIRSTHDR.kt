// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cmsgFirstHdr(mhdr: Msghdr?): Cmsghdr?
