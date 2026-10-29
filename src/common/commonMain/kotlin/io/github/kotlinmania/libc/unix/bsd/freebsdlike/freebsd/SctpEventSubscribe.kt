package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpEventSubscribe(
    val sctpDataIoEvent: UByte,
    val sctpAssociationEvent: UByte,
    val sctpAddressEvent: UByte,
    val sctpSendFailureEvent: UByte,
    val sctpPeerErrorEvent: UByte,
    val sctpShutdownEvent: UByte,
    val sctpPartialDeliveryEvent: UByte,
    val sctpAdaptationLayerEvent: UByte,
    val sctpAuthenticationEvent: UByte,
    val sctpSenderDryEvent: UByte,
    val sctpStreamResetEvent: UByte,
)
