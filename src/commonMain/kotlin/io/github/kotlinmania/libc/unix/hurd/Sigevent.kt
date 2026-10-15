// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

public data class Sigevent(
    val sigevValue: Sigval,
    val sigevSigno: Int,
    val sigevNotify: Int,
    val sigevNotifyAttributes: io.github.kotlinmania.libc.unix.hurd.PthreadAttr?,
)
