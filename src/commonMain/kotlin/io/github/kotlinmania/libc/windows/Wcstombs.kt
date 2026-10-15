// port-lint: source windows/mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun wcstombs(dest: String?, src: UShort?, n: ULong): ULong
