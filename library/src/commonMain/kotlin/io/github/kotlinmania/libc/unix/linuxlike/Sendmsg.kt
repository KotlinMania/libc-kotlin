package io.github.kotlinmania.libc.unix.linuxlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Msghdr

public expect fun sendmsg(fd: Int, msg: Msghdr?, flags: Int): Long
