// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class FfRampEffect(
    val startLevel: Short,
    val endLevel: Short,
    val envelope: FfEnvelope,
)
