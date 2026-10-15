// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class IwreqData(
    val name: ByteArray? = null,
    val essid: IwPoint? = null,
    val nwid: IwParam? = null,
    val freq: IwFreq? = null,
    val sens: IwParam? = null,
    val bitrate: IwParam? = null,
    val txpower: IwParam? = null,
    val rts: IwParam? = null,
    val frag: IwParam? = null,
    val mode: UInt? = null,
    val retry: IwParam? = null,
    val encoding: IwPoint? = null,
    val power: IwParam? = null,
    val qual: IwQuality? = null,
    val apAddr: Sockaddr? = null,
    val addr: Sockaddr? = null,
    val param: IwParam? = null,
    val data: IwPoint? = null,
)
