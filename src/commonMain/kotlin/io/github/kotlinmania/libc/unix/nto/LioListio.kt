// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun lioListio(mode: Int, list: COpaquePointer?, nent: Int, sig: Sigevent?): Int
