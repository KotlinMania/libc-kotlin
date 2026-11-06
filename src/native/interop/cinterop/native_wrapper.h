#ifndef LIBC_NATIVE_NATIVE_WRAPPER_H
#define LIBC_NATIVE_NATIVE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_native_create_area(const char* name, void* startAddress, uint32_t addressSpec, uint64_t size, uint32_t lock, uint32_t protection);
int32_t libc_native_clone_area(const char* name, void* destAddress, uint32_t addressSpec, uint32_t protection, int32_t source);
int32_t libc_native_find_area(const char* name);
int32_t libc_native_area_for(void* address);
int32_t libc_native_delete_area(int32_t id);
int32_t libc_native_resize_area(int32_t id, uint64_t newSize);
int32_t libc_native_set_area_protection(int32_t id, uint32_t newProtection);
int32_t libc_native_get_area_info(int32_t id, void* areaInfo, uint64_t size);
int32_t libc_native_get_next_area_info(int32_t team, void* cookie, void* areaInfo, uint64_t size);
int32_t libc_native_create_port(int32_t capacity, const char* name);
int32_t libc_native_find_port(const char* name);
int64_t libc_native_read_port(int32_t port, void* code, void* buffer, uint64_t bufferSize);
int64_t libc_native_read_port_etc(int32_t port, void* code, void* buffer, uint64_t bufferSize, uint32_t flags, int64_t timeout);
int32_t libc_native_write_port(int32_t port, int32_t code, void* buffer, uint64_t bufferSize);
int32_t libc_native_write_port_etc(int32_t port, int32_t code, void* buffer, uint64_t bufferSize, uint32_t flags, int64_t timeout);
int32_t libc_native_close_port(int32_t port);
int32_t libc_native_delete_port(int32_t port);
int64_t libc_native_port_buffer_size(int32_t port);
int64_t libc_native_port_buffer_size_etc(int32_t port, uint32_t flags, int64_t timeout);
int64_t libc_native_port_count(int32_t port);
int32_t libc_native_set_port_owner(int32_t port, int32_t team);
int32_t libc_native_get_port_info(int32_t port, void* buf, uint64_t portInfoSize);
int32_t libc_native_get_next_port_info(int32_t port, void* cookie, void* portInfo, uint64_t portInfoSize);
int32_t libc_native_get_port_message_info_etc(int32_t port, void* info, uint64_t infoSize, uint32_t flags, int64_t timeout);
int32_t libc_native_create_sem(int32_t count, const char* name);
int32_t libc_native_delete_sem(int32_t id);
int32_t libc_native_acquire_sem(int32_t id);
int32_t libc_native_acquire_sem_etc(int32_t id, int32_t count, uint32_t flags, int64_t timeout);
int32_t libc_native_release_sem(int32_t id);
int32_t libc_native_release_sem_etc(int32_t id, int32_t count, uint32_t flags);
int32_t libc_native_switch_sem(int32_t semToBeReleased, int32_t id);
int32_t libc_native_switch_sem_etc(int32_t semToBeReleased, int32_t id, int32_t count, uint32_t flags, int64_t timeout);
int32_t libc_native_get_sem_count(int32_t id, void* threadCount);
int32_t libc_native_set_sem_owner(int32_t id, int32_t team);
int32_t libc_native_get_sem_info(int32_t id, void* info, uint64_t infoSize);
int32_t libc_native_get_next_sem_info(int32_t team, void* cookie, void* info, uint64_t infoSize);
int32_t libc_native_kill_team(int32_t team);
int32_t libc_native_get_team_info(int32_t team, void* info, uint64_t size);
int32_t libc_native_get_next_team_info(void* cookie, void* info, uint64_t size);
int32_t libc_native_spawn_thread(int32_t func, const char* name, int32_t priority, void* data);
int32_t libc_native_kill_thread(int32_t thread);
int32_t libc_native_resume_thread(int32_t thread);
int32_t libc_native_suspend_thread(int32_t thread);
int32_t libc_native_rename_thread(int32_t thread, const char* newName);
int32_t libc_native_set_thread_priority(int32_t thread, int32_t newPriority);
int32_t libc_native_suggest_thread_priority(uint32_t what, int32_t period, int64_t jitter, int64_t length);
int64_t libc_native_estimate_max_scheduling_latency(int32_t th);
void libc_native_exit_thread(int32_t status);
int32_t libc_native_wait_for_thread(int32_t thread, void* returnValue);
int32_t libc_native_on_exit_thread(int32_t callback, void* data);
int32_t libc_native_find_thread(const char* name);
int32_t libc_native_get_scheduler_mode(void);
int32_t libc_native_set_scheduler_mode(int32_t mode);
int32_t libc_native_send_data(int32_t thread, int32_t code, void* buffer, uint64_t bufferSize);
int32_t libc_native_receive_data(void* sender, void* buffer, uint64_t bufferSize);
bool libc_native_has_data(int32_t thread);
int32_t libc_native_snooze(int64_t amount);
int32_t libc_native_snooze_etc(int64_t amount, int32_t timeBase, uint32_t flags);
int32_t libc_native_snooze_until(int64_t time, int32_t timeBase);
int32_t libc_native_get_thread_info(int32_t id, void* info, uint64_t size);
int32_t libc_native_get_next_thread_info(int32_t team, void* cookie, void* info, uint64_t size);
int32_t libc_native_get_pthread_thread_id(int32_t thread);
int32_t libc_native_get_team_usage_info(int32_t team, int32_t who, void* info, uint64_t size);
uint64_t libc_native_real_time_clock(void);
void libc_native_set_real_time_clock(uint64_t secsSinceJan1st1970);
int64_t libc_native_real_time_clock_usecs(void);
int64_t libc_native_system_time(void);
int64_t libc_native_system_time_nsecs(void);
int64_t libc_native_set_alarm(int64_t when, uint32_t flags);
void libc_native_debugger(const char* message);
int32_t libc_native_disable_debugger(int32_t state);
int32_t libc_native_get_system_info(void* info);
int32_t libc_native_get_cpu_info_etc(uint32_t firstCPU, uint32_t cpuCount, void* info, uint64_t size);
int32_t libc_native_get_cpu_topology_info(void* topologyInfos, void* topologyInfoCount);
int32_t libc_native_is_computer_on(void);
double libc_native_is_computer_on_fire(void);
int32_t libc_native_send_signal(int32_t threadID, uint32_t signal);
void libc_native_set_signal_stack(void* base, uint64_t size);
int64_t libc_native_wait_for_objects(void* infos, int32_t numInfos);
int64_t libc_native_wait_for_objects_etc(void* infos, int32_t numInfos, uint32_t flags, int64_t timeout);
int64_t libc_native_fs_read_attr(int32_t fd, const char* attribute, uint32_t type_, int64_t pos, void* buffer, uint64_t readBytes);
int64_t libc_native_fs_write_attr(int32_t fd, const char* attribute, uint32_t type_, int64_t pos, void* buffer, uint64_t writeBytes);
int32_t libc_native_fs_remove_attr(int32_t fd, const char* attribute);
int32_t libc_native_fs_stat_attr(int32_t fd, const char* attribute, void* attrInfo);
int32_t libc_native_fs_open_attr(const char* path, const char* attribute, uint32_t type_, int32_t openMode);
int32_t libc_native_fs_fopen_attr(int32_t fd, const char* attribute, uint32_t type_, int32_t openMode);
int32_t libc_native_fs_close_attr(int32_t fd);
void* libc_native_fs_open_attr_dir(const char* path);
void* libc_native_fs_lopen_attr_dir(const char* path);
void* libc_native_fs_fopen_attr_dir(int32_t fd);
int32_t libc_native_fs_close_attr_dir(void* dir);
void* libc_native_fs_read_attr_dir(void* dir);
void libc_native_fs_rewind_attr_dir(void* dir);
int32_t libc_native_fs_create_index(int32_t device, const char* name, uint32_t type_, uint32_t flags);
int32_t libc_native_fs_remove_index(int32_t device, const char* name);
int32_t libc_native_fs_stat_index(int32_t device, const char* name, void* indexInfo);
void* libc_native_fs_open_index_dir(int32_t device);
int32_t libc_native_fs_close_index_dir(void* indexDirectory);
void* libc_native_fs_read_index_dir(void* indexDirectory);
void libc_native_fs_rewind_index_dir(void* indexDirectory);
int32_t libc_native_dev_for_path(const char* path);
int32_t libc_native_next_dev(void* pos);
int32_t libc_native_fs_stat_dev(int32_t dev, void* info);
void* libc_native_fs_open_query(int32_t device, const char* query, uint32_t flags);
void* libc_native_fs_open_live_query(int32_t device, const char* query, uint32_t flags, int32_t port, int32_t token);
int32_t libc_native_fs_close_query(void* d);
void* libc_native_fs_read_query(void* d);
int32_t libc_native_get_path_for_dirent(void* dent, char* buf, uint64_t len);
int32_t libc_native_fs_mount_volume(const char* where_, const char* device, const char* filesystem, uint32_t flags, const char* parameters);
int32_t libc_native_fs_unmount_volume(const char* path, uint32_t flags);
int32_t libc_native_load_image(int32_t argc, void* argv, void* environ);
int32_t libc_native_load_add_on(const char* path);
int32_t libc_native_unload_add_on(int32_t image);
int32_t libc_native_get_image_symbol(int32_t image, const char* name, int32_t symbolType, void* symbolLocation);
int32_t libc_native_get_nth_image_symbol(int32_t image, int32_t n, char* nameBuffer, void* nameLength, void* symbolType, void* symbolLocation);
void libc_native_clear_caches(void* address, uint64_t length, uint32_t flags);
int32_t libc_native_get_image_info(int32_t image, void* info, uint64_t size);
int32_t libc_native_get_next_image_info(int32_t team, void* cookie, void* info, uint64_t size);
int32_t libc_native_find_path(void* codePointer, int32_t baseDirectory, const char* subPath, char* pathBuffer, uint64_t bufferSize);
int32_t libc_native_find_path_etc(void* codePointer, const char* dependency, const char* architecture, int32_t baseDirectory, const char* subPath, uint32_t flags, char* pathBuffer, uint64_t bufferSize);
int32_t libc_native_find_path_for_path(const char* path, int32_t baseDirectory, const char* subPath, char* pathBuffer, uint64_t bufferSize);
int32_t libc_native_find_path_for_path_etc(const char* path, const char* dependency, const char* architecture, int32_t baseDirectory, const char* subPath, uint32_t flags, char* pathBuffer, uint64_t bufferSize);
int32_t libc_native_find_paths(int32_t baseDirectory, const char* subPath, void* _paths, void* pathCount);
int32_t libc_native_find_paths_etc(const char* architecture, int32_t baseDirectory, const char* subPath, uint32_t flags, void* _paths, void* pathCount);
int32_t libc_native_find_directory(int32_t which, int32_t volume, bool createIt, char* pathString, int32_t length);
int32_t libc_native_get_cpuid(void* info, uint32_t eaxRegister, uint32_t cpuNum);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NATIVE_NATIVE_WRAPPER_H */
