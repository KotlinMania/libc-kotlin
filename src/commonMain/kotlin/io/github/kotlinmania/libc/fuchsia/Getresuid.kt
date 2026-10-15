// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun getresuid(ruid: UInt?, euid: UInt?, suid: UInt?): Int
