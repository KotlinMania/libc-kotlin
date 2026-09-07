// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple.b32

import io.github.kotlinmania.libc.*

public actual fun exchangedata(path1: String?, path2: String?, options: CULong): CInt =
    throw UnsupportedOperationException("exchangedata not available on WASI — no C library access")

