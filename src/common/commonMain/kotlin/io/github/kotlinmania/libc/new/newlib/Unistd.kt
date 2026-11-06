// port-lint: source new/newlib/unistd.rs
package io.github.kotlinmania.libc.new.newlib

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt

// Header: `unistd.h`

public val SC_ARG_MAX: CInt = 0

public val SC_CHILD_MAX: CInt = 1

public val SC_CLK_TCK: CInt = 2

public val SC_NGROUPS_MAX: CInt = 3

public val SC_OPEN_MAX: CInt = 4

public val SC_JOB_CONTROL: CInt = 5

public val SC_SAVED_IDS: CInt = 6

public val SC_VERSION: CInt = 7

public val SC_PAGESIZE: CInt = 8

public val SC_PAGE_SIZE: CInt = SC_PAGESIZE

public val SC_NPROCESSORS_CONF: CInt = 9

public val SC_NPROCESSORS_ONLN: CInt = 10

public val SC_PHYS_PAGES: CInt = 11

public val SC_AVPHYS_PAGES: CInt = 12

public val SC_MQ_OPEN_MAX: CInt = 13

public val SC_MQ_PRIO_MAX: CInt = 14

public val SC_RTSIG_MAX: CInt = 15

public val SC_SEM_NSEMS_MAX: CInt = 16

public val SC_SEM_VALUE_MAX: CInt = 17

public val SC_SIGQUEUE_MAX: CInt = 18

public val SC_TIMER_MAX: CInt = 19

public val SC_TZNAME_MAX: CInt = 20

public val SC_ASYNCHRONOUS_IO: CInt = 21

public val SC_FSYNC: CInt = 22

public val SC_MAPPED_FILES: CInt = 23

public val SC_MEMLOCK: CInt = 24

public val SC_MEMLOCK_RANGE: CInt = 25

public val SC_MEMORY_PROTECTION: CInt = 26

public val SC_MESSAGE_PASSING: CInt = 27

public val SC_PRIORITIZED_IO: CInt = 28

public val SC_REALTIME_SIGNALS: CInt = 29

public val SC_SEMAPHORES: CInt = 30

public val SC_SHARED_MEMORY_OBJECTS: CInt = 31

public val SC_SYNCHRONIZED_IO: CInt = 32

public val SC_TIMERS: CInt = 33

public val SC_AIO_LISTIO_MAX: CInt = 34

public val SC_AIO_MAX: CInt = 35

public val SC_AIO_PRIO_DELTA_MAX: CInt = 36

public val SC_DELAYTIMER_MAX: CInt = 37

public val SC_THREAD_KEYS_MAX: CInt = 38

public val SC_THREAD_STACK_MIN: CInt = 39

public val SC_THREAD_THREADS_MAX: CInt = 40

public val SC_TTY_NAME_MAX: CInt = 41

public val SC_THREADS: CInt = 42

public val SC_THREAD_ATTR_STACKADDR: CInt = 43

public val SC_THREAD_ATTR_STACKSIZE: CInt = 44

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 45

public val SC_THREAD_PRIO_INHERIT: CInt = 46

public val SC_THREAD_PRIO_PROTECT: CInt = 47

public val SC_THREAD_PRIO_CEILING: CInt = SC_THREAD_PRIO_PROTECT

public val SC_THREAD_PROCESS_SHARED: CInt = 48

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 49

public val SC_GETGR_R_SIZE_MAX: CInt = 50

public val SC_GETPW_R_SIZE_MAX: CInt = 51

public val SC_LOGIN_NAME_MAX: CInt = 52

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 53

public val SC_ADVISORY_INFO: CInt = 54

public val SC_ATEXIT_MAX: CInt = 55

public val SC_BARRIERS: CInt = 56

public val SC_BC_BASE_MAX: CInt = 57

public val SC_BC_DIM_MAX: CInt = 58

public val SC_BC_SCALE_MAX: CInt = 59

public val SC_BC_STRING_MAX: CInt = 60

public val SC_CLOCK_SELECTION: CInt = 61

public val SC_COLL_WEIGHTS_MAX: CInt = 62

public val SC_CPUTIME: CInt = 63

public val SC_EXPR_NEST_MAX: CInt = 64

public val SC_HOST_NAME_MAX: CInt = 65

public val SC_IOV_MAX: CInt = 66

public val SC_IPV6: CInt = 67

public val SC_LINE_MAX: CInt = 68

public val SC_MONOTONIC_CLOCK: CInt = 69

public val SC_RAW_SOCKETS: CInt = 70

public val SC_READER_WRITER_LOCKS: CInt = 71

public val SC_REGEXP: CInt = 72

public val SC_RE_DUP_MAX: CInt = 73

public val SC_SHELL: CInt = 74

public val SC_SPAWN: CInt = 75

