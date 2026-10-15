// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun waitid(idtype: UInt, id: UInt, infop: SiginfoT?, options: Int): Int
