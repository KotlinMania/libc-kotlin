package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE

public val CR1: TcflagT = 0x00000100u

public val CR2: TcflagT = 0x00000200u

public val CR3: TcflagT = 0x00000300u

public val TABDLY: TcflagT = 0x00000c00u

public val TAB0: TcflagT = 0x00000000u

public val TAB1: TcflagT = 0x00000400u

public val TAB2: TcflagT = 0x00000800u

public val TAB3: TcflagT = 0x00000c00u

public val BSDLY: TcflagT = 0x00001000u

public val BS0: TcflagT = 0x00000000u

public val BS1: TcflagT = 0x00001000u

public val FFDLY: TcflagT = 0x00002000u

public val FF0: TcflagT = 0x00000000u

public val FF1: TcflagT = 0x00002000u

public val NLDLY: TcflagT = 0x00004000u

public val NL0: TcflagT = 0x00000000u

public val NL1: TcflagT = 0x00004000u

public val VTDLY: TcflagT = 0x00008000u

public val VT0: TcflagT = 0x00000000u

public val VT1: TcflagT = 0x00008000u

public val OXTABS: TcflagT = 0x00040000u

public val ONOEOT: TcflagT = 0x00080000u

public val CBAUD: TcflagT = 0x0000000fu

public val PARENB: TcflagT = 0x00000100u

public val PARODD: TcflagT = 0x00000200u

public val HUPCL: TcflagT = 0x00000400u

public val CLOCAL: TcflagT = 0x00000800u

public val CIBAUD: TcflagT = 0x000f0000u

public val IBSHIFT: TcflagT = 16u

public val PAREXT: TcflagT = 0x00100000u

public val ISIG: TcflagT = 0x00000001u

public val ICANON: TcflagT = 0x00000002u

public val XCASE: TcflagT = 0x00000004u

public val ALTWERASE: TcflagT = 0x00400000u

// time.h
public val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 11L

public val CLOCK_THREAD_CPUTIME_ID: ClockidT = 12L

// unistd.h
public val POSIX_VDISABLE: CInt = 0xff

public val PC_LINK_MAX: CInt = 11

public val PC_MAX_CANON: CInt = 12

public val PC_MAX_INPUT: CInt = 13

public val PC_NAME_MAX: CInt = 14

public val PC_PATH_MAX: CInt = 16

public val PC_PIPE_BUF: CInt = 17

public val PC_NO_TRUNC: CInt = 15

public val PC_VDISABLE: CInt = 18

public val PC_CHOWN_RESTRICTED: CInt = 10

public val PC_ASYNC_IO: CInt = 19

public val PC_PRIO_IO: CInt = 21

public val PC_SYNC_IO: CInt = 20

public val PC_ALLOC_SIZE_MIN: CInt = 26

public val PC_REC_INCR_XFER_SIZE: CInt = 27

public val PC_REC_MAX_XFER_SIZE: CInt = 28

public val PC_REC_MIN_XFER_SIZE: CInt = 29

public val PC_REC_XFER_ALIGN: CInt = 30

public val PC_SYMLINK_MAX: CInt = 25

public val PC_2_SYMLINKS: CInt = 31

public val PC_TIMESTAMP_RESOLUTION: CInt = 32

public val PC_FILESIZEBITS: CInt = 22

public val SC_ARG_MAX: CInt = 0

public val SC_CHILD_MAX: CInt = 1

public val SC_CLK_TCK: CInt = 2

public val SC_NGROUPS_MAX: CInt = 3

public val SC_OPEN_MAX: CInt = 4

public val SC_JOB_CONTROL: CInt = 7

public val SC_SAVED_IDS: CInt = 8

public val SC_VERSION: CInt = 9

public val SC_PASS_MAX: CInt = 45

public val SC_PAGE_SIZE: CInt = 48

public val SC_PAGESIZE: CInt = SC_PAGE_SIZE

public val SC_XOPEN_VERSION: CInt = 46

public val SC_NPROCESSORS_CONF: CInt = 71

public val SC_NPROCESSORS_ONLN: CInt = 72

public val SC_STREAM_MAX: CInt = 5

public val SC_TZNAME_MAX: CInt = 6

public val SC_AIO_LISTIO_MAX: CInt = 75

public val SC_AIO_MAX: CInt = 76

public val SC_AIO_PRIO_DELTA_MAX: CInt = 77

public val SC_ASYNCHRONOUS_IO: CInt = 78

public val SC_DELAYTIMER_MAX: CInt = 79

public val SC_FSYNC: CInt = 80

public val SC_MAPPED_FILES: CInt = 84

public val SC_MEMLOCK: CInt = 85

public val SC_MEMLOCK_RANGE: CInt = 86

public val SC_MEMORY_PROTECTION: CInt = 87

public val SC_MESSAGE_PASSING: CInt = 88

public val SC_MQ_OPEN_MAX: CInt = 89

public val SC_MQ_PRIO_MAX: CInt = 90

public val SC_PRIORITIZED_IO: CInt = 91

public val SC_PRIORITY_SCHEDULING: CInt = 92

public val SC_REALTIME_SIGNALS: CInt = 93

public val SC_RTSIG_MAX: CInt = 94

public val SC_SEMAPHORES: CInt = 95

public val SC_SEM_NSEMS_MAX: CInt = 96

public val SC_SEM_VALUE_MAX: CInt = 97

public val SC_SHARED_MEMORY_OBJECTS: CInt = 98

public val SC_SIGQUEUE_MAX: CInt = 99

public val SC_SYNCHRONIZED_IO: CInt = 100

public val SC_TIMERS: CInt = 102

public val SC_TIMER_MAX: CInt = 103

public val SC_2_C_BIND: CInt = 51

