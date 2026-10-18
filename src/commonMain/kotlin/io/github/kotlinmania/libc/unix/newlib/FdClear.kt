package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun fdClear(fd: Int, set: FdSet?)
