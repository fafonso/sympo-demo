create index IX_2EF3CF32 on Citytours_Promotion (description[$COLUMN_LENGTH:75$]);
create index IX_D19E7BAE on Citytours_Promotion (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_664E15B0 on Citytours_Promotion (uuid_[$COLUMN_LENGTH:75$], groupId);