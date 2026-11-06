#include "native_wrapper.h"
#include <errno.h>
#if !defined(_WIN32)
#include <dirent.h>
#endif

int32_t libc_native_create_area(const char* name, void* startAddress, uint32_t addressSpec, uint64_t size, uint32_t lock, uint32_t protection) {
    return (int32_t)create_area(name, startAddress, addressSpec, size, lock, protection);
}

int32_t libc_native_clone_area(const char* name, void* destAddress, uint32_t addressSpec, uint32_t protection, int32_t source) {
    return (int32_t)clone_area(name, destAddress, addressSpec, protection, source);
}

int32_t libc_native_find_area(const char* name) {
    return (int32_t)find_area(name);
}

int32_t libc_native_area_for(void* address) {
    return (int32_t)area_for(address);
}

int32_t libc_native_delete_area(int32_t id) {
    return (int32_t)delete_area(id);
}

int32_t libc_native_resize_area(int32_t id, uint64_t newSize) {
    return (int32_t)resize_area(id, newSize);
}

int32_t libc_native_set_area_protection(int32_t id, uint32_t newProtection) {
    return (int32_t)set_area_protection(id, newProtection);
}

int32_t libc_native_get_area_info(int32_t id, void* areaInfo, uint64_t size) {
    return (int32_t)_get_area_info(id, areaInfo, size);
}

int32_t libc_native_get_next_area_info(int32_t team, void* cookie, void* areaInfo, uint64_t size) {
    return (int32_t)_get_next_area_info(team, cookie, areaInfo, size);
}

int32_t libc_native_create_port(int32_t capacity, const char* name) {
    return (int32_t)create_port(capacity, name);
}

int32_t libc_native_find_port(const char* name) {
    return (int32_t)find_port(name);
}

int64_t libc_native_read_port(int32_t port, void* code, void* buffer, uint64_t bufferSize) {
    return (int64_t)read_port(port, code, buffer, bufferSize);
}

int64_t libc_native_read_port_etc(int32_t port, void* code, void* buffer, uint64_t bufferSize, uint32_t flags, int64_t timeout) {
    return (int64_t)read_port_etc(port, code, buffer, bufferSize, flags, timeout);
}

int32_t libc_native_write_port(int32_t port, int32_t code, void* buffer, uint64_t bufferSize) {
    return (int32_t)write_port(port, code, buffer, bufferSize);
}

int32_t libc_native_write_port_etc(int32_t port, int32_t code, void* buffer, uint64_t bufferSize, uint32_t flags, int64_t timeout) {
    return (int32_t)write_port_etc(port, code, buffer, bufferSize, flags, timeout);
}

int32_t libc_native_close_port(int32_t port) {
    return (int32_t)close_port(port);
}

int32_t libc_native_delete_port(int32_t port) {
    return (int32_t)delete_port(port);
}

int64_t libc_native_port_buffer_size(int32_t port) {
    return (int64_t)port_buffer_size(port);
}

int64_t libc_native_port_buffer_size_etc(int32_t port, uint32_t flags, int64_t timeout) {
    return (int64_t)port_buffer_size_etc(port, flags, timeout);
}

int64_t libc_native_port_count(int32_t port) {
    return (int64_t)port_count(port);
}

int32_t libc_native_set_port_owner(int32_t port, int32_t team) {
    return (int32_t)set_port_owner(port, team);
}

int32_t libc_native_get_port_info(int32_t port, void* buf, uint64_t portInfoSize) {
    return (int32_t)_get_port_info(port, buf, portInfoSize);
}

int32_t libc_native_get_next_port_info(int32_t port, void* cookie, void* portInfo, uint64_t portInfoSize) {
    return (int32_t)_get_next_port_info(port, cookie, portInfo, portInfoSize);
}

int32_t libc_native_get_port_message_info_etc(int32_t port, void* info, uint64_t infoSize, uint32_t flags, int64_t timeout) {
    return (int32_t)_get_port_message_info_etc(port, info, infoSize, flags, timeout);
}

