-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('整机编码', '3', '1', 'info', 'wmencoder/info/index', 1, 0, 'C', '0', '0', 'wmencoder:info:list', '#', 'admin', sysdate(), '', null, '整机编码菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('整机编码查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'wmencoder:info:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('整机编码新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'wmencoder:info:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('整机编码修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'wmencoder:info:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('整机编码删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'wmencoder:info:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('整机编码导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'wmencoder:info:export',       '#', 'admin', sysdate(), '', null, '');