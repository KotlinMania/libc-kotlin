// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun nlLanginfoL(item: Int, locale: io.github.kotlinmania.libc.COpaquePointer?): String?
