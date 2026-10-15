// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class Utimbuf(
    val actime: Long,
    val modtime: Long,
)
