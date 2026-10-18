package io.github.kotlinmania.libc.unix.bsd
import io.github.kotlinmania.libc.unix.bsd.apple.GlobT

import io.github.kotlinmania.libc.*

public expect fun globfree(pglob: GlobT?)