int32_t libc_native_create_sem(int32_t count, const char* name) {
    return (int32_t)create_sem(count, name);
}

int32_t libc_native_delete_sem(int32_t id) {
    return (int32_t)delete_sem(id);
}

int32_t libc_native_acquire_sem(int32_t id) {
    return (int32_t)acquire_sem(id);
}

int32_t libc_native_acquire_sem_etc(int32_t id, int32_t count, uint32_t flags, int64_t timeout) {
    return (int32_t)acquire_sem_etc(id, count, flags, timeout);
}

int32_t libc_native_release_sem(int32_t id) {
    return (int32_t)release_sem(id);
}

int32_t libc_native_release_sem_etc(int32_t id, int32_t count, uint32_t flags) {
    return (int32_t)release_sem_etc(id, count, flags);
}

int32_t libc_native_switch_sem(int32_t semToBeReleased, int32_t id) {
    return (int32_t)switch_sem(semToBeReleased, id);
}

int32_t libc_native_switch_sem_etc(int32_t semToBeReleased, int32_t id, int32_t count, uint32_t flags, int64_t timeout) {
    return (int32_t)switch_sem_etc(semToBeReleased, id, count, flags, timeout);
}

int32_t libc_native_get_sem_count(int32_t id, void* threadCount) {
    return (int32_t)get_sem_count(id, threadCount);
}

int32_t libc_native_set_sem_owner(int32_t id, int32_t team) {
    return (int32_t)set_sem_owner(id, team);
}

int32_t libc_native_get_sem_info(int32_t id, void* info, uint64_t infoSize) {
    return (int32_t)_get_sem_info(id, info, infoSize);
}

int32_t libc_native_get_next_sem_info(int32_t team, void* cookie, void* info, uint64_t infoSize) {
    return (int32_t)_get_next_sem_info(team, cookie, info, infoSize);
}

int32_t libc_native_kill_team(int32_t team) {
    return (int32_t)kill_team(team);
}

int32_t libc_native_get_team_info(int32_t team, void* info, uint64_t size) {
    return (int32_t)_get_team_info(team, info, size);
}

int32_t libc_native_get_next_team_info(void* cookie, void* info, uint64_t size) {
    return (int32_t)_get_next_team_info(cookie, info, size);
}

int32_t libc_native_spawn_thread(int32_t func, const char* name, int32_t priority, void* data) {
    return (int32_t)spawn_thread(func, name, priority, data);
}

int32_t libc_native_kill_thread(int32_t thread) {
    return (int32_t)kill_thread(thread);
}

int32_t libc_native_resume_thread(int32_t thread) {
    return (int32_t)resume_thread(thread);
}

int32_t libc_native_suspend_thread(int32_t thread) {
    return (int32_t)suspend_thread(thread);
}

int32_t libc_native_rename_thread(int32_t thread, const char* newName) {
    return (int32_t)rename_thread(thread, newName);
}

int32_t libc_native_set_thread_priority(int32_t thread, int32_t newPriority) {
    return (int32_t)set_thread_priority(thread, newPriority);
}

int32_t libc_native_suggest_thread_priority(uint32_t what, int32_t period, int64_t jitter, int64_t length) {
    return (int32_t)suggest_thread_priority(what, period, jitter, length);
}

int64_t libc_native_estimate_max_scheduling_latency(int32_t th) {
    return (int64_t)estimate_max_scheduling_latency(th);
}

void libc_native_exit_thread(int32_t status) {
    exit_thread(status);
}

int32_t libc_native_wait_for_thread(int32_t thread, void* returnValue) {
    return (int32_t)wait_for_thread(thread, returnValue);
}

int32_t libc_native_on_exit_thread(int32_t callback, void* data) {
    return (int32_t)on_exit_thread(callback, data);
}

int32_t libc_native_find_thread(const char* name) {
    return (int32_t)find_thread(name);
}

int32_t libc_native_get_scheduler_mode(void) {
    return (int32_t)get_scheduler_mode();
}

