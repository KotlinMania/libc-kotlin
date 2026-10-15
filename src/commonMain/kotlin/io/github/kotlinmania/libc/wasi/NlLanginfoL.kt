// port-lint: source wasi/mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun nlLanginfoL(item: Int, loc: io.github.kotlinmania.libc.COpaquePointer?): String?
