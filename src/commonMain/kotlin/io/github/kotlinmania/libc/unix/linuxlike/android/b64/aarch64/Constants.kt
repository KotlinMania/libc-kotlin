package io.github.kotlinmania.libc.unix.linuxlike.android.b64.aarch64

import io.github.kotlinmania.libc.*

public const val O_DIRECT: Int = 0x10000

public const val O_DIRECTORY: Int = 0x4000

public const val O_NOFOLLOW: Int = 0x8000

public const val O_LARGEFILE: Int = 131072

public const val SIGSTKSZ: ULong = 16384uL

public const val MINSIGSTKSZ: ULong = 5120uL

public val HWCAP_FP: ULong = 1uL shl 0

public val HWCAP_ASIMD: ULong = 1uL shl 1

public val HWCAP_EVTSTRM: ULong = 1uL shl 2

public val HWCAP_AES: ULong = 1uL shl 3

public val HWCAP_PMULL: ULong = 1uL shl 4

public val HWCAP_SHA1: ULong = 1uL shl 5

public val HWCAP_SHA2: ULong = 1uL shl 6

public val HWCAP_CRC32: ULong = 1uL shl 7

public val HWCAP_ATOMICS: ULong = 1uL shl 8

public val HWCAP_FPHP: ULong = 1uL shl 9

public val HWCAP_ASIMDHP: ULong = 1uL shl 10

public val HWCAP_CPUID: ULong = 1uL shl 11

public val HWCAP_ASIMDRDM: ULong = 1uL shl 12

public val HWCAP_JSCVT: ULong = 1uL shl 13

public val HWCAP_FCMA: ULong = 1uL shl 14

public val HWCAP_LRCPC: ULong = 1uL shl 15

public val HWCAP_DCPOP: ULong = 1uL shl 16

public val HWCAP_SHA3: ULong = 1uL shl 17

public val HWCAP_SM3: ULong = 1uL shl 18

public val HWCAP_SM4: ULong = 1uL shl 19

public val HWCAP_ASIMDDP: ULong = 1uL shl 20

public val HWCAP_SHA512: ULong = 1uL shl 21

public val HWCAP_SVE: ULong = 1uL shl 22

public val HWCAP_ASIMDFHM: ULong = 1uL shl 23

public val HWCAP_DIT: ULong = 1uL shl 24

public val HWCAP_USCAT: ULong = 1uL shl 25

public val HWCAP_ILRCPC: ULong = 1uL shl 26

public val HWCAP_FLAGM: ULong = 1uL shl 27

public val HWCAP_SSBS: ULong = 1uL shl 28

public val HWCAP_SB: ULong = 1uL shl 29

public val HWCAP_PACA: ULong = 1uL shl 30

public val HWCAP_PACG: ULong = 1uL shl 31

public val HWCAP2_DCPODP: ULong = 1uL shl 0

public val HWCAP2_SVE2: ULong = 1uL shl 1

public val HWCAP2_SVEAES: ULong = 1uL shl 2

public val HWCAP2_SVEPMULL: ULong = 1uL shl 3

public val HWCAP2_SVEBITPERM: ULong = 1uL shl 4

public val HWCAP2_SVESHA3: ULong = 1uL shl 5

public val HWCAP2_SVESM4: ULong = 1uL shl 6

public val HWCAP2_FLAGM2: ULong = 1uL shl 7

public val HWCAP2_FRINT: ULong = 1uL shl 8

public val HWCAP2_SVEI8MM: ULong = 1uL shl 9

public val HWCAP2_SVEF32MM: ULong = 1uL shl 10

public val HWCAP2_SVEF64MM: ULong = 1uL shl 11

public val HWCAP2_SVEBF16: ULong = 1uL shl 12

public val HWCAP2_I8MM: ULong = 1uL shl 13

public val HWCAP2_BF16: ULong = 1uL shl 14

