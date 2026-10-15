package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun devstatBuildmatch(matchStr: String?, matches: COpaquePointer?, numMatches: Int?): Int
