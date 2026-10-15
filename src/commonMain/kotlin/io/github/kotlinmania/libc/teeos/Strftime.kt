// port-lint: source teeos/mod.rs
package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun strftime(s: String?, sz: ULong, format: String?, tm: Tm?): ULong
