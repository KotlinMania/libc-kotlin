// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

// Preserve the existing limitation: the Windows C runtime has no Unix fcntl API.
public actual fun fcntl(fd: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("fcntl is unavailable in the Windows C runtime")
