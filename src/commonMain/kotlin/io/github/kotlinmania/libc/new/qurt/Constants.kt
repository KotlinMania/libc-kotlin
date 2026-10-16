package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public const val PTHREAD_NAME_LEN: Int = 16

public const val PTHREAD_MAX_THREADS: UInt = 512u

public const val PTHREAD_MIN_STACKSIZE: Int = 512

public const val PTHREAD_MAX_STACKSIZE: Int = 1048576

public const val PTHREAD_DEFAULT_STACKSIZE: Int = 16384

public const val PTHREAD_DEFAULT_PRIORITY: Int = 1

public const val PTHREAD_SPINLOCK_UNLOCKED: Int = 0

public const val PTHREAD_SPINLOCK_LOCKED: Int = 1

public const val TIME_CONV_SCLK_FREQ: Int = 19200000

public const val CLOCK_MONOTONIC_RAW: Int = 4

public const val CLOCK_REALTIME_COARSE: Int = 5

public const val CLOCK_MONOTONIC_COARSE: Int = 6

public const val CLOCK_BOOTTIME: Int = 7

public const val L_tmpnam: UInt = 260u

public const val TMP_MAX: UInt = 25u

public const val FOPEN_MAX: UInt = 20u

public const val EOK: Int = 0

public const val PAGESIZE: ULong = 4096uL

public const val PAGE_SIZE: ULong = 4096uL

public val DT_UNKNOWN: UByte = (0).toUByte()

public val DT_FIFO: UByte = (1).toUByte()

public val DT_CHR: UByte = (2).toUByte()

public val DT_DIR: UByte = (4).toUByte()

public val DT_BLK: UByte = (6).toUByte()

public val DT_REG: UByte = (8).toUByte()

public val DT_LNK: UByte = (10).toUByte()

public val DT_SOCK: UByte = (12).toUByte()
