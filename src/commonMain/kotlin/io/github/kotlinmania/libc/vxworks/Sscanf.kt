// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun sscanf(s: String?, format: String?, vararg args: Any?): Int
