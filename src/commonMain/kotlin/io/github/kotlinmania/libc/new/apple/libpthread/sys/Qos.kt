// port-lint: source new/apple/libpthread/sys/qos.rs
package io.github.kotlinmania.libc.new.apple.libpthread.sys

/**
 * Header: `sys/qos.h`.
 */
public enum class QosClassT(public val value: UInt) {
    QOS_CLASS_USER_INTERACTIVE(0x21u),
    QOS_CLASS_USER_INITIATED(0x19u),
    QOS_CLASS_DEFAULT(0x15u),
    QOS_CLASS_UTILITY(0x11u),
    QOS_CLASS_BACKGROUND(0x09u),
    QOS_CLASS_UNSPECIFIED(0x00u),
}
