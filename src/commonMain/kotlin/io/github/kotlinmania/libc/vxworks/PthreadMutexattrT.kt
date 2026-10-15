// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class PthreadMutexattrT(
    val mutexAttrStatus: Int,
    val mutexAttrPshared: Int,
    val mutexAttrProtocol: Int,
    val mutexAttrPrioceiling: Int,
    val mutexAttrType: Int,
)
