// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple.b64

import io.github.kotlinmania.libc.*

public actual fun exchangedata(path1: String?, path2: String?, options: CUInt): CInt =
    throw UnsupportedOperationException("exchangedata not available on JVM — no C library access")

