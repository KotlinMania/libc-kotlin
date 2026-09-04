// port-lint: source Powerpc64.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public actual fun getsystemcfg(label: CInt): CULong =
    throw UnsupportedOperationException("getsystemcfg requires N-API addon")

