create table citytour_Subtipo (
	uuid_ VARCHAR(75) null,
	subtipoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	tipoId LONG,
	label VARCHAR(75) null
);

create table citytour_Tipo (
	uuid_ VARCHAR(75) null,
	tipoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	label VARCHAR(75) null
);