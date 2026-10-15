// port-lint: source unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun querylocale(mask: Int, loc: io.github.kotlinmania.libc.COpaquePointer?): String?