public val HWCAP2_DGH: ULong = 1uL shl 15

public val HWCAP2_RNG: ULong = 1uL shl 16

public val HWCAP2_BTI: ULong = 1uL shl 17

public val HWCAP2_MTE: ULong = 1uL shl 18

public val HWCAP2_ECV: ULong = 1uL shl 19

public val HWCAP2_AFP: ULong = 1uL shl 20

public val HWCAP2_RPRES: ULong = 1uL shl 21

public val HWCAP2_MTE3: ULong = 1uL shl 22

public val HWCAP2_SME: ULong = 1uL shl 23

public val HWCAP2_SME_I16I64: ULong = 1uL shl 24

public val HWCAP2_SME_F64F64: ULong = 1uL shl 25

public val HWCAP2_SME_I8I32: ULong = 1uL shl 26

public val HWCAP2_SME_F16F32: ULong = 1uL shl 27

public val HWCAP2_SME_B16F32: ULong = 1uL shl 28

public val HWCAP2_SME_F32F32: ULong = 1uL shl 29

public val HWCAP2_SME_FA64: ULong = 1uL shl 30

public val HWCAP2_WFXT: ULong = 1uL shl 31

public val HWCAP2_EBF16: ULong = 1uL shl 32

public val HWCAP2_SVE_EBF16: ULong = 1uL shl 33

public const val SYS_io_setup: Long = 0

public const val SYS_io_destroy: Long = 1

public const val SYS_io_submit: Long = 2

public const val SYS_io_cancel: Long = 3

public const val SYS_io_getevents: Long = 4

public const val SYS_setxattr: Long = 5

public const val SYS_lsetxattr: Long = 6

public const val SYS_fsetxattr: Long = 7

public const val SYS_getxattr: Long = 8

public const val SYS_lgetxattr: Long = 9

public const val SYS_fgetxattr: Long = 10

public const val SYS_listxattr: Long = 11

public const val SYS_llistxattr: Long = 12

public const val SYS_flistxattr: Long = 13

public const val SYS_removexattr: Long = 14

public const val SYS_lremovexattr: Long = 15

public const val SYS_fremovexattr: Long = 16

public const val SYS_getcwd: Long = 17

public const val SYS_lookup_dcookie: Long = 18

public const val SYS_eventfd2: Long = 19

public const val SYS_epoll_create1: Long = 20

public const val SYS_epoll_ctl: Long = 21

public const val SYS_epoll_pwait: Long = 22

public const val SYS_dup: Long = 23

public const val SYS_dup3: Long = 24

public const val SYS_fcntl: Long = 25

public const val SYS_inotify_init1: Long = 26

public const val SYS_inotify_add_watch: Long = 27

public const val SYS_inotify_rm_watch: Long = 28

public const val SYS_ioctl: Long = 29

public const val SYS_ioprio_set: Long = 30

public const val SYS_ioprio_get: Long = 31

public const val SYS_flock: Long = 32

public const val SYS_mknodat: Long = 33

public const val SYS_mkdirat: Long = 34

public const val SYS_unlinkat: Long = 35

public const val SYS_symlinkat: Long = 36

public const val SYS_linkat: Long = 37

public const val SYS_renameat: Long = 38

public const val SYS_umount2: Long = 39

public const val SYS_mount: Long = 40

public const val SYS_pivot_root: Long = 41

public const val SYS_nfsservctl: Long = 42

public const val SYS_fallocate: Long = 47

public const val SYS_faccessat: Long = 48

public const val SYS_chdir: Long = 49

public const val SYS_fchdir: Long = 50

public const val SYS_chroot: Long = 51

public const val SYS_fchmod: Long = 52

public const val SYS_fchmodat: Long = 53

public const val SYS_fchownat: Long = 54

public const val SYS_fchown: Long = 55

public const val SYS_openat: Long = 56

public const val SYS_close: Long = 57

public const val SYS_vhangup: Long = 58

