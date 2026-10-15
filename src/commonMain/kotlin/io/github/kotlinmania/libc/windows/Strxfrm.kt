// port-lint: source windows/mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun strxfrm(s: String?, ct: String?, n: ULong): ULong
