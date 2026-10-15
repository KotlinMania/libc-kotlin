package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.mips64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.PthreadMutexT

public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 40uL

public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 56uL

public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 32uL

public val PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

public val PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

public val PTHREAD_ADAPTIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = PthreadMutexT(size = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

public const val SYS_read: Long = 5000 + 0

public const val SYS_write: Long = 5000 + 1

public const val SYS_open: Long = 5000 + 2

public const val SYS_close: Long = 5000 + 3

public const val SYS_stat: Long = 5000 + 4

public const val SYS_fstat: Long = 5000 + 5

public const val SYS_lstat: Long = 5000 + 6

public const val SYS_poll: Long = 5000 + 7

public const val SYS_lseek: Long = 5000 + 8

public const val SYS_mmap: Long = 5000 + 9

public const val SYS_mprotect: Long = 5000 + 10

public const val SYS_munmap: Long = 5000 + 11

public const val SYS_brk: Long = 5000 + 12

public const val SYS_rt_sigaction: Long = 5000 + 13

public const val SYS_rt_sigprocmask: Long = 5000 + 14

public const val SYS_ioctl: Long = 5000 + 15

public const val SYS_pread64: Long = 5000 + 16

public const val SYS_pwrite64: Long = 5000 + 17

public const val SYS_readv: Long = 5000 + 18

public const val SYS_writev: Long = 5000 + 19

public const val SYS_access: Long = 5000 + 20

public const val SYS_pipe: Long = 5000 + 21

public const val SYS__newselect: Long = 5000 + 22

public const val SYS_sched_yield: Long = 5000 + 23

public const val SYS_mremap: Long = 5000 + 24

public const val SYS_msync: Long = 5000 + 25

public const val SYS_mincore: Long = 5000 + 26

public const val SYS_madvise: Long = 5000 + 27

public const val SYS_shmget: Long = 5000 + 28

public const val SYS_shmat: Long = 5000 + 29

public const val SYS_shmctl: Long = 5000 + 30

public const val SYS_dup: Long = 5000 + 31

public const val SYS_dup2: Long = 5000 + 32

public const val SYS_pause: Long = 5000 + 33

public const val SYS_nanosleep: Long = 5000 + 34

public const val SYS_getitimer: Long = 5000 + 35

public const val SYS_setitimer: Long = 5000 + 36

public const val SYS_alarm: Long = 5000 + 37

public const val SYS_getpid: Long = 5000 + 38

public const val SYS_sendfile: Long = 5000 + 39

public const val SYS_socket: Long = 5000 + 40

public const val SYS_connect: Long = 5000 + 41

public const val SYS_accept: Long = 5000 + 42

public const val SYS_sendto: Long = 5000 + 43

public const val SYS_recvfrom: Long = 5000 + 44

public const val SYS_sendmsg: Long = 5000 + 45

public const val SYS_recvmsg: Long = 5000 + 46

public const val SYS_shutdown: Long = 5000 + 47

public const val SYS_bind: Long = 5000 + 48

public const val SYS_listen: Long = 5000 + 49

public const val SYS_getsockname: Long = 5000 + 50

public const val SYS_getpeername: Long = 5000 + 51

public const val SYS_socketpair: Long = 5000 + 52

public const val SYS_setsockopt: Long = 5000 + 53

public const val SYS_getsockopt: Long = 5000 + 54

public const val SYS_clone: Long = 5000 + 55

public const val SYS_fork: Long = 5000 + 56

public const val SYS_execve: Long = 5000 + 57

public const val SYS_exit: Long = 5000 + 58

public const val SYS_wait4: Long = 5000 + 59

public const val SYS_kill: Long = 5000 + 60

public const val SYS_uname: Long = 5000 + 61

public const val SYS_semget: Long = 5000 + 62

public const val SYS_semop: Long = 5000 + 63

public const val SYS_semctl: Long = 5000 + 64

public const val SYS_shmdt: Long = 5000 + 65

public const val SYS_msgget: Long = 5000 + 66

public const val SYS_msgsnd: Long = 5000 + 67

public const val SYS_msgrcv: Long = 5000 + 68

public const val SYS_msgctl: Long = 5000 + 69

public const val SYS_fcntl: Long = 5000 + 70

public const val SYS_flock: Long = 5000 + 71

public const val SYS_fsync: Long = 5000 + 72

public const val SYS_fdatasync: Long = 5000 + 73

public const val SYS_truncate: Long = 5000 + 74

public const val SYS_ftruncate: Long = 5000 + 75

public const val SYS_getdents: Long = 5000 + 76

public const val SYS_getcwd: Long = 5000 + 77

public const val SYS_chdir: Long = 5000 + 78

public const val SYS_fchdir: Long = 5000 + 79

public const val SYS_rename: Long = 5000 + 80

public const val SYS_mkdir: Long = 5000 + 81

public const val SYS_rmdir: Long = 5000 + 82

public const val SYS_creat: Long = 5000 + 83

public const val SYS_link: Long = 5000 + 84

public const val SYS_unlink: Long = 5000 + 85

public const val SYS_symlink: Long = 5000 + 86

public const val SYS_readlink: Long = 5000 + 87

public const val SYS_chmod: Long = 5000 + 88

public const val SYS_fchmod: Long = 5000 + 89

public const val SYS_chown: Long = 5000 + 90

public const val SYS_fchown: Long = 5000 + 91

public const val SYS_lchown: Long = 5000 + 92

public const val SYS_umask: Long = 5000 + 93

public const val SYS_gettimeofday: Long = 5000 + 94

public const val SYS_getrlimit: Long = 5000 + 95

public const val SYS_getrusage: Long = 5000 + 96

public const val SYS_sysinfo: Long = 5000 + 97

public const val SYS_times: Long = 5000 + 98

public const val SYS_ptrace: Long = 5000 + 99

public const val SYS_getuid: Long = 5000 + 100

public const val SYS_syslog: Long = 5000 + 101

public const val SYS_getgid: Long = 5000 + 102

public const val SYS_setuid: Long = 5000 + 103

public const val SYS_setgid: Long = 5000 + 104

public const val SYS_geteuid: Long = 5000 + 105

public const val SYS_getegid: Long = 5000 + 106

public const val SYS_setpgid: Long = 5000 + 107

public const val SYS_getppid: Long = 5000 + 108

public const val SYS_getpgrp: Long = 5000 + 109

public const val SYS_setsid: Long = 5000 + 110

public const val SYS_setreuid: Long = 5000 + 111

public const val SYS_setregid: Long = 5000 + 112

public const val SYS_getgroups: Long = 5000 + 113

public const val SYS_setgroups: Long = 5000 + 114

public const val SYS_setresuid: Long = 5000 + 115

public const val SYS_getresuid: Long = 5000 + 116

public const val SYS_setresgid: Long = 5000 + 117

public const val SYS_getresgid: Long = 5000 + 118

public const val SYS_getpgid: Long = 5000 + 119

public const val SYS_setfsuid: Long = 5000 + 120

public const val SYS_setfsgid: Long = 5000 + 121

public const val SYS_getsid: Long = 5000 + 122

public const val SYS_capget: Long = 5000 + 123

public const val SYS_capset: Long = 5000 + 124

public const val SYS_rt_sigpending: Long = 5000 + 125

public const val SYS_rt_sigtimedwait: Long = 5000 + 126

public const val SYS_rt_sigqueueinfo: Long = 5000 + 127

public const val SYS_rt_sigsuspend: Long = 5000 + 128

public const val SYS_sigaltstack: Long = 5000 + 129

public const val SYS_utime: Long = 5000 + 130

public const val SYS_mknod: Long = 5000 + 131

public const val SYS_personality: Long = 5000 + 132

public const val SYS_ustat: Long = 5000 + 133

public const val SYS_statfs: Long = 5000 + 134

public const val SYS_fstatfs: Long = 5000 + 135

public const val SYS_sysfs: Long = 5000 + 136

public const val SYS_getpriority: Long = 5000 + 137

public const val SYS_setpriority: Long = 5000 + 138

public const val SYS_sched_setparam: Long = 5000 + 139

public const val SYS_sched_getparam: Long = 5000 + 140

public const val SYS_sched_setscheduler: Long = 5000 + 141

public const val SYS_sched_getscheduler: Long = 5000 + 142

public const val SYS_sched_get_priority_max: Long = 5000 + 143

public const val SYS_sched_get_priority_min: Long = 5000 + 144

public const val SYS_sched_rr_get_interval: Long = 5000 + 145

public const val SYS_mlock: Long = 5000 + 146

public const val SYS_munlock: Long = 5000 + 147

public const val SYS_mlockall: Long = 5000 + 148

public const val SYS_munlockall: Long = 5000 + 149

public const val SYS_vhangup: Long = 5000 + 150

public const val SYS_pivot_root: Long = 5000 + 151

public const val SYS__sysctl: Long = 5000 + 152

public const val SYS_prctl: Long = 5000 + 153

public const val SYS_adjtimex: Long = 5000 + 154

public const val SYS_setrlimit: Long = 5000 + 155

public const val SYS_chroot: Long = 5000 + 156

public const val SYS_sync: Long = 5000 + 157

public const val SYS_acct: Long = 5000 + 158

public const val SYS_settimeofday: Long = 5000 + 159

public const val SYS_mount: Long = 5000 + 160

public const val SYS_umount2: Long = 5000 + 161

public const val SYS_swapon: Long = 5000 + 162

public const val SYS_swapoff: Long = 5000 + 163

public const val SYS_reboot: Long = 5000 + 164

public const val SYS_sethostname: Long = 5000 + 165

public const val SYS_setdomainname: Long = 5000 + 166

public const val SYS_create_module: Long = 5000 + 167

public const val SYS_init_module: Long = 5000 + 168

public const val SYS_delete_module: Long = 5000 + 169

public const val SYS_get_kernel_syms: Long = 5000 + 170

public const val SYS_query_module: Long = 5000 + 171

public const val SYS_quotactl: Long = 5000 + 172

public const val SYS_nfsservctl: Long = 5000 + 173

public const val SYS_getpmsg: Long = 5000 + 174

public const val SYS_putpmsg: Long = 5000 + 175

public const val SYS_afs_syscall: Long = 5000 + 176

public const val SYS_gettid: Long = 5000 + 178

public const val SYS_readahead: Long = 5000 + 179

public const val SYS_setxattr: Long = 5000 + 180

public const val SYS_lsetxattr: Long = 5000 + 181

public const val SYS_fsetxattr: Long = 5000 + 182

public const val SYS_getxattr: Long = 5000 + 183

public const val SYS_lgetxattr: Long = 5000 + 184

public const val SYS_fgetxattr: Long = 5000 + 185

public const val SYS_listxattr: Long = 5000 + 186

public const val SYS_llistxattr: Long = 5000 + 187

public const val SYS_flistxattr: Long = 5000 + 188

public const val SYS_removexattr: Long = 5000 + 189

public const val SYS_lremovexattr: Long = 5000 + 190

public const val SYS_fremovexattr: Long = 5000 + 191

public const val SYS_tkill: Long = 5000 + 192

public const val SYS_futex: Long = 5000 + 194

public const val SYS_sched_setaffinity: Long = 5000 + 195

public const val SYS_sched_getaffinity: Long = 5000 + 196

public const val SYS_cacheflush: Long = 5000 + 197

public const val SYS_cachectl: Long = 5000 + 198

public const val SYS_sysmips: Long = 5000 + 199

public const val SYS_io_setup: Long = 5000 + 200

public const val SYS_io_destroy: Long = 5000 + 201

public const val SYS_io_getevents: Long = 5000 + 202

public const val SYS_io_submit: Long = 5000 + 203

public const val SYS_io_cancel: Long = 5000 + 204

public const val SYS_exit_group: Long = 5000 + 205

public const val SYS_lookup_dcookie: Long = 5000 + 206

public const val SYS_epoll_create: Long = 5000 + 207

public const val SYS_epoll_ctl: Long = 5000 + 208

public const val SYS_epoll_wait: Long = 5000 + 209

public const val SYS_remap_file_pages: Long = 5000 + 210

public const val SYS_rt_sigreturn: Long = 5000 + 211

public const val SYS_set_tid_address: Long = 5000 + 212

public const val SYS_restart_syscall: Long = 5000 + 213

public const val SYS_semtimedop: Long = 5000 + 214

public const val SYS_fadvise64: Long = 5000 + 215

public const val SYS_timer_create: Long = 5000 + 216

public const val SYS_timer_settime: Long = 5000 + 217

public const val SYS_timer_gettime: Long = 5000 + 218

public const val SYS_timer_getoverrun: Long = 5000 + 219

public const val SYS_timer_delete: Long = 5000 + 220

public const val SYS_clock_settime: Long = 5000 + 221

public const val SYS_clock_gettime: Long = 5000 + 222

public const val SYS_clock_getres: Long = 5000 + 223

public const val SYS_clock_nanosleep: Long = 5000 + 224

public const val SYS_tgkill: Long = 5000 + 225

public const val SYS_utimes: Long = 5000 + 226

public const val SYS_mbind: Long = 5000 + 227

public const val SYS_get_mempolicy: Long = 5000 + 228

public const val SYS_set_mempolicy: Long = 5000 + 229

public const val SYS_mq_open: Long = 5000 + 230

public const val SYS_mq_unlink: Long = 5000 + 231

public const val SYS_mq_timedsend: Long = 5000 + 232

public const val SYS_mq_timedreceive: Long = 5000 + 233

public const val SYS_mq_notify: Long = 5000 + 234

public const val SYS_mq_getsetattr: Long = 5000 + 235

public const val SYS_vserver: Long = 5000 + 236

public const val SYS_waitid: Long = 5000 + 237

public const val SYS_sys_setaltroot: Long = 5000 + 238

public const val SYS_add_key: Long = 5000 + 239

public const val SYS_request_key: Long = 5000 + 240

public const val SYS_keyctl: Long = 5000 + 241

public const val SYS_set_thread_area: Long = 5000 + 242

public const val SYS_inotify_init: Long = 5000 + 243

public const val SYS_inotify_add_watch: Long = 5000 + 244

public const val SYS_inotify_rm_watch: Long = 5000 + 245

public const val SYS_migrate_pages: Long = 5000 + 246

public const val SYS_openat: Long = 5000 + 247

public const val SYS_mkdirat: Long = 5000 + 248

public const val SYS_mknodat: Long = 5000 + 249

public const val SYS_fchownat: Long = 5000 + 250

public const val SYS_futimesat: Long = 5000 + 251

public const val SYS_newfstatat: Long = 5000 + 252

public const val SYS_unlinkat: Long = 5000 + 253

public const val SYS_renameat: Long = 5000 + 254

public const val SYS_linkat: Long = 5000 + 255

public const val SYS_symlinkat: Long = 5000 + 256

public const val SYS_readlinkat: Long = 5000 + 257

public const val SYS_fchmodat: Long = 5000 + 258

public const val SYS_faccessat: Long = 5000 + 259

public const val SYS_pselect6: Long = 5000 + 260

public const val SYS_ppoll: Long = 5000 + 261

public const val SYS_unshare: Long = 5000 + 262

public const val SYS_splice: Long = 5000 + 263

public const val SYS_sync_file_range: Long = 5000 + 264

public const val SYS_tee: Long = 5000 + 265

public const val SYS_vmsplice: Long = 5000 + 266

public const val SYS_move_pages: Long = 5000 + 267

public const val SYS_set_robust_list: Long = 5000 + 268

public const val SYS_get_robust_list: Long = 5000 + 269

public const val SYS_kexec_load: Long = 5000 + 270

public const val SYS_getcpu: Long = 5000 + 271

public const val SYS_epoll_pwait: Long = 5000 + 272

public const val SYS_ioprio_set: Long = 5000 + 273

public const val SYS_ioprio_get: Long = 5000 + 274

public const val SYS_utimensat: Long = 5000 + 275

public const val SYS_signalfd: Long = 5000 + 276

public const val SYS_timerfd: Long = 5000 + 277

public const val SYS_eventfd: Long = 5000 + 278

public const val SYS_fallocate: Long = 5000 + 279

public const val SYS_timerfd_create: Long = 5000 + 280

public const val SYS_timerfd_gettime: Long = 5000 + 281

public const val SYS_timerfd_settime: Long = 5000 + 282

public const val SYS_signalfd4: Long = 5000 + 283

public const val SYS_eventfd2: Long = 5000 + 284

public const val SYS_epoll_create1: Long = 5000 + 285

public const val SYS_dup3: Long = 5000 + 286

public const val SYS_pipe2: Long = 5000 + 287

public const val SYS_inotify_init1: Long = 5000 + 288

public const val SYS_preadv: Long = 5000 + 289

public const val SYS_pwritev: Long = 5000 + 290

public const val SYS_rt_tgsigqueueinfo: Long = 5000 + 291

public const val SYS_perf_event_open: Long = 5000 + 292

public const val SYS_accept4: Long = 5000 + 293

public const val SYS_recvmmsg: Long = 5000 + 294

public const val SYS_fanotify_init: Long = 5000 + 295

public const val SYS_fanotify_mark: Long = 5000 + 296

public const val SYS_prlimit64: Long = 5000 + 297

public const val SYS_name_to_handle_at: Long = 5000 + 298

public const val SYS_open_by_handle_at: Long = 5000 + 299

public const val SYS_clock_adjtime: Long = 5000 + 300

public const val SYS_syncfs: Long = 5000 + 301

public const val SYS_sendmmsg: Long = 5000 + 302

public const val SYS_setns: Long = 5000 + 303

public const val SYS_process_vm_readv: Long = 5000 + 304

public const val SYS_process_vm_writev: Long = 5000 + 305

public const val SYS_kcmp: Long = 5000 + 306

public const val SYS_finit_module: Long = 5000 + 307

public const val SYS_getdents64: Long = 5000 + 308

public const val SYS_sched_setattr: Long = 5000 + 309

public const val SYS_sched_getattr: Long = 5000 + 310

public const val SYS_renameat2: Long = 5000 + 311

public const val SYS_seccomp: Long = 5000 + 312

public const val SYS_getrandom: Long = 5000 + 313

public const val SYS_memfd_create: Long = 5000 + 314

public const val SYS_bpf: Long = 5000 + 315

public const val SYS_execveat: Long = 5000 + 316

public const val SYS_userfaultfd: Long = 5000 + 317

public const val SYS_membarrier: Long = 5000 + 318

public const val SYS_mlock2: Long = 5000 + 319

public const val SYS_copy_file_range: Long = 5000 + 320

public const val SYS_preadv2: Long = 5000 + 321

public const val SYS_pwritev2: Long = 5000 + 322

public const val SYS_pkey_mprotect: Long = 5000 + 323

public const val SYS_pkey_alloc: Long = 5000 + 324

public const val SYS_pkey_free: Long = 5000 + 325

public const val SYS_statx: Long = 5000 + 326

public const val SYS_rseq: Long = 5000 + 327

public const val SYS_pidfd_send_signal: Long = 5000 + 424

public const val SYS_io_uring_setup: Long = 5000 + 425

public const val SYS_io_uring_enter: Long = 5000 + 426

public const val SYS_io_uring_register: Long = 5000 + 427

public const val SYS_open_tree: Long = 5000 + 428

public const val SYS_move_mount: Long = 5000 + 429

public const val SYS_fsopen: Long = 5000 + 430

public const val SYS_fsconfig: Long = 5000 + 431

public const val SYS_fsmount: Long = 5000 + 432

public const val SYS_fspick: Long = 5000 + 433

public const val SYS_pidfd_open: Long = 5000 + 434

public const val SYS_clone3: Long = 5000 + 435

public const val SYS_close_range: Long = 5000 + 436

public const val SYS_openat2: Long = 5000 + 437

public const val SYS_pidfd_getfd: Long = 5000 + 438

public const val SYS_faccessat2: Long = 5000 + 439

public const val SYS_process_madvise: Long = 5000 + 440

public const val SYS_epoll_pwait2: Long = 5000 + 441

public const val SYS_mount_setattr: Long = 5000 + 442

public const val SYS_quotactl_fd: Long = 5000 + 443

public const val SYS_landlock_create_ruleset: Long = 5000 + 444

public const val SYS_landlock_add_rule: Long = 5000 + 445

public const val SYS_landlock_restrict_self: Long = 5000 + 446

public const val SYS_memfd_secret: Long = 5000 + 447

public const val SYS_process_mrelease: Long = 5000 + 448

public const val SYS_futex_waitv: Long = 5000 + 449

public const val SYS_set_mempolicy_home_node: Long = 5000 + 450

public const val SFD_CLOEXEC: Int = 0x080000

public const val NCCS: ULong = 32uL

public const val O_TRUNC: Int = 512

public const val O_NOATIME: Int = 262144

public const val O_CLOEXEC: Int = 0x80000

public const val O_PATH: Int = 2097152

public val O_TMPFILE: Int = 4194304 or O_DIRECTORY

public const val EBFONT: Int = 59

public const val ENOSTR: Int = 60

public const val ENODATA: Int = 61

public const val ETIME: Int = 62

public const val ENOSR: Int = 63

public const val ENONET: Int = 64

public const val ENOPKG: Int = 65

public const val EREMOTE: Int = 66

public const val ENOLINK: Int = 67

public const val EADV: Int = 68

public const val ESRMNT: Int = 69

public const val ECOMM: Int = 70

public const val EPROTO: Int = 71

public const val EDOTDOT: Int = 73

public const val SA_NODEFER: Int = 0x40000000

public const val SA_RESETHAND: Int = 0x80000000.toInt()

public const val SA_RESTART: Int = 0x10000000

public const val SA_NOCLDSTOP: Int = 0x00000001

public const val POSIX_FADV_DONTNEED: Int = 4

public const val POSIX_FADV_NOREUSE: Int = 5

public const val EPOLL_CLOEXEC: Int = 0x80000

public const val EFD_CLOEXEC: Int = 0x80000

public const val O_DIRECT: Int = 0x8000

public const val O_DIRECTORY: Int = 0x10000

public const val O_NOFOLLOW: Int = 0x20000

public const val O_APPEND: Int = 8

public const val O_CREAT: Int = 256

public const val O_EXCL: Int = 1024

public const val O_NOCTTY: Int = 2048

public const val O_NONBLOCK: Int = 128

public const val O_SYNC: Int = 0x4010

public const val O_RSYNC: Int = 0x4010

public const val O_DSYNC: Int = 0x10

public const val O_FSYNC: Int = 0x4010

public const val O_ASYNC: Int = 0x1000

public const val O_NDELAY: Int = 0x80

public const val EDEADLK: Int = 45

public const val ENAMETOOLONG: Int = 78

public const val ENOLCK: Int = 46

public const val ENOSYS: Int = 89

public const val ENOTEMPTY: Int = 93

public const val ELOOP: Int = 90

public const val ENOMSG: Int = 35

public const val EIDRM: Int = 36

public const val ECHRNG: Int = 37

public const val EL2NSYNC: Int = 38

public const val EL3HLT: Int = 39

public const val EL3RST: Int = 40

public const val ELNRNG: Int = 41

public const val EUNATCH: Int = 42

public const val ENOCSI: Int = 43

public const val EL2HLT: Int = 44

public const val EBADE: Int = 50

public const val EBADR: Int = 51

public const val EXFULL: Int = 52

public const val ENOANO: Int = 53

public const val EBADRQC: Int = 54

public const val EBADSLT: Int = 55

public const val EDEADLOCK: Int = 56

public const val EMULTIHOP: Int = 74

public const val EOVERFLOW: Int = 79

public const val ENOTUNIQ: Int = 80

public const val EBADFD: Int = 81

public const val EBADMSG: Int = 77

public const val EREMCHG: Int = 82

public const val ELIBACC: Int = 83

public const val ELIBBAD: Int = 84

public const val ELIBSCN: Int = 85

public const val ELIBMAX: Int = 86

public const val ELIBEXEC: Int = 87

public const val EILSEQ: Int = 88

public const val ERESTART: Int = 91

public const val ESTRPIPE: Int = 92

public const val EUSERS: Int = 94

public const val ENOTSOCK: Int = 95

public const val EDESTADDRREQ: Int = 96

public const val EMSGSIZE: Int = 97

public const val EPROTOTYPE: Int = 98

public const val ENOPROTOOPT: Int = 99

public const val EPROTONOSUPPORT: Int = 120

public const val ESOCKTNOSUPPORT: Int = 121

public const val EOPNOTSUPP: Int = 122

public const val EPFNOSUPPORT: Int = 123

public const val EAFNOSUPPORT: Int = 124

public const val EADDRINUSE: Int = 125

public const val EADDRNOTAVAIL: Int = 126

public const val ENETDOWN: Int = 127

public const val ENETUNREACH: Int = 128

public const val ENETRESET: Int = 129

public const val ECONNABORTED: Int = 130

public const val ECONNRESET: Int = 131

public const val ENOBUFS: Int = 132

public const val EISCONN: Int = 133

public const val ENOTCONN: Int = 134

public const val ESHUTDOWN: Int = 143

public const val ETOOMANYREFS: Int = 144

public const val ETIMEDOUT: Int = 145

public const val ECONNREFUSED: Int = 146

public const val EHOSTDOWN: Int = 147

public const val EHOSTUNREACH: Int = 148

public const val EALREADY: Int = 149

public const val EINPROGRESS: Int = 150

public const val ESTALE: Int = 151

public const val EUCLEAN: Int = 135

public const val ENOTNAM: Int = 137

public const val ENAVAIL: Int = 138

public const val EISNAM: Int = 139

public const val EREMOTEIO: Int = 140

public const val EDQUOT: Int = 1133

public const val ENOMEDIUM: Int = 159

public const val EMEDIUMTYPE: Int = 160

public const val ECANCELED: Int = 158

public const val ENOKEY: Int = 161

public const val EKEYEXPIRED: Int = 162

public const val EKEYREVOKED: Int = 163

public const val EKEYREJECTED: Int = 164

public const val EOWNERDEAD: Int = 165

public const val ENOTRECOVERABLE: Int = 166

public const val ERFKILL: Int = 167

public const val MAP_NORESERVE: Int = 0x400

public const val MAP_ANON: Int = 0x800

public const val MAP_ANONYMOUS: Int = 0x800

public const val MAP_GROWSDOWN: Int = 0x1000

public const val MAP_DENYWRITE: Int = 0x2000

public const val MAP_EXECUTABLE: Int = 0x4000

public const val MAP_LOCKED: Int = 0x8000

public const val MAP_POPULATE: Int = 0x10000

public const val MAP_NONBLOCK: Int = 0x20000

public const val MAP_STACK: Int = 0x40000

public const val MAP_HUGETLB: Int = 0x080000

public const val SOCK_STREAM: Int = 2

public const val SOCK_DGRAM: Int = 1

public const val SA_ONSTACK: Int = 0x08000000

public const val SA_SIGINFO: Int = 0x00000008

public const val SA_NOCLDWAIT: Int = 0x00010000

public const val SIGEMT: Int = 7

public const val SIGCHLD: Int = 18

public const val SIGBUS: Int = 10

public const val SIGTTIN: Int = 26

public const val SIGTTOU: Int = 27

public const val SIGXCPU: Int = 30

public const val SIGXFSZ: Int = 31

public const val SIGVTALRM: Int = 28

public const val SIGPROF: Int = 29

public const val SIGWINCH: Int = 20

public const val SIGUSR1: Int = 16

public const val SIGUSR2: Int = 17

public const val SIGCONT: Int = 25

public const val SIGSTOP: Int = 23

public const val SIGTSTP: Int = 24

public const val SIGURG: Int = 21

public const val SIGIO: Int = 22

public const val SIGSYS: Int = 12

public const val SIGPOLL: Int = 22

public const val SIGPWR: Int = 19

public const val SIG_SETMASK: Int = 3

public const val SIG_BLOCK: Int = 0x1

public const val SIG_UNBLOCK: Int = 0x2

public const val POLLWRNORM: Short = 0x004

public const val POLLWRBAND: Short = 0x100

public const val VEOF: ULong = 16uL

public const val VEOL: ULong = 17uL

public const val VEOL2: ULong = 6uL

public const val VMIN: ULong = 4uL

public const val IEXTEN: UInt = 0x00000100u

public const val TOSTOP: UInt = 0x00008000u

public const val FLUSHO: UInt = 0x00002000u

public const val EXTPROC: UInt = 65536u

public const val TCSANOW: Int = 0x540e

public const val TCSADRAIN: Int = 0x540f

public const val TCSAFLUSH: Int = 0x5410

public const val PTRACE_GETFPREGS: UInt = 14u

public const val PTRACE_SETFPREGS: UInt = 15u

public const val PTRACE_DETACH: UInt = 17u

public const val PTRACE_GETFPXREGS: UInt = 18u

public const val PTRACE_SETFPXREGS: UInt = 19u

public const val PTRACE_GETREGS: UInt = 12u

public const val PTRACE_SETREGS: UInt = 13u

public const val EFD_NONBLOCK: Int = 0x80

public const val F_RDLCK: Int = 0

public const val F_WRLCK: Int = 1

public const val F_UNLCK: Int = 2

public const val F_GETLK: Int = 14

public const val F_GETOWN: Int = 23

public const val F_SETOWN: Int = 24

public const val F_SETLK: Int = 6

public const val F_SETLKW: Int = 7

public const val F_OFD_GETLK: Int = 36

public const val F_OFD_SETLK: Int = 37

public const val F_OFD_SETLKW: Int = 38

public const val SFD_NONBLOCK: Int = 0x80

public const val RTLD_DEEPBIND: Int = 0x10

public const val RTLD_GLOBAL: Int = 0x4

public const val RTLD_NOLOAD: Int = 0x8

public const val MCL_CURRENT: Int = 0x0001

public const val MCL_FUTURE: Int = 0x0002

public const val MCL_ONFAULT: Int = 0x0004

public const val SIGSTKSZ: ULong = 8192uL

public const val MINSIGSTKSZ: ULong = 2048uL

public const val CBAUD: UInt = 4111u

public const val TAB1: UInt = 0x00000800u

public const val TAB2: UInt = 0x00001000u

public const val TAB3: UInt = 0x00001800u

public const val CR1: UInt = 0x00000200u

public const val CR2: UInt = 0x00000400u

public const val CR3: UInt = 0x00000600u

public const val FF1: UInt = 0x00008000u

public const val BS1: UInt = 0x00002000u

public const val VT1: UInt = 0x00004000u

public const val VWERASE: ULong = 14uL

public const val VREPRINT: ULong = 12uL

public const val VSUSP: ULong = 10uL

public const val VSTART: ULong = 8uL

public const val VSTOP: ULong = 9uL

public const val VDISCARD: ULong = 13uL

public const val VTIME: ULong = 5uL

public const val IXON: UInt = 0x00000400u

public const val IXOFF: UInt = 0x00001000u

public const val ONLCR: UInt = 0x4u

public const val CSIZE: UInt = 0x00000030u

public const val CS6: UInt = 0x00000010u

public const val CS7: UInt = 0x00000020u

public const val CS8: UInt = 0x00000030u

public const val CSTOPB: UInt = 0x00000040u

public const val CREAD: UInt = 0x00000080u

public const val PARENB: UInt = 0x00000100u

public const val PARODD: UInt = 0x00000200u

public const val HUPCL: UInt = 0x00000400u

public const val CLOCAL: UInt = 0x00000800u

public const val ECHOKE: UInt = 0x00000800u

public const val ECHOE: UInt = 0x00000010u

public const val ECHOK: UInt = 0x00000020u

public const val ECHONL: UInt = 0x00000040u

public const val ECHOPRT: UInt = 0x00000400u

public const val ECHOCTL: UInt = 0x00000200u

public const val ISIG: UInt = 0x00000001u

public const val ICANON: UInt = 0x00000002u

public const val PENDIN: UInt = 0x00004000u

public const val NOFLSH: UInt = 0x00000080u

public const val CIBAUD: UInt = 269418496u

public const val CBAUDEX: UInt = 4096u

public const val VSWTC: ULong = 7uL

public const val OLCUC: UInt = 2u

public const val NLDLY: UInt = 256u

public const val CRDLY: UInt = 1536u

public const val TABDLY: UInt = 6144u

public const val BSDLY: UInt = 8192u

public const val FFDLY: UInt = 32768u

public const val VTDLY: UInt = 16384u

public const val XTABS: UInt = 6144u

public const val B0: UInt = 0u

public const val B50: UInt = 1u

public const val B75: UInt = 2u

public const val B110: UInt = 3u

public const val B134: UInt = 4u

public const val B150: UInt = 5u

public const val B200: UInt = 6u

public const val B300: UInt = 7u

public const val B600: UInt = 8u

public const val B1200: UInt = 9u

public const val B1800: UInt = 10u

public const val B2400: UInt = 11u

public const val B4800: UInt = 12u

public const val B9600: UInt = 13u

public const val B19200: UInt = 14u

public const val B38400: UInt = 15u

public const val EXTA: UInt = B19200

public const val EXTB: UInt = B38400

public const val B57600: UInt = 4097u

public const val B115200: UInt = 4098u

public const val B230400: UInt = 4099u

public const val B460800: UInt = 4100u

public const val B500000: UInt = 4101u

public const val B576000: UInt = 4102u

public const val B921600: UInt = 4103u

public const val B1000000: UInt = 4104u

public const val B1152000: UInt = 4105u

public const val B1500000: UInt = 4106u

public const val B2000000: UInt = 4107u

public const val B2500000: UInt = 4108u

public const val B3000000: UInt = 4109u

public const val B3500000: UInt = 4110u

public const val B4000000: UInt = 4111u

public const val EHWPOISON: Int = 168
