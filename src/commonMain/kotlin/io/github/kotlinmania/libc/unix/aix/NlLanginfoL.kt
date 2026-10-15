// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun nlLanginfoL(item: Int, loc: io.github.kotlinmania.libc.COpaquePointer?): String?
