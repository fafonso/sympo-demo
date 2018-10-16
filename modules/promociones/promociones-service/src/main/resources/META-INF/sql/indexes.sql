create index IX_69A0EED2 on Citytours_Promocion (descripcion[$COLUMN_LENGTH:75$]);
create index IX_1583FEDF on Citytours_Promocion (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_776CB121 on Citytours_Promocion (uuid_[$COLUMN_LENGTH:75$], groupId);