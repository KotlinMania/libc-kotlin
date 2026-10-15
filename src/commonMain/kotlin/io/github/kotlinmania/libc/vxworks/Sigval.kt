// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

// C union; only one variant is valid at a time.
public data class Sigval(
    val sivalInt: Int? = null,
    val sivalPtr: COpaquePointer? = null,
)