int32_t libc_native_set_scheduler_mode(int32_t mode) {
    return (int32_t)set_scheduler_mode(mode);
}

int32_t libc_native_send_data(int32_t thread, int32_t code, void* buffer, uint64_t bufferSize) {
    return (int32_t)send_data(thread, code, buffer, bufferSize);
}

int32_t libc_native_receive_data(void* sender, void* buffer, uint64_t bufferSize) {
    return (int32_t)receive_data(sender, buffer, bufferSize);
}

bool libc_native_has_data(int32_t thread) {
    return (bool)has_data(thread);
}

int32_t libc_native_snooze(int64_t amount) {
    return (int32_t)snooze(amount);
}

int32_t libc_native_snooze_etc(int64_t amount, int32_t timeBase, uint32_t flags) {
    return (int32_t)snooze_etc(amount, timeBase, flags);
}

int32_t libc_native_snooze_until(int64_t time, int32_t timeBase) {
    return (int32_t)snooze_until(time, timeBase);
}

int32_t libc_native_get_thread_info(int32_t id, void* info, uint64_t size) {
    return (int32_t)_get_thread_info(id, info, size);
}

int32_t libc_native_get_next_thread_info(int32_t team, void* cookie, void* info, uint64_t size) {
    return (int32_t)_get_next_thread_info(team, cookie, info, size);
}

int32_t libc_native_get_pthread_thread_id(int32_t thread) {
    return (int32_t)get_pthread_thread_id(thread);
}

int32_t libc_native_get_team_usage_info(int32_t team, int32_t who, void* info, uint64_t size) {
    return (int32_t)_get_team_usage_info(team, who, info, size);
}

uint64_t libc_native_real_time_clock(void) {
    return (uint64_t)real_time_clock();
}

void libc_native_set_real_time_clock(uint64_t secsSinceJan1st1970) {
    set_real_time_clock(secsSinceJan1st1970);
}

int64_t libc_native_real_time_clock_usecs(void) {
    return (int64_t)real_time_clock_usecs();
}

int64_t libc_native_system_time(void) {
    return (int64_t)system_time();
}

int64_t libc_native_system_time_nsecs(void) {
    return (int64_t)system_time_nsecs();
}

int64_t libc_native_set_alarm(int64_t when, uint32_t flags) {
    return (int64_t)set_alarm(when, flags);
}

void libc_native_debugger(const char* message) {
    debugger(message);
}

int32_t libc_native_disable_debugger(int32_t state) {
    return (int32_t)disable_debugger(state);
}

int32_t libc_native_get_system_info(void* info) {
    return (int32_t)get_system_info(info);
}

int32_t libc_native_get_cpu_info_etc(uint32_t firstCPU, uint32_t cpuCount, void* info, uint64_t size) {
    return (int32_t)_get_cpu_info_etc(firstCPU, cpuCount, info, size);
}

int32_t libc_native_get_cpu_topology_info(void* topologyInfos, void* topologyInfoCount) {
    return (int32_t)get_cpu_topology_info(topologyInfos, topologyInfoCount);
}

int32_t libc_native_is_computer_on(void) {
    return (int32_t)is_computer_on();
}

double libc_native_is_computer_on_fire(void) {
    return (double)is_computer_on_fire();
}

int32_t libc_native_send_signal(int32_t threadID, uint32_t signal) {
    return (int32_t)send_signal(threadID, signal);
}

void libc_native_set_signal_stack(void* base, uint64_t size) {
    set_signal_stack(base, size);
}

int64_t libc_native_wait_for_objects(void* infos, int32_t numInfos) {
    return (int64_t)wait_for_objects(infos, numInfos);
}

int64_t libc_native_wait_for_objects_etc(void* infos, int32_t numInfos, uint32_t flags, int64_t timeout) {
    return (int64_t)wait_for_objects_etc(infos, numInfos, flags, timeout);
}

int64_t libc_native_fs_read_attr(int32_t fd, const char* attribute, uint32_t type_, int64_t pos, void* buffer, uint64_t readBytes) {
    return (int64_t)fs_read_attr(fd, attribute, type_, pos, buffer, readBytes);
}