public const val SYS_pipe2: Long = 59

public const val SYS_quotactl: Long = 60

public const val SYS_getdents64: Long = 61

public const val SYS_lseek: Long = 62

public const val SYS_read: Long = 63

public const val SYS_write: Long = 64

public const val SYS_readv: Long = 65

public const val SYS_writev: Long = 66

public const val SYS_pread64: Long = 67

public const val SYS_pwrite64: Long = 68

public const val SYS_preadv: Long = 69

public const val SYS_pwritev: Long = 70

public const val SYS_pselect6: Long = 72

public const val SYS_ppoll: Long = 73

public const val SYS_signalfd4: Long = 74

public const val SYS_vmsplice: Long = 75

public const val SYS_splice: Long = 76

public const val SYS_tee: Long = 77

public const val SYS_readlinkat: Long = 78

public const val SYS_sync: Long = 81

public const val SYS_fsync: Long = 82

public const val SYS_fdatasync: Long = 83

public const val SYS_sync_file_range: Long = 84

public const val SYS_timerfd_create: Long = 85

public const val SYS_timerfd_settime: Long = 86

public const val SYS_timerfd_gettime: Long = 87

public const val SYS_utimensat: Long = 88

public const val SYS_acct: Long = 89

public const val SYS_capget: Long = 90

public const val SYS_capset: Long = 91

public const val SYS_personality: Long = 92

public const val SYS_exit: Long = 93

public const val SYS_exit_group: Long = 94

public const val SYS_waitid: Long = 95

public const val SYS_set_tid_address: Long = 96

public const val SYS_unshare: Long = 97

public const val SYS_futex: Long = 98

public const val SYS_set_robust_list: Long = 99

public const val SYS_get_robust_list: Long = 100

public const val SYS_nanosleep: Long = 101

public const val SYS_getitimer: Long = 102

public const val SYS_setitimer: Long = 103

public const val SYS_kexec_load: Long = 104

public const val SYS_init_module: Long = 105

public const val SYS_delete_module: Long = 106

public const val SYS_timer_create: Long = 107

public const val SYS_timer_gettime: Long = 108

public const val SYS_timer_getoverrun: Long = 109

public const val SYS_timer_settime: Long = 110

public const val SYS_timer_delete: Long = 111

public const val SYS_clock_settime: Long = 112

public const val SYS_clock_gettime: Long = 113

public const val SYS_clock_getres: Long = 114

public const val SYS_clock_nanosleep: Long = 115

public const val SYS_syslog: Long = 116

public const val SYS_ptrace: Long = 117

public const val SYS_sched_setparam: Long = 118

public const val SYS_sched_setscheduler: Long = 119

public const val SYS_sched_getscheduler: Long = 120

public const val SYS_sched_getparam: Long = 121

public const val SYS_sched_setaffinity: Long = 122

public const val SYS_sched_getaffinity: Long = 123

public const val SYS_sched_yield: Long = 124

public const val SYS_sched_get_priority_max: Long = 125

public const val SYS_sched_get_priority_min: Long = 126

public const val SYS_sched_rr_get_interval: Long = 127

public const val SYS_restart_syscall: Long = 128

public const val SYS_kill: Long = 129

public const val SYS_tkill: Long = 130

public const val SYS_tgkill: Long = 131

public const val SYS_sigaltstack: Long = 132

public const val SYS_rt_sigsuspend: Long = 133

public const val SYS_rt_sigaction: Long = 134

public const val SYS_rt_sigprocmask: Long = 135

public const val SYS_rt_sigpending: Long = 136

public const val SYS_rt_sigtimedwait: Long = 137

public const val SYS_rt_sigqueueinfo: Long = 138

public const val SYS_rt_sigreturn: Long = 139

public const val SYS_setpriority: Long = 140

public const val SYS_getpriority: Long = 141

public const val SYS_reboot: Long = 142

