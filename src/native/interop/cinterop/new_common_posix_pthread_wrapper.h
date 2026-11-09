#ifndef LIBC_NEW_COMMON_POSIX_PTHREAD_NEW_COMMON_POSIX_PTHREAD_WRAPPER_H
#define LIBC_NEW_COMMON_POSIX_PTHREAD_NEW_COMMON_POSIX_PTHREAD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_new_common_posix_pthread_pthreadAtfork(void* prepare, void* parent, void* child);
int32_t libc_new_common_posix_pthread_pthreadAttrGetguardsize(void* attr, void* guardsize);
int32_t libc_new_common_posix_pthread_pthreadAttrGetinheritsched(void* attr, void* inheritsched);
int32_t libc_new_common_posix_pthread_pthreadAttrGetschedparam(void* attr, void* param);
int32_t libc_new_common_posix_pthread_pthreadAttrGetschedpolicy(void* attr, void* policy);
int32_t libc_new_common_posix_pthread_pthreadAttrGetstack(void* attr, void* stackaddr, void* stacksize);
int32_t libc_new_common_posix_pthread_pthreadAttrSetguardsize(void* attr, uint64_t guardsize);
int32_t libc_new_common_posix_pthread_pthreadAttrSetinheritsched(void* attr, int32_t inheritsched);
int32_t libc_new_common_posix_pthread_pthreadAttrSetschedparam(void* attr, void* param);
int32_t libc_new_common_posix_pthread_pthreadAttrSetschedpolicy(void* attr, int32_t policy);
int32_t libc_new_common_posix_pthread_pthreadAttrSetstack(void* attr, void* stackaddr, uint64_t stacksize);
int32_t libc_new_common_posix_pthread_pthreadBarrierDestroy(void* barrier);
int32_t libc_new_common_posix_pthread_pthreadBarrierInit(void* barrier, void* attr, uint32_t count);
int32_t libc_new_common_posix_pthread_pthreadBarrierWait(void* barrier);
int32_t libc_new_common_posix_pthread_pthreadBarrierattrDestroy(void* attr);
int32_t libc_new_common_posix_pthread_pthreadBarrierattrGetpshared(void* attr, void* shared);
int32_t libc_new_common_posix_pthread_pthreadBarrierattrInit(void* attr);
int32_t libc_new_common_posix_pthread_pthreadBarrierattrSetpshared(void* attr, int32_t shared);
int32_t libc_new_common_posix_pthread_pthreadCancel(void* thread);
int32_t libc_new_common_posix_pthread_pthreadCondattrGetclock(void* attr, void* clock_id);
int32_t libc_new_common_posix_pthread_pthreadCondattrGetpshared(void* attr, void* pshared);
int32_t libc_new_common_posix_pthread_pthreadCondattrSetclock(void* attr, int32_t clock_id);
int32_t libc_new_common_posix_pthread_pthreadCondattrSetpshared(void* attr, int32_t pshared);
int32_t libc_new_common_posix_pthread_pthreadCreate(void* native, void* attr, void* f, void* value);
int32_t libc_new_common_posix_pthread_pthreadGetcpuclockid(void* thread, void* clk_id);
int32_t libc_new_common_posix_pthread_pthreadGetschedparam(void* native, void* policy, void* param);
int32_t libc_new_common_posix_pthread_pthreadKill(void* thread, int32_t sig);
int32_t libc_new_common_posix_pthread_pthreadMutexConsistent(void* mutex);
int32_t libc_new_common_posix_pthread_pthreadMutexTimedlock(void* lock, void* abstime);
int32_t libc_new_common_posix_pthread_pthreadMutexattrGetprotocol(void* attr, void* protocol);
int32_t libc_new_common_posix_pthread_pthreadMutexattrGetpshared(void* attr, void* pshared);
int32_t libc_new_common_posix_pthread_pthreadMutexattrGetrobust(void* attr, void* robustness);
int32_t libc_new_common_posix_pthread_pthreadMutexattrSetprotocol(void* attr, int32_t protocol);
int32_t libc_new_common_posix_pthread_pthreadMutexattrSetpshared(void* attr, int32_t pshared);
int32_t libc_new_common_posix_pthread_pthreadMutexattrSetrobust(void* attr, int32_t robustness);
int32_t libc_new_common_posix_pthread_pthreadRwlockattrGetpshared(void* attr, void* val);
int32_t libc_new_common_posix_pthread_pthreadRwlockattrSetpshared(void* attr, int32_t val);
int32_t libc_new_common_posix_pthread_pthreadOnce(void* control, void* routine);
int32_t libc_new_common_posix_pthread_pthreadSetschedparam(void* native, int32_t policy, void* param);
int32_t libc_new_common_posix_pthread_pthreadSetschedprio(void* native, int32_t priority);
int32_t libc_new_common_posix_pthread_pthreadSigmask(int32_t how, void* set, void* oldset);
int32_t libc_new_common_posix_pthread_pthreadSpinDestroy(void* lock);
int32_t libc_new_common_posix_pthread_pthreadSpinInit(void* lock, int32_t pshared);
int32_t libc_new_common_posix_pthread_pthreadSpinLock(void* lock);
int32_t libc_new_common_posix_pthread_pthreadSpinTrylock(void* lock);
int32_t libc_new_common_posix_pthread_pthreadSpinUnlock(void* lock);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_COMMON_POSIX_PTHREAD_NEW_COMMON_POSIX_PTHREAD_WRAPPER_H */
