// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean
