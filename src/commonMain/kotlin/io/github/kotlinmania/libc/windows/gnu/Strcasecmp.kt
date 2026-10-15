// port-lint: source windows/gnu/mod.rs
package io.github.kotlinmania.libc.windows.gnu

import io.github.kotlinmania.libc.*

public expect fun strcasecmp(s1: String?, s2: String?): Int
