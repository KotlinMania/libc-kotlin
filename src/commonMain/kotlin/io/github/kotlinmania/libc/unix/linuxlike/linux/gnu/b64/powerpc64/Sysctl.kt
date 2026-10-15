// port-lint: source unix/linux_like/linux/gnu/b64/powerpc64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64

import io.github.kotlinmania.libc.*

public expect fun sysctl(name: Int?, namelen: Int, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int
