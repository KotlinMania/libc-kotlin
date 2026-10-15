// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun strncasecmpL(string1: String?, string2: String?, length: ULong, locale: io.github.kotlinmania.libc.COpaquePointer?): Int
