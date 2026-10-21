package consumer

import io.github.kotlinmania.libc.unix.kill
import io.github.kotlinmania.libc.unix.mlock
import io.github.kotlinmania.libc.unix.munlock

fun main() {
    kill("wrong pid", 0)
    kill(1, null)
    mlock("wrong address", 64uL)
    munlock(null, "64")
}
