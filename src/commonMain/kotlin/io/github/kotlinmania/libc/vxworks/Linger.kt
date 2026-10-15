// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class Linger(
    val lOnoff: Int,
    val lLinger: Int,
)
