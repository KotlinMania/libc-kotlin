// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun taskCreate(targetTask: UInt, ledgers: UInt?, ledgersCnt: UInt, inheritMemory: Int, childTask: UInt?): Int
