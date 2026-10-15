// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun getoptLong(argc: Int, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: Int?): Int
