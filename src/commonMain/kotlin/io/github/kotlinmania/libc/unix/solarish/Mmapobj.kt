// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun mmapobj(fd: Int, flags: UInt, storage: MmapobjResultT?, elements: UInt?, arg: COpaquePointer?): Int
