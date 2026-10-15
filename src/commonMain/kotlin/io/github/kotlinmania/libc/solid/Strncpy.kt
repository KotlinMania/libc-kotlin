// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun strncpy(arg1: String?, arg2: String?, arg3: ULong): String?
