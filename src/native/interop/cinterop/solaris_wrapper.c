#include "solaris_wrapper.h"
#include <errno.h>

int32_t libc_solaris_fexecve(int32_t fd, void* argv, void* envp) {
    return (int32_t)fexecve(fd, argv, envp);
}

int32_t libc_solaris_mincore(void* addr, uint64_t len, char* vec) {
    return (int32_t)mincore(addr, len, vec);
}

int32_t libc_solaris_door_call(int32_t d, void* params) {
    return (int32_t)door_call(d, params);
}

int32_t libc_solaris_door_return(char* data_ptr, uint64_t data_size, void* desc_ptr, uint32_t num_desc) {
    return (int32_t)door_return(data_ptr, data_size, desc_ptr, num_desc);
}

int32_t libc_solaris_door_create(int32_t server_procedure, void* cookie, uint32_t attributes) {
    return (int32_t)door_create(server_procedure, cookie, attributes);
}

int32_t libc_solaris_fattach(int32_t fildes, const char* path) {
    return (int32_t)fattach(fildes, path);
}

int32_t libc_solaris_pthread_getattr_np(int32_t thread, void* attr) {
    return (int32_t)pthread_getattr_np(thread, attr);
}

int32_t libc_solaris_euidaccess(const char* path, int32_t amode) {
    return (int32_t)euidaccess(path, amode);
}

int32_t libc_solaris_openpty(void* amain, void* asubord, char* name, void* termp, void* winp) {
    return (int32_t)openpty(amain, asubord, name, termp, winp);
}

int32_t libc_solaris_forkpty(void* amain, char* name, void* termp, void* winp) {
    return (int32_t)forkpty(amain, name, termp, winp);
}

