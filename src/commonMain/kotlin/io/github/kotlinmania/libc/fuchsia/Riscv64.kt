// port-lint: source libc/src/fuchsia/riscv64.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public typealias Stat64T = Stat

public const val MINSIGSTKSZ: ULong = 6144uL
public const val SIGSTKSZ: ULong = 12288uL
