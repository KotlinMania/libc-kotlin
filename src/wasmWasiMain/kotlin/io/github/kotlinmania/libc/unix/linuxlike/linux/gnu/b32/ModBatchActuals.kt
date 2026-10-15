// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32

import io.github.kotlinmania.libc.*

public actual fun sysctl(name: Int?, namelen: Int, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctl not available on WASI — no C library access")
