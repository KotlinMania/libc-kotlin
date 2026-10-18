package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.Statfs

public expect fun fhstatfs(fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?, buf: Statfs?): Int
