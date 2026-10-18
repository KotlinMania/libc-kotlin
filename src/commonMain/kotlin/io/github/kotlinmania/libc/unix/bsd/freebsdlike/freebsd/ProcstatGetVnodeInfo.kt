package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun procstatGetVnodeInfo(proc: Procstat?, fst: Filestat?, vn: Int?, errbuf: String?): Int
