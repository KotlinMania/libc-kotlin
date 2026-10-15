// port-lint: source unix/linux_like/linux/gnu/b64/powerpc64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64

import io.github.kotlinmania.libc.*

public data class VrregsetT(
    val vrregs: List<UIntArray>,
    val vscr: VscrT,
    val vrsave: UInt,
)
