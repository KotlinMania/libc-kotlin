// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun psetBind(pset: Int, idtype: UInt, id: Int, opset: Int?): Int
