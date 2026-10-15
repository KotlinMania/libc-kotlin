// port-lint: source unix/bsd/apple/b32/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple.b32

import io.github.kotlinmania.libc.*

public expect fun exchangedata(path1: String?, path2: String?, options: ULong): Int
