// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun strncasecmpL(string1: String?, string2: String?, length: ULong, locale: io.github.kotlinmania.libc.COpaquePointer?): Int
