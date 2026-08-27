// port-lint: source libc/src/new/musl/sys/socket.rs
package io.github.kotlinmania.libc.musl.sys

import io.github.kotlinmania.libc.*

/**
 * Header: `sys/socket.h`
 *
 * Musl implementation of socket message structures.
 *
 * Reference: https://github.com/kraj/musl/blob/kraj/master/include/sys/socket.h
 */

/**
 * Message header structure for sendmsg/recvmsg.
 *
 * Note: In the upstream Rust code, this structure includes platform-specific padding fields
 * (`__pad1` and `__pad2`) that vary based on pointer width (64-bit) and endianness (big/little).
 * These padding fields ensure correct memory layout for FFI with C code.
 *
 * For Kotlin Multiplatform, these padding concerns are handled by platform-specific FFI layers
 * (cinterop for Kotlin/Native, JNI for JVM, N-API for JS). The logical structure is preserved
 * here without explicit padding fields.
 */
public data class Msghdr(
    /** Address to send to/receive from (nullable for unspecified) */
    val msgName: ByteArray?,
    /** Length of address */
    val msgNamelen: CUInt,
    /** Scatter/gather array */
    val msgIov: List<Iovec>,
    /** Number of elements in msgIov */
    val msgIovlen: CInt,
    /** Ancillary data */
    val msgControl: ByteArray?,
    /** Ancillary data buffer length */
    val msgControlen: CUInt,
    /** Flags on received message */
    val msgFlags: CInt,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Msghdr
        if (msgName != null) {
            if (other.msgName == null) return false
            if (!msgName.contentEquals(other.msgName)) return false
        } else if (other.msgName != null) {
            return false
        }
        if (msgNamelen != other.msgNamelen) return false
        if (msgIov != other.msgIov) return false
        if (msgIovlen != other.msgIovlen) return false
        if (msgControl != null) {
            if (other.msgControl == null) return false
            if (!msgControl.contentEquals(other.msgControl)) return false
        } else if (other.msgControl != null) {
            return false
        }
        if (msgControlen != other.msgControlen) return false
        if (msgFlags != other.msgFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = msgName?.contentHashCode() ?: 0
        result = 31 * result + msgNamelen.hashCode()
        result = 31 * result + msgIov.hashCode()
        result = 31 * result + msgIovlen
        result = 31 * result + (msgControl?.contentHashCode() ?: 0)
        result = 31 * result + msgControlen.hashCode()
        result = 31 * result + msgFlags
        return result
    }
}

/**
 * Control message header structure.
 *
 * Used for ancillary data in socket messages.
 *
 * Note: In the upstream Rust code, this structure includes a platform-specific padding field
 * that varies based on pointer width (64-bit) and endianness (big/little).
 * The padding ensures correct alignment for FFI with C code.
 *
 * For Kotlin Multiplatform, padding is handled by platform-specific FFI layers.
 */
public data class Cmsghdr(
    /** Length of data in message payload plus header */
    val cmsgLen: CUInt,
    /** Originating protocol */
    val cmsgLevel: CInt,
    /** Protocol-specific type */
    val cmsgType: CInt,
)

/**
 * I/O vector for scatter/gather I/O.
 *
 * Note: Referenced by Msghdr but defined in upstream unix/mod.rs as the `iovec` structure.
 * For Kotlin Multiplatform, we represent it as a simple data holder.
 */
public data class Iovec(
    /** Base address of memory region */
    val iovBase: ByteArray,
    /** Size of the region */
    val iovLen: ULong,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Iovec
        if (!iovBase.contentEquals(other.iovBase)) return false
        if (iovLen != other.iovLen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = iovBase.contentHashCode()
        result = 31 * result + iovLen.hashCode()
        return result
    }
}
