package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.MsqidDs

public expect fun msgctl(msqid: Int, cmd: Int, buf: MsqidDs?): Int
