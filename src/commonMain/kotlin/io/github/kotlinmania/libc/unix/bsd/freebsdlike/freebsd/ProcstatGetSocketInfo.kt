package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun procstatGetSocketInfo(proc: Procstat?, fst: Filestat?, sock: Sockstat?, errbuf: String?): Int
