package io.github.kotlinmania.libc.unix.bsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.apple.GlobT

public expect fun globfree(pglob: GlobT?)
