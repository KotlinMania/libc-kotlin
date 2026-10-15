// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class PthreadCondattrT(
    val condAttrStatus: Int,
    val condAttrPshared: Int,
    val condAttrClockId: Int,
)
