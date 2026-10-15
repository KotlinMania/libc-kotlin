// port-lint: source unix/bsd/freebsdlike/dragonfly/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class CAnonymousPmap(
    val priv1: List<ULong>,
    val priv2: List<ULong>,
    val priv3: List<ULong>,
    val priv4: List<ULong>,
    val priv5: List<ULong>,
)
