// port-lint: source new/apple/libpthread/sys/qos.rs
package io.github.kotlinmania.libc.new.apple.libpthread.sys

import io.github.kotlinmania.libc.*

// Header: `sys / qos.h`
//
// <https://github.com/apple-oss-distributions/libpthread/blob/main/include/sys/qos.h>

public sealed class QosClassT(public val value: UInt) {
    public data object QosClassUserInteractive : QosClassT(0x21u)
    public data object QosClassUserInitiated : QosClassT(0x19u)
    public data object QosClassDefault : QosClassT(0x15u)
    public data object QosClassUtility : QosClassT(0x11u)
    public data object QosClassBackground : QosClassT(0x09u)
    public data object QosClassUnspecified : QosClassT(0x00u)

    public open fun clone(): QosClassT {
        return this
    }
}
