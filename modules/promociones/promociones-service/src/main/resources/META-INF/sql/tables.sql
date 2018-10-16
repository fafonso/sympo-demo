create table Citytours_Promocion (
	uuid_ VARCHAR(75) null,
	promocionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	descripcion VARCHAR(75) null,
	precio DOUBLE,
	ciudadDestino VARCHAR(75) null,
	nombreDestinatario VARCHAR(75) null,
	apellidosDestinatario VARCHAR(75) null,
	nifDestinatario VARCHAR(75) null,
	telefonoDestinatario VARCHAR(75) null
);