public const val SYS_setregid: Long = 143

public const val SYS_setgid: Long = 144

public const val SYS_setreuid: Long = 145

public const val SYS_setuid: Long = 146

public const val SYS_setresuid: Long = 147

public const val SYS_getresuid: Long = 148

public const val SYS_setresgid: Long = 149

public const val SYS_getresgid: Long = 150

public const val SYS_setfsuid: Long = 151

public const val SYS_setfsgid: Long = 152

public const val SYS_times: Long = 153

public const val SYS_setpgid: Long = 154

public const val SYS_getpgid: Long = 155

public const val SYS_getsid: Long = 156

public const val SYS_setsid: Long = 157

public const val SYS_getgroups: Long = 158

public const val SYS_setgroups: Long = 159

public const val SYS_uname: Long = 160

public const val SYS_sethostname: Long = 161

public const val SYS_setdomainname: Long = 162

public const val SYS_getrlimit: Long = 163

public const val SYS_setrlimit: Long = 164

public const val SYS_getrusage: Long = 165

public const val SYS_umask: Long = 166

public const val SYS_prctl: Long = 167

public const val SYS_getcpu: Long = 168

public const val SYS_gettimeofday: Long = 169

public const val SYS_settimeofday: Long = 170

public const val SYS_adjtimex: Long = 171

public const val SYS_getpid: Long = 172

public const val SYS_getppid: Long = 173

public const val SYS_getuid: Long = 174

public const val SYS_geteuid: Long = 175

public const val SYS_getgid: Long = 176

public const val SYS_getegid: Long = 177

public const val SYS_gettid: Long = 178

public const val SYS_sysinfo: Long = 179

public const val SYS_mq_open: Long = 180

public const val SYS_mq_unlink: Long = 181

public const val SYS_mq_timedsend: Long = 182

public const val SYS_mq_timedreceive: Long = 183

public const val SYS_mq_notify: Long = 184

public const val SYS_mq_getsetattr: Long = 185

public const val SYS_msgget: Long = 186

public const val SYS_msgctl: Long = 187

public const val SYS_msgrcv: Long = 188

public const val SYS_msgsnd: Long = 189

public const val SYS_semget: Long = 190

public const val SYS_semctl: Long = 191

public const val SYS_semtimedop: Long = 192

public const val SYS_semop: Long = 193

public const val SYS_shmget: Long = 194

public const val SYS_shmctl: Long = 195

public const val SYS_shmat: Long = 196

public const val SYS_shmdt: Long = 197

public const val SYS_socket: Long = 198

public const val SYS_socketpair: Long = 199

public const val SYS_bind: Long = 200

public const val SYS_listen: Long = 201

public const val SYS_accept: Long = 202

public const val SYS_connect: Long = 203

public const val SYS_getsockname: Long = 204

public const val SYS_getpeername: Long = 205

public const val SYS_sendto: Long = 206

public const val SYS_recvfrom: Long = 207

public const val SYS_setsockopt: Long = 208

public const val SYS_getsockopt: Long = 209

public const val SYS_shutdown: Long = 210

public const val SYS_sendmsg: Long = 211

public const val SYS_recvmsg: Long = 212

public const val SYS_readahead: Long = 213

public const val SYS_brk: Long = 214

public const val SYS_munmap: Long = 215

public const val SYS_mremap: Long = 216

public const val SYS_add_key: Long = 217

public const val SYS_request_key: Long = 218

public const val SYS_keyctl: Long = 219

public const val SYS_clone: Long = 220

public const val SYS_execve: Long = 221

public const val SYS_mmap: Long = 222

public const val SYS_swapon: Long = 224

public const val SYS_swapoff: Long = 225

public const val SYS_mprotect: Long = 226

public const val SYS_msync: Long = 227

public const val SYS_mlock: Long = 228

public const val SYS_munlock: Long = 229

public const val SYS_mlockall: Long = 230

