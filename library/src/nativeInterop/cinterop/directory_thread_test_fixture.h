#ifndef LIBC_DIRECTORY_THREAD_TEST_FIXTURE_H
#define LIBC_DIRECTORY_THREAD_TEST_FIXTURE_H
#include <pthread.h>
#include <stdlib.h>

/* Native test orchestration only; directory operations and assertions stay in Kotlin. */
struct libc_directory_test_gate {
    pthread_mutex_t mutex;
    pthread_cond_t condition;
    int ready;
    int release;
};
struct libc_directory_test_work {
    void* (*callback)(void*);
    void* argument;
    struct libc_directory_test_gate* gate;
};
static inline void libc_directory_test_require(int status) {
    if (status != 0) abort();
}
static inline void* libc_directory_test_thread(void* pointer) {
    struct libc_directory_test_work* work = (struct libc_directory_test_work*)pointer;
    struct libc_directory_test_gate* gate = work->gate;
    libc_directory_test_require(pthread_mutex_lock(&gate->mutex));
    gate->ready++;
    if (gate->ready == 2) {
        gate->release = 1;
        libc_directory_test_require(pthread_cond_broadcast(&gate->condition));
    }
    while (!gate->release) libc_directory_test_require(pthread_cond_wait(&gate->condition, &gate->mutex));
    libc_directory_test_require(pthread_mutex_unlock(&gate->mutex));
    return work->callback(work->argument);
}
static inline int libc_directory_test_parallel(void* (*callback)(void*), void* first, void* second) {
    struct libc_directory_test_gate gate;
    libc_directory_test_require(pthread_mutex_init(&gate.mutex, NULL));
    libc_directory_test_require(pthread_cond_init(&gate.condition, NULL));
    gate.ready = 0;
    gate.release = 0;
    struct libc_directory_test_work work[2] = {{callback, first, &gate}, {callback, second, &gate}};
    pthread_t threads[2];
    int status = pthread_create(&threads[0], NULL, libc_directory_test_thread, &work[0]);
    if (status == 0) {
        status = pthread_create(&threads[1], NULL, libc_directory_test_thread, &work[1]);
        if (status != 0) {
            libc_directory_test_require(pthread_mutex_lock(&gate.mutex));
            gate.release = 1;
            libc_directory_test_require(pthread_cond_broadcast(&gate.condition));
            libc_directory_test_require(pthread_mutex_unlock(&gate.mutex));
        }
        libc_directory_test_require(pthread_join(threads[0], NULL));
        if (status == 0) libc_directory_test_require(pthread_join(threads[1], NULL));
    }
    libc_directory_test_require(pthread_cond_destroy(&gate.condition));
    libc_directory_test_require(pthread_mutex_destroy(&gate.mutex));
    return status;
}
#endif
