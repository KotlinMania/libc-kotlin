package consumer

import io.github.kotlinmania.libc.unix.getpid
import io.github.kotlinmania.libc.unix.kill
import io.github.kotlinmania.libc.unix.malloc
import io.github.kotlinmania.libc.unix.free
import io.github.kotlinmania.libc.unix.mlock
import io.github.kotlinmania.libc.unix.munlock
import io.github.kotlinmania.libc.unix.memset
import io.github.kotlinmania.libc.unix.memcmp
import io.github.kotlinmania.libc.unix.lastErrorNumber

fun main() {
    val pid = getpid()
    check(pid > 0)
    check(kill(pid, 0) == 0)
    check(kill(pid, Int.MAX_VALUE) == -1)
    val error = lastErrorNumber()
    check(error > 0)
    val memory = checkNotNull(malloc(64uL))
    val comparison = checkNotNull(malloc(64uL))
    var locked = false
    try {
        check(memset(memory, 65, 64uL)?.ptr == memory.ptr)
        memset(comparison, 65, 64uL)
        check(mlock(memory, 64uL) == 0)
        locked = true
        check(memcmp(memory, comparison, 64uL) == 0)
        check(memset(memory, 90, 64uL)?.ptr == memory.ptr)
        memset(comparison, 90, 64uL)
        check(memcmp(memory, comparison, 64uL) == 0)
        check(munlock(memory, 64uL) == 0)
        locked = false
        check(memcmp(memory, comparison, 64uL) == 0)
    } finally {
        try {
            if (locked) check(munlock(memory, 64uL) == 0)
        } finally {
            free(comparison)
            free(memory)
        }
    }
    println("{\"pid\":$pid,\"error\":$error,\"tests\":[\"actualPidProbe\",\"nativeSignalError\",\"memoryLockPreservesOwnedAllocationAndMutation\"]}")
}