public const val SYS_munlockall: Long = 231

public const val SYS_mincore: Long = 232

public const val SYS_madvise: Long = 233

public const val SYS_remap_file_pages: Long = 234

public const val SYS_mbind: Long = 235

public const val SYS_get_mempolicy: Long = 236

public const val SYS_set_mempolicy: Long = 237

public const val SYS_migrate_pages: Long = 238

public const val SYS_move_pages: Long = 239

public const val SYS_rt_tgsigqueueinfo: Long = 240

public const val SYS_perf_event_open: Long = 241

public const val SYS_accept4: Long = 242

public const val SYS_recvmmsg: Long = 243

public const val SYS_arch_specific_syscall: Long = 244

public const val SYS_wait4: Long = 260

public const val SYS_prlimit64: Long = 261

public const val SYS_fanotify_init: Long = 262

public const val SYS_fanotify_mark: Long = 263

public const val SYS_name_to_handle_at: Long = 264

public const val SYS_open_by_handle_at: Long = 265

public const val SYS_clock_adjtime: Long = 266

public const val SYS_syncfs: Long = 267

public const val SYS_setns: Long = 268

public const val SYS_sendmmsg: Long = 269

public const val SYS_process_vm_readv: Long = 270

public const val SYS_process_vm_writev: Long = 271

public const val SYS_kcmp: Long = 272

public const val SYS_finit_module: Long = 273

public const val SYS_sched_setattr: Long = 274

public const val SYS_sched_getattr: Long = 275

public const val SYS_renameat2: Long = 276

public const val SYS_seccomp: Long = 277

public const val SYS_getrandom: Long = 278

public const val SYS_memfd_create: Long = 279

public const val SYS_bpf: Long = 280

public const val SYS_execveat: Long = 281

public const val SYS_userfaultfd: Long = 282

public const val SYS_membarrier: Long = 283

public const val SYS_mlock2: Long = 284

public const val SYS_copy_file_range: Long = 285

public const val SYS_preadv2: Long = 286

public const val SYS_pwritev2: Long = 287

public const val SYS_pkey_mprotect: Long = 288

public const val SYS_pkey_alloc: Long = 289

public const val SYS_pkey_free: Long = 290

public const val SYS_statx: Long = 291

public const val SYS_pidfd_send_signal: Long = 424

public const val SYS_io_uring_setup: Long = 425

public const val SYS_io_uring_enter: Long = 426

public const val SYS_io_uring_register: Long = 427

public const val SYS_open_tree: Long = 428

public const val SYS_move_mount: Long = 429

public const val SYS_fsopen: Long = 430

public const val SYS_fsconfig: Long = 431

public const val SYS_fsmount: Long = 432

public const val SYS_fspick: Long = 433

public const val SYS_pidfd_open: Long = 434

public const val SYS_clone3: Long = 435

public const val SYS_close_range: Long = 436

public const val SYS_openat2: Long = 437

public const val SYS_pidfd_getfd: Long = 438

public const val SYS_faccessat2: Long = 439

public const val SYS_process_madvise: Long = 440

public const val SYS_epoll_pwait2: Long = 441

public const val SYS_mount_setattr: Long = 442

public const val SYS_quotactl_fd: Long = 443

public const val SYS_landlock_create_ruleset: Long = 444

public const val SYS_landlock_add_rule: Long = 445

public const val SYS_landlock_restrict_self: Long = 446

public const val SYS_memfd_secret: Long = 447

public const val SYS_process_mrelease: Long = 448

public const val SYS_futex_waitv: Long = 449

public const val SYS_set_mempolicy_home_node: Long = 450

public const val SYS_syscalls: Long = 451

public const val PROT_BTI: Int = 0x10

public const val PROT_MTE: Int = 0x20

public const val AT_SYSINFO_EHDR: ULong = 33uL

public const val AT_VECTOR_SIZE_ARCH: ULong = 2uL
