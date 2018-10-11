create index IX_FFEE29C6 on citytour_Subtipo (label[$COLUMN_LENGTH:75$]);
create index IX_32F2D792 on citytour_Subtipo (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_30101A94 on citytour_Subtipo (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_8E7A284E on citytour_Tipo (label[$COLUMN_LENGTH:75$]);
create index IX_7FBF40A on citytour_Tipo (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_7325F50C on citytour_Tipo (uuid_[$COLUMN_LENGTH:75$], groupId);