int64_t libc_native_fs_write_attr(int32_t fd, const char* attribute, uint32_t type_, int64_t pos, void* buffer, uint64_t writeBytes) {
    return (int64_t)fs_write_attr(fd, attribute, type_, pos, buffer, writeBytes);
}

int32_t libc_native_fs_remove_attr(int32_t fd, const char* attribute) {
    return (int32_t)fs_remove_attr(fd, attribute);
}

int32_t libc_native_fs_stat_attr(int32_t fd, const char* attribute, void* attrInfo) {
    return (int32_t)fs_stat_attr(fd, attribute, attrInfo);
}

int32_t libc_native_fs_open_attr(const char* path, const char* attribute, uint32_t type_, int32_t openMode) {
    return (int32_t)fs_open_attr(path, attribute, type_, openMode);
}

int32_t libc_native_fs_fopen_attr(int32_t fd, const char* attribute, uint32_t type_, int32_t openMode) {
    return (int32_t)fs_fopen_attr(fd, attribute, type_, openMode);
}

int32_t libc_native_fs_close_attr(int32_t fd) {
    return (int32_t)fs_close_attr(fd);
}

void* libc_native_fs_open_attr_dir(const char* path) {
    return (void*)fs_open_attr_dir(path);
}

void* libc_native_fs_lopen_attr_dir(const char* path) {
    return (void*)fs_lopen_attr_dir(path);
}

void* libc_native_fs_fopen_attr_dir(int32_t fd) {
    return (void*)fs_fopen_attr_dir(fd);
}

int32_t libc_native_fs_close_attr_dir(void* dir) {
    return (int32_t)fs_close_attr_dir((DIR*)dir);
}

void* libc_native_fs_read_attr_dir(void* dir) {
    return (void*)fs_read_attr_dir((DIR*)dir);
}

void libc_native_fs_rewind_attr_dir(void* dir) {
    fs_rewind_attr_dir((DIR*)dir);
}

int32_t libc_native_fs_create_index(int32_t device, const char* name, uint32_t type_, uint32_t flags) {
    return (int32_t)fs_create_index(device, name, type_, flags);
}

int32_t libc_native_fs_remove_index(int32_t device, const char* name) {
    return (int32_t)fs_remove_index(device, name);
}

int32_t libc_native_fs_stat_index(int32_t device, const char* name, void* indexInfo) {
    return (int32_t)fs_stat_index(device, name, indexInfo);
}

void* libc_native_fs_open_index_dir(int32_t device) {
    return (void*)fs_open_index_dir(device);
}

int32_t libc_native_fs_close_index_dir(void* indexDirectory) {
    return (int32_t)fs_close_index_dir((DIR*)indexDirectory);
}

void* libc_native_fs_read_index_dir(void* indexDirectory) {
    return (void*)fs_read_index_dir((DIR*)indexDirectory);
}

void libc_native_fs_rewind_index_dir(void* indexDirectory) {
    fs_rewind_index_dir((DIR*)indexDirectory);
}

int32_t libc_native_dev_for_path(const char* path) {
    return (int32_t)dev_for_path(path);
}

int32_t libc_native_next_dev(void* pos) {
    return (int32_t)next_dev(pos);
}

int32_t libc_native_fs_stat_dev(int32_t dev, void* info) {
    return (int32_t)fs_stat_dev(dev, info);
}

void* libc_native_fs_open_query(int32_t device, const char* query, uint32_t flags) {
    return (void*)fs_open_query(device, query, flags);
}

void* libc_native_fs_open_live_query(int32_t device, const char* query, uint32_t flags, int32_t port, int32_t token) {
    return (void*)fs_open_live_query(device, query, flags, port, token);
}

int32_t libc_native_fs_close_query(void* d) {
    return (int32_t)fs_close_query((DIR*)d);
}

void* libc_native_fs_read_query(void* d) {
    return (void*)fs_read_query((DIR*)d);
}

