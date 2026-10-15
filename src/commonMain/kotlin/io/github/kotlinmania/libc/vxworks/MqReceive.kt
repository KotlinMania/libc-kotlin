// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun mqReceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?): Long
