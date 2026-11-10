package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint

// Additional pthread constants
public val PTHREAD_NAME_LEN: CInt = 16

public val PTHREAD_MAX_THREADS: CUint = 512u

public val PTHREAD_MIN_STACKSIZE: CInt = 512

public val PTHREAD_MAX_STACKSIZE: CInt = 1048576

public val PTHREAD_DEFAULT_STACKSIZE: CInt = 16384

public val PTHREAD_DEFAULT_PRIORITY: CInt = 1

public val PTHREAD_SPINLOCK_UNLOCKED: CInt = 0

public val PTHREAD_SPINLOCK_LOCKED: CInt = 1

// Additional time constants
public val TIME_CONV_SCLK_FREQ: CInt = 19200000

public val CLOCK_MONOTONIC_RAW: ClockidT = 4

public val CLOCK_REALTIME_COARSE: ClockidT = 5

public val CLOCK_MONOTONIC_COARSE: ClockidT = 6

public val CLOCK_BOOTTIME: ClockidT = 7

// Stdio constants
public val L_TMPNAM: CUint = 260u

public val TMP_MAX: CUint = 25u

public val FOPEN_MAX: CUint = 20u

// Error constants
public val EOK: CInt = 0

// Semaphore constants
public val SEM_FAILED: CUint? = null

// Page size constants (hexagon-specific)
public val PAGESIZE: SizeT = 4096uL

public val PAGE_SIZE: SizeT = 4096uL

// Directory entry types (hexagon-specific)
public val DT_UNKNOWN: CUchar = 0u

public val DT_FIFO: CUchar = 1u

public val DT_CHR: CUchar = 2u

public val DT_DIR: CUchar = 4u

public val DT_BLK: CUchar = 6u

public val DT_REG: CUchar = 8u

public val DT_LNK: CUchar = 10u

public val DT_SOCK: CUchar = 12u
