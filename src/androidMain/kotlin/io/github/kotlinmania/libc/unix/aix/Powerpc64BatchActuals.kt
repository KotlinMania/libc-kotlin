// port-lint: source Powerpc64.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public actual fun getsystemcfg(label: Int): ULong =
    throw UnsupportedOperationException("getsystemcfg not available on Android host — use androidNative target for FFI")