public val SC_2_C_DEV: CInt = 32

public val SC_2_C_VERSION: CInt = 52

public val SC_2_FORT_DEV: CInt = 33

public val SC_2_FORT_RUN: CInt = 34

public val SC_2_LOCALEDEF: CInt = 35

public val SC_2_SW_DEV: CInt = 36

public val SC_2_UPE: CInt = 53

public val SC_2_VERSION: CInt = 31

public val SC_BC_BASE_MAX: CInt = 23

public val SC_BC_DIM_MAX: CInt = 24

public val SC_BC_SCALE_MAX: CInt = 25

public val SC_BC_STRING_MAX: CInt = 26

public val SC_COLL_WEIGHTS_MAX: CInt = 50

public val SC_EXPR_NEST_MAX: CInt = 28

public val SC_LINE_MAX: CInt = 29

public val SC_RE_DUP_MAX: CInt = 30

public val SC_XOPEN_CRYPT: CInt = 56

public val SC_XOPEN_ENH_I18N: CInt = 57

public val SC_XOPEN_SHM: CInt = 55

public val SC_2_CHAR_TERM: CInt = 54

public val SC_XOPEN_XCU_VERSION: CInt = 109

public val SC_ATEXIT_MAX: CInt = 47

public val SC_IOV_MAX: CInt = 58

public val SC_XOPEN_UNIX: CInt = 73

public val SC_T_IOV_MAX: CInt = 0

public val SC_PHYS_PAGES: CInt = 113

public val SC_AVPHYS_PAGES: CInt = 114

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 101

public val SC_GETGR_R_SIZE_MAX: CInt = 81

public val SC_GETPW_R_SIZE_MAX: CInt = 82

public val SC_LOGIN_NAME_MAX: CInt = 83

public val SC_THREAD_KEYS_MAX: CInt = 68

public val SC_THREAD_STACK_MIN: CInt = 69

public val SC_THREAD_THREADS_MAX: CInt = 70

public val SC_TTY_NAME_MAX: CInt = 104

public val SC_THREADS: CInt = 60

public val SC_THREAD_ATTR_STACKADDR: CInt = 61

public val SC_THREAD_ATTR_STACKSIZE: CInt = 62

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 64

public val SC_THREAD_PRIO_INHERIT: CInt = 65

public val SC_THREAD_PRIO_PROTECT: CInt = 66

public val SC_THREAD_PROCESS_SHARED: CInt = 67

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 59

public val SC_XOPEN_LEGACY: CInt = 112

public val SC_XOPEN_REALTIME: CInt = 110

public val SC_XOPEN_REALTIME_THREADS: CInt = 111

public val SC_XBS5_ILP32_OFF32: CInt = 105

public val SC_XBS5_ILP32_OFFBIG: CInt = 106

public val SC_XBS5_LP64_OFF64: CInt = 107

public val SC_XBS5_LPBIG_OFFBIG: CInt = 108

public val SC_2_PBS: CInt = 132

public val SC_2_PBS_ACCOUNTING: CInt = 133

public val SC_2_PBS_CHECKPOINT: CInt = 134

public val SC_2_PBS_LOCATE: CInt = 135

public val SC_2_PBS_MESSAGE: CInt = 136

public val SC_2_PBS_TRACK: CInt = 137

public val SC_ADVISORY_INFO: CInt = 130

public val SC_BARRIERS: CInt = 138

public val SC_CLOCK_SELECTION: CInt = 139

public val SC_CPUTIME: CInt = 140

public val SC_HOST_NAME_MAX: CInt = 126

public val SC_MONOTONIC_CLOCK: CInt = 141

public val SC_READER_WRITER_LOCKS: CInt = 142

public val SC_REGEXP: CInt = 127

public val SC_SHELL: CInt = 128

public val SC_SPAWN: CInt = 143

public val SC_SPIN_LOCKS: CInt = 144

public val SC_SPORADIC_SERVER: CInt = 145

public val SC_SS_REPL_MAX: CInt = 156

public val SC_SYMLOOP_MAX: CInt = 129

public val SC_THREAD_CPUTIME: CInt = 146

public val SC_THREAD_SPORADIC_SERVER: CInt = 147

public val SC_TIMEOUTS: CInt = 148

public val SC_TRACE: CInt = 149

public val SC_TRACE_EVENT_FILTER: CInt = 150

public val SC_TRACE_EVENT_NAME_MAX: CInt = 157

public val SC_TRACE_INHERIT: CInt = 151

public val SC_TRACE_LOG: CInt = 152

public val SC_TRACE_NAME_MAX: CInt = 158

public val SC_TRACE_SYS_MAX: CInt = 159

public val SC_TRACE_USER_EVENT_MAX: CInt = 160

public val SC_TYPED_MEMORY_OBJECTS: CInt = 153

public val SC_V6_ILP32_OFF32: CInt = 121

public val SC_V6_ILP32_OFFBIG: CInt = 122

public val SC_V6_LP64_OFF64: CInt = 123

public val SC_V6_LPBIG_OFFBIG: CInt = 124

public val SC_XOPEN_STREAMS: CInt = 125

public val SC_IPV6: CInt = 154

public val SC_RAW_SOCKETS: CInt = 155

// utmp.h
public val EMPTY: CShort = 0

public val RUN_LVL: CShort = 1

public val BOOT_TIME: CShort = 2

public val OLD_TIME: CShort = 3

public val NEW_TIME: CShort = 4

public val INIT_PROCESS: CShort = 5

public val LOGIN_PROCESS: CShort = 6

public val USER_PROCESS: CShort = 7

public val DEAD_PROCESS: CShort = 8

public val ACCOUNTING: CShort = 9
