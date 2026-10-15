// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class Sigevent(
    val sigevValue: Sigval,
    val sigevSigno: Int,
    val sigevNotify: Int,
    val sigevNotifyFunction: ((Sigval) -> Unit)?,
    val sigevNotifyAttributes: io.github.kotlinmania.libc.COpaquePointer?,
)
