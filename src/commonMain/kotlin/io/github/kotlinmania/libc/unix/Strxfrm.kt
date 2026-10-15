// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun strxfrm(s: COpaquePointer?, ct: String?, n: ULong): ULong
