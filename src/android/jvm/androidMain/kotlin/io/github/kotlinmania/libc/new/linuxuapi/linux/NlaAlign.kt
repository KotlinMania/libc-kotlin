package io.github.kotlinmania.libc.new.linuxuapi.linux

public actual fun nlaAlign(len: Int): Int {
    return (len + NLA_ALIGNTO - 1) and (NLA_ALIGNTO - 1).inv()
}
