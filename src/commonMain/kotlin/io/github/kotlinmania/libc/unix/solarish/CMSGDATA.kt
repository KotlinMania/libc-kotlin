package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cmsgData(cmsg: Cmsghdr?): COpaquePointer?
