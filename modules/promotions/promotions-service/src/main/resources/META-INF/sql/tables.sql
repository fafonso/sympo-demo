create table Citytours_Promotion (
	uuid_ VARCHAR(75) null,
	promotionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	description VARCHAR(75) null,
	price DOUBLE,
	destinationCity VARCHAR(75) null,
	offereeFirstName VARCHAR(75) null,
	offereeLastName VARCHAR(75) null,
	offereeIdNumber VARCHAR(75) null,
	offereeTelephone VARCHAR(75) null
);