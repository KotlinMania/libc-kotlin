// port-lint: source wasi/mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun strftime(a: String?, b: ULong, c: String?, d: Tm?): ULong
