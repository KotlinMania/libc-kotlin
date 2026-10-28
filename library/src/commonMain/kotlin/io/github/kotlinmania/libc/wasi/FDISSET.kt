package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun fdIsSet(fd: Int, set: FdSet?): Boolean