int32_t libc_native_get_path_for_dirent(void* dent, char* buf, uint64_t len) {
    return (int32_t)get_path_for_dirent(dent, buf, len);
}

int32_t libc_native_fs_mount_volume(const char* where_, const char* device, const char* filesystem, uint32_t flags, const char* parameters) {
    return (int32_t)fs_mount_volume(where_, device, filesystem, flags, parameters);
}

int32_t libc_native_fs_unmount_volume(const char* path, uint32_t flags) {
    return (int32_t)fs_unmount_volume(path, flags);
}

int32_t libc_native_load_image(int32_t argc, void* argv, void* environ) {
    return (int32_t)load_image(argc, argv, environ);
}

int32_t libc_native_load_add_on(const char* path) {
    return (int32_t)load_add_on(path);
}

int32_t libc_native_unload_add_on(int32_t image) {
    return (int32_t)unload_add_on(image);
}

int32_t libc_native_get_image_symbol(int32_t image, const char* name, int32_t symbolType, void* symbolLocation) {
    return (int32_t)get_image_symbol(image, name, symbolType, symbolLocation);
}

int32_t libc_native_get_nth_image_symbol(int32_t image, int32_t n, char* nameBuffer, void* nameLength, void* symbolType, void* symbolLocation) {
    return (int32_t)get_nth_image_symbol(image, n, nameBuffer, nameLength, symbolType, symbolLocation);
}

void libc_native_clear_caches(void* address, uint64_t length, uint32_t flags) {
    clear_caches(address, length, flags);
}

int32_t libc_native_get_image_info(int32_t image, void* info, uint64_t size) {
    return (int32_t)_get_image_info(image, info, size);
}

int32_t libc_native_get_next_image_info(int32_t team, void* cookie, void* info, uint64_t size) {
    return (int32_t)_get_next_image_info(team, cookie, info, size);
}

int32_t libc_native_find_path(void* codePointer, int32_t baseDirectory, const char* subPath, char* pathBuffer, uint64_t bufferSize) {
    return (int32_t)find_path(codePointer, baseDirectory, subPath, pathBuffer, bufferSize);
}

int32_t libc_native_find_path_etc(void* codePointer, const char* dependency, const char* architecture, int32_t baseDirectory, const char* subPath, uint32_t flags, char* pathBuffer, uint64_t bufferSize) {
    return (int32_t)find_path_etc(codePointer, dependency, architecture, baseDirectory, subPath, flags, pathBuffer, bufferSize);
}

int32_t libc_native_find_path_for_path(const char* path, int32_t baseDirectory, const char* subPath, char* pathBuffer, uint64_t bufferSize) {
    return (int32_t)find_path_for_path(path, baseDirectory, subPath, pathBuffer, bufferSize);
}

int32_t libc_native_find_path_for_path_etc(const char* path, const char* dependency, const char* architecture, int32_t baseDirectory, const char* subPath, uint32_t flags, char* pathBuffer, uint64_t bufferSize) {
    return (int32_t)find_path_for_path_etc(path, dependency, architecture, baseDirectory, subPath, flags, pathBuffer, bufferSize);
}

int32_t libc_native_find_paths(int32_t baseDirectory, const char* subPath, void* _paths, void* pathCount) {
    return (int32_t)find_paths(baseDirectory, subPath, _paths, pathCount);
}

int32_t libc_native_find_paths_etc(const char* architecture, int32_t baseDirectory, const char* subPath, uint32_t flags, void* _paths, void* pathCount) {
    return (int32_t)find_paths_etc(architecture, baseDirectory, subPath, flags, _paths, pathCount);
}

int32_t libc_native_find_directory(int32_t which, int32_t volume, bool createIt, char* pathString, int32_t length) {
    return (int32_t)find_directory(which, volume, createIt, pathString, length);
}

int32_t libc_native_get_cpuid(void* info, uint32_t eaxRegister, uint32_t cpuNum) {
    return (int32_t)get_cpuid(info, eaxRegister, cpuNum);
}

