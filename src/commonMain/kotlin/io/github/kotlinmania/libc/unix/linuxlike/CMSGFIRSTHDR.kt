// port-lint: source unix/linux_like/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cmsgFirstHdr(mhdr: Msghdr?): Cmsghdr?
