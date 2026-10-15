// port-lint: source unix/bsd/netbsdlike/openbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class NfsArgs(
    val version: Int,
    val addr: Sockaddr?,
    val addrlen: Int,
    val sotype: Int,
    val proto: Int,
    val fh: COpaquePointer?,
    val fhsize: Int,
    val flags: Int,
    val wsize: Int,
    val rsize: Int,
    val readdirsize: Int,
    val timeo: Int,
    val retrans: Int,
    val maxgrouplist: Int,
    val readahead: Int,
    val leaseterm: Int,
    val deadthresh: Int,
    val hostname: String?,
    val acregmin: Int,
    val acregmax: Int,
    val acdirmin: Int,
    val acdirmax: Int,
)
