// port-lint: source unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun pthreadBarrierDestroy(barrier: io.github.kotlinmania.libc.COpaquePointer?): Int
