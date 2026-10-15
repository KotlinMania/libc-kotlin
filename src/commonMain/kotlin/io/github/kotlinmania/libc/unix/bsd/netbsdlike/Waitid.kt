// port-lint: source unix/bsd/netbsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public expect fun waitid(idtype: Int, id: UInt, infop: SiginfoT?, options: Int): Int