public val SC_SPIN_LOCKS: CInt = 76

public val SC_SPORADIC_SERVER: CInt = 77

public val SC_SS_REPL_MAX: CInt = 78

public val SC_SYMLOOP_MAX: CInt = 79

public val SC_THREAD_CPUTIME: CInt = 80

public val SC_THREAD_SPORADIC_SERVER: CInt = 81

public val SC_TIMEOUTS: CInt = 82

public val SC_TRACE: CInt = 83

public val SC_TRACE_EVENT_FILTER: CInt = 84

public val SC_TRACE_EVENT_NAME_MAX: CInt = 85

public val SC_TRACE_INHERIT: CInt = 86

public val SC_TRACE_LOG: CInt = 87

public val SC_TRACE_NAME_MAX: CInt = 88

public val SC_TRACE_SYS_MAX: CInt = 89

public val SC_TRACE_USER_EVENT_MAX: CInt = 90

public val SC_TYPED_MEMORY_OBJECTS: CInt = 91

public val SC_V7_ILP32_OFF32: CInt = 92

public val SC_V6_ILP32_OFF32: CInt = SC_V7_ILP32_OFF32

public val SC_XBS5_ILP32_OFF32: CInt = SC_V7_ILP32_OFF32

public val SC_V7_ILP32_OFFBIG: CInt = 93

public val SC_V6_ILP32_OFFBIG: CInt = SC_V7_ILP32_OFFBIG

public val SC_XBS5_ILP32_OFFBIG: CInt = SC_V7_ILP32_OFFBIG

public val SC_V7_LP64_OFF64: CInt = 94

public val SC_V6_LP64_OFF64: CInt = SC_V7_LP64_OFF64

public val SC_XBS5_LP64_OFF64: CInt = SC_V7_LP64_OFF64

public val SC_V7_LPBIG_OFFBIG: CInt = 95

public val SC_V6_LPBIG_OFFBIG: CInt = SC_V7_LPBIG_OFFBIG

public val SC_XBS5_LPBIG_OFFBIG: CInt = SC_V7_LPBIG_OFFBIG

public val SC_XOPEN_CRYPT: CInt = 96

public val SC_XOPEN_ENH_I18N: CInt = 97

public val SC_XOPEN_LEGACY: CInt = 98

public val SC_XOPEN_REALTIME: CInt = 99

public val SC_STREAM_MAX: CInt = 100

public val SC_PRIORITY_SCHEDULING: CInt = 101

public val SC_XOPEN_REALTIME_THREADS: CInt = 102

public val SC_XOPEN_SHM: CInt = 103

public val SC_XOPEN_STREAMS: CInt = 104

public val SC_XOPEN_UNIX: CInt = 105

public val SC_XOPEN_VERSION: CInt = 106

public val SC_2_CHAR_TERM: CInt = 107

public val SC_2_C_BIND: CInt = 108

public val SC_2_C_DEV: CInt = 109

public val SC_2_FORT_DEV: CInt = 110

public val SC_2_FORT_RUN: CInt = 111

public val SC_2_LOCALEDEF: CInt = 112

public val SC_2_PBS: CInt = 113

public val SC_2_PBS_ACCOUNTING: CInt = 114

public val SC_2_PBS_CHECKPOINT: CInt = 115

public val SC_2_PBS_LOCATE: CInt = 116

public val SC_2_PBS_MESSAGE: CInt = 117

public val SC_2_PBS_TRACK: CInt = 118

public val SC_2_SW_DEV: CInt = 119

public val SC_2_UPE: CInt = 120

public val SC_2_VERSION: CInt = 121

public val SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 122

public val SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 123

public val SC_XOPEN_UUCP: CInt = 124

public val SC_LEVEL1_ICACHE_SIZE: CInt = 125

public val SC_LEVEL1_ICACHE_ASSOC: CInt = 126

public val SC_LEVEL1_ICACHE_LINESIZE: CInt = 127

public val SC_LEVEL1_DCACHE_SIZE: CInt = 128

public val SC_LEVEL1_DCACHE_ASSOC: CInt = 129

public val SC_LEVEL1_DCACHE_LINESIZE: CInt = 130

public val SC_LEVEL2_CACHE_SIZE: CInt = 131

public val SC_LEVEL2_CACHE_ASSOC: CInt = 132

public val SC_LEVEL2_CACHE_LINESIZE: CInt = 133

public val SC_LEVEL3_CACHE_SIZE: CInt = 134

public val SC_LEVEL3_CACHE_ASSOC: CInt = 135

public val SC_LEVEL3_CACHE_LINESIZE: CInt = 136

public val SC_LEVEL4_CACHE_SIZE: CInt = 137

public val SC_LEVEL4_CACHE_ASSOC: CInt = 138

public val SC_LEVEL4_CACHE_LINESIZE: CInt = 139
