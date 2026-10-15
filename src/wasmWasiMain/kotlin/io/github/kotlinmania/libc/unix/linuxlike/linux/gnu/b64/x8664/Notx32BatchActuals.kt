// port-lint: source NotX32.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*

public actual fun sysctl(name: Int?, namelen: Int, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctl not available on WASI — no C library access")
